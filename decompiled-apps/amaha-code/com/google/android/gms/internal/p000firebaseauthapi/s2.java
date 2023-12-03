package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s2  reason: invalid package */
/* loaded from: classes.dex */
public final class s2 implements Map.Entry, Comparable {

    /* renamed from: u  reason: collision with root package name */
    public final Comparable f8120u;

    /* renamed from: v  reason: collision with root package name */
    public Object f8121v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ v2 f8122w;

    public s2(v2 v2Var, Comparable comparable, Object obj) {
        this.f8122w = v2Var;
        this.f8120u = comparable;
        this.f8121v = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8120u.compareTo(((s2) obj).f8120u);
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
        Comparable comparable = this.f8120u;
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
            Object obj2 = this.f8121v;
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
        return this.f8120u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8121v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        Comparable comparable = this.f8120u;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f8121v;
        if (obj != null) {
            i6 = obj.hashCode();
        }
        return i6 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i6 = v2.A;
        this.f8122w.h();
        Object obj2 = this.f8121v;
        this.f8121v = obj;
        return obj2;
    }

    public final String toString() {
        return d.f(String.valueOf(this.f8120u), "=", String.valueOf(this.f8121v));
    }
}
