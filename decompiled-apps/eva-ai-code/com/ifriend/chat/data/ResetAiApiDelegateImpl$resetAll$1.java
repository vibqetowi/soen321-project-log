package com.ifriend.chat.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetAiApiDelegateImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.data.ResetAiApiDelegateImpl", f = "ResetAiApiDelegateImpl.kt", i = {}, l = {21}, m = "resetAll", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ResetAiApiDelegateImpl$resetAll$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ResetAiApiDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetAiApiDelegateImpl$resetAll$1(ResetAiApiDelegateImpl resetAiApiDelegateImpl, Continuation<? super ResetAiApiDelegateImpl$resetAll$1> continuation) {
        super(continuation);
        this.this$0 = resetAiApiDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resetAll(null, this);
    }
}
