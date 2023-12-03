package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.c;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class u0<A extends c<? extends t9.c, Object>> extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final A f7438b;

    public u0(j9.k kVar) {
        super(1);
        this.f7438b = kVar;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        try {
            this.f7438b.n(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f7438b.n(new Status(10, sb2.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(b0<?> b0Var) {
        try {
            A a10 = this.f7438b;
            a.e eVar = b0Var.f7344b;
            a10.getClass();
            try {
                try {
                    a10.m(eVar);
                } catch (RemoteException e10) {
                    a10.n(new Status(1, 8, e10.getLocalizedMessage(), null, null));
                }
            } catch (DeadObjectException e11) {
                a10.n(new Status(1, 8, e11.getLocalizedMessage(), null, null));
                throw e11;
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d(t tVar, boolean z10) {
        Map<BasePendingResult<?>, Boolean> map = tVar.f7436a;
        Boolean valueOf = Boolean.valueOf(z10);
        A a10 = this.f7438b;
        map.put(a10, valueOf);
        a10.b(new r(tVar, a10));
    }
}
