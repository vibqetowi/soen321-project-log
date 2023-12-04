package com.ifriend.data.authorization.validation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteEmailValidator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.authorization.validation.RemoteEmailValidator", f = "RemoteEmailValidator.kt", i = {}, l = {15}, m = "isValid", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RemoteEmailValidator$isValid$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteEmailValidator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteEmailValidator$isValid$1(RemoteEmailValidator remoteEmailValidator, Continuation<? super RemoteEmailValidator$isValid$1> continuation) {
        super(continuation);
        this.this$0 = remoteEmailValidator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isValid(null, this);
    }
}
