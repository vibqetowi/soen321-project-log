package pl.droidsonroids.gif;
/* compiled from: GifDrawable.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f28567v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, b bVar2) {
        super(bVar2);
        this.f28567v = bVar;
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        b bVar = this.f28567v;
        if (bVar.A.o()) {
            bVar.start();
        }
    }
}
