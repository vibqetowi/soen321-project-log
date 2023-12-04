package com.ifriend.data.memorycached.onboarding;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.common.RetryKt;
import com.ifriend.domain.logic.onboarding.OnboardingChatInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/domain/logic/onboarding/OnboardingChatInfo;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.memorycached.onboarding.OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2", f = "OnboardingChatConfigsMemoryCachedSourceImpl.kt", i = {0}, l = {48, 50}, m = "invokeSuspend", n = {"$this$executeInBackground"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends OnboardingChatInfo>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OnboardingChatConfigsMemoryCachedSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2(OnboardingChatConfigsMemoryCachedSourceImpl onboardingChatConfigsMemoryCachedSourceImpl, Continuation<? super OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2> continuation) {
        super(2, continuation);
        this.this$0 = onboardingChatConfigsMemoryCachedSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2 onboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2 = new OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2(this.this$0, continuation);
        onboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2.L$0 = obj;
        return onboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends OnboardingChatInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<OnboardingChatInfo>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<OnboardingChatInfo>> continuation) {
        return ((OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7271constructorimpl;
        AuthLocalDataSource authLocalDataSource;
        Object userId;
        Object retryRemoteRequest$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            authLocalDataSource = this.this$0.authLocalDataSource;
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            userId = authLocalDataSource.getUserId(this);
            if (userId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                retryRemoteRequest$default = obj;
                m7271constructorimpl = Result.m7271constructorimpl((List) retryRemoteRequest$default);
                return !Result.m7277isFailureimpl(m7271constructorimpl) ? CollectionsKt.emptyList() : m7271constructorimpl;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            userId = obj;
        }
        String str = (String) userId;
        if (str == null) {
            str = "";
        }
        OnboardingChatConfigsMemoryCachedSourceImpl onboardingChatConfigsMemoryCachedSourceImpl = this.this$0;
        Result.Companion companion2 = Result.Companion;
        this.L$0 = null;
        this.label = 2;
        retryRemoteRequest$default = RetryKt.retryRemoteRequest$default(2, 1000L, 0L, 0.0d, new OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2$1$1(onboardingChatConfigsMemoryCachedSourceImpl, str, null), this, 12, null);
        if (retryRemoteRequest$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        m7271constructorimpl = Result.m7271constructorimpl((List) retryRemoteRequest$default);
        if (!Result.m7277isFailureimpl(m7271constructorimpl)) {
        }
    }
}
