package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0208ChatCallViewModelFactory_Factory {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<ChatCallAnalytics> chatCallAnalyticsProvider;
    private final Provider<ChatCallsInteractor> chatCallsInteractorProvider;
    private final Provider<ChatEventsInteractor> chatEventsInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<GeneratedChatAvatarInteractor> generatedChatAvatarInteractorProvider;
    private final Provider<PermissionProvider> permissionProvider;
    private final Provider<ResourceProvider> resourceProvider;
    private final Provider<TextToSpeechStream> textToSpeechStreamProvider;
    private final Provider<VoiceRecognitionStreaming> voiceRecognitionStreamingProvider;

    public C0208ChatCallViewModelFactory_Factory(Provider<ChatsInfoInteractor> provider, Provider<ResourceProvider> provider2, Provider<ChatCallsInteractor> provider3, Provider<FlowObserverEmitter<Throwable>> provider4, Provider<DispatcherProvider> provider5, Provider<TextToSpeechStream> provider6, Provider<VoiceRecognitionStreaming> provider7, Provider<ChatEventsInteractor> provider8, Provider<PermissionProvider> provider9, Provider<ChatCallAnalytics> provider10, Provider<AnalyticsInteractor> provider11, Provider<GeneratedChatAvatarInteractor> provider12) {
        this.chatsInfoInteractorProvider = provider;
        this.resourceProvider = provider2;
        this.chatCallsInteractorProvider = provider3;
        this.exceptionsEmitterProvider = provider4;
        this.dispatcherProvider = provider5;
        this.textToSpeechStreamProvider = provider6;
        this.voiceRecognitionStreamingProvider = provider7;
        this.chatEventsInteractorProvider = provider8;
        this.permissionProvider = provider9;
        this.chatCallAnalyticsProvider = provider10;
        this.analyticsInteractorProvider = provider11;
        this.generatedChatAvatarInteractorProvider = provider12;
    }

    public ChatCallViewModelFactory get(String str) {
        return newInstance(str, this.chatsInfoInteractorProvider.get(), this.resourceProvider.get(), this.chatCallsInteractorProvider.get(), this.exceptionsEmitterProvider.get(), this.dispatcherProvider.get(), this.textToSpeechStreamProvider.get(), this.voiceRecognitionStreamingProvider.get(), this.chatEventsInteractorProvider.get(), this.permissionProvider.get(), this.chatCallAnalyticsProvider.get(), this.analyticsInteractorProvider.get(), this.generatedChatAvatarInteractorProvider.get());
    }

    public static C0208ChatCallViewModelFactory_Factory create(Provider<ChatsInfoInteractor> provider, Provider<ResourceProvider> provider2, Provider<ChatCallsInteractor> provider3, Provider<FlowObserverEmitter<Throwable>> provider4, Provider<DispatcherProvider> provider5, Provider<TextToSpeechStream> provider6, Provider<VoiceRecognitionStreaming> provider7, Provider<ChatEventsInteractor> provider8, Provider<PermissionProvider> provider9, Provider<ChatCallAnalytics> provider10, Provider<AnalyticsInteractor> provider11, Provider<GeneratedChatAvatarInteractor> provider12) {
        return new C0208ChatCallViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static ChatCallViewModelFactory newInstance(String str, ChatsInfoInteractor chatsInfoInteractor, ResourceProvider resourceProvider, ChatCallsInteractor chatCallsInteractor, FlowObserverEmitter<Throwable> flowObserverEmitter, DispatcherProvider dispatcherProvider, TextToSpeechStream textToSpeechStream, VoiceRecognitionStreaming voiceRecognitionStreaming, ChatEventsInteractor chatEventsInteractor, PermissionProvider permissionProvider, ChatCallAnalytics chatCallAnalytics, AnalyticsInteractor analyticsInteractor, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        return new ChatCallViewModelFactory(str, chatsInfoInteractor, resourceProvider, chatCallsInteractor, flowObserverEmitter, dispatcherProvider, textToSpeechStream, voiceRecognitionStreaming, chatEventsInteractor, permissionProvider, chatCallAnalytics, analyticsInteractor, generatedChatAvatarInteractor);
    }
}
