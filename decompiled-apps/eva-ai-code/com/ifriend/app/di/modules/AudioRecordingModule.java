package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.services.audio.recording.AudioRecorder;
import com.ifriend.domain.services.audio.recording.AudioRecorderController;
import com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage;
import com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider;
import com.ifriend.infrastructure.audio.recording.AndroidAudioRecorder;
import com.ifriend.infrastructure.audio.recording.CacheAudioRecordingFileStorage;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioRecordingModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lcom/ifriend/app/di/modules/AudioRecordingModule;", "", "()V", "bindAudioRecorderController", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderController;", "recorder", "Lcom/ifriend/domain/services/audio/recording/AudioRecorder;", "bindAudioRecordingStateProvider", "Lcom/ifriend/domain/services/audio/recording/AudioRecordingStateProvider;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class AudioRecordingModule {
    public static final Companion Companion = new Companion(null);

    @Singleton
    @Binds
    public abstract AudioRecorderController bindAudioRecorderController(AudioRecorder audioRecorder);

    @Singleton
    @Binds
    public abstract AudioRecordingStateProvider bindAudioRecordingStateProvider(AudioRecorder audioRecorder);

    /* compiled from: AudioRecordingModule.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/ifriend/app/di/modules/AudioRecordingModule$Companion;", "", "()V", "provideAudioRecorder", "Lcom/ifriend/domain/services/audio/recording/AudioRecorder;", "context", "Landroid/content/Context;", "filesStorage", "Lcom/ifriend/domain/services/audio/recording/AudioRecordingFileStorage;", "logger", "Lcom/ifriend/common_utils/Logger;", "provideRecordedAudioFileStorage", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final AudioRecordingFileStorage provideRecordedAudioFileStorage(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CacheAudioRecordingFileStorage(context, null, 2, null);
        }

        @Provides
        @Singleton
        public final AudioRecorder provideAudioRecorder(Context context, AudioRecordingFileStorage filesStorage, Logger logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(filesStorage, "filesStorage");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new AndroidAudioRecorder(context, filesStorage, logger, 0, 8, null);
        }
    }
}
