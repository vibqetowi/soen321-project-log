package com.ifriend.domain.logic.experiments.checker;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.experiments.FeatureTogglePayloadsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatIdConditionsCheckerUseCase_Factory implements Factory<ChatIdConditionsCheckerUseCase> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<FeatureTogglePayloadsRepository> featureTogglePayloadsRepositoryProvider;

    public ChatIdConditionsCheckerUseCase_Factory(Provider<ChatsInfoRepository> provider, Provider<FeatureTogglePayloadsRepository> provider2, Provider<AnalyticsInteractor> provider3) {
        this.chatsInfoRepositoryProvider = provider;
        this.featureTogglePayloadsRepositoryProvider = provider2;
        this.analyticsInteractorProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatIdConditionsCheckerUseCase get() {
        return newInstance(this.chatsInfoRepositoryProvider.get(), this.featureTogglePayloadsRepositoryProvider.get(), this.analyticsInteractorProvider.get());
    }

    public static ChatIdConditionsCheckerUseCase_Factory create(Provider<ChatsInfoRepository> provider, Provider<FeatureTogglePayloadsRepository> provider2, Provider<AnalyticsInteractor> provider3) {
        return new ChatIdConditionsCheckerUseCase_Factory(provider, provider2, provider3);
    }

    public static ChatIdConditionsCheckerUseCase newInstance(ChatsInfoRepository chatsInfoRepository, FeatureTogglePayloadsRepository featureTogglePayloadsRepository, AnalyticsInteractor analyticsInteractor) {
        return new ChatIdConditionsCheckerUseCase(chatsInfoRepository, featureTogglePayloadsRepository, analyticsInteractor);
    }
}
