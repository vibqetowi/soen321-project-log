package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.diary.ShownDiaryNotesDao;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideShownDiaryNotesDaoFactory implements Factory<ShownDiaryNotesDao> {
    private final Provider<Preferences> preferencesProvider;

    public DataModule_Companion_ProvideShownDiaryNotesDaoFactory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public ShownDiaryNotesDao get() {
        return provideShownDiaryNotesDao(this.preferencesProvider.get());
    }

    public static DataModule_Companion_ProvideShownDiaryNotesDaoFactory create(Provider<Preferences> provider) {
        return new DataModule_Companion_ProvideShownDiaryNotesDaoFactory(provider);
    }

    public static ShownDiaryNotesDao provideShownDiaryNotesDao(Preferences preferences) {
        return (ShownDiaryNotesDao) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideShownDiaryNotesDao(preferences));
    }
}
