package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
/* loaded from: classes3.dex */
final class Z extends AbstractC0789l2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21410b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC0741c f21411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(AbstractC0741c abstractC0741c, InterfaceC0818r2 interfaceC0818r2, int i6) {
        super(interfaceC0818r2);
        this.f21410b = i6;
        this.f21411c = abstractC0741c;
    }

    @Override // j$.util.stream.InterfaceC0809p2, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        int i10 = this.f21410b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21504a;
        AbstractC0741c abstractC0741c = this.f21411c;
        switch (i10) {
            case 0:
                interfaceC0818r2.accept((InterfaceC0818r2) ((IntFunction) ((C0833v) abstractC0741c).f21564t).apply(i6));
                return;
            case 1:
                ((IntConsumer) ((C0841x) abstractC0741c).f21585t).accept(i6);
                interfaceC0818r2.accept(i6);
                return;
            case 2:
                interfaceC0818r2.accept(i6);
                return;
            case 3:
                interfaceC0818r2.accept(i6);
                return;
            case 4:
                j$.time.e.b(((C0841x) abstractC0741c).f21585t);
                throw null;
            case 5:
                j$.time.e.b(((C0845y) abstractC0741c).f21591t);
                throw null;
            case 6:
                j$.time.e.b(((C0837w) abstractC0741c).f21576t);
                throw null;
            default:
                j$.time.e.b(((C0841x) abstractC0741c).f21585t);
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        int i6 = this.f21410b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21504a;
        switch (i6) {
            case 7:
                interfaceC0818r2.c(-1L);
                return;
            default:
                interfaceC0818r2.c(j10);
                return;
        }
    }
}
