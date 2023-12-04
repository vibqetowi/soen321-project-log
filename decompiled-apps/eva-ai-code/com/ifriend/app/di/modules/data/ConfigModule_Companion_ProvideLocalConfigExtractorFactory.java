package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.data.config.LocalConfigExtractor;
import com.ifriend.platform.tools.api.AppInfoProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ConfigModule_Companion_ProvideLocalConfigExtractorFactory implements Factory<LocalConfigExtractor> {
    private final Provider<AppInfoProvider> appInfoProvider;
    private final Provider<Context> contextProvider;

    public ConfigModule_Companion_ProvideLocalConfigExtractorFactory(Provider<Context> provider, Provider<AppInfoProvider> provider2) {
        this.contextProvider = provider;
        this.appInfoProvider = provider2;
    }

    @Override // javax.inject.Provider
    public LocalConfigExtractor get() {
        return provideLocalConfigExtractor(this.contextProvider.get(), this.appInfoProvider.get());
    }

    public static ConfigModule_Companion_ProvideLocalConfigExtractorFactory create(Provider<Context> provider, Provider<AppInfoProvider> provider2) {
        return new ConfigModule_Companion_ProvideLocalConfigExtractorFactory(provider, provider2);
    }

    public static LocalConfigExtractor provideLocalConfigExtractor(Context context, AppInfoProvider appInfoProvider) {
        return (LocalConfigExtractor) Preconditions.checkNotNullFromProvides(ConfigModule.Companion.provideLocalConfigExtractor(context, appInfoProvider));
    }
}
