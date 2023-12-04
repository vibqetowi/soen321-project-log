package com.ifriend.domain.logic.store;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetChatsStoreInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.store.GetChatsStoreInteractor", f = "GetChatsStoreInteractor.kt", i = {}, l = {26}, m = "execute", n = {}, s = {})
/* loaded from: classes6.dex */
public final class GetChatsStoreInteractor$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetChatsStoreInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatsStoreInteractor$execute$1(GetChatsStoreInteractor getChatsStoreInteractor, Continuation<? super GetChatsStoreInteractor$execute$1> continuation) {
        super(continuation);
        this.this$0 = getChatsStoreInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(this);
    }
}
