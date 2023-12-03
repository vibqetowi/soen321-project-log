package i7;

import android.content.Context;
import j7.l;
import j7.m;
import java.util.concurrent.Executor;
/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes.dex */
public final class e implements f7.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19905u;

    /* renamed from: v  reason: collision with root package name */
    public final gs.a f19906v;

    /* renamed from: w  reason: collision with root package name */
    public final gs.a f19907w;

    /* renamed from: x  reason: collision with root package name */
    public final gs.a f19908x;

    /* renamed from: y  reason: collision with root package name */
    public final gs.a f19909y;

    public /* synthetic */ e(gs.a aVar, gs.a aVar2, f7.b bVar, gs.a aVar3, int i6) {
        this.f19905u = i6;
        this.f19906v = aVar;
        this.f19907w = aVar2;
        this.f19908x = bVar;
        this.f19909y = aVar3;
    }

    @Override // gs.a
    public final Object get() {
        int i6 = this.f19905u;
        gs.a aVar = this.f19909y;
        gs.a aVar2 = this.f19908x;
        gs.a aVar3 = this.f19907w;
        gs.a aVar4 = this.f19906v;
        switch (i6) {
            case 0:
                m7.a aVar5 = (m7.a) aVar.get();
                return new j7.c((Context) aVar4.get(), (k7.d) aVar3.get(), (j7.d) aVar2.get());
            default:
                return new l((Executor) aVar4.get(), (k7.d) aVar3.get(), (m) aVar2.get(), (l7.a) aVar.get());
        }
    }
}
