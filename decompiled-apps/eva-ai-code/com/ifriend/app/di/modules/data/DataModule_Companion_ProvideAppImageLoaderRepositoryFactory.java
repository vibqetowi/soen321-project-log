package com.ifriend.app.di.modules.data;

import android.content.Context;
import coil.ImageLoader;
import com.ifriend.domain.data.AppImageLoaderRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAppImageLoaderRepositoryFactory implements Factory<AppImageLoaderRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<ImageLoader> imageLoaderProvider;

    public DataModule_Companion_ProvideAppImageLoaderRepositoryFactory(Provider<Context> provider, Provider<ImageLoader> provider2) {
        this.contextProvider = provider;
        this.imageLoaderProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AppImageLoaderRepository get() {
        return provideAppImageLoaderRepository(this.contextProvider.get(), this.imageLoaderProvider.get());
    }

    public static DataModule_Companion_ProvideAppImageLoaderRepositoryFactory create(Provider<Context> provider, Provider<ImageLoader> provider2) {
        return new DataModule_Companion_ProvideAppImageLoaderRepositoryFactory(provider, provider2);
    }

    public static AppImageLoaderRepository provideAppImageLoaderRepository(Context context, ImageLoader imageLoader) {
        return (AppImageLoaderRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAppImageLoaderRepository(context, imageLoader));
    }
}
