package q7;

import c9.w;
import com.google.android.exoplayer2.audio.a;
import com.google.android.gms.internal.p000firebaseauthapi.le;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29259u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a.C0132a f29260v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ le f29261w;

    public /* synthetic */ h(a.C0132a c0132a, le leVar, int i6) {
        this.f29259u = i6;
        this.f29260v = c0132a;
        this.f29261w = leVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29259u) {
            case 0:
                a.C0132a c0132a = this.f29260v;
                le leVar = this.f29261w;
                c0132a.getClass();
                synchronized (leVar) {
                }
                com.google.android.exoplayer2.audio.a aVar = c0132a.f6254b;
                int i6 = w.f5205a;
                aVar.M(leVar);
                return;
            default:
                a.C0132a c0132a2 = this.f29260v;
                c0132a2.getClass();
                int i10 = w.f5205a;
                c0132a2.f6254b.P(this.f29261w);
                return;
        }
    }
}
