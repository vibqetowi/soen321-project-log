package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TooltipKt$animateTooltip$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Transition<Boolean> $transition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$animateTooltip$2(Transition<Boolean> transition) {
        super(3);
        this.$transition = transition;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1498516085);
        ComposerKt.sourceInformation(composer, "C700@25010L583,719@25623L561:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1498516085, i, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:699)");
        }
        Transition<Boolean> transition = this.$transition;
        TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = TooltipKt$animateTooltip$2$scale$2.INSTANCE;
        composer.startReplaceableGroup(-1338768149);
        ComposerKt.sourceInformation(composer, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        composer.startReplaceableGroup(-142660079);
        ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
        boolean booleanValue = transition.getCurrentState().booleanValue();
        composer.startReplaceableGroup(-1553362193);
        ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
        }
        float f = booleanValue ? 1.0f : 0.8f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float valueOf = Float.valueOf(f);
        boolean booleanValue2 = transition.getTargetState().booleanValue();
        composer.startReplaceableGroup(-1553362193);
        ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
        }
        float f2 = booleanValue2 ? 1.0f : 0.8f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(f2), tooltipKt$animateTooltip$2$scale$2.invoke((TooltipKt$animateTooltip$2$scale$2) transition.getSegment(), (Transition.Segment<Boolean>) composer, (Composer) 0), vectorConverter, "tooltip transition: scaling", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Transition<Boolean> transition2 = this.$transition;
        TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = TooltipKt$animateTooltip$2$alpha$2.INSTANCE;
        composer.startReplaceableGroup(-1338768149);
        ComposerKt.sourceInformation(composer, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        composer.startReplaceableGroup(-142660079);
        ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
        boolean booleanValue3 = transition2.getCurrentState().booleanValue();
        composer.startReplaceableGroup(2073045083);
        ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
        }
        float f3 = booleanValue3 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float valueOf2 = Float.valueOf(f3);
        boolean booleanValue4 = transition2.getTargetState().booleanValue();
        composer.startReplaceableGroup(2073045083);
        ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
        }
        float f4 = booleanValue4 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition2, valueOf2, Float.valueOf(f4), tooltipKt$animateTooltip$2$alpha$2.invoke((TooltipKt$animateTooltip$2$alpha$2) transition2.getSegment(), (Transition.Segment<Boolean>) composer, (Composer) 0), vectorConverter2, "tooltip transition: alpha", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier m3447graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(composed, invoke$lambda$1(createTransitionAnimation), invoke$lambda$1(createTransitionAnimation), invoke$lambda$3(createTransitionAnimation2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3447graphicsLayerAp8cVGQ$default;
    }

    private static final float invoke$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float invoke$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
