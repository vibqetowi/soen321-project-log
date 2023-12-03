package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a0 f7447u;

    public z(a0 a0Var) {
        this.f7447u = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.e eVar = this.f7447u.f7335a.f7344b;
        eVar.b(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
