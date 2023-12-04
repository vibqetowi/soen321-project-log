package com.ifriend.presentation.features.chat.gifts.analytics;

import com.ifriend.analytics.api.events.AnnalsAnalyticsEvent;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatGiftAnalytics.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/features/chat/gifts/analytics/ChatGiftAnalytics;", "", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "trackGiftButtonClick", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftAnalytics {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;

    @Inject
    public ChatGiftAnalytics(AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.analyticsInteractor = analyticsInteractor;
    }

    public final void trackGiftButtonClick() {
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("ai-click-gift-btn", null, 2, null));
    }
}
