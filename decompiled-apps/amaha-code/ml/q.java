package ml;

import android.app.Application;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.MyApplication;
/* compiled from: DashboardTelecommunicationsViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class q extends o0.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25569b;

    /* renamed from: c  reason: collision with root package name */
    public final rp.a f25570c;

    /* renamed from: d  reason: collision with root package name */
    public final Application f25571d;

    public q(rp.a aVar, MyApplication myApplication, int i6) {
        this.f25569b = i6;
        if (i6 != 1) {
            this.f25570c = aVar;
            this.f25571d = myApplication;
            return;
        }
        this.f25570c = aVar;
        this.f25571d = myApplication;
    }

    @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
    public final androidx.lifecycle.l0 a(Class cls) {
        int i6 = this.f25569b;
        Application application = this.f25571d;
        rp.a aVar = this.f25570c;
        switch (i6) {
            case 0:
                return new p(aVar, application);
            default:
                return new rp.t(aVar, application);
        }
    }
}
