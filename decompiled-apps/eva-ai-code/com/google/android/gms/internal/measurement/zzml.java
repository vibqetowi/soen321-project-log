package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i, int i2, zzmi zzmiVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i) {
        int i2 = i / 3;
        return (zzlf) this.zzd[i2 + i2 + 1];
    }

    private final zzmt zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzmt zzmtVar = (zzmt) this.zzd[i3];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzmt zzB = zzB(i);
        int zzy = zzy(i) & 1048575;
        if (!zzP(obj, i)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i, int i2) {
        zzmt zzB = zzB(i2);
        if (!zzT(obj, i, i2)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i2) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (zzP(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzy = zzy(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzy);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i);
            if (!zzP(obj, i)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, zzy, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzT(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzy = zzy(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzy);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i);
            if (!zzT(obj, i2, i)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, zzy, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                }
                zzK(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzv = zzv(i);
        long j = 1048575 & zzv;
        if (j == 1048575) {
            return;
        }
        zznu.zzq(obj, j, (1 << (zzv >>> 20)) | zznu.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zznu.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzoc zzocVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzmb zzmbVar = (zzmb) zzC(i2);
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j = zzv & 1048575;
        if (j != 1048575) {
            return (zznu.zzc(obj, j) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i);
        long j2 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j2)) != 0;
            case 2:
                return zznu.zzd(obj, j2) != 0;
            case 3:
                return zznu.zzd(obj, j2) != 0;
            case 4:
                return zznu.zzc(obj, j2) != 0;
            case 5:
                return zznu.zzd(obj, j2) != 0;
            case 6:
                return zznu.zzc(obj, j2) != 0;
            case 7:
                return zznu.zzw(obj, j2);
            case 8:
                Object zzf = zznu.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzka) {
                    return !zzka.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zznu.zzf(obj, j2) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j2));
            case 11:
                return zznu.zzc(obj, j2) != 0;
            case 12:
                return zznu.zzc(obj, j2) != 0;
            case 13:
                return zznu.zzc(obj, j2) != 0;
            case 14:
                return zznu.zzd(obj, j2) != 0;
            case 15:
                return zznu.zzc(obj, j2) != 0;
            case 16:
                return zznu.zzd(obj, j2) != 0;
            case 17:
                return zznu.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzP(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzR(Object obj, int i, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zznu.zzc(obj, (long) (zzv(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zznu.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i, (String) obj);
        } else {
            zzocVar.zzd(i, (zzka) obj);
        }
    }

    static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar == zznl.zzc()) {
            zznl zzf = zznl.zzf();
            zzlbVar.zzc = zzf;
            return zzf;
        }
        return zznlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzml zzl(Class cls, zzmf zzmfVar, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        int i;
        int charAt;
        int charAt2;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt3;
        int i7;
        char charAt4;
        int i8;
        char charAt5;
        int i9;
        char charAt6;
        int i10;
        char charAt7;
        int i11;
        char charAt8;
        int i12;
        char charAt9;
        int i13;
        char charAt10;
        int i14;
        int i15;
        int i16;
        Object[] objArr;
        int objectFieldOffset;
        int i17;
        int i18;
        int i19;
        Field zzF;
        char charAt11;
        int i20;
        Object[] objArr2;
        int i21;
        int i22;
        Object obj;
        Field zzF2;
        Object obj2;
        Field zzF3;
        int i23;
        char charAt12;
        int i24;
        char charAt13;
        int i25;
        char charAt14;
        int i26;
        char charAt15;
        if (zzmfVar instanceof zzms) {
            zzms zzmsVar = (zzms) zzmfVar;
            int zzc = zzmsVar.zzc();
            String zzd = zzmsVar.zzd();
            int length = zzd.length();
            int i27 = 0;
            int i28 = 55296;
            if (zzd.charAt(0) >= 55296) {
                int i29 = 1;
                while (true) {
                    i = i29 + 1;
                    if (zzd.charAt(i29) < 55296) {
                        break;
                    }
                    i29 = i;
                }
            } else {
                i = 1;
            }
            int i30 = i + 1;
            int charAt16 = zzd.charAt(i);
            if (charAt16 >= 55296) {
                int i31 = charAt16 & 8191;
                int i32 = 13;
                while (true) {
                    i26 = i30 + 1;
                    charAt15 = zzd.charAt(i30);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i31 |= (charAt15 & 8191) << i32;
                    i32 += 13;
                    i30 = i26;
                }
                charAt16 = i31 | (charAt15 << i32);
                i30 = i26;
            }
            if (charAt16 == 0) {
                i3 = 0;
                charAt = 0;
                charAt2 = 0;
                i5 = 0;
                i4 = 0;
                iArr = zza;
                i2 = 0;
            } else {
                int i33 = i30 + 1;
                int charAt17 = zzd.charAt(i30);
                if (charAt17 >= 55296) {
                    int i34 = charAt17 & 8191;
                    int i35 = 13;
                    while (true) {
                        i13 = i33 + 1;
                        charAt10 = zzd.charAt(i33);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i34 |= (charAt10 & 8191) << i35;
                        i35 += 13;
                        i33 = i13;
                    }
                    charAt17 = i34 | (charAt10 << i35);
                    i33 = i13;
                }
                int i36 = i33 + 1;
                int charAt18 = zzd.charAt(i33);
                if (charAt18 >= 55296) {
                    int i37 = charAt18 & 8191;
                    int i38 = 13;
                    while (true) {
                        i12 = i36 + 1;
                        charAt9 = zzd.charAt(i36);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i37 |= (charAt9 & 8191) << i38;
                        i38 += 13;
                        i36 = i12;
                    }
                    charAt18 = i37 | (charAt9 << i38);
                    i36 = i12;
                }
                int i39 = i36 + 1;
                int charAt19 = zzd.charAt(i36);
                if (charAt19 >= 55296) {
                    int i40 = charAt19 & 8191;
                    int i41 = 13;
                    while (true) {
                        i11 = i39 + 1;
                        charAt8 = zzd.charAt(i39);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i40 |= (charAt8 & 8191) << i41;
                        i41 += 13;
                        i39 = i11;
                    }
                    charAt19 = i40 | (charAt8 << i41);
                    i39 = i11;
                }
                int i42 = i39 + 1;
                int charAt20 = zzd.charAt(i39);
                if (charAt20 >= 55296) {
                    int i43 = charAt20 & 8191;
                    int i44 = 13;
                    while (true) {
                        i10 = i42 + 1;
                        charAt7 = zzd.charAt(i42);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i43 |= (charAt7 & 8191) << i44;
                        i44 += 13;
                        i42 = i10;
                    }
                    charAt20 = i43 | (charAt7 << i44);
                    i42 = i10;
                }
                int i45 = i42 + 1;
                charAt = zzd.charAt(i42);
                if (charAt >= 55296) {
                    int i46 = charAt & 8191;
                    int i47 = 13;
                    while (true) {
                        i9 = i45 + 1;
                        charAt6 = zzd.charAt(i45);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i46 |= (charAt6 & 8191) << i47;
                        i47 += 13;
                        i45 = i9;
                    }
                    charAt = i46 | (charAt6 << i47);
                    i45 = i9;
                }
                int i48 = i45 + 1;
                charAt2 = zzd.charAt(i45);
                if (charAt2 >= 55296) {
                    int i49 = charAt2 & 8191;
                    int i50 = 13;
                    while (true) {
                        i8 = i48 + 1;
                        charAt5 = zzd.charAt(i48);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i49 |= (charAt5 & 8191) << i50;
                        i50 += 13;
                        i48 = i8;
                    }
                    charAt2 = i49 | (charAt5 << i50);
                    i48 = i8;
                }
                int i51 = i48 + 1;
                int charAt21 = zzd.charAt(i48);
                if (charAt21 >= 55296) {
                    int i52 = charAt21 & 8191;
                    int i53 = 13;
                    while (true) {
                        i7 = i51 + 1;
                        charAt4 = zzd.charAt(i51);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i52 |= (charAt4 & 8191) << i53;
                        i53 += 13;
                        i51 = i7;
                    }
                    charAt21 = i52 | (charAt4 << i53);
                    i51 = i7;
                }
                int i54 = i51 + 1;
                int charAt22 = zzd.charAt(i51);
                if (charAt22 >= 55296) {
                    int i55 = charAt22 & 8191;
                    int i56 = i54;
                    int i57 = 13;
                    while (true) {
                        i6 = i56 + 1;
                        charAt3 = zzd.charAt(i56);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i55 |= (charAt3 & 8191) << i57;
                        i57 += 13;
                        i56 = i6;
                    }
                    charAt22 = i55 | (charAt3 << i57);
                    i54 = i6;
                }
                int i58 = charAt22 + charAt2 + charAt21;
                int i59 = charAt17 + charAt17 + charAt18;
                int[] iArr2 = new int[i58];
                i27 = charAt17;
                iArr = iArr2;
                i2 = charAt19;
                i3 = i59;
                i4 = charAt22;
                i30 = i54;
                i5 = charAt20;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzmsVar.zze();
            Class<?> cls2 = zzmsVar.zza().getClass();
            int i60 = i4 + charAt2;
            int i61 = charAt + charAt;
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr3 = new Object[i61];
            int i62 = i4;
            int i63 = i60;
            int i64 = 0;
            int i65 = 0;
            while (true) {
                boolean z = zzc == 2;
                if (i30 < length) {
                    int i66 = i30 + 1;
                    int charAt23 = zzd.charAt(i30);
                    if (charAt23 >= i28) {
                        int i67 = charAt23 & 8191;
                        int i68 = i66;
                        int i69 = 13;
                        while (true) {
                            i25 = i68 + 1;
                            charAt14 = zzd.charAt(i68);
                            i14 = zzc;
                            if (charAt14 < 55296) {
                                break;
                            }
                            i67 |= (charAt14 & 8191) << i69;
                            i69 += 13;
                            i68 = i25;
                            zzc = i14;
                        }
                        charAt23 = i67 | (charAt14 << i69);
                        i15 = i25;
                    } else {
                        i14 = zzc;
                        i15 = i66;
                    }
                    int i70 = i15 + 1;
                    int charAt24 = zzd.charAt(i15);
                    int i71 = length;
                    char c = 55296;
                    if (charAt24 >= 55296) {
                        int i72 = charAt24 & 8191;
                        int i73 = 13;
                        while (true) {
                            i24 = i70 + 1;
                            charAt13 = zzd.charAt(i70);
                            if (charAt13 < c) {
                                break;
                            }
                            i72 |= (charAt13 & 8191) << i73;
                            i73 += 13;
                            i70 = i24;
                            c = 55296;
                        }
                        charAt24 = i72 | (charAt13 << i73);
                        i70 = i24;
                    }
                    if ((charAt24 & 1024) != 0) {
                        iArr[i64] = i65;
                        i64++;
                    }
                    int i74 = charAt24 & 255;
                    int i75 = i5;
                    if (i74 >= 51) {
                        int i76 = i70 + 1;
                        int charAt25 = zzd.charAt(i70);
                        if (charAt25 >= 55296) {
                            int i77 = charAt25 & 8191;
                            int i78 = i76;
                            int i79 = 13;
                            while (true) {
                                i23 = i78 + 1;
                                charAt12 = zzd.charAt(i78);
                                i16 = i2;
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i77 |= (charAt12 & 8191) << i79;
                                i79 += 13;
                                i78 = i23;
                                i2 = i16;
                            }
                            charAt25 = i77 | (charAt12 << i79);
                            i21 = i23;
                        } else {
                            i16 = i2;
                            i21 = i76;
                        }
                        int i80 = i74 - 51;
                        int i81 = i21;
                        if (i80 == 9 || i80 == 17) {
                            int i82 = i65 / 3;
                            i22 = i3 + 1;
                            objArr3[i82 + i82 + 1] = zze[i3];
                        } else {
                            if (i80 == 12 && !z) {
                                int i83 = i65 / 3;
                                i22 = i3 + 1;
                                objArr3[i83 + i83 + 1] = zze[i3];
                            }
                            int i84 = charAt25 + charAt25;
                            obj = zze[i84];
                            if (!(obj instanceof Field)) {
                                zzF2 = (Field) obj;
                            } else {
                                zzF2 = zzF(cls2, (String) obj);
                                zze[i84] = zzF2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzF2);
                            int i85 = i84 + 1;
                            obj2 = zze[i85];
                            if (!(obj2 instanceof Field)) {
                                zzF3 = (Field) obj2;
                            } else {
                                zzF3 = zzF(cls2, (String) obj2);
                                zze[i85] = zzF3;
                            }
                            objectFieldOffset = objectFieldOffset2;
                            objArr2 = zze;
                            i18 = i81;
                            i17 = (int) unsafe.objectFieldOffset(zzF3);
                            i19 = 0;
                        }
                        i3 = i22;
                        int i842 = charAt25 + charAt25;
                        obj = zze[i842];
                        if (!(obj instanceof Field)) {
                        }
                        int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzF2);
                        int i852 = i842 + 1;
                        obj2 = zze[i852];
                        if (!(obj2 instanceof Field)) {
                        }
                        objectFieldOffset = objectFieldOffset22;
                        objArr2 = zze;
                        i18 = i81;
                        i17 = (int) unsafe.objectFieldOffset(zzF3);
                        i19 = 0;
                    } else {
                        i16 = i2;
                        int i86 = i3 + 1;
                        Field zzF4 = zzF(cls2, (String) zze[i3]);
                        if (i74 == 9 || i74 == 17) {
                            int i87 = i65 / 3;
                            objArr3[i87 + i87 + 1] = zzF4.getType();
                        } else {
                            if (i74 == 27 || i74 == 49) {
                                int i88 = i65 / 3;
                                i20 = i86 + 1;
                                objArr3[i88 + i88 + 1] = zze[i86];
                            } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                                if (!z) {
                                    int i89 = i65 / 3;
                                    i20 = i86 + 1;
                                    objArr3[i89 + i89 + 1] = zze[i86];
                                }
                            } else if (i74 == 50) {
                                int i90 = i62 + 1;
                                iArr[i62] = i65;
                                int i91 = i65 / 3;
                                int i92 = i86 + 1;
                                int i93 = i91 + i91;
                                objArr3[i93] = zze[i86];
                                if ((charAt24 & 2048) != 0) {
                                    i86 = i92 + 1;
                                    objArr3[i93 + 1] = zze[i92];
                                    i62 = i90;
                                } else {
                                    objArr = zze;
                                    i86 = i92;
                                    i62 = i90;
                                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                                    i17 = 1048575;
                                    if ((charAt24 & 4096) == 4096 || i74 > 17) {
                                        i18 = i70;
                                        i19 = 0;
                                    } else {
                                        int i94 = i70 + 1;
                                        int charAt26 = zzd.charAt(i70);
                                        if (charAt26 >= 55296) {
                                            int i95 = charAt26 & 8191;
                                            int i96 = 13;
                                            while (true) {
                                                i18 = i94 + 1;
                                                charAt11 = zzd.charAt(i94);
                                                if (charAt11 < 55296) {
                                                    break;
                                                }
                                                i95 |= (charAt11 & 8191) << i96;
                                                i96 += 13;
                                                i94 = i18;
                                            }
                                            charAt26 = i95 | (charAt11 << i96);
                                        } else {
                                            i18 = i94;
                                        }
                                        int i97 = i27 + i27 + (charAt26 / 32);
                                        Object obj3 = objArr[i97];
                                        if (obj3 instanceof Field) {
                                            zzF = (Field) obj3;
                                        } else {
                                            zzF = zzF(cls2, (String) obj3);
                                            objArr[i97] = zzF;
                                        }
                                        i19 = charAt26 % 32;
                                        i17 = (int) unsafe.objectFieldOffset(zzF);
                                    }
                                    if (i74 >= 18 && i74 <= 49) {
                                        iArr[i63] = objectFieldOffset;
                                        i63++;
                                    }
                                    i3 = i86;
                                    objArr2 = objArr;
                                }
                            }
                            i86 = i20;
                        }
                        objArr = zze;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                        i17 = 1048575;
                        if ((charAt24 & 4096) == 4096) {
                        }
                        i18 = i70;
                        i19 = 0;
                        if (i74 >= 18) {
                            iArr[i63] = objectFieldOffset;
                            i63++;
                        }
                        i3 = i86;
                        objArr2 = objArr;
                    }
                    int i98 = i65 + 1;
                    iArr3[i65] = charAt23;
                    int i99 = i98 + 1;
                    iArr3[i98] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i74 << 20) | objectFieldOffset;
                    i65 = i99 + 1;
                    iArr3[i99] = (i19 << 20) | i17;
                    zze = objArr2;
                    length = i71;
                    i30 = i18;
                    i5 = i75;
                    zzc = i14;
                    i2 = i16;
                    i28 = 55296;
                } else {
                    return new zzml(iArr3, objArr3, i2, i5, zzmsVar.zza(), z, false, iArr, i4, i60, zzmnVar, zzlwVar, zznkVar, zzkoVar, zzmdVar);
                }
            }
        } else {
            zznh zznhVar = (zznh) zzmfVar;
            throw null;
        }
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zznu.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zznu.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzo(Object obj) {
        int i;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzt;
        boolean z;
        int zzc;
        int zzh;
        int zzx7;
        int zzx8;
        int i2;
        int zzx9;
        int zzx10;
        int zzx11;
        int zzx12;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.zzc.length) {
            int zzy2 = zzy(i5);
            int[] iArr = this.zzc;
            int i8 = iArr[i5];
            int zzx13 = zzx(zzy2);
            if (zzx13 <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i3;
                int i11 = i9 >>> 20;
                if (i10 != i4) {
                    i7 = unsafe.getInt(obj, i10);
                    i4 = i10;
                }
                i = 1 << i11;
            } else {
                i = 0;
            }
            long j = zzy2 & i3;
            switch (zzx13) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzki.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzki.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzki.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i8 << 3) + 1;
                        i6 += zzx4;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzka) {
                            int i12 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            zzx5 = zzki.zzx(zzd) + zzd;
                            zzx6 = zzki.zzx(i8 << 3);
                            zzx4 = zzx6 + zzx5;
                            i6 += zzx4;
                            break;
                        } else {
                            zzy = zzki.zzw((String) object);
                            zzx3 = zzki.zzx(i8 << 3);
                            i6 += zzx3 + zzy;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzmv.zzn(i8, unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzx4;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i13 = zzki.zzb;
                        int zzd2 = ((zzka) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzki.zzx(zzd2) + zzd2;
                        zzx6 = zzki.zzx(i8 << 3);
                        zzx4 = zzx6 + zzx5;
                        i6 += zzx4;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzx(unsafe.getInt(obj, j));
                        zzx3 = zzki.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzki.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzx3 = zzki.zzx(i8 << 3);
                        zzy = zzki.zzx((i14 >> 31) ^ (i14 + i14));
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i6 += zzki.zzx(i8 << 3) + zzki.zzy((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzt(i8, (zzmi) unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzx4;
                        break;
                    }
                case 18:
                    zzx4 = zzmv.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 19:
                    zzx4 = zzmv.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 20:
                    zzx4 = zzmv.zzl(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 21:
                    zzx4 = zzmv.zzw(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 22:
                    zzx4 = zzmv.zzj(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 23:
                    zzx4 = zzmv.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 24:
                    zzx4 = zzmv.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 25:
                    zzx4 = zzmv.zza(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 26:
                    zzt = zzmv.zzt(i8, (List) unsafe.getObject(obj, j));
                    i6 += zzt;
                    break;
                case 27:
                    zzt = zzmv.zzo(i8, (List) unsafe.getObject(obj, j), zzB(i5));
                    i6 += zzt;
                    break;
                case 28:
                    zzt = zzmv.zzb(i8, (List) unsafe.getObject(obj, j));
                    i6 += zzt;
                    break;
                case 29:
                    zzt = zzmv.zzu(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzt;
                    break;
                case 30:
                    z = false;
                    zzc = zzmv.zzc(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 31:
                    z = false;
                    zzc = zzmv.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 32:
                    z = false;
                    zzc = zzmv.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 33:
                    z = false;
                    zzc = zzmv.zzp(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 34:
                    z = false;
                    zzc = zzmv.zzr(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 35:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 36:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 37:
                    zzh = zzmv.zzm((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 38:
                    zzh = zzmv.zzx((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 39:
                    zzh = zzmv.zzk((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 40:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 41:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 42:
                    int i15 = zzmv.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 43:
                    zzh = zzmv.zzv((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 44:
                    zzh = zzmv.zzd((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 45:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 46:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 47:
                    zzh = zzmv.zzq((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 48:
                    zzh = zzmv.zzs((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzt = zzmv.zzi(i8, (List) unsafe.getObject(obj, j), zzB(i5));
                    i6 += zzt;
                    break;
                case 50:
                    zzmd.zza(i8, unsafe.getObject(obj, j), zzC(i5));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzT(obj, i8, i5)) {
                        zzx9 = zzki.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzT(obj, i8, i5)) {
                        zzx10 = zzki.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzki.zzy(zzz(obj, j));
                        i2 = zzki.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzki.zzy(zzz(obj, j));
                        i2 = zzki.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzki.zzu(zzp(obj, j));
                        i2 = zzki.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 56:
                    if (zzT(obj, i8, i5)) {
                        zzx9 = zzki.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case 57:
                    if (zzT(obj, i8, i5)) {
                        zzx10 = zzki.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case 58:
                    if (zzT(obj, i8, i5)) {
                        zzt = zzki.zzx(i8 << 3) + 1;
                        i6 += zzt;
                    }
                    break;
                case 59:
                    if (zzT(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzka) {
                            int i16 = zzki.zzb;
                            int zzd3 = ((zzka) object2).zzd();
                            zzx11 = zzki.zzx(zzd3) + zzd3;
                            zzx12 = zzki.zzx(i8 << 3);
                            zzt = zzx12 + zzx11;
                            i6 += zzt;
                        } else {
                            zzh = zzki.zzw((String) object2);
                            i2 = zzki.zzx(i8 << 3);
                            i6 += i2 + zzh;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzT(obj, i8, i5)) {
                        zzt = zzmv.zzn(i8, unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzt;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzT(obj, i8, i5)) {
                        int i17 = zzki.zzb;
                        int zzd4 = ((zzka) unsafe.getObject(obj, j)).zzd();
                        zzx11 = zzki.zzx(zzd4) + zzd4;
                        zzx12 = zzki.zzx(i8 << 3);
                        zzt = zzx12 + zzx11;
                        i6 += zzt;
                    }
                    break;
                case SSL.SSL_PROTOCOL_TLS /* 62 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzki.zzx(zzp(obj, j));
                        i2 = zzki.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 63:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzki.zzu(zzp(obj, j));
                        i2 = zzki.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 64:
                    if (zzT(obj, i8, i5)) {
                        zzx10 = zzki.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case 65:
                    if (zzT(obj, i8, i5)) {
                        zzx9 = zzki.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzT(obj, i8, i5)) {
                        int zzp = zzp(obj, j);
                        i2 = zzki.zzx(i8 << 3);
                        zzh = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzT(obj, i8, i5)) {
                        long zzz = zzz(obj, j);
                        i6 += zzki.zzx(i8 << 3) + zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                    }
                    break;
                case 68:
                    if (zzT(obj, i8, i5)) {
                        zzt = zzki.zzt(i8, (zzmi) unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzt;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int zza2 = i6 + zznkVar.zza(zznkVar.zzd(obj));
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zznu.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzmb zzmbVar = (zzmb) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i5 == 0) {
                    int zzm = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjnVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case SSL.SSL_PROTOCOL_TLS /* 62 */:
                if (i5 == 0) {
                    int zzj = zzjo.zzj(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjnVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzjo.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzjo.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzjnVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzjo.zzj(bArr, i, zzjnVar);
                    int i13 = zzjnVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) == 0 || zznz.zze(bArr, zzj2, zzj2 + i13)) {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzlj.zzb));
                        zzj2 += i13;
                    } else {
                        throw zzll.zzc();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    Object zzE = zzE(obj, i4, i8);
                    int zzo = zzjo.zzo(zzE, zzB(i8), bArr, i, i2, zzjnVar);
                    zzM(obj, i4, i8, zzE);
                    return zzo;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int zza2 = zzjo.zza(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, zzjnVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzjo.zzj(bArr, i, zzjnVar);
                    int i14 = zzjnVar.zza;
                    zzlf zzA = zzA(i8);
                    if (zzA == null || zzA.zza(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzj(i3, Long.valueOf(i14));
                    }
                    return zzj3;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                if (i5 == 0) {
                    int zzj4 = zzjo.zzj(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i5 == 0) {
                    int zzm3 = zzjo.zzm(bArr, i, zzjnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzjo.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzjnVar);
                    zzM(obj, i4, i8, zzE2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0216 -> B:114:0x0217). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0264 -> B:134:0x0265). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x019b -> B:82:0x019c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzjn zzjnVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int zzl;
        int i13 = i;
        Unsafe unsafe = zzb;
        zzli zzliVar = (zzli) unsafe.getObject(obj, j2);
        if (!zzliVar.zzc()) {
            int size = zzliVar.size();
            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzliVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVar;
                    int zzj = zzjo.zzj(bArr, i13, zzjnVar);
                    int i14 = zzjnVar.zza + zzj;
                    while (zzj < i14) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i14) {
                        return zzj;
                    }
                    throw zzll.zzf();
                } else if (i5 == 1) {
                    zzkk zzkkVar2 = (zzkk) zzliVar;
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i)));
                    while (true) {
                        i8 = i13 + 8;
                        if (i8 < i2) {
                            i13 = zzjo.zzj(bArr, i8, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i13)));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzku zzkuVar = (zzku) zzliVar;
                    int zzj2 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i15 = zzjnVar.zza + zzj2;
                    while (zzj2 < i15) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i15) {
                        return zzj2;
                    }
                    throw zzll.zzf();
                } else if (i5 == 5) {
                    zzku zzkuVar2 = (zzku) zzliVar;
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i)));
                    while (true) {
                        i9 = i13 + 4;
                        if (i9 < i2) {
                            i13 = zzjo.zzj(bArr, i9, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i13)));
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVar;
                    int zzj3 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i16 = zzjnVar.zza + zzj3;
                    while (zzj3 < i16) {
                        zzj3 = zzjo.zzm(bArr, zzj3, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (zzj3 == i16) {
                        return zzj3;
                    }
                    throw zzll.zzf();
                } else if (i5 == 0) {
                    zzlx zzlxVar2 = (zzlx) zzliVar;
                    int zzm = zzjo.zzm(bArr, i13, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                    while (zzm < i2) {
                        int zzj4 = zzjo.zzj(bArr, zzm, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzm;
                        }
                        zzm = zzjo.zzm(bArr, zzj4, zzjnVar);
                        zzlxVar2.zzg(zzjnVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzjo.zzf(bArr, i13, zzliVar, zzjnVar);
                }
                if (i5 == 0) {
                    return zzjo.zzl(i3, bArr, i, i2, zzliVar, zzjnVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVar;
                    int zzj5 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i17 = zzjnVar.zza + zzj5;
                    while (zzj5 < i17) {
                        zzlxVar3.zzg(zzjo.zzp(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i17) {
                        return zzj5;
                    }
                    throw zzll.zzf();
                } else if (i5 == 1) {
                    zzlx zzlxVar4 = (zzlx) zzliVar;
                    zzlxVar4.zzg(zzjo.zzp(bArr, i));
                    while (true) {
                        i10 = i13 + 8;
                        if (i10 < i2) {
                            i13 = zzjo.zzj(bArr, i10, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzlxVar4.zzg(zzjo.zzp(bArr, i13));
                            }
                        }
                    }
                    return i10;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVar;
                    int zzj6 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i18 = zzjnVar.zza + zzj6;
                    while (zzj6 < i18) {
                        zzlcVar.zzh(zzjo.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i18) {
                        return zzj6;
                    }
                    throw zzll.zzf();
                } else if (i5 == 5) {
                    zzlc zzlcVar2 = (zzlc) zzliVar;
                    zzlcVar2.zzh(zzjo.zzb(bArr, i));
                    while (true) {
                        i11 = i13 + 4;
                        if (i11 < i2) {
                            i13 = zzjo.zzj(bArr, i11, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzlcVar2.zzh(zzjo.zzb(bArr, i13));
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVar;
                    int zzj7 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i19 = zzjnVar.zza + zzj7;
                    while (zzj7 < i19) {
                        zzj7 = zzjo.zzm(bArr, zzj7, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (zzj7 == i19) {
                        return zzj7;
                    }
                    throw zzll.zzf();
                } else if (i5 == 0) {
                    zzjp zzjpVar2 = (zzjp) zzliVar;
                    int zzm2 = zzjo.zzm(bArr, i13, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzjo.zzj(bArr, zzm2, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzjo.zzm(bArr, zzj8, zzjnVar);
                        zzjpVar2.zze(zzjnVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) != 0) {
                        int zzj9 = zzjo.zzj(bArr, i13, zzjnVar);
                        int i20 = zzjnVar.zza;
                        if (i20 >= 0) {
                            if (i20 == 0) {
                                zzliVar.add("");
                                while (zzj9 < i2) {
                                    int zzj10 = zzjo.zzj(bArr, zzj9, zzjnVar);
                                    if (i3 != zzjnVar.zza) {
                                        return zzj9;
                                    }
                                    zzj9 = zzjo.zzj(bArr, zzj10, zzjnVar);
                                    int i21 = zzjnVar.zza;
                                    if (i21 < 0) {
                                        throw zzll.zzd();
                                    }
                                    if (i21 == 0) {
                                        zzliVar.add("");
                                    } else {
                                        i12 = zzj9 + i21;
                                        if (zznz.zze(bArr, zzj9, i12)) {
                                            zzliVar.add(new String(bArr, zzj9, i21, zzlj.zzb));
                                            zzj9 = i12;
                                            while (zzj9 < i2) {
                                            }
                                        } else {
                                            throw zzll.zzc();
                                        }
                                    }
                                }
                                return zzj9;
                            }
                            i12 = zzj9 + i20;
                            if (!zznz.zze(bArr, zzj9, i12)) {
                                throw zzll.zzc();
                            }
                            zzliVar.add(new String(bArr, zzj9, i20, zzlj.zzb));
                            zzj9 = i12;
                            while (zzj9 < i2) {
                            }
                            return zzj9;
                        }
                        throw zzll.zzd();
                    }
                    int zzj11 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i22 = zzjnVar.zza;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            zzliVar.add("");
                            while (zzj11 < i2) {
                                int zzj12 = zzjo.zzj(bArr, zzj11, zzjnVar);
                                if (i3 != zzjnVar.zza) {
                                    return zzj11;
                                }
                                zzj11 = zzjo.zzj(bArr, zzj12, zzjnVar);
                                i22 = zzjnVar.zza;
                                if (i22 < 0) {
                                    throw zzll.zzd();
                                }
                                if (i22 == 0) {
                                    zzliVar.add("");
                                } else {
                                    zzliVar.add(new String(bArr, zzj11, i22, zzlj.zzb));
                                    zzj11 += i22;
                                    while (zzj11 < i2) {
                                    }
                                }
                            }
                            return zzj11;
                        }
                        zzliVar.add(new String(bArr, zzj11, i22, zzlj.zzb));
                        zzj11 += i22;
                        while (zzj11 < i2) {
                        }
                        return zzj11;
                    }
                    throw zzll.zzd();
                }
                break;
            case 27:
                if (i5 == 2) {
                    return zzjo.zze(zzB(i6), i3, bArr, i, i2, zzliVar, zzjnVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i23 = zzjnVar.zza;
                    if (i23 < 0) {
                        throw zzll.zzd();
                    }
                    if (i23 <= bArr.length - zzj13) {
                        if (i23 == 0) {
                            zzliVar.add(zzka.zzb);
                            while (zzj13 < i2) {
                                int zzj14 = zzjo.zzj(bArr, zzj13, zzjnVar);
                                if (i3 != zzjnVar.zza) {
                                    return zzj13;
                                }
                                zzj13 = zzjo.zzj(bArr, zzj14, zzjnVar);
                                i23 = zzjnVar.zza;
                                if (i23 >= 0) {
                                    if (i23 > bArr.length - zzj13) {
                                        throw zzll.zzf();
                                    }
                                    if (i23 == 0) {
                                        zzliVar.add(zzka.zzb);
                                    } else {
                                        zzliVar.add(zzka.zzl(bArr, zzj13, i23));
                                        zzj13 += i23;
                                        while (zzj13 < i2) {
                                        }
                                    }
                                } else {
                                    throw zzll.zzd();
                                }
                            }
                            return zzj13;
                        }
                        zzliVar.add(zzka.zzl(bArr, zzj13, i23));
                        zzj13 += i23;
                        while (zzj13 < i2) {
                        }
                        return zzj13;
                    }
                    throw zzll.zzf();
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    zzl = zzjo.zzf(bArr, i13, zzliVar, zzjnVar);
                } else if (i5 == 0) {
                    zzl = zzjo.zzl(i3, bArr, i, i2, zzliVar, zzjnVar);
                }
                zzlf zzA = zzA(i6);
                zznk zznkVar = this.zzn;
                int i24 = zzmv.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzliVar instanceof RandomAccess) {
                        int size2 = zzliVar.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            int intValue = ((Integer) zzliVar.get(i26)).intValue();
                            if (zzA.zza(intValue)) {
                                if (i26 != i25) {
                                    zzliVar.set(i25, Integer.valueOf(intValue));
                                }
                                i25++;
                            } else {
                                obj2 = zzmv.zzA(obj, i4, intValue, obj2, zznkVar);
                            }
                        }
                        if (i25 != size2) {
                            zzliVar.subList(i25, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzliVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzmv.zzA(obj, i4, intValue2, obj2, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVar;
                    int zzj15 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i27 = zzjnVar.zza + zzj15;
                    while (zzj15 < i27) {
                        zzj15 = zzjo.zzj(bArr, zzj15, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (zzj15 == i27) {
                        return zzj15;
                    }
                    throw zzll.zzf();
                } else if (i5 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVar;
                    int zzj16 = zzjo.zzj(bArr, i13, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (zzj16 < i2) {
                        int zzj17 = zzjo.zzj(bArr, zzj16, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzjo.zzj(bArr, zzj17, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return zzj16;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVar;
                    int zzj18 = zzjo.zzj(bArr, i13, zzjnVar);
                    int i28 = zzjnVar.zza + zzj18;
                    while (zzj18 < i28) {
                        zzj18 = zzjo.zzm(bArr, zzj18, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (zzj18 == i28) {
                        return zzj18;
                    }
                    throw zzll.zzf();
                } else if (i5 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVar;
                    int zzm3 = zzjo.zzm(bArr, i13, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (zzm3 < i2) {
                        int zzj19 = zzjo.zzj(bArr, zzm3, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzjo.zzm(bArr, zzj19, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i5 == 3) {
                    zzmt zzB = zzB(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = zzjo.zzc(zzB, bArr, i, i2, i29, zzjnVar);
                    zzliVar.add(zzjnVar.zzc);
                    while (zzc < i2) {
                        int zzj20 = zzjo.zzj(bArr, zzc, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzc;
                        }
                        zzc = zzjo.zzc(zzB, bArr, zzj20, i2, i29, zzjnVar);
                        zzliVar.add(zzjnVar.zzc);
                    }
                    return zzc;
                }
                break;
        }
        return i13;
    }

    private final int zzt(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, 0);
    }

    private final int zzu(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, i2);
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i2) {
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

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j) {
        return ((Long) zznu.zzf(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzy2;
        int zzx8;
        int zzx9;
        if (this.zzi) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzy3 = zzy(i2);
                int zzx10 = zzx(zzy3);
                int i3 = this.zzc[i2];
                int i4 = zzy3 & 1048575;
                if (zzx10 >= zzkt.DOUBLE_LIST_PACKED.zza() && zzx10 <= zzkt.SINT64_LIST_PACKED.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzx10) {
                    case 0:
                        if (zzP(obj, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i2)) {
                            zzx4 = zzki.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i2)) {
                            Object zzf = zznu.zzf(obj, j);
                            if (zzf instanceof zzka) {
                                int i6 = i3 << 3;
                                int i7 = zzki.zzb;
                                int zzd = ((zzka) zzf).zzd();
                                zzx5 = zzki.zzx(zzd) + zzd;
                                zzx6 = zzki.zzx(i6);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf);
                                zzx3 = zzki.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i2)) {
                            zzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i2)) {
                            int i8 = i3 << 3;
                            int i9 = zzki.zzb;
                            int zzd2 = ((zzka) zznu.zzf(obj, j)).zzd();
                            zzx5 = zzki.zzx(zzd2) + zzd2;
                            zzx6 = zzki.zzx(i8);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzx(zznu.zzc(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i2)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i2)) {
                            int zzc = zznu.zzc(obj, j);
                            zzx3 = zzki.zzx(i3 << 3);
                            zzy = zzki.zzx((zzc >> 31) ^ (zzc + zzc));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i2)) {
                            long zzd3 = zznu.zzd(obj, j);
                            zzx7 = zzki.zzx(i3 << 3);
                            zzy2 = zzki.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            zzn = zzx7 + zzy2;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i2)) {
                            zzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 19:
                        zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 20:
                        zzn = zzmv.zzl(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 21:
                        zzn = zzmv.zzw(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 22:
                        zzn = zzmv.zzj(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 23:
                        zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 24:
                        zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 25:
                        zzn = zzmv.zza(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 26:
                        zzn = zzmv.zzt(i3, (List) zznu.zzf(obj, j));
                        i += zzn;
                        break;
                    case 27:
                        zzn = zzmv.zzo(i3, (List) zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 28:
                        zzn = zzmv.zzb(i3, (List) zznu.zzf(obj, j));
                        i += zzn;
                        break;
                    case 29:
                        zzn = zzmv.zzu(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 30:
                        zzn = zzmv.zzc(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 31:
                        zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 32:
                        zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 33:
                        zzn = zzmv.zzp(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 34:
                        zzn = zzmv.zzr(i3, (List) zznu.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 35:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i10 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i10);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i11 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i11);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzmv.zzm((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i12 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i12);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzmv.zzx((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i13 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i13);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzmv.zzk((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i14 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i14);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i15 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i15);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i16 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i16);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = zzmv.zza;
                        zzy = ((List) unsafe.getObject(obj, j)).size();
                        if (zzy > 0) {
                            int i18 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i18);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzmv.zzv((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i19 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i19);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzmv.zzd((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i20 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i20);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i21 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i21);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i22 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i22);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzmv.zzq((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i23 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i23);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzmv.zzs((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i24 = i3 << 3;
                            zzx8 = zzki.zzx(zzy);
                            zzx9 = zzki.zzx(i24);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zzn = zzmv.zzi(i3, (List) zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 50:
                        zzmd.zza(i3, zznu.zzf(obj, j), zzC(i2));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzy(zzz(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzy(zzz(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzu(zzp(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i3, i2)) {
                            zzx4 = zzki.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i3, i2)) {
                            Object zzf2 = zznu.zzf(obj, j);
                            if (zzf2 instanceof zzka) {
                                int i25 = i3 << 3;
                                int i26 = zzki.zzb;
                                int zzd4 = ((zzka) zzf2).zzd();
                                zzx5 = zzki.zzx(zzd4) + zzd4;
                                zzx6 = zzki.zzx(i25);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf2);
                                zzx3 = zzki.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (zzT(obj, i3, i2)) {
                            int i27 = i3 << 3;
                            int i28 = zzki.zzb;
                            int zzd5 = ((zzka) zznu.zzf(obj, j)).zzd();
                            zzx5 = zzki.zzx(zzd5) + zzd5;
                            zzx6 = zzki.zzx(i27);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case SSL.SSL_PROTOCOL_TLS /* 62 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzx(zzp(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzki.zzu(zzp(obj, j));
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzki.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzki.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (zzT(obj, i3, i2)) {
                            int zzp = zzp(obj, j);
                            zzx3 = zzki.zzx(i3 << 3);
                            zzy = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (zzT(obj, i3, i2)) {
                            long zzz = zzz(obj, j);
                            zzx7 = zzki.zzx(i3 << 3);
                            zzy2 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                            zzn = zzx7 + zzy2;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            return i + zznkVar.zza(zznkVar.zzd(obj));
        }
        return zzo(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzy = zzy(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzy;
            int i5 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j));
                    byte[] bArr = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr2 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr3 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr4 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr5 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr6 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j);
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
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr8 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr9 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr10 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzlj.zza(zzU(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SSL.SSL_PROTOCOL_TLS /* 62 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr11 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr12 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzn.zzd(obj).hashCode();
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x030e, code lost:
        if (r0 != r22) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0310, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r8 = r19;
        r5 = r20;
        r3 = r21;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x032c, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0360, code lost:
        if (r0 != r15) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0388, code lost:
        if (r0 != r15) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0403, code lost:
        if (r6 == 1048575) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0405, code lost:
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x040b, code lost:
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040f, code lost:
        if (r2 >= r8.zzl) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0411, code lost:
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0423, code lost:
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042a, code lost:
        if (r8.zzA(r4) != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x042f, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0437, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0438, code lost:
        if (r9 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x043c, code lost:
        if (r0 != r32) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0443, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0446, code lost:
        if (r0 > r32) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0448, code lost:
        if (r3 != r9) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x044a, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x044f, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzjn zzjnVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzml<T> zzmlVar;
        byte b;
        int zzt;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj3;
        int i12;
        zzjn zzjnVar2;
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
        zzml<T> zzmlVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i25 = i2;
        int i26 = i3;
        zzjn zzjnVar3 = zzjnVar;
        zzG(obj);
        Unsafe unsafe2 = zzb;
        int i27 = -1;
        int i28 = i;
        int i29 = -1;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 1048575;
        while (true) {
            if (i28 < i25) {
                int i34 = i28 + 1;
                byte b2 = bArr2[i28];
                if (b2 < 0) {
                    int zzk = zzjo.zzk(b2, bArr2, i34, zzjnVar3);
                    b = zzjnVar3.zza;
                    i34 = zzk;
                } else {
                    b = b2;
                }
                int i35 = b >>> 3;
                if (i35 > i29) {
                    zzt = zzmlVar2.zzu(i35, i30 / 3);
                } else {
                    zzt = zzmlVar2.zzt(i35);
                }
                int i36 = zzt;
                if (i36 == i27) {
                    i5 = i35;
                    i6 = i34;
                    i7 = b;
                    i8 = i32;
                    i9 = i27;
                    unsafe = unsafe2;
                    i10 = i26;
                    i11 = 0;
                } else {
                    int i37 = b & 7;
                    int[] iArr = zzmlVar2.zzc;
                    int i38 = iArr[i36 + 1];
                    int zzx = zzx(i38);
                    int i39 = i34;
                    int i40 = b;
                    long j = i38 & 1048575;
                    if (zzx <= 17) {
                        int i41 = iArr[i36 + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i33) {
                            if (i33 != 1048575) {
                                unsafe2.putInt(obj4, i33, i32);
                            }
                            i14 = i43;
                            i13 = unsafe2.getInt(obj4, i43);
                        } else {
                            i13 = i32;
                            i14 = i33;
                        }
                        switch (zzx) {
                            case 0:
                                i15 = i36;
                                i16 = i35;
                                i17 = i39;
                                if (i37 != 1) {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    zznu.zzo(obj4, j, Double.longBitsToDouble(zzjo.zzp(bArr2, i17)));
                                    i28 = i17 + 8;
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 1:
                                i15 = i36;
                                i16 = i35;
                                i17 = i39;
                                if (i37 != 5) {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    zznu.zzp(obj4, j, Float.intBitsToFloat(zzjo.zzb(bArr2, i17)));
                                    i28 = i17 + 4;
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i15 = i36;
                                i16 = i35;
                                i17 = i39;
                                if (i37 != 0) {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    int zzm = zzjo.zzm(bArr2, i17, zzjnVar3);
                                    unsafe2.putLong(obj, j, zzjnVar3.zzb);
                                    i32 = i13 | i42;
                                    i30 = i15;
                                    i29 = i16;
                                    i28 = zzm;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i25 = i2;
                                    i26 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i15 = i36;
                                i16 = i35;
                                i17 = i39;
                                if (i37 != 0) {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    i28 = zzjo.zzj(bArr2, i17, zzjnVar3);
                                    unsafe2.putInt(obj4, j, zzjnVar3.zza);
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i15 = i36;
                                i16 = i35;
                                i18 = i39;
                                if (i37 != 1) {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    i17 = i18;
                                    unsafe2.putLong(obj, j, zzjo.zzp(bArr2, i18));
                                    i28 = i17 + 8;
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = i36;
                                i16 = i35;
                                i18 = i39;
                                if (i37 != 5) {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, zzjo.zzb(bArr2, i18));
                                    i28 = i18 + 4;
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 7:
                                i15 = i36;
                                i16 = i35;
                                i18 = i39;
                                if (i37 != 0) {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    i28 = zzjo.zzm(bArr2, i18, zzjnVar3);
                                    zznu.zzm(obj4, j, zzjnVar3.zzb != 0);
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 8:
                                i15 = i36;
                                i16 = i35;
                                i18 = i39;
                                if (i37 != 2) {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    if ((i38 & 536870912) == 0) {
                                        i28 = zzjo.zzg(bArr2, i18, zzjnVar3);
                                    } else {
                                        i28 = zzjo.zzh(bArr2, i18, zzjnVar3);
                                    }
                                    unsafe2.putObject(obj4, j, zzjnVar3.zzc);
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 9:
                                i15 = i36;
                                i16 = i35;
                                i18 = i39;
                                if (i37 != 2) {
                                    i40 = i40;
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    Object zzD = zzmlVar2.zzD(obj4, i15);
                                    i40 = i40;
                                    i28 = zzjo.zzo(zzD, zzmlVar2.zzB(i15), bArr, i18, i2, zzjnVar);
                                    zzmlVar2.zzL(obj4, i15, zzD);
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i30 = i15;
                                    i29 = i16;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    i26 = i3;
                                    break;
                                }
                            case 10:
                                i19 = i36;
                                i16 = i35;
                                i20 = i40;
                                i21 = i39;
                                if (i37 != 2) {
                                    i22 = i19;
                                    i40 = i20;
                                    i17 = i21;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    i28 = zzjo.zza(bArr2, i21, zzjnVar3);
                                    unsafe2.putObject(obj4, j, zzjnVar3.zzc);
                                    i32 = i13 | i42;
                                    i30 = i19;
                                    i29 = i16;
                                    i31 = i20;
                                    i33 = i14;
                                    i27 = -1;
                                    i25 = i2;
                                    i26 = i3;
                                    break;
                                }
                            case 12:
                                i19 = i36;
                                i16 = i35;
                                i20 = i40;
                                i21 = i39;
                                if (i37 != 0) {
                                    i22 = i19;
                                    i40 = i20;
                                    i17 = i21;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    i28 = zzjo.zzj(bArr2, i21, zzjnVar3);
                                    int i44 = zzjnVar3.zza;
                                    zzlf zzA = zzmlVar2.zzA(i19);
                                    if (zzA == null || zzA.zza(i44)) {
                                        unsafe2.putInt(obj4, j, i44);
                                        i32 = i13 | i42;
                                        i30 = i19;
                                        i29 = i16;
                                        i31 = i20;
                                        i33 = i14;
                                        i27 = -1;
                                        i25 = i2;
                                        i26 = i3;
                                        break;
                                    } else {
                                        zzd(obj).zzj(i20, Long.valueOf(i44));
                                        i30 = i19;
                                        i32 = i13;
                                        i29 = i16;
                                        i31 = i20;
                                        i33 = i14;
                                        i27 = -1;
                                        i25 = i2;
                                        i26 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i19 = i36;
                                i16 = i35;
                                i20 = i40;
                                i21 = i39;
                                if (i37 != 0) {
                                    i22 = i19;
                                    i40 = i20;
                                    i17 = i21;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    i28 = zzjo.zzj(bArr2, i21, zzjnVar3);
                                    unsafe2.putInt(obj4, j, zzke.zzb(zzjnVar3.zza));
                                    i32 = i13 | i42;
                                    i30 = i19;
                                    i29 = i16;
                                    i31 = i20;
                                    i33 = i14;
                                    i27 = -1;
                                    i25 = i2;
                                    i26 = i3;
                                    break;
                                }
                            case 16:
                                if (i37 != 0) {
                                    i16 = i35;
                                    i22 = i36;
                                    i17 = i39;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    int zzm2 = zzjo.zzm(bArr2, i39, zzjnVar3);
                                    unsafe2.putLong(obj, j, zzke.zzc(zzjnVar3.zzb));
                                    i32 = i13 | i42;
                                    i30 = i36;
                                    i29 = i35;
                                    i31 = i40;
                                    i28 = zzm2;
                                    i33 = i14;
                                    i27 = -1;
                                    i25 = i2;
                                    i26 = i3;
                                    break;
                                }
                            default:
                                i15 = i36;
                                i16 = i35;
                                i17 = i39;
                                if (i37 != 3) {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i40;
                                    i33 = i14;
                                    i9 = -1;
                                    break;
                                } else {
                                    Object zzD2 = zzmlVar2.zzD(obj4, i15);
                                    i28 = zzjo.zzn(zzD2, zzmlVar2.zzB(i15), bArr, i17, i2, (i16 << 3) | 4, zzjnVar);
                                    zzmlVar2.zzL(obj4, i15, zzD2);
                                    i32 = i13 | i42;
                                    i25 = i2;
                                    i29 = i16;
                                    i30 = i15;
                                    i31 = i40;
                                    i33 = i14;
                                    i27 = -1;
                                    bArr2 = bArr;
                                    i26 = i3;
                                    break;
                                }
                        }
                    } else {
                        if (zzx != 27) {
                            i8 = i32;
                            i23 = i33;
                            if (zzx <= 49) {
                                i5 = i35;
                                i9 = -1;
                                unsafe = unsafe2;
                                i11 = i36;
                                i28 = zzs(obj, bArr, i39, i2, i40, i35, i37, i36, i38, zzx, j, zzjnVar);
                            } else {
                                i5 = i35;
                                unsafe = unsafe2;
                                i11 = i36;
                                i24 = i39;
                                i9 = -1;
                                if (zzx != 50) {
                                    i28 = zzr(obj, bArr, i24, i2, i40, i5, i37, i38, zzx, j, i11, zzjnVar);
                                } else if (i37 == 2) {
                                    i28 = zzq(obj, bArr, i24, i2, i11, j, zzjnVar);
                                }
                            }
                        } else if (i37 == 2) {
                            zzli zzliVar = (zzli) unsafe2.getObject(obj4, j);
                            if (!zzliVar.zzc()) {
                                int size = zzliVar.size();
                                zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzliVar);
                            }
                            i28 = zzjo.zze(zzmlVar2.zzB(i36), i40, bArr, i39, i2, zzliVar, zzjnVar);
                            i25 = i2;
                            i26 = i3;
                            i29 = i35;
                            i30 = i36;
                            i32 = i32;
                            i31 = i40;
                            i33 = i33;
                            i27 = -1;
                            bArr2 = bArr;
                        } else {
                            i8 = i32;
                            i23 = i33;
                            i5 = i35;
                            unsafe = unsafe2;
                            i11 = i36;
                            i24 = i39;
                            i9 = -1;
                        }
                        i10 = i3;
                        i6 = i24;
                        i7 = i40;
                        i33 = i23;
                    }
                }
                if (i7 != i10 || i10 == 0) {
                    int i45 = i10;
                    if (this.zzh) {
                        zzjnVar2 = zzjnVar;
                        zzkn zzknVar = zzjnVar2.zzd;
                        if (zzknVar != zzkn.zza) {
                            i12 = i5;
                            if (zzknVar.zzb(this.zzg, i12) == null) {
                                i28 = zzjo.zzi(i7, bArr, i6, i2, zzd(obj), zzjnVar);
                                obj3 = obj;
                                i25 = i2;
                                i31 = i7;
                                zzmlVar2 = this;
                                i29 = i12;
                                obj4 = obj3;
                                i27 = i9;
                                i32 = i8;
                                i30 = i11;
                                bArr2 = bArr;
                                i26 = i45;
                                zzjnVar3 = zzjnVar2;
                                unsafe2 = unsafe;
                            } else {
                                zzky zzkyVar = (zzky) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i12 = i5;
                        }
                    } else {
                        obj3 = obj;
                        i12 = i5;
                        zzjnVar2 = zzjnVar;
                    }
                    i28 = zzjo.zzi(i7, bArr, i6, i2, zzd(obj), zzjnVar);
                    i25 = i2;
                    i31 = i7;
                    zzmlVar2 = this;
                    i29 = i12;
                    obj4 = obj3;
                    i27 = i9;
                    i32 = i8;
                    i30 = i11;
                    bArr2 = bArr;
                    i26 = i45;
                    zzjnVar3 = zzjnVar2;
                    unsafe2 = unsafe;
                } else {
                    zzmlVar = this;
                    obj2 = obj;
                    i4 = i10;
                    i28 = i6;
                    i31 = i7;
                    i32 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i26;
                obj2 = obj4;
                zzmlVar = zzmlVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(Integer.MAX_VALUE);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzy = zzy(i);
                int i2 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j = i2;
                if (zzx != 9) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, this.zzc[i], i)) {
                            zzB(i).zzf(zzb.getObject(obj, j));
                        }
                    } else {
                        switch (zzx) {
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
                                this.zzm.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (zzP(obj, i)) {
                    zzB(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzy = zzy(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zznu.zzo(obj, j, zznu.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zznu.zzp(obj, j, zznu.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zznu.zzm(obj, j, zznu.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzmv.zza;
                    zznu.zzs(obj, j, zzmd.zzb(zznu.zzf(obj, j), zznu.zzf(obj2, j)));
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
                    if (zzT(obj2, i2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzI(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case SSL.SSL_PROTOCOL_TLS /* 62 */:
                case 63:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzT(obj2, i2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e8, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ea, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0329, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034c, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzjn zzjnVar) throws IOException {
        byte b;
        int i3;
        int zzt;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        Unsafe unsafe3;
        zzml<T> zzmlVar;
        int i9;
        Unsafe unsafe4;
        int i10;
        int i11;
        int i12;
        zzml<T> zzmlVar2 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzjn zzjnVar2 = zzjnVar;
        if (!zzmlVar2.zzi) {
            zzc(obj, bArr, i, i2, 0, zzjnVar);
            return;
        }
        zzG(obj);
        Unsafe unsafe5 = zzb;
        int i14 = -1;
        int i15 = 1048575;
        int i16 = i;
        int i17 = 1048575;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        while (i16 < i13) {
            int i21 = i16 + 1;
            byte b2 = bArr2[i16];
            if (b2 < 0) {
                i3 = zzjo.zzk(b2, bArr2, i21, zzjnVar2);
                b = zzjnVar2.zza;
            } else {
                b = b2;
                i3 = i21;
            }
            int i22 = b >>> 3;
            if (i22 > i18) {
                zzt = zzmlVar2.zzu(i22, i19 / 3);
            } else {
                zzt = zzmlVar2.zzt(i22);
            }
            int i23 = zzt;
            if (i23 == i14) {
                i4 = i3;
                i5 = i22;
                unsafe = unsafe5;
                i6 = i14;
                i7 = 0;
            } else {
                int i24 = b & 7;
                int[] iArr = zzmlVar2.zzc;
                int i25 = iArr[i23 + 1];
                int zzx = zzx(i25);
                Unsafe unsafe6 = unsafe5;
                long j = i25 & i15;
                if (zzx <= 17) {
                    int i26 = iArr[i23 + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    if (i28 != i17) {
                        if (i17 != 1048575) {
                            long j2 = i17;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j2, i20);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i28 != 1048575) {
                            i20 = unsafe4.getInt(obj2, i28);
                        }
                        unsafe2 = unsafe4;
                        i17 = i28;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (zzx) {
                        case 0:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zznu.zzo(obj2, j, Double.longBitsToDouble(zzjo.zzp(bArr2, i3)));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 1:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zznu.zzp(obj2, j, Float.intBitsToFloat(zzjo.zzb(bArr2, i3)));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 2:
                        case 3:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                int zzm = zzjo.zzm(bArr2, i3, zzjnVar2);
                                unsafe3.putLong(obj, j, zzjnVar2.zzb);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i16 = zzm;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i16 = zzjo.zzj(bArr2, i3, zzjnVar2);
                                unsafe3.putInt(obj2, j, zzjnVar2.zza);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 5:
                        case 14:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe3.putLong(obj, j, zzjo.zzp(bArr2, i3));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j, zzjo.zzb(bArr2, i3));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 7:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i16 = zzjo.zzm(bArr2, i3, zzjnVar2);
                                zznu.zzm(obj2, j, zzjnVar2.zzb != 0);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 8:
                            zzmlVar = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                if ((i25 & 536870912) == 0) {
                                    i16 = zzjo.zzg(bArr2, i3, zzjnVar2);
                                } else {
                                    i16 = zzjo.zzh(bArr2, i3, zzjnVar2);
                                }
                                unsafe3.putObject(obj2, j, zzjnVar2.zzc);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 9:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzmlVar = this;
                                i9 = 1048575;
                                Object zzD = zzmlVar.zzD(obj2, i7);
                                i16 = zzjo.zzo(zzD, zzmlVar.zzB(i7), bArr, i3, i2, zzjnVar);
                                zzmlVar.zzL(obj2, i7, zzD);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                zzmlVar2 = zzmlVar;
                                i13 = i2;
                                break;
                            }
                        case 10:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i16 = zzjo.zza(bArr2, i3, zzjnVar2);
                                unsafe3.putObject(obj2, j, zzjnVar2.zzc);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                zzmlVar2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                        case 12:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i16 = zzjo.zzj(bArr2, i3, zzjnVar2);
                                unsafe3.putInt(obj2, j, zzjnVar2.zza);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                zzmlVar2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                        case 15:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i16 = zzjo.zzj(bArr2, i3, zzjnVar2);
                                unsafe3.putInt(obj2, j, zzke.zzb(zzjnVar2.zza));
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                zzmlVar2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                        case 16:
                            if (i24 != 0) {
                                i5 = i22;
                                i7 = i23;
                                i8 = i17;
                                unsafe3 = unsafe2;
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                int zzm2 = zzjo.zzm(bArr2, i3, zzjnVar2);
                                unsafe2.putLong(obj, j, zzke.zzc(zzjnVar2.zzb));
                                i20 |= i27;
                                unsafe5 = unsafe2;
                                i16 = zzm2;
                                i19 = i23;
                                i17 = i17;
                                i18 = i22;
                                i15 = 1048575;
                                i14 = -1;
                                zzmlVar2 = this;
                                i13 = i2;
                                break;
                            }
                        default:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i22;
                    int i29 = i17;
                    zzml<T> zzmlVar3 = zzmlVar2;
                    i7 = i23;
                    if (zzx != 27) {
                        if (zzx <= 49) {
                            int i30 = i3;
                            i11 = i20;
                            i12 = i29;
                            unsafe = unsafe6;
                            i6 = -1;
                            i16 = zzs(obj, bArr, i3, i2, b, i5, i24, i7, i25, zzx, j, zzjnVar);
                        } else {
                            i10 = i3;
                            i11 = i20;
                            unsafe = unsafe6;
                            i12 = i29;
                            i6 = -1;
                            if (zzx != 50) {
                                i16 = zzr(obj, bArr, i10, i2, b, i5, i24, i25, zzx, j, i7, zzjnVar);
                            } else if (i24 == 2) {
                                i16 = zzq(obj, bArr, i10, i2, i7, j, zzjnVar);
                            }
                        }
                        zzmlVar2 = this;
                    } else if (i24 == 2) {
                        zzli zzliVar = (zzli) unsafe6.getObject(obj2, j);
                        if (!zzliVar.zzc()) {
                            int size = zzliVar.size();
                            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, zzliVar);
                        }
                        i16 = zzjo.zze(zzmlVar3.zzB(i7), b, bArr, i3, i2, zzliVar, zzjnVar);
                        i13 = i2;
                        unsafe5 = unsafe6;
                        i20 = i20;
                        i19 = i7;
                        i15 = 1048575;
                        i17 = i29;
                        i18 = i5;
                        zzmlVar2 = zzmlVar3;
                        i14 = -1;
                    } else {
                        i10 = i3;
                        i11 = i20;
                        unsafe = unsafe6;
                        i12 = i29;
                        i6 = -1;
                    }
                    i4 = i10;
                    i20 = i11;
                    i17 = i12;
                }
                unsafe5 = unsafe;
                i15 = 1048575;
                zzmlVar2 = this;
            }
            i16 = zzjo.zzi(b, bArr, i4, i2, zzd(obj), zzjnVar);
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            zzjnVar2 = zzjnVar;
            i19 = i7;
            i14 = i6;
            i18 = i5;
            unsafe5 = unsafe;
            i15 = 1048575;
            zzmlVar2 = this;
        }
        int i31 = i20;
        Unsafe unsafe7 = unsafe5;
        if (i17 != i15) {
            unsafe7.putInt(obj, i17, i31);
        }
        if (i16 != i2) {
            throw zzll.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zznu.zza(obj, j)) == Double.doubleToLongBits(zznu.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zznu.zzb(obj, j)) == Float.floatToIntBits(zznu.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zznu.zzw(obj, j) == zznu.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
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
                    zzV = zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j));
                    break;
                case 50:
                    zzV = zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j));
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
                    long zzv = zzv(i) & 1048575;
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzV(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzV) {
                return false;
            }
        }
        if (this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int i6 = this.zzj[i4];
            int i7 = this.zzc[i6];
            int zzy = zzy(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i7, i6) && !zzR(obj, zzy, zzB(i6))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                            zzmb zzmbVar = (zzmb) zzC(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzB.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzQ(obj, i6, i, i2, i10) && !zzR(obj, zzy, zzB(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1048575;
        if (!this.zzi) {
            if (!this.zzh) {
                int length = this.zzc.length;
                Unsafe unsafe = zzb;
                int i6 = 0;
                int i7 = 0;
                int i8 = 1048575;
                while (i6 < length) {
                    int zzy = zzy(i6);
                    int[] iArr = this.zzc;
                    int i9 = iArr[i6];
                    int zzx = zzx(zzy);
                    if (zzx <= 17) {
                        int i10 = iArr[i6 + 2];
                        int i11 = i10 & i5;
                        if (i11 != i8) {
                            i7 = unsafe.getInt(obj, i11);
                            i8 = i11;
                        }
                        i = 1 << (i10 >>> 20);
                    } else {
                        i = i4;
                    }
                    long j = zzy & i5;
                    switch (zzx) {
                        case 0:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzf(i9, zznu.zza(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzo(i9, zznu.zzb(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzt(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzJ(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzr(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzm(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzk(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzb(i9, zznu.zzw(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzV(i9, unsafe.getObject(obj, j), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzv(i9, unsafe.getObject(obj, j), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzd(i9, (zzka) unsafe.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzH(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzi(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzw(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzy(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzA(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzC(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzocVar.zzq(i9, unsafe.getObject(obj, j), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i2 = 0;
                            zzmv.zzF(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 19:
                            i2 = 0;
                            zzmv.zzJ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 20:
                            i2 = 0;
                            zzmv.zzM(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 21:
                            i2 = 0;
                            zzmv.zzU(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 22:
                            i2 = 0;
                            zzmv.zzL(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 23:
                            i2 = 0;
                            zzmv.zzI(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 24:
                            i2 = 0;
                            zzmv.zzH(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 25:
                            i2 = 0;
                            zzmv.zzD(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            break;
                        case 26:
                            zzmv.zzS(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar);
                            i2 = 0;
                            break;
                        case 27:
                            zzmv.zzN(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, zzB(i6));
                            i2 = 0;
                            break;
                        case 28:
                            zzmv.zzE(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar);
                            i2 = 0;
                            break;
                        case 29:
                            i3 = 0;
                            zzmv.zzT(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            i2 = i3;
                            break;
                        case 30:
                            i3 = 0;
                            zzmv.zzG(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            i2 = i3;
                            break;
                        case 31:
                            i3 = 0;
                            zzmv.zzO(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            i2 = i3;
                            break;
                        case 32:
                            i3 = 0;
                            zzmv.zzP(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            i2 = i3;
                            break;
                        case 33:
                            i3 = 0;
                            zzmv.zzQ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            i2 = i3;
                            break;
                        case 34:
                            i3 = 0;
                            zzmv.zzR(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, false);
                            i2 = i3;
                            break;
                        case 35:
                            zzmv.zzF(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 36:
                            zzmv.zzJ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 37:
                            zzmv.zzM(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 38:
                            zzmv.zzU(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 39:
                            zzmv.zzL(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 40:
                            zzmv.zzI(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 41:
                            zzmv.zzH(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 42:
                            zzmv.zzD(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 43:
                            zzmv.zzT(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 44:
                            zzmv.zzG(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 45:
                            zzmv.zzO(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 46:
                            zzmv.zzP(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 47:
                            zzmv.zzQ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case 48:
                            zzmv.zzR(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, true);
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzmv.zzK(this.zzc[i6], (List) unsafe.getObject(obj, j), zzocVar, zzB(i6));
                            i2 = 0;
                            break;
                        case 50:
                            zzN(zzocVar, i9, unsafe.getObject(obj, j), i6);
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzf(i9, zzm(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzo(i9, zzn(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzt(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzJ(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzr(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 56:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzm(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 57:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzk(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 58:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzb(i9, zzU(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 59:
                            if (zzT(obj, i9, i6)) {
                                zzV(i9, unsafe.getObject(obj, j), zzocVar);
                            }
                            i2 = 0;
                            break;
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzv(i9, unsafe.getObject(obj, j), zzB(i6));
                            }
                            i2 = 0;
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzd(i9, (zzka) unsafe.getObject(obj, j));
                            }
                            i2 = 0;
                            break;
                        case SSL.SSL_PROTOCOL_TLS /* 62 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzH(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 63:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzi(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 64:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzw(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 65:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzy(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzA(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzC(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 68:
                            if (zzT(obj, i9, i6)) {
                                zzocVar.zzq(i9, unsafe.getObject(obj, j), zzB(i6));
                            }
                            i2 = 0;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    i6 += 3;
                    i4 = i2;
                    i5 = 1048575;
                }
                zznk zznkVar = this.zzn;
                zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
            } else {
                this.zzo.zza(obj);
                throw null;
            }
        } else {
            if (!this.zzh) {
                int length2 = this.zzc.length;
                for (int i12 = 0; i12 < length2; i12 += 3) {
                    int zzy2 = zzy(i12);
                    int i13 = this.zzc[i12];
                    switch (zzx(zzy2)) {
                        case 0:
                            if (zzP(obj, i12)) {
                                zzocVar.zzf(i13, zznu.zza(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i12)) {
                                zzocVar.zzo(i13, zznu.zzb(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i12)) {
                                zzocVar.zzt(i13, zznu.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i12)) {
                                zzocVar.zzJ(i13, zznu.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i12)) {
                                zzocVar.zzr(i13, zznu.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i12)) {
                                zzocVar.zzm(i13, zznu.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i12)) {
                                zzocVar.zzk(i13, zznu.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i12)) {
                                zzocVar.zzb(i13, zznu.zzw(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i12)) {
                                zzV(i13, zznu.zzf(obj, zzy2 & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i12)) {
                                zzocVar.zzv(i13, zznu.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i12)) {
                                zzocVar.zzd(i13, (zzka) zznu.zzf(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i12)) {
                                zzocVar.zzH(i13, zznu.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i12)) {
                                zzocVar.zzi(i13, zznu.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i12)) {
                                zzocVar.zzw(i13, zznu.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i12)) {
                                zzocVar.zzy(i13, zznu.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i12)) {
                                zzocVar.zzA(i13, zznu.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i12)) {
                                zzocVar.zzC(i13, zznu.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i12)) {
                                zzocVar.zzq(i13, zznu.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzmv.zzF(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 19:
                            zzmv.zzJ(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 20:
                            zzmv.zzM(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 21:
                            zzmv.zzU(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 22:
                            zzmv.zzL(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 23:
                            zzmv.zzI(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 24:
                            zzmv.zzH(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 25:
                            zzmv.zzD(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 26:
                            zzmv.zzS(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar);
                            break;
                        case 27:
                            zzmv.zzN(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, zzB(i12));
                            break;
                        case 28:
                            zzmv.zzE(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar);
                            break;
                        case 29:
                            zzmv.zzT(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 30:
                            zzmv.zzG(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 31:
                            zzmv.zzO(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 32:
                            zzmv.zzP(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 33:
                            zzmv.zzQ(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 34:
                            zzmv.zzR(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, false);
                            break;
                        case 35:
                            zzmv.zzF(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 36:
                            zzmv.zzJ(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 37:
                            zzmv.zzM(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 38:
                            zzmv.zzU(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 39:
                            zzmv.zzL(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 40:
                            zzmv.zzI(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 41:
                            zzmv.zzH(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 42:
                            zzmv.zzD(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 43:
                            zzmv.zzT(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 44:
                            zzmv.zzG(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 45:
                            zzmv.zzO(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 46:
                            zzmv.zzP(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 47:
                            zzmv.zzQ(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case 48:
                            zzmv.zzR(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzmv.zzK(i13, (List) zznu.zzf(obj, zzy2 & 1048575), zzocVar, zzB(i12));
                            break;
                        case 50:
                            zzN(zzocVar, i13, zznu.zzf(obj, zzy2 & 1048575), i12);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzf(i13, zzm(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzo(i13, zzn(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzt(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzJ(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzr(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzm(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzk(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzb(i13, zzU(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i13, i12)) {
                                zzV(i13, zznu.zzf(obj, zzy2 & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzv(i13, zznu.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzd(i13, (zzka) zznu.zzf(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case SSL.SSL_PROTOCOL_TLS /* 62 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzH(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzi(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzw(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzy(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzA(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzC(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i13, i12)) {
                                zzocVar.zzq(i13, zznu.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zznk zznkVar2 = this.zzn;
                zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
                return;
            }
            this.zzo.zza(obj);
            throw null;
        }
    }
}
