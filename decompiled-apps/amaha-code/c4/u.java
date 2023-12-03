package c4;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.g0;
import com.google.android.gms.internal.cast.j0;
import com.google.android.gms.internal.cast.k0;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.cast.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ta.j3;
import ta.s5;
import ta.t4;
import ta.v5;
import ta.w2;
import ta.y3;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4959u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f4960v;

    public /* synthetic */ u(int i6, Object obj) {
        this.f4959u = i6;
        this.f4960v = obj;
    }

    private final void a() {
        xa.a aVar = (xa.a) this.f4960v;
        synchronized (aVar.f37697a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.f37705j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (aVar.b()) {
                    aVar.f37699c = 1;
                    aVar.e();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        switch (this.f4959u) {
            case 0:
                g gVar = z.f4978i;
                oa.o oVar = oa.q.f27340v;
                ((d) ((m) this.f4960v)).a(gVar, oa.b.f27315y);
                return;
            case 1:
                x xVar = (x) this.f4960v;
                xVar.f4968x.f4880b = 0;
                xVar.f4968x.f4884g = null;
                xVar.a(z.f4978i);
                return;
            case 2:
                ((b) ((i) this.f4960v)).a(z.f4978i, new ArrayList());
                return;
            case 3:
                ((c) ((k) this.f4960v)).a(z.f4978i, null);
                return;
            case 4:
                ((n9.j) this.f4960v).n(false);
                return;
            case 5:
            case 9:
            default:
                a();
                return;
            case 6:
                p9.n nVar = (p9.n) this.f4960v;
                nVar.getClass();
                synchronized (p9.n.f28041g) {
                    if (nVar.f28044c != -1) {
                        nVar.e(15);
                        return;
                    }
                    return;
                }
            case 7:
                if (((ya.i) this.f4960v).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 8:
                ((com.google.android.gms.common.api.internal.b0) this.f4960v).f();
                return;
            case 10:
                ((e0) ((q0) this.f4960v).f7428h).b(new s9.b(4));
                return;
            case 11:
                Process.setThreadPriority(0);
                ((Runnable) this.f4960v).run();
                return;
            case 12:
                com.google.android.gms.internal.cast.a0 a0Var = (com.google.android.gms.internal.cast.a0) this.f4960v;
                com.google.android.gms.internal.cast.b0 b0Var = a0Var.f;
                if (b0Var != null) {
                    a0Var.f7471a.a(a0Var.f7472b.b(b0Var).d(), 80);
                }
                a0Var.c();
                return;
            case 13:
                v0 v0Var = (v0) this.f4960v;
                HashSet hashSet = v0Var.f;
                if (!hashSet.isEmpty()) {
                    HashSet hashSet2 = v0Var.f7660g;
                    if (true != hashSet2.equals(hashSet)) {
                        j10 = 86400000;
                    } else {
                        j10 = 172800000;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = v0Var.f7661h;
                    if (j11 == 0 || currentTimeMillis - j11 >= j10) {
                        v0.f7652i.b("Upload the feature usage report.", new Object[0]);
                        j0 h10 = k0.h();
                        String str = v0.f7653j;
                        if (h10.f7478w) {
                            h10.b();
                            h10.f7478w = false;
                        }
                        k0.l((k0) h10.f7477v, str);
                        String str2 = v0Var.f7657c;
                        if (h10.f7478w) {
                            h10.b();
                            h10.f7478w = false;
                        }
                        k0.k((k0) h10.f7477v, str2);
                        k0 d10 = h10.d();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(hashSet);
                        f0 h11 = g0.h();
                        if (h11.f7478w) {
                            h11.b();
                            h11.f7478w = false;
                        }
                        g0.l((g0) h11.f7477v, arrayList);
                        if (h11.f7478w) {
                            h11.b();
                            h11.f7478w = false;
                        }
                        g0.k((g0) h11.f7477v, d10);
                        g0 d11 = h11.d();
                        com.google.android.gms.internal.cast.q0 i6 = r0.i();
                        if (i6.f7478w) {
                            i6.b();
                            i6.f7478w = false;
                        }
                        r0.v((r0) i6.f7477v, d11);
                        v0Var.f7655a.a(i6.d(), 88);
                        SharedPreferences sharedPreferences = v0Var.f7656b;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(hashSet);
                            Iterator it = hashSet2.iterator();
                            while (it.hasNext()) {
                                String num = Integer.toString(((d0) it.next()).f7509u);
                                String format = String.format("%s%s", "feature_usage_timestamp_reported_feature_", num);
                                if (!v0Var.f7656b.contains(format)) {
                                    format = String.format("%s%s", "feature_usage_timestamp_detected_feature_", num);
                                }
                                String format2 = String.format("%s%s", "feature_usage_timestamp_reported_feature_", num);
                                if (!TextUtils.equals(format, format2)) {
                                    long j12 = sharedPreferences.getLong(format, 0L);
                                    edit.remove(format);
                                    if (j12 != 0) {
                                        edit.putLong(format2, j12);
                                    }
                                }
                            }
                        }
                        v0Var.f7661h = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                s5 s5Var = (s5) this.f4960v;
                androidx.appcompat.widget.l lVar = s5Var.f32867w;
                long j13 = s5Var.f32865u;
                ((v5) lVar.f1472w).h();
                w2 w2Var = ((v5) lVar.f1472w).f32943u.C;
                y3.k(w2Var);
                w2Var.G.b("Application going to the background");
                j3 j3Var = ((v5) lVar.f1472w).f32943u.B;
                y3.i(j3Var);
                j3Var.K.a(true);
                Bundle bundle = new Bundle();
                if (!((v5) lVar.f1472w).f32943u.A.r()) {
                    mh.e eVar = ((v5) lVar.f1472w).f32917y;
                    long j14 = s5Var.f32866v;
                    ((ta.m) eVar.f25070c).a();
                    ((v5) lVar.f1472w).f32917y.b(j14, false, false);
                }
                t4 t4Var = ((v5) lVar.f1472w).f32943u.J;
                y3.j(t4Var);
                t4Var.p(j13, bundle, "auto", "_ab");
                return;
        }
    }

    public u(Runnable runnable) {
        this.f4959u = 11;
        this.f4960v = runnable;
    }
}
