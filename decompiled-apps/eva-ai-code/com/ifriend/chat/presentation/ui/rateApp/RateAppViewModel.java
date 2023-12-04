package com.ifriend.chat.presentation.ui.rateApp;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.usecase.rateUs.AnalyticsRateUsModalUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsReviewUsModalUseCase;
import com.ifriend.chat.presentation.ui.rateApp.RateAppState;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: RateAppViewModel.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ifriend/chat/presentation/ui/rateApp/RateAppViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "rateUsRepository", "Lcom/ifriend/domain/data/RateUsRepository;", "analyticsRateUsModalUseCase", "Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;", "analyticsReviewUsModalUseCase", "Lcom/ifriend/analytics/usecase/rateUs/AnalyticsReviewUsModalUseCase;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "rateUsUseCase", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;", "onUserRatedAppUseCase", "Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;", "dispatcher", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/data/RateUsRepository;Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;Lcom/ifriend/analytics/usecase/rateUs/AnalyticsReviewUsModalUseCase;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;Lcom/ifriend/domain/CoroutineDispatchers;)V", "handleSendReview", "", "handleSendReviewMessage", "onCancel", "reviewInput", "text", "", "setStars", "starsAmount", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RateAppViewModel extends BaseViewModel<RateAppState> {
    private static final int MAX_CHARACTER_COUNT = 140;
    private final AnalyticsRateUsModalUseCase analyticsRateUsModalUseCase;
    private final AnalyticsReviewUsModalUseCase analyticsReviewUsModalUseCase;
    private final BotRepository botRepository;
    private final CoroutineScope coroutineScope;
    private final InternalNotificationHandler internalNotificationHandler;
    private final OnUserRatedAppUseCase onUserRatedAppUseCase;
    private final RateUsRepository rateUsRepository;
    private final ShowRateUsUseCase rateUsUseCase;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RateAppViewModel(BotRepository botRepository, RateUsRepository rateUsRepository, AnalyticsRateUsModalUseCase analyticsRateUsModalUseCase, AnalyticsReviewUsModalUseCase analyticsReviewUsModalUseCase, InternalNotificationHandler internalNotificationHandler, CoroutineScope coroutineScope, ShowRateUsUseCase rateUsUseCase, OnUserRatedAppUseCase onUserRatedAppUseCase, CoroutineDispatchers dispatcher) {
        super(dispatcher, new RateAppState.StarsState("", null, 2, null));
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(rateUsRepository, "rateUsRepository");
        Intrinsics.checkNotNullParameter(analyticsRateUsModalUseCase, "analyticsRateUsModalUseCase");
        Intrinsics.checkNotNullParameter(analyticsReviewUsModalUseCase, "analyticsReviewUsModalUseCase");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(rateUsUseCase, "rateUsUseCase");
        Intrinsics.checkNotNullParameter(onUserRatedAppUseCase, "onUserRatedAppUseCase");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.botRepository = botRepository;
        this.rateUsRepository = rateUsRepository;
        this.analyticsRateUsModalUseCase = analyticsRateUsModalUseCase;
        this.analyticsReviewUsModalUseCase = analyticsReviewUsModalUseCase;
        this.internalNotificationHandler = internalNotificationHandler;
        this.coroutineScope = coroutineScope;
        this.rateUsUseCase = rateUsUseCase;
        this.onUserRatedAppUseCase = onUserRatedAppUseCase;
        changeState(new AnonymousClass1());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* compiled from: RateAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/rateApp/RateAppViewModel$Companion;", "", "()V", "MAX_CHARACTER_COUNT", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: RateAppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.rateApp.RateAppViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<RateAppState, RateAppState> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final RateAppState invoke(RateAppState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Bot currentBot = RateAppViewModel.this.botRepository.getCurrentBot();
            return new RateAppState.StarsState((currentBot == null || (r0 = currentBot.getName()) == null) ? "EVA AI ex-Journey" : "EVA AI ex-Journey", null, 2, null);
        }
    }

    /* compiled from: RateAppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.rateApp.RateAppViewModel$2", f = "RateAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.rateApp.RateAppViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RateAppViewModel.this.rateUsUseCase.onShowed();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleSendReview() {
        Integer stars;
        RateAppState currentState = currentState();
        if (!(currentState instanceof RateAppState.StarsState) || (stars = ((RateAppState.StarsState) currentState).getStars()) == null) {
            return;
        }
        int intValue = stars.intValue();
        this.analyticsRateUsModalUseCase.handle(true, Integer.valueOf(intValue));
        if (intValue < 5) {
            changeState(RateAppViewModel$handleSendReview$1.INSTANCE);
            return;
        }
        this.onUserRatedAppUseCase.execute();
        postEvent(OpenStore.INSTANCE);
    }

    public final void handleSendReviewMessage() {
        RateAppState currentState = currentState();
        if (currentState instanceof RateAppState.ReviewState) {
            RateAppState.ReviewState reviewState = (RateAppState.ReviewState) currentState;
            if (reviewState.getCurrentCharacterCount() <= 0) {
                return;
            }
            this.analyticsReviewUsModalUseCase.handle(true, reviewState.getReview());
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, getCoroutineErrorHandler(), null, new RateAppViewModel$handleSendReviewMessage$1(this, currentState, null), 2, null);
        }
    }

    public final void setStars(int i) {
        RateAppState currentState = currentState();
        if (currentState instanceof RateAppState.StarsState) {
            changeState(new RateAppViewModel$setStars$1(currentState, i));
        }
    }

    public final void reviewInput(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        RateAppState currentState = currentState();
        if (currentState instanceof RateAppState.ReviewState) {
            changeState(new RateAppViewModel$reviewInput$1(currentState, text));
        }
    }

    public final void onCancel() {
        RateAppState currentState = currentState();
        if (currentState instanceof RateAppState.StarsState) {
            this.analyticsRateUsModalUseCase.handle(false, ((RateAppState.StarsState) currentState).getStars());
        } else if (currentState instanceof RateAppState.ReviewState) {
            this.analyticsReviewUsModalUseCase.handle(false, ((RateAppState.ReviewState) currentState).getReview());
        }
    }
}
