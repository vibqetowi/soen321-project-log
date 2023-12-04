package by.kirich1409.viewbindingdelegate;

import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n"}, d2 = {"", "R", "Landroidx/viewbinding/ViewBinding;", "VB", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$1 extends Lambda implements Function1<VB, Unit> {
    public static final ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$1 INSTANCE = new ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$1();

    public ViewBindingPropertyDelegateUtilsRef$viewBindingWithLifecycle$1() {
        super(1);
    }

    /* JADX WARN: Incorrect types in method signature: (TVB;)V */
    public final void invoke(ViewBinding it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((ViewBinding) obj);
        return Unit.INSTANCE;
    }
}
