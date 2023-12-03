package sj;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: RichPushUtils.kt */
/* loaded from: classes.dex */
public final class z {

    /* compiled from: RichPushUtils.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f31640u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "RichPush_4.3.2_RichPushUtils getTemplateLayout() : Big layout selected";
        }
    }

    /* compiled from: RichPushUtils.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f31641u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "RichPush_4.3.2_RichPushUtils getTemplateLayout() : Big small selected";
        }
    }

    /* compiled from: RichPushUtils.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f31642u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10) {
            super(0);
            this.f31642u = z10;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(Boolean.valueOf(this.f31642u), "RichPush_4.3.2_RichPushUtils isTemplateSupported() : Template Supported? ");
        }
    }

    public static final boolean a() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static final String b(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        kotlin.jvm.internal.i.f(applicationInfo, "packageManager.getApplic…nager.GET_META_DATA\n    )");
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(int i6, int i10, ih.p sdkInstance) {
        boolean z10;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        th.a remoteConfig = sdkInstance.f20104c;
        kotlin.jvm.internal.i.g(remoteConfig, "remoteConfig");
        if (Build.VERSION.SDK_INT >= 24) {
            Set<String> set = remoteConfig.f33014e.f28440b;
            char[] cArr = di.n.f12900a;
            String str = Build.MANUFACTURER;
            kotlin.jvm.internal.i.f(str, "deviceManufacturer()");
            String upperCase = str.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (set.contains(upperCase)) {
                z10 = true;
                hh.g gVar = sdkInstance.f20105d;
                if (!z10) {
                    hh.g.b(gVar, 0, a.f31640u, 3);
                    return i10;
                }
                hh.g.b(gVar, 0, b.f31641u, 3);
                return i6;
            }
        }
        z10 = false;
        hh.g gVar2 = sdkInstance.f20105d;
        if (!z10) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:3|(2:4|5)|(1:7)(2:73|(1:75)(14:76|9|10|11|(1:13)(2:66|(1:68)(1:69))|14|(1:65)(1:18)|(1:(1:30)(1:23))|(1:64)(1:34)|(4:(1:63)(1:55)|(1:57)|59|(1:61))|38|(1:51)(1:46)|(1:48)|25))|8|9|10|11|(0)(0)|14|(1:16)|65|(0)|(1:32)|64|(1:36)|(1:53)|63|(0)|59|(0)|38|(1:40)|49|51|(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        r4.a(1, r11, new sj.e(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c5, code lost:
        if (is.u.Z1(sj.p.f31626b, r8) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d5, code lost:
        if (is.u.Z1(sj.p.f31626b, r8) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ff, code lost:
        if (r11 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:17:0x0052, B:20:0x0059, B:23:0x0069), top: B:85:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(pj.b payload, ih.p sdkInstance) {
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String string;
        String string2;
        kotlin.jvm.internal.i.g(payload, "payload");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        hh.g gVar = sdkInstance.f20105d;
        f fVar = new f(gVar);
        if (payload.f28532h.f28520d) {
            hh.g gVar2 = fVar.f31606a;
            Bundle bundle = payload.f28533i;
            z10 = true;
            String str2 = null;
            try {
                string2 = bundle.getString("moeFeatures");
            } catch (Throwable th2) {
                gVar2.a(1, th2, new d(fVar));
            }
            if (string2 != null) {
                JSONObject jSONObject = new JSONObject(string2).getJSONObject("richPush");
                if (jSONObject.has("collapsed")) {
                    str = jSONObject.getJSONObject("collapsed").getString("type");
                    string = bundle.getString("moeFeatures");
                    if (string == null) {
                        JSONObject jSONObject2 = new JSONObject(string).getJSONObject("richPush");
                        if (jSONObject2.has("expanded")) {
                            str2 = jSONObject2.getJSONObject("expanded").getString("type");
                        }
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (str == null && !gv.n.B0(str)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        if (str2 != null && !gv.n.B0(str2)) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                    }
                    if (str2 == null && !gv.n.B0(str2)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12 || !is.u.Z1(p.f31625a, str)) {
                        if (str == null && !gv.n.B0(str)) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                        }
                        if (!is.u.Z1(p.f31625a, str)) {
                        }
                    }
                    if ((kotlin.jvm.internal.i.b(str, "timer") && !kotlin.jvm.internal.i.b(str2, "timer") && !kotlin.jvm.internal.i.b(str, "timerWithProgressbar") && !kotlin.jvm.internal.i.b(str2, "timerWithProgressbar")) || i6 >= 24) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z16 = z14 ? true : true;
                    z16 = false;
                }
            }
            str = null;
            string = bundle.getString("moeFeatures");
            if (string == null) {
            }
            int i62 = Build.VERSION.SDK_INT;
            if (str == null) {
            }
            z11 = true;
            if (z11) {
            }
            if (str2 == null) {
            }
            z12 = true;
            if (z12) {
            }
            if (str == null) {
            }
            z13 = true;
            if (z13) {
            }
            if (!is.u.Z1(p.f31625a, str)) {
            }
            if (kotlin.jvm.internal.i.b(str, "timer")) {
            }
            z14 = false;
            if (z14) {
            }
            z16 = false;
        }
        z10 = false;
        hh.g.b(gVar, 0, new c(z10), 3);
        return z10;
    }
}
