package gu;

import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: CodedInputStream.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public int f16842c;

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f16844e;
    public int f;

    /* renamed from: i  reason: collision with root package name */
    public int f16847i;

    /* renamed from: h  reason: collision with root package name */
    public int f16846h = SubsamplingScaleImageView.TILE_SIZE_AUTO;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16840a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public int f16841b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f16843d = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f16845g = 0;

    public d(InputStream inputStream) {
        this.f16844e = inputStream;
    }

    public final void a(int i6) {
        if (this.f == i6) {
            return;
        }
        throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public final int b() {
        int i6 = this.f16846h;
        if (i6 == Integer.MAX_VALUE) {
            return -1;
        }
        return i6 - (this.f16845g + this.f16843d);
    }

    public final void c(int i6) {
        this.f16846h = i6;
        o();
    }

    public final int d(int i6) {
        if (i6 >= 0) {
            int i10 = this.f16845g + this.f16843d + i6;
            int i11 = this.f16846h;
            if (i10 <= i11) {
                this.f16846h = i10;
                o();
                return i11;
            }
            throw InvalidProtocolBufferException.b();
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final m e() {
        int k10 = k();
        int i6 = this.f16841b;
        int i10 = this.f16843d;
        if (k10 <= i6 - i10 && k10 > 0) {
            m mVar = c.f16833u;
            byte[] bArr = new byte[k10];
            System.arraycopy(this.f16840a, i10, bArr, 0, k10);
            m mVar2 = new m(bArr);
            this.f16843d += k10;
            return mVar2;
        } else if (k10 == 0) {
            return c.f16833u;
        } else {
            return new m(h(k10));
        }
    }

    public final int f() {
        return k();
    }

    public final n g(b bVar, e eVar) {
        int k10 = k();
        if (this.f16847i < 64) {
            int d10 = d(k10);
            this.f16847i++;
            n nVar = (n) bVar.a(this, eVar);
            a(0);
            this.f16847i--;
            c(d10);
            return nVar;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] h(int i6) {
        int read;
        if (i6 <= 0) {
            if (i6 == 0) {
                return h.f16872a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.f16845g;
        int i11 = this.f16843d;
        int i12 = i10 + i11 + i6;
        int i13 = this.f16846h;
        if (i12 <= i13) {
            byte[] bArr = this.f16840a;
            if (i6 < 4096) {
                byte[] bArr2 = new byte[i6];
                int i14 = this.f16841b - i11;
                System.arraycopy(bArr, i11, bArr2, 0, i14);
                int i15 = this.f16841b;
                this.f16843d = i15;
                int i16 = i6 - i14;
                if (i15 - i15 < i16) {
                    p(i16);
                }
                System.arraycopy(bArr, 0, bArr2, i14, i16);
                this.f16843d = i16;
                return bArr2;
            }
            int i17 = this.f16841b;
            this.f16845g = i10 + i17;
            this.f16843d = 0;
            this.f16841b = 0;
            int i18 = i17 - i11;
            int i19 = i6 - i18;
            ArrayList arrayList = new ArrayList();
            while (i19 > 0) {
                int min = Math.min(i19, 4096);
                byte[] bArr3 = new byte[min];
                int i20 = 0;
                while (i20 < min) {
                    InputStream inputStream = this.f16844e;
                    if (inputStream == null) {
                        read = -1;
                    } else {
                        read = inputStream.read(bArr3, i20, min - i20);
                    }
                    if (read != -1) {
                        this.f16845g += read;
                        i20 += read;
                    } else {
                        throw InvalidProtocolBufferException.b();
                    }
                }
                i19 -= min;
                arrayList.add(bArr3);
            }
            byte[] bArr4 = new byte[i6];
            System.arraycopy(bArr, i11, bArr4, 0, i18);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i18, bArr5.length);
                i18 += bArr5.length;
            }
            return bArr4;
        }
        r((i13 - i10) - i11);
        throw InvalidProtocolBufferException.b();
    }

    public final int i() {
        int i6 = this.f16843d;
        if (this.f16841b - i6 < 4) {
            p(4);
            i6 = this.f16843d;
        }
        this.f16843d = i6 + 4;
        byte[] bArr = this.f16840a;
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public final long j() {
        int i6 = this.f16843d;
        if (this.f16841b - i6 < 8) {
            p(8);
            i6 = this.f16843d;
        }
        this.f16843d = i6 + 8;
        byte[] bArr = this.f16840a;
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r3[r2] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k() {
        int i6;
        byte b10;
        int i10;
        long j10;
        int i11 = this.f16843d;
        int i12 = this.f16841b;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f16840a;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.f16843d = i13;
                return b11;
            } else if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b11 ^ (bArr[i13] << 7);
                long j11 = i15;
                if (j11 < 0) {
                    j10 = -128;
                } else {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    long j12 = i17;
                    if (j12 >= 0) {
                        i10 = (int) (16256 ^ j12);
                    } else {
                        i14 = i16 + 1;
                        j11 = i17 ^ (bArr[i16] << 21);
                        if (j11 < 0) {
                            j10 = -2080896;
                        } else {
                            i16 = i14 + 1;
                            i10 = (int) ((i6 ^ (b10 << 28)) ^ 266354560);
                            if (bArr[i14] < 0) {
                                i14 = i16 + 1;
                                if (bArr[i16] < 0) {
                                    i16 = i14 + 1;
                                    if (bArr[i14] < 0) {
                                        i14 = i16 + 1;
                                        if (bArr[i16] < 0) {
                                            i16 = i14 + 1;
                                            if (bArr[i14] < 0) {
                                                i14 = i16 + 1;
                                            }
                                        }
                                    }
                                }
                                this.f16843d = i14;
                                return i10;
                            }
                        }
                    }
                    i14 = i16;
                    this.f16843d = i14;
                    return i10;
                }
                i10 = (int) (j10 ^ j11);
                this.f16843d = i14;
                return i10;
            }
        }
        return (int) m();
    }

    public final long l() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i6 = this.f16843d;
        int i10 = this.f16841b;
        if (i10 != i6) {
            int i11 = i6 + 1;
            byte[] bArr = this.f16840a;
            byte b10 = bArr[i6];
            if (b10 >= 0) {
                this.f16843d = i11;
                return b10;
            } else if (i10 - i11 >= 9) {
                int i12 = i11 + 1;
                long j14 = b10 ^ (bArr[i11] << 7);
                if (j14 < 0) {
                    j11 = (-128) ^ j14;
                } else {
                    int i13 = i12 + 1;
                    long j15 = (bArr[i12] << 14) ^ j14;
                    if (j15 >= 0) {
                        j11 = j15 ^ 16256;
                        i12 = i13;
                    } else {
                        int i14 = i13 + 1;
                        long j16 = j15 ^ (bArr[i13] << 21);
                        if (j16 < 0) {
                            j12 = -2080896;
                        } else {
                            int i15 = i14 + 1;
                            long j17 = j16 ^ (bArr[i14] << 28);
                            if (j17 >= 0) {
                                j13 = 266354560;
                            } else {
                                i14 = i15 + 1;
                                j16 = j17 ^ (bArr[i15] << 35);
                                if (j16 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i15 = i14 + 1;
                                    j17 = j16 ^ (bArr[i14] << 42);
                                    if (j17 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i14 = i15 + 1;
                                        j16 = j17 ^ (bArr[i15] << 49);
                                        if (j16 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i15 = i14 + 1;
                                            j10 = (j16 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i14 = i15 + 1;
                                                if (bArr[i15] >= 0) {
                                                    j11 = j10;
                                                    i12 = i14;
                                                }
                                            }
                                            i12 = i15;
                                            j11 = j10;
                                        }
                                    }
                                }
                            }
                            j10 = j17 ^ j13;
                            i12 = i15;
                            j11 = j10;
                        }
                        j11 = j12 ^ j16;
                        i12 = i14;
                    }
                }
                this.f16843d = i12;
                return j11;
            }
        }
        return m();
    }

    public final long m() {
        long j10 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            if (this.f16843d == this.f16841b) {
                p(1);
            }
            int i10 = this.f16843d;
            this.f16843d = i10 + 1;
            byte b10 = this.f16840a[i10];
            j10 |= (b10 & Byte.MAX_VALUE) << i6;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (s(1) == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n() {
        boolean z10;
        if (this.f16843d == this.f16841b) {
            z10 = true;
        }
        z10 = false;
        if (z10) {
            this.f = 0;
            return 0;
        }
        int k10 = k();
        this.f = k10;
        if ((k10 >>> 3) != 0) {
            return k10;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i6 = this.f16841b + this.f16842c;
        this.f16841b = i6;
        int i10 = this.f16845g + i6;
        int i11 = this.f16846h;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f16842c = i12;
            this.f16841b = i6 - i12;
            return;
        }
        this.f16842c = 0;
    }

    public final void p(int i6) {
        if (s(i6)) {
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final boolean q(int i6, CodedOutputStream codedOutputStream) {
        int n10;
        int i10 = i6 & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                int i11 = i();
                                codedOutputStream.v(i6);
                                codedOutputStream.t(i11);
                                return true;
                            }
                            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    codedOutputStream.v(i6);
                    do {
                        n10 = n();
                        if (n10 == 0) {
                            break;
                        }
                    } while (q(n10, codedOutputStream));
                    int i12 = ((i6 >>> 3) << 3) | 4;
                    a(i12);
                    codedOutputStream.v(i12);
                    return true;
                }
                m e10 = e();
                codedOutputStream.v(i6);
                codedOutputStream.v(e10.size());
                codedOutputStream.r(e10);
                return true;
            }
            long j10 = j();
            codedOutputStream.v(i6);
            codedOutputStream.u(j10);
            return true;
        }
        long l2 = l();
        codedOutputStream.v(i6);
        codedOutputStream.w(l2);
        return true;
    }

    public final void r(int i6) {
        int i10 = this.f16841b;
        int i11 = this.f16843d;
        int i12 = i10 - i11;
        if (i6 <= i12 && i6 >= 0) {
            this.f16843d = i11 + i6;
        } else if (i6 >= 0) {
            int i13 = this.f16845g;
            int i14 = i13 + i11 + i6;
            int i15 = this.f16846h;
            if (i14 <= i15) {
                this.f16843d = i10;
                p(1);
                while (true) {
                    int i16 = i6 - i12;
                    int i17 = this.f16841b;
                    if (i16 > i17) {
                        i12 += i17;
                        this.f16843d = i17;
                        p(1);
                    } else {
                        this.f16843d = i16;
                        return;
                    }
                }
            } else {
                r((i15 - i13) - i11);
                throw InvalidProtocolBufferException.b();
            }
        } else {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean s(int i6) {
        InputStream inputStream;
        int i10 = this.f16843d;
        int i11 = i10 + i6;
        int i12 = this.f16841b;
        if (i11 > i12) {
            if (this.f16845g + i10 + i6 <= this.f16846h && (inputStream = this.f16844e) != null) {
                byte[] bArr = this.f16840a;
                if (i10 > 0) {
                    if (i12 > i10) {
                        System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                    }
                    this.f16845g += i10;
                    this.f16841b -= i10;
                    this.f16843d = 0;
                }
                int i13 = this.f16841b;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read > 0) {
                        this.f16841b += read;
                        if ((this.f16845g + i6) - 67108864 <= 0) {
                            o();
                            if (this.f16841b >= i6) {
                                return true;
                            }
                            return s(i6);
                        }
                        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder((int) R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i6);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }
}
