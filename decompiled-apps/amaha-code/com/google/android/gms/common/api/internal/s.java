package com.google.android.gms.common.api.internal;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class s implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7432a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ya.i f7433b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7434c;

    public /* synthetic */ s(Object obj, ya.i iVar, int i6) {
        this.f7432a = i6;
        this.f7434c = obj;
        this.f7433b = iVar;
    }

    private final void b() {
        mc.l lVar = (mc.l) this.f7434c;
        ya.i iVar = this.f7433b;
        synchronized (lVar.f) {
            lVar.f25027e.remove(iVar);
        }
    }

    @Override // ya.d
    public final void a(ya.h hVar) {
        switch (this.f7432a) {
            case 0:
                ((t) this.f7434c).f7437b.remove(this.f7433b);
                return;
            case 1:
                ic.r rVar = (ic.r) this.f7434c;
                ya.i iVar = this.f7433b;
                synchronized (rVar.f) {
                    rVar.f19948e.remove(iVar);
                }
                return;
            default:
                b();
                return;
        }
    }
}
