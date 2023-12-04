package com.ifriend.presentation.features.profile.header.view;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.ImageLoader;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.ui.components.buttons.NeomorphicButtonsKt;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatHeaderContent.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a)\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00040\u0014j\u0002`\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u001b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"unreadIndicatorColor", "Landroidx/compose/ui/graphics/Color;", "J", "ChatHeaderPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "ChatScreenHeaderContent", "state", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "modifier", "Landroidx/compose/ui/Modifier;", "clicks", "Lcom/ifriend/presentation/features/profile/header/view/ChatHeaderClicks;", "(Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;Landroidx/compose/ui/Modifier;Lcom/ifriend/presentation/features/profile/header/view/ChatHeaderClicks;Landroidx/compose/runtime/Composer;II)V", "CircleIndicator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "NeuronsTitle", "balance", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UnreadIndicator", "isVisible", "", "countLabel", "(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatHeaderContentKt {
    private static final long unreadIndicatorColor = ColorKt.Color(4286998514L);

    public static final void ChatScreenHeaderContent(ChatHeaderUiState state, Modifier modifier, ChatHeaderClicks chatHeaderClicks, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-1242768561);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatScreenHeaderContent)P(2,1)");
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.Companion : modifier;
        ChatHeaderClicks chatHeaderClicks2 = (i2 & 4) != 0 ? new ChatHeaderClicks(null, null, null, null, null, null, null, null, 255, null) : chatHeaderClicks;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1242768561, i, -1, "com.ifriend.presentation.features.profile.header.view.ChatScreenHeaderContent (ChatHeaderContent.kt:68)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        ChatHeaderClicks chatHeaderClicks3 = chatHeaderClicks2;
        Modifier modifier2 = companion;
        com.ifriend.ui.features.chat.ChatHeaderContentKt.ChatHeaderContent(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), state.getAnimatedAvatarState(), state.getTitle(), state.getLvlLabel(), state.getLvlProgress(), state.isVisibleLvlProgress(), state.isVisibleUpdateIndicator(), state.isVisibleVerified(), state.isVisibleBackButton(), state.isVisibleUnreadIndicator(), state.getUnreadMessagesLabel(), chatHeaderClicks2.getOnTitleClick(), chatHeaderClicks3.getOnAvatarClick(), chatHeaderClicks3.getOnGenerationClick(), chatHeaderClicks3.getOnPlayClick(), chatHeaderClicks3.getOnPauseClick(), chatHeaderClicks2.getOnBackClick(), null, startRestartGroup, 64, 0, 131072);
        NeuronsTitle(state.getBalanceLabel(), chatHeaderClicks3.getOnNeuronsClick(), startRestartGroup, 0);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, state.isVisibleMenuButton(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -10308461, true, new ChatHeaderContentKt$ChatScreenHeaderContent$1$1(chatHeaderClicks3, rowScopeInstance, state, 6)), startRestartGroup, 1572870, 30);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatHeaderContentKt$ChatScreenHeaderContent$2(state, modifier2, chatHeaderClicks3, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NeuronsTitle(String str, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(616382035);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(616382035, i2, -1, "com.ifriend.presentation.features.profile.header.view.NeuronsTitle (ChatHeaderContent.kt:127)");
            }
            NeomorphicButtonsKt.m7030NeomorphicButtonrNcnHrQ(function0, PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 11, null), 0.0f, false, null, 0L, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 2081793068, true, new ChatHeaderContentKt$NeuronsTitle$1(str, i2)), startRestartGroup, ((i2 >> 3) & 14) | 12582912, 124);
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
        endRestartGroup.updateScope(new ChatHeaderContentKt$NeuronsTitle$2(str, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleIndicator(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-361752188);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361752188, i, -1, "com.ifriend.presentation.features.profile.header.view.CircleIndicator (ChatHeaderContent.kt:158)");
            }
            SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(modifier, AppColors.Companion.m7140getRedIndicatorColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
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
        endRestartGroup.updateScope(new ChatHeaderContentKt$CircleIndicator$1(modifier, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnreadIndicator(boolean z, String str, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1199461415);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1199461415, i2, -1, "com.ifriend.presentation.features.profile.header.view.UnreadIndicator (ChatHeaderContent.kt:172)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -292685057, true, new ChatHeaderContentKt$UnreadIndicator$1(str, i2)), startRestartGroup, (i2 & 14) | 200064, 18);
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
        endRestartGroup.updateScope(new ChatHeaderContentKt$UnreadIndicator$2(z, str, i));
    }

    public static final void ChatHeaderPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-155595521);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatHeaderPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-155595521, i, -1, "com.ifriend.presentation.features.profile.header.view.ChatHeaderPreview (ChatHeaderContent.kt:202)");
            }
            ProvidableCompositionLocal<ImageLoader> localAppImageLoaderProvider = AppLocalProviderKt.getLocalAppImageLoaderProvider();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{localAppImageLoaderProvider.provides(new ImageLoader.Builder((Context) consume).crossfade(true).build())}, ComposableSingletons$ChatHeaderContentKt.INSTANCE.m6947getLambda2$presentation_release(), startRestartGroup, 56);
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
        endRestartGroup.updateScope(new ChatHeaderContentKt$ChatHeaderPreview$1(i));
    }
}
