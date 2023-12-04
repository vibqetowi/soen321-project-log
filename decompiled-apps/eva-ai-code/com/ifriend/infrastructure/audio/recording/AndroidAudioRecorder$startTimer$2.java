package com.ifriend.infrastructure.audio.recording;

import android.media.MediaRecorder;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.common_utils.extensions.CoroutinesKt;
import com.ifriend.domain.services.audio.recording.AudioRecorderState;
import com.ifriend.domain.services.audio.recording.RecordingAudioFile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidAudioRecorder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder$startTimer$2", f = "AndroidAudioRecorder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AndroidAudioRecorder$startTimer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $maxDurationInMillis;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAudioRecorder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAudioRecorder$startTimer$2(AndroidAudioRecorder androidAudioRecorder, int i, Continuation<? super AndroidAudioRecorder$startTimer$2> continuation) {
        super(2, continuation);
        this.this$0 = androidAudioRecorder;
        this.$maxDurationInMillis = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidAudioRecorder$startTimer$2 androidAudioRecorder$startTimer$2 = new AndroidAudioRecorder$startTimer$2(this.this$0, this.$maxDurationInMillis, continuation);
        androidAudioRecorder$startTimer$2.L$0 = obj;
        return androidAudioRecorder$startTimer$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidAudioRecorder$startTimer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        AndroidAudioRecorder androidAudioRecorder = this.this$0;
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$maxDurationInMillis, this.this$0, null), 3, null);
        androidAudioRecorder.recordingTimerJob = launch$default;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$handleDelta(AndroidAudioRecorder androidAudioRecorder, long j, int i) {
        RecordingAudioFile recordingAudioFile;
        AmplitudesHistory amplitudesHistory;
        MediaRecorder mediaRecorder;
        AmplitudesHistory amplitudesHistory2;
        float calculateDB;
        recordingAudioFile = androidAudioRecorder.recordingFile;
        if (recordingAudioFile == null) {
            return;
        }
        amplitudesHistory = androidAudioRecorder.amplitudesHistory;
        mediaRecorder = androidAudioRecorder.recorder;
        amplitudesHistory.add(mediaRecorder != null ? mediaRecorder.getMaxAmplitude() : 0);
        long m6886getDurationUwyO8pc = recordingAudioFile.m6886getDurationUwyO8pc();
        Duration.Companion companion = Duration.Companion;
        long m8676plusLRDsOJo = Duration.m8676plusLRDsOJo(m6886getDurationUwyO8pc, DurationKt.toDuration(j, DurationUnit.MILLISECONDS));
        amplitudesHistory2 = androidAudioRecorder.amplitudesHistory;
        calculateDB = AndroidAudioRecorderKt.calculateDB(amplitudesHistory2);
        RecordingAudioFile m6883copy8Mi8wO0$default = RecordingAudioFile.m6883copy8Mi8wO0$default(recordingAudioFile, null, m8676plusLRDsOJo, calculateDB, 1, null);
        androidAudioRecorder.updateState(new AudioRecorderState.Recording(m6883copy8Mi8wO0$default));
        androidAudioRecorder.recordingFile = m6883copy8Mi8wO0$default;
        long m6886getDurationUwyO8pc2 = m6883copy8Mi8wO0$default.m6886getDurationUwyO8pc();
        Duration.Companion companion2 = Duration.Companion;
        if (Duration.m8639compareToLRDsOJo(m6886getDurationUwyO8pc2, DurationKt.toDuration(i, DurationUnit.MILLISECONDS)) >= 0) {
            androidAudioRecorder.internalStop(new AudioRecorderState.MaximumLength(recordingAudioFile));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidAudioRecorder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder$startTimer$2$1", f = "AndroidAudioRecorder.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder$startTimer$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $maxDurationInMillis;
        int label;
        final /* synthetic */ AndroidAudioRecorder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, AndroidAudioRecorder androidAudioRecorder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$maxDurationInMillis = i;
            this.this$0 = androidAudioRecorder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$maxDurationInMillis, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Long> coroutineTimer = CoroutinesKt.coroutineTimer(10L);
                final int i2 = this.$maxDurationInMillis;
                final AndroidAudioRecorder androidAudioRecorder = this.this$0;
                this.label = 1;
                if (coroutineTimer.collect(new FlowCollector() { // from class: com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder.startTimer.2.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).longValue(), continuation);
                    }

                    public final Object emit(long j, Continuation<? super Unit> continuation) {
                        AndroidAudioRecorder$startTimer$2.invokeSuspend$handleDelta(androidAudioRecorder, j, i2);
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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
}
