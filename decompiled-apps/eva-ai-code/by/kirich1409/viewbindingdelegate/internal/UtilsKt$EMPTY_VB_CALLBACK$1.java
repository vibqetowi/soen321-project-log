package by.kirich1409.viewbindingdelegate.internal;

import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "<anonymous parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class UtilsKt$EMPTY_VB_CALLBACK$1 extends Lambda implements Function1<ViewBinding, Unit> {
    public static final UtilsKt$EMPTY_VB_CALLBACK$1 INSTANCE = new UtilsKt$EMPTY_VB_CALLBACK$1();

    UtilsKt$EMPTY_VB_CALLBACK$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ViewBinding noName_0) {
        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewBinding viewBinding) {
        invoke2(viewBinding);
        return Unit.INSTANCE;
    }
}
