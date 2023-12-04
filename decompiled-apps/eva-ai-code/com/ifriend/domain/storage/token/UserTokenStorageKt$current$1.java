package com.ifriend.domain.storage.token;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserTokenStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.storage.token.UserTokenStorageKt", f = "UserTokenStorage.kt", i = {}, l = {10}, m = "current", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserTokenStorageKt$current$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserTokenStorageKt$current$1(Continuation<? super UserTokenStorageKt$current$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UserTokenStorageKt.current(null, this);
    }
}
