package com.ifriend.app.di.modules.data;

import android.content.Context;
import coil.ImageLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAppImageLoaderFactory implements Factory<ImageLoader> {
    private final Provider<Context> contextProvider;
    private final Provider<OkHttpClient> httpClientProvider;

    public DataModule_Companion_ProvideAppImageLoaderFactory(Provider<Context> provider, Provider<OkHttpClient> provider2) {
        this.contextProvider = provider;
        this.httpClientProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ImageLoader get() {
        return provideAppImageLoader(this.contextProvider.get(), this.httpClientProvider.get());
    }

    public static DataModule_Companion_ProvideAppImageLoaderFactory create(Provider<Context> provider, Provider<OkHttpClient> provider2) {
        return new DataModule_Companion_ProvideAppImageLoaderFactory(provider, provider2);
    }

    public static ImageLoader provideAppImageLoader(Context context, OkHttpClient okHttpClient) {
        return (ImageLoader) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAppImageLoader(context, okHttpClient));
    }
}
