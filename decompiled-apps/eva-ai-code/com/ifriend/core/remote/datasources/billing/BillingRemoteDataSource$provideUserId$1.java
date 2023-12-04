package com.ifriend.core.remote.datasources.billing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRemoteDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource", f = "BillingRemoteDataSource.kt", i = {}, l = {20}, m = "provideUserId", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingRemoteDataSource$provideUserId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRemoteDataSource$provideUserId$1(BillingRemoteDataSource billingRemoteDataSource, Continuation<? super BillingRemoteDataSource$provideUserId$1> continuation) {
        super(continuation);
        this.this$0 = billingRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object provideUserId;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        provideUserId = this.this$0.provideUserId(this);
        return provideUserId;
    }
}
