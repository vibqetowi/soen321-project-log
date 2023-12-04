package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.view.wheel.OnboardingWheelState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: OnboardingBotAgeViewModel.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002BC\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#J0\u0010$\u001a\u00020\u0004*\u00020\f2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&H\u0097\u0001JD\u0010*\u001a\u00020+*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010,\u001a\u00020\f2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&H\u0096\u0001JD\u0010.\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010/J)\u00100\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00101\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u00102JD\u00103\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030&H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010/R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingBotAgeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/onboarding/steps/view/wheel/OnboardingWheelState;", "", "changeBotAgeUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "onboardingAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "onboardingScope", "Lkotlinx/coroutines/CoroutineScope;", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "(Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/onboarding/OnboardingAnalytics;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/onboarding/steps/view/wheel/OnboardingWheelState;", "onButtonClick", "onItemSelected", FirebaseAnalytics.Param.INDEX, "", "asyncReduce", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingBotAgeViewModel extends ViewModel implements UiStateDelegate<OnboardingWheelState, Unit> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<OnboardingWheelState, Unit> $$delegate_0;
    private final ChangeBotAgeUseCase changeBotAgeUseCase;
    private final DispatcherProvider dispatchers;
    private final GetBotUseCase getBotUseCase;
    private final OnboardingAnalytics onboardingAnalytics;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    private final CoroutineScope onboardingScope;
    private final ResourceProvider resources;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super OnboardingWheelState, ? extends OnboardingWheelState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<OnboardingWheelState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super OnboardingWheelState, ? extends OnboardingWheelState> transform) {
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
    public OnboardingWheelState getUiState(UiStateDelegate<OnboardingWheelState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<OnboardingWheelState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<OnboardingWheelState, Unit> uiStateDelegate, Function1<? super OnboardingWheelState, ? extends OnboardingWheelState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<OnboardingWheelState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<OnboardingWheelState, Unit> uiStateDelegate, Function1<? super OnboardingWheelState, ? extends OnboardingWheelState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<OnboardingWheelState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    public OnboardingBotAgeViewModel(ChangeBotAgeUseCase changeBotAgeUseCase, GetBotUseCase getBotUseCase, OnboardingAnalytics onboardingAnalytics, CoroutineScope onboardingScope, ResourceProvider resources, DispatcherProvider dispatchers, MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow) {
        Intrinsics.checkNotNullParameter(changeBotAgeUseCase, "changeBotAgeUseCase");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(onboardingAnalytics, "onboardingAnalytics");
        Intrinsics.checkNotNullParameter(onboardingScope, "onboardingScope");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(onboardingEventsFlow, "onboardingEventsFlow");
        this.changeBotAgeUseCase = changeBotAgeUseCase;
        this.getBotUseCase = getBotUseCase;
        this.onboardingAnalytics = onboardingAnalytics;
        this.onboardingScope = onboardingScope;
        this.resources = resources;
        this.dispatchers = dispatchers;
        this.onboardingEventsFlow = onboardingEventsFlow;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new OnboardingWheelState(null, null, null, 0, null, null, 63, null), 0, null, 6, null);
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new AnonymousClass1());
    }

    /* compiled from: OnboardingBotAgeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/wheel/OnboardingWheelState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotAgeViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<OnboardingWheelState, OnboardingWheelState> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingWheelState invoke(OnboardingWheelState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            Bot current = OnboardingBotAgeViewModel.this.getBotUseCase.current();
            String name = current != null ? current.getName() : null;
            if (name == null) {
                name = "";
            }
            String string = OnboardingBotAgeViewModel.this.resources.getString(R.string.onboarding__bot_age__title, name);
            String string2 = OnboardingBotAgeViewModel.this.resources.getString(R.string.onboarding__bot_age__button_info);
            String string3 = OnboardingBotAgeViewModel.this.resources.getString(R.string.onboarding__bot_age__button_text);
            IntRange intRange = new IntRange(18, 99);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((IntIterator) it).nextInt()));
            }
            return OnboardingWheelState.copy$default(state, string, null, arrayList, 2, string2, string3, 2, null);
        }
    }

    public final void onItemSelected(int i) {
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new OnboardingBotAgeViewModel$onItemSelected$1(i));
    }

    public final void onButtonClick() {
        String selectedItem = getUiState((UiStateDelegate<OnboardingWheelState, Unit>) this).getSelectedItem();
        if (selectedItem != null) {
            CoroutinesKt.safeLaunch$default(this.onboardingScope, null, this.dispatchers.background(), new OnboardingBotAgeViewModel$onButtonClick$1(this, Integer.parseInt(selectedItem), null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OnboardingBotAgeViewModel$onButtonClick$2(this, null), 3, null);
        }
    }
}
