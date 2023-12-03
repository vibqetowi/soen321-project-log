package j$.util.stream;

import java.util.Arrays;
import java.util.Spliterator;
/* renamed from: j$.util.stream.a3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0735a3 extends AbstractC0751e implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    Object f21421e;
    Object[] f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0735a3() {
        this.f21421e = newArray(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0735a3(int i6) {
        super(i6);
        this.f21421e = newArray(1 << this.f21444a);
    }

    public Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            f(newArray, 0);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.AbstractC0751e
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.f21421e = objArr[0];
            this.f = null;
            this.f21447d = null;
        }
        this.f21445b = 0;
        this.f21446c = 0;
    }

    public void f(Object obj, int i6) {
        long j10 = i6;
        long count = count() + j10;
        if (count > p(obj) || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f21446c == 0) {
            System.arraycopy(this.f21421e, 0, obj, i6, this.f21445b);
            return;
        }
        for (int i10 = 0; i10 < this.f21446c; i10++) {
            Object obj2 = this.f[i10];
            System.arraycopy(obj2, 0, obj, i6, p(obj2));
            i6 += p(this.f[i10]);
        }
        int i11 = this.f21445b;
        if (i11 > 0) {
            System.arraycopy(this.f21421e, 0, obj, i6, i11);
        }
    }

    public void g(Object obj) {
        for (int i6 = 0; i6 < this.f21446c; i6++) {
            Object obj2 = this.f[i6];
            o(obj2, 0, p(obj2), obj);
        }
        o(this.f21421e, 0, this.f21445b, obj);
    }

    public abstract Object newArray(int i6);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void o(Object obj, int i6, int i10, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int p(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int q(long j10) {
        if (this.f21446c == 0) {
            if (j10 < this.f21445b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else if (j10 < count()) {
            for (int i6 = 0; i6 <= this.f21446c; i6++) {
                if (j10 < this.f21447d[i6] + p(this.f[i6])) {
                    return i6;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(long j10) {
        long p10;
        int i6;
        int i10 = this.f21446c;
        if (i10 == 0) {
            p10 = p(this.f21421e);
        } else {
            p10 = p(this.f[i10]) + this.f21447d[i10];
        }
        if (j10 <= p10) {
            return;
        }
        if (this.f == null) {
            Object[] s10 = s();
            this.f = s10;
            this.f21447d = new long[8];
            s10[0] = this.f21421e;
        }
        int i11 = this.f21446c;
        while (true) {
            i11++;
            if (j10 <= p10) {
                return;
            }
            Object[] objArr = this.f;
            if (i11 >= objArr.length) {
                int length = objArr.length * 2;
                this.f = Arrays.copyOf(objArr, length);
                this.f21447d = Arrays.copyOf(this.f21447d, length);
            }
            int i12 = this.f21444a;
            if (i11 != 0 && i11 != 1) {
                i12 = Math.min((i12 + i11) - 1, 30);
            }
            int i13 = 1 << i12;
            this.f[i11] = newArray(i13);
            long[] jArr = this.f21447d;
            jArr[i11] = jArr[i11 - 1] + p(this.f[i6]);
            p10 += i13;
        }
    }

    protected abstract Object[] s();

    public abstract j$.util.S spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Q.a(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        long p10;
        if (this.f21445b == p(this.f21421e)) {
            if (this.f == null) {
                Object[] s10 = s();
                this.f = s10;
                this.f21447d = new long[8];
                s10[0] = this.f21421e;
            }
            int i6 = this.f21446c;
            int i10 = i6 + 1;
            Object[] objArr = this.f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                if (i6 == 0) {
                    p10 = p(this.f21421e);
                } else {
                    p10 = p(objArr[i6]) + this.f21447d[i6];
                }
                r(p10 + 1);
            }
            this.f21445b = 0;
            int i11 = this.f21446c + 1;
            this.f21446c = i11;
            this.f21421e = this.f[i11];
        }
    }
}
