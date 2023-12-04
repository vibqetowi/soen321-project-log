package com.ifriend.chat.presentation.di;

import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickPlayUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiCompletedUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiPauseUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiStartPlayingUseCase;
import com.ifriend.base.di.Feature;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.chat.domain.billing.ShowRateAppAfterPurchaseUseCase;
import com.ifriend.chat.domain.chat.ShouldReloadMessagesUseCase;
import com.ifriend.chat.domain.chat.reset.ResetAiUseCase;
import com.ifriend.chat.domain.data.ChatProcess;
import com.ifriend.chat.domain.data.ResetAiApiDelegate;
import com.ifriend.chat.domain.firebase.ClearBadgesUseCase;
import com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase;
import com.ifriend.chat.domain.profile.user.DeleteUserUseCase;
import com.ifriend.chat.presentation.ui.chat.message.ChatAnalyticsImpl;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.ui.recyclerView.audio.ChatAnalytics;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatModule.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J2\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007J0\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007J(\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0007¨\u0006;"}, d2 = {"Lcom/ifriend/chat/presentation/di/ChatModule;", "", "()V", "provideChatAnalytics", "Lcom/ifriend/ui/recyclerView/audio/ChatAnalytics;", "audioPause", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiPauseUseCase;", "audioClickPlay", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickPlayUseCase;", "audioStartPlaying", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiStartPlayingUseCase;", "audioCompleted", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiCompletedUseCase;", "audioClickConvertToTextModal", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextModalUseCase;", "audioClickConvertToTextMessage", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextMessageUseCase;", "provideClearBadgesUseCase", "Lcom/ifriend/chat/domain/firebase/ClearBadgesUseCase;", "firebaseApiRepository", "Lcom/ifriend/domain/data/networking/FirebaseApiRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "provideDeleteUserUseCase", "Lcom/ifriend/chat/domain/profile/user/DeleteUserUseCase;", "chatProcess", "Lcom/ifriend/chat/domain/data/ChatProcess;", "provideFirebaseSubscribeUseCase", "Lcom/ifriend/chat/domain/firebase/FirebaseSubscribeUseCase;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "provideResetAiUseCase", "Lcom/ifriend/chat/domain/chat/reset/ResetAiUseCase;", "resetDelegate", "Lcom/ifriend/chat/domain/data/ResetAiApiDelegate;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "provideShouldReloadMessagesUseCase", "Lcom/ifriend/chat/domain/chat/ShouldReloadMessagesUseCase;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "provideShowRateAppAfterPurchaseUseCase", "Lcom/ifriend/chat/domain/billing/ShowRateAppAfterPurchaseUseCase;", KeychainModule.Maps.STORAGE, "Lcom/ifriend/domain/rateUs/RateUsStateStorage;", "rateAndReviewUsToggle", "Lcom/ifriend/data/toggle/RateAndReviewUsToggle;", "billingPurchasesHistory", "Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;", "rateAppShowingPlanner", "Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ChatModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final DeleteUserUseCase provideDeleteUserUseCase(UserRepository userRepository, ChatProcess chatProcess) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatProcess, "chatProcess");
        return new DeleteUserUseCase(userRepository, chatProcess);
    }

    @Provides
    @Feature
    public final ShowRateAppAfterPurchaseUseCase provideShowRateAppAfterPurchaseUseCase(RateUsStateStorage storage, RateAndReviewUsToggle rateAndReviewUsToggle, BillingPurchasesHistory billingPurchasesHistory, RateAppShowingPlanner rateAppShowingPlanner) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(rateAndReviewUsToggle, "rateAndReviewUsToggle");
        Intrinsics.checkNotNullParameter(billingPurchasesHistory, "billingPurchasesHistory");
        Intrinsics.checkNotNullParameter(rateAppShowingPlanner, "rateAppShowingPlanner");
        return new ShowRateAppAfterPurchaseUseCase(storage, rateAndReviewUsToggle, rateAppShowingPlanner, billingPurchasesHistory);
    }

    @Provides
    @Feature
    public final FirebaseSubscribeUseCase provideFirebaseSubscribeUseCase(FirebaseApiRepository firebaseApiRepository, @UserSessionSharedPreferences Preferences preferences, UserRepository userRepository, AppConfigUseCase appConfigUseCase, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(firebaseApiRepository, "firebaseApiRepository");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new FirebaseSubscribeUseCase(preferences, firebaseApiRepository, userRepository, appConfigUseCase, coroutineScope);
    }

    @Provides
    @Feature
    public final ClearBadgesUseCase provideClearBadgesUseCase(FirebaseApiRepository firebaseApiRepository, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(firebaseApiRepository, "firebaseApiRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new ClearBadgesUseCase(firebaseApiRepository, userRepository);
    }

    @Provides
    @Feature
    public final ShouldReloadMessagesUseCase provideShouldReloadMessagesUseCase(MessagesSource messagesSource) {
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        return new ShouldReloadMessagesUseCase(messagesSource);
    }

    @Provides
    @Feature
    public final ChatAnalytics provideChatAnalytics(AnalyticsAudioAiPauseUseCase audioPause, AnalyticsAudioAiClickPlayUseCase audioClickPlay, AnalyticsAudioAiStartPlayingUseCase audioStartPlaying, AnalyticsAudioAiCompletedUseCase audioCompleted, AnalyticsAudioAiClickConvertToTextModalUseCase audioClickConvertToTextModal, AnalyticsAudioAiClickConvertToTextMessageUseCase audioClickConvertToTextMessage) {
        Intrinsics.checkNotNullParameter(audioPause, "audioPause");
        Intrinsics.checkNotNullParameter(audioClickPlay, "audioClickPlay");
        Intrinsics.checkNotNullParameter(audioStartPlaying, "audioStartPlaying");
        Intrinsics.checkNotNullParameter(audioCompleted, "audioCompleted");
        Intrinsics.checkNotNullParameter(audioClickConvertToTextModal, "audioClickConvertToTextModal");
        Intrinsics.checkNotNullParameter(audioClickConvertToTextMessage, "audioClickConvertToTextMessage");
        return new ChatAnalyticsImpl(audioPause, audioClickPlay, audioStartPlaying, audioCompleted, audioClickConvertToTextModal, audioClickConvertToTextMessage);
    }

    @Provides
    @Feature
    public final ResetAiUseCase provideResetAiUseCase(ResetAiApiDelegate resetDelegate, UserRepository userRepository, BotRepository botRepository, ChatClientInteractor chatClientInteractor, InternalNotificationHandler internalNotificationHandler) {
        Intrinsics.checkNotNullParameter(resetDelegate, "resetDelegate");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        return new ResetAiUseCase(resetDelegate, userRepository, botRepository, chatClientInteractor, internalNotificationHandler);
    }
}
