package com.ifriend.presentation.features.onboarding.steps.view.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingImageComponentsKt;
import com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingTextComponentsKt;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonWithImageUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingGripScreen.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"OnboardingGridScreen", "", "state", "Lcom/ifriend/presentation/features/onboarding/steps/view/grid/OnboardingGridState;", "onButtonClick", "Lkotlin/Function1;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonWithImageUiParams;", "(Lcom/ifriend/presentation/features/onboarding/steps/view/grid/OnboardingGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingGripScreenKt {
    public static final void OnboardingGridScreen(OnboardingGridState state, Function1<? super SelectButtonWithImageUiParams, Unit> onButtonClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(2118509795);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingGridScreen)P(1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onButtonClick) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2118509795, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.grid.OnboardingGridScreen (OnboardingGripScreen.kt:25)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(Modifier.Companion)), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            OnboardingImageComponentsKt.OnboardingEyeImage(startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(26)), startRestartGroup, 6);
            OnboardingTextComponentsKt.m6936OnboardingTitle8iNrtrE(state.getTitleLabel(), null, 0, startRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(45)), startRestartGroup, 6);
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(16), 0.0f, 2, null);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            Arrangement.HorizontalOrVertical m655spacedBy0680j_4 = Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(17));
            Arrangement.HorizontalOrVertical m655spacedBy0680j_42 = Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(19));
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(state) | startRestartGroup.changed(onButtonClick);
            OnboardingGripScreenKt$OnboardingGridScreen$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OnboardingGripScreenKt$OnboardingGridScreen$1$1$1(state, onButtonClick, i3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed, m750paddingVpY3zN4$default, null, null, false, m655spacedBy0680j_4, m655spacedBy0680j_42, null, false, (Function1) rememberedValue, startRestartGroup, 1769520, 412);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(30)), composer2, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingGripScreenKt$OnboardingGridScreen$2(state, onButtonClick, i));
    }
}
