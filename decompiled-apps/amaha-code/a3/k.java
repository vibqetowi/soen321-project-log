package a3;

import a3.j;
/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public final class k implements j.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f237a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f238b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f239c;

    public k(j jVar, int i6, int i10) {
        this.f239c = jVar;
        this.f237a = i6;
        this.f238b = i10;
    }

    @Override // a3.j.n
    public final void run() {
        j jVar = this.f239c;
        c cVar = jVar.f207v;
        int i6 = this.f237a;
        int i10 = this.f238b;
        if (cVar == null) {
            jVar.A.add(new k(jVar, i6, i10));
            return;
        }
        jVar.f208w.h(i6, i10 + 0.99f);
    }
}
