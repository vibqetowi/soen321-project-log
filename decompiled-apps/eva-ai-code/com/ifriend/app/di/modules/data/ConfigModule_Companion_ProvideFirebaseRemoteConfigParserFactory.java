package com.ifriend.app.di.modules.data;

import com.ifriend.data.config.parser.ConditionsChecker;
import com.ifriend.data.config.parser.FirebaseRemoteConfigParser;
import com.ifriend.domain.data.TagsProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ConfigModule_Companion_ProvideFirebaseRemoteConfigParserFactory implements Factory<FirebaseRemoteConfigParser> {
    private final Provider<ConditionsChecker> conditionsCheckerProvider;
    private final Provider<TagsProvider> tagsProvider;

    public ConfigModule_Companion_ProvideFirebaseRemoteConfigParserFactory(Provider<TagsProvider> provider, Provider<ConditionsChecker> provider2) {
        this.tagsProvider = provider;
        this.conditionsCheckerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public FirebaseRemoteConfigParser get() {
        return provideFirebaseRemoteConfigParser(this.tagsProvider.get(), this.conditionsCheckerProvider.get());
    }

    public static ConfigModule_Companion_ProvideFirebaseRemoteConfigParserFactory create(Provider<TagsProvider> provider, Provider<ConditionsChecker> provider2) {
        return new ConfigModule_Companion_ProvideFirebaseRemoteConfigParserFactory(provider, provider2);
    }

    public static FirebaseRemoteConfigParser provideFirebaseRemoteConfigParser(TagsProvider tagsProvider, ConditionsChecker conditionsChecker) {
        return (FirebaseRemoteConfigParser) Preconditions.checkNotNullFromProvides(ConfigModule.Companion.provideFirebaseRemoteConfigParser(tagsProvider, conditionsChecker));
    }
}
