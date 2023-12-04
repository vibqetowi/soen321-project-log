package com.ifriend.presentation.features.home.ui.messages;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.presentation.features.home.ui.models.HomeLastChatMessageUi;
import com.ifriend.ui.components.shadow.SextingShadowContainerKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeChatMessageContent.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004¨\u0006\f"}, d2 = {"HomeChatBlurMessageContent", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Text;", "(Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Text;Landroidx/compose/runtime/Composer;I)V", "HomeChatMediaMessageContent", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Media;", "(Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Media;Landroidx/compose/runtime/Composer;I)V", "HomeChatMessageContent", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;", "(Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;Landroidx/compose/runtime/Composer;I)V", "HomeChatTextMessageContent", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeChatMessageContentKt {
    public static final void HomeChatMessageContent(HomeLastChatMessageUi message, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer startRestartGroup = composer.startRestartGroup(-1783039612);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(message) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783039612, i, -1, "com.ifriend.presentation.features.home.ui.messages.HomeChatMessageContent (HomeChatMessageContent.kt:22)");
            }
            if (message instanceof HomeLastChatMessageUi.Text) {
                startRestartGroup.startReplaceableGroup(1519962578);
                HomeLastChatMessageUi.Text text = (HomeLastChatMessageUi.Text) message;
                if (text.isAvailable()) {
                    startRestartGroup.startReplaceableGroup(1519962617);
                    HomeChatBlurMessageContent(text, startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(1519962690);
                    HomeChatTextMessageContent(text, startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                }
                startRestartGroup.endReplaceableGroup();
            } else if (message instanceof HomeLastChatMessageUi.Media) {
                startRestartGroup.startReplaceableGroup(1519962811);
                HomeChatMediaMessageContent((HomeLastChatMessageUi.Media) message, startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(1519962853);
                startRestartGroup.endReplaceableGroup();
            }
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
        endRestartGroup.updateScope(new HomeChatMessageContentKt$HomeChatMessageContent$1(message, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeChatTextMessageContent(HomeLastChatMessageUi.Text text, Composer composer, int i) {
        int i2;
        long m7108getTextPrimary0d7_KjU;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-601902160);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601902160, i, -1, "com.ifriend.presentation.features.home.ui.messages.HomeChatTextMessageContent (HomeChatMessageContent.kt:37)");
            }
            String text2 = text.getText();
            if (text.isActiveMessage()) {
                startRestartGroup.startReplaceableGroup(-525875926);
                m7108getTextPrimary0d7_KjU = Color.m3290copywmQWz5c$default(AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-525875851);
                m7108getTextPrimary0d7_KjU = AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU();
                startRestartGroup.endReplaceableGroup();
            }
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(text2, (Modifier) null, m7108getTextPrimary0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5517getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getDescriptionItem(), composer2, 0, 3120, 55290);
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
        endRestartGroup.updateScope(new HomeChatMessageContentKt$HomeChatTextMessageContent$1(text, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeChatMediaMessageContent(HomeLastChatMessageUi.Media media, Composer composer, int i) {
        int i2;
        long m7108getTextPrimary0d7_KjU;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1214073548);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(media) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214073548, i, -1, "com.ifriend.presentation.features.home.ui.messages.HomeChatMediaMessageContent (HomeChatMessageContent.kt:52)");
            }
            if (media.isActiveMessage()) {
                startRestartGroup.startReplaceableGroup(-596425224);
                m7108getTextPrimary0d7_KjU = Color.m3290copywmQWz5c$default(AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-596425157);
                m7108getTextPrimary0d7_KjU = AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU();
                startRestartGroup.endReplaceableGroup();
            }
            long j = m7108getTextPrimary0d7_KjU;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(media.getTitle(), (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getDescriptionItem(), composer2, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer2, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM()), composer2, 0);
            IconKt.m1829Iconww6aTOc(media.getMedia(), (String) null, SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(12)), j, composer2, 432, 0);
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
        endRestartGroup.updateScope(new HomeChatMessageContentKt$HomeChatMediaMessageContent$2(media, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeChatBlurMessageContent(HomeLastChatMessageUi.Text text, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-896124566);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896124566, i, -1, "com.ifriend.presentation.features.home.ui.messages.HomeChatBlurMessageContent (HomeChatMessageContent.kt:77)");
            }
            SextingShadowContainerKt.SextingShadowContainer(SizeKt.m783heightInVpY3zN4$default(SizeKt.m802widthInVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5607constructorimpl(80), 1, null), 0.0f, Dp.m5607constructorimpl(25), 1, null), false, ComposableLambdaKt.composableLambda(startRestartGroup, -1645092265, true, new HomeChatMessageContentKt$HomeChatBlurMessageContent$1(text)), startRestartGroup, 390, 2);
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
        endRestartGroup.updateScope(new HomeChatMessageContentKt$HomeChatBlurMessageContent$2(text, i));
    }
}
