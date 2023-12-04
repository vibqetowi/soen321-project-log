package com.ifriend.chat.presentation.ui.diary.fragments.light;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase;
import com.ifriend.domain.useCases.diary.OnDiaryShownUseCase;
import com.ifriend.domain.useCases.diary.RefreshDiaryUseCase;
import com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LightDiaryViewModel_Factory implements Factory<LightDiaryViewModel> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GetDiaryNotesListUseCase> getDiaryNotesListUseCaseProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<OnDiaryShownUseCase> onDiaryShownUseCaseProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;
    private final Provider<RefreshDiaryUseCase> refreshDiaryUseCaseProvider;
    private final Provider<ReplyDiaryNoteUseCase> replyDiaryNoteUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public LightDiaryViewModel_Factory(Provider<CoroutineDispatchers> provider, Provider<AppEventsEmitter> provider2, Provider<PaymentResultFlow> provider3, Provider<RouterProvider> provider4, Provider<BotRepository> provider5, Provider<GetDiaryNotesListUseCase> provider6, Provider<ReplyDiaryNoteUseCase> provider7, Provider<RefreshDiaryUseCase> provider8, Provider<OnDiaryShownUseCase> provider9, Provider<Logger> provider10) {
        this.dispatchersProvider = provider;
        this.appEventsEmitterProvider = provider2;
        this.paymentResultFlowProvider = provider3;
        this.routerProvider = provider4;
        this.botRepositoryProvider = provider5;
        this.getDiaryNotesListUseCaseProvider = provider6;
        this.replyDiaryNoteUseCaseProvider = provider7;
        this.refreshDiaryUseCaseProvider = provider8;
        this.onDiaryShownUseCaseProvider = provider9;
        this.loggerProvider = provider10;
    }

    @Override // javax.inject.Provider
    public LightDiaryViewModel get() {
        return newInstance(this.dispatchersProvider.get(), this.appEventsEmitterProvider.get(), this.paymentResultFlowProvider.get(), this.routerProvider.get(), this.botRepositoryProvider.get(), this.getDiaryNotesListUseCaseProvider.get(), this.replyDiaryNoteUseCaseProvider.get(), this.refreshDiaryUseCaseProvider.get(), this.onDiaryShownUseCaseProvider.get(), this.loggerProvider.get());
    }

    public static LightDiaryViewModel_Factory create(Provider<CoroutineDispatchers> provider, Provider<AppEventsEmitter> provider2, Provider<PaymentResultFlow> provider3, Provider<RouterProvider> provider4, Provider<BotRepository> provider5, Provider<GetDiaryNotesListUseCase> provider6, Provider<ReplyDiaryNoteUseCase> provider7, Provider<RefreshDiaryUseCase> provider8, Provider<OnDiaryShownUseCase> provider9, Provider<Logger> provider10) {
        return new LightDiaryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static LightDiaryViewModel newInstance(CoroutineDispatchers coroutineDispatchers, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, RouterProvider routerProvider, BotRepository botRepository, GetDiaryNotesListUseCase getDiaryNotesListUseCase, ReplyDiaryNoteUseCase replyDiaryNoteUseCase, RefreshDiaryUseCase refreshDiaryUseCase, OnDiaryShownUseCase onDiaryShownUseCase, Logger logger) {
        return new LightDiaryViewModel(coroutineDispatchers, appEventsEmitter, paymentResultFlow, routerProvider, botRepository, getDiaryNotesListUseCase, replyDiaryNoteUseCase, refreshDiaryUseCase, onDiaryShownUseCase, logger);
    }
}
