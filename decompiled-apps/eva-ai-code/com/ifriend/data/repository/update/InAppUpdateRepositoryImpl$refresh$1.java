package com.ifriend.data.repository.update;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdateRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.update.InAppUpdateRepositoryImpl", f = "InAppUpdateRepositoryImpl.kt", i = {0, 0}, l = {29, 33}, m = "refresh", n = {"this", "currentVersionCode"}, s = {"L$0", "J$0"})
/* loaded from: classes6.dex */
public final class InAppUpdateRepositoryImpl$refresh$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppUpdateRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateRepositoryImpl$refresh$1(InAppUpdateRepositoryImpl inAppUpdateRepositoryImpl, Continuation<? super InAppUpdateRepositoryImpl$refresh$1> continuation) {
        super(continuation);
        this.this$0 = inAppUpdateRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refresh(this);
    }
}
