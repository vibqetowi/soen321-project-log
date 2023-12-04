package com.ifriend.data.authorization.confirmEmail;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfirmEmailRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.authorization.confirmEmail.ConfirmEmailRepositoryImpl", f = "ConfirmEmailRepositoryImpl.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4}, l = {26, 31, 40, 41, 47}, m = "sendEmail", n = {"this", "email", "this", "lastAuthData", "this", "email", "lastAuthData", "authToken", "previousEmail", "this", "email", "lastAuthData", "previousEmail", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes6.dex */
public final class ConfirmEmailRepositoryImpl$sendEmail$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfirmEmailRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmEmailRepositoryImpl$sendEmail$1(ConfirmEmailRepositoryImpl confirmEmailRepositoryImpl, Continuation<? super ConfirmEmailRepositoryImpl$sendEmail$1> continuation) {
        super(continuation);
        this.this$0 = confirmEmailRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendEmail(null, this);
    }
}
