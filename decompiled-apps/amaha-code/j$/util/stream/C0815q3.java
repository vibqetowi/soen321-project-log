package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.q3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0815q3 implements InterfaceC0804o2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f21539b;

    public /* synthetic */ C0815q3(DoubleConsumer doubleConsumer, int i6) {
        this.f21538a = i6;
        this.f21539b = doubleConsumer;
    }

    public final /* synthetic */ Consumer a(Consumer consumer) {
        switch (this.f21538a) {
            case 0:
                return AbstractC0689a.c(this, consumer);
            default:
                return AbstractC0689a.c(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0804o2, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        int i6 = this.f21538a;
        DoubleConsumer doubleConsumer = this.f21539b;
        switch (i6) {
            case 0:
                ((U2) doubleConsumer).accept(d10);
                return;
            default:
                doubleConsumer.accept(d10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(int i6) {
        switch (this.f21538a) {
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
        switch (this.f21538a) {
            case 0:
                AbstractC0850z0.H();
                throw null;
            default:
                AbstractC0850z0.H();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f21538a) {
            case 0:
                m((Double) obj);
                return;
            default:
                m((Double) obj);
                return;
        }
    }

    public final /* synthetic */ DoubleConsumer b(DoubleConsumer doubleConsumer) {
        switch (this.f21538a) {
            case 0:
                return AbstractC0689a.d(this, doubleConsumer);
            default:
                return AbstractC0689a.d(this, doubleConsumer);
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

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        switch (this.f21538a) {
            case 0:
                AbstractC0850z0.A(this, d10);
                return;
            default:
                AbstractC0850z0.A(this, d10);
                return;
        }
    }
}
