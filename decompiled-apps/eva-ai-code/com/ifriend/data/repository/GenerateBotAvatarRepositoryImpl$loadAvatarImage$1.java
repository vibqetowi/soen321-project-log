package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl", f = "GenerateBotAvatarRepositoryImpl.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4}, l = {293, 297, 320, 323, 327, 330}, m = "loadAvatarImage", n = {"this", "avatarInfoResponse", "avatarInfoResponse", "$this$loadAvatarImage_u24lambda_u2410", "$this$loadAvatarImage_u24lambda_u2410", "response", "authData", "avatarId", "$this$loadAvatarImage_u24lambda_u2410", "response", "authData", "avatarId", "$this$loadAvatarImage_u24lambda_u2410", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$loadAvatarImage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarRepositoryImpl$loadAvatarImage$1(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Continuation<? super GenerateBotAvatarRepositoryImpl$loadAvatarImage$1> continuation) {
        super(continuation);
        this.this$0 = generateBotAvatarRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadAvatarImage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadAvatarImage = this.this$0.loadAvatarImage(null, false, this);
        return loadAvatarImage;
    }
}
