package com.ifriend.platform.tools.impl.speech;

import android.media.AudioRecord;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VoiceRecognitionStreamingImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.platform.tools.impl.speech.VoiceRecognitionStreamingImpl$startRecording$1", f = "VoiceRecognitionStreamingImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class VoiceRecognitionStreamingImpl$startRecording$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VoiceRecognitionStreamingImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecognitionStreamingImpl$startRecording$1(VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl, Continuation<? super VoiceRecognitionStreamingImpl$startRecording$1> continuation) {
        super(2, continuation);
        this.this$0 = voiceRecognitionStreamingImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VoiceRecognitionStreamingImpl$startRecording$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VoiceRecognitionStreamingImpl$startRecording$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int bufferSize;
        AudioRecord audioRecord;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            bufferSize = this.this$0.getBufferSize();
            try {
                byte[] bArr = new byte[bufferSize];
                this.this$0.initVoiceRecorder();
                audioRecord = this.this$0.voiceRecorder;
                if (audioRecord != null) {
                    VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl = this.this$0;
                    audioRecord.startRecording();
                    while (true) {
                        voiceRecognitionStreamingImpl.recognize(bArr, audioRecord.read(bArr, 0, bufferSize));
                    }
                }
            } catch (Throwable unused) {
                this.this$0.stopRecognition();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
