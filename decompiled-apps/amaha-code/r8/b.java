package r8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c9.w;
import com.appsflyer.R;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import u7.x;
/* compiled from: DvbParser.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f30559h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f30560i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f30561j = {0, 17, JsonWriter.QUOTE, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f30562a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f30563b;

    /* renamed from: c  reason: collision with root package name */
    public final Canvas f30564c;

    /* renamed from: d  reason: collision with root package name */
    public final C0518b f30565d;

    /* renamed from: e  reason: collision with root package name */
    public final a f30566e;
    public final h f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f30567g;

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f30568a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f30569b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f30570c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f30571d;

        public a(int i6, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f30568a = i6;
            this.f30569b = iArr;
            this.f30570c = iArr2;
            this.f30571d = iArr3;
        }
    }

    /* compiled from: DvbParser.java */
    /* renamed from: r8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0518b {

        /* renamed from: a  reason: collision with root package name */
        public final int f30572a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30573b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30574c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30575d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30576e;
        public final int f;

        public C0518b(int i6, int i10, int i11, int i12, int i13, int i14) {
            this.f30572a = i6;
            this.f30573b = i10;
            this.f30574c = i11;
            this.f30575d = i12;
            this.f30576e = i13;
            this.f = i14;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f30577a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30578b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f30579c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f30580d;

        public c(int i6, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f30577a = i6;
            this.f30578b = z10;
            this.f30579c = bArr;
            this.f30580d = bArr2;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f30581a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30582b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<e> f30583c;

        public d(int i6, int i10, SparseArray sparseArray) {
            this.f30581a = i6;
            this.f30582b = i10;
            this.f30583c = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f30584a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30585b;

        public e(int i6, int i10) {
            this.f30584a = i6;
            this.f30585b = i10;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f30586a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30587b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30588c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30589d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30590e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final int f30591g;

        /* renamed from: h  reason: collision with root package name */
        public final int f30592h;

        /* renamed from: i  reason: collision with root package name */
        public final int f30593i;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<g> f30594j;

        public f(int i6, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, SparseArray sparseArray) {
            this.f30586a = i6;
            this.f30587b = z10;
            this.f30588c = i10;
            this.f30589d = i11;
            this.f30590e = i12;
            this.f = i13;
            this.f30591g = i14;
            this.f30592h = i15;
            this.f30593i = i16;
            this.f30594j = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f30595a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30596b;

        public g(int i6, int i10) {
            this.f30595a = i6;
            this.f30596b = i10;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f30597a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30598b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f30599c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f30600d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f30601e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f30602g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0518b f30603h;

        /* renamed from: i  reason: collision with root package name */
        public d f30604i;

        public h(int i6, int i10) {
            this.f30597a = i6;
            this.f30598b = i10;
        }
    }

    public b(int i6, int i10) {
        Paint paint = new Paint();
        this.f30562a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f30563b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f30564c = new Canvas();
        this.f30565d = new C0518b(719, 575, 0, 719, 0, 575);
        this.f30566e = new a(0, new int[]{0, -1, -16777216, -8421505}, a(), b());
        this.f = new h(i6, i10);
    }

    public static int[] a() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            if (i14 < 8) {
                if ((i14 & 1) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                if ((i14 & 2) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i14 & 4) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                iArr[i14] = c(255, i11, i12, i13);
            } else {
                int i15 = 127;
                if ((i14 & 1) != 0) {
                    i6 = 127;
                } else {
                    i6 = 0;
                }
                if ((i14 & 2) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i14 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i14] = c(255, i6, i10, i15);
            }
        }
        return iArr;
    }

    public static int[] b() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i27 = 0; i27 < 256; i27++) {
            int i28 = 255;
            if (i27 < 8) {
                if ((i27 & 1) != 0) {
                    i25 = 255;
                } else {
                    i25 = 0;
                }
                if ((i27 & 2) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i27 & 4) == 0) {
                    i28 = 0;
                }
                iArr[i27] = c(63, i25, i26, i28);
            } else {
                int i29 = i27 & 136;
                int i30 = 170;
                int i31 = 85;
                if (i29 != 0) {
                    if (i29 != 8) {
                        int i32 = 43;
                        if (i29 != 128) {
                            if (i29 == 136) {
                                if ((i27 & 1) != 0) {
                                    i21 = 43;
                                } else {
                                    i21 = 0;
                                }
                                if ((i27 & 16) != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                int i33 = i21 + i22;
                                if ((i27 & 2) != 0) {
                                    i23 = 43;
                                } else {
                                    i23 = 0;
                                }
                                if ((i27 & 32) != 0) {
                                    i24 = 85;
                                } else {
                                    i24 = 0;
                                }
                                int i34 = i23 + i24;
                                if ((i27 & 4) == 0) {
                                    i32 = 0;
                                }
                                if ((i27 & 64) == 0) {
                                    i31 = 0;
                                }
                                iArr[i27] = c(255, i33, i34, i32 + i31);
                            }
                        } else {
                            if ((i27 & 1) != 0) {
                                i17 = 43;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i17 + 127;
                            if ((i27 & 16) != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i35 + i18;
                            if ((i27 & 2) != 0) {
                                i19 = 43;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i19 + 127;
                            if ((i27 & 32) != 0) {
                                i20 = 85;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i37 + i20;
                            if ((i27 & 4) == 0) {
                                i32 = 0;
                            }
                            int i39 = i32 + 127;
                            if ((i27 & 64) == 0) {
                                i31 = 0;
                            }
                            iArr[i27] = c(255, i36, i38, i39 + i31);
                        }
                    } else {
                        if ((i27 & 1) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        if ((i27 & 16) != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        int i40 = i13 + i14;
                        if ((i27 & 2) != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        if ((i27 & 32) != 0) {
                            i16 = 170;
                        } else {
                            i16 = 0;
                        }
                        int i41 = i15 + i16;
                        if ((i27 & 4) == 0) {
                            i31 = 0;
                        }
                        if ((i27 & 64) == 0) {
                            i30 = 0;
                        }
                        iArr[i27] = c(127, i40, i41, i31 + i30);
                    }
                } else {
                    if ((i27 & 1) != 0) {
                        i6 = 85;
                    } else {
                        i6 = 0;
                    }
                    if ((i27 & 16) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i42 = i6 + i10;
                    if ((i27 & 2) != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if ((i27 & 32) != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    int i43 = i11 + i12;
                    if ((i27 & 4) == 0) {
                        i31 = 0;
                    }
                    if ((i27 & 64) == 0) {
                        i30 = 0;
                    }
                    iArr[i27] = c(255, i42, i43, i31 + i30);
                }
            }
        }
        return iArr;
    }

    public static int c(int i6, int i10, int i11, int i12) {
        return (i6 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ff A[LOOP:6: B:86:0x016a->B:118:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147 A[LOOP:5: B:39:0x00a6->B:73:0x0147, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(byte[] bArr, int[] iArr, int i6, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr4;
        boolean z12;
        int i19;
        int i20;
        int i21;
        int i22;
        byte[] bArr5;
        boolean z13;
        int i23;
        int i24;
        int i25 = 1;
        x xVar = new x(bArr, 1, 0);
        int i26 = i10;
        int i27 = i11;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (xVar.b() != 0) {
            int i28 = 8;
            int i29 = xVar.i(8);
            if (i29 != 240) {
                int i30 = 4;
                int i31 = 3;
                int i32 = 2;
                switch (i29) {
                    case 16:
                        if (i6 == 3) {
                            if (bArr6 == null) {
                                bArr3 = f30560i;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else if (i6 == 2) {
                            if (bArr8 == null) {
                                bArr3 = f30559h;
                            } else {
                                bArr3 = bArr8;
                            }
                        } else {
                            bArr2 = null;
                            i12 = i26;
                            z10 = false;
                            while (true) {
                                i13 = xVar.i(2);
                                if (i13 == 0) {
                                    if (xVar.h()) {
                                        i16 = xVar.i(3) + 3;
                                        i17 = xVar.i(2);
                                    } else if (xVar.h()) {
                                        i13 = 0;
                                    } else {
                                        int i33 = xVar.i(2);
                                        if (i33 != 0) {
                                            if (i33 != i25) {
                                                if (i33 != 2) {
                                                    if (i33 == 3) {
                                                        i18 = xVar.i(8) + 29;
                                                        i13 = xVar.i(2);
                                                        z11 = z10;
                                                        i14 = i18;
                                                        if (i14 == 0 && paint != null) {
                                                            if (bArr2 != null) {
                                                                i13 = bArr2[i13];
                                                            }
                                                            paint.setColor(iArr[i13]);
                                                            i15 = i12;
                                                            canvas.drawRect(i12, i27, i12 + i14, i27 + 1, paint);
                                                        } else {
                                                            i15 = i12;
                                                        }
                                                        i12 = i15 + i14;
                                                        if (!z11) {
                                                            xVar.c();
                                                            i26 = i12;
                                                            break;
                                                        } else {
                                                            z10 = z11;
                                                            i25 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i16 = xVar.i(4) + 12;
                                                    i17 = xVar.i(2);
                                                }
                                            } else {
                                                z11 = z10;
                                                i13 = 0;
                                                i14 = 2;
                                                if (i14 == 0) {
                                                }
                                                i15 = i12;
                                                i12 = i15 + i14;
                                                if (!z11) {
                                                }
                                            }
                                        } else {
                                            z10 = true;
                                        }
                                        z11 = z10;
                                        i13 = 0;
                                        i14 = 0;
                                        if (i14 == 0) {
                                        }
                                        i15 = i12;
                                        i12 = i15 + i14;
                                        if (!z11) {
                                        }
                                    }
                                    int i34 = i17;
                                    i18 = i16;
                                    i13 = i34;
                                    z11 = z10;
                                    i14 = i18;
                                    if (i14 == 0) {
                                    }
                                    i15 = i12;
                                    i12 = i15 + i14;
                                    if (!z11) {
                                    }
                                }
                                z11 = z10;
                                i14 = 1;
                                if (i14 == 0) {
                                }
                                i15 = i12;
                                i12 = i15 + i14;
                                if (!z11) {
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i12 = i26;
                        z10 = false;
                        while (true) {
                            i13 = xVar.i(2);
                            if (i13 == 0) {
                            }
                            z11 = z10;
                            i14 = 1;
                            if (i14 == 0) {
                            }
                            i15 = i12;
                            i12 = i15 + i14;
                            if (!z11) {
                            }
                            z10 = z11;
                            i25 = 1;
                        }
                    case 17:
                        int i35 = 8;
                        if (i6 == 3) {
                            if (bArr7 == null) {
                                bArr5 = f30561j;
                            } else {
                                bArr5 = bArr7;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        i12 = i26;
                        boolean z14 = false;
                        while (true) {
                            int i36 = xVar.i(i30);
                            if (i36 == 0) {
                                if (!xVar.h()) {
                                    int i37 = xVar.i(i31);
                                    if (i37 != 0) {
                                        z12 = z14;
                                        i19 = i37 + 2;
                                        i36 = 0;
                                        if (i19 == 0 && paint != null) {
                                            if (bArr4 != null) {
                                                i36 = bArr4[i36];
                                            }
                                            paint.setColor(iArr[i36]);
                                            i20 = i12;
                                            canvas.drawRect(i12, i27, i12 + i19, i27 + 1, paint);
                                        } else {
                                            i20 = i12;
                                        }
                                        i12 = i20 + i19;
                                        if (!z12) {
                                            xVar.c();
                                            i26 = i12;
                                            break;
                                        } else {
                                            z14 = z12;
                                            i32 = 2;
                                            i31 = 3;
                                            i30 = 4;
                                            i35 = 8;
                                        }
                                    } else {
                                        z14 = true;
                                        z12 = z14;
                                        i36 = 0;
                                        i19 = 0;
                                        if (i19 == 0) {
                                        }
                                        i20 = i12;
                                        i12 = i20 + i19;
                                        if (!z12) {
                                        }
                                    }
                                } else {
                                    if (!xVar.h()) {
                                        i21 = xVar.i(i32) + i30;
                                        i22 = xVar.i(i30);
                                    } else {
                                        int i38 = xVar.i(i32);
                                        if (i38 != 0) {
                                            if (i38 != i25) {
                                                if (i38 != i32) {
                                                    if (i38 == i31) {
                                                        i21 = xVar.i(i35) + 25;
                                                        i22 = xVar.i(i30);
                                                    }
                                                    z12 = z14;
                                                    i36 = 0;
                                                    i19 = 0;
                                                    if (i19 == 0) {
                                                    }
                                                    i20 = i12;
                                                    i12 = i20 + i19;
                                                    if (!z12) {
                                                    }
                                                } else {
                                                    i21 = xVar.i(i30) + 9;
                                                    i22 = xVar.i(i30);
                                                }
                                            } else {
                                                z12 = z14;
                                                i36 = 0;
                                                i19 = 2;
                                                if (i19 == 0) {
                                                }
                                                i20 = i12;
                                                i12 = i20 + i19;
                                                if (!z12) {
                                                }
                                            }
                                        } else {
                                            i36 = 0;
                                        }
                                    }
                                    i19 = i21;
                                    i36 = i22;
                                    z12 = z14;
                                    if (i19 == 0) {
                                    }
                                    i20 = i12;
                                    i12 = i20 + i19;
                                    if (!z12) {
                                    }
                                }
                            }
                            z12 = z14;
                            i19 = 1;
                            if (i19 == 0) {
                            }
                            i20 = i12;
                            i12 = i20 + i19;
                            if (!z12) {
                            }
                        }
                    case 18:
                        int i39 = i26;
                        boolean z15 = false;
                        while (true) {
                            int i40 = xVar.i(i28);
                            if (i40 != 0) {
                                z13 = z15;
                                i23 = 1;
                            } else if (!xVar.h()) {
                                int i41 = xVar.i(7);
                                if (i41 != 0) {
                                    z13 = z15;
                                    i23 = i41;
                                    i40 = 0;
                                } else {
                                    i40 = 0;
                                    z13 = true;
                                    i23 = 0;
                                }
                            } else {
                                z13 = z15;
                                i23 = xVar.i(7);
                                i40 = xVar.i(i28);
                            }
                            if (i23 != 0 && paint != null) {
                                paint.setColor(iArr[i40]);
                                i24 = i39;
                                canvas.drawRect(i39, i27, i39 + i23, i27 + 1, paint);
                            } else {
                                i24 = i39;
                            }
                            i39 = i24 + i23;
                            if (z13) {
                                i26 = i39;
                                break;
                            } else {
                                z15 = z13;
                                i28 = 8;
                            }
                        }
                    default:
                        switch (i29) {
                            case 32:
                                bArr8 = new byte[4];
                                for (int i42 = 0; i42 < 4; i42++) {
                                    bArr8[i42] = (byte) xVar.i(4);
                                }
                                continue;
                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                bArr6 = new byte[4];
                                for (int i43 = 0; i43 < 4; i43++) {
                                    bArr6[i43] = (byte) xVar.i(8);
                                }
                                continue;
                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                bArr7 = new byte[16];
                                for (int i44 = 0; i44 < 16; i44++) {
                                    bArr7[i44] = (byte) xVar.i(8);
                                }
                                continue;
                        }
                }
            } else {
                i27 += 2;
                i26 = i10;
            }
            i25 = 1;
        }
    }

    public static a e(int i6, x xVar) {
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 8;
        int i15 = xVar.i(8);
        xVar.r(8);
        int i16 = i6 - 2;
        int i17 = 4;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] a10 = a();
        int[] b10 = b();
        while (i16 > 0) {
            int i18 = xVar.i(i14);
            int i19 = xVar.i(i14);
            int i20 = i16 - 2;
            if ((i19 & 128) != 0) {
                iArr = iArr2;
            } else if ((i19 & 64) != 0) {
                iArr = a10;
            } else {
                iArr = b10;
            }
            if ((i19 & 1) != 0) {
                i12 = xVar.i(i14);
                i13 = xVar.i(i14);
                i10 = xVar.i(i14);
                i11 = xVar.i(i14);
                i16 = i20 - 4;
            } else {
                int i21 = xVar.i(i17) << i17;
                int i22 = xVar.i(2) << 6;
                i16 = i20 - 2;
                i10 = xVar.i(i17) << i17;
                i11 = i22;
                i12 = xVar.i(6) << 2;
                i13 = i21;
            }
            if (i12 == 0) {
                i13 = 0;
                i10 = 0;
                i11 = 255;
            }
            double d10 = i12;
            double d11 = i13 - 128;
            double d12 = i10 - 128;
            iArr[i18] = c((byte) (255 - (i11 & 255)), w.h((int) ((1.402d * d11) + d10), 0, 255), w.h((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), w.h((int) ((d12 * 1.772d) + d10), 0, 255));
            iArr2 = iArr2;
            i15 = i15;
            i14 = 8;
            i17 = 4;
        }
        return new a(i15, iArr2, a10, b10);
    }

    public static c f(x xVar) {
        byte[] bArr;
        int i6 = xVar.i(16);
        xVar.r(4);
        int i10 = xVar.i(2);
        boolean h10 = xVar.h();
        xVar.r(1);
        byte[] bArr2 = w.f;
        if (i10 == 1) {
            xVar.r(xVar.i(8) * 16);
        } else if (i10 == 0) {
            int i11 = xVar.i(16);
            int i12 = xVar.i(16);
            if (i11 > 0) {
                bArr2 = new byte[i11];
                xVar.k(bArr2, i11);
            }
            if (i12 > 0) {
                bArr = new byte[i12];
                xVar.k(bArr, i12);
                return new c(i6, h10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i6, h10, bArr2, bArr);
    }
}
