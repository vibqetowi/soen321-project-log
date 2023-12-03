package ta;

import android.os.Bundle;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Iterator;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32681u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Bundle f32682v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t4 f32683w;

    public /* synthetic */ j4(t4 t4Var, Bundle bundle, int i6) {
        this.f32681u = i6;
        this.f32683w = t4Var;
        this.f32682v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32681u;
        Bundle bundle = this.f32682v;
        t4 t4Var = this.f32683w;
        switch (i6) {
            case 0:
                y3 y3Var = t4Var.f32943u;
                if (bundle == null) {
                    j3 j3Var = y3Var.B;
                    y3.i(j3Var);
                    j3Var.Q.b(new Bundle());
                    return;
                }
                j3 j3Var2 = y3Var.B;
                y3.i(j3Var2);
                Bundle a10 = j3Var2.Q.a();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    g.x xVar = t4Var.J;
                    w2 w2Var = y3Var.C;
                    k6 k6Var = y3Var.F;
                    if (hasNext) {
                        String next = it.next();
                        Object obj = bundle.get(next);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            y3.i(k6Var);
                            k6Var.getClass();
                            if (k6.Q(obj)) {
                                k6.x(xVar, null, 27, null, null, 0);
                            }
                            y3.k(w2Var);
                            w2Var.E.d("Invalid default event parameter type. Name, value", next, obj);
                        } else if (k6.S(next)) {
                            y3.k(w2Var);
                            w2Var.E.c(next, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            a10.remove(next);
                        } else {
                            y3.i(k6Var);
                            if (k6Var.M("param", next, 100, obj)) {
                                k6Var.y(a10, next, obj);
                            }
                        }
                    } else {
                        y3.i(k6Var);
                        int k10 = y3Var.A.k();
                        if (a10.size() > k10) {
                            Iterator it2 = new TreeSet(a10.keySet()).iterator();
                            int i10 = 0;
                            while (it2.hasNext()) {
                                String str = (String) it2.next();
                                i10++;
                                if (i10 > k10) {
                                    a10.remove(str);
                                }
                            }
                            y3.i(k6Var);
                            k6Var.getClass();
                            k6.x(xVar, null, 26, null, null, 0);
                            y3.k(w2Var);
                            w2Var.E.b("Too many default event parameters set. Discarding beyond event parameter limit");
                        }
                        j3 j3Var3 = y3Var.B;
                        y3.i(j3Var3);
                        j3Var3.Q.b(a10);
                        l5 t3 = y3Var.t();
                        t3.h();
                        t3.i();
                        t3.t(new k9.d0(t3, t3.q(false), a10, 11));
                        return;
                    }
                }
                break;
            case 1:
                t4Var.h();
                t4Var.i();
                v9.o.h(bundle);
                String string = bundle.getString(SessionManager.KEY_NAME);
                String string2 = bundle.getString("origin");
                v9.o.e(string);
                v9.o.e(string2);
                v9.o.h(bundle.get("value"));
                y3 y3Var2 = t4Var.f32943u;
                boolean g5 = y3Var2.g();
                k6 k6Var2 = y3Var2.F;
                if (!g5) {
                    w2 w2Var2 = y3Var2.C;
                    y3.k(w2Var2);
                    w2Var2.H.b("Conditional property not set since app measurement is disabled");
                    return;
                }
                g6 g6Var = new g6(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    y3.i(k6Var2);
                    bundle.getString("app_id");
                    s n02 = k6Var2.n0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                    bundle.getString("app_id");
                    s n03 = k6Var2.n0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                    bundle.getString("app_id");
                    y3Var2.t().m(new c(bundle.getString("app_id"), string2, g6Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), n03, bundle.getLong("trigger_timeout"), n02, bundle.getLong("time_to_live"), k6Var2.n0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                t4Var.h();
                t4Var.i();
                v9.o.h(bundle);
                String string3 = bundle.getString(SessionManager.KEY_NAME);
                v9.o.e(string3);
                y3 y3Var3 = t4Var.f32943u;
                if (!y3Var3.g()) {
                    w2 w2Var3 = y3Var3.C;
                    y3.k(w2Var3);
                    w2Var3.H.b("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                g6 g6Var2 = new g6(0L, null, string3, "");
                try {
                    k6 k6Var3 = y3Var3.F;
                    y3.i(k6Var3);
                    bundle.getString("app_id");
                    y3Var3.t().m(new c(bundle.getString("app_id"), "", g6Var2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), k6Var3.n0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
        }
    }
}
