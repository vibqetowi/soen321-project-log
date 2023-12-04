package com.ifriend.data.authorization;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegistrationApiDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.authorization.RegistrationApiDelegate", f = "RegistrationApiDelegate.kt", i = {0, 0, 0}, l = {25}, m = "signUp", n = {"this", "email", "password"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class RegistrationApiDelegate$signUp$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegistrationApiDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApiDelegate$signUp$1(RegistrationApiDelegate registrationApiDelegate, Continuation<? super RegistrationApiDelegate$signUp$1> continuation) {
        super(continuation);
        this.this$0 = registrationApiDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.signUp(null, null, this);
    }
}
