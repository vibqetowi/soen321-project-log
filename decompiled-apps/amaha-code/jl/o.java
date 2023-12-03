package jl;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$triggerDashboardViewEvent$1", f = "CustomDashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public o(ls.d<? super o> dVar) {
        super(2, dVar);
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new o(dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return new o(dVar).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        sp.b.d0(obj);
        Bundle bundle = new Bundle();
        User user = FirebasePersistence.getInstance().getUser();
        String str2 = null;
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        if (str != null) {
            defpackage.d.m(bundle, "course");
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(MyApplication.V.a());
            String g5 = defpackage.b.g();
            com.google.android.gms.internal.measurement.j1 j1Var = firebaseAnalytics.f9535a;
            j1Var.getClass();
            j1Var.b(new com.google.android.gms.internal.measurement.a1(j1Var, (String) null, "course", (Object) g5, false));
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null) {
                str2 = user2.getVersion();
            }
            bundle.putString("version", str2);
        }
        UtilsKt.fireAnalytics("dashboard_view", bundle);
        return hs.k.f19476a;
    }
}
