package di;

import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.moengage.android.Constants;
import hh.g;
import ih.p;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import qg.w;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f12875u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f12875u = str;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(this.f12875u, "Image download failed: ");
        }
    }

    /* compiled from: Utils.kt */
    /* renamed from: di.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0187b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0187b f12876u = new C0187b();

        public C0187b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_Utils getAppVersionMeta() : ";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f12877u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_Utils hasPermission() : ";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f12878u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_Utils isGif() : ";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f12879u = new e();

        public e() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_Utils isMainThread() : ";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f12880u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f12880u = str;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" ------Start of bundle extras------", this.f12880u);
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f12881u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f12882v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f12883w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, Object obj) {
            super(0);
            this.f12881u = str;
            this.f12882v = str2;
            this.f12883w = obj;
        }

        @Override // ss.a
        public final String invoke() {
            return this.f12881u + " [ " + ((Object) this.f12882v) + " = " + this.f12883w + " ]";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f12884u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f12884u = str;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" -------End of bundle extras-------", this.f12884u);
        }
    }

    public static final s5 a(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        return new s5((String) sdkInstance.f20102a.f5133c, 7);
    }

    public static final Uri b(String urlString, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.i.g(urlString, "urlString");
        Uri.Builder buildUpon = Uri.parse(urlString).buildUpon();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
        }
        Uri build = buildUpon.build();
        kotlin.jvm.internal.i.f(build, "builder.build()");
        return build;
    }

    public static final boolean c(Context context) {
        PackageInfo packageInfo;
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.webview");
        if (Build.VERSION.SDK_INT >= 26) {
            if (hasSystemFeature) {
                try {
                    packageInfo = WebView.getCurrentWebViewPackage();
                } catch (Throwable unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }
        return hasSystemFeature;
    }

    public static final void d(Context context, String text) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(text, "text");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("coupon code", text));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    public static final Bitmap e(String imageUrl) {
        kotlin.jvm.internal.i.g(imageUrl, "imageUrl");
        Bitmap bitmap = null;
        try {
            InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(imageUrl));
            bitmap = BitmapFactory.decodeStream(openStream);
            if (openStream != null) {
                openStream.close();
            }
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new a(imageUrl));
        }
        return bitmap;
    }

    public static final ad.h f(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            kotlin.jvm.internal.i.f(str, "packageInfo.versionName");
            return new ad.h(str, packageInfo.versionCode, 3);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, C0187b.f12876u);
            return new ad.h("", 0, 3);
        }
    }

    public static final ih.h g(Context context) {
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        boolean z11 = true;
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object systemService = context.getSystemService("uimode");
            kotlin.jvm.internal.i.f(systemService, "context.getSystemService(serviceConstant)");
            if (((UiModeManager) systemService).getCurrentModeType() != 4) {
                z11 = false;
            }
            if (z11) {
                return ih.h.TV;
            }
            return ih.h.TABLET;
        }
        return ih.h.MOBILE;
    }

    public static final String h(String str) {
        boolean z10;
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && gv.n.H0(str, "tel:")) {
            String encode = Uri.encode("#");
            kotlin.jvm.internal.i.f(encode, "encode(\"#\")");
            return gv.n.F0(str, "#", encode);
        } else if (str == null) {
            return "";
        } else {
            return str;
        }
    }

    public static final String i(String string) {
        kotlin.jvm.internal.i.g(string, "string");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = string.getBytes(gv.a.f16927b);
        kotlin.jvm.internal.i.f(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        return n.a(messageDigest.digest());
    }

    public static PendingIntent j(Context context, int i6, Intent intent) {
        int i10;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(intent, "intent");
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(context, i6, intent, i10);
        kotlin.jvm.internal.i.f(activity, "getActivity(context, req…Code, intent, intentFlag)");
        return activity;
    }

    public static PendingIntent k(Context context, int i6, Intent intent) {
        int i10;
        kotlin.jvm.internal.i.g(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i6, intent, i10);
        kotlin.jvm.internal.i.f(broadcast, "getBroadcast(context, re…Code, intent, intentFlag)");
        return broadcast;
    }

    public static PendingIntent l(Context context, int i6, Intent intent) {
        int i10;
        kotlin.jvm.internal.i.g(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i6, intent, i10);
        kotlin.jvm.internal.i.f(service, "getService(context, requ…Code, intent, intentFlag)");
        return service;
    }

    public static final String m() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        sb2.append('-');
        sb2.append(UUID.randomUUID());
        return sb2.toString();
    }

    public static final int n() {
        try {
            return Constants.class.getField("SDK_VERSION").getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final int o() {
        return (int) (System.nanoTime() % 1000000);
    }

    public static final boolean p(Context context, String str) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, c.f12877u);
            return false;
        }
    }

    public static final boolean q(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        return p(context, "android.permission.POST_NOTIFICATIONS");
    }

    public static final boolean r(String imageUrl) {
        kotlin.jvm.internal.i.g(imageUrl, "imageUrl");
        try {
            String path = new URL(imageUrl).getPath();
            kotlin.jvm.internal.i.f(path, "path");
            if (!(!gv.n.B0(path))) {
                return false;
            }
            String lowerCase = path.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!gv.n.z0(lowerCase, ".gif")) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, d.f12878u);
            return false;
        }
    }

    public static final boolean s() {
        try {
            return kotlin.jvm.internal.i.b(Looper.myLooper(), Looper.getMainLooper());
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, e.f12879u);
            return false;
        }
    }

    public static final boolean t(String str) {
        boolean z10;
        if (str == null) {
            return true;
        }
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        int length = str.length();
        int i6 = 0;
        while (i6 < length && kotlin.jvm.internal.i.i(str.charAt(i6), 32) <= 0) {
            i6++;
        }
        while (length > i6) {
            int i10 = length - 1;
            if (kotlin.jvm.internal.i.i(str.charAt(i10), 32) > 0) {
                break;
            }
            length = i10;
        }
        if (length - i6 == 0) {
            return true;
        }
        return false;
    }

    public static final boolean u(Context context, p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        w.f29578a.getClass();
        return w.f(context, sdkInstance).a().f20107a;
    }

    public static final void v(Bundle bundle, String tag) {
        kotlin.jvm.internal.i.g(tag, "tag");
        Set<String> keySet = bundle.keySet();
        if (keySet != null && !keySet.isEmpty()) {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, new di.e(tag), 3);
            for (String str : keySet) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    hh.a aVar2 = hh.g.f17610d;
                    g.a.b(0, new di.f(tag, str, obj), 3);
                }
            }
            hh.a aVar3 = hh.g.f17610d;
            g.a.b(0, new di.g(tag), 3);
        }
    }

    public static final void w(hh.g logger, String tag, Bundle bundle) {
        Set<String> keySet;
        kotlin.jvm.internal.i.g(logger, "logger");
        kotlin.jvm.internal.i.g(tag, "tag");
        if (bundle != null && (keySet = bundle.keySet()) != null && !keySet.isEmpty()) {
            f fVar = new f(tag);
            hh.a aVar = hh.g.f17610d;
            logger.a(5, null, fVar);
            for (String str : keySet) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    logger.a(5, null, new g(tag, str, obj));
                }
            }
            logger.a(5, null, new h(tag));
        }
    }

    public static final void x(Context context, String str) {
        kotlin.jvm.internal.i.g(context, "context");
        if (gv.n.B0(str)) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }
}
