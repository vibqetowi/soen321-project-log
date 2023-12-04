package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.TagsStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideTagsProviderFactory implements Factory<TagsProvider> {
    private final Provider<TagsStorage> storageProvider;

    public DataModule_Companion_ProvideTagsProviderFactory(Provider<TagsStorage> provider) {
        this.storageProvider = provider;
    }

    @Override // javax.inject.Provider
    public TagsProvider get() {
        return provideTagsProvider(this.storageProvider.get());
    }

    public static DataModule_Companion_ProvideTagsProviderFactory create(Provider<TagsStorage> provider) {
        return new DataModule_Companion_ProvideTagsProviderFactory(provider);
    }

    public static TagsProvider provideTagsProvider(TagsStorage tagsStorage) {
        return (TagsProvider) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideTagsProvider(tagsStorage));
    }
}
