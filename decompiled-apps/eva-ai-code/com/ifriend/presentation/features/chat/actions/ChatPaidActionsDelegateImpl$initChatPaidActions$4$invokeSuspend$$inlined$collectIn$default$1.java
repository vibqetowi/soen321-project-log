package com.ifriend.presentation.features.chat.actions;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionState;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl;
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
@DebugMetadata(c = "com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$initChatPaidActions$4$invokeSuspend$$inlined$collectIn$default$1", f = "ChatPaidActionsDelegate.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPaidActionsDelegateImpl$initChatPaidActions$4$invokeSuspend$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ ChatPaidActionsDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPaidActionsDelegateImpl$initChatPaidActions$4$invokeSuspend$$inlined$collectIn$default$1(Flow flow, Continuation continuation, ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = chatPaidActionsDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPaidActionsDelegateImpl$initChatPaidActions$4$invokeSuspend$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPaidActionsDelegateImpl$initChatPaidActions$4$invokeSuspend$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_collectIn;
            final ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl = this.this$0;
            this.label = 1;
            if (flow.collect(new FlowCollector() { // from class: com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$initChatPaidActions$4$invokeSuspend$$inlined$collectIn$default$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    InternalStateDelegate<ChatPaidActionsDelegateImpl.PaidActionsUiState> internalStateDelegate = ChatPaidActionsDelegateImpl.this;
                    Object updateInternalState = internalStateDelegate.updateInternalState(internalStateDelegate, new ChatPaidActionsDelegateImpl$initChatPaidActions$4$1$1(ChatPaidActionsDelegateImpl.this, (ChatSubscriptionState) t), continuation);
                    return updateInternalState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateInternalState : Unit.INSTANCE;
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
