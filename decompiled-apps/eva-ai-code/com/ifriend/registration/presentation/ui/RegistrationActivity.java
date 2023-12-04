package com.ifriend.registration.presentation.ui;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import by.kirich1409.viewbindingdelegate.ActivityViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.ifriend.analytics.usecase.auth.AuthScreenOpenedAnalytics;
import com.ifriend.base.app.BaseComponentHolder;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.domain.data.Mapper;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.registration.domain.applicationState.ApplicationState;
import com.ifriend.registration.presentation.R;
import com.ifriend.registration.presentation.databinding.ActivityRegistrationBinding;
import com.ifriend.registration.presentation.di.DaggerRegistrationComponent;
import com.ifriend.registration.presentation.di.RegistrationComponent;
import com.ifriend.ui.SnackbarNotificationHandler;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
/* compiled from: RegistrationActivity.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010E\u001a\u00020FH\u0002J\u0012\u0010G\u001a\u00020F2\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020FH\u0014J\b\u0010K\u001a\u00020FH\u0014J\b\u0010L\u001a\u00020FH\u0014R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R,\u0010.\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u0001010/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u0001080807X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b<\u0010=R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006M²\u0006\n\u0010N\u001a\u00020OX\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/registration/presentation/ui/RegistrationActivity;", "Lcom/ifriend/ui/base/BaseActivity;", "()V", "appCicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "getAppCicerone", "()Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "setAppCicerone", "(Lcom/ifriend/base/navigation/api/cicerone/Cicerone;)V", "applicationState", "Lcom/ifriend/registration/domain/applicationState/ApplicationState;", "getApplicationState", "()Lcom/ifriend/registration/domain/applicationState/ApplicationState;", "setApplicationState", "(Lcom/ifriend/registration/domain/applicationState/ApplicationState;)V", "authOpenedAnalytics", "Lcom/ifriend/analytics/usecase/auth/AuthScreenOpenedAnalytics;", "getAuthOpenedAnalytics", "()Lcom/ifriend/analytics/usecase/auth/AuthScreenOpenedAnalytics;", "setAuthOpenedAnalytics", "(Lcom/ifriend/analytics/usecase/auth/AuthScreenOpenedAnalytics;)V", "binding", "Lcom/ifriend/registration/presentation/databinding/ActivityRegistrationBinding;", "getBinding", "()Lcom/ifriend/registration/presentation/databinding/ActivityRegistrationBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "daggerComponent", "Lcom/ifriend/registration/presentation/di/RegistrationComponent;", "getDaggerComponent", "()Lcom/ifriend/registration/presentation/di/RegistrationComponent;", "navigationContainerId", "", "navigator", "Lcom/ifriend/registration/presentation/ui/RegistrationNavigator;", "getNavigator", "()Lcom/ifriend/registration/presentation/ui/RegistrationNavigator;", "navigator$delegate", "Lkotlin/Lazy;", "notificationHandlersRegister", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "getNotificationHandlersRegister", "()Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "setNotificationHandlersRegister", "(Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;)V", "notificationsMapper", "Lcom/ifriend/domain/data/Mapper;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "getNotificationsMapper", "()Lcom/ifriend/domain/data/Mapper;", "setNotificationsMapper", "(Lcom/ifriend/domain/data/Mapper;)V", "updateLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "viewModel", "Lcom/ifriend/registration/presentation/ui/RegistrationViewModel;", "getViewModel", "()Lcom/ifriend/registration/presentation/ui/RegistrationViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/registration/presentation/ui/RegistrationViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/registration/presentation/ui/RegistrationViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/registration/presentation/ui/RegistrationViewModelFactory;)V", "navigateToRootScreen", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onResumeFragments", "presentation_release", "state", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegistrationActivity extends BaseActivity {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RegistrationActivity.class, "binding", "getBinding()Lcom/ifriend/registration/presentation/databinding/ActivityRegistrationBinding;", 0))};
    public static final int $stable = 8;
    @Inject
    public Cicerone<AppRouter> appCicerone;
    @Inject
    public ApplicationState applicationState;
    @Inject
    public AuthScreenOpenedAnalytics authOpenedAnalytics;
    private final ViewBindingProperty binding$delegate;
    private final RegistrationComponent daggerComponent;
    private final int navigationContainerId;
    private final Lazy navigator$delegate;
    @Inject
    public InternalNotificationHandlersRegister notificationHandlersRegister;
    @Inject
    public Mapper<InternalNotification, SnackbarDescription> notificationsMapper;
    private final ActivityResultLauncher<IntentSenderRequest> updateLauncher;
    private final Lazy viewModel$delegate;
    @Inject
    public RegistrationViewModelFactory viewModelFactory;

    public RegistrationActivity() {
        super(R.layout.activity_registration);
        this.daggerComponent = DaggerRegistrationComponent.builder().coreComponent(BaseComponentHolder.INSTANCE.get()).activity(this).build();
        RegistrationActivity registrationActivity = this;
        this.viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RegistrationViewModel.class), new RegistrationActivity$special$$inlined$viewModels$default$2(registrationActivity), new RegistrationActivity$viewModel$2(this), new RegistrationActivity$special$$inlined$viewModels$default$3(null, registrationActivity));
        this.navigationContainerId = R.id.registrationActivityFragmentContainer;
        this.navigator$delegate = LazyKt.lazy(new RegistrationActivity$navigator$2(this));
        this.binding$delegate = ActivityViewBindings.viewBindingActivityWithCallbacks(registrationActivity, UtilsKt.emptyVbCallback(), new RegistrationActivity$special$$inlined$viewBindingActivity$default$1());
        ActivityResultLauncher<IntentSenderRequest> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback<ActivityResult>() { // from class: com.ifriend.registration.presentation.ui.RegistrationActivity$updateLauncher$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult activityResult) {
                RegistrationViewModel viewModel;
                viewModel = RegistrationActivity.this.getViewModel();
                Intrinsics.checkNotNull(activityResult);
                viewModel.onUpdatePromptResult(activityResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.updateLauncher = registerForActivityResult;
    }

    public final RegistrationComponent getDaggerComponent() {
        return this.daggerComponent;
    }

    public final ApplicationState getApplicationState() {
        ApplicationState applicationState = this.applicationState;
        if (applicationState != null) {
            return applicationState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationState");
        return null;
    }

    public final void setApplicationState(ApplicationState applicationState) {
        Intrinsics.checkNotNullParameter(applicationState, "<set-?>");
        this.applicationState = applicationState;
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

    public final RegistrationViewModelFactory getViewModelFactory() {
        RegistrationViewModelFactory registrationViewModelFactory = this.viewModelFactory;
        if (registrationViewModelFactory != null) {
            return registrationViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(RegistrationViewModelFactory registrationViewModelFactory) {
        Intrinsics.checkNotNullParameter(registrationViewModelFactory, "<set-?>");
        this.viewModelFactory = registrationViewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RegistrationViewModel getViewModel() {
        return (RegistrationViewModel) this.viewModel$delegate.getValue();
    }

    private final RegistrationNavigator getNavigator() {
        return (RegistrationNavigator) this.navigator$delegate.getValue();
    }

    private final ActivityRegistrationBinding getBinding() {
        return (ActivityRegistrationBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final AuthScreenOpenedAnalytics getAuthOpenedAnalytics() {
        AuthScreenOpenedAnalytics authScreenOpenedAnalytics = this.authOpenedAnalytics;
        if (authScreenOpenedAnalytics != null) {
            return authScreenOpenedAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authOpenedAnalytics");
        return null;
    }

    public final void setAuthOpenedAnalytics(AuthScreenOpenedAnalytics authScreenOpenedAnalytics) {
        Intrinsics.checkNotNullParameter(authScreenOpenedAnalytics, "<set-?>");
        this.authOpenedAnalytics = authScreenOpenedAnalytics;
    }

    @Override // com.ifriend.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.daggerComponent.inject(this);
        super.onCreate(bundle);
        getApplicationState().init();
        if (getSupportFragmentManager().findFragmentById(this.navigationContainerId) == null) {
            navigateToRootScreen();
        }
        Flow<InAppUpdateEvent> startUpdateEvents = getViewModel().getStartUpdateEvents();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new RegistrationActivity$onCreate$$inlined$collectIn$default$1(FlowExtKt.flowWithLifecycle$default(startUpdateEvents, lifecycle, null, 2, null), null, this));
        ComposeView composeView = getBinding().composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-498137353, true, new RegistrationActivity$onCreate$2$1(this)));
    }

    private final void navigateToRootScreen() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new RegistrationActivity$navigateToRootScreen$1(this, null));
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
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().onResume();
        getNotificationHandlersRegister().register("RegistrationScreen", new SnackbarNotificationHandler(this, getNotificationsMapper()));
    }
}
