package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0829u extends AbstractC0784k2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21555b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC0741c f21556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0829u(AbstractC0741c abstractC0741c, InterfaceC0818r2 interfaceC0818r2, int i6) {
        super(interfaceC0818r2);
        this.f21555b = i6;
        this.f21556c = abstractC0741c;
    }

    @Override // j$.util.stream.InterfaceC0804o2, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        int i6 = this.f21555b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21501a;
        AbstractC0741c abstractC0741c = this.f21556c;
        switch (i6) {
            case 0:
                interfaceC0818r2.accept((InterfaceC0818r2) ((DoubleFunction) ((C0833v) abstractC0741c).f21564t).apply(d10));
                return;
            case 1:
                j$.time.e.b(((C0837w) abstractC0741c).f21576t);
                throw null;
            case 2:
                j$.time.e.b(((C0841x) abstractC0741c).f21585t);
                throw null;
            case 3:
                j$.time.e.b(((C0845y) abstractC0741c).f21591t);
                throw null;
            case 4:
                j$.time.e.b(((C0837w) abstractC0741c).f21576t);
                throw null;
            default:
                ((DoubleConsumer) ((C0837w) abstractC0741c).f21576t).accept(d10);
                interfaceC0818r2.accept(d10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        int i6 = this.f21555b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21501a;
        switch (i6) {
            case 4:
                interfaceC0818r2.c(-1L);
                return;
            default:
                interfaceC0818r2.c(j10);
                return;
        }
    }
}
