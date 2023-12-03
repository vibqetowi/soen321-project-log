package p002if;

import com.google.firebase.perf.session.gauges.GaugeManager;
import lf.d;
/* compiled from: R8$$SyntheticClass */
/* renamed from: if.c  reason: invalid package */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20014u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ GaugeManager f20015v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f20016w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d f20017x;

    public /* synthetic */ c(GaugeManager gaugeManager, String str, d dVar, int i6) {
        this.f20014u = i6;
        this.f20015v = gaugeManager;
        this.f20016w = str;
        this.f20017x = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f20014u;
        GaugeManager gaugeManager = this.f20015v;
        d dVar = this.f20017x;
        String str = this.f20016w;
        switch (i6) {
            case 0:
                GaugeManager.d(gaugeManager, str, dVar);
                return;
            default:
                GaugeManager.c(gaugeManager, str, dVar);
                return;
        }
    }
}
