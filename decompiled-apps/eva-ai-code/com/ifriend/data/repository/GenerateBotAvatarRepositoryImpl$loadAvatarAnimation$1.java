package com.ifriend.data.repository;

import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl", f = "GenerateBotAvatarRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 4}, l = {FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 345, 372, 377, 381}, m = "loadAvatarAnimation", n = {"this", "avatarInfoResponse", "generatedAvatarWithImage", "avatarInfoResponse", "generatedAvatarWithImage", "$this$loadAvatarAnimation_u24lambda_u2415", "generatedAvatarWithImage", "$this$loadAvatarAnimation_u24lambda_u2415", "response", "$this$loadAvatarAnimation_u24lambda_u2415", "$this$loadAvatarAnimation_u24lambda_u2415"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GenerateBotAvatarRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$1(GenerateBotAvatarRepositoryImpl generateBotAvatarRepositoryImpl, Continuation<? super GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$1> continuation) {
        super(continuation);
        this.this$0 = generateBotAvatarRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadAvatarAnimation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadAvatarAnimation = this.this$0.loadAvatarAnimation(null, null, false, this);
        return loadAvatarAnimation;
    }
}
