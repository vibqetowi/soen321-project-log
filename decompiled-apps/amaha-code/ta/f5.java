package ta;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class f5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32560u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ m6 f32561v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l5 f32562w;

    public /* synthetic */ f5(l5 l5Var, m6 m6Var, int i6) {
        this.f32560u = i6;
        this.f32562w = l5Var;
        this.f32561v = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32560u;
        l5 l5Var = this.f32562w;
        m6 m6Var = this.f32561v;
        switch (i6) {
            case 0:
                m2 m2Var = l5Var.f32730x;
                y3 y3Var = l5Var.f32943u;
                if (m2Var == null) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.f32925z.b("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    v9.o.h(m6Var);
                    m2Var.E1(m6Var);
                } catch (RemoteException e10) {
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.c(e10, "Failed to reset data on the service: remote exception");
                }
                l5Var.s();
                return;
            case 1:
                m2 m2Var2 = l5Var.f32730x;
                y3 y3Var2 = l5Var.f32943u;
                if (m2Var2 == null) {
                    w2 w2Var3 = y3Var2.C;
                    y3.k(w2Var3);
                    w2Var3.f32925z.b("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    v9.o.h(m6Var);
                    m2Var2.k0(m6Var);
                    y3Var2.q().n();
                    l5Var.l(m2Var2, null, m6Var);
                    l5Var.s();
                    return;
                } catch (RemoteException e11) {
                    w2 w2Var4 = y3Var2.C;
                    y3.k(w2Var4);
                    w2Var4.f32925z.c(e11, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                m2 m2Var3 = l5Var.f32730x;
                y3 y3Var3 = l5Var.f32943u;
                if (m2Var3 == null) {
                    w2 w2Var5 = y3Var3.C;
                    y3.k(w2Var5);
                    w2Var5.f32925z.b("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    v9.o.h(m6Var);
                    m2Var3.y0(m6Var);
                    l5Var.s();
                    return;
                } catch (RemoteException e12) {
                    w2 w2Var6 = y3Var3.C;
                    y3.k(w2Var6);
                    w2Var6.f32925z.c(e12, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                m2 m2Var4 = l5Var.f32730x;
                y3 y3Var4 = l5Var.f32943u;
                if (m2Var4 == null) {
                    w2 w2Var7 = y3Var4.C;
                    y3.k(w2Var7);
                    w2Var7.f32925z.b("Failed to send consent settings to service");
                    return;
                }
                try {
                    v9.o.h(m6Var);
                    m2Var4.K(m6Var);
                    l5Var.s();
                    return;
                } catch (RemoteException e13) {
                    w2 w2Var8 = y3Var4.C;
                    y3.k(w2Var8);
                    w2Var8.f32925z.c(e13, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}
