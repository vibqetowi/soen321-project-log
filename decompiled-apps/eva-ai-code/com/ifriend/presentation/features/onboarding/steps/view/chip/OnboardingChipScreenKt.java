package com.ifriend.presentation.features.onboarding.steps.view.chip;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import com.ifriend.presentation.features.onboarding.steps.view.common.ChipSelectButtonUiParams;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingChipScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\fH\u0007¢\u0006\u0002\u0010\r\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"shadowColor", "Landroidx/compose/ui/graphics/Color;", "J", "OnboardingChipScreen", "", "state", "Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;", "onChipClick", "Lkotlin/Function1;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/ChipSelectButtonUiParams;", "onButtonClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChipScreenKt {
    private static final long shadowColor = Color.m3290copywmQWz5c$default(ColorKt.Color(4279113508L), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);

    public static final void OnboardingChipScreen(OnboardingChipState state, Function1<? super ChipSelectButtonUiParams, Unit> onChipClick, Function0<Unit> onButtonClick, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onChipClick, "onChipClick");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(-931765865);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingChipScreen)P(2,1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onChipClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onButtonClick) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-931765865, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.chip.OnboardingChipScreen (OnboardingChipScreen.kt:39)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(-270267587);
            ComposerKt.sourceInformation(startRestartGroup, "C(ConstraintLayout)P(1,2)");
            startRestartGroup.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new Measurer();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Measurer measurer = (Measurer) rememberedValue;
            startRestartGroup.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState) rememberedValue3, measurer, startRestartGroup, 4544);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxSize$default, false, new OnboardingChipScreenKt$OnboardingChipScreen$$inlined$ConstraintLayout$1(measurer), 1, null), ComposableLambdaKt.composableLambda(startRestartGroup, -819894182, true, new OnboardingChipScreenKt$OnboardingChipScreen$$inlined$ConstraintLayout$2(constraintLayoutScope, 6, rememberConstraintLayoutMeasurePolicy.component2(), state, onButtonClick, i3, onChipClick)), rememberConstraintLayoutMeasurePolicy.component1(), startRestartGroup, 48, 0);
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingChipScreenKt$OnboardingChipScreen$2(state, onChipClick, onButtonClick, i));
    }
}
