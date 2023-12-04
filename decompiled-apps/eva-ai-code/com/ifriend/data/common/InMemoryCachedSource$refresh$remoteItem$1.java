package com.ifriend.data.common;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InMemoryCachedSource.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.common.InMemoryCachedSource$refresh$remoteItem$1", f = "InMemoryCachedSource.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InMemoryCachedSource$refresh$remoteItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Value>, Object> {
    final /* synthetic */ Key $key;
    int label;
    final /* synthetic */ InMemoryCachedSource<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMemoryCachedSource$refresh$remoteItem$1(InMemoryCachedSource<Key, Value> inMemoryCachedSource, Key key, Continuation<? super InMemoryCachedSource$refresh$remoteItem$1> continuation) {
        super(2, continuation);
        this.this$0 = inMemoryCachedSource;
        this.$key = key;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InMemoryCachedSource$refresh$remoteItem$1(this.this$0, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Value> continuation) {
        return ((InMemoryCachedSource$refresh$remoteItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            function2 = ((InMemoryCachedSource) this.this$0).getFromRemoteSource;
            Key key = this.$key;
            this.label = 1;
            obj = function2.invoke(key, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
