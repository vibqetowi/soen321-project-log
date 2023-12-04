package com.ifriend.presentation.features.chat.actions.ui.topics;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.features.chat.panel.models.ChatCallUi;
import com.ifriend.ui.R;
import com.ifriend.ui.components.buttons.ButtonWidgetsKt;
import com.ifriend.ui.components.shadow.ColoredShadowKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppIcons;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.icons.calls.IconCallKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatCallButtom.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"ChatCallButton", "", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/panel/models/ChatCallUi;", "onTopicClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Lcom/ifriend/presentation/features/chat/panel/models/ChatCallUi;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallButtomKt {
    public static final void ChatCallButton(ChatCallUi action, Function0<Unit> onTopicClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier m7067coloredShadowPRYyx80;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onTopicClick, "onTopicClick");
        Composer startRestartGroup = composer.startRestartGroup(-242811589);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatCallButton)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(action) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onTopicClick) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-242811589, i2, -1, "com.ifriend.presentation.features.chat.actions.ui.topics.ChatCallButton (ChatCallButtom.kt:34)");
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
            float f = 10;
            composer2 = startRestartGroup;
            ButtonWidgetsKt.m7022AppShadowButtonWithContentBHesuOE(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m5607constructorimpl(36), Dp.m5607constructorimpl(75), Dp.m5607constructorimpl(22), AppColors.Companion.m7143getVioletDark0d7_KjU(), !action.isLoading(), onTopicClick, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7104getLight50d7_KjU(), ComposableLambdaKt.composableLambda(startRestartGroup, -51216279, true, new ChatCallButtomKt$ChatCallButton$1$1(action)), startRestartGroup, ((i2 << 15) & 3670016) | 100691382, 0);
            Modifier align = boxScopeInstance.align(SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(30)), Alignment.Companion.getCenterStart());
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_call_bg, composer2, 0), "", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            IconKt.m1829Iconww6aTOc(IconCallKt.getIconCall(AppIcons.INSTANCE), "", BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), AppTheme.INSTANCE.getColors(composer2, AppTheme.$stable).m7100getLight0d7_KjU(), composer2, 48, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            m7067coloredShadowPRYyx80 = ColoredShadowKt.m7067coloredShadowPRYyx80(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopEnd()), AppColors.Companion.m7136getNotificationWhiteShadowColor0d7_KjU(), (r17 & 2) != 0 ? 0.2f : 0.9f, Dp.m5607constructorimpl(5), Dp.m5607constructorimpl(8), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
            SpacerKt.Spacer(SizeKt.m795size3ABfNKs(BackgroundKt.m420backgroundbw27NRU(m7067coloredShadowPRYyx80, AppColors.Companion.m7135getNotificationGreenColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m5607constructorimpl(f)), composer2, 0);
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
        endRestartGroup.updateScope(new ChatCallButtomKt$ChatCallButton$2(action, onTopicClick, i));
    }
}
