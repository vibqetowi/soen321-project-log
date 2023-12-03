package gu;

import gu.q;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
/* compiled from: ByteString.java */
/* loaded from: classes2.dex */
public abstract class c implements Iterable<Byte> {

    /* renamed from: u  reason: collision with root package name */
    public static final m f16833u = new m(new byte[0]);

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public interface a extends Iterator<Byte> {
    }

    public static c e(Iterator<c> it, int i6) {
        if (i6 == 1) {
            return it.next();
        }
        int i10 = i6 >>> 1;
        return e(it, i10).g(e(it, i6 - i10));
    }

    public static b v() {
        return new b();
    }

    public abstract int C(int i6, int i10, int i11);

    public abstract int I();

    public abstract String J();

    public abstract void K(OutputStream outputStream, int i6, int i10);

    public final c g(c cVar) {
        q qVar;
        c pop;
        int size = size();
        int size2 = cVar.size();
        if (size + size2 < 2147483647L) {
            int[] iArr = q.B;
            if (this instanceof q) {
                qVar = (q) this;
            } else {
                qVar = null;
            }
            if (cVar.size() == 0) {
                return this;
            }
            if (size() != 0) {
                int size3 = cVar.size() + size();
                if (size3 < 128) {
                    int size4 = size();
                    int size5 = cVar.size();
                    byte[] bArr = new byte[size4 + size5];
                    m(0, 0, size4, bArr);
                    cVar.m(0, size4, size5, bArr);
                    return new m(bArr);
                }
                if (qVar != null) {
                    c cVar2 = qVar.f16886x;
                    if (cVar.size() + cVar2.size() < 128) {
                        int size6 = cVar2.size();
                        int size7 = cVar.size();
                        byte[] bArr2 = new byte[size6 + size7];
                        cVar2.m(0, 0, size6, bArr2);
                        cVar.m(0, size6, size7, bArr2);
                        return new q(qVar.f16885w, new m(bArr2));
                    }
                }
                if (qVar != null) {
                    c cVar3 = qVar.f16885w;
                    int q10 = cVar3.q();
                    c cVar4 = qVar.f16886x;
                    if (q10 > cVar4.q()) {
                        if (qVar.f16888z > cVar.q()) {
                            return new q(cVar3, new q(cVar4, cVar));
                        }
                    }
                }
                if (size3 >= q.B[Math.max(q(), cVar.q()) + 1]) {
                    pop = new q(this, cVar);
                } else {
                    q.a aVar = new q.a();
                    aVar.a(this);
                    aVar.a(cVar);
                    Stack<c> stack = aVar.f16889a;
                    pop = stack.pop();
                    while (!stack.isEmpty()) {
                        pop = new q(stack.pop(), pop);
                    }
                }
                return pop;
            }
            return cVar;
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void m(int i6, int i10, int i11, byte[] bArr) {
        if (i6 >= 0) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    int i12 = i6 + i11;
                    if (i12 <= size()) {
                        int i13 = i10 + i11;
                        if (i13 <= bArr.length) {
                            if (i11 > 0) {
                                o(i6, i10, i11, bArr);
                                return;
                            }
                            return;
                        }
                        throw new IndexOutOfBoundsException(defpackage.b.h(34, "Target end offset < 0: ", i13));
                    }
                    throw new IndexOutOfBoundsException(defpackage.b.h(34, "Source end offset < 0: ", i12));
                }
                throw new IndexOutOfBoundsException(defpackage.b.h(23, "Length < 0: ", i11));
            }
            throw new IndexOutOfBoundsException(defpackage.b.h(30, "Target offset < 0: ", i10));
        }
        throw new IndexOutOfBoundsException(defpackage.b.h(30, "Source offset < 0: ", i6));
    }

    public abstract void o(int i6, int i10, int i11, byte[] bArr);

    public abstract int q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract int size();

    @Override // java.lang.Iterable
    /* renamed from: t */
    public abstract a iterator();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int z(int i6, int i10, int i11);

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static final class b extends OutputStream {

        /* renamed from: z  reason: collision with root package name */
        public static final byte[] f16834z = new byte[0];

        /* renamed from: w  reason: collision with root package name */
        public int f16837w;

        /* renamed from: y  reason: collision with root package name */
        public int f16839y;

        /* renamed from: u  reason: collision with root package name */
        public final int f16835u = 128;

        /* renamed from: v  reason: collision with root package name */
        public final ArrayList<c> f16836v = new ArrayList<>();

        /* renamed from: x  reason: collision with root package name */
        public byte[] f16838x = new byte[128];

        public final void a(int i6) {
            this.f16836v.add(new m(this.f16838x));
            int length = this.f16837w + this.f16838x.length;
            this.f16837w = length;
            this.f16838x = new byte[Math.max(this.f16835u, Math.max(i6, length >>> 1))];
            this.f16839y = 0;
        }

        public final void e() {
            int i6 = this.f16839y;
            byte[] bArr = this.f16838x;
            int length = bArr.length;
            ArrayList<c> arrayList = this.f16836v;
            if (i6 < length) {
                if (i6 > 0) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i6));
                    arrayList.add(new m(bArr2));
                }
            } else {
                arrayList.add(new m(this.f16838x));
                this.f16838x = f16834z;
            }
            this.f16837w += this.f16839y;
            this.f16839y = 0;
        }

        public final synchronized c g() {
            c e10;
            e();
            ArrayList<c> arrayList = this.f16836v;
            if (!(arrayList instanceof Collection)) {
                ArrayList<c> arrayList2 = new ArrayList<>();
                Iterator<c> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            if (arrayList.isEmpty()) {
                e10 = c.f16833u;
            } else {
                e10 = c.e(arrayList.iterator(), arrayList.size());
            }
            return e10;
        }

        public final String toString() {
            int i6;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i6 = this.f16837w + this.f16839y;
            }
            objArr[1] = Integer.valueOf(i6);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i6) {
            if (this.f16839y == this.f16838x.length) {
                a(1);
            }
            byte[] bArr = this.f16838x;
            int i10 = this.f16839y;
            this.f16839y = i10 + 1;
            bArr[i10] = (byte) i6;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i6, int i10) {
            byte[] bArr2 = this.f16838x;
            int length = bArr2.length;
            int i11 = this.f16839y;
            if (i10 <= length - i11) {
                System.arraycopy(bArr, i6, bArr2, i11, i10);
                this.f16839y += i10;
            } else {
                int length2 = bArr2.length - i11;
                System.arraycopy(bArr, i6, bArr2, i11, length2);
                int i12 = i10 - length2;
                a(i12);
                System.arraycopy(bArr, i6 + length2, this.f16838x, 0, i12);
                this.f16839y = i12;
            }
        }
    }
}
