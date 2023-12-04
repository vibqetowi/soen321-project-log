package com.ifriend.presentation.features.chatstore.viewmodel;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$buyChatAfterBuyNeurons$1", f = "ChatsStoreViewModel.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsStoreViewModel$buyChatAfterBuyNeurons$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatsStoreViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreViewModel$buyChatAfterBuyNeurons$1(ChatsStoreViewModel chatsStoreViewModel, Continuation<? super ChatsStoreViewModel$buyChatAfterBuyNeurons$1> continuation) {
        super(2, continuation);
        this.this$0 = chatsStoreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatsStoreViewModel$buyChatAfterBuyNeurons$1 chatsStoreViewModel$buyChatAfterBuyNeurons$1 = new ChatsStoreViewModel$buyChatAfterBuyNeurons$1(this.this$0, continuation);
        chatsStoreViewModel$buyChatAfterBuyNeurons$1.L$0 = obj;
        return chatsStoreViewModel$buyChatAfterBuyNeurons$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((ChatsStoreViewModel$buyChatAfterBuyNeurons$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowObserverEmitter flowObserverEmitter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowObserverEmitter = this.this$0.exceptionsEmitter;
            this.label = 1;
            if (flowObserverEmitter.emit((Throwable) this.L$0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
