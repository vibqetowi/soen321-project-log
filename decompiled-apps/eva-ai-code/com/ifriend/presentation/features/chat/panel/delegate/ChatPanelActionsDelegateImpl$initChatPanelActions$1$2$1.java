package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1", f = "ChatPanelActionsDelegate.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends ChatPanelActionMarker>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1(Continuation<? super ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1 chatPanelActionsDelegateImpl$initChatPanelActions$1$2$1 = new ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1(continuation);
        chatPanelActionsDelegateImpl$initChatPanelActions$1$2$1.L$0 = obj;
        return chatPanelActionsDelegateImpl$initChatPanelActions$1$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super List<? extends ChatPanelActionMarker>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((FlowCollector) this.L$0).emit(CollectionsKt.emptyList(), this) == coroutine_suspended) {
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
