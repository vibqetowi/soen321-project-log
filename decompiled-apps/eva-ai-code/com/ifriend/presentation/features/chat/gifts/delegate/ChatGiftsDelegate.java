package com.ifriend.presentation.features.chat.gifts.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatGiftsDelegate.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&R\u00020\t¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&R\u00020\t¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&R\u00020\t¢\u0006\u0002\u0010\u0010R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsDelegate;", "", "chatGiftsUiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "getChatGiftsUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "giftClick", "", "Landroidx/lifecycle/ViewModel;", "gift", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;Ljava/lang/String;)V", "giftsClick", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "giftsCloseClick", "(Landroidx/lifecycle/ViewModel;)V", "initChatGifts", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatGiftsDelegate {
    StateFlow<ChatGiftsUiState> getChatGiftsUiState();

    void giftClick(ViewModel viewModel, ChatGiftUi chatGiftUi, String str);

    void giftsClick(ViewModel viewModel, String str);

    void giftsCloseClick(ViewModel viewModel);

    void initChatGifts(ViewModel viewModel, String str);
}
