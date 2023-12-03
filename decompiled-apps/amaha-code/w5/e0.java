package w5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.theinnerhour.b2b.utils.Constants;
import h5.a;
import h5.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import w5.e0;
/* compiled from: Utility.kt */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static int f36454b;

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f36453a = new e0();

    /* renamed from: c  reason: collision with root package name */
    public static long f36455c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f36456d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f36457e = -1;
    public static String f = "";

    /* renamed from: g  reason: collision with root package name */
    public static String f36458g = "";

    /* renamed from: h  reason: collision with root package name */
    public static String f36459h = "NoCarrier";

    /* compiled from: Utility.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(FacebookException facebookException);

        void onSuccess(JSONObject jSONObject);
    }

    public static final boolean A(String str) {
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
        return false;
    }

    public static final boolean B(Uri uri) {
        if (uri != null && (gv.n.A0("http", uri.getScheme(), true) || gv.n.A0("https", uri.getScheme(), true) || gv.n.A0("fbstaging", uri.getScheme(), true))) {
            return true;
        }
        return false;
    }

    public static final ArrayList C(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i6 = 0;
            while (true) {
                int i10 = i6 + 1;
                arrayList.add(jSONArray.getString(i6));
                if (i10 >= length) {
                    break;
                }
                i6 = i10;
            }
        }
        return arrayList;
    }

    public static final HashMap D(String str) {
        boolean z10;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                kotlin.jvm.internal.i.f(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.i.f(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String E(Map<String, String> map) {
        kotlin.jvm.internal.i.g(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            kotlin.jvm.internal.i.f(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final Bundle F(String str) {
        Bundle bundle = new Bundle();
        if (!A(str)) {
            if (str != null) {
                Object[] array = gv.r.a1(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i6 = 0;
                    while (i6 < length) {
                        String str2 = strArr[i6];
                        i6++;
                        Object[] array2 = gv.r.a1(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException unused) {
                                h5.p pVar = h5.p.f17269a;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    public static final void G(Bundle bundle, JSONArray jSONArray) {
        kotlin.jvm.internal.i.g(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) jSONArray).booleanValue());
        } else if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
        } else if (jSONArray instanceof Double) {
            bundle.putDouble("media", ((Number) jSONArray).doubleValue());
        } else if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
        } else if (jSONArray instanceof Integer) {
            bundle.putInt("media", ((Number) jSONArray).intValue());
        } else if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof Long) {
            bundle.putLong("media", ((Number) jSONArray).longValue());
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else if (jSONArray instanceof String) {
            bundle.putString("media", (String) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final HashMap H(Parcel parcel) {
        kotlin.jvm.internal.i.g(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i6 = 0;
            do {
                i6++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                    continue;
                }
            } while (i6 < readInt);
            return hashMap;
        }
        return hashMap;
    }

    public static final String I(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb2.append(cArr, 0, read);
                        } else {
                            String sb3 = sb2.toString();
                            kotlin.jvm.internal.i.f(sb3, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            e(bufferedInputStream);
                            e(inputStreamReader);
                            return sb3;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    e(bufferedInputStream);
                    e(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:11|(2:12|13)|14|15|16|17|18|19|(1:21)(1:53)|(1:23)(1:52)|(10:25|27|28|30|31|32|33|(6:37|38|(1:40)|42|(1:44)|45)|35|36)|51|50|33|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
        r0 = java.util.Locale.getDefault();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a A[Catch: Exception -> 0x016b, TryCatch #5 {Exception -> 0x016b, blocks: (B:40:0x013f, B:42:0x014a, B:48:0x0157, B:46:0x0151), top: B:84:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151 A[Catch: Exception -> 0x016b, TryCatch #5 {Exception -> 0x016b, blocks: (B:40:0x013f, B:42:0x014a, B:48:0x0157, B:46:0x0151), top: B:84:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157 A[Catch: Exception -> 0x016b, TRY_LEAVE, TryCatch #5 {Exception -> 0x016b, blocks: (B:40:0x013f, B:42:0x014a, B:48:0x0157, B:46:0x0151), top: B:84:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(Context context, JSONObject jSONObject) {
        int i6;
        String str;
        int i10;
        int i11;
        int i12;
        Object systemService;
        Display display;
        DisplayManager displayManager;
        PackageInfo packageInfo;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f36453a.getClass();
        if (f36455c == -1 || System.currentTimeMillis() - f36455c >= 1800000) {
            f36455c = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                kotlin.jvm.internal.i.f(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
                f = displayName;
                String id2 = timeZone.getID();
                kotlin.jvm.internal.i.f(id2, "tz.id");
                f36458g = id2;
            } catch (AssertionError | Exception unused) {
            }
            if (kotlin.jvm.internal.i.b(f36459h, "NoCarrier")) {
                try {
                    Object systemService2 = context.getSystemService("phone");
                    if (systemService2 != null) {
                        String networkOperatorName = ((TelephonyManager) systemService2).getNetworkOperatorName();
                        kotlin.jvm.internal.i.f(networkOperatorName, "telephonyManager.networkOperatorName");
                        f36459h = networkOperatorName;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                } catch (Exception unused2) {
                }
            }
            try {
                if (kotlin.jvm.internal.i.b("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f36456d = statFs.getBlockCount() * statFs.getBlockSize();
                }
                f36456d = Math.round(f36456d / 1.073741824E9d);
            } catch (Exception unused3) {
            }
            try {
                if (kotlin.jvm.internal.i.b("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f36457e = statFs2.getAvailableBlocks() * statFs2.getBlockSize();
                }
                f36457e = Math.round(f36457e / 1.073741824E9d);
            } catch (Exception unused4) {
            }
        }
        String packageName = context.getPackageName();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused5) {
            i6 = -1;
        }
        if (packageInfo == null) {
            return;
        }
        i6 = packageInfo.versionCode;
        try {
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused6) {
            str = "";
            jSONArray.put(packageName);
            jSONArray.put(i6);
            jSONArray.put(str);
            jSONArray.put(Build.VERSION.RELEASE);
            jSONArray.put(Build.MODEL);
            Locale locale = context.getResources().getConfiguration().locale;
            jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
            jSONArray.put(f);
            jSONArray.put(f36459h);
            double d10 = 0.0d;
            systemService = context.getSystemService("display");
            display = null;
            if (!(systemService instanceof DisplayManager)) {
            }
            if (displayManager == null) {
            }
            if (display != null) {
            }
            i10 = 0;
            i11 = 0;
            jSONArray.put(i10);
            jSONArray.put(i11);
            jSONArray.put(new DecimalFormat("#.##").format(d10));
            i12 = f36454b;
            if (i12 <= 0) {
            }
            jSONArray.put(i12);
            jSONArray.put(f36456d);
            jSONArray.put(f36457e);
            jSONArray.put(f36458g);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        jSONArray.put(packageName);
        jSONArray.put(i6);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        Locale locale2 = context.getResources().getConfiguration().locale;
        jSONArray.put(locale2.getLanguage() + '_' + ((Object) locale2.getCountry()));
        jSONArray.put(f);
        jSONArray.put(f36459h);
        double d102 = 0.0d;
        systemService = context.getSystemService("display");
        display = null;
        if (!(systemService instanceof DisplayManager)) {
            displayManager = (DisplayManager) systemService;
        } else {
            displayManager = null;
        }
        if (displayManager == null) {
            display = displayManager.getDisplay(0);
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            i10 = displayMetrics.widthPixels;
            try {
                i11 = displayMetrics.heightPixels;
                try {
                    d102 = displayMetrics.density;
                } catch (Exception unused7) {
                }
            } catch (Exception unused8) {
            }
            jSONArray.put(i10);
            jSONArray.put(i11);
            jSONArray.put(new DecimalFormat("#.##").format(d102));
            i12 = f36454b;
            if (i12 <= 0) {
                try {
                    File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new d0(0));
                    if (listFiles != null) {
                        f36454b = listFiles.length;
                    }
                } catch (Exception unused9) {
                }
                if (f36454b <= 0) {
                    f36454b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
                }
                i12 = f36454b;
            }
            jSONArray.put(i12);
            jSONArray.put(f36456d);
            jSONArray.put(f36457e);
            jSONArray.put(f36458g);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        i10 = 0;
        i11 = 0;
        jSONArray.put(i10);
        jSONArray.put(i11);
        jSONArray.put(new DecimalFormat("#.##").format(d102));
        i12 = f36454b;
        if (i12 <= 0) {
        }
        jSONArray.put(i12);
        jSONArray.put(f36456d);
        jSONArray.put(f36457e);
        jSONArray.put(f36458g);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String K(String str) {
        if (str == null) {
            return null;
        }
        f36453a.getClass();
        byte[] bytes = str.getBytes(gv.a.f16927b);
        kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
        return u("SHA-256", bytes);
    }

    public static final void L(Parcel parcel, Map<String, String> map) {
        kotlin.jvm.internal.i.g(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final <T> boolean a(T t3, T t10) {
        if (t3 == null) {
            if (t10 == null) {
                return true;
            }
            return false;
        }
        return kotlin.jvm.internal.i.b(t3, t10);
    }

    public static final Uri b(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        kotlin.jvm.internal.i.f(build, "builder.build()");
        return build;
    }

    public static void c(Context context, String str) {
        int i6;
        boolean z10;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = gv.r.a1(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                Object[] array2 = gv.r.a1(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
                        String str3 = strArr2[0];
                        int length2 = str3.length() - 1;
                        int i11 = 0;
                        boolean z11 = false;
                        while (i11 <= length2) {
                            if (!z11) {
                                i6 = i11;
                            } else {
                                i6 = length2;
                            }
                            if (kotlin.jvm.internal.i.i(str3.charAt(i6), 32) <= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z11) {
                                if (!z10) {
                                    z11 = true;
                                } else {
                                    i11++;
                                }
                            } else if (!z10) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        cookieManager.setCookie(str, kotlin.jvm.internal.i.n("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i11, length2 + 1).toString()));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final void d(Context context) {
        try {
            f36453a.getClass();
            c(context, "facebook.com");
            c(context, ".facebook.com");
            c(context, "https://facebook.com");
            c(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String f(String str) {
        if (A(str)) {
            return "";
        }
        return str;
    }

    public static final ArrayList g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    String string = jSONArray.getString(i6);
                    kotlin.jvm.internal.i.f(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i10 < length) {
                        i6 = i10;
                    } else {
                        return arrayList;
                    }
                }
            } else {
                return arrayList;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap h(JSONObject jsonObject) {
        kotlin.jvm.internal.i.g(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        if (length > 0) {
            int i6 = 0;
            while (true) {
                int i10 = i6 + 1;
                try {
                    String string = names.getString(i6);
                    kotlin.jvm.internal.i.f(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = h((JSONObject) value);
                    }
                    kotlin.jvm.internal.i.f(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i10 >= length) {
                    break;
                }
                i6 = i10;
            }
        }
        return hashMap;
    }

    public static final HashMap i(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jSONObject.optString(key);
            if (optString != null) {
                kotlin.jvm.internal.i.f(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final int j(InputStream inputStream, OutputStream outputStream) {
        kotlin.jvm.internal.i.g(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i6 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i6 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i6;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void k(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final String l(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    public static final String m(Context context) {
        String string;
        try {
            h5.p pVar = h5.p.f17269a;
            f0.e();
            String str = h5.p.f17273e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i6 = applicationInfo.labelRes;
            if (i6 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i6);
                kotlin.jvm.internal.i.f(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date n(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + date.getTime());
    }

    public static final JSONObject o() {
        if (b6.a.b(e0.class)) {
            return null;
        }
        try {
            String string = h5.p.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(e0.class, th2);
            return null;
        }
    }

    public static final void p(final a aVar, final String accessToken) {
        String str;
        kotlin.jvm.internal.i.g(accessToken, "accessToken");
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = z.f36563a;
        JSONObject jSONObject = z.f36563a.get(accessToken);
        if (jSONObject != null) {
            aVar.onSuccess(jSONObject);
            return;
        }
        q.b bVar = new q.b() { // from class: w5.c0
            @Override // h5.q.b
            public final void a(h5.u uVar) {
                e0.a callback = e0.a.this;
                kotlin.jvm.internal.i.g(callback, "$callback");
                String accessToken2 = accessToken;
                kotlin.jvm.internal.i.g(accessToken2, "$accessToken");
                h5.n nVar = uVar.f17318c;
                if (nVar != null) {
                    callback.a(nVar.C);
                    return;
                }
                ConcurrentHashMap<String, JSONObject> concurrentHashMap2 = z.f36563a;
                JSONObject jSONObject2 = uVar.f17319d;
                if (jSONObject2 != null) {
                    z.f36563a.put(accessToken2, jSONObject2);
                    callback.onSuccess(jSONObject2);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        };
        f36453a.getClass();
        Bundle bundle = new Bundle();
        Date date = h5.a.F;
        h5.a b10 = a.b.b();
        if (kotlin.jvm.internal.i.b((b10 == null || (r1 = b10.E) == null) ? "facebook" : "facebook", "instagram")) {
            str = "id,name,profile_picture";
        } else {
            str = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str);
        bundle.putString("access_token", accessToken);
        h5.q qVar = new h5.q(null, "me", null, null, new h5.d(2, null), 32);
        qVar.f17293d = bundle;
        qVar.k(h5.v.GET);
        qVar.j(bVar);
        qVar.d();
    }

    public static final String q(Context context) {
        String str = f0.f36461a;
        return h5.p.b();
    }

    public static final Method r(Class<?> cls, String str, Class<?>... parameterTypes) {
        kotlin.jvm.internal.i.g(parameterTypes, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method s(String str, String str2, Class<?>... clsArr) {
        try {
            return r(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object t(String str, String str2, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt != null && !(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str2, opt);
                return jSONObject2;
            }
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        return opt;
    }

    public static String u(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            kotlin.jvm.internal.i.f(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.i.f(digest, "digest");
            int length = digest.length;
            int i6 = 0;
            while (i6 < length) {
                byte b10 = digest[i6];
                i6++;
                sb2.append(Integer.toHexString((b10 >> 4) & 15));
                sb2.append(Integer.toHexString((b10 >> 0) & 15));
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "builder.toString()");
            return sb3;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object v(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean w() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{h5.p.b()}, 1));
            kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context a10 = h5.p.a();
            PackageManager packageManager = a10.getPackageManager();
            String packageName = a10.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            kotlin.jvm.internal.i.f(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (kotlin.jvm.internal.i.b(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean x(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            Pattern compile = Pattern.compile(".+_cheets|cheets_.+");
            kotlin.jvm.internal.i.f(compile, "compile(pattern)");
            if (compile.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y() {
        if (b6.a.b(e0.class)) {
            return false;
        }
        try {
            JSONObject o10 = o();
            if (o10 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = o10.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i6 = 0;
                    while (true) {
                        int i10 = i6 + 1;
                        String string = jSONArray.getString(i6);
                        kotlin.jvm.internal.i.f(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.i.b(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i10 >= length) {
                            break;
                        }
                        i6 = i10;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            b6.a.a(e0.class, th2);
            return false;
        }
    }

    public static boolean z(Context context) {
        Method s10 = s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (s10 == null) {
            return false;
        }
        Object v10 = v(null, s10, context);
        if ((v10 instanceof Integer) && kotlin.jvm.internal.i.b(v10, 0)) {
            return true;
        }
        return false;
    }
}
