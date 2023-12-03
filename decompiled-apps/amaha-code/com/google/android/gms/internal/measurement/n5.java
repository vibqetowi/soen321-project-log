package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class n5 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8487c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final j7 f8488a = new j7(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f8489b;

    static {
        new n5(0);
    }

    public n5() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(m5 m5Var, Object obj) {
        boolean z10;
        d8 b10 = m5Var.b();
        Charset charset = c6.f8318a;
        obj.getClass();
        d8[] d8VarArr = d8.f8341v;
        e8 e8Var = e8.f8363v;
        switch (b10.f8342u.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 1:
                z10 = obj instanceof Long;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Float;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Double;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Boolean;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 5:
                z10 = obj instanceof String;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 6:
                if ((obj instanceof b5) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            case 8:
                if (obj instanceof v6) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m5Var.a()), m5Var.b().f8342u, obj.getClass().getName()));
        }
    }

    public final void a() {
        if (!this.f8489b) {
            int i6 = 0;
            while (true) {
                j7 j7Var = this.f8488a;
                if (i6 < j7Var.b()) {
                    Map.Entry entry = (Map.Entry) j7Var.f8552v.get(i6);
                    if (entry.getValue() instanceof w5) {
                        ((w5) entry.getValue()).l();
                    }
                    i6++;
                } else {
                    j7Var.a();
                    this.f8489b = true;
                    return;
                }
            }
        }
    }

    public final void b(m5 m5Var, Object obj) {
        if (m5Var.c()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    c(m5Var, arrayList.get(i6));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            c(m5Var, obj);
        }
        this.f8488a.put(m5Var, obj);
    }

    public final Object clone() {
        j7 j7Var;
        Iterable<Map.Entry> entrySet;
        n5 n5Var = new n5();
        int i6 = 0;
        while (true) {
            j7Var = this.f8488a;
            if (i6 >= j7Var.b()) {
                break;
            }
            Map.Entry entry = (Map.Entry) j7Var.f8552v.get(i6);
            n5Var.b((m5) entry.getKey(), entry.getValue());
            i6++;
        }
        if (j7Var.f8553w.isEmpty()) {
            entrySet = kc.f.f23235y;
        } else {
            entrySet = j7Var.f8553w.entrySet();
        }
        for (Map.Entry entry2 : entrySet) {
            n5Var.b((m5) entry2.getKey(), entry2.getValue());
        }
        return n5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        return this.f8488a.equals(((n5) obj).f8488a);
    }

    public final int hashCode() {
        return this.f8488a.hashCode();
    }

    public n5(int i6) {
        a();
        a();
    }
}
