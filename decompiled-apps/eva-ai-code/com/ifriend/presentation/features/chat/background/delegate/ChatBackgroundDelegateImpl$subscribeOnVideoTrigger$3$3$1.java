package com.ifriend.presentation.features.chat.background.delegate;

import com.ifriend.domain.logic.chat.ChatBackgroundTrigger;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackground;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1", f = "ChatBackgroundDelegate.kt", i = {}, l = {158, 157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1 extends SuspendLambda implements Function2<FlowCollector<? super ChatBackground>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ User $user;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatBackgroundDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1(ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, User user, String str, Continuation<? super ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundDelegateImpl;
        this.$user = user;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1 chatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1 = new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1(this.this$0, this.$user, this.$chatId, continuation);
        chatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1.L$0 = obj;
        return chatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ChatBackground> flowCollector, Continuation<? super Unit> continuation) {
        return ((ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$3$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            str = this.this$0.lastTriggeredUserId;
            if (!Intrinsics.areEqual(str, this.$user.getUserIdValue())) {
                this.L$0 = flowCollector;
                this.label = 1;
                obj = this.this$0.getTriggerVideoBackground(this.$chatId, ChatBackgroundTrigger.IDLE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                this.this$0.lastTriggeredUserId = this.$user.getUserIdValue();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.this$0.lastTriggeredUserId = this.$user.getUserIdValue();
        return Unit.INSTANCE;
    }
}
