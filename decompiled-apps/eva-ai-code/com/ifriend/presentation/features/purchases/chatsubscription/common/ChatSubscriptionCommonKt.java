package com.ifriend.presentation.features.purchases.chatsubscription.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.R;
import com.ifriend.ui.components.brush.LinearGradientKt;
import com.ifriend.ui.components.shadow.ColoredShadowKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionCommon.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aE\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"ChatSubscriptionBadge", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChatSubscriptionBenefitsHeader", "onBackClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "chatName", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ChatSubscriptionCardAction", "onClick", "resId", "", "tintColor", "Landroidx/compose/ui/graphics/Color;", "ChatSubscriptionCardAction-ww6aTOc", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IJLandroidx/compose/runtime/Composer;II)V", "ChatSubscriptionChatName", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionCommonKt {
    /* renamed from: ChatSubscriptionCardAction-ww6aTOc  reason: not valid java name */
    public static final void m6961ChatSubscriptionCardActionww6aTOc(Modifier modifier, Function0<Unit> onClick, int i, long j, Composer composer, int i2, int i3) {
        Object obj;
        int i4;
        long j2;
        Modifier modifier2;
        Composer composer2;
        long j3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1405829885);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSubscriptionCardAction)P(!,3:c#ui.graphics.Color)");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            obj = modifier;
        } else if ((i2 & 14) == 0) {
            obj = modifier;
            i4 = (startRestartGroup.changed(obj) ? 4 : 2) | i2;
        } else {
            obj = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            j2 = j;
        } else {
            j2 = j;
            if ((i2 & 7168) == 0) {
                i4 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
        }
        int i7 = i4;
        if ((i7 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i5 != 0 ? Modifier.Companion : obj;
            long m3328getWhite0d7_KjU = i6 != 0 ? Color.Companion.m3328getWhite0d7_KjU() : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1405829885, i7, -1, "com.ifriend.presentation.features.purchases.chatsubscription.common.ChatSubscriptionCardAction (ChatSubscriptionCommon.kt:38)");
            }
            float f = 15;
            float f2 = -2;
            Modifier m454clickableXHw0xAI$default = ClickableKt.m454clickableXHw0xAI$default(ColoredShadowKt.m7067coloredShadowPRYyx80(BackgroundKt.background$default(SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(companion, Dp.m5607constructorimpl(45)), Dp.m5607constructorimpl(51)), LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3281boximpl(ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)))}), null, 0, 45.0f, false, 22, null), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f)), 0.0f, 4, null), ColorKt.Color(4294769916L), 0.05f, Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(3), Dp.m5607constructorimpl(f2), Dp.m5607constructorimpl(f2)), false, null, null, onClick, 7, null);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m454clickableXHw0xAI$default);
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
            modifier2 = companion;
            composer2 = startRestartGroup;
            IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(i, startRestartGroup, (i7 >> 6) & 14), "", (Modifier) null, m3328getWhite0d7_KjU, startRestartGroup, (i7 & 7168) | 56, 4);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = m3328getWhite0d7_KjU;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = obj;
            j3 = j2;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatSubscriptionCommonKt$ChatSubscriptionCardAction$2(modifier2, onClick, i, j3, i2, i3));
    }

    public static final void ChatSubscriptionBenefitsHeader(Function0<Unit> onBackClick, String chatName, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Composer startRestartGroup = composer.startRestartGroup(1955645570);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSubscriptionBenefitsHeader)P(1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onBackClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(chatName) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1955645570, i3, -1, "com.ifriend.presentation.features.purchases.chatsubscription.common.ChatSubscriptionBenefitsHeader (ChatSubscriptionCommon.kt:75)");
            }
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7168getExtraSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m6961ChatSubscriptionCardActionww6aTOc(null, onBackClick, R.drawable.ic_close, 0L, startRestartGroup, (i3 << 3) & 112, 9);
            ChatSubscriptionChatName(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), chatName, startRestartGroup, i3 & 112, 0);
            ChatSubscriptionBadge(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, 0, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new ChatSubscriptionCommonKt$ChatSubscriptionBenefitsHeader$2(onBackClick, chatName, i));
    }

    public static final void ChatSubscriptionChatName(Modifier modifier, String chatName, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        TextStyle m5100copyv2rsoow;
        Composer composer2;
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Composer startRestartGroup = composer.startRestartGroup(2058402181);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSubscriptionChatName)P(1)");
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
            i3 |= startRestartGroup.changed(chatName) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 91) != 18 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.Companion : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2058402181, i5, -1, "com.ifriend.presentation.features.purchases.chatsubscription.common.ChatSubscriptionChatName (ChatSubscriptionCommon.kt:102)");
            }
            long m7100getLight0d7_KjU = AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7100getLight0d7_KjU();
            m5100copyv2rsoow = r26.m5100copyv2rsoow((r48 & 1) != 0 ? r26.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r26.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(20), (r48 & 4) != 0 ? r26.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r26.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r26.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r26.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r26.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r26.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r26.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r26.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r26.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r26.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r26.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r26.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r26.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r26.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r26.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r26.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r26.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r26.platformStyle : null, (r48 & 1048576) != 0 ? r26.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r26.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r26.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemSemiBold().paragraphStyle.getTextMotion() : null);
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(chatName, companion, m7100getLight0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m5100copyv2rsoow, composer2, ((i5 >> 3) & 14) | ((i5 << 3) & 112), 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            obj = companion;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatSubscriptionCommonKt$ChatSubscriptionChatName$1(obj, chatName, i, i2));
    }

    public static final void ChatSubscriptionBadge(Modifier modifier, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        TextStyle m5100copyv2rsoow;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1576774592);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSubscriptionBadge)");
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
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.Companion : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1576774592, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.common.ChatSubscriptionBadge (ChatSubscriptionCommon.kt:112)");
            }
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(BackgroundKt.m420backgroundbw27NRU(companion, AppColors.Companion.m7142getViolet0d7_KjU(), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(5))), 0.0f, Dp.m5607constructorimpl(4), 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 2, null);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
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
            String stringResource = StringResources_androidKt.stringResource(com.ifriend.presentation.R.string.buy_subscriotion__sub_badge, startRestartGroup, 0);
            long m7100getLight0d7_KjU = AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7100getLight0d7_KjU();
            Modifier modifier2 = companion;
            m5100copyv2rsoow = r29.m5100copyv2rsoow((r48 & 1) != 0 ? r29.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r29.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (r48 & 4) != 0 ? r29.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r29.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r29.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r29.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r29.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r29.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r29.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r29.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r29.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r29.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r29.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r29.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r29.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r29.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r29.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r29.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r29.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r29.platformStyle : null, (r48 & 1048576) != 0 ? r29.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r29.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r29.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemSemiBold().paragraphStyle.getTextMotion() : null);
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(stringResource, (Modifier) null, m7100getLight0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m5100copyv2rsoow, startRestartGroup, 0, 0, 65530);
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
        endRestartGroup.updateScope(new ChatSubscriptionCommonKt$ChatSubscriptionBadge$2(obj, i, i2));
    }
}
