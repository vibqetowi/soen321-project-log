package com.ifriend.chat.presentation.ui.infoOnboarding.analytics;

import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingAction;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InfoOnboardingAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/ifriend/chat/presentation/ui/infoOnboarding/analytics/InfoOnboardingAnalyticsImpl;", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/analytics/InfoOnboardingAnalytics;", "()V", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "getTracker", "()Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "tracker$delegate", "Lkotlin/Lazy;", "buttonActionCode", "", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingAction;", "eventStepName", "", "slide", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "eventStepNumber", "type", "sendOnboardingFinished", "", "sendOnboardingStarted", "sendUserAction", "stepName", "stepNumber", "buttonCode", "userSelectedSlide", "willShow", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingAnalyticsImpl implements InfoOnboardingAnalytics {
    public static final int $stable = 8;
    private final AnalyticsEngine analytics = AnalyticsEngine.Companion.getInstance();
    private final Lazy tracker$delegate = LazyKt.lazy(new InfoOnboardingAnalyticsImpl$tracker$2(this));

    /* compiled from: InfoOnboardingAnalyticsImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoOnboardingAction.values().length];
            try {
                iArr[InfoOnboardingAction.Yes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoOnboardingAction.No.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoOnboardingAction.Allow.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfoOnboardingAction.Deny.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final AnnalsTrackerAnalyticsSender getTracker() {
        return (AnnalsTrackerAnalyticsSender) this.tracker$delegate.getValue();
    }

    @Override // com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalytics
    public void userSelectedSlide(InfoOnboardingSlide slide, InfoOnboardingAction action) {
        Intrinsics.checkNotNullParameter(slide, "slide");
        Intrinsics.checkNotNullParameter(action, "action");
        String eventStepName = eventStepName(slide);
        if (eventStepName == null) {
            return;
        }
        sendUserAction(eventStepName, eventStepNumber(slide), buttonActionCode(action));
        if (slide instanceof InfoOnboardingSlide.Intimate) {
            sendOnboardingFinished();
        }
    }

    @Override // com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalytics
    public void willShow(InfoOnboardingSlide slide) {
        Intrinsics.checkNotNullParameter(slide, "slide");
        if (slide instanceof InfoOnboardingSlide.TrackActivity) {
            sendOnboardingStarted();
        }
    }

    private final String eventStepName(InfoOnboardingSlide infoOnboardingSlide) {
        if (Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.TrackActivity.INSTANCE)) {
            return "lock";
        }
        if (Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.UserWillSendPhotos.INSTANCE)) {
            return "peach";
        }
        if (Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.AllowNotifications.INSTANCE)) {
            return "eyes";
        }
        if (Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.Intimate.INSTANCE)) {
            return "heart";
        }
        return null;
    }

    private final int eventStepNumber(InfoOnboardingSlide infoOnboardingSlide) {
        if (Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.TrackActivity.INSTANCE)) {
            return 1;
        }
        if (Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.UserWillSendPhotos.INSTANCE)) {
            return 2;
        }
        if (Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.AllowNotifications.INSTANCE)) {
            return 4;
        }
        return Intrinsics.areEqual(infoOnboardingSlide, InfoOnboardingSlide.Intimate.INSTANCE) ? 5 : 0;
    }

    private final int buttonActionCode(InfoOnboardingAction infoOnboardingAction) {
        int i = WhenMappings.$EnumSwitchMapping$0[infoOnboardingAction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 1;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return 0;
        }
        return 1;
    }

    private final void sendOnboardingStarted() {
        getTracker().sendEvent("onboarding-info-part-screen-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    private final void sendOnboardingFinished() {
        getTracker().sendEvent("onboarding-finished-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    private final void sendUserAction(String str, int i, int i2) {
        getTracker().sendEvent("onboarding-info-part-steps-ai", MapsKt.mapOf(TuplesKt.to("step-name", str), TuplesKt.to("step", Integer.valueOf(i)), AnalyticsConstants.INSTANCE.getTimestamp(), TuplesKt.to("btn", Integer.valueOf(i2))));
    }
}
