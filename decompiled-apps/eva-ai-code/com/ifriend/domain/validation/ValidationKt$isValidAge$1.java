package com.ifriend.domain.validation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Validation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.validation.ValidationKt", f = "Validation.kt", i = {0, 0, 0, 1, 1}, l = {21, 22}, m = "isValidAge", n = {"appConfigUseCase", "ageInt", "prefix", "ageInt", "minAge"}, s = {"L$0", "L$1", "L$2", "L$0", "J$0"})
/* loaded from: classes6.dex */
public final class ValidationKt$isValidAge$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValidationKt$isValidAge$1(Continuation<? super ValidationKt$isValidAge$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ValidationKt.isValidAge(null, null, false, this);
    }
}
