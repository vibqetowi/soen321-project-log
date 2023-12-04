package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aM\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\n\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\n\u001a_\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00030\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\b\u000f\u001aU\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00030\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\b\n\u001aU\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00030\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\b\u000f\u001aM\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0014\b\n\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\t0\bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"viewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "Landroidx/activity/ComponentActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "createMethod", "Lby/kirich1409/viewbindingdelegate/CreateMethod;", "onViewDestroyed", "Lkotlin/Function1;", "", "inflateViewBindingActivity", "viewBindingClass", "Ljava/lang/Class;", "rootViewProvider", "Landroid/view/View;", "viewBindingActivity", "viewBindingRootId", "", "com.github.kirich1409.ViewBindingPropertyDelegate"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ReflectionActivityViewBindings {

    /* compiled from: ActivityViewBindings.kt */
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

    public static /* synthetic */ ViewBindingProperty viewBindingActivity$default(ComponentActivity componentActivity, int i, Function1 onViewDestroyed, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            onViewDestroyed = UtilsKt.emptyVbCallback();
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingActivity(componentActivity, ViewBinding.class, i, onViewDestroyed);
    }

    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(ComponentActivity componentActivity, int i, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return viewBindingActivity(componentActivity, ViewBinding.class, i, onViewDestroyed);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivity$default(ComponentActivity componentActivity, Class cls, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = UtilsKt.emptyVbCallback();
        }
        return viewBindingActivity(componentActivity, cls, i, function1);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(ComponentActivity componentActivity, Class<T> viewBindingClass, int i, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return ActivityViewBindings.viewBindingActivityWithCallbacks(componentActivity, onViewDestroyed, new ReflectionActivityViewBindings$viewBinding$1(i, viewBindingClass));
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivity$default(ComponentActivity componentActivity, Class cls, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 4) != 0) {
            function12 = UtilsKt.emptyVbCallback();
        }
        return viewBindingActivity(componentActivity, cls, function1, function12);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(ComponentActivity componentActivity, Class<T> viewBindingClass, Function1<? super ComponentActivity, ? extends View> rootViewProvider, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(rootViewProvider, "rootViewProvider");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return ActivityViewBindings.viewBindingActivityWithCallbacks(componentActivity, onViewDestroyed, new ReflectionActivityViewBindings$viewBinding$2(viewBindingClass, rootViewProvider));
    }

    public static /* synthetic */ ViewBindingProperty inflateViewBindingActivity$default(ComponentActivity componentActivity, CreateMethod createMethod, Function1 onViewDestroyed, int i, Object obj) {
        if ((i & 1) != 0) {
            createMethod = CreateMethod.BIND;
        }
        if ((i & 2) != 0) {
            onViewDestroyed = UtilsKt.emptyVbCallback();
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return inflateViewBindingActivity(componentActivity, ViewBinding.class, createMethod, onViewDestroyed);
    }

    public static final /* synthetic */ <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> inflateViewBindingActivity(ComponentActivity componentActivity, CreateMethod createMethod, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return inflateViewBindingActivity(componentActivity, ViewBinding.class, createMethod, onViewDestroyed);
    }

    public static /* synthetic */ ViewBindingProperty inflateViewBindingActivity$default(ComponentActivity componentActivity, Class cls, CreateMethod createMethod, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            createMethod = CreateMethod.BIND;
        }
        if ((i & 4) != 0) {
            function1 = UtilsKt.emptyVbCallback();
        }
        return inflateViewBindingActivity(componentActivity, cls, createMethod, function1);
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> inflateViewBindingActivity(ComponentActivity componentActivity, Class<T> viewBindingClass, CreateMethod createMethod, Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingClass, "viewBindingClass");
        Intrinsics.checkNotNullParameter(createMethod, "createMethod");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        int i = WhenMappings.$EnumSwitchMapping$0[createMethod.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ActivityViewBindings.activityViewBinding(onViewDestroyed, false, new ReflectionActivityViewBindings$viewBinding$4(viewBindingClass, componentActivity));
            }
            throw new NoWhenBranchMatchedException();
        }
        return viewBindingActivity(componentActivity, viewBindingClass, ReflectionActivityViewBindings$viewBinding$3.INSTANCE, onViewDestroyed);
    }
}
