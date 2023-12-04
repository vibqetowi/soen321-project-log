package by.kirich1409.viewbindingdelegate;

import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lby/kirich1409/viewbindingdelegate/ActivityViewBindingProperty;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/activity/ComponentActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Lby/kirich1409/viewbindingdelegate/LifecycleViewBindingProperty;", "onViewDestroyed", "Lkotlin/Function1;", "", "viewNeedInitialization", "", "viewBinder", "(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "thisRef", "(Landroidx/activity/ComponentActivity;)Landroidx/lifecycle/LifecycleOwner;", "isViewInitialized", "(Landroidx/activity/ComponentActivity;)Z", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityViewBindingProperty<A extends ComponentActivity, T extends ViewBinding> extends LifecycleViewBindingProperty<A, T> {
    private final boolean viewNeedInitialization;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ LifecycleOwner getLifecycleOwner(Object obj) {
        return getLifecycleOwner((ActivityViewBindingProperty<A, T>) ((ComponentActivity) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty
    public /* bridge */ /* synthetic */ boolean isViewInitialized(Object obj) {
        return isViewInitialized((ActivityViewBindingProperty<A, T>) ((ComponentActivity) obj));
    }

    public /* synthetic */ ActivityViewBindingProperty(Function1 function1, boolean z, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? true : z, function12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewBindingProperty(Function1<? super T, Unit> onViewDestroyed, boolean z, Function1<? super A, ? extends T> viewBinder) {
        super(viewBinder, onViewDestroyed);
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.viewNeedInitialization = z;
    }

    protected LifecycleOwner getLifecycleOwner(A thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return thisRef;
    }

    protected boolean isViewInitialized(A thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return (this.viewNeedInitialization && thisRef.getWindow() == null) ? false : true;
    }
}
