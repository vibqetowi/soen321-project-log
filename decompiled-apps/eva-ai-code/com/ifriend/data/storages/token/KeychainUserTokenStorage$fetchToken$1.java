package com.ifriend.data.storages.token;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeychainUserTokenStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.token.KeychainUserTokenStorage", f = "KeychainUserTokenStorage.kt", i = {0, 1}, l = {44, 45}, m = "fetchToken", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
public final class KeychainUserTokenStorage$fetchToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KeychainUserTokenStorage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeychainUserTokenStorage$fetchToken$1(KeychainUserTokenStorage keychainUserTokenStorage, Continuation<? super KeychainUserTokenStorage$fetchToken$1> continuation) {
        super(continuation);
        this.this$0 = keychainUserTokenStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchToken = this.this$0.fetchToken(this);
        return fetchToken;
    }
}
