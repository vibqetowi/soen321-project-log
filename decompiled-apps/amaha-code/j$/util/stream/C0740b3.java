package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0740b3 extends AbstractC0751e implements Consumer, Iterable {

    /* renamed from: e  reason: collision with root package name */
    protected Object[] f21427e = new Object[1 << 4];
    protected Object[][] f;

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i6 = this.f21445b;
        Object[] objArr = this.f21427e;
        if (i6 == objArr.length) {
            if (this.f == null) {
                Object[][] objArr2 = new Object[8];
                this.f = objArr2;
                this.f21447d = new long[8];
                objArr2[0] = objArr;
            }
            int i10 = this.f21446c;
            int i11 = i10 + 1;
            Object[][] objArr3 = this.f;
            if (i11 >= objArr3.length || objArr3[i11] == null) {
                if (i10 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i10].length + this.f21447d[i10];
                }
                o(length + 1);
            }
            this.f21445b = 0;
            int i12 = this.f21446c + 1;
            this.f21446c = i12;
            this.f21427e = this.f[i12];
        }
        Object[] objArr4 = this.f21427e;
        int i13 = this.f21445b;
        this.f21445b = i13 + 1;
        objArr4[i13] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0751e
    public final void clear() {
        Object[][] objArr = this.f;
        if (objArr != null) {
            this.f21427e = objArr[0];
            int i6 = 0;
            while (true) {
                Object[] objArr2 = this.f21427e;
                if (i6 >= objArr2.length) {
                    break;
                }
                objArr2[i6] = null;
                i6++;
            }
            this.f = null;
            this.f21447d = null;
        } else {
            for (int i10 = 0; i10 < this.f21445b; i10++) {
                this.f21427e[i10] = null;
            }
        }
        this.f21445b = 0;
        this.f21446c = 0;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i6 = 0; i6 < this.f21446c; i6++) {
            for (Object obj : this.f[i6]) {
                consumer.accept(obj);
            }
        }
        for (int i10 = 0; i10 < this.f21445b; i10++) {
            consumer.accept(this.f21427e[i10]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.g0.i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(long j10) {
        long length;
        Object[][] objArr;
        int i6;
        int i10 = this.f21446c;
        if (i10 == 0) {
            length = this.f21427e.length;
        } else {
            length = this.f[i10].length + this.f21447d[i10];
        }
        if (j10 <= length) {
            return;
        }
        if (this.f == null) {
            Object[][] objArr2 = new Object[8];
            this.f = objArr2;
            this.f21447d = new long[8];
            objArr2[0] = this.f21427e;
        }
        while (true) {
            i10++;
            if (j10 <= length) {
                return;
            }
            Object[][] objArr3 = this.f;
            if (i10 >= objArr3.length) {
                int length2 = objArr3.length * 2;
                this.f = (Object[][]) Arrays.copyOf(objArr3, length2);
                this.f21447d = Arrays.copyOf(this.f21447d, length2);
            }
            int i11 = this.f21444a;
            if (i10 != 0 && i10 != 1) {
                i11 = Math.min((i11 + i10) - 1, 30);
            }
            int i12 = 1 << i11;
            this.f[i10] = new Object[i12];
            long[] jArr = this.f21447d;
            jArr[i10] = jArr[i10 - 1] + objArr[i6].length;
            length += i12;
        }
    }

    @Override // java.lang.Iterable
    public j$.util.S spliterator() {
        return new S2(this, 0, this.f21446c, 0, this.f21445b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Q.a(spliterator());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C0731a(arrayList, 10));
        String obj = arrayList.toString();
        return "SpinedBuffer:" + obj;
    }
}
