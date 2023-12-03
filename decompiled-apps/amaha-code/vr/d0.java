package vr;

import vr.c0;
/* compiled from: DelayedClientCall.java */
/* loaded from: classes2.dex */
public final class d0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ tr.i0 f35489u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ tr.c0 f35490v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c0.i f35491w;

    public d0(c0.i iVar, tr.i0 i0Var, tr.c0 c0Var) {
        this.f35491w = iVar;
        this.f35489u = i0Var;
        this.f35490v = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35491w.f35431a.a(this.f35490v, this.f35489u);
    }
}
