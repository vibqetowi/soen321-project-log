package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import com.ifriend.domain.onboarding.model.OnboardingStep;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.state.CombinedStateDelegate;
import com.ifriend.presentation.common.state.CombinedStateDelegateImpl;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.ui.progress.MultiPartProgressState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: OnboardingFlowViewModel.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 [2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0004[\\]^B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\b\u0010)\u001a\u00020$H\u0002J0\u0010*\u001a\u00020$*\u00020+2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00030-H\u0097\u0001J>\u00101\u001a\u000202*\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u00103\u001a\u00020+2!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00040-H\u0096\u0001JD\u00105\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050 2\u0006\u00103\u001a\u00020+2!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00030-H\u0096\u0001J_\u00106\u001a\u000202*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u00103\u001a\u00020+26\u00104\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u000307H\u0096\u0001J\u009d\u0002\u00108\u001a\u000202\"\u0004\b\u0000\u00109\"\u0004\b\u0001\u0010:\"\u0004\b\u0002\u0010;\"\u0004\b\u0003\u0010<*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u00103\u001a\u00020+2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H90\u00112\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H:0\u00112\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H;0\u00112\f\u0010@\u001a\b\u0012\u0004\u0012\u0002H<0\u00112\u009b\u0001\u00104\u001a\u0096\u0001\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H9¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(B\u0012\u0013\u0012\u0011H:¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(C\u0012\u0013\u0012\u0011H;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(D\u0012\u0013\u0012\u0011H<¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030F\u0012\u0006\u0012\u0004\u0018\u00010G0AH\u0096\u0001ø\u0001\u0000¢\u0006\u0002\u0010HJô\u0001\u00108\u001a\u000202\"\u0004\b\u0000\u00109\"\u0004\b\u0001\u0010:\"\u0004\b\u0002\u0010;*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u00103\u001a\u00020+2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H90\u00112\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H:0\u00112\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H;0\u00112\u0086\u0001\u00104\u001a\u0081\u0001\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H9¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(B\u0012\u0013\u0012\u0011H:¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(C\u0012\u0013\u0012\u0011H;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030F\u0012\u0006\u0012\u0004\u0018\u00010G0IH\u0096\u0001ø\u0001\u0000¢\u0006\u0002\u0010JJÉ\u0001\u00108\u001a\u000202\"\u0004\b\u0000\u00109\"\u0004\b\u0001\u0010:*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u00103\u001a\u00020+2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H90\u00112\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H:0\u00112p\u00104\u001al\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H9¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(B\u0012\u0013\u0012\u0011H:¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030F\u0012\u0006\u0012\u0004\u0018\u00010G0KH\u0096\u0001ø\u0001\u0000¢\u0006\u0002\u0010LJ \u0001\u00108\u001a\u000202\"\u0004\b\u0000\u0010M*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u00103\u001a\u00020+2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002HM0\u00112[\u00104\u001aW\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011HM¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(P\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030F\u0012\u0006\u0012\u0004\u0018\u00010G0OH\u0096\u0001ø\u0001\u0000¢\u0006\u0002\u0010QJD\u0010R\u001a\u00020$*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050 2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00030-H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010SJ)\u0010T\u001a\u00020$*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010U\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010VJ>\u0010W\u001a\u00020$*\b\u0012\u0004\u0012\u00020\u00040\u00192!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00040-H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010XJ_\u0010Y\u001a\u00020$*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u000226\u00104\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000307H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010ZJD\u0010Y\u001a\u00020$*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050 2!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030-H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010SR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015*\b\u0012\u0004\u0012\u00020\u00040\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/state/CombinedStateDelegate;", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$UiState;", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$InternalState;", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event;", "interactor", "Lcom/ifriend/domain/onboarding/interactor/OnboardingInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/onboarding/interactor/OnboardingInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "getOnboardingEventsFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "internalState", "Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "getInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$InternalState;", "internalStateFlow", "getInternalStateFlow", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$UiState;", "leaveFeature", "", "observeEvents", "observeInternalState", "onBackPressed", "onRetryClick", "startOnboarding", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "asyncUpdateUiState", "collectUpdateUiState", "Lkotlin/Function2;", "combineCollectUpdateUiState", "T1", "T2", "T3", "T4", "flow1", "flow2", "flow3", "flow4", "Lkotlin/Function7;", "value1", "value2", "value3", "value4", "Lkotlin/coroutines/Continuation;", "", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function7;)Lkotlinx/coroutines/Job;", "Lkotlin/Function6;", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/Job;", "Lkotlin/Function5;", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "flow", "Lkotlin/Function4;", "value", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/Job;", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Event", "InternalState", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingFlowViewModel extends ViewModel implements CombinedStateDelegate<UiState, InternalState, Event> {
    private final /* synthetic */ CombinedStateDelegateImpl<UiState, InternalState, Event> $$delegate_0;
    private final AppEventsEmitter appEventsEmitter;
    private final OnboardingInteractor interactor;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<OnboardingStep> finalSteps = CollectionsKt.listOf((Object[]) new OnboardingStep[]{OnboardingStep.BotAge.INSTANCE, OnboardingStep.BotGender.INSTANCE, OnboardingStep.BotName.INSTANCE, OnboardingStep.BotsPager.INSTANCE, OnboardingStep.Awesome.INSTANCE});

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Job asyncUpdateInternalState(InternalStateDelegate<InternalState> internalStateDelegate, CoroutineScope coroutineScope, Function1<? super InternalState, InternalState> transform) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateInternalState(internalStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public Job collectUpdateUiState(CombinedStateDelegate<UiState, InternalState, Event> combinedStateDelegate, CoroutineScope coroutineScope, Function2<? super InternalState, ? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.collectUpdateUiState(combinedStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, InternalState, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T> flow, Function4<? super InternalState, ? super UiState, ? super T, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.combineCollectUpdateUiState(combinedStateDelegate, coroutineScope, flow, transform);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T1, T2> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, InternalState, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow1, Flow<? extends T2> flow2, Function5<? super InternalState, ? super UiState, ? super T1, ? super T2, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.combineCollectUpdateUiState(combinedStateDelegate, coroutineScope, flow1, flow2, transform);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T1, T2, T3> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, InternalState, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow1, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Function6<? super InternalState, ? super UiState, ? super T1, ? super T2, ? super T3, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.combineCollectUpdateUiState(combinedStateDelegate, coroutineScope, flow1, flow2, flow3, transform);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T1, T2, T3, T4> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, InternalState, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow1, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function7<? super InternalState, ? super UiState, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.combineCollectUpdateUiState(combinedStateDelegate, coroutineScope, flow1, flow2, flow3, flow4, transform);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public InternalState getInternalState(InternalStateDelegate<InternalState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalState(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public StateFlow<InternalState> getInternalStateFlow(InternalStateDelegate<InternalState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalStateFlow(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    public Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Object updateInternalState(InternalStateDelegate<InternalState> internalStateDelegate, Function1<? super InternalState, InternalState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateInternalState(internalStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public Object updateUiState(CombinedStateDelegate<UiState, InternalState, Event> combinedStateDelegate, Function2<? super UiState, ? super InternalState, ? extends UiState> function2, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(combinedStateDelegate, function2, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public /* bridge */ /* synthetic */ Object getInternalState(InternalStateDelegate internalStateDelegate) {
        return getInternalState((InternalStateDelegate<InternalState>) internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object getUiState(UiStateDelegate uiStateDelegate) {
        return getUiState((UiStateDelegate<UiState, Event>) uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate uiStateDelegate, Object obj, Continuation continuation) {
        return sendEvent((UiStateDelegate<UiState, Event>) uiStateDelegate, (Event) obj, (Continuation<? super Unit>) continuation);
    }

    public OnboardingFlowViewModel(OnboardingInteractor interactor, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.interactor = interactor;
        this.appEventsEmitter = appEventsEmitter;
        this.$$delegate_0 = new CombinedStateDelegateImpl<>(new UiState(false, false, null, null, false, 31, null), new InternalState(null, 0, 3, null), 0, null, 12, null);
        this.onboardingEventsFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        startOnboarding();
        observeInternalState();
        observeEvents();
    }

    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Companion;", "", "()V", "finalSteps", "", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$UiState;", "", "isLoading", "", "isError", "progress", "Lcom/ifriend/ui/progress/MultiPartProgressState;", "startStep", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "isVisibleBack", "(ZZLcom/ifriend/ui/progress/MultiPartProgressState;Lcom/ifriend/domain/onboarding/model/OnboardingStep;Z)V", "()Z", "getProgress", "()Lcom/ifriend/ui/progress/MultiPartProgressState;", "getStartStep", "()Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final boolean isError;
        private final boolean isLoading;
        private final boolean isVisibleBack;
        private final MultiPartProgressState progress;
        private final OnboardingStep startStep;

        public UiState() {
            this(false, false, null, null, false, 31, null);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, boolean z2, MultiPartProgressState multiPartProgressState, OnboardingStep onboardingStep, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = uiState.isError;
            }
            boolean z4 = z2;
            if ((i & 4) != 0) {
                multiPartProgressState = uiState.progress;
            }
            MultiPartProgressState multiPartProgressState2 = multiPartProgressState;
            if ((i & 8) != 0) {
                onboardingStep = uiState.startStep;
            }
            OnboardingStep onboardingStep2 = onboardingStep;
            if ((i & 16) != 0) {
                z3 = uiState.isVisibleBack;
            }
            return uiState.copy(z, z4, multiPartProgressState2, onboardingStep2, z3);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final boolean component2() {
            return this.isError;
        }

        public final MultiPartProgressState component3() {
            return this.progress;
        }

        public final OnboardingStep component4() {
            return this.startStep;
        }

        public final boolean component5() {
            return this.isVisibleBack;
        }

        public final UiState copy(boolean z, boolean z2, MultiPartProgressState progress, OnboardingStep onboardingStep, boolean z3) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new UiState(z, z2, progress, onboardingStep, z3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && this.isError == uiState.isError && Intrinsics.areEqual(this.progress, uiState.progress) && Intrinsics.areEqual(this.startStep, uiState.startStep) && this.isVisibleBack == uiState.isVisibleBack;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r2 = this.isError;
            int i2 = r2;
            if (r2 != 0) {
                i2 = 1;
            }
            int hashCode = (((i + i2) * 31) + this.progress.hashCode()) * 31;
            OnboardingStep onboardingStep = this.startStep;
            int hashCode2 = (hashCode + (onboardingStep == null ? 0 : onboardingStep.hashCode())) * 31;
            boolean z2 = this.isVisibleBack;
            return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.isLoading;
            boolean z2 = this.isError;
            MultiPartProgressState multiPartProgressState = this.progress;
            OnboardingStep onboardingStep = this.startStep;
            boolean z3 = this.isVisibleBack;
            return "UiState(isLoading=" + z + ", isError=" + z2 + ", progress=" + multiPartProgressState + ", startStep=" + onboardingStep + ", isVisibleBack=" + z3 + ")";
        }

        public UiState(boolean z, boolean z2, MultiPartProgressState progress, OnboardingStep onboardingStep, boolean z3) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.isLoading = z;
            this.isError = z2;
            this.progress = progress;
            this.startStep = onboardingStep;
            this.isVisibleBack = z3;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isError() {
            return this.isError;
        }

        public /* synthetic */ UiState(boolean z, boolean z2, MultiPartProgressState multiPartProgressState, OnboardingStep onboardingStep, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? new MultiPartProgressState(CollectionsKt.emptyList()) : multiPartProgressState, (i & 8) != 0 ? null : onboardingStep, (i & 16) != 0 ? true : z3);
        }

        public final MultiPartProgressState getProgress() {
            return this.progress;
        }

        public final OnboardingStep getStartStep() {
            return this.startStep;
        }

        public final boolean isVisibleBack() {
            return this.isVisibleBack;
        }
    }

    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001b\u001a\u00020\u0000J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$InternalState;", "", "steps", "", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "currentStepIndex", "", "(Ljava/util/List;I)V", "currentStep", "getCurrentStep", "()Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "getCurrentStepIndex", "()I", "nextStep", "getNextStep", "previousStep", "getPreviousStep", "getSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "moveToNextStep", "moveToPrevStep", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InternalState {
        public static final int $stable = 8;
        private final int currentStepIndex;
        private final List<OnboardingStep> steps;

        public InternalState() {
            this(null, 0, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InternalState copy$default(InternalState internalState, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = internalState.steps;
            }
            if ((i2 & 2) != 0) {
                i = internalState.currentStepIndex;
            }
            return internalState.copy(list, i);
        }

        public final List<OnboardingStep> component1() {
            return this.steps;
        }

        public final int component2() {
            return this.currentStepIndex;
        }

        public final InternalState copy(List<? extends OnboardingStep> steps, int i) {
            Intrinsics.checkNotNullParameter(steps, "steps");
            return new InternalState(steps, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InternalState) {
                InternalState internalState = (InternalState) obj;
                return Intrinsics.areEqual(this.steps, internalState.steps) && this.currentStepIndex == internalState.currentStepIndex;
            }
            return false;
        }

        public int hashCode() {
            return (this.steps.hashCode() * 31) + this.currentStepIndex;
        }

        public String toString() {
            List<OnboardingStep> list = this.steps;
            int i = this.currentStepIndex;
            return "InternalState(steps=" + list + ", currentStepIndex=" + i + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InternalState(List<? extends OnboardingStep> steps, int i) {
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.steps = steps;
            this.currentStepIndex = i;
        }

        public /* synthetic */ InternalState(ArrayList arrayList, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new ArrayList() : arrayList, (i2 & 2) != 0 ? 0 : i);
        }

        public final List<OnboardingStep> getSteps() {
            return this.steps;
        }

        public final int getCurrentStepIndex() {
            return this.currentStepIndex;
        }

        public final OnboardingStep getPreviousStep() {
            return (OnboardingStep) CollectionsKt.getOrNull(this.steps, this.currentStepIndex - 1);
        }

        public final OnboardingStep getCurrentStep() {
            return (OnboardingStep) CollectionsKt.getOrNull(this.steps, this.currentStepIndex);
        }

        public final OnboardingStep getNextStep() {
            return (OnboardingStep) CollectionsKt.getOrNull(this.steps, this.currentStepIndex + 1);
        }

        public final InternalState moveToPrevStep() {
            if (!(getPreviousStep() != null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return copy$default(this, null, this.currentStepIndex - 1, 1, null);
        }

        public final InternalState moveToNextStep() {
            if (!(getNextStep() != null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return copy$default(this, null, this.currentStepIndex + 1, 1, null);
        }
    }

    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event;", "", "NavigateToStep", "NavigateUp", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event$NavigateToStep;", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event$NavigateUp;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: OnboardingFlowViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event$NavigateToStep;", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event;", "step", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "(Lcom/ifriend/domain/onboarding/model/OnboardingStep;)V", "getStep", "()Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NavigateToStep implements Event {
            public static final int $stable = 8;
            private final OnboardingStep step;

            public static /* synthetic */ NavigateToStep copy$default(NavigateToStep navigateToStep, OnboardingStep onboardingStep, int i, Object obj) {
                if ((i & 1) != 0) {
                    onboardingStep = navigateToStep.step;
                }
                return navigateToStep.copy(onboardingStep);
            }

            public final OnboardingStep component1() {
                return this.step;
            }

            public final NavigateToStep copy(OnboardingStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                return new NavigateToStep(step);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToStep) && Intrinsics.areEqual(this.step, ((NavigateToStep) obj).step);
            }

            public int hashCode() {
                return this.step.hashCode();
            }

            public String toString() {
                OnboardingStep onboardingStep = this.step;
                return "NavigateToStep(step=" + onboardingStep + ")";
            }

            public NavigateToStep(OnboardingStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.step = step;
            }

            public final OnboardingStep getStep() {
                return this.step;
            }
        }

        /* compiled from: OnboardingFlowViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event$NavigateUp;", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NavigateUp implements Event {
            public static final int $stable = 0;
            public static final NavigateUp INSTANCE = new NavigateUp();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof NavigateUp) {
                    NavigateUp navigateUp = (NavigateUp) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1270056933;
            }

            public String toString() {
                return "NavigateUp";
            }

            private NavigateUp() {
            }
        }
    }

    public final MutableSharedFlow<OnboardingStepEvent> getOnboardingEventsFlow() {
        return this.onboardingEventsFlow;
    }

    private final void startOnboarding() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new OnboardingFlowViewModel$startOnboarding$1(this, null), null, new OnboardingFlowViewModel$startOnboarding$2(this, null), 2, null).invokeOnCompletion(new OnboardingFlowViewModel$startOnboarding$3(this));
    }

    private final void observeInternalState() {
        collectUpdateUiState(this, ViewModelKt.getViewModelScope(this), OnboardingFlowViewModel$observeInternalState$1.INSTANCE);
    }

    private final void observeEvents() {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1(this.onboardingEventsFlow, null, this));
    }

    public final void onRetryClick() {
        startOnboarding();
    }

    public final void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OnboardingFlowViewModel$onBackPressed$1(this, null), 3, null);
    }

    public final void leaveFeature() {
        this.appEventsEmitter.emit(new AppEvents.LogOut(true));
    }
}
