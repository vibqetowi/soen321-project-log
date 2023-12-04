package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetPasswordRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.ResetPasswordRepositoryImpl", f = "ResetPasswordRepositoryImpl.kt", i = {}, l = {13}, m = "resetPassword", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ResetPasswordRepositoryImpl$resetPassword$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ResetPasswordRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordRepositoryImpl$resetPassword$1(ResetPasswordRepositoryImpl resetPasswordRepositoryImpl, Continuation<? super ResetPasswordRepositoryImpl$resetPassword$1> continuation) {
        super(continuation);
        this.this$0 = resetPasswordRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resetPassword(null, this);
    }
}
