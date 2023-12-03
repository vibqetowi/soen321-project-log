package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements InterfaceC0814q2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LongConsumer f21562b;

    public /* synthetic */ u3(LongConsumer longConsumer, int i6) {
        this.f21561a = i6;
        this.f21562b = longConsumer;
    }

    public final /* synthetic */ Consumer a(Consumer consumer) {
        switch (this.f21561a) {
            case 0:
                return AbstractC0689a.c(this, consumer);
            default:
                return AbstractC0689a.c(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f21561a) {
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
        switch (this.f21561a) {
            case 0:
                AbstractC0850z0.G();
                throw null;
            default:
                AbstractC0850z0.G();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        int i6 = this.f21561a;
        LongConsumer longConsumer = this.f21562b;
        switch (i6) {
            case 0:
                ((Y2) longConsumer).accept(j10);
                return;
            default:
                longConsumer.accept(j10);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f21561a) {
            case 0:
                l((Long) obj);
                return;
            default:
                l((Long) obj);
                return;
        }
    }

    public final /* synthetic */ LongConsumer b(LongConsumer longConsumer) {
        switch (this.f21561a) {
            case 0:
                return AbstractC0689a.f(this, longConsumer);
            default:
                return AbstractC0689a.f(this, longConsumer);
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

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        switch (this.f21561a) {
            case 0:
                AbstractC0850z0.E(this, l2);
                return;
            default:
                AbstractC0850z0.E(this, l2);
                return;
        }
    }
}
