package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.v0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0834v0 implements InterfaceC0818r2 {

    /* renamed from: a  reason: collision with root package name */
    boolean f21565a;

    /* renamed from: b  reason: collision with root package name */
    boolean f21566b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0834v0(EnumC0838w0 enumC0838w0) {
        boolean z10;
        z10 = enumC0838w0.f21579b;
        this.f21566b = !z10;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
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
    public final boolean e() {
        return this.f21565a;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }
}
