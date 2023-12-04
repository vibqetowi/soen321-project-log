package com.google.android.gms.internal.auth;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i2, zzfw zzfwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = z;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
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

    private final void zzB(Object obj, Object obj2, int i) {
        long zzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object zzf = zzhi.zzf(obj, zzv);
            Object zzf2 = zzhi.zzf(obj2, zzv);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, zzv, zzez.zzg(zzf, zzf2));
                zzD(obj, i);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, zzv, zzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int zzv = zzv(i);
        int i2 = this.zzc[i];
        long j = zzv & 1048575;
        if (zzJ(obj2, i2, i)) {
            Object zzf = zzJ(obj, i2, i) ? zzhi.zzf(obj, j) : null;
            Object zzf2 = zzhi.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(zzf, zzf2));
                zzE(obj, i2, i);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, j, zzf2);
                zzE(obj, i2, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int zzs = zzs(i);
        long j = 1048575 & zzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzhi.zzn(obj, zzs(i2) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int zzs = zzs(i);
        long j = zzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i);
        long j2 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j2)) != 0;
            case 2:
                return zzhi.zzd(obj, j2) != 0;
            case 3:
                return zzhi.zzd(obj, j2) != 0;
            case 4:
                return zzhi.zzc(obj, j2) != 0;
            case 5:
                return zzhi.zzd(obj, j2) != 0;
            case 6:
                return zzhi.zzc(obj, j2) != 0;
            case 7:
                return zzhi.zzt(obj, j2);
            case 8:
                Object zzf = zzhi.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzee) {
                    return !zzee.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzhi.zzf(obj, j2) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j2));
            case 11:
                return zzhi.zzc(obj, j2) != 0;
            case 12:
                return zzhi.zzc(obj, j2) != 0;
            case 13:
                return zzhi.zzc(obj, j2) != 0;
            case 14:
                return zzhi.zzd(obj, j2) != 0;
            case 15:
                return zzhi.zzc(obj, j2) != 0;
            case 16:
                return zzhi.zzd(obj, j2) != 0;
            case 17:
                return zzhi.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzG(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i2) {
        return zzhi.zzc(obj, (long) (zzs(i2) & 1048575)) == i;
    }

    static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar == zzgz.zza()) {
            zzgz zzc = zzgz.zzc();
            zzeuVar.zzc = zzc;
            return zzc;
        }
        return zzgzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        zzgv zzgvVar = (zzgv) zzftVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzA;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field zzA2;
        Object obj2;
        Field zzA3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        boolean z = zzggVar.zzc() == 2;
        String zzd = zzggVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (zzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i33 = charAt17 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt16 = zzd.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i33 |= (charAt16 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt17 = i33 | (charAt16 << i34);
            i32 = i30;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt18 = zzd.charAt(i32);
            if (charAt18 >= 55296) {
                int i36 = charAt18 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    charAt11 = zzd.charAt(i35);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i36 |= (charAt11 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                charAt18 = i36 | (charAt11 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int charAt19 = zzd.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt19 = i39 | (charAt10 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            charAt = zzd.charAt(i38);
            if (charAt >= 55296) {
                int i42 = charAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                charAt = i42 | (charAt9 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int charAt20 = zzd.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                charAt20 = i45 | (charAt8 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            charAt2 = zzd.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                charAt2 = i48 | (charAt7 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int charAt21 = zzd.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                charAt21 = i51 | (charAt6 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int charAt22 = zzd.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt22 = i54 | (charAt5 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            charAt3 = zzd.charAt(i53);
            if (charAt3 >= 55296) {
                int i57 = charAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                charAt3 = i57 | (charAt4 << i58);
                i56 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i32 = i56;
            int i59 = charAt21;
            i4 = charAt20;
            i5 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i60 = charAt3 + i5;
        int i61 = charAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int charAt23 = zzd.charAt(i32);
            if (charAt23 >= c) {
                int i66 = charAt23 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    charAt15 = zzd.charAt(i67);
                    if (charAt15 < c) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                charAt23 = i66 | (charAt15 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int charAt24 = zzd.charAt(i14);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                charAt24 = i70 | (charAt14 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = charAt24 & 255;
            int i74 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        charAt13 = zzd.charAt(i77);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    charAt25 = i76 | (charAt13 << i78);
                    i25 = i27;
                } else {
                    i18 = i4;
                    i25 = i75;
                }
                int i79 = i73 - 51;
                i22 = i25;
                if (i79 == 9 || i79 == 17) {
                    int i80 = i63 / 3;
                    i26 = i2 + 1;
                    objArr2[i80 + i80 + 1] = zze[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i81 = i63 / 3;
                        i26 = i2 + 1;
                        objArr2[i81 + i81 + 1] = zze[i2];
                    }
                    int i82 = charAt25 + charAt25;
                    obj = zze[i82];
                    if (!(obj instanceof Field)) {
                        zzA2 = (Field) obj;
                    } else {
                        zzA2 = zzA(cls, (String) obj);
                        zze[i82] = zzA2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzA2);
                    int i83 = i82 + 1;
                    obj2 = zze[i83];
                    if (!(obj2 instanceof Field)) {
                        zzA3 = (Field) obj2;
                    } else {
                        zzA3 = zzA(cls, (String) obj2);
                        zze[i83] = zzA3;
                    }
                    str = zzd;
                    i21 = (int) unsafe.objectFieldOffset(zzA3);
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                }
                i2 = i26;
                int i822 = charAt25 + charAt25;
                obj = zze[i822];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzA2);
                int i832 = i822 + 1;
                obj2 = zze[i832];
                if (!(obj2 instanceof Field)) {
                }
                str = zzd;
                i21 = (int) unsafe.objectFieldOffset(zzA3);
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i84 = i2 + 1;
                Field zzA4 = zzA(cls, (String) zze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i85 = i63 / 3;
                    objArr2[i85 + i85 + 1] = zzA4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i86 = i63 / 3;
                        i24 = i84 + 1;
                        objArr2[i86 + i86 + 1] = zze[i84];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i87 = i63 / 3;
                            i24 = i84 + 1;
                            objArr2[i87 + i87 + 1] = zze[i84];
                        }
                    } else if (i73 == 50) {
                        int i88 = i61 + 1;
                        iArr[i61] = i63;
                        int i89 = i63 / 3;
                        int i90 = i89 + i89;
                        int i91 = i84 + 1;
                        objArr2[i90] = zze[i84];
                        if ((charAt24 & 2048) != 0) {
                            i84 = i91 + 1;
                            objArr2[i90 + 1] = zze[i91];
                            i61 = i88;
                        } else {
                            i61 = i88;
                            i19 = i91;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i73 > 17) {
                                str = zzd;
                                i20 = i19;
                                i21 = 1048575;
                                i22 = i16;
                                i23 = 0;
                            } else {
                                int i92 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i93 = charAt26 & 8191;
                                    int i94 = 13;
                                    while (true) {
                                        i22 = i92 + 1;
                                        charAt12 = zzd.charAt(i92);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i93 |= (charAt12 & 8191) << i94;
                                        i94 += 13;
                                        i92 = i22;
                                    }
                                    charAt26 = i93 | (charAt12 << i94);
                                } else {
                                    i22 = i92;
                                }
                                int i95 = i3 + i3 + (charAt26 / 32);
                                Object obj3 = zze[i95];
                                str = zzd;
                                if (obj3 instanceof Field) {
                                    zzA = (Field) obj3;
                                } else {
                                    zzA = zzA(cls, (String) obj3);
                                    zze[i95] = zzA;
                                }
                                i20 = i19;
                                i21 = (int) unsafe.objectFieldOffset(zzA);
                                i23 = charAt26 % 32;
                            }
                            if (i73 >= 18 || i73 > 49) {
                                i2 = i20;
                            } else {
                                iArr[i62] = objectFieldOffset;
                                i2 = i20;
                                i62++;
                            }
                        }
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i16;
                    i23 = 0;
                    if (i73 >= 18) {
                    }
                    i2 = i20;
                }
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i20 = i19;
                i21 = 1048575;
                i22 = i16;
                i23 = 0;
                if (i73 >= 18) {
                }
                i2 = i20;
            }
            int i96 = i63 + 1;
            iArr2[i63] = charAt23;
            int i97 = i96 + 1;
            iArr2[i96] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | objectFieldOffset;
            i63 = i97 + 1;
            iArr2[i97] = (i23 << 20) | i21;
            charAt = i17;
            charAt3 = i74;
            i32 = i22;
            length = i15;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzfz(iArr3, objArr2, charAt, i4, zzggVar.zza(), z, false, iArr, charAt3, i60, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzfp zzfpVar = (zzfp) zzz;
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i5 == 0) {
                    int zzm = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case SSL.SSL_PROTOCOL_TLS /* 62 */:
                if (i5 == 0) {
                    int zzj = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzdt.zzj(bArr, i, zzdsVar);
                    int i9 = zzdsVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) == 0 || zzhm.zzd(bArr, zzj2, zzj2 + i9)) {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzez.zzb));
                        zzj2 += i9;
                    } else {
                        throw zzfa.zzb();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    int zzd = zzdt.zzd(zzy(i8), bArr, i, i2, zzdsVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int zza2 = zzdt.zza(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i10 = zzdsVar.zza;
                    zzex zzx = zzx(i8);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzc(obj).zzf(i3, Long.valueOf(i10));
                    }
                    return zzj3;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                if (i5 == 0) {
                    int zzj4 = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i5 == 0) {
                    int zzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzdt.zzc(zzy(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
        byte b;
        int i3;
        int zzq;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzm;
        int zzd;
        int i11;
        int i12;
        int i13;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i15 = 1048575;
        int i16 = -1;
        int i17 = i;
        int i18 = -1;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        while (i17 < i14) {
            int i22 = i17 + 1;
            byte b2 = bArr2[i17];
            if (b2 < 0) {
                i3 = zzdt.zzk(b2, bArr2, i22, zzdsVar2);
                b = zzdsVar2.zza;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            if (i23 > i18) {
                zzq = zzfzVar.zzr(i23, i20 / 3);
            } else {
                zzq = zzfzVar.zzq(i23);
            }
            int i25 = zzq;
            if (i25 == i16) {
                i4 = i3;
                i5 = i23;
                i6 = i16;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i26 = iArr[i25 + 1];
                int zzu = zzu(i26);
                long j = i26 & i15;
                if (zzu <= 17) {
                    int i27 = iArr[i25 + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i21);
                        }
                        if (i29 != 1048575) {
                            i21 = unsafe2.getInt(obj2, i29);
                        }
                        i19 = i29;
                    }
                    switch (zzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i9)));
                                i17 = i9 + 8;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i9)));
                                i17 = i9 + 4;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzm = zzdt.zzm(bArr2, i9, zzdsVar2);
                                unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                i21 |= i28;
                                i17 = zzm;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = zzdt.zzj(bArr2, i9, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i9 = i3;
                                unsafe2.putLong(obj, j, zzdt.zzn(bArr2, i3));
                                i17 = i9 + 8;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, i3));
                                i17 = i3 + 4;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = zzdt.zzm(bArr2, i3, zzdsVar2);
                                zzhi.zzk(obj2, j, zzdsVar2.zzb != 0);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                if ((536870912 & i26) == 0) {
                                    i17 = zzdt.zzg(bArr2, i3, zzdsVar2);
                                } else {
                                    i17 = zzdt.zzh(bArr2, i3, zzdsVar2);
                                }
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzd(zzfzVar.zzy(i8), bArr2, i3, i14, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zza(bArr2, i3, zzdsVar2);
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i3, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i3, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar2.zza));
                                i21 |= i28;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 16:
                            if (i24 != 0) {
                                i5 = i23;
                                i8 = i25;
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                zzm = zzdt.zzm(bArr2, i3, zzdsVar2);
                                i8 = i25;
                                i5 = i23;
                                i10 = 1048575;
                                unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                i21 |= i28;
                                i17 = zzm;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        default:
                            i5 = i23;
                            i8 = i25;
                            i9 = i3;
                            i4 = i9;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i8 = i25;
                    int i30 = i3;
                    i10 = 1048575;
                    i5 = i23;
                    if (zzu == 27) {
                        if (i24 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj2, j);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzeyVar);
                            }
                            i17 = zzdt.zze(zzfzVar.zzy(i8), b, bArr, i30, i2, zzeyVar, zzdsVar);
                            i21 = i21;
                            i20 = i8;
                            i18 = i5;
                            i15 = i10;
                            i16 = -1;
                        } else {
                            i11 = i30;
                            i12 = i21;
                            i13 = i19;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                        }
                    } else if (zzu <= 49) {
                        i12 = i21;
                        i13 = i19;
                        i6 = -1;
                        unsafe = unsafe2;
                        i7 = i8;
                        i17 = zzp(obj, bArr, i30, i2, b, i5, i24, i8, i26, zzu, j, zzdsVar);
                        if (i17 != i30) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i14 = i2;
                            zzdsVar2 = zzdsVar;
                            i19 = i13;
                            i16 = i6;
                            i18 = i5;
                            i21 = i12;
                            i20 = i7;
                            unsafe2 = unsafe;
                            i15 = 1048575;
                            zzfzVar = this;
                        } else {
                            i4 = i17;
                            i19 = i13;
                            i21 = i12;
                        }
                    } else {
                        i11 = i30;
                        i12 = i21;
                        i13 = i19;
                        unsafe = unsafe2;
                        i7 = i8;
                        i6 = -1;
                        if (zzu != 50) {
                            i17 = zzn(obj, bArr, i11, i2, b, i5, i24, i26, zzu, j, i7, zzdsVar);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                zzdsVar2 = zzdsVar;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                zzfzVar = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        } else if (i24 == 2) {
                            i17 = zzm(obj, bArr, i11, i2, i7, j, zzdsVar);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                zzdsVar2 = zzdsVar;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                zzfzVar = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        }
                    }
                    i4 = i11;
                    i19 = i13;
                    i21 = i12;
                }
            }
            i17 = zzdt.zzi(b, bArr, i4, i2, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            zzdsVar2 = zzdsVar;
            i16 = i6;
            i18 = i5;
            i20 = i7;
            unsafe2 = unsafe;
            i15 = 1048575;
        }
        int i31 = i21;
        int i32 = i19;
        Unsafe unsafe3 = unsafe2;
        if (i32 != i15) {
            unsafe3.putInt(obj, i32, i31);
        }
        if (i17 == i2) {
            return i17;
        }
        throw zzfa.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzp(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzds zzdsVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12;
        int i13 = i;
        Unsafe unsafe = zzb;
        zzey zzeyVar = (zzey) unsafe.getObject(obj, j2);
        if (!zzeyVar.zzc()) {
            int size = zzeyVar.size();
            zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzeyVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int zzj2 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i14 = zzdsVar.zza + zzj2;
                    while (zzj2 < i14) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i14) {
                        return zzj2;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    while (true) {
                        i8 = i13 + 8;
                        if (i8 < i2) {
                            i13 = zzdt.zzj(bArr, i8, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i13)));
                            }
                        }
                    }
                    return i8;
                }
                return i13;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int zzj3 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i15 = zzdsVar.zza + zzj3;
                    while (zzj3 < i15) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i15) {
                        return zzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    while (true) {
                        i9 = i13 + 4;
                        if (i9 < i2) {
                            i13 = zzdt.zzj(bArr, i9, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i13)));
                            }
                        }
                    }
                    return i9;
                }
                return i13;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int zzj4 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i16 = zzdsVar.zza + zzj4;
                    while (zzj4 < i16) {
                        zzj4 = zzdt.zzm(bArr, zzj4, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (zzj4 == i16) {
                        return zzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int zzm = zzdt.zzm(bArr, i13, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzdt.zzj(bArr, zzm, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzm;
                        }
                        zzm = zzdt.zzm(bArr, zzj5, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return zzm;
                }
                return i13;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzdt.zzf(bArr, i13, zzeyVar, zzdsVar);
                }
                if (i5 == 0) {
                    return zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                }
                return i13;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int zzj6 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i17 = zzdsVar.zza + zzj6;
                    while (zzj6 < i17) {
                        zzflVar3.zze(zzdt.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i17) {
                        return zzj6;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    while (true) {
                        i10 = i13 + 8;
                        if (i10 < i2) {
                            i13 = zzdt.zzj(bArr, i10, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzflVar4.zze(zzdt.zzn(bArr, i13));
                            }
                        }
                    }
                    return i10;
                }
                return i13;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int zzj7 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i18 = zzdsVar.zza + zzj7;
                    while (zzj7 < i18) {
                        zzevVar.zze(zzdt.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i18) {
                        return zzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    while (true) {
                        i11 = i13 + 4;
                        if (i11 < i2) {
                            i13 = zzdt.zzj(bArr, i11, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzevVar2.zze(zzdt.zzb(bArr, i13));
                            }
                        }
                    }
                    return i11;
                }
                return i13;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    zzj = zzdt.zzj(bArr, i13, zzdsVar);
                    int i19 = zzdsVar.zza + zzj;
                    while (zzj < i19) {
                        zzj = zzdt.zzm(bArr, zzj, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (zzj != i19) {
                        throw zzfa.zzf();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int zzm2 = zzdt.zzm(bArr, i13, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzdt.zzj(bArr, zzm2, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzdt.zzm(bArr, zzj8, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i13;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) != 0) {
                        int zzj9 = zzdt.zzj(bArr, i13, zzdsVar);
                        int i20 = zzdsVar.zza;
                        if (i20 >= 0) {
                            if (i20 == 0) {
                                zzeyVar.add("");
                                while (zzj9 < i2) {
                                    int zzj10 = zzdt.zzj(bArr, zzj9, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return zzj9;
                                    }
                                    zzj9 = zzdt.zzj(bArr, zzj10, zzdsVar);
                                    int i21 = zzdsVar.zza;
                                    if (i21 < 0) {
                                        throw zzfa.zzc();
                                    }
                                    if (i21 == 0) {
                                        zzeyVar.add("");
                                    } else {
                                        i12 = zzj9 + i21;
                                        if (zzhm.zzd(bArr, zzj9, i12)) {
                                            zzeyVar.add(new String(bArr, zzj9, i21, zzez.zzb));
                                            zzj9 = i12;
                                            while (zzj9 < i2) {
                                            }
                                        } else {
                                            throw zzfa.zzb();
                                        }
                                    }
                                }
                                return zzj9;
                            }
                            i12 = zzj9 + i20;
                            if (!zzhm.zzd(bArr, zzj9, i12)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, zzj9, i20, zzez.zzb));
                            zzj9 = i12;
                            while (zzj9 < i2) {
                            }
                            return zzj9;
                        }
                        throw zzfa.zzc();
                    }
                    int zzj11 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i22 = zzdsVar.zza;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            zzeyVar.add("");
                            while (zzj11 < i2) {
                                int zzj12 = zzdt.zzj(bArr, zzj11, zzdsVar);
                                if (i3 != zzdsVar.zza) {
                                    return zzj11;
                                }
                                zzj11 = zzdt.zzj(bArr, zzj12, zzdsVar);
                                i22 = zzdsVar.zza;
                                if (i22 < 0) {
                                    throw zzfa.zzc();
                                }
                                if (i22 == 0) {
                                    zzeyVar.add("");
                                } else {
                                    zzeyVar.add(new String(bArr, zzj11, i22, zzez.zzb));
                                    zzj11 += i22;
                                    while (zzj11 < i2) {
                                    }
                                }
                            }
                            return zzj11;
                        }
                        zzeyVar.add(new String(bArr, zzj11, i22, zzez.zzb));
                        zzj11 += i22;
                        while (zzj11 < i2) {
                        }
                        return zzj11;
                    }
                    throw zzfa.zzc();
                }
                return i13;
            case 27:
                if (i5 == 2) {
                    return zzdt.zze(zzy(i6), i3, bArr, i, i2, zzeyVar, zzdsVar);
                }
                return i13;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i23 = zzdsVar.zza;
                    if (i23 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i23 <= bArr.length - zzj13) {
                        if (i23 == 0) {
                            zzeyVar.add(zzee.zzb);
                            while (zzj13 < i2) {
                                int zzj14 = zzdt.zzj(bArr, zzj13, zzdsVar);
                                if (i3 != zzdsVar.zza) {
                                    return zzj13;
                                }
                                zzj13 = zzdt.zzj(bArr, zzj14, zzdsVar);
                                i23 = zzdsVar.zza;
                                if (i23 >= 0) {
                                    if (i23 > bArr.length - zzj13) {
                                        throw zzfa.zzf();
                                    }
                                    if (i23 == 0) {
                                        zzeyVar.add(zzee.zzb);
                                    } else {
                                        zzeyVar.add(zzee.zzk(bArr, zzj13, i23));
                                        zzj13 += i23;
                                        while (zzj13 < i2) {
                                        }
                                    }
                                } else {
                                    throw zzfa.zzc();
                                }
                            }
                            return zzj13;
                        }
                        zzeyVar.add(zzee.zzk(bArr, zzj13, i23));
                        zzj13 += i23;
                        while (zzj13 < i2) {
                        }
                        return zzj13;
                    }
                    throw zzfa.zzf();
                }
                return i13;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzj = zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                    }
                    return i13;
                }
                zzj = zzdt.zzf(bArr, i13, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object zzd = zzgj.zzd(i4, zzeyVar, zzx(i6), zzgzVar, this.zzm);
                if (zzd != null) {
                    zzeuVar.zzc = (zzgz) zzd;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int zzj15 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i24 = zzdsVar.zza + zzj15;
                    while (zzj15 < i24) {
                        zzj15 = zzdt.zzj(bArr, zzj15, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (zzj15 == i24) {
                        return zzj15;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int zzj16 = zzdt.zzj(bArr, i13, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (zzj16 < i2) {
                        int zzj17 = zzdt.zzj(bArr, zzj16, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzdt.zzj(bArr, zzj17, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return zzj16;
                }
                return i13;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int zzj18 = zzdt.zzj(bArr, i13, zzdsVar);
                    int i25 = zzdsVar.zza + zzj18;
                    while (zzj18 < i25) {
                        zzj18 = zzdt.zzm(bArr, zzj18, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (zzj18 == i25) {
                        return zzj18;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int zzm3 = zzdt.zzm(bArr, i13, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (zzm3 < i2) {
                        int zzj19 = zzdt.zzj(bArr, zzm3, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzdt.zzm(bArr, zzj19, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return zzm3;
                }
                return i13;
            default:
                if (i5 == 3) {
                    zzgh zzy = zzy(i6);
                    int i26 = (i3 & (-8)) | 4;
                    int zzc = zzdt.zzc(zzy, bArr, i, i2, i26, zzdsVar);
                    zzeyVar.add(zzdsVar.zzc);
                    while (zzc < i2) {
                        int zzj20 = zzdt.zzj(bArr, zzc, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzc;
                        }
                        zzc = zzdt.zzc(zzy, bArr, zzj20, i2, i26, zzdsVar);
                        zzeyVar.add(zzdsVar.zzc);
                    }
                    return zzc;
                }
                return i13;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i2);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i) {
        int i2 = i / 3;
        return (zzex) this.zzd[i2 + i2 + 1];
    }

    private final zzgh zzy(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgh zzghVar = (zzgh) this.zzd[i3];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzv = zzv(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzv;
            int i5 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzez.zza(zzhi.zzt(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i2 * 53;
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case SSL.SSL_PROTOCOL_TLS /* 62 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.zzm.zza(obj).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0335, code lost:
        if (r0 != r20) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0337, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r2 = r19;
        r3 = r21;
        r5 = r22;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034f, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0372, code lost:
        if (r0 != r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0398, code lost:
        if (r0 != r15) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(Object obj, byte[] bArr, int i, int i2, int i3, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        byte b;
        int zzq;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int zzh;
        int i16;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i17 = i2;
        int i18 = i3;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i19 = i;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 1048575;
        while (true) {
            if (i19 < i17) {
                int i25 = i19 + 1;
                byte b2 = bArr2[i19];
                if (b2 < 0) {
                    int zzk = zzdt.zzk(b2, bArr2, i25, zzdsVar2);
                    b = zzdsVar2.zza;
                    i25 = zzk;
                } else {
                    b = b2;
                }
                int i26 = b >>> 3;
                int i27 = b & 7;
                if (i26 > i23) {
                    zzq = zzfzVar.zzr(i26, i21 / 3);
                } else {
                    zzq = zzfzVar.zzq(i26);
                }
                if (zzq == -1) {
                    i5 = i26;
                    i6 = i25;
                    i7 = b;
                    i8 = i22;
                    unsafe = unsafe2;
                    i4 = i18;
                    i9 = 0;
                } else {
                    int[] iArr = zzfzVar.zzc;
                    int i28 = iArr[zzq + 1];
                    int zzu = zzu(i28);
                    i5 = i26;
                    int i29 = i25;
                    long j = i28 & 1048575;
                    if (zzu <= 17) {
                        int i30 = iArr[zzq + 2];
                        int i31 = 1 << (i30 >>> 20);
                        int i32 = i30 & 1048575;
                        if (i32 != i24) {
                            i10 = b;
                            if (i24 != 1048575) {
                                unsafe2.putInt(obj3, i24, i22);
                            }
                            i22 = unsafe2.getInt(obj3, i32);
                            i11 = i32;
                        } else {
                            i10 = b;
                            i11 = i24;
                        }
                        int i33 = i22;
                        switch (zzu) {
                            case 0:
                                i12 = zzq;
                                i13 = i29;
                                if (i27 == 1) {
                                    zzhi.zzl(obj3, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i13)));
                                    i19 = i13 + 8;
                                    i22 = i33 | i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 1:
                                i12 = zzq;
                                i13 = i29;
                                if (i27 == 5) {
                                    zzhi.zzm(obj3, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i13)));
                                    i19 = i13 + 4;
                                    i22 = i33 | i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 2:
                            case 3:
                                i12 = zzq;
                                i13 = i29;
                                if (i27 == 0) {
                                    int zzm = zzdt.zzm(bArr2, i13, zzdsVar2);
                                    unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                    i22 = i33 | i31;
                                    i17 = i2;
                                    i19 = zzm;
                                    i21 = i12;
                                    i20 = i10;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 4:
                            case 11:
                                i12 = zzq;
                                i13 = i29;
                                if (i27 == 0) {
                                    i19 = zzdt.zzj(bArr2, i13, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzdsVar2.zza);
                                    i22 = i33 | i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 5:
                            case 14:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 == 1) {
                                    i10 = i14;
                                    i13 = i15;
                                    unsafe2.putLong(obj, j, zzdt.zzn(bArr2, i15));
                                    i19 = i13 + 8;
                                    i22 = i33 | i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 6:
                            case 13:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 == 5) {
                                    unsafe2.putInt(obj3, j, zzdt.zzb(bArr2, i15));
                                    i19 = i15 + 4;
                                    i22 = i33 | i31;
                                    i20 = i14;
                                    i21 = i12;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 7:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 == 0) {
                                    i19 = zzdt.zzm(bArr2, i15, zzdsVar2);
                                    zzhi.zzk(obj3, j, zzdsVar2.zzb != 0);
                                    i22 = i33 | i31;
                                    i20 = i14;
                                    i21 = i12;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 8:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 == 2) {
                                    if ((536870912 & i28) == 0) {
                                        zzh = zzdt.zzg(bArr2, i15, zzdsVar2);
                                    } else {
                                        zzh = zzdt.zzh(bArr2, i15, zzdsVar2);
                                    }
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    i22 = i33 | i31;
                                    i19 = zzh;
                                    i20 = i14;
                                    i21 = i12;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 9:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 == 2) {
                                    zzh = zzdt.zzd(zzfzVar.zzy(i12), bArr2, i15, i17, zzdsVar2);
                                    if ((i33 & i31) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    i22 = i33 | i31;
                                    i19 = zzh;
                                    i20 = i14;
                                    i21 = i12;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 10:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 == 2) {
                                    zzh = zzdt.zza(bArr2, i15, zzdsVar2);
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    i22 = i33 | i31;
                                    i19 = zzh;
                                    i20 = i14;
                                    i21 = i12;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 12:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 != 0) {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                } else {
                                    zzh = zzdt.zzj(bArr2, i15, zzdsVar2);
                                    int i34 = zzdsVar2.zza;
                                    zzex zzx = zzfzVar.zzx(i12);
                                    if (zzx == null || zzx.zza()) {
                                        unsafe2.putInt(obj3, j, i34);
                                        i22 = i33 | i31;
                                        i19 = zzh;
                                        i20 = i14;
                                        i21 = i12;
                                        i23 = i5;
                                        i24 = i11;
                                        i18 = i3;
                                        break;
                                    } else {
                                        zzc(obj).zzf(i14, Long.valueOf(i34));
                                        i19 = zzh;
                                        i20 = i14;
                                        i22 = i33;
                                        i21 = i12;
                                        i23 = i5;
                                        i24 = i11;
                                        i18 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i12 = zzq;
                                i14 = i10;
                                i15 = i29;
                                if (i27 == 0) {
                                    i19 = zzdt.zzj(bArr2, i15, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzei.zzb(zzdsVar2.zza));
                                    i22 = i33 | i31;
                                    i20 = i14;
                                    i21 = i12;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i15;
                                    i10 = i14;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            case 16:
                                if (i27 == 0) {
                                    int zzm2 = zzdt.zzm(bArr2, i29, zzdsVar2);
                                    i12 = zzq;
                                    unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                    i22 = i33 | i31;
                                    i19 = zzm2;
                                    i20 = i10;
                                    i21 = i12;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i12 = zzq;
                                    i13 = i29;
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                            default:
                                i12 = zzq;
                                i13 = i29;
                                if (i27 == 3) {
                                    i19 = zzdt.zzc(zzfzVar.zzy(i12), bArr, i13, i2, (i5 << 3) | 4, zzdsVar);
                                    if ((i33 & i31) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    i22 = i33 | i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    i23 = i5;
                                    i24 = i11;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i33;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i6 = i13;
                                    i7 = i10;
                                    i24 = i11;
                                    break;
                                }
                        }
                    } else {
                        i10 = b;
                        int i35 = zzq;
                        if (zzu != 27) {
                            i9 = i35;
                            i8 = i22;
                            i11 = i24;
                            if (zzu <= 49) {
                                unsafe = unsafe2;
                                i19 = zzp(obj, bArr, i29, i2, i10, i5, i27, i9, i28, zzu, j, zzdsVar);
                            } else {
                                unsafe = unsafe2;
                                i16 = i29;
                                if (zzu != 50) {
                                    i19 = zzn(obj, bArr, i16, i2, i10, i5, i27, i28, zzu, j, i9, zzdsVar);
                                } else if (i27 == 2) {
                                    i19 = zzm(obj, bArr, i16, i2, i9, j, zzdsVar);
                                }
                            }
                        } else if (i27 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj3, j);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzeyVar);
                            }
                            i20 = i10;
                            i19 = zzdt.zze(zzfzVar.zzy(i35), i20, bArr, i29, i2, zzeyVar, zzdsVar);
                            i17 = i2;
                            i18 = i3;
                            i23 = i5;
                            i21 = i35;
                            i22 = i22;
                            i24 = i24;
                        } else {
                            i9 = i35;
                            i8 = i22;
                            i11 = i24;
                            unsafe = unsafe2;
                            i16 = i29;
                        }
                        i4 = i3;
                        i6 = i16;
                        i7 = i10;
                        i24 = i11;
                    }
                }
                if (i7 != i4 || i4 == 0) {
                    i19 = zzdt.zzi(i7, bArr, i6, i2, zzc(obj), zzdsVar);
                    zzfzVar = this;
                    obj3 = obj;
                    bArr2 = bArr;
                    i17 = i2;
                    zzdsVar2 = zzdsVar;
                    i18 = i4;
                    i20 = i7;
                    i23 = i5;
                    i21 = i9;
                    i22 = i8;
                    unsafe2 = unsafe;
                } else {
                    i19 = i6;
                    i20 = i7;
                    i22 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i18;
            }
        }
        if (i24 != 1048575) {
            long j2 = i24;
            obj2 = obj;
            unsafe.putInt(obj2, j2, i22);
        } else {
            obj2 = obj;
        }
        for (int i36 = this.zzj; i36 < this.zzk; i36++) {
            int i37 = this.zzi[i36];
            int i38 = this.zzc[i37];
            Object zzf = zzhi.zzf(obj2, zzv(i37) & 1048575);
            if (zzf != null && zzx(i37) != null) {
                zzfq zzfqVar = (zzfq) zzf;
                zzfp zzfpVar = (zzfp) zzz(i37);
                throw null;
            }
        }
        if (i4 == 0) {
            if (i19 != i2) {
                throw zzfa.zzd();
            }
        } else if (i19 > i2 || i20 != i4) {
            throw zzfa.zzd();
        }
        return i19;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i2 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i2 >= i) {
                break;
            }
            long zzv = zzv(this.zzi[i2]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
            }
            i2++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i, i2, zzdsVar);
        } else {
            zzb(obj, bArr, i, i2, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzv = zzv(i);
            long j = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i) && Double.doubleToLongBits(zzhi.zza(obj, j)) == Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(obj, obj2, i) && Float.floatToIntBits(zzhi.zzb(obj, j)) == Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(obj, obj2, i) && zzhi.zzt(obj, j) == zzhi.zzt(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
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
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case 50:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case SSL.SSL_PROTOCOL_TLS /* 62 */:
                case 63:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 68:
                    long zzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int i6 = this.zzi[i5];
            int i7 = this.zzc[i6];
            int zzv = zzv(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzv) != 0 && !zzH(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(obj, i7, i6) && !zzI(obj, zzv, zzy(i6))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfq) zzhi.zzf(obj, zzv & 1048575)).isEmpty()) {
                            zzfp zzfpVar = (zzfp) zzz(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzy.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzH(obj, i6, i, i2, i10) && !zzI(obj, zzv, zzy(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzv = zzv(i);
            long j = 1048575 & zzv;
            int i2 = this.zzc[i];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case SSL.SSL_PROTOCOL_TLS /* 62 */:
                case 63:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }
}
