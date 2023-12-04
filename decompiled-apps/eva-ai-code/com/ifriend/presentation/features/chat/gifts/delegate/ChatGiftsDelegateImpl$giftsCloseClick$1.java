package com.ifriend.presentation.features.chat.gifts.delegate;

import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatGiftsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatGiftsDelegateImpl$giftsCloseClick$1 extends Lambda implements Function1<ChatGiftsUiState, ChatGiftsUiState> {
    public static final ChatGiftsDelegateImpl$giftsCloseClick$1 INSTANCE = new ChatGiftsDelegateImpl$giftsCloseClick$1();

    ChatGiftsDelegateImpl$giftsCloseClick$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatGiftsUiState invoke(ChatGiftsUiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ChatGiftsUiState.copy$default(state, false, true, null, false, null, 21, null);
    }
}
