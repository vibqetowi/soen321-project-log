package com.ifriend.domain.logic.topics;

import com.ifriend.domain.data.topics.ChatPremiumTopicsRepository;
import com.ifriend.domain.data.topics.ChatTopicsRepository;
import com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase;
import com.ifriend.domain.useCases.diary.DiaryNotesService;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPanelActionsInteractor_Factory implements Factory<ChatPanelActionsInteractor> {
    private final Provider<DiaryNotesService> diaryNotesServiceProvider;
    private final Provider<GetLevelInfoUseCase> getLevelInfoUseCaseProvider;
    private final Provider<IsChatFeatureAvailableUseCase> isChatFeatureAvailableUseCaseProvider;
    private final Provider<ChatPremiumTopicsRepository> premiumTopicsRepositoryProvider;
    private final Provider<ChatTopicsRepository> topicsRepositoryProvider;

    public ChatPanelActionsInteractor_Factory(Provider<ChatTopicsRepository> provider, Provider<ChatPremiumTopicsRepository> provider2, Provider<DiaryNotesService> provider3, Provider<GetLevelInfoUseCase> provider4, Provider<IsChatFeatureAvailableUseCase> provider5) {
        this.topicsRepositoryProvider = provider;
        this.premiumTopicsRepositoryProvider = provider2;
        this.diaryNotesServiceProvider = provider3;
        this.getLevelInfoUseCaseProvider = provider4;
        this.isChatFeatureAvailableUseCaseProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ChatPanelActionsInteractor get() {
        return newInstance(this.topicsRepositoryProvider.get(), this.premiumTopicsRepositoryProvider.get(), this.diaryNotesServiceProvider.get(), this.getLevelInfoUseCaseProvider.get(), this.isChatFeatureAvailableUseCaseProvider.get());
    }

    public static ChatPanelActionsInteractor_Factory create(Provider<ChatTopicsRepository> provider, Provider<ChatPremiumTopicsRepository> provider2, Provider<DiaryNotesService> provider3, Provider<GetLevelInfoUseCase> provider4, Provider<IsChatFeatureAvailableUseCase> provider5) {
        return new ChatPanelActionsInteractor_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatPanelActionsInteractor newInstance(ChatTopicsRepository chatTopicsRepository, ChatPremiumTopicsRepository chatPremiumTopicsRepository, DiaryNotesService diaryNotesService, GetLevelInfoUseCase getLevelInfoUseCase, IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase) {
        return new ChatPanelActionsInteractor(chatTopicsRepository, chatPremiumTopicsRepository, diaryNotesService, getLevelInfoUseCase, isChatFeatureAvailableUseCase);
    }
}
