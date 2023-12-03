package dl;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class w1 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends ArrayList<String>>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13122u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13122u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(hs.f<? extends Boolean, ? extends ArrayList<String>> fVar) {
        tk.c cVar;
        boolean z10;
        boolean z11;
        hs.f<? extends Boolean, ? extends ArrayList<String>> fVar2 = fVar;
        if (fVar2 != null) {
            A a10 = fVar2.f19464u;
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity v3DashboardActivity = this.f13122u;
            v3DashboardActivity.getClass();
            try {
                boolean z12 = v3DashboardActivity.W0;
                B b10 = fVar2.f19465v;
                if (!z12) {
                    v3DashboardActivity.W0 = true;
                    androidx.fragment.app.y supportFragmentManager = v3DashboardActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    tk.c cVar2 = new tk.c();
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("communities_joined_list", (ArrayList) b10);
                    Boolean bool = (Boolean) a10;
                    if (bool != null) {
                        z11 = bool.booleanValue();
                    } else {
                        z11 = false;
                    }
                    bundle.putBoolean("onboarding_complete", z11);
                    hs.k kVar = hs.k.f19476a;
                    aVar.f(R.id.llCommunitiesExperiment1, UtilsKt.withArgs(cVar2, bundle), "communities_fragment");
                    aVar.j();
                } else {
                    Fragment F = v3DashboardActivity.getSupportFragmentManager().F("communities_fragment");
                    if (F instanceof tk.c) {
                        cVar = (tk.c) F;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        Boolean bool2 = (Boolean) a10;
                        if (bool2 != null) {
                            z10 = bool2.booleanValue();
                        } else {
                            z10 = false;
                        }
                        cVar.P(z10);
                        cVar.O((ArrayList) b10);
                    }
                }
                if (v3DashboardActivity.f10751w0 && !ApplicationPersistence.getInstance().getBooleanValue(Constants.USER_JOINED_COMMUNITIES, false)) {
                    v3DashboardActivity.H1(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY);
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.USER_JOINED_COMMUNITIES, true);
                }
                v3DashboardActivity.f10751w0 = false;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
            if (!kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "IN") && !kotlin.jvm.internal.i.b(v3DashboardActivity.L0, "default") && defpackage.b.u(SessionManager.KEY_USERTYPE, "patient")) {
                g0 g0Var = new g0(1, v3DashboardActivity, fVar2);
                if (kotlin.jvm.internal.i.b(a10, Boolean.FALSE)) {
                    View n02 = v3DashboardActivity.n0(R.id.viewCommunitiesBanner1);
                    if (n02 != null) {
                        n02.setVisibility(0);
                    }
                    View n03 = v3DashboardActivity.n0(R.id.viewCommunitiesBanner2);
                    if (n03 != null) {
                        n03.setVisibility(8);
                    }
                    View n04 = v3DashboardActivity.n0(R.id.viewCommunitiesBanner1);
                    if (n04 != null) {
                        n04.setOnClickListener(g0Var);
                    }
                } else {
                    View n05 = v3DashboardActivity.n0(R.id.viewCommunitiesBanner2);
                    if (n05 != null) {
                        n05.setVisibility(0);
                    }
                    View n06 = v3DashboardActivity.n0(R.id.viewCommunitiesBanner1);
                    if (n06 != null) {
                        n06.setVisibility(8);
                    }
                    View n07 = v3DashboardActivity.n0(R.id.viewCommunitiesBanner2);
                    if (n07 != null) {
                        n07.setOnClickListener(g0Var);
                    }
                }
            }
        }
        return hs.k.f19476a;
    }
}
