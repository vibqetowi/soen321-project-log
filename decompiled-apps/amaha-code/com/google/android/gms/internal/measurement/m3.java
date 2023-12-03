package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f8464a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f8465b;

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f8466c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f8467d;

    /* renamed from: e  reason: collision with root package name */
    public static HashMap f8468e;
    public static final HashMap f;

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap f8469g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap f8470h;

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap f8471i;

    /* renamed from: j  reason: collision with root package name */
    public static Object f8472j;

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f8473k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f8465b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f8466c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        f8467d = new AtomicBoolean();
        f = new HashMap();
        f8469g = new HashMap();
        f8470h = new HashMap();
        f8471i = new HashMap();
        f8473k = new String[0];
    }

    public static void a(String str, String str2, Object obj) {
        synchronized (m3.class) {
            if (obj == f8472j) {
                f8468e.put(str, str2);
            }
        }
    }
}
