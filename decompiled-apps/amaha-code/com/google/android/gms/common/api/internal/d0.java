package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s9.b f7358u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e0 f7359v;

    public d0(e0 e0Var, s9.b bVar) {
        this.f7359v = e0Var;
        this.f7358u = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        v9.i iVar;
        e0 e0Var = this.f7359v;
        b0 b0Var = (b0) e0Var.f.D.get(e0Var.f7362b);
        if (b0Var == null) {
            return;
        }
        s9.b bVar = this.f7358u;
        if (bVar.f31323v == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e0Var.f7365e = true;
            a.e eVar = e0Var.f7361a;
            if (eVar.o()) {
                if (e0Var.f7365e && (iVar = e0Var.f7363c) != null) {
                    eVar.f(iVar, e0Var.f7364d);
                    return;
                }
                return;
            }
            try {
                eVar.f(null, eVar.a());
                return;
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                eVar.b("Failed to get service from broker.");
                b0Var.n(new s9.b(10), null);
                return;
            }
        }
        b0Var.n(bVar, null);
    }
}
