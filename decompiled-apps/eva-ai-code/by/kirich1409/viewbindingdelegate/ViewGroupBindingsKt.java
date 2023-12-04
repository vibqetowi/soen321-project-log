package by.kirich1409.viewbindingdelegate;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewGroupBindings.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001aF\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0087\bø\u0001\u0000\u001a<\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0086\bø\u0001\u0000\u001aD\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0086\bø\u0001\u0000\u001aZ\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u00062\u0014\b\b\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\r0\u0006H\u0086\bø\u0001\u0000\u001a\\\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u00062\u0014\b\b\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\r0\u0006H\u0086\bø\u0001\u0000\u001aN\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H\u0086\bø\u0001\u0000\u001ad\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u00062\u0014\b\b\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\r0\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"viewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "Landroid/view/ViewGroup;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "vbFactory", "Lkotlin/Function1;", "Landroid/view/View;", "viewBindingRootId", "", "lifecycleAware", "", "onViewDestroyed", "", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewGroupBindingsKt {
    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup, boolean z, Function1<? super ViewGroup, ? extends T> vbFactory) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (viewGroup.isInEditMode()) {
            return new EagerViewBindingProperty(vbFactory.invoke(viewGroup));
        }
        if (z) {
            return new ViewGroupViewBindingProperty(emptyVbCallback, new ViewGroupBindingsKt$viewBinding$1(vbFactory));
        }
        return new LazyViewBindingProperty(emptyVbCallback, new ViewGroupBindingsKt$viewBinding$2(vbFactory));
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup, boolean z, Function1<? super ViewGroup, ? extends T> vbFactory, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        if (viewGroup.isInEditMode()) {
            return new EagerViewBindingProperty(vbFactory.invoke(viewGroup));
        }
        if (z) {
            return new ViewGroupViewBindingProperty(onViewDestroyed, new ViewGroupBindingsKt$viewBinding$1(vbFactory));
        }
        return new LazyViewBindingProperty(onViewDestroyed, new ViewGroupBindingsKt$viewBinding$2(vbFactory));
    }

    @Deprecated(message = "Order of arguments was changed", replaceWith = @ReplaceWith(expression = "viewBinding(viewBindingRootId, vbFactory)", imports = {}))
    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup, Function1<? super View, ? extends T> vbFactory, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewGroup.isInEditMode() ? new EagerViewBindingProperty(vbFactory.invoke(viewGroup)) : new LazyViewBindingProperty(UtilsKt.emptyVbCallback(), new ViewGroupBindingsKt$viewBinding$4(vbFactory, i));
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup, int i, boolean z, Function1<? super View, ? extends T> vbFactory) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (viewGroup.isInEditMode()) {
            return new EagerViewBindingProperty(vbFactory.invoke(viewGroup));
        }
        if (z) {
            return new ViewGroupViewBindingProperty(emptyVbCallback, new ViewGroupBindingsKt$viewBinding$3(vbFactory));
        }
        return new LazyViewBindingProperty(emptyVbCallback, new ViewGroupBindingsKt$viewBinding$4(vbFactory, i));
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup, int i, boolean z, Function1<? super View, ? extends T> vbFactory, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        if (viewGroup.isInEditMode()) {
            return new EagerViewBindingProperty(vbFactory.invoke(viewGroup));
        }
        if (z) {
            return new ViewGroupViewBindingProperty(onViewDestroyed, new ViewGroupBindingsKt$viewBinding$3(vbFactory));
        }
        return new LazyViewBindingProperty(onViewDestroyed, new ViewGroupBindingsKt$viewBinding$4(vbFactory, i));
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup, Function1<? super ViewGroup, ? extends T> vbFactory) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewGroup.isInEditMode() ? new EagerViewBindingProperty(vbFactory.invoke(viewGroup)) : new LazyViewBindingProperty(UtilsKt.emptyVbCallback(), new ViewGroupBindingsKt$viewBinding$2(vbFactory));
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ViewGroup, T> viewBinding(ViewGroup viewGroup, int i, Function1<? super View, ? extends T> vbFactory, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return viewGroup.isInEditMode() ? new EagerViewBindingProperty(vbFactory.invoke(viewGroup)) : new LazyViewBindingProperty(onViewDestroyed, new ViewGroupBindingsKt$viewBinding$4(vbFactory, i));
    }
}
