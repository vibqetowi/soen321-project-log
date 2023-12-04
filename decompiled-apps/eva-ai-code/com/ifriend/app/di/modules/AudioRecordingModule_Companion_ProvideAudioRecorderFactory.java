package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.services.audio.recording.AudioRecorder;
import com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AudioRecordingModule_Companion_ProvideAudioRecorderFactory implements Factory<AudioRecorder> {
    private final Provider<Context> contextProvider;
    private final Provider<AudioRecordingFileStorage> filesStorageProvider;
    private final Provider<Logger> loggerProvider;

    public AudioRecordingModule_Companion_ProvideAudioRecorderFactory(Provider<Context> provider, Provider<AudioRecordingFileStorage> provider2, Provider<Logger> provider3) {
        this.contextProvider = provider;
        this.filesStorageProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AudioRecorder get() {
        return provideAudioRecorder(this.contextProvider.get(), this.filesStorageProvider.get(), this.loggerProvider.get());
    }

    public static AudioRecordingModule_Companion_ProvideAudioRecorderFactory create(Provider<Context> provider, Provider<AudioRecordingFileStorage> provider2, Provider<Logger> provider3) {
        return new AudioRecordingModule_Companion_ProvideAudioRecorderFactory(provider, provider2, provider3);
    }

    public static AudioRecorder provideAudioRecorder(Context context, AudioRecordingFileStorage audioRecordingFileStorage, Logger logger) {
        return (AudioRecorder) Preconditions.checkNotNullFromProvides(AudioRecordingModule.Companion.provideAudioRecorder(context, audioRecordingFileStorage, logger));
    }
}
