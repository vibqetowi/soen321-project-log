package com.ifriend.core.common.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CachedData.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.core.common.core.CachedData", f = "CachedData.kt", i = {0}, l = {37}, m = "loadData", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class CachedData$loadData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedData<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedData$loadData$1(CachedData<T> cachedData, Continuation<? super CachedData$loadData$1> continuation) {
        super(continuation);
        this.this$0 = cachedData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadData = this.this$0.loadData(this);
        return loadData;
    }
}
