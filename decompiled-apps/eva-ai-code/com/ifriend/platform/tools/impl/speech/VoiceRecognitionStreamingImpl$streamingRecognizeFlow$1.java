package com.ifriend.platform.tools.impl.speech;

import android.media.AudioRecord;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.ClientStream;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.StreamController;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.StreamingRecognitionResult;
import com.google.cloud.speech.v1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1.StreamingRecognizeResponse;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.platform.tools.api.speech.voice.StreamingRecognize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VoiceRecognitionStreamingImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/ifriend/platform/tools/api/speech/voice/StreamingRecognize;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.platform.tools.impl.speech.VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1", f = "VoiceRecognitionStreamingImpl.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super StreamingRecognize>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VoiceRecognitionStreamingImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1(VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl, Continuation<? super VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = voiceRecognitionStreamingImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1 voiceRecognitionStreamingImpl$streamingRecognizeFlow$1 = new VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1(this.this$0, continuation);
        voiceRecognitionStreamingImpl$streamingRecognizeFlow$1.L$0 = obj;
        return voiceRecognitionStreamingImpl$streamingRecognizeFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super StreamingRecognize> producerScope, Continuation<? super Unit> continuation) {
        return ((VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SpeechClient speechClient;
        ClientStream clientStream;
        StreamingRecognizeRequest streamingRecognizeRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl = this.this$0;
            ResponseObserver<StreamingRecognizeResponse> responseObserver = new ResponseObserver<StreamingRecognizeResponse>() { // from class: com.ifriend.platform.tools.impl.speech.VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1
                @Override // com.google.api.gax.rpc.ResponseObserver
                public void onComplete() {
                }

                @Override // com.google.api.gax.rpc.ResponseObserver
                public void onStart(StreamController streamController) {
                }

                /* JADX WARN: Type inference failed for: r10v5, types: [T, java.lang.String] */
                @Override // com.google.api.gax.rpc.ResponseObserver
                public void onResponse(StreamingRecognizeResponse streamingRecognizeResponse) {
                    if (streamingRecognizeResponse != null) {
                        ProducerScope<StreamingRecognize> producerScope2 = producerScope;
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        if (streamingRecognizeResponse.getResultsCount() > 0) {
                            StreamingRecognitionResult results = streamingRecognizeResponse.getResults(0);
                            booleanRef.element = results.getIsFinal();
                            if (results.getAlternativesCount() > 0) {
                                objectRef.element = results.getAlternatives(0).getTranscript();
                            }
                        }
                        if (objectRef.element != 0) {
                            BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$callback$1$onResponse$1$1(producerScope2, objectRef, booleanRef, null), 3, null);
                        }
                    }
                }

                @Override // com.google.api.gax.rpc.ResponseObserver
                public void onError(Throwable th) {
                    AnalyticsInteractor analyticsInteractor;
                    if (th != null) {
                        analyticsInteractor = voiceRecognitionStreamingImpl.analyticsInteractor;
                        analyticsInteractor.trackException("Streaming Recognize Flow", th);
                    }
                }
            };
            VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl2 = this.this$0;
            speechClient = voiceRecognitionStreamingImpl2.speechClient;
            BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeCallable = speechClient.streamingRecognizeCallable();
            voiceRecognitionStreamingImpl2.clientStream = streamingRecognizeCallable != null ? streamingRecognizeCallable.splitCall(responseObserver) : null;
            clientStream = this.this$0.clientStream;
            if (clientStream != null) {
                streamingRecognizeRequest = this.this$0.getStreamingRecognizeRequest();
                clientStream.send(streamingRecognizeRequest);
            }
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VoiceRecognitionStreamingImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.platform.tools.impl.speech.VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ VoiceRecognitionStreamingImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl) {
            super(0);
            this.this$0 = voiceRecognitionStreamingImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AudioRecord audioRecord;
            ClientStream clientStream;
            audioRecord = this.this$0.voiceRecorder;
            if (audioRecord != null) {
                audioRecord.release();
            }
            clientStream = this.this$0.clientStream;
            if (clientStream != null) {
                clientStream.closeSend();
            }
            this.this$0.voiceRecorder = null;
            this.this$0.clientStream = null;
        }
    }
}
