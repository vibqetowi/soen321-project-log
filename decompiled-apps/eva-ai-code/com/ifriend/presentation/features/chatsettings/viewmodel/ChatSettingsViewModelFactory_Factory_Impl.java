package com.ifriend.presentation.features.chatsettings.viewmodel;

import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSettingsViewModelFactory_Factory_Impl implements ChatSettingsViewModelFactory.Factory {
    private final C0209ChatSettingsViewModelFactory_Factory delegateFactory;

    ChatSettingsViewModelFactory_Factory_Impl(C0209ChatSettingsViewModelFactory_Factory c0209ChatSettingsViewModelFactory_Factory) {
        this.delegateFactory = c0209ChatSettingsViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModelFactory.Factory
    public ChatSettingsViewModelFactory create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatSettingsViewModelFactory.Factory> create(C0209ChatSettingsViewModelFactory_Factory c0209ChatSettingsViewModelFactory_Factory) {
        return InstanceFactory.create(new ChatSettingsViewModelFactory_Factory_Impl(c0209ChatSettingsViewModelFactory_Factory));
    }
}
