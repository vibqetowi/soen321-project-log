package com.ifriend.presentation.features.chat.screen.view;

import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatScreenContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatScreenContentKt$ChatInputWithPanel$1$1$2 extends Lambda implements Function1<ChatPanelActionMarker, Unit> {
    final /* synthetic */ ChatViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenContentKt$ChatInputWithPanel$1$1$2(ChatViewModel chatViewModel) {
        super(1);
        this.$viewModel = chatViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatPanelActionMarker chatPanelActionMarker) {
        invoke2(chatPanelActionMarker);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatPanelActionMarker action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$viewModel.dispatchAction((ChatAction) new ChatAction.PaidAction.TopicClick(action));
    }
}
