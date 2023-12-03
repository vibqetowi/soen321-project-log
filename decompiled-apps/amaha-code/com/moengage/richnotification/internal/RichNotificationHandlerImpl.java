package com.moengage.richnotification.internal;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import fj.e;
import hh.g;
import ih.p;
import java.util.LinkedHashMap;
import java.util.List;
import jj.b;
import jj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import nj.a;
import org.json.JSONObject;
import sj.a0;
import sj.b0;
import sj.n;
import sj.z;
import tj.d0;
import tj.e0;
import tj.f0;
import tj.g0;
import tj.h0;
import tj.i0;
import tj.j;
import tj.k0;
import uj.f;
import uj.h;
import uj.k;
import uj.o;
import uj.q;
import vj.d;
/* compiled from: RichNotificationHandlerImpl.kt */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/moengage/richnotification/internal/RichNotificationHandlerImpl;", "Lnj/a;", "Landroid/content/Context;", "context", "Ljj/b;", "metaData", "Lih/p;", "sdkInstance", "Ljj/c;", "buildTemplate", "Lpj/b;", "payload", "", "isTemplateSupported", "Landroid/os/Bundle;", "Lhs/k;", "onNotificationDismissed", "onLogout", "", "tag", "Ljava/lang/String;", "<init>", "()V", "rich-notification_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class RichNotificationHandlerImpl implements a {
    private final String tag = "RichPush_4.3.2_RichNotificationHandlerImpl";

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
        if (r1 != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:16:0x0060, B:19:0x0071, B:22:0x007b, B:27:0x008c, B:28:0x0093, B:32:0x00e1, B:39:0x00ee, B:41:0x00f6, B:43:0x00fc, B:45:0x0104, B:50:0x010f, B:54:0x0118, B:56:0x011c, B:61:0x0135, B:68:0x0150, B:70:0x0164, B:72:0x0168, B:74:0x016e, B:77:0x017f, B:78:0x0187, B:81:0x01b9, B:97:0x01df, B:105:0x01fb, B:106:0x01fe, B:107:0x0201, B:89:0x01cd, B:84:0x01c4, B:69:0x0157, B:35:0x00e7, B:31:0x00df, B:25:0x0085), top: B:111:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:16:0x0060, B:19:0x0071, B:22:0x007b, B:27:0x008c, B:28:0x0093, B:32:0x00e1, B:39:0x00ee, B:41:0x00f6, B:43:0x00fc, B:45:0x0104, B:50:0x010f, B:54:0x0118, B:56:0x011c, B:61:0x0135, B:68:0x0150, B:70:0x0164, B:72:0x0168, B:74:0x016e, B:77:0x017f, B:78:0x0187, B:81:0x01b9, B:97:0x01df, B:105:0x01fb, B:106:0x01fe, B:107:0x0201, B:89:0x01cd, B:84:0x01c4, B:69:0x0157, B:35:0x00e7, B:31:0x00df, B:25:0x0085), top: B:111:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:16:0x0060, B:19:0x0071, B:22:0x007b, B:27:0x008c, B:28:0x0093, B:32:0x00e1, B:39:0x00ee, B:41:0x00f6, B:43:0x00fc, B:45:0x0104, B:50:0x010f, B:54:0x0118, B:56:0x011c, B:61:0x0135, B:68:0x0150, B:70:0x0164, B:72:0x0168, B:74:0x016e, B:77:0x017f, B:78:0x0187, B:81:0x01b9, B:97:0x01df, B:105:0x01fb, B:106:0x01fe, B:107:0x0201, B:89:0x01cd, B:84:0x01c4, B:69:0x0157, B:35:0x00e7, B:31:0x00df, B:25:0x0085), top: B:111:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:16:0x0060, B:19:0x0071, B:22:0x007b, B:27:0x008c, B:28:0x0093, B:32:0x00e1, B:39:0x00ee, B:41:0x00f6, B:43:0x00fc, B:45:0x0104, B:50:0x010f, B:54:0x0118, B:56:0x011c, B:61:0x0135, B:68:0x0150, B:70:0x0164, B:72:0x0168, B:74:0x016e, B:77:0x017f, B:78:0x0187, B:81:0x01b9, B:97:0x01df, B:105:0x01fb, B:106:0x01fe, B:107:0x0201, B:89:0x01cd, B:84:0x01c4, B:69:0x0157, B:35:0x00e7, B:31:0x00df, B:25:0x0085), top: B:111:0x0060 }] */
    @Override // nj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c buildTemplate(Context context, b metaData, p sdkInstance) {
        o j10;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        long j11;
        k kVar;
        boolean z12;
        String str3;
        boolean z13;
        boolean z14;
        long j12;
        n nVar;
        i.g(context, "context");
        i.g(metaData, "metaData");
        i.g(sdkInstance, "sdkInstance");
        sj.o.f31622a.getClass();
        LinkedHashMap linkedHashMap = sj.o.f31623b;
        n nVar2 = (n) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (nVar2 == null) {
            synchronized (n.class) {
                nVar = (n) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (nVar == null) {
                    nVar = new n(sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, nVar);
            }
            nVar2 = nVar;
        }
        d0 d0Var = new d0();
        pj.b bVar = metaData.f22066a;
        p sdkInstance2 = nVar2.f31621a;
        i.g(sdkInstance2, "sdkInstance");
        g gVar = sdkInstance2.f20105d;
        try {
            g.b(gVar, 0, new e0(d0Var), 3);
            boolean d10 = z.d(bVar, sdkInstance2);
            Bundle bundle = bVar.f28533i;
            if (!d10) {
                return new c(false, false);
            }
            String string = bundle.getString("moeFeatures");
            if (string == null) {
                j10 = null;
            } else {
                j10 = d.j(string);
            }
            if (j10 == null) {
                return new c(false, false);
            }
            f fVar = j10.f34215d;
            g.b(sdkInstance2.f20105d, 0, new f0(d0Var, j10), 3);
            sj.b.a(j10, metaData, sdkInstance2);
            String templateName = j10.f34212a;
            i.g(templateName, "templateName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("templateName", templateName);
            jSONObject.put("cardId", -1);
            jSONObject.put("widgetId", -1);
            String jSONObject2 = jSONObject.toString();
            i.f(jSONObject2, "templateTrackingMetaToJson(meta).toString()");
            bundle.putString("moe_template_meta", jSONObject2);
            g.b(sdkInstance2.f20105d, 0, new g0(d0Var), 3);
            di.b.w(gVar, "RichPush_4.3.2_TemplateBuilder", bundle);
            if (fVar == null) {
                str = null;
            } else {
                str = fVar.f34192a;
            }
            h hVar = j10.f34216e;
            if (hVar == null) {
                str2 = null;
            } else {
                str2 = hVar.f34195a;
            }
            if (str != null && str2 != null && (i.b(str, "timer") || i.b(str2, "timer") || i.b(str, "timerWithProgressbar") || i.b(str2, "timerWithProgressbar"))) {
                z10 = true;
                if (!z10 && (j10 instanceof q)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!(j10 instanceof q)) {
                    uj.p pVar = ((q) j10).f34222j;
                    long j13 = pVar.f34220a;
                    long j14 = pVar.f34221b;
                    if (j13 >= 900 && j13 <= 43200) {
                        long j15 = 1000;
                        j12 = j13 * j15;
                        long currentTimeMillis = (j14 * j15) - System.currentTimeMillis();
                        if (currentTimeMillis > 5000) {
                            if (currentTimeMillis < j12) {
                                j12 = currentTimeMillis;
                            }
                            kVar = new k(j12, pVar);
                            j11 = -1;
                        }
                    }
                    j12 = -1;
                    kVar = new k(j12, pVar);
                    j11 = -1;
                } else {
                    j11 = -1;
                    kVar = new k(-1L, new uj.p(-1L, -1L));
                }
                if (!(j10 instanceof q) && kVar.f34201a == j11) {
                    g.b(sdkInstance2.f20105d, 0, new k0(kVar), 3);
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    return new c(false, false);
                }
                d0Var.b(z11, j10, metaData, sdkInstance2, kVar);
                boolean a10 = new tj.i(context, sdkInstance2, metaData, kVar, j10).a();
                boolean a11 = new j(context, sdkInstance2, metaData, kVar, j10).a();
                if (!a10 && !a11) {
                    return new c(false, false);
                }
                if (fVar == null) {
                    str3 = null;
                } else {
                    str3 = fVar.f34192a;
                }
                if (str3 == null) {
                    if (a10 && !a11) {
                        z13 = true;
                    }
                    z13 = false;
                } else {
                    if (!"imageBanner".equals(str3)) {
                        if (a10) {
                        }
                    }
                    z13 = false;
                }
                if (z13) {
                    g.b(sdkInstance2.f20105d, 0, new h0(d0Var), 3);
                    a11 = d0Var.a(context, j10, metaData, sdkInstance2);
                }
                if (!a10 && !a11) {
                    z14 = false;
                    if (z14) {
                        if (z11) {
                            sj.q.c(context, sdkInstance2, metaData, kVar, j10);
                        }
                        d0.c(context, metaData, j10);
                    }
                    return new c(a10, a11);
                }
                z14 = true;
                if (z14) {
                }
                return new c(a10, a11);
            }
            z10 = false;
            if (!z10) {
            }
            z11 = false;
            if (!(j10 instanceof q)) {
            }
            if (!(j10 instanceof q)) {
            }
            z12 = true;
            if (z12) {
            }
        } catch (Throwable th2) {
            gVar.a(1, th2, new i0(d0Var));
            return new c(false, false);
        }
    }

    @Override // nj.a
    public boolean isTemplateSupported(Context context, pj.b payload, p sdkInstance) {
        i.g(context, "context");
        i.g(payload, "payload");
        i.g(sdkInstance, "sdkInstance");
        if (!payload.f28532h.f28520d) {
            return false;
        }
        return z.d(payload, sdkInstance);
    }

    @Override // nj.a
    public void onLogout(Context context, p sdkInstance) {
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        try {
            if (e.f15075b == null) {
                synchronized (e.class) {
                    e eVar = e.f15075b;
                    if (eVar == null) {
                        eVar = new e();
                    }
                    e.f15075b = eVar;
                }
            }
            fj.d.f15071a.getClass();
            List<Bundle> f = fj.d.b(context, sdkInstance).f();
            g.b(sdkInstance.f20105d, 0, new a0(f), 3);
            Object systemService = context.getSystemService("notification");
            if (systemService != null) {
                NotificationManager notificationManager = (NotificationManager) systemService;
                for (Bundle bundle : f) {
                    notificationManager.cancel(bundle.getInt("MOE_NOTIFICATION_ID"));
                    sj.q.a(context, bundle, sdkInstance);
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        } catch (Throwable th2) {
            sdkInstance.f20105d.a(1, th2, b0.f31602u);
        }
    }

    @Override // nj.a
    public void onNotificationDismissed(Context context, Bundle payload, p sdkInstance) {
        i.g(context, "context");
        i.g(payload, "payload");
        i.g(sdkInstance, "sdkInstance");
        sj.q.a(context, payload, sdkInstance);
    }
}
