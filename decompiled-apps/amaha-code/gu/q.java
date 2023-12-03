package gu;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import gu.c;
import gu.m;
import j$.util.Iterator;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.function.Consumer;
import r1.b0;
/* compiled from: RopeByteString.java */
/* loaded from: classes2.dex */
public final class q extends gu.c {
    public static final int[] B;
    public int A;

    /* renamed from: v  reason: collision with root package name */
    public final int f16884v;

    /* renamed from: w  reason: collision with root package name */
    public final gu.c f16885w;

    /* renamed from: x  reason: collision with root package name */
    public final gu.c f16886x;

    /* renamed from: y  reason: collision with root package name */
    public final int f16887y;

    /* renamed from: z  reason: collision with root package name */
    public final int f16888z;

    /* compiled from: RopeByteString.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Stack<gu.c> f16889a = new Stack<>();

        public final void a(gu.c cVar) {
            if (cVar.r()) {
                int size = cVar.size();
                int[] iArr = q.B;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i6 = iArr[binarySearch + 1];
                Stack<gu.c> stack = this.f16889a;
                if (!stack.isEmpty() && stack.peek().size() < i6) {
                    int i10 = iArr[binarySearch];
                    gu.c pop = stack.pop();
                    while (!stack.isEmpty() && stack.peek().size() < i10) {
                        pop = new q(stack.pop(), pop);
                    }
                    q qVar = new q(pop, cVar);
                    while (!stack.isEmpty()) {
                        int[] iArr2 = q.B;
                        int binarySearch2 = Arrays.binarySearch(iArr2, qVar.f16884v);
                        if (binarySearch2 < 0) {
                            binarySearch2 = (-(binarySearch2 + 1)) - 1;
                        }
                        if (stack.peek().size() >= iArr2[binarySearch2 + 1]) {
                            break;
                        }
                        qVar = new q(stack.pop(), qVar);
                    }
                    stack.push(qVar);
                    return;
                }
                stack.push(cVar);
            } else if (cVar instanceof q) {
                q qVar2 = (q) cVar;
                a(qVar2.f16885w);
                a(qVar2.f16886x);
            } else {
                String valueOf = String.valueOf(cVar.getClass());
                throw new IllegalArgumentException(b0.b(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes2.dex */
    public static class b implements Iterator<m>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Stack<q> f16890u = new Stack<>();

        /* renamed from: v  reason: collision with root package name */
        public m f16891v;

