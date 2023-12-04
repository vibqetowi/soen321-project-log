package com.ifriend.domain.validation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmailValidator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.validation.EmailValidatorKt", f = "EmailValidator.kt", i = {}, l = {7}, m = "isNotValid", n = {}, s = {})
/* loaded from: classes6.dex */
public final class EmailValidatorKt$isNotValid$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmailValidatorKt$isNotValid$1(Continuation<? super EmailValidatorKt$isNotValid$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EmailValidatorKt.isNotValid(null, null, this);
    }
}
