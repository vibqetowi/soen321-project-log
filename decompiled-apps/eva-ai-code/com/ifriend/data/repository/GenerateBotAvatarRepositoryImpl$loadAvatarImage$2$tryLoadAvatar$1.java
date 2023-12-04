package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.GenerateBotAvatarRepositoryImpl", f = "GenerateBotAvatarRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {306, 315}, m = "loadAvatarImage$lambda$10$tryLoadAvatar", n = {"response", "authData", "avatarId", "$this$loadAvatarImage_u24lambda_u2410_u24tryLoadAvatar_u24lambda_u248", "response", "authData", "avatarId", "$this$loadAvatarImage_u24lambda_u2410_u24tryLoadAvatar_u24lambda_u248"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1 extends ContinuationImpl {
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
    public GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1(Continuation<? super GenerateBotAvatarRepositoryImpl$loadAvatarImage$2$tryLoadAvatar$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadAvatarImage$lambda$10$tryLoadAvatar;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadAvatarImage$lambda$10$tryLoadAvatar = GenerateBotAvatarRepositoryImpl.loadAvatarImage$lambda$10$tryLoadAvatar(null, null, null, null, this);
        return loadAvatarImage$lambda$10$tryLoadAvatar;
    }
}
