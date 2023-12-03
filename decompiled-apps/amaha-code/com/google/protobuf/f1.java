package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.h;
import com.google.protobuf.i;
import j$.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: RopeByteString.java */
/* loaded from: classes.dex */
public final class f1 extends h {
    public static final int[] C = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, SubsamplingScaleImageView.TILE_SIZE_AUTO};
    public final int A;
    public final int B;

    /* renamed from: x  reason: collision with root package name */
    public final int f9909x;

    /* renamed from: y  reason: collision with root package name */
    public final h f9910y;

    /* renamed from: z  reason: collision with root package name */
    public final h f9911z;

    /* compiled from: RopeByteString.java */
    /* loaded from: classes.dex */
    public class a extends h.b {

        /* renamed from: u  reason: collision with root package name */
        public final c f9912u;

        /* renamed from: v  reason: collision with root package name */
        public h.f f9913v = a();

        public a(f1 f1Var) {
            this.f9912u = new c(f1Var);
        }

        public final h.a a() {
            c cVar = this.f9912u;
            if (cVar.hasNext()) {
                return new h.a();
            }
            return null;
        }

        @Override // com.google.protobuf.h.f
        public final byte f() {
            h.f fVar = this.f9913v;
            if (fVar != null) {
                byte f = fVar.f();
                if (!this.f9913v.hasNext()) {
                    this.f9913v = a();
                }
                return f;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f9913v != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque<h> f9914a = new ArrayDeque<>();

        public final void a(h hVar) {
            if (hVar.z()) {
                int binarySearch = Arrays.binarySearch(f1.C, hVar.size());
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int R = f1.R(binarySearch + 1);
                ArrayDeque<h> arrayDeque = this.f9914a;
                if (!arrayDeque.isEmpty() && arrayDeque.peek().size() < R) {
                    int R2 = f1.R(binarySearch);
                    h pop = arrayDeque.pop();
                    while (!arrayDeque.isEmpty() && arrayDeque.peek().size() < R2) {
                        pop = new f1(arrayDeque.pop(), pop);
                    }
                    f1 f1Var = new f1(pop, hVar);
                    while (!arrayDeque.isEmpty()) {
                        int binarySearch2 = Arrays.binarySearch(f1.C, f1Var.f9909x);
                        if (binarySearch2 < 0) {
                            binarySearch2 = (-(binarySearch2 + 1)) - 1;
                        }
                        if (arrayDeque.peek().size() >= f1.R(binarySearch2 + 1)) {
                            break;
                        }
                        f1Var = new f1(arrayDeque.pop(), f1Var);
                    }
                    arrayDeque.push(f1Var);
                    return;
                }
                arrayDeque.push(hVar);
            } else if (hVar instanceof f1) {
                f1 f1Var2 = (f1) hVar;
                a(f1Var2.f9910y);
                a(f1Var2.f9911z);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + hVar.getClass());
            }
        }
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes.dex */
    public static final class c implements Iterator<h.g>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final ArrayDeque<f1> f9915u;

        /* renamed from: v  reason: collision with root package name */
        public h.g f9916v;

        public c(h hVar) {
            if (hVar instanceof f1) {
                f1 f1Var = (f1) hVar;
                ArrayDeque<f1> arrayDeque = new ArrayDeque<>(f1Var.B);
                this.f9915u = arrayDeque;
                arrayDeque.push(f1Var);
                h hVar2 = f1Var.f9910y;
                while (hVar2 instanceof f1) {
                    f1 f1Var2 = (f1) hVar2;
                    this.f9915u.push(f1Var2);
                    hVar2 = f1Var2.f9910y;
                }
                this.f9916v = (h.g) hVar2;
                return;
            }
            this.f9915u = null;
            this.f9916v = (h.g) hVar;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: a */
        public final h.g next() {
            h.g gVar;
            h.g gVar2 = this.f9916v;
            if (gVar2 != null) {
                do {
                    ArrayDeque<f1> arrayDeque = this.f9915u;
                    if (arrayDeque != null && !arrayDeque.isEmpty()) {
                        h hVar = arrayDeque.pop().f9911z;
                        while (hVar instanceof f1) {
                            f1 f1Var = (f1) hVar;
                            arrayDeque.push(f1Var);
                            hVar = f1Var.f9910y;
                        }
                        gVar = (h.g) hVar;
                    } else {
                        gVar = null;
                        break;
                    }
                } while (gVar.isEmpty());
                this.f9916v = gVar;
                return gVar2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f9916v != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ f1() {
        throw null;
    }

    public f1(h hVar, h hVar2) {
        this.f9910y = hVar;
        this.f9911z = hVar2;
        int size = hVar.size();
        this.A = size;
        this.f9909x = hVar2.size() + size;
        this.B = Math.max(hVar.t(), hVar2.t()) + 1;
    }

    public static int R(int i6) {
        if (i6 >= 47) {
            return SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        return C[i6];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.h
    public final boolean C() {
        int L = this.f9910y.L(0, 0, this.A);
        h hVar = this.f9911z;
        if (hVar.L(L, 0, hVar.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.h
    public final h.f I() {
        return new a(this);
    }

    @Override // com.google.protobuf.h
    public final i J() {
        boolean z10;
        h.g gVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.B);
        arrayDeque.push(this);
        h hVar = this.f9910y;
        while (hVar instanceof f1) {
            f1 f1Var = (f1) hVar;
            arrayDeque.push(f1Var);
            hVar = f1Var.f9910y;
        }
        h.g gVar2 = (h.g) hVar;
        while (true) {
            boolean z11 = false;
            if (gVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (gVar2 != null) {
                    while (true) {
                        if (arrayDeque.isEmpty()) {
                            gVar = null;
                            break;
                        }
                        h hVar2 = ((f1) arrayDeque.pop()).f9911z;
                        while (hVar2 instanceof f1) {
                            f1 f1Var2 = (f1) hVar2;
                            arrayDeque.push(f1Var2);
                            hVar2 = f1Var2.f9910y;
                        }
                        gVar = (h.g) hVar2;
                        if (!gVar.isEmpty()) {
                            break;
                        }
                    }
                    arrayList.add(gVar2.e());
                    gVar2 = gVar;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                java.util.Iterator it = arrayList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    i6 += byteBuffer.remaining();
                    if (byteBuffer.hasArray()) {
                        z11 |= true;
                    } else if (byteBuffer.isDirect()) {
                        z11 |= true;
                    } else {
                        z11 |= true;
                    }
                }
                if (z11) {
                    return new i.b(arrayList, i6);
                }
                return new i.c(new a0(arrayList));
            }
        }
    }

    @Override // com.google.protobuf.h
    public final int K(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        h hVar = this.f9910y;
        int i13 = this.A;
        if (i12 <= i13) {
            return hVar.K(i6, i10, i11);
        }
        h hVar2 = this.f9911z;
        if (i10 >= i13) {
            return hVar2.K(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return hVar2.K(hVar.K(i6, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.h
    public final int L(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        h hVar = this.f9910y;
        int i13 = this.A;
        if (i12 <= i13) {
            return hVar.L(i6, i10, i11);
        }
        h hVar2 = this.f9911z;
        if (i10 >= i13) {
            return hVar2.L(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return hVar2.L(hVar.L(i6, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.h
    public final h M(int i6, int i10) {
        int i11 = this.f9909x;
        int q10 = h.q(i6, i10, i11);
        if (q10 == 0) {
            return h.f9922v;
        }
        if (q10 == i11) {
            return this;
        }
        h hVar = this.f9910y;
        int i12 = this.A;
        if (i10 <= i12) {
            return hVar.M(i6, i10);
        }
        h hVar2 = this.f9911z;
        if (i6 >= i12) {
            return hVar2.M(i6 - i12, i10 - i12);
        }
        return new f1(hVar.M(i6, hVar.size()), hVar2.M(0, i10 - i12));
    }

    @Override // com.google.protobuf.h
    public final String O(Charset charset) {
        return new String(N(), charset);
    }

    @Override // com.google.protobuf.h
    public final void Q(com.android.volley.toolbox.a aVar) {
        this.f9910y.Q(aVar);
        this.f9911z.Q(aVar);
    }

    @Override // com.google.protobuf.h
    public final ByteBuffer e() {
        return ByteBuffer.wrap(N()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.h
    public final boolean equals(Object obj) {
        boolean R;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        int size = hVar.size();
        int i6 = this.f9909x;
        if (i6 != size) {
            return false;
        }
        if (i6 == 0) {
            return true;
        }
        int i10 = this.f9924u;
        int i11 = hVar.f9924u;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        c cVar = new c(this);
        h.g next = cVar.next();
        c cVar2 = new c(hVar);
        h.g next2 = cVar2.next();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int size2 = next.size() - i12;
            int size3 = next2.size() - i13;
            int min = Math.min(size2, size3);
            if (i12 == 0) {
                R = next.R(next2, i13, min);
            } else {
                R = next2.R(next, i12, min);
            }
            if (!R) {
                return false;
            }
            i14 += min;
            if (i14 >= i6) {
                if (i14 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size2) {
                next = cVar.next();
                i12 = 0;
            } else {
                i12 += min;
            }
            if (min == size3) {
                next2 = cVar2.next();
                i13 = 0;
            } else {
                i13 += min;
            }
        }
    }

    @Override // com.google.protobuf.h, java.lang.Iterable
    public final java.util.Iterator<Byte> iterator() {
        return new a(this);
    }

    @Override // com.google.protobuf.h
    public final byte m(int i6) {
        h.o(i6, this.f9909x);
        return v(i6);
    }

    @Override // com.google.protobuf.h
    public final void s(int i6, int i10, int i11, byte[] bArr) {
        int i12 = i6 + i11;
        h hVar = this.f9910y;
        int i13 = this.A;
        if (i12 <= i13) {
            hVar.s(i6, i10, i11, bArr);
            return;
        }
        h hVar2 = this.f9911z;
        if (i6 >= i13) {
            hVar2.s(i6 - i13, i10, i11, bArr);
            return;
        }
        int i14 = i13 - i6;
        hVar.s(i6, i10, i14, bArr);
        hVar2.s(0, i10 + i14, i11 - i14, bArr);
    }

    @Override // com.google.protobuf.h
    public final int size() {
        return this.f9909x;
    }

    @Override // com.google.protobuf.h
    public final int t() {
        return this.B;
    }

    @Override // com.google.protobuf.h
    public final byte v(int i6) {
        int i10 = this.A;
        if (i6 < i10) {
            return this.f9910y.v(i6);
        }
        return this.f9911z.v(i6 - i10);
    }

    public Object writeReplace() {
        return new h.C0164h(N());
    }

    @Override // com.google.protobuf.h
    public final boolean z() {
        if (this.f9909x >= R(this.B)) {
            return true;
        }
        return false;
    }
}
