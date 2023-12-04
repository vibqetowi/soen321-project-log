package com.ifriend.chat.presentation.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import by.kirich1409.viewbindingdelegate.ActivityViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.base.app.BaseComponentHolder;
import com.ifriend.base.di.MessagesSourceLifecycleObserver;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.ActivityAppBinding;
import com.ifriend.chat.presentation.di.ChatComponent;
import com.ifriend.chat.presentation.di.DaggerChatComponent;
import com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.useCases.socket.ListenTagsUseCase;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.presentation.common.uistate.UiStateExtKt;
import com.ifriend.presentation.features.app.di.AppDiProvider;
import com.ifriend.presentation.features.app.di.AppPresentationProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.SnackbarNotificationHandler;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AppActivity.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010jH\u0015J\b\u0010k\u001a\u00020hH\u0014J\u0012\u0010l\u001a\u00020h2\b\u0010m\u001a\u0004\u0018\u00010nH\u0014J\b\u0010o\u001a\u00020hH\u0014J\b\u0010p\u001a\u00020hH\u0014J\b\u0010q\u001a\u00020hH\u0014J\u0010\u0010r\u001a\u00020h2\u0006\u0010s\u001a\u00020jH\u0014J\u0010\u0010t\u001a\u00020h2\u0006\u0010u\u001a\u00020vH\u0016J\b\u0010w\u001a\u00020hH\u0016J\b\u0010x\u001a\u00020hH\u0014J\b\u0010y\u001a\u00020hH\u0014J\b\u0010z\u001a\u00020hH\u0002R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bE\u0010FR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR,\u0010N\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0006\u0012\u0004\u0018\u00010Q0O8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010V\u001a\u00020WX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010X\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010Z0Z0YX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\\\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u00105\u001a\u0004\b^\u0010_R\u001e\u0010a\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006{²\u0006\n\u0010|\u001a\u00020}X\u008a\u0084\u0002²\u0006\n\u0010~\u001a\u00020\u007fX\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/chat/presentation/ui/AppActivity;", "Lcom/ifriend/ui/base/BaseActivity;", "Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate$ScreenshotDetectionListener;", "Lcom/ifriend/presentation/features/app/di/AppDiProvider;", "()V", "appCicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "getAppCicerone", "()Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "setAppCicerone", "(Lcom/ifriend/base/navigation/api/cicerone/Cicerone;)V", "appFlowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getAppFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setAppFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "appPresentationProvider", "Lcom/ifriend/presentation/features/app/di/AppPresentationProvider;", "getAppPresentationProvider", "()Lcom/ifriend/presentation/features/app/di/AppPresentationProvider;", "appViewModelProvider", "Lcom/ifriend/presentation/features/app/di/AppViewModelProvider;", "getAppViewModelProvider", "()Lcom/ifriend/presentation/features/app/di/AppViewModelProvider;", "binding", "Lcom/ifriend/chat/presentation/databinding/ActivityAppBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/ActivityAppBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "chatScreenFactory", "Lcom/ifriend/chat/api/ChatScreenFactory;", "getChatScreenFactory", "()Lcom/ifriend/chat/api/ChatScreenFactory;", "setChatScreenFactory", "(Lcom/ifriend/chat/api/ChatScreenFactory;)V", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "getCoroutineDispatchers", "()Lcom/ifriend/domain/CoroutineDispatchers;", "setCoroutineDispatchers", "(Lcom/ifriend/domain/CoroutineDispatchers;)V", "daggerComponent", "Lcom/ifriend/chat/presentation/di/ChatComponent;", "getDaggerComponent", "()Lcom/ifriend/chat/presentation/di/ChatComponent;", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "googleSignInClient$delegate", "Lkotlin/Lazy;", "listenTagsUseCase", "Lcom/ifriend/domain/useCases/socket/ListenTagsUseCase;", "getListenTagsUseCase", "()Lcom/ifriend/domain/useCases/socket/ListenTagsUseCase;", "setListenTagsUseCase", "(Lcom/ifriend/domain/useCases/socket/ListenTagsUseCase;)V", "messagesSourceLifecycleController", "Landroidx/lifecycle/DefaultLifecycleObserver;", "getMessagesSourceLifecycleController$annotations", "getMessagesSourceLifecycleController", "()Landroidx/lifecycle/DefaultLifecycleObserver;", "setMessagesSourceLifecycleController", "(Landroidx/lifecycle/DefaultLifecycleObserver;)V", "navigator", "Lcom/ifriend/chat/presentation/ui/AppActivityNavigator;", "getNavigator", "()Lcom/ifriend/chat/presentation/ui/AppActivityNavigator;", "navigator$delegate", "notificationHandlersRegister", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "getNotificationHandlersRegister", "()Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "setNotificationHandlersRegister", "(Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;)V", "notificationsMapper", "Lcom/ifriend/domain/data/Mapper;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "getNotificationsMapper", "()Lcom/ifriend/domain/data/Mapper;", "setNotificationsMapper", "(Lcom/ifriend/domain/data/Mapper;)V", "screenshotDetectionDelegate", "Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate;", "updateLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "viewModel", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onResume", "onResumeFragments", "onSaveInstanceState", "outState", "onScreenCaptured", ClientCookie.PATH_ATTR, "", "onScreenCapturedWithDeniedPermission", "onStart", "onStop", "trackScreenshot", "presentation_release", "inAppUpdateState", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "state", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$UiState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppActivity extends BaseActivity implements ScreenshotDetectionDelegate.ScreenshotDetectionListener, AppDiProvider {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AppActivity.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/ActivityAppBinding;", 0))};
    public static final int $stable = 8;
    @Inject
    public Cicerone<AppRouter> appCicerone;
    @Inject
    public AppFlowCoordinator appFlowCoordinator;
    private final ViewBindingProperty binding$delegate;
    @Inject
    public ChatScreenFactory chatScreenFactory;
    @Inject
    public CoroutineDispatchers coroutineDispatchers;
    private final ChatComponent daggerComponent;
    private final Lazy googleSignInClient$delegate;
    @Inject
    public ListenTagsUseCase listenTagsUseCase;
    @Inject
    public DefaultLifecycleObserver messagesSourceLifecycleController;
    private final Lazy navigator$delegate;
    @Inject
    public InternalNotificationHandlersRegister notificationHandlersRegister;
    @Inject
    public Mapper<InternalNotification, SnackbarDescription> notificationsMapper;
    private final ScreenshotDetectionDelegate screenshotDetectionDelegate;
    private final ActivityResultLauncher<IntentSenderRequest> updateLauncher;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;

    @MessagesSourceLifecycleObserver
    public static /* synthetic */ void getMessagesSourceLifecycleController$annotations() {
    }

    public AppActivity() {
        super(R.layout.activity_app);
        ChatComponent.Builder context = DaggerChatComponent.builder().coreComponent(BaseComponentHolder.INSTANCE.get()).context(this);
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.daggerComponent = context.screenLifecycle(lifecycle).activity(this).build();
        AppActivity appActivity = this;
        this.binding$delegate = ActivityViewBindings.viewBindingActivityWithCallbacks(appActivity, UtilsKt.emptyVbCallback(), new AppActivity$special$$inlined$viewBindingActivity$default$1());
        this.viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AppViewModel.class), new AppActivity$special$$inlined$viewModels$default$2(appActivity), new AppActivity$viewModel$2(this), new AppActivity$special$$inlined$viewModels$default$3(null, appActivity));
        this.screenshotDetectionDelegate = new ScreenshotDetectionDelegate(this, this);
        this.navigator$delegate = LazyKt.lazy(new AppActivity$navigator$2(this));
        ActivityResultLauncher<IntentSenderRequest> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback<ActivityResult>() { // from class: com.ifriend.chat.presentation.ui.AppActivity$updateLauncher$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult activityResult) {
                AppViewModel viewModel;
                viewModel = AppActivity.this.getViewModel();
                Intrinsics.checkNotNull(activityResult);
                viewModel.onUpdatePromptResult(activityResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.updateLauncher = registerForActivityResult;
        this.googleSignInClient$delegate = LazyKt.lazy(new AppActivity$googleSignInClient$2(this));
    }

    public final ChatComponent getDaggerComponent() {
        return this.daggerComponent;
    }

    private final ActivityAppBinding getBinding() {
        return (ActivityAppBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final Cicerone<AppRouter> getAppCicerone() {
        Cicerone<AppRouter> cicerone = this.appCicerone;
        if (cicerone != null) {
            return cicerone;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appCicerone");
        return null;
    }

    public final void setAppCicerone(Cicerone<AppRouter> cicerone) {
        Intrinsics.checkNotNullParameter(cicerone, "<set-?>");
        this.appCicerone = cicerone;
    }

    public final AppFlowCoordinator getAppFlowCoordinator() {
        AppFlowCoordinator appFlowCoordinator = this.appFlowCoordinator;
        if (appFlowCoordinator != null) {
            return appFlowCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appFlowCoordinator");
        return null;
    }

    public final void setAppFlowCoordinator(AppFlowCoordinator appFlowCoordinator) {
        Intrinsics.checkNotNullParameter(appFlowCoordinator, "<set-?>");
        this.appFlowCoordinator = appFlowCoordinator;
    }

    public final Mapper<InternalNotification, SnackbarDescription> getNotificationsMapper() {
        Mapper<InternalNotification, SnackbarDescription> mapper = this.notificationsMapper;
        if (mapper != null) {
            return mapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationsMapper");
        return null;
    }

    public final void setNotificationsMapper(Mapper<InternalNotification, SnackbarDescription> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "<set-?>");
        this.notificationsMapper = mapper;
    }

    public final DefaultLifecycleObserver getMessagesSourceLifecycleController() {
        DefaultLifecycleObserver defaultLifecycleObserver = this.messagesSourceLifecycleController;
        if (defaultLifecycleObserver != null) {
            return defaultLifecycleObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messagesSourceLifecycleController");
        return null;
    }

    public final void setMessagesSourceLifecycleController(DefaultLifecycleObserver defaultLifecycleObserver) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "<set-?>");
        this.messagesSourceLifecycleController = defaultLifecycleObserver;
    }

    public final InternalNotificationHandlersRegister getNotificationHandlersRegister() {
        InternalNotificationHandlersRegister internalNotificationHandlersRegister = this.notificationHandlersRegister;
        if (internalNotificationHandlersRegister != null) {
            return internalNotificationHandlersRegister;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationHandlersRegister");
        return null;
    }

    public final void setNotificationHandlersRegister(InternalNotificationHandlersRegister internalNotificationHandlersRegister) {
        Intrinsics.checkNotNullParameter(internalNotificationHandlersRegister, "<set-?>");
        this.notificationHandlersRegister = internalNotificationHandlersRegister;
    }

    public final ViewModelFactory getViewModelFactory() {
        ViewModelFactory viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ViewModelFactory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }

    public final ChatScreenFactory getChatScreenFactory() {
        ChatScreenFactory chatScreenFactory = this.chatScreenFactory;
        if (chatScreenFactory != null) {
            return chatScreenFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatScreenFactory");
        return null;
    }

    public final void setChatScreenFactory(ChatScreenFactory chatScreenFactory) {
        Intrinsics.checkNotNullParameter(chatScreenFactory, "<set-?>");
        this.chatScreenFactory = chatScreenFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppViewModel getViewModel() {
        return (AppViewModel) this.viewModel$delegate.getValue();
    }

    private final AppActivityNavigator getNavigator() {
        return (AppActivityNavigator) this.navigator$delegate.getValue();
    }

    public final ListenTagsUseCase getListenTagsUseCase() {
        ListenTagsUseCase listenTagsUseCase = this.listenTagsUseCase;
        if (listenTagsUseCase != null) {
            return listenTagsUseCase;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listenTagsUseCase");
        return null;
    }

    public final void setListenTagsUseCase(ListenTagsUseCase listenTagsUseCase) {
        Intrinsics.checkNotNullParameter(listenTagsUseCase, "<set-?>");
        this.listenTagsUseCase = listenTagsUseCase;
    }

    public final CoroutineDispatchers getCoroutineDispatchers() {
        CoroutineDispatchers coroutineDispatchers = this.coroutineDispatchers;
        if (coroutineDispatchers != null) {
            return coroutineDispatchers;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineDispatchers");
        return null;
    }

    public final void setCoroutineDispatchers(CoroutineDispatchers coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "<set-?>");
        this.coroutineDispatchers = coroutineDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoogleSignInClient getGoogleSignInClient() {
        return (GoogleSignInClient) this.googleSignInClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.daggerComponent.inject(this);
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("AppActivity.PID", 0)) : null;
        int myPid = Process.myPid();
        if (bundle == null || valueOf == null || valueOf.intValue() != myPid) {
            super.onCreate(null);
            getViewModel().onNewProcess(getIntent());
        } else {
            super.onCreate(bundle);
        }
        getLifecycle().addObserver(getMessagesSourceLifecycleController());
        AppActivity appActivity = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(appActivity), getCoroutineDispatchers().getIO(), null, new AppActivity$onCreate$1(this, null), 2, null);
        AppViewModel viewModel = getViewModel();
        getLifecycle().addObserver(viewModel);
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        UiStateExtKt.collectEvent$default(viewModel, lifecycle, (Lifecycle.State) null, new AppActivity$onCreate$2$1(this), 2, (Object) null);
        Flow<InAppUpdateEvent> startUpdateEvents = viewModel.getStartUpdateEvents();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(appActivity), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new AppActivity$onCreate$lambda$1$$inlined$collectIn$default$1(FlowExtKt.flowWithLifecycle$default(startUpdateEvents, lifecycle2, null, 2, null), null, this));
        ComposeView composeView = getBinding().composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-999391745, true, new AppActivity$onCreate$3$1(this)));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getViewModel().onNewIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.screenshotDetectionDelegate.startScreenshotDetection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.screenshotDetectionDelegate.stopScreenshotDetection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getNotificationHandlersRegister().register("ChatScreen", new SnackbarNotificationHandler(this, getNotificationsMapper()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        getAppCicerone().getNavigatorHolder().setNavigator(getNavigator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        getAppCicerone().getNavigatorHolder().removeNavigator();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(getMessagesSourceLifecycleController());
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("AppActivity.PID", Process.myPid());
    }

    @Override // com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate.ScreenshotDetectionListener
    public void onScreenCaptured(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        trackScreenshot();
    }

    @Override // com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate.ScreenshotDetectionListener
    public void onScreenCapturedWithDeniedPermission() {
        trackScreenshot();
    }

    private final void trackScreenshot() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BaseFragment) {
                arrayList.add(obj);
            }
        }
        BaseFragment baseFragment = (BaseFragment) CollectionsKt.lastOrNull((List<? extends Object>) arrayList);
        if (baseFragment == null) {
            return;
        }
        String simpleName = baseFragment.getClass().getSimpleName();
        AnalyticsScreenName findByTag = AnalyticsScreenName.Companion.findByTag(baseFragment.getTag());
        AppViewModel viewModel = getViewModel();
        Intrinsics.checkNotNull(simpleName);
        viewModel.onTrackScreenshot(findByTag, simpleName);
    }

    @Override // com.ifriend.presentation.features.app.di.AppDiProvider
    public AppPresentationProvider getAppPresentationProvider() {
        return this.daggerComponent;
    }

    @Override // com.ifriend.presentation.features.app.di.AppDiProvider
    public AppViewModelProvider getAppViewModelProvider() {
        return this.daggerComponent;
    }
}
