package com.ifriend.chat.presentation.ui.chat.presentation.chat.viewmodel;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationPermissionChangedUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsRateUsModalUseCase;
import com.ifriend.chat.domain.firebase.ClearBadgesUseCase;
import com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl;
import com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate;
import com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegateImpl;
import com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl;
import com.ifriend.presentation.features.chat.input.analytics.VoiceRecordingAnalytics;
import com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl;
import com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl;
import com.ifriend.presentation.features.chat.message.ChatMessageDelegate;
import com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl;
import com.ifriend.presentation.features.chat.offers.ChatSubscriptionOfferDelegateImpl;
import com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl;
import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate;
import com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl;
import com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegateImpl;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl;
import com.ifriend.ui.base.modalMessage.RateAppPopupDelegate;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatRootViewModelFactory_Factory implements Factory<ChatRootViewModelFactory> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<AnalyticsNotificationPermissionChangedUseCase> analyticsNotificationPermissionChangedUseCaseProvider;
    private final Provider<AnalyticsRateUsModalUseCase> analyticsRateUsUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatPaidActionsDelegateImpl> chatActionsDelegateProvider;
    private final Provider<ChatBackgroundDelegateImpl> chatBackgroundDelegateProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatConfigurationDelegate.Factory> chatConfigurationDelegateProvider;
    private final Provider<FlowObserver<ChatEvents>> chatEventsFlowProvider;
    private final Provider<ChatGiftsDelegateImpl> chatGiftsDelegateProvider;
    private final Provider<ChatHandleDeepLinksDelegateImpl> chatHandleDeepLinksDelegateProvider;
    private final Provider<ChatHeaderDelegateImpl> chatHeaderDelegateProvider;
    private final Provider<ChatInputDelegateImpl> chatInputDelegateProvider;
    private final Provider<ChatIntroDelegateImpl> chatIntroDelegateProvider;
    private final Provider<ChatMessageDelegate.Factory> chatMessageDelegateProvider;
    private final Provider<ChatNotificationsDelegateImpl> chatNotificationsDelegateProvider;
    private final Provider<ChatProfileActionDelegateImpl> chatProfileActionDelegateProvider;
    private final Provider<ChatScreenAnalyticsUseCase> chatScreenAnalyticsUseCaseProvider;
    private final Provider<ChatSubscriptionOfferDelegateImpl> chatSubscriptionOfferDelegateProvider;
    private final Provider<ChatPanelActionsDelegateImpl> chatTopicActionsDelegateProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<ClearBadgesUseCase> clearBadgesUseCaseProvider;
    private final Provider<DispatcherProvider> dispatchersProvider;
    private final Provider<FirebaseSubscribeUseCase> firebaseSubscribeUseCaseProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<OnUserRatedAppUseCase> onUserRateUsUseCaseProvider;
    private final Provider<ChatPhotoDelegate.Factory> photoDelegateProvider;
    private final Provider<Preferences> preferencesProvider;
    private final Provider<ProfileMenuDelegateImpl> profileMenuDelegateProvider;
    private final Provider<RateAppPopupDelegate> rateAppPopupDelegateProvider;
    private final Provider<SendConfirmationEmailUseCase> sendConfirmationEmailUseCaseProvider;
    private final Provider<SextingMessagePaywallShowingDelegateImpl> sextingMessagePaywallShowingDelegateProvider;
    private final Provider<VoiceRecordingAnalytics> voiceRecordingAnalyticsProvider;

    public ChatRootViewModelFactory_Factory(Provider<ChatGiftsDelegateImpl> provider, Provider<ChatHandleDeepLinksDelegateImpl> provider2, Provider<ChatsInfoInteractor> provider3, Provider<OnUserRatedAppUseCase> provider4, Provider<FirebaseSubscribeUseCase> provider5, Provider<ClearBadgesUseCase> provider6, Provider<Preferences> provider7, Provider<AnalyticsNotificationPermissionChangedUseCase> provider8, Provider<SendConfirmationEmailUseCase> provider9, Provider<RateAppPopupDelegate> provider10, Provider<AnalyticsRateUsModalUseCase> provider11, Provider<Logger> provider12, Provider<ChatNotificationsDelegateImpl> provider13, Provider<AppEventsEmitter> provider14, Provider<ProfileMenuDelegateImpl> provider15, Provider<ChatBackgroundDelegateImpl> provider16, Provider<ChatHeaderDelegateImpl> provider17, Provider<ChatScreenAnalyticsUseCase> provider18, Provider<ChatPhotoDelegate.Factory> provider19, Provider<FlowObserver<ChatEvents>> provider20, Provider<ChatPaidActionsDelegateImpl> provider21, Provider<ChatProfileActionDelegateImpl> provider22, Provider<ChatIntroDelegateImpl> provider23, Provider<ChatPanelActionsDelegateImpl> provider24, Provider<SextingMessagePaywallShowingDelegateImpl> provider25, Provider<ChatInputDelegateImpl> provider26, Provider<VoiceRecordingAnalytics> provider27, Provider<ChatClientInteractor> provider28, Provider<DispatcherProvider> provider29, Provider<AnalyticsInteractor> provider30, Provider<ChatConfigurationDelegate.Factory> provider31, Provider<ChatSubscriptionOfferDelegateImpl> provider32, Provider<ChatMessageDelegate.Factory> provider33) {
        this.chatGiftsDelegateProvider = provider;
        this.chatHandleDeepLinksDelegateProvider = provider2;
        this.chatsInfoInteractorProvider = provider3;
        this.onUserRateUsUseCaseProvider = provider4;
        this.firebaseSubscribeUseCaseProvider = provider5;
        this.clearBadgesUseCaseProvider = provider6;
        this.preferencesProvider = provider7;
        this.analyticsNotificationPermissionChangedUseCaseProvider = provider8;
        this.sendConfirmationEmailUseCaseProvider = provider9;
        this.rateAppPopupDelegateProvider = provider10;
        this.analyticsRateUsUseCaseProvider = provider11;
        this.loggerProvider = provider12;
        this.chatNotificationsDelegateProvider = provider13;
        this.appEventsEmitterProvider = provider14;
        this.profileMenuDelegateProvider = provider15;
        this.chatBackgroundDelegateProvider = provider16;
        this.chatHeaderDelegateProvider = provider17;
        this.chatScreenAnalyticsUseCaseProvider = provider18;
        this.photoDelegateProvider = provider19;
        this.chatEventsFlowProvider = provider20;
        this.chatActionsDelegateProvider = provider21;
        this.chatProfileActionDelegateProvider = provider22;
        this.chatIntroDelegateProvider = provider23;
        this.chatTopicActionsDelegateProvider = provider24;
        this.sextingMessagePaywallShowingDelegateProvider = provider25;
        this.chatInputDelegateProvider = provider26;
        this.voiceRecordingAnalyticsProvider = provider27;
        this.chatClientInteractorProvider = provider28;
        this.dispatchersProvider = provider29;
        this.analyticsInteractorProvider = provider30;
        this.chatConfigurationDelegateProvider = provider31;
        this.chatSubscriptionOfferDelegateProvider = provider32;
        this.chatMessageDelegateProvider = provider33;
    }

    @Override // javax.inject.Provider
    public ChatRootViewModelFactory get() {
        return newInstance(this.chatGiftsDelegateProvider.get(), this.chatHandleDeepLinksDelegateProvider.get(), this.chatsInfoInteractorProvider.get(), this.onUserRateUsUseCaseProvider.get(), this.firebaseSubscribeUseCaseProvider.get(), this.clearBadgesUseCaseProvider.get(), this.preferencesProvider.get(), this.analyticsNotificationPermissionChangedUseCaseProvider.get(), this.sendConfirmationEmailUseCaseProvider.get(), this.rateAppPopupDelegateProvider.get(), this.analyticsRateUsUseCaseProvider.get(), this.loggerProvider.get(), this.chatNotificationsDelegateProvider.get(), this.appEventsEmitterProvider.get(), this.profileMenuDelegateProvider.get(), this.chatBackgroundDelegateProvider.get(), this.chatHeaderDelegateProvider.get(), this.chatScreenAnalyticsUseCaseProvider.get(), this.photoDelegateProvider.get(), this.chatEventsFlowProvider.get(), this.chatActionsDelegateProvider.get(), this.chatProfileActionDelegateProvider.get(), this.chatIntroDelegateProvider.get(), this.chatTopicActionsDelegateProvider.get(), this.sextingMessagePaywallShowingDelegateProvider.get(), this.chatInputDelegateProvider.get(), this.voiceRecordingAnalyticsProvider.get(), this.chatClientInteractorProvider.get(), this.dispatchersProvider.get(), this.analyticsInteractorProvider.get(), this.chatConfigurationDelegateProvider.get(), this.chatSubscriptionOfferDelegateProvider.get(), this.chatMessageDelegateProvider.get());
    }

    public static ChatRootViewModelFactory_Factory create(Provider<ChatGiftsDelegateImpl> provider, Provider<ChatHandleDeepLinksDelegateImpl> provider2, Provider<ChatsInfoInteractor> provider3, Provider<OnUserRatedAppUseCase> provider4, Provider<FirebaseSubscribeUseCase> provider5, Provider<ClearBadgesUseCase> provider6, Provider<Preferences> provider7, Provider<AnalyticsNotificationPermissionChangedUseCase> provider8, Provider<SendConfirmationEmailUseCase> provider9, Provider<RateAppPopupDelegate> provider10, Provider<AnalyticsRateUsModalUseCase> provider11, Provider<Logger> provider12, Provider<ChatNotificationsDelegateImpl> provider13, Provider<AppEventsEmitter> provider14, Provider<ProfileMenuDelegateImpl> provider15, Provider<ChatBackgroundDelegateImpl> provider16, Provider<ChatHeaderDelegateImpl> provider17, Provider<ChatScreenAnalyticsUseCase> provider18, Provider<ChatPhotoDelegate.Factory> provider19, Provider<FlowObserver<ChatEvents>> provider20, Provider<ChatPaidActionsDelegateImpl> provider21, Provider<ChatProfileActionDelegateImpl> provider22, Provider<ChatIntroDelegateImpl> provider23, Provider<ChatPanelActionsDelegateImpl> provider24, Provider<SextingMessagePaywallShowingDelegateImpl> provider25, Provider<ChatInputDelegateImpl> provider26, Provider<VoiceRecordingAnalytics> provider27, Provider<ChatClientInteractor> provider28, Provider<DispatcherProvider> provider29, Provider<AnalyticsInteractor> provider30, Provider<ChatConfigurationDelegate.Factory> provider31, Provider<ChatSubscriptionOfferDelegateImpl> provider32, Provider<ChatMessageDelegate.Factory> provider33) {
        return new ChatRootViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33);
    }

    public static ChatRootViewModelFactory newInstance(ChatGiftsDelegateImpl chatGiftsDelegateImpl, ChatHandleDeepLinksDelegateImpl chatHandleDeepLinksDelegateImpl, ChatsInfoInteractor chatsInfoInteractor, OnUserRatedAppUseCase onUserRatedAppUseCase, FirebaseSubscribeUseCase firebaseSubscribeUseCase, ClearBadgesUseCase clearBadgesUseCase, Preferences preferences, AnalyticsNotificationPermissionChangedUseCase analyticsNotificationPermissionChangedUseCase, SendConfirmationEmailUseCase sendConfirmationEmailUseCase, RateAppPopupDelegate rateAppPopupDelegate, AnalyticsRateUsModalUseCase analyticsRateUsModalUseCase, Logger logger, ChatNotificationsDelegateImpl chatNotificationsDelegateImpl, AppEventsEmitter appEventsEmitter, ProfileMenuDelegateImpl profileMenuDelegateImpl, ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, ChatHeaderDelegateImpl chatHeaderDelegateImpl, ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase, ChatPhotoDelegate.Factory factory, FlowObserver<ChatEvents> flowObserver, ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl, ChatProfileActionDelegateImpl chatProfileActionDelegateImpl, ChatIntroDelegateImpl chatIntroDelegateImpl, ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl, ChatInputDelegateImpl chatInputDelegateImpl, VoiceRecordingAnalytics voiceRecordingAnalytics, ChatClientInteractor chatClientInteractor, DispatcherProvider dispatcherProvider, AnalyticsInteractor analyticsInteractor, ChatConfigurationDelegate.Factory factory2, ChatSubscriptionOfferDelegateImpl chatSubscriptionOfferDelegateImpl, ChatMessageDelegate.Factory factory3) {
        return new ChatRootViewModelFactory(chatGiftsDelegateImpl, chatHandleDeepLinksDelegateImpl, chatsInfoInteractor, onUserRatedAppUseCase, firebaseSubscribeUseCase, clearBadgesUseCase, preferences, analyticsNotificationPermissionChangedUseCase, sendConfirmationEmailUseCase, rateAppPopupDelegate, analyticsRateUsModalUseCase, logger, chatNotificationsDelegateImpl, appEventsEmitter, profileMenuDelegateImpl, chatBackgroundDelegateImpl, chatHeaderDelegateImpl, chatScreenAnalyticsUseCase, factory, flowObserver, chatPaidActionsDelegateImpl, chatProfileActionDelegateImpl, chatIntroDelegateImpl, chatPanelActionsDelegateImpl, sextingMessagePaywallShowingDelegateImpl, chatInputDelegateImpl, voiceRecordingAnalytics, chatClientInteractor, dispatcherProvider, analyticsInteractor, factory2, chatSubscriptionOfferDelegateImpl, factory3);
    }
}
