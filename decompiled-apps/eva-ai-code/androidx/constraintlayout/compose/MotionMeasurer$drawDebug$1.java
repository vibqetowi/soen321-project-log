package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MotionLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MotionMeasurer$drawDebug$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ MotionMeasurer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionMeasurer$drawDebug$1(MotionMeasurer motionMeasurer) {
        super(1);
        this.this$0 = motionMeasurer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        PathEffect dashPathEffect = PathEffect.Companion.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        Iterator<ConstraintWidget> it = this.this$0.getRoot().getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            WidgetFrame startFrame = this.this$0.getTransition().getStart(next);
            WidgetFrame endFrame = this.this$0.getTransition().getEnd(next);
            MotionMeasurer motionMeasurer = this.this$0;
            Canvas.getDrawContext().getTransform().translate(2.0f, 2.0f);
            float m3087getWidthimpl = Size.m3087getWidthimpl(Canvas.mo3762getSizeNHjbRc());
            float m3084getHeightimpl = Size.m3084getHeightimpl(Canvas.mo3762getSizeNHjbRc());
            Intrinsics.checkNotNullExpressionValue(startFrame, "startFrame");
            Intrinsics.checkNotNullExpressionValue(endFrame, "endFrame");
            motionMeasurer.m5941drawFrameDebugPE3pjmc(Canvas, m3087getWidthimpl, m3084getHeightimpl, startFrame, endFrame, dashPathEffect, Color.Companion.m3328getWhite0d7_KjU());
            Canvas.getDrawContext().getTransform().translate(-2.0f, -2.0f);
            this.this$0.m5941drawFrameDebugPE3pjmc(Canvas, Size.m3087getWidthimpl(Canvas.mo3762getSizeNHjbRc()), Size.m3084getHeightimpl(Canvas.mo3762getSizeNHjbRc()), startFrame, endFrame, dashPathEffect, Color.Companion.m3318getBlue0d7_KjU());
        }
    }
}
