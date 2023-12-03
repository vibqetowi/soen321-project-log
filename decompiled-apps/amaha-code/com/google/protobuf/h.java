package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.f1;
import j$.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: v  reason: collision with root package name */
    public static final C0164h f9922v = new C0164h(y.f10087b);

    /* renamed from: w  reason: collision with root package name */
    public static final e f9923w;

    /* renamed from: u  reason: collision with root package name */
    public int f9924u = 0;

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public class a extends b {

        /* renamed from: u  reason: collision with root package name */
        public int f9925u = 0;

        /* renamed from: v  reason: collision with root package name */
        public final int f9926v;

        public a() {
            this.f9926v = h.this.size();
        }

        @Override // com.google.protobuf.h.f
        public final byte f() {
            int i6 = this.f9925u;
            if (i6 < this.f9926v) {
                this.f9925u = i6 + 1;
                return h.this.v(i6);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f9925u < this.f9926v) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static abstract class b implements f, Iterator {
        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
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

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class c implements e {
        @Override // com.google.protobuf.h.e
        public final byte[] a(int i6, byte[] bArr, int i10) {
            return Arrays.copyOfRange(bArr, i6, i10 + i6);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class d extends C0164h {

        /* renamed from: y  reason: collision with root package name */
        public final int f9928y;

        /* renamed from: z  reason: collision with root package name */
        public final int f9929z;

        public d(int i6, byte[] bArr, int i10) {
            super(bArr);
            h.q(i6, i6 + i10, bArr.length);
            this.f9928y = i6;
            this.f9929z = i10;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.h.C0164h
        public final int S() {
            return this.f9928y;
        }

        @Override // com.google.protobuf.h.C0164h, com.google.protobuf.h
        public final byte m(int i6) {
            h.o(i6, this.f9929z);
            return this.f9930x[this.f9928y + i6];
        }

        @Override // com.google.protobuf.h.C0164h, com.google.protobuf.h
        public final void s(int i6, int i10, int i11, byte[] bArr) {
            System.arraycopy(this.f9930x, this.f9928y + i6, bArr, i10, i11);
        }

        @Override // com.google.protobuf.h.C0164h, com.google.protobuf.h
        public final int size() {
            return this.f9929z;
        }

        @Override // com.google.protobuf.h.C0164h, com.google.protobuf.h
        public final byte v(int i6) {
            return this.f9930x[this.f9928y + i6];
        }

        public Object writeReplace() {
            return new C0164h(N());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface e {
        byte[] a(int i6, byte[] bArr, int i10);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface f extends java.util.Iterator<Byte> {
        byte f();
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static abstract class g extends h {
        public abstract boolean R(h hVar, int i6, int i10);

        @Override // com.google.protobuf.h, java.lang.Iterable
        public final java.util.Iterator<Byte> iterator() {
            return new a();
        }

        @Override // com.google.protobuf.h
        public final int t() {
            return 0;
        }

        @Override // com.google.protobuf.h
        public final boolean z() {
            return true;
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0164h extends g {

        /* renamed from: x  reason: collision with root package name */
        public final byte[] f9930x;

        public C0164h(byte[] bArr) {
            bArr.getClass();
            this.f9930x = bArr;
        }

        @Override // com.google.protobuf.h
        public final boolean C() {
            int S = S();
            return r1.f(S, this.f9930x, size() + S);
        }

        @Override // com.google.protobuf.h
        public final com.google.protobuf.i J() {
            return com.google.protobuf.i.f(this.f9930x, S(), size(), true);
        }

        @Override // com.google.protobuf.h
        public final int K(int i6, int i10, int i11) {
            int S = S() + i10;
            Charset charset = y.f10086a;
            for (int i12 = S; i12 < S + i11; i12++) {
                i6 = (i6 * 31) + this.f9930x[i12];
            }
            return i6;
        }

        @Override // com.google.protobuf.h
        public final int L(int i6, int i10, int i11) {
            int S = S() + i10;
            return r1.f10029a.e(i6, S, i11 + S, this.f9930x);
        }

        @Override // com.google.protobuf.h
        public final h M(int i6, int i10) {
            int q10 = h.q(i6, i10, size());
            if (q10 == 0) {
                return h.f9922v;
            }
            return new d(S() + i6, this.f9930x, q10);
        }

        @Override // com.google.protobuf.h
        public final String O(Charset charset) {
            return new String(this.f9930x, S(), size(), charset);
        }

        @Override // com.google.protobuf.h
        public final void Q(com.android.volley.toolbox.a aVar) {
            aVar.w(S(), this.f9930x, size());
        }

        @Override // com.google.protobuf.h.g
        public final boolean R(h hVar, int i6, int i10) {
            if (i10 <= hVar.size()) {
                int i11 = i6 + i10;
                if (i11 <= hVar.size()) {
                    if (hVar instanceof C0164h) {
                        C0164h c0164h = (C0164h) hVar;
                        int S = S() + i10;
                        int S2 = S();
                        int S3 = c0164h.S() + i6;
                        while (S2 < S) {
                            if (this.f9930x[S2] != c0164h.f9930x[S3]) {
                                return false;
                            }
                            S2++;
                            S3++;
                        }
                        return true;
                    }
                    return hVar.M(i6, i11).equals(M(0, i10));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i6 + ", " + i10 + ", " + hVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i10 + size());
        }

        public int S() {
            return 0;
        }

        @Override // com.google.protobuf.h
        public final ByteBuffer e() {
            return ByteBuffer.wrap(this.f9930x, S(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C0164h) {
                C0164h c0164h = (C0164h) obj;
                int i6 = this.f9924u;
                int i10 = c0164h.f9924u;
                if (i6 != 0 && i10 != 0 && i6 != i10) {
                    return false;
                }
                return R(c0164h, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.google.protobuf.h
        public byte m(int i6) {
            return this.f9930x[i6];
        }

        @Override // com.google.protobuf.h
        public void s(int i6, int i10, int i11, byte[] bArr) {
            System.arraycopy(this.f9930x, i6, bArr, i10, i11);
        }

        @Override // com.google.protobuf.h
        public int size() {
            return this.f9930x.length;
        }

        @Override // com.google.protobuf.h
        public byte v(int i6) {
            return this.f9930x[i6];
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class i implements e {
        @Override // com.google.protobuf.h.e
        public final byte[] a(int i6, byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i6, bArr2, 0, i10);
            return bArr2;
        }
    }

    static {
        e cVar;
        if (com.google.protobuf.d.a()) {
            cVar = new i();
        } else {
            cVar = new c();
        }
        f9923w = cVar;
    }

    public static h g(java.util.Iterator<h> it, int i6) {
        h pop;
        if (i6 >= 1) {
            if (i6 == 1) {
                return it.next();
            }
            int i10 = i6 >>> 1;
            h g5 = g(it, i10);
            h g10 = g(it, i6 - i10);
            if (SubsamplingScaleImageView.TILE_SIZE_AUTO - g5.size() >= g10.size()) {
                if (g10.size() == 0) {
                    return g5;
                }
                if (g5.size() != 0) {
                    int size = g10.size() + g5.size();
                    if (size < 128) {
                        int size2 = g5.size();
                        int size3 = g10.size();
                        int i11 = size2 + size3;
                        byte[] bArr = new byte[i11];
                        int i12 = size2 + 0;
                        q(0, i12, g5.size());
                        q(0, i12, i11);
                        if (size2 > 0) {
                            g5.s(0, 0, size2, bArr);
                        }
                        q(0, size3 + 0, g10.size());
                        q(size2, i11, i11);
                        if (size3 > 0) {
                            g10.s(0, size2, size3, bArr);
                        }
                        return new C0164h(bArr);
                    }
                    if (g5 instanceof f1) {
                        f1 f1Var = (f1) g5;
                        h hVar = f1Var.f9911z;
                        int size4 = g10.size() + hVar.size();
                        h hVar2 = f1Var.f9910y;
                        if (size4 < 128) {
                            int size5 = hVar.size();
                            int size6 = g10.size();
                            int i13 = size5 + size6;
                            byte[] bArr2 = new byte[i13];
                            int i14 = size5 + 0;
                            q(0, i14, hVar.size());
                            q(0, i14, i13);
                            if (size5 > 0) {
                                hVar.s(0, 0, size5, bArr2);
                            }
                            q(0, size6 + 0, g10.size());
                            q(size5, i13, i13);
                            if (size6 > 0) {
                                g10.s(0, size5, size6, bArr2);
                            }
                            pop = new f1(hVar2, new C0164h(bArr2));
                            return pop;
                        } else if (hVar2.t() > hVar.t() && f1Var.B > g10.t()) {
                            return new f1(hVar2, new f1(hVar, g10));
                        }
                    }
                    if (size >= f1.R(Math.max(g5.t(), g10.t()) + 1)) {
                        pop = new f1(g5, g10);
                    } else {
                        f1.b bVar = new f1.b();
                        bVar.a(g5);
                        bVar.a(g10);
                        ArrayDeque<h> arrayDeque = bVar.f9914a;
                        pop = arrayDeque.pop();
                        while (!arrayDeque.isEmpty()) {
                            pop = new f1(arrayDeque.pop(), pop);
                        }
                    }
                    return pop;
                }
                return g10;
            }
            throw new IllegalArgumentException("ByteString would be too long: " + g5.size() + "+" + g10.size());
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i6)));
    }

    public static void o(int i6, int i10) {
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException(defpackage.c.p("Index < 0: ", i6));
            }
            throw new ArrayIndexOutOfBoundsException(defpackage.b.j("Index > length: ", i6, ", ", i10));
        }
    }

    public static int q(int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if ((i6 | i10 | i12 | (i11 - i10)) < 0) {
            if (i6 >= 0) {
                if (i10 < i6) {
                    throw new IndexOutOfBoundsException(defpackage.b.j("Beginning index larger than ending index: ", i6, ", ", i10));
                }
                throw new IndexOutOfBoundsException(defpackage.b.j("End index: ", i10, " >= ", i11));
            }
            throw new IndexOutOfBoundsException(defpackage.c.q("Beginning index: ", i6, " < 0"));
        }
        return i12;
    }

    public static C0164h r(int i6, byte[] bArr, int i10) {
        q(i6, i6 + i10, bArr.length);
        return new C0164h(f9923w.a(i6, bArr, i10));
    }

    public abstract boolean C();

    @Override // java.lang.Iterable
    /* renamed from: I */
    public f iterator() {
        return new a();
    }

    public abstract com.google.protobuf.i J();

    public abstract int K(int i6, int i10, int i11);

    public abstract int L(int i6, int i10, int i11);

    public abstract h M(int i6, int i10);

    public final byte[] N() {
        int size = size();
        if (size == 0) {
            return y.f10087b;
        }
        byte[] bArr = new byte[size];
        s(0, 0, size, bArr);
        return bArr;
    }

    public abstract String O(Charset charset);

    public abstract void Q(com.android.volley.toolbox.a aVar);

    public abstract ByteBuffer e();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i6 = this.f9924u;
        if (i6 == 0) {
            int size = size();
            i6 = K(size, 0, size);
            if (i6 == 0) {
                i6 = 1;
            }
            this.f9924u = i6;
        }
        return i6;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract byte m(int i6);

    public abstract void s(int i6, int i10, int i11, byte[] bArr);

    public abstract int size();

    public abstract int t();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = hc.d.t(this);
        } else {
            str = hc.d.t(M(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte v(int i6);

    public abstract boolean z();
}
