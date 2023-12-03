package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class w0<ResultT> extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final p<Object, ResultT> f7440b;

    /* renamed from: c  reason: collision with root package name */
    public final ya.i<ResultT> f7441c;

    /* renamed from: d  reason: collision with root package name */
    public final kotlinx.coroutines.e0 f7442d;

    public w0(int i6, p<Object, ResultT> pVar, ya.i<ResultT> iVar, kotlinx.coroutines.e0 e0Var) {
        super(i6);
        this.f7441c = iVar;
        this.f7440b = pVar;
        this.f7442d = e0Var;
        if (i6 == 2 && pVar.f7416b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        this.f7442d.getClass();
        this.f7441c.c(f6.b.x0(status));
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(RuntimeException runtimeException) {
        this.f7441c.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(b0<?> b0Var) {
        ya.i<ResultT> iVar = this.f7441c;
        try {
            this.f7440b.a(b0Var.f7344b, iVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(y0.e(e11));
        } catch (RuntimeException e12) {
            iVar.c(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d(t tVar, boolean z10) {
        Map<ya.i<?>, Boolean> map = tVar.f7437b;
        Boolean valueOf = Boolean.valueOf(z10);
        ya.i<ResultT> iVar = this.f7441c;
        map.put(iVar, valueOf);
        iVar.f38392a.addOnCompleteListener(new s(tVar, iVar, 0));
    }

    @Override // com.google.android.gms.common.api.internal.h0
    public final boolean f(b0<?> b0Var) {
        return this.f7440b.f7416b;
    }

    @Override // com.google.android.gms.common.api.internal.h0
    public final s9.d[] g(b0<?> b0Var) {
        return this.f7440b.f7415a;
    }
}
