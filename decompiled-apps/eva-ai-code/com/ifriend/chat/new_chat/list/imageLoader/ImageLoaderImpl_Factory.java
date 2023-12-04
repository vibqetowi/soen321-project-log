package com.ifriend.chat.new_chat.list.imageLoader;

import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ImageLoaderImpl_Factory implements Factory<ImageLoaderImpl> {
    private final Provider<AuthDataProvider> authDataProvider;

    public ImageLoaderImpl_Factory(Provider<AuthDataProvider> provider) {
        this.authDataProvider = provider;
    }

    @Override // javax.inject.Provider
    public ImageLoaderImpl get() {
        return newInstance(this.authDataProvider.get());
    }

    public static ImageLoaderImpl_Factory create(Provider<AuthDataProvider> provider) {
        return new ImageLoaderImpl_Factory(provider);
    }

    public static ImageLoaderImpl newInstance(AuthDataProvider authDataProvider) {
        return new ImageLoaderImpl(authDataProvider);
    }
}
