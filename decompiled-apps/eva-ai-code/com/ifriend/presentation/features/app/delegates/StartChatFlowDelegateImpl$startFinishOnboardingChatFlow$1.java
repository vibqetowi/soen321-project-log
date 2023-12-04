package com.ifriend.presentation.features.app.delegates;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartChatFlowDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl", f = "StartChatFlowDelegate.kt", i = {0, 0, 1, 1}, l = {48, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, 57}, m = "startFinishOnboardingChatFlow", n = {"this", "$context_receiver_0", "this", "$context_receiver_0"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class StartChatFlowDelegateImpl$startFinishOnboardingChatFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StartChatFlowDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartChatFlowDelegateImpl$startFinishOnboardingChatFlow$1(StartChatFlowDelegateImpl startChatFlowDelegateImpl, Continuation<? super StartChatFlowDelegateImpl$startFinishOnboardingChatFlow$1> continuation) {
        super(continuation);
        this.this$0 = startChatFlowDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startFinishOnboardingChatFlow;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startFinishOnboardingChatFlow = this.this$0.startFinishOnboardingChatFlow(null, this);
        return startFinishOnboardingChatFlow;
    }
}
