package com.ifriend.domain.logic.infoonboarding;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InfoOnboardingSlideUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase", f = "InfoOnboardingSlideUseCase.kt", i = {}, l = {11}, m = "isNeedToShowInfoOnboarding", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InfoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InfoOnboardingSlideUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1(InfoOnboardingSlideUseCase infoOnboardingSlideUseCase, Continuation<? super InfoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1> continuation) {
        super(continuation);
        this.this$0 = infoOnboardingSlideUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isNeedToShowInfoOnboarding(this);
    }
}
