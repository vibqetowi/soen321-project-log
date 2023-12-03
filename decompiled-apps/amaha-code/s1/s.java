package s1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.gms.common.api.a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipInputStream;
import je.b1;
import k9.e;
import org.json.JSONObject;
/* compiled from: NavDeepLinkRequest.kt */
/* loaded from: classes.dex */
public final class s implements v4.b, com.google.android.exoplayer2.source.l, com.google.android.gms.common.api.internal.n, ic.c, je.b0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31223u;

    /* renamed from: v  reason: collision with root package name */
    public Object f31224v;

    /* renamed from: w  reason: collision with root package name */
    public Object f31225w;

    /* renamed from: x  reason: collision with root package name */
    public Object f31226x;

    public /* synthetic */ s(int i6, Object obj, Object obj2, Object obj3) {
        this.f31223u = i6;
        this.f31224v = obj;
        this.f31225w = obj2;
        this.f31226x = obj3;
    }

    public static void k(rd.a aVar, ud.g gVar) {
        l(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.f34018a);
        l(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        l(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.5");
        l(aVar, "Accept", "application/json");
        l(aVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f34019b);
        l(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.f34020c);
        l(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f34021d);
        l(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((nd.h0) gVar.f34022e).c());
    }

    public static void l(rd.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f30661c.put(str, str2);
        }
    }

    public static String r(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    public static Method v(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return v(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public static HashMap w(ud.g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f34024h);
        hashMap.put("display_version", gVar.f34023g);
        hashMap.put("source", Integer.toString(gVar.f34025i));
        String str = gVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final JSONObject A(ad.h hVar) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("Settings response code was: ");
        int i6 = hVar.f504a;
        sb2.append(i6);
        ((com.google.android.gms.internal.cast.w) this.f31226x).h(sb2.toString());
        if (i6 != 200 && i6 != 201 && i6 != 202 && i6 != 203) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            String str = hVar.f505b;
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                ((com.google.android.gms.internal.cast.w) this.f31226x).j("Failed to parse settings JSON from " + ((String) this.f31225w), e10);
                ((com.google.android.gms.internal.cast.w) this.f31226x).j("Settings response " + str, null);
                return null;
            }
        }
        StringBuilder u10 = defpackage.c.u("Settings request failed; (status: ", i6, ") from ");
        u10.append((String) this.f31225w);
        String sb3 = u10.toString();
        if (!((com.google.android.gms.internal.cast.w) this.f31226x).d(6)) {
            return null;
        }
        Log.e("FirebaseCrashlytics", sb3, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r6.f33872d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
        if (r6.f33872d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(b9.f fVar, Uri uri, Map map, long j10, long j11, u7.j jVar) {
        u7.e eVar = new u7.e(fVar, j10, j11);
        this.f31226x = eVar;
        if (((u7.h) this.f31225w) != null) {
            return;
        }
        u7.h[] d10 = ((u7.k) this.f31224v).d(uri, map);
        boolean z10 = true;
        if (d10.length == 1) {
            this.f31225w = d10[0];
        } else {
            int length = d10.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                u7.h hVar = d10[i6];
                try {
                } catch (EOFException unused) {
                    if (((u7.h) this.f31225w) == null) {
                    }
                } catch (Throwable th2) {
                    if (((u7.h) this.f31225w) == null && eVar.f33872d != j10) {
                        z10 = false;
                    }
                    sc.b.C(z10);
                    eVar.f = 0;
                    throw th2;
                }
                if (hVar.b(eVar)) {
                    this.f31225w = hVar;
                    eVar.f = 0;
                    break;
                }
                if (((u7.h) this.f31225w) == null) {
                }
                boolean z11 = true;
                sc.b.C(z11);
                eVar.f = 0;
                i6++;
            }
            if (((u7.h) this.f31225w) == null) {
                int i10 = c9.w.f5205a;
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < d10.length; i11++) {
                    sb2.append(d10[i11].getClass().getSimpleName());
                    if (i11 < d10.length - 1) {
                        sb2.append(", ");
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(ri.e.c(sb3, 58));
                sb4.append("None of the available extractors (");
                sb4.append(sb3);
                sb4.append(") could read the stream.");
                String sb5 = sb4.toString();
                uri.getClass();
                throw new UnrecognizedInputFormatException(sb5);
            }
        }
        ((u7.h) this.f31225w).f(jVar);
    }

    public final Object C(Object obj, Object... objArr) {
        Method u10 = u(obj.getClass());
        if (u10 != null) {
            try {
                return u10.invoke(obj, objArr);
            } catch (IllegalAccessException e10) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + u10);
                assertionError.initCause(e10);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + ((String) this.f31225w) + " not supported for object " + obj);
    }

    public final void D(Object obj, Object... objArr) {
        try {
            Method u10 = u(obj.getClass());
            if (u10 != null) {
                try {
                    u10.invoke(obj, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object E(Object obj, Object... objArr) {
        try {
            return C(obj, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean F(ke.i iVar) {
        boolean z10;
        boolean equals;
        if (((je.t) this.f31225w).f21943e.f21959b.d(iVar)) {
            return true;
        }
        Iterator it = ((je.t) this.f31225w).f21940b.values().iterator();
        while (true) {
            if (it.hasNext()) {
                je.s sVar = (je.s) it.next();
                sVar.getClass();
                Iterator<je.c> iteratorFrom = sVar.f21916b.iteratorFrom(new je.c(0, iVar));
                if (!iteratorFrom.hasNext()) {
                    equals = false;
                    continue;
                } else {
                    equals = iteratorFrom.next().f21804a.equals(iVar);
                    continue;
                }
                if (equals) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return true;
        }
        nd.z zVar = (nd.z) this.f31224v;
        if (zVar != null && zVar.d(iVar)) {
            return true;
        }
        return false;
    }

    public final void G(String str, boolean z10) {
        ((SharedPreferences) this.f31226x).edit().putBoolean(str, z10).apply();
    }

    public final void H(int i6, String str) {
        ((SharedPreferences) this.f31226x).edit().putInt(str, i6).apply();
    }

    public final void I(long j10, String str) {
        ((SharedPreferences) this.f31226x).edit().putLong(str, j10).apply();
    }

    public final void J(String str, String value) {
        kotlin.jvm.internal.i.g(value, "value");
        ((SharedPreferences) this.f31226x).edit().putString(str, value).apply();
    }

    public final void K(String str) {
        ((SharedPreferences) this.f31226x).edit().remove(str).apply();
    }

    public final le.f L(ke.i iVar, le.l lVar) {
        le.d dVar = (le.d) this.f31225w;
        if (dVar != null) {
            return new le.k(iVar, (ke.o) this.f31224v, dVar, lVar, (List) this.f31226x);
        }
        return new le.n(iVar, (ke.o) this.f31224v, lVar, (List) this.f31226x);
    }

    public final void M(int i6, String str, String str2) {
        ((Map) this.f31224v).put(str, str2);
        ((Map) this.f31225w).put(str2, str);
        ((Map) this.f31226x).put(str, Integer.valueOf(i6));
    }

    public final int N(String str) {
        Integer num = (Integer) ((Map) this.f31226x).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // ic.c, mc.a
    public final Object a() {
        Object a10 = ((ic.c) this.f31224v).a();
        hc.e eVar = (hc.e) ((ic.c) this.f31225w).a();
        Context context = ((hc.h) ((ic.c) this.f31226x)).f17379u.f8726u;
        if (context != null) {
            return new hc.g((hc.k) a10, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // je.b0
    public final void b() {
        je.u uVar = ((je.t) this.f31225w).f21944g;
        ArrayList arrayList = new ArrayList();
        for (ke.i iVar : (Set) this.f31226x) {
            if (!F(iVar)) {
                arrayList.add(iVar);
            }
        }
        uVar.f(arrayList);
        this.f31226x = null;
    }

    @Override // je.b0
    public final void c() {
        this.f31226x = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        switch (this.f31223u) {
            case 11:
                s sVar = new s(((com.google.android.gms.internal.measurement.b) this.f31224v).clone());
                for (com.google.android.gms.internal.measurement.b bVar : (List) this.f31226x) {
                    ((List) sVar.f31226x).add(bVar.clone());
                }
                return sVar;
            default:
                return super.clone();
        }
    }

    @Override // je.b0
    public final long d() {
        return -1L;
    }

    @Override // je.b0
    public final void e(ke.i iVar) {
        if (F(iVar)) {
            ((Set) this.f31226x).remove(iVar);
        } else {
            ((Set) this.f31226x).add(iVar);
        }
    }

    @Override // je.b0
    public final void f(ke.i iVar) {
        ((Set) this.f31226x).add(iVar);
    }

    @Override // je.b0
    public final void g(ke.i iVar) {
        ((Set) this.f31226x).remove(iVar);
    }

    @Override // je.b0
    public final void h(nd.z zVar) {
        this.f31224v = zVar;
    }

    @Override // je.b0
    public final void i(ke.i iVar) {
        ((Set) this.f31226x).add(iVar);
    }

    @Override // je.b0
    public final void j(b1 b1Var) {
        je.v vVar = ((je.t) this.f31225w).f21943e;
        Iterator<ke.i> it = vVar.d(b1Var.f21797b).iterator();
        while (it.hasNext()) {
            ((Set) this.f31226x).add(it.next());
        }
        vVar.f21958a.remove(b1Var.f21796a);
        vVar.f21959b.l(b1Var.f21797b);
    }

    public final a3.p m() {
        m3.c.a();
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL((String) this.f31225w).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                a3.p x10 = x(httpURLConnection);
                V v10 = x10.f268a;
                m3.c.a();
                return x10;
            }
            String r = r(httpURLConnection);
            return new a3.p(new IllegalArgumentException("Unable to fetch " + ((String) this.f31225w) + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + r));
        } catch (Exception e10) {
            return new a3.p(e10);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // v4.b
    public final k4.v n(k4.v vVar, h4.g gVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((v4.b) this.f31225w).n(r4.c.c(((BitmapDrawable) drawable).getBitmap(), (l4.d) this.f31224v), gVar);
        }
        if (drawable instanceof GifDrawable) {
            return ((v4.b) this.f31226x).n(vVar, gVar);
        }
        return null;
    }

    public final boolean o(String str, boolean z10) {
        return ((SharedPreferences) this.f31226x).getBoolean(str, z10);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void p(a.e eVar, Object obj) {
        k9.f0 f0Var = (k9.f0) this.f31224v;
        ya.i<e.a> iVar = (ya.i) obj;
        f0Var.h();
        p9.e eVar2 = (p9.e) ((p9.z) eVar).y();
        Parcel z10 = eVar2.z();
        z10.writeString((String) this.f31225w);
        com.google.android.gms.internal.cast.d.b(z10, (k9.g) this.f31226x);
        eVar2.S1(z10, 13);
        synchronized (f0Var.r) {
            if (f0Var.f23123o != null) {
                f0Var.i(2477);
            }
            f0Var.f23123o = iVar;
        }
    }

    public final long q() {
        Object obj = this.f31226x;
        if (((u7.i) obj) != null) {
            return ((u7.i) obj).getPosition();
        }
        return -1L;
    }

    public final int s(String str, int i6) {
        return ((SharedPreferences) this.f31226x).getInt(str, i6);
    }

    public final long t(String str, long j10) {
        return ((SharedPreferences) this.f31226x).getLong(str, j10);
    }

    public final String toString() {
        switch (this.f31223u) {
            case 0:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                if (((Uri) this.f31224v) != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf((Uri) this.f31224v));
                }
                if (((String) this.f31225w) != null) {
                    sb2.append(" action=");
                    sb2.append((String) this.f31225w);
                }
                if (((String) this.f31226x) != null) {
                    sb2.append(" mimetype=");
                    sb2.append((String) this.f31226x);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                kotlin.jvm.internal.i.f(sb3, "sb.toString()");
                return sb3;
            case 24:
                return "CampaignData(campaignId=" + ((String) this.f31225w) + ", campaignName=" + ((String) this.f31226x) + ", campaignContext=" + ((aj.a) this.f31224v) + ')';
            default:
                return super.toString();
        }
    }

    public final Method u(Class cls) {
        Method v10;
        Class cls2;
        String str = (String) this.f31225w;
        if (str == null || ((v10 = v(cls, str, (Class[]) this.f31226x)) != null && (cls2 = (Class) this.f31224v) != null && !cls2.isAssignableFrom(v10.getReturnType()))) {
            return null;
        }
        return v10;
    }

    public final a3.p x(HttpURLConnection httpURLConnection) {
        j3.a aVar;
        a3.p<a3.c> b10;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            m3.c.a();
            aVar = j3.a.ZIP;
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(((androidx.appcompat.widget.l) this.f31226x).y(httpURLConnection.getInputStream(), aVar)));
            try {
                b10 = a3.d.g(zipInputStream, (String) this.f31225w);
            } finally {
                m3.g.b(zipInputStream);
            }
        } else {
            m3.c.a();
            aVar = j3.a.JSON;
            b10 = a3.d.b(new FileInputStream(new File(((androidx.appcompat.widget.l) this.f31226x).y(httpURLConnection.getInputStream(), aVar).getAbsolutePath())), (String) this.f31225w);
        }
        if (b10.f268a != null) {
            androidx.appcompat.widget.l lVar = (androidx.appcompat.widget.l) this.f31226x;
            File file = new File(((Context) lVar.f1471v).getCacheDir(), androidx.appcompat.widget.l.k((String) lVar.f1472w, aVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            m3.c.a();
            if (!renameTo) {
                m3.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return b10;
    }

    public final String y(String str, String str2) {
        return ((SharedPreferences) this.f31226x).getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(Object obj, Object obj2) {
        n3.b bVar = (n3.b) this.f31224v;
        bVar.f25874a = obj;
        bVar.f25875b = obj2;
        return this.f31226x;
    }

    public s(aj.a campaignContext, String campaignId, String campaignName) {
        this.f31223u = 24;
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        kotlin.jvm.internal.i.g(campaignName, "campaignName");
        kotlin.jvm.internal.i.g(campaignContext, "campaignContext");
        this.f31225w = campaignId;
        this.f31226x = campaignName;
        this.f31224v = campaignContext;
    }

    public s(Context context, c9.d instanceMeta) {
        this.f31223u = 22;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(instanceMeta, "instanceMeta");
        this.f31224v = context;
        this.f31225w = instanceMeta;
        SharedPreferences sharedPreferences = context.getSharedPreferences(instanceMeta.f5132b ? "pref_moe" : kotlin.jvm.internal.i.n((String) instanceMeta.f5133c, "pref_moe_"), 0);
        kotlin.jvm.internal.i.f(sharedPreferences, "context.getSharedPrefere…a), Context.MODE_PRIVATE)");
        this.f31226x = sharedPreferences;
    }

    public s(gt.h classifierDescriptor, List arguments, s sVar) {
        this.f31223u = 28;
        kotlin.jvm.internal.i.g(classifierDescriptor, "classifierDescriptor");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        this.f31224v = classifierDescriptor;
        this.f31225w = arguments;
        this.f31226x = sVar;
    }

    public s(String str, df.b bVar, int i6) {
        com.google.android.gms.internal.cast.w wVar = com.google.android.gms.internal.cast.w.A;
        this.f31223u = 14;
        if (str != null) {
            this.f31226x = wVar;
            this.f31224v = bVar;
            this.f31225w = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public s(List list, com.google.android.gms.internal.p000firebaseauthapi.s sVar, qh.a sdkIdentifiers) {
        this.f31223u = 21;
        kotlin.jvm.internal.i.g(sdkIdentifiers, "sdkIdentifiers");
        this.f31224v = list;
        this.f31225w = sVar;
        this.f31226x = sdkIdentifiers;
    }

    public s(m9.g gVar) {
        this.f31223u = 8;
        this.f31226x = gVar;
        this.f31225w = new AtomicLong((p9.a.f28028b.nextLong() & 65535) * 10000);
    }

    public s(JSONObject deviceInfo, v.c cVar, JSONObject queryParams) {
        this.f31223u = 20;
        kotlin.jvm.internal.i.g(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.i.g(queryParams, "queryParams");
        this.f31224v = deviceInfo;
        this.f31225w = cVar;
        this.f31226x = queryParams;
    }

    public s(com.google.android.gms.internal.measurement.b bVar) {
        this.f31223u = 11;
        this.f31224v = bVar;
        this.f31225w = bVar.clone();
        this.f31226x = new ArrayList();
    }

    public s(int i6) {
        this.f31223u = i6;
        if (i6 == 10) {
            this.f31224v = new HashMap();
            this.f31225w = new HashMap();
            this.f31226x = new HashMap();
        } else if (i6 != 11) {
            this.f31224v = new ArrayList();
        } else {
            this.f31224v = new com.google.android.gms.internal.measurement.b("", 0L, null);
            this.f31225w = new com.google.android.gms.internal.measurement.b("", 0L, null);
            this.f31226x = new ArrayList();
        }
    }

    public s(List list) {
        this.f31223u = 2;
        this.f31226x = list;
        this.f31224v = new ArrayList(list.size());
        this.f31225w = new ArrayList(list.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((List) this.f31224v).add(((h3.f) list.get(i6)).f17105b.k());
            ((List) this.f31225w).add(((h3.f) list.get(i6)).f17106c.k());
        }
    }

    public s(yt.j jVar, mt.d dVar) {
        this.f31223u = 29;
        this.f31224v = jVar;
        this.f31225w = dVar;
        this.f31226x = new ConcurrentHashMap();
    }

    public s(String str, Uri uri, Bundle bundle) {
        this.f31223u = 18;
        this.f31225w = str;
        this.f31224v = uri;
        this.f31226x = bundle;
    }

    public s(a3.u uVar) {
        this.f31223u = 4;
        this.f31224v = new n3.b();
        this.f31226x = uVar;
    }

    public s(String str, String str2, JSONObject jSONObject) {
        this.f31223u = 23;
        this.f31225w = str;
        this.f31224v = jSONObject;
        this.f31226x = str2;
    }

    public s(je.t tVar) {
        this.f31223u = 17;
        this.f31225w = tVar;
    }

    public s(Context context, String str) {
        this.f31223u = 3;
        Context applicationContext = context.getApplicationContext();
        this.f31224v = applicationContext;
        this.f31225w = str;
        this.f31226x = new androidx.appcompat.widget.l(applicationContext, str);
    }

    public s(u7.k kVar) {
        this.f31223u = 7;
        this.f31224v = kVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Intent intent) {
        this(0, intent.getData(), intent.getAction(), intent.getType());
        this.f31223u = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(String str, df.b bVar) {
        this(str, bVar, 0);
        this.f31223u = 14;
    }

    public s(he.f0 f0Var) {
        this.f31223u = 15;
        this.f31224v = f0Var;
        this.f31225w = new HashSet();
        this.f31226x = new ArrayList();
    }
}
