package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonUiParams;
import com.ifriend.presentation.features.onboarding.steps.view.selector.OnboardingSelectorState;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: OnboardingBotVoiceViewModel.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 12\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00011B;\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 J0\u0010!\u001a\u00020\u0004*\u00020\n2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00030#H\u0097\u0001JD\u0010'\u001a\u00020(*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010)\u001a\u00020\n2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00030#H\u0096\u0001JD\u0010+\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00030#H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010,J)\u0010-\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010.\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010/JD\u00100\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00030#H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010,R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingBotVoiceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "", "onboardingAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "onboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "onboardingScope", "Lkotlinx/coroutines/CoroutineScope;", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "(Lcom/ifriend/domain/onboarding/OnboardingAnalytics;Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "onButtonClick", "buttonUiParams", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams;", "asyncReduce", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingBotVoiceViewModel extends ViewModel implements UiStateDelegate<OnboardingSelectorState, Unit> {
    public static final String FORMAL_BUTTON_ID = "formal";
    public static final String SPICY_BUTTON_ID = "sexual";
    private final /* synthetic */ UiStateDelegateImpl<OnboardingSelectorState, Unit> $$delegate_0;
    private final DispatcherProvider dispatchers;
    private final OnboardingAnalytics onboardingAnalytics;
    private final OnboardingAnswersRepository onboardingAnswersRepository;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    private final CoroutineScope onboardingScope;
    private final ResourceProvider resources;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super OnboardingSelectorState, ? extends OnboardingSelectorState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<OnboardingSelectorState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super OnboardingSelectorState, ? extends OnboardingSelectorState> transform) {
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
    public OnboardingSelectorState getUiState(UiStateDelegate<OnboardingSelectorState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<OnboardingSelectorState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<OnboardingSelectorState, Unit> uiStateDelegate, Function1<? super OnboardingSelectorState, ? extends OnboardingSelectorState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<OnboardingSelectorState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<OnboardingSelectorState, Unit> uiStateDelegate, Function1<? super OnboardingSelectorState, ? extends OnboardingSelectorState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<OnboardingSelectorState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    public OnboardingBotVoiceViewModel(OnboardingAnalytics onboardingAnalytics, OnboardingAnswersRepository onboardingAnswersRepository, CoroutineScope onboardingScope, ResourceProvider resources, DispatcherProvider dispatchers, MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow) {
        Intrinsics.checkNotNullParameter(onboardingAnalytics, "onboardingAnalytics");
        Intrinsics.checkNotNullParameter(onboardingAnswersRepository, "onboardingAnswersRepository");
        Intrinsics.checkNotNullParameter(onboardingScope, "onboardingScope");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(onboardingEventsFlow, "onboardingEventsFlow");
        this.onboardingAnalytics = onboardingAnalytics;
        this.onboardingAnswersRepository = onboardingAnswersRepository;
        this.onboardingScope = onboardingScope;
        this.resources = resources;
        this.dispatchers = dispatchers;
        this.onboardingEventsFlow = onboardingEventsFlow;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new OnboardingSelectorState(null, null, 3, null), 0, null, 6, null);
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new AnonymousClass1());
    }

    /* compiled from: OnboardingBotVoiceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingBotVoiceViewModel$Companion;", "", "()V", "FORMAL_BUTTON_ID", "", "SPICY_BUTTON_ID", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: OnboardingBotVoiceViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotVoiceViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<OnboardingSelectorState, OnboardingSelectorState> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingSelectorState invoke(OnboardingSelectorState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return state.copy(OnboardingBotVoiceViewModel.this.resources.getString(R.string.onboarding__bot_voice__title), ExtensionsKt.persistentListOf(new SelectButtonUiParams(OnboardingBotVoiceViewModel.SPICY_BUTTON_ID, OnboardingBotVoiceViewModel.this.resources.getString(R.string.onboarding__bot_voice__spicy), false, SelectButtonUiParams.Style.Primary), new SelectButtonUiParams(OnboardingBotVoiceViewModel.FORMAL_BUTTON_ID, OnboardingBotVoiceViewModel.this.resources.getString(R.string.onboarding__bot_voice__formal), false, SelectButtonUiParams.Style.Secondary)));
        }
    }

    public final void onButtonClick(SelectButtonUiParams buttonUiParams) {
        Intrinsics.checkNotNullParameter(buttonUiParams, "buttonUiParams");
        if (buttonUiParams.getSelected()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OnboardingBotVoiceViewModel$onButtonClick$1(this, null), 3, null);
            return;
        }
        String id = buttonUiParams.getId();
        OnboardingBotVoiceViewModel onboardingBotVoiceViewModel = this;
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(onboardingBotVoiceViewModel), new OnboardingBotVoiceViewModel$onButtonClick$2(id));
        CoroutinesKt.safeLaunch$default(this.onboardingScope, null, this.dispatchers.background(), new OnboardingBotVoiceViewModel$onButtonClick$3(id, this, null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(onboardingBotVoiceViewModel), null, null, new OnboardingBotVoiceViewModel$onButtonClick$4(this, null), 3, null);
    }
}
