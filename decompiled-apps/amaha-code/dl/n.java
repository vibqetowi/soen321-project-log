package dl;

import android.content.IntentFilter;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.DownloadUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
/* compiled from: V2DashboardActivity.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity$checkAndDownloadOfflineAssets$1", f = "V2DashboardActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13078u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(V2DashboardActivity v2DashboardActivity, ls.d<? super n> dVar) {
        super(2, dVar);
        this.f13078u = v2DashboardActivity;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f13078u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        sp.b.d0(obj);
        ArrayList<OfflineAsset> courseAssets = ApplicationPersistence.getInstance().getCourseAssets();
        kotlin.jvm.internal.i.f(courseAssets, "getInstance().courseAssets");
        if (!courseAssets.isEmpty()) {
            ArrayList<OfflineAsset> courseAssets2 = ApplicationPersistence.getInstance().getCourseAssets();
            kotlin.jvm.internal.i.f(courseAssets2, "getInstance().courseAssets");
            if (!courseAssets2.isEmpty()) {
                for (OfflineAsset offlineAsset : courseAssets2) {
                    if (!offlineAsset.isDownloaded()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                boolean checkOfflineAssets = CourseUtilKt.checkOfflineAssets("");
                V2DashboardActivity v2DashboardActivity = this.f13078u;
                v2DashboardActivity.N = checkOfflineAssets;
                if (v2DashboardActivity.N) {
                    LogHelper.INSTANCE.i(v2DashboardActivity.f10673v, "initilising offline download");
                    n1.a.a(v2DashboardActivity).b(v2DashboardActivity.B0, new IntentFilter(DownloadUtil.DOWNLOAD_SERVICE_BROADCAST));
                    MyApplication.V.a().g();
                }
            }
        }
        return hs.k.f19476a;
    }
}
