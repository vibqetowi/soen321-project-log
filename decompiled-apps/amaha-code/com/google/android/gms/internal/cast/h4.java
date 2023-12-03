package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class h4<T> implements o4<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c4 f7546a;

    /* renamed from: b  reason: collision with root package name */
    public final y4<?, ?> f7547b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7548c;

    /* renamed from: d  reason: collision with root package name */
    public final t2<?> f7549d;

    public h4(y4<?, ?> y4Var, t2<?> t2Var, c4 c4Var) {
        this.f7547b = y4Var;
        this.f7548c = t2Var.a(c4Var);
        this.f7549d = t2Var;
        this.f7546a = c4Var;
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final boolean a(T t3) {
        this.f7549d.b(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final int b(T t3) {
        this.f7547b.b(t3).getClass();
        if (!this.f7548c) {
            return 506991;
        }
        this.f7549d.b(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final void c(T t3, T t10) {
        Class<?> cls = p4.f7621a;
        y4<?, ?> y4Var = this.f7547b;
        y4Var.a(t3, y4Var.d(y4Var.b(t3), y4Var.b(t10)));
        if (!this.f7548c) {
            return;
        }
        this.f7549d.b(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final int d(T t3) {
        y4<?, ?> y4Var = this.f7547b;
        int e10 = y4Var.e(y4Var.b(t3));
        if (!this.f7548c) {
            return e10;
        }
        this.f7549d.b(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final void e(T t3, r2 r2Var) {
        this.f7549d.b(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final void f(c3 c3Var) {
        this.f7547b.c(c3Var);
        this.f7549d.c(c3Var);
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final boolean g(T t3, T t10) {
        y4<?, ?> y4Var = this.f7547b;
        if (!y4Var.b(t3).equals(y4Var.b(t10))) {
            return false;
        }
        if (!this.f7548c) {
            return true;
        }
        t2<?> t2Var = this.f7549d;
        t2Var.b(t3);
        t2Var.b(t10);
        throw null;
    }
}
