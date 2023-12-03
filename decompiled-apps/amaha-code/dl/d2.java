package dl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.k implements ss.l<RoutingIntentHandler, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13002u;

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13003a;

        static {
            int[] iArr = new int[RoutingType.values().length];
            try {
                iArr[RoutingType.MOOD_TRACKER_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoutingType.COMMUNITY_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13003a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13002u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(RoutingIntentHandler routingIntentHandler) {
        int i6;
        RoutingIntentHandler routingIntentHandler2 = routingIntentHandler;
        V3DashboardActivity v3DashboardActivity = this.f13002u;
        try {
            if (v3DashboardActivity.f10733l0) {
                RoutingType routingType = routingIntentHandler2.getRoutingType();
                if (routingType == null) {
                    i6 = -1;
                } else {
                    i6 = a.f13003a[routingType.ordinal()];
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                if (!v3DashboardActivity.R0) {
                                    ((ScrollView) v3DashboardActivity.n0(R.id.scrollView2)).smoothScrollTo(0, (int) ((FrameLayout) v3DashboardActivity.n0(R.id.flExpertCareContainer)).getY());
                                    RoutingIntentHandler d10 = v3DashboardActivity.P0().X.d();
                                    if (d10 != null) {
                                        d10.setRoutingCompleted(true);
                                    }
                                } else {
                                    Extensions extensions = Extensions.INSTANCE;
                                    LinearLayout llDashboardProviderEntryPointExperiment = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                                    kotlin.jvm.internal.i.f(llDashboardProviderEntryPointExperiment, "llDashboardProviderEntryPointExperiment");
                                    if (extensions.isVisible(llDashboardProviderEntryPointExperiment)) {
                                        ((ScrollView) v3DashboardActivity.n0(R.id.scrollView2)).smoothScrollTo(0, (int) ((LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment)).getY());
                                        RoutingIntentHandler d11 = v3DashboardActivity.P0().X.d();
                                        if (d11 != null) {
                                            d11.setRoutingCompleted(true);
                                        }
                                    }
                                }
                            }
                        } else {
                            ((ScrollView) v3DashboardActivity.n0(R.id.scrollView2)).post(new v(v3DashboardActivity, 9));
                        }
                    } else {
                        Extensions extensions2 = Extensions.INSTANCE;
                        View layoutJournalCard = v3DashboardActivity.n0(R.id.layoutJournalCard);
                        kotlin.jvm.internal.i.f(layoutJournalCard, "layoutJournalCard");
                        if (extensions2.isVisible(layoutJournalCard)) {
                            ((ScrollView) v3DashboardActivity.n0(R.id.scrollView2)).smoothScrollTo(0, (int) v3DashboardActivity.n0(R.id.layoutJournalCard).getY());
                            RoutingIntentHandler d12 = v3DashboardActivity.P0().X.d();
                            if (d12 != null) {
                                d12.setRoutingCompleted(true);
                            }
                        }
                    }
                } else {
                    Extensions extensions3 = Extensions.INSTANCE;
                    FrameLayout containerFrame = (FrameLayout) v3DashboardActivity.n0(R.id.containerFrame);
                    kotlin.jvm.internal.i.f(containerFrame, "containerFrame");
                    if (extensions3.isVisible(containerFrame)) {
                        ((ScrollView) v3DashboardActivity.n0(R.id.scrollView2)).smoothScrollTo(0, ((int) ((FrameLayout) v3DashboardActivity.n0(R.id.containerFrame)).getY()) - 300);
                        RoutingIntentHandler d13 = v3DashboardActivity.P0().X.d();
                        if (d13 != null) {
                            d13.setRoutingCompleted(true);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
        }
        return hs.k.f19476a;
    }
}
