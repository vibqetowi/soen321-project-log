package com.ifriend.domain.logic.updates;

import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.data.update.InAppUpdateRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UpdatePromptInteractor_Factory implements Factory<UpdatePromptInteractor> {
    private final Provider<AppConfigRepository> appConfigRepositoryProvider;
    private final Provider<InAppUpdateRepository> repoProvider;

    public UpdatePromptInteractor_Factory(Provider<InAppUpdateRepository> provider, Provider<AppConfigRepository> provider2) {
        this.repoProvider = provider;
        this.appConfigRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public UpdatePromptInteractor get() {
        return newInstance(this.repoProvider.get(), this.appConfigRepositoryProvider.get());
    }

    public static UpdatePromptInteractor_Factory create(Provider<InAppUpdateRepository> provider, Provider<AppConfigRepository> provider2) {
        return new UpdatePromptInteractor_Factory(provider, provider2);
    }

    public static UpdatePromptInteractor newInstance(InAppUpdateRepository inAppUpdateRepository, AppConfigRepository appConfigRepository) {
        return new UpdatePromptInteractor(inAppUpdateRepository, appConfigRepository);
    }
}
