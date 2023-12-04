package com.ifriend.chat.presentation.ui.avatarGeneration;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.usecase.avatarAi.AnalyticsAvatarAiApplyUseCase;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.notifications.AvatarGenerated;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SelectGeneratedAvatarViewModel.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001fJ\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0014R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "neuronsCostsStorage", "Lcom/ifriend/domain/storage/NeuronsCostsStorage;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "routerProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "logger", "Lcom/ifriend/common_utils/Logger;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "analyticsAvatarAiApplyUseCase", "Lcom/ifriend/analytics/usecase/avatarAi/AnalyticsAvatarAiApplyUseCase;", "longTermNotificationManager", "Lcom/ifriend/domain/notifications/LongTermNotificationManager;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/domain/storage/NeuronsCostsStorage;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;Lcom/ifriend/analytics/usecase/avatarAi/AnalyticsAvatarAiApplyUseCase;Lcom/ifriend/domain/notifications/LongTermNotificationManager;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/domain/CoroutineDispatchers;)V", "router", "Lcom/ifriend/base/navigation/api/AppRouter;", "avatarChosen", "", "position", "", "clearAvatarGeneratedNotification", "generateAgain", "init", "imageSize", "onCoroutineError", "throwable", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarViewModel extends BaseViewModel<SelectGeneratedAvatarState> {
    public static final int $stable = 8;
    private final AnalyticsAvatarAiApplyUseCase analyticsAvatarAiApplyUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final CoroutineScope coroutineScope;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;
    private final GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    private final Logger logger;
    private final LongTermNotificationManager longTermNotificationManager;
    private final NeuronsCostsStorage neuronsCostsStorage;
    private final PaymentResultFlow paymentResultFlow;
    private final AppRouter router;
    private final RouterProvider routerProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SelectGeneratedAvatarViewModel(GenerateBotAvatarRepository generateBotAvatarRepository, NeuronsCostsStorage neuronsCostsStorage, CoroutineScope coroutineScope, RouterProvider routerProvider, Logger logger, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, AnalyticsAvatarAiApplyUseCase analyticsAvatarAiApplyUseCase, LongTermNotificationManager longTermNotificationManager, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, CoroutineDispatchers dispatchers) {
        super(dispatchers, SelectGeneratedAvatarState.Companion.empty());
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(neuronsCostsStorage, "neuronsCostsStorage");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(routerProvider, "routerProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
        Intrinsics.checkNotNullParameter(analyticsAvatarAiApplyUseCase, "analyticsAvatarAiApplyUseCase");
        Intrinsics.checkNotNullParameter(longTermNotificationManager, "longTermNotificationManager");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.neuronsCostsStorage = neuronsCostsStorage;
        this.coroutineScope = coroutineScope;
        this.routerProvider = routerProvider;
        this.logger = logger;
        this.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
        this.analyticsAvatarAiApplyUseCase = analyticsAvatarAiApplyUseCase;
        this.longTermNotificationManager = longTermNotificationManager;
        this.appEventsEmitter = appEventsEmitter;
        this.paymentResultFlow = paymentResultFlow;
        this.router = routerProvider.getRoute();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.mvvm.BaseViewModel
    public void onCoroutineError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.logger.logException(throwable);
        changeState(SelectGeneratedAvatarViewModel$onCoroutineError$1.INSTANCE);
    }

    public final void init(int i) {
        if (currentState().getGeneratedAvatars().isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), getCoroutineErrorHandler(), null, new SelectGeneratedAvatarViewModel$init$1(this, i, null), 2, null);
        }
    }

    public final void avatarChosen(int i) {
        changeState(SelectGeneratedAvatarViewModel$avatarChosen$1.INSTANCE);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, getCoroutineErrorHandler(), null, new SelectGeneratedAvatarViewModel$avatarChosen$2(this, i, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, getCoroutineErrorHandler(), null, new SelectGeneratedAvatarViewModel$avatarChosen$3(this, null), 2, null);
    }

    public final void generateAgain() {
        changeState(SelectGeneratedAvatarViewModel$generateAgain$1.INSTANCE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), getCoroutineErrorHandler(), null, new SelectGeneratedAvatarViewModel$generateAgain$2(this, null), 2, null);
    }

    public final void clearAvatarGeneratedNotification() {
        this.longTermNotificationManager.deleteAllTypeOfNotification(AvatarGenerated.class);
    }
}
