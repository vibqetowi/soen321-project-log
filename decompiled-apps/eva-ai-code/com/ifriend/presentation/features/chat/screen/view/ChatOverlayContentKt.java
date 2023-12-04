package com.ifriend.presentation.features.chat.screen.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import com.ifriend.presentation.features.chat.gifts.view.ChatGiftsActionContentKt;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import com.ifriend.presentation.features.chat.notifications.view.ChatNotificationsContentKt;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: ChatOverlayContent.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002"}, d2 = {"ChatOverlayContent", "", "viewModel", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Landroidx/compose/runtime/Composer;I)V", "presentation_release", "state", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "giftsUiState", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "chatNotificationsState", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatOverlayContentKt {
    public static final void ChatOverlayContent(ChatViewModel viewModel, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-42248516);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatOverlayContent)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-42248516, i, -1, "com.ifriend.presentation.features.chat.screen.view.ChatOverlayContent (ChatOverlayContent.kt:23)");
        }
        State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 8, 7);
        State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(viewModel.getChatGiftsUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 8, 7);
        State collectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(viewModel.getChatNotifications(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 8, 7);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, ChatOverlayContent$lambda$0(collectAsStateWithLifecycle).isShowSubscriptionState(), SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1977445770, true, new ChatOverlayContentKt$ChatOverlayContent$1$1(columnScopeInstance, collectAsStateWithLifecycle, viewModel)), startRestartGroup, 1573254, 28);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        ChatGiftsActionContentKt.ChatGiftsActionContent(BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getTopEnd()), ChatOverlayContent$lambda$1(collectAsStateWithLifecycle2), new ChatOverlayContentKt$ChatOverlayContent$1$2$1(viewModel), startRestartGroup, 0, 0);
        Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null);
        ChatNotificationsContentKt.ChatNotificationsContent(ChatOverlayContent$lambda$2(collectAsStateWithLifecycle3), new ChatOverlayContentKt$ChatOverlayContent$1$2$2(viewModel), new ChatOverlayContentKt$ChatOverlayContent$1$2$3(viewModel), m750paddingVpY3zN4$default, startRestartGroup, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new ChatOverlayContentKt$ChatOverlayContent$2(viewModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatViewModel.UiState ChatOverlayContent$lambda$0(State<ChatViewModel.UiState> state) {
        return state.getValue();
    }

    private static final ChatGiftsUiState ChatOverlayContent$lambda$1(State<ChatGiftsUiState> state) {
        return state.getValue();
    }

    private static final PersistentList<ChatNotificationUi> ChatOverlayContent$lambda$2(State<? extends PersistentList<ChatNotificationUi>> state) {
        return state.getValue();
    }
}
