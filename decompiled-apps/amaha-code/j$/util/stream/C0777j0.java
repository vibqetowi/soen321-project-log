package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0777j0 extends AbstractC0794m2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f21496b;

    /* renamed from: c  reason: collision with root package name */
    C0767h0 f21497c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0845y f21498d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777j0(C0845y c0845y, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21498d = c0845y;
        InterfaceC0818r2 interfaceC0818r22 = this.f21507a;
        Objects.requireNonNull(interfaceC0818r22);
        this.f21497c = new C0767h0(interfaceC0818r22);
    }

    @Override // j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        InterfaceC0812q0 interfaceC0812q0 = (InterfaceC0812q0) ((LongFunction) this.f21498d.f21591t).apply(j10);
        if (interfaceC0812q0 != null) {
            try {
                if (this.f21496b) {
                    j$.util.L spliterator = interfaceC0812q0.sequential().spliterator();
                    while (!this.f21507a.e() && spliterator.tryAdvance((LongConsumer) this.f21497c)) {
                    }
                } else {
                    interfaceC0812q0.sequential().forEach(this.f21497c);
                }
            } catch (Throwable th2) {
                try {
                    interfaceC0812q0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (interfaceC0812q0 != null) {
            interfaceC0812q0.close();
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21507a.c(-1L);
    }

    @Override // j$.util.stream.AbstractC0794m2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        this.f21496b = true;
        return this.f21507a.e();
    }
}
