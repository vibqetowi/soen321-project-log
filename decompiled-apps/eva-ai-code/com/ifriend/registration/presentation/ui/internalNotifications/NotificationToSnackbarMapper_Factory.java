package com.ifriend.registration.presentation.ui.internalNotifications;

import android.content.res.Resources;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class NotificationToSnackbarMapper_Factory implements Factory<NotificationToSnackbarMapper> {
    private final Provider<Resources> resourcesProvider;

    public NotificationToSnackbarMapper_Factory(Provider<Resources> provider) {
        this.resourcesProvider = provider;
    }

    @Override // javax.inject.Provider
    public NotificationToSnackbarMapper get() {
        return newInstance(this.resourcesProvider.get());
    }

    public static NotificationToSnackbarMapper_Factory create(Provider<Resources> provider) {
        return new NotificationToSnackbarMapper_Factory(provider);
    }

    public static NotificationToSnackbarMapper newInstance(Resources resources) {
        return new NotificationToSnackbarMapper(resources);
    }
}
