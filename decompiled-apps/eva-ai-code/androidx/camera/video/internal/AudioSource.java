package androidx.camera.video.internal;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.AudioSource;
import androidx.camera.video.internal.AutoValue_AudioSource_Settings;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.compat.Api23Impl;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.core.util.Preconditions;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class AudioSource {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(Integer.valueOf((int) OpusUtil.SAMPLE_RATE), 44100, 22050, 11025, 8000, 4800));
    private static final String TAG = "AudioSource";
    private FutureCallback<InputBuffer> mAcquireBufferCallback;
    final AudioRecord mAudioRecord;
    private AudioManager$AudioRecordingCallback mAudioRecordingCallback;
    AudioSourceCallback mAudioSourceCallback;
    BufferProvider<InputBuffer> mBufferProvider;
    final int mBufferSize;
    Executor mCallbackExecutor;
    final Executor mExecutor;
    boolean mIsSendingAudio;
    private Observable.Observer<BufferProvider.State> mStateObserver;
    AtomicBoolean mSourceSilence = new AtomicBoolean(false);
    InternalState mState = InternalState.CONFIGURED;
    BufferProvider.State mBufferProviderState = BufferProvider.State.INACTIVE;

    /* loaded from: classes.dex */
    public interface AudioSourceCallback {
        void onError(Throwable th);

        void onSilenced(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum InternalState {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    private static int channelCountToChannelConfig(int i) {
        return i == 1 ? 16 : 12;
    }

    private static int channelCountToChannelMask(int i) {
        return i == 1 ? 16 : 12;
    }

    public AudioSource(Settings settings, Executor executor, Context context) throws AudioSourceAccessException {
        if (!isSettingsSupported(settings.getSampleRate(), settings.getChannelCount(), settings.getAudioFormat())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(settings.getSampleRate()), Integer.valueOf(settings.getChannelCount()), Integer.valueOf(settings.getAudioFormat())));
        }
        int minBufferSize = getMinBufferSize(settings.getSampleRate(), settings.getChannelCount(), settings.getAudioFormat());
        Preconditions.checkState(minBufferSize > 0);
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = newSequentialExecutor;
        int i = minBufferSize * 2;
        this.mBufferSize = i;
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(settings.getSampleRate()).setChannelMask(channelCountToChannelMask(settings.getChannelCount())).setEncoding(settings.getAudioFormat()).build();
            AudioRecord.Builder createAudioRecordBuilder = Api23Impl.createAudioRecordBuilder();
            if (Build.VERSION.SDK_INT >= 31 && context != null) {
                Api31Impl.setContext(createAudioRecordBuilder, context);
            }
            Api23Impl.setAudioSource(createAudioRecordBuilder, settings.getAudioSource());
            Api23Impl.setAudioFormat(createAudioRecordBuilder, build);
            Api23Impl.setBufferSizeInBytes(createAudioRecordBuilder, i);
            AudioRecord build2 = Api23Impl.build(createAudioRecordBuilder);
            this.mAudioRecord = build2;
            if (build2.getState() != 1) {
                build2.release();
                throw new AudioSourceAccessException("Unable to initialize AudioRecord");
            } else if (Build.VERSION.SDK_INT >= 29) {
                AudioRecordingApi29Callback audioRecordingApi29Callback = new AudioRecordingApi29Callback();
                this.mAudioRecordingCallback = audioRecordingApi29Callback;
                Api29Impl.registerAudioRecordingCallback(build2, newSequentialExecutor, audioRecordingApi29Callback);
            }
        } catch (IllegalArgumentException e) {
            throw new AudioSourceAccessException("Unable to create AudioRecord", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class AudioRecordingApi29Callback extends AudioManager$AudioRecordingCallback {
        AudioRecordingApi29Callback() {
        }

        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            if (AudioSource.this.mCallbackExecutor == null || AudioSource.this.mAudioSourceCallback == null) {
                return;
            }
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                AudioRecordingConfiguration m8m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m8m((Object) audioRecordingConfiguration);
                if (Api24Impl.getClientAudioSessionId(m8m) == AudioSource.this.mAudioRecord.getAudioSessionId()) {
                    final boolean isClientSilenced = Api29Impl.isClientSilenced(m8m);
                    if (AudioSource.this.mSourceSilence.getAndSet(isClientSilenced) != isClientSilenced) {
                        AudioSource.this.mCallbackExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.AudioSource$AudioRecordingApi29Callback$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AudioSource.AudioRecordingApi29Callback.this.m225x1186fe59(isClientSilenced);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onRecordingConfigChanged$0$androidx-camera-video-internal-AudioSource$AudioRecordingApi29Callback  reason: not valid java name */
        public /* synthetic */ void m225x1186fe59(boolean z) {
            AudioSource.this.mAudioSourceCallback.onSilenced(z);
        }
    }

    public void setBufferProvider(final BufferProvider<InputBuffer> bufferProvider) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.AudioSource$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.this.m222x1f3f6859(bufferProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setBufferProvider$0$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m222x1f3f6859(BufferProvider bufferProvider) {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                throw new IllegalStateException("AudioRecorder is released");
            }
        } else if (this.mBufferProvider != bufferProvider) {
            resetBufferProvider(bufferProvider);
        }
    }

    public void start() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.AudioSource$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.this.m223lambda$start$1$androidxcameravideointernalAudioSource();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$start$1$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m223lambda$start$1$androidxcameravideointernalAudioSource() {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i != 1) {
            if (i == 3) {
                throw new IllegalStateException("AudioRecorder is released");
            }
            return;
        }
        setState(InternalState.STARTED);
        updateSendingAudio();
    }

    public void stop() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.AudioSource$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.this.m224lambda$stop$2$androidxcameravideointernalAudioSource();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$stop$2$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m224lambda$stop$2$androidxcameravideointernalAudioSource() {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i != 2) {
            if (i == 3) {
                throw new IllegalStateException("AudioRecorder is released");
            }
            return;
        }
        setState(InternalState.CONFIGURED);
        updateSendingAudio();
    }

    public void release() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.AudioSource$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.this.m220lambda$release$3$androidxcameravideointernalAudioSource();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$release$3$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m220lambda$release$3$androidxcameravideointernalAudioSource() {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i == 1 || i == 2) {
            resetBufferProvider(null);
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, this.mAudioRecordingCallback);
            }
            this.mAudioRecord.release();
            stopSendingAudio();
            setState(InternalState.RELEASED);
        }
    }

    /* renamed from: androidx.camera.video.internal.AudioSource$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState;

        static {
            int[] iArr = new int[InternalState.values().length];
            $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState = iArr;
            try {
                iArr[InternalState.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[InternalState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[InternalState.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void setAudioSourceCallback(final Executor executor, final AudioSourceCallback audioSourceCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.AudioSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.this.m221xb3bb18ba(executor, audioSourceCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setAudioSourceCallback$4$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m221xb3bb18ba(Executor executor, AudioSourceCallback audioSourceCallback) {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i == 1) {
            this.mCallbackExecutor = executor;
            this.mAudioSourceCallback = audioSourceCallback;
        } else if (i == 2 || i == 3) {
            throw new IllegalStateException("The audio recording callback must be registered before the audio source is started.");
        }
    }

    private void resetBufferProvider(final BufferProvider<InputBuffer> bufferProvider) {
        BufferProvider<InputBuffer> bufferProvider2 = this.mBufferProvider;
        if (bufferProvider2 != null) {
            bufferProvider2.removeObserver(this.mStateObserver);
            this.mBufferProvider = null;
            this.mStateObserver = null;
            this.mAcquireBufferCallback = null;
        }
        this.mBufferProviderState = BufferProvider.State.INACTIVE;
        updateSendingAudio();
        if (bufferProvider != null) {
            this.mBufferProvider = bufferProvider;
            this.mStateObserver = new Observable.Observer<BufferProvider.State>() { // from class: androidx.camera.video.internal.AudioSource.1
                @Override // androidx.camera.core.impl.Observable.Observer
                public void onNewData(BufferProvider.State state) {
                    if (AudioSource.this.mBufferProvider == bufferProvider) {
                        Logger.d(AudioSource.TAG, "Receive BufferProvider state change: " + AudioSource.this.mBufferProviderState + " to " + state);
                        AudioSource.this.mBufferProviderState = state;
                        AudioSource.this.updateSendingAudio();
                    }
                }

                @Override // androidx.camera.core.impl.Observable.Observer
                public void onError(Throwable th) {
                    if (AudioSource.this.mBufferProvider == bufferProvider) {
                        AudioSource.this.notifyError(th);
                    }
                }
            };
            this.mAcquireBufferCallback = new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.AudioSource.2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(InputBuffer inputBuffer) {
                    if (!AudioSource.this.mIsSendingAudio || AudioSource.this.mBufferProvider != bufferProvider) {
                        inputBuffer.cancel();
                        return;
                    }
                    ByteBuffer byteBuffer = inputBuffer.getByteBuffer();
                    int read = AudioSource.this.mAudioRecord.read(byteBuffer, AudioSource.this.mBufferSize);
                    if (read > 0) {
                        byteBuffer.limit(read);
                        inputBuffer.setPresentationTimeUs(AudioSource.this.generatePresentationTimeUs());
                        inputBuffer.submit();
                    } else {
                        Logger.w(AudioSource.TAG, "Unable to read data from AudioRecord.");
                        inputBuffer.cancel();
                    }
                    AudioSource.this.sendNextAudio();
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    if (AudioSource.this.mBufferProvider != bufferProvider) {
                        Logger.d(AudioSource.TAG, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                        AudioSource.this.notifyError(th);
                    }
                }
            };
            this.mBufferProvider.addObserver(this.mExecutor, this.mStateObserver);
        }
    }

    void notifyError(final Throwable th) {
        Executor executor = this.mCallbackExecutor;
        if (executor == null || this.mAudioSourceCallback == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.AudioSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.this.m219lambda$notifyError$5$androidxcameravideointernalAudioSource(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$notifyError$5$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m219lambda$notifyError$5$androidxcameravideointernalAudioSource(Throwable th) {
        this.mAudioSourceCallback.onError(th);
    }

    void updateSendingAudio() {
        if (this.mState == InternalState.STARTED && this.mBufferProviderState == BufferProvider.State.ACTIVE) {
            startSendingAudio();
        } else {
            stopSendingAudio();
        }
    }

    private void startSendingAudio() {
        if (this.mIsSendingAudio) {
            return;
        }
        try {
            Logger.d(TAG, "startSendingAudio");
            this.mAudioRecord.startRecording();
            if (this.mAudioRecord.getRecordingState() != 3) {
                throw new IllegalStateException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            }
            this.mIsSendingAudio = true;
            sendNextAudio();
        } catch (IllegalStateException e) {
            Logger.w(TAG, "Failed to start AudioRecord", e);
            setState(InternalState.CONFIGURED);
            notifyError(new AudioSourceAccessException("Unable to start the audio record.", e));
        }
    }

    private void stopSendingAudio() {
        if (this.mIsSendingAudio) {
            this.mIsSendingAudio = false;
            try {
                Logger.d(TAG, "stopSendingAudio");
                this.mAudioRecord.stop();
                if (this.mAudioRecord.getRecordingState() == 1) {
                    return;
                }
                throw new IllegalStateException("Unable to stop AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            } catch (IllegalStateException e) {
                Logger.w(TAG, "Failed to stop AudioRecord", e);
                notifyError(e);
            }
        }
    }

    void sendNextAudio() {
        Futures.addCallback(this.mBufferProvider.acquireBuffer(), this.mAcquireBufferCallback, this.mExecutor);
    }

    void setState(InternalState internalState) {
        Logger.d(TAG, "Transitioning internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    long generatePresentationTimeUs() {
        long j;
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (Api24Impl.getTimestamp(this.mAudioRecord, audioTimestamp, 0) == 0) {
                j = TimeUnit.NANOSECONDS.toMicros(audioTimestamp.nanoTime);
                return j != -1 ? TimeUnit.NANOSECONDS.toMicros(System.nanoTime()) : j;
            }
            Logger.w(TAG, "Unable to get audio timestamp");
        }
        j = -1;
        if (j != -1) {
        }
    }

    public static boolean isSettingsSupported(int i, int i2, int i3) {
        return i > 0 && i2 > 0 && getMinBufferSize(i, i2, i3) > 0;
    }

    private static int getMinBufferSize(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, channelCountToChannelConfig(i2), i3);
    }

    /* loaded from: classes.dex */
    public static abstract class Settings {
        public abstract int getAudioFormat();

        public abstract int getAudioSource();

        public abstract int getChannelCount();

        public abstract int getSampleRate();

        public abstract Builder toBuilder();

        public static Builder builder() {
            return new AutoValue_AudioSource_Settings.Builder().setAudioSource(-1).setSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
        }

        /* loaded from: classes.dex */
        public static abstract class Builder {
            abstract Settings autoBuild();

            public abstract Builder setAudioFormat(int i);

            public abstract Builder setAudioSource(int i);

            public abstract Builder setChannelCount(int i);

            public abstract Builder setSampleRate(int i);

            public final Settings build() {
                Settings autoBuild = autoBuild();
                String str = autoBuild.getAudioSource() == -1 ? " audioSource" : "";
                if (autoBuild.getSampleRate() <= 0) {
                    str = str + " sampleRate";
                }
                if (autoBuild.getChannelCount() <= 0) {
                    str = str + " channelCount";
                }
                if (autoBuild.getAudioFormat() == -1) {
                    str = str + " audioFormat";
                }
                if (str.isEmpty()) {
                    return autoBuild;
                }
                throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
            }
        }
    }
}
