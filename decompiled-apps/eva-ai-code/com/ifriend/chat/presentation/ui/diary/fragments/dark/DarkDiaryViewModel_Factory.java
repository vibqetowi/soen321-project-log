package com.ifriend.chat.presentation.ui.diary.fragments.dark;

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
public final class DarkDiaryViewModel_Factory implements Factory<DarkDiaryViewModel> {
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

    public DarkDiaryViewModel_Factory(Provider<CoroutineDispatchers> provider, Provider<RouterProvider> provider2, Provider<BotRepository> provider3, Provider<GetDiaryNotesListUseCase> provider4, Provider<ReplyDiaryNoteUseCase> provider5, Provider<RefreshDiaryUseCase> provider6, Provider<OnDiaryShownUseCase> provider7, Provider<Logger> provider8, Provider<AppEventsEmitter> provider9, Provider<PaymentResultFlow> provider10) {
        this.dispatchersProvider = provider;
        this.routerProvider = provider2;
        this.botRepositoryProvider = provider3;
        this.getDiaryNotesListUseCaseProvider = provider4;
        this.replyDiaryNoteUseCaseProvider = provider5;
        this.refreshDiaryUseCaseProvider = provider6;
        this.onDiaryShownUseCaseProvider = provider7;
        this.loggerProvider = provider8;
        this.appEventsEmitterProvider = provider9;
        this.paymentResultFlowProvider = provider10;
    }

    @Override // javax.inject.Provider
    public DarkDiaryViewModel get() {
        return newInstance(this.dispatchersProvider.get(), this.routerProvider.get(), this.botRepositoryProvider.get(), this.getDiaryNotesListUseCaseProvider.get(), this.replyDiaryNoteUseCaseProvider.get(), this.refreshDiaryUseCaseProvider.get(), this.onDiaryShownUseCaseProvider.get(), this.loggerProvider.get(), this.appEventsEmitterProvider.get(), this.paymentResultFlowProvider.get());
    }

    public static DarkDiaryViewModel_Factory create(Provider<CoroutineDispatchers> provider, Provider<RouterProvider> provider2, Provider<BotRepository> provider3, Provider<GetDiaryNotesListUseCase> provider4, Provider<ReplyDiaryNoteUseCase> provider5, Provider<RefreshDiaryUseCase> provider6, Provider<OnDiaryShownUseCase> provider7, Provider<Logger> provider8, Provider<AppEventsEmitter> provider9, Provider<PaymentResultFlow> provider10) {
        return new DarkDiaryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static DarkDiaryViewModel newInstance(CoroutineDispatchers coroutineDispatchers, RouterProvider routerProvider, BotRepository botRepository, GetDiaryNotesListUseCase getDiaryNotesListUseCase, ReplyDiaryNoteUseCase replyDiaryNoteUseCase, RefreshDiaryUseCase refreshDiaryUseCase, OnDiaryShownUseCase onDiaryShownUseCase, Logger logger, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow) {
        return new DarkDiaryViewModel(coroutineDispatchers, routerProvider, botRepository, getDiaryNotesListUseCase, replyDiaryNoteUseCase, refreshDiaryUseCase, onDiaryShownUseCase, logger, appEventsEmitter, paymentResultFlow);
    }
}
