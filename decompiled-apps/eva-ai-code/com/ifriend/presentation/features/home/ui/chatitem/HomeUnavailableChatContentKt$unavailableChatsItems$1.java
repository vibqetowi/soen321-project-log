package com.ifriend.presentation.features.home.ui.chatitem;

import com.ifriend.presentation.features.home.ui.models.HomeUnavailableChatUi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: HomeUnavailableChatContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "chat", "Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeUnavailableChatContentKt$unavailableChatsItems$1 extends Lambda implements Function1<HomeUnavailableChatUi, Object> {
    public static final HomeUnavailableChatContentKt$unavailableChatsItems$1 INSTANCE = new HomeUnavailableChatContentKt$unavailableChatsItems$1();

    HomeUnavailableChatContentKt$unavailableChatsItems$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(HomeUnavailableChatUi chat) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        return chat.getChatId();
    }
}
