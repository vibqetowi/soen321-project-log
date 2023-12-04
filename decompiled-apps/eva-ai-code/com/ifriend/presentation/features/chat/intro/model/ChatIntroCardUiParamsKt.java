package com.ifriend.presentation.features.chat.intro.model;

import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatIntroCardUiParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiParams", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroCardUiParams;", "Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroCardUiParamsKt {
    public static final ChatIntroCardUiParams toUiParams(ChatIntroSlide chatIntroSlide) {
        Intrinsics.checkNotNullParameter(chatIntroSlide, "<this>");
        return new ChatIntroCardUiParams(chatIntroSlide.getTitle(), chatIntroSlide.getDescription(), chatIntroSlide.getAction(), chatIntroSlide.isVisibleCancelButton());
    }
}
