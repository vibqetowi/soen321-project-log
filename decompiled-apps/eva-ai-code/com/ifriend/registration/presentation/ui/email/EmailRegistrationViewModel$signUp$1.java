package com.ifriend.registration.presentation.ui.email;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmailRegistrationViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.registration.presentation.ui.email.EmailRegistrationViewModel", f = "EmailRegistrationViewModel.kt", i = {0}, l = {43}, m = "signUp", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class EmailRegistrationViewModel$signUp$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EmailRegistrationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRegistrationViewModel$signUp$1(EmailRegistrationViewModel emailRegistrationViewModel, Continuation<? super EmailRegistrationViewModel$signUp$1> continuation) {
        super(continuation);
        this.this$0 = emailRegistrationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.signUp(this);
    }
}
