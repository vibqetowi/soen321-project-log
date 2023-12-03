package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
/* renamed from: j$.util.stream.b0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0737b0 extends AbstractC0789l2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f21423b;

    /* renamed from: c  reason: collision with root package name */
    X f21424c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0841x f21425d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737b0(C0841x c0841x, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21425d = c0841x;
        InterfaceC0818r2 interfaceC0818r22 = this.f21504a;
        Objects.requireNonNull(interfaceC0818r22);
        this.f21424c = new X(interfaceC0818r22);
    }

    @Override // j$.util.stream.InterfaceC0809p2, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        IntStream intStream = (IntStream) ((IntFunction) this.f21425d.f21585t).apply(i6);
        if (intStream != null) {
            try {
                if (this.f21423b) {
                    j$.util.I spliterator = intStream.sequential().spliterator();
                    while (!this.f21504a.e() && spliterator.tryAdvance((IntConsumer) this.f21424c)) {
                    }
                } else {
                    intStream.sequential().forEach(this.f21424c);
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21504a.c(-1L);
    }

    @Override // j$.util.stream.AbstractC0789l2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        this.f21423b = true;
        return this.f21504a.e();
    }
}
