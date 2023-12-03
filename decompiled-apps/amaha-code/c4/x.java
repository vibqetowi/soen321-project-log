package c4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    public final Object f4965u = new Object();

    /* renamed from: v  reason: collision with root package name */
    public boolean f4966v = false;

    /* renamed from: w  reason: collision with root package name */
    public e f4967w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ a f4968x;

    public /* synthetic */ x(a aVar, e eVar) {
        this.f4968x = aVar;
        this.f4967w = eVar;
    }

    public final void a(g gVar) {
        synchronized (this.f4965u) {
            e eVar = this.f4967w;
            if (eVar != null) {
                eVar.a(gVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        oa.l jVar;
        oa.i.e("BillingClient", "Billing service connected.");
        a aVar = this.f4968x;
        int i6 = oa.k.f27331a;
        if (iBinder == null) {
            jVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof oa.l) {
                jVar = (oa.l) queryLocalInterface;
            } else {
                jVar = new oa.j(iBinder);
            }
        }
        aVar.f4884g = jVar;
        a aVar2 = this.f4968x;
        if (aVar2.H(new w(0, this), 30000L, new u(1, this), aVar2.E()) == null) {
            a(this.f4968x.G());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        oa.i.f("BillingClient", "Billing service disconnected.");
        this.f4968x.f4884g = null;
        this.f4968x.f4880b = 0;
        synchronized (this.f4965u) {
            e eVar = this.f4967w;
            if (eVar != null) {
                eVar.b();
            }
        }
    }
}
