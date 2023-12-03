package d9;

import c9.w;
import d9.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12705u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o.a f12706v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f12707w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f12708x;

    public /* synthetic */ n(o.a aVar, int i6, long j10) {
        this.f12706v = aVar;
        this.f12707w = i6;
        this.f12708x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f12705u;
        long j10 = this.f12708x;
        int i10 = this.f12707w;
        o.a aVar = this.f12706v;
        switch (i6) {
            case 0:
                aVar.getClass();
                int i11 = w.f5205a;
                aVar.f12710b.o(i10, j10);
                return;
            default:
                aVar.getClass();
                int i12 = w.f5205a;
                aVar.f12710b.F(i10, j10);
                return;
        }
    }

    public /* synthetic */ n(o.a aVar, long j10, int i6) {
        this.f12706v = aVar;
        this.f12708x = j10;
        this.f12707w = i6;
    }
}
