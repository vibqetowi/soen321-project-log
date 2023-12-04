package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.BotRepositoryImpl", f = "BotRepositoryImpl.kt", i = {0}, l = {97}, m = "loadAndEmit", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BotRepositoryImpl$loadAndEmit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BotRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotRepositoryImpl$loadAndEmit$1(BotRepositoryImpl botRepositoryImpl, Continuation<? super BotRepositoryImpl$loadAndEmit$1> continuation) {
        super(continuation);
        this.this$0 = botRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadAndEmit(null, this);
    }
}
