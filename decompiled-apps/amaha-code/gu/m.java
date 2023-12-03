package gu;

import gu.c;
import j$.util.Iterator;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import r1.b0;
/* compiled from: LiteralByteString.java */
/* loaded from: classes2.dex */
public class m extends c {

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f16879v;

    /* renamed from: w  reason: collision with root package name */
    public int f16880w = 0;

    /* compiled from: LiteralByteString.java */
    /* loaded from: classes2.dex */
    public class a implements c.a, Iterator {

        /* renamed from: u  reason: collision with root package name */
        public int f16881u = 0;

        /* renamed from: v  reason: collision with root package name */
        public final int f16882v;

        public a() {
            this.f16882v = m.this.f16879v.length;
        }

        public final byte f() {
            try {
                byte[] bArr = m.this.f16879v;
                int i6 = this.f16881u;
                this.f16881u = i6 + 1;
                return bArr[i6];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f16881u < this.f16882v) {
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

    public m(byte[] bArr) {
        this.f16879v = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1[r11] > (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
        if (r1[r11] > (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
        if (r1[r11] > (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
        r11 = r10;
     */
    @Override // gu.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(int i6, int i10, int i11) {
        int i12;
        int i13;
        byte b10 = 0;
        int i14 = i10 + 0;
        int i15 = i11 + i14;
        byte[] bArr = this.f16879v;
        if (i6 != 0) {
            if (i14 < i15) {
                byte b11 = (byte) i6;
                if (b11 < -32) {
                    if (b11 >= -62) {
                        i12 = i14 + 1;
                    }
                    return -1;
                } else if (b11 < -16) {
                    byte b12 = (byte) (~(i6 >> 8));
                    if (b12 == 0) {
                        int i16 = i14 + 1;
                        byte b13 = bArr[i14];
                        if (i16 >= i15) {
                            if (b11 <= -12 && b13 <= -65) {
                                i13 = b13 << 8;
                                return i13 ^ b11;
                            }
                            return -1;
                        }
                        i14 = i16;
                        b12 = b13;
                    }
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        i12 = i14 + 1;
                    }
                    return -1;
                } else {
                    byte b14 = (byte) (~(i6 >> 8));
                    if (b14 == 0) {
                        int i17 = i14 + 1;
                        b14 = bArr[i14];
                        if (i17 >= i15) {
                            if (b11 <= -12 && b14 <= -65) {
                                i13 = b14 << 8;
                                return i13 ^ b11;
                            }
                            return -1;
                        }
                        i14 = i17;
                    } else {
                        b10 = (byte) (i6 >> 16);
                    }
                    if (b10 == 0) {
                        int i18 = i14 + 1;
                        b10 = bArr[i14];
                        if (i18 >= i15) {
                            if (b11 <= -12 && b14 <= -65 && b10 <= -65) {
                                return ((b14 << 8) ^ b11) ^ (b10 << 16);
                            }
                            return -1;
                        }
                        i14 = i18;
                    }
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && b10 <= -65) {
                            i12 = i14 + 1;
                        }
                    }
                    return -1;
                }
            }
            return i6;
        }
        return ta.v.J(i14, bArr, i15);
    }

    @Override // gu.c
    public final int I() {
        return this.f16880w;
    }

    @Override // gu.c
    public final String J() {
        byte[] bArr = this.f16879v;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // gu.c
    public final void K(OutputStream outputStream, int i6, int i10) {
        outputStream.write(this.f16879v, M() + i6, i10);
    }

    public final boolean L(m mVar, int i6, int i10) {
        if (i10 <= mVar.size()) {
            if (i6 + i10 <= mVar.size()) {
                int M = M() + i10;
                int M2 = M();
                int M3 = mVar.M() + i6;
                while (M2 < M) {
                    if (this.f16879v[M2] != mVar.f16879v[M3]) {
                        return false;
                    }
                    M2++;
                    M3++;
                }
                return true;
            }
            int size = mVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i6);
            sb2.append(", ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        int size2 = size();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i10);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public int M() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || size() != ((c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof m) {
            return L((m) obj, 0, size());
        }
        if (obj instanceof q) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(b0.b(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public final int hashCode() {
        int i6 = this.f16880w;
        if (i6 == 0) {
            int size = size();
            i6 = z(size, 0, size);
            if (i6 == 0) {
                i6 = 1;
            }
            this.f16880w = i6;
        }
        return i6;
    }

    @Override // gu.c
    public void o(int i6, int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f16879v, i6, bArr, i10, i11);
    }

    @Override // gu.c
    public final int q() {
        return 0;
    }

    @Override // gu.c
    public final boolean r() {
        return true;
    }

    @Override // gu.c
    public final boolean s() {
        byte[] bArr = this.f16879v;
        if (ta.v.J(0, bArr, bArr.length + 0) != 0) {
            return false;
        }
        return true;
    }

    @Override // gu.c
    public int size() {
        return this.f16879v.length;
    }

    @Override // gu.c, java.lang.Iterable
    /* renamed from: t */
    public c.a iterator() {
        return new a();
    }

    @Override // gu.c
    public final int z(int i6, int i10, int i11) {
        int M = M() + i10;
        for (int i12 = M; i12 < M + i11; i12++) {
            i6 = (i6 * 31) + this.f16879v[i12];
        }
        return i6;
    }
}
