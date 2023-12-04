package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chat.panel.models.ChatPremiumTopicUi;
import com.ifriend.ui.components.progress.dots.DotsLoadingKt;
import com.ifriend.ui.components.progress.dots.DotsLoadingState;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPremiumTopicContent.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\f\u0010\t\u001a\u0004\u0018\u00010\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"ChatPremiumTopicContent", "", "topic", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;", "onTopicClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_release", "composition", "Lcom/airbnb/lottie/LottieComposition;", "textAlpha", "", "progressAlpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPremiumTopicContentKt {
    public static final void ChatPremiumTopicContent(ChatPremiumTopicUi topic, Function0<Unit> onTopicClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(onTopicClick, "onTopicClick");
        Composer startRestartGroup = composer.startRestartGroup(1976836095);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatPremiumTopicContent)P(1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(topic) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onTopicClick) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1976836095, i, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.ChatPremiumTopicContent (ChatPremiumTopicContent.kt:43)");
            }
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m454clickableXHw0xAI$default = ClickableKt.m454clickableXHw0xAI$default(ClipKt.clip(SizeKt.m781height3ABfNKs(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), Dp.m5607constructorimpl(36)), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(18))), !topic.isLoading(), null, null, onTopicClick, 6, null);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m454clickableXHw0xAI$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            LottieAnimationKt.LottieAnimation(ChatPremiumTopicContent$lambda$5$lambda$4$lambda$0(RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m6240boximpl(LottieCompositionSpec.RawRes.m6241constructorimpl(R.raw.animation_premium_gradient)), null, null, null, null, null, startRestartGroup, 0, 62)), BoxScopeInstance.INSTANCE.matchParentSize(Modifier.Companion), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.Companion.getFillBounds(), false, null, null, startRestartGroup, 1572872, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 491452);
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(topic.getIconResId() != null ? 24 : 12), 0.0f, Dp.m5607constructorimpl(12), 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            Modifier align = boxScopeInstance2.align(AlphaKt.alpha(Modifier.Companion, ChatPremiumTopicContent$lambda$5$lambda$4$lambda$3$lambda$1(AnimateAsStateKt.animateFloatAsState(!topic.isLoading() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(startRestartGroup, AppTheme.$stable).getLong(), 0, EasingKt.getLinearEasing(), 2, null), 0.0f, "", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20))), Alignment.Companion.getCenter());
            TextKt.m2145Text4IGK_g(topic.getName(), align, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(AppTheme.INSTANCE.getColors(composer2, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(16), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGeneralSans(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer2, 0, 0, 65532);
            DotsLoadingKt.m7061DotsLoadingFadeDDuSU3M(DotsLoadingKt.rememberDotsLoading(composer2, 0), boxScopeInstance2.align(AlphaKt.alpha(Modifier.Companion, ChatPremiumTopicContent$lambda$5$lambda$4$lambda$3$lambda$2(AnimateAsStateKt.animateFloatAsState(topic.isLoading() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(composer2, AppTheme.$stable).getLong(), 0, EasingKt.getLinearEasing(), 2, null), 0.0f, "", null, composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20))), Alignment.Companion.getCenter()), 0, Dp.m5607constructorimpl(4), AppTheme.INSTANCE.getColors(composer2, AppTheme.$stable).m7100getLight0d7_KjU(), 0, null, composer2, DotsLoadingState.$stable | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 100);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Integer iconResId = topic.getIconResId();
            composer2.startReplaceableGroup(634194007);
            if (iconResId != null) {
                Modifier align2 = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart());
                float f = 26;
                ImageKt.Image(PainterResources_androidKt.painterResource(topic.getIconResId().intValue(), composer2, 0), "", SizeKt.m802widthInVpY3zN4$default(SizeKt.m783heightInVpY3zN4$default(align2, 0.0f, Dp.m5607constructorimpl(f), 1, null), 0.0f, Dp.m5607constructorimpl(f), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            }
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new ChatPremiumTopicContentKt$ChatPremiumTopicContent$2(topic, onTopicClick, i));
    }

    private static final LottieComposition ChatPremiumTopicContent$lambda$5$lambda$4$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final float ChatPremiumTopicContent$lambda$5$lambda$4$lambda$3$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float ChatPremiumTopicContent$lambda$5$lambda$4$lambda$3$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
