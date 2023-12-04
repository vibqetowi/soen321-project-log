package com.ifriend.registration.presentation.ui.registration;

import com.facebook.AccessToken;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.registration.domain.useCase.facebook.AuthWithFacebookUseCase;
import com.ifriend.registration.domain.useCase.facebook.FacebookAccountData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoBackgroundRegistrationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$signUpWithFacebookUserInfo$1", f = "VideoBackgroundRegistrationViewModel.kt", i = {}, l = {145, 149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationViewModel$signUpWithFacebookUserInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccessToken $accessToken;
    final /* synthetic */ FacebookAccountData $accountData;
    int label;
    final /* synthetic */ VideoBackgroundRegistrationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundRegistrationViewModel$signUpWithFacebookUserInfo$1(VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel, AccessToken accessToken, FacebookAccountData facebookAccountData, Continuation<? super VideoBackgroundRegistrationViewModel$signUpWithFacebookUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = videoBackgroundRegistrationViewModel;
        this.$accessToken = accessToken;
        this.$accountData = facebookAccountData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoBackgroundRegistrationViewModel$signUpWithFacebookUserInfo$1(this.this$0, this.$accessToken, this.$accountData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VideoBackgroundRegistrationViewModel$signUpWithFacebookUserInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AuthWithFacebookUseCase authWithFacebookUseCase;
        Object handleAuthResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            authWithFacebookUseCase = this.this$0.signUpFacebookUseCase;
            this.label = 1;
            obj = authWithFacebookUseCase.auth(this.$accessToken.getToken(), this.$accountData, this);
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
            ResultKt.throwOnFailure(obj);
        }
        VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel = this.this$0;
        this.label = 2;
        handleAuthResponse = videoBackgroundRegistrationViewModel.handleAuthResponse((EmailLoginResponse) obj, UserAuthorizedAnalyticsSender.Method.FB, this);
        if (handleAuthResponse == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
