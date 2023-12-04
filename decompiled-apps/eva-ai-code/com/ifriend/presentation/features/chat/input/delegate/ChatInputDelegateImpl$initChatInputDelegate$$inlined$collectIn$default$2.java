package com.ifriend.presentation.features.chat.input.delegate;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.services.audio.recording.AudioRecorderState;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
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
@DebugMetadata(c = "com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$2", f = "ChatInputDelegate.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ ChatInputDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$2(Flow flow, Continuation continuation, ChatInputDelegateImpl chatInputDelegateImpl) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = chatInputDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$2(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_collectIn;
            final ChatInputDelegateImpl chatInputDelegateImpl = this.this$0;
            this.label = 1;
            if (flow.collect(new FlowCollector() { // from class: com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    FlowObserverEmitter flowObserverEmitter;
                    AudioRecorderState audioRecorderState = (AudioRecorderState) t;
                    if (audioRecorderState instanceof AudioRecorderState.Idle) {
                        UiStateDelegate<ChatInputState, Unit> uiStateDelegate = ChatInputDelegateImpl.this;
                        Object reduce = uiStateDelegate.reduce(uiStateDelegate, ChatInputDelegateImpl$initChatInputDelegate$2$1.INSTANCE, continuation);
                        if (reduce == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return reduce;
                        }
                    } else if (audioRecorderState instanceof AudioRecorderState.Recording) {
                        UiStateDelegate<ChatInputState, Unit> uiStateDelegate2 = ChatInputDelegateImpl.this;
                        Object reduce2 = uiStateDelegate2.reduce(uiStateDelegate2, new ChatInputDelegateImpl$initChatInputDelegate$2$2(audioRecorderState), continuation);
                        if (reduce2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return reduce2;
                        }
                    } else if (audioRecorderState instanceof AudioRecorderState.MaximumLength) {
                        UiStateDelegate<ChatInputState, Unit> uiStateDelegate3 = ChatInputDelegateImpl.this;
                        Object reduce3 = uiStateDelegate3.reduce(uiStateDelegate3, ChatInputDelegateImpl$initChatInputDelegate$2$3.INSTANCE, continuation);
                        if (reduce3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return reduce3;
                        }
                    } else if (audioRecorderState instanceof AudioRecorderState.Error) {
                        flowObserverEmitter = ChatInputDelegateImpl.this.exceptionsEmitter;
                        Object emit = flowObserverEmitter.emit(((AudioRecorderState.Error) audioRecorderState).getError(), continuation);
                        if (emit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return emit;
                        }
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
