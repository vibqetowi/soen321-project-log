package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.useCases.AppConfigUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatModule_ProvideFirebaseSubscribeUseCaseFactory implements Factory<FirebaseSubscribeUseCase> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<FirebaseApiRepository> firebaseApiRepositoryProvider;
    private final ChatModule module;
    private final Provider<Preferences> preferencesProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatModule_ProvideFirebaseSubscribeUseCaseFactory(ChatModule chatModule, Provider<FirebaseApiRepository> provider, Provider<Preferences> provider2, Provider<UserRepository> provider3, Provider<AppConfigUseCase> provider4, Provider<CoroutineScope> provider5) {
        this.module = chatModule;
        this.firebaseApiRepositoryProvider = provider;
        this.preferencesProvider = provider2;
        this.userRepositoryProvider = provider3;
        this.appConfigUseCaseProvider = provider4;
        this.coroutineScopeProvider = provider5;
    }

    @Override // javax.inject.Provider
    public FirebaseSubscribeUseCase get() {
        return provideFirebaseSubscribeUseCase(this.module, this.firebaseApiRepositoryProvider.get(), this.preferencesProvider.get(), this.userRepositoryProvider.get(), this.appConfigUseCaseProvider.get(), this.coroutineScopeProvider.get());
    }

    public static ChatModule_ProvideFirebaseSubscribeUseCaseFactory create(ChatModule chatModule, Provider<FirebaseApiRepository> provider, Provider<Preferences> provider2, Provider<UserRepository> provider3, Provider<AppConfigUseCase> provider4, Provider<CoroutineScope> provider5) {
        return new ChatModule_ProvideFirebaseSubscribeUseCaseFactory(chatModule, provider, provider2, provider3, provider4, provider5);
    }

    public static FirebaseSubscribeUseCase provideFirebaseSubscribeUseCase(ChatModule chatModule, FirebaseApiRepository firebaseApiRepository, Preferences preferences, UserRepository userRepository, AppConfigUseCase appConfigUseCase, CoroutineScope coroutineScope) {
        return (FirebaseSubscribeUseCase) Preconditions.checkNotNullFromProvides(chatModule.provideFirebaseSubscribeUseCase(firebaseApiRepository, preferences, userRepository, appConfigUseCase, coroutineScope));
    }
}
