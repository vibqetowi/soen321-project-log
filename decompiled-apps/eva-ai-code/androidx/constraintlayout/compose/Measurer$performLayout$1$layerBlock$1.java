package androidx.constraintlayout.compose;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.constraintlayout.core.state.WidgetFrame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class Measurer$performLayout$1$layerBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ WidgetFrame $frame;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Measurer$performLayout$1$layerBlock$1(WidgetFrame widgetFrame) {
        super(1);
        this.$frame = widgetFrame;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
        if (!Float.isNaN(this.$frame.pivotX) || !Float.isNaN(this.$frame.pivotY)) {
            graphicsLayerScope.mo3460setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(this.$frame.pivotX) ? 0.5f : this.$frame.pivotX, Float.isNaN(this.$frame.pivotY) ? 0.5f : this.$frame.pivotY));
        }
        if (!Float.isNaN(this.$frame.rotationX)) {
            graphicsLayerScope.setRotationX(this.$frame.rotationX);
        }
        if (!Float.isNaN(this.$frame.rotationY)) {
            graphicsLayerScope.setRotationY(this.$frame.rotationY);
        }
        if (!Float.isNaN(this.$frame.rotationZ)) {
            graphicsLayerScope.setRotationZ(this.$frame.rotationZ);
        }
        if (!Float.isNaN(this.$frame.translationX)) {
            graphicsLayerScope.setTranslationX(this.$frame.translationX);
        }
        if (!Float.isNaN(this.$frame.translationY)) {
            graphicsLayerScope.setTranslationY(this.$frame.translationY);
        }
        if (!Float.isNaN(this.$frame.translationZ)) {
            graphicsLayerScope.setShadowElevation(this.$frame.translationZ);
        }
        if (!Float.isNaN(this.$frame.scaleX) || !Float.isNaN(this.$frame.scaleY)) {
            graphicsLayerScope.setScaleX(Float.isNaN(this.$frame.scaleX) ? 1.0f : this.$frame.scaleX);
            graphicsLayerScope.setScaleY(Float.isNaN(this.$frame.scaleY) ? 1.0f : this.$frame.scaleY);
        }
        if (Float.isNaN(this.$frame.alpha)) {
            return;
        }
        graphicsLayerScope.setAlpha(this.$frame.alpha);
    }
}
