package com.ifriend.registration.presentation.di;

import com.ifriend.registration.domain.useCase.password.PasswordGenerator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class AuthorizationModule_Companion_ProvidePasswordGeneratorFactory implements Factory<PasswordGenerator> {
    @Override // javax.inject.Provider
    public PasswordGenerator get() {
        return providePasswordGenerator();
    }

    public static AuthorizationModule_Companion_ProvidePasswordGeneratorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PasswordGenerator providePasswordGenerator() {
        return (PasswordGenerator) Preconditions.checkNotNullFromProvides(AuthorizationModule.Companion.providePasswordGenerator());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final AuthorizationModule_Companion_ProvidePasswordGeneratorFactory INSTANCE = new AuthorizationModule_Companion_ProvidePasswordGeneratorFactory();

        private InstanceHolder() {
        }
    }
}
