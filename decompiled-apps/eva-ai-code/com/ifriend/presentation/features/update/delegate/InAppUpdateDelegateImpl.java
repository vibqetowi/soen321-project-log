package com.ifriend.presentation.features.update.delegate;

import androidx.activity.result.ActivityResult;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.firebase.installations.FirebaseInstallations;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.domain.models.update.UpdatePromptType;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001CB\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020'H\u0016J0\u00104\u001a\u00020'*\u00020\r2!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000306H\u0097\u0001JD\u00109\u001a\u00020:*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010;\u001a\u00020\r2!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000306H\u0096\u0001JD\u0010=\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000306H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010>J)\u0010?\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010@\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010AJD\u0010B\u001a\u00020'*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000306H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010>R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl;", "Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "updatePromptInteractor", "Lcom/ifriend/domain/logic/updates/UpdatePromptInteractor;", "inAppUpdateAnalytics", "Lcom/ifriend/presentation/features/update/analytics/InAppUpdateAnalytics;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/ifriend/domain/logic/updates/UpdatePromptInteractor;Lcom/ifriend/presentation/features/update/analytics/InAppUpdateAnalytics;)V", "delegateScope", "Lkotlinx/coroutines/CoroutineScope;", "inAppUpdateState", "Lkotlinx/coroutines/flow/StateFlow;", "getInAppUpdateState", "()Lkotlinx/coroutines/flow/StateFlow;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "startUpdateEvents", "getStartUpdateEvents", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl$State;", "uiStateFlow", "getUiStateFlow", "updateListener", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "userId", "", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "checkForAppUpdates", "", "clearInAppUpdateDelegate", "completeUpdate", "continueImmediateUpdate", "info", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "dismissUpdatePopup", "fromUser", "", "handleStartUpdateResult", "result", "Landroidx/activity/result/ActivityResult;", "showUpdatePrompt", "asyncReduce", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "State", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdateDelegateImpl implements InAppUpdateDelegate, UiStateDelegate<InAppUpdateState, InAppUpdateEvent> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<InAppUpdateState, InAppUpdateEvent> $$delegate_0;
    private final AppUpdateManager appUpdateManager;
    private final CoroutineScope delegateScope;
    private final InAppUpdateAnalytics inAppUpdateAnalytics;
    private final Mutex mutex;
    private final MutableStateFlow<State> state;
    private final InstallStateUpdatedListener updateListener;
    private final UpdatePromptInteractor updatePromptInteractor;
    private String userId;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super InAppUpdateState, ? extends InAppUpdateState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super InAppUpdateState, ? extends InAppUpdateState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<InAppUpdateEvent> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public InAppUpdateState getUiState(UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<InAppUpdateState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate, Function1<? super InAppUpdateState, ? extends InAppUpdateState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate, InAppUpdateEvent inAppUpdateEvent, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, inAppUpdateEvent, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate, Function1<? super InAppUpdateState, ? extends InAppUpdateState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public InAppUpdateDelegateImpl(AppUpdateManager appUpdateManager, UpdatePromptInteractor updatePromptInteractor, InAppUpdateAnalytics inAppUpdateAnalytics) {
        Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
        Intrinsics.checkNotNullParameter(updatePromptInteractor, "updatePromptInteractor");
        Intrinsics.checkNotNullParameter(inAppUpdateAnalytics, "inAppUpdateAnalytics");
        this.appUpdateManager = appUpdateManager;
        this.updatePromptInteractor = updatePromptInteractor;
        this.inAppUpdateAnalytics = inAppUpdateAnalytics;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new InAppUpdateState(false, false, false, 7, null), 0, null, 6, null);
        this.delegateScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.state = StateFlowKt.MutableStateFlow(null);
        this.updateListener = new InstallStateUpdatedListener() { // from class: com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(InstallState installState) {
                InAppUpdateDelegateImpl.updateListener$lambda$0(InAppUpdateDelegateImpl.this, installState);
            }
        };
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.userId = uuid;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        Task<String> id = FirebaseInstallations.getInstance().getId();
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        id.addOnSuccessListener(new OnSuccessListener() { // from class: com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                InAppUpdateDelegateImpl._init_$lambda$1(Function1.this, obj);
            }
        });
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate, InAppUpdateEvent inAppUpdateEvent, Continuation continuation) {
        return sendEvent2(uiStateDelegate, inAppUpdateEvent, (Continuation<? super Unit>) continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InAppUpdateDelegate.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl$State;", "", "info", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "type", "Lcom/ifriend/domain/models/update/UpdatePromptType;", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;Lcom/ifriend/domain/models/update/UpdatePromptType;)V", "getInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getType", "()Lcom/ifriend/domain/models/update/UpdatePromptType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class State {
        private final AppUpdateInfo info;
        private final UpdatePromptType type;

        public static /* synthetic */ State copy$default(State state, AppUpdateInfo appUpdateInfo, UpdatePromptType updatePromptType, int i, Object obj) {
            if ((i & 1) != 0) {
                appUpdateInfo = state.info;
            }
            if ((i & 2) != 0) {
                updatePromptType = state.type;
            }
            return state.copy(appUpdateInfo, updatePromptType);
        }

        public final AppUpdateInfo component1() {
            return this.info;
        }

        public final UpdatePromptType component2() {
            return this.type;
        }

        public final State copy(AppUpdateInfo info, UpdatePromptType type) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(type, "type");
            return new State(info, type);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof State) {
                State state = (State) obj;
                return Intrinsics.areEqual(this.info, state.info) && this.type == state.type;
            }
            return false;
        }

        public int hashCode() {
            return (this.info.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            AppUpdateInfo appUpdateInfo = this.info;
            UpdatePromptType updatePromptType = this.type;
            return "State(info=" + appUpdateInfo + ", type=" + updatePromptType + ")";
        }

        public State(AppUpdateInfo info, UpdatePromptType type) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(type, "type");
            this.info = info;
            this.type = type;
        }

        public final AppUpdateInfo getInfo() {
            return this.info;
        }

        public final UpdatePromptType getType() {
            return this.type;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateListener$lambda$0(InAppUpdateDelegateImpl this$0, InstallState state) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.installStatus() == 11) {
            this$0.asyncUpdateUiState(this$0, this$0.delegateScope, InAppUpdateDelegateImpl$updateListener$1$1.INSTANCE);
        }
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public StateFlow<InAppUpdateState> getInAppUpdateState() {
        return getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public Flow<InAppUpdateEvent> getStartUpdateEvents() {
        return getSingleEvents();
    }

    /* compiled from: InAppUpdateDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "id", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<String, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            InAppUpdateDelegateImpl inAppUpdateDelegateImpl = InAppUpdateDelegateImpl.this;
            Intrinsics.checkNotNull(str);
            inAppUpdateDelegateImpl.userId = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void checkForAppUpdates() {
        CoroutinesKt.safeLaunch$default(this.delegateScope, null, null, new InAppUpdateDelegateImpl$checkForAppUpdates$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueImmediateUpdate(AppUpdateInfo appUpdateInfo) {
        BuildersKt__Builders_commonKt.launch$default(this.delegateScope, null, null, new InAppUpdateDelegateImpl$continueImmediateUpdate$1(this, appUpdateInfo, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void showUpdatePrompt() {
        State value = this.state.getValue();
        if (value != null) {
            CoroutinesKt.safeLaunch$default(this.delegateScope, null, null, new InAppUpdateDelegateImpl$showUpdatePrompt$1$1(value, this, null), 3, null);
        }
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void dismissUpdatePopup(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(this.delegateScope, null, null, new InAppUpdateDelegateImpl$dismissUpdatePopup$1(this, z, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void handleStartUpdateResult(ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        State value = this.state.getValue();
        if (value == null) {
            return;
        }
        int resultCode = result.getResultCode();
        if (resultCode == -1) {
            if (value.getType() != UpdatePromptType.Immediate) {
                BuildersKt__Builders_commonKt.launch$default(this.delegateScope, null, null, new InAppUpdateDelegateImpl$handleStartUpdateResult$1(this, value, null), 3, null);
            }
        } else if (resultCode != 0) {
        } else {
            if (value.getType() != UpdatePromptType.Immediate) {
                dismissUpdatePopup(true);
                BuildersKt__Builders_commonKt.launch$default(this.delegateScope, null, null, new InAppUpdateDelegateImpl$handleStartUpdateResult$2(this, value, null), 3, null);
                return;
            }
            this.state.setValue(null);
            checkForAppUpdates();
        }
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void completeUpdate() {
        asyncUpdateUiState(this, this.delegateScope, InAppUpdateDelegateImpl$completeUpdate$1.INSTANCE);
        this.appUpdateManager.completeUpdate();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void clearInAppUpdateDelegate() {
        JobKt__JobKt.cancel$default(this.delegateScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        this.appUpdateManager.unregisterListener(this.updateListener);
    }
}
