package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aZ\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0007\u001aE\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0007¢\u0006\u0002\b\r\u001a[\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0007¢\u0006\u0002\b\u000e\u001aw\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\n\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u00030\u00072\u0014\b\u0006\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00100\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u001aa\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\n\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\b\r\u001aa\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u00030\u00072\u0014\b\u0006\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00100\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b\r\u001aK\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005*\u00020\u00042\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\b\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"activityViewBinding", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/activity/ComponentActivity;", "Landroidx/viewbinding/ViewBinding;", "onViewDestroyed", "Lkotlin/Function1;", "", "viewNeedInitialization", "", "viewBinder", "viewBinding", "viewBindingActivity", "viewBindingActivityWithCallbacks", "vbFactory", "Landroid/view/View;", "viewProvider", "viewBindingRootId", "", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityViewBindings {
    public static final <A extends ComponentActivity, T extends ViewBinding> ViewBindingProperty<A, T> viewBindingActivity(ComponentActivity componentActivity, Function1<? super A, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return viewBindingActivityWithCallbacks(componentActivity, UtilsKt.emptyVbCallback(), viewBinder);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivityWithCallbacks$default(ComponentActivity componentActivity, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = ActivityViewBindings$viewBinding$1.INSTANCE;
        }
        return viewBindingActivityWithCallbacks(componentActivity, function1, function12);
    }

    public static final <A extends ComponentActivity, T extends ViewBinding> ViewBindingProperty<A, T> viewBindingActivityWithCallbacks(ComponentActivity componentActivity, Function1<? super T, Unit> onViewDestroyed, Function1<? super A, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new ActivityViewBindingProperty(onViewDestroyed, false, viewBinder, 2, null);
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivity$default(ComponentActivity componentActivity, Function1 vbFactory, Function1 viewProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            viewProvider = ActivityViewBindings$viewBinding$2.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingActivityWithCallbacks(componentActivity, UtilsKt.emptyVbCallback(), new ActivityViewBindings$viewBinding$5(vbFactory, viewProvider));
    }

    public static final <A extends ComponentActivity, T extends ViewBinding> ViewBindingProperty<A, T> viewBindingActivity(ComponentActivity componentActivity, Function1<? super View, ? extends T> vbFactory, Function1<? super A, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingActivityWithCallbacks(componentActivity, UtilsKt.emptyVbCallback(), new ActivityViewBindings$viewBinding$5(vbFactory, viewProvider));
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivityWithCallbacks$default(ComponentActivity componentActivity, Function1 onViewDestroyed, Function1 vbFactory, Function1 viewProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            onViewDestroyed = ActivityViewBindings$viewBinding$3.INSTANCE;
        }
        if ((i & 4) != 0) {
            viewProvider = ActivityViewBindings$viewBinding$4.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingActivityWithCallbacks(componentActivity, onViewDestroyed, new ActivityViewBindings$viewBinding$5(vbFactory, viewProvider));
    }

    public static final <A extends ComponentActivity, T extends ViewBinding> ViewBindingProperty<A, T> viewBindingActivityWithCallbacks(ComponentActivity componentActivity, Function1<? super T, Unit> onViewDestroyed, Function1<? super View, ? extends T> vbFactory, Function1<? super A, ? extends View> viewProvider) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        return viewBindingActivityWithCallbacks(componentActivity, onViewDestroyed, new ActivityViewBindings$viewBinding$5(vbFactory, viewProvider));
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(ComponentActivity componentActivity, Function1<? super View, ? extends T> vbFactory, int i) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewBindingActivityWithCallbacks(componentActivity, UtilsKt.emptyVbCallback(), new ActivityViewBindings$viewBinding$7(vbFactory, i));
    }

    public static /* synthetic */ ViewBindingProperty viewBindingActivity$default(ComponentActivity componentActivity, Function1 onViewDestroyed, Function1 vbFactory, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            onViewDestroyed = ActivityViewBindings$viewBinding$6.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewBindingActivityWithCallbacks(componentActivity, onViewDestroyed, new ActivityViewBindings$viewBinding$7(vbFactory, i));
    }

    public static final <T extends ViewBinding> ViewBindingProperty<ComponentActivity, T> viewBindingActivity(ComponentActivity componentActivity, Function1<? super T, Unit> onViewDestroyed, Function1<? super View, ? extends T> vbFactory, int i) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(vbFactory, "vbFactory");
        return viewBindingActivityWithCallbacks(componentActivity, onViewDestroyed, new ActivityViewBindings$viewBinding$7(vbFactory, i));
    }

    public static /* synthetic */ ViewBindingProperty activityViewBinding$default(Function1 function1, boolean z, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return activityViewBinding(function1, z, function12);
    }

    public static final <A extends ComponentActivity, T extends ViewBinding> ViewBindingProperty<A, T> activityViewBinding(Function1<? super T, Unit> onViewDestroyed, boolean z, Function1<? super A, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new ActivityViewBindingProperty(onViewDestroyed, z, viewBinder);
    }
}
