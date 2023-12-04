package com.ifriend.registration.presentation.ui.registration;

import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.models.authorization.TokenLoginResponse;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationEvents;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoBackgroundRegistrationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$init$1", f = "VideoBackgroundRegistrationViewModel.kt", i = {}, l = {81, 84, 93}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VideoBackgroundRegistrationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundRegistrationViewModel$init$1(VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel, Continuation<? super VideoBackgroundRegistrationViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = videoBackgroundRegistrationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoBackgroundRegistrationViewModel$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VideoBackgroundRegistrationViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoBackgroundRegistrationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$init$1$1", f = "VideoBackgroundRegistrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$init$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ VideoBackgroundRegistrationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = videoBackgroundRegistrationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.updateLoading(true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SignInWithTokenUseCase signInWithTokenUseCase;
        TokenLoginResponse tokenLoginResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            tokenLoginResponse = (TokenLoginResponse) obj;
            if (!(!(tokenLoginResponse instanceof TokenLoginResponse.TokenIsNotValid) ? true : tokenLoginResponse instanceof TokenLoginResponse.Failure)) {
                this.this$0.updateShowingUI(true);
            } else if (tokenLoginResponse instanceof TokenLoginResponse.Success) {
                this.this$0.updateShowingUI(false);
                this.this$0.postEvent(VideoBackgroundRegistrationEvents.NavigateNext.INSTANCE);
            }
            this.label = 3;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        signInWithTokenUseCase = this.this$0.signInUseCase;
        this.label = 2;
        obj = SignInWithTokenUseCase.signIn$default(signInWithTokenUseCase, null, false, this, 3, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenLoginResponse = (TokenLoginResponse) obj;
        if (!(!(tokenLoginResponse instanceof TokenLoginResponse.TokenIsNotValid) ? true : tokenLoginResponse instanceof TokenLoginResponse.Failure)) {
        }
        this.label = 3;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.this$0, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoBackgroundRegistrationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$init$1$2", f = "VideoBackgroundRegistrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel$init$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ VideoBackgroundRegistrationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = videoBackgroundRegistrationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.updateLoading(false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
