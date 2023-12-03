package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: i  reason: collision with root package name */
    public static final p9.b f7652i = new p9.b("FeatureUsageAnalytics");

    /* renamed from: j  reason: collision with root package name */
    public static final String f7653j = "20.0.0";

    /* renamed from: k  reason: collision with root package name */
    public static v0 f7654k;

    /* renamed from: a  reason: collision with root package name */
    public final h f7655a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f7656b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7657c;

    /* renamed from: d  reason: collision with root package name */
    public final c4.u f7658d;

    /* renamed from: e  reason: collision with root package name */
    public final f f7659e;
    public final HashSet f;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f7660g;

    /* renamed from: h  reason: collision with root package name */
    public long f7661h;

    public v0(SharedPreferences sharedPreferences, h hVar, String str) {
        this.f7656b = sharedPreferences;
        this.f7655a = hVar;
        this.f7657c = str;
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f7660g = hashSet2;
        this.f7659e = new f(Looper.getMainLooper());
        this.f7658d = new c4.u(13, this);
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        hashSet.clear();
        hashSet2.clear();
        this.f7661h = 0L;
        String str2 = f7653j;
        if (str2.equals(string) && str.equals(string2)) {
            this.f7661h = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            HashSet hashSet3 = new HashSet();
            for (String str3 : sharedPreferences.getAll().keySet()) {
                if (str3.startsWith("feature_usage_timestamp_")) {
                    long j10 = this.f7656b.getLong(str3, 0L);
                    if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                        hashSet3.add(str3);
                    } else {
                        boolean startsWith = str3.startsWith("feature_usage_timestamp_reported_feature_");
                        d0 d0Var = d0.DEVELOPER_FEATURE_FLAG_UNKNOWN;
                        if (startsWith) {
                            try {
                                d0Var = d0.d(Integer.parseInt(str3.substring(41)));
                            } catch (NumberFormatException unused) {
                            }
                            this.f7660g.add(d0Var);
                            this.f.add(d0Var);
                        } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                            try {
                                d0Var = d0.d(Integer.parseInt(str3.substring(41)));
                            } catch (NumberFormatException unused2) {
                            }
                            this.f.add(d0Var);
                        }
                    }
                }
            }
            b(hashSet3);
            v9.o.h(this.f7659e);
            v9.o.h(this.f7658d);
            this.f7659e.post(this.f7658d);
            return;
        }
        HashSet hashSet4 = new HashSet();
        for (String str4 : sharedPreferences.getAll().keySet()) {
            if (str4.startsWith("feature_usage_timestamp_")) {
                hashSet4.add(str4);
            }
        }
        hashSet4.add("feature_usage_last_report_time");
        b(hashSet4);
        this.f7656b.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", this.f7657c).apply();
    }

    public static void a(d0 d0Var) {
        v0 v0Var = f7654k;
        if (v0Var == null) {
            return;
        }
        String num = Integer.toString(d0Var.f7509u);
        SharedPreferences sharedPreferences = v0Var.f7656b;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String format = String.format("%s%s", "feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(format)) {
            format = String.format("%s%s", "feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(format, System.currentTimeMillis()).apply();
        v0Var.f.add(d0Var);
        v0Var.f7659e.post(v0Var.f7658d);
    }

    public final void b(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.f7656b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
