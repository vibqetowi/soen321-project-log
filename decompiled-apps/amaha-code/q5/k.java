package q5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import h5.g0;
import h5.p;
import h5.w;
import i5.i;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import w5.v;
/* compiled from: SessionLogger.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f29174a = new k();

    /* renamed from: b  reason: collision with root package name */
    public static final String f29175b = k.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static final long[] f29176c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(String str, String str2, Context context) {
        if (b6.a.b(k.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f29174a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", sc.b.K(context));
            i5.i iVar = new i5.i(str, str2);
            p pVar = p.f17269a;
            if (g0.b()) {
                iVar.d(bundle, "fb_mobile_activate_app");
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i5.i.f19861c;
            if (i.a.b() != i5.h.EXPLICIT_ONLY && !b6.a.b(iVar)) {
                String str3 = i5.f.f19852a;
                i5.f.c(i5.l.EXPLICIT);
            }
        } catch (Throwable th2) {
            b6.a.a(k.class, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #2 {all -> 0x0121, blocks: (B:7:0x000e, B:9:0x0014, B:11:0x001a, B:15:0x0024, B:19:0x0037, B:27:0x004f, B:29:0x0053, B:32:0x0058, B:36:0x0067, B:44:0x007f, B:58:0x00b0, B:64:0x00d3, B:68:0x00e5, B:70:0x0104, B:67:0x00e1, B:61:0x00cb, B:14:0x0020, B:16:0x0027, B:39:0x0071, B:22:0x0041, B:49:0x009d, B:51:0x00a2, B:73:0x010b), top: B:81:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #2 {all -> 0x0121, blocks: (B:7:0x000e, B:9:0x0014, B:11:0x001a, B:15:0x0024, B:19:0x0037, B:27:0x004f, B:29:0x0053, B:32:0x0058, B:36:0x0067, B:44:0x007f, B:58:0x00b0, B:64:0x00d3, B:68:0x00e5, B:70:0x0104, B:67:0x00e1, B:61:0x00cb, B:14:0x0020, B:16:0x0027, B:39:0x0071, B:22:0x0041, B:49:0x009d, B:51:0x00a2, B:73:0x010b), top: B:81:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1 A[Catch: all -> 0x0121, TryCatch #2 {all -> 0x0121, blocks: (B:7:0x000e, B:9:0x0014, B:11:0x001a, B:15:0x0024, B:19:0x0037, B:27:0x004f, B:29:0x0053, B:32:0x0058, B:36:0x0067, B:44:0x007f, B:58:0x00b0, B:64:0x00d3, B:68:0x00e5, B:70:0x0104, B:67:0x00e1, B:61:0x00cb, B:14:0x0020, B:16:0x0027, B:39:0x0071, B:22:0x0041, B:49:0x009d, B:51:0x00a2, B:73:0x010b), top: B:81:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, j jVar, String str2) {
        long longValue;
        long j10;
        int i6;
        l lVar;
        String lVar2;
        Long l2;
        long longValue2;
        Long l10;
        long longValue3;
        if (b6.a.b(k.class) || jVar == null) {
            return;
        }
        try {
            Long l11 = jVar.f29173e;
            if (l11 == null) {
                l11 = 0L;
            }
            if (l11 == null) {
                Long l12 = jVar.f29170b;
                if (l12 == null) {
                    longValue3 = 0;
                } else {
                    longValue3 = l12.longValue();
                }
                longValue = 0 - longValue3;
            } else {
                longValue = l11.longValue();
            }
            String str3 = f29175b;
            w wVar = w.APP_EVENTS;
            k kVar = f29174a;
            if (longValue < 0) {
                kVar.getClass();
                if (!b6.a.b(kVar)) {
                    v.a aVar = v.f36544d;
                    kotlin.jvm.internal.i.d(str3);
                    v.a.a(wVar, str3, "Clock skew detected");
                }
                longValue = 0;
            }
            Long l13 = jVar.f29169a;
            if (l13 != null && (l10 = jVar.f29170b) != null) {
                j10 = l10.longValue() - l13.longValue();
                if (j10 < 0) {
                    kVar.getClass();
                    if (!b6.a.b(kVar)) {
                        v.a aVar2 = v.f36544d;
                        kotlin.jvm.internal.i.d(str3);
                        v.a.a(wVar, str3, "Clock skew detected");
                    }
                    j10 = 0;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("fb_mobile_app_interruptions", jVar.f29172d);
                Locale locale = Locale.ROOT;
                Object[] objArr = new Object[1];
                if (b6.a.b(k.class)) {
                    i6 = 0;
                    while (true) {
                        long[] jArr = f29176c;
                        if (i6 >= jArr.length || jArr[i6] >= longValue) {
                            break;
                        }
                        i6++;
                    }
                } else {
                    i6 = 0;
                }
                objArr[0] = Integer.valueOf(i6);
                String format = String.format(locale, "session_quanta_%d", Arrays.copyOf(objArr, 1));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString("fb_mobile_time_between_sessions", format);
                lVar = jVar.f;
                if (lVar != null) {
                    lVar2 = lVar.toString();
                }
                lVar2 = "Unclassified";
                bundle.putString("fb_mobile_launch_source", lVar2);
                l2 = jVar.f29170b;
                if (l2 != null) {
                    longValue2 = 0;
                } else {
                    longValue2 = l2.longValue();
                }
                bundle.putLong("_logTime", longValue2 / 1000);
                i5.i iVar = new i5.i(str, str2);
                double d10 = j10 / 1000;
                p pVar = p.f17269a;
                if (!g0.b() && !b6.a.b(iVar)) {
                    iVar.e("fb_mobile_deactivate_app", Double.valueOf(d10), bundle, false, c.a());
                    return;
                }
            }
            j10 = 0;
            if (j10 < 0) {
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("fb_mobile_app_interruptions", jVar.f29172d);
            Locale locale2 = Locale.ROOT;
            Object[] objArr2 = new Object[1];
            if (b6.a.b(k.class)) {
            }
            objArr2[0] = Integer.valueOf(i6);
            String format2 = String.format(locale2, "session_quanta_%d", Arrays.copyOf(objArr2, 1));
            kotlin.jvm.internal.i.f(format2, "java.lang.String.format(locale, format, *args)");
            bundle2.putString("fb_mobile_time_between_sessions", format2);
            lVar = jVar.f;
            if (lVar != null) {
            }
            lVar2 = "Unclassified";
            bundle2.putString("fb_mobile_launch_source", lVar2);
            l2 = jVar.f29170b;
            if (l2 != null) {
            }
            bundle2.putLong("_logTime", longValue2 / 1000);
            i5.i iVar2 = new i5.i(str, str2);
            double d102 = j10 / 1000;
            p pVar2 = p.f17269a;
            if (!g0.b()) {
            }
        } catch (Throwable th2) {
            b6.a.a(k.class, th2);
        }
    }

    public final String a(Context context) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String n10 = kotlin.jvm.internal.i.n(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(n10, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String b10 = i.b(context);
            if (b10 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                kotlin.jvm.internal.i.f(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                b10 = i.a(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(n10, b10).apply();
            return b10;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
