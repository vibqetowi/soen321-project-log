package com.ifriend.data.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class PersonalityFromBackendValueMapper_Factory implements Factory<PersonalityFromBackendValueMapper> {
    @Override // javax.inject.Provider
    public PersonalityFromBackendValueMapper get() {
        return newInstance();
    }

    public static PersonalityFromBackendValueMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PersonalityFromBackendValueMapper newInstance() {
        return new PersonalityFromBackendValueMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final PersonalityFromBackendValueMapper_Factory INSTANCE = new PersonalityFromBackendValueMapper_Factory();

        private InstanceHolder() {
        }
    }
}
