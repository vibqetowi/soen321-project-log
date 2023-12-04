package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatScreenFactoryImpl;", "Lcom/ifriend/chat/api/ChatScreenFactory;", "()V", "chatScreen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "showKeyboardOnStart", "", "chatId", "", "multiChatScreen", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatScreenFactoryImpl implements ChatScreenFactory {
    public static final int $stable = 0;

    @Override // com.ifriend.chat.api.ChatScreenFactory
    public Screen chatScreen(boolean z, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ChatWithTopicsScreen(z, chatId);
    }

    @Override // com.ifriend.chat.api.ChatScreenFactory
    public Screen multiChatScreen() {
        return new FragmentScreen() { // from class: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatScreenFactoryImpl$multiChatScreen$1
            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public boolean getClearContainer() {
                return FragmentScreen.DefaultImpls.getClearContainer(this);
            }

            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public Fragment createFragment(FragmentFactory factory) {
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new HomeFragment();
            }

            @Override // com.ifriend.base.navigation.api.cicerone.Screen
            public String getScreenKey() {
                return AnalyticsScreenName.CHAT_LIST.getValue();
            }
        };
    }
}
