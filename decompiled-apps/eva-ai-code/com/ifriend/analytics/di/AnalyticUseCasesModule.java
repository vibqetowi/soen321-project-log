package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickPlayUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickSubscribeButtonUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiCompletedUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiPauseUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiShowModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiStartPlayingUseCase;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.analytics.usecase.avatarAi.AnalyticsAvatarAiApplyUseCase;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.analytics.usecase.confirmEmail.AnalyticsCheckMyInboxClickedUseCase;
import com.ifriend.analytics.usecase.confirmEmail.AnalyticsEmailChangedUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationAppOpenedUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationPermissionChangedUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationReceivedUseCase;
import com.ifriend.analytics.usecase.photoAi.AnalyticsPhotoAiOpenUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsRateUsModalUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsReviewUsModalUseCase;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.domain.data.install.AppInstallStorage;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticUseCasesModule.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010!\u001a\u00020\"2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010'\u001a\u00020\u0006H\u0007J\u0012\u0010(\u001a\u00020)2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u001a\u0010*\u001a\u00020+2\u0006\u0010%\u001a\u00020&2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J$\u0010,\u001a\u00020-2\u0006\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010.\u001a\u00020/2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u00100\u001a\u0002012\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u00102\u001a\u0002032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u001c\u00104\u001a\u0002052\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007J.\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0007J\u001a\u0010:\u001a\u00020;2\u0006\u0010%\u001a\u00020&2\b\b\u0001\u0010<\u001a\u00020\u0006H\u0007¨\u0006="}, d2 = {"Lcom/ifriend/analytics/di/AnalyticUseCasesModule;", "", "()V", "provideAnalyticsAppOpenUpUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsAppOpenUseCase;", "firebaseAnalyticsSender", "Lcom/ifriend/analytics/AnalyticsSender;", "appsFlyerAnalyticsSender", "provideAnalyticsAudioAiClickPlayUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickPlayUseCase;", "annalsTrackerAnalyticsSender", "provideAnalyticsAudioAiClickSubscribeButtonUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickSubscribeButtonUseCase;", "provideAnalyticsAudioAiCompletedUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiCompletedUseCase;", "provideAnalyticsAudioAiConvertToTextMessageUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextMessageUseCase;", "provideAnalyticsAudioAiConvertToTextModalUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextModalUseCase;", "provideAnalyticsAudioAiPauseUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiPauseUseCase;", "provideAnalyticsAudioAiShowModalUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiShowModalUseCase;", "provideAnalyticsAudioAiStartPlayingUseCase", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiStartPlayingUseCase;", "provideAnalyticsAvatarAiApplyUseCase", "Lcom/ifriend/analytics/usecase/avatarAi/AnalyticsAvatarAiApplyUseCase;", "provideAnalyticsCheckMyInboxClickedUseCase", "Lcom/ifriend/analytics/usecase/confirmEmail/AnalyticsCheckMyInboxClickedUseCase;", "provideAnalyticsEditBotUseCase", "Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;", "provideAnalyticsEmailChangedUseCase", "Lcom/ifriend/analytics/usecase/confirmEmail/AnalyticsEmailChangedUseCase;", "provideAnalyticsFirstAppOpenUpUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsFirstAppOpenUseCase;", "provideAnalyticsNotificationAppOpenedUseCase", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationAppOpenedUseCase;", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "pushNotificationOpenedAnalyticsSender", "provideAnalyticsNotificationPermissionChangedUseCase", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationPermissionChangedUseCase;", "provideAnalyticsNotificationReceivedUseCase", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationReceivedUseCase;", "provideAnalyticsOpenSubscriptionScreenUseCase", "Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;", "provideAnalyticsPhotoAiOpenUseCase", "Lcom/ifriend/analytics/usecase/photoAi/AnalyticsPhotoAiOpenUseCase;", "provideAnalyticsRateUsModalUseCase", "Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;", "provideAnalyticsReviewUsModalUseCase", "Lcom/ifriend/analytics/usecase/rateUs/AnalyticsReviewUsModalUseCase;", "provideAnalyticsSetUserIdUseCase", "Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;", "provideAnalyticsSignUpUseCase", "Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender;", "appInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "provideChatScreenAnalyticsUseCase", "Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;", "tracker", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule {
    @Provides
    public final UserAuthorizedAnalyticsSender provideAnalyticsSignUpUseCase(AppInstallStorage appInstallStorage, @FirebaseAnalytics AnalyticsSender firebaseAnalyticsSender, @AppsFlyerAnalytics AnalyticsSender appsFlyerAnalyticsSender, @AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(appInstallStorage, "appInstallStorage");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSender, "firebaseAnalyticsSender");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsSender, "appsFlyerAnalyticsSender");
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new UserAuthorizedAnalyticsSender(appInstallStorage, firebaseAnalyticsSender, appsFlyerAnalyticsSender, annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsSetUserIdUseCase provideAnalyticsSetUserIdUseCase(@FirebaseAnalytics AnalyticsSender firebaseAnalyticsSender, @AppsFlyerAnalytics AnalyticsSender appsFlyerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSender, "firebaseAnalyticsSender");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsSender, "appsFlyerAnalyticsSender");
        return new AnalyticsSetUserIdUseCase(firebaseAnalyticsSender, appsFlyerAnalyticsSender);
    }

    @Provides
    public final AnalyticsFirstAppOpenUseCase provideAnalyticsFirstAppOpenUpUseCase(@FirebaseAnalytics AnalyticsSender firebaseAnalyticsSender) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSender, "firebaseAnalyticsSender");
        return new AnalyticsFirstAppOpenUseCase(firebaseAnalyticsSender);
    }

    @Provides
    public final AnalyticsAppOpenUseCase provideAnalyticsAppOpenUpUseCase(@FirebaseAnalytics AnalyticsSender firebaseAnalyticsSender, @AppsFlyerAnalytics AnalyticsSender appsFlyerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSender, "firebaseAnalyticsSender");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsSender, "appsFlyerAnalyticsSender");
        return new AnalyticsAppOpenUseCase(firebaseAnalyticsSender, appsFlyerAnalyticsSender);
    }

    @Provides
    public final AnalyticsOpenSubscriptionScreenUseCase provideAnalyticsOpenSubscriptionScreenUseCase(AppIdentityConverter appIdentityConverter, @FirebaseAnalytics AnalyticsSender firebaseAnalyticsSender, @AppsFlyerAnalytics AnalyticsSender appsFlyerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSender, "firebaseAnalyticsSender");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsSender, "appsFlyerAnalyticsSender");
        return new AnalyticsOpenSubscriptionScreenUseCase(appIdentityConverter, firebaseAnalyticsSender, appsFlyerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiClickConvertToTextMessageUseCase provideAnalyticsAudioAiConvertToTextMessageUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiClickConvertToTextMessageUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiClickConvertToTextModalUseCase provideAnalyticsAudioAiConvertToTextModalUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiClickConvertToTextModalUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiClickPlayUseCase provideAnalyticsAudioAiClickPlayUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiClickPlayUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiClickSubscribeButtonUseCase provideAnalyticsAudioAiClickSubscribeButtonUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiClickSubscribeButtonUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiCompletedUseCase provideAnalyticsAudioAiCompletedUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiCompletedUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiPauseUseCase provideAnalyticsAudioAiPauseUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiPauseUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiShowModalUseCase provideAnalyticsAudioAiShowModalUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiShowModalUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAudioAiStartPlayingUseCase provideAnalyticsAudioAiStartPlayingUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAudioAiStartPlayingUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsNotificationAppOpenedUseCase provideAnalyticsNotificationAppOpenedUseCase(AppIdentityConverter appIdentityConverter, @AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender, @PushNotificationOpenedAnalytics AnalyticsSender pushNotificationOpenedAnalyticsSender) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        Intrinsics.checkNotNullParameter(pushNotificationOpenedAnalyticsSender, "pushNotificationOpenedAnalyticsSender");
        return new AnalyticsNotificationAppOpenedUseCase(appIdentityConverter, annalsTrackerAnalyticsSender, pushNotificationOpenedAnalyticsSender);
    }

    @Provides
    public final AnalyticsNotificationPermissionChangedUseCase provideAnalyticsNotificationPermissionChangedUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsNotificationPermissionChangedUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsNotificationReceivedUseCase provideAnalyticsNotificationReceivedUseCase(AppIdentityConverter appIdentityConverter, @AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsNotificationReceivedUseCase(appIdentityConverter, annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsEditBotUseCase provideAnalyticsEditBotUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsEditBotUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsAvatarAiApplyUseCase provideAnalyticsAvatarAiApplyUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsAvatarAiApplyUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsPhotoAiOpenUseCase provideAnalyticsPhotoAiOpenUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsPhotoAiOpenUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsCheckMyInboxClickedUseCase provideAnalyticsCheckMyInboxClickedUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsCheckMyInboxClickedUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsEmailChangedUseCase provideAnalyticsEmailChangedUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsEmailChangedUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsRateUsModalUseCase provideAnalyticsRateUsModalUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsRateUsModalUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final AnalyticsReviewUsModalUseCase provideAnalyticsReviewUsModalUseCase(@AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AnalyticsReviewUsModalUseCase(annalsTrackerAnalyticsSender);
    }

    @Provides
    public final ChatScreenAnalyticsUseCase provideChatScreenAnalyticsUseCase(AppIdentityConverter appIdentityConverter, @AnnalsTrackerAnalytics AnalyticsSender tracker) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new ChatScreenAnalyticsUseCase(appIdentityConverter, tracker);
    }
}
