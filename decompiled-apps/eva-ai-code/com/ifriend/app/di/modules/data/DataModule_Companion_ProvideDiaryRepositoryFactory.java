package com.ifriend.app.di.modules.data;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.diary.DiaryApiDelegate;
import com.ifriend.data.storages.diary.DiaryDao;
import com.ifriend.data.storages.diary.ShownDiaryNotesDao;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideDiaryRepositoryFactory implements Factory<DiaryRepository> {
    private final Provider<DiaryApiDelegate> apiDelegateProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DiaryDao> diaryDaoProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<ShownDiaryNotesDao> shownNotesDaoProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public DataModule_Companion_ProvideDiaryRepositoryFactory(Provider<DiaryApiDelegate> provider, Provider<DiaryDao> provider2, Provider<ShownDiaryNotesDao> provider3, Provider<UserRepository> provider4, Provider<BotRepository> provider5, Provider<MessagesSource> provider6, Provider<CoroutineScope> provider7, Provider<Logger> provider8) {
        this.apiDelegateProvider = provider;
        this.diaryDaoProvider = provider2;
        this.shownNotesDaoProvider = provider3;
        this.userRepositoryProvider = provider4;
        this.botRepositoryProvider = provider5;
        this.messagesSourceProvider = provider6;
        this.coroutineScopeProvider = provider7;
        this.loggerProvider = provider8;
    }

    @Override // javax.inject.Provider
    public DiaryRepository get() {
        return provideDiaryRepository(this.apiDelegateProvider.get(), this.diaryDaoProvider.get(), this.shownNotesDaoProvider.get(), this.userRepositoryProvider.get(), this.botRepositoryProvider.get(), this.messagesSourceProvider.get(), this.coroutineScopeProvider.get(), this.loggerProvider.get());
    }

    public static DataModule_Companion_ProvideDiaryRepositoryFactory create(Provider<DiaryApiDelegate> provider, Provider<DiaryDao> provider2, Provider<ShownDiaryNotesDao> provider3, Provider<UserRepository> provider4, Provider<BotRepository> provider5, Provider<MessagesSource> provider6, Provider<CoroutineScope> provider7, Provider<Logger> provider8) {
        return new DataModule_Companion_ProvideDiaryRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static DiaryRepository provideDiaryRepository(DiaryApiDelegate diaryApiDelegate, DiaryDao diaryDao, ShownDiaryNotesDao shownDiaryNotesDao, UserRepository userRepository, BotRepository botRepository, MessagesSource messagesSource, CoroutineScope coroutineScope, Logger logger) {
        return (DiaryRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideDiaryRepository(diaryApiDelegate, diaryDao, shownDiaryNotesDao, userRepository, botRepository, messagesSource, coroutineScope, logger));
    }
}
