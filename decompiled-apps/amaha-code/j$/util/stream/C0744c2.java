package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* renamed from: j$.util.stream.c2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0744c2 extends AbstractC0799n2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21438b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC0741c f21439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0744c2(AbstractC0741c abstractC0741c, InterfaceC0818r2 interfaceC0818r2, int i6) {
        super(interfaceC0818r2);
        this.f21438b = i6;
        this.f21439c = abstractC0741c;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f21438b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
        AbstractC0741c abstractC0741c = this.f21439c;
        switch (i6) {
            case 0:
                ((Consumer) ((C0833v) abstractC0741c).f21564t).accept(obj);
                interfaceC0818r2.accept((InterfaceC0818r2) obj);
                return;
            case 1:
                if (((Predicate) ((C0833v) abstractC0741c).f21564t).test(obj)) {
                    interfaceC0818r2.accept((InterfaceC0818r2) obj);
                    return;
                }
                return;
            case 2:
                interfaceC0818r2.accept((InterfaceC0818r2) ((C0754e2) abstractC0741c).f21449t.apply(obj));
                return;
            case 3:
                interfaceC0818r2.accept(((ToIntFunction) ((C0841x) abstractC0741c).f21585t).applyAsInt(obj));
                return;
            case 4:
                interfaceC0818r2.accept(((ToLongFunction) ((C0845y) abstractC0741c).f21591t).applyAsLong(obj));
                return;
            default:
                interfaceC0818r2.accept(((ToDoubleFunction) ((C0837w) abstractC0741c).f21576t).applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        int i6 = this.f21438b;
        InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
        switch (i6) {
            case 1:
                interfaceC0818r2.c(-1L);
                return;
            default:
                interfaceC0818r2.c(j10);
                return;
        }
    }
}
