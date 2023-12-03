package com.google.android.gms.internal.measurement;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class n4 implements Serializable, m4 {

    /* renamed from: u  reason: collision with root package name */
    public final m4 f8484u;

    /* renamed from: v  reason: collision with root package name */
    public volatile transient boolean f8485v;

    /* renamed from: w  reason: collision with root package name */
    public transient Object f8486w;

    public n4(m4 m4Var) {
        this.f8484u = m4Var;
    }

    @Override // com.google.android.gms.internal.measurement.m4
    public final Object a() {
        if (!this.f8485v) {
            synchronized (this) {
                if (!this.f8485v) {
                    Object a10 = this.f8484u.a();
                    this.f8486w = a10;
                    this.f8485v = true;
                    return a10;
                }
            }
        }
        return this.f8486w;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f8485v) {
            obj = "<supplier that returned " + this.f8486w + ">";
        } else {
            obj = this.f8484u;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
