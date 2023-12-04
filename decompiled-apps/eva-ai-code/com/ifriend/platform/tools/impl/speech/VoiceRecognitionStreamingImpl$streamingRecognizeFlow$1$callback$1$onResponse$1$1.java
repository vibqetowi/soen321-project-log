package com.ifriend.platform.tools.impl.speech;

import com.ifriend.platform.tools.api.speech.voice.StreamingRecognize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
/* compiled from: VoiceRecognitionStreamingImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.platform.tools.impl.speech.VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1$onResponse$1$1", f = "VoiceRecognitionStreamingImpl.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1$onResponse$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<StreamingRecognize> $$this$callbackFlow;
    final /* synthetic */ Ref.BooleanRef $isFinal;
    final /* synthetic */ Ref.ObjectRef<String> $text;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1$onResponse$1$1(ProducerScope<? super StreamingRecognize> producerScope, Ref.ObjectRef<String> objectRef, Ref.BooleanRef booleanRef, Continuation<? super VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1$onResponse$1$1> continuation) {
        super(2, continuation);
        this.$$this$callbackFlow = producerScope;
        this.$text = objectRef;
        this.$isFinal = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1$onResponse$1$1(this.$$this$callbackFlow, this.$text, this.$isFinal, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1$onResponse$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$$this$callbackFlow.send(new StreamingRecognize(this.$text.element, this.$isFinal.element), this) == coroutine_suspended) {
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
