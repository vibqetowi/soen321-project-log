package com.ifriend.data.storages.token;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeychainUserTokenStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.token.KeychainUserTokenStorage", f = "KeychainUserTokenStorage.kt", i = {0}, l = {39, 40}, m = "clear", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class KeychainUserTokenStorage$clear$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KeychainUserTokenStorage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeychainUserTokenStorage$clear$1(KeychainUserTokenStorage keychainUserTokenStorage, Continuation<? super KeychainUserTokenStorage$clear$1> continuation) {
        super(continuation);
        this.this$0 = keychainUserTokenStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clear(this);
    }
}
