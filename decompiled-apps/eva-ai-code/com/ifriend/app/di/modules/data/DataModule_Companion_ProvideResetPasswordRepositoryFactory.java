package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.ResetPasswordApi;
import com.ifriend.domain.data.ResetPasswordRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideResetPasswordRepositoryFactory implements Factory<ResetPasswordRepository> {
    private final Provider<ResetPasswordApi> resetPasswordApiProvider;

    public DataModule_Companion_ProvideResetPasswordRepositoryFactory(Provider<ResetPasswordApi> provider) {
        this.resetPasswordApiProvider = provider;
    }

    @Override // javax.inject.Provider
    public ResetPasswordRepository get() {
        return provideResetPasswordRepository(this.resetPasswordApiProvider.get());
    }

    public static DataModule_Companion_ProvideResetPasswordRepositoryFactory create(Provider<ResetPasswordApi> provider) {
        return new DataModule_Companion_ProvideResetPasswordRepositoryFactory(provider);
    }

    public static ResetPasswordRepository provideResetPasswordRepository(ResetPasswordApi resetPasswordApi) {
        return (ResetPasswordRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideResetPasswordRepository(resetPasswordApi));
    }
}
