package com.ifriend.chat.presentation.di.chat;

import com.ifriend.base.di.Feature;
import com.ifriend.data.repository.topics.ChatPremiumTopicsRepositoryImpl;
import com.ifriend.data.repository.topics.ChatTopicsRepositoryImpl;
import com.ifriend.domain.data.topics.ChatPremiumTopicsRepository;
import com.ifriend.domain.data.topics.ChatTopicsRepository;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: ChatTopicsModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/di/chat/ChatTopicsModule;", "", "bindsChatPremiumTopicsRepository", "Lcom/ifriend/domain/data/topics/ChatPremiumTopicsRepository;", "impl", "Lcom/ifriend/data/repository/topics/ChatPremiumTopicsRepositoryImpl;", "bindsChatTopicsRepository", "Lcom/ifriend/domain/data/topics/ChatTopicsRepository;", "Lcom/ifriend/data/repository/topics/ChatTopicsRepositoryImpl;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface ChatTopicsModule {
    @Feature
    @Binds
    ChatPremiumTopicsRepository bindsChatPremiumTopicsRepository(ChatPremiumTopicsRepositoryImpl chatPremiumTopicsRepositoryImpl);

    @Feature
    @Binds
    ChatTopicsRepository bindsChatTopicsRepository(ChatTopicsRepositoryImpl chatTopicsRepositoryImpl);
}
