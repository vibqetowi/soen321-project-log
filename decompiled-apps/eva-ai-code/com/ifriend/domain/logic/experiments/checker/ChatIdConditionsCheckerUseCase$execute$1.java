package com.ifriend.domain.logic.experiments.checker;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIdConditionsCheckerUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.experiments.checker.ChatIdConditionsCheckerUseCase", f = "ChatIdConditionsCheckerUseCase.kt", i = {0, 0, 0, 1, 1}, l = {27, 28}, m = "execute", n = {"this", "toggle", "$this$execute_u24lambda_u242", "this", "uId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatIdConditionsCheckerUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatIdConditionsCheckerUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIdConditionsCheckerUseCase$execute$1(ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase, Continuation<? super ChatIdConditionsCheckerUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = chatIdConditionsCheckerUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, null, this);
    }
}
