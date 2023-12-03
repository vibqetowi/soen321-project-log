package com.google.android.gms.internal.p000firebaseauthapi;

import hc.d;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w0  reason: invalid package */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8215c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final o2 f8216a = new o2(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f8217b;

    static {
        new w0(0);
    }

    public w0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(v0 v0Var, Object obj) {
        boolean z10;
        k3 b10 = v0Var.b();
        Charset charset = i1.f7886a;
        obj.getClass();
        k3[] k3VarArr = k3.f7936v;
        l3 l3Var = l3.f7959v;
        switch (b10.f7937u.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 1:
                z10 = obj instanceof Long;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Float;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Double;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Boolean;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 5:
                z10 = obj instanceof String;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 6:
                if ((obj instanceof h0) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            case 8:
                if (obj instanceof b2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(v0Var.a()), v0Var.b().f7937u, obj.getClass().getName()));
        }
    }

    public final void a() {
        if (!this.f8217b) {
            int i6 = 0;
            while (true) {
                o2 o2Var = this.f8216a;
                if (i6 < o2Var.b()) {
                    Map.Entry entry = (Map.Entry) o2Var.f8189v.get(i6);
                    if (entry.getValue() instanceof e1) {
                        ((e1) entry.getValue()).d();
                    }
                    i6++;
                } else {
                    o2Var.a();
                    this.f8217b = true;
                    return;
                }
            }
        }
    }

    public final void b(v0 v0Var, Object obj) {
        if (v0Var.c()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    c(v0Var, arrayList.get(i6));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            c(v0Var, obj);
        }
        this.f8216a.put(v0Var, obj);
    }

    public final Object clone() {
        o2 o2Var;
        Iterable<Map.Entry> entrySet;
        w0 w0Var = new w0();
        int i6 = 0;
        while (true) {
            o2Var = this.f8216a;
            if (i6 >= o2Var.b()) {
                break;
            }
            Map.Entry entry = (Map.Entry) o2Var.f8189v.get(i6);
            w0Var.b((v0) entry.getKey(), entry.getValue());
            i6++;
        }
        if (o2Var.f8190w.isEmpty()) {
            entrySet = d.T;
        } else {
            entrySet = o2Var.f8190w.entrySet();
        }
        for (Map.Entry entry2 : entrySet) {
            w0Var.b((v0) entry2.getKey(), entry2.getValue());
        }
        return w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return this.f8216a.equals(((w0) obj).f8216a);
    }

    public final int hashCode() {
        return this.f8216a.hashCode();
    }

    public w0(int i6) {
        a();
        a();
    }
}
