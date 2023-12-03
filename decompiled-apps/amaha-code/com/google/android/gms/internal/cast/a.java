package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import r1.l;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class a extends l.a {

    /* renamed from: b  reason: collision with root package name */
    public static final p9.b f7468b = new p9.b("MediaRouterCallback");

    /* renamed from: a  reason: collision with root package name */
    public final p5 f7469a;

    public a(p5 p5Var) {
        v9.o.h(p5Var);
        this.f7469a = p5Var;
    }

    @Override // r1.l.a
    public final void d(r1.l lVar, l.g gVar) {
        try {
            this.f7469a.H0(gVar.r, gVar.f30343c);
        } catch (RemoteException e10) {
            f7468b.a("Unable to call %s on %s.", e10, "onRouteAdded", p5.class.getSimpleName());
        }
    }

    @Override // r1.l.a
    public final void e(r1.l lVar, l.g gVar) {
        try {
            this.f7469a.W0(gVar.r, gVar.f30343c);
        } catch (RemoteException e10) {
            f7468b.a("Unable to call %s on %s.", e10, "onRouteChanged", p5.class.getSimpleName());
        }
    }

    @Override // r1.l.a
    public final void f(r1.l lVar, l.g gVar) {
        try {
            this.f7469a.g1(gVar.r, gVar.f30343c);
        } catch (RemoteException e10) {
            f7468b.a("Unable to call %s on %s.", e10, "onRouteRemoved", p5.class.getSimpleName());
        }
    }

    @Override // r1.l.a
    public final void g(l.g gVar) {
        try {
            this.f7469a.A1(gVar.r, gVar.f30343c);
        } catch (RemoteException e10) {
            f7468b.a("Unable to call %s on %s.", e10, "onRouteSelected", p5.class.getSimpleName());
        }
    }

    @Override // r1.l.a
    public final void i(r1.l lVar, l.g gVar, int i6) {
        try {
            this.f7469a.H1(gVar.f30343c, i6, gVar.r);
        } catch (RemoteException e10) {
            f7468b.a("Unable to call %s on %s.", e10, "onRouteUnselected", p5.class.getSimpleName());
        }
    }
}
