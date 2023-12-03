package h5;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.FacebookException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.utils.Constants;
import h5.t;
import h5.u;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.v;
/* compiled from: GraphRequest.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: j  reason: collision with root package name */
    public static final String f17287j;

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f17288k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile String f17289l;

    /* renamed from: a  reason: collision with root package name */
    public final h5.a f17290a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17291b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f17292c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f17293d;

    /* renamed from: e  reason: collision with root package name */
    public Object f17294e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public b f17295g;

    /* renamed from: h  reason: collision with root package name */
    public v f17296h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f17297i;

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final q f17298a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f17299b;

        public a(q qVar, Object obj) {
            this.f17298a = qVar;
            this.f17299b = obj;
        }
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public interface b {
        void a(u uVar);
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class c {
        public static final String a(Object obj) {
            String str = q.f17287j;
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (obj instanceof Date) {
                    String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    kotlin.jvm.internal.i.f(format, "iso8601DateFormat.format(value)");
                    return format;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return obj.toString();
        }

        public static HttpURLConnection b(URL url) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            if (uRLConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                if (q.f17289l == null) {
                    q.f17289l = defpackage.b.o(new Object[]{"FBAndroidSDK", "16.0.1"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
                    if (!w5.e0.A(null)) {
                        String format = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{q.f17289l, null}, 2));
                        kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                        q.f17289l = format;
                    }
                }
                httpURLConnection.setRequestProperty("User-Agent", q.f17289l);
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        public static ArrayList c(t tVar) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            ArrayList arrayList;
            w5.f0.c(tVar);
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = p(tVar);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                w5.e0.k(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    arrayList = d(tVar, httpURLConnection);
                } else {
                    int i6 = u.f17315e;
                    ArrayList a10 = u.a.a(tVar.f17313w, null, new FacebookException(exc));
                    m(tVar, a10);
                    arrayList = a10;
                }
                w5.e0.k(httpURLConnection);
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                w5.e0.k(httpURLConnection2);
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
            if ((r5 - r12.A.getTime()) > 86400000) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ArrayList d(t requests, HttpURLConnection connection) {
            Exception e10;
            InputStream inputStream;
            FacebookException e11;
            ArrayList a10;
            int size;
            ?? size2;
            kotlin.jvm.internal.i.g(connection, "connection");
            kotlin.jvm.internal.i.g(requests, "requests");
            int i6 = u.f17315e;
            w wVar = w.REQUESTS;
            Closeable closeable = null;
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    closeable = size2;
                    w5.e0.e(closeable);
                    throw th;
                }
            } catch (FacebookException e12) {
                e11 = e12;
                inputStream = null;
            } catch (Exception e13) {
                e10 = e13;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                w5.e0.e(closeable);
                throw th;
            }
            if (p.g()) {
                if (connection.getResponseCode() >= 400) {
                    inputStream = connection.getErrorStream();
                } else {
                    inputStream = connection.getInputStream();
                }
                try {
                    a10 = u.a.c(inputStream, connection, requests);
                } catch (FacebookException e14) {
                    e11 = e14;
                    v.a aVar = w5.v.f36544d;
                    p.i(wVar);
                    a10 = u.a.a(requests, connection, e11);
                    w5.e0.e(inputStream);
                    w5.e0.k(connection);
                    size = requests.size();
                    size2 = a10.size();
                    boolean z10 = true;
                    if (size == size2) {
                    }
                } catch (Exception e15) {
                    e10 = e15;
                    v.a aVar2 = w5.v.f36544d;
                    p.i(wVar);
                    a10 = u.a.a(requests, connection, new FacebookException(e10));
                    w5.e0.e(inputStream);
                    w5.e0.k(connection);
                    size = requests.size();
                    size2 = a10.size();
                    boolean z102 = true;
                    if (size == size2) {
                    }
                }
                w5.e0.e(inputStream);
                w5.e0.k(connection);
                size = requests.size();
                size2 = a10.size();
                boolean z1022 = true;
                if (size == size2) {
                    m(requests, a10);
                    h5.f a11 = h5.f.f.a();
                    h5.a aVar3 = a11.f17216c;
                    if (aVar3 != null) {
                        long time = new Date().getTime();
                        if (aVar3.f17181z.f17230u) {
                            if (time - a11.f17218e.getTime() > 3600000) {
                            }
                        }
                    }
                    z1022 = false;
                    if (z1022) {
                        if (kotlin.jvm.internal.i.b(Looper.getMainLooper(), Looper.myLooper())) {
                            a11.a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new g.v(a11, 11, null));
                        }
                    }
                    return a10;
                }
                String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(a10.size()), Integer.valueOf(size)}, 2));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
            Log.e("h5.u", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        }

        public static boolean e(Object obj) {
            if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof f)) {
                return false;
            }
            return true;
        }

        public static boolean f(Object obj) {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
                return false;
            }
            return true;
        }

        public static q g(h5.a aVar, String str, b bVar) {
            return new q(aVar, str, null, null, bVar, 32);
        }

        public static q h(h5.a aVar, String str, JSONObject jSONObject, b bVar) {
            q qVar = new q(aVar, str, null, v.POST, bVar, 32);
            qVar.f17292c = jSONObject;
            return qVar;
        }

        public static q i(String str, Bundle bundle, g6.e eVar) {
            return new q(null, str, bundle, v.POST, eVar, 32);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void j(JSONObject jSONObject, String str, d dVar) {
            String str2;
            boolean z10;
            boolean z11;
            Iterator<String> keys;
            boolean z12;
            Matcher matcher = q.f17288k.matcher(str);
            if (matcher.matches()) {
                str2 = matcher.group(1);
                kotlin.jvm.internal.i.f(str2, "matcher.group(1)");
            } else {
                str2 = str;
            }
            if (!gv.n.H0(str2, "me/") && !gv.n.H0(str2, "/me/")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                int O0 = gv.r.O0(str, ":", 0, false, 6);
                int O02 = gv.r.O0(str, "?", 0, false, 6);
                if (O0 > 3 && (O02 == -1 || O0 < O02)) {
                    z11 = true;
                    keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Object value = jSONObject.opt(key);
                        if (z11 && gv.n.A0(key, "image", true)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        kotlin.jvm.internal.i.f(key, "key");
                        kotlin.jvm.internal.i.f(value, "value");
                        k(key, value, dVar, z12);
                    }
                }
            }
            z11 = false;
            keys = jSONObject.keys();
            while (keys.hasNext()) {
            }
        }

        public static void k(String str, Object obj, d dVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String o10 = defpackage.b.o(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        kotlin.jvm.internal.i.f(opt, "jsonObject.opt(propertyName)");
                        k(o10, opt, dVar, z10);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    kotlin.jvm.internal.i.f(optString, "jsonObject.optString(\"id\")");
                    k(str, optString, dVar, z10);
                } else if (jSONObject.has(Constants.NOTIFICATION_URL)) {
                    String optString2 = jSONObject.optString(Constants.NOTIFICATION_URL);
                    kotlin.jvm.internal.i.f(optString2, "jsonObject.optString(\"url\")");
                    k(str, optString2, dVar, z10);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.i.f(jSONObject2, "jsonObject.toString()");
                    k(str, jSONObject2, dVar, z10);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i6 = 0;
                    while (true) {
                        int i10 = i6 + 1;
                        String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i6)}, 2));
                        kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i6);
                        kotlin.jvm.internal.i.f(opt2, "jsonArray.opt(i)");
                        k(format, opt2, dVar, z10);
                        if (i10 < length) {
                            i6 = i10;
                        } else {
                            return;
                        }
                    }
                }
            } else if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    kotlin.jvm.internal.i.f(format2, "iso8601DateFormat.format(date)");
                    dVar.a(str, format2);
                    return;
                }
                w5.e0 e0Var = w5.e0.f36453a;
                String str2 = q.f17287j;
                p pVar = p.f17269a;
            } else {
                dVar.a(str, obj.toString());
            }
        }

        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        public static void l(t tVar, w5.v vVar, int i6, URL url, OutputStream outputStream, boolean z10) {
            String b10;
            boolean z11;
            g gVar = new g(outputStream, vVar, z10);
            int i10 = 1;
            if (i6 == 1) {
                q qVar = (q) tVar.f17313w.get(0);
                HashMap hashMap = new HashMap();
                for (String key : qVar.f17293d.keySet()) {
                    Object obj = qVar.f17293d.get(key);
                    if (e(obj)) {
                        kotlin.jvm.internal.i.f(key, "key");
                        hashMap.put(key, new a(qVar, obj));
                    }
                }
                if (vVar != null) {
                    vVar.c();
                }
                Bundle bundle = qVar.f17293d;
                for (String key2 : bundle.keySet()) {
                    Object obj2 = bundle.get(key2);
                    if (f(obj2)) {
                        kotlin.jvm.internal.i.f(key2, "key");
                        gVar.g(key2, obj2, qVar);
                    }
                }
                if (vVar != null) {
                    vVar.c();
                }
                n(hashMap, gVar);
                JSONObject jSONObject = qVar.f17292c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    kotlin.jvm.internal.i.f(path, "url.path");
                    j(jSONObject, path, gVar);
                    return;
                }
                return;
            }
            Iterator<q> it = tVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    h5.a aVar = it.next().f17290a;
                    if (aVar != null) {
                        b10 = aVar.B;
                        break;
                    }
                } else {
                    String str = q.f17287j;
                    b10 = p.b();
                    break;
                }
            }
            if (b10.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                gVar.a("batch_app_id", b10);
                HashMap hashMap2 = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator<q> it2 = tVar.iterator();
                while (it2.hasNext()) {
                    q next = it2.next();
                    next.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    int i11 = w5.a0.f36434a;
                    Object[] objArr = new Object[i10];
                    objArr[0] = p.e();
                    String format = String.format("https://graph.%s", Arrays.copyOf(objArr, i10));
                    kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
                    String h10 = next.h(format);
                    next.a();
                    Uri parse = Uri.parse(next.b(h10, i10));
                    int i12 = 2;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = parse.getPath();
                    objArr2[i10] = parse.getQuery();
                    String format2 = String.format("%s?%s", Arrays.copyOf(objArr2, 2));
                    kotlin.jvm.internal.i.f(format2, "java.lang.String.format(format, *args)");
                    jSONObject2.put("relative_url", format2);
                    jSONObject2.put("method", next.f17296h);
                    h5.a aVar2 = next.f17290a;
                    if (aVar2 != null) {
                        v.a aVar3 = w5.v.f36544d;
                        String accessToken = aVar2.f17180y;
                        synchronized (aVar3) {
                            kotlin.jvm.internal.i.g(accessToken, "accessToken");
                            p.i(w.INCLUDE_ACCESS_TOKENS);
                            aVar3.d(accessToken);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it3 = next.f17293d.keySet().iterator();
                    while (true) {
                        boolean hasNext = it3.hasNext();
                        String str2 = q.f17287j;
                        if (!hasNext) {
                            break;
                        }
                        Object obj3 = next.f17293d.get(it3.next());
                        if (e(obj3)) {
                            Locale locale = Locale.ROOT;
                            Object[] objArr3 = new Object[i12];
                            objArr3[0] = "file";
                            objArr3[1] = Integer.valueOf(hashMap2.size());
                            String format3 = String.format(locale, "%s%d", Arrays.copyOf(objArr3, i12));
                            kotlin.jvm.internal.i.f(format3, "java.lang.String.format(locale, format, *args)");
                            arrayList.add(format3);
                            hashMap2.put(format3, new a(next, obj3));
                            i12 = 2;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                    }
                    JSONObject jSONObject3 = next.f17292c;
                    if (jSONObject3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        j(jSONObject3, format2, new r(arrayList2));
                        jSONObject2.put("body", TextUtils.join("&", arrayList2));
                    }
                    jSONArray.put(jSONObject2);
                    i10 = 1;
                }
                OutputStream outputStream2 = gVar.f17302a;
                if (!(outputStream2 instanceof c0)) {
                    String jSONArray2 = jSONArray.toString();
                    kotlin.jvm.internal.i.f(jSONArray2, "requestJsonArray.toString()");
                    gVar.a("batch", jSONArray2);
                } else {
                    c0 c0Var = (c0) outputStream2;
                    gVar.c("batch", null, null);
                    gVar.b("[", new Object[0]);
                    Iterator<q> it4 = tVar.iterator();
                    int i13 = 0;
                    while (it4.hasNext()) {
                        int i14 = i13 + 1;
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i13);
                        c0Var.a(it4.next());
                        if (i13 > 0) {
                            gVar.b(",%s", jSONObject4.toString());
                        } else {
                            gVar.b("%s", jSONObject4.toString());
                        }
                        i13 = i14;
                    }
                    gVar.b("]", new Object[0]);
                    w5.v vVar2 = gVar.f17303b;
                    if (vVar2 != null) {
                        String n10 = kotlin.jvm.internal.i.n("batch", "    ");
                        String jSONArray3 = jSONArray.toString();
                        kotlin.jvm.internal.i.f(jSONArray3, "requestJsonArray.toString()");
                        vVar2.a(jSONArray3, n10);
                    }
                }
                if (vVar != null) {
                    vVar.c();
                }
                n(hashMap2, gVar);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        public static void m(t requests, ArrayList arrayList) {
            Boolean valueOf;
            kotlin.jvm.internal.i.g(requests, "requests");
            int size = requests.size();
            ArrayList arrayList2 = new ArrayList();
            if (size > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    q qVar = (q) requests.f17313w.get(i6);
                    if (qVar.f17295g != null) {
                        arrayList2.add(new Pair(qVar.f17295g, arrayList.get(i6)));
                    }
                    if (i10 >= size) {
                        break;
                    }
                    i6 = i10;
                }
            }
            if (arrayList2.size() > 0) {
                g.v vVar = new g.v(arrayList2, 13, requests);
                Handler handler = requests.f17311u;
                if (handler == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(handler.post(vVar));
                }
                if (valueOf == null) {
                    vVar.run();
                }
            }
        }

        public static void n(HashMap hashMap, g gVar) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = q.f17287j;
                if (e(((a) entry.getValue()).f17299b)) {
                    gVar.g((String) entry.getKey(), ((a) entry.getValue()).f17299b, ((a) entry.getValue()).f17298a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void o(t tVar, HttpURLConnection httpURLConnection) {
            boolean z10;
            boolean z11;
            v vVar;
            boolean z12;
            FilterOutputStream gZIPOutputStream;
            w5.v vVar2 = new w5.v();
            int size = tVar.size();
            Iterator<q> it = tVar.iterator();
            loop0: while (true) {
                z10 = true;
                if (it.hasNext()) {
                    q next = it.next();
                    for (String str : next.f17293d.keySet()) {
                        if (e(next.f17293d.get(str))) {
                            z11 = false;
                            break loop0;
                        }
                    }
                } else {
                    z11 = true;
                    break;
                }
            }
            FilterOutputStream filterOutputStream = null;
            if (size == 1) {
                vVar = ((q) tVar.f17313w.get(0)).f17296h;
            } else {
                vVar = null;
            }
            v vVar3 = v.POST;
            if (vVar == null) {
                vVar = vVar3;
            }
            httpURLConnection.setRequestMethod(vVar.name());
            if (z11) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            } else {
                String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{q.f17287j}, 1));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
                httpURLConnection.setRequestProperty("Content-Type", format);
            }
            URL url = httpURLConnection.getURL();
            vVar2.c();
            vVar2.a(tVar.f17312v, "Id");
            kotlin.jvm.internal.i.f(url, "url");
            vVar2.a(url, "URL");
            String requestMethod = httpURLConnection.getRequestMethod();
            kotlin.jvm.internal.i.f(requestMethod, "connection.requestMethod");
            vVar2.a(requestMethod, "Method");
            String requestProperty = httpURLConnection.getRequestProperty("User-Agent");
            kotlin.jvm.internal.i.f(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            vVar2.a(requestProperty, "User-Agent");
            String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            kotlin.jvm.internal.i.f(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            vVar2.a(requestProperty2, "Content-Type");
            httpURLConnection.setConnectTimeout(0);
            httpURLConnection.setReadTimeout(0);
            if (vVar == vVar3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                vVar2.b();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                FilterOutputStream filterOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (z11) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(filterOutputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        if (filterOutputStream2 != null) {
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = filterOutputStream2;
                }
                try {
                    Iterator it2 = tVar.f17314x.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((t.a) it2.next()) instanceof t.b) {
                                break;
                            }
                        } else {
                            Iterator<q> it3 = tVar.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (it3.next().f17295g instanceof e) {
                                        break;
                                    }
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                    }
                    if (z10) {
                        a0 a0Var = new a0(tVar.f17311u);
                        l(tVar, null, size, url, a0Var, z11);
                        gZIPOutputStream = new b0(gZIPOutputStream, tVar, a0Var.f17183v, a0Var.f17186y);
                    }
                    try {
                        l(tVar, vVar2, size, url, gZIPOutputStream, z11);
                        gZIPOutputStream.close();
                        vVar2.b();
                    } catch (Throwable th3) {
                        th = th3;
                        filterOutputStream2 = gZIPOutputStream;
                        if (filterOutputStream2 != null) {
                            filterOutputStream2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    filterOutputStream = gZIPOutputStream;
                    filterOutputStream2 = filterOutputStream;
                    if (filterOutputStream2 != null) {
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }

        public static HttpURLConnection p(t tVar) {
            URL url;
            Iterator<q> it = tVar.iterator();
            while (it.hasNext()) {
                q next = it.next();
                if (v.GET == next.f17296h) {
                    w5.e0 e0Var = w5.e0.f36453a;
                    if (w5.e0.A(next.f17293d.getString("fields"))) {
                        v.a aVar = w5.v.f36544d;
                        w wVar = w.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder("GET requests for /");
                        String str = next.f17291b;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        v.a.c(wVar, "Request", sb2.toString());
                    }
                }
            }
            try {
                if (tVar.size() == 1) {
                    url = new URL(((q) tVar.f17313w.get(0)).g());
                } else {
                    int i6 = w5.a0.f36434a;
                    String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{p.e()}, 1));
                    kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
                    url = new URL(format);
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = b(url);
                    o(tVar, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    w5.e0.k(httpURLConnection);
                    throw new FacebookException("could not construct request body", e10);
                } catch (JSONException e11) {
                    w5.e0.k(httpURLConnection);
                    throw new FacebookException("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new FacebookException("could not construct URL for request", e12);
            }
        }
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public interface d {
        void a(String str, String str2);
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public interface e extends b {
        void b();
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class g implements d {

        /* renamed from: a  reason: collision with root package name */
        public final OutputStream f17302a;

        /* renamed from: b  reason: collision with root package name */
        public final w5.v f17303b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17304c = true;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f17305d;

        public g(OutputStream outputStream, w5.v vVar, boolean z10) {
            this.f17302a = outputStream;
            this.f17303b = vVar;
            this.f17305d = z10;
        }

        @Override // h5.q.d
        public final void a(String key, String value) {
            kotlin.jvm.internal.i.g(key, "key");
            kotlin.jvm.internal.i.g(value, "value");
            c(key, null, null);
            f("%s", value);
            h();
            w5.v vVar = this.f17303b;
            if (vVar != null) {
                vVar.a(value, kotlin.jvm.internal.i.n(key, "    "));
            }
        }

        public final void b(String str, Object... args) {
            kotlin.jvm.internal.i.g(args, "args");
            boolean z10 = this.f17305d;
            OutputStream outputStream = this.f17302a;
            if (!z10) {
                if (this.f17304c) {
                    Charset charset = gv.a.f16927b;
                    byte[] bytes = "--".getBytes(charset);
                    kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    String str2 = q.f17287j;
                    if (str2 != null) {
                        byte[] bytes2 = str2.getBytes(charset);
                        kotlin.jvm.internal.i.f(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream.write(bytes2);
                        byte[] bytes3 = "\r\n".getBytes(charset);
                        kotlin.jvm.internal.i.f(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream.write(bytes3);
                        this.f17304c = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                Object[] copyOf = Arrays.copyOf(args, args.length);
                byte[] bytes4 = defpackage.b.o(copyOf, copyOf.length, str, "java.lang.String.format(format, *args)").getBytes(gv.a.f16927b);
                kotlin.jvm.internal.i.f(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                return;
            }
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format, "UTF-8");
            kotlin.jvm.internal.i.f(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(gv.a.f16927b);
            kotlin.jvm.internal.i.f(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes5);
        }

        public final void c(String str, String str2, String str3) {
            if (!this.f17305d) {
                b("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    b("; filename=\"%s\"", str2);
                }
                f("", new Object[0]);
                if (str3 != null) {
                    f("%s: %s", "Content-Type", str3);
                }
                f("", new Object[0]);
                return;
            }
            byte[] bytes = defpackage.b.o(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)").getBytes(gv.a.f16927b);
            kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f17302a.write(bytes);
        }

        public final void d(String key, Uri contentUri, String str) {
            int j10;
            long j11;
            kotlin.jvm.internal.i.g(key, "key");
            kotlin.jvm.internal.i.g(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f17302a;
            if (outputStream instanceof a0) {
                w5.e0 e0Var = w5.e0.f36453a;
                Cursor cursor = null;
                try {
                    cursor = p.a().getContentResolver().query(contentUri, null, null, null, null);
                    if (cursor == null) {
                        j11 = 0;
                    } else {
                        int columnIndex = cursor.getColumnIndex("_size");
                        cursor.moveToFirst();
                        j11 = cursor.getLong(columnIndex);
                        cursor.close();
                    }
                    ((a0) outputStream).e(j11);
                    j10 = 0;
                } catch (Throwable th2) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            } else {
                InputStream openInputStream = p.a().getContentResolver().openInputStream(contentUri);
                w5.e0 e0Var2 = w5.e0.f36453a;
                j10 = w5.e0.j(openInputStream, outputStream) + 0;
            }
            f("", new Object[0]);
            h();
            w5.v vVar = this.f17303b;
            if (vVar != null) {
                String n10 = kotlin.jvm.internal.i.n(key, "    ");
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(j10)}, 1));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                vVar.a(format, n10);
            }
        }

        public final void e(String key, ParcelFileDescriptor descriptor, String str) {
            int j10;
            kotlin.jvm.internal.i.g(key, "key");
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f17302a;
            if (outputStream instanceof a0) {
                ((a0) outputStream).e(descriptor.getStatSize());
                j10 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                w5.e0 e0Var = w5.e0.f36453a;
                j10 = w5.e0.j(autoCloseInputStream, outputStream) + 0;
            }
            f("", new Object[0]);
            h();
            w5.v vVar = this.f17303b;
            if (vVar != null) {
                String n10 = kotlin.jvm.internal.i.n(key, "    ");
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(j10)}, 1));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                vVar.a(format, n10);
            }
        }

        public final void f(String str, Object... objArr) {
            b(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f17305d) {
                b("\r\n", new Object[0]);
            }
        }

        public final void g(String key, Object obj, q qVar) {
            kotlin.jvm.internal.i.g(key, "key");
            OutputStream outputStream = this.f17302a;
            if (outputStream instanceof c0) {
                ((c0) outputStream).a(qVar);
            }
            String str = q.f17287j;
            if (c.f(obj)) {
                a(key, c.a(obj));
                return;
            }
            boolean z10 = obj instanceof Bitmap;
            w5.v vVar = this.f17303b;
            if (z10) {
                Bitmap bitmap = (Bitmap) obj;
                kotlin.jvm.internal.i.g(bitmap, "bitmap");
                c(key, key, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                f("", new Object[0]);
                h();
                if (vVar != null) {
                    vVar.a("<Image>", kotlin.jvm.internal.i.n(key, "    "));
                }
            } else if (obj instanceof byte[]) {
                byte[] bytes = (byte[]) obj;
                kotlin.jvm.internal.i.g(bytes, "bytes");
                c(key, key, "content/unknown");
                outputStream.write(bytes);
                f("", new Object[0]);
                h();
                if (vVar != null) {
                    String n10 = kotlin.jvm.internal.i.n(key, "    ");
                    String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                    kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                    vVar.a(format, n10);
                }
            } else if (obj instanceof Uri) {
                d(key, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                e(key, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof f) {
                f fVar = (f) obj;
                RESOURCE resource = fVar.f17301v;
                boolean z11 = resource instanceof ParcelFileDescriptor;
                String str2 = fVar.f17300u;
                if (z11) {
                    e(key, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    d(key, (Uri) resource, str2);
                } else {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
            } else {
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }

        public final void h() {
            if (!this.f17305d) {
                f("--%s", q.f17287j);
                return;
            }
            byte[] bytes = "&".getBytes(gv.a.f16927b);
            kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f17302a.write(bytes);
        }
    }

    static {
        new c();
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.i.f(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i6 = 0;
            do {
                i6++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i6 < nextInt);
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "buffer.toString()");
            f17287j = sb3;
            f17288k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
        }
        String sb32 = sb2.toString();
        kotlin.jvm.internal.i.f(sb32, "buffer.toString()");
        f17287j = sb32;
        f17288k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public q() {
        this(null, null, null, null, null, 63);
    }

    public static String f() {
        boolean z10;
        String b10 = p.b();
        w5.f0.e();
        String str = p.f;
        if (str != null) {
            boolean z11 = false;
            if (b10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (str.length() > 0) {
                    z11 = true;
                }
                if (z11) {
                    return b10 + '|' + str;
                }
            }
            w5.e0 e0Var = w5.e0.f36453a;
            return null;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r3 == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean J0;
        boolean z10;
        boolean z11;
        Bundle bundle = this.f17293d;
        String e10 = e();
        boolean z12 = false;
        if (e10 == null) {
            J0 = false;
        } else {
            J0 = gv.r.J0(e10, "|");
        }
        if (e10 != null && gv.n.H0(e10, "IG") && !J0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !i()) {
            if (!kotlin.jvm.internal.i.b(p.e(), "instagram.com")) {
                z11 = true;
            } else {
                z11 = !i();
            }
            if (!z11) {
            }
            if (!z12) {
                bundle.putString("access_token", f());
            } else {
                String e11 = e();
                if (e11 != null) {
                    bundle.putString("access_token", e11);
                }
            }
            if (!bundle.containsKey("access_token")) {
                w5.e0 e0Var = w5.e0.f36453a;
                p pVar = p.f17269a;
                w5.f0.e();
                String str = p.f;
                if (str != null) {
                    if (w5.e0.A(str)) {
                        Log.w("q", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
                    }
                } else {
                    throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
                }
            }
            bundle.putString("sdk", "android");
            bundle.putString("format", "json");
            p pVar2 = p.f17269a;
            p.i(w.GRAPH_API_DEBUG_INFO);
            p.i(w.GRAPH_API_DEBUG_WARNING);
        }
        z12 = true;
        if (!z12) {
        }
        if (!bundle.containsKey("access_token")) {
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        p pVar22 = p.f17269a;
        p.i(w.GRAPH_API_DEBUG_INFO);
        p.i(w.GRAPH_API_DEBUG_WARNING);
    }

    public final String b(String str, boolean z10) {
        if (!z10 && this.f17296h == v.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f17293d.keySet()) {
            Object obj = this.f17293d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (c.f(obj)) {
                buildUpon.appendQueryParameter(str2, c.a(obj).toString());
            } else if (this.f17296h != v.GET) {
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        kotlin.jvm.internal.i.f(builder, "uriBuilder.toString()");
        return builder;
    }

    public final u c() {
        ArrayList c10 = c.c(new t(is.k.i2(new q[]{this})));
        if (c10.size() == 1) {
            return (u) c10.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final s d() {
        t tVar = new t(is.k.i2(new q[]{this}));
        w5.f0.c(tVar);
        s sVar = new s(tVar);
        sVar.executeOnExecutor(p.c(), new Void[0]);
        return sVar;
    }

    public final String e() {
        h5.a aVar = this.f17290a;
        if (aVar != null) {
            if (!this.f17293d.containsKey("access_token")) {
                v.a aVar2 = w5.v.f36544d;
                String accessToken = aVar.f17180y;
                synchronized (aVar2) {
                    kotlin.jvm.internal.i.g(accessToken, "accessToken");
                    p pVar = p.f17269a;
                    p.i(w.INCLUDE_ACCESS_TOKENS);
                    aVar2.d(accessToken);
                }
                return accessToken;
            }
        } else if (!this.f17293d.containsKey("access_token")) {
            return f();
        }
        return this.f17293d.getString("access_token");
    }

    public final String g() {
        String o10;
        String str;
        if (this.f17296h == v.POST && (str = this.f17291b) != null && gv.n.z0(str, "/videos")) {
            int i6 = w5.a0.f36434a;
            o10 = defpackage.b.o(new Object[]{p.e()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        } else {
            int i10 = w5.a0.f36434a;
            String subdomain = p.e();
            kotlin.jvm.internal.i.g(subdomain, "subdomain");
            o10 = defpackage.b.o(new Object[]{subdomain}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        String h10 = h(o10);
        a();
        return b(h10, false);
    }

    public final String h(String str) {
        boolean z10;
        if (!kotlin.jvm.internal.i.b(p.e(), "instagram.com")) {
            z10 = true;
        } else {
            z10 = !i();
        }
        if (!z10) {
            int i6 = w5.a0.f36434a;
            str = defpackage.b.o(new Object[]{p.r}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        Pattern pattern = f17288k;
        String str2 = this.f17291b;
        if (!pattern.matcher(str2).matches()) {
            str2 = defpackage.b.o(new Object[]{this.f, str2}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = str2;
        return defpackage.b.o(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    public final boolean i() {
        String str = this.f17291b;
        if (str == null) {
            return false;
        }
        String str2 = "^/?" + p.b() + "/?.*";
        if (!this.f17297i && !Pattern.matches(str2, str) && !Pattern.matches("^/?app/?.*", str)) {
            return false;
        }
        return true;
    }

    public final void j(b bVar) {
        p pVar = p.f17269a;
        p.i(w.GRAPH_API_DEBUG_INFO);
        p.i(w.GRAPH_API_DEBUG_WARNING);
        this.f17295g = bVar;
    }

    public final void k(v vVar) {
        if (vVar == null) {
            vVar = v.GET;
        }
        this.f17296h = vVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f17290a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f17291b);
        sb2.append(", graphObject: ");
        sb2.append(this.f17292c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f17296h);
        sb2.append(", parameters: ");
        sb2.append(this.f17293d);
        sb2.append("}");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }

    public q(h5.a aVar, String str, Bundle bundle, v vVar, b bVar, int i6) {
        aVar = (i6 & 1) != 0 ? null : aVar;
        str = (i6 & 2) != 0 ? null : str;
        bundle = (i6 & 4) != 0 ? null : bundle;
        vVar = (i6 & 8) != 0 ? null : vVar;
        bVar = (i6 & 16) != 0 ? null : bVar;
        this.f17290a = aVar;
        this.f17291b = str;
        this.f = null;
        j(bVar);
        k(vVar);
        if (bundle != null) {
            this.f17293d = new Bundle(bundle);
        } else {
            this.f17293d = new Bundle();
        }
        this.f = p.d();
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class f<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<f<?>> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final String f17300u;

        /* renamed from: v  reason: collision with root package name */
        public final RESOURCE f17301v;

        /* compiled from: GraphRequest.kt */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<f<?>> {
            @Override // android.os.Parcelable.Creator
            public final f<?> createFromParcel(Parcel source) {
                kotlin.jvm.internal.i.g(source, "source");
                return new f<>(source);
            }

            @Override // android.os.Parcelable.Creator
            public final f<?>[] newArray(int i6) {
                return new f[i6];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Parcelable parcelable) {
            this.f17300u = "image/png";
            this.f17301v = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i6) {
            kotlin.jvm.internal.i.g(out, "out");
            out.writeString(this.f17300u);
            out.writeParcelable(this.f17301v, i6);
        }

        public f(Parcel parcel) {
            this.f17300u = parcel.readString();
            this.f17301v = (RESOURCE) parcel.readParcelable(p.a().getClassLoader());
        }
    }
}
