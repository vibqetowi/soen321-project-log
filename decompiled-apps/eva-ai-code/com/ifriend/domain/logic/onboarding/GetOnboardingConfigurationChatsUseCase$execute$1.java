package com.ifriend.domain.logic.onboarding;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetOnboardingConfigurationChatsUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.onboarding.GetOnboardingConfigurationChatsUseCase", f = "GetOnboardingConfigurationChatsUseCase.kt", i = {0, 1, 2}, l = {14, 16, 17}, m = "execute", n = {"this", "this", "chatConfigs"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class GetOnboardingConfigurationChatsUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOnboardingConfigurationChatsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOnboardingConfigurationChatsUseCase$execute$1(GetOnboardingConfigurationChatsUseCase getOnboardingConfigurationChatsUseCase, Continuation<? super GetOnboardingConfigurationChatsUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = getOnboardingConfigurationChatsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(false, this);
    }
}
