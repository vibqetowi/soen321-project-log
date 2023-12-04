package com.ifriend.presentation.features.chat.intro.analytics;

import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatIntroAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatIntroAnalyticsInteractor$tracker$2 extends Lambda implements Function0<AnnalsTrackerAnalyticsSender> {
    public static final ChatIntroAnalyticsInteractor$tracker$2 INSTANCE = new ChatIntroAnalyticsInteractor$tracker$2();

    ChatIntroAnalyticsInteractor$tracker$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AnnalsTrackerAnalyticsSender invoke() {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        AnalyticsSender[] analyticsSenders = AnalyticsEngine.Companion.getInstance().getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 != null) {
            return annalsTrackerAnalyticsSender2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
