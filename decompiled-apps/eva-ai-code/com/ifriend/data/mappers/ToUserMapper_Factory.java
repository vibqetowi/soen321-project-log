package com.ifriend.data.mappers;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ToUserMapper_Factory implements Factory<ToUserMapper> {
    private final Provider<GenderFromBackendString> toGenderMapperProvider;

    public ToUserMapper_Factory(Provider<GenderFromBackendString> provider) {
        this.toGenderMapperProvider = provider;
    }

    @Override // javax.inject.Provider
    public ToUserMapper get() {
        return newInstance(this.toGenderMapperProvider.get());
    }

    public static ToUserMapper_Factory create(Provider<GenderFromBackendString> provider) {
        return new ToUserMapper_Factory(provider);
    }

    public static ToUserMapper newInstance(GenderFromBackendString genderFromBackendString) {
        return new ToUserMapper(genderFromBackendString);
    }
}
