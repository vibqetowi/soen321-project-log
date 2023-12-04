package com.ifriend.chat.presentation.di.chat;

import com.ifriend.base.di.Feature;
import com.ifriend.data.repository.benefits.PremiumBenefitsRepositoryImpl;
import com.ifriend.data.repository.calls.ChatCallsRepositoryImpl;
import com.ifriend.data.repository.chat.client.ChatClientsRepositoryImpl;
import com.ifriend.domain.data.benefits.PremiumBenefitsRepository;
import com.ifriend.domain.data.calls.ChatCallsRepository;
import com.ifriend.domain.data.chat.ChatClientsRepository;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: ChatDataModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/presentation/di/chat/ChatDataModule;", "", "bindsBenefitsRepository", "Lcom/ifriend/domain/data/benefits/PremiumBenefitsRepository;", "impl", "Lcom/ifriend/data/repository/benefits/PremiumBenefitsRepositoryImpl;", "bindsChatCallsRepository", "Lcom/ifriend/domain/data/calls/ChatCallsRepository;", "Lcom/ifriend/data/repository/calls/ChatCallsRepositoryImpl;", "bindsChatsClientRepository", "Lcom/ifriend/domain/data/chat/ChatClientsRepository;", "Lcom/ifriend/data/repository/chat/client/ChatClientsRepositoryImpl;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface ChatDataModule {
    @Feature
    @Binds
    PremiumBenefitsRepository bindsBenefitsRepository(PremiumBenefitsRepositoryImpl premiumBenefitsRepositoryImpl);

    @Feature
    @Binds
    ChatCallsRepository bindsChatCallsRepository(ChatCallsRepositoryImpl chatCallsRepositoryImpl);

    @Feature
    @Binds
    ChatClientsRepository bindsChatsClientRepository(ChatClientsRepositoryImpl chatClientsRepositoryImpl);
}
