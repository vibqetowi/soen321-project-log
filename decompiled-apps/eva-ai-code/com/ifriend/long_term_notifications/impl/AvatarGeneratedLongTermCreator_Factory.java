package com.ifriend.long_term_notifications.impl;

import android.content.res.Resources;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AvatarGeneratedLongTermCreator_Factory implements Factory<AvatarGeneratedLongTermCreator> {
    private final Provider<Resources> resourcesProvider;

    public AvatarGeneratedLongTermCreator_Factory(Provider<Resources> provider) {
        this.resourcesProvider = provider;
    }

    @Override // javax.inject.Provider
    public AvatarGeneratedLongTermCreator get() {
        return newInstance(this.resourcesProvider.get());
    }

    public static AvatarGeneratedLongTermCreator_Factory create(Provider<Resources> provider) {
        return new AvatarGeneratedLongTermCreator_Factory(provider);
    }

    public static AvatarGeneratedLongTermCreator newInstance(Resources resources) {
        return new AvatarGeneratedLongTermCreator(resources);
    }
}
