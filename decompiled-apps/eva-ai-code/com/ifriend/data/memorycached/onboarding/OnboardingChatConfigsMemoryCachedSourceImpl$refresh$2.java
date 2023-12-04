package com.ifriend.data.memorycached.onboarding;

import com.ifriend.data.common.InMemoryCachedSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: OnboardingChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.memorycached.onboarding.OnboardingChatConfigsMemoryCachedSourceImpl$refresh$2", f = "OnboardingChatConfigsMemoryCachedSourceImpl.kt", i = {}, l = {44, 44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class OnboardingChatConfigsMemoryCachedSourceImpl$refresh$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OnboardingChatConfigsMemoryCachedSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingChatConfigsMemoryCachedSourceImpl$refresh$2(OnboardingChatConfigsMemoryCachedSourceImpl onboardingChatConfigsMemoryCachedSourceImpl, Continuation<? super OnboardingChatConfigsMemoryCachedSourceImpl$refresh$2> continuation) {
        super(2, continuation);
        this.this$0 = onboardingChatConfigsMemoryCachedSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingChatConfigsMemoryCachedSourceImpl$refresh$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingChatConfigsMemoryCachedSourceImpl$refresh$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        String str;
        Object remoteConfigurations;
        InMemoryCachedSource inMemoryCachedSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedSource = this.this$0.getCachedSource();
            str = this.this$0.CACHED_KEY;
            Intrinsics.checkNotNullExpressionValue(str, "access$getCACHED_KEY$p(...)");
            this.L$0 = cachedSource;
            this.L$1 = str;
            this.label = 1;
            remoteConfigurations = this.this$0.getRemoteConfigurations(this);
            if (remoteConfigurations == coroutine_suspended) {
                return coroutine_suspended;
            }
            inMemoryCachedSource = cachedSource;
            obj = remoteConfigurations;
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            str = (String) this.L$1;
            inMemoryCachedSource = (InMemoryCachedSource) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (inMemoryCachedSource.replace(str, obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
