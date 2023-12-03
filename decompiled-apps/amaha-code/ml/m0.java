package ml;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.x0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$initAuxiliary$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c0 f25534u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f25535v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(c0 c0Var, boolean z10, ls.d<? super m0> dVar) {
        super(2, dVar);
        this.f25534u = c0Var;
        this.f25535v = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m0(this.f25534u, this.f25535v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        c0 c0Var = this.f25534u;
        sp.b.d0(obj);
        try {
            c0.e(c0Var);
            Utils utils = Utils.INSTANCE;
            utils.updateFirebaseInstanceId();
            FirebasePersistence.getInstance().updateMixpanelProperties();
            FirebasePersistence.getInstance().updateMoEngageUserProperties();
            MyApplication.a aVar = MyApplication.V;
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(aVar.a());
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
            j1 j1Var = firebaseAnalytics.f9535a;
            j1Var.getClass();
            j1Var.b(new x0(j1Var, stringValue, 0));
            FirebaseAnalytics firebaseAnalytics2 = FirebaseAnalytics.getInstance(aVar.a());
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            j1 j1Var2 = firebaseAnalytics2.f9535a;
            j1Var2.getClass();
            j1Var2.b(new a1(j1Var2, (String) null, "course", (Object) currentCourseName, false));
            Bundle bundle = new Bundle();
            if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                FirebaseAnalytics firebaseAnalytics3 = FirebaseAnalytics.getInstance(aVar.a());
                String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                j1 j1Var3 = firebaseAnalytics3.f9535a;
                j1Var3.getClass();
                j1Var3.b(new a1(j1Var3, (String) null, "course", (Object) currentCourseName2, false));
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getVersion();
                } else {
                    str = null;
                }
                bundle.putString("version", str);
            }
            UtilsKt.fireAnalytics("dashboard_view", bundle);
            if (this.f25535v && FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                UtilsKt.fireAnalytics("dashboard_view_condition_sel", UtilsKt.getAnalyticsBundle());
            }
            utils.clearNotificationChannel();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(c0Var.A, "exception", e10);
        }
        return hs.k.f19476a;
    }
}
