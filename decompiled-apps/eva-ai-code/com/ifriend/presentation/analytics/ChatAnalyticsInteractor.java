package com.ifriend.presentation.analytics;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.core.tools.api.AppIdentityConverter;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/analytics/ChatAnalyticsInteractor;", "", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "(Lcom/ifriend/core/tools/api/AppIdentityConverter;)V", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "getTracker", "()Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "tracker$delegate", "Lkotlin/Lazy;", "trackBuySubscriptionClick", "", "chatId", "", "chatName", "trackShowSubscriptionPopup", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatAnalyticsInteractor {
    public static final int $stable = 8;
    private final AppIdentityConverter appIdentityConverter;
    private final Lazy tracker$delegate;

    @Inject
    public ChatAnalyticsInteractor(AppIdentityConverter appIdentityConverter) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        this.appIdentityConverter = appIdentityConverter;
        this.tracker$delegate = LazyKt.lazy(ChatAnalyticsInteractor$tracker$2.INSTANCE);
    }

    private final AnnalsTrackerAnalyticsSender getTracker() {
        return (AnnalsTrackerAnalyticsSender) this.tracker$delegate.getValue();
    }

    public final void trackShowSubscriptionPopup(String chatId, String chatName) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        getTracker().sendEvent("begin-checkout-digital-copy-chat-ai", MapsKt.mapOf(TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)), TuplesKt.to(CommonAnalyticsKeys.BOT_NAME.getValue(), chatName), AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    public final void trackBuySubscriptionClick(String chatId, String chatName) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        getTracker().sendEvent("click-activate-access-btn-paywall-digital-copy-ai", MapsKt.mapOf(TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)), TuplesKt.to(CommonAnalyticsKeys.BOT_NAME.getValue(), chatName), AnalyticsConstants.INSTANCE.getTimestamp()));
    }
}
