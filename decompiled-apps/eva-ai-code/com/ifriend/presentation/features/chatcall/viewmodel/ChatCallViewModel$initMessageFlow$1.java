package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.platform.tools.api.speech.voice.StreamingRecognize;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/ifriend/platform/tools/api/speech/voice/StreamingRecognize;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$1", f = "ChatCallViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$initMessageFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super StreamingRecognize>, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$initMessageFlow$1(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$initMessageFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatCallViewModel$initMessageFlow$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super StreamingRecognize> flowCollector, Continuation<? super Unit> continuation) {
        return ((ChatCallViewModel$initMessageFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VoiceRecognitionStreaming voiceRecognitionStreaming;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            voiceRecognitionStreaming = this.this$0.voiceRecognitionStreaming;
            voiceRecognitionStreaming.startRecognition();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
