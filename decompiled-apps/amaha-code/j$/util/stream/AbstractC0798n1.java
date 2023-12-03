package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.ArrayDeque;
import java.util.Comparator;
/* renamed from: j$.util.stream.n1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0798n1 implements j$.util.S {

    /* renamed from: a  reason: collision with root package name */
    I0 f21514a;

    /* renamed from: b  reason: collision with root package name */
    int f21515b;

    /* renamed from: c  reason: collision with root package name */
    j$.util.S f21516c;

    /* renamed from: d  reason: collision with root package name */
    j$.util.S f21517d;

    /* renamed from: e  reason: collision with root package name */
    ArrayDeque f21518e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0798n1(I0 i02) {
        this.f21514a = i02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static I0 a(ArrayDeque arrayDeque) {
        while (true) {
            I0 i02 = (I0) arrayDeque.pollFirst();
            if (i02 == null) {
                return null;
            }
            if (i02.n() != 0) {
                int n10 = i02.n();
                while (true) {
                    n10--;
                    if (n10 >= 0) {
                        arrayDeque.addFirst(i02.a(n10));
                    }
                }
            } else if (i02.count() > 0) {
                return i02;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int n10 = this.f21514a.n();
        while (true) {
            n10--;
            if (n10 < this.f21515b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f21514a.a(n10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.f21514a == null) {
            return false;
        }
        if (this.f21517d == null) {
            j$.util.S s10 = this.f21516c;
            if (s10 == null) {
                ArrayDeque b10 = b();
                this.f21518e = b10;
                I0 a10 = a(b10);
                if (a10 == null) {
                    this.f21514a = null;
                    return false;
                }
                s10 = a10.spliterator();
            }
            this.f21517d = s10;
            return true;
        }
        return true;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        long j10 = 0;
        if (this.f21514a == null) {
            return 0L;
        }
        j$.util.S s10 = this.f21516c;
        if (s10 != null) {
            return s10.estimateSize();
        }
        for (int i6 = this.f21515b; i6 < this.f21514a.n(); i6++) {
            j10 += this.f21514a.a(i6).count();
        }
        return j10;
    }

    @Override // j$.util.S
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0714b.d(this);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return AbstractC0714b.e(this, i6);
    }

    @Override // j$.util.S
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.S
    public /* bridge */ /* synthetic */ j$.util.I trySplit() {
        return (j$.util.I) trySplit();
    }

    @Override // j$.util.S
    public /* bridge */ /* synthetic */ j$.util.L trySplit() {
        return (j$.util.L) trySplit();
    }

    @Override // j$.util.S
    public /* bridge */ /* synthetic */ j$.util.O trySplit() {
        return (j$.util.O) trySplit();
    }

    @Override // j$.util.S
    public final j$.util.S trySplit() {
        I0 i02 = this.f21514a;
        if (i02 == null || this.f21517d != null) {
            return null;
        }
        j$.util.S s10 = this.f21516c;
        if (s10 != null) {
            return s10.trySplit();
        }
        if (this.f21515b < i02.n() - 1) {
            I0 i03 = this.f21514a;
            int i6 = this.f21515b;
            this.f21515b = i6 + 1;
            return i03.a(i6).spliterator();
        }
        I0 a10 = this.f21514a.a(this.f21515b);
        this.f21514a = a10;
        if (a10.n() == 0) {
            j$.util.S spliterator = this.f21514a.spliterator();
            this.f21516c = spliterator;
            return spliterator.trySplit();
        }
        I0 i04 = this.f21514a;
        this.f21515b = 0 + 1;
        return i04.a(0).spliterator();
    }
}
