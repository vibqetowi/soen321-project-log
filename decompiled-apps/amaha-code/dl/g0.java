package dl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.Collection;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13022u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13023v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hs.f f13024w;

    public /* synthetic */ g0(int i6, V3DashboardActivity v3DashboardActivity, hs.f fVar) {
        this.f13022u = i6;
        this.f13023v = v3DashboardActivity;
        this.f13024w = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = this.f13022u;
        hs.f communitiesData = this.f13024w;
        V3DashboardActivity this$0 = this.f13023v;
        switch (i6) {
            case 0:
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(communitiesData, "$latestActiveIndex");
                CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) is.u.j2(((Number) communitiesData.f19464u).intValue(), this$0.N0().getPlanV3());
                if (courseDayModelV1 != null) {
                    this$0.t0(courseDayModelV1);
                    return;
                }
                return;
            default:
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(communitiesData, "$communitiesData");
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("variant", this$0.V0);
                bundle.putString("experiment", "comm_acquisition");
                bundle.putString("platform", "android_app");
                User user = FirebasePersistence.getInstance().getUser();
                String str3 = null;
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                User f = defpackage.b.f(bundle, "domain", str);
                if (f != null) {
                    str3 = f.getCurrentCourseName();
                }
                bundle.putString("course", str3);
                Collection collection = (Collection) communitiesData.f19465v;
                bundle.putBoolean("group_joined", !collection.isEmpty());
                bundle.putInt("carousel_view_card", this$0.U0 + 1);
                Boolean bool = (Boolean) communitiesData.f19464u;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    bundle.putBoolean("onboarding_completed", booleanValue);
                    if (booleanValue && (!collection.isEmpty())) {
                        bundle.putStringArray("channel_joined_name", (String[]) collection.toArray(new String[0]));
                    }
                }
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "communities_db_banner_click");
                this$0.E0.a(new Intent(this$0, CommunitiesPwaActivity.class));
                return;
        }
    }
}
