package com.ifriend.keychain;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeychainAdapter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.keychain.KeychainAdapter", f = "KeychainAdapter.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3}, l = {125, 70, TsExtractor.TS_SYNC_BYTE, 73}, m = "getPassword", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "password", "$this$withLock_u24default$iv", "oldPassword"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class KeychainAdapter$getPassword$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KeychainAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeychainAdapter$getPassword$1(KeychainAdapter keychainAdapter, Continuation<? super KeychainAdapter$getPassword$1> continuation) {
        super(continuation);
        this.this$0 = keychainAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPassword(this);
    }
}
