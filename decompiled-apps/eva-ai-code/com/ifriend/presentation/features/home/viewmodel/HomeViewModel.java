package com.ifriend.presentation.features.home.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.home.analytics.HomeAnalyticsInteractor;
import com.ifriend.presentation.features.home.delegates.HomeChatsDelegate;
import com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl;
import com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegate;
import com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegateImpl;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.ui.models.HomeUnavailableChatUi;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006:\u0002LMBG\b\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0012\u0010(\u001a\u00020)H\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020)H\u0096\u0001J\u0012\u0010,\u001a\u00020)H\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010*J\u001e\u0010-\u001a\u00020)2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0001R\u00020\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020)J\u000e\u00102\u001a\u00020)2\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020)J\u0010\u00106\u001a\u00020)2\u0006\u00107\u001a\u000208H\u0016J\u0006\u00109\u001a\u00020)J\t\u0010:\u001a\u00020)H\u0096\u0001J0\u0010;\u001a\u00020)*\u00020<2!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u00070>H\u0097\u0001JD\u0010B\u001a\u00020C*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010D\u001a\u00020<2!\u0010E\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u00070>H\u0096\u0001JD\u0010F\u001a\u00020)*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u00070>H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010GJ)\u0010H\u001a\u00020)*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010I\u001a\u00020\bH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010JJD\u0010K\u001a\u00020)*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062!\u0010E\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00070>H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010GR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\"\u0010%\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegate;", "Lcom/ifriend/presentation/features/home/delegates/HomeHandleDeepLinksDelegate;", "Lcom/ifriend/presentation/features/home/delegates/HomeChatsDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event;", "homeChatsDelegate", "Lcom/ifriend/presentation/features/home/delegates/HomeChatsDelegateImpl;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "homeHandleDeepLinksDelegate", "Lcom/ifriend/presentation/features/home/delegates/HomeHandleDeepLinksDelegateImpl;", "profileMenuDelegate", "Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegateImpl;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "homeAnalytics", "Lcom/ifriend/presentation/features/home/analytics/HomeAnalyticsInteractor;", "featureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "(Lcom/ifriend/presentation/features/home/delegates/HomeChatsDelegateImpl;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/presentation/features/home/delegates/HomeHandleDeepLinksDelegateImpl;Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegateImpl;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/features/home/analytics/HomeAnalyticsInteractor;Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;Lcom/ifriend/domain/useCases/AppConfigUseCase;)V", "profileMenuState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;", "getProfileMenuState", "()Lkotlinx/coroutines/flow/StateFlow;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "handleDeepLinks", "", "(Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;)V", "hideProfileMenu", "initChatConnections", "initProfileMenuDelegate", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "onAddNeuronsClick", "onChatClick", "chat", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "onProfileClick", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onUpgradeClick", "showProfileMenu", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeViewModel extends ViewModel implements DefaultLifecycleObserver, ProfileMenuDelegate, HomeHandleDeepLinksDelegate, HomeChatsDelegate, UiStateDelegate<UiState, Event> {
    public static final int $stable = 8;
    private final /* synthetic */ ProfileMenuDelegateImpl $$delegate_0;
    private final /* synthetic */ HomeHandleDeepLinksDelegateImpl $$delegate_1;
    private final /* synthetic */ HomeChatsDelegateImpl $$delegate_2;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_3;
    private final AppConfigUseCase appConfigUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final FeatureToggleRepository featureToggleRepository;
    private final HomeAnalyticsInteractor homeAnalytics;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_3.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_3.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public StateFlow<ProfileMenuUiState> getProfileMenuState() {
        return this.$$delegate_0.getProfileMenuState();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_3.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_3.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_3.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegate
    public void handleDeepLinks(HomeViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_1.handleDeepLinks(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void hideProfileMenu() {
        this.$$delegate_0.hideProfileMenu();
    }

    @Override // com.ifriend.presentation.features.home.delegates.HomeChatsDelegate
    public void initChatConnections(HomeViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_2.initChatConnections(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void initProfileMenuDelegate(ViewModel context_receiver_0, String str) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_0.initProfileMenuDelegate(context_receiver_0, str);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void showProfileMenu() {
        this.$$delegate_0.showProfileMenu();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    @Inject
    public HomeViewModel(HomeChatsDelegateImpl homeChatsDelegate, UserBalanceRepository userBalanceRepository, HomeHandleDeepLinksDelegateImpl homeHandleDeepLinksDelegate, ProfileMenuDelegateImpl profileMenuDelegate, AppEventsEmitter appEventsEmitter, HomeAnalyticsInteractor homeAnalytics, FeatureToggleRepository featureToggleRepository, AppConfigUseCase appConfigUseCase) {
        Intrinsics.checkNotNullParameter(homeChatsDelegate, "homeChatsDelegate");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(homeHandleDeepLinksDelegate, "homeHandleDeepLinksDelegate");
        Intrinsics.checkNotNullParameter(profileMenuDelegate, "profileMenuDelegate");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(homeAnalytics, "homeAnalytics");
        Intrinsics.checkNotNullParameter(featureToggleRepository, "featureToggleRepository");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        this.appEventsEmitter = appEventsEmitter;
        this.homeAnalytics = homeAnalytics;
        this.featureToggleRepository = featureToggleRepository;
        this.appConfigUseCase = appConfigUseCase;
        this.$$delegate_0 = profileMenuDelegate;
        this.$$delegate_1 = homeHandleDeepLinksDelegate;
        this.$$delegate_2 = homeChatsDelegate;
        this.$$delegate_3 = new UiStateDelegateImpl<>(new UiState(false, null, null, null, false, null, false, false, 255, null), 0, null, 6, null);
        HomeViewModel homeViewModel = this;
        FlowKt.launchIn(FlowKt.onEach(userBalanceRepository.getBalanceFlow(), new AnonymousClass1(null)), ViewModelKt.getViewModelScope(homeViewModel));
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(homeViewModel), null, null, new AnonymousClass2(null), 3, null);
        initChatConnections(this);
        ProfileMenuDelegate.DefaultImpls.initProfileMenuDelegate$default(this, homeViewModel, null, 2, null);
        BuildersKt.launch(ViewModelKt.getViewModelScope(homeViewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$special$$inlined$collectIn$default$1(getProfileMenuState(), null, this));
    }

    /* compiled from: HomeViewModel.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003Je\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006%"}, d2 = {"Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "", "isLoading", "", "activeChats", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "unavailableChats", "Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "chatUnlockLevelLabel", "", "isVisibleProfileIndicator", "neurons", "isConfirmEmailPromoteEnabled", "isShowConfirmEmailGift", "(ZLkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "getActiveChats", "()Lkotlinx/collections/immutable/ImmutableList;", "getChatUnlockLevelLabel", "()Ljava/lang/String;", "()Z", "getNeurons", "getUnavailableChats", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final ImmutableList<HomeChatUi> activeChats;
        private final String chatUnlockLevelLabel;
        private final boolean isConfirmEmailPromoteEnabled;
        private final boolean isLoading;
        private final boolean isShowConfirmEmailGift;
        private final boolean isVisibleProfileIndicator;
        private final String neurons;
        private final ImmutableList<HomeUnavailableChatUi> unavailableChats;

        public UiState() {
            this(false, null, null, null, false, null, false, false, 255, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z2, String str2, boolean z3, boolean z4, int i, Object obj) {
            return uiState.copy((i & 1) != 0 ? uiState.isLoading : z, (i & 2) != 0 ? uiState.activeChats : immutableList, (i & 4) != 0 ? uiState.unavailableChats : immutableList2, (i & 8) != 0 ? uiState.chatUnlockLevelLabel : str, (i & 16) != 0 ? uiState.isVisibleProfileIndicator : z2, (i & 32) != 0 ? uiState.neurons : str2, (i & 64) != 0 ? uiState.isConfirmEmailPromoteEnabled : z3, (i & 128) != 0 ? uiState.isShowConfirmEmailGift : z4);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final ImmutableList<HomeChatUi> component2() {
            return this.activeChats;
        }

        public final ImmutableList<HomeUnavailableChatUi> component3() {
            return this.unavailableChats;
        }

        public final String component4() {
            return this.chatUnlockLevelLabel;
        }

        public final boolean component5() {
            return this.isVisibleProfileIndicator;
        }

        public final String component6() {
            return this.neurons;
        }

        public final boolean component7() {
            return this.isConfirmEmailPromoteEnabled;
        }

        public final boolean component8() {
            return this.isShowConfirmEmailGift;
        }

        public final UiState copy(boolean z, ImmutableList<? extends HomeChatUi> activeChats, ImmutableList<HomeUnavailableChatUi> unavailableChats, String chatUnlockLevelLabel, boolean z2, String neurons, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(activeChats, "activeChats");
            Intrinsics.checkNotNullParameter(unavailableChats, "unavailableChats");
            Intrinsics.checkNotNullParameter(chatUnlockLevelLabel, "chatUnlockLevelLabel");
            Intrinsics.checkNotNullParameter(neurons, "neurons");
            return new UiState(z, activeChats, unavailableChats, chatUnlockLevelLabel, z2, neurons, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.activeChats, uiState.activeChats) && Intrinsics.areEqual(this.unavailableChats, uiState.unavailableChats) && Intrinsics.areEqual(this.chatUnlockLevelLabel, uiState.chatUnlockLevelLabel) && this.isVisibleProfileIndicator == uiState.isVisibleProfileIndicator && Intrinsics.areEqual(this.neurons, uiState.neurons) && this.isConfirmEmailPromoteEnabled == uiState.isConfirmEmailPromoteEnabled && this.isShowConfirmEmailGift == uiState.isShowConfirmEmailGift;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((((((r0 * 31) + this.activeChats.hashCode()) * 31) + this.unavailableChats.hashCode()) * 31) + this.chatUnlockLevelLabel.hashCode()) * 31;
            ?? r2 = this.isVisibleProfileIndicator;
            int i = r2;
            if (r2 != 0) {
                i = 1;
            }
            int hashCode2 = (((hashCode + i) * 31) + this.neurons.hashCode()) * 31;
            ?? r22 = this.isConfirmEmailPromoteEnabled;
            int i2 = r22;
            if (r22 != 0) {
                i2 = 1;
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z2 = this.isShowConfirmEmailGift;
            return i3 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.isLoading;
            ImmutableList<HomeChatUi> immutableList = this.activeChats;
            ImmutableList<HomeUnavailableChatUi> immutableList2 = this.unavailableChats;
            String str = this.chatUnlockLevelLabel;
            boolean z2 = this.isVisibleProfileIndicator;
            String str2 = this.neurons;
            boolean z3 = this.isConfirmEmailPromoteEnabled;
            boolean z4 = this.isShowConfirmEmailGift;
            return "UiState(isLoading=" + z + ", activeChats=" + immutableList + ", unavailableChats=" + immutableList2 + ", chatUnlockLevelLabel=" + str + ", isVisibleProfileIndicator=" + z2 + ", neurons=" + str2 + ", isConfirmEmailPromoteEnabled=" + z3 + ", isShowConfirmEmailGift=" + z4 + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UiState(boolean z, ImmutableList<? extends HomeChatUi> activeChats, ImmutableList<HomeUnavailableChatUi> unavailableChats, String chatUnlockLevelLabel, boolean z2, String neurons, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(activeChats, "activeChats");
            Intrinsics.checkNotNullParameter(unavailableChats, "unavailableChats");
            Intrinsics.checkNotNullParameter(chatUnlockLevelLabel, "chatUnlockLevelLabel");
            Intrinsics.checkNotNullParameter(neurons, "neurons");
            this.isLoading = z;
            this.activeChats = activeChats;
            this.unavailableChats = unavailableChats;
            this.chatUnlockLevelLabel = chatUnlockLevelLabel;
            this.isVisibleProfileIndicator = z2;
            this.neurons = neurons;
            this.isConfirmEmailPromoteEnabled = z3;
            this.isShowConfirmEmailGift = z4;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public /* synthetic */ UiState(boolean z, ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z2, String str2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ExtensionsKt.persistentListOf() : immutableList, (i & 4) != 0 ? ExtensionsKt.persistentListOf() : immutableList2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? "0" : str2, (i & 64) != 0 ? false : z3, (i & 128) == 0 ? z4 : false);
        }

        public final ImmutableList<HomeChatUi> getActiveChats() {
            return this.activeChats;
        }

        public final ImmutableList<HomeUnavailableChatUi> getUnavailableChats() {
            return this.unavailableChats;
        }

        public final String getChatUnlockLevelLabel() {
            return this.chatUnlockLevelLabel;
        }

        public final boolean isVisibleProfileIndicator() {
            return this.isVisibleProfileIndicator;
        }

        public final String getNeurons() {
            return this.neurons;
        }

        public final boolean isConfirmEmailPromoteEnabled() {
            return this.isConfirmEmailPromoteEnabled;
        }

        public final boolean isShowConfirmEmailGift() {
            return this.isShowConfirmEmailGift;
        }
    }

    /* compiled from: HomeViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event;", "", "GoToChat", "GoToChatsStore", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event$GoToChat;", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event$GoToChatsStore;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: HomeViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event$GoToChat;", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GoToChat implements Event {
            public static final int $stable = 0;
            private final String chatId;

            public static /* synthetic */ GoToChat copy$default(GoToChat goToChat, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goToChat.chatId;
                }
                return goToChat.copy(str);
            }

            public final String component1() {
                return this.chatId;
            }

            public final GoToChat copy(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new GoToChat(chatId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToChat) && Intrinsics.areEqual(this.chatId, ((GoToChat) obj).chatId);
            }

            public int hashCode() {
                return this.chatId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                return "GoToChat(chatId=" + str + ")";
            }

            public GoToChat(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.chatId = chatId;
            }

            public final String getChatId() {
                return this.chatId;
            }
        }

        /* compiled from: HomeViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event$GoToChatsStore;", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$Event;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GoToChatsStore implements Event {
            public static final int $stable = 0;
            private final String chatId;

            public static /* synthetic */ GoToChatsStore copy$default(GoToChatsStore goToChatsStore, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goToChatsStore.chatId;
                }
                return goToChatsStore.copy(str);
            }

            public final String component1() {
                return this.chatId;
            }

            public final GoToChatsStore copy(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new GoToChatsStore(chatId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToChatsStore) && Intrinsics.areEqual(this.chatId, ((GoToChatsStore) obj).chatId);
            }

            public int hashCode() {
                return this.chatId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                return "GoToChatsStore(chatId=" + str + ")";
            }

            public GoToChatsStore(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.chatId = chatId;
            }

            public final String getChatId() {
                return this.chatId;
            }
        }
    }

    /* compiled from: HomeViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/balance/UserBalance;", "balance", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.home.viewmodel.HomeViewModel$1", f = "HomeViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.home.viewmodel.HomeViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<UserBalance, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserBalance userBalance, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(userBalance, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.home.viewmodel.HomeViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01621 extends Lambda implements Function1<UiState, UiState> {
            final /* synthetic */ UserBalance $balance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01621(UserBalance userBalance) {
                super(1);
                this.$balance = userBalance;
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.copy$default(state, false, null, null, null, false, String.valueOf(this.$balance.getNeurons()), false, false, 223, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<UiState, Event> uiStateDelegate = HomeViewModel.this;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01621((UserBalance) this.L$0), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: HomeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.home.viewmodel.HomeViewModel$2", f = "HomeViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.home.viewmodel.HomeViewModel$2  reason: invalid class name */
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = HomeViewModel.this.featureToggleRepository.isFeatureEnabledFlow(FeatureToggleKey.CONFIRM_EMAIL_PROMOTE_ENABLED, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            FlowKt.launchIn(FlowKt.onEach((Flow) obj, new AnonymousClass1(HomeViewModel.this, null)), ViewModelKt.getViewModelScope(HomeViewModel.this));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "enabled", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.home.viewmodel.HomeViewModel$2$1", f = "HomeViewModel.kt", i = {0}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {"enabled"}, s = {"Z$0"})
        /* renamed from: com.ifriend.presentation.features.home.viewmodel.HomeViewModel$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ HomeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HomeViewModel homeViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    z = this.Z$0;
                    this.Z$0 = z;
                    this.label = 1;
                    obj = this.this$0.appConfigUseCase.getLongValue(FeatureToggleKey.CONFIRM_EMAIL_BONUS_NEURONS.getKey(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    z = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                }
                boolean z2 = ommonKt.orZero((Long) obj) > 0;
                UiStateDelegate<UiState, Event> uiStateDelegate = this.this$0;
                this.label = 2;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01631(z, z2), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.home.viewmodel.HomeViewModel$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01631 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ boolean $isShowConfirmEmailGift;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01631(boolean z, boolean z2) {
                    super(1);
                    this.$enabled = z;
                    this.$isShowConfirmEmailGift = z2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.copy$default(state, false, null, null, null, false, null, this.$enabled, this.$isShowConfirmEmailGift, 63, null);
                }
            }
        }
    }

    public final void onChatClick(HomeChatUi chat) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$onChatClick$1(chat, this, null), 3, null);
    }

    public final void onProfileClick() {
        showProfileMenu();
    }

    public final void onAddNeuronsClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$onAddNeuronsClick$1(this, null), 3, null);
    }

    public final void onUpgradeClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$onUpgradeClick$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        handleDeepLinks(this);
    }
}
