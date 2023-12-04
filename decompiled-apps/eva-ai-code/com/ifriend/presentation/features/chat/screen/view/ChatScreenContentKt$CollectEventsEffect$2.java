package com.ifriend.presentation.features.chat.screen.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatScreenContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatScreenContentKt$CollectEventsEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppFlowCoordinator $flowCoordinator;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ Function0<Unit> $showSendImageDialog;
    final /* synthetic */ ChatViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenContentKt$CollectEventsEffect$2(ChatViewModel chatViewModel, AppFlowCoordinator appFlowCoordinator, Function0<Unit> function0, FocusRequester focusRequester, int i) {
        super(2);
        this.$viewModel = chatViewModel;
        this.$flowCoordinator = appFlowCoordinator;
        this.$showSendImageDialog = function0;
        this.$focusRequester = focusRequester;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatScreenContentKt.CollectEventsEffect(this.$viewModel, this.$flowCoordinator, this.$showSendImageDialog, this.$focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
