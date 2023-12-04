package com.ifriend.presentation.features.chat.screen.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.photo.ui.ChatPhotoUiState;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatScreenContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatScreenContentKt$ChatPopups$8 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppFlowCoordinator $flowCoordinator;
    final /* synthetic */ ChatTopicsUiState $panelState;
    final /* synthetic */ ChatPhotoUiState $photoState;
    final /* synthetic */ ChatViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenContentKt$ChatPopups$8(ChatViewModel chatViewModel, ChatTopicsUiState chatTopicsUiState, ChatPhotoUiState chatPhotoUiState, AppFlowCoordinator appFlowCoordinator, int i) {
        super(2);
        this.$viewModel = chatViewModel;
        this.$panelState = chatTopicsUiState;
        this.$photoState = chatPhotoUiState;
        this.$flowCoordinator = appFlowCoordinator;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatScreenContentKt.ChatPopups(this.$viewModel, this.$panelState, this.$photoState, this.$flowCoordinator, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
