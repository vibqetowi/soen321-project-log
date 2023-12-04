package com.ifriend.chat.api;

import com.ifriend.base.navigation.api.cicerone.Screen;
import kotlin.Metadata;
/* compiled from: ChatScreenFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/api/ChatScreenFactory;", "", "chatScreen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "showKeyboardOnStart", "", "chatId", "", "multiChatScreen", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatScreenFactory {
    Screen chatScreen(boolean z, String str);

    Screen multiChatScreen();

    /* compiled from: ChatScreenFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Screen chatScreen$default(ChatScreenFactory chatScreenFactory, boolean z, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return chatScreenFactory.chatScreen(z, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: chatScreen");
        }
    }
}
