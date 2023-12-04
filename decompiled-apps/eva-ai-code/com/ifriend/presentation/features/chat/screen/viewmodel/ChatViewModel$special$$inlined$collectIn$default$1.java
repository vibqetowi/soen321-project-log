package com.ifriend.presentation.features.chat.screen.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$special$$inlined$collectIn$default$1", f = "ChatViewModel.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatViewModel$special$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ ChatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$special$$inlined$collectIn$default$1(Flow flow, Continuation continuation, ChatViewModel chatViewModel) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatViewModel$special$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatViewModel$special$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_collectIn;
            final ChatViewModel chatViewModel = this.this$0;
            this.label = 1;
            if (flow.collect(new FlowCollector() { // from class: com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$special$$inlined$collectIn$default$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    ChatEvents chatEvents = (ChatEvents) t;
                    if (!(chatEvents instanceof ChatEvents.BackPressed)) {
                        if (chatEvents instanceof ChatEvents.PhotoClick) {
                            ChatViewModel chatViewModel2 = ChatViewModel.this;
                            chatViewModel2.showPhoto(chatViewModel2, ((ChatEvents.PhotoClick) chatEvents).getMessageId());
                        } else if (chatEvents instanceof ChatEvents.PaidTextMessageClick) {
                            ChatViewModel chatViewModel3 = ChatViewModel.this;
                            chatViewModel3.requestTextMessageAccess(chatViewModel3, ((ChatEvents.PaidTextMessageClick) chatEvents).getMessageId());
                        } else if (chatEvents instanceof ChatEvents.ShowKeyboard) {
                            UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate = ChatViewModel.this;
                            Object sendEvent2 = uiStateDelegate.sendEvent2(uiStateDelegate, (ChatViewModel.Event) ChatViewModel.Event.ShowKeyboard.INSTANCE, continuation);
                            if (sendEvent2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return sendEvent2;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        ChatViewModel.this.onBackPressed();
                    }
                    return Unit.INSTANCE;
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
