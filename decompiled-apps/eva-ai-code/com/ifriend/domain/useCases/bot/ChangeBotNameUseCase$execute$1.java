package com.ifriend.domain.useCases.bot;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChangeBotNameUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.useCases.bot.ChangeBotNameUseCase", f = "ChangeBotNameUseCase.kt", i = {0, 0}, l = {14, 17}, m = "execute", n = {"this", "name"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChangeBotNameUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChangeBotNameUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeBotNameUseCase$execute$1(ChangeBotNameUseCase changeBotNameUseCase, Continuation<? super ChangeBotNameUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = changeBotNameUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
