package com.ifriend.data.common;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InMemoryCachedSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.common.InMemoryCachedSource", f = "InMemoryCachedSource.kt", i = {0, 0, 2, 2}, l = {56, 57, LockFreeTaskQueueCore.CLOSED_SHIFT, 65}, m = "get", n = {"this", "key", "this", "key"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class InMemoryCachedSource$get$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InMemoryCachedSource<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMemoryCachedSource$get$1(InMemoryCachedSource<Key, Value> inMemoryCachedSource, Continuation<? super InMemoryCachedSource$get$1> continuation) {
        super(continuation);
        this.this$0 = inMemoryCachedSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(null, null, this);
    }
}
