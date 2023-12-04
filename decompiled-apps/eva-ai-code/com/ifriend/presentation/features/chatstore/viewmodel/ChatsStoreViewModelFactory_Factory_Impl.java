package com.ifriend.presentation.features.chatstore.viewmodel;

import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsStoreViewModelFactory_Factory_Impl implements ChatsStoreViewModelFactory.Factory {
    private final C0210ChatsStoreViewModelFactory_Factory delegateFactory;

    ChatsStoreViewModelFactory_Factory_Impl(C0210ChatsStoreViewModelFactory_Factory c0210ChatsStoreViewModelFactory_Factory) {
        this.delegateFactory = c0210ChatsStoreViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory.Factory
    public ChatsStoreViewModelFactory create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatsStoreViewModelFactory.Factory> create(C0210ChatsStoreViewModelFactory_Factory c0210ChatsStoreViewModelFactory_Factory) {
        return InstanceFactory.create(new ChatsStoreViewModelFactory_Factory_Impl(c0210ChatsStoreViewModelFactory_Factory));
    }
}
