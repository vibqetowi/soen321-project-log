package com.ifriend.app.di.modules.data.memorycached;

import com.ifriend.data.memorycached.chats.ChatConfigsMemoryCachedSourceImpl;
import com.ifriend.data.memorycached.onboarding.OnboardingChatConfigsMemoryCachedSourceImpl;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: MemoryCachedModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/ifriend/app/di/modules/data/memorycached/MemoryCachedModule;", "", "bindsConfigurationBotsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "impl", "Lcom/ifriend/data/memorycached/chats/ChatConfigsMemoryCachedSourceImpl;", "bindsOnboardingChatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/OnboardingChatConfigsMemoryCachedSource;", "Lcom/ifriend/data/memorycached/onboarding/OnboardingChatConfigsMemoryCachedSourceImpl;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface MemoryCachedModule {
    @Singleton
    @Binds
    ChatConfigsMemoryCachedSource bindsConfigurationBotsMemoryCachedSource(ChatConfigsMemoryCachedSourceImpl chatConfigsMemoryCachedSourceImpl);

    @Singleton
    @Binds
    OnboardingChatConfigsMemoryCachedSource bindsOnboardingChatConfigsMemoryCachedSource(OnboardingChatConfigsMemoryCachedSourceImpl onboardingChatConfigsMemoryCachedSourceImpl);
}
