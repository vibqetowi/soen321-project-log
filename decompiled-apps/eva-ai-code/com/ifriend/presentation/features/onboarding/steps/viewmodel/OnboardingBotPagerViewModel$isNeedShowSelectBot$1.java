package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingBotPagerViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotPagerViewModel", f = "OnboardingBotPagerViewModel.kt", i = {}, l = {118}, m = "isNeedShowSelectBot", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingBotPagerViewModel$isNeedShowSelectBot$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingBotPagerViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotPagerViewModel$isNeedShowSelectBot$1(OnboardingBotPagerViewModel onboardingBotPagerViewModel, Continuation<? super OnboardingBotPagerViewModel$isNeedShowSelectBot$1> continuation) {
        super(continuation);
        this.this$0 = onboardingBotPagerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isNeedShowSelectBot(this);
    }
}