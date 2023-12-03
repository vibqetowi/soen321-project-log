package j$.util.stream;
/* renamed from: j$.util.stream.f2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0759f2 extends AbstractC0799n2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f21459b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0754e2 f21460c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0759f2(C0754e2 c0754e2, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21460c = c0754e2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Stream stream = (Stream) this.f21460c.f21449t.apply(obj);
        if (stream != null) {
            try {
                boolean z10 = this.f21459b;
                InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
                if (z10) {
                    j$.util.S spliterator = ((Stream) stream.sequential()).spliterator();
                    while (!interfaceC0818r2.e() && spliterator.tryAdvance(interfaceC0818r2)) {
                    }
                } else {
                    ((Stream) stream.sequential()).forEach(interfaceC0818r2);
                }
            } catch (Throwable th2) {
                try {
                    stream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (stream != null) {
            stream.close();
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21519a.c(-1L);
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        this.f21459b = true;
        return this.f21519a.e();
    }
}
