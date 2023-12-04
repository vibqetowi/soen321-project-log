package com.ifriend.presentation.features.app.delegates;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.chat.domain.AuthInteractor;
import com.ifriend.chat.domain.chat.ShouldReloadMessagesUseCase;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.logout.LogoutUseCase;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: AppReloadDataDelegate.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00018B?\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001f\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010\"\u001a\u00020 H\u0016R\u00020#¢\u0006\u0002\u0010$J0\u0010%\u001a\u00020 *\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00030(H\u0097\u0001JD\u0010,\u001a\u00020-*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010.\u001a\u00020&2!\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00030(H\u0096\u0001J\f\u00100\u001a\u00020 *\u000201H\u0016JD\u00102\u001a\u00020 *\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00030(H\u0097Aø\u0001\u0000¢\u0006\u0002\u00103J)\u00104\u001a\u00020 *\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00105\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u00106JD\u00107\u001a\u00020 *\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00030(H\u0096Aø\u0001\u0000¢\u0006\u0002\u00103R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001c\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl$AppReloadDataState;", "", "authInteractor", "Lcom/ifriend/chat/domain/AuthInteractor;", "logOutUseCase", "Lcom/ifriend/domain/logic/logout/LogoutUseCase;", "shouldReloadMessagesUseCase", "Lcom/ifriend/chat/domain/chat/ShouldReloadMessagesUseCase;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/chat/domain/AuthInteractor;Lcom/ifriend/domain/logic/logout/LogoutUseCase;Lcom/ifriend/chat/domain/chat/ShouldReloadMessagesUseCase;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/user/UserProfileRepository;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl$AppReloadDataState;", "reload", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryReloadData", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)V", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "initAppReloadData", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "AppReloadDataState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppReloadDataDelegateImpl implements AppReloadDataDelegate, UiStateDelegate<AppReloadDataState, Object> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<AppReloadDataState, Object> $$delegate_0;
    private final AppEventsEmitter appEventsEmitter;
    private final AuthInteractor authInteractor;
    private final GetUserUseCase getUserUseCase;
    private final LogoutUseCase logOutUseCase;
    private final ShouldReloadMessagesUseCase shouldReloadMessagesUseCase;
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super AppReloadDataState, ? extends AppReloadDataState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<AppReloadDataState, Object> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super AppReloadDataState, ? extends AppReloadDataState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Object> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public AppReloadDataState getUiState(UiStateDelegate<AppReloadDataState, Object> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<AppReloadDataState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<AppReloadDataState, Object> uiStateDelegate, Function1<? super AppReloadDataState, ? extends AppReloadDataState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<AppReloadDataState, Object> uiStateDelegate, Object obj, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, obj, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<AppReloadDataState, Object> uiStateDelegate, Function1<? super AppReloadDataState, ? extends AppReloadDataState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public AppReloadDataDelegateImpl(AuthInteractor authInteractor, LogoutUseCase logOutUseCase, ShouldReloadMessagesUseCase shouldReloadMessagesUseCase, UserRepository userRepository, UserProfileRepository userProfileRepository, GetUserUseCase getUserUseCase, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(logOutUseCase, "logOutUseCase");
        Intrinsics.checkNotNullParameter(shouldReloadMessagesUseCase, "shouldReloadMessagesUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.authInteractor = authInteractor;
        this.logOutUseCase = logOutUseCase;
        this.shouldReloadMessagesUseCase = shouldReloadMessagesUseCase;
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
        this.getUserUseCase = getUserUseCase;
        this.appEventsEmitter = appEventsEmitter;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new AppReloadDataState(false, null, false, 7, null), 0, null, 6, null);
    }

    /* compiled from: AppReloadDataDelegate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl$AppReloadDataState;", "", "isLoading", "", "lastUserSubscription", "Lcom/ifriend/domain/models/profile/user/Subscription;", "isShouldReloadData", "(ZLcom/ifriend/domain/models/profile/user/Subscription;Z)V", "()Z", "getLastUserSubscription", "()Lcom/ifriend/domain/models/profile/user/Subscription;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AppReloadDataState {
        public static final int $stable = 0;
        private final boolean isLoading;
        private final boolean isShouldReloadData;
        private final Subscription lastUserSubscription;

        public AppReloadDataState() {
            this(false, null, false, 7, null);
        }

        public static /* synthetic */ AppReloadDataState copy$default(AppReloadDataState appReloadDataState, boolean z, Subscription subscription, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = appReloadDataState.isLoading;
            }
            if ((i & 2) != 0) {
                subscription = appReloadDataState.lastUserSubscription;
            }
            if ((i & 4) != 0) {
                z2 = appReloadDataState.isShouldReloadData;
            }
            return appReloadDataState.copy(z, subscription, z2);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final Subscription component2() {
            return this.lastUserSubscription;
        }

        public final boolean component3() {
            return this.isShouldReloadData;
        }

        public final AppReloadDataState copy(boolean z, Subscription subscription, boolean z2) {
            return new AppReloadDataState(z, subscription, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AppReloadDataState) {
                AppReloadDataState appReloadDataState = (AppReloadDataState) obj;
                return this.isLoading == appReloadDataState.isLoading && this.lastUserSubscription == appReloadDataState.lastUserSubscription && this.isShouldReloadData == appReloadDataState.isShouldReloadData;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            Subscription subscription = this.lastUserSubscription;
            int hashCode = (i + (subscription == null ? 0 : subscription.hashCode())) * 31;
            boolean z2 = this.isShouldReloadData;
            return hashCode + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.isLoading;
            Subscription subscription = this.lastUserSubscription;
            boolean z2 = this.isShouldReloadData;
            return "AppReloadDataState(isLoading=" + z + ", lastUserSubscription=" + subscription + ", isShouldReloadData=" + z2 + ")";
        }

        public AppReloadDataState(boolean z, Subscription subscription, boolean z2) {
            this.isLoading = z;
            this.lastUserSubscription = subscription;
            this.isShouldReloadData = z2;
        }

        public /* synthetic */ AppReloadDataState(boolean z, Subscription subscription, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : subscription, (i & 4) != 0 ? false : z2);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final Subscription getLastUserSubscription() {
            return this.lastUserSubscription;
        }

        public final boolean isShouldReloadData() {
            return this.isShouldReloadData;
        }
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppReloadDataDelegate
    public void initAppReloadData(AppViewModel appViewModel) {
        Intrinsics.checkNotNullParameter(appViewModel, "<this>");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), new AppReloadDataDelegateImpl$initAppReloadData$1(null), null, new AppReloadDataDelegateImpl$initAppReloadData$2(this, appViewModel, null), 2, null);
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppReloadDataDelegate
    public void tryReloadData(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        if (getUiState((UiStateDelegate<AppReloadDataState, Object>) this).isLoading()) {
            return;
        }
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new AppReloadDataDelegateImpl$tryReloadData$1(null), null, new AppReloadDataDelegateImpl$tryReloadData$2(this, null), 2, null).invokeOnCompletion(new AppReloadDataDelegateImpl$tryReloadData$3(this, context_receiver_0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reload(Continuation<? super Unit> continuation) {
        AppReloadDataDelegateImpl$reload$1 appReloadDataDelegateImpl$reload$1;
        Object obj;
        int i;
        AppReloadDataDelegateImpl appReloadDataDelegateImpl;
        AppReloadDataDelegateImpl appReloadDataDelegateImpl2;
        if (continuation instanceof AppReloadDataDelegateImpl$reload$1) {
            appReloadDataDelegateImpl$reload$1 = (AppReloadDataDelegateImpl$reload$1) continuation;
            if ((appReloadDataDelegateImpl$reload$1.label & Integer.MIN_VALUE) != 0) {
                appReloadDataDelegateImpl$reload$1.label -= Integer.MIN_VALUE;
                obj = appReloadDataDelegateImpl$reload$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appReloadDataDelegateImpl$reload$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthInteractor authInteractor = this.authInteractor;
                    appReloadDataDelegateImpl$reload$1.L$0 = this;
                    appReloadDataDelegateImpl$reload$1.label = 1;
                    obj = authInteractor.loginIfNecessary(appReloadDataDelegateImpl$reload$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appReloadDataDelegateImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        appReloadDataDelegateImpl2 = (AppReloadDataDelegateImpl) appReloadDataDelegateImpl$reload$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m7280unboximpl();
                        appReloadDataDelegateImpl2.appEventsEmitter.emit(AppEvents.RestartApp.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    appReloadDataDelegateImpl = (AppReloadDataDelegateImpl) appReloadDataDelegateImpl$reload$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    LogoutUseCase logoutUseCase = appReloadDataDelegateImpl.logOutUseCase;
                    Unit unit = Unit.INSTANCE;
                    appReloadDataDelegateImpl$reload$1.L$0 = appReloadDataDelegateImpl;
                    appReloadDataDelegateImpl$reload$1.label = 2;
                    if (logoutUseCase.mo6875invokegIAlus(unit, (Continuation<? super Result<? extends Unit>>) appReloadDataDelegateImpl$reload$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appReloadDataDelegateImpl2 = appReloadDataDelegateImpl;
                    appReloadDataDelegateImpl2.appEventsEmitter.emit(AppEvents.RestartApp.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
        appReloadDataDelegateImpl$reload$1 = new AppReloadDataDelegateImpl$reload$1(this, continuation);
        obj = appReloadDataDelegateImpl$reload$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appReloadDataDelegateImpl$reload$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }
}
