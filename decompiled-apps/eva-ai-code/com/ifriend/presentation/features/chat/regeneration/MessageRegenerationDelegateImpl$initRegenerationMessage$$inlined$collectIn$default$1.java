package com.ifriend.presentation.features.chat.regeneration;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: flow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$collectIn$default$1", f = "MessageRegenerationDelegate.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ MessageRegenerationDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$collectIn$default$1(Flow flow, Continuation continuation, MessageRegenerationDelegateImpl messageRegenerationDelegateImpl) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = messageRegenerationDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_collectIn;
            final MessageRegenerationDelegateImpl messageRegenerationDelegateImpl = this.this$0;
            this.label = 1;
            if (flow.collect(new FlowCollector() { // from class: com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$initRegenerationMessage$$inlined$collectIn$default$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    FlowObserverEmitter flowObserverEmitter;
                    MessagesSourceMessage.Chat.ChatRegenerateMessageFailed chatRegenerateMessageFailed = (MessagesSourceMessage.Chat.ChatRegenerateMessageFailed) t;
                    flowObserverEmitter = MessageRegenerationDelegateImpl.this.exceptionsEmitter;
                    Object emit = flowObserverEmitter.emit(new Exception("Regeneration message error"), continuation);
                    return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
