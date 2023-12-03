package ta;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class n2 extends m3 {
    public long A;
    public final long B;
    public List C;
    public String D;
    public int E;
    public String F;
    public String G;
    public String H;
    public long I;
    public String J;

    /* renamed from: w  reason: collision with root package name */
    public String f32760w;

    /* renamed from: x  reason: collision with root package name */
    public String f32761x;

    /* renamed from: y  reason: collision with root package name */
    public int f32762y;

    /* renamed from: z  reason: collision with root package name */
    public String f32763z;

    public n2(y3 y3Var, long j10) {
        super(y3Var);
        this.I = 0L;
        this.J = null;
        this.B = j10;
    }

    @Override // ta.m3
    public final boolean k() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129 A[Catch: IllegalStateException -> 0x014b, TryCatch #4 {IllegalStateException -> 0x014b, blocks: (B:47:0x0116, B:50:0x0121, B:52:0x0129, B:56:0x013b, B:59:0x0146, B:64:0x014e, B:55:0x0137, B:66:0x0152, B:68:0x0163, B:70:0x0168, B:69:0x0166), top: B:113:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152 A[Catch: IllegalStateException -> 0x014b, TryCatch #4 {IllegalStateException -> 0x014b, blocks: (B:47:0x0116, B:50:0x0121, B:52:0x0129, B:56:0x013b, B:59:0x0146, B:64:0x014e, B:55:0x0137, B:66:0x0152, B:68:0x0163, B:70:0x0168, B:69:0x0166), top: B:113:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        String str;
        String str2;
        String str3;
        boolean z10;
        int l2;
        List<String> list;
        Bundle o10;
        Integer valueOf;
        String t02;
        String str4;
        String str5;
        y3 y3Var = this.f32943u;
        Context context = y3Var.f32953u;
        String str6 = y3Var.M;
        String packageName = context.getPackageName();
        Context context2 = y3Var.f32953u;
        PackageManager packageManager = context2.getPackageManager();
        w2 w2Var = y3Var.C;
        String str7 = "Unknown";
        int i6 = LinearLayoutManager.INVALID_OFFSET;
        String str8 = "";
        String str9 = "unknown";
        if (packageManager == null) {
            y3.k(w2Var);
            w2Var.f32925z.c(w2.q(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            try {
                str9 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                y3.k(w2Var);
                w2Var.f32925z.c(w2.q(packageName), "Error retrieving app installer package name. appId");
            }
            if (str9 == null) {
                str9 = "manual_install";
            } else if ("com.android.vending".equals(str9)) {
                str9 = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (TextUtils.isEmpty(applicationLabel)) {
                        str2 = "Unknown";
                    } else {
                        str2 = applicationLabel.toString();
                    }
                    try {
                        str7 = packageInfo.versionName;
                        i6 = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str7;
                        str7 = str2;
                        y3.k(w2Var);
                        w2Var.f32925z.d("Error retrieving package info. appId, appName", w2.q(packageName), str7);
                        str7 = str;
                        this.f32760w = packageName;
                        this.f32763z = str9;
                        this.f32761x = str7;
                        this.f32762y = i6;
                        this.A = 0L;
                        str3 = y3Var.f32954v;
                        if (TextUtils.isEmpty(str3)) {
                        }
                        z10 = false;
                        l2 = y3Var.l();
                        switch (l2) {
                        }
                        this.F = "";
                        this.G = "";
                        if (z10) {
                        }
                        list = null;
                        t02 = kotlin.jvm.internal.h.t0(context2, str6);
                        if (true != TextUtils.isEmpty(t02)) {
                        }
                        this.F = str8;
                        if (!TextUtils.isEmpty(t02)) {
                        }
                        if (l2 == 0) {
                        }
                        this.C = null;
                        f fVar = y3Var.A;
                        fVar.getClass();
                        v9.o.e("analytics.safelisted_events");
                        o10 = fVar.o();
                        y3 y3Var2 = fVar.f32943u;
                        if (o10 != null) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        if (list != null) {
                        }
                        this.C = list;
                        if (packageManager == null) {
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.f32760w = packageName;
        this.f32763z = str9;
        this.f32761x = str7;
        this.f32762y = i6;
        this.A = 0L;
        str3 = y3Var.f32954v;
        if (TextUtils.isEmpty(str3) && "am".equals(y3Var.f32955w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        l2 = y3Var.l();
        switch (l2) {
            case 0:
                y3.k(w2Var);
                w2Var.H.b("App measurement collection enabled");
                break;
            case 1:
                y3.k(w2Var);
                w2Var.F.b("App measurement deactivated via the manifest");
                break;
            case 2:
                y3.k(w2Var);
                w2Var.H.b("App measurement deactivated via the init parameters");
                break;
            case 3:
                y3.k(w2Var);
                w2Var.F.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                y3.k(w2Var);
                w2Var.F.b("App measurement disabled via the manifest");
                break;
            case 5:
                y3.k(w2Var);
                w2Var.H.b("App measurement disabled via the init parameters");
                break;
            case 6:
                y3.k(w2Var);
                w2Var.E.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                y3.k(w2Var);
                w2Var.F.b("App measurement disabled via the global data collection setting");
                break;
            default:
                y3.k(w2Var);
                w2Var.F.b("App measurement disabled due to denied storage consent");
                break;
        }
        this.F = "";
        this.G = "";
        if (z10) {
            this.G = str3;
        }
        list = null;
        try {
            t02 = kotlin.jvm.internal.h.t0(context2, str6);
            if (true != TextUtils.isEmpty(t02)) {
                str8 = t02;
            }
            this.F = str8;
            if (!TextUtils.isEmpty(t02)) {
                v9.o.h(context2);
                Resources resources = context2.getResources();
                if (TextUtils.isEmpty(str6)) {
                    str6 = s3.a(context2);
                }
                int identifier = resources.getIdentifier("admob_app_id", "string", str6);
                if (identifier != 0) {
                    try {
                        str5 = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused4) {
                        str5 = null;
                    }
                    this.G = str5;
                }
                str5 = null;
                this.G = str5;
            }
            if (l2 == 0) {
                y3.k(w2Var);
                u2 u2Var = w2Var.H;
                String str10 = this.f32760w;
                if (TextUtils.isEmpty(this.F)) {
                    str4 = this.G;
                } else {
                    str4 = this.F;
                }
                u2Var.d("App measurement enabled for app package, google app id", str10, str4);
            }
        } catch (IllegalStateException e10) {
            y3.k(w2Var);
            w2Var.f32925z.d("Fetching Google App Id failed with exception. appId", w2.q(packageName), e10);
        }
        this.C = null;
        f fVar2 = y3Var.A;
        fVar2.getClass();
        v9.o.e("analytics.safelisted_events");
        o10 = fVar2.o();
        y3 y3Var22 = fVar2.f32943u;
        if (o10 != null) {
            w2 w2Var2 = y3Var22.C;
            y3.k(w2Var2);
            w2Var2.f32925z.b("Failed to load metadata: Metadata bundle is null");
        } else if (o10.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(o10.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = y3Var22.f32953u.getResources().getStringArray(valueOf.intValue());
                    if (stringArray != null) {
                        list = Arrays.asList(stringArray);
                    }
                } catch (Resources.NotFoundException e11) {
                    w2 w2Var3 = y3Var22.C;
                    y3.k(w2Var3);
                    w2Var3.f32925z.c(e11, "Failed to load string array from metadata: resource not found");
                }
            }
            if (list != null) {
                if (list.isEmpty()) {
                    y3.k(w2Var);
                    w2Var.E.b("Safelisted event list is empty. Ignoring");
                } else {
                    for (String str11 : list) {
                        k6 k6Var = y3Var.F;
                        y3.i(k6Var);
                        if (!k6Var.N("safelisted event", str11)) {
                        }
                    }
                }
                if (packageManager == null) {
                    this.E = ca.a.K0(context2) ? 1 : 0;
                    return;
                } else {
                    this.E = 0;
                    return;
                }
            }
            this.C = list;
            if (packageManager == null) {
            }
        }
        valueOf = null;
        if (valueOf != null) {
        }
        if (list != null) {
        }
        this.C = list;
        if (packageManager == null) {
        }
    }

    public final String m() {
        i();
        v9.o.h(this.f32760w);
        return this.f32760w;
    }

    public final String n() {
        h();
        i();
        v9.o.h(this.F);
        return this.F;
    }

    public final void o() {
        String format;
        String str;
        h();
        y3 y3Var = this.f32943u;
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        boolean f = j3Var.n().f(g.ANALYTICS_STORAGE);
        w2 w2Var = y3Var.C;
        if (!f) {
            y3.k(w2Var);
            w2Var.G.b("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            k6 k6Var = y3Var.F;
            y3.i(k6Var);
            k6Var.q().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        y3.k(w2Var);
        Object[] objArr = new Object[1];
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        objArr[0] = str;
        w2Var.G.b(String.format("Resetting session stitching token to %s", objArr));
        this.H = format;
        y3Var.H.getClass();
        this.I = System.currentTimeMillis();
    }
}
