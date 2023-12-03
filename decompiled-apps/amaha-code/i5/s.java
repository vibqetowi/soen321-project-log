package i5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import w5.e0;
/* compiled from: UserDataStore.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static SharedPreferences f19891c;

    /* renamed from: a  reason: collision with root package name */
    public static final s f19889a = new s();

    /* renamed from: b  reason: collision with root package name */
    public static final String f19890b = s.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f19892d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f19893e = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> f = new ConcurrentHashMap<>();

    public final HashMap a() {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = j5.c.f21674d;
            HashSet hashSet = new HashSet();
            Iterator it = j5.c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((j5.c) it.next()).b());
            }
            ConcurrentHashMap<String, String> concurrentHashMap = f;
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final synchronized void b() {
        if (b6.a.b(this)) {
            return;
        }
        AtomicBoolean atomicBoolean = f19892d;
        if (atomicBoolean.get()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(h5.p.a());
        kotlin.jvm.internal.i.f(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
        f19891c = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
        if (string == null) {
            string = "";
        }
        SharedPreferences sharedPreferences = f19891c;
        if (sharedPreferences != null) {
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f19893e.putAll(e0.D(string));
            f.putAll(e0.D(string2));
            atomicBoolean.set(true);
            return;
        }
        kotlin.jvm.internal.i.q("sharedPreferences");
        throw null;
    }

    public final String c(String str, String str2) {
        boolean z10;
        String str3;
        int i6;
        boolean z11;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z12 = false;
            while (i10 <= length) {
                if (!z12) {
                    i6 = i10;
                } else {
                    i6 = length;
                }
                if (kotlin.jvm.internal.i.i(str2.charAt(i6), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i10++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i10, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                boolean b10 = kotlin.jvm.internal.i.b("em", str);
                String str4 = f19890b;
                if (b10) {
                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        Log.e(str4, "Setting email failure: this is not a valid email address");
                        return "";
                    }
                    return lowerCase;
                } else if (kotlin.jvm.internal.i.b("ph", str)) {
                    Pattern compile = Pattern.compile("[^0-9]");
                    kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                    String replaceAll = compile.matcher(lowerCase).replaceAll("");
                    kotlin.jvm.internal.i.f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    return replaceAll;
                } else if (kotlin.jvm.internal.i.b("ge", str)) {
                    if (lowerCase.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        str3 = "";
                    } else {
                        str3 = lowerCase.substring(0, 1);
                        kotlin.jvm.internal.i.f(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    if (!kotlin.jvm.internal.i.b("f", str3) && !kotlin.jvm.internal.i.b("m", str3)) {
                        Log.e(str4, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                } else {
                    return lowerCase;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
