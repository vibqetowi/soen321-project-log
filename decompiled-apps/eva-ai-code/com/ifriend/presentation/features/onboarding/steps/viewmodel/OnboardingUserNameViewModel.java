package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.common_utils.extensions.CoroutinesKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.view.textfield.OnboardingTextFieldState;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: OnboardingUserNameViewModel.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 32\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00013B;\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#J0\u0010$\u001a\u00020\u0004*\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b(\u0012\b\b\"\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030'H\u0097\u0001JD\u0010*\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010+\u001a\u00020%2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b(\u0012\b\b\"\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030'H\u0096\u0001JD\u0010-\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b(\u0012\b\b\"\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030'H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010.J)\u0010/\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00100\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u00101JD\u00102\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b(\u0012\b\b\"\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030'H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010.R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingUserNameViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/onboarding/steps/view/textfield/OnboardingTextFieldState;", "", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "onboardingAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "changeUserNameUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/onboarding/OnboardingAnalytics;Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "job", "Lkotlinx/coroutines/Job;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/onboarding/steps/view/textfield/OnboardingTextFieldState;", "onButtonClick", "onNameChange", "name", "", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "state", "asyncUpdateUiState", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingUserNameViewModel extends ViewModel implements UiStateDelegate<OnboardingTextFieldState, Unit> {
    private static final int NAME_MAX_LENGTH = 14;
    private final /* synthetic */ UiStateDelegateImpl<OnboardingTextFieldState, Unit> $$delegate_0;
    private final ChangeUserNameUseCase changeUserNameUseCase;
    private final DispatcherProvider dispatchers;
    private Job job;
    private final OnboardingAnalytics onboardingAnalytics;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    private final ResourceProvider resources;
    private final UserRepository userRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super OnboardingTextFieldState, ? extends OnboardingTextFieldState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<OnboardingTextFieldState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super OnboardingTextFieldState, ? extends OnboardingTextFieldState> transform) {
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
    public OnboardingTextFieldState getUiState(UiStateDelegate<OnboardingTextFieldState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<OnboardingTextFieldState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<OnboardingTextFieldState, Unit> uiStateDelegate, Function1<? super OnboardingTextFieldState, ? extends OnboardingTextFieldState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<OnboardingTextFieldState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<OnboardingTextFieldState, Unit> uiStateDelegate, Function1<? super OnboardingTextFieldState, ? extends OnboardingTextFieldState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<OnboardingTextFieldState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    public OnboardingUserNameViewModel(ResourceProvider resources, DispatcherProvider dispatchers, UserRepository userRepository, OnboardingAnalytics onboardingAnalytics, ChangeUserNameUseCase changeUserNameUseCase, MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(onboardingAnalytics, "onboardingAnalytics");
        Intrinsics.checkNotNullParameter(changeUserNameUseCase, "changeUserNameUseCase");
        Intrinsics.checkNotNullParameter(onboardingEventsFlow, "onboardingEventsFlow");
        this.resources = resources;
        this.dispatchers = dispatchers;
        this.userRepository = userRepository;
        this.onboardingAnalytics = onboardingAnalytics;
        this.changeUserNameUseCase = changeUserNameUseCase;
        this.onboardingEventsFlow = onboardingEventsFlow;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new OnboardingTextFieldState(null, null, null, null, null, false, false, 127, null), 0, null, 6, null);
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new AnonymousClass1());
    }

    /* compiled from: OnboardingUserNameViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingUserNameViewModel$Companion;", "", "()V", "NAME_MAX_LENGTH", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: OnboardingUserNameViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/textfield/OnboardingTextFieldState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserNameViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<OnboardingTextFieldState, OnboardingTextFieldState> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingTextFieldState invoke(OnboardingTextFieldState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return OnboardingTextFieldState.copy$default(state, OnboardingUserNameViewModel.this.resources.getString(R.string.onboarding__user_name__title), OnboardingUserNameViewModel.this.resources.getString(R.string.onboarding__user_name__description), null, OnboardingUserNameViewModel.this.resources.getString(R.string.onboarding__user_name__placeholder), OnboardingUserNameViewModel.this.resources.getString(R.string.onboarding__user_name__button), false, false, 100, null);
        }
    }

    public final void onNameChange(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new OnboardingUserNameViewModel$onNameChange$1(name));
    }

    public final void onButtonClick() {
        String textFieldValue = getUiState((UiStateDelegate<OnboardingTextFieldState, Unit>) this).getTextFieldValue();
        if (StringsKt.isBlank(textFieldValue) || CoroutinesKt.isActive(this.job)) {
            return;
        }
        Job safeLaunch$default = com.ifriend.core.utils.CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new OnboardingUserNameViewModel$onButtonClick$1(this, textFieldValue, null), 3, null);
        safeLaunch$default.invokeOnCompletion(new OnboardingUserNameViewModel$onButtonClick$2$1(this));
        this.job = safeLaunch$default;
    }
}
