package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.diary.DiaryApiDelegate;
import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideDiaryNoteReplierFactory implements Factory<DiaryNoteReplier> {
    private final Provider<DiaryApiDelegate> apiDelegateProvider;

    public DataModule_Companion_ProvideDiaryNoteReplierFactory(Provider<DiaryApiDelegate> provider) {
        this.apiDelegateProvider = provider;
    }

    @Override // javax.inject.Provider
    public DiaryNoteReplier get() {
        return provideDiaryNoteReplier(this.apiDelegateProvider.get());
    }

    public static DataModule_Companion_ProvideDiaryNoteReplierFactory create(Provider<DiaryApiDelegate> provider) {
        return new DataModule_Companion_ProvideDiaryNoteReplierFactory(provider);
    }

    public static DiaryNoteReplier provideDiaryNoteReplier(DiaryApiDelegate diaryApiDelegate) {
        return (DiaryNoteReplier) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideDiaryNoteReplier(diaryApiDelegate));
    }
}
