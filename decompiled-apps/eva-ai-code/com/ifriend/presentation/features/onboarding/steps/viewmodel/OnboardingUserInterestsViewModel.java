package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.mappers.ChatInterestsTypeMapperUi;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.view.chip.OnboardingChipState;
import com.ifriend.presentation.features.onboarding.steps.view.common.ChipSelectButtonUiParams;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
/* compiled from: OnboardingUserInterestsViewModel.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 42\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00014BC\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#J0\u0010$\u001a\u00020\u0004*\u00020\u00102!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&H\u0097\u0001JD\u0010*\u001a\u00020+*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010,\u001a\u00020\u00102!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&H\u0096\u0001JD\u0010.\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010/J)\u00100\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00101\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u00102JD\u00103\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030&H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010/R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingUserInterestsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;", "", "onboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "onboardingAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "mapper", "Lcom/ifriend/presentation/common/mappers/ChatInterestsTypeMapperUi;", "onboardingScope", "Lkotlinx/coroutines/CoroutineScope;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "(Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;Lcom/ifriend/domain/onboarding/OnboardingAnalytics;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/common/mappers/ChatInterestsTypeMapperUi;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;", "onButtonClick", "onChipClick", "chip", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/ChipSelectButtonUiParams;", "asyncReduce", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingUserInterestsViewModel extends ViewModel implements UiStateDelegate<OnboardingChipState, Unit> {
    private static final int MIN_INTERESTS_COUNT = 3;
    private final /* synthetic */ UiStateDelegateImpl<OnboardingChipState, Unit> $$delegate_0;
    private final DispatcherProvider dispatchers;
    private final ChatInterestsTypeMapperUi mapper;
    private final OnboardingAnalytics onboardingAnalytics;
    private final OnboardingAnswersRepository onboardingAnswersRepository;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    private final CoroutineScope onboardingScope;
    private final ResourceProvider resources;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super OnboardingChipState, ? extends OnboardingChipState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<OnboardingChipState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super OnboardingChipState, ? extends OnboardingChipState> transform) {
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
    public OnboardingChipState getUiState(UiStateDelegate<OnboardingChipState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<OnboardingChipState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<OnboardingChipState, Unit> uiStateDelegate, Function1<? super OnboardingChipState, ? extends OnboardingChipState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<OnboardingChipState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<OnboardingChipState, Unit> uiStateDelegate, Function1<? super OnboardingChipState, ? extends OnboardingChipState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<OnboardingChipState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    public OnboardingUserInterestsViewModel(OnboardingAnswersRepository onboardingAnswersRepository, OnboardingAnalytics onboardingAnalytics, ResourceProvider resources, DispatcherProvider dispatchers, ChatInterestsTypeMapperUi mapper, CoroutineScope onboardingScope, MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow) {
        Intrinsics.checkNotNullParameter(onboardingAnswersRepository, "onboardingAnswersRepository");
        Intrinsics.checkNotNullParameter(onboardingAnalytics, "onboardingAnalytics");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(onboardingScope, "onboardingScope");
        Intrinsics.checkNotNullParameter(onboardingEventsFlow, "onboardingEventsFlow");
        this.onboardingAnswersRepository = onboardingAnswersRepository;
        this.onboardingAnalytics = onboardingAnalytics;
        this.resources = resources;
        this.dispatchers = dispatchers;
        this.mapper = mapper;
        this.onboardingScope = onboardingScope;
        this.onboardingEventsFlow = onboardingEventsFlow;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new OnboardingChipState(null, null, null, false, 15, null), 0, null, 6, null);
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new AnonymousClass1());
    }

    /* compiled from: OnboardingUserInterestsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/OnboardingUserInterestsViewModel$Companion;", "", "()V", "MIN_INTERESTS_COUNT", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: OnboardingUserInterestsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserInterestsViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<OnboardingChipState, OnboardingChipState> {

        /* compiled from: OnboardingUserInterestsViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserInterestsViewModel$1$EntriesMappings */
        /* loaded from: classes6.dex */
        public /* synthetic */ class EntriesMappings {
            public static final /* synthetic */ EnumEntries<ChatInterestsType> entries$0 = EnumEntriesKt.enumEntries(ChatInterestsType.values());
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingChipState invoke(OnboardingChipState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            String string = OnboardingUserInterestsViewModel.this.resources.getString(R.string.onboarding__interests__title);
            String string2 = OnboardingUserInterestsViewModel.this.resources.getString(R.string.onboarding__interests__button);
            EnumEntries<ChatInterestsType> enumEntries = EntriesMappings.entries$0;
            OnboardingUserInterestsViewModel onboardingUserInterestsViewModel = OnboardingUserInterestsViewModel.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(enumEntries, 10));
            for (ChatInterestsType chatInterestsType : enumEntries) {
                arrayList.add(new ChipSelectButtonUiParams(chatInterestsType.name(), onboardingUserInterestsViewModel.mapper.map(chatInterestsType), false));
            }
            return OnboardingChipState.copy$default(state, string, ExtensionsKt.toImmutableList(arrayList), string2, false, 8, null);
        }
    }

    public final void onChipClick(ChipSelectButtonUiParams chip) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), new OnboardingUserInterestsViewModel$onChipClick$1(chip));
    }

    public final void onButtonClick() {
        ArrayList arrayList = new ArrayList();
        for (ChipSelectButtonUiParams chipSelectButtonUiParams : getUiState((UiStateDelegate<OnboardingChipState, Unit>) this).getChips()) {
            if (chipSelectButtonUiParams.getSelected()) {
                arrayList.add(chipSelectButtonUiParams);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() < 3) {
            return;
        }
        CoroutinesKt.safeLaunch$default(this.onboardingScope, null, this.dispatchers.background(), new OnboardingUserInterestsViewModel$onButtonClick$1(arrayList2, this, null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OnboardingUserInterestsViewModel$onButtonClick$2(this, null), 3, null);
    }
}
