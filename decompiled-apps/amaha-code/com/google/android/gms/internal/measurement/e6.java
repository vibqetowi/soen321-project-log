package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public class e6 {

    /* renamed from: a  reason: collision with root package name */
    public volatile v6 f8358a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b5 f8359b;

    static {
        i5 i5Var = i5.f8424b;
    }

    public final b5 a() {
        if (this.f8359b != null) {
            return this.f8359b;
        }
        synchronized (this) {
            if (this.f8359b != null) {
                return this.f8359b;
            }
            if (this.f8358a == null) {
                this.f8359b = b5.f8311v;
            } else {
                this.f8359b = this.f8358a.a();
            }
            return this.f8359b;
        }
    }

    public final void b(v6 v6Var) {
        if (this.f8358a != null) {
            return;
        }
        synchronized (this) {
            if (this.f8358a == null) {
                try {
                    this.f8358a = v6Var;
                    this.f8359b = b5.f8311v;
                } catch (zzkp unused) {
                    this.f8358a = v6Var;
                    this.f8359b = b5.f8311v;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        v6 v6Var = this.f8358a;
        v6 v6Var2 = e6Var.f8358a;
        if (v6Var == null && v6Var2 == null) {
            return a().equals(e6Var.a());
        }
        if (v6Var != null && v6Var2 != null) {
            return v6Var.equals(v6Var2);
        }
        if (v6Var != null) {
            e6Var.b(v6Var.d());
            return v6Var.equals(e6Var.f8358a);
        }
        b(v6Var2.d());
        return this.f8358a.equals(v6Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
