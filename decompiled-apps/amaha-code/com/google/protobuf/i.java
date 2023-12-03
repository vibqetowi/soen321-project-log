package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: CodedInputStream.java */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public int f9937a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9938b = 100;

    /* renamed from: c  reason: collision with root package name */
    public int f9939c = SubsamplingScaleImageView.TILE_SIZE_AUTO;

    /* renamed from: d  reason: collision with root package name */
    public j f9940d;

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class a extends i {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f9941e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f9942g;

        /* renamed from: h  reason: collision with root package name */
        public int f9943h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9944i;

        /* renamed from: j  reason: collision with root package name */
        public int f9945j;

        /* renamed from: k  reason: collision with root package name */
        public int f9946k = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        public a(byte[] bArr, int i6, int i10, boolean z10) {
            this.f9941e = bArr;
            this.f = i10 + i6;
            this.f9943h = i6;
            this.f9944i = i6;
        }

        @Override // com.google.protobuf.i
        public final boolean A(int i6) {
            int x10;
            int i10 = i6 & 7;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return false;
                            }
                            if (i10 == 5) {
                                G(4);
                                return true;
                            }
                            int i12 = InvalidProtocolBufferException.f9872w;
                            throw new InvalidProtocolBufferException.InvalidWireTypeException();
                        }
                        do {
                            x10 = x();
                            if (x10 == 0) {
                                break;
                            }
                        } while (A(x10));
                        a(((i6 >>> 3) << 3) | 4);
                        return true;
                    }
                    G(D());
                    return true;
                }
                G(8);
                return true;
            }
            int i13 = this.f - this.f9943h;
            byte[] bArr = this.f9941e;
            if (i13 >= 10) {
                while (i11 < 10) {
                    int i14 = this.f9943h;
                    this.f9943h = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i11 < 10) {
                int i15 = this.f9943h;
                if (i15 != this.f) {
                    this.f9943h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i11++;
                    }
                } else {
                    throw InvalidProtocolBufferException.h();
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final int B() {
            int i6 = this.f9943h;
            if (this.f - i6 >= 4) {
                this.f9943h = i6 + 4;
                byte[] bArr = this.f9941e;
                return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.h();
        }

        public final long C() {
            int i6 = this.f9943h;
            if (this.f - i6 >= 8) {
                this.f9943h = i6 + 8;
                byte[] bArr = this.f9941e;
                return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.h();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int D() {
            int i6;
            int i10 = this.f9943h;
            int i11 = this.f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f9941e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f9943h = i12;
                    return b10;
                } else if (i11 - i12 >= 9) {
                    int i13 = i12 + 1;
                    int i14 = b10 ^ (bArr[i12] << 7);
                    if (i14 < 0) {
                        i6 = i14 ^ (-128);
                    } else {
                        int i15 = i13 + 1;
                        int i16 = i14 ^ (bArr[i13] << 14);
                        if (i16 >= 0) {
                            i6 = i16 ^ 16256;
                        } else {
                            i13 = i15 + 1;
                            int i17 = i16 ^ (bArr[i15] << 21);
                            if (i17 < 0) {
                                i6 = i17 ^ (-2080896);
                            } else {
                                i15 = i13 + 1;
                                byte b11 = bArr[i13];
                                i6 = (i17 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i13 = i15 + 1;
                                    if (bArr[i15] < 0) {
                                        i15 = i13 + 1;
                                        if (bArr[i13] < 0) {
                                            i13 = i15 + 1;
                                            if (bArr[i15] < 0) {
                                                i15 = i13 + 1;
                                                if (bArr[i13] < 0) {
                                                    i13 = i15 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i13 = i15;
                    }
                    this.f9943h = i13;
                    return i6;
                }
            }
            return (int) F();
        }

        public final long E() {
            long j10;
            long j11;
            long j12;
            int i6;
            int i10 = this.f9943h;
            int i11 = this.f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f9941e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f9943h = i12;
                    return b10;
                } else if (i11 - i12 >= 9) {
                    int i13 = i12 + 1;
                    int i14 = b10 ^ (bArr[i12] << 7);
                    if (i14 < 0) {
                        i6 = i14 ^ (-128);
                    } else {
                        int i15 = i13 + 1;
                        int i16 = i14 ^ (bArr[i13] << 14);
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                        } else {
                            i13 = i15 + 1;
                            int i17 = i16 ^ (bArr[i15] << 21);
                            if (i17 < 0) {
                                i6 = i17 ^ (-2080896);
                            } else {
                                long j13 = i17;
                                int i18 = i13 + 1;
                                long j14 = (bArr[i13] << 28) ^ j13;
                                if (j14 >= 0) {
                                    j11 = j14 ^ 266354560;
                                    i13 = i18;
                                } else {
                                    int i19 = i18 + 1;
                                    long j15 = j14 ^ (bArr[i18] << 35);
                                    if (j15 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i15 = i19 + 1;
                                        long j16 = j15 ^ (bArr[i19] << 42);
                                        if (j16 >= 0) {
                                            j10 = j16 ^ 4363953127296L;
                                        } else {
                                            i19 = i15 + 1;
                                            j15 = j16 ^ (bArr[i15] << 49);
                                            if (j15 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i15 = i19 + 1;
                                                j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    i19 = i15 + 1;
                                                    if (bArr[i15] >= 0) {
                                                        j11 = j10;
                                                        i13 = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j11 = j12 ^ j15;
                                    i13 = i19;
                                }
                                this.f9943h = i13;
                                return j11;
                            }
                        }
                        i13 = i15;
                        j11 = j10;
                        this.f9943h = i13;
                        return j11;
                    }
                    j11 = i6;
                    this.f9943h = i13;
                    return j11;
                }
            }
            return F();
        }

        public final long F() {
            long j10 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                int i10 = this.f9943h;
                if (i10 != this.f) {
                    this.f9943h = i10 + 1;
                    byte b10 = this.f9941e[i10];
                    j10 |= (b10 & Byte.MAX_VALUE) << i6;
                    if ((b10 & 128) == 0) {
                        return j10;
                    }
                } else {
                    throw InvalidProtocolBufferException.h();
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void G(int i6) {
            if (i6 >= 0) {
                int i10 = this.f;
                int i11 = this.f9943h;
                if (i6 <= i10 - i11) {
                    this.f9943h = i11 + i6;
                    return;
                }
            }
            if (i6 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.i
        public final void a(int i6) {
            if (this.f9945j == i6) {
                return;
            }
            throw InvalidProtocolBufferException.a();
        }

        @Override // com.google.protobuf.i
        public final int d() {
            return this.f9943h - this.f9944i;
        }

        @Override // com.google.protobuf.i
        public final boolean e() {
            if (this.f9943h == this.f) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public final void g(int i6) {
            this.f9946k = i6;
            int i10 = this.f + this.f9942g;
            this.f = i10;
            int i11 = i10 - this.f9944i;
            if (i11 > i6) {
                int i12 = i11 - i6;
                this.f9942g = i12;
                this.f = i10 - i12;
                return;
            }
            this.f9942g = 0;
        }

        @Override // com.google.protobuf.i
        public final int h(int i6) {
            if (i6 >= 0) {
                int i10 = this.f9943h;
                int i11 = this.f9944i;
                int i12 = (i10 - i11) + i6;
                if (i12 >= 0) {
                    int i13 = this.f9946k;
                    if (i12 <= i13) {
                        this.f9946k = i12;
                        int i14 = this.f + this.f9942g;
                        this.f = i14;
                        int i15 = i14 - i11;
                        if (i15 > i12) {
                            int i16 = i15 - i12;
                            this.f9942g = i16;
                            this.f = i14 - i16;
                        } else {
                            this.f9942g = 0;
                        }
                        return i13;
                    }
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.i
        public final boolean i() {
            if (E() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public final h.C0164h j() {
            byte[] bArr;
            int D = D();
            byte[] bArr2 = this.f9941e;
            if (D > 0) {
                int i6 = this.f;
                int i10 = this.f9943h;
                if (D <= i6 - i10) {
                    h.C0164h r = h.r(i10, bArr2, D);
                    this.f9943h += D;
                    return r;
                }
            }
            if (D == 0) {
                return h.f9922v;
            }
            if (D > 0) {
                int i11 = this.f;
                int i12 = this.f9943h;
                if (D <= i11 - i12) {
                    int i13 = D + i12;
                    this.f9943h = i13;
                    bArr = Arrays.copyOfRange(bArr2, i12, i13);
                    h.C0164h c0164h = h.f9922v;
                    return new h.C0164h(bArr);
                }
            }
            if (D <= 0) {
                if (D == 0) {
                    bArr = y.f10087b;
                    h.C0164h c0164h2 = h.f9922v;
                    return new h.C0164h(bArr);
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.i
        public final double k() {
            return Double.longBitsToDouble(C());
        }

        @Override // com.google.protobuf.i
        public final int l() {
            return D();
        }

        @Override // com.google.protobuf.i
        public final int m() {
            return B();
        }

        @Override // com.google.protobuf.i
        public final long n() {
            return C();
        }

        @Override // com.google.protobuf.i
        public final float o() {
            return Float.intBitsToFloat(B());
        }

        @Override // com.google.protobuf.i
        public final int p() {
            return D();
        }

        @Override // com.google.protobuf.i
        public final long q() {
            return E();
        }

        @Override // com.google.protobuf.i
        public final int r() {
            return B();
        }

        @Override // com.google.protobuf.i
        public final long s() {
            return C();
        }

        @Override // com.google.protobuf.i
        public final int t() {
            return i.b(D());
        }

        @Override // com.google.protobuf.i
        public final long u() {
            return i.c(E());
        }

        @Override // com.google.protobuf.i
        public final String v() {
            int D = D();
            if (D > 0) {
                int i6 = this.f;
                int i10 = this.f9943h;
                if (D <= i6 - i10) {
                    String str = new String(this.f9941e, i10, D, y.f10086a);
                    this.f9943h += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.i
        public final String w() {
            int D = D();
            if (D > 0) {
                int i6 = this.f;
                int i10 = this.f9943h;
                if (D <= i6 - i10) {
                    String a10 = r1.f10029a.a(i10, this.f9941e, D);
                    this.f9943h += D;
                    return a10;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.i
        public final int x() {
            if (e()) {
                this.f9945j = 0;
                return 0;
            }
            int D = D();
            this.f9945j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.i
        public final int y() {
            return D();
        }

        @Override // com.google.protobuf.i
        public final long z() {
            return E();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class b extends i {

        /* renamed from: e  reason: collision with root package name */
        public final Iterable<ByteBuffer> f9947e;
        public final Iterator<ByteBuffer> f;

        /* renamed from: g  reason: collision with root package name */
        public ByteBuffer f9948g;

        /* renamed from: h  reason: collision with root package name */
        public int f9949h;

        /* renamed from: i  reason: collision with root package name */
        public int f9950i;

        /* renamed from: k  reason: collision with root package name */
        public int f9952k;

        /* renamed from: m  reason: collision with root package name */
        public long f9954m;

        /* renamed from: n  reason: collision with root package name */
        public long f9955n;

        /* renamed from: o  reason: collision with root package name */
        public long f9956o;

        /* renamed from: j  reason: collision with root package name */
        public int f9951j = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* renamed from: l  reason: collision with root package name */
        public int f9953l = 0;

        public b(ArrayList arrayList, int i6) {
            this.f9949h = i6;
            this.f9947e = arrayList;
            this.f = arrayList.iterator();
            if (i6 == 0) {
                this.f9948g = y.f10088c;
                this.f9954m = 0L;
                this.f9955n = 0L;
                this.f9956o = 0L;
                return;
            }
            L();
        }

        @Override // com.google.protobuf.i
        public final boolean A(int i6) {
            int x10;
            int i10 = i6 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return false;
                            }
                            if (i10 == 5) {
                                K(4);
                                return true;
                            }
                            throw InvalidProtocolBufferException.d();
                        }
                        do {
                            x10 = x();
                            if (x10 == 0) {
                                break;
                            }
                        } while (A(x10));
                        a(((i6 >>> 3) << 3) | 4);
                        return true;
                    }
                    K(G());
                    return true;
                }
                K(8);
                return true;
            }
            for (int i11 = 0; i11 < 10; i11++) {
                if (C() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void B() {
            if (this.f.hasNext()) {
                L();
                return;
            }
            throw InvalidProtocolBufferException.h();
        }

        public final byte C() {
            if (this.f9956o - this.f9954m == 0) {
                B();
            }
            long j10 = this.f9954m;
            this.f9954m = 1 + j10;
            return q1.h(j10);
        }

        public final void D(byte[] bArr, int i6) {
            if (i6 >= 0 && i6 <= J()) {
                int i10 = i6;
                while (i10 > 0) {
                    if (this.f9956o - this.f9954m == 0) {
                        B();
                    }
                    int min = Math.min(i10, (int) (this.f9956o - this.f9954m));
                    long j10 = min;
                    q1.f10019c.c(this.f9954m, bArr, (i6 - i10) + 0, j10);
                    i10 -= min;
                    this.f9954m += j10;
                }
            } else if (i6 <= 0) {
                if (i6 == 0) {
                    return;
                }
                throw InvalidProtocolBufferException.f();
            } else {
                throw InvalidProtocolBufferException.h();
            }
        }

        public final int E() {
            int C;
            byte C2;
            long j10 = this.f9956o;
            long j11 = this.f9954m;
            if (j10 - j11 >= 4) {
                this.f9954m = 4 + j11;
                C = (q1.h(j11) & 255) | ((q1.h(1 + j11) & 255) << 8) | ((q1.h(2 + j11) & 255) << 16);
                C2 = q1.h(j11 + 3);
            } else {
                C = (C() & 255) | ((C() & 255) << 8) | ((C() & 255) << 16);
                C2 = C();
            }
            return C | ((C2 & 255) << 24);
        }

        public final long F() {
            long C;
            byte C2;
            long j10 = this.f9956o;
            long j11 = this.f9954m;
            if (j10 - j11 >= 8) {
                this.f9954m = 8 + j11;
                C = (q1.h(j11) & 255) | ((q1.h(1 + j11) & 255) << 8) | ((q1.h(2 + j11) & 255) << 16) | ((q1.h(3 + j11) & 255) << 24) | ((q1.h(4 + j11) & 255) << 32) | ((q1.h(5 + j11) & 255) << 40) | ((q1.h(6 + j11) & 255) << 48);
                C2 = q1.h(j11 + 7);
            } else {
                C = (C() & 255) | ((C() & 255) << 8) | ((C() & 255) << 16) | ((C() & 255) << 24) | ((C() & 255) << 32) | ((C() & 255) << 40) | ((C() & 255) << 48);
                C2 = C();
            }
            return C | ((C2 & 255) << 56);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
            if (com.google.protobuf.q1.h(r4) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int G() {
            int i6;
            long j10 = this.f9954m;
            if (this.f9956o != j10) {
                long j11 = j10 + 1;
                byte h10 = q1.h(j10);
                if (h10 >= 0) {
                    this.f9954m++;
                    return h10;
                } else if (this.f9956o - this.f9954m >= 10) {
                    long j12 = j11 + 1;
                    int h11 = h10 ^ (q1.h(j11) << 7);
                    if (h11 < 0) {
                        i6 = h11 ^ (-128);
                    } else {
                        long j13 = j12 + 1;
                        int h12 = h11 ^ (q1.h(j12) << 14);
                        if (h12 >= 0) {
                            i6 = h12 ^ 16256;
                        } else {
                            j12 = j13 + 1;
                            int h13 = h12 ^ (q1.h(j13) << 21);
                            if (h13 < 0) {
                                i6 = h13 ^ (-2080896);
                            } else {
                                j13 = j12 + 1;
                                byte h14 = q1.h(j12);
                                i6 = (h13 ^ (h14 << 28)) ^ 266354560;
                                if (h14 < 0) {
                                    j12 = j13 + 1;
                                    if (q1.h(j13) < 0) {
                                        j13 = j12 + 1;
                                        if (q1.h(j12) < 0) {
                                            j12 = j13 + 1;
                                            if (q1.h(j13) < 0) {
                                                j13 = j12 + 1;
                                                if (q1.h(j12) < 0) {
                                                    j12 = j13 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j12 = j13;
                    }
                    this.f9954m = j12;
                    return i6;
                }
            }
            return (int) I();
        }

        public final long H() {
            long h10;
            long j10;
            long j11;
            int i6;
            long j12 = this.f9954m;
            if (this.f9956o != j12) {
                long j13 = j12 + 1;
                byte h11 = q1.h(j12);
                if (h11 >= 0) {
                    this.f9954m++;
                    return h11;
                } else if (this.f9956o - this.f9954m >= 10) {
                    long j14 = j13 + 1;
                    int h12 = h11 ^ (q1.h(j13) << 7);
                    if (h12 < 0) {
                        i6 = h12 ^ (-128);
                    } else {
                        long j15 = j14 + 1;
                        int h13 = h12 ^ (q1.h(j14) << 14);
                        if (h13 >= 0) {
                            h10 = h13 ^ 16256;
                        } else {
                            j14 = j15 + 1;
                            int h14 = h13 ^ (q1.h(j15) << 21);
                            if (h14 < 0) {
                                i6 = h14 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long h15 = h14 ^ (q1.h(j14) << 28);
                                if (h15 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j16 = j15 + 1;
                                    long h16 = h15 ^ (q1.h(j15) << 35);
                                    if (h16 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        h15 = h16 ^ (q1.h(j16) << 42);
                                        if (h15 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            h16 = h15 ^ (q1.h(j15) << 49);
                                            if (h16 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                h10 = (h16 ^ (q1.h(j16) << 56)) ^ 71499008037633920L;
                                                if (h10 < 0) {
                                                    long j17 = 1 + j15;
                                                    if (q1.h(j15) >= 0) {
                                                        j14 = j17;
                                                        this.f9954m = j14;
                                                        return h10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    h10 = h16 ^ j10;
                                    j14 = j16;
                                    this.f9954m = j14;
                                    return h10;
                                }
                                h10 = h15 ^ j11;
                            }
                        }
                        j14 = j15;
                        this.f9954m = j14;
                        return h10;
                    }
                    h10 = i6;
                    this.f9954m = j14;
                    return h10;
                }
            }
            return I();
        }

        public final long I() {
            long j10 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                byte C = C();
                j10 |= (C & Byte.MAX_VALUE) << i6;
                if ((C & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final int J() {
            return (int) (((this.f9949h - this.f9953l) - this.f9954m) + this.f9955n);
        }

        public final void K(int i6) {
            if (i6 >= 0 && i6 <= ((this.f9949h - this.f9953l) - this.f9954m) + this.f9955n) {
                while (i6 > 0) {
                    if (this.f9956o - this.f9954m == 0) {
                        B();
                    }
                    int min = Math.min(i6, (int) (this.f9956o - this.f9954m));
                    i6 -= min;
                    this.f9954m += min;
                }
            } else if (i6 < 0) {
                throw InvalidProtocolBufferException.f();
            } else {
                throw InvalidProtocolBufferException.h();
            }
        }

        public final void L() {
            ByteBuffer next = this.f.next();
            this.f9948g = next;
            this.f9953l += (int) (this.f9954m - this.f9955n);
            long position = next.position();
            this.f9954m = position;
            this.f9955n = position;
            this.f9956o = this.f9948g.limit();
            long j10 = q1.f10019c.j(q1.f10022g, this.f9948g);
            this.f9954m += j10;
            this.f9955n += j10;
            this.f9956o += j10;
        }

        @Override // com.google.protobuf.i
        public final void a(int i6) {
            if (this.f9952k == i6) {
                return;
            }
            throw InvalidProtocolBufferException.a();
        }

        @Override // com.google.protobuf.i
        public final int d() {
            return (int) (((this.f9953l + 0) + this.f9954m) - this.f9955n);
        }

        @Override // com.google.protobuf.i
        public final boolean e() {
            if ((this.f9953l + this.f9954m) - this.f9955n == this.f9949h) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public final void g(int i6) {
            this.f9951j = i6;
            int i10 = this.f9949h + this.f9950i;
            this.f9949h = i10;
            int i11 = i10 + 0;
            if (i11 > i6) {
                int i12 = i11 - i6;
                this.f9950i = i12;
                this.f9949h = i10 - i12;
                return;
            }
            this.f9950i = 0;
        }

        @Override // com.google.protobuf.i
        public final int h(int i6) {
            if (i6 >= 0) {
                int d10 = d() + i6;
                int i10 = this.f9951j;
                if (d10 <= i10) {
                    this.f9951j = d10;
                    int i11 = this.f9949h + this.f9950i;
                    this.f9949h = i11;
                    int i12 = i11 + 0;
                    if (i12 > d10) {
                        int i13 = i12 - d10;
                        this.f9950i = i13;
                        this.f9949h = i11 - i13;
                    } else {
                        this.f9950i = 0;
                    }
                    return i10;
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.i
        public final boolean i() {
            if (H() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public final h.C0164h j() {
            int G = G();
            if (G > 0) {
                long j10 = G;
                long j11 = this.f9956o;
                long j12 = this.f9954m;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[G];
                    q1.f10019c.c(j12, bArr, 0L, j10);
                    this.f9954m += j10;
                    h.C0164h c0164h = h.f9922v;
                    return new h.C0164h(bArr);
                }
            }
            if (G > 0 && G <= J()) {
                byte[] bArr2 = new byte[G];
                D(bArr2, G);
                h.C0164h c0164h2 = h.f9922v;
                return new h.C0164h(bArr2);
            } else if (G == 0) {
                return h.f9922v;
            } else {
                if (G < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // com.google.protobuf.i
        public final double k() {
            return Double.longBitsToDouble(F());
        }

        @Override // com.google.protobuf.i
        public final int l() {
            return G();
        }

        @Override // com.google.protobuf.i
        public final int m() {
            return E();
        }

        @Override // com.google.protobuf.i
        public final long n() {
            return F();
        }

        @Override // com.google.protobuf.i
        public final float o() {
            return Float.intBitsToFloat(E());
        }

        @Override // com.google.protobuf.i
        public final int p() {
            return G();
        }

        @Override // com.google.protobuf.i
        public final long q() {
            return H();
        }

        @Override // com.google.protobuf.i
        public final int r() {
            return E();
        }

        @Override // com.google.protobuf.i
        public final long s() {
            return F();
        }

        @Override // com.google.protobuf.i
        public final int t() {
            return i.b(G());
        }

        @Override // com.google.protobuf.i
        public final long u() {
            return i.c(H());
        }

        @Override // com.google.protobuf.i
        public final String v() {
            int G = G();
            if (G > 0) {
                long j10 = G;
                long j11 = this.f9956o;
                long j12 = this.f9954m;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[G];
                    q1.f10019c.c(j12, bArr, 0L, j10);
                    String str = new String(bArr, y.f10086a);
                    this.f9954m += j10;
                    return str;
                }
            }
            if (G > 0 && G <= J()) {
                byte[] bArr2 = new byte[G];
                D(bArr2, G);
                return new String(bArr2, y.f10086a);
            } else if (G == 0) {
                return "";
            } else {
                if (G < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // com.google.protobuf.i
        public final String w() {
            int G = G();
            if (G > 0) {
                long j10 = G;
                long j11 = this.f9956o;
                long j12 = this.f9954m;
                if (j10 <= j11 - j12) {
                    String b10 = r1.b(this.f9948g, (int) (j12 - this.f9955n), G);
                    this.f9954m += j10;
                    return b10;
                }
            }
            if (G >= 0 && G <= J()) {
                byte[] bArr = new byte[G];
                D(bArr, G);
                return r1.f10029a.a(0, bArr, G);
            } else if (G == 0) {
                return "";
            } else {
                if (G <= 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // com.google.protobuf.i
        public final int x() {
            if (e()) {
                this.f9952k = 0;
                return 0;
            }
            int G = G();
            this.f9952k = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.i
        public final int y() {
            return G();
        }

        @Override // com.google.protobuf.i
        public final long z() {
            return H();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class c extends i {

        /* renamed from: e  reason: collision with root package name */
        public final InputStream f9957e;
        public final byte[] f;

        /* renamed from: g  reason: collision with root package name */
        public int f9958g;

        /* renamed from: h  reason: collision with root package name */
        public int f9959h;

        /* renamed from: i  reason: collision with root package name */
        public int f9960i;

        /* renamed from: j  reason: collision with root package name */
        public int f9961j;

        /* renamed from: k  reason: collision with root package name */
        public int f9962k;

        /* renamed from: l  reason: collision with root package name */
        public int f9963l = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        public c(InputStream inputStream) {
            Charset charset = y.f10086a;
            this.f9957e = inputStream;
            this.f = new byte[4096];
            this.f9958g = 0;
            this.f9960i = 0;
            this.f9962k = 0;
        }

        @Override // com.google.protobuf.i
        public final boolean A(int i6) {
            int x10;
            int i10 = i6 & 7;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return false;
                            }
                            if (i10 == 5) {
                                L(4);
                                return true;
                            }
                            int i12 = InvalidProtocolBufferException.f9872w;
                            throw new InvalidProtocolBufferException.InvalidWireTypeException();
                        }
                        do {
                            x10 = x();
                            if (x10 == 0) {
                                break;
                            }
                        } while (A(x10));
                        a(((i6 >>> 3) << 3) | 4);
                        return true;
                    }
                    L(G());
                    return true;
                }
                L(8);
                return true;
            }
            int i13 = this.f9958g - this.f9960i;
            byte[] bArr = this.f;
            if (i13 >= 10) {
                while (i11 < 10) {
                    int i14 = this.f9960i;
                    this.f9960i = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i11 < 10) {
                if (this.f9960i == this.f9958g) {
                    K(1);
                }
                int i15 = this.f9960i;
                this.f9960i = i15 + 1;
                if (bArr[i15] < 0) {
                    i11++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final byte[] B(int i6) {
            byte[] C = C(i6);
            if (C != null) {
                return C;
            }
            int i10 = this.f9960i;
            int i11 = this.f9958g;
            int i12 = i11 - i10;
            this.f9962k += i11;
            this.f9960i = 0;
            this.f9958g = 0;
            ArrayList D = D(i6 - i12);
            byte[] bArr = new byte[i6];
            System.arraycopy(this.f, i10, bArr, 0, i12);
            Iterator it = D.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
                i12 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] C(int i6) {
            if (i6 == 0) {
                return y.f10087b;
            }
            if (i6 >= 0) {
                int i10 = this.f9962k;
                int i11 = this.f9960i;
                int i12 = i10 + i11 + i6;
                if (i12 - this.f9939c <= 0) {
                    int i13 = this.f9963l;
                    if (i12 <= i13) {
                        int i14 = this.f9958g - i11;
                        int i15 = i6 - i14;
                        InputStream inputStream = this.f9957e;
                        if (i15 >= 4096) {
                            try {
                                if (i15 > inputStream.available()) {
                                    return null;
                                }
                            } catch (InvalidProtocolBufferException e10) {
                                e10.f9874v = true;
                                throw e10;
                            }
                        }
                        byte[] bArr = new byte[i6];
                        System.arraycopy(this.f, this.f9960i, bArr, 0, i14);
                        this.f9962k += this.f9958g;
                        this.f9960i = 0;
                        this.f9958g = 0;
                        while (i14 < i6) {
                            try {
                                int read = inputStream.read(bArr, i14, i6 - i14);
                                if (read != -1) {
                                    this.f9962k += read;
                                    i14 += read;
                                } else {
                                    throw InvalidProtocolBufferException.h();
                                }
                            } catch (InvalidProtocolBufferException e11) {
                                e11.f9874v = true;
                                throw e11;
                            }
                        }
                        return bArr;
                    }
                    L((i13 - i10) - i11);
                    throw InvalidProtocolBufferException.h();
                }
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.f();
        }

        public final ArrayList D(int i6) {
            ArrayList arrayList = new ArrayList();
            while (i6 > 0) {
                int min = Math.min(i6, 4096);
                byte[] bArr = new byte[min];
                int i10 = 0;
                while (i10 < min) {
                    int read = this.f9957e.read(bArr, i10, min - i10);
                    if (read != -1) {
                        this.f9962k += read;
                        i10 += read;
                    } else {
                        throw InvalidProtocolBufferException.h();
                    }
                }
                i6 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int E() {
            int i6 = this.f9960i;
            if (this.f9958g - i6 < 4) {
                K(4);
                i6 = this.f9960i;
            }
            this.f9960i = i6 + 4;
            byte[] bArr = this.f;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }

        public final long F() {
            int i6 = this.f9960i;
            if (this.f9958g - i6 < 8) {
                K(8);
                i6 = this.f9960i;
            }
            this.f9960i = i6 + 8;
            byte[] bArr = this.f;
            return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int G() {
            int i6;
            int i10 = this.f9960i;
            int i11 = this.f9958g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f9960i = i12;
                    return b10;
                } else if (i11 - i12 >= 9) {
                    int i13 = i12 + 1;
                    int i14 = b10 ^ (bArr[i12] << 7);
                    if (i14 < 0) {
                        i6 = i14 ^ (-128);
                    } else {
                        int i15 = i13 + 1;
                        int i16 = i14 ^ (bArr[i13] << 14);
                        if (i16 >= 0) {
                            i6 = i16 ^ 16256;
                        } else {
                            i13 = i15 + 1;
                            int i17 = i16 ^ (bArr[i15] << 21);
                            if (i17 < 0) {
                                i6 = i17 ^ (-2080896);
                            } else {
                                i15 = i13 + 1;
                                byte b11 = bArr[i13];
                                i6 = (i17 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i13 = i15 + 1;
                                    if (bArr[i15] < 0) {
                                        i15 = i13 + 1;
                                        if (bArr[i13] < 0) {
                                            i13 = i15 + 1;
                                            if (bArr[i15] < 0) {
                                                i15 = i13 + 1;
                                                if (bArr[i13] < 0) {
                                                    i13 = i15 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i13 = i15;
                    }
                    this.f9960i = i13;
                    return i6;
                }
            }
            return (int) I();
        }

        public final long H() {
            long j10;
            long j11;
            long j12;
            int i6;
            int i10 = this.f9960i;
            int i11 = this.f9958g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f9960i = i12;
                    return b10;
                } else if (i11 - i12 >= 9) {
                    int i13 = i12 + 1;
                    int i14 = b10 ^ (bArr[i12] << 7);
                    if (i14 < 0) {
                        i6 = i14 ^ (-128);
                    } else {
                        int i15 = i13 + 1;
                        int i16 = i14 ^ (bArr[i13] << 14);
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                        } else {
                            i13 = i15 + 1;
                            int i17 = i16 ^ (bArr[i15] << 21);
                            if (i17 < 0) {
                                i6 = i17 ^ (-2080896);
                            } else {
                                long j13 = i17;
                                int i18 = i13 + 1;
                                long j14 = (bArr[i13] << 28) ^ j13;
                                if (j14 >= 0) {
                                    j11 = j14 ^ 266354560;
                                    i13 = i18;
                                } else {
                                    int i19 = i18 + 1;
                                    long j15 = j14 ^ (bArr[i18] << 35);
                                    if (j15 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i15 = i19 + 1;
                                        long j16 = j15 ^ (bArr[i19] << 42);
                                        if (j16 >= 0) {
                                            j10 = j16 ^ 4363953127296L;
                                        } else {
                                            i19 = i15 + 1;
                                            j15 = j16 ^ (bArr[i15] << 49);
                                            if (j15 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i15 = i19 + 1;
                                                j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    i19 = i15 + 1;
                                                    if (bArr[i15] >= 0) {
                                                        j11 = j10;
                                                        i13 = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j11 = j12 ^ j15;
                                    i13 = i19;
                                }
                                this.f9960i = i13;
                                return j11;
                            }
                        }
                        i13 = i15;
                        j11 = j10;
                        this.f9960i = i13;
                        return j11;
                    }
                    j11 = i6;
                    this.f9960i = i13;
                    return j11;
                }
            }
            return I();
        }

        public final long I() {
            long j10 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                if (this.f9960i == this.f9958g) {
                    K(1);
                }
                int i10 = this.f9960i;
                this.f9960i = i10 + 1;
                byte b10 = this.f[i10];
                j10 |= (b10 & Byte.MAX_VALUE) << i6;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void J() {
            int i6 = this.f9958g + this.f9959h;
            this.f9958g = i6;
            int i10 = this.f9962k + i6;
            int i11 = this.f9963l;
            if (i10 > i11) {
                int i12 = i10 - i11;
                this.f9959h = i12;
                this.f9958g = i6 - i12;
                return;
            }
            this.f9959h = 0;
        }

        public final void K(int i6) {
            if (!M(i6)) {
                if (i6 > (this.f9939c - this.f9962k) - this.f9960i) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                throw InvalidProtocolBufferException.h();
            }
        }

        public final void L(int i6) {
            int i10 = this.f9958g;
            int i11 = this.f9960i;
            if (i6 <= i10 - i11 && i6 >= 0) {
                this.f9960i = i11 + i6;
                return;
            }
            InputStream inputStream = this.f9957e;
            if (i6 >= 0) {
                int i12 = this.f9962k;
                int i13 = i12 + i11;
                int i14 = i13 + i6;
                int i15 = this.f9963l;
                if (i14 <= i15) {
                    this.f9962k = i13;
                    int i16 = i10 - i11;
                    this.f9958g = 0;
                    this.f9960i = 0;
                    while (i16 < i6) {
                        long j10 = i6 - i16;
                        try {
                            try {
                                long skip = inputStream.skip(j10);
                                int i17 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                                if (i17 >= 0 && skip <= j10) {
                                    if (i17 == 0) {
                                        break;
                                    }
                                    i16 += (int) skip;
                                } else {
                                    throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                                }
                            } catch (InvalidProtocolBufferException e10) {
                                e10.f9874v = true;
                                throw e10;
                            }
                        } catch (Throwable th2) {
                            this.f9962k += i16;
                            J();
                            throw th2;
                        }
                    }
                    this.f9962k += i16;
                    J();
                    if (i16 < i6) {
                        int i18 = this.f9958g;
                        int i19 = i18 - this.f9960i;
                        this.f9960i = i18;
                        K(1);
                        while (true) {
                            int i20 = i6 - i19;
                            int i21 = this.f9958g;
                            if (i20 > i21) {
                                i19 += i21;
                                this.f9960i = i21;
                                K(1);
                            } else {
                                this.f9960i = i20;
                                return;
                            }
                        }
                    }
                } else {
                    L((i15 - i12) - i11);
                    throw InvalidProtocolBufferException.h();
                }
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        public final boolean M(int i6) {
            InputStream inputStream;
            int i10 = this.f9960i;
            int i11 = i10 + i6;
            int i12 = this.f9958g;
            if (i11 > i12) {
                int i13 = this.f9939c;
                int i14 = this.f9962k;
                if (i6 > (i13 - i14) - i10 || i14 + i10 + i6 > this.f9963l) {
                    return false;
                }
                byte[] bArr = this.f;
                if (i10 > 0) {
                    if (i12 > i10) {
                        System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                    }
                    this.f9962k += i10;
                    this.f9958g -= i10;
                    this.f9960i = 0;
                }
                int i15 = this.f9958g;
                int min = Math.min(bArr.length - i15, (this.f9939c - this.f9962k) - i15);
                try {
                    int read = this.f9957e.read(bArr, i15, min);
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read <= 0) {
                            return false;
                        }
                        this.f9958g += read;
                        J();
                        if (this.f9958g >= i6) {
                            return true;
                        }
                        return M(i6);
                    }
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } catch (InvalidProtocolBufferException e10) {
                    e10.f9874v = true;
                    throw e10;
                }
            }
            throw new IllegalStateException(defpackage.c.q("refillBuffer() called when ", i6, " bytes were already available in buffer"));
        }

        @Override // com.google.protobuf.i
        public final void a(int i6) {
            if (this.f9961j == i6) {
                return;
            }
            throw InvalidProtocolBufferException.a();
        }

        @Override // com.google.protobuf.i
        public final int d() {
            return this.f9962k + this.f9960i;
        }

        @Override // com.google.protobuf.i
        public final boolean e() {
            if (this.f9960i == this.f9958g && !M(1)) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public final void g(int i6) {
            this.f9963l = i6;
            J();
        }

        @Override // com.google.protobuf.i
        public final int h(int i6) {
            if (i6 >= 0) {
                int i10 = this.f9962k + this.f9960i + i6;
                int i11 = this.f9963l;
                if (i10 <= i11) {
                    this.f9963l = i10;
                    J();
                    return i11;
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.i
        public final boolean i() {
            if (H() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public final h.C0164h j() {
            int G = G();
            int i6 = this.f9958g;
            int i10 = this.f9960i;
            int i11 = i6 - i10;
            byte[] bArr = this.f;
            if (G <= i11 && G > 0) {
                h.C0164h r = h.r(i10, bArr, G);
                this.f9960i += G;
                return r;
            } else if (G == 0) {
                return h.f9922v;
            } else {
                byte[] C = C(G);
                if (C != null) {
                    return h.r(0, C, C.length);
                }
                int i12 = this.f9960i;
                int i13 = this.f9958g;
                int i14 = i13 - i12;
                this.f9962k += i13;
                this.f9960i = 0;
                this.f9958g = 0;
                ArrayList D = D(G - i14);
                byte[] bArr2 = new byte[G];
                System.arraycopy(bArr, i12, bArr2, 0, i14);
                Iterator it = D.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
                    i14 += bArr3.length;
                }
                h.C0164h c0164h = h.f9922v;
                return new h.C0164h(bArr2);
            }
        }

        @Override // com.google.protobuf.i
        public final double k() {
            return Double.longBitsToDouble(F());
        }

        @Override // com.google.protobuf.i
        public final int l() {
            return G();
        }

        @Override // com.google.protobuf.i
        public final int m() {
            return E();
        }

        @Override // com.google.protobuf.i
        public final long n() {
            return F();
        }

        @Override // com.google.protobuf.i
        public final float o() {
            return Float.intBitsToFloat(E());
        }

        @Override // com.google.protobuf.i
        public final int p() {
            return G();
        }

        @Override // com.google.protobuf.i
        public final long q() {
            return H();
        }

        @Override // com.google.protobuf.i
        public final int r() {
            return E();
        }

        @Override // com.google.protobuf.i
        public final long s() {
            return F();
        }

        @Override // com.google.protobuf.i
        public final int t() {
            return i.b(G());
        }

        @Override // com.google.protobuf.i
        public final long u() {
            return i.c(H());
        }

        @Override // com.google.protobuf.i
        public final String v() {
            int G = G();
            byte[] bArr = this.f;
            if (G > 0) {
                int i6 = this.f9958g;
                int i10 = this.f9960i;
                if (G <= i6 - i10) {
                    String str = new String(bArr, i10, G, y.f10086a);
                    this.f9960i += G;
                    return str;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G <= this.f9958g) {
                K(G);
                String str2 = new String(bArr, this.f9960i, G, y.f10086a);
                this.f9960i += G;
                return str2;
            }
            return new String(B(G), y.f10086a);
        }

        @Override // com.google.protobuf.i
        public final String w() {
            int G = G();
            int i6 = this.f9960i;
            int i10 = this.f9958g;
            int i11 = i10 - i6;
            byte[] bArr = this.f;
            if (G <= i11 && G > 0) {
                this.f9960i = i6 + G;
            } else if (G == 0) {
                return "";
            } else {
                i6 = 0;
                if (G <= i10) {
                    K(G);
                    this.f9960i = G + 0;
                } else {
                    bArr = B(G);
                }
            }
            return r1.f10029a.a(i6, bArr, G);
        }

        @Override // com.google.protobuf.i
        public final int x() {
            if (e()) {
                this.f9961j = 0;
                return 0;
            }
            int G = G();
            this.f9961j = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.i
        public final int y() {
            return G();
        }

        @Override // com.google.protobuf.i
        public final long z() {
            return H();
        }
    }

    public static int b(int i6) {
        return (-(i6 & 1)) ^ (i6 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static a f(byte[] bArr, int i6, int i10, boolean z10) {
        a aVar = new a(bArr, i6, i10, z10);
        try {
            aVar.h(i10);
            return aVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract boolean A(int i6);

    public abstract void a(int i6);

    public abstract int d();

    public abstract boolean e();

    public abstract void g(int i6);

    public abstract int h(int i6);

    public abstract boolean i();

    public abstract h.C0164h j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract float o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract String v();

    public abstract String w();

    public abstract int x();

    public abstract int y();

    public abstract long z();
}
