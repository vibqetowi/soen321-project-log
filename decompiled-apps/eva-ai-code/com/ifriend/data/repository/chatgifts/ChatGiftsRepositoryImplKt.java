package com.ifriend.data.repository.chatgifts;

import com.ifriend.data.networking.api.chatgifts.models.response.ChatGiftsRemote;
import com.ifriend.domain.logic.chat.gifts.ChatGift;
import kotlin.Metadata;
/* compiled from: ChatGiftsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toChatGif", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "Lcom/ifriend/data/networking/api/chatgifts/models/response/ChatGiftsRemote;", "baseImageUrl", "", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsRepositoryImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatGift toChatGif(ChatGiftsRemote chatGiftsRemote, String str) {
        String giftId = chatGiftsRemote.getGiftId();
        if (giftId == null) {
            giftId = "";
        }
        String image = chatGiftsRemote.getImage();
        if (image == null) {
            image = "";
        }
        String str2 = str + image;
        String image2 = chatGiftsRemote.getImage();
        String str3 = image2 != null ? image2 : "";
        Integer price = chatGiftsRemote.getPrice();
        return new ChatGift(giftId, str2, str3, price != null ? price.intValue() : 0);
    }
}
