package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
abstract class N implements Q3 {

    /* renamed from: a  reason: collision with root package name */
    boolean f21339a;

    /* renamed from: b  reason: collision with root package name */
    Object f21340b;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m(Object obj) {
        if (this.f21339a) {
            return;
        }
        this.f21339a = true;
        this.f21340b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void c(long j10) {
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        return this.f21339a;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }
}
