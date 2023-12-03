package dl;

import android.content.Intent;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class a2 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f12971u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f12971u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean refreshDashboardForSubscriptions = bool;
        kotlin.jvm.internal.i.f(refreshDashboardForSubscriptions, "refreshDashboardForSubscriptions");
        boolean booleanValue = refreshDashboardForSubscriptions.booleanValue();
        final V3DashboardActivity v3DashboardActivity = this.f12971u;
        if (booleanValue) {
            int i6 = V3DashboardActivity.f10714r1;
            v3DashboardActivity.z1(false);
            v3DashboardActivity.d1();
            v3DashboardActivity.B0();
            v3DashboardActivity.J0();
            v3DashboardActivity.p1();
        }
        if (v3DashboardActivity.I == null) {
            lp.a aVar = (lp.a) new androidx.lifecycle.o0(v3DashboardActivity).a(lp.a.class);
            v3DashboardActivity.I = aVar;
            if (aVar != null) {
                aVar.g();
                aVar.f24482x.e(v3DashboardActivity, new androidx.lifecycle.x() { // from class: dl.a0
                    @Override // androidx.lifecycle.x
                    public final void a(Object obj) {
                        int i10 = r2;
                        V3DashboardActivity this$0 = v3DashboardActivity;
                        switch (i10) {
                            case 0:
                                Boolean bool2 = (Boolean) obj;
                                int i11 = V3DashboardActivity.f10714r1;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (bool2 != null && bool2.booleanValue() && ApplicationPersistence.getInstance().getBooleanValue(Constants.SHOW_MESSAGING_PAGES, false)) {
                                    ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_MESSAGING_PAGES, false);
                                    this$0.startActivity(new Intent(this$0, SubscriptionMessagingDashboardActivity.class));
                                    return;
                                }
                                return;
                            default:
                                Boolean bool3 = (Boolean) obj;
                                int i12 = V3DashboardActivity.f10714r1;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (bool3 != null && bool3.booleanValue()) {
                                    this$0.A1();
                                    return;
                                }
                                return;
                        }
                    }
                });
                aVar.f24483y.e(v3DashboardActivity, new androidx.lifecycle.x() { // from class: dl.a0
                    @Override // androidx.lifecycle.x
                    public final void a(Object obj) {
                        int i10 = r2;
                        V3DashboardActivity this$0 = v3DashboardActivity;
                        switch (i10) {
                            case 0:
                                Boolean bool2 = (Boolean) obj;
                                int i11 = V3DashboardActivity.f10714r1;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (bool2 != null && bool2.booleanValue() && ApplicationPersistence.getInstance().getBooleanValue(Constants.SHOW_MESSAGING_PAGES, false)) {
                                    ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_MESSAGING_PAGES, false);
                                    this$0.startActivity(new Intent(this$0, SubscriptionMessagingDashboardActivity.class));
                                    return;
                                }
                                return;
                            default:
                                Boolean bool3 = (Boolean) obj;
                                int i12 = V3DashboardActivity.f10714r1;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (bool3 != null && bool3.booleanValue()) {
                                    this$0.A1();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                throw null;
            }
        } else {
            v3DashboardActivity.A1();
        }
        if (v3DashboardActivity.getIntent().getBooleanExtra("login_flag", false)) {
            v3DashboardActivity.B.m();
        }
        v3DashboardActivity.x0(false);
        return hs.k.f19476a;
    }
}
