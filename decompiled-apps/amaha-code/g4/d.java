package g4;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f16203b;

    /* renamed from: c  reason: collision with root package name */
    public c f16204c;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16202a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    public int f16205d = 0;

    public final boolean a() {
        if (this.f16204c.f16193b != 0) {
            return true;
        }
        return false;
    }

    public final c b() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        boolean z13;
        if (this.f16203b != null) {
            if (a()) {
                return this.f16204c;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i6 = 0; i6 < 6; i6++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f16204c.f16193b = 1;
            } else {
                this.f16204c.f = f();
                this.f16204c.f16197g = f();
                int c10 = c();
                c cVar = this.f16204c;
                if ((c10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f16198h = z10;
                cVar.f16199i = (int) Math.pow(2.0d, (c10 & 7) + 1);
                this.f16204c.f16200j = c();
                c cVar2 = this.f16204c;
                c();
                cVar2.getClass();
                if (this.f16204c.f16198h && !a()) {
                    c cVar3 = this.f16204c;
                    cVar3.f16192a = e(cVar3.f16199i);
                    c cVar4 = this.f16204c;
                    cVar4.f16201k = cVar4.f16192a[cVar4.f16200j];
                }
            }
            if (!a()) {
                boolean z14 = false;
                while (!z14 && !a() && this.f16204c.f16194c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 != 33) {
                        if (c11 != 44) {
                            if (c11 != 59) {
                                this.f16204c.f16193b = 1;
                            } else {
                                z14 = true;
                            }
                        } else {
                            c cVar5 = this.f16204c;
                            if (cVar5.f16195d == null) {
                                cVar5.f16195d = new b();
                            }
                            this.f16204c.f16195d.f16182a = f();
                            this.f16204c.f16195d.f16183b = f();
                            this.f16204c.f16195d.f16184c = f();
                            this.f16204c.f16195d.f16185d = f();
                            int c12 = c();
                            if ((c12 & 128) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c12 & 7) + 1);
                            b bVar = this.f16204c.f16195d;
                            if ((c12 & 64) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar.f16186e = z12;
                            if (z11) {
                                bVar.f16191k = e(pow);
                            } else {
                                bVar.f16191k = null;
                            }
                            this.f16204c.f16195d.f16190j = this.f16203b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.f16204c;
                                cVar6.f16194c++;
                                cVar6.f16196e.add(cVar6.f16195d);
                            }
                        }
                    } else {
                        int c13 = c();
                        if (c13 != 1) {
                            if (c13 != 249) {
                                if (c13 != 254) {
                                    if (c13 != 255) {
                                        g();
                                    } else {
                                        d();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i10 = 0;
                                        while (true) {
                                            bArr = this.f16202a;
                                            if (i10 >= 11) {
                                                break;
                                            }
                                            sb3.append((char) bArr[i10]);
                                            i10++;
                                        }
                                        if (sb3.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b10 = bArr[1];
                                                    byte b11 = bArr[2];
                                                    this.f16204c.getClass();
                                                }
                                                if (this.f16205d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            g();
                                        }
                                    }
                                } else {
                                    g();
                                }
                            } else {
                                this.f16204c.f16195d = new b();
                                c();
                                int c14 = c();
                                b bVar2 = this.f16204c.f16195d;
                                int i11 = (c14 & 28) >> 2;
                                bVar2.f16187g = i11;
                                if (i11 == 0) {
                                    bVar2.f16187g = 1;
                                }
                                if ((c14 & 1) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar2.f = z13;
                                int f = f();
                                if (f < 2) {
                                    f = 10;
                                }
                                b bVar3 = this.f16204c.f16195d;
                                bVar3.f16189i = f * 10;
                                bVar3.f16188h = c();
                                c();
                            }
                        } else {
                            g();
                        }
                    }
                }
                c cVar7 = this.f16204c;
                if (cVar7.f16194c < 0) {
                    cVar7.f16193b = 1;
                }
            }
            return this.f16204c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f16203b.get() & 255;
        } catch (Exception unused) {
            this.f16204c.f16193b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f16205d = c10;
        if (c10 > 0) {
            int i6 = 0;
            int i10 = 0;
            while (true) {
                try {
                    i10 = this.f16205d;
                    if (i6 < i10) {
                        i10 -= i6;
                        this.f16203b.get(this.f16202a, i6, i10);
                        i6 += i10;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i6 + " count: " + i10 + " blockSize: " + this.f16205d, e10);
                    }
                    this.f16204c.f16193b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i6) {
        byte[] bArr = new byte[i6 * 3];
        int[] iArr = null;
        try {
            this.f16203b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i6) {
                int i12 = i11 + 1;
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i10 + 1;
                iArr[i10] = ((bArr[i11] & 255) << 16) | (-16777216) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
                i11 = i14;
                i10 = i15;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f16204c.f16193b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f16203b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f16203b.position(Math.min(this.f16203b.position() + c10, this.f16203b.limit()));
        } while (c10 > 0);
    }
}
