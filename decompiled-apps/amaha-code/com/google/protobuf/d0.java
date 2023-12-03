package com.google.protobuf;
/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public volatile q0 f9898a;

    /* renamed from: b  reason: collision with root package name */
    public volatile h f9899b;

    static {
        n.a();
    }

    public final q0 a(q0 q0Var) {
        if (this.f9898a == null) {
            synchronized (this) {
                if (this.f9898a == null) {
                    try {
                        this.f9898a = q0Var;
                        this.f9899b = h.f9922v;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f9898a = q0Var;
                        this.f9899b = h.f9922v;
                    }
                }
            }
        }
        return this.f9898a;
    }

    public final h b() {
        if (this.f9899b != null) {
            return this.f9899b;
        }
        synchronized (this) {
            if (this.f9899b != null) {
                return this.f9899b;
            }
            if (this.f9898a == null) {
                this.f9899b = h.f9922v;
            } else {
                this.f9899b = this.f9898a.k();
            }
            return this.f9899b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        q0 q0Var = this.f9898a;
        q0 q0Var2 = d0Var.f9898a;
        if (q0Var == null && q0Var2 == null) {
            return b().equals(d0Var.b());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.a(q0Var.i()));
        }
        return a(q0Var2.i()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
