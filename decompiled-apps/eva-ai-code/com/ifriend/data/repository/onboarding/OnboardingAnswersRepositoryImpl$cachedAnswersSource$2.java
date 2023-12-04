package com.ifriend.data.repository.onboarding;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.models.onboarding.OnboardingAnswers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingAnswersRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "Lcom/ifriend/domain/models/onboarding/OnboardingAnswers;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingAnswersRepositoryImpl$cachedAnswersSource$2 extends Lambda implements Function0<InMemoryCachedSource<String, OnboardingAnswers>> {
    final /* synthetic */ OnboardingAnswersRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingAnswersRepositoryImpl$cachedAnswersSource$2(OnboardingAnswersRepositoryImpl onboardingAnswersRepositoryImpl) {
        super(0);
        this.this$0 = onboardingAnswersRepositoryImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingAnswersRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lcom/ifriend/domain/models/onboarding/OnboardingAnswers;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.onboarding.OnboardingAnswersRepositoryImpl$cachedAnswersSource$2$1", f = "OnboardingAnswersRepositoryImpl.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.onboarding.OnboardingAnswersRepositoryImpl$cachedAnswersSource$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super OnboardingAnswers>, Object> {
        int label;
        final /* synthetic */ OnboardingAnswersRepositoryImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnboardingAnswersRepositoryImpl onboardingAnswersRepositoryImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = onboardingAnswersRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super OnboardingAnswers> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.this$0.updateOnboardingAnswers(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InMemoryCachedSource<String, OnboardingAnswers> invoke() {
        return new InMemoryCachedSource<>(null, new AnonymousClass1(this.this$0, null), null, 5, null);
    }
}
