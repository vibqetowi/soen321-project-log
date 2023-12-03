package com.google.android.gms.internal.p000firebaseauthapi;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e2  reason: invalid package */
/* loaded from: classes.dex */
public final class e2<T> implements m2<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f7797o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f7798p = f3.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7799a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7800b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7801c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7802d;

    /* renamed from: e  reason: collision with root package name */
    public final b2 f7803e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7804g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7805h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f7806i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7807j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7808k;

    /* renamed from: l  reason: collision with root package name */
    public final p1 f7809l;

    /* renamed from: m  reason: collision with root package name */
    public final x2 f7810m;

    /* renamed from: n  reason: collision with root package name */
    public final s0 f7811n;

    public e2(int[] iArr, Object[] objArr, int i6, int i10, b2 b2Var, boolean z10, int[] iArr2, int i11, int i12, p1 p1Var, x2 x2Var, s0 s0Var, x1 x1Var) {
        boolean z11;
        this.f7799a = iArr;
        this.f7800b = objArr;
        this.f7801c = i6;
        this.f7802d = i10;
        this.f7804g = b2Var instanceof e1;
        this.f7805h = z10;
        if (s0Var != null && s0Var.h(b2Var)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f = z11;
        this.f7806i = iArr2;
        this.f7807j = i11;
        this.f7808k = i12;
        this.f7809l = p1Var;
        this.f7810m = x2Var;
        this.f7811n = s0Var;
        this.f7803e = b2Var;
    }

    public static boolean E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof e1) {
            return ((e1) obj).k();
        }
        return true;
    }

    public static final void H(int i6, Object obj, o0 o0Var) {
        if (obj instanceof String) {
            o0Var.f8021a.Z(i6, (String) obj);
            return;
        }
        o0Var.f(i6, (h0) obj);
    }

    public static y2 J(Object obj) {
        e1 e1Var = (e1) obj;
        y2 y2Var = e1Var.zzc;
        if (y2Var == y2.f) {
            y2 b10 = y2.b();
            e1Var.zzc = b10;
            return b10;
        }
        return y2Var;
    }

    public static e2 K(z1 z1Var, p1 p1Var, x2 x2Var, s0 s0Var, x1 x1Var) {
        if (z1Var instanceof l2) {
            return L((l2) z1Var, p1Var, x2Var, s0Var, x1Var);
        }
        w2 w2Var = (w2) z1Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e2 L(l2 l2Var, p1 p1Var, x2 x2Var, s0 s0Var, x1 x1Var) {
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
        Field t3;
        char charAt12;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field t10;
        Object obj2;
        Field t11;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        int i38;
        char charAt16;
        if (l2Var.c() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String d10 = l2Var.d();
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
            iArr = f7797o;
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
        Object[] e10 = l2Var.e();
        Class<?> cls = l2Var.a().getClass();
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
            Unsafe unsafe = f7798p;
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
                        t10 = (Field) obj;
                    } else {
                        t10 = t(cls, (String) obj);
                        e10[i91] = t10;
                    }
                    int i92 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(t10);
                    int i93 = i91 + 1;
                    obj2 = e10[i93];
                    if (!(obj2 instanceof Field)) {
                        t11 = (Field) obj2;
                    } else {
                        t11 = t(cls, (String) obj2);
                        e10[i93] = t11;
                    }
                    i28 = (int) unsafe.objectFieldOffset(t11);
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
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(t10);
                int i932 = i912 + 1;
                obj2 = e10[i932];
                if (!(obj2 instanceof Field)) {
                }
                i28 = (int) unsafe.objectFieldOffset(t11);
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
                Field t12 = t(cls, (String) e10[i10]);
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
                    objArr2[i103 + i103 + 1] = t12.getType();
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(t12);
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
                        t3 = (Field) obj3;
                    } else {
                        t3 = t(cls, (String) obj3);
                        e10[i107] = t3;
                    }
                    objArr = e10;
                    i28 = (int) unsafe.objectFieldOffset(t3);
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
        return new e2(iArr2, objArr2, charAt, charAt2, l2Var.a(), z10, iArr, i13, i68, p1Var, x2Var, s0Var, x1Var);
    }

    public static int O(long j10, Object obj) {
        return ((Integer) f3.j(j10, obj)).intValue();
    }

    public static long m(long j10, Object obj) {
        return ((Long) f3.j(j10, obj)).longValue();
    }

    public static Field t(Class cls, String str) {
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

    public static void u(Object obj) {
        if (E(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public final void A(Object obj, int i6, Object obj2) {
        f7798p.putObject(obj, l(i6) & 1048575, obj2);
        y(i6, obj);
    }

    public final void B(int i6, Object obj, Object obj2, int i10) {
        f7798p.putObject(obj, l(i10) & 1048575, obj2);
        z(i6, i10, obj);
    }

    public final boolean C(Object obj, int i6, Object obj2) {
        if (D(i6, obj) == D(i6, obj2)) {
            return true;
        }
        return false;
    }

    public final boolean D(int i6, Object obj) {
        int i10 = this.f7799a[i6 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int l2 = l(i6);
            long j11 = l2 & 1048575;
            switch ((l2 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(f3.e(j11, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(f3.f(j11, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (f3.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (f3.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (f3.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (f3.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (f3.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return f3.u(j11, obj);
                case 8:
                    Object j12 = f3.j(j11, obj);
                    if (j12 instanceof String) {
                        if (((String) j12).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (j12 instanceof h0) {
                        if (h0.f7869v.equals(j12)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (f3.j(j11, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (h0.f7869v.equals(f3.j(j11, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (f3.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (f3.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (f3.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (f3.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (f3.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (f3.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (f3.j(j11, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((f3.g(j10, obj) & (1 << (i10 >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean F(int i6, int i10, Object obj) {
        if (f3.g(this.f7799a[i10 + 2] & 1048575, obj) == i6) {
            return true;
        }
        return false;
    }

    public final void G(Object obj, o0 o0Var) {
        int i6;
        if (!this.f) {
            int[] iArr = this.f7799a;
            int length = iArr.length;
            int i10 = 1048575;
            int i11 = 0;
            int i12 = 1048575;
            int i13 = 0;
            while (i11 < length) {
                int l2 = l(i11);
                int i14 = iArr[i11];
                int i15 = (l2 >>> 20) & 255;
                Unsafe unsafe = f7798p;
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
                long j10 = l2 & i10;
                switch (i15) {
                    case 0:
                        if ((i6 & i13) != 0) {
                            o0Var.g(f3.e(j10, obj), i14);
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 1:
                        if ((i6 & i13) != 0) {
                            o0Var.k(f3.f(j10, obj), i14);
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 2:
                        if ((i6 & i13) != 0) {
                            o0Var.n(i14, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 3:
                        if ((i6 & i13) != 0) {
                            o0Var.d(i14, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 4:
                        if ((i6 & i13) != 0) {
                            o0Var.m(i14, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 5:
                        if ((i6 & i13) != 0) {
                            o0Var.j(i14, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 6:
                        if ((i6 & i13) != 0) {
                            o0Var.i(i14, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 7:
                        if ((i6 & i13) != 0) {
                            o0Var.e(i14, f3.u(j10, obj));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 8:
                        if ((i6 & i13) != 0) {
                            H(i14, unsafe.getObject(obj, j10), o0Var);
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 9:
                        if ((i6 & i13) != 0) {
                            o0Var.o(i14, o(i11), unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 10:
                        if ((i6 & i13) != 0) {
                            o0Var.f(i14, (h0) unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 11:
                        if ((i6 & i13) != 0) {
                            o0Var.c(i14, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 12:
                        if ((i6 & i13) != 0) {
                            o0Var.h(i14, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 13:
                        if ((i6 & i13) != 0) {
                            o0Var.p(i14, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 14:
                        if ((i6 & i13) != 0) {
                            o0Var.q(i14, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 15:
                        if ((i6 & i13) != 0) {
                            o0Var.a(i14, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 16:
                        if ((i6 & i13) != 0) {
                            o0Var.b(i14, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 17:
                        if ((i6 & i13) != 0) {
                            o0Var.l(i14, o(i11), unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i11 += 3;
                        i10 = 1048575;
                    case 18:
                        n2.e(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 19:
                        n2.i(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 20:
                        n2.l(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 21:
                        n2.u(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 22:
                        n2.k(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 23:
                        n2.h(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 24:
                        n2.g(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 25:
                        n2.c(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        continue;
                        i11 += 3;
                        i10 = 1048575;
                    case 26:
                        n2.r(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var);
                        break;
                    case 27:
                        n2.m(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, o(i11));
                        break;
                    case 28:
                        n2.d(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var);
                        break;
                    case 29:
                        n2.s(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        n2.f(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        n2.n(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        break;
                    case 32:
                        n2.o(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        n2.p(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        n2.q(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, false);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        n2.e(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case 36:
                        n2.i(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        n2.l(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        n2.u(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        n2.k(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        n2.h(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        n2.g(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        n2.c(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        n2.s(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        n2.f(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        n2.n(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        n2.o(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        n2.p(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        n2.q(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, true);
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        n2.j(iArr[i11], (List) unsafe.getObject(obj, j10), o0Var, o(i11));
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j10) != null) {
                            v1 v1Var = (v1) q(i11);
                            throw null;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (F(i14, i11, obj)) {
                            o0Var.g(((Double) f3.j(j10, obj)).doubleValue(), i14);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (F(i14, i11, obj)) {
                            o0Var.k(((Float) f3.j(j10, obj)).floatValue(), i14);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (F(i14, i11, obj)) {
                            o0Var.n(i14, m(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (F(i14, i11, obj)) {
                            o0Var.d(i14, m(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (F(i14, i11, obj)) {
                            o0Var.m(i14, O(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (F(i14, i11, obj)) {
                            o0Var.j(i14, m(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (F(i14, i11, obj)) {
                            o0Var.i(i14, O(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (F(i14, i11, obj)) {
                            o0Var.e(i14, ((Boolean) f3.j(j10, obj)).booleanValue());
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (F(i14, i11, obj)) {
                            H(i14, unsafe.getObject(obj, j10), o0Var);
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (F(i14, i11, obj)) {
                            o0Var.o(i14, o(i11), unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (F(i14, i11, obj)) {
                            o0Var.f(i14, (h0) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (F(i14, i11, obj)) {
                            o0Var.c(i14, O(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (F(i14, i11, obj)) {
                            o0Var.h(i14, O(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (F(i14, i11, obj)) {
                            o0Var.p(i14, O(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (F(i14, i11, obj)) {
                            o0Var.q(i14, m(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (F(i14, i11, obj)) {
                            o0Var.a(i14, O(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (F(i14, i11, obj)) {
                            o0Var.b(i14, m(j10, obj));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (F(i14, i11, obj)) {
                            o0Var.l(i14, o(i11), unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                }
                i11 += 3;
                i10 = 1048575;
            }
            x2 x2Var = this.f7810m;
            x2Var.r(x2Var.d(obj), o0Var);
            return;
        }
        this.f7811n.a(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x035f, code lost:
        if (r0 != r4) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03b9, code lost:
        if (r0 != r15) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03bb, code lost:
        r11 = r32;
        r9 = r34;
        r1 = r36;
        r8 = r37;
        r7 = r16;
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03cd, code lost:
        r6 = r36;
        r2 = r0;
        r7 = r16;
        r10 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0450, code lost:
        if (r5 == 1048575) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0452, code lost:
        r28.putInt(r11, r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0458, code lost:
        r3 = r14.f7807j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x045c, code lost:
        if (r3 >= r14.f7808k) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x045e, code lost:
        r14.p(r11, r14.f7806i[r3], r1);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0468, code lost:
        if (r6 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x046c, code lost:
        if (r0 != r35) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0473, code lost:
        throw com.google.android.gms.internal.p000firebaseauthapi.zzadn.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0476, code lost:
        if (r0 > r35) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0478, code lost:
        if (r2 != r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x047a, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x047f, code lost:
        throw com.google.android.gms.internal.p000firebaseauthapi.zzadn.d();
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I(Object obj, byte[] bArr, int i6, int i10, int i11, z zVar) {
        Unsafe unsafe;
        Object obj2;
        e2<T> e2Var;
        Object obj3;
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
        Object obj4;
        int i25;
        z zVar2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int l2;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        e2<T> e2Var2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i41 = i10;
        z zVar3 = zVar;
        u(obj);
        Unsafe unsafe2 = f7798p;
        int i42 = i6;
        int i43 = i11;
        int i44 = 0;
        int i45 = -1;
        int i46 = 0;
        int i47 = 1048575;
        int i48 = 0;
        while (true) {
            if (i42 < i41) {
                int i49 = i42 + 1;
                byte b10 = bArr2[i42];
                if (b10 < 0) {
                    i15 = a0.j(b10, bArr2, i49, zVar3);
                    i14 = zVar3.f8264b;
                } else {
                    i14 = b10;
                    i15 = i49;
                }
                int i50 = i14 >>> 3;
                int i51 = i14 & 7;
                int i52 = e2Var2.f7802d;
                int i53 = i43;
                int i54 = e2Var2.f7801c;
                int i55 = i14;
                if (i50 > i45) {
                    i18 = (i50 < i54 || i50 > i52) ? -1 : e2Var2.k(i50, i46 / 3);
                    i19 = -1;
                    i16 = 0;
                } else {
                    if (i50 < i54 || i50 > i52) {
                        i16 = 0;
                        i17 = -1;
                    } else {
                        i16 = 0;
                        i17 = e2Var2.k(i50, 0);
                    }
                    i18 = i17;
                    i19 = -1;
                }
                if (i18 == i19) {
                    i20 = i15;
                    i21 = i47;
                    i22 = i48;
                    i23 = i50;
                    unsafe = unsafe2;
                    e2Var = e2Var2;
                    i12 = i53;
                    i24 = i55;
                } else {
                    int[] iArr = e2Var2.f7799a;
                    int i56 = iArr[i18 + 1];
                    int i57 = (i56 >>> 20) & 255;
                    long j10 = i56 & 1048575;
                    if (i57 <= 17) {
                        int i58 = iArr[i18 + 2];
                        int i59 = 1 << (i58 >>> 20);
                        int i60 = i58 & 1048575;
                        if (i60 != i47) {
                            i32 = i18;
                            if (i47 != 1048575) {
                                unsafe2.putInt(obj5, i47, i48);
                            }
                            i48 = unsafe2.getInt(obj5, i60);
                            i21 = i60;
                        } else {
                            i32 = i18;
                            i21 = i47;
                        }
                        i22 = i48;
                        switch (i57) {
                            case 0:
                                i33 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 1) {
                                    i39 = i34;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    f3.o(obj5, j10, Double.longBitsToDouble(a0.o(bArr2, i33)));
                                    i35 = i33 + 8;
                                    l2 = i35;
                                    i36 = i22 | i59;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i36;
                                    i42 = l2;
                                    break;
                                }
                            case 1:
                                i33 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 5) {
                                    i39 = i34;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    f3.p(obj5, j10, Float.intBitsToFloat(a0.b(bArr2, i33)));
                                    i35 = i33 + 4;
                                    l2 = i35;
                                    i36 = i22 | i59;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i36;
                                    i42 = l2;
                                    break;
                                }
                            case 2:
                            case 3:
                                i33 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 0) {
                                    i39 = i34;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    l2 = a0.l(bArr2, i33, zVar3);
                                    unsafe2.putLong(obj, j10, zVar3.f8265c);
                                    i36 = i22 | i59;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i36;
                                    i42 = l2;
                                    break;
                                }
                            case 4:
                            case 11:
                                i33 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 0) {
                                    i39 = i34;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    i35 = a0.i(bArr2, i33, zVar3);
                                    unsafe2.putInt(obj5, j10, zVar3.f8264b);
                                    l2 = i35;
                                    i36 = i22 | i59;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i36;
                                    i42 = l2;
                                    break;
                                }
                            case 5:
                            case 14:
                                i37 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 1) {
                                    i40 = i37;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j10, a0.o(bArr2, i37));
                                    i33 = i37;
                                    i35 = i33 + 8;
                                    l2 = i35;
                                    i36 = i22 | i59;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i36;
                                    i42 = l2;
                                    break;
                                }
                            case 6:
                            case 13:
                                i37 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 5) {
                                    i40 = i37;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    unsafe2.putInt(obj5, j10, a0.b(bArr2, i37));
                                    i42 = i37 + 4;
                                    i38 = i22 | i59;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i38;
                                    break;
                                }
                            case 7:
                                i37 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 0) {
                                    i40 = i37;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    int l10 = a0.l(bArr2, i37, zVar3);
                                    f3.m(obj5, j10, zVar3.f8265c != 0);
                                    i42 = l10;
                                    i46 = i34;
                                    i45 = i50;
                                    i44 = i31;
                                    i47 = i21;
                                    i48 = i22 | i59;
                                    i43 = i11;
                                    break;
                                }
                            case 8:
                                i37 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 2) {
                                    i40 = i37;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    if ((i56 & 536870912) == 0) {
                                        i42 = a0.f(bArr2, i37, zVar3);
                                    } else {
                                        i42 = a0.g(bArr2, i37, zVar3);
                                    }
                                    unsafe2.putObject(obj5, j10, zVar3.f8266d);
                                    i46 = i34;
                                    i45 = i50;
                                    i44 = i31;
                                    i47 = i21;
                                    i48 = i22 | i59;
                                    i43 = i11;
                                    break;
                                }
                            case 9:
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 2) {
                                    i33 = i15;
                                    i39 = i34;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    Object r = e2Var2.r(i34, obj5);
                                    i42 = a0.n(r, e2Var2.o(i34), bArr, i15, i10, zVar);
                                    e2Var2.A(obj5, i34, r);
                                    i38 = i22 | i59;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i38;
                                    break;
                                }
                            case 10:
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 2) {
                                    i40 = i15;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    i42 = a0.a(bArr2, i15, zVar3);
                                    unsafe2.putObject(obj5, j10, zVar3.f8266d);
                                    i46 = i34;
                                    i45 = i50;
                                    i44 = i31;
                                    i47 = i21;
                                    i48 = i22 | i59;
                                    i43 = i11;
                                    break;
                                }
                            case 12:
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 0) {
                                    i40 = i15;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    i42 = a0.i(bArr2, i15, zVar3);
                                    int i61 = zVar3.f8264b;
                                    g1 n10 = e2Var2.n(i34);
                                    if (n10 != null && !n10.a()) {
                                        J(obj).c(i31, Long.valueOf(i61));
                                        i43 = i11;
                                        i46 = i34;
                                        i45 = i50;
                                        i44 = i31;
                                        i47 = i21;
                                        i48 = i22;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj5, j10, i61);
                                        i46 = i34;
                                        i45 = i50;
                                        i44 = i31;
                                        i47 = i21;
                                        i48 = i22 | i59;
                                        i43 = i11;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 0) {
                                    i40 = i15;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    i42 = a0.i(bArr2, i15, zVar3);
                                    unsafe2.putInt(obj5, j10, j0.f(zVar3.f8264b));
                                    i46 = i34;
                                    i45 = i50;
                                    i44 = i31;
                                    i47 = i21;
                                    i48 = i22 | i59;
                                    i43 = i11;
                                    break;
                                }
                            case 16:
                                if (i51 != 0) {
                                    i31 = i55;
                                    i34 = i32;
                                    i40 = i15;
                                    i39 = i34;
                                    i33 = i40;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    int l11 = a0.l(bArr2, i15, zVar3);
                                    i31 = i55;
                                    unsafe2.putLong(obj, j10, j0.g(zVar3.f8265c));
                                    i38 = i22 | i59;
                                    i42 = l11;
                                    i34 = i32;
                                    i26 = i34;
                                    i47 = i21;
                                    i48 = i38;
                                    break;
                                }
                            default:
                                i33 = i15;
                                i34 = i32;
                                i31 = i55;
                                if (i51 != 3) {
                                    i39 = i34;
                                    i12 = i11;
                                    i20 = i33;
                                    i23 = i50;
                                    unsafe = unsafe2;
                                    i24 = i31;
                                    i16 = i39;
                                    e2Var = e2Var2;
                                    break;
                                } else {
                                    Object r10 = e2Var2.r(i34, obj5);
                                    i26 = i34;
                                    i42 = a0.m(r10, e2Var2.o(i34), bArr, i33, i10, (i50 << 3) | 4, zVar);
                                    e2Var2.A(obj5, i26, r10);
                                    i48 = i22 | i59;
                                    i47 = i21;
                                    break;
                                }
                        }
                    } else {
                        i26 = i18;
                        int i62 = i15;
                        if (i57 != 27) {
                            i21 = i47;
                            i22 = i48;
                            if (i57 <= 49) {
                                i28 = i55;
                                i23 = i50;
                                unsafe = unsafe2;
                                i42 = S(obj, bArr, i62, i10, i55, i50, i51, i26, i56, i57, j10, zVar);
                                e2Var = this;
                                i30 = i26;
                            } else {
                                i27 = i62;
                                i28 = i55;
                                i23 = i50;
                                unsafe = unsafe2;
                                i29 = i26;
                                if (i57 != 50) {
                                    e2Var = this;
                                    i30 = i29;
                                    i42 = Q(obj, bArr, i27, i10, i28, i23, i51, i56, i57, j10, i29, zVar);
                                } else if (i51 == 2) {
                                    P(obj, i29, j10);
                                    throw null;
                                }
                            }
                        } else if (i51 == 2) {
                            h1 h1Var = (h1) unsafe2.getObject(obj5, j10);
                            if (!h1Var.c()) {
                                int size = h1Var.size();
                                h1Var = h1Var.k(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j10, h1Var);
                            }
                            i31 = i55;
                            i42 = a0.d(e2Var2.o(i26), i55, bArr, i62, i10, h1Var, zVar);
                            i47 = i47;
                            i48 = i48;
                        } else {
                            i21 = i47;
                            i22 = i48;
                            i28 = i55;
                            i27 = i62;
                            i23 = i50;
                            unsafe = unsafe2;
                            i29 = i26;
                        }
                        e2Var = this;
                        i12 = i11;
                        i20 = i27;
                        i24 = i28;
                        i16 = i29;
                        if (i24 == i12 || i12 == 0) {
                            if (e2Var.f) {
                                obj4 = obj;
                                i25 = i23;
                                zVar2 = zVar;
                            } else {
                                zVar2 = zVar;
                                r0 r0Var = (r0) zVar2.f8267e;
                                if (r0Var != r0.f8101b) {
                                    i25 = i23;
                                    if (r0Var.a(e2Var.f7803e, i25) == null) {
                                        i42 = a0.h(i24, bArr, i20, i10, J(obj), zVar);
                                        obj4 = obj;
                                        i43 = i12;
                                        i46 = i16;
                                        i47 = i21;
                                        i48 = i22;
                                        bArr2 = bArr;
                                        i41 = i10;
                                        i44 = i24;
                                        i45 = i25;
                                        e2Var2 = e2Var;
                                        unsafe2 = unsafe;
                                        obj5 = obj4;
                                        zVar3 = zVar2;
                                    } else {
                                        c1 c1Var = (c1) obj;
                                        throw null;
                                    }
                                } else {
                                    obj4 = obj;
                                    i25 = i23;
                                }
                            }
                            i42 = a0.h(i24, bArr, i20, i10, J(obj), zVar);
                            i43 = i12;
                            i46 = i16;
                            i47 = i21;
                            i48 = i22;
                            bArr2 = bArr;
                            i41 = i10;
                            i44 = i24;
                            i45 = i25;
                            e2Var2 = e2Var;
                            unsafe2 = unsafe;
                            obj5 = obj4;
                            zVar3 = zVar2;
                        } else {
                            obj2 = obj;
                            i42 = i20;
                            i44 = i24;
                            i47 = i21;
                            i13 = i22;
                            obj3 = null;
                        }
                    }
                    i43 = i11;
                    i45 = i50;
                    i44 = i31;
                    i46 = i26;
                    bArr2 = bArr;
                }
                if (i24 == i12) {
                }
                if (e2Var.f) {
                }
                i42 = a0.h(i24, bArr, i20, i10, J(obj), zVar);
                i43 = i12;
                i46 = i16;
                i47 = i21;
                i48 = i22;
                bArr2 = bArr;
                i41 = i10;
                i44 = i24;
                i45 = i25;
                e2Var2 = e2Var;
                unsafe2 = unsafe;
                obj5 = obj4;
                zVar3 = zVar2;
            } else {
                int i63 = i43;
                int i64 = i48;
                unsafe = unsafe2;
                obj2 = obj5;
                e2Var = e2Var2;
                obj3 = null;
                i12 = i63;
                i13 = i64;
            }
        }
    }

    public final int M(Object obj) {
        int i6;
        int L;
        int L2;
        int L3;
        int M;
        int L4;
        int g02;
        int L5;
        int L6;
        int m10;
        int L7;
        int J;
        int D;
        int K;
        int L8;
        int i10;
        int L9;
        int m11;
        int L10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f7799a;
            if (i12 < iArr.length) {
                int l2 = l(i12);
                int i16 = iArr[i12];
                int i17 = (l2 >>> 20) & 255;
                Unsafe unsafe = f7798p;
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
                long j10 = l2 & i11;
                switch (i17) {
                    case 0:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            L = n0.L(i16 << 3);
                            J = L + 8;
                            i13 += J;
                            break;
                        }
                    case 1:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            L2 = n0.L(i16 << 3);
                            J = L2 + 4;
                            i13 += J;
                            break;
                        }
                    case 2:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j11 = unsafe.getLong(obj, j10);
                            L3 = n0.L(i16 << 3);
                            M = n0.M(j11);
                            J = M + L3;
                            i13 += J;
                            break;
                        }
                    case 3:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j12 = unsafe.getLong(obj, j10);
                            L3 = n0.L(i16 << 3);
                            M = n0.M(j12);
                            J = M + L3;
                            i13 += J;
                            break;
                        }
                    case 4:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i20 = unsafe.getInt(obj, j10);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.g0(i20);
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case 5:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            L = n0.L(i16 << 3);
                            J = L + 8;
                            i13 += J;
                            break;
                        }
                    case 6:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            L2 = n0.L(i16 << 3);
                            J = L2 + 4;
                            i13 += J;
                            break;
                        }
                    case 7:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            L5 = n0.L(i16 << 3);
                            J = L5 + 1;
                            i13 += J;
                            break;
                        }
                    case 8:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j10);
                            if (object instanceof h0) {
                                L6 = n0.L(i16 << 3);
                                m10 = ((h0) object).m();
                                L7 = n0.L(m10);
                                i13 += L7 + m10 + L6;
                                break;
                            } else {
                                L4 = n0.L(i16 << 3);
                                g02 = n0.J((String) object);
                                J = g02 + L4;
                                i13 += J;
                                break;
                            }
                        }
                    case 9:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            J = n2.J(i16, o(i12), unsafe.getObject(obj, j10));
                            i13 += J;
                            break;
                        }
                    case 10:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            L6 = n0.L(i16 << 3);
                            m10 = ((h0) unsafe.getObject(obj, j10)).m();
                            L7 = n0.L(m10);
                            i13 += L7 + m10 + L6;
                            break;
                        }
                    case 11:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i21 = unsafe.getInt(obj, j10);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.L(i21);
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case 12:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i22 = unsafe.getInt(obj, j10);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.g0(i22);
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case 13:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            L2 = n0.L(i16 << 3);
                            J = L2 + 4;
                            i13 += J;
                            break;
                        }
                    case 14:
                        if ((i15 & i6) == 0) {
                            break;
                        } else {
                            L = n0.L(i16 << 3);
                            J = L + 8;
                            i13 += J;
                            break;
                        }
                    case 15:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            int i23 = unsafe.getInt(obj, j10);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.L((i23 >> 31) ^ (i23 + i23));
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case 16:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            long j13 = unsafe.getLong(obj, j10);
                            L3 = n0.L(i16 << 3);
                            M = n0.M((j13 >> 63) ^ (j13 + j13));
                            J = M + L3;
                            i13 += J;
                            break;
                        }
                    case 17:
                        if ((i6 & i15) == 0) {
                            break;
                        } else {
                            J = n0.f0(i16, (b2) unsafe.getObject(obj, j10), o(i12));
                            i13 += J;
                            break;
                        }
                    case 18:
                        J = n2.C(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 19:
                        J = n2.A(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 20:
                        J = n2.H(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 21:
                        J = n2.S(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 22:
                        J = n2.F(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 23:
                        J = n2.C(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 24:
                        J = n2.A(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 25:
                        J = n2.t(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 26:
                        J = n2.P(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 27:
                        J = n2.K(i16, (List) unsafe.getObject(obj, j10), o(i12));
                        i13 += J;
                        break;
                    case 28:
                        J = n2.x(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 29:
                        J = n2.Q(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        J = n2.y(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        J = n2.A(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case 32:
                        J = n2.C(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        J = n2.L(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        J = n2.N(i16, (List) unsafe.getObject(obj, j10));
                        i13 += J;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        D = n2.D((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case 36:
                        D = n2.B((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        D = n2.I((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        D = n2.T((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        D = n2.G((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        D = n2.D((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        D = n2.B((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        D = n2.w((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        D = n2.R((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        D = n2.z((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        D = n2.B((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        D = n2.D((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        D = n2.M((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        D = n2.O((List) unsafe.getObject(obj, j10));
                        if (D <= 0) {
                            break;
                        } else {
                            K = n0.K(i16);
                            L8 = n0.L(D);
                            i10 = L8 + K + D;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        J = n2.E(i16, (List) unsafe.getObject(obj, j10), o(i12));
                        i13 += J;
                        break;
                    case 50:
                        x1.a(unsafe.getObject(obj, j10), q(i12));
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L = n0.L(i16 << 3);
                            J = L + 8;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L2 = n0.L(i16 << 3);
                            J = L2 + 4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            long m12 = m(j10, obj);
                            L3 = n0.L(i16 << 3);
                            M = n0.M(m12);
                            J = M + L3;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            long m13 = m(j10, obj);
                            L3 = n0.L(i16 << 3);
                            M = n0.M(m13);
                            J = M + L3;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            int O = O(j10, obj);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.g0(O);
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L = n0.L(i16 << 3);
                            J = L + 8;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L2 = n0.L(i16 << 3);
                            J = L2 + 4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L5 = n0.L(i16 << 3);
                            J = L5 + 1;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(obj, j10);
                            if (object2 instanceof h0) {
                                L9 = n0.L(i16 << 3);
                                m11 = ((h0) object2).m();
                                L10 = n0.L(m11);
                                i10 = L10 + m11 + L9;
                                i13 += i10;
                                break;
                            } else {
                                L4 = n0.L(i16 << 3);
                                g02 = n0.J((String) object2);
                                J = g02 + L4;
                                i13 += J;
                                break;
                            }
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            J = n2.J(i16, o(i12), unsafe.getObject(obj, j10));
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L9 = n0.L(i16 << 3);
                            m11 = ((h0) unsafe.getObject(obj, j10)).m();
                            L10 = n0.L(m11);
                            i10 = L10 + m11 + L9;
                            i13 += i10;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            int O2 = O(j10, obj);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.L(O2);
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            int O3 = O(j10, obj);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.g0(O3);
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L2 = n0.L(i16 << 3);
                            J = L2 + 4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            L = n0.L(i16 << 3);
                            J = L + 8;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            int O4 = O(j10, obj);
                            L4 = n0.L(i16 << 3);
                            g02 = n0.L((O4 >> 31) ^ (O4 + O4));
                            J = g02 + L4;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            long m14 = m(j10, obj);
                            L3 = n0.L(i16 << 3);
                            M = n0.M((m14 >> 63) ^ (m14 + m14));
                            J = M + L3;
                            i13 += J;
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (!F(i16, i12, obj)) {
                            break;
                        } else {
                            J = n0.f0(i16, (b2) unsafe.getObject(obj, j10), o(i12));
                            i13 += J;
                            break;
                        }
                }
                i12 += 3;
                i11 = 1048575;
            } else {
                x2 x2Var = this.f7810m;
                int a10 = x2Var.a(x2Var.d(obj)) + i13;
                if (!this.f) {
                    return a10;
                }
                this.f7811n.a(obj);
                throw null;
            }
        }
    }

    public final int N(Object obj) {
        int L;
        int L2;
        int L3;
        int M;
        int L4;
        int g02;
        int L5;
        int L6;
        int m10;
        int L7;
        int J;
        int L8;
        int M2;
        int D;
        int K;
        int L9;
        int i6;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f7799a;
            if (i10 < iArr.length) {
                int l2 = l(i10);
                int i12 = (l2 >>> 20) & 255;
                int i13 = iArr[i10];
                long j10 = l2 & 1048575;
                if (i12 >= x0.f8234v.a() && i12 <= x0.f8235w.a()) {
                    int i14 = iArr[i10 + 2];
                }
                Unsafe unsafe = f7798p;
                switch (i12) {
                    case 0:
                        if (D(i10, obj)) {
                            L = n0.L(i13 << 3);
                            J = L + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 1:
                        if (D(i10, obj)) {
                            L2 = n0.L(i13 << 3);
                            J = L2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 2:
                        if (D(i10, obj)) {
                            long h10 = f3.h(j10, obj);
                            L3 = n0.L(i13 << 3);
                            M = n0.M(h10);
                            J = M + L3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 3:
                        if (D(i10, obj)) {
                            long h11 = f3.h(j10, obj);
                            L3 = n0.L(i13 << 3);
                            M = n0.M(h11);
                            J = M + L3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 4:
                        if (D(i10, obj)) {
                            int g5 = f3.g(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.g0(g5);
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 5:
                        if (D(i10, obj)) {
                            L = n0.L(i13 << 3);
                            J = L + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 6:
                        if (D(i10, obj)) {
                            L2 = n0.L(i13 << 3);
                            J = L2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 7:
                        if (D(i10, obj)) {
                            L5 = n0.L(i13 << 3);
                            J = L5 + 1;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 8:
                        if (D(i10, obj)) {
                            Object j11 = f3.j(j10, obj);
                            if (j11 instanceof h0) {
                                L6 = n0.L(i13 << 3);
                                m10 = ((h0) j11).m();
                                L7 = n0.L(m10);
                                i6 = L7 + m10 + L6;
                                i11 += i6;
                                i10 += 3;
                            } else {
                                L4 = n0.L(i13 << 3);
                                g02 = n0.J((String) j11);
                                J = g02 + L4;
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 9:
                        if (D(i10, obj)) {
                            J = n2.J(i13, o(i10), f3.j(j10, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 10:
                        if (D(i10, obj)) {
                            L6 = n0.L(i13 << 3);
                            m10 = ((h0) f3.j(j10, obj)).m();
                            L7 = n0.L(m10);
                            i6 = L7 + m10 + L6;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 11:
                        if (D(i10, obj)) {
                            int g10 = f3.g(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.L(g10);
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 12:
                        if (D(i10, obj)) {
                            int g11 = f3.g(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.g0(g11);
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 13:
                        if (D(i10, obj)) {
                            L2 = n0.L(i13 << 3);
                            J = L2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 14:
                        if (D(i10, obj)) {
                            L = n0.L(i13 << 3);
                            J = L + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 15:
                        if (D(i10, obj)) {
                            int g12 = f3.g(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.L((g12 >> 31) ^ (g12 + g12));
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 16:
                        if (D(i10, obj)) {
                            long h12 = f3.h(j10, obj);
                            L8 = n0.L(i13 << 3);
                            M2 = n0.M((h12 >> 63) ^ (h12 + h12));
                            J = M2 + L8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 17:
                        if (D(i10, obj)) {
                            J = n0.f0(i13, (b2) f3.j(j10, obj), o(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 18:
                        J = n2.C(i13, (List) f3.j(j10, obj));
                        break;
                    case 19:
                        J = n2.A(i13, (List) f3.j(j10, obj));
                        break;
                    case 20:
                        J = n2.H(i13, (List) f3.j(j10, obj));
                        break;
                    case 21:
                        J = n2.S(i13, (List) f3.j(j10, obj));
                        break;
                    case 22:
                        J = n2.F(i13, (List) f3.j(j10, obj));
                        break;
                    case 23:
                        J = n2.C(i13, (List) f3.j(j10, obj));
                        break;
                    case 24:
                        J = n2.A(i13, (List) f3.j(j10, obj));
                        break;
                    case 25:
                        J = n2.t(i13, (List) f3.j(j10, obj));
                        break;
                    case 26:
                        J = n2.P(i13, (List) f3.j(j10, obj));
                        break;
                    case 27:
                        J = n2.K(i13, (List) f3.j(j10, obj), o(i10));
                        break;
                    case 28:
                        J = n2.x(i13, (List) f3.j(j10, obj));
                        break;
                    case 29:
                        J = n2.Q(i13, (List) f3.j(j10, obj));
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        J = n2.y(i13, (List) f3.j(j10, obj));
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        J = n2.A(i13, (List) f3.j(j10, obj));
                        break;
                    case 32:
                        J = n2.C(i13, (List) f3.j(j10, obj));
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        J = n2.L(i13, (List) f3.j(j10, obj));
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        J = n2.N(i13, (List) f3.j(j10, obj));
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        D = n2.D((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 36:
                        D = n2.B((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        D = n2.I((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        D = n2.T((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        D = n2.G((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        D = n2.D((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        D = n2.B((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        D = n2.w((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        D = n2.R((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        D = n2.z((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        D = n2.B((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        D = n2.D((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        D = n2.M((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        D = n2.O((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            K = n0.K(i13);
                            L9 = n0.L(D);
                            i6 = L9 + K + D;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        J = n2.E(i13, (List) f3.j(j10, obj), o(i10));
                        break;
                    case 50:
                        x1.a(f3.j(j10, obj), q(i10));
                        continue;
                        i10 += 3;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (F(i13, i10, obj)) {
                            L = n0.L(i13 << 3);
                            J = L + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (F(i13, i10, obj)) {
                            L2 = n0.L(i13 << 3);
                            J = L2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (F(i13, i10, obj)) {
                            long m11 = m(j10, obj);
                            L3 = n0.L(i13 << 3);
                            M = n0.M(m11);
                            J = M + L3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (F(i13, i10, obj)) {
                            long m12 = m(j10, obj);
                            L3 = n0.L(i13 << 3);
                            M = n0.M(m12);
                            J = M + L3;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (F(i13, i10, obj)) {
                            int O = O(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.g0(O);
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (F(i13, i10, obj)) {
                            L = n0.L(i13 << 3);
                            J = L + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (F(i13, i10, obj)) {
                            L2 = n0.L(i13 << 3);
                            J = L2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (F(i13, i10, obj)) {
                            L5 = n0.L(i13 << 3);
                            J = L5 + 1;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (F(i13, i10, obj)) {
                            Object j12 = f3.j(j10, obj);
                            if (j12 instanceof h0) {
                                L6 = n0.L(i13 << 3);
                                m10 = ((h0) j12).m();
                                L7 = n0.L(m10);
                                i6 = L7 + m10 + L6;
                                i11 += i6;
                                i10 += 3;
                            } else {
                                L4 = n0.L(i13 << 3);
                                g02 = n0.J((String) j12);
                                J = g02 + L4;
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (F(i13, i10, obj)) {
                            J = n2.J(i13, o(i10), f3.j(j10, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (F(i13, i10, obj)) {
                            L6 = n0.L(i13 << 3);
                            m10 = ((h0) f3.j(j10, obj)).m();
                            L7 = n0.L(m10);
                            i6 = L7 + m10 + L6;
                            i11 += i6;
                            i10 += 3;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (F(i13, i10, obj)) {
                            int O2 = O(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.L(O2);
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (F(i13, i10, obj)) {
                            int O3 = O(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.g0(O3);
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (F(i13, i10, obj)) {
                            L2 = n0.L(i13 << 3);
                            J = L2 + 4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (F(i13, i10, obj)) {
                            L = n0.L(i13 << 3);
                            J = L + 8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (F(i13, i10, obj)) {
                            int O4 = O(j10, obj);
                            L4 = n0.L(i13 << 3);
                            g02 = n0.L((O4 >> 31) ^ (O4 + O4));
                            J = g02 + L4;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (F(i13, i10, obj)) {
                            long m13 = m(j10, obj);
                            L8 = n0.L(i13 << 3);
                            M2 = n0.M((m13 >> 63) ^ (m13 + m13));
                            J = M2 + L8;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (F(i13, i10, obj)) {
                            J = n0.f0(i13, (b2) f3.j(j10, obj), o(i10));
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
                x2 x2Var = this.f7810m;
                return x2Var.a(x2Var.d(obj)) + i11;
            }
        }
    }

    public final void P(Object obj, int i6, long j10) {
        Object q10 = q(i6);
        Unsafe unsafe = f7798p;
        Object object = unsafe.getObject(obj, j10);
        if (x1.b(object)) {
            w1 b10 = w1.a().b();
            x1.c(b10, object);
            unsafe.putObject(obj, j10, b10);
        }
        v1 v1Var = (v1) q10;
        throw null;
    }

    public final int Q(Object obj, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, z zVar) {
        boolean z10;
        long j11 = this.f7799a[i16 + 2] & 1048575;
        Unsafe unsafe = f7798p;
        switch (i15) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i13 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(a0.o(bArr, i6))));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 8;
                }
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i13 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(a0.b(bArr, i6))));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 4;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i13 == 0) {
                    int l2 = a0.l(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zVar.f8265c));
                    unsafe.putInt(obj, j11, i12);
                    return l2;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i13 == 0) {
                    int i17 = a0.i(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zVar.f8264b));
                    unsafe.putInt(obj, j11, i12);
                    return i17;
                }
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i13 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(a0.o(bArr, i6)));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 8;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                if (i13 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(a0.b(bArr, i6)));
                    unsafe.putInt(obj, j11, i12);
                    return i6 + 4;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i13 == 0) {
                    int l10 = a0.l(bArr, i6, zVar);
                    if (zVar.f8265c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    unsafe.putObject(obj, j10, Boolean.valueOf(z10));
                    unsafe.putInt(obj, j11, i12);
                    return l10;
                }
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i13 == 2) {
                    int i18 = a0.i(bArr, i6, zVar);
                    int i19 = zVar.f8264b;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i14 & 536870912) != 0 && !j3.e(i18, bArr, i18 + i19)) {
                        throw zzadn.b();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, i18, i19, i1.f7886a));
                        i18 += i19;
                    }
                    unsafe.putInt(obj, j11, i12);
                    return i18;
                }
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i13 == 2) {
                    Object s10 = s(i12, i16, obj);
                    int n10 = a0.n(s10, o(i16), bArr, i6, i10, zVar);
                    B(i12, obj, s10, i16);
                    return n10;
                }
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i13 == 2) {
                    int a10 = a0.a(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, zVar.f8266d);
                    unsafe.putInt(obj, j11, i12);
                    return a10;
                }
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i13 == 0) {
                    int i20 = a0.i(bArr, i6, zVar);
                    int i21 = zVar.f8264b;
                    g1 n11 = n(i16);
                    if (n11 != null && !n11.a()) {
                        J(obj).c(i11, Long.valueOf(i21));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i21));
                        unsafe.putInt(obj, j11, i12);
                    }
                    return i20;
                }
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i13 == 0) {
                    int i22 = a0.i(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(j0.f(zVar.f8264b)));
                    unsafe.putInt(obj, j11, i12);
                    return i22;
                }
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i13 == 0) {
                    int l11 = a0.l(bArr, i6, zVar);
                    unsafe.putObject(obj, j10, Long.valueOf(j0.g(zVar.f8265c)));
                    unsafe.putInt(obj, j11, i12);
                    return l11;
                }
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i13 == 3) {
                    Object s11 = s(i12, i16, obj);
                    int m10 = a0.m(s11, o(i16), bArr, i6, i10, (i11 & (-8)) | 4, zVar);
                    B(i12, obj, s11, i16);
                    return m10;
                }
                break;
        }
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    public final void R(Object obj, byte[] bArr, int i6, int i10, z zVar) {
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
        e2<T> e2Var;
        byte[] bArr2;
        int i25;
        int i26;
        e2<T> e2Var2;
        int i27;
        int i28;
        int l2;
        int i29;
        boolean z10;
        int i30;
        z zVar2 = zVar;
        u(obj);
        Unsafe unsafe2 = f7798p;
        e2<T> e2Var3 = this;
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
                int j10 = a0.j(b11, bArr3, i37, zVar2);
                b10 = zVar2.f8264b;
                i37 = j10;
            } else {
                b10 = b11;
            }
            int i38 = b10 >>> 3;
            int i39 = b10 & 7;
            int i40 = e2Var3.f7802d;
            int i41 = e2Var3.f7801c;
            if (i38 > i33) {
                int i42 = i34 / 3;
                if (i38 >= i41 && i38 <= i40) {
                    i30 = e2Var3.k(i38, i42);
                } else {
                    i30 = -1;
                }
                i13 = i30;
                i14 = -1;
                i11 = 0;
            } else {
                if (i38 >= i41 && i38 <= i40) {
                    i11 = 0;
                    i12 = e2Var3.k(i38, 0);
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
                int[] iArr = e2Var3.f7799a;
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
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 1) {
                                f3.o(obj2, j11, Double.longBitsToDouble(a0.o(bArr3, i27)));
                                i28 = i27 + 8;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 1:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 5) {
                                f3.p(obj2, j11, Float.intBitsToFloat(a0.b(bArr3, i27)));
                                i28 = i27 + 4;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 2:
                        case 3:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                l2 = a0.l(bArr3, i27, zVar2);
                                unsafe2.putLong(obj, j11, zVar2.f8265c);
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 4:
                        case 11:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = a0.i(bArr3, i27, zVar2);
                                unsafe2.putInt(obj2, j11, zVar2.f8264b);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 5:
                        case 14:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 1) {
                                unsafe2.putLong(obj, j11, a0.o(bArr3, i27));
                                i28 = i27 + 8;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
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
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 5) {
                                unsafe2.putInt(obj2, j11, a0.b(bArr3, i27));
                                i28 = i27 + 4;
                                l2 = i28;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i27 = i27;
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 7:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = a0.l(bArr3, i27, zVar2);
                                if (zVar2.f8265c != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                f3.m(obj2, j11, z10);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 8:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 2) {
                                if ((i43 & 536870912) == 0) {
                                    i29 = a0.f(bArr3, i27, zVar2);
                                } else {
                                    i29 = a0.g(bArr3, i27, zVar2);
                                }
                                unsafe2.putObject(obj2, j11, zVar2.f8266d);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 9:
                            i16 = i38;
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            if (i39 == 2) {
                                Object r = e2Var2.r(i13, obj2);
                                i29 = a0.n(r, e2Var2.o(i13), bArr, i27, i10, zVar);
                                e2Var2.A(obj2, i13, r);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 10:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 2) {
                                i29 = a0.a(bArr3, i27, zVar2);
                                unsafe2.putObject(obj2, j11, zVar2.f8266d);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 12:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = a0.i(bArr3, i27, zVar2);
                                unsafe2.putInt(obj2, j11, zVar2.f8264b);
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 15:
                            e2Var2 = e2Var3;
                            i27 = i26;
                            i15 = i32;
                            obj2 = obj3;
                            i16 = i38;
                            if (i39 == 0) {
                                i29 = a0.i(bArr3, i27, zVar2);
                                unsafe2.putInt(obj2, j11, j0.f(zVar2.f8264b));
                                l2 = i29;
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
                                bArr2 = bArr3;
                                break;
                            }
                            i24 = i27;
                            unsafe = unsafe2;
                            i11 = i13;
                            break;
                        case 16:
                            if (i39 == 0) {
                                l2 = a0.l(bArr3, i26, zVar2);
                                i16 = i38;
                                e2Var2 = e2Var3;
                                i15 = i32;
                                obj2 = obj3;
                                unsafe2.putLong(obj, j11, j0.g(zVar2.f8265c));
                                i36 |= i46;
                                i31 = l2;
                                e2Var = e2Var2;
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
                    e2Var3 = e2Var;
                    bArr3 = bArr2;
                    unsafe = unsafe2;
                    i34 = i13;
                    i32 = i15;
                    zVar2 = zVar;
                    i33 = i16;
                    unsafe2 = unsafe;
                } else {
                    e2<T> e2Var4 = e2Var3;
                    i15 = i32;
                    obj2 = obj3;
                    i16 = i38;
                    if (i44 == 27) {
                        if (i39 == 2) {
                            h1 h1Var = (h1) unsafe2.getObject(obj2, j11);
                            if (!h1Var.c()) {
                                int size = h1Var.size();
                                if (size == 0) {
                                    i25 = 10;
                                } else {
                                    i25 = size + size;
                                }
                                h1Var = h1Var.k(i25);
                                unsafe2.putObject(obj2, j11, h1Var);
                            }
                            e2Var = e2Var4;
                            bArr2 = bArr3;
                            i31 = a0.d(e2Var4.o(i13), b10, bArr, i37, i10, h1Var, zVar);
                            obj3 = obj2;
                            e2Var3 = e2Var;
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
                            i31 = S(obj, bArr, i37, i10, b10, i16, i39, i13, i43, i44, j11, zVar);
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
                                    P(obj, i20, j11);
                                    throw null;
                                }
                            } else {
                                i21 = i20;
                                i31 = Q(obj, bArr, i17, i10, b10, i16, i39, i43, i44, j11, i20, zVar);
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
                        e2Var3 = this;
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
            i31 = a0.h(b10, bArr, i24, i10, J(obj), zVar);
            i23 = i11;
            e2Var3 = this;
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
        throw zzadn.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0213 -> B:114:0x0214). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0148 -> B:61:0x0149). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01c5 -> B:94:0x01c6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int S(Object obj, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, z zVar) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i6;
        Unsafe unsafe = f7798p;
        h1 h1Var = (h1) unsafe.getObject(obj, j11);
        if (!h1Var.c()) {
            int size = h1Var.size();
            h1Var = h1Var.k(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, h1Var);
        }
        switch (i15) {
            case 18:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                if (i13 == 2) {
                    p0 p0Var = (p0) h1Var;
                    int i23 = a0.i(bArr, i22, zVar);
                    int i24 = zVar.f8264b + i23;
                    while (i23 < i24) {
                        p0Var.g(Double.longBitsToDouble(a0.o(bArr, i23)));
                        i23 += 8;
                    }
                    if (i23 == i24) {
                        return i23;
                    }
                    throw zzadn.e();
                }
                if (i13 == 1) {
                    p0 p0Var2 = (p0) h1Var;
                    p0Var2.g(Double.longBitsToDouble(a0.o(bArr, i6)));
                    while (true) {
                        i16 = i22 + 8;
                        if (i16 < i10) {
                            int i25 = a0.i(bArr, i16, zVar);
                            if (i11 == zVar.f8264b) {
                                p0Var2.g(Double.longBitsToDouble(a0.o(bArr, i25)));
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
                    y0 y0Var = (y0) h1Var;
                    int i26 = a0.i(bArr, i22, zVar);
                    int i27 = zVar.f8264b + i26;
                    while (i26 < i27) {
                        y0Var.g(Float.intBitsToFloat(a0.b(bArr, i26)));
                        i26 += 4;
                    }
                    if (i26 == i27) {
                        return i26;
                    }
                    throw zzadn.e();
                }
                if (i13 == 5) {
                    y0 y0Var2 = (y0) h1Var;
                    y0Var2.g(Float.intBitsToFloat(a0.b(bArr, i6)));
                    while (true) {
                        i17 = i22 + 4;
                        if (i17 < i10) {
                            int i28 = a0.i(bArr, i17, zVar);
                            if (i11 == zVar.f8264b) {
                                y0Var2.g(Float.intBitsToFloat(a0.b(bArr, i28)));
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
                    q1 q1Var = (q1) h1Var;
                    int i29 = a0.i(bArr, i22, zVar);
                    int i30 = zVar.f8264b + i29;
                    while (i29 < i30) {
                        i29 = a0.l(bArr, i29, zVar);
                        q1Var.g(zVar.f8265c);
                    }
                    if (i29 == i30) {
                        return i29;
                    }
                    throw zzadn.e();
                }
                if (i13 == 0) {
                    q1 q1Var2 = (q1) h1Var;
                    int l2 = a0.l(bArr, i22, zVar);
                    q1Var2.g(zVar.f8265c);
                    while (l2 < i10) {
                        int i31 = a0.i(bArr, l2, zVar);
                        if (i11 != zVar.f8264b) {
                            return l2;
                        }
                        l2 = a0.l(bArr, i31, zVar);
                        q1Var2.g(zVar.f8265c);
                    }
                    return l2;
                }
                return i22;
            case 22:
            case 29:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                if (i13 == 2) {
                    return a0.e(bArr, i22, h1Var, zVar);
                }
                if (i13 == 0) {
                    return a0.k(i11, bArr, i6, i10, h1Var, zVar);
                }
                return i22;
            case 23:
            case 32:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                if (i13 == 2) {
                    q1 q1Var3 = (q1) h1Var;
                    int i32 = a0.i(bArr, i22, zVar);
                    int i33 = zVar.f8264b + i32;
                    while (i32 < i33) {
                        q1Var3.g(a0.o(bArr, i32));
                        i32 += 8;
                    }
                    if (i32 == i33) {
                        return i32;
                    }
                    throw zzadn.e();
                }
                if (i13 == 1) {
                    q1 q1Var4 = (q1) h1Var;
                    q1Var4.g(a0.o(bArr, i6));
                    while (true) {
                        i18 = i22 + 8;
                        if (i18 < i10) {
                            int i34 = a0.i(bArr, i18, zVar);
                            if (i11 == zVar.f8264b) {
                                q1Var4.g(a0.o(bArr, i34));
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
                    f1 f1Var = (f1) h1Var;
                    int i35 = a0.i(bArr, i22, zVar);
                    int i36 = zVar.f8264b + i35;
                    while (i35 < i36) {
                        f1Var.g(a0.b(bArr, i35));
                        i35 += 4;
                    }
                    if (i35 == i36) {
                        return i35;
                    }
                    throw zzadn.e();
                }
                if (i13 == 5) {
                    f1 f1Var2 = (f1) h1Var;
                    f1Var2.g(a0.b(bArr, i6));
                    while (true) {
                        i19 = i22 + 4;
                        if (i19 < i10) {
                            int i37 = a0.i(bArr, i19, zVar);
                            if (i11 == zVar.f8264b) {
                                f1Var2.g(a0.b(bArr, i37));
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
                    b0 b0Var = (b0) h1Var;
                    i20 = a0.i(bArr, i22, zVar);
                    int i38 = zVar.f8264b + i20;
                    while (i20 < i38) {
                        i20 = a0.l(bArr, i20, zVar);
                        b0Var.g(zVar.f8265c != 0);
                    }
                    if (i20 != i38) {
                        throw zzadn.e();
                    }
                    return i20;
                }
                if (i13 == 0) {
                    b0 b0Var2 = (b0) h1Var;
                    int l10 = a0.l(bArr, i22, zVar);
                    b0Var2.g(zVar.f8265c != 0);
                    while (l10 < i10) {
                        int i39 = a0.i(bArr, l10, zVar);
                        if (i11 != zVar.f8264b) {
                            return l10;
                        }
                        l10 = a0.l(bArr, i39, zVar);
                        b0Var2.g(zVar.f8265c != 0);
                    }
                    return l10;
                }
                return i22;
            case 26:
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        i22 = a0.i(bArr, i22, zVar);
                        int i40 = zVar.f8264b;
                        if (i40 < 0) {
                            throw zzadn.c();
                        }
                        if (i40 == 0) {
                            h1Var.add("");
                            while (i22 < i10) {
                                int i41 = a0.i(bArr, i22, zVar);
                                if (i11 == zVar.f8264b) {
                                    i22 = a0.i(bArr, i41, zVar);
                                    i40 = zVar.f8264b;
                                    if (i40 < 0) {
                                        throw zzadn.c();
                                    }
                                    if (i40 == 0) {
                                        h1Var.add("");
                                    } else {
                                        h1Var.add(new String(bArr, i22, i40, i1.f7886a));
                                        i22 += i40;
                                        while (i22 < i10) {
                                        }
                                    }
                                }
                            }
                        } else {
                            h1Var.add(new String(bArr, i22, i40, i1.f7886a));
                            i22 += i40;
                            while (i22 < i10) {
                            }
                        }
                    } else {
                        i22 = a0.i(bArr, i22, zVar);
                        int i42 = zVar.f8264b;
                        if (i42 < 0) {
                            throw zzadn.c();
                        }
                        if (i42 == 0) {
                            h1Var.add("");
                            while (i22 < i10) {
                                int i43 = a0.i(bArr, i22, zVar);
                                if (i11 == zVar.f8264b) {
                                    i22 = a0.i(bArr, i43, zVar);
                                    int i44 = zVar.f8264b;
                                    if (i44 < 0) {
                                        throw zzadn.c();
                                    }
                                    if (i44 == 0) {
                                        h1Var.add("");
                                    } else {
                                        i21 = i22 + i44;
                                        if (j3.e(i22, bArr, i21)) {
                                            h1Var.add(new String(bArr, i22, i44, i1.f7886a));
                                            i22 = i21;
                                            while (i22 < i10) {
                                            }
                                        } else {
                                            throw zzadn.b();
                                        }
                                    }
                                }
                            }
                        } else {
                            i21 = i22 + i42;
                            if (j3.e(i22, bArr, i21)) {
                                h1Var.add(new String(bArr, i22, i42, i1.f7886a));
                                i22 = i21;
                                while (i22 < i10) {
                                }
                            } else {
                                throw zzadn.b();
                            }
                        }
                    }
                }
                return i22;
            case 27:
                if (i13 == 2) {
                    return a0.d(o(i14), i11, bArr, i6, i10, h1Var, zVar);
                }
                return i22;
            case 28:
                if (i13 == 2) {
                    int i45 = a0.i(bArr, i22, zVar);
                    int i46 = zVar.f8264b;
                    if (i46 >= 0) {
                        if (i46 <= bArr.length - i45) {
                            if (i46 == 0) {
                                h1Var.add(h0.f7869v);
                                while (i45 < i10) {
                                    int i47 = a0.i(bArr, i45, zVar);
                                    if (i11 != zVar.f8264b) {
                                        return i45;
                                    }
                                    i45 = a0.i(bArr, i47, zVar);
                                    i46 = zVar.f8264b;
                                    if (i46 >= 0) {
                                        if (i46 > bArr.length - i45) {
                                            throw zzadn.e();
                                        }
                                        if (i46 == 0) {
                                            h1Var.add(h0.f7869v);
                                        } else {
                                            h1Var.add(h0.J(i45, bArr, i46));
                                            i45 += i46;
                                            while (i45 < i10) {
                                            }
                                        }
                                    } else {
                                        throw zzadn.c();
                                    }
                                }
                                return i45;
                            }
                            h1Var.add(h0.J(i45, bArr, i46));
                            i45 += i46;
                            while (i45 < i10) {
                            }
                            return i45;
                        }
                        throw zzadn.e();
                    }
                    throw zzadn.c();
                }
                return i22;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        i20 = a0.k(i11, bArr, i6, i10, h1Var, zVar);
                    }
                    return i22;
                }
                i20 = a0.e(bArr, i22, h1Var, zVar);
                n2.a(obj, i12, h1Var, n(i14), null, this.f7810m);
                return i20;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                if (i13 == 2) {
                    f1 f1Var3 = (f1) h1Var;
                    int i48 = a0.i(bArr, i22, zVar);
                    int i49 = zVar.f8264b + i48;
                    while (i48 < i49) {
                        i48 = a0.i(bArr, i48, zVar);
                        f1Var3.g(j0.f(zVar.f8264b));
                    }
                    if (i48 == i49) {
                        return i48;
                    }
                    throw zzadn.e();
                }
                if (i13 == 0) {
                    f1 f1Var4 = (f1) h1Var;
                    int i50 = a0.i(bArr, i22, zVar);
                    f1Var4.g(j0.f(zVar.f8264b));
                    while (i50 < i10) {
                        int i51 = a0.i(bArr, i50, zVar);
                        if (i11 != zVar.f8264b) {
                            return i50;
                        }
                        i50 = a0.i(bArr, i51, zVar);
                        f1Var4.g(j0.f(zVar.f8264b));
                    }
                    return i50;
                }
                return i22;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                if (i13 == 2) {
                    q1 q1Var5 = (q1) h1Var;
                    int i52 = a0.i(bArr, i22, zVar);
                    int i53 = zVar.f8264b + i52;
                    while (i52 < i53) {
                        i52 = a0.l(bArr, i52, zVar);
                        q1Var5.g(j0.g(zVar.f8265c));
                    }
                    if (i52 == i53) {
                        return i52;
                    }
                    throw zzadn.e();
                }
                if (i13 == 0) {
                    q1 q1Var6 = (q1) h1Var;
                    int l11 = a0.l(bArr, i22, zVar);
                    q1Var6.g(j0.g(zVar.f8265c));
                    while (l11 < i10) {
                        int i54 = a0.i(bArr, l11, zVar);
                        if (i11 != zVar.f8264b) {
                            return l11;
                        }
                        l11 = a0.l(bArr, i54, zVar);
                        q1Var6.g(j0.g(zVar.f8265c));
                    }
                    return l11;
                }
                return i22;
            default:
                if (i13 == 3) {
                    m2 o10 = o(i14);
                    int i55 = (i11 & (-8)) | 4;
                    int c10 = a0.c(o10, bArr, i6, i10, i55, zVar);
                    h1Var.add(zVar.f8266d);
                    while (c10 < i10) {
                        int i56 = a0.i(bArr, c10, zVar);
                        if (i11 != zVar.f8264b) {
                            return c10;
                        }
                        c10 = a0.c(o10, bArr, i56, i10, i55, zVar);
                        h1Var.add(zVar.f8266d);
                    }
                    return c10;
                }
                return i22;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void a(Object obj) {
        if (!E(obj)) {
            return;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            e1Var.g();
            e1Var.zza = 0;
            e1Var.e();
        }
        int length = this.f7799a.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int l2 = l(i6);
            long j10 = 1048575 & l2;
            int i10 = (l2 >>> 20) & 255;
            Unsafe unsafe = f7798p;
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
                        this.f7809l.b(j10, obj);
                        continue;
                    case 50:
                        Object object = unsafe.getObject(obj, j10);
                        if (object != null) {
                            ((w1) object).c();
                            unsafe.putObject(obj, j10, object);
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (D(i6, obj)) {
                o(i6).a(unsafe.getObject(obj, j10));
            }
        }
        this.f7810m.m(obj);
        if (this.f) {
            this.f7811n.e(obj);
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
    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(Object obj) {
        int i6;
        int a10;
        int hashCode;
        int[] iArr = this.f7799a;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int l2 = l(i11);
            int i12 = iArr[i11];
            long j10 = 1048575 & l2;
            int i13 = 1231;
            switch ((l2 >>> 20) & 255) {
                case 0:
                    i6 = i10 * 53;
                    a10 = i1.a(Double.doubleToLongBits(f3.e(j10, obj)));
                    i10 = a10 + i6;
                    break;
                case 1:
                    i6 = i10 * 53;
                    a10 = Float.floatToIntBits(f3.f(j10, obj));
                    i10 = a10 + i6;
                    break;
                case 2:
                    i6 = i10 * 53;
                    a10 = i1.a(f3.h(j10, obj));
                    i10 = a10 + i6;
                    break;
                case 3:
                    i6 = i10 * 53;
                    a10 = i1.a(f3.h(j10, obj));
                    i10 = a10 + i6;
                    break;
                case 4:
                    i6 = i10 * 53;
                    a10 = f3.g(j10, obj);
                    i10 = a10 + i6;
                    break;
                case 5:
                    i6 = i10 * 53;
                    a10 = i1.a(f3.h(j10, obj));
                    i10 = a10 + i6;
                    break;
                case 6:
                    i6 = i10 * 53;
                    a10 = f3.g(j10, obj);
                    i10 = a10 + i6;
                    break;
                case 7:
                    i6 = i10 * 53;
                    boolean u10 = f3.u(j10, obj);
                    Charset charset = i1.f7886a;
                    break;
                case 8:
                    i6 = i10 * 53;
                    a10 = ((String) f3.j(j10, obj)).hashCode();
                    i10 = a10 + i6;
                    break;
                case 9:
                    Object j11 = f3.j(j10, obj);
                    if (j11 != null) {
                        hashCode = j11.hashCode();
                        i10 = (i10 * 53) + hashCode;
                        break;
                    }
                    hashCode = 37;
                    i10 = (i10 * 53) + hashCode;
                case 10:
                    i6 = i10 * 53;
                    a10 = f3.j(j10, obj).hashCode();
                    i10 = a10 + i6;
                    break;
                case 11:
                    i6 = i10 * 53;
                    a10 = f3.g(j10, obj);
                    i10 = a10 + i6;
                    break;
                case 12:
                    i6 = i10 * 53;
                    a10 = f3.g(j10, obj);
                    i10 = a10 + i6;
                    break;
                case 13:
                    i6 = i10 * 53;
                    a10 = f3.g(j10, obj);
                    i10 = a10 + i6;
                    break;
                case 14:
                    i6 = i10 * 53;
                    a10 = i1.a(f3.h(j10, obj));
                    i10 = a10 + i6;
                    break;
                case 15:
                    i6 = i10 * 53;
                    a10 = f3.g(j10, obj);
                    i10 = a10 + i6;
                    break;
                case 16:
                    i6 = i10 * 53;
                    a10 = i1.a(f3.h(j10, obj));
                    i10 = a10 + i6;
                    break;
                case 17:
                    Object j12 = f3.j(j10, obj);
                    if (j12 != null) {
                        hashCode = j12.hashCode();
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
                    a10 = f3.j(j10, obj).hashCode();
                    i10 = a10 + i6;
                    break;
                case 50:
                    i6 = i10 * 53;
                    a10 = f3.j(j10, obj).hashCode();
                    i10 = a10 + i6;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = i1.a(Double.doubleToLongBits(((Double) f3.j(j10, obj)).doubleValue()));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = Float.floatToIntBits(((Float) f3.j(j10, obj)).floatValue());
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = i1.a(m(j10, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = i1.a(m(j10, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = O(j10, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = i1.a(m(j10, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = O(j10, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        boolean booleanValue = ((Boolean) f3.j(j10, obj)).booleanValue();
                        Charset charset2 = i1.f7886a;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = ((String) f3.j(j10, obj)).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = f3.j(j10, obj).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = f3.j(j10, obj).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = O(j10, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = O(j10, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = O(j10, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = i1.a(m(j10, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = O(j10, obj);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = i1.a(m(j10, obj));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (F(i12, i11, obj)) {
                        i6 = i10 * 53;
                        a10 = f3.j(j10, obj).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode2 = this.f7810m.d(obj).hashCode() + (i10 * 53);
        if (!this.f) {
            return hashCode2;
        }
        this.f7811n.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final boolean c(Object obj) {
        boolean z10;
        int i6 = 0;
        int i10 = 1048575;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i6 < this.f7807j) {
                int i12 = this.f7806i[i6];
                int[] iArr = this.f7799a;
                int i13 = iArr[i12];
                int l2 = l(i12);
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                int i16 = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    if (i15 != 1048575) {
                        i11 = f7798p.getInt(obj, i15);
                    }
                    i10 = i15;
                }
                if ((268435456 & l2) != 0) {
                    if (i10 == 1048575) {
                        z10 = D(i12, obj);
                    } else if ((i11 & i16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                int i17 = (l2 >>> 20) & 255;
                if (i17 != 9 && i17 != 17) {
                    if (i17 != 27) {
                        if (i17 != 60 && i17 != 68) {
                            if (i17 != 49) {
                                if (i17 == 50 && !((w1) f3.j(l2 & 1048575, obj)).isEmpty()) {
                                    v1 v1Var = (v1) q(i12);
                                    throw null;
                                }
                            }
                        } else if (F(i13, i12, obj) && !o(i12).c(f3.j(l2 & 1048575, obj))) {
                            return false;
                        }
                    }
                    List list = (List) f3.j(l2 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        m2 o10 = o(i12);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (!o10.c(list.get(i18))) {
                                return false;
                            }
                        }
                        continue;
                    }
                } else {
                    if (i10 == 1048575) {
                        z11 = D(i12, obj);
                    } else if ((i11 & i16) == 0) {
                        z11 = false;
                    }
                    if (z11 && !o(i12).c(f3.j(l2 & 1048575, obj))) {
                        return false;
                    }
                }
                i6++;
            } else if (!this.f) {
                return true;
            } else {
                this.f7811n.a(obj);
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final e1 d() {
        return ((e1) this.f7803e).s();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final int e(Object obj) {
        if (this.f7805h) {
            return N(obj);
        }
        return M(obj);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void f(Object obj, Object obj2) {
        u(obj);
        obj2.getClass();
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7799a;
            if (i6 < iArr.length) {
                int l2 = l(i6);
                long j10 = 1048575 & l2;
                int i10 = iArr[i6];
                switch ((l2 >>> 20) & 255) {
                    case 0:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.o(obj, j10, f3.e(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 1:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.p(obj, j10, f3.f(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 2:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.r(obj, j10, f3.h(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 3:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.r(obj, j10, f3.h(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 4:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.q(f3.g(j10, obj2), j10, obj);
                            y(i6, obj);
                            break;
                        }
                    case 5:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.r(obj, j10, f3.h(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 6:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.q(f3.g(j10, obj2), j10, obj);
                            y(i6, obj);
                            break;
                        }
                    case 7:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.m(obj, j10, f3.u(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 8:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.s(j10, obj, f3.j(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 9:
                        v(obj, i6, obj2);
                        break;
                    case 10:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.s(j10, obj, f3.j(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 11:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.q(f3.g(j10, obj2), j10, obj);
                            y(i6, obj);
                            break;
                        }
                    case 12:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.q(f3.g(j10, obj2), j10, obj);
                            y(i6, obj);
                            break;
                        }
                    case 13:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.q(f3.g(j10, obj2), j10, obj);
                            y(i6, obj);
                            break;
                        }
                    case 14:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.r(obj, j10, f3.h(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 15:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.q(f3.g(j10, obj2), j10, obj);
                            y(i6, obj);
                            break;
                        }
                    case 16:
                        if (!D(i6, obj2)) {
                            break;
                        } else {
                            f3.r(obj, j10, f3.h(j10, obj2));
                            y(i6, obj);
                            break;
                        }
                    case 17:
                        v(obj, i6, obj2);
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
                        this.f7809l.c(j10, obj, obj2);
                        break;
                    case 50:
                        Class cls = n2.f7998a;
                        f3.s(j10, obj, x1.c(f3.j(j10, obj), f3.j(j10, obj2)));
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
                        if (!F(i10, i6, obj2)) {
                            break;
                        } else {
                            f3.s(j10, obj, f3.j(j10, obj2));
                            z(i10, i6, obj);
                            break;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        w(obj, i6, obj2);
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!F(i10, i6, obj2)) {
                            break;
                        } else {
                            f3.s(j10, obj, f3.j(j10, obj2));
                            z(i10, i6, obj);
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        w(obj, i6, obj2);
                        break;
                }
                i6 += 3;
            } else {
                Class cls2 = n2.f7998a;
                x2 x2Var = this.f7810m;
                x2Var.o(obj, x2Var.e(x2Var.d(obj), x2Var.d(obj2)));
                if (!this.f) {
                    return;
                }
                this.f7811n.a(obj2);
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final boolean g(Object obj, Object obj2) {
        boolean b10;
        int[] iArr = this.f7799a;
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int l2 = l(i6);
            long j10 = l2 & 1048575;
            switch ((l2 >>> 20) & 255) {
                case 0:
                    if (C(obj, i6, obj2) && Double.doubleToLongBits(f3.e(j10, obj)) == Double.doubleToLongBits(f3.e(j10, obj2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (C(obj, i6, obj2) && Float.floatToIntBits(f3.f(j10, obj)) == Float.floatToIntBits(f3.f(j10, obj2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (C(obj, i6, obj2) && f3.h(j10, obj) == f3.h(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (C(obj, i6, obj2) && f3.h(j10, obj) == f3.h(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (C(obj, i6, obj2) && f3.g(j10, obj) == f3.g(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (C(obj, i6, obj2) && f3.h(j10, obj) == f3.h(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (C(obj, i6, obj2) && f3.g(j10, obj) == f3.g(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (C(obj, i6, obj2) && f3.u(j10, obj) == f3.u(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (C(obj, i6, obj2) && n2.b(f3.j(j10, obj), f3.j(j10, obj2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (C(obj, i6, obj2) && n2.b(f3.j(j10, obj), f3.j(j10, obj2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (C(obj, i6, obj2) && n2.b(f3.j(j10, obj), f3.j(j10, obj2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (C(obj, i6, obj2) && f3.g(j10, obj) == f3.g(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (C(obj, i6, obj2) && f3.g(j10, obj) == f3.g(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (C(obj, i6, obj2) && f3.g(j10, obj) == f3.g(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (C(obj, i6, obj2) && f3.h(j10, obj) == f3.h(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (C(obj, i6, obj2) && f3.g(j10, obj) == f3.g(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (C(obj, i6, obj2) && f3.h(j10, obj) == f3.h(j10, obj2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (C(obj, i6, obj2) && n2.b(f3.j(j10, obj), f3.j(j10, obj2))) {
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
                    b10 = n2.b(f3.j(j10, obj), f3.j(j10, obj2));
                    break;
                case 50:
                    b10 = n2.b(f3.j(j10, obj), f3.j(j10, obj2));
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
                    if (f3.g(j11, obj) == f3.g(j11, obj2) && n2.b(f3.j(j10, obj), f3.j(j10, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!b10) {
                return false;
            }
        }
        x2 x2Var = this.f7810m;
        if (!x2Var.d(obj).equals(x2Var.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        s0 s0Var = this.f7811n;
        s0Var.a(obj);
        s0Var.a(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x067a A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x0026, B:20:0x0046, B:27:0x0058, B:28:0x005e, B:30:0x0064, B:32:0x0069, B:33:0x006d, B:24:0x004e, B:40:0x0083, B:45:0x009a, B:153:0x065c, B:161:0x0675, B:163:0x067a, B:164:0x067e, B:47:0x00a0, B:48:0x00b8, B:49:0x00d5, B:50:0x00f2, B:51:0x010b, B:52:0x0124, B:54:0x0134, B:57:0x013b, B:59:0x013f, B:61:0x0145, B:62:0x014d, B:63:0x015c, B:64:0x0175, B:65:0x0184, B:66:0x019d, B:67:0x01a5, B:68:0x01bc, B:69:0x01d5, B:70:0x01ee, B:71:0x0206, B:72:0x021e, B:73:0x0236, B:74:0x0252, B:76:0x0271, B:78:0x0282, B:80:0x0288, B:82:0x029f, B:84:0x02a5, B:81:0x0296, B:86:0x02aa, B:87:0x02bc, B:88:0x02ca, B:89:0x02d8, B:90:0x02e6, B:91:0x02f4, B:92:0x030e, B:93:0x031c, B:94:0x032a, B:95:0x0338, B:96:0x0346, B:97:0x0354, B:98:0x0362, B:99:0x0370, B:100:0x037e, B:101:0x038c, B:102:0x039a, B:103:0x03a8, B:104:0x03b6, B:105:0x03c4, B:106:0x03de, B:107:0x03ec, B:108:0x03fa, B:109:0x040c, B:114:0x0418, B:115:0x0425, B:116:0x0432, B:117:0x0440, B:118:0x044e, B:119:0x045c, B:120:0x046a, B:121:0x0478, B:122:0x0486, B:123:0x0494, B:124:0x04a2, B:125:0x04bc, B:126:0x04d7, B:127:0x04f2, B:128:0x0509, B:129:0x0520, B:131:0x0532, B:134:0x0539, B:136:0x053d, B:138:0x0543, B:139:0x0549, B:140:0x0554, B:141:0x056b, B:142:0x057c, B:143:0x0597, B:144:0x05a1, B:145:0x05b6, B:146:0x05cd, B:147:0x05e4, B:148:0x05fb, B:149:0x0611, B:150:0x0627, B:151:0x0641), top: B:177:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0684 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0019 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, k0 k0Var, r0 r0Var) {
        int i6;
        d1 c10;
        Object d10;
        boolean z10;
        int[] iArr = this.f7806i;
        int i10 = this.f7808k;
        int i11 = this.f7807j;
        r0Var.getClass();
        u(obj);
        x2 x2Var = this.f7810m;
        y2 y2Var = null;
        w0 w0Var = null;
        while (true) {
            try {
                int t3 = k0Var.t();
                if (t3 >= this.f7801c && t3 <= this.f7802d) {
                    i6 = k(t3, 0);
                } else {
                    i6 = -1;
                }
                if (i6 < 0) {
                    if (t3 == Integer.MAX_VALUE) {
                        while (i11 < i10) {
                            p(obj, iArr[i11], y2Var);
                            i11++;
                        }
                        if (y2Var != null) {
                            x2Var.n(obj, y2Var);
                            return;
                        }
                        return;
                    }
                    boolean z11 = this.f;
                    s0 s0Var = this.f7811n;
                    if (!z11) {
                        c10 = null;
                    } else {
                        c10 = s0Var.c(r0Var, this.f7803e, t3);
                    }
                    if (c10 != null) {
                        if (w0Var == null) {
                            w0Var = s0Var.b(obj);
                        }
                        d10 = s0Var.d();
                        y2Var = d10;
                    } else {
                        x2Var.q();
                        if (y2Var == null) {
                            y2Var = x2Var.c(obj);
                        }
                        if (!x2Var.p(y2Var, k0Var)) {
                            while (i11 < i10) {
                                p(obj, iArr[i11], y2Var);
                                i11++;
                            }
                            if (y2Var != null) {
                                x2Var.n(obj, y2Var);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int l2 = l(i6);
                    int i12 = (l2 >>> 20) & 255;
                    j0 j0Var = k0Var.f7927a;
                    p1 p1Var = this.f7809l;
                    switch (i12) {
                        case 0:
                            k0Var.q(1);
                            f3.o(obj, l2 & 1048575, Double.longBitsToDouble(((i0) j0Var).j()));
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 1:
                            k0Var.q(5);
                            f3.p(obj, l2 & 1048575, Float.intBitsToFloat(((i0) j0Var).h()));
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 2:
                            k0Var.q(0);
                            f3.r(obj, l2 & 1048575, ((i0) j0Var).k());
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 3:
                            k0Var.q(0);
                            f3.r(obj, l2 & 1048575, ((i0) j0Var).k());
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 4:
                            k0Var.q(0);
                            f3.q(((i0) j0Var).i(), l2 & 1048575, obj);
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 5:
                            k0Var.q(1);
                            f3.r(obj, l2 & 1048575, ((i0) j0Var).j());
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 6:
                            k0Var.q(5);
                            f3.q(((i0) j0Var).h(), l2 & 1048575, obj);
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 7:
                            k0Var.q(0);
                            f3.m(obj, l2 & 1048575, j0Var.d());
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 8:
                            x(obj, l2, k0Var);
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 9:
                            b2 b2Var = (b2) r(i6, obj);
                            m2 o10 = o(i6);
                            k0Var.q(2);
                            k0Var.o(b2Var, o10, r0Var);
                            A(obj, i6, b2Var);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 10:
                            f3.s(l2 & 1048575, obj, k0Var.u());
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 11:
                            k0Var.q(0);
                            f3.q(((i0) j0Var).i(), l2 & 1048575, obj);
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 12:
                            k0Var.q(0);
                            int i13 = ((i0) j0Var).i();
                            g1 n10 = n(i6);
                            if (n10 != null && !n10.a()) {
                                Class cls = n2.f7998a;
                                if (y2Var == null) {
                                    d10 = x2Var.c(obj);
                                } else {
                                    d10 = y2Var;
                                }
                                x2Var.l(t3, i13, d10);
                                y2Var = d10;
                                break;
                            }
                            f3.q(i13, l2 & 1048575, obj);
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 13:
                            k0Var.q(5);
                            f3.q(((i0) j0Var).h(), l2 & 1048575, obj);
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 14:
                            k0Var.q(1);
                            f3.r(obj, l2 & 1048575, ((i0) j0Var).j());
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 15:
                            k0Var.q(0);
                            f3.q(j0.f(((i0) j0Var).i()), l2 & 1048575, obj);
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 16:
                            k0Var.q(0);
                            f3.r(obj, l2 & 1048575, j0.g(((i0) j0Var).k()));
                            y(i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 17:
                            b2 b2Var2 = (b2) r(i6, obj);
                            m2 o11 = o(i6);
                            k0Var.q(3);
                            k0Var.n(b2Var2, o11, r0Var);
                            A(obj, i6, b2Var2);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 18:
                            k0Var.z(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 19:
                            k0Var.b(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 20:
                            k0Var.e(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 21:
                            k0Var.m(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 22:
                            k0Var.d(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 23:
                            k0Var.a(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 24:
                            k0Var.B(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 25:
                            k0Var.x(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 26:
                            if ((536870912 & l2) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                k0Var.k(p1Var.a(l2 & 1048575, obj), true);
                            } else {
                                k0Var.k(p1Var.a(l2 & 1048575, obj), false);
                            }
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 27:
                            k0Var.f(p1Var.a(l2 & 1048575, obj), o(i6), r0Var);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 28:
                            k0Var.y(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 29:
                            k0Var.l(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            List a10 = p1Var.a(l2 & 1048575, obj);
                            k0Var.A(a10);
                            d10 = n2.a(obj, t3, a10, n(i6), y2Var, x2Var);
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            k0Var.g(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 32:
                            k0Var.h(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            k0Var.i(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            k0Var.j(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            k0Var.z(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 36:
                            k0Var.b(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            k0Var.e(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            k0Var.m(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            k0Var.d(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            k0Var.a(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            k0Var.B(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            k0Var.x(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            k0Var.l(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            List a11 = p1Var.a(l2 & 1048575, obj);
                            k0Var.A(a11);
                            d10 = n2.a(obj, t3, a11, n(i6), y2Var, x2Var);
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            k0Var.g(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            k0Var.h(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            k0Var.i(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            k0Var.j(p1Var.a(l2 & 1048575, obj));
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            k0Var.c(p1Var.a(l2 & 1048575, obj), o(i6), r0Var);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case 50:
                            Object q10 = q(i6);
                            long l10 = l(i6) & 1048575;
                            Object j10 = f3.j(l10, obj);
                            if (j10 != null) {
                                if (x1.b(j10)) {
                                    Object b10 = w1.f8218v.b();
                                    x1.c(b10, j10);
                                    f3.s(l10, obj, b10);
                                    j10 = b10;
                                }
                            } else {
                                j10 = w1.f8218v.b();
                                f3.s(l10, obj, j10);
                            }
                            w1 w1Var = (w1) j10;
                            v1 v1Var = (v1) q10;
                            throw null;
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            k0Var.q(1);
                            f3.s(l2 & 1048575, obj, Double.valueOf(Double.longBitsToDouble(((i0) j0Var).j())));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            k0Var.q(5);
                            f3.s(l2 & 1048575, obj, Float.valueOf(Float.intBitsToFloat(((i0) j0Var).h())));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            k0Var.q(0);
                            f3.s(l2 & 1048575, obj, Long.valueOf(((i0) j0Var).k()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            k0Var.q(0);
                            f3.s(l2 & 1048575, obj, Long.valueOf(((i0) j0Var).k()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            k0Var.q(0);
                            f3.s(l2 & 1048575, obj, Integer.valueOf(((i0) j0Var).i()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            k0Var.q(1);
                            f3.s(l2 & 1048575, obj, Long.valueOf(((i0) j0Var).j()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            k0Var.q(5);
                            f3.s(l2 & 1048575, obj, Integer.valueOf(((i0) j0Var).h()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            k0Var.q(0);
                            f3.s(l2 & 1048575, obj, Boolean.valueOf(j0Var.d()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            x(obj, l2, k0Var);
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            b2 b2Var3 = (b2) s(t3, i6, obj);
                            m2 o12 = o(i6);
                            k0Var.q(2);
                            k0Var.o(b2Var3, o12, r0Var);
                            B(t3, obj, b2Var3, i6);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            f3.s(l2 & 1048575, obj, k0Var.u());
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            k0Var.q(0);
                            f3.s(l2 & 1048575, obj, Integer.valueOf(((i0) j0Var).i()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            k0Var.q(0);
                            int i14 = ((i0) j0Var).i();
                            g1 n11 = n(i6);
                            if (n11 != null && !n11.a()) {
                                Class cls2 = n2.f7998a;
                                if (y2Var == null) {
                                    d10 = x2Var.c(obj);
                                } else {
                                    d10 = y2Var;
                                }
                                x2Var.l(t3, i14, d10);
                                y2Var = d10;
                                break;
                            }
                            f3.s(l2 & 1048575, obj, Integer.valueOf(i14));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            k0Var.q(5);
                            f3.s(l2 & 1048575, obj, Integer.valueOf(((i0) j0Var).h()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            k0Var.q(1);
                            f3.s(l2 & 1048575, obj, Long.valueOf(((i0) j0Var).j()));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            k0Var.q(0);
                            f3.s(l2 & 1048575, obj, Integer.valueOf(j0.f(((i0) j0Var).i())));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            k0Var.q(0);
                            f3.s(l2 & 1048575, obj, Long.valueOf(j0.g(((i0) j0Var).k())));
                            z(t3, i6, obj);
                            d10 = y2Var;
                            y2Var = d10;
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            try {
                                b2 b2Var4 = (b2) s(t3, i6, obj);
                                m2 o13 = o(i6);
                                k0Var.q(3);
                                k0Var.n(b2Var4, o13, r0Var);
                                B(t3, obj, b2Var4, i6);
                                d10 = y2Var;
                                y2Var = d10;
                                break;
                            } catch (zzadm unused) {
                                x2Var.q();
                                if (y2Var == null) {
                                }
                                if (x2Var.p(y2Var, k0Var)) {
                                }
                            }
                            break;
                        default:
                            if (y2Var == null) {
                                try {
                                    y2Var = x2Var.c(obj);
                                } catch (zzadm unused2) {
                                    x2Var.q();
                                    if (y2Var == null) {
                                        y2Var = x2Var.c(obj);
                                    }
                                    if (x2Var.p(y2Var, k0Var)) {
                                        while (i11 < i10) {
                                            p(obj, iArr[i11], y2Var);
                                            i11++;
                                        }
                                        if (y2Var != null) {
                                            x2Var.n(obj, y2Var);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            if (!x2Var.p(y2Var, k0Var)) {
                                if (y2Var != null) {
                                    return;
                                }
                                return;
                            }
                            d10 = y2Var;
                            y2Var = d10;
                    }
                }
            } finally {
                while (i11 < i10) {
                    p(obj, iArr[i11], y2Var);
                    i11++;
                }
                if (y2Var != null) {
                    x2Var.n(obj, y2Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void i(Object obj, byte[] bArr, int i6, int i10, z zVar) {
        if (this.f7805h) {
            R(obj, bArr, i6, i10, zVar);
        } else {
            I(obj, bArr, i6, i10, 0, zVar);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void j(Object obj, o0 o0Var) {
        if (this.f7805h) {
            if (!this.f) {
                int[] iArr = this.f7799a;
                int length = iArr.length;
                for (int i6 = 0; i6 < length; i6 += 3) {
                    int l2 = l(i6);
                    int i10 = iArr[i6];
                    switch ((l2 >>> 20) & 255) {
                        case 0:
                            if (D(i6, obj)) {
                                o0Var.g(f3.e(l2 & 1048575, obj), i10);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (D(i6, obj)) {
                                o0Var.k(f3.f(l2 & 1048575, obj), i10);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (D(i6, obj)) {
                                o0Var.n(i10, f3.h(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (D(i6, obj)) {
                                o0Var.d(i10, f3.h(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (D(i6, obj)) {
                                o0Var.m(i10, f3.g(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (D(i6, obj)) {
                                o0Var.j(i10, f3.h(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (D(i6, obj)) {
                                o0Var.i(i10, f3.g(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (D(i6, obj)) {
                                o0Var.e(i10, f3.u(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (D(i6, obj)) {
                                H(i10, f3.j(l2 & 1048575, obj), o0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (D(i6, obj)) {
                                o0Var.o(i10, o(i6), f3.j(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (D(i6, obj)) {
                                o0Var.f(i10, (h0) f3.j(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (D(i6, obj)) {
                                o0Var.c(i10, f3.g(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (D(i6, obj)) {
                                o0Var.h(i10, f3.g(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (D(i6, obj)) {
                                o0Var.p(i10, f3.g(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (D(i6, obj)) {
                                o0Var.q(i10, f3.h(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (D(i6, obj)) {
                                o0Var.a(i10, f3.g(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (D(i6, obj)) {
                                o0Var.b(i10, f3.h(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (D(i6, obj)) {
                                o0Var.l(i10, o(i6), f3.j(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            n2.e(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 19:
                            n2.i(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 20:
                            n2.l(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 21:
                            n2.u(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 22:
                            n2.k(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 23:
                            n2.h(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 24:
                            n2.g(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 25:
                            n2.c(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 26:
                            n2.r(i10, (List) f3.j(l2 & 1048575, obj), o0Var);
                            break;
                        case 27:
                            n2.m(i10, (List) f3.j(l2 & 1048575, obj), o0Var, o(i6));
                            break;
                        case 28:
                            n2.d(i10, (List) f3.j(l2 & 1048575, obj), o0Var);
                            break;
                        case 29:
                            n2.s(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            n2.f(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            n2.n(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case 32:
                            n2.o(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            n2.p(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            n2.q(i10, (List) f3.j(l2 & 1048575, obj), o0Var, false);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            n2.e(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case 36:
                            n2.i(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            n2.l(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            n2.u(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            n2.k(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            n2.h(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            n2.g(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            n2.c(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            n2.s(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            n2.f(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            n2.n(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            n2.o(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            n2.p(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            n2.q(i10, (List) f3.j(l2 & 1048575, obj), o0Var, true);
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            n2.j(i10, (List) f3.j(l2 & 1048575, obj), o0Var, o(i6));
                            break;
                        case 50:
                            if (f3.j(l2 & 1048575, obj) != null) {
                                v1 v1Var = (v1) q(i6);
                                throw null;
                            }
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            if (F(i10, i6, obj)) {
                                o0Var.g(((Double) f3.j(l2 & 1048575, obj)).doubleValue(), i10);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            if (F(i10, i6, obj)) {
                                o0Var.k(((Float) f3.j(l2 & 1048575, obj)).floatValue(), i10);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            if (F(i10, i6, obj)) {
                                o0Var.n(i10, m(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            if (F(i10, i6, obj)) {
                                o0Var.d(i10, m(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            if (F(i10, i6, obj)) {
                                o0Var.m(i10, O(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            if (F(i10, i6, obj)) {
                                o0Var.j(i10, m(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            if (F(i10, i6, obj)) {
                                o0Var.i(i10, O(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            if (F(i10, i6, obj)) {
                                o0Var.e(i10, ((Boolean) f3.j(l2 & 1048575, obj)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            if (F(i10, i6, obj)) {
                                H(i10, f3.j(l2 & 1048575, obj), o0Var);
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            if (F(i10, i6, obj)) {
                                o0Var.o(i10, o(i6), f3.j(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            if (F(i10, i6, obj)) {
                                o0Var.f(i10, (h0) f3.j(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            if (F(i10, i6, obj)) {
                                o0Var.c(i10, O(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            if (F(i10, i6, obj)) {
                                o0Var.h(i10, O(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            if (F(i10, i6, obj)) {
                                o0Var.p(i10, O(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            if (F(i10, i6, obj)) {
                                o0Var.q(i10, m(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            if (F(i10, i6, obj)) {
                                o0Var.a(i10, O(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            if (F(i10, i6, obj)) {
                                o0Var.b(i10, m(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            if (F(i10, i6, obj)) {
                                o0Var.l(i10, o(i6), f3.j(l2 & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                x2 x2Var = this.f7810m;
                x2Var.r(x2Var.d(obj), o0Var);
                return;
            }
            this.f7811n.a(obj);
            throw null;
        }
        G(obj, o0Var);
    }

    public final int k(int i6, int i10) {
        int[] iArr = this.f7799a;
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

    public final int l(int i6) {
        return this.f7799a[i6 + 1];
    }

    public final g1 n(int i6) {
        int i10 = i6 / 3;
        return (g1) this.f7800b[i10 + i10 + 1];
    }

    public final m2 o(int i6) {
        int i10 = i6 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f7800b;
        m2 m2Var = (m2) objArr[i11];
        if (m2Var != null) {
            return m2Var;
        }
        m2 a10 = j2.f7908c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final void p(Object obj, int i6, Object obj2) {
        int i10 = this.f7799a[i6];
        Object j10 = f3.j(l(i6) & 1048575, obj);
        if (j10 == null || n(i6) == null) {
            return;
        }
        w1 w1Var = (w1) j10;
        v1 v1Var = (v1) q(i6);
        throw null;
    }

    public final Object q(int i6) {
        int i10 = i6 / 3;
        return this.f7800b[i10 + i10];
    }

    public final Object r(int i6, Object obj) {
        m2 o10 = o(i6);
        long l2 = l(i6) & 1048575;
        if (!D(i6, obj)) {
            return o10.d();
        }
        Object object = f7798p.getObject(obj, l2);
        if (E(object)) {
            return object;
        }
        e1 d10 = o10.d();
        if (object != null) {
            o10.f(d10, object);
        }
        return d10;
    }

    public final Object s(int i6, int i10, Object obj) {
        m2 o10 = o(i10);
        if (!F(i6, i10, obj)) {
            return o10.d();
        }
        Object object = f7798p.getObject(obj, l(i10) & 1048575);
        if (E(object)) {
            return object;
        }
        e1 d10 = o10.d();
        if (object != null) {
            o10.f(d10, object);
        }
        return d10;
    }

    public final void v(Object obj, int i6, Object obj2) {
        if (!D(i6, obj2)) {
            return;
        }
        long l2 = l(i6) & 1048575;
        Unsafe unsafe = f7798p;
        Object object = unsafe.getObject(obj2, l2);
        if (object != null) {
            m2 o10 = o(i6);
            if (!D(i6, obj)) {
                if (!E(object)) {
                    unsafe.putObject(obj, l2, object);
                } else {
                    e1 d10 = o10.d();
                    o10.f(d10, object);
                    unsafe.putObject(obj, l2, d10);
                }
                y(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, l2);
            if (!E(object2)) {
                e1 d11 = o10.d();
                o10.f(d11, object2);
                unsafe.putObject(obj, l2, d11);
                object2 = d11;
            }
            o10.f(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f7799a[i6] + " is present but null: " + obj2.toString());
    }

    public final void w(Object obj, int i6, Object obj2) {
        int[] iArr = this.f7799a;
        int i10 = iArr[i6];
        if (!F(i10, i6, obj2)) {
            return;
        }
        long l2 = l(i6) & 1048575;
        Unsafe unsafe = f7798p;
        Object object = unsafe.getObject(obj2, l2);
        if (object != null) {
            m2 o10 = o(i6);
            if (!F(i10, i6, obj)) {
                if (!E(object)) {
                    unsafe.putObject(obj, l2, object);
                } else {
                    e1 d10 = o10.d();
                    o10.f(d10, object);
                    unsafe.putObject(obj, l2, d10);
                }
                z(i10, i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, l2);
            if (!E(object2)) {
                e1 d11 = o10.d();
                o10.f(d11, object2);
                unsafe.putObject(obj, l2, d11);
                object2 = d11;
            }
            o10.f(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + obj2.toString());
    }

    public final void x(Object obj, int i6, k0 k0Var) {
        boolean z10;
        if ((536870912 & i6) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f3.s(i6 & 1048575, obj, k0Var.w());
        } else if (this.f7804g) {
            f3.s(i6 & 1048575, obj, k0Var.v());
        } else {
            f3.s(i6 & 1048575, obj, k0Var.u());
        }
    }

    public final void y(int i6, Object obj) {
        int i10 = this.f7799a[i6 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        f3.q((1 << (i10 >>> 20)) | f3.g(j10, obj), j10, obj);
    }

    public final void z(int i6, int i10, Object obj) {
        f3.q(i6, this.f7799a[i10 + 2] & 1048575, obj);
    }
}
