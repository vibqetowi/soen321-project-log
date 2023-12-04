package com.ifriend.data.networking.api.diary;

import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryApiDelegate_Factory implements Factory<DiaryApiDelegate> {
    private final Provider<DiaryApi> apiProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public DiaryApiDelegate_Factory(Provider<DiaryApi> provider, Provider<UserRepository> provider2) {
        this.apiProvider = provider;
        this.userRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DiaryApiDelegate get() {
        return newInstance(this.apiProvider.get(), this.userRepositoryProvider.get());
    }

    public static DiaryApiDelegate_Factory create(Provider<DiaryApi> provider, Provider<UserRepository> provider2) {
        return new DiaryApiDelegate_Factory(provider, provider2);
    }

    public static DiaryApiDelegate newInstance(DiaryApi diaryApi, UserRepository userRepository) {
        return new DiaryApiDelegate(diaryApi, userRepository);
    }
}
