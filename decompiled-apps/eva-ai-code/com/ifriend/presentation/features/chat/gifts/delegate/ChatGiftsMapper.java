package com.ifriend.presentation.features.chat.gifts.delegate;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.domain.logic.chat.gifts.ChatGift;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatGiftsMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsMapper;", "", "()V", "map", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsMapper {
    public static final int $stable = 0;

    public final ChatGiftUi map(ChatGift model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new ChatGiftUi(model.getGiftId(), String.valueOf(model.getPrice()), model.getPrice(), model.getImageUrl());
    }
}
