package com.ifriend.presentation.features.chat.screen.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import coil.ImageLoader;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import com.ifriend.presentation.features.chat.gifts.view.ChatGiftsContentKt;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.photo.ui.ChatPhotoUiState;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.components.progress.IndeterminateProgressKt;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatScreenContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatScreenContentKt$ChatScreenContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ AppFlowCoordinator $flowCoordinator;
    final /* synthetic */ ImageLoader $imageLoader;
    final /* synthetic */ Function0<Unit> $showAllowMicrophoneDialog;
    final /* synthetic */ Function0<Unit> $showSendImageDialog;
    final /* synthetic */ ChatViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenContentKt$ChatScreenContent$1(ImageLoader imageLoader, ChatViewModel chatViewModel, AppFlowCoordinator appFlowCoordinator, int i, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$imageLoader = imageLoader;
        this.$viewModel = chatViewModel;
        this.$flowCoordinator = appFlowCoordinator;
        this.$$dirty = i;
        this.$showSendImageDialog = function0;
        this.$showAllowMicrophoneDialog = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(383458920, i, -1, "com.ifriend.presentation.features.chat.screen.view.ChatScreenContent.<anonymous> (ChatScreenContent.kt:56)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppLocalProviderKt.getLocalAppImageLoaderProvider().provides(this.$imageLoader)}, ComposableLambdaKt.composableLambda(composer, -922394200, true, new AnonymousClass1(this.$viewModel, this.$flowCoordinator, this.$$dirty, this.$showSendImageDialog, this.$showAllowMicrophoneDialog)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatScreenContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.screen.view.ChatScreenContentKt$ChatScreenContent$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ AppFlowCoordinator $flowCoordinator;
        final /* synthetic */ Function0<Unit> $showAllowMicrophoneDialog;
        final /* synthetic */ Function0<Unit> $showSendImageDialog;
        final /* synthetic */ ChatViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatViewModel chatViewModel, AppFlowCoordinator appFlowCoordinator, int i, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$viewModel = chatViewModel;
            this.$flowCoordinator = appFlowCoordinator;
            this.$$dirty = i;
            this.$showSendImageDialog = function0;
            this.$showAllowMicrophoneDialog = function02;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-922394200, i, -1, "com.ifriend.presentation.features.chat.screen.view.ChatScreenContent.<anonymous>.<anonymous> (ChatScreenContent.kt:60)");
            }
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            State collectUiState = UiStateDelegateExKt.collectUiState(this.$viewModel, null, composer, 8, 1);
            State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.$viewModel.getPanelActionsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(this.$viewModel.getPhotoModalState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            composer.startReplaceableGroup(1626123342);
            if (invoke$lambda$1(collectUiState).isLoading() || invoke$lambda$3(collectAsStateWithLifecycle2).isLoading()) {
                IndeterminateProgressKt.IndeterminateProgressDialog(null, null, composer, 0, 3);
            }
            composer.endReplaceableGroup();
            ChatScreenContentKt.ChatPopups(this.$viewModel, invoke$lambda$2(collectAsStateWithLifecycle), invoke$lambda$3(collectAsStateWithLifecycle2), this.$flowCoordinator, composer, ((this.$$dirty << 3) & 7168) | 8);
            ChatViewModel chatViewModel = this.$viewModel;
            Function0<Unit> function0 = this.$showAllowMicrophoneDialog;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChatGiftsContentKt.ChatGiftsContent(invoke$lambda$5$lambda$4(FlowExtKt.collectAsStateWithLifecycle(chatViewModel.getChatGiftsUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), new ChatScreenContentKt$ChatScreenContent$1$1$1$1(chatViewModel), new ChatScreenContentKt$ChatScreenContent$1$1$1$2(chatViewModel), composer, 0);
            ChatScreenContentKt.ChatInputWithPanel(chatViewModel, invoke$lambda$2(collectAsStateWithLifecycle), focusRequester, function0, composer, ((i2 >> 3) & 7168) | 392);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ChatViewModel chatViewModel2 = this.$viewModel;
            AppFlowCoordinator appFlowCoordinator = this.$flowCoordinator;
            Function0<Unit> function02 = this.$showSendImageDialog;
            int i3 = this.$$dirty;
            ChatScreenContentKt.CollectEventsEffect(chatViewModel2, appFlowCoordinator, function02, focusRequester, composer, ((i3 >> 3) & 112) | 3080 | ((i3 >> 3) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        private static final ChatViewModel.UiState invoke$lambda$1(State<ChatViewModel.UiState> state) {
            return state.getValue();
        }

        private static final ChatTopicsUiState invoke$lambda$2(State<ChatTopicsUiState> state) {
            return state.getValue();
        }

        private static final ChatPhotoUiState invoke$lambda$3(State<ChatPhotoUiState> state) {
            return state.getValue();
        }

        private static final ChatGiftsUiState invoke$lambda$5$lambda$4(State<ChatGiftsUiState> state) {
            return state.getValue();
        }
    }
}
