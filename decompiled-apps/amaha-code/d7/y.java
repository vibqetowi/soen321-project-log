package d7;

import java.util.concurrent.Executor;
/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes.dex */
public final class y implements f7.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12272u;

    /* renamed from: v  reason: collision with root package name */
    public final gs.a f12273v;

    /* renamed from: w  reason: collision with root package name */
    public final gs.a f12274w;

    /* renamed from: x  reason: collision with root package name */
    public final gs.a f12275x;

    /* renamed from: y  reason: collision with root package name */
    public final gs.a f12276y;

    /* renamed from: z  reason: collision with root package name */
    public final gs.a f12277z;

    public /* synthetic */ y(gs.a aVar, gs.a aVar2, f7.b bVar, gs.a aVar3, gs.a aVar4, int i6) {
        this.f12272u = i6;
        this.f12273v = aVar;
        this.f12274w = aVar2;
        this.f12275x = bVar;
        this.f12276y = aVar3;
        this.f12277z = aVar4;
    }

    @Override // gs.a
    public final Object get() {
        int i6 = this.f12272u;
        gs.a aVar = this.f12277z;
        gs.a aVar2 = this.f12276y;
        gs.a aVar3 = this.f12275x;
        gs.a aVar4 = this.f12274w;
        gs.a aVar5 = this.f12273v;
        switch (i6) {
            case 0:
                return new w((m7.a) aVar5.get(), (m7.a) aVar4.get(), (i7.c) aVar3.get(), (j7.j) aVar2.get(), (j7.l) aVar.get());
            case 1:
                return new i7.b((Executor) aVar5.get(), (e7.e) aVar4.get(), (j7.m) aVar3.get(), (k7.d) aVar2.get(), (l7.a) aVar.get());
            default:
                m7.a aVar6 = (m7.a) aVar5.get();
                m7.a aVar7 = (m7.a) aVar4.get();
                Object obj = aVar3.get();
                return new k7.o(aVar6, aVar7, (k7.e) obj, (k7.q) aVar2.get(), this.f12277z);
        }
    }
}
