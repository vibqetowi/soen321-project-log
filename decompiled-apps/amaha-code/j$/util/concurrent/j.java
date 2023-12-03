package j$.util.concurrent;

import j$.util.AbstractC0714b;
import j$.util.S;
import java.util.Comparator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j extends q implements S {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f21147i;

    /* renamed from: j  reason: collision with root package name */
    long f21148j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i6, int i10, int i11, long j10, int i12) {
        super(lVarArr, i6, i10, i11);
        this.f21147i = i12;
        this.f21148j = j10;
    }

    @Override // j$.util.S
    public final int characteristics() {
        switch (this.f21147i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.S
    public final long estimateSize() {
        switch (this.f21147i) {
            case 0:
                return this.f21148j;
            default:
                return this.f21148j;
        }
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f21147i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a10 = a();
                    if (a10 == null) {
                        return;
                    }
                    consumer.accept(a10.f21153b);
                }
            default:
                consumer.getClass();
                while (true) {
                    l a11 = a();
                    if (a11 == null) {
                        return;
                    }
                    consumer.accept(a11.f21154c);
                }
        }
    }

    @Override // j$.util.S
    public final Comparator getComparator() {
        switch (this.f21147i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f21147i) {
            case 0:
                return AbstractC0714b.d(this);
            default:
                return AbstractC0714b.d(this);
        }
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        switch (this.f21147i) {
            case 0:
                return AbstractC0714b.e(this, i6);
            default:
                return AbstractC0714b.e(this, i6);
        }
    }

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f21147i) {
            case 0:
                consumer.getClass();
                l a10 = a();
                if (a10 == null) {
                    return false;
                }
                consumer.accept(a10.f21153b);
                return true;
            default:
                consumer.getClass();
                l a11 = a();
                if (a11 == null) {
                    return false;
                }
                consumer.accept(a11.f21154c);
                return true;
        }
    }

    @Override // j$.util.S
    public final S trySplit() {
        switch (this.f21147i) {
            case 0:
                int i6 = this.f;
                int i10 = this.f21165g;
                int i11 = (i6 + i10) >>> 1;
                if (i11 <= i6) {
                    return null;
                }
                l[] lVarArr = this.f21160a;
                int i12 = this.f21166h;
                this.f21165g = i11;
                long j10 = this.f21148j >>> 1;
                this.f21148j = j10;
                return new j(lVarArr, i12, i11, i10, j10, 0);
            default:
                int i13 = this.f;
                int i14 = this.f21165g;
                int i15 = (i13 + i14) >>> 1;
                if (i15 <= i13) {
                    return null;
                }
                l[] lVarArr2 = this.f21160a;
                int i16 = this.f21166h;
                this.f21165g = i15;
                long j11 = this.f21148j >>> 1;
                this.f21148j = j11;
                return new j(lVarArr2, i16, i15, i14, j11, 1);
        }
    }
}
