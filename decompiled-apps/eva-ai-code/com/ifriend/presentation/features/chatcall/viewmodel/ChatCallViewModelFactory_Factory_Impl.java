package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatCallViewModelFactory_Factory_Impl implements ChatCallViewModelFactory.Factory {
    private final C0208ChatCallViewModelFactory_Factory delegateFactory;

    ChatCallViewModelFactory_Factory_Impl(C0208ChatCallViewModelFactory_Factory c0208ChatCallViewModelFactory_Factory) {
        this.delegateFactory = c0208ChatCallViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModelFactory.Factory
    public ChatCallViewModelFactory create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatCallViewModelFactory.Factory> create(C0208ChatCallViewModelFactory_Factory c0208ChatCallViewModelFactory_Factory) {
        return InstanceFactory.create(new ChatCallViewModelFactory_Factory_Impl(c0208ChatCallViewModelFactory_Factory));
    }
}
