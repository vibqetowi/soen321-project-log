package jl;

import android.net.Uri;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.List;
/* compiled from: NotV4DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class i1 extends kotlin.jvm.internal.k implements ss.l<wd.b, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22237u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(NotV4DashboardViewModel notV4DashboardViewModel) {
        super(1);
        this.f22237u = notV4DashboardViewModel;
    }

    @Override // ss.l
    public final hs.k invoke(wd.b bVar) {
        int i6;
        List<String> pathSegments;
        String str;
        List<String> pathSegments2;
        wd.b bVar2 = bVar;
        if (bVar2 != null) {
            Uri a10 = bVar2.a();
            boolean z10 = false;
            if (a10 != null && (pathSegments2 = a10.getPathSegments()) != null) {
                i6 = pathSegments2.size();
            } else {
                i6 = 0;
            }
            if (i6 > 1) {
                if (a10 != null && (pathSegments = a10.getPathSegments()) != null && (str = pathSegments.get(0)) != null && gv.r.J0(str, "linktype=")) {
                    z10 = true;
                }
                if (z10) {
                    ApplicationPersistence.getInstance().setStringValue(Constants.DYNAMIC_SIGNUP_LINK, a10.toString());
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.USE_VARIANT_A, true);
                    this.f22237u.f10861j0.i(Boolean.TRUE);
                }
            }
        }
        return hs.k.f19476a;
    }
}
