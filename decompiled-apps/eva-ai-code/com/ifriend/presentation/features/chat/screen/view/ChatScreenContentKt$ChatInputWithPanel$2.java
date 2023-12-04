package com.ifriend.presentation.features.chat.screen.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatScreenContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatScreenContentKt$ChatInputWithPanel$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ChatTopicsUiState $panelState;
    final /* synthetic */ Function0<Unit> $showAllowMicrophoneDialog;
    final /* synthetic */ ChatViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenContentKt$ChatInputWithPanel$2(ChatViewModel chatViewModel, ChatTopicsUiState chatTopicsUiState, FocusRequester focusRequester, Function0<Unit> function0, int i) {
        super(2);
        this.$viewModel = chatViewModel;
        this.$panelState = chatTopicsUiState;
        this.$focusRequester = focusRequester;
        this.$showAllowMicrophoneDialog = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatScreenContentKt.ChatInputWithPanel(this.$viewModel, this.$panelState, this.$focusRequester, this.$showAllowMicrophoneDialog, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
