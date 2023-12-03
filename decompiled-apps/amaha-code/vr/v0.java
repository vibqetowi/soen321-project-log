package vr;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
/* compiled from: GzipInflatingBuffer.java */
/* loaded from: classes2.dex */
public final class v0 implements Closeable {
    public Inflater A;
    public int D;
    public int E;
    public long F;

    /* renamed from: y  reason: collision with root package name */
    public int f36015y;

    /* renamed from: z  reason: collision with root package name */
    public int f36016z;

    /* renamed from: u  reason: collision with root package name */
    public final v f36011u = new v();

    /* renamed from: v  reason: collision with root package name */
    public final CRC32 f36012v = new CRC32();

    /* renamed from: w  reason: collision with root package name */
    public final a f36013w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f36014x = new byte[512];
    public int B = 1;
    public boolean C = false;
    public int G = 0;
    public int H = 0;
    public boolean I = true;

    /* compiled from: GzipInflatingBuffer.java */
    /* loaded from: classes2.dex */
    public class a {
        public a() {
        }

        public static void a(a aVar, int i6) {
            int i10;
            v0 v0Var = v0.this;
            int i11 = v0Var.f36016z - v0Var.f36015y;
            CRC32 crc32 = v0Var.f36012v;
            if (i11 > 0) {
                int min = Math.min(i11, i6);
                crc32.update(v0Var.f36014x, v0Var.f36015y, min);
                v0Var.f36015y += min;
                i10 = i6 - min;
            } else {
                i10 = i6;
            }
            if (i10 > 0) {
                byte[] bArr = new byte[512];
                int i12 = 0;
                while (i12 < i10) {
                    int min2 = Math.min(i10 - i12, 512);
                    v0Var.f36011u.K(0, bArr, min2);
                    crc32.update(bArr, 0, min2);
                    i12 += min2;
                }
            }
            v0Var.G += i6;
        }

        public final int b() {
            int readUnsignedByte;
            v0 v0Var = v0.this;
            int i6 = v0Var.f36016z;
            int i10 = v0Var.f36015y;
            if (i6 - i10 > 0) {
                readUnsignedByte = v0Var.f36014x[i10] & 255;
                v0Var.f36015y = i10 + 1;
            } else {
                readUnsignedByte = v0Var.f36011u.readUnsignedByte();
            }
            v0Var.f36012v.update(readUnsignedByte);
            v0Var.G++;
            return readUnsignedByte;
        }

        public final int c() {
            return b() | (b() << 8);
        }

