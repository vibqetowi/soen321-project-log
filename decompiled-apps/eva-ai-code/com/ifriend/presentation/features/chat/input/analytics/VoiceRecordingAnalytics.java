package com.ifriend.presentation.features.chat.input.analytics;

import com.ifriend.analytics.CommonAnalyticsKeys;
import com.ifriend.analytics.api.events.AnnalsAnalyticsEvent;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.AppIdentityConverter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VoiceRecordingAnalytics.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/chat/input/analytics/VoiceRecordingAnalytics;", "", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "(Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/core/tools/api/AppIdentityConverter;)V", "trackUserAllowRecording", "", "chatId", "", "trackUserCancelRecording", "trackUserClickRecordMessage", "trackUserDeleteRecording", "trackUserSendRecording", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VoiceRecordingAnalytics {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;
    private final AppIdentityConverter appIdentityConverter;

    @Inject
    public VoiceRecordingAnalytics(AnalyticsInteractor analyticsInteractor, AppIdentityConverter appIdentityConverter) {
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        this.analyticsInteractor = analyticsInteractor;
        this.appIdentityConverter = appIdentityConverter;
    }

    public final void trackUserClickRecordMessage(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("tap-voice-msg", MapsKt.mapOf(TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)))));
    }

    public final void trackUserAllowRecording(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("allow-record-audio", MapsKt.mapOf(TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)))));
    }

    public final void trackUserCancelRecording(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("tap-voice-cancel", MapsKt.mapOf(TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)))));
    }

    public final void trackUserDeleteRecording(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("tap-voice-delete", MapsKt.mapOf(TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)))));
    }

    public final void trackUserSendRecording(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("tap-voice-send", MapsKt.mapOf(TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)))));
    }
}
