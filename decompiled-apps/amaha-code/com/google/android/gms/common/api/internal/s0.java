package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class s0<T> extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final ya.i<T> f7435b;

    public s0(int i6, ya.i<T> iVar) {
        super(i6);
        this.f7435b = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        this.f7435b.c(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(RuntimeException runtimeException) {
        this.f7435b.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(b0<?> b0Var) {
        try {
            h(b0Var);
        } catch (DeadObjectException e10) {
            a(y0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(y0.e(e11));
        } catch (RuntimeException e12) {
            this.f7435b.c(e12);
        }
    }

    public abstract void h(b0<?> b0Var);
}
