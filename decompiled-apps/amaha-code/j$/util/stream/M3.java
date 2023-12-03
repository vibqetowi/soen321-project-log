package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class M3 implements InterfaceC0818r2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21337a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Consumer f21338b;

    public /* synthetic */ M3(Consumer consumer, int i6) {
        this.f21337a = i6;
        this.f21338b = consumer;
    }

    public final /* synthetic */ Consumer a(Consumer consumer) {
        switch (this.f21337a) {
            case 0:
                return AbstractC0689a.c(this, consumer);
            default:
                return AbstractC0689a.c(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f21337a) {
            case 0:
                AbstractC0850z0.z();
                throw null;
            default:
                AbstractC0850z0.z();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(int i6) {
        switch (this.f21337a) {
            case 0:
                AbstractC0850z0.G();
                throw null;
            default:
                AbstractC0850z0.G();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        switch (this.f21337a) {
            case 0:
                AbstractC0850z0.H();
                throw null;
            default:
                AbstractC0850z0.H();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f21337a;
        Consumer consumer = this.f21338b;
        switch (i6) {
            case 0:
                ((C0740b3) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
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
}
