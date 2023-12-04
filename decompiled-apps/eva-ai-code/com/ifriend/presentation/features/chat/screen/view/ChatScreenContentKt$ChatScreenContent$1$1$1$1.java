package com.ifriend.presentation.features.chat.screen.view;

import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatScreenContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "gift", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatScreenContentKt$ChatScreenContent$1$1$1$1 extends Lambda implements Function1<ChatGiftUi, Unit> {
    final /* synthetic */ ChatViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenContentKt$ChatScreenContent$1$1$1$1(ChatViewModel chatViewModel) {
        super(1);
        this.$viewModel = chatViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatGiftUi chatGiftUi) {
        invoke2(chatGiftUi);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatGiftUi gift) {
        Intrinsics.checkNotNullParameter(gift, "gift");
        this.$viewModel.dispatchAction((ChatAction) new ChatAction.GiftClick(gift));
    }
}
