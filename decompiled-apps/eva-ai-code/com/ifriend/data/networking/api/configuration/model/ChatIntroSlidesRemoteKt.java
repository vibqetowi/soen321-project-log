package com.ifriend.data.networking.api.configuration.model;

import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatIntroSlidesRemote.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDomain", "Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "Lcom/ifriend/data/networking/api/configuration/model/ChatIntroSlideRemote;", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroSlidesRemoteKt {
    public static final ChatIntroSlide toDomain(ChatIntroSlideRemote chatIntroSlideRemote) {
        Intrinsics.checkNotNullParameter(chatIntroSlideRemote, "<this>");
        return new ChatIntroSlide(chatIntroSlideRemote.getTitle(), chatIntroSlideRemote.getDescription(), chatIntroSlideRemote.getAction(), chatIntroSlideRemote.isVisibleCancelButton());
    }
}
