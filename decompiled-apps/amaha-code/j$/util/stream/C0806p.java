package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0806p extends AbstractC0799n2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21528b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f21529c;

    /* renamed from: d  reason: collision with root package name */
    Object f21530d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AbstractC0741c f21531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0806p(r rVar, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21531e = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0806p(C0837w c0837w, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21531e = c0837w;
        InterfaceC0818r2 interfaceC0818r22 = this.f21519a;
        Objects.requireNonNull(interfaceC0818r22);
        this.f21530d = new C0825t(interfaceC0818r22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0806p(C0841x c0841x, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21531e = c0841x;
        InterfaceC0818r2 interfaceC0818r22 = this.f21519a;
        Objects.requireNonNull(interfaceC0818r22);
        this.f21530d = new X(interfaceC0818r22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0806p(C0845y c0845y, InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
        this.f21531e = c0845y;
        InterfaceC0818r2 interfaceC0818r22 = this.f21519a;
        Objects.requireNonNull(interfaceC0818r22);
        this.f21530d = new C0767h0(interfaceC0818r22);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f21528b;
        AbstractC0741c abstractC0741c = this.f21531e;
        InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
        switch (i6) {
            case 0:
                if (obj != null) {
                    Object obj2 = this.f21530d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else if (this.f21529c) {
                    return;
                } else {
                    this.f21529c = true;
                    obj = null;
                }
                this.f21530d = obj;
                interfaceC0818r2.accept((InterfaceC0818r2) obj);
                return;
            case 1:
                InterfaceC0812q0 interfaceC0812q0 = (InterfaceC0812q0) ((Function) ((C0845y) abstractC0741c).f21591t).apply(obj);
                if (interfaceC0812q0 != null) {
                    try {
                        if (this.f21529c) {
                            j$.util.L spliterator = interfaceC0812q0.sequential().spliterator();
                            while (!interfaceC0818r2.e() && spliterator.tryAdvance((LongConsumer) this.f21530d)) {
                            }
                        } else {
                            interfaceC0812q0.sequential().forEach((LongConsumer) this.f21530d);
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
                    return;
                }
                return;
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C0841x) abstractC0741c).f21585t).apply(obj);
                if (intStream != null) {
                    try {
                        if (this.f21529c) {
                            j$.util.I spliterator2 = intStream.sequential().spliterator();
                            while (!interfaceC0818r2.e() && spliterator2.tryAdvance((IntConsumer) this.f21530d)) {
                            }
                        } else {
                            intStream.sequential().forEach((IntConsumer) this.f21530d);
                        }
                    } catch (Throwable th4) {
                        try {
                            intStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                H h10 = (H) ((Function) ((C0837w) abstractC0741c).f21576t).apply(obj);
                if (h10 != null) {
                    try {
                        if (this.f21529c) {
                            j$.util.F spliterator3 = h10.sequential().spliterator();
                            while (!interfaceC0818r2.e() && spliterator3.tryAdvance((DoubleConsumer) this.f21530d)) {
                            }
                        } else {
                            h10.sequential().forEach((DoubleConsumer) this.f21530d);
                        }
                    } catch (Throwable th6) {
                        try {
                            h10.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                if (h10 != null) {
                    h10.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        int i6 = this.f21528b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
        switch (i6) {
            case 0:
                this.f21529c = false;
                this.f21530d = null;
                interfaceC0818r2.c(-1L);
                return;
            case 1:
                interfaceC0818r2.c(-1L);
                return;
            case 2:
                interfaceC0818r2.c(-1L);
                return;
            default:
                interfaceC0818r2.c(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        int i6 = this.f21528b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
        switch (i6) {
            case 1:
                this.f21529c = true;
                return interfaceC0818r2.e();
            case 2:
                this.f21529c = true;
                return interfaceC0818r2.e();
            case 3:
                this.f21529c = true;
                return interfaceC0818r2.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        switch (this.f21528b) {
            case 0:
                this.f21529c = false;
                this.f21530d = null;
                this.f21519a.end();
                return;
            default:
                super.end();
                return;
        }
    }
}
