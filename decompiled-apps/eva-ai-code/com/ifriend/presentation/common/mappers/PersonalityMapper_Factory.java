package com.ifriend.presentation.common.mappers;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PersonalityMapper_Factory implements Factory<PersonalityMapper> {
    private final Provider<ResourceProvider> resourceProvider;

    public PersonalityMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public PersonalityMapper get() {
        return newInstance(this.resourceProvider.get());
    }

    public static PersonalityMapper_Factory create(Provider<ResourceProvider> provider) {
        return new PersonalityMapper_Factory(provider);
    }

    public static PersonalityMapper newInstance(ResourceProvider resourceProvider) {
        return new PersonalityMapper(resourceProvider);
    }
}
