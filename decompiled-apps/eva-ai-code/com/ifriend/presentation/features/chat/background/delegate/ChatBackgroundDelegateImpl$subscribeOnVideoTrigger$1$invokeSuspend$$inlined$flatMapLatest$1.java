package com.ifriend.presentation.features.chat.background.delegate;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ChatBackgroundDelegate.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super ChatBackground>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChatBackgroundDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, String str) {
        super(3, continuation);
        this.this$0 = chatBackgroundDelegateImpl;
        this.$chatId$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super ChatBackground> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1 chatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1 = new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0, this.$chatId$inlined);
        chatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        chatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = bool;
        return chatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LiveChatMessagesFlow liveChatMessagesFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ((Boolean) this.L$1).booleanValue();
            liveChatMessagesFlow = this.this$0.liveChatMessagesFlow;
            Flow mapLatest = FlowKt.mapLatest(liveChatMessagesFlow.newMessages(this.$chatId$inlined), new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1(this.this$0, this.$chatId$inlined, null));
            this.label = 1;
            if (FlowKt.emitAll((FlowCollector) this.L$0, mapLatest, this) == coroutine_suspended) {
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
