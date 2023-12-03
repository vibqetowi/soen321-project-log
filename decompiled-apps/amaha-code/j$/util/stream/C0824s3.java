package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.s3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0824s3 implements InterfaceC0809p2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f21550b;

    public /* synthetic */ C0824s3(IntConsumer intConsumer, int i6) {
        this.f21549a = i6;
        this.f21550b = intConsumer;
    }

    public final /* synthetic */ Consumer a(Consumer consumer) {
        switch (this.f21549a) {
            case 0:
                return AbstractC0689a.c(this, consumer);
            default:
                return AbstractC0689a.c(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f21549a) {
            case 0:
                AbstractC0850z0.z();
                throw null;
            default:
                AbstractC0850z0.z();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0809p2, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        int i10 = this.f21549a;
        IntConsumer intConsumer = this.f21550b;
        switch (i10) {
            case 0:
                ((W2) intConsumer).accept(i6);
                return;
            default:
                intConsumer.accept(i6);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        switch (this.f21549a) {
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
        switch (this.f21549a) {
            case 0:
                d((Integer) obj);
                return;
            default:
                d((Integer) obj);
                return;
        }
    }

    public final /* synthetic */ IntConsumer b(IntConsumer intConsumer) {
        switch (this.f21549a) {
            case 0:
                return AbstractC0689a.e(this, intConsumer);
            default:
                return AbstractC0689a.e(this, intConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void c(long j10) {
    }

    @Override // j$.util.stream.InterfaceC0809p2
    public final /* synthetic */ void d(Integer num) {
        switch (this.f21549a) {
            case 0:
                AbstractC0850z0.C(this, num);
                return;
            default:
                AbstractC0850z0.C(this, num);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }
}
