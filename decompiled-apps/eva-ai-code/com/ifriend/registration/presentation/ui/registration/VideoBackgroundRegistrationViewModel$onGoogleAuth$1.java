package com.ifriend.registration.presentation.ui.registration;

import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.registration.domain.useCase.google.AuthWithGoogleUseCase;
import com.ifriend.registration.domain.useCase.google.GoogleAccountData;
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
@DebugMetadata(c = "com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$onGoogleAuth$1", f = "VideoBackgroundRegistrationViewModel.kt", i = {}, l = {156, 157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationViewModel$onGoogleAuth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GoogleAccountData $accountData;
    int label;
    final /* synthetic */ VideoBackgroundRegistrationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundRegistrationViewModel$onGoogleAuth$1(VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel, GoogleAccountData googleAccountData, Continuation<? super VideoBackgroundRegistrationViewModel$onGoogleAuth$1> continuation) {
        super(2, continuation);
        this.this$0 = videoBackgroundRegistrationViewModel;
        this.$accountData = googleAccountData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoBackgroundRegistrationViewModel$onGoogleAuth$1(this.this$0, this.$accountData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VideoBackgroundRegistrationViewModel$onGoogleAuth$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AuthWithGoogleUseCase authWithGoogleUseCase;
        Object handleAuthResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            authWithGoogleUseCase = this.this$0.authWithGoogleUseCase;
            this.label = 1;
            obj = authWithGoogleUseCase.auth(this.$accountData, this);
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
        handleAuthResponse = videoBackgroundRegistrationViewModel.handleAuthResponse((EmailLoginResponse) obj, UserAuthorizedAnalyticsSender.Method.GOOGLE, this);
        if (handleAuthResponse == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
