package j$.util.stream;
/* renamed from: j$.util.stream.y2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0848y2 extends AbstractC0784k2 {

    /* renamed from: b  reason: collision with root package name */
    long f21595b;

    /* renamed from: c  reason: collision with root package name */
    long f21596c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0852z2 f21597d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0848y2(C0852z2 c0852z2, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21597d = c0852z2;
        this.f21595b = c0852z2.f21610s;
        long j10 = c0852z2.f21611t;
        this.f21596c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.InterfaceC0804o2, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        long j10 = this.f21595b;
        if (j10 != 0) {
            this.f21595b = j10 - 1;
            return;
        }
        long j11 = this.f21596c;
        if (j11 > 0) {
            this.f21596c = j11 - 1;
            this.f21501a.accept(d10);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21501a.c(AbstractC0850z0.W(j10, this.f21597d.f21610s, this.f21596c));
    }

    @Override // j$.util.stream.AbstractC0784k2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        return this.f21596c == 0 || this.f21501a.e();
    }
}