        public final int d() {
            v0 v0Var = v0.this;
            return (v0Var.f36016z - v0Var.f36015y) + v0Var.f36011u.f36009w;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e6, code lost:
        if (r4 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ea, code lost:
        if (r16.B != 1) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f0, code lost:
        if (r7.d() >= 10) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f3, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f4, code lost:
        r16.I = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f6, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i6, byte[] bArr, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        sc.b.B("GzipInflatingBuffer is closed", !this.C);
        boolean z16 = true;
        int i12 = 0;
        while (true) {
            a aVar = this.f36013w;
            if (z16 && (i11 = i10 - i12) > 0) {
                int d10 = v.h.d(this.B);
                CRC32 crc32 = this.f36012v;
                byte[] bArr2 = this.f36014x;
                switch (d10) {
                    case 0:
                        if (aVar.d() < 10) {
                            z16 = false;
                            break;
                        } else if (aVar.c() == 35615) {
                            if (aVar.b() == 8) {
                                this.D = aVar.b();
                                a.a(aVar, 6);
                                this.B = 2;
                                z16 = true;
                                break;
                            } else {
                                throw new ZipException("Unsupported compression method");
                            }
                        } else {
                            throw new ZipException("Not in GZIP format");
                        }
                    case 1:
                        if ((this.D & 4) != 4) {
                            this.B = 4;
                        } else if (aVar.d() >= 2) {
                            this.E = aVar.c();
                            this.B = 3;
                        } else {
                            z16 = false;
                            break;
                        }
                        z16 = true;
                        break;
                    case 2:
                        int d11 = aVar.d();
                        int i13 = this.E;
                        if (d11 >= i13) {
                            a.a(aVar, i13);
                            this.B = 4;
                            z16 = true;
                            break;
                        } else {
                            z16 = false;
                            break;
                        }
                    case 3:
                        if ((this.D & 8) != 8) {
                            this.B = 5;
                        } else {
                            while (true) {
                                if (aVar.d() > 0) {
                                    if (aVar.b() == 0) {
                                        z10 = true;
                                    }
                                } else {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                this.B = 5;
                            } else {
                                z16 = false;
                                break;
                            }
                        }
                        z16 = true;
                        break;
                    case 4:
                        if ((this.D & 16) != 16) {
                            this.B = 6;
                        } else {
                            while (true) {
                                if (aVar.d() > 0) {
                                    if (aVar.b() == 0) {
                                        z11 = true;
                                    }
                                } else {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                this.B = 6;
                            } else {
                                z16 = false;
                                break;
                            }
                        }
                        z16 = true;
                        break;
                    case 5:
                        if ((this.D & 2) != 2) {
                            this.B = 7;
                        } else if (aVar.d() >= 2) {
                            if ((((int) crc32.getValue()) & 65535) == aVar.c()) {
                                this.B = 7;
                            } else {
                                throw new ZipException("Corrupt GZIP header");
                            }
                        } else {
                            z16 = false;
                            break;
                        }
                        z16 = true;
                        break;
                    case 6:
                        Inflater inflater = this.A;
                        if (inflater == null) {
                            this.A = new Inflater(true);
                        } else {
                            inflater.reset();
                        }
                        crc32.reset();
                        int i14 = this.f36016z;
                        int i15 = this.f36015y;
                        int i16 = i14 - i15;
                        if (i16 > 0) {
                            this.A.setInput(bArr2, i15, i16);
                            this.B = 8;
                        } else {
                            this.B = 9;
                        }
                        z16 = true;
                        break;
                    case 7:
                        int i17 = i6 + i12;
                        if (this.A != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        sc.b.B("inflater is null", z12);
                        try {
                            int totalIn = this.A.getTotalIn();
                            int inflate = this.A.inflate(bArr, i17, i11);
                            int totalIn2 = this.A.getTotalIn() - totalIn;
                            this.G += totalIn2;
                            this.H += totalIn2;
                            this.f36015y += totalIn2;
                            crc32.update(bArr, i17, inflate);
                            if (this.A.finished()) {
                                this.F = this.A.getBytesWritten() & 4294967295L;
                                this.B = 10;
                            } else if (this.A.needsInput()) {
                                this.B = 9;
                            }
                            i12 += inflate;
                            if (this.B == 10) {
                                z16 = e();
                                break;
                            } else {
                                z16 = true;
                                break;
                            }
                        } catch (DataFormatException e10) {
                            throw new DataFormatException("Inflater data format exception: " + e10.getMessage());
                        }
                    case 8:
                        if (this.A != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        sc.b.B("inflater is null", z13);
                        if (this.f36015y == this.f36016z) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        sc.b.B("inflaterInput has unconsumed bytes", z14);
                        v vVar = this.f36011u;
                        int min = Math.min(vVar.f36009w, 512);
                        if (min != 0) {
                            this.f36015y = 0;
                            this.f36016z = min;
                            vVar.K(0, bArr2, min);
                            this.A.setInput(bArr2, this.f36015y, min);
                            this.B = 8;
                            z16 = true;
                            break;
                        } else {
                            z16 = false;
                            break;
                        }
                    case 9:
                        z16 = e();
                        break;
                    default:
                        throw new AssertionError("Invalid state: ".concat(v.g.e(this.B)));
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.C) {
            this.C = true;
            this.f36011u.close();
            Inflater inflater = this.A;
            if (inflater != null) {
                inflater.end();
                this.A = null;
            }
        }
    }

    public final boolean e() {
        Inflater inflater = this.A;
        a aVar = this.f36013w;
        if (inflater != null && aVar.d() <= 18) {
            this.A.end();
            this.A = null;
        }
        if (aVar.d() < 8) {
            return false;
        }
        CRC32 crc32 = this.f36012v;
        if (crc32.getValue() == (aVar.c() | (aVar.c() << 16)) && this.F == (aVar.c() | (aVar.c() << 16))) {
            crc32.reset();
            this.B = 1;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }
}
