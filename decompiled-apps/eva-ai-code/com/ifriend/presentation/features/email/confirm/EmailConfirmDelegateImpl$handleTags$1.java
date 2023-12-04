package com.ifriend.presentation.features.email.confirm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmailConfirmDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl", f = "EmailConfirmDelegate.kt", i = {0, 0, 1}, l = {41, 46}, m = "handleTags", n = {"this", "tags", "isEmailConfirmed"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes6.dex */
public final class EmailConfirmDelegateImpl$handleTags$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EmailConfirmDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailConfirmDelegateImpl$handleTags$1(EmailConfirmDelegateImpl emailConfirmDelegateImpl, Continuation<? super EmailConfirmDelegateImpl$handleTags$1> continuation) {
        super(continuation);
        this.this$0 = emailConfirmDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleTags;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleTags = this.this$0.handleTags(null, this);
        return handleTags;
    }
}
