package androidx.constraintlayout.compose;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MotionLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MotionLayoutKt$MotionLayoutCore$4 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ MotionMeasurer $measurer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$4(MotionMeasurer motionMeasurer) {
        super(1);
        this.$measurer = motionMeasurer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        ToolingUtilsKt.setDesignInfoProvider(semantics, this.$measurer);
    }
}
