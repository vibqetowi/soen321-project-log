package com.ifriend.chat.presentation.ui.infoOnboarding.analytics;

import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InfoOnboardingAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingAnalyticsImpl$tracker$2 extends Lambda implements Function0<AnnalsTrackerAnalyticsSender> {
    final /* synthetic */ InfoOnboardingAnalyticsImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingAnalyticsImpl$tracker$2(InfoOnboardingAnalyticsImpl infoOnboardingAnalyticsImpl) {
        super(0);
        this.this$0 = infoOnboardingAnalyticsImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AnnalsTrackerAnalyticsSender invoke() {
        AnalyticsEngine analyticsEngine;
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        analyticsEngine = this.this$0.analytics;
        AnalyticsSender[] analyticsSenders = analyticsEngine.getAnalyticsSenders();
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
        Intrinsics.checkNotNull(annalsTrackerAnalyticsSender2);
        return annalsTrackerAnalyticsSender2;
    }
}
