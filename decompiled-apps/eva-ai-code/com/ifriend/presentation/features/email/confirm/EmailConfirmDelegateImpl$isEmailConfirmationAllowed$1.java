package com.ifriend.presentation.features.email.confirm;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmailConfirmDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl", f = "EmailConfirmDelegate.kt", i = {0, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, 57}, m = "isEmailConfirmationAllowed", n = {"this", "this", "newUserDateMillis"}, s = {"L$0", "L$0", "J$0"})
/* loaded from: classes6.dex */
public final class EmailConfirmDelegateImpl$isEmailConfirmationAllowed$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EmailConfirmDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailConfirmDelegateImpl$isEmailConfirmationAllowed$1(EmailConfirmDelegateImpl emailConfirmDelegateImpl, Continuation<? super EmailConfirmDelegateImpl$isEmailConfirmationAllowed$1> continuation) {
        super(continuation);
        this.this$0 = emailConfirmDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object isEmailConfirmationAllowed;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        isEmailConfirmationAllowed = this.this$0.isEmailConfirmationAllowed(this);
        return isEmailConfirmationAllowed;
    }
}
