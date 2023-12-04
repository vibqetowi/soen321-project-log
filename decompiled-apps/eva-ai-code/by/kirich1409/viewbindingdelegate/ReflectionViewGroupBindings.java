package by.kirich1409.viewbindingdelegate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.InflateViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import by.kirich1409.viewbindingdelegate.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewGroupBindings.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\n\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a_\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00030\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\b\f\u001a]\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\b\f\u001aU\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\n\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"viewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "Landroid/view/ViewGroup;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "createMethod", "Lby/kirich1409/viewbindingdelegate/CreateMethod;", "lifecycleAware", "", "onViewDestroyed", "Lkotlin/Function1;", "", "viewBindingFragment", "viewBindingClass", "Ljava/lang/Class;", "attachToRoot", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ReflectionViewGroupBindings {

    /* compiled from: ViewGroupBindings.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateMethod.values().length];
            iArr[CreateMethod.BIND.ordinal()] = 1;
            iArr[CreateMethod.INFLATE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, Class<T> viewBindingClass) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        return viewBindingFragment$default(viewGroup, (Class) viewBindingClass, (CreateMethod) null, false, (Function1) null, 14, (Object) null);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, Class<T> viewBindingClass, CreateMethod createMethod) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        return viewBindingFragment$default(viewGroup, (Class) viewBindingClass, createMethod, false, (Function1) null, 12, (Object) null);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, Class<T> viewBindingClass, CreateMethod createMethod, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        return viewBindingFragment$default(viewGroup, viewBindingClass, createMethod, z, (Function1) null, 8, (Object) null);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, Class<T> viewBindingClass, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        return viewBindingFragment$default(viewGroup, (Class) viewBindingClass, z, false, (Function1) null, 12, (Object) null);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, Class<T> viewBindingClass, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        return viewBindingFragment$default(viewGroup, viewBindingClass, z, z2, (Function1) null, 8, (Object) null);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(ViewGroup viewGroup, CreateMethod createMethod, boolean z, Function1 onViewDestroyed, int i, Object obj) {
        if ((i & 1) != 0) {
            createMethod = CreateMethod.BIND;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            onViewDestroyed = UtilsKt.emptyVbCallback();
        }
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, createMethod, z, onViewDestroyed);
    }

    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, CreateMethod createMethod, boolean z, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, createMethod, z, onViewDestroyed);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(ViewGroup viewGroup, Class cls, CreateMethod createMethod, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            createMethod = CreateMethod.BIND;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = UtilsKt.emptyVbCallback();
        }
        return viewBindingFragment(viewGroup, cls, createMethod, z, function1);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, Class<T> viewBindingClass, CreateMethod createMethod, boolean z, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        int i = WhenMappings.$EnumSwitchMapping$0[createMethod.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return viewBindingFragment$default(viewGroup, (Class) viewBindingClass, true, false, (Function1) onViewDestroyed, 4, (Object) null);
            }
            throw new NoWhenBranchMatchedException();
        } else if (viewGroup.isInEditMode()) {
            return new EagerViewBindingProperty(ViewBindingCache.INSTANCE.getBind$com_github_kirich1409_ViewBindingPropertyDelegate(viewBindingClass).bind(viewGroup));
        } else {
            if (z) {
                return new ViewGroupViewBindingProperty(onViewDestroyed, new ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$1(viewBindingClass));
            }
            return new LazyViewBindingProperty(onViewDestroyed, new ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$2(viewBindingClass));
        }
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(ViewGroup viewGroup, boolean z, boolean z2, Function1 onViewDestroyed, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            onViewDestroyed = UtilsKt.emptyVbCallback();
        }
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, z, z2, onViewDestroyed);
    }

    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, boolean z, boolean z2, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, z, z2, onViewDestroyed);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingFragment$default(ViewGroup viewGroup, Class cls, boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            function1 = UtilsKt.emptyVbCallback();
        }
        return viewBindingFragment(viewGroup, cls, z, z2, function1);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, Class<T> viewBindingClass, boolean z, boolean z2, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        if (!viewGroup.isInEditMode()) {
            if (z2) {
                return new ViewGroupViewBindingProperty(onViewDestroyed, new ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$3(viewBindingClass, viewGroup, z));
            }
            return new LazyViewBindingProperty(onViewDestroyed, new ReflectionViewGroupBindings$viewBinding$$inlined$viewBinding$4(viewBindingClass, viewGroup, z));
        }
        InflateViewBinding<T> inflateWithLayoutInflater = ViewBindingCache.INSTANCE.getInflateWithLayoutInflater(viewBindingClass);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        return new EagerViewBindingProperty(inflateWithLayoutInflater.inflate(from, viewGroup, z));
    }

    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, z, false, emptyVbCallback);
    }

    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBindingFragment(ViewGroup viewGroup, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingFragment(viewGroup, ViewBinding.class, z, z2, emptyVbCallback);
    }
}
