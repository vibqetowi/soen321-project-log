package com.ifriend.presentation.features.chatsettings.viewmodel;

import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0209ChatSettingsViewModelFactory_Factory {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatSettingsConfigurationDelegateImpl> chatSettingsConfigurationDelegateProvider;
    private final Provider<ChatSettingsLevelsDelegateImpl> chatSettingsLevelsDelegateProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public C0209ChatSettingsViewModelFactory_Factory(Provider<ResourceProvider> provider, Provider<ChatSettingsLevelsDelegateImpl> provider2, Provider<ChatSettingsConfigurationDelegateImpl> provider3, Provider<AppEventsEmitter> provider4) {
        this.resourceProvider = provider;
        this.chatSettingsLevelsDelegateProvider = provider2;
        this.chatSettingsConfigurationDelegateProvider = provider3;
        this.appEventsEmitterProvider = provider4;
    }

    public ChatSettingsViewModelFactory get(String str) {
        return newInstance(str, this.resourceProvider.get(), this.chatSettingsLevelsDelegateProvider.get(), this.chatSettingsConfigurationDelegateProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static C0209ChatSettingsViewModelFactory_Factory create(Provider<ResourceProvider> provider, Provider<ChatSettingsLevelsDelegateImpl> provider2, Provider<ChatSettingsConfigurationDelegateImpl> provider3, Provider<AppEventsEmitter> provider4) {
        return new C0209ChatSettingsViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static ChatSettingsViewModelFactory newInstance(String str, ResourceProvider resourceProvider, ChatSettingsLevelsDelegateImpl chatSettingsLevelsDelegateImpl, ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegateImpl, AppEventsEmitter appEventsEmitter) {
        return new ChatSettingsViewModelFactory(str, resourceProvider, chatSettingsLevelsDelegateImpl, chatSettingsConfigurationDelegateImpl, appEventsEmitter);
    }
}
