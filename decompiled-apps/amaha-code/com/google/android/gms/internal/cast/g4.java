package com.google.android.gms.internal.cast;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class g4<T> implements o4<T> {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f7529l = new int[0];

    /* renamed from: m  reason: collision with root package name */
    public static final Unsafe f7530m = i5.o();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7531a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7532b;

    /* renamed from: c  reason: collision with root package name */
    public final c4 f7533c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7534d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7535e;
    public final int[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7536g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7537h;

    /* renamed from: i  reason: collision with root package name */
    public final r3 f7538i;

    /* renamed from: j  reason: collision with root package name */
    public final y4<?, ?> f7539j;

    /* renamed from: k  reason: collision with root package name */
    public final t2<?> f7540k;

    public g4(int[] iArr, Object[] objArr, c4 c4Var, boolean z10, int[] iArr2, int i6, int i10, r3 r3Var, y4 y4Var, t2 t2Var, y3 y3Var) {
        boolean z11;
        this.f7531a = iArr;
        this.f7532b = objArr;
        this.f7535e = z10;
        if (t2Var != null && t2Var.a(c4Var)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7534d = z11;
        this.f = iArr2;
        this.f7536g = i6;
        this.f7537h = i10;
        this.f7538i = r3Var;
        this.f7539j = y4Var;
        this.f7540k = t2Var;
        this.f7533c = c4Var;
    }

    public static final void m(int i6, Object obj, r2 r2Var) {
        if (obj instanceof String) {
            r2Var.f7630a.e0(i6, (String) obj);
            return;
        }
        r2Var.l(i6, (n2) obj);
    }

    public static g4 n(a4 a4Var, r3 r3Var, y4 y4Var, t2 t2Var, y3 y3Var) {
        if (a4Var instanceof n4) {
            return o((n4) a4Var, r3Var, y4Var, t2Var, y3Var);
        }
        x4 x4Var = (x4) a4Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g4 o(n4 n4Var, r3 r3Var, y4 y4Var, t2 t2Var, y3 y3Var) {
        boolean z10;
        int i6;
        int charAt;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt2;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        int i19;
        int i20;
        char charAt6;
        int i21;
        char charAt7;
        int i22;
        int i23;
        int[] iArr2;
        int i24;
        int i25;
        int[] iArr3;
        int objectFieldOffset;
        String str;
        int i26;
        int i27;
        int i28;
        int i29;
        Field p10;
        int i30;
        char charAt8;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field p11;
        Object obj2;
        Field p12;
        int i35;
        char charAt9;
        int i36;
        char charAt10;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        if (n4Var.c() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String d10 = n4Var.d();
        int length = d10.length();
        char c10 = 55296;
        if (d10.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i6 = i39 + 1;
                if (d10.charAt(i39) < 55296) {
                    break;
                }
                i39 = i6;
            }
        } else {
            i6 = 1;
        }
        int i40 = i6 + 1;
        int charAt13 = d10.charAt(i6);
        if (charAt13 >= 55296) {
            int i41 = charAt13 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                charAt12 = d10.charAt(i40);
                if (charAt12 < 55296) {
                    break;
                }
                i41 |= (charAt12 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            charAt13 = i41 | (charAt12 << i42);
            i40 = i38;
        }
        if (charAt13 == 0) {
            iArr = f7529l;
            i11 = 0;
            charAt = 0;
            i13 = 0;
            i12 = 0;
            i10 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt14 = d10.charAt(i40);
            if (charAt14 >= 55296) {
                int i44 = charAt14 & 8191;
                int i45 = 13;
                while (true) {
                    i21 = i43 + 1;
                    charAt7 = d10.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i21;
                }
                charAt14 = i44 | (charAt7 << i45);
                i43 = i21;
            }
            int i46 = i43 + 1;
            int charAt15 = d10.charAt(i43);
            if (charAt15 >= 55296) {
                int i47 = charAt15 & 8191;
                int i48 = 13;
                while (true) {
                    i20 = i46 + 1;
                    charAt6 = d10.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i20;
                }
                charAt15 = i47 | (charAt6 << i48);
                i46 = i20;
            }
            int i49 = i46 + 1;
            if (d10.charAt(i46) >= 55296) {
                while (true) {
                    i19 = i49 + 1;
                    if (d10.charAt(i49) < 55296) {
                        break;
                    }
                    i49 = i19;
                }
                i49 = i19;
            }
            int i50 = i49 + 1;
            if (d10.charAt(i49) >= 55296) {
                while (true) {
                    i18 = i50 + 1;
                    if (d10.charAt(i50) < 55296) {
                        break;
                    }
                    i50 = i18;
                }
                i50 = i18;
            }
            int i51 = i50 + 1;
            charAt = d10.charAt(i50);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    charAt5 = d10.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                charAt = i52 | (charAt5 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            int charAt16 = d10.charAt(i51);
            if (charAt16 >= 55296) {
                int i55 = charAt16 & 8191;
                int i56 = 13;
                while (true) {
                    i16 = i54 + 1;
                    charAt4 = d10.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i16;
                }
                charAt16 = i55 | (charAt4 << i56);
                i54 = i16;
            }
            int i57 = i54 + 1;
            int charAt17 = d10.charAt(i54);
            if (charAt17 >= 55296) {
                int i58 = charAt17 & 8191;
                int i59 = 13;
                while (true) {
                    i15 = i57 + 1;
                    charAt3 = d10.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i15;
                }
                charAt17 = i58 | (charAt3 << i59);
                i57 = i15;
            }
            int i60 = i57 + 1;
            int charAt18 = d10.charAt(i57);
            if (charAt18 >= 55296) {
                int i61 = charAt18 & 8191;
                int i62 = 13;
                while (true) {
                    i14 = i60 + 1;
                    charAt2 = d10.charAt(i60);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i61 |= (charAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i14;
                }
                charAt18 = i61 | (charAt2 << i62);
                i60 = i14;
            }
            iArr = new int[charAt18 + charAt16 + charAt17];
            i10 = charAt14 + charAt14 + charAt15;
            i11 = charAt14;
            i40 = i60;
            int i63 = charAt18;
            i12 = charAt16;
            i13 = i63;
        }
        Object[] e10 = n4Var.e();
        Class<?> cls = n4Var.b().getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[charAt + charAt];
        int i64 = i12 + i13;
        int i65 = i13;
        int i66 = i64;
        int i67 = 0;
        int i68 = 0;
        while (i40 < length) {
            int i69 = i40 + 1;
            int charAt19 = d10.charAt(i40);
            if (charAt19 >= c10) {
                int i70 = charAt19 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i37 = i71 + 1;
                    charAt11 = d10.charAt(i71);
                    if (charAt11 < c10) {
                        break;
                    }
                    i70 |= (charAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i37;
                }
                charAt19 = i70 | (charAt11 << i72);
                i22 = i37;
            } else {
                i22 = i69;
            }
            int i73 = i22 + 1;
            int charAt20 = d10.charAt(i22);
            if (charAt20 >= c10) {
                int i74 = charAt20 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i36 = i75 + 1;
                    charAt10 = d10.charAt(i75);
                    if (charAt10 < c10) {
                        break;
                    }
                    i74 |= (charAt10 & 8191) << i76;
                    i76 += 13;
                    i75 = i36;
                }
                charAt20 = i74 | (charAt10 << i76);
                i23 = i36;
            } else {
                i23 = i73;
            }
            int i77 = charAt20 & 255;
            int i78 = length;
            if ((charAt20 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            Unsafe unsafe = f7530m;
            int i79 = i64;
            if (i77 >= 51) {
                int i80 = i23 + 1;
                int charAt21 = d10.charAt(i23);
                if (charAt21 >= 55296) {
                    int i81 = charAt21 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i35 = i82 + 1;
                        charAt9 = d10.charAt(i82);
                        i25 = i13;
                        if (charAt9 < 55296) {
                            break;
                        }
                        i81 |= (charAt9 & 8191) << i83;
                        i83 += 13;
                        i82 = i35;
                        i13 = i25;
                    }
                    charAt21 = i81 | (charAt9 << i83);
                    i33 = i35;
                } else {
                    i25 = i13;
                    i33 = i80;
                }
                int i84 = i77 - 51;
                int i85 = i33;
                if (i84 != 9 && i84 != 17) {
                    if (i84 == 12 && !z10) {
                        int i86 = i68 / 3;
                        i34 = i10 + 1;
                        objArr[i86 + i86 + 1] = e10[i10];
                    }
                    int i87 = charAt21 + charAt21;
                    obj = e10[i87];
                    if (!(obj instanceof Field)) {
                        p11 = (Field) obj;
                    } else {
                        p11 = p(cls, (String) obj);
                        e10[i87] = p11;
                    }
                    iArr2 = iArr4;
                    i24 = charAt19;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(p11);
                    int i88 = i87 + 1;
                    obj2 = e10[i88];
                    if (!(obj2 instanceof Field)) {
                        p12 = (Field) obj2;
                    } else {
                        p12 = p(cls, (String) obj2);
                        e10[i88] = p12;
                    }
                    i27 = (int) unsafe.objectFieldOffset(p12);
                    str = d10;
                    i26 = i10;
                    i28 = i85;
                    i29 = 0;
                    iArr3 = iArr;
                } else {
                    int i89 = i68 / 3;
                    i34 = i10 + 1;
                    objArr[i89 + i89 + 1] = e10[i10];
                }
                i10 = i34;
                int i872 = charAt21 + charAt21;
                obj = e10[i872];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr4;
                i24 = charAt19;
                objectFieldOffset = (int) unsafe.objectFieldOffset(p11);
                int i882 = i872 + 1;
                obj2 = e10[i882];
                if (!(obj2 instanceof Field)) {
                }
                i27 = (int) unsafe.objectFieldOffset(p12);
                str = d10;
                i26 = i10;
                i28 = i85;
                i29 = 0;
                iArr3 = iArr;
            } else {
                iArr2 = iArr4;
                i24 = charAt19;
                i25 = i13;
                int i90 = i10 + 1;
                Field p13 = p(cls, (String) e10[i10]);
                if (i77 != 9 && i77 != 17) {
                    if (i77 != 27 && i77 != 49) {
                        if (i77 != 12 && i77 != 30 && i77 != 44) {
                            if (i77 == 50) {
                                int i91 = i65 + 1;
                                iArr[i65] = i68;
                                int i92 = i68 / 3;
                                int i93 = i92 + i92;
                                int i94 = i90 + 1;
                                objArr[i93] = e10[i90];
                                if ((charAt20 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0) {
                                    i90 = i94 + 1;
                                    objArr[i93 + 1] = e10[i94];
                                } else {
                                    i90 = i94;
                                }
                                i65 = i91;
                            }
                        } else if (!z10) {
                            int i95 = i68 / 3;
                            objArr[i95 + i95 + 1] = e10[i90];
                            i90++;
                        }
                    } else {
                        int i96 = i68 / 3;
                        objArr[i96 + i96 + 1] = e10[i90];
                        i90++;
                    }
                } else {
                    int i97 = i68 / 3;
                    objArr[i97 + i97 + 1] = p13.getType();
                }
                iArr3 = iArr;
                objectFieldOffset = (int) unsafe.objectFieldOffset(p13);
                if ((charAt20 & 4096) == 4096 && i77 <= 17) {
                    i28 = i23 + 1;
                    int charAt22 = d10.charAt(i23);
                    if (charAt22 >= 55296) {
                        int i98 = charAt22 & 8191;
                        int i99 = 13;
                        while (true) {
                            i30 = i28 + 1;
                            charAt8 = d10.charAt(i28);
                            if (charAt8 < 55296) {
                                break;
                            }
                            i98 |= (charAt8 & 8191) << i99;
                            i99 += 13;
                            i28 = i30;
                        }
                        charAt22 = i98 | (charAt8 << i99);
                        i28 = i30;
                    }
                    int i100 = (charAt22 / 32) + i11 + i11;
                    Object obj3 = e10[i100];
                    str = d10;
                    if (obj3 instanceof Field) {
                        p10 = (Field) obj3;
                    } else {
                        p10 = p(cls, (String) obj3);
                        e10[i100] = p10;
                    }
                    i26 = i90;
                    i29 = charAt22 % 32;
                    i27 = (int) unsafe.objectFieldOffset(p10);
                } else {
                    str = d10;
                    i26 = i90;
                    i27 = 1048575;
                    i28 = i23;
                    i29 = 0;
                }
                if (i77 >= 18 && i77 <= 49) {
                    iArr3[i66] = objectFieldOffset;
                    i66++;
                }
            }
            int i101 = i68 + 1;
            iArr2[i68] = i24;
            int i102 = i101 + 1;
            int i103 = i26;
            if ((charAt20 & 512) != 0) {
                i31 = 536870912;
            } else {
                i31 = 0;
            }
            if ((charAt20 & 256) != 0) {
                i32 = 268435456;
            } else {
                i32 = 0;
            }
            iArr2[i101] = i31 | i32 | (i77 << 20) | objectFieldOffset;
            int i104 = i102 + 1;
            iArr2[i102] = (i29 << 20) | i27;
            i40 = i28;
            iArr4 = iArr2;
            iArr = iArr3;
            i10 = i103;
            length = i78;
            i64 = i79;
            i13 = i25;
            c10 = 55296;
            i68 = i104;
            d10 = str;
        }
        return new g4(iArr4, objArr, n4Var.b(), z10, iArr, i13, i64, r3Var, y4Var, t2Var, y3Var);
    }

    public static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            throw new RuntimeException(r1.b0.b(sb2, " not found. Known fields are ", arrays));
        }
    }

    public static int w(long j10, Object obj) {
        return ((Integer) i5.l(j10, obj)).intValue();
    }

    public static long x(long j10, Object obj) {
        return ((Long) i5.l(j10, obj)).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.o4
    public final boolean a(T t3) {
        boolean z10;
        int i6 = 0;
        int i10 = 1048575;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i6 < this.f7536g) {
                int i12 = this.f[i6];
                int[] iArr = this.f7531a;
                int i13 = iArr[i12];
                int v10 = v(i12);
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                int i16 = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    if (i15 != 1048575) {
                        i11 = f7530m.getInt(t3, i15);
                    }
                    i10 = i15;
                }
                if ((268435456 & v10) != 0) {
                    if (i10 == 1048575) {
                        z10 = h(i12, t3);
                    } else if ((i11 & i16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                int i17 = (v10 >>> 20) & 255;
                if (i17 != 9 && i17 != 17) {
                    if (i17 != 27) {
                        if (i17 != 60 && i17 != 68) {
                            if (i17 != 49) {
                                if (i17 == 50 && !((x3) i5.l(v10 & 1048575, t3)).isEmpty()) {
                                    int i18 = i12 / 3;
                                    w3 w3Var = (w3) this.f7532b[i18 + i18];
                                    throw null;
                                }
                            }
                        } else if (j(i13, i12, t3) && !u(i12).a(i5.l(v10 & 1048575, t3))) {
                            return false;
                        }
                    }
                    List list = (List) i5.l(v10 & 1048575, t3);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        o4 u10 = u(i12);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (!u10.a(list.get(i19))) {
                                return false;
                            }
                        }
                        continue;
                    }
                } else {
                    if (i10 == 1048575) {
                        z11 = h(i12, t3);
                    } else if ((i11 & i16) == 0) {
                        z11 = false;
                    }
                    if (z11 && !u(i12).a(i5.l(v10 & 1048575, t3))) {
                        return false;
                    }
                }
                i6++;
            } else if (!this.f7534d) {
                return true;
            } else {
                this.f7540k.b(t3);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f1, code lost:
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f4, code lost:
        r8 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f6, code lost:
        r4 = r8;
     */
    @Override // com.google.android.gms.internal.cast.o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(T t3) {
        int i6;
        int a10;
        int hashCode;
        int[] iArr = this.f7531a;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int v10 = v(i11);
            int i12 = iArr[i11];
            long j10 = 1048575 & v10;
            int i13 = 1231;
            switch ((v10 >>> 20) & 255) {
                case 0:
                    i6 = i10 * 53;
                    a10 = k3.a(Double.doubleToLongBits(i5.k(j10, t3)));
                    i10 = a10 + i6;
                    break;
                case 1:
                    i6 = i10 * 53;
                    a10 = Float.floatToIntBits(i5.j(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 2:
                    i6 = i10 * 53;
                    a10 = k3.a(i5.h(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 3:
                    i6 = i10 * 53;
                    a10 = k3.a(i5.h(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 4:
                    i6 = i10 * 53;
                    a10 = i5.f(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 5:
                    i6 = i10 * 53;
                    a10 = k3.a(i5.h(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 6:
                    i6 = i10 * 53;
                    a10 = i5.f(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 7:
                    i6 = i10 * 53;
                    boolean i14 = i5.i(j10, t3);
                    Charset charset = k3.f7570a;
                    break;
                case 8:
                    i6 = i10 * 53;
                    a10 = ((String) i5.l(j10, t3)).hashCode();
                    i10 = a10 + i6;
                    break;
                case 9:
                    Object l2 = i5.l(j10, t3);
                    if (l2 != null) {
                        hashCode = l2.hashCode();
                        i10 = (i10 * 53) + hashCode;
                        break;
                    }
                    hashCode = 37;
                    i10 = (i10 * 53) + hashCode;
                case 10:
                    i6 = i10 * 53;
                    a10 = i5.l(j10, t3).hashCode();
                    i10 = a10 + i6;
                    break;
                case 11:
                    i6 = i10 * 53;
                    a10 = i5.f(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 12:
                    i6 = i10 * 53;
                    a10 = i5.f(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 13:
                    i6 = i10 * 53;
                    a10 = i5.f(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 14:
                    i6 = i10 * 53;
                    a10 = k3.a(i5.h(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 15:
                    i6 = i10 * 53;
                    a10 = i5.f(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 16:
                    i6 = i10 * 53;
                    a10 = k3.a(i5.h(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 17:
                    Object l10 = i5.l(j10, t3);
                    if (l10 != null) {
                        hashCode = l10.hashCode();
                        i10 = (i10 * 53) + hashCode;
                        break;
                    }
                    hashCode = 37;
                    i10 = (i10 * 53) + hashCode;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i6 = i10 * 53;
                    a10 = i5.l(j10, t3).hashCode();
                    i10 = a10 + i6;
                    break;
                case 50:
                    i6 = i10 * 53;
                    a10 = i5.l(j10, t3).hashCode();
                    i10 = a10 + i6;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = k3.a(Double.doubleToLongBits(((Double) i5.l(j10, t3)).doubleValue()));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = Float.floatToIntBits(((Float) i5.l(j10, t3)).floatValue());
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = k3.a(x(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = k3.a(x(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = w(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = k3.a(x(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = w(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        boolean booleanValue = ((Boolean) i5.l(j10, t3)).booleanValue();
                        Charset charset2 = k3.f7570a;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = ((String) i5.l(j10, t3)).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = i5.l(j10, t3).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = i5.l(j10, t3).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = w(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = w(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = w(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = k3.a(x(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = w(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = k3.a(x(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (j(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = i5.l(j10, t3).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f7539j.b(t3).getClass();
        int i15 = 506991 + (i10 * 53);
        if (!this.f7534d) {
            return i15;
        }
        this.f7540k.b(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final void c(T t3, T t10) {
        t10.getClass();
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7531a;
            if (i6 < iArr.length) {
                int v10 = v(i6);
                long j10 = 1048575 & v10;
                int i10 = iArr[i6];
                switch ((v10 >>> 20) & 255) {
                    case 0:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            double k10 = i5.k(j10, t10);
                            g5 g5Var = i5.f7557c;
                            switch (g5Var.f7541b) {
                                case 0:
                                    g5Var.g(t3, j10, Double.doubleToLongBits(k10));
                                    break;
                                default:
                                    g5Var.g(t3, j10, Double.doubleToLongBits(k10));
                                    break;
                            }
                            i(i6, t3);
                            break;
                        }
                    case 1:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            float j11 = i5.j(j10, t10);
                            g5 g5Var2 = i5.f7557c;
                            switch (g5Var2.f7541b) {
                                case 0:
                                    g5Var2.e(Float.floatToIntBits(j11), j10, t3);
                                    break;
                                default:
                                    g5Var2.e(Float.floatToIntBits(j11), j10, t3);
                                    break;
                            }
                            i(i6, t3);
                            break;
                        }
                    case 2:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.f7557c.g(t3, j10, i5.h(j10, t10));
                            i(i6, t3);
                            break;
                        }
                    case 3:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.f7557c.g(t3, j10, i5.h(j10, t10));
                            i(i6, t3);
                            break;
                        }
                    case 4:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.g(i5.f(j10, t10), j10, t3);
                            i(i6, t3);
                            break;
                        }
                    case 5:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.f7557c.g(t3, j10, i5.h(j10, t10));
                            i(i6, t3);
                            break;
                        }
                    case 6:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.g(i5.f(j10, t10), j10, t3);
                            i(i6, t3);
                            break;
                        }
                    case 7:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            boolean i11 = i5.i(j10, t10);
                            int i12 = i5.f7557c.f7541b;
                            boolean z10 = i5.f7560g;
                            switch (i12) {
                                case 0:
                                    if (z10) {
                                        i5.c(t3, j10, i11 ? (byte) 1 : (byte) 0);
                                        break;
                                    } else {
                                        i5.d(t3, j10, i11 ? (byte) 1 : (byte) 0);
                                        break;
                                    }
                                default:
                                    if (z10) {
                                        i5.c(t3, j10, i11 ? (byte) 1 : (byte) 0);
                                        break;
                                    } else {
                                        i5.d(t3, j10, i11 ? (byte) 1 : (byte) 0);
                                        break;
                                    }
                            }
                            i(i6, t3);
                            break;
                        }
                    case 8:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.m(j10, t3, i5.l(j10, t10));
                            i(i6, t3);
                            break;
                        }
                    case 9:
                        q(t3, i6, t10);
                        break;
                    case 10:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.m(j10, t3, i5.l(j10, t10));
                            i(i6, t3);
                            break;
                        }
                    case 11:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.g(i5.f(j10, t10), j10, t3);
                            i(i6, t3);
                            break;
                        }
                    case 12:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.g(i5.f(j10, t10), j10, t3);
                            i(i6, t3);
                            break;
                        }
                    case 13:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.g(i5.f(j10, t10), j10, t3);
                            i(i6, t3);
                            break;
                        }
                    case 14:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.f7557c.g(t3, j10, i5.h(j10, t10));
                            i(i6, t3);
                            break;
                        }
                    case 15:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.g(i5.f(j10, t10), j10, t3);
                            i(i6, t3);
                            break;
                        }
                    case 16:
                        if (!h(i6, t10)) {
                            break;
                        } else {
                            i5.f7557c.g(t3, j10, i5.h(j10, t10));
                            i(i6, t3);
                            break;
                        }
                    case 17:
                        q(t3, i6, t10);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case 32:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case 36:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        this.f7538i.b(j10, t3, t10);
                        break;
                    case 50:
                        Class<?> cls = p4.f7621a;
                        x3 x3Var = (x3) i5.l(j10, t3);
                        x3 x3Var2 = (x3) i5.l(j10, t10);
                        if (!x3Var2.isEmpty()) {
                            if (!x3Var.f7682u) {
                                if (x3Var.isEmpty()) {
                                    x3Var = new x3();
                                } else {
                                    x3Var = new x3(x3Var);
                                }
                            }
                            x3Var.b();
                            if (!x3Var2.isEmpty()) {
                                x3Var.putAll(x3Var2);
                            }
                        }
                        i5.m(j10, t3, x3Var);
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!j(i10, i6, t10)) {
                            break;
                        } else {
                            i5.m(j10, t3, i5.l(j10, t10));
                            k(i10, i6, t3);
                            break;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        r(t3, i6, t10);
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!j(i10, i6, t10)) {
                            break;
                        } else {
                            i5.m(j10, t3, i5.l(j10, t10));
                            k(i10, i6, t3);
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        r(t3, i6, t10);
                        break;
                }
                i6 += 3;
            } else {
                Class<?> cls2 = p4.f7621a;
                y4<?, ?> y4Var = this.f7539j;
                y4Var.a(t3, y4Var.d(y4Var.b(t3), y4Var.b(t10)));
                if (!this.f7534d) {
                    return;
                }
                this.f7540k.b(t10);
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final int d(T t3) {
        if (this.f7535e) {
            return t(t3);
        }
        return s(t3);
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final void e(T t3, r2 r2Var) {
        if (this.f7535e) {
            if (!this.f7534d) {
                int[] iArr = this.f7531a;
                int length = iArr.length;
                for (int i6 = 0; i6 < length; i6 += 3) {
                    int v10 = v(i6);
                    int i10 = iArr[i6];
                    switch ((v10 >>> 20) & 255) {
                        case 0:
                            if (h(i6, t3)) {
                                r2Var.e(i5.k(v10 & 1048575, t3), i10);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (h(i6, t3)) {
                                r2Var.d(i5.j(v10 & 1048575, t3), i10);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (h(i6, t3)) {
                                r2Var.b(i10, i5.h(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (h(i6, t3)) {
                                r2Var.g(i10, i5.h(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (h(i6, t3)) {
                                r2Var.h(i10, i5.f(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (h(i6, t3)) {
                                r2Var.i(i10, i5.h(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (h(i6, t3)) {
                                r2Var.j(i10, i5.f(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (h(i6, t3)) {
                                r2Var.k(i10, i5.i(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (h(i6, t3)) {
                                m(i10, i5.l(v10 & 1048575, t3), r2Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (h(i6, t3)) {
                                r2Var.p(i10, u(i6), i5.l(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (h(i6, t3)) {
                                r2Var.l(i10, (n2) i5.l(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (h(i6, t3)) {
                                r2Var.m(i10, i5.f(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (h(i6, t3)) {
                                r2Var.f(i10, i5.f(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (h(i6, t3)) {
                                r2Var.a(i10, i5.f(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (h(i6, t3)) {
                                r2Var.c(i10, i5.h(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (h(i6, t3)) {
                                r2Var.n(i10, i5.f(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (h(i6, t3)) {
                                r2Var.o(i10, i5.h(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (h(i6, t3)) {
                                r2Var.q(i10, u(i6), i5.l(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            p4.b(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 19:
                            p4.c(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 20:
                            p4.d(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 21:
                            p4.e(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 22:
                            p4.i(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 23:
                            p4.g(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 24:
                            p4.l(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 25:
                            p4.o(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 26:
                            p4.p(i10, (List) i5.l(v10 & 1048575, t3), r2Var);
                            break;
                        case 27:
                            p4.r(i10, (List) i5.l(v10 & 1048575, t3), r2Var, u(i6));
                            break;
                        case 28:
                            p4.q(i10, (List) i5.l(v10 & 1048575, t3), r2Var);
                            break;
                        case 29:
                            p4.j(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            p4.n(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            p4.m(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case 32:
                            p4.h(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            p4.k(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            p4.f(i10, (List) i5.l(v10 & 1048575, t3), r2Var, false);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            p4.b(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case 36:
                            p4.c(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            p4.d(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            p4.e(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            p4.i(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            p4.g(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            p4.l(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            p4.o(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            p4.j(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            p4.n(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            p4.m(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            p4.h(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            p4.k(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            p4.f(i10, (List) i5.l(v10 & 1048575, t3), r2Var, true);
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            p4.s(i10, (List) i5.l(v10 & 1048575, t3), r2Var, u(i6));
                            break;
                        case 50:
                            if (i5.l(v10 & 1048575, t3) != null) {
                                int i11 = i6 / 3;
                                w3 w3Var = (w3) this.f7532b[i11 + i11];
                                throw null;
                            }
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            if (j(i10, i6, t3)) {
                                r2Var.e(((Double) i5.l(v10 & 1048575, t3)).doubleValue(), i10);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            if (j(i10, i6, t3)) {
                                r2Var.d(((Float) i5.l(v10 & 1048575, t3)).floatValue(), i10);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            if (j(i10, i6, t3)) {
                                r2Var.b(i10, x(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            if (j(i10, i6, t3)) {
                                r2Var.g(i10, x(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            if (j(i10, i6, t3)) {
                                r2Var.h(i10, w(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            if (j(i10, i6, t3)) {
                                r2Var.i(i10, x(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            if (j(i10, i6, t3)) {
                                r2Var.j(i10, w(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            if (j(i10, i6, t3)) {
                                r2Var.k(i10, ((Boolean) i5.l(v10 & 1048575, t3)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            if (j(i10, i6, t3)) {
                                m(i10, i5.l(v10 & 1048575, t3), r2Var);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            if (j(i10, i6, t3)) {
                                r2Var.p(i10, u(i6), i5.l(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            if (j(i10, i6, t3)) {
                                r2Var.l(i10, (n2) i5.l(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            if (j(i10, i6, t3)) {
                                r2Var.m(i10, w(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            if (j(i10, i6, t3)) {
                                r2Var.f(i10, w(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            if (j(i10, i6, t3)) {
                                r2Var.a(i10, w(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            if (j(i10, i6, t3)) {
                                r2Var.c(i10, x(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            if (j(i10, i6, t3)) {
                                r2Var.n(i10, w(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            if (j(i10, i6, t3)) {
                                r2Var.o(i10, x(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            if (j(i10, i6, t3)) {
                                r2Var.q(i10, u(i6), i5.l(v10 & 1048575, t3));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                y4<?, ?> y4Var = this.f7539j;
                y4Var.b(t3);
                y4Var.g();
                return;
            }
            this.f7540k.b(t3);
            throw null;
        }
        l(t3, r2Var);
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final void f(c3 c3Var) {
        int[] iArr;
        int i6;
        int i10 = this.f7536g;
        while (true) {
            iArr = this.f;
            i6 = this.f7537h;
            if (i10 >= i6) {
                break;
            }
            long v10 = v(iArr[i10]) & 1048575;
            Object l2 = i5.l(v10, c3Var);
            if (l2 != null) {
                ((x3) l2).f7682u = false;
                i5.m(v10, c3Var, l2);
            }
            i10++;
        }
        int length = iArr.length;
        while (i6 < length) {
            this.f7538i.a(iArr[i6], c3Var);
            i6++;
        }
        this.f7539j.c(c3Var);
        if (this.f7534d) {
            this.f7540k.c(c3Var);
        }
    }

    @Override // com.google.android.gms.internal.cast.o4
    public final boolean g(T t3, T t10) {
        boolean a10;
        int[] iArr = this.f7531a;
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int v10 = v(i6);
            long j10 = v10 & 1048575;
            switch ((v10 >>> 20) & 255) {
                case 0:
                    if (y(t3, i6, t10) && Double.doubleToLongBits(i5.k(j10, t3)) == Double.doubleToLongBits(i5.k(j10, t10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (y(t3, i6, t10) && Float.floatToIntBits(i5.j(j10, t3)) == Float.floatToIntBits(i5.j(j10, t10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (y(t3, i6, t10) && i5.h(j10, t3) == i5.h(j10, t10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (y(t3, i6, t10) && i5.h(j10, t3) == i5.h(j10, t10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (y(t3, i6, t10) && i5.f(j10, t3) == i5.f(j10, t10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (y(t3, i6, t10) && i5.h(j10, t3) == i5.h(j10, t10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (y(t3, i6, t10) && i5.f(j10, t3) == i5.f(j10, t10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (y(t3, i6, t10) && i5.i(j10, t3) == i5.i(j10, t10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (y(t3, i6, t10) && p4.a(i5.l(j10, t3), i5.l(j10, t10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (y(t3, i6, t10) && p4.a(i5.l(j10, t3), i5.l(j10, t10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (y(t3, i6, t10) && p4.a(i5.l(j10, t3), i5.l(j10, t10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (y(t3, i6, t10) && i5.f(j10, t3) == i5.f(j10, t10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (y(t3, i6, t10) && i5.f(j10, t3) == i5.f(j10, t10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (y(t3, i6, t10) && i5.f(j10, t3) == i5.f(j10, t10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (y(t3, i6, t10) && i5.h(j10, t3) == i5.h(j10, t10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (y(t3, i6, t10) && i5.f(j10, t3) == i5.f(j10, t10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (y(t3, i6, t10) && i5.h(j10, t3) == i5.h(j10, t10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (y(t3, i6, t10) && p4.a(i5.l(j10, t3), i5.l(j10, t10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    a10 = p4.a(i5.l(j10, t3), i5.l(j10, t10));
                    break;
                case 50:
                    a10 = p4.a(i5.l(j10, t3), i5.l(j10, t10));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long j11 = iArr[i6 + 2] & 1048575;
                    if (i5.f(j11, t3) == i5.f(j11, t10) && p4.a(i5.l(j10, t3), i5.l(j10, t10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!a10) {
                return false;
            }
        }
        y4<?, ?> y4Var = this.f7539j;
        if (!y4Var.b(t3).equals(y4Var.b(t10))) {
            return false;
        }
        if (!this.f7534d) {
            return true;
        }
        t2<?> t2Var = this.f7540k;
        t2Var.b(t3);
        t2Var.b(t10);
        throw null;
    }

    public final boolean h(int i6, Object obj) {
        int i10 = this.f7531a[i6 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int v10 = v(i6);
            long j11 = v10 & 1048575;
            switch ((v10 >>> 20) & 255) {
                case 0:
                    if (i5.k(j11, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (i5.j(j11, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (i5.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (i5.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (i5.f(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (i5.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (i5.f(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return i5.i(j11, obj);
                case 8:
                    Object l2 = i5.l(j11, obj);
                    if (l2 instanceof String) {
                        if (((String) l2).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (l2 instanceof n2) {
                        if (n2.f7604v.equals(l2)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (i5.l(j11, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (n2.f7604v.equals(i5.l(j11, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (i5.f(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (i5.f(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (i5.f(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (i5.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (i5.f(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (i5.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (i5.l(j11, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((i5.f(j10, obj) & (1 << (i10 >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final void i(int i6, Object obj) {
        int i10 = this.f7531a[i6 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        i5.g((1 << (i10 >>> 20)) | i5.f(j10, obj), j10, obj);
    }

    public final boolean j(int i6, int i10, Object obj) {
        if (i5.f(this.f7531a[i10 + 2] & 1048575, obj) == i6) {
            return true;
        }
        return false;
    }

    public final void k(int i6, int i10, Object obj) {
        i5.g(i6, this.f7531a[i10 + 2] & 1048575, obj);
    }

    public final void l(T t3, r2 r2Var) {
        int i6;
        if (!this.f7534d) {
            int[] iArr = this.f7531a;
            int length = iArr.length;
            int i10 = 1048575;
            int i11 = 0;
            int i12 = 1048575;
            int i13 = 0;
            while (i11 < length) {
                int v10 = v(i11);
                int i14 = iArr[i11];
                int i15 = (v10 >>> 20) & 255;
                Unsafe unsafe = f7530m;
                if (i15 <= 17) {
                    int i16 = iArr[i11 + 2];
                    int i17 = i16 & i10;
                    if (i17 != i12) {
                        i13 = unsafe.getInt(t3, i17);
                        i12 = i17;
                    }
                    i6 = 1 << (i16 >>> 20);
                } else {
                    i6 = 0;
                }
                long j10 = v10 & i10;
                switch (i15) {
                    case 0:
                        if ((i6 & i13) != 0) {
                            r2Var.e(i5.k(j10, t3), i14);
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 1:
                        if ((i6 & i13) != 0) {
                            r2Var.d(i5.j(j10, t3), i14);
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 2:
                        if ((i6 & i13) != 0) {
                            r2Var.b(i14, unsafe.getLong(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 3:
                        if ((i6 & i13) != 0) {
                            r2Var.g(i14, unsafe.getLong(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 4:
                        if ((i6 & i13) != 0) {
                            r2Var.h(i14, unsafe.getInt(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 5:
                        if ((i6 & i13) != 0) {
                            r2Var.i(i14, unsafe.getLong(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 6:
                        if ((i6 & i13) != 0) {
                            r2Var.j(i14, unsafe.getInt(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 7:
                        if ((i6 & i13) != 0) {
                            r2Var.k(i14, i5.i(j10, t3));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 8:
                        if ((i6 & i13) != 0) {
                            m(i14, unsafe.getObject(t3, j10), r2Var);
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 9:
                        if ((i6 & i13) != 0) {
                            r2Var.p(i14, u(i11), unsafe.getObject(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 10:
                        if ((i6 & i13) != 0) {
                            r2Var.l(i14, (n2) unsafe.getObject(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 11:
                        if ((i6 & i13) != 0) {
                            r2Var.m(i14, unsafe.getInt(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 12:
                        if ((i6 & i13) != 0) {
                            r2Var.f(i14, unsafe.getInt(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 13:
                        if ((i6 & i13) != 0) {
                            r2Var.a(i14, unsafe.getInt(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 14:
                        if ((i6 & i13) != 0) {
                            r2Var.c(i14, unsafe.getLong(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 15:
                        if ((i6 & i13) != 0) {
                            r2Var.n(i14, unsafe.getInt(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 16:
                        if ((i6 & i13) != 0) {
                            r2Var.o(i14, unsafe.getLong(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 17:
                        if ((i6 & i13) != 0) {
                            r2Var.q(i14, u(i11), unsafe.getObject(t3, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 18:
                        p4.b(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 19:
                        p4.c(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 20:
                        p4.d(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 21:
                        p4.e(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 22:
                        p4.i(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 23:
                        p4.g(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 24:
                        p4.l(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 25:
                        p4.o(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 26:
                        p4.p(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var);
                        break;
                    case 27:
                        p4.r(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, u(i11));
                        break;
                    case 28:
                        p4.q(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var);
                        break;
                    case 29:
                        p4.j(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        p4.n(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        p4.m(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        break;
                    case 32:
                        p4.h(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        p4.k(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        p4.f(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, false);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        p4.b(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case 36:
                        p4.c(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        p4.d(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        p4.e(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        p4.i(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        p4.g(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        p4.l(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        p4.o(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        p4.j(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        p4.n(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        p4.m(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        p4.h(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        p4.k(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        p4.f(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, true);
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        p4.s(iArr[i11], (List) unsafe.getObject(t3, j10), r2Var, u(i11));
                        break;
                    case 50:
                        if (unsafe.getObject(t3, j10) != null) {
                            int i18 = i11 / 3;
                            w3 w3Var = (w3) this.f7532b[i18 + i18];
                            throw null;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (j(i14, i11, t3)) {
                            r2Var.e(((Double) i5.l(j10, t3)).doubleValue(), i14);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (j(i14, i11, t3)) {
                            r2Var.d(((Float) i5.l(j10, t3)).floatValue(), i14);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (j(i14, i11, t3)) {
                            r2Var.b(i14, x(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (j(i14, i11, t3)) {
                            r2Var.g(i14, x(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (j(i14, i11, t3)) {
                            r2Var.h(i14, w(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (j(i14, i11, t3)) {
                            r2Var.i(i14, x(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (j(i14, i11, t3)) {
                            r2Var.j(i14, w(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (j(i14, i11, t3)) {
                            r2Var.k(i14, ((Boolean) i5.l(j10, t3)).booleanValue());
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (j(i14, i11, t3)) {
                            m(i14, unsafe.getObject(t3, j10), r2Var);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (j(i14, i11, t3)) {
                            r2Var.p(i14, u(i11), unsafe.getObject(t3, j10));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (j(i14, i11, t3)) {
                            r2Var.l(i14, (n2) unsafe.getObject(t3, j10));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (j(i14, i11, t3)) {
                            r2Var.m(i14, w(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (j(i14, i11, t3)) {
                            r2Var.f(i14, w(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (j(i14, i11, t3)) {
                            r2Var.a(i14, w(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (j(i14, i11, t3)) {
                            r2Var.c(i14, x(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (j(i14, i11, t3)) {
                            r2Var.n(i14, w(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (j(i14, i11, t3)) {
                            r2Var.o(i14, x(j10, t3));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (j(i14, i11, t3)) {
                            r2Var.q(i14, u(i11), unsafe.getObject(t3, j10));
                            break;
                        }
                        break;
                }
                i11 += 3;
                i10 = 1048575;
            }
            y4<?, ?> y4Var = this.f7539j;
            y4Var.b(t3);
            y4Var.g();
            return;
        }
        this.f7540k.b(t3);
        throw null;
    }

    public final void q(Object obj, int i6, Object obj2) {
        long v10 = v(i6) & 1048575;
        if (!h(i6, obj2)) {
            return;
        }
        Object l2 = i5.l(v10, obj);
        Object l10 = i5.l(v10, obj2);
        if (l2 != null && l10 != null) {
            i5.m(v10, obj, k3.b(l2, l10));
            i(i6, obj);
        } else if (l10 != null) {
            i5.m(v10, obj, l10);
            i(i6, obj);
        }
    }

    public final void r(Object obj, int i6, Object obj2) {
        Object obj3;
        int v10 = v(i6);
        int i10 = this.f7531a[i6];
        long j10 = v10 & 1048575;
        if (!j(i10, i6, obj2)) {
            return;
        }
        if (j(i10, i6, obj)) {
            obj3 = i5.l(j10, obj);
        } else {
            obj3 = null;
        }
        Object l2 = i5.l(j10, obj2);
        if (obj3 != null && l2 != null) {
            i5.m(j10, obj, k3.b(obj3, l2));
            k(i10, i6, obj);
        } else if (l2 != null) {
            i5.m(j10, obj, l2);
            k(i10, i6, obj);
        }
    }

    public final int s(T t3) {
        int i6;
        int o02;
        int o03;
        int o04;
        int p02;
        int o05;
        int n02;
        int o06;
        int o07;
        int m10;
        int o08;
        int P;
        int K;
        int m02;
        int o09;
        int i10;
        int o010;
        int m11;
        int o011;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f7531a;
            if (i12 < iArr.length) {
                int v10 = v(i12);
                int i16 = iArr[i12];
                int i17 = (v10 >>> 20) & 255;
                Unsafe unsafe = f7530m;
                if (i17 <= 17) {
                    int i18 = iArr[i12 + 2];
                    int i19 = i18 & i11;
                    i6 = 1 << (i18 >>> 20);
                    if (i19 != i14) {
                        i15 = unsafe.getInt(t3, i19);
                        i14 = i19;
                    }
                } else {
                    i6 = 0;
                }
                long j10 = v10 & i11;
                switch (i17) {
                    case 0:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            o02 = q2.o0(i16 << 3);
                            P = o02 + 8;
                            i13 += P;
                            break;
                        }
                    case 1:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            o03 = q2.o0(i16 << 3);
                            P = o03 + 4;
                            i13 += P;
                            break;
                        }
                    case 2:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j11 = unsafe.getLong(t3, j10);
                            o04 = q2.o0(i16 << 3);
                            p02 = q2.p0(j11);
                            P = p02 + o04;
                            i13 += P;
                            break;
                        }
                    case 3:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j12 = unsafe.getLong(t3, j10);
                            o04 = q2.o0(i16 << 3);
                            p02 = q2.p0(j12);
                            P = p02 + o04;
                            i13 += P;
                            break;
                        }
                    case 4:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i20 = unsafe.getInt(t3, j10);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.n0(i20);
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case 5:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            o02 = q2.o0(i16 << 3);
                            P = o02 + 8;
                            i13 += P;
                            break;
                        }
                    case 6:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            o03 = q2.o0(i16 << 3);
                            P = o03 + 4;
                            i13 += P;
                            break;
                        }
                    case 7:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            o06 = q2.o0(i16 << 3);
                            P = o06 + 1;
                            i13 += P;
                            break;
                        }
                    case 8:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(t3, j10);
                            if (object instanceof n2) {
                                o07 = q2.o0(i16 << 3);
                                m10 = ((n2) object).m();
                                o08 = q2.o0(m10);
                                i13 += o08 + m10 + o07;
                                break;
                            } else {
                                o05 = q2.o0(i16 << 3);
                                n02 = q2.q0((String) object);
                                P = n02 + o05;
                                i13 += P;
                                break;
                            }
                        }
                    case 9:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            P = p4.P(i16, u(i12), unsafe.getObject(t3, j10));
                            i13 += P;
                            break;
                        }
                    case 10:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            o07 = q2.o0(i16 << 3);
                            m10 = ((n2) unsafe.getObject(t3, j10)).m();
                            o08 = q2.o0(m10);
                            i13 += o08 + m10 + o07;
                            break;
                        }
                    case 11:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i21 = unsafe.getInt(t3, j10);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.o0(i21);
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case 12:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i22 = unsafe.getInt(t3, j10);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.n0(i22);
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case 13:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            o03 = q2.o0(i16 << 3);
                            P = o03 + 4;
                            i13 += P;
                            break;
                        }
                    case 14:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            o02 = q2.o0(i16 << 3);
                            P = o02 + 8;
                            i13 += P;
                            break;
                        }
                    case 15:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i23 = unsafe.getInt(t3, j10);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.o0((i23 >> 31) ^ (i23 + i23));
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case 16:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j13 = unsafe.getLong(t3, j10);
                            o04 = q2.o0(i16 << 3);
                            p02 = q2.p0((j13 >> 63) ^ (j13 + j13));
                            P = p02 + o04;
                            i13 += P;
                            break;
                        }
                    case 17:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            P = q2.V(i16, (c4) unsafe.getObject(t3, j10), u(i12));
                            i13 += P;
                            break;
                        }
                    case 18:
                        P = p4.L(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 19:
                        P = p4.J(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 20:
                        P = p4.v(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 21:
                        P = p4.x(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 22:
                        P = p4.D(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 23:
                        P = p4.L(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 24:
                        P = p4.J(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 25:
                        P = p4.N(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 26:
                        P = p4.O(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 27:
                        P = p4.Q(i16, (List) unsafe.getObject(t3, j10), u(i12));
                        i13 += P;
                        break;
                    case 28:
                        P = p4.R(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 29:
                        P = p4.F(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        P = p4.B(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        P = p4.J(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case 32:
                        P = p4.L(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        P = p4.H(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        P = p4.z(i16, (List) unsafe.getObject(t3, j10));
                        i13 += P;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        K = p4.K((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case 36:
                        K = p4.I((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        K = p4.u((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        K = p4.w((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        K = p4.C((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        K = p4.K((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        K = p4.I((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        K = p4.M((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        K = p4.E((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        K = p4.A((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        K = p4.I((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        K = p4.K((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        K = p4.G((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        K = p4.y((List) unsafe.getObject(t3, j10));
                        if (K <= 0) {
                            break;
                        } else {
                            m02 = q2.m0(i16);
                            o09 = q2.o0(K);
                            i10 = o09 + m02 + K;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        P = p4.S(i16, (List) unsafe.getObject(t3, j10), u(i12));
                        i13 += P;
                        break;
                    case 50:
                        int i24 = i12 / 3;
                        y3.a(unsafe.getObject(t3, j10), this.f7532b[i24 + i24]);
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o02 = q2.o0(i16 << 3);
                            P = o02 + 8;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o03 = q2.o0(i16 << 3);
                            P = o03 + 4;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            long x10 = x(j10, t3);
                            o04 = q2.o0(i16 << 3);
                            p02 = q2.p0(x10);
                            P = p02 + o04;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            long x11 = x(j10, t3);
                            o04 = q2.o0(i16 << 3);
                            p02 = q2.p0(x11);
                            P = p02 + o04;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            int w10 = w(j10, t3);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.n0(w10);
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o02 = q2.o0(i16 << 3);
                            P = o02 + 8;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o03 = q2.o0(i16 << 3);
                            P = o03 + 4;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o06 = q2.o0(i16 << 3);
                            P = o06 + 1;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(t3, j10);
                            if (object2 instanceof n2) {
                                o010 = q2.o0(i16 << 3);
                                m11 = ((n2) object2).m();
                                o011 = q2.o0(m11);
                                i10 = o011 + m11 + o010;
                                i13 += i10;
                                break;
                            } else {
                                o05 = q2.o0(i16 << 3);
                                n02 = q2.q0((String) object2);
                                P = n02 + o05;
                                i13 += P;
                                break;
                            }
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            P = p4.P(i16, u(i12), unsafe.getObject(t3, j10));
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o010 = q2.o0(i16 << 3);
                            m11 = ((n2) unsafe.getObject(t3, j10)).m();
                            o011 = q2.o0(m11);
                            i10 = o011 + m11 + o010;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            int w11 = w(j10, t3);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.o0(w11);
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            int w12 = w(j10, t3);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.n0(w12);
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o03 = q2.o0(i16 << 3);
                            P = o03 + 4;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            o02 = q2.o0(i16 << 3);
                            P = o02 + 8;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            int w13 = w(j10, t3);
                            o05 = q2.o0(i16 << 3);
                            n02 = q2.o0((w13 >> 31) ^ (w13 + w13));
                            P = n02 + o05;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            long x12 = x(j10, t3);
                            o04 = q2.o0(i16 << 3);
                            p02 = q2.p0((x12 >> 63) ^ (x12 + x12));
                            P = p02 + o04;
                            i13 += P;
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (!j(i16, i12, t3)) {
                            break;
                        } else {
                            P = q2.V(i16, (c4) unsafe.getObject(t3, j10), u(i12));
                            i13 += P;
                            break;
                        }
                }
                i12 += 3;
                i11 = 1048575;
            } else {
                y4<?, ?> y4Var = this.f7539j;
                int f = y4Var.f(y4Var.b(t3)) + i13;
                if (!this.f7534d) {
                    return f;
                }
                this.f7540k.b(t3);
                throw null;
            }
        }
    }

    public final int t(T t3) {
        int o02;
        int o03;
        int o04;
        int p02;
        int o05;
        int n02;
        int o06;
        int o07;
        int m10;
        int o08;
        int P;
        int o09;
        int p03;
        int K;
        int m02;
        int o010;
        int i6;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f7531a;
            if (i10 < iArr.length) {
                int v10 = v(i10);
                int i12 = (v10 >>> 20) & 255;
                int i13 = iArr[i10];
                long j10 = v10 & 1048575;
                if (i12 >= y2.f7683v.a() && i12 <= y2.f7684w.a()) {
                    int i14 = iArr[i10 + 2];
                }
                Unsafe unsafe = f7530m;
                switch (i12) {
                    case 0:
                        if (h(i10, t3)) {
                            o02 = q2.o0(i13 << 3);
                            P = o02 + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 1:
                        if (h(i10, t3)) {
                            o03 = q2.o0(i13 << 3);
                            P = o03 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 2:
                        if (h(i10, t3)) {
                            long h10 = i5.h(j10, t3);
                            o04 = q2.o0(i13 << 3);
                            p02 = q2.p0(h10);
                            P = p02 + o04;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 3:
                        if (h(i10, t3)) {
                            long h11 = i5.h(j10, t3);
                            o04 = q2.o0(i13 << 3);
                            p02 = q2.p0(h11);
                            P = p02 + o04;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 4:
                        if (h(i10, t3)) {
                            int f = i5.f(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.n0(f);
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 5:
                        if (h(i10, t3)) {
                            o02 = q2.o0(i13 << 3);
                            P = o02 + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 6:
                        if (h(i10, t3)) {
                            o03 = q2.o0(i13 << 3);
                            P = o03 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 7:
                        if (h(i10, t3)) {
                            o06 = q2.o0(i13 << 3);
                            P = o06 + 1;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 8:
                        if (h(i10, t3)) {
                            Object l2 = i5.l(j10, t3);
                            if (l2 instanceof n2) {
                                o07 = q2.o0(i13 << 3);
                                m10 = ((n2) l2).m();
                                o08 = q2.o0(m10);
                                i6 = o08 + m10 + o07;
                                i11 += i6;
                                i10 += 3;
                            } else {
                                o05 = q2.o0(i13 << 3);
                                n02 = q2.q0((String) l2);
                                P = n02 + o05;
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 9:
                        if (h(i10, t3)) {
                            P = p4.P(i13, u(i10), i5.l(j10, t3));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 10:
                        if (h(i10, t3)) {
                            o07 = q2.o0(i13 << 3);
                            m10 = ((n2) i5.l(j10, t3)).m();
                            o08 = q2.o0(m10);
                            i6 = o08 + m10 + o07;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 11:
                        if (h(i10, t3)) {
                            int f2 = i5.f(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.o0(f2);
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 12:
                        if (h(i10, t3)) {
                            int f10 = i5.f(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.n0(f10);
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 13:
                        if (h(i10, t3)) {
                            o03 = q2.o0(i13 << 3);
                            P = o03 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 14:
                        if (h(i10, t3)) {
                            o02 = q2.o0(i13 << 3);
                            P = o02 + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 15:
                        if (h(i10, t3)) {
                            int f11 = i5.f(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.o0((f11 >> 31) ^ (f11 + f11));
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 16:
                        if (h(i10, t3)) {
                            long h12 = i5.h(j10, t3);
                            o09 = q2.o0(i13 << 3);
                            p03 = q2.p0((h12 >> 63) ^ (h12 + h12));
                            P = p03 + o09;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 17:
                        if (h(i10, t3)) {
                            P = q2.V(i13, (c4) i5.l(j10, t3), u(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 18:
                        P = p4.L(i13, (List) i5.l(j10, t3));
                        break;
                    case 19:
                        P = p4.J(i13, (List) i5.l(j10, t3));
                        break;
                    case 20:
                        P = p4.v(i13, (List) i5.l(j10, t3));
                        break;
                    case 21:
                        P = p4.x(i13, (List) i5.l(j10, t3));
                        break;
                    case 22:
                        P = p4.D(i13, (List) i5.l(j10, t3));
                        break;
                    case 23:
                        P = p4.L(i13, (List) i5.l(j10, t3));
                        break;
                    case 24:
                        P = p4.J(i13, (List) i5.l(j10, t3));
                        break;
                    case 25:
                        P = p4.N(i13, (List) i5.l(j10, t3));
                        break;
                    case 26:
                        P = p4.O(i13, (List) i5.l(j10, t3));
                        break;
                    case 27:
                        P = p4.Q(i13, (List) i5.l(j10, t3), u(i10));
                        break;
                    case 28:
                        P = p4.R(i13, (List) i5.l(j10, t3));
                        break;
                    case 29:
                        P = p4.F(i13, (List) i5.l(j10, t3));
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        P = p4.B(i13, (List) i5.l(j10, t3));
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        P = p4.J(i13, (List) i5.l(j10, t3));
                        break;
                    case 32:
                        P = p4.L(i13, (List) i5.l(j10, t3));
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        P = p4.H(i13, (List) i5.l(j10, t3));
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        P = p4.z(i13, (List) i5.l(j10, t3));
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        K = p4.K((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 36:
                        K = p4.I((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        K = p4.u((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        K = p4.w((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        K = p4.C((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        K = p4.K((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        K = p4.I((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        K = p4.M((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        K = p4.E((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        K = p4.A((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        K = p4.I((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        K = p4.K((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        K = p4.G((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        K = p4.y((List) unsafe.getObject(t3, j10));
                        if (K > 0) {
                            m02 = q2.m0(i13);
                            o010 = q2.o0(K);
                            i6 = o010 + m02 + K;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        P = p4.S(i13, (List) i5.l(j10, t3), u(i10));
                        break;
                    case 50:
                        int i15 = i10 / 3;
                        y3.a(i5.l(j10, t3), this.f7532b[i15 + i15]);
                        continue;
                        i10 += 3;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (j(i13, i10, t3)) {
                            o02 = q2.o0(i13 << 3);
                            P = o02 + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (j(i13, i10, t3)) {
                            o03 = q2.o0(i13 << 3);
                            P = o03 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (j(i13, i10, t3)) {
                            long x10 = x(j10, t3);
                            o04 = q2.o0(i13 << 3);
                            p02 = q2.p0(x10);
                            P = p02 + o04;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (j(i13, i10, t3)) {
                            long x11 = x(j10, t3);
                            o04 = q2.o0(i13 << 3);
                            p02 = q2.p0(x11);
                            P = p02 + o04;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (j(i13, i10, t3)) {
                            int w10 = w(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.n0(w10);
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (j(i13, i10, t3)) {
                            o02 = q2.o0(i13 << 3);
                            P = o02 + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (j(i13, i10, t3)) {
                            o03 = q2.o0(i13 << 3);
                            P = o03 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (j(i13, i10, t3)) {
                            o06 = q2.o0(i13 << 3);
                            P = o06 + 1;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (j(i13, i10, t3)) {
                            Object l10 = i5.l(j10, t3);
                            if (l10 instanceof n2) {
                                o07 = q2.o0(i13 << 3);
                                m10 = ((n2) l10).m();
                                o08 = q2.o0(m10);
                                i6 = o08 + m10 + o07;
                                i11 += i6;
                                i10 += 3;
                            } else {
                                o05 = q2.o0(i13 << 3);
                                n02 = q2.q0((String) l10);
                                P = n02 + o05;
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (j(i13, i10, t3)) {
                            P = p4.P(i13, u(i10), i5.l(j10, t3));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (j(i13, i10, t3)) {
                            o07 = q2.o0(i13 << 3);
                            m10 = ((n2) i5.l(j10, t3)).m();
                            o08 = q2.o0(m10);
                            i6 = o08 + m10 + o07;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (j(i13, i10, t3)) {
                            int w11 = w(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.o0(w11);
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (j(i13, i10, t3)) {
                            int w12 = w(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.n0(w12);
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (j(i13, i10, t3)) {
                            o03 = q2.o0(i13 << 3);
                            P = o03 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (j(i13, i10, t3)) {
                            o02 = q2.o0(i13 << 3);
                            P = o02 + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (j(i13, i10, t3)) {
                            int w13 = w(j10, t3);
                            o05 = q2.o0(i13 << 3);
                            n02 = q2.o0((w13 >> 31) ^ (w13 + w13));
                            P = n02 + o05;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (j(i13, i10, t3)) {
                            long x12 = x(j10, t3);
                            o09 = q2.o0(i13 << 3);
                            p03 = q2.p0((x12 >> 63) ^ (x12 + x12));
                            P = p03 + o09;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (j(i13, i10, t3)) {
                            P = q2.V(i13, (c4) i5.l(j10, t3), u(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    default:
                        i10 += 3;
                }
                i11 += P;
                i10 += 3;
            } else {
                y4<?, ?> y4Var = this.f7539j;
                return y4Var.f(y4Var.b(t3)) + i11;
            }
        }
    }

    public final o4 u(int i6) {
        int i10 = i6 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f7532b;
        o4 o4Var = (o4) objArr[i11];
        if (o4Var != null) {
            return o4Var;
        }
        o4<T> a10 = l4.f7583c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final int v(int i6) {
        return this.f7531a[i6 + 1];
    }

    public final boolean y(Object obj, int i6, Object obj2) {
        if (h(i6, obj) == h(i6, obj2)) {
            return true;
        }
        return false;
    }
}
