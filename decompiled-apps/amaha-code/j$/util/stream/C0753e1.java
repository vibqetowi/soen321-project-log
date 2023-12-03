package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0753e1 extends L0 implements D0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0753e1(long j10, IntFunction intFunction) {
        super(j10, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f21319b;
        Object[] objArr = this.f21318a;
        if (i6 >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.f21319b = i6 + 1;
        objArr[i6] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.D0
    public final I0 build() {
        int i6 = this.f21319b;
        Object[] objArr = this.f21318a;
        if (i6 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21319b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        Object[] objArr = this.f21318a;
        if (j10 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(objArr.length)));
        }
        this.f21319b = 0;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void end() {
        int i6 = this.f21319b;
        Object[] objArr = this.f21318a;
        if (i6 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21319b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.L0
    public final String toString() {
        Object[] objArr = this.f21318a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f21319b), Arrays.toString(objArr));
    }
}
