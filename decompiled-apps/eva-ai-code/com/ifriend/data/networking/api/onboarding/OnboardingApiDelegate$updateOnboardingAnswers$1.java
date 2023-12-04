package com.ifriend.data.networking.api.onboarding;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingApiDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.api.onboarding.OnboardingApiDelegate", f = "OnboardingApiDelegate.kt", i = {0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "updateOnboardingAnswers", n = {"this", TtmlNode.TAG_BODY}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class OnboardingApiDelegate$updateOnboardingAnswers$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingApiDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingApiDelegate$updateOnboardingAnswers$1(OnboardingApiDelegate onboardingApiDelegate, Continuation<? super OnboardingApiDelegate$updateOnboardingAnswers$1> continuation) {
        super(continuation);
        this.this$0 = onboardingApiDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateOnboardingAnswers;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateOnboardingAnswers = this.this$0.updateOnboardingAnswers(null, this);
        return updateOnboardingAnswers;
    }
}
