package com.google.protobuf;
/* compiled from: Android.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f9896a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f9897b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9896a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9897b = z10;
    }

    public static boolean a() {
        if (f9896a != null && !f9897b) {
            return true;
        }
        return false;
    }
}
