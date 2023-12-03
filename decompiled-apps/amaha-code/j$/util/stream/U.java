package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
abstract class U implements P3, Q3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21391a;

    /* JADX INFO: Access modifiers changed from: protected */
    public U(boolean z10) {
        this.f21391a = z10;
    }

    public /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    public /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void c(long j10) {
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.P3
    public final Object k(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        (this.f21391a ? new V(abstractC0850z0, s10, this) : new W(abstractC0850z0, s10, abstractC0850z0.J0(this))).invoke();
        return null;
    }

    @Override // j$.util.stream.P3
    public final int o() {
        if (this.f21391a) {
            return 0;
        }
        return EnumC0765g3.r;
    }

    @Override // j$.util.stream.P3
    public final Object y(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        ((U) abstractC0850z0.I0(s10, this)).getClass();
        return null;
    }
}
