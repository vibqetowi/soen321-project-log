package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: OnboardingUserGenderViewModel.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002BC\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020!J0\u0010'\u001a\u00020\u0004*\u00020\u00062!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030)H\u0097\u0001JD\u0010-\u001a\u00020.*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010/\u001a\u00020\u00062!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030)H\u0096\u0001JD\u00101\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030)H\u0097Aø\u0001\u0000¢\u0006\u0002\u00102J)\u00103\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00104\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u00105JD\u00106\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030)H\u0096Aø\u0001\u0000¢\u0006\u0002\u00102R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingUserGenderViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "", "onboardingScope", "Lkotlinx/coroutines/CoroutineScope;", "changeUserGenderUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;", "onboardingAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;Lcom/ifriend/domain/onboarding/OnboardingAnalytics;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/core/tools/api/DispatcherProvider;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "createButtonUiParams", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams;", "id", "", "text", "onButtonClick", "buttonUiParams", "asyncReduce", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingUserGenderViewModel extends ViewModel implements UiStateDelegate<OnboardingSelectorState, Unit> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<OnboardingSelectorState, Unit> $$delegate_0;
    private final ChangeUserGenderUseCase changeUserGenderUseCase;
    private final DispatcherProvider dispatchers;
    private final OnboardingAnalytics onboardingAnalytics;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    private final CoroutineScope onboardingScope;
    private final ResourceProvider resources;
    private final UserRepository userRepository;

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

    public OnboardingUserGenderViewModel(CoroutineScope onboardingScope, ChangeUserGenderUseCase changeUserGenderUseCase, OnboardingAnalytics onboardingAnalytics, ResourceProvider resources, UserRepository userRepository, DispatcherProvider dispatchers, MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow) {
        Intrinsics.checkNotNullParameter(onboardingScope, "onboardingScope");
        Intrinsics.checkNotNullParameter(changeUserGenderUseCase, "changeUserGenderUseCase");
        Intrinsics.checkNotNullParameter(onboardingAnalytics, "onboardingAnalytics");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(onboardingEventsFlow, "onboardingEventsFlow");
        this.onboardingScope = onboardingScope;
        this.changeUserGenderUseCase = changeUserGenderUseCase;
        this.onboardingAnalytics = onboardingAnalytics;
        this.resources = resources;
        this.userRepository = userRepository;
        this.dispatchers = dispatchers;
        this.onboardingEventsFlow = onboardingEventsFlow;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new OnboardingSelectorState(null, null, 3, null), 0, null, 6, null);
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new AnonymousClass1());
    }

    /* compiled from: OnboardingUserGenderViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserGenderViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<OnboardingSelectorState, OnboardingSelectorState> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingSelectorState invoke(OnboardingSelectorState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return state.copy(OnboardingUserGenderViewModel.this.resources.getString(R.string.onboarding__user_gender__title), ExtensionsKt.persistentListOf(OnboardingUserGenderViewModel.this.createButtonUiParams(Gender.FEMALE.name(), OnboardingUserGenderViewModel.this.resources.getString(R.string.onboarding__user_gender__female)), OnboardingUserGenderViewModel.this.createButtonUiParams(Gender.MALE.name(), OnboardingUserGenderViewModel.this.resources.getString(R.string.onboarding__user_gender__male)), OnboardingUserGenderViewModel.this.createButtonUiParams(Gender.NON_BINARY.name(), OnboardingUserGenderViewModel.this.resources.getString(R.string.onboarding__user_gender__non_binary))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectButtonUiParams createButtonUiParams(String str, String str2) {
        return new SelectButtonUiParams(str, str2, false, SelectButtonUiParams.Style.Regular);
    }

    public final void onButtonClick(SelectButtonUiParams buttonUiParams) {
        Intrinsics.checkNotNullParameter(buttonUiParams, "buttonUiParams");
        if (buttonUiParams.getSelected()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OnboardingUserGenderViewModel$onButtonClick$1(this, null), 3, null);
            return;
        }
        String id = buttonUiParams.getId();
        OnboardingUserGenderViewModel onboardingUserGenderViewModel = this;
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(onboardingUserGenderViewModel), new OnboardingUserGenderViewModel$onButtonClick$2(id));
        CoroutinesKt.safeLaunch$default(this.onboardingScope, null, this.dispatchers.background(), new OnboardingUserGenderViewModel$onButtonClick$3(id, this, null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(onboardingUserGenderViewModel), null, null, new OnboardingUserGenderViewModel$onButtonClick$4(this, null), 3, null);
    }
}