        public b(gu.c cVar) {
            while (cVar instanceof q) {
                q qVar = (q) cVar;
                this.f16890u.push(qVar);
                cVar = qVar.f16885w;
            }
            this.f16891v = (m) cVar;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: a */
        public final m next() {
            m mVar;
            boolean z10;
            m mVar2 = this.f16891v;
            if (mVar2 != null) {
                while (true) {
                    Stack<q> stack = this.f16890u;
                    if (stack.isEmpty()) {
                        mVar = null;
                        break;
                    }
                    Object obj = stack.pop().f16886x;
                    while (obj instanceof q) {
                        q qVar = (q) obj;
                        stack.push(qVar);
                        obj = qVar.f16885w;
                    }
                    mVar = (m) obj;
                    if (mVar.f16879v.length == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        break;
                    }
                }
                this.f16891v = mVar;
                return mVar2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f16891v != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes2.dex */
    public class c implements c.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final b f16892u;

        /* renamed from: v  reason: collision with root package name */
        public m.a f16893v;

        /* renamed from: w  reason: collision with root package name */
        public int f16894w;

        public c(q qVar) {
            b bVar = new b(qVar);
            this.f16892u = bVar;
            this.f16893v = new m.a();
            this.f16894w = qVar.f16884v;
        }

        public final byte f() {
            if (!this.f16893v.hasNext()) {
                this.f16893v = new m.a();
            }
            this.f16894w--;
            return this.f16893v.f();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f16894w > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return Byte.valueOf(f());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i6 = 1;
        int i10 = 1;
        while (i6 > 0) {
            arrayList.add(Integer.valueOf(i6));
            int i11 = i10 + i6;
            i10 = i6;
            i6 = i11;
        }
        arrayList.add(Integer.valueOf((int) SubsamplingScaleImageView.TILE_SIZE_AUTO));
        B = new int[arrayList.size()];
        int i12 = 0;
        while (true) {
            int[] iArr = B;
            if (i12 < iArr.length) {
                iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
                i12++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ q() {
        throw null;
    }

    public q(gu.c cVar, gu.c cVar2) {
        this.A = 0;
        this.f16885w = cVar;
        this.f16886x = cVar2;
        int size = cVar.size();
        this.f16887y = size;
        this.f16884v = cVar2.size() + size;
        this.f16888z = Math.max(cVar.q(), cVar2.q()) + 1;
    }

    @Override // gu.c
    public final int C(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        gu.c cVar = this.f16885w;
        int i13 = this.f16887y;
        if (i12 <= i13) {
            return cVar.C(i6, i10, i11);
        }
        gu.c cVar2 = this.f16886x;
        if (i10 >= i13) {
            return cVar2.C(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return cVar2.C(cVar.C(i6, i10, i14), 0, i11 - i14);
    }

    @Override // gu.c
    public final int I() {
        return this.A;
    }

    @Override // gu.c
    public final String J() {
        byte[] bArr;
        int i6 = this.f16884v;
        if (i6 == 0) {
            bArr = h.f16872a;
        } else {
            byte[] bArr2 = new byte[i6];
            o(0, 0, i6, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // gu.c
    public final void K(OutputStream outputStream, int i6, int i10) {
        int i11 = i6 + i10;
        gu.c cVar = this.f16885w;
        int i12 = this.f16887y;
        if (i11 <= i12) {
            cVar.K(outputStream, i6, i10);
            return;
        }
        gu.c cVar2 = this.f16886x;
        if (i6 >= i12) {
            cVar2.K(outputStream, i6 - i12, i10);
            return;
        }
        int i13 = i12 - i6;
        cVar.K(outputStream, i6, i13);
        cVar2.K(outputStream, 0, i10 - i13);
    }

    public final boolean equals(Object obj) {
        boolean L;
        int I;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gu.c)) {
            return false;
        }
        gu.c cVar = (gu.c) obj;
        int size = cVar.size();
        int i6 = this.f16884v;
        if (i6 != size) {
            return false;
        }
        if (i6 == 0) {
            return true;
        }
        if (this.A != 0 && (I = cVar.I()) != 0 && this.A != I) {
            return false;
        }
        b bVar = new b(this);
        m next = bVar.next();
        b bVar2 = new b(cVar);
        m next2 = bVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = next.f16879v.length - i10;
            int length2 = next2.f16879v.length - i11;
            int min = Math.min(length, length2);
            if (i10 == 0) {
                L = next.L(next2, i11, min);
            } else {
                L = next2.L(next, i10, min);
            }
            if (!L) {
                return false;
            }
            i12 += min;
            if (i12 >= i6) {
                if (i12 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == length) {
                next = bVar.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == length2) {
                next2 = bVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    public final int hashCode() {
        int i6 = this.A;
        if (i6 == 0) {
            int i10 = this.f16884v;
            i6 = z(i10, 0, i10);
            if (i6 == 0) {
                i6 = 1;
            }
            this.A = i6;
        }
        return i6;
    }

    @Override // gu.c
    public final void o(int i6, int i10, int i11, byte[] bArr) {
        int i12 = i6 + i11;
        gu.c cVar = this.f16885w;
        int i13 = this.f16887y;
        if (i12 <= i13) {
            cVar.o(i6, i10, i11, bArr);
            return;
        }
        gu.c cVar2 = this.f16886x;
        if (i6 >= i13) {
            cVar2.o(i6 - i13, i10, i11, bArr);
            return;
        }
        int i14 = i13 - i6;
        cVar.o(i6, i10, i14, bArr);
        cVar2.o(0, i10 + i14, i11 - i14, bArr);
    }

    @Override // gu.c
    public final int q() {
        return this.f16888z;
    }

    @Override // gu.c
    public final boolean r() {
        if (this.f16884v >= B[this.f16888z]) {
            return true;
        }
        return false;
    }

    @Override // gu.c
    public final boolean s() {
        int C = this.f16885w.C(0, 0, this.f16887y);
        gu.c cVar = this.f16886x;
        if (cVar.C(C, 0, cVar.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // gu.c
    public final int size() {
        return this.f16884v;
    }

    @Override // gu.c, java.lang.Iterable
    /* renamed from: t */
    public final c.a iterator() {
        return new c(this);
    }

    @Override // gu.c
    public final int z(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        gu.c cVar = this.f16885w;
        int i13 = this.f16887y;
        if (i12 <= i13) {
            return cVar.z(i6, i10, i11);
        }
        gu.c cVar2 = this.f16886x;
        if (i10 >= i13) {
            return cVar2.z(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return cVar2.z(cVar.z(i6, i10, i14), 0, i11 - i14);
    }
}
