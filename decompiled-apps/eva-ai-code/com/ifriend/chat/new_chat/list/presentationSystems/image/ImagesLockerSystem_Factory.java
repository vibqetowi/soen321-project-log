package com.ifriend.chat.new_chat.list.presentationSystems.image;

import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ImagesLockerSystem_Factory implements Factory<ImagesLockerSystem> {
    private final Provider<UserRepository> userRepositoryProvider;

    public ImagesLockerSystem_Factory(Provider<UserRepository> provider) {
        this.userRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ImagesLockerSystem get() {
        return newInstance(this.userRepositoryProvider.get());
    }

    public static ImagesLockerSystem_Factory create(Provider<UserRepository> provider) {
        return new ImagesLockerSystem_Factory(provider);
    }

    public static ImagesLockerSystem newInstance(UserRepository userRepository) {
        return new ImagesLockerSystem(userRepository);
    }
}
