package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class f0<O extends a.c> extends w {

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.b<O> f7373b;

    public f0(com.google.android.gms.common.api.b<O> bVar) {
        this.f7373b = bVar;
    }

    public final c b(j9.k kVar) {
        boolean z10;
        com.google.android.gms.common.api.b<O> bVar = this.f7373b;
        bVar.getClass();
        if (!kVar.f7330l && !((Boolean) BasePendingResult.f7319m.get()).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        kVar.f7330l = z10;
        f fVar = bVar.f7314j;
        fVar.getClass();
        u0 u0Var = new u0(kVar);
        ka.d dVar = fVar.G;
        dVar.sendMessage(dVar.obtainMessage(4, new k0(u0Var, fVar.C.get(), bVar)));
        return kVar;
    }
}
