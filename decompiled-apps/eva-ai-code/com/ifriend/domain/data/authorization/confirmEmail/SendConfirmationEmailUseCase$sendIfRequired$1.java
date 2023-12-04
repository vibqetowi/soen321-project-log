package com.ifriend.domain.data.authorization.confirmEmail;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendConfirmationEmailUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase", f = "SendConfirmationEmailUseCase.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {22, 24, 26, 30}, m = "sendIfRequired", n = {"this", "email", "this", "email", "this", "email", "newUserDateMillis"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "J$0"})
/* loaded from: classes6.dex */
public final class SendConfirmationEmailUseCase$sendIfRequired$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendConfirmationEmailUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendConfirmationEmailUseCase$sendIfRequired$1(SendConfirmationEmailUseCase sendConfirmationEmailUseCase, Continuation<? super SendConfirmationEmailUseCase$sendIfRequired$1> continuation) {
        super(continuation);
        this.this$0 = sendConfirmationEmailUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendIfRequired(null, this);
    }
}
