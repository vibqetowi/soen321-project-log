package com.ifriend.presentation.features.chat.input.delegate;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.services.audio.recording.AudioRecorderController;
import com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.input.analytics.VoiceRecordingAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatInputDelegateImpl_Factory implements Factory<ChatInputDelegateImpl> {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatchersProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<AudioRecorderController> recorderControllerProvider;
    private final Provider<AudioRecordingStateProvider> recorderStateProvider;
    private final Provider<ResourceProvider> resourcesProvider;
    private final Provider<VoiceRecordingAnalytics> voiceRecordingAnalyticsProvider;

    public ChatInputDelegateImpl_Factory(Provider<ResourceProvider> provider, Provider<ChatsInfoInteractor> provider2, Provider<AudioRecorderController> provider3, Provider<AudioRecordingStateProvider> provider4, Provider<DispatcherProvider> provider5, Provider<FlowObserverEmitter<Throwable>> provider6, Provider<ChatClientInteractor> provider7, Provider<VoiceRecordingAnalytics> provider8) {
        this.resourcesProvider = provider;
        this.chatsInfoInteractorProvider = provider2;
        this.recorderControllerProvider = provider3;
        this.recorderStateProvider = provider4;
        this.dispatchersProvider = provider5;
        this.exceptionsEmitterProvider = provider6;
        this.chatClientInteractorProvider = provider7;
        this.voiceRecordingAnalyticsProvider = provider8;
    }

    @Override // javax.inject.Provider
    public ChatInputDelegateImpl get() {
        return newInstance(this.resourcesProvider.get(), this.chatsInfoInteractorProvider.get(), this.recorderControllerProvider.get(), this.recorderStateProvider.get(), this.dispatchersProvider.get(), this.exceptionsEmitterProvider.get(), this.chatClientInteractorProvider.get(), this.voiceRecordingAnalyticsProvider.get());
    }

    public static ChatInputDelegateImpl_Factory create(Provider<ResourceProvider> provider, Provider<ChatsInfoInteractor> provider2, Provider<AudioRecorderController> provider3, Provider<AudioRecordingStateProvider> provider4, Provider<DispatcherProvider> provider5, Provider<FlowObserverEmitter<Throwable>> provider6, Provider<ChatClientInteractor> provider7, Provider<VoiceRecordingAnalytics> provider8) {
        return new ChatInputDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static ChatInputDelegateImpl newInstance(ResourceProvider resourceProvider, ChatsInfoInteractor chatsInfoInteractor, AudioRecorderController audioRecorderController, AudioRecordingStateProvider audioRecordingStateProvider, DispatcherProvider dispatcherProvider, FlowObserverEmitter<Throwable> flowObserverEmitter, ChatClientInteractor chatClientInteractor, VoiceRecordingAnalytics voiceRecordingAnalytics) {
        return new ChatInputDelegateImpl(resourceProvider, chatsInfoInteractor, audioRecorderController, audioRecordingStateProvider, dispatcherProvider, flowObserverEmitter, chatClientInteractor, voiceRecordingAnalytics);
    }
}
