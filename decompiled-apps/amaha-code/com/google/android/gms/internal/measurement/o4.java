package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class o4 implements m4 {

    /* renamed from: u  reason: collision with root package name */
    public volatile m4 f8529u;

    /* renamed from: v  reason: collision with root package name */
    public volatile boolean f8530v;

    /* renamed from: w  reason: collision with root package name */
    public Object f8531w;

    public o4(m4 m4Var) {
        this.f8529u = m4Var;
    }

    @Override // com.google.android.gms.internal.measurement.m4
    public final Object a() {
        if (!this.f8530v) {
            synchronized (this) {
                if (!this.f8530v) {
                    m4 m4Var = this.f8529u;
                    m4Var.getClass();
                    Object a10 = m4Var.a();
                    this.f8531w = a10;
                    this.f8530v = true;
                    this.f8529u = null;
                    return a10;
                }
            }
        }
        return this.f8531w;
    }

    public final String toString() {
        Object obj = this.f8529u;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f8531w + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
