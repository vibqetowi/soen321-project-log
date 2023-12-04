package com.ifriend.chat.new_chat.list.presentationSystems.levels;

import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ExperienceMessageAnimationSystem_Factory implements Factory<ExperienceMessageAnimationSystem> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<MessagesSource> messagesSourceProvider;

    public ExperienceMessageAnimationSystem_Factory(Provider<MessagesSource> provider, Provider<CoroutineScope> provider2) {
        this.messagesSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ExperienceMessageAnimationSystem get() {
        return newInstance(this.messagesSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static ExperienceMessageAnimationSystem_Factory create(Provider<MessagesSource> provider, Provider<CoroutineScope> provider2) {
        return new ExperienceMessageAnimationSystem_Factory(provider, provider2);
    }

    public static ExperienceMessageAnimationSystem newInstance(MessagesSource messagesSource, CoroutineScope coroutineScope) {
        return new ExperienceMessageAnimationSystem(messagesSource, coroutineScope);
    }
}
