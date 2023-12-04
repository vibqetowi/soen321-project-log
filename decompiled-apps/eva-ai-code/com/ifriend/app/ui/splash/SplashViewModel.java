package com.ifriend.app.ui.splash;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationAppOpenedUseCase;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.common_utils.Constants;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.models.ConfirmEmailData;
import com.ifriend.domain.models.authorization.TokenLoginResponse;
import com.ifriend.registration.StartRegistrationUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SplashViewModel.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\"\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J#\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010!H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/ifriend/app/ui/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "signInWithTokenUseCase", "Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;", "startRegistrationUseCase", "Lcom/ifriend/registration/StartRegistrationUseCase;", "appActivityScreenFactory", "Lcom/ifriend/chat/api/AppActivityScreenFactory;", "confirmEmailRepository", "Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "analyticsAppOpenUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsAppOpenUseCase;", "analyticsSetUserIdUseCase", "Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;", "analyticsFirstAppOpenUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsFirstAppOpenUseCase;", "analyticsNotificationAppOpenedUseCase", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationAppOpenedUseCase;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "сhatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "(Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;Lcom/ifriend/registration/StartRegistrationUseCase;Lcom/ifriend/chat/api/AppActivityScreenFactory;Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/analytics/usecase/appOpen/AnalyticsAppOpenUseCase;Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;Lcom/ifriend/analytics/usecase/appOpen/AnalyticsFirstAppOpenUseCase;Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationAppOpenedUseCase;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;)V", "handleFirstOpen", "", "activity", "Landroid/app/Activity;", "init", "confirmEmailData", "Lcom/ifriend/domain/models/ConfirmEmailData;", "auth", "", "loginAndNavigate", "authToken", "sendNotificationAnalyticsEventIfNeed", "startChat", "startRegistration", "tryLoginAndNavigate", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SplashViewModel extends ViewModel {
    private final AnalyticsFirstAppOpenUseCase analyticsFirstAppOpenUseCase;
    private final AnalyticsNotificationAppOpenedUseCase analyticsNotificationAppOpenedUseCase;
    private final AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase;
    private final AppActivityScreenFactory appActivityScreenFactory;
    private final ConfirmEmailRepository confirmEmailRepository;
    private final CoroutineScope coroutineScope;
    private final CoroutineDispatchers dispatchers;
    private final SignInWithTokenUseCase signInWithTokenUseCase;
    private final StartRegistrationUseCase startRegistrationUseCase;

    /* renamed from: сhatsInfoConfigurationRepository  reason: contains not printable characters */
    private final ChatsInfoConfigurationRepository f63hatsInfoConfigurationRepository;

    @Inject
    public SplashViewModel(SignInWithTokenUseCase signInWithTokenUseCase, StartRegistrationUseCase startRegistrationUseCase, AppActivityScreenFactory appActivityScreenFactory, ConfirmEmailRepository confirmEmailRepository, CoroutineScope coroutineScope, AnalyticsAppOpenUseCase analyticsAppOpenUseCase, AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase, AnalyticsFirstAppOpenUseCase analyticsFirstAppOpenUseCase, AnalyticsNotificationAppOpenedUseCase analyticsNotificationAppOpenedUseCase, CoroutineDispatchers dispatchers, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository) {
        Intrinsics.checkNotNullParameter(signInWithTokenUseCase, "signInWithTokenUseCase");
        Intrinsics.checkNotNullParameter(startRegistrationUseCase, "startRegistrationUseCase");
        Intrinsics.checkNotNullParameter(appActivityScreenFactory, "appActivityScreenFactory");
        Intrinsics.checkNotNullParameter(confirmEmailRepository, "confirmEmailRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(analyticsAppOpenUseCase, "analyticsAppOpenUseCase");
        Intrinsics.checkNotNullParameter(analyticsSetUserIdUseCase, "analyticsSetUserIdUseCase");
        Intrinsics.checkNotNullParameter(analyticsFirstAppOpenUseCase, "analyticsFirstAppOpenUseCase");
        Intrinsics.checkNotNullParameter(analyticsNotificationAppOpenedUseCase, "analyticsNotificationAppOpenedUseCase");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "сhatsInfoConfigurationRepository");
        this.signInWithTokenUseCase = signInWithTokenUseCase;
        this.startRegistrationUseCase = startRegistrationUseCase;
        this.appActivityScreenFactory = appActivityScreenFactory;
        this.confirmEmailRepository = confirmEmailRepository;
        this.coroutineScope = coroutineScope;
        this.analyticsSetUserIdUseCase = analyticsSetUserIdUseCase;
        this.analyticsFirstAppOpenUseCase = analyticsFirstAppOpenUseCase;
        this.analyticsNotificationAppOpenedUseCase = analyticsNotificationAppOpenedUseCase;
        this.dispatchers = dispatchers;
        this.f63hatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        analyticsAppOpenUseCase.handle();
    }

    public final void init(Activity activity, ConfirmEmailData confirmEmailData, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        handleFirstOpen(activity);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new SplashViewModel$init$1(confirmEmailData, this, null), 3, null);
        loginAndNavigate(activity, str);
    }

    private final void loginAndNavigate(Activity activity, String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatchers.getIO(), null, new SplashViewModel$loginAndNavigate$1(this, activity, str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryLoginAndNavigate(Activity activity, String str, Continuation<? super Unit> continuation) {
        SplashViewModel$tryLoginAndNavigate$1 splashViewModel$tryLoginAndNavigate$1;
        int i;
        SplashViewModel splashViewModel;
        TokenLoginResponse tokenLoginResponse;
        if (continuation instanceof SplashViewModel$tryLoginAndNavigate$1) {
            splashViewModel$tryLoginAndNavigate$1 = (SplashViewModel$tryLoginAndNavigate$1) continuation;
            if ((splashViewModel$tryLoginAndNavigate$1.label & Integer.MIN_VALUE) != 0) {
                splashViewModel$tryLoginAndNavigate$1.label -= Integer.MIN_VALUE;
                Object obj = splashViewModel$tryLoginAndNavigate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = splashViewModel$tryLoginAndNavigate$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SignInWithTokenUseCase signInWithTokenUseCase = this.signInWithTokenUseCase;
                    splashViewModel$tryLoginAndNavigate$1.L$0 = this;
                    splashViewModel$tryLoginAndNavigate$1.L$1 = activity;
                    splashViewModel$tryLoginAndNavigate$1.label = 1;
                    obj = SignInWithTokenUseCase.signIn$default(signInWithTokenUseCase, str, false, splashViewModel$tryLoginAndNavigate$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    splashViewModel = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    activity = (Activity) splashViewModel$tryLoginAndNavigate$1.L$1;
                    splashViewModel = (SplashViewModel) splashViewModel$tryLoginAndNavigate$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                tokenLoginResponse = (TokenLoginResponse) obj;
                if (!(tokenLoginResponse instanceof TokenLoginResponse.Success)) {
                    splashViewModel.analyticsSetUserIdUseCase.setUserId(((TokenLoginResponse.Success) tokenLoginResponse).getBody().getId());
                    splashViewModel$tryLoginAndNavigate$1.L$0 = null;
                    splashViewModel$tryLoginAndNavigate$1.L$1 = null;
                    splashViewModel$tryLoginAndNavigate$1.label = 2;
                    if (BuildersKt.withContext(splashViewModel.dispatchers.getMain(), new SplashViewModel$tryLoginAndNavigate$2(splashViewModel, activity, null), splashViewModel$tryLoginAndNavigate$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                splashViewModel$tryLoginAndNavigate$1.L$0 = null;
                splashViewModel$tryLoginAndNavigate$1.L$1 = null;
                splashViewModel$tryLoginAndNavigate$1.label = 3;
                if (BuildersKt.withContext(splashViewModel.dispatchers.getMain(), new SplashViewModel$tryLoginAndNavigate$3(splashViewModel, activity, null), splashViewModel$tryLoginAndNavigate$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        splashViewModel$tryLoginAndNavigate$1 = new SplashViewModel$tryLoginAndNavigate$1(this, continuation);
        Object obj2 = splashViewModel$tryLoginAndNavigate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = splashViewModel$tryLoginAndNavigate$1.label;
        if (i != 0) {
        }
        tokenLoginResponse = (TokenLoginResponse) obj2;
        if (!(tokenLoginResponse instanceof TokenLoginResponse.Success)) {
        }
    }

    private final void handleFirstOpen(Activity activity) {
        SharedPreferences sharedPreferences = activity.getSharedPreferences("first_open", 0);
        if (sharedPreferences == null || !sharedPreferences.getBoolean("isFirstOpen", true)) {
            return;
        }
        this.analyticsFirstAppOpenUseCase.handle();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("isFirstOpen", false);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startChat(Activity activity) {
        String uri;
        String stringExtra = activity.getIntent().getStringExtra(Constants.DEEP_LINK_URI);
        if (stringExtra == null) {
            stringExtra = null;
        }
        Uri data = activity.getIntent().getData();
        if (data != null && (uri = data.toString()) != null) {
            stringExtra = uri;
        }
        activity.startActivity(this.appActivityScreenFactory.appActivityScreen(stringExtra).createIntent(activity));
        sendNotificationAnalyticsEventIfNeed(activity);
        activity.finish();
    }

    private final void sendNotificationAnalyticsEventIfNeed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent.getBooleanExtra(Constants.NOTIFICATION_OPEN_APP, false)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SplashViewModel$sendNotificationAnalyticsEventIfNeed$1(this, intent, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startRegistration(Activity activity) {
        this.startRegistrationUseCase.start(activity);
        activity.finish();
    }
}
