package com.ifriend.presentation.features.chat.panel.delegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ChatPanelActionsDelegate.kt", i = {}, l = {223, 224, 225, 226, 193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends ChatPanelActionMarker>>, Pair<? extends Personality, ? extends Gender>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0$inlined;
    final /* synthetic */ String $chatId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, String str, ViewModel viewModel) {
        super(3, continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
        this.$chatId$inlined = str;
        this.$$context_receiver_0$inlined = viewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends ChatPanelActionMarker>> flowCollector, Pair<? extends Personality, ? extends Gender> pair, Continuation<? super Unit> continuation) {
        ChatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1 chatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1 = new ChatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0, this.$chatId$inlined, this.$$context_receiver_0$inlined);
        chatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        chatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = pair;
        return chatPanelActionsDelegateImpl$initChatPanelActions$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow flow;
        Object topicsFlow;
        FlowCollector flowCollector2;
        Object premiumTopicsFlow;
        Flow flow2;
        FlowCollector flowCollector3;
        Object diariesFlow;
        Flow flow3;
        Flow flow4;
        Object callFlow;
        Flow flow5;
        Flow flow6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Pair pair = (Pair) this.L$1;
            Personality personality = (Personality) pair.component1();
            Gender gender = (Gender) pair.component2();
            if (personality != Personality.FLIRTY || gender != Gender.FEMALE) {
                flow = FlowKt.flow(new ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$1(null));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl = this.this$0;
            String str = this.$chatId$inlined;
            this.L$0 = flowCollector;
            this.label = 1;
            topicsFlow = chatPanelActionsDelegateImpl.getTopicsFlow(str, this);
            if (topicsFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector;
            obj = topicsFlow;
        } else if (i == 1) {
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow5 = (Flow) this.L$3;
                flow6 = (Flow) this.L$2;
                flow4 = (Flow) this.L$1;
                flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flow = FlowKt.onStart(FlowKt.combine(flow4, flow6, flow5, (Flow) obj, new ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2(null)), new ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$3(this.this$0, this.$$context_receiver_0$inlined, this.$chatId$inlined, null));
                flowCollector = flowCollector3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            flow3 = (Flow) this.L$2;
            flow4 = (Flow) this.L$1;
            flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            Flow flow7 = (Flow) obj;
            ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl2 = this.this$0;
            String str2 = this.$chatId$inlined;
            this.L$0 = flowCollector3;
            this.L$1 = flow4;
            this.L$2 = flow3;
            this.L$3 = flow7;
            this.label = 4;
            callFlow = chatPanelActionsDelegateImpl2.getCallFlow(str2, this);
            if (callFlow != coroutine_suspended) {
                return coroutine_suspended;
            }
            Flow flow8 = flow3;
            flow5 = flow7;
            obj = callFlow;
            flow6 = flow8;
            flow = FlowKt.onStart(FlowKt.combine(flow4, flow6, flow5, (Flow) obj, new ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2(null)), new ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$3(this.this$0, this.$$context_receiver_0$inlined, this.$chatId$inlined, null));
            flowCollector = flowCollector3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 5;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } else {
            flow2 = (Flow) this.L$1;
            flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            Flow flow9 = (Flow) obj;
            ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl3 = this.this$0;
            String str3 = this.$chatId$inlined;
            this.L$0 = flowCollector3;
            this.L$1 = flow2;
            this.L$2 = flow9;
            this.label = 3;
            diariesFlow = chatPanelActionsDelegateImpl3.getDiariesFlow(str3, this);
            if (diariesFlow != coroutine_suspended) {
                return coroutine_suspended;
            }
            Flow flow10 = flow2;
            flow3 = flow9;
            obj = diariesFlow;
            flow4 = flow10;
            Flow flow72 = (Flow) obj;
            ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl22 = this.this$0;
            String str22 = this.$chatId$inlined;
            this.L$0 = flowCollector3;
            this.L$1 = flow4;
            this.L$2 = flow3;
            this.L$3 = flow72;
            this.label = 4;
            callFlow = chatPanelActionsDelegateImpl22.getCallFlow(str22, this);
            if (callFlow != coroutine_suspended) {
            }
        }
        Flow flow11 = (Flow) obj;
        ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl4 = this.this$0;
        String str4 = this.$chatId$inlined;
        this.L$0 = flowCollector2;
        this.L$1 = flow11;
        this.label = 2;
        premiumTopicsFlow = chatPanelActionsDelegateImpl4.getPremiumTopicsFlow(str4, this);
        if (premiumTopicsFlow == coroutine_suspended) {
            return coroutine_suspended;
        }
        FlowCollector flowCollector4 = flowCollector2;
        flow2 = flow11;
        obj = premiumTopicsFlow;
        flowCollector3 = flowCollector4;
        Flow flow92 = (Flow) obj;
        ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl32 = this.this$0;
        String str32 = this.$chatId$inlined;
        this.L$0 = flowCollector3;
        this.L$1 = flow2;
        this.L$2 = flow92;
        this.label = 3;
        diariesFlow = chatPanelActionsDelegateImpl32.getDiariesFlow(str32, this);
        if (diariesFlow != coroutine_suspended) {
        }
    }
}
