package q7;

import c9.w;
import com.google.android.exoplayer2.audio.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29262u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a.C0132a f29263v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Exception f29264w;

    public /* synthetic */ i(a.C0132a c0132a, Exception exc, int i6) {
        this.f29262u = i6;
        this.f29263v = c0132a;
        this.f29264w = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f29262u;
        Exception exc = this.f29264w;
        a.C0132a c0132a = this.f29263v;
        switch (i6) {
            case 0:
                c0132a.getClass();
                int i10 = w.f5205a;
                c0132a.f6254b.S(exc);
                return;
            default:
                c0132a.getClass();
                int i11 = w.f5205a;
                c0132a.f6254b.Y(exc);
                return;
        }
    }
}
