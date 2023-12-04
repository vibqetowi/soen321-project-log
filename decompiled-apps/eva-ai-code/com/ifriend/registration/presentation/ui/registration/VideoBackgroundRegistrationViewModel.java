package com.ifriend.registration.presentation.ui.registration;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.facebook.AccessToken;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.common_utils.Format;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.models.authorization.AuthResult;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.registration.domain.useCase.facebook.AuthWithFacebookUseCase;
import com.ifriend.registration.domain.useCase.facebook.FacebookAccountData;
import com.ifriend.registration.domain.useCase.google.AuthWithGoogleUseCase;
import com.ifriend.registration.domain.useCase.google.GoogleAccountData;
import com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridge;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationEvents;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* compiled from: VideoBackgroundRegistrationViewModel.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J'\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\"J\u0006\u0010*\u001a\u00020\"J\u000e\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020\"2\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\"H\u0002J\u001a\u00105\u001a\u00020\"2\u0006\u0010,\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0006\u00109\u001a\u00020\"J\u000e\u0010:\u001a\u00020\"2\u0006\u0010/\u001a\u000200J\u0010\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020=H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationState;", "userAuthorizedAnalyticsSender", "Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender;", "analyticsSetUserIdUseCase", "Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;", "signUpFacebookUseCase", "Lcom/ifriend/registration/domain/useCase/facebook/AuthWithFacebookUseCase;", "authWithGoogleUseCase", "Lcom/ifriend/registration/domain/useCase/google/AuthWithGoogleUseCase;", "facebookLoginBridge", "Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationBridge;", "signInUseCase", "Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "logger", "Lcom/ifriend/common_utils/Logger;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender;Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;Lcom/ifriend/registration/domain/useCase/facebook/AuthWithFacebookUseCase;Lcom/ifriend/registration/domain/useCase/google/AuthWithGoogleUseCase;Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationBridge;Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;Lcom/ifriend/domain/useCases/AppConfigUseCase;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/CoroutineDispatchers;)V", "loadingJob", "Lkotlinx/coroutines/Job;", "privacyPolicyLink", "", "getPrivacyPolicyLink", "()Ljava/lang/String;", "setPrivacyPolicyLink", "(Ljava/lang/String;)V", "termsOfServiceLink", "getTermsOfServiceLink", "setTermsOfServiceLink", "handleAuthResponse", "", "response", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "Lcom/ifriend/domain/models/authorization/AuthResult;", FirebaseAnalytics.Param.METHOD, "Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender$Method;", "(Lcom/ifriend/domain/models/authorization/EmailLoginResponse;Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender$Method;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "onClickOtherOptions", "onGoogleAuth", "accountData", "Lcom/ifriend/registration/domain/useCase/google/GoogleAccountData;", "privacyPolicyClick", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "signUpWithFacebook", "fragment", "Landroidx/fragment/app/Fragment;", "signUpWithFacebookFailed", "signUpWithFacebookUserInfo", "Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;", "accessToken", "Lcom/facebook/AccessToken;", "startEmailRegistration", "termsOfServiceClick", "updateLoading", "isLoading", "", "updateShowingUI", "isShowing", "AuthorizationResponseException", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationViewModel extends BaseViewModel<VideoBackgroundRegistrationState> {
    public static final int $stable = 8;
    private final AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase;
    private final AppConfigUseCase appConfigUseCase;
    private final AuthWithGoogleUseCase authWithGoogleUseCase;
    private final FacebookAuthorizationBridge facebookLoginBridge;
    private Job loadingJob;
    private final Logger logger;
    private String privacyPolicyLink;
    private final SignInWithTokenUseCase signInUseCase;
    private final AuthWithFacebookUseCase signUpFacebookUseCase;
    private String termsOfServiceLink;
    private final UserAuthorizedAnalyticsSender userAuthorizedAnalyticsSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public VideoBackgroundRegistrationViewModel(UserAuthorizedAnalyticsSender userAuthorizedAnalyticsSender, AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase, AuthWithFacebookUseCase signUpFacebookUseCase, AuthWithGoogleUseCase authWithGoogleUseCase, FacebookAuthorizationBridge facebookLoginBridge, SignInWithTokenUseCase signInUseCase, AppConfigUseCase appConfigUseCase, Logger logger, CoroutineDispatchers dispatchers) {
        super(dispatchers, VideoBackgroundRegistrationState.Companion.initial());
        Intrinsics.checkNotNullParameter(userAuthorizedAnalyticsSender, "userAuthorizedAnalyticsSender");
        Intrinsics.checkNotNullParameter(analyticsSetUserIdUseCase, "analyticsSetUserIdUseCase");
        Intrinsics.checkNotNullParameter(signUpFacebookUseCase, "signUpFacebookUseCase");
        Intrinsics.checkNotNullParameter(authWithGoogleUseCase, "authWithGoogleUseCase");
        Intrinsics.checkNotNullParameter(facebookLoginBridge, "facebookLoginBridge");
        Intrinsics.checkNotNullParameter(signInUseCase, "signInUseCase");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.userAuthorizedAnalyticsSender = userAuthorizedAnalyticsSender;
        this.analyticsSetUserIdUseCase = analyticsSetUserIdUseCase;
        this.signUpFacebookUseCase = signUpFacebookUseCase;
        this.authWithGoogleUseCase = authWithGoogleUseCase;
        this.facebookLoginBridge = facebookLoginBridge;
        this.signInUseCase = signInUseCase;
        this.appConfigUseCase = appConfigUseCase;
        this.logger = logger;
        facebookLoginBridge.subscribeOnLogin(new AnonymousClass1(this), new AnonymousClass2(this));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(null), 3, null);
    }

    public final String getTermsOfServiceLink() {
        return this.termsOfServiceLink;
    }

    public final void setTermsOfServiceLink(String str) {
        this.termsOfServiceLink = str;
    }

    public final String getPrivacyPolicyLink() {
        return this.privacyPolicyLink;
    }

    public final void setPrivacyPolicyLink(String str) {
        this.privacyPolicyLink = str;
    }

    /* compiled from: VideoBackgroundRegistrationViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<FacebookAccountData, AccessToken, Unit> {
        AnonymousClass1(Object obj) {
            super(2, obj, VideoBackgroundRegistrationViewModel.class, "signUpWithFacebookUserInfo", "signUpWithFacebookUserInfo(Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;Lcom/facebook/AccessToken;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FacebookAccountData facebookAccountData, AccessToken accessToken) {
            invoke2(facebookAccountData, accessToken);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(FacebookAccountData p0, AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((VideoBackgroundRegistrationViewModel) this.receiver).signUpWithFacebookUserInfo(p0, accessToken);
        }
    }

    /* compiled from: VideoBackgroundRegistrationViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass2(Object obj) {
            super(0, obj, VideoBackgroundRegistrationViewModel.class, "signUpWithFacebookFailed", "signUpWithFacebookFailed()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((VideoBackgroundRegistrationViewModel) this.receiver).signUpWithFacebookFailed();
        }
    }

    /* compiled from: VideoBackgroundRegistrationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$3", f = "VideoBackgroundRegistrationViewModel.kt", i = {1}, l = {58, LockFreeTaskQueueCore.CLOSED_SHIFT, 65}, m = "invokeSuspend", n = {"webHost"}, s = {"L$1"})
    /* renamed from: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel;
            Format format;
            String str2;
            VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel2;
            String str3;
            Object linkValue;
            VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel3;
            Format format2;
            String str4;
            String str5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = VideoBackgroundRegistrationViewModel.this.appConfigUseCase.getEndpointValue(ConfigKeys.WEB_HOST, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        videoBackgroundRegistrationViewModel3 = (VideoBackgroundRegistrationViewModel) this.L$2;
                        format2 = (Format) this.L$1;
                        str4 = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        str5 = (String) obj;
                        if (str5 == null) {
                            str5 = "/pp.html";
                        }
                        videoBackgroundRegistrationViewModel3.setPrivacyPolicyLink(format2.buildLink(str4, str5));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Format format3 = (Format) this.L$3;
                ResultKt.throwOnFailure(obj);
                videoBackgroundRegistrationViewModel2 = (VideoBackgroundRegistrationViewModel) this.L$4;
                videoBackgroundRegistrationViewModel = (VideoBackgroundRegistrationViewModel) this.L$0;
                str2 = (String) this.L$2;
                str = (String) this.L$1;
                format = format3;
                str3 = (String) obj;
                if (str3 == null) {
                    str3 = "/terms.html";
                }
                videoBackgroundRegistrationViewModel2.setTermsOfServiceLink(format.buildLink(str2, str3));
                Format format4 = Format.INSTANCE;
                AppConfigUseCase appConfigUseCase = videoBackgroundRegistrationViewModel.appConfigUseCase;
                this.L$0 = str;
                this.L$1 = format4;
                this.L$2 = videoBackgroundRegistrationViewModel;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                linkValue = appConfigUseCase.getLinkValue(ConfigKeys.PRIVACY_POLICY, this);
                if (linkValue != coroutine_suspended) {
                    return coroutine_suspended;
                }
                videoBackgroundRegistrationViewModel3 = videoBackgroundRegistrationViewModel;
                format2 = format4;
                obj = linkValue;
                str4 = str;
                str5 = (String) obj;
                if (str5 == null) {
                }
                videoBackgroundRegistrationViewModel3.setPrivacyPolicyLink(format2.buildLink(str4, str5));
                return Unit.INSTANCE;
            } else {
                ResultKt.throwOnFailure(obj);
            }
            String str6 = (String) obj;
            if (str6 == null) {
                str6 = "\"https://www.evaapp.ai\"";
            }
            str = str6;
            videoBackgroundRegistrationViewModel = VideoBackgroundRegistrationViewModel.this;
            Format format5 = Format.INSTANCE;
            AppConfigUseCase appConfigUseCase2 = videoBackgroundRegistrationViewModel.appConfigUseCase;
            this.L$0 = videoBackgroundRegistrationViewModel;
            this.L$1 = str;
            this.L$2 = str;
            this.L$3 = format5;
            this.L$4 = videoBackgroundRegistrationViewModel;
            this.label = 2;
            Object linkValue2 = appConfigUseCase2.getLinkValue(ConfigKeys.TERMS, this);
            if (linkValue2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            format = format5;
            obj = linkValue2;
            str2 = str;
            videoBackgroundRegistrationViewModel2 = videoBackgroundRegistrationViewModel;
            str3 = (String) obj;
            if (str3 == null) {
            }
            videoBackgroundRegistrationViewModel2.setTermsOfServiceLink(format.buildLink(str2, str3));
            Format format42 = Format.INSTANCE;
            AppConfigUseCase appConfigUseCase3 = videoBackgroundRegistrationViewModel.appConfigUseCase;
            this.L$0 = str;
            this.L$1 = format42;
            this.L$2 = videoBackgroundRegistrationViewModel;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            linkValue = appConfigUseCase3.getLinkValue(ConfigKeys.PRIVACY_POLICY, this);
            if (linkValue != coroutine_suspended) {
            }
        }
    }

    public final void onClickOtherOptions() {
        changeState(VideoBackgroundRegistrationViewModel$onClickOtherOptions$1.INSTANCE);
    }

    public final void init() {
        Job launch$default;
        Job job = this.loadingJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VideoBackgroundRegistrationViewModel$init$1(this, null), 3, null);
        this.loadingJob = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLoading(boolean z) {
        changeState(new VideoBackgroundRegistrationViewModel$updateLoading$1(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateShowingUI(boolean z) {
        changeState(new VideoBackgroundRegistrationViewModel$updateShowingUI$1(z));
    }

    public final void startEmailRegistration() {
        postEvent(VideoBackgroundRegistrationEvents.NavigateToEmail.INSTANCE);
    }

    public final void signUpWithFacebook(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        updateLoading(true);
        this.facebookLoginBridge.loginInFacebook(fragment);
    }

    public final void termsOfServiceClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.termsOfServiceLink != null) {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.termsOfServiceLink)));
        }
    }

    public final void privacyPolicyClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.privacyPolicyLink != null) {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.privacyPolicyLink)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void signUpWithFacebookFailed() {
        updateLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void signUpWithFacebookUserInfo(FacebookAccountData facebookAccountData, AccessToken accessToken) {
        if (accessToken == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VideoBackgroundRegistrationViewModel$signUpWithFacebookUserInfo$1(this, accessToken, facebookAccountData, null), 3, null);
    }

    public final void onGoogleAuth(GoogleAccountData accountData) {
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        updateLoading(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VideoBackgroundRegistrationViewModel$onGoogleAuth$1(this, accountData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleAuthResponse(EmailLoginResponse<AuthResult> emailLoginResponse, UserAuthorizedAnalyticsSender.Method method, Continuation<? super Unit> continuation) {
        updateLoading(false);
        if (emailLoginResponse instanceof EmailLoginResponse.Failure) {
            String name = method.name();
            String message = ((EmailLoginResponse.Failure) emailLoginResponse).getMessage();
            this.logger.logException(new AuthorizationResponseException(name + " authorization failed. Server request error: " + message));
        } else {
            if (emailLoginResponse instanceof EmailLoginResponse.EmailInvalid ? true : emailLoginResponse instanceof EmailLoginResponse.EmailNotRegistered ? true : emailLoginResponse instanceof EmailLoginResponse.PasswordIsWrong) {
                String name2 = method.name();
                String simpleName = Reflection.getOrCreateKotlinClass(emailLoginResponse.getClass()).getSimpleName();
                this.logger.logException(new AuthorizationResponseException(name2 + " authorization failed. Server request error: " + simpleName));
            } else if (emailLoginResponse instanceof EmailLoginResponse.Success) {
                EmailLoginResponse.Success success = (EmailLoginResponse.Success) emailLoginResponse;
                this.analyticsSetUserIdUseCase.setUserId(((AuthResult) success.getData()).getUserId());
                this.userAuthorizedAnalyticsSender.send(((AuthResult) success.getData()).getUserCreated(), method);
                postEvent(VideoBackgroundRegistrationEvents.NavigateNext.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: VideoBackgroundRegistrationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationViewModel$AuthorizationResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AuthorizationResponseException extends Exception {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthorizationResponseException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }
}
