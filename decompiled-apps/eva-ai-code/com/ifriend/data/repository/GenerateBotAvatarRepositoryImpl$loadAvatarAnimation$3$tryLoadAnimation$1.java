package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl", f = "GenerateBotAvatarRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {360, 367}, m = "loadAvatarAnimation$lambda$15$tryLoadAnimation", n = {"response", "authData", "animationPath", "$this$loadAvatarAnimation_u24lambda_u2415_u24tryLoadAnimation_u24lambda_u2413", "response", "authData", "animationPath", "$this$loadAvatarAnimation_u24lambda_u2415_u24tryLoadAnimation_u24lambda_u2413"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1(Continuation<? super GenerateBotAvatarRepositoryImpl$loadAvatarAnimation$3$tryLoadAnimation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadAvatarAnimation$lambda$15$tryLoadAnimation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadAvatarAnimation$lambda$15$tryLoadAnimation = GenerateBotAvatarRepositoryImpl.loadAvatarAnimation$lambda$15$tryLoadAnimation(null, null, null, null, this);
        return loadAvatarAnimation$lambda$15$tryLoadAnimation;
    }
}
