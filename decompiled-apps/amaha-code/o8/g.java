package o8;

import com.google.android.exoplayer2.source.j;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27277u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j.a f27278v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.source.j f27279w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d f27280x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ e f27281y;

    public /* synthetic */ g(j.a aVar, com.google.android.exoplayer2.source.j jVar, d dVar, e eVar, int i6) {
        this.f27277u = i6;
        this.f27278v = aVar;
        this.f27279w = jVar;
        this.f27280x = dVar;
        this.f27281y = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f27277u;
        e eVar = this.f27281y;
        d dVar = this.f27280x;
        com.google.android.exoplayer2.source.j jVar = this.f27279w;
        j.a aVar = this.f27278v;
        switch (i6) {
            case 0:
                jVar.J(aVar.f6896a, aVar.f6897b, dVar, eVar);
                return;
            case 1:
                jVar.I(aVar.f6896a, aVar.f6897b, dVar, eVar);
                return;
            default:
                jVar.K(aVar.f6896a, aVar.f6897b, dVar, eVar);
                return;
        }
    }
}
