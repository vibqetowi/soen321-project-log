package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferBadgesUi;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import com.ifriend.ui.components.modifier.ConditionalModifierKt;
import com.ifriend.ui.components.text.AutoTextSizeKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionOfferItem.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001aE\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"ChatSubscriptionOfferItemContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "offer", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;", "gradientShadow", "Landroidx/compose/ui/graphics/Color;", "onItemClick", "Lkotlin/Function1;", "", "ChatSubscriptionOfferItemContent-cf5BqRc", "(Landroidx/compose/ui/Modifier;Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SubscriptionBadgeContent", "badge", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferBadgesUi;", "(Landroidx/compose/ui/Modifier;Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferBadgesUi;Landroidx/compose/runtime/Composer;II)V", "presentation_release", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "priceAnimatedAlpha", "", "badgeAnimatedAlpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferItemKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cb  */
    /* renamed from: ChatSubscriptionOfferItemContent-cf5BqRc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6977ChatSubscriptionOfferItemContentcf5BqRc(Modifier modifier, ChatSubscriptionOfferUi offer, long j, Function1<? super String, Unit> onItemClick, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j2;
        long m7141getTranslucentCardColor0d7_KjU;
        long j3;
        boolean changed;
        ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$1$1 rememberedValue;
        boolean changed2;
        ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$2$1 rememberedValue2;
        long j4;
        boolean changed3;
        ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$3$1 rememberedValue3;
        ChatSubscriptionOfferBadgesUi badge;
        Modifier modifier2;
        boolean changed4;
        ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$1$1 rememberedValue4;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        int currentCompositeKeyHash2;
        Composer m2893constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m2893constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m2893constructorimpl4;
        TextStyle m5100copyv2rsoow;
        TextStyle m5100copyv2rsoow2;
        TextStyle m5100copyv2rsoow3;
        long j5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(offer, "offer");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer startRestartGroup = composer.startRestartGroup(1027542528);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSubscriptionOfferItemContent)P(1,2,0:c#ui.graphics.Color)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(offer) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(onItemClick) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                long m7133getAppVioletGradient0d7_KjU = i5 == 0 ? AppColors.Companion.m7133getAppVioletGradient0d7_KjU() : j2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1027542528, i3, -1, "com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatSubscriptionOfferItemContent (ChatSubscriptionOfferItem.kt:43)");
                }
                startRestartGroup.startReplaceableGroup(-1305355474);
                if (!offer.isSelected()) {
                    m7141getTranslucentCardColor0d7_KjU = AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7101getLight100d7_KjU();
                } else {
                    m7141getTranslucentCardColor0d7_KjU = AppColors.Companion.m7141getTranslucentCardColor0d7_KjU();
                }
                startRestartGroup.endReplaceableGroup();
                j3 = m7133getAppVioletGradient0d7_KjU;
                State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(m7141getTranslucentCardColor0d7_KjU, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), "Background Animation", null, startRestartGroup, 432, 8);
                float m7175getMediumD9Ej5fM = AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM();
                Modifier m781height3ABfNKs = SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5607constructorimpl(167));
                boolean z = !offer.isSelected();
                Dp m5605boximpl = Dp.m5605boximpl(m7175getMediumD9Ej5fM);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(m5605boximpl);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$1$1(m7175getMediumD9Ej5fM);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier clip = ClipKt.clip(BackgroundKt.m420backgroundbw27NRU(ConditionalModifierKt.conditional(m781height3ABfNKs, z, (Function1) rememberedValue), ChatSubscriptionOfferItemContent_cf5BqRc$lambda$0(m329animateColorAsStateeuL9pac), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(m7175getMediumD9Ej5fM)), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(m7175getMediumD9Ej5fM));
                boolean isSelected = offer.isSelected();
                Color m3281boximpl = Color.m3281boximpl(j3);
                Dp m5605boximpl2 = Dp.m5605boximpl(m7175getMediumD9Ej5fM);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(m3281boximpl) | startRestartGroup.changed(m5605boximpl2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    j4 = j3;
                    rememberedValue2 = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$2$1(j4, m7175getMediumD9Ej5fM);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    j4 = j3;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier conditional = ConditionalModifierKt.conditional(clip, isSelected, (Function1) rememberedValue2);
                boolean isSelected2 = offer.isSelected();
                Color m3281boximpl2 = Color.m3281boximpl(j4);
                Dp m5605boximpl3 = Dp.m5605boximpl(m7175getMediumD9Ej5fM);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(m3281boximpl2) | startRestartGroup.changed(m5605boximpl3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$3$1(j4, m7175getMediumD9Ej5fM);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier conditional2 = ConditionalModifierKt.conditional(conditional, isSelected2, (Function1) rememberedValue3);
                badge = offer.getBadge();
                modifier2 = companion;
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState((offer.isSelected() || badge == null) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(400, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "Price text animation", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20);
                State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState((offer.isSelected() || badge == null) ? 0.0f : 1.0f, AnimationSpecKt.tween$default(400, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "Badge text animation", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                long j6 = j4;
                changed4 = startRestartGroup.changed(onItemClick) | startRestartGroup.changed(offer);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$1$1(onItemClick, offer);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier noIndicationClickable$default = ClickableModifierKt.noIndicationClickable$default(conditional2, false, (Function0) rememberedValue4, 1, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(noIndicationClickable$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 0.0f, 2, null);
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceAround, centerHorizontally, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f = 10;
                Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 13, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                AutoTextSizeKt.m7073AutoTextSizetoyU4E8(PaddingKt.m752paddingqDBjuR0$default(AlphaKt.alpha(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ChatSubscriptionOfferItemContent_cf5BqRc$lambda$4(animateFloatAsState)), 0.0f, Dp.m5607constructorimpl(9), 0.0f, 0.0f, 13, null), offer.getPriceLabel(), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold(), 0L, 0L, 0, startRestartGroup, 0, 224);
                startRestartGroup.startReplaceableGroup(1732361392);
                if (badge != null) {
                    SubscriptionBadgeContent(PaddingKt.m750paddingVpY3zN4$default(AlphaKt.alpha(Modifier.Companion, ChatSubscriptionOfferItemContent_cf5BqRc$lambda$5(animateFloatAsState2)), Dp.m5607constructorimpl(f), 0.0f, 2, null), badge, startRestartGroup, 0, 0);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                startRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier m750paddingVpY3zN4$default2 = PaddingKt.m750paddingVpY3zN4$default(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 1, null);
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getStart(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl4 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl4, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl4.getInserting() || !Intrinsics.areEqual(m2893constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m2893constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m2893constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                Modifier weight = ColumnScopeInstance.INSTANCE.weight(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false);
                String subscriptionMonths = offer.getSubscriptionMonths();
                m5100copyv2rsoow = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(57), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : TextUnitKt.getSp(57), (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold().paragraphStyle.getTextMotion() : null);
                AutoTextSizeKt.m7073AutoTextSizetoyU4E8(weight, subscriptionMonths, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow, 0L, 0L, 0, startRestartGroup, 0, 224);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                String monthLabel = offer.getMonthLabel();
                m5100copyv2rsoow2 = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(14.4d), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold().paragraphStyle.getTextMotion() : null);
                AutoTextSizeKt.m7073AutoTextSizetoyU4E8(fillMaxWidth$default, monthLabel, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow2, 0L, 0L, 0, startRestartGroup, 6, 224);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 7, null);
                String monthPriceLabel = offer.getMonthPriceLabel();
                m5100copyv2rsoow3 = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(15), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold().paragraphStyle.getTextMotion() : null);
                AutoTextSizeKt.m7073AutoTextSizetoyU4E8(m752paddingqDBjuR0$default2, monthPriceLabel, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow3, 0L, 0L, 0, startRestartGroup, 0, 224);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-1305350910);
                if (!offer.isSelected()) {
                    BoxKt.Box(conditional2, startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = j6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                j5 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$3(modifier2, offer, j5, onItemClick, i, i2));
            return;
        }
        j2 = j;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1305355474);
        if (!offer.isSelected()) {
        }
        startRestartGroup.endReplaceableGroup();
        j3 = m7133getAppVioletGradient0d7_KjU;
        State<Color> m329animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(m7141getTranslucentCardColor0d7_KjU, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), "Background Animation", null, startRestartGroup, 432, 8);
        float m7175getMediumD9Ej5fM2 = AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM();
        Modifier m781height3ABfNKs2 = SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5607constructorimpl(167));
        boolean z2 = !offer.isSelected();
        Dp m5605boximpl4 = Dp.m5605boximpl(m7175getMediumD9Ej5fM2);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m5605boximpl4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$1$1(m7175getMediumD9Ej5fM2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        Modifier clip2 = ClipKt.clip(BackgroundKt.m420backgroundbw27NRU(ConditionalModifierKt.conditional(m781height3ABfNKs2, z2, (Function1) rememberedValue), ChatSubscriptionOfferItemContent_cf5BqRc$lambda$0(m329animateColorAsStateeuL9pac2), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(m7175getMediumD9Ej5fM2)), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(m7175getMediumD9Ej5fM2));
        boolean isSelected3 = offer.isSelected();
        Color m3281boximpl3 = Color.m3281boximpl(j3);
        Dp m5605boximpl22 = Dp.m5605boximpl(m7175getMediumD9Ej5fM2);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(m3281boximpl3) | startRestartGroup.changed(m5605boximpl22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        j4 = j3;
        rememberedValue2 = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$2$1(j4, m7175getMediumD9Ej5fM2);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        Modifier conditional3 = ConditionalModifierKt.conditional(clip2, isSelected3, (Function1) rememberedValue2);
        boolean isSelected22 = offer.isSelected();
        Color m3281boximpl22 = Color.m3281boximpl(j4);
        Dp m5605boximpl32 = Dp.m5605boximpl(m7175getMediumD9Ej5fM2);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(m3281boximpl22) | startRestartGroup.changed(m5605boximpl32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$boxModifier$3$1(j4, m7175getMediumD9Ej5fM2);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        Modifier conditional22 = ConditionalModifierKt.conditional(conditional3, isSelected22, (Function1) rememberedValue3);
        badge = offer.getBadge();
        modifier2 = companion;
        State<Float> animateFloatAsState3 = AnimateAsStateKt.animateFloatAsState((offer.isSelected() || badge == null) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(400, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "Price text animation", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20);
        State<Float> animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState((offer.isSelected() || badge == null) ? 0.0f : 1.0f, AnimationSpecKt.tween$default(400, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "Badge text animation", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        long j62 = j4;
        changed4 = startRestartGroup.changed(onItemClick) | startRestartGroup.changed(offer);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = new ChatSubscriptionOfferItemKt$ChatSubscriptionOfferItemContent$1$1(onItemClick, offer);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        Modifier noIndicationClickable$default2 = ClickableModifierKt.noIndicationClickable$default(conditional22, false, (Function0) rememberedValue4, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(noIndicationClickable$default2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
        modifierMaterializerOf5.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
        Modifier m750paddingVpY3zN4$default3 = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 0.0f, 2, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
        Arrangement.HorizontalOrVertical spaceAround2 = Arrangement.INSTANCE.getSpaceAround();
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(spaceAround2, centerHorizontally2, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default3);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl2.getInserting()) {
        }
        m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        float f2 = 10;
        Modifier m752paddingqDBjuR0$default3 = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5607constructorimpl(f2), 0.0f, 0.0f, 13, null);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default3);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl3.getInserting()) {
        }
        m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        modifierMaterializerOf32.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        AutoTextSizeKt.m7073AutoTextSizetoyU4E8(PaddingKt.m752paddingqDBjuR0$default(AlphaKt.alpha(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ChatSubscriptionOfferItemContent_cf5BqRc$lambda$4(animateFloatAsState3)), 0.0f, Dp.m5607constructorimpl(9), 0.0f, 0.0f, 13, null), offer.getPriceLabel(), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold(), 0L, 0L, 0, startRestartGroup, 0, 224);
        startRestartGroup.startReplaceableGroup(1732361392);
        if (badge != null) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier m750paddingVpY3zN4$default22 = PaddingKt.m750paddingVpY3zN4$default(ColumnScope.CC.weight$default(columnScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf42 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl4 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl4, columnMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl4.getInserting()) {
        }
        m2893constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m2893constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
        modifierMaterializerOf42.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        Modifier weight2 = ColumnScopeInstance.INSTANCE.weight(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false);
        String subscriptionMonths2 = offer.getSubscriptionMonths();
        m5100copyv2rsoow = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(57), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : TextUnitKt.getSp(57), (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold().paragraphStyle.getTextMotion() : null);
        AutoTextSizeKt.m7073AutoTextSizetoyU4E8(weight2, subscriptionMonths2, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow, 0L, 0L, 0, startRestartGroup, 0, 224);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        String monthLabel2 = offer.getMonthLabel();
        m5100copyv2rsoow2 = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(14.4d), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold().paragraphStyle.getTextMotion() : null);
        AutoTextSizeKt.m7073AutoTextSizetoyU4E8(fillMaxWidth$default2, monthLabel2, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow2, 0L, 0L, 0, startRestartGroup, 6, 224);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier m752paddingqDBjuR0$default22 = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 7, null);
        String monthPriceLabel2 = offer.getMonthPriceLabel();
        m5100copyv2rsoow3 = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(15), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold().paragraphStyle.getTextMotion() : null);
        AutoTextSizeKt.m7073AutoTextSizetoyU4E8(m752paddingqDBjuR0$default22, monthPriceLabel2, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow3, 0L, 0L, 0, startRestartGroup, 0, 224);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1305350910);
        if (!offer.isSelected()) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        j5 = j62;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SubscriptionBadgeContent(Modifier modifier, ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        TextStyle m5100copyv2rsoow;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1451238456);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(chatSubscriptionOfferBadgesUi) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.Companion : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1451238456, i3, -1, "com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.SubscriptionBadgeContent (ChatSubscriptionOfferItem.kt:183)");
            }
            float m5607constructorimpl = Dp.m5607constructorimpl(12);
            RoundedCornerShape m1009RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(m5607constructorimpl);
            Modifier clip = ClipKt.clip(BackgroundKt.m420backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chatSubscriptionOfferBadgesUi.m6974getBackground0d7_KjU(), m1009RoundedCornerShape0680j_4), m1009RoundedCornerShape0680j_4);
            boolean z = !Color.m3292equalsimpl0(chatSubscriptionOfferBadgesUi.m6975getShadowColor0d7_KjU(), Color.Companion.m3326getTransparent0d7_KjU());
            Dp m5605boximpl = Dp.m5605boximpl(m5607constructorimpl);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(chatSubscriptionOfferBadgesUi) | startRestartGroup.changed(m5605boximpl);
            ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$1$1(chatSubscriptionOfferBadgesUi, m5607constructorimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier conditional = ConditionalModifierKt.conditional(clip, z, (Function1) rememberedValue);
            boolean z2 = !Color.m3292equalsimpl0(chatSubscriptionOfferBadgesUi.m6975getShadowColor0d7_KjU(), Color.Companion.m3326getTransparent0d7_KjU());
            Dp m5605boximpl2 = Dp.m5605boximpl(m5607constructorimpl);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m5605boximpl2) | startRestartGroup.changed(chatSubscriptionOfferBadgesUi);
            ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$2$1(chatSubscriptionOfferBadgesUi, m5607constructorimpl);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier conditional2 = ConditionalModifierKt.conditional(conditional, z2, (Function1) rememberedValue2);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(conditional2);
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
            BoxKt.Box(BackgroundKt.m420backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7101getLight100d7_KjU(), m1009RoundedCornerShape0680j_4), startRestartGroup, 0);
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 1, null);
            String title = chatSubscriptionOfferBadgesUi.getTitle();
            m5100copyv2rsoow = r16.m5100copyv2rsoow((r48 & 1) != 0 ? r16.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r16.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(14), (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r16.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r16.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r16.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r16.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r16.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r16.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r16.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemBold().paragraphStyle.getTextMotion() : null);
            Modifier modifier2 = companion;
            composer2 = startRestartGroup;
            AutoTextSizeKt.m7073AutoTextSizetoyU4E8(m750paddingVpY3zN4$default, title, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow, 0L, 0L, 0, startRestartGroup, 0, 224);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            obj = modifier2;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatSubscriptionOfferItemKt$SubscriptionBadgeContent$4(obj, chatSubscriptionOfferBadgesUi, i, i2));
    }

    private static final long ChatSubscriptionOfferItemContent_cf5BqRc$lambda$0(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final float ChatSubscriptionOfferItemContent_cf5BqRc$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float ChatSubscriptionOfferItemContent_cf5BqRc$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}
