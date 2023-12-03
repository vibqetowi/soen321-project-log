package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class p<A, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final s9.d[] f7415a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7416b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7417c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static class a<A, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public n<A, ya.i<ResultT>> f7418a;

        /* renamed from: c  reason: collision with root package name */
        public s9.d[] f7420c;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7419b = true;

        /* renamed from: d  reason: collision with root package name */
        public int f7421d = 0;

        public final r0 a() {
            boolean z10;
            if (this.f7418a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            v9.o.a("execute parameter required", z10);
            return new r0(this, this.f7420c, this.f7419b, this.f7421d);
        }
    }

    public p(s9.d[] dVarArr, boolean z10, int i6) {
        this.f7415a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f7416b = z11;
        this.f7417c = i6;
    }

    public abstract void a(a.e eVar, ya.i iVar);
}
