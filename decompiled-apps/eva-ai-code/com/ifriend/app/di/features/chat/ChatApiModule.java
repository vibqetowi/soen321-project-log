package com.ifriend.app.di.features.chat;

import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatScreenFactoryImpl;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: ChatApiModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/ifriend/app/di/features/chat/ChatApiModule;", "", "chatScreenFactory", "Lcom/ifriend/chat/api/ChatScreenFactory;", "screenFactory", "Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatScreenFactoryImpl;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface ChatApiModule {
    @Binds
    ChatScreenFactory chatScreenFactory(ChatScreenFactoryImpl chatScreenFactoryImpl);
}
