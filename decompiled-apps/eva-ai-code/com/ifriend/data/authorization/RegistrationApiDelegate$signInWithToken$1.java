package com.ifriend.data.authorization;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegistrationApiDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.authorization.RegistrationApiDelegate", f = "RegistrationApiDelegate.kt", i = {0}, l = {ModuleDescriptor.MODULE_VERSION}, m = "signInWithToken", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class RegistrationApiDelegate$signInWithToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegistrationApiDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApiDelegate$signInWithToken$1(RegistrationApiDelegate registrationApiDelegate, Continuation<? super RegistrationApiDelegate$signInWithToken$1> continuation) {
        super(continuation);
        this.this$0 = registrationApiDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.signInWithToken(null, this);
    }
}
