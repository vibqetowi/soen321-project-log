package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.info.IsMultiChatEnabledUseCase;
import com.ifriend.domain.logic.chat.models.ChatInfoTag;
import com.ifriend.domain.logic.onboarding.GetOnboardingConfigurationChatsUseCase;
import com.ifriend.domain.logic.onboarding.OnboardingChatInfo;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingBotPagerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: OnboardingBotPagerViewModel.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B[\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\u0010\u001aJ\u0011\u0010(\u001a\u00020)H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u000201H\u0002J \u00102\u001a\u00020\u00042\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0002J0\u00107\u001a\u00020\u0004*\u00020\f2!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000309H\u0097\u0001JD\u0010=\u001a\u00020\u001c*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010>\u001a\u00020\f2!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000309H\u0096\u0001JD\u0010@\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000309H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010AJ)\u0010B\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010C\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010DJD\u0010E\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000309H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010AR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingBotPagerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "", "onboardingAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "getOnboardingConfigurationChatsUseCase", "Lcom/ifriend/domain/logic/onboarding/GetOnboardingConfigurationChatsUseCase;", "onboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "onboardingScope", "Lkotlinx/coroutines/CoroutineScope;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "isMultiChatEnabledUseCase", "Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "(Lcom/ifriend/domain/onboarding/OnboardingAnalytics;Lcom/ifriend/domain/logic/onboarding/GetOnboardingConfigurationChatsUseCase;Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "job", "Lkotlinx/coroutines/Job;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "isNeedShowSelectBot", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onButtonClick", "onPageChanged", "currentPage", "", "showCurrentBot", "currentBot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "updateSelectBot", "botId", "", "botName", "userId", "asyncReduce", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingBotPagerViewModel extends ViewModel implements UiStateDelegate<OnboardingBotPagerState, Unit> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<OnboardingBotPagerState, Unit> $$delegate_0;
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final DispatcherProvider dispatchers;
    private final GetBotUseCase getBotUseCase;
    private final GetOnboardingConfigurationChatsUseCase getOnboardingConfigurationChatsUseCase;
    private final IsMultiChatEnabledUseCase isMultiChatEnabledUseCase;
    private Job job;
    private final OnboardingAnalytics onboardingAnalytics;
    private final OnboardingAnswersRepository onboardingAnswersRepository;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    private final CoroutineScope onboardingScope;
    private final ResourceProvider resources;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super OnboardingBotPagerState, ? extends OnboardingBotPagerState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<OnboardingBotPagerState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super OnboardingBotPagerState, ? extends OnboardingBotPagerState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Unit> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public OnboardingBotPagerState getUiState(UiStateDelegate<OnboardingBotPagerState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<OnboardingBotPagerState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<OnboardingBotPagerState, Unit> uiStateDelegate, Function1<? super OnboardingBotPagerState, ? extends OnboardingBotPagerState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<OnboardingBotPagerState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<OnboardingBotPagerState, Unit> uiStateDelegate, Function1<? super OnboardingBotPagerState, ? extends OnboardingBotPagerState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<OnboardingBotPagerState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    public OnboardingBotPagerViewModel(OnboardingAnalytics onboardingAnalytics, GetOnboardingConfigurationChatsUseCase getOnboardingConfigurationChatsUseCase, OnboardingAnswersRepository onboardingAnswersRepository, CoroutineScope onboardingScope, GetBotUseCase getBotUseCase, IsMultiChatEnabledUseCase isMultiChatEnabledUseCase, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, ResourceProvider resources, DispatcherProvider dispatchers, MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow) {
        Intrinsics.checkNotNullParameter(onboardingAnalytics, "onboardingAnalytics");
        Intrinsics.checkNotNullParameter(getOnboardingConfigurationChatsUseCase, "getOnboardingConfigurationChatsUseCase");
        Intrinsics.checkNotNullParameter(onboardingAnswersRepository, "onboardingAnswersRepository");
        Intrinsics.checkNotNullParameter(onboardingScope, "onboardingScope");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(isMultiChatEnabledUseCase, "isMultiChatEnabledUseCase");
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(onboardingEventsFlow, "onboardingEventsFlow");
        this.onboardingAnalytics = onboardingAnalytics;
        this.getOnboardingConfigurationChatsUseCase = getOnboardingConfigurationChatsUseCase;
        this.onboardingAnswersRepository = onboardingAnswersRepository;
        this.onboardingScope = onboardingScope;
        this.getBotUseCase = getBotUseCase;
        this.isMultiChatEnabledUseCase = isMultiChatEnabledUseCase;
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
        this.resources = resources;
        this.dispatchers = dispatchers;
        this.onboardingEventsFlow = onboardingEventsFlow;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new OnboardingBotPagerState(null, null, false, false, null, 0, 0, 127, null), 0, null, 6, null);
        OnboardingBotPagerViewModel onboardingBotPagerViewModel = this;
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(onboardingBotPagerViewModel), new AnonymousClass1());
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(onboardingBotPagerViewModel), null, dispatchers.background(), new AnonymousClass2(getBotUseCase.current(), this, null), 1, null);
    }

    /* compiled from: OnboardingBotPagerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotPagerViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<OnboardingBotPagerState, OnboardingBotPagerState> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingBotPagerState invoke(OnboardingBotPagerState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return OnboardingBotPagerState.copy$default(state, OnboardingBotPagerViewModel.this.resources.getString(R.string.onboarding__select_bot__title), OnboardingBotPagerViewModel.this.resources.getString(R.string.onboarding__select_bot__button), false, false, null, 0, 0, 124, null);
        }
    }

    /* compiled from: OnboardingBotPagerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotPagerViewModel$2", f = "OnboardingBotPagerViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, 56, 74, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotPagerViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bot $currentBot;
        int label;
        final /* synthetic */ OnboardingBotPagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Bot bot, OnboardingBotPagerViewModel onboardingBotPagerViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentBot = bot;
            this.this$0 = onboardingBotPagerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$currentBot, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Bot bot;
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$currentBot != null) {
                    this.label = 1;
                    obj = this.this$0.isNeedShowSelectBot(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                bot = this.$currentBot;
                if (bot == null) {
                    this.this$0.showCurrentBot(bot);
                } else {
                    this.label = 4;
                    if (this.this$0.onboardingEventsFlow.emit(OnboardingStepEvent.OnStepFinished.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (!list.isEmpty()) {
                    this.this$0.showCurrentBot(this.$currentBot);
                } else {
                    List<Pair> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Pair pair : list2) {
                        ChatConfig chatConfig = (ChatConfig) pair.getSecond();
                        arrayList.add(new OnboardingBotPagerState.Bot(chatConfig.getId(), chatConfig.getChatId(), chatConfig.getName(), chatConfig.getImages().getProfileAvatarUrl(), chatConfig.getImages().getProfileAvatarUrl(), chatConfig.getImages().getRoundAvatarUrl(), chatConfig.getDescriptions().getPrecondition(), chatConfig.getTags().contains(ChatInfoTag.VERIFIED_ACCOUNT.getKey())));
                    }
                    PersistentList persistentList = ExtensionsKt.toPersistentList(arrayList);
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (((OnboardingChatInfo) ((Pair) it.next()).component1()).isSelected()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    int coerceIn = RangesKt.coerceIn(i2, 0, list.size());
                    UiStateDelegate<OnboardingBotPagerState, Unit> uiStateDelegate = this.this$0;
                    this.label = 3;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(this.this$0, persistentList, coerceIn), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } else {
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.label = 2;
                obj = this.this$0.getOnboardingConfigurationChatsUseCase.execute(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                }
                return Unit.INSTANCE;
            }
            bot = this.$currentBot;
            if (bot == null) {
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingBotPagerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotPagerViewModel$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<OnboardingBotPagerState, OnboardingBotPagerState> {
            final /* synthetic */ PersistentList<OnboardingBotPagerState.Bot> $bots;
            final /* synthetic */ int $initPageIndex;
            final /* synthetic */ OnboardingBotPagerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OnboardingBotPagerViewModel onboardingBotPagerViewModel, PersistentList<OnboardingBotPagerState.Bot> persistentList, int i) {
                super(1);
                this.this$0 = onboardingBotPagerViewModel;
                this.$bots = persistentList;
                this.$initPageIndex = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public final OnboardingBotPagerState invoke(OnboardingBotPagerState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return OnboardingBotPagerState.copy$default(state, this.this$0.resources.getString(R.string.onboarding__select_bot__title), null, true, false, this.$bots, this.$initPageIndex, 0, 74, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCurrentBot(Bot bot) {
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new OnboardingBotPagerViewModel$showCurrentBot$1(this, bot));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isNeedShowSelectBot(Continuation<? super Boolean> continuation) {
        OnboardingBotPagerViewModel$isNeedShowSelectBot$1 onboardingBotPagerViewModel$isNeedShowSelectBot$1;
        int i;
        if (continuation instanceof OnboardingBotPagerViewModel$isNeedShowSelectBot$1) {
            onboardingBotPagerViewModel$isNeedShowSelectBot$1 = (OnboardingBotPagerViewModel$isNeedShowSelectBot$1) continuation;
            if ((onboardingBotPagerViewModel$isNeedShowSelectBot$1.label & Integer.MIN_VALUE) != 0) {
                onboardingBotPagerViewModel$isNeedShowSelectBot$1.label -= Integer.MIN_VALUE;
                Object obj = onboardingBotPagerViewModel$isNeedShowSelectBot$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onboardingBotPagerViewModel$isNeedShowSelectBot$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> execute = this.isMultiChatEnabledUseCase.execute();
                    onboardingBotPagerViewModel$isNeedShowSelectBot$1.label = 1;
                    obj = FlowKt.firstOrNull(execute, onboardingBotPagerViewModel$isNeedShowSelectBot$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(Intrinsics.areEqual(obj, Boxing.boxBoolean(true)));
            }
        }
        onboardingBotPagerViewModel$isNeedShowSelectBot$1 = new OnboardingBotPagerViewModel$isNeedShowSelectBot$1(this, continuation);
        Object obj2 = onboardingBotPagerViewModel$isNeedShowSelectBot$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onboardingBotPagerViewModel$isNeedShowSelectBot$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(obj2, Boxing.boxBoolean(true)));
    }

    public final void onPageChanged(int i) {
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new OnboardingBotPagerViewModel$onPageChanged$1(i));
    }

    public final void onButtonClick() {
        if (com.ifriend.common_utils.extensions.CoroutinesKt.isActive(this.job)) {
            return;
        }
        Bot current = this.getBotUseCase.current();
        OnboardingBotPagerState uiState = getUiState((UiStateDelegate<OnboardingBotPagerState, Unit>) this);
        if (current != null && (!uiState.getBots().isEmpty())) {
            this.job = CoroutinesKt.safeLaunch$default(this.onboardingScope, null, this.dispatchers.background(), new OnboardingBotPagerViewModel$onButtonClick$1(uiState, this, null), 1, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OnboardingBotPagerViewModel$onButtonClick$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectBot(String str, String str2, String str3) {
        CoroutinesKt.safeLaunch$default(this.onboardingScope, null, this.dispatchers.background(), new OnboardingBotPagerViewModel$updateSelectBot$1(this, str2, str3, str, null), 1, null);
    }
}
