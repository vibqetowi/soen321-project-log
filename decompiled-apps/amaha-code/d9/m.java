package d9;

import c9.w;
import com.google.android.gms.internal.p000firebaseauthapi.le;
import d9.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12702u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o.a f12703v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ le f12704w;

    public /* synthetic */ m(o.a aVar, le leVar, int i6) {
        this.f12702u = i6;
        this.f12703v = aVar;
        this.f12704w = leVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12702u) {
            case 0:
                o.a aVar = this.f12703v;
                le leVar = this.f12704w;
                aVar.getClass();
                synchronized (leVar) {
                }
                o oVar = aVar.f12710b;
                int i6 = w.f5205a;
                oVar.E(leVar);
                return;
            default:
                o.a aVar2 = this.f12703v;
                aVar2.getClass();
                int i10 = w.f5205a;
                aVar2.f12710b.c0(this.f12704w);
                return;
        }
    }
}
