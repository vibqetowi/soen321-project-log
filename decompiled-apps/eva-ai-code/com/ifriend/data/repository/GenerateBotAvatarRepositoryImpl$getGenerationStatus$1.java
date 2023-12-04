package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl", f = "GenerateBotAvatarRepositoryImpl.kt", i = {0, 1, 1}, l = {400, 412}, m = "getGenerationStatus", n = {"this", "this", "result"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$getGenerationStatus$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarRepositoryImpl$getGenerationStatus$1(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Continuation<? super GenerateBotAvatarRepositoryImpl$getGenerationStatus$1> continuation) {
        super(continuation);
        this.this$0 = generateBotAvatarRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getGenerationStatus(this);
    }
}
