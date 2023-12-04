package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ State<TransformOrigin> $transformOrigin$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$1$1(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$alpha$delegate = state;
        this.$scale$delegate = state2;
        this.$transformOrigin$delegate = state3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayer) {
        float createModifier$lambda$8;
        float createModifier$lambda$11;
        float createModifier$lambda$112;
        long createModifier$lambda$13;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        createModifier$lambda$8 = EnterExitTransitionKt.createModifier$lambda$8(this.$alpha$delegate);
        graphicsLayer.setAlpha(createModifier$lambda$8);
        createModifier$lambda$11 = EnterExitTransitionKt.createModifier$lambda$11(this.$scale$delegate);
        graphicsLayer.setScaleX(createModifier$lambda$11);
        createModifier$lambda$112 = EnterExitTransitionKt.createModifier$lambda$11(this.$scale$delegate);
        graphicsLayer.setScaleY(createModifier$lambda$112);
        createModifier$lambda$13 = EnterExitTransitionKt.createModifier$lambda$13(this.$transformOrigin$delegate);
        graphicsLayer.mo3460setTransformOrigin__ExYCQ(createModifier$lambda$13);
    }
}
