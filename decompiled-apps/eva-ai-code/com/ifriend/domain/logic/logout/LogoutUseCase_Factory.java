package com.ifriend.domain.logic.logout;

import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.internal_notifications.handler.InternalNotificationsQueue;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LogoutUseCase_Factory implements Factory<LogoutUseCase> {
    private final Provider<AuthDataStorage> authDataStorageProvider;
    private final Provider<AvatarsStorage> avatarsStorageProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<ChatGiftsRepository> chatGiftsRepositoryProvider;
    private final Provider<ChatSubscriptionRepository> chatSubscriptionRepositoryProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<DiaryRepository> diaryRepositoryProvider;
    private final Provider<FirebaseApiRepository> firebaseApiRepositoryProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final Provider<InternalNotificationsQueue> internalNotificationsQueueProvider;
    private final Provider<LevelsRepository> levelsRepositoryProvider;
    private final Provider<LongTermNotificationManager> longTermNotificationProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<OnboardingChatConfigsMemoryCachedSource> onboardingChatConfigsMemoryCachedSourceProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;
    private final Provider<UserTokenStorage> userTokenStorageProvider;

    public LogoutUseCase_Factory(Provider<UserRepository> provider, Provider<BotRepository> provider2, Provider<AuthDataStorage> provider3, Provider<UserTokenStorage> provider4, Provider<MessagesSource> provider5, Provider<AvatarsStorage> provider6, Provider<LongTermNotificationManager> provider7, Provider<InternalNotificationsQueue> provider8, Provider<GenerateBotAvatarRepository> provider9, Provider<DiaryRepository> provider10, Provider<LevelsRepository> provider11, Provider<ChatGiftsRepository> provider12, Provider<ChatConfigsMemoryCachedSource> provider13, Provider<ChatsInfoRepository> provider14, Provider<ChatsInfoConfigurationRepository> provider15, Provider<UserProfileRepository> provider16, Provider<OnboardingChatConfigsMemoryCachedSource> provider17, Provider<FirebaseApiRepository> provider18, Provider<ChatSubscriptionRepository> provider19) {
        this.userRepositoryProvider = provider;
        this.botRepositoryProvider = provider2;
        this.authDataStorageProvider = provider3;
        this.userTokenStorageProvider = provider4;
        this.messagesSourceProvider = provider5;
        this.avatarsStorageProvider = provider6;
        this.longTermNotificationProvider = provider7;
        this.internalNotificationsQueueProvider = provider8;
        this.generateBotAvatarRepositoryProvider = provider9;
        this.diaryRepositoryProvider = provider10;
        this.levelsRepositoryProvider = provider11;
        this.chatGiftsRepositoryProvider = provider12;
        this.chatConfigsMemoryCachedSourceProvider = provider13;
        this.chatsInfoRepositoryProvider = provider14;
        this.chatsInfoConfigurationRepositoryProvider = provider15;
        this.userProfileRepositoryProvider = provider16;
        this.onboardingChatConfigsMemoryCachedSourceProvider = provider17;
        this.firebaseApiRepositoryProvider = provider18;
        this.chatSubscriptionRepositoryProvider = provider19;
    }

    @Override // javax.inject.Provider
    public LogoutUseCase get() {
        return newInstance(this.userRepositoryProvider.get(), this.botRepositoryProvider.get(), this.authDataStorageProvider.get(), this.userTokenStorageProvider.get(), this.messagesSourceProvider.get(), this.avatarsStorageProvider.get(), this.longTermNotificationProvider.get(), this.internalNotificationsQueueProvider.get(), this.generateBotAvatarRepositoryProvider.get(), this.diaryRepositoryProvider.get(), this.levelsRepositoryProvider.get(), this.chatGiftsRepositoryProvider.get(), this.chatConfigsMemoryCachedSourceProvider.get(), this.chatsInfoRepositoryProvider.get(), this.chatsInfoConfigurationRepositoryProvider.get(), this.userProfileRepositoryProvider.get(), this.onboardingChatConfigsMemoryCachedSourceProvider.get(), this.firebaseApiRepositoryProvider.get(), this.chatSubscriptionRepositoryProvider.get());
    }

    public static LogoutUseCase_Factory create(Provider<UserRepository> provider, Provider<BotRepository> provider2, Provider<AuthDataStorage> provider3, Provider<UserTokenStorage> provider4, Provider<MessagesSource> provider5, Provider<AvatarsStorage> provider6, Provider<LongTermNotificationManager> provider7, Provider<InternalNotificationsQueue> provider8, Provider<GenerateBotAvatarRepository> provider9, Provider<DiaryRepository> provider10, Provider<LevelsRepository> provider11, Provider<ChatGiftsRepository> provider12, Provider<ChatConfigsMemoryCachedSource> provider13, Provider<ChatsInfoRepository> provider14, Provider<ChatsInfoConfigurationRepository> provider15, Provider<UserProfileRepository> provider16, Provider<OnboardingChatConfigsMemoryCachedSource> provider17, Provider<FirebaseApiRepository> provider18, Provider<ChatSubscriptionRepository> provider19) {
        return new LogoutUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static LogoutUseCase newInstance(UserRepository userRepository, BotRepository botRepository, AuthDataStorage authDataStorage, UserTokenStorage userTokenStorage, MessagesSource messagesSource, AvatarsStorage avatarsStorage, LongTermNotificationManager longTermNotificationManager, InternalNotificationsQueue internalNotificationsQueue, GenerateBotAvatarRepository generateBotAvatarRepository, DiaryRepository diaryRepository, LevelsRepository levelsRepository, ChatGiftsRepository chatGiftsRepository, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, ChatsInfoRepository chatsInfoRepository, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, UserProfileRepository userProfileRepository, OnboardingChatConfigsMemoryCachedSource onboardingChatConfigsMemoryCachedSource, FirebaseApiRepository firebaseApiRepository, ChatSubscriptionRepository chatSubscriptionRepository) {
        return new LogoutUseCase(userRepository, botRepository, authDataStorage, userTokenStorage, messagesSource, avatarsStorage, longTermNotificationManager, internalNotificationsQueue, generateBotAvatarRepository, diaryRepository, levelsRepository, chatGiftsRepository, chatConfigsMemoryCachedSource, chatsInfoRepository, chatsInfoConfigurationRepository, userProfileRepository, onboardingChatConfigsMemoryCachedSource, firebaseApiRepository, chatSubscriptionRepository);
    }
}
