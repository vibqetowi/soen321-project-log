package by.kirich1409.viewbindingdelegate;

import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "VB", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegateUtilsRef$viewBindingLazy$1 extends Lambda implements Function1<VB, Unit> {
    public static final ViewBindingPropertyDelegateUtilsRef$viewBindingLazy$1 INSTANCE = new ViewBindingPropertyDelegateUtilsRef$viewBindingLazy$1();

    public ViewBindingPropertyDelegateUtilsRef$viewBindingLazy$1() {
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
