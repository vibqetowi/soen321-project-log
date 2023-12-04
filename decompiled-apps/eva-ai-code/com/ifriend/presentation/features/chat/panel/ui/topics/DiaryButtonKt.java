package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chat.panel.models.ChatDiaryUi;
import com.ifriend.ui.components.brush.LinearGradientKt;
import com.ifriend.ui.components.buttons.NeomorphicButtonsKt;
import com.ifriend.ui.components.shadow.ColoredShadowKt;
import com.ifriend.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryButton.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00030\u0007j\u0002`\bH\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"gradient", "Landroidx/compose/ui/graphics/Brush;", "ChatDiaryButton", "", "topic", "Lcom/ifriend/presentation/features/chat/panel/models/ChatDiaryUi;", "onTopicClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Lcom/ifriend/presentation/features/chat/panel/models/ChatDiaryUi;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryButtonKt {
    private static final Brush gradient = LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.Color(4288976880L)), Color.m3281boximpl(ColorKt.Color(4284640478L))}), null, 0, 315.0f, false, 22, null);

    public static final void ChatDiaryButton(ChatDiaryUi topic, Function0<Unit> onTopicClick, Composer composer, int i) {
        int i2;
        Modifier m7067coloredShadowPRYyx80;
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(onTopicClick, "onTopicClick");
        Composer startRestartGroup = composer.startRestartGroup(17966920);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatDiaryButton)P(1)");
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
                ComposerKt.traceEventStart(17966920, i2, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.ChatDiaryButton (DiaryButton.kt:46)");
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
            float f = 8;
            float f2 = 36;
            NeomorphicButtonsKt.m7030NeomorphicButtonrNcnHrQ(onTopicClick, SizeKt.m781height3ABfNKs(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m5607constructorimpl(f2)), Dp.m5607constructorimpl(18), false, gradient, Color.Companion.m3327getUnspecified0d7_KjU(), Dp.m5607constructorimpl(-4), ComposableSingletons$DiaryButtonKt.INSTANCE.m6919getLambda1$presentation_release(), startRestartGroup, ((i2 >> 3) & 14) | 14377392, 8);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_diary, startRestartGroup, 0), "", SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart()), Dp.m5607constructorimpl(f2)), Dp.m5607constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            startRestartGroup.startReplaceableGroup(1037842119);
            if (topic.getHasNotifications()) {
                m7067coloredShadowPRYyx80 = ColoredShadowKt.m7067coloredShadowPRYyx80(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopEnd()), AppColors.Companion.m7136getNotificationWhiteShadowColor0d7_KjU(), (r17 & 2) != 0 ? 0.2f : 0.9f, Dp.m5607constructorimpl(5), Dp.m5607constructorimpl(f), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
                SpacerKt.Spacer(SizeKt.m795size3ABfNKs(BackgroundKt.m420backgroundbw27NRU(m7067coloredShadowPRYyx80, AppColors.Companion.m7135getNotificationGreenColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m5607constructorimpl(10)), startRestartGroup, 0);
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
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DiaryButtonKt$ChatDiaryButton$2(topic, onTopicClick, i));
    }
}
