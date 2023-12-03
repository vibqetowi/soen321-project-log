package q7;

import c9.w;
import com.google.android.exoplayer2.audio.a;
import d9.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29265u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f29266v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f29267w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f29268x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f29269y;

    public /* synthetic */ j(Object obj, String str, long j10, long j11, int i6) {
        this.f29265u = i6;
        this.f29269y = obj;
        this.f29266v = str;
        this.f29267w = j10;
        this.f29268x = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f29265u;
        Object obj = this.f29269y;
        switch (i6) {
            case 0:
                String str = this.f29266v;
                long j10 = this.f29267w;
                long j11 = this.f29268x;
                com.google.android.exoplayer2.audio.a aVar = ((a.C0132a) obj).f6254b;
                int i10 = w.f5205a;
                aVar.Q(j10, str, j11);
                return;
            default:
                String str2 = this.f29266v;
                long j12 = this.f29267w;
                long j13 = this.f29268x;
                d9.o oVar = ((o.a) obj).f12710b;
                int i11 = w.f5205a;
                oVar.H(j12, str2, j13);
                return;
        }
    }
}
