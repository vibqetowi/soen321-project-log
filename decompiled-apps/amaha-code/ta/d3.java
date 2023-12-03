package ta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class d3 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final d6 f32518a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32519b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32520c;

    public d3(d6 d6Var) {
        this.f32518a = d6Var;
    }

    public final void a() {
        d6 d6Var = this.f32518a;
        d6Var.g();
        d6Var.a().h();
        d6Var.a().h();
        if (this.f32519b) {
            d6Var.b().H.b("Unregistering connectivity change receiver");
            this.f32519b = false;
            this.f32520c = false;
            try {
                d6Var.F.f32953u.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                d6Var.b().f32925z.c(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d6 d6Var = this.f32518a;
        d6Var.g();
        String action = intent.getAction();
        d6Var.b().H.c(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            b3 b3Var = d6Var.f32531v;
            d6.H(b3Var);
            boolean g5 = b3Var.g();
            if (this.f32520c != g5) {
                this.f32520c = g5;
                d6Var.a().p(new c3(0, this, g5));
                return;
            }
            return;
        }
        d6Var.b().C.c(action, "NetworkBroadcastReceiver received unknown action");
    }
}
