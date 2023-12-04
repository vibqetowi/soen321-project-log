package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.domain.services.audio.recording.AudioRecordingFileStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AudioRecordingModule_Companion_ProvideRecordedAudioFileStorageFactory implements Factory<AudioRecordingFileStorage> {
    private final Provider<Context> contextProvider;

    public AudioRecordingModule_Companion_ProvideRecordedAudioFileStorageFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AudioRecordingFileStorage get() {
        return provideRecordedAudioFileStorage(this.contextProvider.get());
    }

    public static AudioRecordingModule_Companion_ProvideRecordedAudioFileStorageFactory create(Provider<Context> provider) {
        return new AudioRecordingModule_Companion_ProvideRecordedAudioFileStorageFactory(provider);
    }

    public static AudioRecordingFileStorage provideRecordedAudioFileStorage(Context context) {
        return (AudioRecordingFileStorage) Preconditions.checkNotNullFromProvides(AudioRecordingModule.Companion.provideRecordedAudioFileStorage(context));
    }
}
