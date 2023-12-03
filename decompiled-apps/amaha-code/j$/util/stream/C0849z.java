package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0849z extends AbstractC0784k2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f21599b;

    /* renamed from: c  reason: collision with root package name */
    C0825t f21600c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0837w f21601d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0849z(C0837w c0837w, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21601d = c0837w;
        InterfaceC0818r2 interfaceC0818r22 = this.f21501a;
        Objects.requireNonNull(interfaceC0818r22);
        this.f21600c = new C0825t(interfaceC0818r22);
    }

    @Override // j$.util.stream.InterfaceC0804o2, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        H h10 = (H) ((DoubleFunction) this.f21601d.f21576t).apply(d10);
        if (h10 != null) {
            try {
                if (this.f21599b) {
                    j$.util.F spliterator = h10.sequential().spliterator();
                    while (!this.f21501a.e() && spliterator.tryAdvance((DoubleConsumer) this.f21600c)) {
                    }
                } else {
                    h10.sequential().forEach(this.f21600c);
                }
            } catch (Throwable th2) {
                try {
                    h10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (h10 != null) {
            h10.close();
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21501a.c(-1L);
    }

    @Override // j$.util.stream.AbstractC0784k2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        this.f21599b = true;
        return this.f21501a.e();
    }
}
