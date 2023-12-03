package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class q0 extends wa.d implements c.a, c.b {

    /* renamed from: i  reason: collision with root package name */
    public static final va.b f7422i = va.e.f34965a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7423b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f7424c;

    /* renamed from: d  reason: collision with root package name */
    public final va.b f7425d = f7422i;

    /* renamed from: e  reason: collision with root package name */
    public final Set<Scope> f7426e;
    public final v9.c f;

    /* renamed from: g  reason: collision with root package name */
    public va.f f7427g;

    /* renamed from: h  reason: collision with root package name */
    public p0 f7428h;

    public q0(Context context, ka.d dVar, v9.c cVar) {
        this.f7423b = context;
        this.f7424c = dVar;
        this.f = cVar;
        this.f7426e = cVar.f34855b;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void c1() {
        this.f7427g.g(this);
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void v(s9.b bVar) {
        ((e0) this.f7428h).b(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void z(int i6) {
        this.f7427g.h();
    }
}
