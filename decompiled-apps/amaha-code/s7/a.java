package s7;

import com.google.android.exoplayer2.drm.c;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31293u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c.a f31294v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.c f31295w;

    public /* synthetic */ a(c.a aVar, com.google.android.exoplayer2.drm.c cVar, int i6) {
        this.f31293u = i6;
        this.f31294v = aVar;
        this.f31295w = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f31293u;
        com.google.android.exoplayer2.drm.c cVar = this.f31295w;
        c.a aVar = this.f31294v;
        switch (i6) {
            case 0:
                cVar.h0(aVar.f6438a, aVar.f6439b);
                return;
            case 1:
                cVar.O(aVar.f6438a, aVar.f6439b);
                return;
            case 2:
                cVar.X(aVar.f6438a, aVar.f6439b);
                return;
            default:
                cVar.k0(aVar.f6438a, aVar.f6439b);
                return;
        }
    }
}
