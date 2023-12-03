package p9;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ y f28057u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f28058v;

    public v(y yVar, int i6) {
        this.f28057u = yVar;
        this.f28058v = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28057u.Y.b(this.f28058v);
    }
}
