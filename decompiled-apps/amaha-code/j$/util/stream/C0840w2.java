package j$.util.stream;
/* renamed from: j$.util.stream.w2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0840w2 extends AbstractC0794m2 {

    /* renamed from: b  reason: collision with root package name */
    long f21580b;

    /* renamed from: c  reason: collision with root package name */
    long f21581c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0844x2 f21582d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840w2(C0844x2 c0844x2, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21582d = c0844x2;
        this.f21580b = c0844x2.f21588s;
        long j10 = c0844x2.f21589t;
        this.f21581c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        long j11 = this.f21580b;
        if (j11 != 0) {
            this.f21580b = j11 - 1;
            return;
        }
        long j12 = this.f21581c;
        if (j12 > 0) {
            this.f21581c = j12 - 1;
            this.f21507a.accept(j10);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21507a.c(AbstractC0850z0.W(j10, this.f21582d.f21588s, this.f21581c));
    }

    @Override // j$.util.stream.AbstractC0794m2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        return this.f21581c == 0 || this.f21507a.e();
    }
}
