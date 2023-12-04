package com.ifriend.app;

import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationReceivedUseCase;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.data.toggle.AvatarInPushToggle;
import com.ifriend.data.toggle.AvatarInRetentionPushToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.notifications.LongTermNotificationByTypeOfPushHandler;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AppFirebaseMessagingService_MembersInjector implements MembersInjector<AppFirebaseMessagingService> {
    private final Provider<AnalyticsNotificationReceivedUseCase> analyticsNotificationReceivedUseCaseProvider;
    private final Provider<AvatarInPushToggle> avatarInPushToggleProvider;
    private final Provider<AvatarInRetentionPushToggle> avatarInRetentionPushToggleProvider;
    private final Provider<AvatarsStorage> avatarsStorageProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<LongTermNotificationByTypeOfPushHandler> longTermNotificationHandlerProvider;
    private final Provider<Preferences> preferencesProvider;

    public AppFirebaseMessagingService_MembersInjector(Provider<AnalyticsNotificationReceivedUseCase> provider, Provider<Preferences> provider2, Provider<LongTermNotificationByTypeOfPushHandler> provider3, Provider<CoroutineScope> provider4, Provider<AvatarsStorage> provider5, Provider<CoroutineDispatchers> provider6, Provider<AvatarInPushToggle> provider7, Provider<AvatarInRetentionPushToggle> provider8, Provider<ChatsInfoConfigurationRepository> provider9) {
        this.analyticsNotificationReceivedUseCaseProvider = provider;
        this.preferencesProvider = provider2;
        this.longTermNotificationHandlerProvider = provider3;
        this.coroutineScopeProvider = provider4;
        this.avatarsStorageProvider = provider5;
        this.coroutineDispatchersProvider = provider6;
        this.avatarInPushToggleProvider = provider7;
        this.avatarInRetentionPushToggleProvider = provider8;
        this.chatsInfoConfigurationRepositoryProvider = provider9;
    }

    public static MembersInjector<AppFirebaseMessagingService> create(Provider<AnalyticsNotificationReceivedUseCase> provider, Provider<Preferences> provider2, Provider<LongTermNotificationByTypeOfPushHandler> provider3, Provider<CoroutineScope> provider4, Provider<AvatarsStorage> provider5, Provider<CoroutineDispatchers> provider6, Provider<AvatarInPushToggle> provider7, Provider<AvatarInRetentionPushToggle> provider8, Provider<ChatsInfoConfigurationRepository> provider9) {
        return new AppFirebaseMessagingService_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AppFirebaseMessagingService appFirebaseMessagingService) {
        injectAnalyticsNotificationReceivedUseCase(appFirebaseMessagingService, this.analyticsNotificationReceivedUseCaseProvider.get());
        injectPreferences(appFirebaseMessagingService, this.preferencesProvider.get());
        injectLongTermNotificationHandler(appFirebaseMessagingService, this.longTermNotificationHandlerProvider.get());
        injectCoroutineScope(appFirebaseMessagingService, this.coroutineScopeProvider.get());
        injectAvatarsStorage(appFirebaseMessagingService, this.avatarsStorageProvider.get());
        injectCoroutineDispatchers(appFirebaseMessagingService, this.coroutineDispatchersProvider.get());
        injectAvatarInPushToggle(appFirebaseMessagingService, this.avatarInPushToggleProvider.get());
        injectAvatarInRetentionPushToggle(appFirebaseMessagingService, this.avatarInRetentionPushToggleProvider.get());
        injectChatsInfoConfigurationRepository(appFirebaseMessagingService, this.chatsInfoConfigurationRepositoryProvider.get());
    }

    public static void injectAnalyticsNotificationReceivedUseCase(AppFirebaseMessagingService appFirebaseMessagingService, AnalyticsNotificationReceivedUseCase analyticsNotificationReceivedUseCase) {
        appFirebaseMessagingService.analyticsNotificationReceivedUseCase = analyticsNotificationReceivedUseCase;
    }

    @UserSessionSharedPreferences
    public static void injectPreferences(AppFirebaseMessagingService appFirebaseMessagingService, Preferences preferences) {
        appFirebaseMessagingService.preferences = preferences;
    }

    public static void injectLongTermNotificationHandler(AppFirebaseMessagingService appFirebaseMessagingService, LongTermNotificationByTypeOfPushHandler longTermNotificationByTypeOfPushHandler) {
        appFirebaseMessagingService.longTermNotificationHandler = longTermNotificationByTypeOfPushHandler;
    }

    public static void injectCoroutineScope(AppFirebaseMessagingService appFirebaseMessagingService, CoroutineScope coroutineScope) {
        appFirebaseMessagingService.coroutineScope = coroutineScope;
    }

    public static void injectAvatarsStorage(AppFirebaseMessagingService appFirebaseMessagingService, AvatarsStorage avatarsStorage) {
        appFirebaseMessagingService.avatarsStorage = avatarsStorage;
    }

    public static void injectCoroutineDispatchers(AppFirebaseMessagingService appFirebaseMessagingService, CoroutineDispatchers coroutineDispatchers) {
        appFirebaseMessagingService.coroutineDispatchers = coroutineDispatchers;
    }

    public static void injectAvatarInPushToggle(AppFirebaseMessagingService appFirebaseMessagingService, AvatarInPushToggle avatarInPushToggle) {
        appFirebaseMessagingService.avatarInPushToggle = avatarInPushToggle;
    }

    public static void injectAvatarInRetentionPushToggle(AppFirebaseMessagingService appFirebaseMessagingService, AvatarInRetentionPushToggle avatarInRetentionPushToggle) {
        appFirebaseMessagingService.avatarInRetentionPushToggle = avatarInRetentionPushToggle;
    }

    public static void injectChatsInfoConfigurationRepository(AppFirebaseMessagingService appFirebaseMessagingService, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository) {
        appFirebaseMessagingService.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
    }
}
