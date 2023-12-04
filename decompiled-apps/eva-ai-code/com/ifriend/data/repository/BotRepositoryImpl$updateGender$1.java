package com.ifriend.data.repository;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl", f = "BotRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {257, 262, 267, 274}, m = "updateGender", n = {"this", HintConstants.AUTOFILL_HINT_GENDER, "auth", "oldUser", "this", HintConstants.AUTOFILL_HINT_GENDER, "oldUser"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class BotRepositoryImpl$updateGender$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BotRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotRepositoryImpl$updateGender$1(BotRepositoryImpl botRepositoryImpl, Continuation<? super BotRepositoryImpl$updateGender$1> continuation) {
        super(continuation);
        this.this$0 = botRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateGender(null, this);
    }
}
