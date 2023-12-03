package com.google.android.gms.internal.measurement;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class y6<T> implements g7<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f8702n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f8703o = y7.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8704a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f8705b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8706c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8707d;

    /* renamed from: e  reason: collision with root package name */
    public final v6 f8708e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8709g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f8710h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8711i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8712j;

    /* renamed from: k  reason: collision with root package name */
    public final k6 f8713k;

    /* renamed from: l  reason: collision with root package name */
    public final r7 f8714l;

    /* renamed from: m  reason: collision with root package name */
    public final j5 f8715m;

    public y6(int[] iArr, Object[] objArr, int i6, int i10, v6 v6Var, boolean z10, int[] iArr2, int i11, int i12, k6 k6Var, r7 r7Var, j5 j5Var, r6 r6Var) {
        boolean z11;
        this.f8704a = iArr;
        this.f8705b = objArr;
        this.f8706c = i6;
        this.f8707d = i10;
        this.f8709g = z10;
        if (j5Var != null && j5Var.c(v6Var)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f = z11;
        this.f8710h = iArr2;
        this.f8711i = i11;
        this.f8712j = i12;
        this.f8713k = k6Var;
        this.f8714l = r7Var;
        this.f8715m = j5Var;
        this.f8708e = v6Var;
    }

    public static boolean A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w5) {
            return ((w5) obj).p();
        }
        return true;
    }

    public static final void C(int i6, Object obj, f5 f5Var) {
        if (obj instanceof String) {
            f5Var.f8376a.h0(i6, (String) obj);
            return;
        }
        f5Var.f(i6, (b5) obj);
    }

    public static s7 E(Object obj) {
        w5 w5Var = (w5) obj;
        s7 s7Var = w5Var.zzc;
        if (s7Var == s7.f) {
            s7 b10 = s7.b();
            w5Var.zzc = b10;
            return b10;
        }
        return s7Var;
    }

    public static y6 F(t6 t6Var, k6 k6Var, r7 r7Var, j5 j5Var, r6 r6Var) {
        if (t6Var instanceof f7) {
            return G((f7) t6Var, k6Var, r7Var, j5Var, r6Var);
        }
        q7 q7Var = (q7) t6Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y6 G(f7 f7Var, k6 k6Var, r7 r7Var, j5 j5Var, r6 r6Var) {
        boolean z10;
        int i6;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        char charAt11;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int objectFieldOffset;
        int i27;
        Object[] objArr;
        int i28;
        int i29;
        int i30;
        Field p10;
        char charAt12;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field p11;
        Object obj2;
        Field p12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        int i38;
        char charAt16;
        if (f7Var.c() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String d10 = f7Var.d();
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
        int charAt17 = d10.charAt(i6);
        if (charAt17 >= 55296) {
            int i41 = charAt17 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                charAt16 = d10.charAt(i40);
                if (charAt16 < 55296) {
                    break;
                }
                i41 |= (charAt16 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            charAt17 = i41 | (charAt16 << i42);
            i40 = i38;
        }
        if (charAt17 == 0) {
            iArr = f8702n;
            i11 = 0;
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i13 = 0;
            i12 = 0;
            i10 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt18 = d10.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i21 = i43 + 1;
                    charAt11 = d10.charAt(i43);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i44 |= (charAt11 & 8191) << i45;
                    i45 += 13;
                    i43 = i21;
                }
                charAt18 = i44 | (charAt11 << i45);
                i43 = i21;
            }
            int i46 = i43 + 1;
            int charAt19 = d10.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i20 = i46 + 1;
                    charAt10 = d10.charAt(i46);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i47 |= (charAt10 & 8191) << i48;
                    i48 += 13;
                    i46 = i20;
                }
                charAt19 = i47 | (charAt10 << i48);
                i46 = i20;
            }
            int i49 = i46 + 1;
            charAt = d10.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i19 = i49 + 1;
                    charAt9 = d10.charAt(i49);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i50 |= (charAt9 & 8191) << i51;
                    i51 += 13;
                    i49 = i19;
                }
                charAt = i50 | (charAt9 << i51);
                i49 = i19;
            }
            int i52 = i49 + 1;
            charAt2 = d10.charAt(i49);
            if (charAt2 >= 55296) {
                int i53 = charAt2 & 8191;
                int i54 = 13;
                while (true) {
                    i18 = i52 + 1;
                    charAt8 = d10.charAt(i52);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i53 |= (charAt8 & 8191) << i54;
                    i54 += 13;
                    i52 = i18;
                }
                charAt2 = i53 | (charAt8 << i54);
                i52 = i18;
            }
            int i55 = i52 + 1;
            charAt3 = d10.charAt(i52);
            if (charAt3 >= 55296) {
                int i56 = charAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i17 = i55 + 1;
                    charAt7 = d10.charAt(i55);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i56 |= (charAt7 & 8191) << i57;
                    i57 += 13;
                    i55 = i17;
                }
                charAt3 = i56 | (charAt7 << i57);
                i55 = i17;
            }
            int i58 = i55 + 1;
            int charAt20 = d10.charAt(i55);
            if (charAt20 >= 55296) {
                int i59 = charAt20 & 8191;
                int i60 = 13;
                while (true) {
                    i16 = i58 + 1;
                    charAt6 = d10.charAt(i58);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i59 |= (charAt6 & 8191) << i60;
                    i60 += 13;
                    i58 = i16;
                }
                charAt20 = i59 | (charAt6 << i60);
                i58 = i16;
            }
            int i61 = i58 + 1;
            int charAt21 = d10.charAt(i58);
            if (charAt21 >= 55296) {
                int i62 = charAt21 & 8191;
                int i63 = 13;
                while (true) {
                    i15 = i61 + 1;
                    charAt5 = d10.charAt(i61);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i62 |= (charAt5 & 8191) << i63;
                    i63 += 13;
                    i61 = i15;
                }
                charAt21 = i62 | (charAt5 << i63);
                i61 = i15;
            }
            int i64 = i61 + 1;
            int charAt22 = d10.charAt(i61);
            if (charAt22 >= 55296) {
                int i65 = charAt22 & 8191;
                int i66 = 13;
                while (true) {
                    i14 = i64 + 1;
                    charAt4 = d10.charAt(i64);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i65 |= (charAt4 & 8191) << i66;
                    i66 += 13;
                    i64 = i14;
                }
                charAt22 = i65 | (charAt4 << i66);
                i64 = i14;
            }
            iArr = new int[charAt22 + charAt20 + charAt21];
            i10 = charAt18 + charAt18 + charAt19;
            i11 = charAt18;
            i40 = i64;
            int i67 = charAt22;
            i12 = charAt20;
            i13 = i67;
        }
        Object[] e10 = f7Var.e();
        Class<?> cls = f7Var.a().getClass();
        int[] iArr2 = new int[charAt3 * 3];
        Object[] objArr2 = new Object[charAt3 + charAt3];
        int i68 = i12 + i13;
        int i69 = i13;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int charAt23 = d10.charAt(i40);
            if (charAt23 >= c10) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    charAt15 = d10.charAt(i75);
                    if (charAt15 < c10) {
                        break;
                    }
                    i74 |= (charAt15 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                charAt23 = i74 | (charAt15 << i76);
                i22 = i37;
            } else {
                i22 = i73;
            }
            int i77 = i22 + 1;
            int charAt24 = d10.charAt(i22);
            if (charAt24 >= c10) {
                int i78 = charAt24 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    charAt14 = d10.charAt(i79);
                    i23 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i78 |= (charAt14 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                    length = i23;
                }
                charAt24 = i78 | (charAt14 << i80);
                i24 = i36;
            } else {
                i23 = length;
                i24 = i77;
            }
            int i81 = charAt24 & 255;
            int i82 = i68;
            if ((charAt24 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            Unsafe unsafe = f8703o;
            int i83 = i13;
            if (i81 >= 51) {
                int i84 = i24 + 1;
                int charAt25 = d10.charAt(i24);
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i35 = i86 + 1;
                        charAt13 = d10.charAt(i86);
                        i25 = charAt2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i85 |= (charAt13 & 8191) << i87;
                        i87 += 13;
                        i86 = i35;
                        charAt2 = i25;
                    }
                    charAt25 = i85 | (charAt13 << i87);
                    i33 = i35;
                } else {
                    i25 = charAt2;
                    i33 = i84;
                }
                int i88 = i81 - 51;
                int i89 = i33;
                if (i88 != 9 && i88 != 17) {
                    if (i88 == 12 && !z10) {
                        int i90 = i72 / 3;
                        i34 = i10 + 1;
                        objArr2[i90 + i90 + 1] = e10[i10];
                    }
                    int i91 = charAt25 + charAt25;
                    obj = e10[i91];
                    if (!(obj instanceof Field)) {
                        p11 = (Field) obj;
                    } else {
                        p11 = p(cls, (String) obj);
                        e10[i91] = p11;
                    }
                    int i92 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p11);
                    int i93 = i91 + 1;
                    obj2 = e10[i93];
                    if (!(obj2 instanceof Field)) {
                        p12 = (Field) obj2;
                    } else {
                        p12 = p(cls, (String) obj2);
                        e10[i93] = p12;
                    }
                    i28 = (int) unsafe.objectFieldOffset(p12);
                    i29 = i89;
                    objectFieldOffset = objectFieldOffset2;
                    i30 = 0;
                    i27 = i10;
                    i26 = i92;
                    objArr = e10;
                } else {
                    int i94 = i72 / 3;
                    i34 = i10 + 1;
                    objArr2[i94 + i94 + 1] = e10[i10];
                }
                i10 = i34;
                int i912 = charAt25 + charAt25;
                obj = e10[i912];
                if (!(obj instanceof Field)) {
                }
                int i922 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p11);
                int i932 = i912 + 1;
                obj2 = e10[i932];
                if (!(obj2 instanceof Field)) {
                }
                i28 = (int) unsafe.objectFieldOffset(p12);
                i29 = i89;
                objectFieldOffset = objectFieldOffset22;
                i30 = 0;
                i27 = i10;
                i26 = i922;
                objArr = e10;
            } else {
                int i95 = charAt;
                i25 = charAt2;
                int i96 = i10 + 1;
                Field p13 = p(cls, (String) e10[i10]);
                i26 = i95;
                if (i81 != 9 && i81 != 17) {
                    if (i81 != 27 && i81 != 49) {
                        if (i81 != 12 && i81 != 30 && i81 != 44) {
                            if (i81 == 50) {
                                int i97 = i69 + 1;
                                iArr[i69] = i72;
                                int i98 = i72 / 3;
                                int i99 = i98 + i98;
                                int i100 = i96 + 1;
                                objArr2[i99] = e10[i96];
                                if ((charAt24 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0) {
                                    i96 = i100 + 1;
                                    objArr2[i99 + 1] = e10[i100];
                                } else {
                                    i96 = i100;
                                }
                                i69 = i97;
                            }
                        } else if (!z10) {
                            int i101 = i72 / 3;
                            objArr2[i101 + i101 + 1] = e10[i96];
                            i96++;
                        }
                    } else {
                        int i102 = i72 / 3;
                        objArr2[i102 + i102 + 1] = e10[i96];
                        i96++;
                    }
                } else {
                    int i103 = i72 / 3;
                    objArr2[i103 + i103 + 1] = p13.getType();
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(p13);
                i27 = i96;
                if ((charAt24 & 4096) == 4096 && i81 <= 17) {
                    int i104 = i24 + 1;
                    int charAt26 = d10.charAt(i24);
                    if (charAt26 >= 55296) {
                        int i105 = charAt26 & 8191;
                        int i106 = 13;
                        while (true) {
                            i29 = i104 + 1;
                            charAt12 = d10.charAt(i104);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i105 |= (charAt12 & 8191) << i106;
                            i106 += 13;
                            i104 = i29;
                        }
                        charAt26 = i105 | (charAt12 << i106);
                    } else {
                        i29 = i104;
                    }
                    int i107 = (charAt26 / 32) + i11 + i11;
                    Object obj3 = e10[i107];
                    if (obj3 instanceof Field) {
                        p10 = (Field) obj3;
                    } else {
                        p10 = p(cls, (String) obj3);
                        e10[i107] = p10;
                    }
                    objArr = e10;
                    i28 = (int) unsafe.objectFieldOffset(p10);
                    i30 = charAt26 % 32;
                } else {
                    objArr = e10;
                    i28 = 1048575;
                    i29 = i24;
                    i30 = 0;
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i70] = objectFieldOffset;
                    i70++;
                }
            }
            int i108 = i72 + 1;
            iArr2[i72] = charAt23;
            int i109 = i108 + 1;
            if ((charAt24 & 512) != 0) {
                i31 = 536870912;
            } else {
                i31 = 0;
            }
            if ((charAt24 & 256) != 0) {
                i32 = 268435456;
            } else {
                i32 = 0;
            }
            iArr2[i108] = i32 | i31 | (i81 << 20) | objectFieldOffset;
            i72 = i109 + 1;
            iArr2[i109] = (i30 << 20) | i28;
            e10 = objArr;
            charAt = i26;
            i68 = i82;
            length = i23;
            i10 = i27;
            i40 = i29;
            i13 = i83;
            charAt2 = i25;
            c10 = 55296;
        }
        return new y6(iArr2, objArr2, charAt, charAt2, f7Var.a(), z10, iArr, i13, i68, k6Var, r7Var, j5Var, r6Var);
    }

    public static int J(long j10, Object obj) {
        return ((Integer) y7.j(j10, obj)).intValue();
    }

    public static long k(long j10, Object obj) {
        return ((Long) y7.j(j10, obj)).longValue();
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void q(Object obj) {
        if (A(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public final boolean B(int i6, int i10, Object obj) {
        if (y7.g(this.f8704a[i10 + 2] & 1048575, obj) == i6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0399, code lost:
        if (r0 != r3) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03fa, code lost:
        if (r0 != r14) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03fc, code lost:
        r11 = r35;
        r1 = r39;
        r8 = r40;
        r7 = r16;
        r5 = r19;
        r6 = r20;
        r9 = r21;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x040e, code lost:
        r6 = r39;
        r2 = r0;
        r7 = r16;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0490, code lost:
        if (r5 == 1048575) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0492, code lost:
        r31.putInt(r11, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0498, code lost:
        r3 = r15.f8711i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x049c, code lost:
        if (r3 >= r15.f8712j) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x049e, code lost:
        r5 = r15.f8710h[r3];
        r6 = r26[r5];
        r6 = com.google.android.gms.internal.measurement.y7.j(r15.j(r5) & 1048575, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04ae, code lost:
        if (r6 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04b1, code lost:
        r7 = r5 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04ba, code lost:
        if (((com.google.android.gms.internal.measurement.y5) r22[(r7 + r7) + 1]) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04bc, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04bf, code lost:
        r6 = (com.google.android.gms.internal.measurement.q6) r6;
        r0 = (com.google.android.gms.internal.measurement.p6) r15.m(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04c7, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04c8, code lost:
        if (r1 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04cc, code lost:
        if (r0 != r38) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04d3, code lost:
        throw com.google.android.gms.internal.measurement.zzkp.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04d6, code lost:
        if (r0 > r38) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04d8, code lost:
        if (r4 != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04da, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04df, code lost:
        throw com.google.android.gms.internal.measurement.zzkp.c();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D(Object obj, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        Object[] objArr;
        int[] iArr;
        Unsafe unsafe;
        Object obj2;
        int O;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        byte b11;
        int i16;
        int i17;
        Object obj3;
        int i18;
        com.google.android.gms.internal.p000firebaseauthapi.z zVar2;
        int i19;
        byte b12;
        int i20;
        byte b13;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int l2;
        int i31;
        int i32;
        int i33;
        int l10;
        int i34;
        y6<T> y6Var = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i35 = i10;
        com.google.android.gms.internal.p000firebaseauthapi.z zVar3 = zVar;
        q(obj);
        Unsafe unsafe2 = f8703o;
        int i36 = i6;
        byte b14 = i11;
        int i37 = -1;
        int i38 = 0;
        byte b15 = 0;
        int i39 = 1048575;
        int i40 = 0;
        while (true) {
            Object[] objArr2 = y6Var.f8705b;
            int[] iArr2 = y6Var.f8704a;
            if (i36 < i35) {
                int i41 = i36 + 1;
                byte b16 = bArr2[i36];
                if (b16 < 0) {
                    i41 = u4.j(b16, bArr2, i41, zVar3);
                    b16 = zVar3.f8264b;
                }
                int i42 = b16 >>> 3;
                int i43 = b16 & 7;
                byte b17 = b16;
                int i44 = y6Var.f8707d;
                byte b18 = b14;
                int i45 = y6Var.f8706c;
                objArr = objArr2;
                if (i42 > i37) {
                    O = (i42 < i45 || i42 > i44) ? -1 : y6Var.O(i42, i38 / 3);
                    i12 = -1;
                } else {
                    O = (i42 < i45 || i42 > i44) ? -1 : y6Var.O(i42, 0);
                    i12 = -1;
                }
                if (O == i12) {
                    i13 = i41;
                    i14 = i39;
                    iArr = iArr2;
                    unsafe = unsafe2;
                    b10 = b17;
                    i15 = i40;
                    b11 = b18;
                    i16 = i42;
                    i17 = 0;
                } else {
                    int i46 = iArr2[O + 1];
                    int i47 = (i46 >>> 20) & 255;
                    long j10 = i46 & 1048575;
                    if (i47 <= 17) {
                        int i48 = iArr2[O + 2];
                        int i49 = 1 << (i48 >>> 20);
                        int i50 = i48 & 1048575;
                        if (i50 != i39) {
                            if (i39 != 1048575) {
                                unsafe2.putInt(obj4, i39, i40);
                            }
                            i40 = unsafe2.getInt(obj4, i50);
                            i25 = i50;
                        } else {
                            i25 = i39;
                        }
                        int i51 = i40;
                        switch (i47) {
                            case 0:
                                i26 = O;
                                i27 = i41;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 1) {
                                    i32 = i26;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    y7.o(obj4, j10, Double.longBitsToDouble(u4.o(bArr2, i27)));
                                    i29 = i27 + 8;
                                    l2 = i29;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 1:
                                i26 = O;
                                i27 = i41;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 5) {
                                    i32 = i26;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    y7.p(obj4, j10, Float.intBitsToFloat(u4.b(bArr2, i27)));
                                    i29 = i27 + 4;
                                    l2 = i29;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 2:
                            case 3:
                                i28 = i25;
                                b12 = b17;
                                int i52 = i41;
                                i30 = O;
                                i27 = i52;
                                if (i43 != 0) {
                                    i32 = i30;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    l2 = u4.l(bArr2, i27, zVar);
                                    unsafe2.putLong(obj, j10, zVar.f8265c);
                                    i31 = i51 | i49;
                                    i26 = i30;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 4:
                            case 11:
                                i28 = i25;
                                b12 = b17;
                                int i53 = i41;
                                i30 = O;
                                i27 = i53;
                                if (i43 != 0) {
                                    i32 = i30;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    int i54 = u4.i(bArr2, i27, zVar);
                                    unsafe2.putInt(obj4, j10, zVar.f8264b);
                                    l2 = i54;
                                    i26 = i30;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 5:
                            case 14:
                                i26 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 1) {
                                    i27 = i41;
                                    i32 = i26;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    i33 = i26;
                                    unsafe2.putLong(obj, j10, u4.o(bArr2, i41));
                                    l2 = i41 + 8;
                                    i26 = i33;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 6:
                            case 13:
                                i26 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 5) {
                                    i27 = i41;
                                    i32 = i26;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j10, u4.b(bArr2, i41));
                                    i27 = i41;
                                    i29 = i27 + 4;
                                    l2 = i29;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 7:
                                i26 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 0) {
                                    i27 = i41;
                                    i32 = i26;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    l10 = u4.l(bArr2, i41, zVar);
                                    y7.m(obj4, j10, zVar.f8265c != 0);
                                    l2 = l10;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 8:
                                i26 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 2) {
                                    i27 = i41;
                                    i32 = i26;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    if ((i46 & 536870912) == 0) {
                                        l10 = u4.f(bArr2, i41, zVar);
                                    } else {
                                        l10 = u4.g(bArr2, i41, zVar);
                                    }
                                    unsafe2.putObject(obj4, j10, zVar.f8266d);
                                    l2 = l10;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 9:
                                i34 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 2) {
                                    int i55 = i34;
                                    y6Var = this;
                                    i27 = i41;
                                    i32 = i55;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    i33 = i34;
                                    y6Var = this;
                                    Object n10 = y6Var.n(i33, obj4);
                                    int n11 = u4.n(n10, y6Var.l(i33), bArr, i41, i10, zVar);
                                    y6Var.v(obj4, i33, n10);
                                    l2 = n11;
                                    i26 = i33;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 10:
                                i34 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 2) {
                                    int i552 = i34;
                                    y6Var = this;
                                    i27 = i41;
                                    i32 = i552;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    i36 = u4.a(bArr2, i41, zVar);
                                    unsafe2.putObject(obj4, j10, zVar.f8266d);
                                    l2 = i36;
                                    i26 = i34;
                                    y6Var = this;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 12:
                                i34 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 0) {
                                    int i5522 = i34;
                                    y6Var = this;
                                    i27 = i41;
                                    i32 = i5522;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    i36 = u4.i(bArr2, i41, zVar);
                                    int i56 = zVar.f8264b;
                                    int i57 = i34 / 3;
                                    y5 y5Var = (y5) objArr[i57 + i57 + 1];
                                    if (y5Var != null && !y5Var.a(i56)) {
                                        E(obj).c(b12, Long.valueOf(i56));
                                        i40 = i51;
                                        i19 = i34;
                                        i39 = i28;
                                        y6Var = this;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j10, i56);
                                        l2 = i36;
                                        i26 = i34;
                                        y6Var = this;
                                        i31 = i51 | i49;
                                        i40 = i31;
                                        i19 = i26;
                                        i36 = l2;
                                        i39 = i28;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                i34 = O;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 0) {
                                    int i55222 = i34;
                                    y6Var = this;
                                    i27 = i41;
                                    i32 = i55222;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    i36 = u4.i(bArr2, i41, zVar);
                                    unsafe2.putInt(obj4, j10, c5.a(zVar.f8264b));
                                    l2 = i36;
                                    i26 = i34;
                                    y6Var = this;
                                    i31 = i51 | i49;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            case 16:
                                if (i43 != 0) {
                                    i28 = i25;
                                    b12 = b17;
                                    y6Var = this;
                                    i32 = O;
                                    i27 = i41;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    l2 = u4.l(bArr2, i41, zVar);
                                    i28 = i25;
                                    b12 = b17;
                                    unsafe2.putLong(obj, j10, c5.b(zVar.f8265c));
                                    i31 = i51 | i49;
                                    i26 = O;
                                    y6Var = this;
                                    i40 = i31;
                                    i19 = i26;
                                    i36 = l2;
                                    i39 = i28;
                                    break;
                                }
                            default:
                                i26 = O;
                                i27 = i41;
                                i28 = i25;
                                b12 = b17;
                                if (i43 != 3) {
                                    i32 = i26;
                                    i20 = i27;
                                    unsafe = unsafe2;
                                    b13 = b12;
                                    i24 = i51;
                                    i21 = i32;
                                    i23 = i28;
                                    iArr = iArr2;
                                    i16 = i42;
                                    i14 = i23;
                                    i15 = i24;
                                    i13 = i20;
                                    b10 = b13;
                                    i17 = i21;
                                    b11 = i11;
                                    break;
                                } else {
                                    Object n12 = y6Var.n(i26, obj4);
                                    i36 = u4.m(n12, y6Var.l(i26), bArr, i27, i10, (i42 << 3) | 4, zVar);
                                    y6Var.v(obj4, i26, n12);
                                    i40 = i51 | i49;
                                    i19 = i26;
                                    i39 = i28;
                                    break;
                                }
                        }
                        i35 = i10;
                        b14 = i11;
                        b15 = b12;
                        i38 = i19;
                        i37 = i42;
                        zVar3 = zVar;
                    } else {
                        i19 = O;
                        int i58 = i41;
                        b12 = b17;
                        if (i47 != 27) {
                            i14 = i39;
                            i15 = i40;
                            if (i47 <= 49) {
                                iArr = iArr2;
                                unsafe = unsafe2;
                                b13 = b12;
                                i16 = i42;
                                i36 = N(obj, bArr, i58, i10, b12, i42, i43, i19, i46, i47, j10, zVar);
                                i22 = i19;
                            } else {
                                i20 = i58;
                                unsafe = unsafe2;
                                b13 = b12;
                                i21 = i19;
                                iArr = iArr2;
                                i16 = i42;
                                if (i47 != 50) {
                                    i22 = i21;
                                    i36 = L(obj, bArr, i20, i10, b13, i16, i43, i46, i47, j10, i22, zVar);
                                } else if (i43 == 2) {
                                    y6Var.K(obj, i21, j10);
                                    throw null;
                                }
                            }
                        } else if (i43 == 2) {
                            b6 b6Var = (b6) unsafe2.getObject(obj4, j10);
                            if (!b6Var.c()) {
                                int size = b6Var.size();
                                b6Var = b6Var.k(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j10, b6Var);
                            }
                            i36 = u4.d(y6Var.l(i19), b12, bArr, i58, i10, b6Var, zVar);
                            i39 = i39;
                            i40 = i40;
                            i35 = i10;
                            b14 = i11;
                            b15 = b12;
                            i38 = i19;
                            i37 = i42;
                            zVar3 = zVar;
                        } else {
                            i14 = i39;
                            i15 = i40;
                            i20 = i58;
                            unsafe = unsafe2;
                            b13 = b12;
                            i21 = i19;
                            iArr = iArr2;
                            i16 = i42;
                        }
                        i23 = i14;
                        i24 = i15;
                        i14 = i23;
                        i15 = i24;
                        i13 = i20;
                        b10 = b13;
                        i17 = i21;
                        b11 = i11;
                    }
                }
                if (b10 != b11 || b11 == 0) {
                    if (y6Var.f) {
                        zVar2 = zVar;
                        i5 i5Var = (i5) zVar2.f8267e;
                        if (i5Var != i5.f8425c) {
                            i18 = i16;
                            if (i5Var.a(y6Var.f8708e, i18) == null) {
                                i36 = u4.h(b10, bArr, i13, i10, E(obj), zVar);
                                obj3 = obj;
                                b14 = b11;
                                i38 = i17;
                                i39 = i14;
                                i40 = i15;
                                bArr2 = bArr;
                                i35 = i10;
                                b15 = b10;
                                i37 = i18;
                                obj4 = obj3;
                                unsafe2 = unsafe;
                                zVar3 = zVar2;
                            } else {
                                u5 u5Var = (u5) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                        }
                    } else {
                        obj3 = obj;
                        zVar2 = zVar;
                    }
                    i18 = i16;
                    i36 = u4.h(b10, bArr, i13, i10, E(obj), zVar);
                    b14 = b11;
                    i38 = i17;
                    i39 = i14;
                    i40 = i15;
                    bArr2 = bArr;
                    i35 = i10;
                    b15 = b10;
                    i37 = i18;
                    obj4 = obj3;
                    unsafe2 = unsafe;
                    zVar3 = zVar2;
                } else {
                    obj2 = obj;
                    i36 = i13;
                    b14 = b11;
                    b15 = b10;
                    i39 = i14;
                    i40 = i15;
                }
            } else {
                objArr = objArr2;
                iArr = iArr2;
                unsafe = unsafe2;
                obj2 = obj4;
            }
        }
    }

    public final int H(Object obj) {
        int i6;
        int V;
        int V2;
        int V3;
        int X;
        int V4;
        int o02;
        int V5;
        int V6;
        int m10;
        int V7;
        int J;
        int D;
        int q02;
        int V8;
        int i10;
        int V9;
        int m11;
        int V10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f8704a;
            if (i12 < iArr.length) {
                int j10 = j(i12);
                int i16 = iArr[i12];
                int i17 = (j10 >>> 20) & 255;
                Unsafe unsafe = f8703o;
                if (i17 <= 17) {
                    int i18 = iArr[i12 + 2];
                    int i19 = i18 & i11;
                    i6 = 1 << (i18 >>> 20);
                    if (i19 != i14) {
                        i15 = unsafe.getInt(obj, i19);
                        i14 = i19;
                    }
                } else {
                    i6 = 0;
                }
                long j11 = j10 & i11;
                switch (i17) {
                    case 0:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            V = e5.V(i16 << 3);
                            J = V + 8;
                            i13 += J;
                            break;
                        }
                    case 1:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            V2 = e5.V(i16 << 3);
                            J = V2 + 4;
                            i13 += J;
                            break;
                        }
                    case 2:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j12 = unsafe.getLong(obj, j11);
                            V3 = e5.V(i16 << 3);
                            X = e5.X(j12);
                            J = X + V3;
                            i13 += J;
                            break;
                        }
                    case 3:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j13 = unsafe.getLong(obj, j11);
                            V3 = e5.V(i16 << 3);
                            X = e5.X(j13);
                            J = X + V3;
                            i13 += J;
                            break;
                        }
                    case 4:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i20 = unsafe.getInt(obj, j11);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.o0(i20);
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case 5:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            V = e5.V(i16 << 3);
                            J = V + 8;
                            i13 += J;
                            break;
                        }
                    case 6:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            V2 = e5.V(i16 << 3);
                            J = V2 + 4;
                            i13 += J;
                            break;
                        }
                    case 7:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            V5 = e5.V(i16 << 3);
                            J = V5 + 1;
                            i13 += J;
                            break;
                        }
                    case 8:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j11);
                            if (object instanceof b5) {
                                V6 = e5.V(i16 << 3);
                                m10 = ((b5) object).m();
                                V7 = e5.V(m10);
                                i13 += V7 + m10 + V6;
                                break;
                            } else {
                                V4 = e5.V(i16 << 3);
                                o02 = e5.p0((String) object);
                                J = o02 + V4;
                                i13 += J;
                                break;
                            }
                        }
                    case 9:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            J = h7.J(i16, l(i12), unsafe.getObject(obj, j11));
                            i13 += J;
                            break;
                        }
                    case 10:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            V6 = e5.V(i16 << 3);
                            m10 = ((b5) unsafe.getObject(obj, j11)).m();
                            V7 = e5.V(m10);
                            i13 += V7 + m10 + V6;
                            break;
                        }
                    case 11:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i21 = unsafe.getInt(obj, j11);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.V(i21);
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case 12:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i22 = unsafe.getInt(obj, j11);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.o0(i22);
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case 13:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            V2 = e5.V(i16 << 3);
                            J = V2 + 4;
                            i13 += J;
                            break;
                        }
                    case 14:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            V = e5.V(i16 << 3);
                            J = V + 8;
                            i13 += J;
                            break;
                        }
                    case 15:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i23 = unsafe.getInt(obj, j11);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.V((i23 >> 31) ^ (i23 + i23));
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case 16:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j14 = unsafe.getLong(obj, j11);
                            V3 = e5.V(i16 << 3);
                            X = e5.X((j14 >> 63) ^ (j14 + j14));
                            J = X + V3;
                            i13 += J;
                            break;
                        }
                    case 17:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            J = e5.n0(i16, (v6) unsafe.getObject(obj, j11), l(i12));
                            i13 += J;
                            break;
                        }
                    case 18:
                        J = h7.C(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 19:
                        J = h7.A(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 20:
                        J = h7.H(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 21:
                        J = h7.S(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 22:
                        J = h7.F(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 23:
                        J = h7.C(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 24:
                        J = h7.A(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 25:
                        J = h7.u(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 26:
                        J = h7.P(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 27:
                        J = h7.K(i16, (List) unsafe.getObject(obj, j11), l(i12));
                        i13 += J;
                        break;
                    case 28:
                        J = h7.x(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 29:
                        J = h7.Q(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        J = h7.y(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        J = h7.A(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case 32:
                        J = h7.C(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        J = h7.L(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        J = h7.N(i16, (List) unsafe.getObject(obj, j11));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        D = h7.D((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case 36:
                        D = h7.B((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        D = h7.I((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        D = h7.T((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        D = h7.G((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        D = h7.D((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        D = h7.B((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        D = h7.w((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        D = h7.R((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        D = h7.z((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        D = h7.B((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        D = h7.D((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        D = h7.M((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        D = h7.O((List) unsafe.getObject(obj, j11));
                        if (D <= 0) {
                            break;
                        } else {
                            q02 = e5.q0(i16);
                            V8 = e5.V(D);
                            i10 = V8 + q02 + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        J = h7.E(i16, (List) unsafe.getObject(obj, j11), l(i12));
                        i13 += J;
                        break;
                    case 50:
                        r6.a(unsafe.getObject(obj, j11), m(i12));
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V = e5.V(i16 << 3);
                            J = V + 8;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V2 = e5.V(i16 << 3);
                            J = V2 + 4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            long k10 = k(j11, obj);
                            V3 = e5.V(i16 << 3);
                            X = e5.X(k10);
                            J = X + V3;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            long k11 = k(j11, obj);
                            V3 = e5.V(i16 << 3);
                            X = e5.X(k11);
                            J = X + V3;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            int J2 = J(j11, obj);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.o0(J2);
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V = e5.V(i16 << 3);
                            J = V + 8;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V2 = e5.V(i16 << 3);
                            J = V2 + 4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V5 = e5.V(i16 << 3);
                            J = V5 + 1;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(obj, j11);
                            if (object2 instanceof b5) {
                                V9 = e5.V(i16 << 3);
                                m11 = ((b5) object2).m();
                                V10 = e5.V(m11);
                                i10 = V10 + m11 + V9;
                                i13 += i10;
                                break;
                            } else {
                                V4 = e5.V(i16 << 3);
                                o02 = e5.p0((String) object2);
                                J = o02 + V4;
                                i13 += J;
                                break;
                            }
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            J = h7.J(i16, l(i12), unsafe.getObject(obj, j11));
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V9 = e5.V(i16 << 3);
                            m11 = ((b5) unsafe.getObject(obj, j11)).m();
                            V10 = e5.V(m11);
                            i10 = V10 + m11 + V9;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            int J3 = J(j11, obj);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.V(J3);
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            int J4 = J(j11, obj);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.o0(J4);
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V2 = e5.V(i16 << 3);
                            J = V2 + 4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            V = e5.V(i16 << 3);
                            J = V + 8;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            int J5 = J(j11, obj);
                            V4 = e5.V(i16 << 3);
                            o02 = e5.V((J5 >> 31) ^ (J5 + J5));
                            J = o02 + V4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            long k12 = k(j11, obj);
                            V3 = e5.V(i16 << 3);
                            X = e5.X((k12 >> 63) ^ (k12 + k12));
                            J = X + V3;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (!B(i16, i12, obj)) {
                            break;
                        } else {
                            J = e5.n0(i16, (v6) unsafe.getObject(obj, j11), l(i12));
                            i13 += J;
                            break;
                        }
                }
                i12 += 3;
                i11 = 1048575;
            } else {
                r7 r7Var = this.f8714l;
                int a10 = r7Var.a(r7Var.d(obj)) + i13;
                if (!this.f) {
                    return a10;
                }
                this.f8715m.a(obj);
                throw null;
            }
        }
    }

    public final int I(Object obj) {
        int V;
        int V2;
        int V3;
        int X;
        int V4;
        int o02;
        int V5;
        int V6;
        int m10;
        int V7;
        int J;
        int V8;
        int X2;
        int D;
        int q02;
        int V9;
        int i6;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f8704a;
            if (i10 < iArr.length) {
                int j10 = j(i10);
                int i12 = (j10 >>> 20) & 255;
                int i13 = iArr[i10];
                long j11 = j10 & 1048575;
                if (i12 >= o5.f8532v.a() && i12 <= o5.f8533w.a()) {
                    int i14 = iArr[i10 + 2];
                }
                Unsafe unsafe = f8703o;
                switch (i12) {
                    case 0:
                        if (z(i10, obj)) {
                            V = e5.V(i13 << 3);
                            J = V + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 1:
                        if (z(i10, obj)) {
                            V2 = e5.V(i13 << 3);
                            J = V2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 2:
                        if (z(i10, obj)) {
                            long h10 = y7.h(j11, obj);
                            V3 = e5.V(i13 << 3);
                            X = e5.X(h10);
                            J = X + V3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 3:
                        if (z(i10, obj)) {
                            long h11 = y7.h(j11, obj);
                            V3 = e5.V(i13 << 3);
                            X = e5.X(h11);
                            J = X + V3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 4:
                        if (z(i10, obj)) {
                            int g5 = y7.g(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.o0(g5);
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 5:
                        if (z(i10, obj)) {
                            V = e5.V(i13 << 3);
                            J = V + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 6:
                        if (z(i10, obj)) {
                            V2 = e5.V(i13 << 3);
                            J = V2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 7:
                        if (z(i10, obj)) {
                            V5 = e5.V(i13 << 3);
                            J = V5 + 1;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 8:
                        if (z(i10, obj)) {
                            Object j12 = y7.j(j11, obj);
                            if (j12 instanceof b5) {
                                V6 = e5.V(i13 << 3);
                                m10 = ((b5) j12).m();
                                V7 = e5.V(m10);
                                i6 = V7 + m10 + V6;
                                i11 += i6;
                                i10 += 3;
                            } else {
                                V4 = e5.V(i13 << 3);
                                o02 = e5.p0((String) j12);
                                J = o02 + V4;
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 9:
                        if (z(i10, obj)) {
                            J = h7.J(i13, l(i10), y7.j(j11, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 10:
                        if (z(i10, obj)) {
                            V6 = e5.V(i13 << 3);
                            m10 = ((b5) y7.j(j11, obj)).m();
                            V7 = e5.V(m10);
                            i6 = V7 + m10 + V6;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 11:
                        if (z(i10, obj)) {
                            int g10 = y7.g(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.V(g10);
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 12:
                        if (z(i10, obj)) {
                            int g11 = y7.g(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.o0(g11);
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 13:
                        if (z(i10, obj)) {
                            V2 = e5.V(i13 << 3);
                            J = V2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 14:
                        if (z(i10, obj)) {
                            V = e5.V(i13 << 3);
                            J = V + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 15:
                        if (z(i10, obj)) {
                            int g12 = y7.g(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.V((g12 >> 31) ^ (g12 + g12));
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 16:
                        if (z(i10, obj)) {
                            long h12 = y7.h(j11, obj);
                            V8 = e5.V(i13 << 3);
                            X2 = e5.X((h12 >> 63) ^ (h12 + h12));
                            J = X2 + V8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 17:
                        if (z(i10, obj)) {
                            J = e5.n0(i13, (v6) y7.j(j11, obj), l(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 18:
                        J = h7.C(i13, (List) y7.j(j11, obj));
                        break;
                    case 19:
                        J = h7.A(i13, (List) y7.j(j11, obj));
                        break;
                    case 20:
                        J = h7.H(i13, (List) y7.j(j11, obj));
                        break;
                    case 21:
                        J = h7.S(i13, (List) y7.j(j11, obj));
                        break;
                    case 22:
                        J = h7.F(i13, (List) y7.j(j11, obj));
                        break;
                    case 23:
                        J = h7.C(i13, (List) y7.j(j11, obj));
                        break;
                    case 24:
                        J = h7.A(i13, (List) y7.j(j11, obj));
                        break;
                    case 25:
                        J = h7.u(i13, (List) y7.j(j11, obj));
                        break;
                    case 26:
                        J = h7.P(i13, (List) y7.j(j11, obj));
                        break;
                    case 27:
                        J = h7.K(i13, (List) y7.j(j11, obj), l(i10));
                        break;
                    case 28:
                        J = h7.x(i13, (List) y7.j(j11, obj));
                        break;
                    case 29:
                        J = h7.Q(i13, (List) y7.j(j11, obj));
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        J = h7.y(i13, (List) y7.j(j11, obj));
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        J = h7.A(i13, (List) y7.j(j11, obj));
                        break;
                    case 32:
                        J = h7.C(i13, (List) y7.j(j11, obj));
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        J = h7.L(i13, (List) y7.j(j11, obj));
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        J = h7.N(i13, (List) y7.j(j11, obj));
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        D = h7.D((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 36:
                        D = h7.B((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        D = h7.I((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        D = h7.T((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        D = h7.G((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        D = h7.D((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        D = h7.B((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        D = h7.w((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        D = h7.R((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        D = h7.z((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        D = h7.B((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        D = h7.D((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        D = h7.M((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        D = h7.O((List) unsafe.getObject(obj, j11));
                        if (D > 0) {
                            q02 = e5.q0(i13);
                            V9 = e5.V(D);
                            i6 = V9 + q02 + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        J = h7.E(i13, (List) y7.j(j11, obj), l(i10));
                        break;
                    case 50:
                        r6.a(y7.j(j11, obj), m(i10));
                        continue;
                        i10 += 3;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (B(i13, i10, obj)) {
                            V = e5.V(i13 << 3);
                            J = V + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (B(i13, i10, obj)) {
                            V2 = e5.V(i13 << 3);
                            J = V2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (B(i13, i10, obj)) {
                            long k10 = k(j11, obj);
                            V3 = e5.V(i13 << 3);
                            X = e5.X(k10);
                            J = X + V3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (B(i13, i10, obj)) {
                            long k11 = k(j11, obj);
                            V3 = e5.V(i13 << 3);
                            X = e5.X(k11);
                            J = X + V3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (B(i13, i10, obj)) {
                            int J2 = J(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.o0(J2);
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (B(i13, i10, obj)) {
                            V = e5.V(i13 << 3);
                            J = V + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (B(i13, i10, obj)) {
                            V2 = e5.V(i13 << 3);
                            J = V2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (B(i13, i10, obj)) {
                            V5 = e5.V(i13 << 3);
                            J = V5 + 1;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (B(i13, i10, obj)) {
                            Object j13 = y7.j(j11, obj);
                            if (j13 instanceof b5) {
                                V6 = e5.V(i13 << 3);
                                m10 = ((b5) j13).m();
                                V7 = e5.V(m10);
                                i6 = V7 + m10 + V6;
                                i11 += i6;
                                i10 += 3;
                            } else {
                                V4 = e5.V(i13 << 3);
                                o02 = e5.p0((String) j13);
                                J = o02 + V4;
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (B(i13, i10, obj)) {
                            J = h7.J(i13, l(i10), y7.j(j11, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (B(i13, i10, obj)) {
                            V6 = e5.V(i13 << 3);
                            m10 = ((b5) y7.j(j11, obj)).m();
                            V7 = e5.V(m10);
                            i6 = V7 + m10 + V6;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (B(i13, i10, obj)) {
                            int J3 = J(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.V(J3);
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (B(i13, i10, obj)) {
                            int J4 = J(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.o0(J4);
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (B(i13, i10, obj)) {
                            V2 = e5.V(i13 << 3);
                            J = V2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (B(i13, i10, obj)) {
                            V = e5.V(i13 << 3);
                            J = V + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (B(i13, i10, obj)) {
                            int J5 = J(j11, obj);
                            V4 = e5.V(i13 << 3);
                            o02 = e5.V((J5 >> 31) ^ (J5 + J5));
                            J = o02 + V4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (B(i13, i10, obj)) {
                            long k12 = k(j11, obj);
                            V8 = e5.V(i13 << 3);
                            X2 = e5.X((k12 >> 63) ^ (k12 + k12));
                            J = X2 + V8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (B(i13, i10, obj)) {
                            J = e5.n0(i13, (v6) y7.j(j11, obj), l(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    default:
                        i10 += 3;
                }
                i11 += J;
                i10 += 3;
            } else {
                r7 r7Var = this.f8714l;
                return r7Var.a(r7Var.d(obj)) + i11;
            }
        }
    }

    public final void K(Object obj, int i6, long j10) {
        Object m10 = m(i6);
        Unsafe unsafe = f8703o;
        Object object = unsafe.getObject(obj, j10);
        if (!((q6) object).d()) {
            q6 b10 = q6.a().b();
            r6.b(b10, object);
            unsafe.putObject(obj, j10, b10);
        }
        p6 p6Var = (p6) m10;
        throw null;
    }

    public final int L(Object obj, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        long j11 = this.f8704a[i16 + 2] & 1048575;
        boolean z10 = true;
        Unsafe unsafe = f8703o;
        switch (i15) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i13 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(u4.o(bArr, i6))));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 8;
                }
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i13 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(u4.b(bArr, i6))));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 4;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i13 == 0) {
                    int l2 = u4.l(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zVar.f8265c));
                    unsafe.putInt(obj, j11, i12);
                    return l2;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i13 == 0) {
                    int i17 = u4.i(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zVar.f8264b));
                    unsafe.putInt(obj, j11, i12);
                    return i17;
                }
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i13 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(u4.o(bArr, i6)));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 8;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                if (i13 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(u4.b(bArr, i6)));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 4;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i13 == 0) {
                    int l10 = u4.l(bArr, i6, zVar);
                    if (zVar.f8265c == 0) {
                        z10 = false;
                    }
                    unsafe.putObject(obj, j10, Boolean.valueOf(z10));
                    unsafe.putInt(obj, j11, i12);
                    return l10;
                }
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i13 == 2) {
                    int i18 = u4.i(bArr, i6, zVar);
                    int i19 = zVar.f8264b;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i14 & 536870912) != 0 && !c8.d(i18, bArr, i18 + i19)) {
                        throw zzkp.a();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, i18, i19, c6.f8318a));
                        i18 += i19;
                    }
                    unsafe.putInt(obj, j11, i12);
                    return i18;
                }
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i13 == 2) {
                    Object o10 = o(i12, i16, obj);
                    int n10 = u4.n(o10, l(i16), bArr, i6, i10, zVar);
                    w(i12, obj, o10, i16);
                    return n10;
                }
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i13 == 2) {
                    int a10 = u4.a(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, zVar.f8266d);
                    unsafe.putInt(obj, j11, i12);
                    return a10;
                }
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i13 == 0) {
                    int i20 = u4.i(bArr, i6, zVar);
                    int i21 = zVar.f8264b;
                    int i22 = i16 / 3;
                    y5 y5Var = (y5) this.f8705b[i22 + i22 + 1];
                    if (y5Var != null && !y5Var.a(i21)) {
                        E(obj).c(i11, Long.valueOf(i21));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i21));
                        unsafe.putInt(obj, j11, i12);
                    }
                    return i20;
                }
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i13 == 0) {
                    int i23 = u4.i(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(c5.a(zVar.f8264b)));
                    unsafe.putInt(obj, j11, i12);
                    return i23;
                }
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i13 == 0) {
                    int l11 = u4.l(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Long.valueOf(c5.b(zVar.f8265c)));
                    unsafe.putInt(obj, j11, i12);
                    return l11;
                }
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i13 == 3) {
                    Object o11 = o(i12, i16, obj);
                    int m10 = u4.m(o11, l(i16), bArr, i6, i10, (i11 & (-8)) | 4, zVar);
                    w(i12, obj, o11, i16);
                    return m10;
                }
                break;
        }
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    public final void M(Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj2;
        int i16;
        int i17;
        int i18;
        int i19;
        Unsafe unsafe;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        y6<T> y6Var;
        byte[] bArr2;
        int i25;
        int i26;
        y6<T> y6Var2;
        int i27;
        int i28;
        int l2;
        int i29;
        boolean z10;
        int i30;
        com.google.android.gms.internal.p000firebaseauthapi.z zVar2 = zVar;
        q(obj);
        Unsafe unsafe2 = f8703o;
        y6<T> y6Var3 = this;
        byte[] bArr3 = bArr;
        int i31 = i6;
        int i32 = i10;
        Object obj3 = obj;
        int i33 = -1;
        int i34 = 0;
        int i35 = 1048575;
        int i36 = 0;
        while (i31 < i32) {
            int i37 = i31 + 1;
            byte b11 = bArr3[i31];
            if (b11 < 0) {
                int j10 = u4.j(b11, bArr3, i37, zVar2);
                b10 = zVar2.f8264b;
                i37 = j10;
            } else {
                b10 = b11;
            }
            int i38 = b10 >>> 3;
            int i39 = b10 & 7;
            int i40 = y6Var3.f8707d;
            int i41 = y6Var3.f8706c;
            if (i38 > i33) {
                int i42 = i34 / 3;
                if (i38 >= i41 && i38 <= i40) {
                    i30 = y6Var3.O(i38, i42);
                } else {
                    i30 = -1;
                }
                i13 = i30;
                i14 = -1;
                i11 = 0;
            } else {
                if (i38 >= i41 && i38 <= i40) {
                    i11 = 0;
                    i12 = y6Var3.O(i38, 0);
                } else {
                    i11 = 0;
                    i12 = -1;
                }
                i13 = i12;
                i14 = -1;
            }
            if (i13 == i14) {
                i16 = i38;
                i24 = i37;
                unsafe = unsafe2;
            } else {
                int[] iArr = y6Var3.f8704a;
                int i43 = iArr[i13 + 1];
                int i44 = (i43 >>> 20) & 255;
                long j11 = i43 & 1048575;
                if (i44 <= 17) {
                    int i45 = iArr[i13 + 2];
                    int i46 = 1 << (i45 >>> 20);
                    int i47 = 1048575;
                    int i48 = i45 & 1048575;
                    if (i48 != i35) {
                        if (i35 != 1048575) {
                            unsafe2.putInt(obj3, i35, i36);
                            i47 = 1048575;
                        }
                        i26 = i37;
                        if (i48 != i47) {
                            i36 = unsafe2.getInt(obj3, i48);
                        }
                        i35 = i48;
                    } else {
                        i26 = i37;
                    }
                    switch (i44) {
                        case 0:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 1) {
                                y7.o(obj2, j11, Double.longBitsToDouble(u4.o(bArr3, i27)));
                                i28 = i27 + 8;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 1:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 5) {
                                y7.p(obj2, j11, Float.intBitsToFloat(u4.b(bArr3, i27)));
                                i28 = i27 + 4;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 2:
                        case 3:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                l2 = u4.l(bArr3, i27, zVar2);
                                unsafe2.putLong(obj, j11, zVar2.f8265c);
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 4:
                        case 11:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = u4.i(bArr3, i27, zVar2);
                                unsafe2.putInt(obj2, j11, zVar2.f8264b);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 5:
                        case 14:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 1) {
                                unsafe2.putLong(obj, j11, u4.o(bArr3, i27));
                                i28 = i27 + 8;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i27 = i27;
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 6:
                        case 13:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 5) {
                                unsafe2.putInt(obj2, j11, u4.b(bArr3, i27));
                                i28 = i27 + 4;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i27 = i27;
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 7:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = u4.l(bArr3, i27, zVar2);
                                if (zVar2.f8265c != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                y7.m(obj2, j11, z10);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 8:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 2) {
                                if ((i43 & 536870912) == 0) {
                                    i29 = u4.f(bArr3, i27, zVar2);
                                } else {
                                    i29 = u4.g(bArr3, i27, zVar2);
                                }
                                unsafe2.putObject(obj2, j11, zVar2.f8266d);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 9:
                            i16 = i38;
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            if (i39 == 2) {
                                Object n10 = y6Var2.n(i13, obj2);
                                i29 = u4.n(n10, y6Var2.l(i13), bArr, i27, i10, zVar);
                                y6Var2.v(obj2, i13, n10);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 10:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 2) {
                                i29 = u4.a(bArr3, i27, zVar2);
                                unsafe2.putObject(obj2, j11, zVar2.f8266d);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 12:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = u4.i(bArr3, i27, zVar2);
                                unsafe2.putInt(obj2, j11, zVar2.f8264b);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 15:
                            y6Var2 = y6Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = u4.i(bArr3, i27, zVar2);
                                unsafe2.putInt(obj2, j11, c5.a(zVar2.f8264b));
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 16:
                            if (i39 == 0) {
                                l2 = u4.l(bArr3, i26, zVar2);
                                i16 = i38;
                                y6Var2 = y6Var3;
                                i15 = i32;
                                obj2 = obj3;
                                unsafe2.putLong(obj, j11, c5.b(zVar2.f8265c));
                                i36 |= i46;
                                i31 = l2;
                                y6Var = y6Var2;
                                bArr2 = bArr3;
                                break;
                            }
                        default:
                            i16 = i38;
                            i27 = i26;
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                    }
                    obj3 = obj2;
                    y6Var3 = y6Var;
                    bArr3 = bArr2;
                    unsafe = unsafe2;
                    i34 = i13;
                    i32 = i15;
                    zVar2 = zVar;
                    i33 = i16;
                    unsafe2 = unsafe;
                } else {
                    y6<T> y6Var4 = y6Var3;
                    i15 = i32;
                    obj2 = obj3;
                    i16 = i38;
                    if (i44 == 27) {
                        if (i39 == 2) {
                            b6 b6Var = (b6) unsafe2.getObject(obj2, j11);
                            if (!b6Var.c()) {
                                int size = b6Var.size();
                                if (size == 0) {
                                    i25 = 10;
                                } else {
                                    i25 = size + size;
                                }
                                b6Var = b6Var.k(i25);
                                unsafe2.putObject(obj2, j11, b6Var);
                            }
                            y6Var = y6Var4;
                            bArr2 = bArr3;
                            i31 = u4.d(y6Var4.l(i13), b10, bArr, i37, i10, b6Var, zVar);
                            obj3 = obj2;
                            y6Var3 = y6Var;
                            bArr3 = bArr2;
                            unsafe = unsafe2;
                            i34 = i13;
                            i32 = i15;
                            zVar2 = zVar;
                            i33 = i16;
                            unsafe2 = unsafe;
                        } else {
                            i17 = i37;
                            i18 = i35;
                            i19 = i36;
                            unsafe = unsafe2;
                            i20 = i13;
                        }
                    } else {
                        if (i44 <= 49) {
                            int i49 = i37;
                            i18 = i35;
                            i19 = i36;
                            unsafe = unsafe2;
                            i20 = i13;
                            i31 = N(obj, bArr, i37, i10, b10, i16, i39, i13, i43, i44, j11, zVar);
                            if (i31 != i49) {
                                i21 = i20;
                            } else {
                                i22 = i31;
                                i21 = i20;
                                i24 = i22;
                                i11 = i21;
                                i36 = i19;
                                i35 = i18;
                            }
                        } else {
                            i17 = i37;
                            i18 = i35;
                            i19 = i36;
                            unsafe = unsafe2;
                            i20 = i13;
                            if (i44 == 50) {
                                if (i39 == 2) {
                                    K(obj, i20, j11);
                                    throw null;
                                }
                            } else {
                                i21 = i20;
                                i31 = L(obj, bArr, i17, i10, b10, i16, i39, i43, i44, j11, i20, zVar);
                                if (i31 == i17) {
                                    i22 = i31;
                                    i24 = i22;
                                    i11 = i21;
                                    i36 = i19;
                                    i35 = i18;
                                }
                            }
                        }
                        i23 = i21;
                        i36 = i19;
                        i35 = i18;
                        y6Var3 = this;
                        bArr3 = bArr;
                        i32 = i10;
                        i34 = i23;
                        obj3 = obj;
                        zVar2 = zVar;
                        i33 = i16;
                        unsafe2 = unsafe;
                    }
                    i22 = i17;
                    i21 = i20;
                    i24 = i22;
                    i11 = i21;
                    i36 = i19;
                    i35 = i18;
                }
            }
            i31 = u4.h(b10, bArr, i24, i10, E(obj), zVar);
            i23 = i11;
            y6Var3 = this;
            bArr3 = bArr;
            i32 = i10;
            i34 = i23;
            obj3 = obj;
            zVar2 = zVar;
            i33 = i16;
            unsafe2 = unsafe;
        }
        int i50 = i36;
        Unsafe unsafe3 = unsafe2;
        if (i35 != 1048575) {
            unsafe3.putInt(obj, i35, i50);
        }
        if (i31 == i10) {
            return;
        }
        throw zzkp.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x020f -> B:113:0x0210). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0144 -> B:60:0x0145). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01c1 -> B:93:0x01c2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int N(Object obj, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i6;
        Unsafe unsafe = f8703o;
        b6 b6Var = (b6) unsafe.getObject(obj, j11);
        if (!b6Var.c()) {
            int size = b6Var.size();
            b6Var = b6Var.k(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, b6Var);
        }
        switch (i15) {
            case 18:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                if (i13 == 2) {
                    g5 g5Var = (g5) b6Var;
                    int i23 = u4.i(bArr, i22, zVar);
                    int i24 = zVar.f8264b + i23;
                    while (i23 < i24) {
                        g5Var.g(Double.longBitsToDouble(u4.o(bArr, i23)));
                        i23 += 8;
                    }
                    if (i23 == i24) {
                        return i23;
                    }
                    throw zzkp.d();
                }
                if (i13 == 1) {
                    g5 g5Var2 = (g5) b6Var;
                    g5Var2.g(Double.longBitsToDouble(u4.o(bArr, i6)));
                    while (true) {
                        i16 = i22 + 8;
                        if (i16 < i10) {
                            int i25 = u4.i(bArr, i16, zVar);
                            if (i11 == zVar.f8264b) {
                                g5Var2.g(Double.longBitsToDouble(u4.o(bArr, i25)));
                                i22 = i25;
                            }
                        }
                    }
                    return i16;
                }
                return i22;
            case 19:
            case 36:
                if (i13 == 2) {
                    p5 p5Var = (p5) b6Var;
                    int i26 = u4.i(bArr, i22, zVar);
                    int i27 = zVar.f8264b + i26;
                    while (i26 < i27) {
                        p5Var.g(Float.intBitsToFloat(u4.b(bArr, i26)));
                        i26 += 4;
                    }
                    if (i26 == i27) {
                        return i26;
                    }
                    throw zzkp.d();
                }
                if (i13 == 5) {
                    p5 p5Var2 = (p5) b6Var;
                    p5Var2.g(Float.intBitsToFloat(u4.b(bArr, i6)));
                    while (true) {
                        i17 = i22 + 4;
                        if (i17 < i10) {
                            int i28 = u4.i(bArr, i17, zVar);
                            if (i11 == zVar.f8264b) {
                                p5Var2.g(Float.intBitsToFloat(u4.b(bArr, i28)));
                                i22 = i28;
                            }
                        }
                    }
                    return i17;
                }
                return i22;
            case 20:
            case 21:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i13 == 2) {
                    l6 l6Var = (l6) b6Var;
                    int i29 = u4.i(bArr, i22, zVar);
                    int i30 = zVar.f8264b + i29;
                    while (i29 < i30) {
                        i29 = u4.l(bArr, i29, zVar);
                        l6Var.g(zVar.f8265c);
                    }
                    if (i29 == i30) {
                        return i29;
                    }
                    throw zzkp.d();
                }
                if (i13 == 0) {
                    l6 l6Var2 = (l6) b6Var;
                    int l2 = u4.l(bArr, i22, zVar);
                    l6Var2.g(zVar.f8265c);
                    while (l2 < i10) {
                        int i31 = u4.i(bArr, l2, zVar);
                        if (i11 != zVar.f8264b) {
                            return l2;
                        }
                        l2 = u4.l(bArr, i31, zVar);
                        l6Var2.g(zVar.f8265c);
                    }
                    return l2;
                }
                return i22;
            case 22:
            case 29:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                if (i13 == 2) {
                    return u4.e(bArr, i22, b6Var, zVar);
                }
                if (i13 == 0) {
                    return u4.k(i11, bArr, i6, i10, b6Var, zVar);
                }
                return i22;
            case 23:
            case 32:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                if (i13 == 2) {
                    l6 l6Var3 = (l6) b6Var;
                    int i32 = u4.i(bArr, i22, zVar);
                    int i33 = zVar.f8264b + i32;
                    while (i32 < i33) {
                        l6Var3.g(u4.o(bArr, i32));
                        i32 += 8;
                    }
                    if (i32 == i33) {
                        return i32;
                    }
                    throw zzkp.d();
                }
                if (i13 == 1) {
                    l6 l6Var4 = (l6) b6Var;
                    l6Var4.g(u4.o(bArr, i6));
                    while (true) {
                        i18 = i22 + 8;
                        if (i18 < i10) {
                            int i34 = u4.i(bArr, i18, zVar);
                            if (i11 == zVar.f8264b) {
                                l6Var4.g(u4.o(bArr, i34));
                                i22 = i34;
                            }
                        }
                    }
                    return i18;
                }
                return i22;
            case 24:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                if (i13 == 2) {
                    x5 x5Var = (x5) b6Var;
                    int i35 = u4.i(bArr, i22, zVar);
                    int i36 = zVar.f8264b + i35;
                    while (i35 < i36) {
                        x5Var.g(u4.b(bArr, i35));
                        i35 += 4;
                    }
                    if (i35 == i36) {
                        return i35;
                    }
                    throw zzkp.d();
                }
                if (i13 == 5) {
                    x5 x5Var2 = (x5) b6Var;
                    x5Var2.g(u4.b(bArr, i6));
                    while (true) {
                        i19 = i22 + 4;
                        if (i19 < i10) {
                            int i37 = u4.i(bArr, i19, zVar);
                            if (i11 == zVar.f8264b) {
                                x5Var2.g(u4.b(bArr, i37));
                                i22 = i37;
                            }
                        }
                    }
                    return i19;
                }
                return i22;
            case 25:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                if (i13 == 2) {
                    v4 v4Var = (v4) b6Var;
                    i20 = u4.i(bArr, i22, zVar);
                    int i38 = zVar.f8264b + i20;
                    while (i20 < i38) {
                        i20 = u4.l(bArr, i20, zVar);
                        v4Var.g(zVar.f8265c != 0);
                    }
                    if (i20 != i38) {
                        throw zzkp.d();
                    }
                    return i20;
                }
                if (i13 == 0) {
                    v4 v4Var2 = (v4) b6Var;
                    int l10 = u4.l(bArr, i22, zVar);
                    v4Var2.g(zVar.f8265c != 0);
                    while (l10 < i10) {
                        int i39 = u4.i(bArr, l10, zVar);
                        if (i11 != zVar.f8264b) {
                            return l10;
                        }
                        l10 = u4.l(bArr, i39, zVar);
                        v4Var2.g(zVar.f8265c != 0);
                    }
                    return l10;
                }
                return i22;
            case 26:
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        i22 = u4.i(bArr, i22, zVar);
                        int i40 = zVar.f8264b;
                        if (i40 < 0) {
                            throw zzkp.b();
                        }
                        if (i40 == 0) {
                            b6Var.add("");
                            while (i22 < i10) {
                                int i41 = u4.i(bArr, i22, zVar);
                                if (i11 == zVar.f8264b) {
                                    i22 = u4.i(bArr, i41, zVar);
                                    i40 = zVar.f8264b;
                                    if (i40 < 0) {
                                        throw zzkp.b();
                                    }
                                    if (i40 == 0) {
                                        b6Var.add("");
                                    } else {
                                        b6Var.add(new String(bArr, i22, i40, c6.f8318a));
                                        i22 += i40;
                                        while (i22 < i10) {
                                        }
                                    }
                                }
                            }
                        } else {
                            b6Var.add(new String(bArr, i22, i40, c6.f8318a));
                            i22 += i40;
                            while (i22 < i10) {
                            }
                        }
                    } else {
                        i22 = u4.i(bArr, i22, zVar);
                        int i42 = zVar.f8264b;
                        if (i42 < 0) {
                            throw zzkp.b();
                        }
                        if (i42 == 0) {
                            b6Var.add("");
                            while (i22 < i10) {
                                int i43 = u4.i(bArr, i22, zVar);
                                if (i11 == zVar.f8264b) {
                                    i22 = u4.i(bArr, i43, zVar);
                                    int i44 = zVar.f8264b;
                                    if (i44 < 0) {
                                        throw zzkp.b();
                                    }
                                    if (i44 == 0) {
                                        b6Var.add("");
                                    } else {
                                        i21 = i22 + i44;
                                        if (c8.d(i22, bArr, i21)) {
                                            b6Var.add(new String(bArr, i22, i44, c6.f8318a));
                                            i22 = i21;
                                            while (i22 < i10) {
                                            }
                                        } else {
                                            throw zzkp.a();
                                        }
                                    }
                                }
                            }
                        } else {
                            i21 = i22 + i42;
                            if (c8.d(i22, bArr, i21)) {
                                b6Var.add(new String(bArr, i22, i42, c6.f8318a));
                                i22 = i21;
                                while (i22 < i10) {
                                }
                            } else {
                                throw zzkp.a();
                            }
                        }
                    }
                }
                return i22;
            case 27:
                if (i13 == 2) {
                    return u4.d(l(i14), i11, bArr, i6, i10, b6Var, zVar);
                }
                return i22;
            case 28:
                if (i13 == 2) {
                    int i45 = u4.i(bArr, i22, zVar);
                    int i46 = zVar.f8264b;
                    if (i46 >= 0) {
                        if (i46 <= bArr.length - i45) {
                            if (i46 == 0) {
                                b6Var.add(b5.f8311v);
                                while (i45 < i10) {
                                    int i47 = u4.i(bArr, i45, zVar);
                                    if (i11 != zVar.f8264b) {
                                        return i45;
                                    }
                                    i45 = u4.i(bArr, i47, zVar);
                                    i46 = zVar.f8264b;
                                    if (i46 >= 0) {
                                        if (i46 > bArr.length - i45) {
                                            throw zzkp.d();
                                        }
                                        if (i46 == 0) {
                                            b6Var.add(b5.f8311v);
                                        } else {
                                            b6Var.add(b5.z(i45, bArr, i46));
                                            i45 += i46;
                                            while (i45 < i10) {
                                            }
                                        }
                                    } else {
                                        throw zzkp.b();
                                    }
                                }
                                return i45;
                            }
                            b6Var.add(b5.z(i45, bArr, i46));
                            i45 += i46;
                            while (i45 < i10) {
                            }
                            return i45;
                        }
                        throw zzkp.d();
                    }
                    throw zzkp.b();
                }
                return i22;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        i20 = u4.k(i11, bArr, i6, i10, b6Var, zVar);
                    }
                    return i22;
                }
                i20 = u4.e(bArr, i22, b6Var, zVar);
                int i48 = i14 / 3;
                h7.a(obj, i12, b6Var, (y5) this.f8705b[i48 + i48 + 1], this.f8714l);
                return i20;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                if (i13 == 2) {
                    x5 x5Var3 = (x5) b6Var;
                    int i49 = u4.i(bArr, i22, zVar);
                    int i50 = zVar.f8264b + i49;
                    while (i49 < i50) {
                        i49 = u4.i(bArr, i49, zVar);
                        x5Var3.g(c5.a(zVar.f8264b));
                    }
                    if (i49 == i50) {
                        return i49;
                    }
                    throw zzkp.d();
                }
                if (i13 == 0) {
                    x5 x5Var4 = (x5) b6Var;
                    int i51 = u4.i(bArr, i22, zVar);
                    x5Var4.g(c5.a(zVar.f8264b));
                    while (i51 < i10) {
                        int i52 = u4.i(bArr, i51, zVar);
                        if (i11 != zVar.f8264b) {
                            return i51;
                        }
                        i51 = u4.i(bArr, i52, zVar);
                        x5Var4.g(c5.a(zVar.f8264b));
                    }
                    return i51;
                }
                return i22;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                if (i13 == 2) {
                    l6 l6Var5 = (l6) b6Var;
                    int i53 = u4.i(bArr, i22, zVar);
                    int i54 = zVar.f8264b + i53;
                    while (i53 < i54) {
                        i53 = u4.l(bArr, i53, zVar);
                        l6Var5.g(c5.b(zVar.f8265c));
                    }
                    if (i53 == i54) {
                        return i53;
                    }
                    throw zzkp.d();
                }
                if (i13 == 0) {
                    l6 l6Var6 = (l6) b6Var;
                    int l11 = u4.l(bArr, i22, zVar);
                    l6Var6.g(c5.b(zVar.f8265c));
                    while (l11 < i10) {
                        int i55 = u4.i(bArr, l11, zVar);
                        if (i11 != zVar.f8264b) {
                            return l11;
                        }
                        l11 = u4.l(bArr, i55, zVar);
                        l6Var6.g(c5.b(zVar.f8265c));
                    }
                    return l11;
                }
                return i22;
            default:
                if (i13 == 3) {
                    g7 l12 = l(i14);
                    int i56 = (i11 & (-8)) | 4;
                    int c10 = u4.c(l12, bArr, i6, i10, i56, zVar);
                    b6Var.add(zVar.f8266d);
                    while (c10 < i10) {
                        int i57 = u4.i(bArr, c10, zVar);
                        if (i11 != zVar.f8264b) {
                            return c10;
                        }
                        c10 = u4.c(l12, bArr, i57, i10, i56, zVar);
                        b6Var.add(zVar.f8266d);
                    }
                    return c10;
                }
                return i22;
        }
    }

    public final int O(int i6, int i10) {
        int[] iArr = this.f8704a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i6 == i13) {
                return i12;
            }
            if (i6 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void a(Object obj) {
        if (!A(obj)) {
            return;
        }
        if (obj instanceof w5) {
            w5 w5Var = (w5) obj;
            w5Var.o();
            w5Var.zzb = 0;
            w5Var.m();
        }
        int length = this.f8704a.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int j10 = j(i6);
            long j11 = 1048575 & j10;
            int i10 = (j10 >>> 20) & 255;
            Unsafe unsafe = f8703o;
            if (i10 != 9) {
                switch (i10) {
                    case 17:
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
                        this.f8713k.a(j11, obj);
                        continue;
                    case 50:
                        Object object = unsafe.getObject(obj, j11);
                        if (object != null) {
                            ((q6) object).c();
                            unsafe.putObject(obj, j11, object);
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (z(i6, obj)) {
                l(i6).a(unsafe.getObject(obj, j11));
            }
        }
        this.f8714l.g(obj);
        if (this.f) {
            this.f8715m.b(obj);
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
    @Override // com.google.android.gms.internal.measurement.g7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(Object obj) {
        int i6;
        int a10;
        int hashCode;
        int[] iArr = this.f8704a;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int j10 = j(i11);
            int i12 = iArr[i11];
            long j11 = 1048575 & j10;
            int i13 = 1231;
            switch ((j10 >>> 20) & 255) {
                case 0:
                    i6 = i10 * 53;
                    a10 = c6.a(Double.doubleToLongBits(y7.e(j11, obj)));
                    i10 = a10 + i6;
                    break;
                case 1:
                    i6 = i10 * 53;
                    a10 = Float.floatToIntBits(y7.f(j11, obj));
                    i10 = a10 + i6;
                    break;
                case 2:
                    i6 = i10 * 53;
                    a10 = c6.a(y7.h(j11, obj));
                    i10 = a10 + i6;
                    break;
                case 3:
                    i6 = i10 * 53;
                    a10 = c6.a(y7.h(j11, obj));
                    i10 = a10 + i6;
                    break;
                case 4:
                    i6 = i10 * 53;
                    a10 = y7.g(j11, obj);
                    i10 = a10 + i6;
                    break;
                case 5:
                    i6 = i10 * 53;
                    a10 = c6.a(y7.h(j11, obj));
                    i10 = a10 + i6;
                    break;
                case 6:
                    i6 = i10 * 53;
                    a10 = y7.g(j11, obj);
                    i10 = a10 + i6;
                    break;
                case 7:
                    i6 = i10 * 53;
                    boolean t3 = y7.t(j11, obj);
                    Charset charset = c6.f8318a;
                    break;
                case 8:
                    i6 = i10 * 53;
                    a10 = ((String) y7.j(j11, obj)).hashCode();
                    i10 = a10 + i6;
                    break;
                case 9:
                    Object j12 = y7.j(j11, obj);
                    if (j12 != null) {
                        hashCode = j12.hashCode();
                        i10 = (i10 * 53) + hashCode;
                        break;
                    }
                    hashCode = 37;
                    i10 = (i10 * 53) + hashCode;
                case 10:
                    i6 = i10 * 53;
                    a10 = y7.j(j11, obj).hashCode();
                    i10 = a10 + i6;
                    break;
                case 11:
                    i6 = i10 * 53;
                    a10 = y7.g(j11, obj);
                    i10 = a10 + i6;
                    break;
                case 12:
                    i6 = i10 * 53;
                    a10 = y7.g(j11, obj);
                    i10 = a10 + i6;
                    break;
                case 13:
                    i6 = i10 * 53;
                    a10 = y7.g(j11, obj);
                    i10 = a10 + i6;
                    break;
                case 14:
                    i6 = i10 * 53;
                    a10 = c6.a(y7.h(j11, obj));
                    i10 = a10 + i6;
                    break;
                case 15:
                    i6 = i10 * 53;
                    a10 = y7.g(j11, obj);
                    i10 = a10 + i6;
                    break;
                case 16:
                    i6 = i10 * 53;
                    a10 = c6.a(y7.h(j11, obj));
                    i10 = a10 + i6;
                    break;
                case 17:
                    Object j13 = y7.j(j11, obj);
                    if (j13 != null) {
                        hashCode = j13.hashCode();
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
                    a10 = y7.j(j11, obj).hashCode();
                    i10 = a10 + i6;
                    break;
                case 50:
                    i6 = i10 * 53;
                    a10 = y7.j(j11, obj).hashCode();
                    i10 = a10 + i6;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = c6.a(Double.doubleToLongBits(((Double) y7.j(j11, obj)).doubleValue()));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = Float.floatToIntBits(((Float) y7.j(j11, obj)).floatValue());
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = c6.a(k(j11, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = c6.a(k(j11, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = J(j11, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = c6.a(k(j11, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = J(j11, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        boolean booleanValue = ((Boolean) y7.j(j11, obj)).booleanValue();
                        Charset charset2 = c6.f8318a;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = ((String) y7.j(j11, obj)).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = y7.j(j11, obj).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = y7.j(j11, obj).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = J(j11, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = J(j11, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = J(j11, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = c6.a(k(j11, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = J(j11, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = c6.a(k(j11, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (B(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = y7.j(j11, obj).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode2 = this.f8714l.d(obj).hashCode() + (i10 * 53);
        if (!this.f) {
            return hashCode2;
        }
        this.f8715m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final boolean c(Object obj) {
        boolean z10;
        int i6 = 0;
        int i10 = 1048575;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i6 < this.f8711i) {
                int i12 = this.f8710h[i6];
                int[] iArr = this.f8704a;
                int i13 = iArr[i12];
                int j10 = j(i12);
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                int i16 = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    if (i15 != 1048575) {
                        i11 = f8703o.getInt(obj, i15);
                    }
                    i10 = i15;
                }
                if ((268435456 & j10) != 0) {
                    if (i10 == 1048575) {
                        z10 = z(i12, obj);
                    } else if ((i11 & i16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                int i17 = (j10 >>> 20) & 255;
                if (i17 != 9 && i17 != 17) {
                    if (i17 != 27) {
                        if (i17 != 60 && i17 != 68) {
                            if (i17 != 49) {
                                if (i17 == 50 && !((q6) y7.j(j10 & 1048575, obj)).isEmpty()) {
                                    p6 p6Var = (p6) m(i12);
                                    throw null;
                                }
                            }
                        } else if (B(i13, i12, obj) && !l(i12).c(y7.j(j10 & 1048575, obj))) {
                            return false;
                        }
                    }
                    List list = (List) y7.j(j10 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        g7 l2 = l(i12);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (!l2.c(list.get(i18))) {
                                return false;
                            }
                        }
                        continue;
                    }
                } else {
                    if (i10 == 1048575) {
                        z11 = z(i12, obj);
                    } else if ((i11 & i16) == 0) {
                        z11 = false;
                    }
                    if (z11 && !l(i12).c(y7.j(j10 & 1048575, obj))) {
                        return false;
                    }
                }
                i6++;
            } else if (!this.f) {
                return true;
            } else {
                this.f8715m.a(obj);
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final w5 d() {
        return (w5) ((w5) this.f8708e).t(4);
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final int e(Object obj) {
        if (this.f8709g) {
            return I(obj);
        }
        return H(obj);
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void f(Object obj, Object obj2) {
        q(obj);
        obj2.getClass();
        int i6 = 0;
        while (true) {
            int[] iArr = this.f8704a;
            if (i6 < iArr.length) {
                int j10 = j(i6);
                long j11 = 1048575 & j10;
                int i10 = iArr[i6];
                switch ((j10 >>> 20) & 255) {
                    case 0:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.o(obj, j11, y7.e(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 1:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.p(obj, j11, y7.f(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 2:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.f8718c.h(obj, j11, y7.h(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 3:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.f8718c.h(obj, j11, y7.h(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 4:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.q(y7.g(j11, obj2), j11, obj);
                            t(i6, obj);
                            break;
                        }
                    case 5:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.f8718c.h(obj, j11, y7.h(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 6:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.q(y7.g(j11, obj2), j11, obj);
                            t(i6, obj);
                            break;
                        }
                    case 7:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.m(obj, j11, y7.t(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 8:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.r(j11, obj, y7.j(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 9:
                        r(obj, i6, obj2);
                        break;
                    case 10:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.r(j11, obj, y7.j(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 11:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.q(y7.g(j11, obj2), j11, obj);
                            t(i6, obj);
                            break;
                        }
                    case 12:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.q(y7.g(j11, obj2), j11, obj);
                            t(i6, obj);
                            break;
                        }
                    case 13:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.q(y7.g(j11, obj2), j11, obj);
                            t(i6, obj);
                            break;
                        }
                    case 14:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.f8718c.h(obj, j11, y7.h(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 15:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.q(y7.g(j11, obj2), j11, obj);
                            t(i6, obj);
                            break;
                        }
                    case 16:
                        if (!z(i6, obj2)) {
                            break;
                        } else {
                            y7.f8718c.h(obj, j11, y7.h(j11, obj2));
                            t(i6, obj);
                            break;
                        }
                    case 17:
                        r(obj, i6, obj2);
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
                        this.f8713k.b(j11, obj, obj2);
                        break;
                    case 50:
                        Class cls = h7.f8413a;
                        y7.r(j11, obj, r6.b(y7.j(j11, obj), y7.j(j11, obj2)));
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
                        if (!B(i10, i6, obj2)) {
                            break;
                        } else {
                            y7.r(j11, obj, y7.j(j11, obj2));
                            u(i10, i6, obj);
                            break;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        s(obj, i6, obj2);
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!B(i10, i6, obj2)) {
                            break;
                        } else {
                            y7.r(j11, obj, y7.j(j11, obj2));
                            u(i10, i6, obj);
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        s(obj, i6, obj2);
                        break;
                }
                i6 += 3;
            } else {
                Class cls2 = h7.f8413a;
                r7 r7Var = this.f8714l;
                r7Var.h(obj, r7Var.e(r7Var.d(obj), r7Var.d(obj2)));
                if (!this.f) {
                    return;
                }
                this.f8715m.a(obj2);
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final boolean g(Object obj, Object obj2) {
        boolean t3;
        int[] iArr = this.f8704a;
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int j10 = j(i6);
            long j11 = j10 & 1048575;
            switch ((j10 >>> 20) & 255) {
                case 0:
                    if (y(obj, i6, obj2) && Double.doubleToLongBits(y7.e(j11, obj)) == Double.doubleToLongBits(y7.e(j11, obj2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (y(obj, i6, obj2) && Float.floatToIntBits(y7.f(j11, obj)) == Float.floatToIntBits(y7.f(j11, obj2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (y(obj, i6, obj2) && y7.h(j11, obj) == y7.h(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (y(obj, i6, obj2) && y7.h(j11, obj) == y7.h(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (y(obj, i6, obj2) && y7.g(j11, obj) == y7.g(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (y(obj, i6, obj2) && y7.h(j11, obj) == y7.h(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (y(obj, i6, obj2) && y7.g(j11, obj) == y7.g(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (y(obj, i6, obj2) && y7.t(j11, obj) == y7.t(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (y(obj, i6, obj2) && h7.t(y7.j(j11, obj), y7.j(j11, obj2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (y(obj, i6, obj2) && h7.t(y7.j(j11, obj), y7.j(j11, obj2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (y(obj, i6, obj2) && h7.t(y7.j(j11, obj), y7.j(j11, obj2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (y(obj, i6, obj2) && y7.g(j11, obj) == y7.g(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (y(obj, i6, obj2) && y7.g(j11, obj) == y7.g(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (y(obj, i6, obj2) && y7.g(j11, obj) == y7.g(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (y(obj, i6, obj2) && y7.h(j11, obj) == y7.h(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (y(obj, i6, obj2) && y7.g(j11, obj) == y7.g(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (y(obj, i6, obj2) && y7.h(j11, obj) == y7.h(j11, obj2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (y(obj, i6, obj2) && h7.t(y7.j(j11, obj), y7.j(j11, obj2))) {
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
                    t3 = h7.t(y7.j(j11, obj), y7.j(j11, obj2));
                    break;
                case 50:
                    t3 = h7.t(y7.j(j11, obj), y7.j(j11, obj2));
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
                    long j12 = iArr[i6 + 2] & 1048575;
                    if (y7.g(j12, obj) == y7.g(j12, obj2) && h7.t(y7.j(j11, obj), y7.j(j11, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!t3) {
                return false;
            }
        }
        r7 r7Var = this.f8714l;
        if (!r7Var.d(obj).equals(r7Var.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        j5 j5Var = this.f8715m;
        j5Var.a(obj);
        j5Var.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void h(Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        if (this.f8709g) {
            M(obj, bArr, i6, i10, zVar);
        } else {
            D(obj, bArr, i6, i10, 0, zVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final void i(Object obj, f5 f5Var) {
        if (this.f8709g) {
            if (!this.f) {
                int[] iArr = this.f8704a;
                int length = iArr.length;
                for (int i6 = 0; i6 < length; i6 += 3) {
                    int j10 = j(i6);
                    int i10 = iArr[i6];
                    switch ((j10 >>> 20) & 255) {
                        case 0:
                            if (z(i6, obj)) {
                                f5Var.g(y7.e(j10 & 1048575, obj), i10);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (z(i6, obj)) {
                                f5Var.k(y7.f(j10 & 1048575, obj), i10);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (z(i6, obj)) {
                                f5Var.n(i10, y7.h(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (z(i6, obj)) {
                                f5Var.d(i10, y7.h(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (z(i6, obj)) {
                                f5Var.m(i10, y7.g(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (z(i6, obj)) {
                                f5Var.j(i10, y7.h(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (z(i6, obj)) {
                                f5Var.i(i10, y7.g(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (z(i6, obj)) {
                                f5Var.e(i10, y7.t(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (z(i6, obj)) {
                                C(i10, y7.j(j10 & 1048575, obj), f5Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (z(i6, obj)) {
                                f5Var.o(i10, l(i6), y7.j(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (z(i6, obj)) {
                                f5Var.f(i10, (b5) y7.j(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (z(i6, obj)) {
                                f5Var.c(i10, y7.g(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (z(i6, obj)) {
                                f5Var.h(i10, y7.g(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (z(i6, obj)) {
                                f5Var.p(i10, y7.g(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (z(i6, obj)) {
                                f5Var.q(i10, y7.h(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (z(i6, obj)) {
                                f5Var.a(i10, y7.g(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (z(i6, obj)) {
                                f5Var.b(i10, y7.h(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (z(i6, obj)) {
                                f5Var.l(i10, l(i6), y7.j(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            h7.d(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 19:
                            h7.h(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 20:
                            h7.k(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 21:
                            h7.s(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 22:
                            h7.j(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 23:
                            h7.g(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 24:
                            h7.f(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 25:
                            h7.b(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 26:
                            h7.q(i10, (List) y7.j(j10 & 1048575, obj), f5Var);
                            break;
                        case 27:
                            h7.l(i10, (List) y7.j(j10 & 1048575, obj), f5Var, l(i6));
                            break;
                        case 28:
                            h7.c(i10, (List) y7.j(j10 & 1048575, obj), f5Var);
                            break;
                        case 29:
                            h7.r(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            h7.e(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            h7.m(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case 32:
                            h7.n(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            h7.o(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            h7.p(i10, (List) y7.j(j10 & 1048575, obj), f5Var, false);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            h7.d(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case 36:
                            h7.h(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            h7.k(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            h7.s(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            h7.j(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            h7.g(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            h7.f(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            h7.b(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            h7.r(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            h7.e(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            h7.m(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            h7.n(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            h7.o(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            h7.p(i10, (List) y7.j(j10 & 1048575, obj), f5Var, true);
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            h7.i(i10, (List) y7.j(j10 & 1048575, obj), f5Var, l(i6));
                            break;
                        case 50:
                            if (y7.j(j10 & 1048575, obj) != null) {
                                p6 p6Var = (p6) m(i6);
                                throw null;
                            }
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            if (B(i10, i6, obj)) {
                                f5Var.g(((Double) y7.j(j10 & 1048575, obj)).doubleValue(), i10);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            if (B(i10, i6, obj)) {
                                f5Var.k(((Float) y7.j(j10 & 1048575, obj)).floatValue(), i10);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            if (B(i10, i6, obj)) {
                                f5Var.n(i10, k(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            if (B(i10, i6, obj)) {
                                f5Var.d(i10, k(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            if (B(i10, i6, obj)) {
                                f5Var.m(i10, J(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            if (B(i10, i6, obj)) {
                                f5Var.j(i10, k(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            if (B(i10, i6, obj)) {
                                f5Var.i(i10, J(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            if (B(i10, i6, obj)) {
                                f5Var.e(i10, ((Boolean) y7.j(j10 & 1048575, obj)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            if (B(i10, i6, obj)) {
                                C(i10, y7.j(j10 & 1048575, obj), f5Var);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            if (B(i10, i6, obj)) {
                                f5Var.o(i10, l(i6), y7.j(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            if (B(i10, i6, obj)) {
                                f5Var.f(i10, (b5) y7.j(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            if (B(i10, i6, obj)) {
                                f5Var.c(i10, J(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            if (B(i10, i6, obj)) {
                                f5Var.h(i10, J(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            if (B(i10, i6, obj)) {
                                f5Var.p(i10, J(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            if (B(i10, i6, obj)) {
                                f5Var.q(i10, k(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            if (B(i10, i6, obj)) {
                                f5Var.a(i10, J(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            if (B(i10, i6, obj)) {
                                f5Var.b(i10, k(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            if (B(i10, i6, obj)) {
                                f5Var.l(i10, l(i6), y7.j(j10 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                r7 r7Var = this.f8714l;
                r7Var.i(r7Var.d(obj), f5Var);
                return;
            }
            this.f8715m.a(obj);
            throw null;
        }
        x(obj, f5Var);
    }

    public final int j(int i6) {
        return this.f8704a[i6 + 1];
    }

    public final g7 l(int i6) {
        int i10 = i6 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f8705b;
        g7 g7Var = (g7) objArr[i11];
        if (g7Var != null) {
            return g7Var;
        }
        g7 a10 = d7.f8338c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object m(int i6) {
        int i10 = i6 / 3;
        return this.f8705b[i10 + i10];
    }

    public final Object n(int i6, Object obj) {
        g7 l2 = l(i6);
        long j10 = j(i6) & 1048575;
        if (!z(i6, obj)) {
            return l2.d();
        }
        Object object = f8703o.getObject(obj, j10);
        if (A(object)) {
            return object;
        }
        w5 d10 = l2.d();
        if (object != null) {
            l2.f(d10, object);
        }
        return d10;
    }

    public final Object o(int i6, int i10, Object obj) {
        g7 l2 = l(i10);
        if (!B(i6, i10, obj)) {
            return l2.d();
        }
        Object object = f8703o.getObject(obj, j(i10) & 1048575);
        if (A(object)) {
            return object;
        }
        w5 d10 = l2.d();
        if (object != null) {
            l2.f(d10, object);
        }
        return d10;
    }

    public final void r(Object obj, int i6, Object obj2) {
        if (!z(i6, obj2)) {
            return;
        }
        long j10 = j(i6) & 1048575;
        Unsafe unsafe = f8703o;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            g7 l2 = l(i6);
            if (!z(i6, obj)) {
                if (!A(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    w5 d10 = l2.d();
                    l2.f(d10, object);
                    unsafe.putObject(obj, j10, d10);
                }
                t(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!A(object2)) {
                w5 d11 = l2.d();
                l2.f(d11, object2);
                unsafe.putObject(obj, j10, d11);
                object2 = d11;
            }
            l2.f(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f8704a[i6] + " is present but null: " + obj2.toString());
    }

    public final void s(Object obj, int i6, Object obj2) {
        int[] iArr = this.f8704a;
        int i10 = iArr[i6];
        if (!B(i10, i6, obj2)) {
            return;
        }
        long j10 = j(i6) & 1048575;
        Unsafe unsafe = f8703o;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            g7 l2 = l(i6);
            if (!B(i10, i6, obj)) {
                if (!A(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    w5 d10 = l2.d();
                    l2.f(d10, object);
                    unsafe.putObject(obj, j10, d10);
                }
                u(i10, i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!A(object2)) {
                w5 d11 = l2.d();
                l2.f(d11, object2);
                unsafe.putObject(obj, j10, d11);
                object2 = d11;
            }
            l2.f(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + obj2.toString());
    }

    public final void t(int i6, Object obj) {
        int i10 = this.f8704a[i6 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        y7.q((1 << (i10 >>> 20)) | y7.g(j10, obj), j10, obj);
    }

    public final void u(int i6, int i10, Object obj) {
        y7.q(i6, this.f8704a[i10 + 2] & 1048575, obj);
    }

    public final void v(Object obj, int i6, Object obj2) {
        f8703o.putObject(obj, j(i6) & 1048575, obj2);
        t(i6, obj);
    }

    public final void w(int i6, Object obj, Object obj2, int i10) {
        f8703o.putObject(obj, j(i10) & 1048575, obj2);
        u(i6, i10, obj);
    }

    public final void x(Object obj, f5 f5Var) {
        int i6;
        if (!this.f) {
            int[] iArr = this.f8704a;
            int length = iArr.length;
            int i10 = 1048575;
            int i11 = 0;
            int i12 = 1048575;
            int i13 = 0;
            while (i11 < length) {
                int j10 = j(i11);
                int i14 = iArr[i11];
                int i15 = (j10 >>> 20) & 255;
                Unsafe unsafe = f8703o;
                if (i15 <= 17) {
                    int i16 = iArr[i11 + 2];
                    int i17 = i16 & i10;
                    if (i17 != i12) {
                        i13 = unsafe.getInt(obj, i17);
                        i12 = i17;
                    }
                    i6 = 1 << (i16 >>> 20);
                } else {
                    i6 = 0;
                }
                long j11 = j10 & i10;
                switch (i15) {
                    case 0:
                        if ((i6 & i13) != 0) {
                            f5Var.g(y7.e(j11, obj), i14);
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 1:
                        if ((i6 & i13) != 0) {
                            f5Var.k(y7.f(j11, obj), i14);
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 2:
                        if ((i6 & i13) != 0) {
                            f5Var.n(i14, unsafe.getLong(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 3:
                        if ((i6 & i13) != 0) {
                            f5Var.d(i14, unsafe.getLong(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 4:
                        if ((i6 & i13) != 0) {
                            f5Var.m(i14, unsafe.getInt(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 5:
                        if ((i6 & i13) != 0) {
                            f5Var.j(i14, unsafe.getLong(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 6:
                        if ((i6 & i13) != 0) {
                            f5Var.i(i14, unsafe.getInt(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 7:
                        if ((i6 & i13) != 0) {
                            f5Var.e(i14, y7.t(j11, obj));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 8:
                        if ((i6 & i13) != 0) {
                            C(i14, unsafe.getObject(obj, j11), f5Var);
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 9:
                        if ((i6 & i13) != 0) {
                            f5Var.o(i14, l(i11), unsafe.getObject(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 10:
                        if ((i6 & i13) != 0) {
                            f5Var.f(i14, (b5) unsafe.getObject(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 11:
                        if ((i6 & i13) != 0) {
                            f5Var.c(i14, unsafe.getInt(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 12:
                        if ((i6 & i13) != 0) {
                            f5Var.h(i14, unsafe.getInt(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 13:
                        if ((i6 & i13) != 0) {
                            f5Var.p(i14, unsafe.getInt(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 14:
                        if ((i6 & i13) != 0) {
                            f5Var.q(i14, unsafe.getLong(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 15:
                        if ((i6 & i13) != 0) {
                            f5Var.a(i14, unsafe.getInt(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 16:
                        if ((i6 & i13) != 0) {
                            f5Var.b(i14, unsafe.getLong(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 17:
                        if ((i6 & i13) != 0) {
                            f5Var.l(i14, l(i11), unsafe.getObject(obj, j11));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 18:
                        h7.d(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 19:
                        h7.h(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 20:
                        h7.k(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 21:
                        h7.s(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 22:
                        h7.j(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 23:
                        h7.g(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 24:
                        h7.f(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 25:
                        h7.b(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 26:
                        h7.q(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var);
                        break;
                    case 27:
                        h7.l(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, l(i11));
                        break;
                    case 28:
                        h7.c(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var);
                        break;
                    case 29:
                        h7.r(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        h7.e(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        h7.m(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        break;
                    case 32:
                        h7.n(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        h7.o(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        h7.p(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, false);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        h7.d(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case 36:
                        h7.h(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        h7.k(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        h7.s(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        h7.j(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        h7.g(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        h7.f(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        h7.b(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        h7.r(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        h7.e(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        h7.m(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        h7.n(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        h7.o(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        h7.p(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, true);
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        h7.i(iArr[i11], (List) unsafe.getObject(obj, j11), f5Var, l(i11));
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j11) != null) {
                            p6 p6Var = (p6) m(i11);
                            throw null;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (B(i14, i11, obj)) {
                            f5Var.g(((Double) y7.j(j11, obj)).doubleValue(), i14);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (B(i14, i11, obj)) {
                            f5Var.k(((Float) y7.j(j11, obj)).floatValue(), i14);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (B(i14, i11, obj)) {
                            f5Var.n(i14, k(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (B(i14, i11, obj)) {
                            f5Var.d(i14, k(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (B(i14, i11, obj)) {
                            f5Var.m(i14, J(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (B(i14, i11, obj)) {
                            f5Var.j(i14, k(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (B(i14, i11, obj)) {
                            f5Var.i(i14, J(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (B(i14, i11, obj)) {
                            f5Var.e(i14, ((Boolean) y7.j(j11, obj)).booleanValue());
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (B(i14, i11, obj)) {
                            C(i14, unsafe.getObject(obj, j11), f5Var);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (B(i14, i11, obj)) {
                            f5Var.o(i14, l(i11), unsafe.getObject(obj, j11));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (B(i14, i11, obj)) {
                            f5Var.f(i14, (b5) unsafe.getObject(obj, j11));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (B(i14, i11, obj)) {
                            f5Var.c(i14, J(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (B(i14, i11, obj)) {
                            f5Var.h(i14, J(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (B(i14, i11, obj)) {
                            f5Var.p(i14, J(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (B(i14, i11, obj)) {
                            f5Var.q(i14, k(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (B(i14, i11, obj)) {
                            f5Var.a(i14, J(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (B(i14, i11, obj)) {
                            f5Var.b(i14, k(j11, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (B(i14, i11, obj)) {
                            f5Var.l(i14, l(i11), unsafe.getObject(obj, j11));
                            break;
                        }
                        break;
                }
                i11 += 3;
                i10 = 1048575;
            }
            r7 r7Var = this.f8714l;
            r7Var.i(r7Var.d(obj), f5Var);
            return;
        }
        this.f8715m.a(obj);
        throw null;
    }

    public final boolean y(Object obj, int i6, Object obj2) {
        if (z(i6, obj) == z(i6, obj2)) {
            return true;
        }
        return false;
    }

    public final boolean z(int i6, Object obj) {
        int i10 = this.f8704a[i6 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int j11 = j(i6);
            long j12 = j11 & 1048575;
            switch ((j11 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(y7.e(j12, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(y7.f(j12, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (y7.h(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (y7.h(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (y7.g(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (y7.h(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (y7.g(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return y7.t(j12, obj);
                case 8:
                    Object j13 = y7.j(j12, obj);
                    if (j13 instanceof String) {
                        if (((String) j13).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (j13 instanceof b5) {
                        if (b5.f8311v.equals(j13)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (y7.j(j12, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (b5.f8311v.equals(y7.j(j12, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (y7.g(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (y7.g(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (y7.g(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (y7.h(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (y7.g(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (y7.h(j12, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (y7.j(j12, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((y7.g(j10, obj) & (1 << (i10 >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }
}
