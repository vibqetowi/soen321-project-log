package ta;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import g9.a;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32693u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t4 f32694v;

    public /* synthetic */ k4(t4 t4Var, int i6) {
        this.f32693u = i6;
        this.f32694v = t4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Pair pair;
        boolean z10;
        NetworkInfo activeNetworkInfo;
        URL url;
        int i6 = this.f32693u;
        t4 t4Var = this.f32694v;
        switch (i6) {
            case 0:
                t4Var.h();
                y3 y3Var = t4Var.f32943u;
                j3 j3Var = y3Var.B;
                y3.i(j3Var);
                boolean b10 = j3Var.L.b();
                w2 w2Var = y3Var.C;
                if (!b10) {
                    j3 j3Var2 = y3Var.B;
                    y3.i(j3Var2);
                    long a10 = j3Var2.M.a();
                    g3 g3Var = j3Var2.M;
                    g3Var.b(1 + a10);
                    if (a10 >= 5) {
                        y3.k(w2Var);
                        w2Var.C.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        j3Var2.L.a(true);
                        return;
                    }
                    w3 w3Var = y3Var.D;
                    y3.k(w3Var);
                    w3Var.h();
                    y4 y4Var = y3Var.L;
                    y3.k(y4Var);
                    y3.k(y4Var);
                    String m10 = y3Var.p().m();
                    j3Var2.h();
                    y3 y3Var2 = j3Var2.f32943u;
                    y3Var2.H.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    String str2 = j3Var2.A;
                    if (str2 != null && elapsedRealtime < j3Var2.C) {
                        pair = new Pair(str2, Boolean.valueOf(j3Var2.B));
                    } else {
                        j3Var2.C = y3Var2.A.n(m10, j2.f32641b) + elapsedRealtime;
                        try {
                            a.C0248a a11 = g9.a.a(y3Var2.f32953u);
                            j3Var2.A = "";
                            String str3 = a11.f16386a;
                            if (str3 != null) {
                                j3Var2.A = str3;
                            }
                            j3Var2.B = a11.f16387b;
                        } catch (Exception e10) {
                            w2 w2Var2 = y3Var2.C;
                            y3.k(w2Var2);
                            w2Var2.G.c(e10, "Unable to get advertising id");
                            j3Var2.A = "";
                        }
                        pair = new Pair(j3Var2.A, Boolean.valueOf(j3Var2.B));
                    }
                    Boolean p10 = y3Var.A.p("google_analytics_adid_collection_enabled");
                    if (p10 != null && !p10.booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && !((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        y3.k(y4Var);
                        y4Var.j();
                        y3 y3Var3 = y4Var.f32943u;
                        ConnectivityManager connectivityManager = (ConnectivityManager) y3Var3.f32953u.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                k6 k6Var = y3Var.F;
                                y3.i(k6Var);
                                y3Var.p().f32943u.A.m();
                                String str4 = (String) pair.first;
                                long a12 = g3Var.a() - 1;
                                y3 y3Var4 = k6Var.f32943u;
                                try {
                                    v9.o.e(str4);
                                    v9.o.e(m10);
                                    String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 74029L, Integer.valueOf(k6Var.h0())), str4, m10, Long.valueOf(a12));
                                    if (m10.equals(y3Var4.A.i("debug.deferred.deeplink"))) {
                                        format = format.concat("&ddl_test=1");
                                    }
                                    url = new URL(format);
                                } catch (IllegalArgumentException | MalformedURLException e11) {
                                    w2 w2Var3 = y3Var4.C;
                                    y3.k(w2Var3);
                                    w2Var3.f32925z.c(e11.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                    url = null;
                                }
                                if (url != null) {
                                    y3.k(y4Var);
                                    x3 x3Var = new x3(y3Var, 0);
                                    y4Var.h();
                                    y4Var.j();
                                    w3 w3Var2 = y3Var3.D;
                                    y3.k(w3Var2);
                                    w3Var2.o(new x4(y4Var, m10, url, x3Var));
                                    return;
                                }
                                return;
                            }
                            y3.k(w2Var);
                            w2Var.C.b("Network is not available for Deferred Deep Link request. Skipping");
                            return;
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        y3.k(w2Var);
                        w2Var.C.b("Network is not available for Deferred Deep Link request. Skipping");
                        return;
                    }
                    y3.k(w2Var);
                    w2Var.G.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    return;
                }
                y3.k(w2Var);
                w2Var.G.b("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            default:
                o6 o6Var = t4Var.H;
                y3 y3Var5 = o6Var.f32791a;
                w3 w3Var3 = y3Var5.D;
                y3.k(w3Var3);
                w3Var3.h();
                if (o6Var.b()) {
                    boolean c10 = o6Var.c();
                    t4 t4Var2 = y3Var5.J;
                    j3 j3Var3 = y3Var5.B;
                    if (c10) {
                        y3.i(j3Var3);
                        j3Var3.O.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        y3.j(t4Var2);
                        t4Var2.o("auto", "_cmpx", bundle);
                    } else {
                        y3.i(j3Var3);
                        i3 i3Var = j3Var3.O;
                        String a13 = i3Var.a();
                        if (TextUtils.isEmpty(a13)) {
                            w2 w2Var4 = y3Var5.C;
                            y3.k(w2Var4);
                            w2Var4.A.b("Cache still valid but referrer not found");
                        } else {
                            long a14 = ((j3Var3.P.a() / 3600000) - 1) * 3600000;
                            Uri parse = Uri.parse(a13);
                            Bundle bundle2 = new Bundle();
                            Pair pair2 = new Pair(parse.getPath(), bundle2);
                            for (String str5 : parse.getQueryParameterNames()) {
                                bundle2.putString(str5, parse.getQueryParameter(str5));
                            }
                            ((Bundle) pair2.second).putLong("_cc", a14);
                            Object obj = pair2.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            y3.j(t4Var2);
                            t4Var2.o(str, "_cmp", (Bundle) pair2.second);
                        }
                        i3Var.b(null);
                    }
                    y3.i(j3Var3);
                    j3Var3.P.b(0L);
                    return;
                }
                return;
        }
    }
}
