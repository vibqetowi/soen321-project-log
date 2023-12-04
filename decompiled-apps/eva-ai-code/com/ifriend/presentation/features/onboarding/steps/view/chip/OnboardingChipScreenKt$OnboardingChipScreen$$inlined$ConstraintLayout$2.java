package com.ifriend.presentation.features.onboarding.steps.view.chip;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.ifriend.presentation.features.onboarding.steps.view.common.ChipSelectButtonUiParams;
import com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingButtonComponentsKt;
import com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingTextComponentsKt;
import com.ifriend.ui.components.brush.LinearGradientKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChipScreenKt$OnboardingChipScreen$$inlined$ConstraintLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ Function0 $onButtonClick$inlined;
    final /* synthetic */ Function1 $onChipClick$inlined;
    final /* synthetic */ Function0 $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ OnboardingChipState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingChipScreenKt$OnboardingChipScreen$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, Function0 function0, OnboardingChipState onboardingChipState, Function0 function02, int i2, Function1 function1) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = function0;
        this.$state$inlined = onboardingChipState;
        this.$onButtonClick$inlined = function02;
        this.$$dirty$inlined = i2;
        this.$onChipClick$inlined = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    public final void invoke(Composer composer, int i) {
        long j;
        long j2;
        if (((i & 11) ^ 2) != 0 || !composer.getSkipping()) {
            int helpersHashCode = this.$scope.getHelpersHashCode();
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            ConstrainedLayoutReference component1 = createRefs.component1();
            ConstrainedLayoutReference component2 = createRefs.component2();
            ConstrainedLayoutReference component3 = createRefs.component3();
            ConstrainedLayoutReference component4 = createRefs.component4();
            int i2 = 0;
            OnboardingTextComponentsKt.m6936OnboardingTitle8iNrtrE(this.$state$inlined.getTitleLabel(), constraintLayoutScope.constrainAs(Modifier.Companion, component1, OnboardingChipScreenKt$OnboardingChipScreen$1$1.INSTANCE), TextAlign.Companion.m5474getStarte0LSkKk(), composer, 0, 0);
            float f = 7;
            Arrangement.Horizontal m656spacedByD5KLDUw = Arrangement.INSTANCE.m656spacedByD5KLDUw(Dp.m5607constructorimpl(f), Alignment.Companion.getCenterHorizontally());
            Arrangement.Vertical m657spacedByD5KLDUw = Arrangement.INSTANCE.m657spacedByD5KLDUw(Dp.m5607constructorimpl(f), Alignment.Companion.getCenterVertically());
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            int i3 = 511388516;
            composer.startReplaceableGroup(511388516);
            String str = "CC(remember)P(1,2):Composables.kt#9igjgp";
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(component1) | composer.changed(component3);
            OnboardingChipScreenKt$OnboardingChipScreen$1$2$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OnboardingChipScreenKt$OnboardingChipScreen$1$2$1(component1, component3);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier constrainAs = constraintLayoutScope.constrainAs(verticalScroll$default, component2, (Function1) rememberedValue);
            composer.startReplaceableGroup(1098475987);
            ComposerKt.sourceInformation(composer, "CC(FlowRow)P(3,1,4,2)61@2468L113,66@2586L134:FlowLayout.kt#2w3rfo");
            MeasurePolicy rowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(m656spacedByD5KLDUw, m657spacedByD5KLDUw, Integer.MAX_VALUE, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(constrainAs);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurementHelper, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 483375157, "C67@2635L9:FlowLayout.kt#2w3rfo");
            FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-1824083182);
            for (ChipSelectButtonUiParams chipSelectButtonUiParams : this.$state$inlined.getChips()) {
                composer.startMovableGroup(-614390945, chipSelectButtonUiParams.getId());
                String text = chipSelectButtonUiParams.getText();
                boolean selected = chipSelectButtonUiParams.getSelected();
                composer.startReplaceableGroup(i3);
                ComposerKt.sourceInformation(composer, str);
                boolean changed2 = composer.changed(this.$onChipClick$inlined) | composer.changed(chipSelectButtonUiParams);
                OnboardingChipScreenKt$OnboardingChipScreen$1$3$1$1 rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new OnboardingChipScreenKt$OnboardingChipScreen$1$3$1$1(this.$onChipClick$inlined, chipSelectButtonUiParams);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                OnboardingButtonComponentsKt.ChipButton(text, selected, rememberedValue2, null, composer, 0, 8);
                composer.endMovableGroup();
                i2 = i2;
                str = str;
                i3 = 511388516;
            }
            int i4 = i2;
            composer.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(200)), 0.0f, 1, null);
            Brush.Companion companion = Brush.Companion;
            Color[] colorArr = new Color[3];
            j = OnboardingChipScreenKt.shadowColor;
            colorArr[i4] = Color.m3281boximpl(j);
            j2 = OnboardingChipScreenKt.shadowColor;
            colorArr[1] = Color.m3281boximpl(j2);
            colorArr[2] = Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU());
            BoxKt.Box(constraintLayoutScope.constrainAs(BackgroundKt.background$default(fillMaxWidth$default, LinearGradientKt.m7018linearGradienteBVf0pg$default(companion, CollectionsKt.listOf((Object[]) colorArr), null, 0, 90.0f, false, 22, null), null, 0.0f, 6, null), component4, OnboardingChipScreenKt$OnboardingChipScreen$1$4.INSTANCE), composer, i4);
            OnboardingTextComponentsKt.OnboardingButton(this.$state$inlined.getButtonLabel(), constraintLayoutScope.constrainAs(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(Modifier.Companion)), component3, OnboardingChipScreenKt$OnboardingChipScreen$1$5.INSTANCE), this.$state$inlined.isButtonEnabled(), this.$onButtonClick$inlined, composer, (this.$$dirty$inlined << 3) & 7168, 0);
            if (this.$scope.getHelpersHashCode() != helpersHashCode) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
