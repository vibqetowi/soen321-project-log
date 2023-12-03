package jl;

import android.app.Application;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
/* compiled from: CustomDashboardViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class q extends o0.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22297b = 3;

    /* renamed from: c  reason: collision with root package name */
    public final Application f22298c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f22299d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f22300e;

    public q(Application application, String str, qn.c cVar) {
        this.f22298c = application;
        this.f22299d = str;
        this.f22300e = cVar;
    }

    @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
    public final androidx.lifecycle.l0 a(Class cls) {
        int i6 = this.f22297b;
        Application application = this.f22298c;
        Object obj = this.f22300e;
        Object obj2 = this.f22299d;
        switch (i6) {
            case 0:
                return new e((u) obj2, (rp.a) obj, application);
            case 1:
                return new NotV4DashboardViewModel((u0) obj2, (cn.t) obj, application);
            case 2:
                return new ml.c0(application, (ml.u) obj2, (cn.t) obj);
            default:
                return new MonetizationViewModel(application, (String) obj2, (qn.c) obj);
        }
    }

    public q(u uVar, rp.a aVar, MyApplication myApplication) {
        this.f22299d = uVar;
        this.f22300e = aVar;
        this.f22298c = myApplication;
    }

    public q(Application application, ml.u uVar, cn.t tVar) {
        this.f22298c = application;
        this.f22299d = uVar;
        this.f22300e = tVar;
    }

    public q(u0 u0Var, cn.t tVar, Application application) {
        this.f22299d = u0Var;
        this.f22300e = tVar;
        this.f22298c = application;
    }
}
