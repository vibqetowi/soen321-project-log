package o5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import gv.r;
import h5.p;
import java.util.concurrent.atomic.AtomicBoolean;
import w5.l;
/* compiled from: InAppPurchaseManager.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f27163a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f27164b = new AtomicBoolean(false);

    public static final void a() {
        if (b6.a.b(h.class)) {
            return;
        }
        try {
            if (f27164b.get()) {
                if (f27163a.b()) {
                    l lVar = l.f36497a;
                    if (l.c(l.b.IapLoggingLib2)) {
                        d dVar = d.f27127a;
                        d.b(p.a());
                        return;
                    }
                }
                c.b();
            }
        } catch (Throwable th2) {
            b6.a.a(h.class, th2);
        }
    }

    public final boolean b() {
        if (b6.a.b(this)) {
            return false;
        }
        try {
            Context a10 = p.a();
            ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
            kotlin.jvm.internal.i.f(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            if (Integer.parseInt((String) r.a1(string, new String[]{"."}, 3, 2).get(0)) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }
}
