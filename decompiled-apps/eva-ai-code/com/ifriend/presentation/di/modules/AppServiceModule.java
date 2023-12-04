package com.ifriend.presentation.di.modules;

import com.ifriend.base.di.Feature;
import com.ifriend.presentation.services.ChatMessagesService;
import com.ifriend.presentation.services.ChatMessagesServiceImpl;
import com.ifriend.presentation.services.ChatService;
import com.ifriend.presentation.services.ChatServiceImpl;
import com.ifriend.presentation.services.UserBalanceService;
import com.ifriend.presentation.services.UserBalanceServiceImpl;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: AppServiceModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/di/modules/AppServiceModule;", "", "bindsChatMessagesService", "Lcom/ifriend/presentation/services/ChatMessagesService;", "impl", "Lcom/ifriend/presentation/services/ChatMessagesServiceImpl;", "bindsChatService", "Lcom/ifriend/presentation/services/ChatService;", "Lcom/ifriend/presentation/services/ChatServiceImpl;", "bindsUserBalanceService", "Lcom/ifriend/presentation/services/UserBalanceService;", "Lcom/ifriend/presentation/services/UserBalanceServiceImpl;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface AppServiceModule {
    @Feature
    @Binds
    ChatMessagesService bindsChatMessagesService(ChatMessagesServiceImpl chatMessagesServiceImpl);

    @Feature
    @Binds
    ChatService bindsChatService(ChatServiceImpl chatServiceImpl);

    @Feature
    @Binds
    UserBalanceService bindsUserBalanceService(UserBalanceServiceImpl userBalanceServiceImpl);
}
