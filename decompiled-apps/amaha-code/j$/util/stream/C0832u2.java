package j$.util.stream;
/* renamed from: j$.util.stream.u2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0832u2 extends AbstractC0789l2 {

    /* renamed from: b  reason: collision with root package name */
    long f21558b;

    /* renamed from: c  reason: collision with root package name */
    long f21559c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0836v2 f21560d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0832u2(C0836v2 c0836v2, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21560d = c0836v2;
        this.f21558b = c0836v2.f21573s;
        long j10 = c0836v2.f21574t;
        this.f21559c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.InterfaceC0809p2, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        long j10 = this.f21558b;
        if (j10 != 0) {
            this.f21558b = j10 - 1;
            return;
        }
        long j11 = this.f21559c;
        if (j11 > 0) {
            this.f21559c = j11 - 1;
            this.f21504a.accept(i6);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21504a.c(AbstractC0850z0.W(j10, this.f21560d.f21573s, this.f21559c));
    }

    @Override // j$.util.stream.AbstractC0789l2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        return this.f21559c == 0 || this.f21504a.e();
    }
}
