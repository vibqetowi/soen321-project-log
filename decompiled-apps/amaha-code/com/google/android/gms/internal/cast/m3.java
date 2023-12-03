package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class m3 {

    /* renamed from: a  reason: collision with root package name */
    public volatile c4 f7590a;

    /* renamed from: b  reason: collision with root package name */
    public volatile n2 f7591b;

    static {
        if (s2.f7634b == null) {
            synchronized (s2.class) {
                if (s2.f7634b == null) {
                    s2.f7634b = s2.f7635c;
                }
            }
        }
    }

    public final n2 a() {
        if (this.f7591b != null) {
            return this.f7591b;
        }
        synchronized (this) {
            if (this.f7591b != null) {
                return this.f7591b;
            }
            if (this.f7590a == null) {
                this.f7591b = n2.f7604v;
            } else {
                this.f7591b = this.f7590a.r();
            }
            return this.f7591b;
        }
    }

    public final void b(c4 c4Var) {
        if (this.f7590a != null) {
            return;
        }
        synchronized (this) {
            if (this.f7590a == null) {
                try {
                    this.f7590a = c4Var;
                    this.f7591b = n2.f7604v;
                } catch (zzpd unused) {
                    this.f7590a = c4Var;
                    this.f7591b = n2.f7604v;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        c4 c4Var = this.f7590a;
        c4 c4Var2 = m3Var.f7590a;
        if (c4Var == null && c4Var2 == null) {
            return a().equals(m3Var.a());
        }
        if (c4Var != null && c4Var2 != null) {
            return c4Var.equals(c4Var2);
        }
        if (c4Var != null) {
            m3Var.b(c4Var.j());
            return c4Var.equals(m3Var.f7590a);
        }
        b(c4Var2.j());
        return this.f7590a.equals(c4Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
