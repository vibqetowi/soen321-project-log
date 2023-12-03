package e7;

import android.content.Context;
import k7.q;
/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes.dex */
public final class j implements f7.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13821u;

    /* renamed from: v  reason: collision with root package name */
    public final gs.a f13822v;

    /* renamed from: w  reason: collision with root package name */
    public final gs.a f13823w;

    /* renamed from: x  reason: collision with root package name */
    public final gs.a f13824x;

    public /* synthetic */ j(gs.a aVar, f7.b bVar, f7.b bVar2, int i6) {
        this.f13821u = i6;
        this.f13822v = aVar;
        this.f13823w = bVar;
        this.f13824x = bVar2;
    }

    @Override // gs.a
    public final Object get() {
        int i6 = this.f13821u;
        gs.a aVar = this.f13824x;
        gs.a aVar2 = this.f13823w;
        gs.a aVar3 = this.f13822v;
        switch (i6) {
            case 0:
                return new i((Context) aVar3.get(), (m7.a) aVar2.get(), (m7.a) aVar.get());
            default:
                return new q((Context) aVar3.get(), (String) aVar2.get(), ((Integer) aVar.get()).intValue());
        }
    }
}
