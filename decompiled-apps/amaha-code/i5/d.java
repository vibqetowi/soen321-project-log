package i5;

import android.os.Bundle;
import com.facebook.FacebookException;
import h5.w;
import is.u;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import n5.a;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
import w5.v;
/* compiled from: AppEvent.kt */
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final HashSet<String> f19841z;

    /* renamed from: u  reason: collision with root package name */
    public final JSONObject f19842u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f19843v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f19844w;

    /* renamed from: x  reason: collision with root package name */
    public final String f19845x;

    /* renamed from: y  reason: collision with root package name */
    public final String f19846y;

    /* compiled from: AppEvent.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final String a(String str) {
            HashSet<String> hashSet = d.f19841z;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                kotlin.jvm.internal.i.f(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    kotlin.jvm.internal.i.f(digest, "digest.digest()");
                    return q5.d.a(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (UnsupportedEncodingException unused) {
                e0 e0Var = e0.f36453a;
                h5.p pVar = h5.p.f17269a;
                return "1";
            } catch (NoSuchAlgorithmException unused2) {
                e0 e0Var2 = e0.f36453a;
                h5.p pVar2 = h5.p.f17269a;
                return "0";
            }
        }

        public static final void b(String str) {
            boolean z10;
            boolean contains;
            HashSet<String> hashSet = d.f19841z;
            if (str != null) {
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && str.length() <= 40) {
                    HashSet<String> hashSet2 = d.f19841z;
                    synchronized (hashSet2) {
                        contains = hashSet2.contains(str);
                        hs.k kVar = hs.k.f19476a;
                    }
                    if (!contains) {
                        Pattern compile = Pattern.compile("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$");
                        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                        if (compile.matcher(str).matches()) {
                            synchronized (hashSet2) {
                                hashSet2.add(str);
                            }
                            return;
                        }
                        throw new FacebookException(defpackage.b.o(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
                    }
                    return;
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    /* compiled from: AppEvent.kt */
    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final String f19847u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f19848v;

        /* renamed from: w  reason: collision with root package name */
        public final boolean f19849w;

        /* renamed from: x  reason: collision with root package name */
        public final String f19850x;

        public b(String str, String str2, boolean z10, boolean z11) {
            this.f19847u = str;
            this.f19848v = z10;
            this.f19849w = z11;
            this.f19850x = str2;
        }

        private final Object readResolve() {
            return new d(this.f19847u, this.f19848v, this.f19849w, this.f19850x);
        }
    }

    static {
        new a();
        f19841z = new HashSet<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) {
        kotlin.jvm.internal.i.g(contextName, "contextName");
        kotlin.jvm.internal.i.g(eventName, "eventName");
        this.f19843v = z10;
        this.f19844w = z11;
        this.f19845x = eventName;
        a.b(eventName);
        JSONObject jSONObject = new JSONObject();
        t5.a aVar = t5.a.f32410a;
        if (!b6.a.b(t5.a.class)) {
            try {
                if (t5.a.f32411b) {
                    t5.a aVar2 = t5.a.f32410a;
                    aVar2.getClass();
                    if (b6.a.b(aVar2) ? false : t5.a.f32414e.contains(eventName)) {
                        eventName = "_removed_";
                    }
                }
            } catch (Throwable th2) {
                b6.a.a(t5.a.class, th2);
            }
            jSONObject.put("_eventName", eventName);
            jSONObject.put("_eventName_md5", a.a(eventName));
            jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
            jSONObject.put("_ui", contextName);
            if (uuid != null) {
                jSONObject.put("_session_id", uuid);
            }
            if (bundle != null) {
                HashMap hashMap = new HashMap();
                for (String key : bundle.keySet()) {
                    kotlin.jvm.internal.i.f(key, "key");
                    a.b(key);
                    Object obj = bundle.get(key);
                    if (!(obj instanceof String) && !(obj instanceof Number)) {
                        throw new FacebookException(defpackage.b.o(new Object[]{obj, key}, 2, "Parameter value '%s' for key '%s' should be a string or a numeric type.", "java.lang.String.format(format, *args)"));
                    }
                    hashMap.put(key, obj.toString());
                }
                p5.a aVar3 = p5.a.f27903a;
                if (!b6.a.b(p5.a.class)) {
                    try {
                        if (p5.a.f27904b && !hashMap.isEmpty()) {
                            try {
                                List<String> I2 = u.I2(hashMap.keySet());
                                JSONObject jSONObject2 = new JSONObject();
                                for (String str : I2) {
                                    Object obj2 = hashMap.get(str);
                                    if (obj2 != null) {
                                        String str2 = (String) obj2;
                                        p5.a aVar4 = p5.a.f27903a;
                                        if (aVar4.a(str) || aVar4.a(str2)) {
                                            hashMap.remove(str);
                                            if (!p5.a.f27905c) {
                                                str2 = "";
                                            }
                                            jSONObject2.put(str, str2);
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                }
                                if (jSONObject2.length() != 0) {
                                    String jSONObject3 = jSONObject2.toString();
                                    kotlin.jvm.internal.i.f(jSONObject3, "restrictiveParamJson.toString()");
                                    hashMap.put("_onDeviceParams", jSONObject3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Throwable th3) {
                        b6.a.a(p5.a.class, th3);
                    }
                }
                t5.a aVar5 = t5.a.f32410a;
                boolean b10 = b6.a.b(t5.a.class);
                String eventName2 = this.f19845x;
                if (!b10) {
                    try {
                        kotlin.jvm.internal.i.g(eventName2, "eventName");
                        if (t5.a.f32411b) {
                            HashMap hashMap2 = new HashMap();
                            Iterator it = new ArrayList(hashMap.keySet()).iterator();
                            while (it.hasNext()) {
                                String str3 = (String) it.next();
                                String a10 = t5.a.f32410a.a(eventName2, str3);
                                if (a10 != null) {
                                    hashMap2.put(str3, a10);
                                    hashMap.remove(str3);
                                }
                            }
                            if (!hashMap2.isEmpty()) {
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    for (Map.Entry entry : hashMap2.entrySet()) {
                                        jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    hashMap.put("_restrictedParams", jSONObject4.toString());
                                } catch (JSONException unused2) {
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        b6.a.a(t5.a.class, th4);
                    }
                }
                n5.a aVar6 = n5.a.f25885a;
                if (!b6.a.b(n5.a.class)) {
                    try {
                        kotlin.jvm.internal.i.g(eventName2, "eventName");
                        if (n5.a.f25886b) {
                            ArrayList arrayList = new ArrayList(hashMap.keySet());
                            Iterator it2 = new ArrayList(n5.a.f25887c).iterator();
                            while (it2.hasNext()) {
                                a.C0423a c0423a = (a.C0423a) it2.next();
                                if (kotlin.jvm.internal.i.b(c0423a.f25889a, eventName2)) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        String str4 = (String) it3.next();
                                        if (c0423a.f25890b.contains(str4)) {
                                            hashMap.remove(str4);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        b6.a.a(n5.a.class, th5);
                    }
                }
                for (String str5 : hashMap.keySet()) {
                    jSONObject.put(str5, hashMap.get(str5));
                }
            }
            if (d10 != null) {
                jSONObject.put("_valueToSum", d10.doubleValue());
            }
            if (this.f19844w) {
                jSONObject.put("_inBackground", "1");
            }
            if (!this.f19843v) {
                jSONObject.put("_implicitlyLogged", "1");
            } else {
                v.a aVar7 = v.f36544d;
                w wVar = w.APP_EVENTS;
                kotlin.jvm.internal.i.f(jSONObject.toString(), "eventObject.toString()");
                h5.p.i(wVar);
            }
            this.f19842u = jSONObject;
            String jSONObject5 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject5, "jsonObject.toString()");
            this.f19846y = a.a(jSONObject5);
        }
        eventName = null;
        jSONObject.put("_eventName", eventName);
        jSONObject.put("_eventName_md5", a.a(eventName));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", contextName);
        if (uuid != null) {
        }
        if (bundle != null) {
        }
        if (d10 != null) {
        }
        if (this.f19844w) {
        }
        if (!this.f19843v) {
        }
        this.f19842u = jSONObject;
        String jSONObject52 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject52, "jsonObject.toString()");
        this.f19846y = a.a(jSONObject52);
    }

    private final Object writeReplace() {
        String jSONObject = this.f19842u.toString();
        kotlin.jvm.internal.i.f(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f19846y, this.f19843v, this.f19844w);
    }

    public final String toString() {
        JSONObject jSONObject = this.f19842u;
        return defpackage.b.o(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f19843v), jSONObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }

    public d(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f19842u = jSONObject;
        this.f19843v = z10;
        String optString = jSONObject.optString("_eventName");
        kotlin.jvm.internal.i.f(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f19845x = optString;
        this.f19846y = str2;
        this.f19844w = z11;
    }
}
