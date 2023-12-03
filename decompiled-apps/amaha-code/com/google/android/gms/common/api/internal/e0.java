package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Set;
import v9.b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class e0 implements b.c, p0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.e f7361a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?> f7362b;

    /* renamed from: c  reason: collision with root package name */
    public v9.i f7363c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set<Scope> f7364d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7365e = false;
    public final /* synthetic */ f f;

    public e0(f fVar, a.e eVar, a<?> aVar) {
        this.f = fVar;
        this.f7361a = eVar;
        this.f7362b = aVar;
    }

    @Override // v9.b.c
    public final void a(s9.b bVar) {
        this.f.G.post(new d0(this, bVar));
    }

    public final void b(s9.b bVar) {
        b0 b0Var = (b0) this.f.D.get(this.f7362b);
        if (b0Var != null) {
            v9.o.c(b0Var.f7354m.G);
            a.e eVar = b0Var.f7344b;
            String name = eVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
            sb2.append("onSignInFailed for ");
            sb2.append(name);
            sb2.append(" with ");
            sb2.append(valueOf);
            eVar.b(sb2.toString());
            b0Var.n(bVar, null);
        }
    }
}
