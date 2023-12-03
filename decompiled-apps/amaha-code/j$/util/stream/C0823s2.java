package j$.util.stream;
/* renamed from: j$.util.stream.s2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0823s2 extends AbstractC0799n2 {

    /* renamed from: b  reason: collision with root package name */
    long f21546b;

    /* renamed from: c  reason: collision with root package name */
    long f21547c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0828t2 f21548d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0823s2(C0828t2 c0828t2, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21548d = c0828t2;
        this.f21546b = c0828t2.f21553s;
        long j10 = c0828t2.f21554t;
        this.f21547c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j10 = this.f21546b;
        if (j10 != 0) {
            this.f21546b = j10 - 1;
            return;
        }
        long j11 = this.f21547c;
        if (j11 > 0) {
            this.f21547c = j11 - 1;
            this.f21519a.accept((InterfaceC0818r2) obj);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21519a.c(AbstractC0850z0.W(j10, this.f21548d.f21553s, this.f21547c));
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        return this.f21547c == 0 || this.f21519a.e();
    }
}
