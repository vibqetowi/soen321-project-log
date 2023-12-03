package com.google.android.gms.internal.cast;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class t4 implements Map.Entry, Comparable<t4> {

    /* renamed from: u  reason: collision with root package name */
    public final Comparable f7642u;

    /* renamed from: v  reason: collision with root package name */
    public Object f7643v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ w4 f7644w;

    public t4(w4 w4Var, Comparable comparable, Object obj) {
        this.f7644w = w4Var;
        this.f7642u = comparable;
        this.f7643v = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(t4 t4Var) {
        return this.f7642u.compareTo(t4Var.f7642u);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f7642u;
        if (comparable == null) {
            if (key != null) {
                equals = false;
            } else {
                equals = true;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f7643v;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value != null) {
                    equals2 = false;
                } else {
                    equals2 = true;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f7642u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7643v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        Comparable comparable = this.f7642u;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f7643v;
        if (obj != null) {
            i6 = obj.hashCode();
        }
        return i6 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i6 = w4.A;
        this.f7644w.f();
        Object obj2 = this.f7643v;
        this.f7643v = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7642u);
        String valueOf2 = String.valueOf(this.f7643v);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
