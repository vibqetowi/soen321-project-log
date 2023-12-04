package com.ifriend.chat.new_chat.list.delegate;

import com.ifriend.chat.new_chat.list.delegate.providers.PresentationChatSystemsProvider;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChangeVoiceSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioEventsHandlingSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioInitialStateSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioPlaybackSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.image.ImagesLockerSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnimationSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation.LiveMessagesAnimationSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.scroll.ScrollControllingSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.systems.dateSeparator.DateSeparatorSystem;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PresentationChatSystemsDelegate_Factory implements Factory<PresentationChatSystemsDelegate> {
    private final Provider<AudioPlaybackSystem> audioPlaybackSystemProvider;
    private final Provider<ChangeVoiceSystem> changeVoiceSystemProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<DateSeparatorSystem> dateSeparatorSystemProvider;
    private final Provider<DecodingAudioEventsHandlingSystem> decodingAudioEventsHandlingSystemProvider;
    private final Provider<DecodingAudioInitialStateSystem> decodingAudioInitialStateSystemProvider;
    private final Provider<ExperienceMessageAnimationSystem> experienceMessageAnimationSystemProvider;
    private final Provider<ImagesLockerSystem> imagesLockerSystemProvider;
    private final Provider<LiveMessagesAnimationSystem> liveMessagesAnimationSystemProvider;
    private final Provider<PresentationChatSystemsProvider> presentationChatSystemsProvider;
    private final Provider<ScrollControllingSystem> scrollControllingSystemProvider;
    private final Provider<ShowSextingRequestSystem> showSextingRequestSystemProvider;

    public PresentationChatSystemsDelegate_Factory(Provider<LiveMessagesAnimationSystem> provider, Provider<ScrollControllingSystem> provider2, Provider<AudioPlaybackSystem> provider3, Provider<ChangeVoiceSystem> provider4, Provider<DecodingAudioInitialStateSystem> provider5, Provider<DecodingAudioEventsHandlingSystem> provider6, Provider<ShowSextingRequestSystem> provider7, Provider<ImagesLockerSystem> provider8, Provider<DateSeparatorSystem> provider9, Provider<ExperienceMessageAnimationSystem> provider10, Provider<ChatClientInteractor> provider11, Provider<PresentationChatSystemsProvider> provider12) {
        this.liveMessagesAnimationSystemProvider = provider;
        this.scrollControllingSystemProvider = provider2;
        this.audioPlaybackSystemProvider = provider3;
        this.changeVoiceSystemProvider = provider4;
        this.decodingAudioInitialStateSystemProvider = provider5;
        this.decodingAudioEventsHandlingSystemProvider = provider6;
        this.showSextingRequestSystemProvider = provider7;
        this.imagesLockerSystemProvider = provider8;
        this.dateSeparatorSystemProvider = provider9;
        this.experienceMessageAnimationSystemProvider = provider10;
        this.chatClientInteractorProvider = provider11;
        this.presentationChatSystemsProvider = provider12;
    }

    @Override // javax.inject.Provider
    public PresentationChatSystemsDelegate get() {
        return newInstance(this.liveMessagesAnimationSystemProvider.get(), this.scrollControllingSystemProvider.get(), this.audioPlaybackSystemProvider.get(), this.changeVoiceSystemProvider.get(), this.decodingAudioInitialStateSystemProvider.get(), this.decodingAudioEventsHandlingSystemProvider.get(), this.showSextingRequestSystemProvider.get(), this.imagesLockerSystemProvider.get(), this.dateSeparatorSystemProvider.get(), this.experienceMessageAnimationSystemProvider.get(), this.chatClientInteractorProvider.get(), this.presentationChatSystemsProvider.get());
    }

    public static PresentationChatSystemsDelegate_Factory create(Provider<LiveMessagesAnimationSystem> provider, Provider<ScrollControllingSystem> provider2, Provider<AudioPlaybackSystem> provider3, Provider<ChangeVoiceSystem> provider4, Provider<DecodingAudioInitialStateSystem> provider5, Provider<DecodingAudioEventsHandlingSystem> provider6, Provider<ShowSextingRequestSystem> provider7, Provider<ImagesLockerSystem> provider8, Provider<DateSeparatorSystem> provider9, Provider<ExperienceMessageAnimationSystem> provider10, Provider<ChatClientInteractor> provider11, Provider<PresentationChatSystemsProvider> provider12) {
        return new PresentationChatSystemsDelegate_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static PresentationChatSystemsDelegate newInstance(LiveMessagesAnimationSystem liveMessagesAnimationSystem, ScrollControllingSystem scrollControllingSystem, AudioPlaybackSystem audioPlaybackSystem, ChangeVoiceSystem changeVoiceSystem, DecodingAudioInitialStateSystem decodingAudioInitialStateSystem, DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem, ShowSextingRequestSystem showSextingRequestSystem, ImagesLockerSystem imagesLockerSystem, DateSeparatorSystem dateSeparatorSystem, ExperienceMessageAnimationSystem experienceMessageAnimationSystem, ChatClientInteractor chatClientInteractor, PresentationChatSystemsProvider presentationChatSystemsProvider) {
        return new PresentationChatSystemsDelegate(liveMessagesAnimationSystem, scrollControllingSystem, audioPlaybackSystem, changeVoiceSystem, decodingAudioInitialStateSystem, decodingAudioEventsHandlingSystem, showSextingRequestSystem, imagesLockerSystem, dateSeparatorSystem, experienceMessageAnimationSystem, chatClientInteractor, presentationChatSystemsProvider);
    }
}
