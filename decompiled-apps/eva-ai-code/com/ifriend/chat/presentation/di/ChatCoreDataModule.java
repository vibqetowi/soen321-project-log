package com.ifriend.chat.presentation.di;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.presentation.di.chat.ChatTopicsModule;
import com.ifriend.data.repository.user.UserBalanceRepositoryImpl;
import com.ifriend.domain.data.user.UserBalanceRepository;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: ChatCoreDataModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/presentation/di/ChatCoreDataModule;", "", "bindsUserBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "impl", "Lcom/ifriend/data/repository/user/UserBalanceRepositoryImpl;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {ChatTopicsModule.class})
/* loaded from: classes6.dex */
public interface ChatCoreDataModule {
    @Feature
    @Binds
    UserBalanceRepository bindsUserBalanceRepository(UserBalanceRepositoryImpl userBalanceRepositoryImpl);
}
