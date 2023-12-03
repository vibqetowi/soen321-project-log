package com.google.android.gms.internal.p000firebaseauthapi;

import gd.h0;
import gd.k0;
import gd.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.h;
import sc.e;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xd  reason: invalid package */
/* loaded from: classes.dex */
public final class xd extends re {
    public xd(e eVar) {
        this.f8112a = new ae(eVar);
        this.f8113b = Executors.newCachedThreadPool();
    }

    public static k0 b(e eVar, ef efVar) {
        o.h(eVar);
        o.h(efVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h0(efVar));
        List list = efVar.f7831z.f7795u;
        if (list != null && !list.isEmpty()) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                arrayList.add(new h0((c) list.get(i6)));
            }
        }
        k0 k0Var = new k0(eVar, arrayList);
        k0Var.C = new m0(efVar.D, efVar.C);
        k0Var.D = efVar.E;
        k0Var.E = efVar.F;
        k0Var.u0(h.s0(efVar.G));
        return k0Var;
    }
}
