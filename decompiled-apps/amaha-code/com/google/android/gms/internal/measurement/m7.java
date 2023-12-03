package com.google.android.gms.internal.measurement;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class m7 implements Map.Entry, Comparable {

    /* renamed from: u  reason: collision with root package name */
    public final Comparable f8474u;

    /* renamed from: v  reason: collision with root package name */
    public Object f8475v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p7 f8476w;

    public m7(p7 p7Var, Comparable comparable, Object obj) {
        this.f8476w = p7Var;
        this.f8474u = comparable;
        this.f8475v = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8474u.compareTo(((m7) obj).f8474u);
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
        Comparable comparable = this.f8474u;
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
            Object obj2 = this.f8475v;
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
    public final /* synthetic */ Object getKey() {
        return this.f8474u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8475v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        Comparable comparable = this.f8474u;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f8475v;
        if (obj != null) {
            i6 = obj.hashCode();
        }
        return i6 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i6 = p7.A;
        this.f8476w.h();
        Object obj2 = this.f8475v;
        this.f8475v = obj;
        return obj2;
    }

    public final String toString() {
        return defpackage.d.f(String.valueOf(this.f8474u), "=", String.valueOf(this.f8475v));
    }
}
