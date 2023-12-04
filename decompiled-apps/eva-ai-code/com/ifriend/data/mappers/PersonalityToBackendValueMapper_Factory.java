package com.ifriend.data.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class PersonalityToBackendValueMapper_Factory implements Factory<PersonalityToBackendValueMapper> {
    @Override // javax.inject.Provider
    public PersonalityToBackendValueMapper get() {
        return newInstance();
    }

    public static PersonalityToBackendValueMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PersonalityToBackendValueMapper newInstance() {
        return new PersonalityToBackendValueMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final PersonalityToBackendValueMapper_Factory INSTANCE = new PersonalityToBackendValueMapper_Factory();

        private InstanceHolder() {
        }
    }
}
