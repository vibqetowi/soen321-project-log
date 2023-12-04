package com.ifriend.analytics;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsEndgin.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ifriend/analytics/AnalyticsEngine;", "", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "([Lcom/ifriend/analytics/AnalyticsSender;)V", "getAnalyticsSenders", "()[Lcom/ifriend/analytics/AnalyticsSender;", "[Lcom/ifriend/analytics/AnalyticsSender;", "Companion", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsEngine {
    public static final Companion Companion = new Companion(null);
    public static AnalyticsEngine instance;
    private final AnalyticsSender[] analyticsSenders;

    @Inject
    public AnalyticsEngine(AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.analyticsSenders = analyticsSenders;
    }

    public final AnalyticsSender[] getAnalyticsSenders() {
        return this.analyticsSenders;
    }

    /* compiled from: AnalyticsEndgin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ifriend/analytics/AnalyticsEngine$Companion;", "", "()V", "instance", "Lcom/ifriend/analytics/AnalyticsEngine;", "getInstance", "()Lcom/ifriend/analytics/AnalyticsEngine;", "setInstance", "(Lcom/ifriend/analytics/AnalyticsEngine;)V", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnalyticsEngine getInstance() {
            AnalyticsEngine analyticsEngine = AnalyticsEngine.instance;
            if (analyticsEngine != null) {
                return analyticsEngine;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            return null;
        }

        public final void setInstance(AnalyticsEngine analyticsEngine) {
            Intrinsics.checkNotNullParameter(analyticsEngine, "<set-?>");
            AnalyticsEngine.instance = analyticsEngine;
        }
    }
}
