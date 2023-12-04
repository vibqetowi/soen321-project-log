package com.ifriend.chat.presentation.ui.infoOnboarding;

import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.ifriend.chat.presentation.ui.infoOnboarding.slides.InfoOnboardingSlideAllowNotificationsKt;
import com.ifriend.chat.presentation.ui.infoOnboarding.slides.InfoOnboardingSlideIntimateKt;
import com.ifriend.chat.presentation.ui.infoOnboarding.slides.InfoOnboardingSlideTrackActivityKt;
import com.ifriend.chat.presentation.ui.infoOnboarding.slides.InfoOnboardingSlideUserWillSendPhotosKt;
import com.ifriend.chat.presentation.ui.infoOnboarding.slides.component.InfoOnboardingDescriptionTextKt;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InfoOnboardingFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "screen", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InfoOnboardingFragment$onViewCreated$1$1$1$1$1 extends Lambda implements Function4<AnimatedContentScope, InfoOnboardingSlide, Composer, Integer, Unit> {
    final /* synthetic */ InfoOnboardingFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingFragment$onViewCreated$1$1$1$1$1(InfoOnboardingFragment infoOnboardingFragment) {
        super(4);
        this.this$0 = infoOnboardingFragment;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, InfoOnboardingSlide infoOnboardingSlide, Composer composer, Integer num) {
        invoke(animatedContentScope, infoOnboardingSlide, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, InfoOnboardingSlide screen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(154023081, i, -1, "com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InfoOnboardingFragment.kt:74)");
        }
        InfoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1 infoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1 = new InfoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1(this.this$0, screen);
        InfoOnboardingFragment$onViewCreated$1$1$1$1$1$onNegativeButtonClick$1 infoOnboardingFragment$onViewCreated$1$1$1$1$1$onNegativeButtonClick$1 = new InfoOnboardingFragment$onViewCreated$1$1$1$1$1$onNegativeButtonClick$1(this.this$0, screen);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        InfoOnboardingFragment infoOnboardingFragment = this.this$0;
        composer.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (!Intrinsics.areEqual(screen, InfoOnboardingSlide.Empty.INSTANCE)) {
            if (screen instanceof InfoOnboardingSlide.TrackActivity) {
                composer.startReplaceableGroup(474878495);
                InfoOnboardingSlideTrackActivityKt.InfoOnboardingSlideTrackActivity(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenter()), infoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1, infoOnboardingFragment$onViewCreated$1$1$1$1$1$onNegativeButtonClick$1, composer, 0, 0);
                composer.endReplaceableGroup();
            } else if (Intrinsics.areEqual(screen, InfoOnboardingSlide.UserWillSendPhotos.INSTANCE)) {
                composer.startReplaceableGroup(474878969);
                InfoOnboardingSlideUserWillSendPhotosKt.InfoOnboardingSlideUserWillSendPhotos(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenter()), infoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1, infoOnboardingFragment$onViewCreated$1$1$1$1$1$onNegativeButtonClick$1, composer, 0, 0);
                composer.endReplaceableGroup();
            } else if (screen instanceof InfoOnboardingSlide.AllowNotifications) {
                composer.startReplaceableGroup(474879531);
                InfoOnboardingSlideAllowNotificationsKt.InfoOnboardingSlideAllowNotifications(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenter()), infoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1, infoOnboardingFragment$onViewCreated$1$1$1$1$1$onNegativeButtonClick$1, composer, 0, 0);
                composer.endReplaceableGroup();
            } else if (Intrinsics.areEqual(screen, InfoOnboardingSlide.Intimate.INSTANCE)) {
                composer.startReplaceableGroup(474880661);
                InfoOnboardingSlideIntimateKt.InfoOnboardingSlideIntimate(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenter()), infoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1, composer, 0, 0);
                composer.endReplaceableGroup();
            } else if (screen instanceof InfoOnboardingSlide.PermissionRequest) {
                composer.startReplaceableGroup(474881121);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                composer.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                InfoOnboardingDescriptionTextKt.InfoOnboardingDescriptionText(PaddingKt.m752paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0.0f, Dp.m5607constructorimpl(82), 0.0f, 0.0f, 13, null), "All your personal data is under protection", composer, 48, 0);
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$1(ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$launcher$1(infoOnboardingFragment, screen), composer, 8), screen, null), composer, 70);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(474882932);
                composer.endReplaceableGroup();
            }
        } else {
            composer.startReplaceableGroup(474878372);
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
