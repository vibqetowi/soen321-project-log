package com.ifriend.data.memorycached.onboarding;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.logic.onboarding.OnboardingChatInfo;
import java.util.List;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: OnboardingChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/onboarding/OnboardingChatInfo;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.memorycached.onboarding.OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2", f = "OnboardingChatConfigsMemoryCachedSourceImpl.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends List<? extends OnboardingChatInfo>>>, Object> {
    int label;
    final /* synthetic */ OnboardingChatConfigsMemoryCachedSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2(OnboardingChatConfigsMemoryCachedSourceImpl onboardingChatConfigsMemoryCachedSourceImpl, Continuation<? super OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = onboardingChatConfigsMemoryCachedSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<? extends OnboardingChatInfo>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<? extends List<OnboardingChatInfo>>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<OnboardingChatInfo>>> continuation) {
        return ((OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedSource = this.this$0.getCachedSource();
            str = this.this$0.CACHED_KEY;
            Intrinsics.checkNotNullExpressionValue(str, "access$getCACHED_KEY$p(...)");
            this.label = 1;
            obj = cachedSource.get(str, InMemoryCachedSource.Strategy.LOAD_IF_NO_CACHE, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return FlowKt.filterNotNull((Flow) obj);
    }
}
