package com.google.protobuf;

import com.appsflyer.R;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.f;
import com.google.protobuf.h;
import com.google.protobuf.j0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class t0<T> implements g1<T> {
    public static final int[] r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f10044s = q1.q();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f10045a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f10046b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10047c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10048d;

    /* renamed from: e  reason: collision with root package name */
    public final q0 f10049e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10050g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10051h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10052i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f10053j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10054k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10055l;

    /* renamed from: m  reason: collision with root package name */
    public final v0 f10056m;

    /* renamed from: n  reason: collision with root package name */
    public final g0 f10057n;

    /* renamed from: o  reason: collision with root package name */
    public final m1<?, ?> f10058o;

    /* renamed from: p  reason: collision with root package name */
    public final o<?> f10059p;

    /* renamed from: q  reason: collision with root package name */
    public final l0 f10060q;

    public t0(int[] iArr, Object[] objArr, int i6, int i10, q0 q0Var, boolean z10, int[] iArr2, int i11, int i12, v0 v0Var, g0 g0Var, m1 m1Var, o oVar, l0 l0Var) {
        boolean z11;
        this.f10045a = iArr;
        this.f10046b = objArr;
        this.f10047c = i6;
        this.f10048d = i10;
        this.f10050g = q0Var instanceof v;
        this.f10051h = z10;
        if (oVar != null && oVar.e(q0Var)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f = z11;
        this.f10052i = false;
        this.f10053j = iArr2;
        this.f10054k = i11;
        this.f10055l = i12;
        this.f10056m = v0Var;
        this.f10057n = g0Var;
        this.f10058o = m1Var;
        this.f10059p = oVar;
        this.f10049e = q0Var;
        this.f10060q = l0Var;
    }

    public static t0 D(o0 o0Var, v0 v0Var, g0 g0Var, m1 m1Var, o oVar, l0 l0Var) {
        if (o0Var instanceof d1) {
            return E((d1) o0Var, v0Var, g0Var, m1Var, oVar, l0Var);
        }
        k1 k1Var = (k1) o0Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> t0<T> E(d1 d1Var, v0 v0Var, g0 g0Var, m1<?, ?> m1Var, o<?> oVar, l0 l0Var) {
        int i6;
        int charAt;
        int charAt2;
        int charAt3;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        char charAt4;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        char charAt7;
        int i17;
        char charAt8;
        int i18;
        char charAt9;
        int i19;
        char charAt10;
        int i20;
        char charAt11;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int objectFieldOffset;
        String str;
        int i26;
        int i27;
        int i28;
        Field R;
        int i29;
        char charAt12;
        int i30;
        Field R2;
        Field R3;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        int i34;
        char charAt16;
        int i35 = 0;
        boolean z10 = d1Var.c() == 2;
        String e10 = d1Var.e();
        int length = e10.length();
        char c10 = 55296;
        if (e10.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i6 = i36 + 1;
                if (e10.charAt(i36) < 55296) {
                    break;
                }
                i36 = i6;
            }
        } else {
            i6 = 1;
        }
        int i37 = i6 + 1;
        int charAt17 = e10.charAt(i6);
        if (charAt17 >= 55296) {
            int i38 = charAt17 & 8191;
            int i39 = 13;
            while (true) {
                i34 = i37 + 1;
                charAt16 = e10.charAt(i37);
                if (charAt16 < 55296) {
                    break;
                }
                i38 |= (charAt16 & 8191) << i39;
                i39 += 13;
                i37 = i34;
            }
            charAt17 = i38 | (charAt16 << i39);
            i37 = i34;
        }
        if (charAt17 == 0) {
            iArr = r;
            i11 = 0;
            i12 = 0;
            charAt = 0;
            charAt2 = 0;
            i10 = 0;
            charAt3 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt18 = e10.charAt(i37);
            if (charAt18 >= 55296) {
                int i41 = charAt18 & 8191;
                int i42 = 13;
                while (true) {
                    i20 = i40 + 1;
                    charAt11 = e10.charAt(i40);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i41 |= (charAt11 & 8191) << i42;
                    i42 += 13;
                    i40 = i20;
                }
                charAt18 = i41 | (charAt11 << i42);
                i40 = i20;
            }
            int i43 = i40 + 1;
            int charAt19 = e10.charAt(i40);
            if (charAt19 >= 55296) {
                int i44 = charAt19 & 8191;
                int i45 = 13;
                while (true) {
                    i19 = i43 + 1;
                    charAt10 = e10.charAt(i43);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i44 |= (charAt10 & 8191) << i45;
                    i45 += 13;
                    i43 = i19;
                }
                charAt19 = i44 | (charAt10 << i45);
                i43 = i19;
            }
            int i46 = i43 + 1;
            int charAt20 = e10.charAt(i43);
            if (charAt20 >= 55296) {
                int i47 = charAt20 & 8191;
                int i48 = 13;
                while (true) {
                    i18 = i46 + 1;
                    charAt9 = e10.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i18;
                }
                charAt20 = i47 | (charAt9 << i48);
                i46 = i18;
            }
            int i49 = i46 + 1;
            charAt = e10.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i17 = i49 + 1;
                    charAt8 = e10.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i17;
                }
                charAt = i50 | (charAt8 << i51);
                i49 = i17;
            }
            int i52 = i49 + 1;
            int charAt21 = e10.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i16 = i52 + 1;
                    charAt7 = e10.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i16;
                }
                charAt21 = i53 | (charAt7 << i54);
                i52 = i16;
            }
            int i55 = i52 + 1;
            charAt2 = e10.charAt(i52);
            if (charAt2 >= 55296) {
                int i56 = charAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i15 = i55 + 1;
                    charAt6 = e10.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i15;
                }
                charAt2 = i56 | (charAt6 << i57);
                i55 = i15;
            }
            int i58 = i55 + 1;
            int charAt22 = e10.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i14 = i58 + 1;
                    charAt5 = e10.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i14;
                }
                charAt22 = i59 | (charAt5 << i60);
                i58 = i14;
            }
            int i61 = i58 + 1;
            charAt3 = e10.charAt(i58);
            if (charAt3 >= 55296) {
                int i62 = charAt3 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i13 = i63 + 1;
                    charAt4 = e10.charAt(i63);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i63 = i13;
                }
                charAt3 = i62 | (charAt4 << i64);
                i61 = i13;
            }
            i10 = (charAt18 * 2) + charAt19;
            i11 = charAt20;
            i12 = charAt21;
            iArr = new int[charAt3 + charAt2 + charAt22];
            i35 = charAt18;
            i37 = i61;
        }
        Object[] d10 = d1Var.d();
        Class<?> cls = d1Var.b().getClass();
        int[] iArr2 = new int[i12 * 3];
        Object[] objArr = new Object[i12 * 2];
        int i65 = charAt2 + charAt3;
        int i66 = i65;
        int i67 = charAt3;
        int i68 = 0;
        int i69 = 0;
        while (i37 < length) {
            int i70 = i37 + 1;
            int charAt23 = e10.charAt(i37);
            if (charAt23 >= c10) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    charAt15 = e10.charAt(i72);
                    if (charAt15 < c10) {
                        break;
                    }
                    i71 |= (charAt15 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                charAt23 = i71 | (charAt15 << i73);
                i21 = i33;
            } else {
                i21 = i70;
            }
            int i74 = i21 + 1;
            int charAt24 = e10.charAt(i21);
            if (charAt24 >= c10) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    charAt14 = e10.charAt(i76);
                    i22 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                    length = i22;
                }
                charAt24 = i75 | (charAt14 << i77);
                i23 = i32;
            } else {
                i22 = length;
                i23 = i74;
            }
            int i78 = charAt24 & 255;
            int i79 = i65;
            if ((charAt24 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
                iArr[i69] = i68;
                i69++;
            }
            int i80 = charAt3;
            Unsafe unsafe = f10044s;
            if (i78 >= 51) {
                int i81 = i23 + 1;
                int charAt25 = e10.charAt(i23);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i31 = i83 + 1;
                        charAt13 = e10.charAt(i83);
                        i24 = charAt;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i82 |= (charAt13 & 8191) << i84;
                        i84 += 13;
                        i83 = i31;
                        charAt = i24;
                    }
                    charAt25 = i82 | (charAt13 << i84);
                    i30 = i31;
                } else {
                    i24 = charAt;
                    i30 = i81;
                }
                int i85 = i78 - 51;
                int i86 = i30;
                if (i85 == 9 || i85 == 17) {
                    objArr[((i68 / 3) * 2) + 1] = d10[i10];
                    i10++;
                } else if (i85 == 12 && !z10) {
                    objArr[((i68 / 3) * 2) + 1] = d10[i10];
                    i10++;
                }
                int i87 = charAt25 * 2;
                Object obj = d10[i87];
                if (obj instanceof Field) {
                    R2 = (Field) obj;
                } else {
                    R2 = R(cls, (String) obj);
                    d10[i87] = R2;
                }
                int i88 = i10;
                objectFieldOffset = (int) unsafe.objectFieldOffset(R2);
                int i89 = i87 + 1;
                Object obj2 = d10[i89];
                if (obj2 instanceof Field) {
                    R3 = (Field) obj2;
                } else {
                    R3 = R(cls, (String) obj2);
                    d10[i89] = R3;
                }
                str = e10;
                i26 = (int) unsafe.objectFieldOffset(R3);
                i10 = i88;
                i27 = i86;
                i28 = 0;
            } else {
                i24 = charAt;
                int i90 = i10 + 1;
                Field R4 = R(cls, (String) d10[i10]);
                if (i78 == 9 || i78 == 17) {
                    objArr[((i68 / 3) * 2) + 1] = R4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i25 = i90 + 1;
                        objArr[((i68 / 3) * 2) + 1] = d10[i90];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (!z10) {
                            i25 = i90 + 1;
                            objArr[((i68 / 3) * 2) + 1] = d10[i90];
                        }
                    } else if (i78 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i68;
                        int i92 = (i68 / 3) * 2;
                        i25 = i90 + 1;
                        objArr[i92] = d10[i90];
                        if ((charAt24 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0) {
                            i90 = i25 + 1;
                            objArr[i92 + 1] = d10[i25];
                            i67 = i91;
                        } else {
                            i67 = i91;
                        }
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(R4);
                    if (((charAt24 & 4096) != 4096) || i78 > 17) {
                        str = e10;
                        i26 = 1048575;
                        i27 = i23;
                        i28 = 0;
                    } else {
                        i27 = i23 + 1;
                        int charAt26 = e10.charAt(i23);
                        if (charAt26 >= 55296) {
                            int i93 = charAt26 & 8191;
                            int i94 = 13;
                            while (true) {
                                i29 = i27 + 1;
                                charAt12 = e10.charAt(i27);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i93 |= (charAt12 & 8191) << i94;
                                i94 += 13;
                                i27 = i29;
                            }
                            charAt26 = i93 | (charAt12 << i94);
                            i27 = i29;
                        }
                        int i95 = (charAt26 / 32) + (i35 * 2);
                        Object obj3 = d10[i95];
                        str = e10;
                        if (obj3 instanceof Field) {
                            R = (Field) obj3;
                        } else {
                            R = R(cls, (String) obj3);
                            d10[i95] = R;
                        }
                        i26 = (int) unsafe.objectFieldOffset(R);
                        i28 = charAt26 % 32;
                    }
                    if (i78 >= 18 && i78 <= 49) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i10 = i25;
                }
                i25 = i90;
                objectFieldOffset = (int) unsafe.objectFieldOffset(R4);
                if ((charAt24 & 4096) != 4096) {
                }
                str = e10;
                i26 = 1048575;
                i27 = i23;
                i28 = 0;
                if (i78 >= 18) {
                    iArr[i66] = objectFieldOffset;
                    i66++;
                }
                i10 = i25;
            }
            int i96 = i68 + 1;
            iArr2[i68] = charAt23;
            int i97 = i96 + 1;
            int i98 = i35;
            iArr2[i96] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i78 << 20) | objectFieldOffset;
            int i99 = i97 + 1;
            iArr2[i97] = i26 | (i28 << 20);
            i37 = i27;
            i35 = i98;
            i65 = i79;
            length = i22;
            e10 = str;
            charAt3 = i80;
            charAt = i24;
            c10 = 55296;
            i68 = i99;
        }
        return new t0<>(iArr2, objArr, i11, charAt, d1Var.b(), z10, iArr, charAt3, i65, v0Var, g0Var, m1Var, oVar, l0Var);
    }

    public static long F(int i6) {
        return i6 & 1048575;
    }

    public static int G(long j10, Object obj) {
        return ((Integer) q1.p(j10, obj)).intValue();
    }

    public static long H(long j10, Object obj) {
        return ((Long) q1.p(j10, obj)).longValue();
    }

    public static Field R(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder g5 = defpackage.d.g("Field ", str, " for ");
            g5.append(cls.getName());
            g5.append(" not found. Known fields are ");
            g5.append(Arrays.toString(declaredFields));
            throw new RuntimeException(g5.toString());
        }
    }

    public static void a0(int i6, Object obj, k kVar) {
        if (obj instanceof String) {
            kVar.f9994a.x0(i6, (String) obj);
            return;
        }
        kVar.b(i6, (h) obj);
    }

    public static void l(Object obj) {
        if (v(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i6, int i10, s1 s1Var, Class cls, f.a aVar) {
        boolean z10;
        switch (s1Var.ordinal()) {
            case 0:
                aVar.f9907c = Double.valueOf(Double.longBitsToDouble(f.i(bArr, i6)));
                return i6 + 8;
            case 1:
                aVar.f9907c = Float.valueOf(Float.intBitsToFloat(f.g(bArr, i6)));
                return i6 + 4;
            case 2:
            case 3:
                int I = f.I(bArr, i6, aVar);
                aVar.f9907c = Long.valueOf(aVar.f9906b);
                return I;
            case 4:
            case 12:
            case 13:
                int G = f.G(bArr, i6, aVar);
                aVar.f9907c = Integer.valueOf(aVar.f9905a);
                return G;
            case 5:
            case 15:
                aVar.f9907c = Long.valueOf(f.i(bArr, i6));
                return i6 + 8;
            case 6:
            case 14:
                aVar.f9907c = Integer.valueOf(f.g(bArr, i6));
                return i6 + 4;
            case 7:
                int I2 = f.I(bArr, i6, aVar);
                if (aVar.f9906b != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.f9907c = Boolean.valueOf(z10);
                return I2;
            case 8:
                return f.D(bArr, i6, aVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return f.n(b1.f9887c.a(cls), bArr, i6, i10, aVar);
            case 11:
                return f.b(bArr, i6, aVar);
            case 16:
                int G2 = f.G(bArr, i6, aVar);
                aVar.f9907c = Integer.valueOf(i.b(aVar.f9905a));
                return G2;
            case 17:
                int I3 = f.I(bArr, i6, aVar);
                aVar.f9907c = Long.valueOf(i.c(aVar.f9906b));
                return I3;
        }
    }

    public static n1 r(Object obj) {
        v vVar = (v) obj;
        n1 n1Var = vVar.unknownFields;
        if (n1Var == n1.f) {
            n1 n1Var2 = new n1();
            vVar.unknownFields = n1Var2;
            return n1Var2;
        }
        return n1Var;
    }

    public static boolean v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v) {
            return ((v) obj).D();
        }
        return true;
    }

    public static List x(long j10, Object obj) {
        return (List) q1.p(j10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(Object obj, int i6, Object obj2) {
        int[] iArr;
        int i10 = this.f10045a[i6];
        if (!w(i10, i6, obj2)) {
            return;
        }
        long X = X(i6) & 1048575;
        Unsafe unsafe = f10044s;
        Object object = unsafe.getObject(obj2, X);
        if (object != null) {
            g1 q10 = q(i6);
            if (!w(i10, i6, obj)) {
                if (!v(object)) {
                    unsafe.putObject(obj, X, object);
                } else {
                    Object i11 = q10.i();
                    q10.a(i11, object);
                    unsafe.putObject(obj, X, i11);
                }
                T(i10, i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X);
            if (!v(object2)) {
                Object i12 = q10.i();
                q10.a(i12, object2);
                unsafe.putObject(obj, X, i12);
                object2 = i12;
            }
            q10.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object B(int i6, Object obj) {
        g1 q10 = q(i6);
        long X = X(i6) & 1048575;
        if (!u(i6, obj)) {
            return q10.i();
        }
        Object object = f10044s.getObject(obj, X);
        if (v(object)) {
            return object;
        }
        Object i10 = q10.i();
        if (object != null) {
            q10.a(i10, object);
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object C(int i6, int i10, Object obj) {
        g1 q10 = q(i10);
        if (!w(i6, i10, obj)) {
            return q10.i();
        }
        Object object = f10044s.getObject(obj, X(i10) & 1048575);
        if (v(object)) {
            return object;
        }
        Object i11 = q10.i();
        if (object != null) {
            q10.a(i11, object);
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public final <K, V> int I(T t3, byte[] bArr, int i6, int i10, int i11, long j10, f.a aVar) {
        Object p10 = p(i11);
        Unsafe unsafe = f10044s;
        Object object = unsafe.getObject(t3, j10);
        l0 l0Var = this.f10060q;
        if (l0Var.g(object)) {
            k0 d10 = l0Var.d();
            l0Var.a(d10, object);
            unsafe.putObject(t3, j10, d10);
            object = d10;
        }
        j0.a<?, ?> c10 = l0Var.c(p10);
        k0 e10 = l0Var.e(object);
        int G = f.G(bArr, i6, aVar);
        int i12 = aVar.f9905a;
        if (i12 >= 0 && i12 <= i10 - G) {
            int i13 = G + i12;
            K k10 = c10.f9975b;
            V v10 = c10.f9977d;
            K k11 = k10;
            V v11 = v10;
            while (G < i13) {
                int i14 = G + 1;
                byte b10 = bArr[G];
                if (b10 < 0) {
                    i14 = f.F(b10, bArr, i14, aVar);
                    b10 = aVar.f9905a;
                }
                int i15 = b10 >>> 3;
                int i16 = b10 & 7;
                if (i15 != 1) {
                    if (i15 == 2) {
                        s1 s1Var = c10.f9976c;
                        if (i16 == s1Var.f10041v) {
                            G = m(bArr, i14, i10, s1Var, v10.getClass(), aVar);
                            v11 = aVar.f9907c;
                        }
                    }
                    G = f.M(b10, bArr, i14, i10, aVar);
                } else {
                    s1 s1Var2 = c10.f9974a;
                    if (i16 == s1Var2.f10041v) {
                        G = m(bArr, i14, i10, s1Var2, null, aVar);
                        k11 = aVar.f9907c;
                    } else {
                        G = f.M(b10, bArr, i14, i10, aVar);
                    }
                }
            }
            if (G == i13) {
                e10.put(k11, v11);
                return i13;
            }
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.h();
    }

    public final int J(T t3, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, f.a aVar) {
        boolean z10;
        long j11 = this.f10045a[i16 + 2] & 1048575;
        Unsafe unsafe = f10044s;
        switch (i15) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i13 == 1) {
                    unsafe.putObject(t3, j10, Double.valueOf(f.d(bArr, i6)));
                    int i17 = i6 + 8;
                    unsafe.putInt(t3, j11, i12);
                    return i17;
                }
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i13 == 5) {
                    unsafe.putObject(t3, j10, Float.valueOf(f.k(bArr, i6)));
                    int i18 = i6 + 4;
                    unsafe.putInt(t3, j11, i12);
                    return i18;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i13 == 0) {
                    int I = f.I(bArr, i6, aVar);
                    unsafe.putObject(t3, j10, Long.valueOf(aVar.f9906b));
                    unsafe.putInt(t3, j11, i12);
                    return I;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i13 == 0) {
                    int G = f.G(bArr, i6, aVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(aVar.f9905a));
                    unsafe.putInt(t3, j11, i12);
                    return G;
                }
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i13 == 1) {
                    unsafe.putObject(t3, j10, Long.valueOf(f.i(bArr, i6)));
                    int i19 = i6 + 8;
                    unsafe.putInt(t3, j11, i12);
                    return i19;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                if (i13 == 5) {
                    unsafe.putObject(t3, j10, Integer.valueOf(f.g(bArr, i6)));
                    int i20 = i6 + 4;
                    unsafe.putInt(t3, j11, i12);
                    return i20;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i13 == 0) {
                    int I2 = f.I(bArr, i6, aVar);
                    if (aVar.f9906b != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    unsafe.putObject(t3, j10, Boolean.valueOf(z10));
                    unsafe.putInt(t3, j11, i12);
                    return I2;
                }
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i13 == 2) {
                    int G2 = f.G(bArr, i6, aVar);
                    int i21 = aVar.f9905a;
                    if (i21 == 0) {
                        unsafe.putObject(t3, j10, "");
                    } else if ((i14 & 536870912) != 0 && !r1.f(G2, bArr, G2 + i21)) {
                        throw InvalidProtocolBufferException.c();
                    } else {
                        unsafe.putObject(t3, j10, new String(bArr, G2, i21, y.f10086a));
                        G2 += i21;
                    }
                    unsafe.putInt(t3, j11, i12);
                    return G2;
                }
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i13 == 2) {
                    Object C = C(i12, i16, t3);
                    int L = f.L(C, q(i16), bArr, i6, i10, aVar);
                    W(i12, t3, C, i16);
                    return L;
                }
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i13 == 2) {
                    int b10 = f.b(bArr, i6, aVar);
                    unsafe.putObject(t3, j10, aVar.f9907c);
                    unsafe.putInt(t3, j11, i12);
                    return b10;
                }
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i13 == 0) {
                    int G3 = f.G(bArr, i6, aVar);
                    int i22 = aVar.f9905a;
                    y.b o10 = o(i16);
                    if (o10 != null && !o10.a(i22)) {
                        r(t3).c(i11, Long.valueOf(i22));
                    } else {
                        unsafe.putObject(t3, j10, Integer.valueOf(i22));
                        unsafe.putInt(t3, j11, i12);
                    }
                    return G3;
                }
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i13 == 0) {
                    int G4 = f.G(bArr, i6, aVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(i.b(aVar.f9905a)));
                    unsafe.putInt(t3, j11, i12);
                    return G4;
                }
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i13 == 0) {
                    int I3 = f.I(bArr, i6, aVar);
                    unsafe.putObject(t3, j10, Long.valueOf(i.c(aVar.f9906b)));
                    unsafe.putInt(t3, j11, i12);
                    return I3;
                }
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i13 == 3) {
                    Object C2 = C(i12, i16, t3);
                    int K = f.K(C2, q(i16), bArr, i6, i10, (i11 & (-8)) | 4, aVar);
                    W(i12, t3, C2, i16);
                    return K;
                }
                break;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0431 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0445  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K(T t3, byte[] bArr, int i6, int i10, int i11, f.a aVar) {
        Unsafe unsafe;
        t0<T> t0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        T t10;
        int i17;
        int i18;
        int U;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        byte[] bArr2;
        f.a aVar2;
        byte[] bArr3;
        int i30;
        byte[] bArr4;
        byte[] bArr5;
        int i31;
        int i32;
        int i33;
        int i34;
        t0<T> t0Var2 = this;
        T t11 = t3;
        byte[] bArr6 = bArr;
        int i35 = i10;
        f.a aVar3 = aVar;
        l(t3);
        Unsafe unsafe2 = f10044s;
        int i36 = i6;
        int i37 = i11;
        int i38 = 0;
        int i39 = -1;
        int i40 = 0;
        int i41 = 1048575;
        int i42 = 0;
        while (true) {
            if (i36 < i35) {
                int i43 = i36 + 1;
                byte b10 = bArr6[i36];
                if (b10 < 0) {
                    i18 = f.F(b10, bArr6, i43, aVar3);
                    i17 = aVar3.f9905a;
                } else {
                    i17 = b10;
                    i18 = i43;
                }
                int i44 = i17 >>> 3;
                int i45 = i17 & 7;
                int i46 = t0Var2.f10048d;
                int i47 = i18;
                int i48 = t0Var2.f10047c;
                int i49 = i37;
                if (i44 > i39) {
                    U = (i44 < i48 || i44 > i46) ? -1 : t0Var2.U(i44, i40 / 3);
                    i19 = -1;
                } else {
                    U = (i44 < i48 || i44 > i46) ? -1 : t0Var2.U(i44, 0);
                    i19 = -1;
                }
                if (U == i19) {
                    i20 = i17;
                    i21 = i44;
                    i22 = i49;
                    i23 = 0;
                    i15 = i42;
                    i24 = i47;
                } else {
                    int[] iArr = t0Var2.f10045a;
                    int i50 = iArr[U + 1];
                    int i51 = (i50 & 267386880) >>> 20;
                    long j10 = i50 & 1048575;
                    int i52 = i17;
                    if (i51 <= 17) {
                        int i53 = iArr[U + 2];
                        int i54 = 1 << (i53 >>> 20);
                        int i55 = i53 & 1048575;
                        if (i55 != i41) {
                            if (i41 != 1048575) {
                                unsafe2.putInt(t11, i41, i42);
                            }
                            i28 = i55;
                            i15 = unsafe2.getInt(t11, i55);
                        } else {
                            i28 = i41;
                            i15 = i42;
                        }
                        switch (i51) {
                            case 0:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                bArr2 = bArr;
                                aVar2 = aVar;
                                if (i45 == 1) {
                                    q1.v(t11, j10, f.d(bArr2, i24));
                                    i36 = i24 + 8;
                                    i30 = i15 | i54;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 1:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                bArr2 = bArr;
                                aVar2 = aVar;
                                if (i45 == 5) {
                                    q1.w(t11, j10, f.k(bArr2, i24));
                                    i36 = i24 + 4;
                                    i30 = i15 | i54;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 2:
                            case 3:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                aVar2 = aVar;
                                if (i45 == 0) {
                                    int I = f.I(bArr, i24, aVar2);
                                    unsafe2.putLong(t3, j10, aVar2.f9906b);
                                    bArr2 = bArr;
                                    i42 = i15 | i54;
                                    i36 = I;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 4:
                            case 11:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                bArr2 = bArr;
                                aVar2 = aVar;
                                if (i45 == 0) {
                                    i36 = f.G(bArr2, i24, aVar2);
                                    unsafe2.putInt(t11, j10, aVar2.f9905a);
                                    i30 = i15 | i54;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 5:
                            case 14:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                bArr2 = bArr;
                                aVar2 = aVar;
                                if (i45 == 1) {
                                    unsafe2.putLong(t3, j10, f.i(bArr2, i24));
                                    bArr2 = bArr2;
                                    i36 = i24 + 8;
                                    i30 = i15 | i54;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    bArr3 = bArr2;
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 6:
                            case 13:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                bArr2 = bArr;
                                aVar2 = aVar;
                                if (i45 == 5) {
                                    unsafe2.putInt(t11, j10, f.g(bArr2, i24));
                                    i36 = i24 + 4;
                                    i30 = i15 | i54;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    bArr3 = bArr2;
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 7:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                bArr2 = bArr;
                                aVar2 = aVar;
                                if (i45 == 0) {
                                    int I2 = f.I(bArr2, i24, aVar2);
                                    q1.r(t11, j10, aVar2.f9906b != 0);
                                    i36 = I2;
                                    i30 = i15 | i54;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    bArr3 = bArr2;
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 8:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                bArr2 = bArr;
                                aVar2 = aVar;
                                if (i45 == 2) {
                                    if ((i50 & 536870912) == 0) {
                                        i36 = f.A(bArr2, i24, aVar2);
                                    } else {
                                        i36 = f.D(bArr2, i24, aVar2);
                                    }
                                    unsafe2.putObject(t11, j10, aVar2.f9907c);
                                    i30 = i15 | i54;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    bArr3 = bArr2;
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 9:
                                bArr4 = bArr;
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                aVar2 = aVar;
                                if (i45 == 2) {
                                    Object B = t0Var2.B(i23, t11);
                                    bArr5 = bArr4;
                                    i36 = f.L(B, t0Var2.q(i23), bArr, i24, i10, aVar);
                                    t0Var2.V(t11, i23, B);
                                    i30 = i15 | i54;
                                    bArr2 = bArr5;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 10:
                                bArr4 = bArr;
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                aVar2 = aVar;
                                if (i45 == 2) {
                                    i36 = f.b(bArr4, i24, aVar2);
                                    unsafe2.putObject(t11, j10, aVar2.f9907c);
                                    bArr5 = bArr4;
                                    i30 = i15 | i54;
                                    bArr2 = bArr5;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 12:
                                bArr4 = bArr;
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                aVar2 = aVar;
                                if (i45 == 0) {
                                    i36 = f.G(bArr4, i24, aVar2);
                                    int i56 = aVar2.f9905a;
                                    y.b o10 = t0Var2.o(i23);
                                    if (o10 != null && !o10.a(i56)) {
                                        r(t3).c(i20, Long.valueOf(i56));
                                        i37 = i11;
                                        i40 = i23;
                                        i42 = i15;
                                        i38 = i20;
                                        i39 = i21;
                                        i35 = i10;
                                        bArr6 = bArr4;
                                        aVar3 = aVar2;
                                        i41 = i29;
                                        break;
                                    } else {
                                        unsafe2.putInt(t11, j10, i56);
                                        bArr5 = bArr4;
                                        i30 = i15 | i54;
                                        bArr2 = bArr5;
                                        i42 = i30;
                                        i41 = i29;
                                        i37 = i11;
                                        bArr6 = bArr2;
                                        i40 = i23;
                                        i38 = i20;
                                        i39 = i21;
                                        i35 = i10;
                                        aVar3 = aVar2;
                                        break;
                                    }
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                aVar2 = aVar;
                                if (i45 == 0) {
                                    i36 = f.G(bArr4, i24, aVar2);
                                    unsafe2.putInt(t11, j10, i.b(aVar2.f9905a));
                                    bArr5 = bArr4;
                                    i30 = i15 | i54;
                                    bArr2 = bArr5;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 16:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                if (i45 == 0) {
                                    int I3 = f.I(bArr, i24, aVar);
                                    i21 = i44;
                                    aVar2 = aVar;
                                    unsafe2.putLong(t3, j10, i.c(aVar.f9906b));
                                    i30 = i15 | i54;
                                    i36 = I3;
                                    bArr2 = bArr;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i21 = i44;
                                    bArr3 = bArr;
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            case 17:
                                if (i45 == 3) {
                                    Object B2 = t0Var2.B(U, t11);
                                    i20 = i52;
                                    i29 = i28;
                                    i23 = U;
                                    i36 = f.K(B2, t0Var2.q(U), bArr, i47, i10, (i44 << 3) | 4, aVar);
                                    t0Var2.V(t11, i23, B2);
                                    i30 = i15 | i54;
                                    bArr2 = bArr;
                                    i21 = i44;
                                    aVar2 = aVar;
                                    i42 = i30;
                                    i41 = i29;
                                    i37 = i11;
                                    bArr6 = bArr2;
                                    i40 = i23;
                                    i38 = i20;
                                    i39 = i21;
                                    i35 = i10;
                                    aVar3 = aVar2;
                                    break;
                                } else {
                                    i24 = i47;
                                    i29 = i28;
                                    i20 = i52;
                                    i23 = U;
                                    i21 = i44;
                                    i41 = i29;
                                    i22 = i11;
                                    break;
                                }
                            default:
                                i24 = i47;
                                i29 = i28;
                                i20 = i52;
                                i23 = U;
                                i21 = i44;
                                i41 = i29;
                                i22 = i11;
                                break;
                        }
                    } else {
                        int i57 = U;
                        aVar2 = aVar;
                        if (i51 != 27) {
                            i25 = i41;
                            i31 = i42;
                            if (i51 <= 49) {
                                i27 = i44;
                                unsafe = unsafe2;
                                i34 = i57;
                                i33 = i52;
                                i36 = M(t3, bArr, i47, i10, i52, i44, i45, i57, i50, i51, j10, aVar);
                                if (i36 != i47) {
                                    t0Var2 = this;
                                    t11 = t3;
                                    bArr6 = bArr;
                                    i35 = i10;
                                    i37 = i11;
                                    aVar3 = aVar;
                                    i39 = i27;
                                    i41 = i25;
                                    i40 = i34;
                                    i42 = i31;
                                    i38 = i33;
                                    unsafe2 = unsafe;
                                } else {
                                    i14 = i11;
                                    i26 = i36;
                                    i23 = i34;
                                    i15 = i31;
                                    i13 = i33;
                                    if (i13 == i14 || i14 == 0) {
                                        if (!this.f && aVar.f9908d != n.a()) {
                                            i36 = f.f(i13, bArr, i26, i10, t3, this.f10049e, aVar);
                                        } else {
                                            i36 = f.E(i13, bArr, i26, i10, r(t3), aVar);
                                        }
                                        t11 = t3;
                                        i35 = i10;
                                        i37 = i14;
                                        i38 = i13;
                                        t0Var2 = this;
                                        i40 = i23;
                                        i42 = i15;
                                        i39 = i27;
                                        i41 = i25;
                                        unsafe2 = unsafe;
                                        bArr6 = bArr;
                                        aVar3 = aVar;
                                    } else {
                                        i16 = 1048575;
                                        t0Var = this;
                                        i12 = i26;
                                        i41 = i25;
                                    }
                                }
                            } else {
                                unsafe = unsafe2;
                                i32 = i47;
                                i33 = i52;
                                i27 = i44;
                                i34 = i57;
                                if (i51 != 50) {
                                    i36 = J(t3, bArr, i32, i10, i33, i27, i45, i50, i51, j10, i34, aVar);
                                    if (i36 != i32) {
                                        t0Var2 = this;
                                        t11 = t3;
                                        bArr6 = bArr;
                                        i35 = i10;
                                        i37 = i11;
                                        aVar3 = aVar;
                                        i39 = i27;
                                        i41 = i25;
                                        i40 = i34;
                                        i42 = i31;
                                        i38 = i33;
                                        unsafe2 = unsafe;
                                    } else {
                                        i14 = i11;
                                        i26 = i36;
                                        i23 = i34;
                                        i15 = i31;
                                        i13 = i33;
                                        if (i13 == i14) {
                                        }
                                        if (!this.f) {
                                        }
                                        i36 = f.E(i13, bArr, i26, i10, r(t3), aVar);
                                        t11 = t3;
                                        i35 = i10;
                                        i37 = i14;
                                        i38 = i13;
                                        t0Var2 = this;
                                        i40 = i23;
                                        i42 = i15;
                                        i39 = i27;
                                        i41 = i25;
                                        unsafe2 = unsafe;
                                        bArr6 = bArr;
                                        aVar3 = aVar;
                                    }
                                } else if (i45 == 2) {
                                    i36 = I(t3, bArr, i32, i10, i34, j10, aVar);
                                    if (i36 != i32) {
                                        t0Var2 = this;
                                        t11 = t3;
                                        bArr6 = bArr;
                                        i35 = i10;
                                        i37 = i11;
                                        aVar3 = aVar;
                                        i39 = i27;
                                        i41 = i25;
                                        i40 = i34;
                                        i42 = i31;
                                        i38 = i33;
                                        unsafe2 = unsafe;
                                    } else {
                                        i14 = i11;
                                        i26 = i36;
                                        i23 = i34;
                                        i15 = i31;
                                        i13 = i33;
                                        if (i13 == i14) {
                                        }
                                        if (!this.f) {
                                        }
                                        i36 = f.E(i13, bArr, i26, i10, r(t3), aVar);
                                        t11 = t3;
                                        i35 = i10;
                                        i37 = i14;
                                        i38 = i13;
                                        t0Var2 = this;
                                        i40 = i23;
                                        i42 = i15;
                                        i39 = i27;
                                        i41 = i25;
                                        unsafe2 = unsafe;
                                        bArr6 = bArr;
                                        aVar3 = aVar;
                                    }
                                }
                            }
                        } else if (i45 == 2) {
                            y.d dVar = (y.d) unsafe2.getObject(t11, j10);
                            if (!dVar.d0()) {
                                int size = dVar.size();
                                dVar = dVar.A(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t11, j10, dVar);
                            }
                            i36 = f.o(t0Var2.q(i57), i52, bArr, i47, i10, dVar, aVar);
                            bArr6 = bArr;
                            i37 = i11;
                            i40 = i57;
                            i38 = i52;
                            i41 = i41;
                            i39 = i44;
                            i42 = i42;
                            i35 = i10;
                            aVar3 = aVar2;
                        } else {
                            i25 = i41;
                            i31 = i42;
                            unsafe = unsafe2;
                            i32 = i47;
                            i33 = i52;
                            i27 = i44;
                            i34 = i57;
                        }
                        i36 = i32;
                        i14 = i11;
                        i26 = i36;
                        i23 = i34;
                        i15 = i31;
                        i13 = i33;
                        if (i13 == i14) {
                        }
                        if (!this.f) {
                        }
                        i36 = f.E(i13, bArr, i26, i10, r(t3), aVar);
                        t11 = t3;
                        i35 = i10;
                        i37 = i14;
                        i38 = i13;
                        t0Var2 = this;
                        i40 = i23;
                        i42 = i15;
                        i39 = i27;
                        i41 = i25;
                        unsafe2 = unsafe;
                        bArr6 = bArr;
                        aVar3 = aVar;
                    }
                }
                i14 = i22;
                i25 = i41;
                i26 = i24;
                unsafe = unsafe2;
                i13 = i20;
                i27 = i21;
                if (i13 == i14) {
                }
                if (!this.f) {
                }
                i36 = f.E(i13, bArr, i26, i10, r(t3), aVar);
                t11 = t3;
                i35 = i10;
                i37 = i14;
                i38 = i13;
                t0Var2 = this;
                i40 = i23;
                i42 = i15;
                i39 = i27;
                i41 = i25;
                unsafe2 = unsafe;
                bArr6 = bArr;
                aVar3 = aVar;
            } else {
                int i58 = i42;
                unsafe = unsafe2;
                t0Var = t0Var2;
                i12 = i36;
                i13 = i38;
                i14 = i37;
                i15 = i58;
                i16 = 1048575;
            }
        }
        if (i41 != i16) {
            t10 = t3;
            unsafe.putInt(t10, i41, i15);
        } else {
            t10 = t3;
        }
        n1 n1Var = null;
        for (int i59 = t0Var.f10054k; i59 < t0Var.f10055l; i59++) {
            n1Var = (n1) n(t3, t0Var.f10053j[i59], n1Var, t0Var.f10058o, t3);
        }
        if (n1Var != null) {
            t0Var.f10058o.n(t10, n1Var);
        }
        if (i14 == 0) {
            if (i12 != i10) {
                throw InvalidProtocolBufferException.g();
            }
        } else if (i12 > i10 || i13 != i14) {
            throw InvalidProtocolBufferException.g();
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a3, code lost:
        if (r0 != r20) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a6, code lost:
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d1, code lost:
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ef, code lost:
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f1, code lost:
        r12 = r17;
        r9 = r24;
        r10 = r25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(Object obj, byte[] bArr, int i6, int i10, f.a aVar) {
        byte b10;
        int i11;
        int U;
        int i12;
        T t3;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe;
        int i17;
        int i18;
        int i19;
        t0<T> t0Var;
        int i20;
        int i21;
        t0<T> t0Var2;
        int i22;
        int I;
        int i23;
        int G;
        int i24 = i10;
        l(obj);
        Unsafe unsafe2 = f10044s;
        int i25 = 0;
        t0<T> t0Var3 = this;
        T t10 = obj;
        byte[] bArr2 = bArr;
        int i26 = i6;
        f.a aVar2 = aVar;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (i26 < i24) {
            int i31 = i26 + 1;
            byte b11 = bArr2[i26];
            if (b11 < 0) {
                i11 = f.F(b11, bArr2, i31, aVar2);
                b10 = aVar2.f9905a;
            } else {
                b10 = b11;
                i11 = i31;
            }
            int i32 = b10 >>> 3;
            int i33 = b10 & 7;
            int i34 = t0Var3.f10048d;
            int i35 = t0Var3.f10047c;
            if (i32 > i27) {
                int i36 = i28 / 3;
                if (i32 >= i35 && i32 <= i34) {
                    U = t0Var3.U(i32, i36);
                }
                U = -1;
            } else {
                if (i32 >= i35 && i32 <= i34) {
                    U = t0Var3.U(i32, i25);
                }
                U = -1;
            }
            int i37 = U;
            if (i37 == -1) {
                i12 = i32;
                i22 = i11;
                i17 = 0;
            } else {
                int[] iArr = t0Var3.f10045a;
                int i38 = iArr[i37 + 1];
                int i39 = (i38 & 267386880) >>> 20;
                int i40 = i11;
                t0<T> t0Var4 = t0Var3;
                long j10 = i38 & 1048575;
                if (i39 <= 17) {
                    int i41 = iArr[i37 + 2];
                    boolean z10 = true;
                    int i42 = 1 << (i41 >>> 20);
                    int i43 = i41 & 1048575;
                    if (i43 != i30) {
                        if (i30 != 1048575) {
                            unsafe2.putInt(t10, i30, i29);
                        }
                        if (i43 != 1048575) {
                            i29 = unsafe2.getInt(t10, i43);
                        }
                        i30 = i43;
                    }
                    switch (i39) {
                        case 0:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 1) {
                                q1.v(t3, j10, f.d(bArr2, i22));
                                G = i22 + 8;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 1:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 5) {
                                q1.w(t3, j10, f.k(bArr2, i22));
                                G = i22 + 4;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 2:
                        case 3:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 0) {
                                I = f.I(bArr2, i22, aVar2);
                                i23 = i21;
                                unsafe2.putLong((Object) obj, j10, aVar2.f9906b);
                                i29 |= i42;
                                i21 = i23;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 4:
                        case 11:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 0) {
                                G = f.G(bArr2, i22, aVar2);
                                unsafe2.putInt(t3, j10, aVar2.f9905a);
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 5:
                        case 14:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 1) {
                                unsafe2.putLong((Object) obj, j10, f.i(bArr2, i22));
                                i21 = i21;
                                G = i22 + 8;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 6:
                        case 13:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 5) {
                                unsafe2.putInt(t3, j10, f.g(bArr2, i22));
                                G = i22 + 4;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 7:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 0) {
                                G = f.I(bArr2, i22, aVar2);
                                if (aVar2.f9906b == 0) {
                                    z10 = false;
                                }
                                q1.r(t3, j10, z10);
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 8:
                            t3 = t10;
                            i21 = i37;
                            t0Var2 = t0Var4;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 2) {
                                if ((536870912 & i38) == 0) {
                                    G = f.A(bArr2, i22, aVar2);
                                } else {
                                    G = f.D(bArr2, i22, aVar2);
                                }
                                unsafe2.putObject(t3, j10, aVar2.f9907c);
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i17 = i21;
                            break;
                        case 9:
                            t3 = t10;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 2) {
                                t0Var2 = t0Var4;
                                Object B = t0Var2.B(i37, t3);
                                G = f.L(B, t0Var2.q(i37), bArr, i22, i10, aVar);
                                t0Var2.V(t3, i37, B);
                                i21 = i37;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i21 = i37;
                            i17 = i21;
                            break;
                        case 10:
                            t3 = t10;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 2) {
                                G = f.b(bArr2, i22, aVar2);
                                unsafe2.putObject(t3, j10, aVar2.f9907c);
                                i21 = i37;
                                t0Var2 = t0Var4;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i21 = i37;
                            i17 = i21;
                            break;
                        case 12:
                            t3 = t10;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 0) {
                                G = f.G(bArr2, i22, aVar2);
                                unsafe2.putInt(t3, j10, aVar2.f9905a);
                                i21 = i37;
                                t0Var2 = t0Var4;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i21 = i37;
                            i17 = i21;
                            break;
                        case 15:
                            t3 = t10;
                            i22 = i40;
                            i12 = i32;
                            if (i33 == 0) {
                                G = f.G(bArr2, i22, aVar2);
                                unsafe2.putInt(t3, j10, i.b(aVar2.f9905a));
                                i21 = i37;
                                t0Var2 = t0Var4;
                                I = G;
                                i29 |= i42;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            }
                            i21 = i37;
                            i17 = i21;
                            break;
                        case 16:
                            i22 = i40;
                            if (i33 == 0) {
                                I = f.I(bArr2, i22, aVar2);
                                i12 = i32;
                                unsafe2.putLong((Object) obj, j10, i.c(aVar2.f9906b));
                                t3 = t10;
                                i23 = i37;
                                t0Var2 = t0Var4;
                                i29 |= i42;
                                i21 = i23;
                                i19 = i21;
                                i26 = I;
                                t0Var = t0Var2;
                                break;
                            } else {
                                i12 = i32;
                                i21 = i37;
                                i17 = i21;
                                break;
                            }
                        default:
                            i21 = i37;
                            i22 = i40;
                            i12 = i32;
                            i17 = i21;
                            break;
                    }
                } else {
                    i12 = i32;
                    t3 = t10;
                    if (i39 == 27) {
                        if (i33 == 2) {
                            y.d dVar = (y.d) unsafe2.getObject(t3, j10);
                            if (!dVar.d0()) {
                                int size = dVar.size();
                                if (size == 0) {
                                    i20 = 10;
                                } else {
                                    i20 = size * 2;
                                }
                                dVar = dVar.A(i20);
                                unsafe2.putObject(t3, j10, dVar);
                            }
                            i19 = i37;
                            t0Var = t0Var4;
                            i26 = f.o(t0Var4.q(i37), b10, bArr, i40, i10, dVar, aVar);
                        } else {
                            i14 = i40;
                            i13 = i37;
                            i15 = i29;
                            i16 = i30;
                            unsafe = unsafe2;
                        }
                    } else {
                        i13 = i37;
                        if (i39 <= 49) {
                            i15 = i29;
                            i16 = i30;
                            unsafe = unsafe2;
                            i26 = M(obj, bArr, i40, i10, b10, i12, i33, i13, i38, i39, j10, aVar);
                        } else {
                            i14 = i40;
                            i15 = i29;
                            i16 = i30;
                            unsafe = unsafe2;
                            if (i39 == 50) {
                                if (i33 == 2) {
                                    i26 = I(obj, bArr, i14, i10, i13, j10, aVar);
                                }
                            } else {
                                i26 = J(obj, bArr, i14, i10, b10, i12, i33, i38, i39, j10, i13, aVar);
                            }
                        }
                        t0Var3 = this;
                        t10 = obj;
                        bArr2 = bArr;
                        aVar2 = aVar;
                        i28 = i17;
                        i24 = i10;
                        i27 = i12;
                        unsafe2 = unsafe;
                        i25 = 0;
                    }
                    int i44 = i14;
                    i18 = i44;
                    i17 = i13;
                    i29 = i15;
                    i30 = i16;
                    i26 = f.E(b10, bArr, i18, i10, r(obj), aVar);
                    t0Var3 = this;
                    t10 = obj;
                    bArr2 = bArr;
                    aVar2 = aVar;
                    i28 = i17;
                    i24 = i10;
                    i27 = i12;
                    unsafe2 = unsafe;
                    i25 = 0;
                }
                t0Var3 = t0Var;
                t10 = t3;
                unsafe = unsafe2;
                i28 = i19;
                i24 = i10;
                i27 = i12;
                unsafe2 = unsafe;
                i25 = 0;
            }
            i18 = i22;
            unsafe = unsafe2;
            i26 = f.E(b10, bArr, i18, i10, r(obj), aVar);
            t0Var3 = this;
            t10 = obj;
            bArr2 = bArr;
            aVar2 = aVar;
            i28 = i17;
            i24 = i10;
            i27 = i12;
            unsafe2 = unsafe;
            i25 = 0;
        }
        int i45 = i29;
        Unsafe unsafe3 = unsafe2;
        if (i30 != 1048575) {
            unsafe3.putInt((Object) obj, i30, i45);
        }
        if (i26 == i10) {
            return;
        }
        throw InvalidProtocolBufferException.g();
    }

    public final int M(T t3, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, f.a aVar) {
        int H;
        int i16;
        Unsafe unsafe = f10044s;
        y.d dVar = (y.d) unsafe.getObject(t3, j11);
        if (!dVar.d0()) {
            int size = dVar.size();
            if (size == 0) {
                i16 = 10;
            } else {
                i16 = size * 2;
            }
            dVar = dVar.A(i16);
            unsafe.putObject(t3, j11, dVar);
        }
        switch (i15) {
            case 18:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                if (i13 == 2) {
                    return f.q(bArr, i6, dVar, aVar);
                }
                if (i13 == 1) {
                    return f.e(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i13 == 2) {
                    return f.t(bArr, i6, dVar, aVar);
                }
                if (i13 == 5) {
                    return f.l(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 20:
            case 21:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i13 == 2) {
                    return f.x(bArr, i6, dVar, aVar);
                }
                if (i13 == 0) {
                    return f.J(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 22:
            case 29:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                if (i13 == 2) {
                    return f.w(bArr, i6, dVar, aVar);
                }
                if (i13 == 0) {
                    return f.H(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 23:
            case 32:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                if (i13 == 2) {
                    return f.s(bArr, i6, dVar, aVar);
                }
                if (i13 == 1) {
                    return f.j(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 24:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                if (i13 == 2) {
                    return f.r(bArr, i6, dVar, aVar);
                }
                if (i13 == 5) {
                    return f.h(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 25:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                if (i13 == 2) {
                    return f.p(bArr, i6, dVar, aVar);
                }
                if (i13 == 0) {
                    return f.a(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 26:
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        return f.B(i11, bArr, i6, i10, dVar, aVar);
                    }
                    return f.C(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 27:
                if (i13 == 2) {
                    return f.o(q(i14), i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case 28:
                if (i13 == 2) {
                    return f.c(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                if (i13 == 2) {
                    H = f.w(bArr, i6, dVar, aVar);
                } else if (i13 == 0) {
                    H = f.H(i11, bArr, i6, i10, dVar, aVar);
                }
                h1.z(t3, i12, dVar, o(i14), null, this.f10058o);
                return H;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                if (i13 == 2) {
                    return f.u(bArr, i6, dVar, aVar);
                }
                if (i13 == 0) {
                    return f.y(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                if (i13 == 2) {
                    return f.v(bArr, i6, dVar, aVar);
                }
                if (i13 == 0) {
                    return f.z(i11, bArr, i6, i10, dVar, aVar);
                }
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                if (i13 == 3) {
                    return f.m(q(i14), i11, bArr, i6, i10, dVar, aVar);
                }
                break;
        }
        return i6;
    }

    public final <E> void N(Object obj, long j10, e1 e1Var, g1<E> g1Var, n nVar) {
        int x10;
        List c10 = this.f10057n.c(j10, obj);
        j jVar = (j) e1Var;
        int i6 = jVar.f9968b;
        if ((i6 & 7) == 3) {
            do {
                E i10 = g1Var.i();
                jVar.b(i10, g1Var, nVar);
                g1Var.c(i10);
                c10.add(i10);
                i iVar = jVar.f9967a;
                if (!iVar.e() && jVar.f9970d == 0) {
                    x10 = iVar.x();
                } else {
                    return;
                }
            } while (x10 == i6);
            jVar.f9970d = x10;
            return;
        }
        int i11 = InvalidProtocolBufferException.f9872w;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    public final <E> void O(Object obj, int i6, e1 e1Var, g1<E> g1Var, n nVar) {
        int x10;
        List c10 = this.f10057n.c(i6 & 1048575, obj);
        j jVar = (j) e1Var;
        int i10 = jVar.f9968b;
        if ((i10 & 7) == 2) {
            do {
                E i11 = g1Var.i();
                jVar.c(i11, g1Var, nVar);
                g1Var.c(i11);
                c10.add(i11);
                i iVar = jVar.f9967a;
                if (!iVar.e() && jVar.f9970d == 0) {
                    x10 = iVar.x();
                } else {
                    return;
                }
            } while (x10 == i10);
            jVar.f9970d = x10;
            return;
        }
        int i12 = InvalidProtocolBufferException.f9872w;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    public final void P(Object obj, int i6, e1 e1Var) {
        boolean z10;
        if ((536870912 & i6) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j jVar = (j) e1Var;
            jVar.w(2);
            q1.z(i6 & 1048575, obj, jVar.f9967a.w());
        } else if (this.f10050g) {
            j jVar2 = (j) e1Var;
            jVar2.w(2);
            q1.z(i6 & 1048575, obj, jVar2.f9967a.v());
        } else {
            q1.z(i6 & 1048575, obj, ((j) e1Var).e());
        }
    }

    public final void Q(Object obj, int i6, e1 e1Var) {
        boolean z10;
        if ((536870912 & i6) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0 g0Var = this.f10057n;
        if (z10) {
            ((j) e1Var).s(g0Var.c(i6 & 1048575, obj), true);
            return;
        }
        ((j) e1Var).s(g0Var.c(i6 & 1048575, obj), false);
    }

    public final void S(int i6, Object obj) {
        int i10 = this.f10045a[i6 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        q1.x((1 << (i10 >>> 20)) | q1.n(j10, obj), j10, obj);
    }

    public final void T(int i6, int i10, Object obj) {
        q1.x(i6, this.f10045a[i10 + 2] & 1048575, obj);
    }

    public final int U(int i6, int i10) {
        int[] iArr = this.f10045a;
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

    public final void V(T t3, int i6, Object obj) {
        f10044s.putObject(t3, X(i6) & 1048575, obj);
        S(i6, t3);
    }

    public final void W(int i6, Object obj, Object obj2, int i10) {
        f10044s.putObject(obj, X(i10) & 1048575, obj2);
        T(i6, i10, obj);
    }

    public final int X(int i6) {
        return this.f10045a[i6 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(Object obj, k kVar) {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i6;
        int i10;
        boolean z10 = this.f;
        o<?> oVar = this.f10059p;
        if (z10) {
            r<?> c10 = oVar.c(obj);
            if (!c10.h()) {
                it = c10.k();
                entry = it.next();
                int[] iArr = this.f10045a;
                length = iArr.length;
                i6 = 0;
                int i11 = 1048575;
                int i12 = 0;
                while (i6 < length) {
                    int X = X(i6);
                    int i13 = iArr[i6];
                    int i14 = (X & 267386880) >>> 20;
                    Unsafe unsafe = f10044s;
                    if (i14 <= 17) {
                        int i15 = iArr[i6 + 2];
                        Map.Entry<?, Object> entry2 = entry;
                        int i16 = i15 & 1048575;
                        if (i16 != i11) {
                            i12 = unsafe.getInt(obj, i16);
                            i11 = i16;
                        }
                        i10 = 1 << (i15 >>> 20);
                        entry = entry2;
                    } else {
                        i10 = 0;
                    }
                    while (entry != null) {
                        oVar.a(entry);
                        if (i13 >= 0) {
                            oVar.j(entry);
                            if (it.hasNext()) {
                                entry = it.next();
                            } else {
                                entry = null;
                            }
                        } else {
                            Iterator<Map.Entry<?, Object>> it2 = it;
                            o<?> oVar2 = oVar;
                            long j10 = X & 1048575;
                            switch (i14) {
                                case 0:
                                    if ((i12 & i10) != 0) {
                                        kVar.c(q1.l(j10, obj), i13);
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 1:
                                    if ((i12 & i10) != 0) {
                                        kVar.g(q1.m(j10, obj), i13);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 2:
                                    if ((i10 & i12) != 0) {
                                        kVar.j(i13, unsafe.getLong(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 3:
                                    if ((i10 & i12) != 0) {
                                        kVar.r(i13, unsafe.getLong(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 4:
                                    if ((i10 & i12) != 0) {
                                        kVar.i(i13, unsafe.getInt(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 5:
                                    if ((i10 & i12) != 0) {
                                        kVar.f(i13, unsafe.getLong(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 6:
                                    if ((i10 & i12) != 0) {
                                        kVar.e(i13, unsafe.getInt(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 7:
                                    if ((i12 & i10) != 0) {
                                        kVar.a(i13, q1.g(j10, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 8:
                                    if ((i10 & i12) != 0) {
                                        a0(i13, unsafe.getObject(obj, j10), kVar);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 9:
                                    if ((i10 & i12) != 0) {
                                        kVar.k(i13, q(i6), unsafe.getObject(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 10:
                                    if ((i10 & i12) != 0) {
                                        kVar.b(i13, (h) unsafe.getObject(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 11:
                                    if ((i10 & i12) != 0) {
                                        kVar.q(i13, unsafe.getInt(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 12:
                                    if ((i10 & i12) != 0) {
                                        kVar.d(i13, unsafe.getInt(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 13:
                                    if ((i10 & i12) != 0) {
                                        kVar.m(i13, unsafe.getInt(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 14:
                                    if ((i10 & i12) != 0) {
                                        kVar.n(i13, unsafe.getLong(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 15:
                                    if ((i10 & i12) != 0) {
                                        kVar.o(i13, unsafe.getInt(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 16:
                                    if ((i10 & i12) != 0) {
                                        kVar.p(i13, unsafe.getLong(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 17:
                                    if ((i10 & i12) != 0) {
                                        kVar.h(i13, q(i6), unsafe.getObject(obj, j10));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 18:
                                    h1.G(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 19:
                                    h1.K(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 20:
                                    h1.N(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 21:
                                    h1.V(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 22:
                                    h1.M(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 23:
                                    h1.J(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 24:
                                    h1.I(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 25:
                                    h1.E(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    continue;
                                    continue;
                                    i6 += 3;
                                    oVar = oVar2;
                                    it = it2;
                                case 26:
                                    h1.T(iArr[i6], (List) unsafe.getObject(obj, j10), kVar);
                                    break;
                                case 27:
                                    h1.O(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, q(i6));
                                    break;
                                case 28:
                                    h1.F(iArr[i6], (List) unsafe.getObject(obj, j10), kVar);
                                    break;
                                case 29:
                                    h1.U(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    h1.H(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    h1.P(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    break;
                                case 32:
                                    h1.Q(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    break;
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    h1.R(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    break;
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    h1.S(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, false);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                    h1.G(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case 36:
                                    h1.K(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    h1.N(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                    h1.V(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    h1.M(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    h1.J(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    h1.I(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                    h1.E(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                    h1.U(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                    h1.H(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                    h1.P(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                    h1.Q(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                    h1.R(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                    h1.S(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, true);
                                    break;
                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                    h1.L(iArr[i6], (List) unsafe.getObject(obj, j10), kVar, q(i6));
                                    break;
                                case 50:
                                    Z(kVar, i13, unsafe.getObject(obj, j10), i6);
                                    break;
                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.c(((Double) q1.p(j10, obj)).doubleValue(), i13);
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.g(((Float) q1.p(j10, obj)).floatValue(), i13);
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.j(i13, H(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.r(i13, H(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.i(i13, G(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorError /* 56 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.f(i13, H(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.e(i13, G(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.a(i13, ((Boolean) q1.p(j10, obj)).booleanValue());
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                    if (w(i13, i6, obj)) {
                                        a0(i13, unsafe.getObject(obj, j10), kVar);
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.k(i13, q(i6), unsafe.getObject(obj, j10));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.b(i13, (h) unsafe.getObject(obj, j10));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.q(i13, G(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.d(i13, G(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.m(i13, G(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.n(i13, H(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.o(i13, G(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.p(i13, H(j10, obj));
                                        break;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                    if (w(i13, i6, obj)) {
                                        kVar.h(i13, q(i6), unsafe.getObject(obj, j10));
                                        break;
                                    }
                                    break;
                            }
                            i6 += 3;
                            oVar = oVar2;
                            it = it2;
                        }
                    }
                    Iterator<Map.Entry<?, Object>> it22 = it;
                    o<?> oVar22 = oVar;
                    long j102 = X & 1048575;
                    switch (i14) {
                    }
                    i6 += 3;
                    oVar = oVar22;
                    it = it22;
                }
                Iterator<Map.Entry<?, Object>> it3 = it;
                o<?> oVar3 = oVar;
                while (entry != null) {
                    o<?> oVar4 = oVar3;
                    oVar4.j(entry);
                    if (it3.hasNext()) {
                        entry = it3.next();
                        oVar3 = oVar4;
                    } else {
                        oVar3 = oVar4;
                        entry = null;
                    }
                }
                m1<?, ?> m1Var = this.f10058o;
                m1Var.s(m1Var.g(obj), kVar);
            }
        }
        it = null;
        entry = null;
        int[] iArr2 = this.f10045a;
        length = iArr2.length;
        i6 = 0;
        int i112 = 1048575;
        int i122 = 0;
        while (i6 < length) {
        }
        Iterator<Map.Entry<?, Object>> it32 = it;
        o<?> oVar32 = oVar;
        while (entry != null) {
        }
        m1<?, ?> m1Var2 = this.f10058o;
        m1Var2.s(m1Var2.g(obj), kVar);
    }

    public final void Z(k kVar, int i6, Object obj, int i10) {
        if (obj != null) {
            Object p10 = p(i10);
            l0 l0Var = this.f10060q;
            j0.a<?, ?> c10 = l0Var.c(p10);
            k0 h10 = l0Var.h(obj);
            CodedOutputStream codedOutputStream = kVar.f9994a;
            codedOutputStream.getClass();
            for (Map.Entry entry : h10.entrySet()) {
                codedOutputStream.z0(i6, 2);
                codedOutputStream.B0(j0.a(c10, entry.getKey(), entry.getValue()));
                j0.b(codedOutputStream, c10, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.google.protobuf.g1
    public final void a(T t3, T t10) {
        l(t3);
        t10.getClass();
        int i6 = 0;
        while (true) {
            int[] iArr = this.f10045a;
            if (i6 < iArr.length) {
                int X = X(i6);
                long j10 = 1048575 & X;
                int i10 = iArr[i6];
                switch ((X & 267386880) >>> 20) {
                    case 0:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.v(t3, j10, q1.l(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 1:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.w(t3, j10, q1.m(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 2:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.y(t3, j10, q1.o(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 3:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.y(t3, j10, q1.o(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 4:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.x(q1.n(j10, t10), j10, t3);
                            S(i6, t3);
                            break;
                        }
                    case 5:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.y(t3, j10, q1.o(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 6:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.x(q1.n(j10, t10), j10, t3);
                            S(i6, t3);
                            break;
                        }
                    case 7:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.r(t3, j10, q1.g(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 8:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.z(j10, t3, q1.p(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 9:
                        z(t3, i6, t10);
                        break;
                    case 10:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.z(j10, t3, q1.p(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 11:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.x(q1.n(j10, t10), j10, t3);
                            S(i6, t3);
                            break;
                        }
                    case 12:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.x(q1.n(j10, t10), j10, t3);
                            S(i6, t3);
                            break;
                        }
                    case 13:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.x(q1.n(j10, t10), j10, t3);
                            S(i6, t3);
                            break;
                        }
                    case 14:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.y(t3, j10, q1.o(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 15:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.x(q1.n(j10, t10), j10, t3);
                            S(i6, t3);
                            break;
                        }
                    case 16:
                        if (!u(i6, t10)) {
                            break;
                        } else {
                            q1.y(t3, j10, q1.o(j10, t10));
                            S(i6, t3);
                            break;
                        }
                    case 17:
                        z(t3, i6, t10);
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
                        this.f10057n.b(j10, t3, t10);
                        break;
                    case 50:
                        Class<?> cls = h1.f9933a;
                        q1.z(j10, t3, this.f10060q.a(q1.p(j10, t3), q1.p(j10, t10)));
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
                        if (!w(i10, i6, t10)) {
                            break;
                        } else {
                            q1.z(j10, t3, q1.p(j10, t10));
                            T(i10, i6, t3);
                            break;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        A(t3, i6, t10);
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!w(i10, i6, t10)) {
                            break;
                        } else {
                            q1.z(j10, t3, q1.p(j10, t10));
                            T(i10, i6, t3);
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        A(t3, i6, t10);
                        break;
                }
                i6 += 3;
            } else {
                Class<?> cls2 = h1.f9933a;
                m1<?, ?> m1Var = this.f10058o;
                m1Var.o(t3, m1Var.k(m1Var.g(t3), m1Var.g(t10)));
                if (this.f) {
                    h1.B(this.f10059p, t3, t10);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c  */
    @Override // com.google.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, k kVar) {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i6;
        Iterator<Map.Entry<?, Object>> it2;
        kVar.getClass();
        if (this.f10051h) {
            boolean z10 = this.f;
            o<?> oVar = this.f10059p;
            if (z10) {
                r<?> c10 = oVar.c(obj);
                if (!c10.h()) {
                    it = c10.k();
                    entry = it.next();
                    int[] iArr = this.f10045a;
                    length = iArr.length;
                    i6 = 0;
                    while (i6 < length) {
                        int X = X(i6);
                        int i10 = iArr[i6];
                        while (entry != null) {
                            oVar.a(entry);
                            if (i10 >= 0) {
                                oVar.j(entry);
                                if (it.hasNext()) {
                                    entry = it.next();
                                } else {
                                    entry = null;
                                }
                            } else {
                                switch ((267386880 & X) >>> 20) {
                                    case 0:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.c(q1.l(X & 1048575, obj), i10);
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 1:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.g(q1.m(X & 1048575, obj), i10);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 2:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.j(i10, q1.o(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 3:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.r(i10, q1.o(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 4:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.i(i10, q1.n(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 5:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.f(i10, q1.o(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 6:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.e(i10, q1.n(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 7:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.a(i10, q1.g(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 8:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            a0(i10, q1.p(X & 1048575, obj), kVar);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 9:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.k(i10, q(i6), q1.p(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 10:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.b(i10, (h) q1.p(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 11:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.q(i10, q1.n(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 12:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.d(i10, q1.n(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 13:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.m(i10, q1.n(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 14:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.n(i10, q1.o(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 15:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.o(i10, q1.n(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 16:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.p(i10, q1.o(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 17:
                                        it2 = it;
                                        if (u(i6, obj)) {
                                            kVar.h(i10, q(i6), q1.p(X & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i6 += 3;
                                        it = it2;
                                    case 18:
                                        it2 = it;
                                        h1.G(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 19:
                                        it2 = it;
                                        h1.K(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 20:
                                        it2 = it;
                                        h1.N(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 21:
                                        it2 = it;
                                        h1.V(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 22:
                                        it2 = it;
                                        h1.M(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 23:
                                        it2 = it;
                                        h1.J(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 24:
                                        it2 = it;
                                        h1.I(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 25:
                                        it2 = it;
                                        h1.E(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 26:
                                        it2 = it;
                                        h1.T(iArr[i6], (List) q1.p(X & 1048575, obj), kVar);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 27:
                                        it2 = it;
                                        h1.O(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, q(i6));
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 28:
                                        it2 = it;
                                        h1.F(iArr[i6], (List) q1.p(X & 1048575, obj), kVar);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 29:
                                        it2 = it;
                                        h1.U(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                        it2 = it;
                                        h1.H(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                        it2 = it;
                                        h1.P(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 32:
                                        it2 = it;
                                        h1.Q(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                        it2 = it;
                                        h1.R(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                        it2 = it;
                                        h1.S(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, false);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                        it2 = it;
                                        h1.G(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case 36:
                                        it2 = it;
                                        h1.K(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                        it2 = it;
                                        h1.N(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                        it2 = it;
                                        h1.V(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                        it2 = it;
                                        h1.M(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                        it2 = it;
                                        h1.J(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                        it2 = it;
                                        h1.I(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                        it2 = it;
                                        h1.E(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                        it2 = it;
                                        h1.U(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                        it2 = it;
                                        h1.H(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                        it2 = it;
                                        h1.P(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                        it2 = it;
                                        h1.Q(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                        it2 = it;
                                        h1.R(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                        it2 = it;
                                        h1.S(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, true);
                                        continue;
                                        continue;
                                        i6 += 3;
                                        it = it2;
                                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                        h1.L(iArr[i6], (List) q1.p(X & 1048575, obj), kVar, q(i6));
                                        break;
                                    case 50:
                                        Z(kVar, i10, q1.p(X & 1048575, obj), i6);
                                        break;
                                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.c(((Double) q1.p(X & 1048575, obj)).doubleValue(), i10);
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.g(((Float) q1.p(X & 1048575, obj)).floatValue(), i10);
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.j(i10, H(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.r(i10, H(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.i(i10, G(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.f(i10, H(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.e(i10, G(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.a(i10, ((Boolean) q1.p(X & 1048575, obj)).booleanValue());
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                        if (w(i10, i6, obj)) {
                                            a0(i10, q1.p(X & 1048575, obj), kVar);
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.k(i10, q(i6), q1.p(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.b(i10, (h) q1.p(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.q(i10, G(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.d(i10, G(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.m(i10, G(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.n(i10, H(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.o(i10, G(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.p(i10, H(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                        if (w(i10, i6, obj)) {
                                            kVar.h(i10, q(i6), q1.p(X & 1048575, obj));
                                            break;
                                        }
                                        break;
                                }
                                it2 = it;
                                i6 += 3;
                                it = it2;
                            }
                        }
                        switch ((267386880 & X) >>> 20) {
                        }
                        it2 = it;
                        i6 += 3;
                        it = it2;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    while (entry != null) {
                        oVar.j(entry);
                        if (it3.hasNext()) {
                            entry = it3.next();
                        } else {
                            entry = null;
                        }
                    }
                    m1<?, ?> m1Var = this.f10058o;
                    m1Var.s(m1Var.g(obj), kVar);
                    return;
                }
            }
            it = null;
            entry = null;
            int[] iArr2 = this.f10045a;
            length = iArr2.length;
            i6 = 0;
            while (i6 < length) {
            }
            Iterator<Map.Entry<?, Object>> it32 = it;
            while (entry != null) {
            }
            m1<?, ?> m1Var2 = this.f10058o;
            m1Var2.s(m1Var2.g(obj), kVar);
            return;
        }
        Y(obj, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.g1
    public final void c(T t3) {
        if (!v(t3)) {
            return;
        }
        if (t3 instanceof v) {
            v vVar = (v) t3;
            vVar.w();
            vVar.v();
            vVar.F();
        }
        int length = this.f10045a.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int X = X(i6);
            long j10 = 1048575 & X;
            int i10 = (X & 267386880) >>> 20;
            Unsafe unsafe = f10044s;
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
                        this.f10057n.a(j10, t3);
                        continue;
                    case 50:
                        Object object = unsafe.getObject(t3, j10);
                        if (object != null) {
                            unsafe.putObject(t3, j10, this.f10060q.b(object));
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (u(i6, t3)) {
                q(i6).c(unsafe.getObject(t3, j10));
            }
        }
        this.f10058o.j(t3);
        if (this.f) {
            this.f10059p.f(t3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20, types: [com.google.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r7v23 */
    @Override // com.google.protobuf.g1
    public final boolean d(T t3) {
        boolean z10;
        boolean z11;
        int i6 = 0;
        int i10 = 1048575;
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i6 < this.f10054k) {
                int i12 = this.f10053j[i6];
                int[] iArr = this.f10045a;
                int i13 = iArr[i12];
                int X = X(i12);
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                int i16 = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    if (i15 != 1048575) {
                        i11 = f10044s.getInt(t3, i15);
                    }
                    i10 = i15;
                }
                if ((268435456 & X) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (i10 == 1048575) {
                        z11 = u(i12, t3);
                    } else if ((i11 & i16) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                }
                int i17 = (267386880 & X) >>> 20;
                if (i17 != 9 && i17 != 17) {
                    if (i17 != 27) {
                        if (i17 != 60 && i17 != 68) {
                            if (i17 != 49) {
                                if (i17 != 50) {
                                    continue;
                                } else {
                                    Object p10 = q1.p(X & 1048575, t3);
                                    l0 l0Var = this.f10060q;
                                    k0 h10 = l0Var.h(p10);
                                    if (!h10.isEmpty() && l0Var.c(p(i12)).f9976c.f10040u == t1.D) {
                                        Iterator it = h10.values().iterator();
                                        g1<T> g1Var = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (g1Var == null) {
                                                g1Var = b1.f9887c.a(next.getClass());
                                            }
                                            boolean d10 = g1Var.d(next);
                                            g1Var = g1Var;
                                            if (!d10) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z12) {
                                        return false;
                                    }
                                }
                            }
                        } else if (w(i13, i12, t3) && !q(i12).d(q1.p(X & 1048575, t3))) {
                            return false;
                        }
                    }
                    List list = (List) q1.p(X & 1048575, t3);
                    if (!list.isEmpty()) {
                        ?? q10 = q(i12);
                        int i18 = 0;
                        while (true) {
                            if (i18 >= list.size()) {
                                break;
                            } else if (!q10.d(list.get(i18))) {
                                z12 = false;
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                    if (!z12) {
                        return false;
                    }
                } else {
                    if (i10 == 1048575) {
                        z12 = u(i12, t3);
                    } else if ((i16 & i11) == 0) {
                        z12 = false;
                    }
                    if (z12 && !q(i12).d(q1.p(X & 1048575, t3))) {
                        return false;
                    }
                }
                i6++;
            } else if (this.f && !this.f10059p.c(t3).i()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x05ca A[Catch: all -> 0x002e, TryCatch #3 {all -> 0x002e, blocks: (B:3:0x0017, B:5:0x0024, B:7:0x0028, B:20:0x0054, B:27:0x0066, B:28:0x006c, B:29:0x0072, B:31:0x0077, B:32:0x007b, B:24:0x005c, B:40:0x009b, B:45:0x00b2, B:136:0x05a9, B:143:0x05c5, B:145:0x05ca, B:146:0x05cf, B:47:0x00b8, B:48:0x00cd, B:49:0x00e5, B:50:0x00fd, B:51:0x0115, B:52:0x012d, B:54:0x013b, B:57:0x0142, B:59:0x0149, B:60:0x0159, B:61:0x0171, B:62:0x0181, B:63:0x0197, B:64:0x019f, B:65:0x01b7, B:66:0x01cf, B:67:0x01e7, B:68:0x01ff, B:69:0x0217, B:70:0x022f, B:71:0x0246, B:72:0x025d, B:74:0x0272, B:76:0x0283, B:77:0x0288, B:78:0x0296, B:79:0x02a3, B:80:0x02b0, B:81:0x02bd, B:82:0x02d6, B:83:0x02e3, B:84:0x02f0, B:85:0x02fd, B:86:0x030a, B:87:0x0317, B:88:0x0324, B:89:0x0331, B:90:0x033e, B:91:0x034b, B:92:0x0358, B:93:0x0365, B:94:0x0372, B:95:0x037f, B:96:0x0398, B:97:0x03a5, B:98:0x03b2, B:99:0x03c5, B:100:0x03cb, B:101:0x03d8, B:102:0x03e5, B:103:0x03f2, B:104:0x03ff, B:105:0x040c, B:106:0x0419, B:107:0x0426, B:108:0x0433, B:112:0x0451, B:113:0x0460, B:114:0x0474, B:115:0x0488, B:116:0x049c, B:118:0x04ab, B:121:0x04b2, B:122:0x04b8, B:123:0x04c4, B:124:0x04d8, B:125:0x04e8, B:126:0x04ff, B:127:0x0508, B:128:0x051c, B:129:0x0530, B:130:0x0544, B:131:0x0558, B:132:0x056c, B:133:0x0580, B:134:0x0594), top: B:167:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0017 A[SYNTHETIC] */
    @Override // com.google.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(T t3, e1 e1Var, n nVar) {
        int i6;
        Object obj;
        v.e b10;
        Object obj2;
        e1 e1Var2;
        nVar.getClass();
        l(t3);
        m1 m1Var = this.f10058o;
        int[] iArr = this.f10053j;
        int i10 = this.f10055l;
        int i11 = this.f10054k;
        Object obj3 = null;
        r<?> rVar = null;
        while (true) {
            try {
                j jVar = (j) e1Var;
                int a10 = jVar.a();
                if (a10 >= this.f10047c && a10 <= this.f10048d) {
                    i6 = U(a10, 0);
                } else {
                    i6 = -1;
                }
                if (i6 < 0) {
                    if (a10 == Integer.MAX_VALUE) {
                        obj = obj3;
                        while (i11 < i10) {
                            obj = n(t3, iArr[i11], obj, m1Var, t3);
                            i11++;
                        }
                        if (obj == null) {
                            return;
                        }
                    } else {
                        boolean z10 = this.f;
                        o<?> oVar = this.f10059p;
                        if (!z10) {
                            b10 = null;
                        } else {
                            b10 = oVar.b(nVar, this.f10049e, a10);
                        }
                        if (b10 != null) {
                            if (rVar == null) {
                                rVar = oVar.d(t3);
                            }
                            obj2 = oVar.g(b10);
                        } else {
                            m1Var.p();
                            if (obj3 == null) {
                                obj3 = m1Var.f(t3);
                            }
                            if (m1Var.l(obj3, jVar)) {
                                obj2 = obj3;
                            } else {
                                obj = obj3;
                                while (i11 < i10) {
                                    obj = n(t3, iArr[i11], obj, m1Var, t3);
                                    i11++;
                                }
                                if (obj == null) {
                                    return;
                                }
                            }
                        }
                        obj3 = obj2;
                    }
                } else {
                    int X = X(i6);
                    int i12 = (267386880 & X) >>> 20;
                    i iVar = jVar.f9967a;
                    g0 g0Var = this.f10057n;
                    switch (i12) {
                        case 0:
                            jVar.w(1);
                            q1.v(t3, X & 1048575, iVar.k());
                            S(i6, t3);
                            break;
                        case 1:
                            jVar.w(5);
                            q1.w(t3, X & 1048575, iVar.o());
                            S(i6, t3);
                            break;
                        case 2:
                            jVar.w(0);
                            q1.y(t3, X & 1048575, iVar.q());
                            S(i6, t3);
                            break;
                        case 3:
                            jVar.w(0);
                            q1.y(t3, X & 1048575, iVar.z());
                            S(i6, t3);
                            break;
                        case 4:
                            jVar.w(0);
                            q1.x(iVar.p(), X & 1048575, t3);
                            S(i6, t3);
                            break;
                        case 5:
                            jVar.w(1);
                            q1.y(t3, X & 1048575, iVar.n());
                            S(i6, t3);
                            break;
                        case 6:
                            jVar.w(5);
                            q1.x(iVar.m(), X & 1048575, t3);
                            S(i6, t3);
                            break;
                        case 7:
                            jVar.w(0);
                            q1.r(t3, X & 1048575, iVar.i());
                            S(i6, t3);
                            break;
                        case 8:
                            P(t3, X, jVar);
                            S(i6, t3);
                            break;
                        case 9:
                            q0 q0Var = (q0) B(i6, t3);
                            g1<T> q10 = q(i6);
                            jVar.w(2);
                            jVar.c(q0Var, q10, nVar);
                            V(t3, i6, q0Var);
                            break;
                        case 10:
                            q1.z(X & 1048575, t3, jVar.e());
                            S(i6, t3);
                            break;
                        case 11:
                            jVar.w(0);
                            q1.x(iVar.y(), X & 1048575, t3);
                            S(i6, t3);
                            break;
                        case 12:
                            jVar.w(0);
                            int l2 = iVar.l();
                            y.b o10 = o(i6);
                            if (o10 != null && !o10.a(l2)) {
                                obj3 = h1.D(t3, a10, l2, obj3, m1Var);
                                break;
                            }
                            q1.x(l2, F(X), t3);
                            S(i6, t3);
                            break;
                        case 13:
                            jVar.w(5);
                            q1.x(iVar.r(), X & 1048575, t3);
                            S(i6, t3);
                            break;
                        case 14:
                            jVar.w(1);
                            q1.y(t3, X & 1048575, iVar.s());
                            S(i6, t3);
                            break;
                        case 15:
                            jVar.w(0);
                            q1.x(iVar.t(), X & 1048575, t3);
                            S(i6, t3);
                            break;
                        case 16:
                            long j10 = X & 1048575;
                            jVar.w(0);
                            q1.y(t3, j10, iVar.u());
                            S(i6, t3);
                            break;
                        case 17:
                            q0 q0Var2 = (q0) B(i6, t3);
                            g1<T> q11 = q(i6);
                            jVar.w(3);
                            jVar.b(q0Var2, q11, nVar);
                            V(t3, i6, q0Var2);
                            break;
                        case 18:
                            jVar.g(g0Var.c(X & 1048575, t3));
                            break;
                        case 19:
                            jVar.l(g0Var.c(X & 1048575, t3));
                            break;
                        case 20:
                            jVar.n(g0Var.c(X & 1048575, t3));
                            break;
                        case 21:
                            jVar.u(g0Var.c(X & 1048575, t3));
                            break;
                        case 22:
                            jVar.m(g0Var.c(X & 1048575, t3));
                            break;
                        case 23:
                            jVar.k(g0Var.c(X & 1048575, t3));
                            break;
                        case 24:
                            jVar.j(g0Var.c(X & 1048575, t3));
                            break;
                        case 25:
                            jVar.d(g0Var.c(X & 1048575, t3));
                            break;
                        case 26:
                            Q(t3, X, jVar);
                            break;
                        case 27:
                            O(t3, X, jVar, q(i6), nVar);
                            break;
                        case 28:
                            jVar.f(g0Var.c(X & 1048575, t3));
                            break;
                        case 29:
                            jVar.t(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            List<Integer> c10 = g0Var.c(X & 1048575, t3);
                            jVar.h(c10);
                            obj3 = h1.z(t3, a10, c10, o(i6), obj3, m1Var);
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            jVar.o(g0Var.c(X & 1048575, t3));
                            break;
                        case 32:
                            jVar.p(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            jVar.q(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            jVar.r(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            jVar.g(g0Var.c(X & 1048575, t3));
                            break;
                        case 36:
                            jVar.l(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            jVar.n(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            jVar.u(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            jVar.m(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            jVar.k(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            jVar.j(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            jVar.d(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            jVar.t(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            List<Integer> c11 = g0Var.c(X & 1048575, t3);
                            jVar.h(c11);
                            obj3 = h1.z(t3, a10, c11, o(i6), obj3, m1Var);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            jVar.o(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            jVar.p(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            jVar.q(g0Var.c(X & 1048575, t3));
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            jVar.r(g0Var.c(F(X), t3));
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            try {
                                N(t3, X & 1048575, jVar, q(i6), nVar);
                                break;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                e1Var2 = jVar;
                                m1Var.p();
                                if (obj3 == null) {
                                }
                                if (!m1Var.l(obj3, e1Var2)) {
                                }
                            }
                            break;
                        case 50:
                            y(t3, i6, p(i6), nVar, jVar);
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            jVar.w(1);
                            q1.z(X & 1048575, t3, Double.valueOf(iVar.k()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            jVar.w(5);
                            q1.z(X & 1048575, t3, Float.valueOf(iVar.o()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            long F = F(X);
                            jVar.w(0);
                            q1.z(F, t3, Long.valueOf(iVar.q()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            long F2 = F(X);
                            jVar.w(0);
                            q1.z(F2, t3, Long.valueOf(iVar.z()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            long F3 = F(X);
                            jVar.w(0);
                            q1.z(F3, t3, Integer.valueOf(iVar.p()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            long F4 = F(X);
                            jVar.w(1);
                            q1.z(F4, t3, Long.valueOf(iVar.n()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            long F5 = F(X);
                            jVar.w(5);
                            q1.z(F5, t3, Integer.valueOf(iVar.m()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            long F6 = F(X);
                            jVar.w(0);
                            q1.z(F6, t3, Boolean.valueOf(iVar.i()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            P(t3, X, jVar);
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            q0 q0Var3 = (q0) C(a10, i6, t3);
                            g1<T> q12 = q(i6);
                            jVar.w(2);
                            jVar.c(q0Var3, q12, nVar);
                            W(a10, t3, q0Var3, i6);
                            break;
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            q1.z(F(X), t3, jVar.e());
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            long F7 = F(X);
                            jVar.w(0);
                            q1.z(F7, t3, Integer.valueOf(iVar.y()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            jVar.w(0);
                            int l10 = iVar.l();
                            y.b o11 = o(i6);
                            if (o11 != null && !o11.a(l10)) {
                                obj2 = h1.D(t3, a10, l10, obj3, m1Var);
                                obj3 = obj2;
                                break;
                            }
                            q1.z(F(X), t3, Integer.valueOf(l10));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            long F8 = F(X);
                            jVar.w(5);
                            q1.z(F8, t3, Integer.valueOf(iVar.r()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            long F9 = F(X);
                            jVar.w(1);
                            q1.z(F9, t3, Long.valueOf(iVar.s()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            long F10 = F(X);
                            jVar.w(0);
                            q1.z(F10, t3, Integer.valueOf(iVar.t()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            long F11 = F(X);
                            jVar.w(0);
                            q1.z(F11, t3, Long.valueOf(iVar.u()));
                            T(a10, i6, t3);
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            try {
                                q0 q0Var4 = (q0) C(a10, i6, t3);
                                g1<T> q13 = q(i6);
                                jVar.w(3);
                                jVar.b(q0Var4, q13, nVar);
                                W(a10, t3, q0Var4, i6);
                                break;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                e1Var2 = jVar;
                                m1Var.p();
                                if (obj3 == null) {
                                }
                                if (!m1Var.l(obj3, e1Var2)) {
                                }
                            }
                            break;
                        default:
                            e1Var2 = jVar;
                            if (obj3 == null) {
                                try {
                                    obj3 = m1Var.f(t3);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    m1Var.p();
                                    if (obj3 == null) {
                                        obj3 = m1Var.f(t3);
                                    }
                                    if (!m1Var.l(obj3, e1Var2)) {
                                        obj = obj3;
                                        while (i11 < i10) {
                                            obj = n(t3, iArr[i11], obj, m1Var, t3);
                                            i11++;
                                        }
                                        if (obj == null) {
                                            return;
                                        }
                                        m1Var.n(t3, obj);
                                        return;
                                    }
                                }
                            }
                            if (!m1Var.l(obj3, e1Var2)) {
                                obj = obj3;
                                while (i11 < i10) {
                                    obj = n(t3, iArr[i11], obj, m1Var, t3);
                                    i11++;
                                }
                                if (obj == null) {
                                    return;
                                }
                            }
                    }
                }
            } catch (Throwable th2) {
                Object obj4 = obj3;
                while (i11 < i10) {
                    obj4 = n(t3, iArr[i11], obj4, m1Var, t3);
                    i11++;
                }
                if (obj4 != null) {
                    m1Var.n(t3, obj4);
                }
                throw th2;
            }
        }
    }

    @Override // com.google.protobuf.g1
    public final void f(T t3, byte[] bArr, int i6, int i10, f.a aVar) {
        if (this.f10051h) {
            L(t3, bArr, i6, i10, aVar);
        } else {
            K(t3, bArr, i6, i10, 0, aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
        if (java.lang.Float.floatToIntBits(com.google.protobuf.q1.m(r7, r11)) == java.lang.Float.floatToIntBits(com.google.protobuf.q1.m(r7, r12))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c5, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.protobuf.q1.l(r7, r11)) == java.lang.Double.doubleToLongBits(com.google.protobuf.q1.l(r7, r12))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (com.google.protobuf.h1.C(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (com.google.protobuf.h1.C(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (com.google.protobuf.h1.C(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010b, code lost:
        if (com.google.protobuf.h1.C(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
        if (com.google.protobuf.h1.C(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
        if (com.google.protobuf.q1.g(r7, r11) == com.google.protobuf.q1.g(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017e, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0191, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L88;
     */
    @Override // com.google.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(T t3, T t10) {
        boolean z10;
        int[] iArr = this.f10045a;
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            boolean z11 = true;
            if (i6 < length) {
                int X = X(i6);
                long j10 = X & 1048575;
                switch ((X & 267386880) >>> 20) {
                    case 0:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 1:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 2:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 3:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 4:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 5:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 6:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 7:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 8:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 9:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 10:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 11:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 12:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 13:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 14:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 15:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 16:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 17:
                        if (k(t3, i6, t10)) {
                            break;
                        }
                        z11 = false;
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
                        z11 = h1.C(q1.p(j10, t3), q1.p(j10, t10));
                        break;
                    case 50:
                        z11 = h1.C(q1.p(j10, t3), q1.p(j10, t10));
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
                        if (q1.n(j11, t3) == q1.n(j11, t10)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            break;
                        }
                        z11 = false;
                        break;
                }
                if (!z11) {
                    return false;
                }
                i6 += 3;
            } else {
                m1<?, ?> m1Var = this.f10058o;
                if (!m1Var.g(t3).equals(m1Var.g(t10))) {
                    return false;
                }
                if (!this.f) {
                    return true;
                }
                o<?> oVar = this.f10059p;
                return oVar.c(t3).equals(oVar.c(t10));
            }
        }
    }

    @Override // com.google.protobuf.g1
    public final int h(T t3) {
        if (this.f10051h) {
            return t(t3);
        }
        return s(t3);
    }

    @Override // com.google.protobuf.g1
    public final T i() {
        return (T) this.f10056m.a(this.f10049e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f2, code lost:
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f5, code lost:
        r8 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f7, code lost:
        r4 = r8;
     */
    @Override // com.google.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(T t3) {
        int i6;
        int a10;
        int hashCode;
        int[] iArr = this.f10045a;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int X = X(i11);
            int i12 = iArr[i11];
            long j10 = 1048575 & X;
            int i13 = 1231;
            switch ((X & 267386880) >>> 20) {
                case 0:
                    i6 = i10 * 53;
                    a10 = y.a(Double.doubleToLongBits(q1.l(j10, t3)));
                    i10 = a10 + i6;
                    break;
                case 1:
                    i6 = i10 * 53;
                    a10 = Float.floatToIntBits(q1.m(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 2:
                    i6 = i10 * 53;
                    a10 = y.a(q1.o(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 3:
                    i6 = i10 * 53;
                    a10 = y.a(q1.o(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 4:
                    i6 = i10 * 53;
                    a10 = q1.n(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 5:
                    i6 = i10 * 53;
                    a10 = y.a(q1.o(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 6:
                    i6 = i10 * 53;
                    a10 = q1.n(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 7:
                    i6 = i10 * 53;
                    boolean g5 = q1.g(j10, t3);
                    Charset charset = y.f10086a;
                    break;
                case 8:
                    i6 = i10 * 53;
                    a10 = ((String) q1.p(j10, t3)).hashCode();
                    i10 = a10 + i6;
                    break;
                case 9:
                    Object p10 = q1.p(j10, t3);
                    if (p10 != null) {
                        hashCode = p10.hashCode();
                        i10 = (i10 * 53) + hashCode;
                        break;
                    }
                    hashCode = 37;
                    i10 = (i10 * 53) + hashCode;
                case 10:
                    i6 = i10 * 53;
                    a10 = q1.p(j10, t3).hashCode();
                    i10 = a10 + i6;
                    break;
                case 11:
                    i6 = i10 * 53;
                    a10 = q1.n(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 12:
                    i6 = i10 * 53;
                    a10 = q1.n(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 13:
                    i6 = i10 * 53;
                    a10 = q1.n(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 14:
                    i6 = i10 * 53;
                    a10 = y.a(q1.o(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 15:
                    i6 = i10 * 53;
                    a10 = q1.n(j10, t3);
                    i10 = a10 + i6;
                    break;
                case 16:
                    i6 = i10 * 53;
                    a10 = y.a(q1.o(j10, t3));
                    i10 = a10 + i6;
                    break;
                case 17:
                    Object p11 = q1.p(j10, t3);
                    if (p11 != null) {
                        hashCode = p11.hashCode();
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
                    a10 = q1.p(j10, t3).hashCode();
                    i10 = a10 + i6;
                    break;
                case 50:
                    i6 = i10 * 53;
                    a10 = q1.p(j10, t3).hashCode();
                    i10 = a10 + i6;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = y.a(Double.doubleToLongBits(((Double) q1.p(j10, t3)).doubleValue()));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = Float.floatToIntBits(((Float) q1.p(j10, t3)).floatValue());
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = y.a(H(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = y.a(H(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = G(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = y.a(H(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = G(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        boolean booleanValue = ((Boolean) q1.p(j10, t3)).booleanValue();
                        Charset charset2 = y.f10086a;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = ((String) q1.p(j10, t3)).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = q1.p(j10, t3).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = q1.p(j10, t3).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = G(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = G(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = G(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = y.a(H(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = G(j10, t3);
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = y.a(H(j10, t3));
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (w(i12, i11, t3)) {
                        i6 = i10 * 53;
                        a10 = q1.p(j10, t3).hashCode();
                        i10 = a10 + i6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode2 = this.f10058o.g(t3).hashCode() + (i10 * 53);
        if (this.f) {
            return (hashCode2 * 53) + this.f10059p.c(t3).hashCode();
        }
        return hashCode2;
    }

    public final boolean k(Object obj, int i6, Object obj2) {
        if (u(i6, obj) == u(i6, obj2)) {
            return true;
        }
        return false;
    }

    public final <UT, UB> UB n(Object obj, int i6, UB ub2, m1<UT, UB> m1Var, Object obj2) {
        int i10 = this.f10045a[i6];
        Object p10 = q1.p(X(i6) & 1048575, obj);
        if (p10 == null) {
            return ub2;
        }
        y.b o10 = o(i6);
        if (o10 == null) {
            return ub2;
        }
        l0 l0Var = this.f10060q;
        k0 e10 = l0Var.e(p10);
        j0.a<?, ?> c10 = l0Var.c(p(i6));
        Iterator it = e10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!o10.a(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) m1Var.f(obj2);
                }
                int a10 = j0.a(c10, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a10];
                Logger logger = CodedOutputStream.f9865w;
                CodedOutputStream.b bVar = new CodedOutputStream.b(0, bArr, a10);
                try {
                    j0.b(bVar, c10, entry.getKey(), entry.getValue());
                    if (bVar.E0() == 0) {
                        m1Var.d(ub2, i10, new h.C0164h(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    public final y.b o(int i6) {
        return (y.b) this.f10046b[((i6 / 3) * 2) + 1];
    }

    public final Object p(int i6) {
        return this.f10046b[(i6 / 3) * 2];
    }

    public final g1 q(int i6) {
        int i10 = (i6 / 3) * 2;
        Object[] objArr = this.f10046b;
        g1 g1Var = (g1) objArr[i10];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> a10 = b1.f9887c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a10;
        return a10;
    }

    public final int s(T t3) {
        int i6;
        int i10;
        int L;
        int a02;
        int i11;
        int c0;
        int e0;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f10045a;
            if (i13 < iArr.length) {
                int X = X(i13);
                int i17 = iArr[i13];
                int i18 = (267386880 & X) >>> 20;
                boolean z10 = this.f10052i;
                Unsafe unsafe = f10044s;
                if (i18 <= 17) {
                    i6 = iArr[i13 + 2];
                    int i19 = i6 & i12;
                    i10 = 1 << (i6 >>> 20);
                    if (i19 != i15) {
                        i16 = unsafe.getInt(t3, i19);
                        i15 = i19;
                    }
                } else {
                    if (z10 && i18 >= s.f10030v.d() && i18 <= s.f10031w.d()) {
                        i6 = iArr[i13 + 2] & i12;
                    } else {
                        i6 = 0;
                    }
                    i10 = 0;
                }
                long j10 = X & i12;
                switch (i18) {
                    case 0:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.L(i17);
                            i14 += L;
                            break;
                        }
                    case 1:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.Q(i17);
                            i14 += L;
                            break;
                        }
                    case 2:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.U(i17, unsafe.getLong(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 3:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.f0(i17, unsafe.getLong(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 4:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.S(i17, unsafe.getInt(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 5:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.P(i17);
                            i14 += L;
                            break;
                        }
                    case 6:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.N(i17);
                            i14 += L;
                            break;
                        }
                    case 7:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.J(i17);
                            i14 += L;
                            break;
                        }
                    case 8:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(t3, j10);
                            if (object instanceof h) {
                                a02 = CodedOutputStream.K(i17, (h) object);
                            } else {
                                a02 = CodedOutputStream.a0(i17, (String) object);
                            }
                            i14 = a02 + i14;
                            break;
                        }
                    case 9:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = h1.o(i17, q(i13), unsafe.getObject(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 10:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.K(i17, (h) unsafe.getObject(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 11:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.d0(i17, unsafe.getInt(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 12:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.M(i17, unsafe.getInt(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 13:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.W(i17);
                            i14 += L;
                            break;
                        }
                    case 14:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.X(i17);
                            i14 += L;
                            break;
                        }
                    case 15:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.Y(i17, unsafe.getInt(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 16:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.Z(i17, unsafe.getLong(t3, j10));
                            i14 += L;
                            break;
                        }
                    case 17:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            L = CodedOutputStream.R(i17, (q0) unsafe.getObject(t3, j10), q(i13));
                            i14 += L;
                            break;
                        }
                    case 18:
                        L = h1.h(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 19:
                        L = h1.f(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 20:
                        L = h1.m(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 21:
                        L = h1.x(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 22:
                        L = h1.k(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 23:
                        L = h1.h(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 24:
                        L = h1.f(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 25:
                        L = h1.a(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 26:
                        L = h1.u(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 27:
                        L = h1.p(i17, (List) unsafe.getObject(t3, j10), q(i13));
                        i14 += L;
                        break;
                    case 28:
                        L = h1.c(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 29:
                        L = h1.v(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        L = h1.d(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        L = h1.f(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case 32:
                        L = h1.h(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        L = h1.q(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        L = h1.s(i17, (List) unsafe.getObject(t3, j10));
                        i14 += L;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        i11 = h1.i((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i11 = h1.g((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        i11 = h1.n((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        i11 = h1.y((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        i11 = h1.l((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        i11 = h1.i((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        i11 = h1.g((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        i11 = h1.b((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        i11 = h1.w((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        i11 = h1.e((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        i11 = h1.g((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        i11 = h1.i((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        i11 = h1.r((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        i11 = h1.t((List) unsafe.getObject(t3, j10));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i11);
                            }
                            c0 = CodedOutputStream.c0(i17);
                            e0 = CodedOutputStream.e0(i11);
                            i14 = e0 + c0 + i11 + i14;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        L = h1.j(i17, (List) unsafe.getObject(t3, j10), q(i13));
                        i14 += L;
                        break;
                    case 50:
                        L = this.f10060q.f(unsafe.getObject(t3, j10), i17, p(i13));
                        i14 += L;
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.L(i17);
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Q(i17);
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.U(i17, H(j10, t3));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.f0(i17, H(j10, t3));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.S(i17, G(j10, t3));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.P(i17);
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.N(i17);
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.J(i17);
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(t3, j10);
                            if (object2 instanceof h) {
                                a02 = CodedOutputStream.K(i17, (h) object2);
                            } else {
                                a02 = CodedOutputStream.a0(i17, (String) object2);
                            }
                            i14 = a02 + i14;
                            break;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = h1.o(i17, q(i13), unsafe.getObject(t3, j10));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.K(i17, (h) unsafe.getObject(t3, j10));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.d0(i17, G(j10, t3));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.M(i17, G(j10, t3));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.W(i17);
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.X(i17);
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Y(i17, G(j10, t3));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Z(i17, H(j10, t3));
                            i14 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (!w(i17, i13, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.R(i17, (q0) unsafe.getObject(t3, j10), q(i13));
                            i14 += L;
                            break;
                        }
                }
                i13 += 3;
                i12 = 1048575;
            } else {
                m1<?, ?> m1Var = this.f10058o;
                int h10 = m1Var.h(m1Var.g(t3)) + i14;
                if (this.f) {
                    return h10 + this.f10059p.c(t3).g();
                }
                return h10;
            }
        }
    }

    public final int t(T t3) {
        int i6;
        int L;
        int a02;
        int i10;
        int c0;
        int e0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f10045a;
            if (i11 < iArr.length) {
                int X = X(i11);
                int i13 = (267386880 & X) >>> 20;
                int i14 = iArr[i11];
                long j10 = X & 1048575;
                if (i13 >= s.f10030v.d() && i13 <= s.f10031w.d()) {
                    i6 = iArr[i11 + 2] & 1048575;
                } else {
                    i6 = 0;
                }
                boolean z10 = this.f10052i;
                Unsafe unsafe = f10044s;
                switch (i13) {
                    case 0:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.L(i14);
                            i12 += L;
                            break;
                        }
                    case 1:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Q(i14);
                            i12 += L;
                            break;
                        }
                    case 2:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.U(i14, q1.o(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 3:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.f0(i14, q1.o(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 4:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.S(i14, q1.n(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 5:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.P(i14);
                            i12 += L;
                            break;
                        }
                    case 6:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.N(i14);
                            i12 += L;
                            break;
                        }
                    case 7:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.J(i14);
                            i12 += L;
                            break;
                        }
                    case 8:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            Object p10 = q1.p(j10, t3);
                            if (p10 instanceof h) {
                                a02 = CodedOutputStream.K(i14, (h) p10);
                            } else {
                                a02 = CodedOutputStream.a0(i14, (String) p10);
                            }
                            i12 += a02;
                            break;
                        }
                    case 9:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = h1.o(i14, q(i11), q1.p(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 10:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.K(i14, (h) q1.p(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 11:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.d0(i14, q1.n(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 12:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.M(i14, q1.n(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 13:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.W(i14);
                            i12 += L;
                            break;
                        }
                    case 14:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.X(i14);
                            i12 += L;
                            break;
                        }
                    case 15:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Y(i14, q1.n(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 16:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Z(i14, q1.o(j10, t3));
                            i12 += L;
                            break;
                        }
                    case 17:
                        if (!u(i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.R(i14, (q0) q1.p(j10, t3), q(i11));
                            i12 += L;
                            break;
                        }
                    case 18:
                        L = h1.h(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 19:
                        L = h1.f(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 20:
                        L = h1.m(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 21:
                        L = h1.x(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 22:
                        L = h1.k(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 23:
                        L = h1.h(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 24:
                        L = h1.f(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 25:
                        L = h1.a(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 26:
                        L = h1.u(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 27:
                        L = h1.p(i14, x(j10, t3), q(i11));
                        i12 += L;
                        break;
                    case 28:
                        L = h1.c(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 29:
                        L = h1.v(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        L = h1.d(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        L = h1.f(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case 32:
                        L = h1.h(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        L = h1.q(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        L = h1.s(i14, x(j10, t3));
                        i12 += L;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        i10 = h1.i((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i10 = h1.g((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        i10 = h1.n((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        i10 = h1.y((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        i10 = h1.l((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        i10 = h1.i((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        i10 = h1.g((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        i10 = h1.b((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        i10 = h1.w((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        i10 = h1.e((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        i10 = h1.g((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        i10 = h1.i((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        i10 = h1.r((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        i10 = h1.t((List) unsafe.getObject(t3, j10));
                        if (i10 > 0) {
                            if (z10) {
                                unsafe.putInt(t3, i6, i10);
                            }
                            c0 = CodedOutputStream.c0(i14);
                            e0 = CodedOutputStream.e0(i10);
                            i12 += e0 + c0 + i10;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        L = h1.j(i14, x(j10, t3), q(i11));
                        i12 += L;
                        break;
                    case 50:
                        L = this.f10060q.f(q1.p(j10, t3), i14, p(i11));
                        i12 += L;
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.L(i14);
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Q(i14);
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.U(i14, H(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.f0(i14, H(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.S(i14, G(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.P(i14);
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.N(i14);
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.J(i14);
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            Object p11 = q1.p(j10, t3);
                            if (p11 instanceof h) {
                                a02 = CodedOutputStream.K(i14, (h) p11);
                            } else {
                                a02 = CodedOutputStream.a0(i14, (String) p11);
                            }
                            i12 += a02;
                            break;
                        }
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = h1.o(i14, q(i11), q1.p(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.K(i14, (h) q1.p(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.d0(i14, G(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.M(i14, G(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.W(i14);
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.X(i14);
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Y(i14, G(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.Z(i14, H(j10, t3));
                            i12 += L;
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (!w(i14, i11, t3)) {
                            break;
                        } else {
                            L = CodedOutputStream.R(i14, (q0) q1.p(j10, t3), q(i11));
                            i12 += L;
                            break;
                        }
                }
                i11 += 3;
            } else {
                m1<?, ?> m1Var = this.f10058o;
                return m1Var.h(m1Var.g(t3)) + i12;
            }
        }
    }

    public final boolean u(int i6, Object obj) {
        boolean equals;
        int i10 = this.f10045a[i6 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int X = X(i6);
            long j11 = X & 1048575;
            switch ((X & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(q1.l(j11, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(q1.m(j11, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (q1.o(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (q1.o(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (q1.n(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (q1.o(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (q1.n(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return q1.g(j11, obj);
                case 8:
                    Object p10 = q1.p(j11, obj);
                    if (p10 instanceof String) {
                        equals = ((String) p10).isEmpty();
                        break;
                    } else if (p10 instanceof h) {
                        equals = h.f9922v.equals(p10);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (q1.p(j11, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    equals = h.f9922v.equals(q1.p(j11, obj));
                    break;
                case 11:
                    if (q1.n(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (q1.n(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (q1.n(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (q1.o(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (q1.n(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (q1.o(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (q1.p(j11, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        } else if (((1 << (i10 >>> 20)) & q1.n(j10, obj)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean w(int i6, int i10, Object obj) {
        if (q1.n(this.f10045a[i10 + 2] & 1048575, obj) == i6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        r9.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void y(Object obj, int i6, Object obj2, n nVar, e1 e1Var) {
        long X = X(i6) & 1048575;
        Object p10 = q1.p(X, obj);
        l0 l0Var = this.f10060q;
        if (p10 == null) {
            p10 = l0Var.d();
            q1.z(X, obj, p10);
        } else if (l0Var.g(p10)) {
            k0 d10 = l0Var.d();
            l0Var.a(d10, p10);
            q1.z(X, obj, d10);
            p10 = d10;
        }
        k0 e10 = l0Var.e(p10);
        j0.a<?, ?> c10 = l0Var.c(obj2);
        j jVar = (j) e1Var;
        jVar.w(2);
        i iVar = jVar.f9967a;
        int h10 = iVar.h(iVar.y());
        Object obj3 = c10.f9975b;
        V v10 = c10.f9977d;
        V v11 = v10;
        while (true) {
            try {
                int a10 = jVar.a();
                if (a10 == Integer.MAX_VALUE || iVar.e()) {
                    break;
                } else if (a10 != 1) {
                    if (a10 != 2) {
                        try {
                            if (!jVar.x()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!jVar.x()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        v11 = jVar.i(c10.f9976c, v10.getClass(), nVar);
                    }
                } else {
                    obj3 = jVar.i(c10.f9974a, null, null);
                }
            } finally {
                iVar.g(h10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(Object obj, int i6, Object obj2) {
        if (!u(i6, obj2)) {
            return;
        }
        long X = X(i6) & 1048575;
        Unsafe unsafe = f10044s;
        Object object = unsafe.getObject(obj2, X);
        if (object != null) {
            g1 q10 = q(i6);
            if (!u(i6, obj)) {
                if (!v(object)) {
                    unsafe.putObject(obj, X, object);
                } else {
                    Object i10 = q10.i();
                    q10.a(i10, object);
                    unsafe.putObject(obj, X, i10);
                }
                S(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X);
            if (!v(object2)) {
                Object i11 = q10.i();
                q10.a(i11, object2);
                unsafe.putObject(obj, X, i11);
                object2 = i11;
            }
            q10.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f10045a[i6] + " is present but null: " + obj2);
    }
}
