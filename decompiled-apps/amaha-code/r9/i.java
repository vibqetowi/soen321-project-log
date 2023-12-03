package r9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;
import ta.d5;
import ta.j2;
import ta.k6;
import ta.l5;
import ta.m2;
import ta.m6;
import ta.o6;
import ta.s;
import ta.s4;
import ta.t4;
import ta.w2;
import ta.y3;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30618u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f30619v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f30620w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f30621x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f30622y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f30623z;

    public i(AppMeasurementDynamiteService appMeasurementDynamiteService, n0 n0Var, String str, String str2, boolean z10) {
        this.f30618u = 5;
        this.f30623z = appMeasurementDynamiteService;
        this.f30620w = n0Var;
        this.f30621x = str;
        this.f30622y = str2;
        this.f30619v = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4 A[Catch: RuntimeException -> 0x01b2, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x01b2, blocks: (B:24:0x0073, B:28:0x008b, B:30:0x0091, B:32:0x0097, B:34:0x009d, B:36:0x00a3, B:38:0x00ab, B:40:0x00b3, B:42:0x00bb, B:44:0x00c9, B:46:0x00d9, B:49:0x00e4, B:51:0x00ef, B:54:0x00fc, B:56:0x0102, B:57:0x0118, B:58:0x011e, B:61:0x0126, B:65:0x0141, B:67:0x0152, B:66:0x0148, B:68:0x0167, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x017f, B:78:0x0187, B:80:0x018f, B:82:0x0195, B:83:0x01a9), top: B:107:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126 A[Catch: RuntimeException -> 0x01b2, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01b2, blocks: (B:24:0x0073, B:28:0x008b, B:30:0x0091, B:32:0x0097, B:34:0x009d, B:36:0x00a3, B:38:0x00ab, B:40:0x00b3, B:42:0x00bb, B:44:0x00c9, B:46:0x00d9, B:49:0x00e4, B:51:0x00ef, B:54:0x00fc, B:56:0x0102, B:57:0x0118, B:58:0x011e, B:61:0x0126, B:65:0x0141, B:67:0x0152, B:66:0x0148, B:68:0x0167, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x017f, B:78:0x0187, B:80:0x018f, B:82:0x0195, B:83:0x01a9), top: B:107:0x0073 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Intent intent;
        int c10;
        Bundle bundle;
        s sVar;
        ta.c cVar;
        int i6 = this.f30618u;
        boolean z10 = this.f30619v;
        Object obj = this.f30622y;
        Object obj2 = this.f30623z;
        Object obj3 = this.f30621x;
        Object obj4 = this.f30620w;
        switch (i6) {
            case 0:
                b bVar = (b) obj4;
                Intent intent2 = (Intent) obj3;
                Context context = (Context) obj;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj2;
                bVar.getClass();
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        c10 = bVar.d(context, intent);
                    } else {
                        c10 = bVar.c(context, intent2);
                    }
                    if (z10) {
                        pendingResult.setResultCode(c10);
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                l5 t3 = ((t4) obj2).f32943u.t();
                boolean z11 = this.f30619v;
                t3.h();
                t3.i();
                t3.t(new d5(t3, (AtomicReference) obj4, (String) obj3, (String) obj, t3.q(false), z11));
                return;
            case 2:
                Uri uri = (Uri) obj4;
                String str = (String) obj3;
                String str2 = (String) obj;
                t4 t4Var = ((s4) obj2).f32864u;
                t4Var.h();
                y3 y3Var = t4Var.f32943u;
                try {
                    k6 k6Var = y3Var.F;
                    y3.i(k6Var);
                    if (!TextUtils.isEmpty(str2)) {
                        if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid")) {
                            w2 w2Var = k6Var.f32943u.C;
                            y3.k(w2Var);
                            w2Var.G.b("Activity created with data 'referrer' without required params");
                        } else {
                            bundle = k6Var.k0(Uri.parse("https://google.com/search?".concat(str2)));
                            if (bundle != null) {
                                bundle.putString("_cis", "referrer");
                            }
                            o6 o6Var = t4Var.H;
                            if (z10) {
                                k6 k6Var2 = y3Var.F;
                                y3.i(k6Var2);
                                Bundle k02 = k6Var2.k0(uri);
                                if (k02 != null) {
                                    k02.putString("_cis", "intent");
                                    if (!k02.containsKey("gclid") && bundle != null && bundle.containsKey("gclid")) {
                                        k02.putString("_cer", String.format("gclid=%s", bundle.getString("gclid")));
                                    }
                                    t4Var.o(str, "_cmp", k02);
                                    o6Var.a(k02, str);
                                }
                            }
                            if (TextUtils.isEmpty(str2)) {
                                w2 w2Var2 = y3Var.C;
                                y3.k(w2Var2);
                                w2Var2.G.c(str2, "Activity created with referrer");
                                boolean q10 = y3Var.A.q(null, j2.Y);
                                w2 w2Var3 = y3Var.C;
                                if (q10) {
                                    if (bundle != null) {
                                        t4Var.o(str, "_cmp", bundle);
                                        o6Var.a(bundle, str);
                                    } else {
                                        y3.k(w2Var3);
                                        w2Var3.G.c(str2, "Referrer does not contain valid parameters");
                                    }
                                    y3Var.H.getClass();
                                    t4Var.w("auto", "_ldl", null, true, System.currentTimeMillis());
                                    return;
                                } else if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        y3Var.H.getClass();
                                        t4Var.w("auto", "_ldl", str2, true, System.currentTimeMillis());
                                        return;
                                    }
                                    return;
                                } else {
                                    y3.k(w2Var3);
                                    w2Var3.G.b("Activity created with data 'referrer' without required params");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    bundle = null;
                    o6 o6Var2 = t4Var.H;
                    if (z10) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                } catch (RuntimeException e10) {
                    w2 w2Var4 = y3Var.C;
                    y3.k(w2Var4);
                    w2Var4.f32925z.c(e10, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            case 3:
                l5 l5Var = (l5) obj2;
                m2 m2Var = l5Var.f32730x;
                if (m2Var == null) {
                    w2 w2Var5 = l5Var.f32943u.C;
                    y3.k(w2Var5);
                    w2Var5.f32925z.b("Discarding data. Failed to send event to service");
                    return;
                }
                m6 m6Var = (m6) obj4;
                v9.o.h(m6Var);
                if (z10) {
                    sVar = null;
                } else {
                    sVar = (s) obj3;
                }
                l5Var.l(m2Var, sVar, m6Var);
                l5Var.s();
                return;
            case 4:
                l5 l5Var2 = (l5) obj2;
                m2 m2Var2 = l5Var2.f32730x;
                if (m2Var2 == null) {
                    w2 w2Var6 = l5Var2.f32943u.C;
                    y3.k(w2Var6);
                    w2Var6.f32925z.b("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                m6 m6Var2 = (m6) obj4;
                v9.o.h(m6Var2);
                if (z10) {
                    cVar = null;
                } else {
                    cVar = (ta.c) obj3;
                }
                l5Var2.l(m2Var2, cVar, m6Var2);
                l5Var2.s();
                return;
            default:
                l5 t10 = ((AppMeasurementDynamiteService) obj2).f8742a.t();
                boolean z12 = this.f30619v;
                t10.h();
                t10.i();
                t10.t(new d5(t10, (String) obj3, (String) obj, t10.q(false), z12, (n0) obj4));
                return;
        }
    }

    public /* synthetic */ i(b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f30618u = 0;
        this.f30620w = bVar;
        this.f30621x = intent;
        this.f30622y = context;
        this.f30619v = z10;
        this.f30623z = pendingResult;
    }

    public i(s4 s4Var, boolean z10, Uri uri, String str, String str2) {
        this.f30618u = 2;
        this.f30623z = s4Var;
        this.f30619v = z10;
        this.f30620w = uri;
        this.f30621x = str;
        this.f30622y = str2;
    }

    public i(t4 t4Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f30618u = 1;
        this.f30623z = t4Var;
        this.f30620w = atomicReference;
        this.f30621x = str;
        this.f30622y = str2;
        this.f30619v = z10;
    }

    public /* synthetic */ i(l5 l5Var, m6 m6Var, boolean z10, w9.a aVar, Object obj, int i6) {
        this.f30618u = i6;
        this.f30623z = l5Var;
        this.f30620w = m6Var;
        this.f30619v = z10;
        this.f30621x = aVar;
        this.f30622y = obj;
    }
}
