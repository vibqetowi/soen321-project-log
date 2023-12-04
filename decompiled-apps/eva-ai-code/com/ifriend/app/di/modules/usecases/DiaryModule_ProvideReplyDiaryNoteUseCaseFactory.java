package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryModule_ProvideReplyDiaryNoteUseCaseFactory implements Factory<ReplyDiaryNoteUseCase> {
    private final DiaryModule module;
    private final Provider<DiaryNoteReplier> replierProvider;
    private final Provider<DiaryRepository> repositoryProvider;

    public DiaryModule_ProvideReplyDiaryNoteUseCaseFactory(DiaryModule diaryModule, Provider<DiaryNoteReplier> provider, Provider<DiaryRepository> provider2) {
        this.module = diaryModule;
        this.replierProvider = provider;
        this.repositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ReplyDiaryNoteUseCase get() {
        return provideReplyDiaryNoteUseCase(this.module, this.replierProvider.get(), this.repositoryProvider.get());
    }

    public static DiaryModule_ProvideReplyDiaryNoteUseCaseFactory create(DiaryModule diaryModule, Provider<DiaryNoteReplier> provider, Provider<DiaryRepository> provider2) {
        return new DiaryModule_ProvideReplyDiaryNoteUseCaseFactory(diaryModule, provider, provider2);
    }

    public static ReplyDiaryNoteUseCase provideReplyDiaryNoteUseCase(DiaryModule diaryModule, DiaryNoteReplier diaryNoteReplier, DiaryRepository diaryRepository) {
        return (ReplyDiaryNoteUseCase) Preconditions.checkNotNullFromProvides(diaryModule.provideReplyDiaryNoteUseCase(diaryNoteReplier, diaryRepository));
    }
}
