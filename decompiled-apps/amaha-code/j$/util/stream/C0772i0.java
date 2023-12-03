package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
/* renamed from: j$.util.stream.i0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0772i0 extends AbstractC0794m2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21486b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC0741c f21487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0772i0(AbstractC0741c abstractC0741c, InterfaceC0818r2 interfaceC0818r2, int i6) {
        super(interfaceC0818r2);
        this.f21486b = i6;
        this.f21487c = abstractC0741c;
    }

    @Override // j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        int i6 = this.f21486b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21507a;
        AbstractC0741c abstractC0741c = this.f21487c;
        switch (i6) {
            case 0:
                interfaceC0818r2.accept((InterfaceC0818r2) ((LongFunction) ((C0833v) abstractC0741c).f21564t).apply(j10));
                return;
            case 1:
                interfaceC0818r2.accept(j10);
                return;
            case 2:
                j$.time.e.b(((C0845y) abstractC0741c).f21591t);
                throw null;
            case 3:
                j$.time.e.b(((C0841x) abstractC0741c).f21585t);
                throw null;
            case 4:
                j$.time.e.b(((C0837w) abstractC0741c).f21576t);
                throw null;
            case 5:
                j$.time.e.b(((C0845y) abstractC0741c).f21591t);
                throw null;
            default:
                ((LongConsumer) ((C0845y) abstractC0741c).f21591t).accept(j10);
                interfaceC0818r2.accept(j10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        int i6 = this.f21486b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21507a;
        switch (i6) {
            case 5:
                interfaceC0818r2.c(-1L);
                return;
            default:
                interfaceC0818r2.c(j10);
                return;
        }
    }
}
