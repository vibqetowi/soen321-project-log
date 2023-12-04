package com.ifriend.presentation.features.chat.screen.view;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import coil.ImageLoader;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks;
import com.ifriend.presentation.features.chat.input.view.ChatInputContentKt;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import com.ifriend.presentation.features.chat.intro.view.ChatIntroPopupKt;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.panel.ui.ChatPanelActionsContentKt;
import com.ifriend.presentation.features.chat.panel.ui.topics.PremiumTopicPopupContentKt;
import com.ifriend.presentation.features.chat.photo.ui.ChatPhotoUiState;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import com.ifriend.presentation.features.profile.menu.view.ProfileMenuContentKt;
import com.ifriend.presentation.features.profile.menu.view.ProfileMenuNavigator;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.features.photo.PhotoModalPopupKt;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.AppThemeKt;
import com.ifriend.ui.utils.UIUtilsKt;
import com.ifriend.ui.utils.extensions.ContextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: ChatScreenContent.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"ChatInputWithPanel", "", "viewModel", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "panelState", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "showAllowMicrophoneDialog", "Lkotlin/Function0;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChatPopups", "photoState", "Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;", "flowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;Lcom/ifriend/presentation/navigation/AppFlowCoordinator;Landroidx/compose/runtime/Composer;I)V", "ChatScreenContent", "imageLoader", "Lcoil/ImageLoader;", "showSendImageDialog", "(Lcoil/ImageLoader;Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/navigation/AppFlowCoordinator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CollectEventsEffect", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/navigation/AppFlowCoordinator;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "presentation_release", "state", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "giftsState", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "influencerIntroState", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "menuState", "Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;", "inputState", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatScreenContentKt {
    public static final void ChatScreenContent(ImageLoader imageLoader, ChatViewModel viewModel, AppFlowCoordinator flowCoordinator, Function0<Unit> showSendImageDialog, Function0<Unit> showAllowMicrophoneDialog, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(showSendImageDialog, "showSendImageDialog");
        Intrinsics.checkNotNullParameter(showAllowMicrophoneDialog, "showAllowMicrophoneDialog");
        Composer startRestartGroup = composer.startRestartGroup(-913272191);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatScreenContent)P(1,4!1,3)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-913272191, i, -1, "com.ifriend.presentation.features.chat.screen.view.ChatScreenContent (ChatScreenContent.kt:55)");
        }
        AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 383458920, true, new ChatScreenContentKt$ChatScreenContent$1(imageLoader, viewModel, flowCoordinator, i, showSendImageDialog, showAllowMicrophoneDialog)), startRestartGroup, 24576, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatScreenContentKt$ChatScreenContent$2(imageLoader, viewModel, flowCoordinator, showSendImageDialog, showAllowMicrophoneDialog, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatPopups(ChatViewModel chatViewModel, ChatTopicsUiState chatTopicsUiState, ChatPhotoUiState chatPhotoUiState, AppFlowCoordinator appFlowCoordinator, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(476466093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(476466093, i, -1, "com.ifriend.presentation.features.chat.screen.view.ChatPopups (ChatScreenContent.kt:112)");
        }
        PhotoModalPopupKt.PhotoModalPopup(chatPhotoUiState.isVisible(), chatPhotoUiState.getImageUrl(), new ChatScreenContentKt$ChatPopups$1(chatViewModel), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(92232837);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberAction)");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        ChatScreenContentKt$ChatPopups$$inlined$rememberAction$1 rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ChatScreenContentKt$ChatPopups$$inlined$rememberAction$1(chatViewModel);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Function0 function0 = (Function0) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1931250217);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberFunction)");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        ChatScreenContentKt$ChatPopups$$inlined$rememberFunction$1 rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ChatScreenContentKt$ChatPopups$$inlined$rememberFunction$1(chatViewModel);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        PremiumTopicPopupContentKt.PremiumTopicPopupContent(chatTopicsUiState, function0, (Function1) rememberedValue2, startRestartGroup, (i >> 3) & 14);
        ChatIntroPopupKt.ChatIntroPopup(ChatPopups$lambda$2(FlowExtKt.collectAsStateWithLifecycle(chatViewModel.getChatIntroState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 8, 7)), new ChatScreenContentKt$ChatPopups$4(chatViewModel), new ChatScreenContentKt$ChatPopups$5(chatViewModel), startRestartGroup, 0);
        ProfileMenuUiState ChatPopups$lambda$3 = ChatPopups$lambda$3(FlowExtKt.collectAsStateWithLifecycle(chatViewModel.getProfileMenuState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 8, 7));
        ChatScreenContentKt$ChatPopups$6 chatScreenContentKt$ChatPopups$6 = new ChatScreenContentKt$ChatPopups$6(chatViewModel);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new ProfileMenuNavigator(new ChatScreenContentKt$ChatPopups$7$1(appFlowCoordinator), new ChatScreenContentKt$ChatPopups$7$2(appFlowCoordinator), new ChatScreenContentKt$ChatPopups$7$3(appFlowCoordinator), new ChatScreenContentKt$ChatPopups$7$4(chatViewModel), new ChatScreenContentKt$ChatPopups$7$5(chatViewModel));
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        ProfileMenuContentKt.m6951ProfileMenuContentjA1GFJw(ChatPopups$lambda$3, chatScreenContentKt$ChatPopups$6, (ProfileMenuNavigator) rememberedValue3, 0L, 0L, startRestartGroup, 384, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatScreenContentKt$ChatPopups$8(chatViewModel, chatTopicsUiState, chatPhotoUiState, appFlowCoordinator, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatInputWithPanel(ChatViewModel chatViewModel, ChatTopicsUiState chatTopicsUiState, FocusRequester focusRequester, Function0<Unit> function0, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1367532178);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1367532178, i, -1, "com.ifriend.presentation.features.chat.screen.view.ChatInputWithPanel (ChatScreenContent.kt:157)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        long m3290copywmQWz5c$default = Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        RoundedCornerShape extraLarge = AppTheme.INSTANCE.getShapes(startRestartGroup, AppTheme.$stable).getExtraLarge();
        RoundedCornerShape roundedCornerShape = extraLarge;
        Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(fillMaxWidth$default, m3290copywmQWz5c$default, CornerBasedShape.copy$default(roundedCornerShape, null, null, CornerSizeKt.CornerSize(0), CornerSizeKt.CornerSize(0), 3, null));
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m420backgroundbw27NRU);
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
        Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null)));
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(navigationBarsPadding);
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
        Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ChatInputState ChatInputWithPanel$lambda$8$lambda$7$lambda$5 = ChatInputWithPanel$lambda$8$lambda$7$lambda$5(FlowExtKt.collectAsStateWithLifecycle(chatViewModel.getChatInputState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 8, 7));
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            ChatInputCallbacks chatInputCallbacks = new ChatInputCallbacks(new ChatScreenContentKt$ChatInputWithPanel$1$1$1$5(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$1(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$6(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$7(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$8(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$9(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$2(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$3(chatViewModel), new ChatScreenContentKt$ChatInputWithPanel$1$1$1$4(chatViewModel), function0);
            startRestartGroup.updateRememberedValue(chatInputCallbacks);
            rememberedValue = chatInputCallbacks;
        }
        startRestartGroup.endReplaceableGroup();
        ChatInputContentKt.ChatInputContent(ChatInputWithPanel$lambda$8$lambda$7$lambda$5, (ChatInputCallbacks) rememberedValue, focusRequester, startRestartGroup, (i & 896) | 48, 0);
        ChatPanelActionsContentKt.ChatPanelActionsContent(chatTopicsUiState, new ChatScreenContentKt$ChatInputWithPanel$1$1$2(chatViewModel), startRestartGroup, (i >> 3) & 14);
        SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM()), startRestartGroup, 0);
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
        endRestartGroup.updateScope(new ChatScreenContentKt$ChatInputWithPanel$2(chatViewModel, chatTopicsUiState, focusRequester, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CollectEventsEffect(final ChatViewModel chatViewModel, final AppFlowCoordinator appFlowCoordinator, final Function0<Unit> function0, final FocusRequester focusRequester, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1841434294);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1841434294, i, -1, "com.ifriend.presentation.features.chat.screen.view.CollectEventsEffect (ChatScreenContent.kt:226)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        final SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(startRestartGroup, LocalSoftwareKeyboardController.$stable);
        UiStateDelegateExKt.CollectEventEffect(chatViewModel, new Object[0], null, null, new FlowCollector<ChatViewModel.Event>() { // from class: com.ifriend.presentation.features.chat.screen.view.ChatScreenContentKt$CollectEventsEffect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(ChatViewModel.Event event, Continuation continuation) {
                return emit2(event, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: emit  reason: avoid collision after fix types in other method */
            public final Object emit2(ChatViewModel.Event event, Continuation<? super Unit> continuation) {
                if (event instanceof ChatViewModel.Event.NavigateBackToHome) {
                    AppFlowCoordinator.this.backHome();
                } else if (event instanceof ChatViewModel.Event.NavigateCloseApp) {
                    AppFlowCoordinator.this.exit();
                } else if (event instanceof ChatViewModel.Event.OpenBotProfile) {
                    AppFlowCoordinator.this.goToBotProfile();
                } else if (event instanceof ChatViewModel.Event.OpenSelectGeneratedAvatar) {
                    AppFlowCoordinator.this.goToSelectGeneratedAvatar();
                } else if (event instanceof ChatViewModel.Event.OpenGenerateAvatar) {
                    AppFlowCoordinator.this.goToGenerateAvatar();
                } else if (event instanceof ChatViewModel.Event.OpenDiary) {
                    AppFlowCoordinator.this.goToDiary(((ChatViewModel.Event.OpenDiary) event).getNodeId());
                } else if (event instanceof ChatViewModel.Event.OpenChat) {
                    AppFlowCoordinator.DefaultImpls.goToChat$default(AppFlowCoordinator.this, ((ChatViewModel.Event.OpenChat) event).getChatId(), false, true, 2, null);
                } else if (event instanceof ChatViewModel.Event.OpenTakePhotoAlert) {
                    function0.invoke();
                } else if (event instanceof ChatViewModel.Event.OpenChatSettings) {
                    AppFlowCoordinator.this.goToChatSettings(((ChatViewModel.Event.OpenChatSettings) event).getChatId());
                } else if (event instanceof ChatViewModel.Event.OpenLink) {
                    ContextKt.openLink(context, ((ChatViewModel.Event.OpenLink) event).getLink());
                } else if (event instanceof ChatViewModel.Event.OpenAppMarket) {
                    UIUtilsKt.openAppOnMarket(context);
                } else if (event instanceof ChatViewModel.Event.ShowKeyboard) {
                    try {
                        focusRequester.requestFocus();
                        SoftwareKeyboardController softwareKeyboardController = current;
                        if (softwareKeyboardController != null) {
                            softwareKeyboardController.show();
                        }
                    } catch (Throwable th) {
                        chatViewModel.logFocusRequesterThrowable(th);
                    }
                }
                return Unit.INSTANCE;
            }
        }, startRestartGroup, 72, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatScreenContentKt$CollectEventsEffect$2(chatViewModel, appFlowCoordinator, function0, focusRequester, i));
    }

    private static final ChatIntroUiState ChatPopups$lambda$2(State<ChatIntroUiState> state) {
        return state.getValue();
    }

    private static final ProfileMenuUiState ChatPopups$lambda$3(State<ProfileMenuUiState> state) {
        return state.getValue();
    }

    private static final ChatInputState ChatInputWithPanel$lambda$8$lambda$7$lambda$5(State<ChatInputState> state) {
        return state.getValue();
    }
}
