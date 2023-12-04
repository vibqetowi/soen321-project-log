package com.ifriend.presentation.features.app.delegates;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartChatFlowDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl", f = "StartChatFlowDelegate.kt", i = {0, 0, 1, 1, 2, 2, 2, 4}, l = {63, 64, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 72, 76, 77}, m = "startAppChatFlow", n = {"this", "$context_receiver_0", "this", "$context_receiver_0", "this", "$context_receiver_0", "chatInfo", "$context_receiver_0"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes6.dex */
public final class StartChatFlowDelegateImpl$startAppChatFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StartChatFlowDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartChatFlowDelegateImpl$startAppChatFlow$1(StartChatFlowDelegateImpl startChatFlowDelegateImpl, Continuation<? super StartChatFlowDelegateImpl$startAppChatFlow$1> continuation) {
        super(continuation);
        this.this$0 = startChatFlowDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startAppChatFlow;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startAppChatFlow = this.this$0.startAppChatFlow(null, this);
        return startAppChatFlow;
    }
}
