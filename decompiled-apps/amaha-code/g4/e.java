package g4;

import android.graphics.Bitmap;
import android.util.Log;
import g4.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f16206a;

    /* renamed from: c  reason: collision with root package name */
    public final a.InterfaceC0245a f16208c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f16209d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f16210e;
    public short[] f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f16211g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f16212h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f16213i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f16214j;

    /* renamed from: k  reason: collision with root package name */
    public int f16215k;

    /* renamed from: l  reason: collision with root package name */
    public c f16216l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f16217m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16218n;

    /* renamed from: o  reason: collision with root package name */
    public int f16219o;

    /* renamed from: p  reason: collision with root package name */
    public int f16220p;

    /* renamed from: q  reason: collision with root package name */
    public int f16221q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f16222s;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f16207b = new int[256];

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f16223t = Bitmap.Config.ARGB_8888;

    public e(u4.b bVar, c cVar, ByteBuffer byteBuffer, int i6) {
        byte[] bArr;
        int[] iArr;
        this.f16208c = bVar;
        this.f16216l = new c();
        synchronized (this) {
            if (i6 > 0) {
                int highestOneBit = Integer.highestOneBit(i6);
                this.f16219o = 0;
                this.f16216l = cVar;
                this.f16215k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f16209d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f16209d.order(ByteOrder.LITTLE_ENDIAN);
                this.f16218n = false;
                Iterator it = cVar.f16196e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f16187g == 3) {
                        this.f16218n = true;
                        break;
                    }
                }
                this.f16220p = highestOneBit;
                int i10 = cVar.f;
                this.r = i10 / highestOneBit;
                int i11 = cVar.f16197g;
                this.f16221q = i11 / highestOneBit;
                int i12 = i10 * i11;
                l4.b bVar2 = ((u4.b) this.f16208c).f33801b;
                if (bVar2 == null) {
                    bArr = new byte[i12];
                } else {
                    bArr = (byte[]) bVar2.c(i12, byte[].class);
                }
                this.f16213i = bArr;
                a.InterfaceC0245a interfaceC0245a = this.f16208c;
                int i13 = this.r * this.f16221q;
                l4.b bVar3 = ((u4.b) interfaceC0245a).f33801b;
                if (bVar3 == null) {
                    iArr = new int[i13];
                } else {
                    iArr = (int[]) bVar3.c(i13, int[].class);
                }
                this.f16214j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i6);
            }
        }
    }

    @Override // g4.a
    public final synchronized Bitmap a() {
        b bVar;
        byte[] bArr;
        if (this.f16216l.f16194c <= 0 || this.f16215k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f16216l.f16194c + ", framePointer=" + this.f16215k);
            }
            this.f16219o = 1;
        }
        int i6 = this.f16219o;
        if (i6 != 1 && i6 != 2) {
            this.f16219o = 0;
            if (this.f16210e == null) {
                l4.b bVar2 = ((u4.b) this.f16208c).f33801b;
                if (bVar2 == null) {
                    bArr = new byte[255];
                } else {
                    bArr = (byte[]) bVar2.c(255, byte[].class);
                }
                this.f16210e = bArr;
            }
            b bVar3 = (b) this.f16216l.f16196e.get(this.f16215k);
            int i10 = this.f16215k - 1;
            if (i10 >= 0) {
                bVar = (b) this.f16216l.f16196e.get(i10);
            } else {
                bVar = null;
            }
            int[] iArr = bVar3.f16191k;
            if (iArr == null) {
                iArr = this.f16216l.f16192a;
            }
            this.f16206a = iArr;
            if (iArr == null) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "No valid color table found for frame #" + this.f16215k);
                }
                this.f16219o = 1;
                return null;
            }
            if (bVar3.f) {
                System.arraycopy(iArr, 0, this.f16207b, 0, iArr.length);
                int[] iArr2 = this.f16207b;
                this.f16206a = iArr2;
                iArr2[bVar3.f16188h] = 0;
                if (bVar3.f16187g == 2 && this.f16215k == 0) {
                    this.f16222s = Boolean.TRUE;
                }
            }
            return i(bVar3, bVar);
        }
        if (Log.isLoggable("e", 3)) {
            Log.d("e", "Unable to decode frame, status=" + this.f16219o);
        }
        return null;
    }

    @Override // g4.a
    public final void b() {
        this.f16215k = (this.f16215k + 1) % this.f16216l.f16194c;
    }

    @Override // g4.a
    public final int c() {
        return this.f16216l.f16194c;
    }

    @Override // g4.a
    public final void clear() {
        l4.b bVar;
        l4.b bVar2;
        l4.b bVar3;
        this.f16216l = null;
        byte[] bArr = this.f16213i;
        a.InterfaceC0245a interfaceC0245a = this.f16208c;
        if (bArr != null && (bVar3 = ((u4.b) interfaceC0245a).f33801b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f16214j;
        if (iArr != null && (bVar2 = ((u4.b) interfaceC0245a).f33801b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f16217m;
        if (bitmap != null) {
            ((u4.b) interfaceC0245a).f33800a.d(bitmap);
        }
        this.f16217m = null;
        this.f16209d = null;
        this.f16222s = null;
        byte[] bArr2 = this.f16210e;
        if (bArr2 != null && (bVar = ((u4.b) interfaceC0245a).f33801b) != null) {
            bVar.put(bArr2);
        }
    }

    @Override // g4.a
    public final int d() {
        int i6;
        c cVar = this.f16216l;
        int i10 = cVar.f16194c;
        if (i10 > 0 && (i6 = this.f16215k) >= 0) {
            if (i6 >= 0 && i6 < i10) {
                return ((b) cVar.f16196e.get(i6)).f16189i;
            }
            return -1;
        }
        return 0;
    }

    @Override // g4.a
    public final int e() {
        return this.f16215k;
    }

    @Override // g4.a
    public final int f() {
        return (this.f16214j.length * 4) + this.f16209d.limit() + this.f16213i.length;
    }

    public final Bitmap g() {
        Bitmap.Config config;
        Boolean bool = this.f16222s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f16223t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c10 = ((u4.b) this.f16208c).f33800a.c(this.r, this.f16221q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    @Override // g4.a
    public final ByteBuffer getData() {
        return this.f16209d;
    }

    public final void h(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f16223t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r3.f16200j == r36.f16188h) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap i(b bVar, b bVar2) {
        byte[] bArr;
        int[] iArr;
        boolean z10;
        boolean booleanValue;
        int i6;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z12;
        boolean z13;
        int i20;
        int i21;
        short s10;
        int i22;
        short s11;
        int i23;
        int i24;
        Bitmap bitmap;
        int i25;
        int i26;
        int i27;
        int[] iArr2 = this.f16214j;
        a.InterfaceC0245a interfaceC0245a = this.f16208c;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f16217m;
            if (bitmap2 != null) {
                ((u4.b) interfaceC0245a).f33800a.d(bitmap2);
            }
            this.f16217m = null;
            Arrays.fill(iArr2, 0);
        }
        if (bVar2 != null && bVar2.f16187g == 3 && this.f16217m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (bVar2 != null && (i24 = bVar2.f16187g) > 0) {
            if (i24 == 2) {
                if (!bVar.f) {
                    c cVar = this.f16216l;
                    i25 = cVar.f16201k;
                    if (bVar.f16191k != null) {
                    }
                    int i28 = bVar2.f16185d;
                    int i29 = this.f16220p;
                    int i30 = i28 / i29;
                    int i31 = bVar2.f16183b / i29;
                    int i32 = bVar2.f16184c / i29;
                    int i33 = bVar2.f16182a / i29;
                    int i34 = this.r;
                    i26 = (i31 * i34) + i33;
                    i27 = (i30 * i34) + i26;
                    while (i26 < i27) {
                        int i35 = i26 + i32;
                        for (int i36 = i26; i36 < i35; i36++) {
                            iArr2[i36] = i25;
                        }
                        i26 += this.r;
                    }
                }
                i25 = 0;
                int i282 = bVar2.f16185d;
                int i292 = this.f16220p;
                int i302 = i282 / i292;
                int i312 = bVar2.f16183b / i292;
                int i322 = bVar2.f16184c / i292;
                int i332 = bVar2.f16182a / i292;
                int i342 = this.r;
                i26 = (i312 * i342) + i332;
                i27 = (i302 * i342) + i26;
                while (i26 < i27) {
                }
            } else if (i24 == 3 && (bitmap = this.f16217m) != null) {
                int i37 = this.r;
                bitmap.getPixels(iArr2, 0, i37, 0, 0, i37, this.f16221q);
            }
        }
        this.f16209d.position(bVar.f16190j);
        int i38 = bVar.f16184c * bVar.f16185d;
        byte[] bArr2 = this.f16213i;
        if (bArr2 == null || bArr2.length < i38) {
            l4.b bVar3 = ((u4.b) interfaceC0245a).f33801b;
            if (bVar3 == null) {
                bArr = new byte[i38];
            } else {
                bArr = (byte[]) bVar3.c(i38, byte[].class);
            }
            this.f16213i = bArr;
        }
        byte[] bArr3 = this.f16213i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.f16211g == null) {
            this.f16211g = new byte[4096];
        }
        byte[] bArr4 = this.f16211g;
        if (this.f16212h == null) {
            this.f16212h = new byte[4097];
        }
        byte[] bArr5 = this.f16212h;
        int i39 = this.f16209d.get() & 255;
        int i40 = 1 << i39;
        int i41 = i40 + 1;
        int i42 = i40 + 2;
        int i43 = i39 + 1;
        int i44 = (1 << i43) - 1;
        for (int i45 = 0; i45 < i40; i45++) {
            sArr[i45] = 0;
            bArr4[i45] = (byte) i45;
        }
        byte[] bArr6 = this.f16210e;
        e eVar = this;
        int i46 = i43;
        int i47 = i42;
        int i48 = i44;
        int i49 = 0;
        short s12 = -1;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        while (true) {
            if (i49 < i38) {
                if (i50 == 0) {
                    int i57 = this.f16209d.get() & 255;
                    if (i57 <= 0) {
                        i20 = i43;
                        i21 = i49;
                        iArr = iArr2;
                        s10 = s12;
                    } else {
                        i20 = i43;
                        ByteBuffer byteBuffer = eVar.f16209d;
                        i21 = i49;
                        s10 = s12;
                        iArr = iArr2;
                        byteBuffer.get(eVar.f16210e, 0, Math.min(i57, byteBuffer.remaining()));
                    }
                    if (i57 <= 0) {
                        eVar.f16219o = 3;
                        break;
                    }
                    i50 = i57;
                    i51 = 0;
                } else {
                    i20 = i43;
                    i21 = i49;
                    iArr = iArr2;
                    s10 = s12;
                }
                i53 += (bArr6[i51] & 255) << i52;
                i51++;
                i50--;
                int i58 = i52 + 8;
                int i59 = i47;
                int i60 = i46;
                i49 = i21;
                s12 = s10;
                byte[] bArr7 = bArr6;
                int i61 = i54;
                while (true) {
                    if (i58 >= i60) {
                        e eVar2 = eVar;
                        int i62 = i53 & i48;
                        i53 >>= i60;
                        i58 -= i60;
                        if (i62 == i40) {
                            i59 = i42;
                            i48 = i44;
                            eVar = eVar2;
                            i60 = i20;
                            s12 = -1;
                        } else if (i62 == i41) {
                            eVar = eVar2;
                            i22 = i61;
                            break;
                        } else {
                            if (s12 == -1) {
                                bArr3[i55] = bArr4[i62];
                                i55++;
                                i49++;
                                i23 = i62;
                            } else {
                                if (i62 >= i59) {
                                    bArr5[i56] = (byte) i61;
                                    i56++;
                                    s11 = s12;
                                } else {
                                    s11 = i62;
                                }
                                while (s11 >= i40) {
                                    bArr5[i56] = bArr4[s11];
                                    i56++;
                                    s11 = sArr[s11];
                                }
                                int i63 = bArr4[s11] & 255;
                                byte b10 = (byte) i63;
                                bArr3[i55] = b10;
                                while (true) {
                                    i55++;
                                    i49++;
                                    if (i56 <= 0) {
                                        break;
                                    }
                                    i56--;
                                    bArr3[i55] = bArr5[i56];
                                }
                                i23 = i63;
                                if (i59 < 4096) {
                                    sArr[i59] = s12;
                                    bArr4[i59] = b10;
                                    i59++;
                                    if ((i59 & i48) == 0 && i59 < 4096) {
                                        i60++;
                                        i48 += i59;
                                    }
                                }
                            }
                            s12 = i62;
                            i61 = i23;
                            i58 = i58;
                            eVar = this;
                        }
                    } else {
                        i22 = i61;
                        eVar = this;
                        break;
                    }
                }
                i46 = i60;
                bArr6 = bArr7;
                i54 = i22;
                i43 = i20;
                i52 = i58;
                i47 = i59;
                iArr2 = iArr;
            } else {
                iArr = iArr2;
                break;
            }
        }
        Arrays.fill(bArr3, i55, i38, (byte) 0);
        if (!bVar.f16186e && this.f16220p == 1) {
            int[] iArr3 = this.f16214j;
            int i64 = bVar.f16185d;
            int i65 = bVar.f16183b;
            int i66 = bVar.f16184c;
            int i67 = bVar.f16182a;
            if (this.f16215k == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i68 = this.r;
            byte[] bArr8 = this.f16213i;
            int[] iArr4 = this.f16206a;
            byte b11 = -1;
            for (int i69 = 0; i69 < i64; i69++) {
                int i70 = (i69 + i65) * i68;
                int i71 = i70 + i67;
                int i72 = i71 + i66;
                int i73 = i70 + i68;
                if (i73 < i72) {
                    i72 = i73;
                }
                int i74 = bVar.f16184c * i69;
                while (i71 < i72) {
                    int i75 = i64;
                    byte b12 = bArr8[i74];
                    int i76 = i65;
                    int i77 = b12 & 255;
                    if (i77 != b11) {
                        int i78 = iArr4[i77];
                        if (i78 != 0) {
                            iArr3[i71] = i78;
                        } else {
                            b11 = b12;
                        }
                    }
                    i74++;
                    i71++;
                    i64 = i75;
                    i65 = i76;
                }
            }
            Boolean bool = this.f16222s;
            if ((bool != null && bool.booleanValue()) || (this.f16222s == null && z12 && b11 != -1)) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f16222s = Boolean.valueOf(z13);
        } else {
            int[] iArr5 = this.f16214j;
            int i79 = bVar.f16185d;
            int i80 = this.f16220p;
            int i81 = i79 / i80;
            int i82 = bVar.f16183b / i80;
            int i83 = bVar.f16184c / i80;
            int i84 = bVar.f16182a / i80;
            if (this.f16215k == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i85 = this.r;
            int i86 = this.f16221q;
            byte[] bArr9 = this.f16213i;
            int[] iArr6 = this.f16206a;
            Boolean bool2 = this.f16222s;
            int i87 = 0;
            int i88 = 0;
            int i89 = 1;
            int i90 = 8;
            while (i87 < i81) {
                Boolean bool3 = bool2;
                if (bVar.f16186e) {
                    if (i88 >= i81) {
                        int i91 = i89 + 1;
                        i6 = i81;
                        if (i91 != 2) {
                            if (i91 != 3) {
                                i89 = i91;
                                if (i91 == 4) {
                                    i88 = 1;
                                    i90 = 2;
                                }
                            } else {
                                i89 = i91;
                                i88 = 2;
                                i90 = 4;
                            }
                        } else {
                            i89 = i91;
                            i88 = 4;
                        }
                    } else {
                        i6 = i81;
                    }
                    i10 = i88 + i90;
                } else {
                    i6 = i81;
                    i10 = i88;
                    i88 = i87;
                }
                int i92 = i88 + i82;
                if (i80 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i92 < i86) {
                    int i93 = i92 * i85;
                    int i94 = i93 + i84;
                    i11 = i10;
                    int i95 = i94 + i83;
                    int i96 = i93 + i85;
                    if (i96 < i95) {
                        i95 = i96;
                    }
                    i12 = i82;
                    int i97 = i87 * i80 * bVar.f16184c;
                    if (z11) {
                        bool2 = bool3;
                        int i98 = i94;
                        while (true) {
                            i13 = i83;
                            if (i98 >= i95) {
                                break;
                            }
                            int i99 = iArr6[bArr9[i97] & 255];
                            if (i99 != 0) {
                                iArr5[i98] = i99;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i97 += i80;
                            i98++;
                            i83 = i13;
                        }
                    } else {
                        i13 = i83;
                        int i100 = ((i95 - i94) * i80) + i97;
                        bool2 = bool3;
                        int i101 = i94;
                        while (i101 < i95) {
                            int i102 = i95;
                            int i103 = bVar.f16184c;
                            int i104 = i84;
                            int i105 = i85;
                            int i106 = i97;
                            int i107 = 0;
                            int i108 = 0;
                            int i109 = 0;
                            int i110 = 0;
                            int i111 = 0;
                            while (true) {
                                if (i106 < this.f16220p + i97) {
                                    byte[] bArr10 = this.f16213i;
                                    i17 = i86;
                                    if (i106 >= bArr10.length || i106 >= i100) {
                                        break;
                                    }
                                    int i112 = this.f16206a[bArr10[i106] & 255];
                                    if (i112 != 0) {
                                        i107 += (i112 >> 24) & 255;
                                        i108 += (i112 >> 16) & 255;
                                        i109 += (i112 >> 8) & 255;
                                        i110 += i112 & 255;
                                        i111++;
                                    }
                                    i106++;
                                    i86 = i17;
                                } else {
                                    i17 = i86;
                                    break;
                                }
                            }
                            int i113 = i103 + i97;
                            for (int i114 = i113; i114 < this.f16220p + i113; i114++) {
                                byte[] bArr11 = this.f16213i;
                                if (i114 >= bArr11.length || i114 >= i100) {
                                    break;
                                }
                                int i115 = this.f16206a[bArr11[i114] & 255];
                                if (i115 != 0) {
                                    i107 += (i115 >> 24) & 255;
                                    i108 += (i115 >> 16) & 255;
                                    i109 += (i115 >> 8) & 255;
                                    i110 += i115 & 255;
                                    i111++;
                                }
                            }
                            if (i111 == 0) {
                                i18 = 0;
                            } else {
                                i18 = ((i107 / i111) << 24) | ((i108 / i111) << 16) | ((i109 / i111) << 8) | (i110 / i111);
                            }
                            if (i18 != 0) {
                                iArr5[i101] = i18;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i97 += i80;
                            i101++;
                            i95 = i102;
                            i84 = i104;
                            i85 = i105;
                            i86 = i17;
                        }
                    }
                    i14 = i84;
                    i15 = i85;
                    i16 = i86;
                } else {
                    i11 = i10;
                    i12 = i82;
                    i13 = i83;
                    i14 = i84;
                    i15 = i85;
                    i16 = i86;
                    bool2 = bool3;
                }
                i87++;
                i81 = i6;
                i88 = i11;
                i82 = i12;
                i83 = i13;
                i84 = i14;
                i85 = i15;
                i86 = i16;
            }
            Boolean bool4 = bool2;
            if (this.f16222s == null) {
                if (bool4 == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool4.booleanValue();
                }
                this.f16222s = Boolean.valueOf(booleanValue);
            }
        }
        if (this.f16218n && ((i19 = bVar.f16187g) == 0 || i19 == 1)) {
            if (this.f16217m == null) {
                this.f16217m = g();
            }
            Bitmap bitmap3 = this.f16217m;
            int i116 = this.r;
            bitmap3.setPixels(iArr, 0, i116, 0, 0, i116, this.f16221q);
        }
        Bitmap g5 = g();
        int i117 = this.r;
        g5.setPixels(iArr, 0, i117, 0, 0, i117, this.f16221q);
        return g5;
    }
}
