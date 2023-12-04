package com.ifriend.data.repository.user;

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
/* compiled from: UserProfileRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.user.UserProfileRepositoryImpl$setOnboardingDataSubmitted$2", f = "UserProfileRepositoryImpl.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserProfileRepositoryImpl$setOnboardingDataSubmitted$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSubmitted;
    int label;
    final /* synthetic */ UserProfileRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileRepositoryImpl$setOnboardingDataSubmitted$2(UserProfileRepositoryImpl userProfileRepositoryImpl, boolean z, Continuation<? super UserProfileRepositoryImpl$setOnboardingDataSubmitted$2> continuation) {
        super(2, continuation);
        this.this$0 = userProfileRepositoryImpl;
        this.$isSubmitted = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileRepositoryImpl$setOnboardingDataSubmitted$2(this.this$0, this.$isSubmitted, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileRepositoryImpl$setOnboardingDataSubmitted$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserProfileRepositoryImpl$onboardingDataSubmitted$1 userProfileRepositoryImpl$onboardingDataSubmitted$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            userProfileRepositoryImpl$onboardingDataSubmitted$1 = this.this$0.onboardingDataSubmitted;
            this.label = 1;
            if (userProfileRepositoryImpl$onboardingDataSubmitted$1.set(this.$isSubmitted, this) == coroutine_suspended) {
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
