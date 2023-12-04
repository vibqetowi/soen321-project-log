package com.ifriend.data.authorization;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegistrationApiDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.authorization.RegistrationApiDelegate", f = "RegistrationApiDelegate.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "getConfigs", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RegistrationApiDelegate$getConfigs$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegistrationApiDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApiDelegate$getConfigs$1(RegistrationApiDelegate registrationApiDelegate, Continuation<? super RegistrationApiDelegate$getConfigs$1> continuation) {
        super(continuation);
        this.this$0 = registrationApiDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getConfigs(null, this);
    }
}
