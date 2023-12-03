package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.w2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class x2<T extends w2<T>> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7679c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final q4 f7680a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7681b;

    static {
        new x2(0);
    }

    public x2() {
        this.f7680a = new q4(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(T t3, Object obj) {
        boolean z10;
        l5 b10 = t3.b();
        Charset charset = k3.f7570a;
        obj.getClass();
        l5[] l5VarArr = l5.f7586v;
        m5 m5Var = m5.f7595v;
        switch (b10.f7587u.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 1:
                z10 = obj instanceof Long;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Float;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Double;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Boolean;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 5:
                z10 = obj instanceof String;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 6:
                if ((obj instanceof n2) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof e3)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            case 8:
                if (obj instanceof c4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.a()), t3.b().f7587u, obj.getClass().getName()));
        }
    }

    public final void a(T t3, Object obj) {
        if (t3.c()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    b(t3, arrayList.get(i6));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            b(t3, obj);
        }
        this.f7680a.put(t3, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        q4 q4Var;
        Iterable<Map.Entry> entrySet;
        x2 x2Var = new x2();
        int i6 = 0;
        while (true) {
            q4Var = this.f7680a;
            if (i6 >= q4Var.f7674v.size()) {
                break;
            }
            t4 t4Var = q4Var.f7674v.get(i6);
            x2Var.a((w2) t4Var.getKey(), t4Var.getValue());
            i6++;
        }
        if (q4Var.f7675w.isEmpty()) {
            entrySet = kotlin.jvm.internal.h.F;
        } else {
            entrySet = q4Var.f7675w.entrySet();
        }
        for (Map.Entry entry : entrySet) {
            x2Var.a((w2) entry.getKey(), entry.getValue());
        }
        return x2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        return this.f7680a.equals(((x2) obj).f7680a);
    }

    public final int hashCode() {
        return this.f7680a.hashCode();
    }

    public x2(int i6) {
        q4 q4Var = new q4(0);
        this.f7680a = q4Var;
        if (!this.f7681b) {
            q4Var.a();
            this.f7681b = true;
        }
        if (this.f7681b) {
            return;
        }
        q4Var.a();
        this.f7681b = true;
    }
}
