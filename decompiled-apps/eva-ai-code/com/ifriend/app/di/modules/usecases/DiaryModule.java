package com.ifriend.app.di.modules.usecases;

import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import com.ifriend.domain.useCases.diary.DiaryNotesService;
import com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase;
import com.ifriend.domain.useCases.diary.OnDiaryShownUseCase;
import com.ifriend.domain.useCases.diary.RefreshDiaryUseCase;
import com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryModule.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u0018"}, d2 = {"Lcom/ifriend/app/di/modules/usecases/DiaryModule;", "", "()V", "provideGetDiaryNotesListUseCase", "Lcom/ifriend/domain/useCases/diary/GetDiaryNotesListUseCase;", "diaryNotesService", "Lcom/ifriend/domain/useCases/diary/DiaryNotesService;", "provideGetDiaryNotesUseCase", "repository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "diaryFeatureToggle", "Lcom/ifriend/data/toggle/DiaryFeatureToggle;", "provideOnDiaryShownUseCase", "Lcom/ifriend/domain/useCases/diary/OnDiaryShownUseCase;", "provideRefreshDiaryUseCase", "Lcom/ifriend/domain/useCases/diary/RefreshDiaryUseCase;", "provideReplyDiaryNoteUseCase", "Lcom/ifriend/domain/useCases/diary/ReplyDiaryNoteUseCase;", "replier", "Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class DiaryModule {
    @Provides
    @Singleton
    public final GetDiaryNotesListUseCase provideGetDiaryNotesListUseCase(DiaryNotesService diaryNotesService) {
        Intrinsics.checkNotNullParameter(diaryNotesService, "diaryNotesService");
        return new GetDiaryNotesListUseCase(diaryNotesService);
    }

    @Provides
    @Singleton
    public final DiaryNotesService provideGetDiaryNotesUseCase(DiaryRepository repository, UserRepository userRepository, BotRepository botRepository, DiaryFeatureToggle diaryFeatureToggle) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(diaryFeatureToggle, "diaryFeatureToggle");
        return new DiaryNotesService(repository, userRepository, botRepository, diaryFeatureToggle);
    }

    @Provides
    @Singleton
    public final ReplyDiaryNoteUseCase provideReplyDiaryNoteUseCase(DiaryNoteReplier replier, DiaryRepository repository) {
        Intrinsics.checkNotNullParameter(replier, "replier");
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new ReplyDiaryNoteUseCase(replier, repository);
    }

    @Provides
    @Singleton
    public final RefreshDiaryUseCase provideRefreshDiaryUseCase(DiaryRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new RefreshDiaryUseCase(repository);
    }

    @Provides
    @Singleton
    public final OnDiaryShownUseCase provideOnDiaryShownUseCase(DiaryRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new OnDiaryShownUseCase(repository);
    }
}
