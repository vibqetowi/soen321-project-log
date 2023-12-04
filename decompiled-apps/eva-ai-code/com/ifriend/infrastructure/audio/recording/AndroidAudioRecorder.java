package com.ifriend.infrastructure.audio.recording;

import android.content.Context;
import android.media.MediaRecorder;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoreAppRule;
import com.ifriend.domain.services.audio.recording.AudioRecorder;
import com.ifriend.domain.services.audio.recording.AudioRecorderState;
import com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage;
import com.ifriend.domain.services.audio.recording.RecordingAudioFile;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AndroidAudioRecorder.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u000fH\u0002J\"\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J\u0011\u0010&\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010'\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0*H\u0016J\u0011\u0010+\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0011\u0010,\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/ifriend/infrastructure/audio/recording/AndroidAudioRecorder;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorder;", "Landroid/media/MediaRecorder$OnErrorListener;", "context", "Landroid/content/Context;", "filesStorage", "Lcom/ifriend/domain/services/audio/recording/AudioRecordingFileStorage;", "logger", "Lcom/ifriend/common_utils/Logger;", "maxDurationInMillis", "", "(Landroid/content/Context;Lcom/ifriend/domain/services/audio/recording/AudioRecordingFileStorage;Lcom/ifriend/common_utils/Logger;I)V", "amplitudesHistory", "Lcom/ifriend/infrastructure/audio/recording/AmplitudesHistory;", "currentState", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", "getCurrentState", "()Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", "recorder", "Landroid/media/MediaRecorder;", "recorderFactory", "Lcom/ifriend/infrastructure/audio/recording/MediaRecorderFactory;", "recordingFile", "Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;", "recordingTimerJob", "Lkotlinx/coroutines/Job;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "current", "internalStop", "finalState", "onError", "mr", "what", "extra", TtmlNode.START, "startTimer", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stateFlow", "Lkotlinx/coroutines/flow/Flow;", "stop", "stopAndClear", "updateState", "newState", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAudioRecorder implements AudioRecorder, MediaRecorder.OnErrorListener {
    private final AmplitudesHistory amplitudesHistory;
    private final AudioRecordingFileStorage filesStorage;
    private final Logger logger;
    private final int maxDurationInMillis;
    private MediaRecorder recorder;
    private final MediaRecorderFactory recorderFactory;
    private RecordingAudioFile recordingFile;
    private Job recordingTimerJob;
    private final MutableStateFlow<AudioRecorderState> state;

    public AndroidAudioRecorder(Context context, AudioRecordingFileStorage filesStorage, Logger logger, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filesStorage, "filesStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.filesStorage = filesStorage;
        this.logger = logger;
        this.maxDurationInMillis = i;
        this.state = StateFlowKt.MutableStateFlow(AudioRecorderState.Idle.INSTANCE);
        this.amplitudesHistory = new AmplitudesHistory(0, 1, null);
        this.recorderFactory = new MediaRecorderFactory(context, this);
    }

    public /* synthetic */ AndroidAudioRecorder(Context context, AudioRecordingFileStorage audioRecordingFileStorage, Logger logger, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, audioRecordingFileStorage, logger, (i2 & 8) != 0 ? CoreAppRule.INSTANCE.getAUDIO_RECORDING_MAX_DURATION() : i);
    }

    private final AudioRecorderState getCurrentState() {
        return this.state.getValue();
    }

    @Override // com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider
    public Flow<AudioRecorderState> stateFlow() {
        return this.state;
    }

    @Override // com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider
    public AudioRecorderState current() {
        return getCurrentState();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(5:19|20|21|14|15))(1:23))(3:27|(2:29|(1:31))|32)|24|(1:26)|21|14|15))|38|6|7|(0)(0)|24|(0)|21|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r0.L$0 = r4;
        r0.L$1 = r2;
        r0.L$2 = r10;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
        if (r4.stop(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
        r1 = r10;
        r0 = r4;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.ifriend.domain.services.audio.recording.AudioRecorderController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(Continuation<? super Unit> continuation) {
        AndroidAudioRecorder$start$1 androidAudioRecorder$start$1;
        Object coroutine_suspended;
        ?? r2;
        String generateFilePath;
        AndroidAudioRecorder androidAudioRecorder;
        Object startTimer;
        if (continuation instanceof AndroidAudioRecorder$start$1) {
            androidAudioRecorder$start$1 = (AndroidAudioRecorder$start$1) continuation;
            if ((androidAudioRecorder$start$1.label & Integer.MIN_VALUE) != 0) {
                androidAudioRecorder$start$1.label -= Integer.MIN_VALUE;
                Object obj = androidAudioRecorder$start$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = androidAudioRecorder$start$1.label;
                ?? r4 = 1;
                if (r2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    generateFilePath = this.filesStorage.generateFilePath();
                    Logger.DefaultImpls.info$default(this.logger, "Start voice recording (" + generateFilePath + ")", null, 2, null);
                    if (this.recorder != null) {
                        androidAudioRecorder$start$1.L$0 = this;
                        androidAudioRecorder$start$1.L$1 = generateFilePath;
                        androidAudioRecorder$start$1.label = 1;
                        if (stop(androidAudioRecorder$start$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    androidAudioRecorder = this;
                } else if (r2 != 1) {
                    if (r2 == 2) {
                        String str = (String) androidAudioRecorder$start$1.L$1;
                        AndroidAudioRecorder androidAudioRecorder2 = (AndroidAudioRecorder) androidAudioRecorder$start$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r2 = str;
                        r4 = androidAudioRecorder2;
                        return Unit.INSTANCE;
                    } else if (r2 == 3) {
                        Exception exc = (Exception) androidAudioRecorder$start$1.L$2;
                        AndroidAudioRecorder androidAudioRecorder3 = (AndroidAudioRecorder) androidAudioRecorder$start$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        String str2 = (String) androidAudioRecorder$start$1.L$1;
                        Logger.DefaultImpls.error$default(androidAudioRecorder3.logger, "StartRecording(" + str2 + ") error: " + exc.getMessage(), null, 2, null);
                        return Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    generateFilePath = (String) androidAudioRecorder$start$1.L$1;
                    ResultKt.throwOnFailure(obj);
                    androidAudioRecorder = (AndroidAudioRecorder) androidAudioRecorder$start$1.L$0;
                }
                MediaRecorder create = androidAudioRecorder.recorderFactory.create(generateFilePath);
                create.prepare();
                create.start();
                androidAudioRecorder.recorder = create;
                start$postRecordingState(androidAudioRecorder, generateFilePath);
                int i = androidAudioRecorder.maxDurationInMillis;
                androidAudioRecorder$start$1.L$0 = androidAudioRecorder;
                androidAudioRecorder$start$1.L$1 = generateFilePath;
                androidAudioRecorder$start$1.label = 2;
                startTimer = androidAudioRecorder.startTimer(i, androidAudioRecorder$start$1);
                r2 = generateFilePath;
                r4 = androidAudioRecorder;
                if (startTimer == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        androidAudioRecorder$start$1 = new AndroidAudioRecorder$start$1(this, continuation);
        Object obj2 = androidAudioRecorder$start$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = androidAudioRecorder$start$1.label;
        ?? r42 = 1;
        if (r2 != 0) {
        }
        MediaRecorder create2 = androidAudioRecorder.recorderFactory.create(generateFilePath);
        create2.prepare();
        create2.start();
        androidAudioRecorder.recorder = create2;
        start$postRecordingState(androidAudioRecorder, generateFilePath);
        int i2 = androidAudioRecorder.maxDurationInMillis;
        androidAudioRecorder$start$1.L$0 = androidAudioRecorder;
        androidAudioRecorder$start$1.L$1 = generateFilePath;
        androidAudioRecorder$start$1.label = 2;
        startTimer = androidAudioRecorder.startTimer(i2, androidAudioRecorder$start$1);
        r2 = generateFilePath;
        r42 = androidAudioRecorder;
        if (startTimer == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    private static final void start$postRecordingState(AndroidAudioRecorder androidAudioRecorder, String str) {
        Duration.Companion companion = Duration.Companion;
        RecordingAudioFile recordingAudioFile = new RecordingAudioFile(str, DurationKt.toDuration(0, DurationUnit.MILLISECONDS), 0.0f, null);
        androidAudioRecorder.recordingFile = recordingAudioFile;
        androidAudioRecorder.updateState(new AudioRecorderState.Recording(recordingAudioFile));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startTimer(int i, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new AndroidAudioRecorder$startTimer$2(this, i, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.services.audio.recording.AudioRecorderController
    public Object stop(Continuation<? super Unit> continuation) {
        internalStop$default(this, null, 1, null);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void internalStop$default(AndroidAudioRecorder androidAudioRecorder, AudioRecorderState audioRecorderState, int i, Object obj) {
        if ((i & 1) != 0) {
            audioRecorderState = AudioRecorderState.Idle.INSTANCE;
        }
        androidAudioRecorder.internalStop(audioRecorderState);
    }

    private static final void internalStop$stopTimer(AndroidAudioRecorder androidAudioRecorder) {
        Job job = androidAudioRecorder.recordingTimerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        androidAudioRecorder.recordingTimerJob = null;
    }

    private static final void internalStop$stopRecorder(AndroidAudioRecorder androidAudioRecorder) {
        try {
            MediaRecorder mediaRecorder = androidAudioRecorder.recorder;
            if (mediaRecorder != null) {
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = androidAudioRecorder.recorder;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.release();
                }
                androidAudioRecorder.recorder = null;
            }
        } catch (RuntimeException e) {
            androidAudioRecorder.logger.logException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalStop(AudioRecorderState audioRecorderState) {
        Logger.DefaultImpls.info$default(this.logger, "Stopping audio recording...", null, 2, null);
        internalStop$stopTimer(this);
        internalStop$stopRecorder(this);
        this.recordingFile = null;
        updateState(audioRecorderState);
        Logger.DefaultImpls.info$default(this.logger, "Audio recording stopped", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.domain.services.audio.recording.AudioRecorderController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stopAndClear(Continuation<? super Unit> continuation) {
        AndroidAudioRecorder$stopAndClear$1 androidAudioRecorder$stopAndClear$1;
        int i;
        AndroidAudioRecorder androidAudioRecorder;
        if (continuation instanceof AndroidAudioRecorder$stopAndClear$1) {
            androidAudioRecorder$stopAndClear$1 = (AndroidAudioRecorder$stopAndClear$1) continuation;
            if ((androidAudioRecorder$stopAndClear$1.label & Integer.MIN_VALUE) != 0) {
                androidAudioRecorder$stopAndClear$1.label -= Integer.MIN_VALUE;
                Object obj = androidAudioRecorder$stopAndClear$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidAudioRecorder$stopAndClear$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    androidAudioRecorder$stopAndClear$1.L$0 = this;
                    androidAudioRecorder$stopAndClear$1.label = 1;
                    if (stop(androidAudioRecorder$stopAndClear$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidAudioRecorder = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    androidAudioRecorder = (AndroidAudioRecorder) androidAudioRecorder$stopAndClear$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                androidAudioRecorder.filesStorage.deleteLastFile();
                return Unit.INSTANCE;
            }
        }
        androidAudioRecorder$stopAndClear$1 = new AndroidAudioRecorder$stopAndClear$1(this, continuation);
        Object obj2 = androidAudioRecorder$stopAndClear$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidAudioRecorder$stopAndClear$1.label;
        if (i != 0) {
        }
        androidAudioRecorder.filesStorage.deleteLastFile();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.domain.services.audio.recording.AudioRecorderController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearCache(Continuation<? super Unit> continuation) {
        AndroidAudioRecorder$clearCache$1 androidAudioRecorder$clearCache$1;
        int i;
        AndroidAudioRecorder androidAudioRecorder;
        if (continuation instanceof AndroidAudioRecorder$clearCache$1) {
            androidAudioRecorder$clearCache$1 = (AndroidAudioRecorder$clearCache$1) continuation;
            if ((androidAudioRecorder$clearCache$1.label & Integer.MIN_VALUE) != 0) {
                androidAudioRecorder$clearCache$1.label -= Integer.MIN_VALUE;
                Object obj = androidAudioRecorder$clearCache$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidAudioRecorder$clearCache$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    androidAudioRecorder$clearCache$1.L$0 = this;
                    androidAudioRecorder$clearCache$1.label = 1;
                    if (stop(androidAudioRecorder$clearCache$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidAudioRecorder = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    androidAudioRecorder = (AndroidAudioRecorder) androidAudioRecorder$clearCache$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                androidAudioRecorder.filesStorage.clear();
                return Unit.INSTANCE;
            }
        }
        androidAudioRecorder$clearCache$1 = new AndroidAudioRecorder$clearCache$1(this, continuation);
        Object obj2 = androidAudioRecorder$clearCache$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidAudioRecorder$clearCache$1.label;
        if (i != 0) {
        }
        androidAudioRecorder.filesStorage.clear();
        return Unit.INSTANCE;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        updateState(new AudioRecorderState.Error(new Exception("Error while recording audio " + i + RemoteSettings.FORWARD_SLASH_STRING + i2)));
        internalStop$default(this, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(AudioRecorderState audioRecorderState) {
        this.state.setValue(audioRecorderState);
    }
}
