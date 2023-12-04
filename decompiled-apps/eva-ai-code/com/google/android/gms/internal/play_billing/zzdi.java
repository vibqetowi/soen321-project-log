package com.google.android.gms.internal.play_billing;

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
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public final class zzdi<T> implements zzdp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzeq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdf zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzct zzl;
    private final zzeg zzm;
    private final zzbo zzn;
    private final int zzo;
    private final zzdk zzp;
    private final zzda zzq;

    private zzdi(int[] iArr, Object[] objArr, int i, int i2, zzdf zzdfVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzo = i3;
        boolean z2 = false;
        if (zzboVar != null && zzboVar.zzc(zzdfVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzp = zzdkVar;
        this.zzl = zzctVar;
        this.zzm = zzegVar;
        this.zzn = zzboVar;
        this.zzg = zzdfVar;
        this.zzq = zzdaVar;
    }

    private final zzce zzA(int i) {
        int i2 = i / 3;
        return (zzce) this.zzd[i2 + i2 + 1];
    }

    private final zzdp zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzdp zzdpVar = (zzdp) this.zzd[i3];
        if (zzdpVar != null) {
            return zzdpVar;
        }
        zzdp zzb2 = zzdn.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzdp zzB = zzB(i);
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
        zzdp zzB = zzB(i2);
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
            zzdp zzB = zzB(i);
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
            zzdp zzB = zzB(i);
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
        zzeq.zzq(obj, j, (1 << (zzv >>> 20)) | zzeq.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzeq.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzey zzeyVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzcy zzcyVar = (zzcy) zzC(i2);
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j = zzv & 1048575;
        if (j != 1048575) {
            return (zzeq.zzc(obj, j) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i);
        long j2 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zzeq.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzeq.zzb(obj, j2)) != 0;
            case 2:
                return zzeq.zzd(obj, j2) != 0;
            case 3:
                return zzeq.zzd(obj, j2) != 0;
            case 4:
                return zzeq.zzc(obj, j2) != 0;
            case 5:
                return zzeq.zzd(obj, j2) != 0;
            case 6:
                return zzeq.zzc(obj, j2) != 0;
            case 7:
                return zzeq.zzw(obj, j2);
            case 8:
                Object zzf = zzeq.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzba) {
                    return !zzba.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzeq.zzf(obj, j2) != null;
            case 10:
                return !zzba.zzb.equals(zzeq.zzf(obj, j2));
            case 11:
                return zzeq.zzc(obj, j2) != 0;
            case 12:
                return zzeq.zzc(obj, j2) != 0;
            case 13:
                return zzeq.zzc(obj, j2) != 0;
            case 14:
                return zzeq.zzd(obj, j2) != 0;
            case 15:
                return zzeq.zzc(obj, j2) != 0;
            case 16:
                return zzeq.zzd(obj, j2) != 0;
            case 17:
                return zzeq.zzf(obj, j2) != null;
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

    private static boolean zzR(Object obj, int i, zzdp zzdpVar) {
        return zzdpVar.zzk(zzeq.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcb) {
            return ((zzcb) obj).zzt();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zzeq.zzc(obj, (long) (zzv(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzeq.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzey zzeyVar) throws IOException {
        if (obj instanceof String) {
            zzeyVar.zzF(i, (String) obj);
        } else {
            zzeyVar.zzd(i, (zzba) obj);
        }
    }

    static zzeh zzd(Object obj) {
        zzcb zzcbVar = (zzcb) obj;
        zzeh zzehVar = zzcbVar.zzc;
        if (zzehVar == zzeh.zzc()) {
            zzeh zzf = zzeh.zzf();
            zzcbVar.zzc = zzf;
            return zzf;
        }
        return zzehVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdi zzl(Class cls, zzdc zzdcVar, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzF;
        char charAt11;
        int i25;
        int i26;
        Object obj;
        Field zzF2;
        Object obj2;
        Field zzF3;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        int i30;
        char charAt15;
        if (zzdcVar instanceof zzdo) {
            zzdo zzdoVar = (zzdo) zzdcVar;
            String zzd = zzdoVar.zzd();
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
            int charAt16 = zzd.charAt(i);
            if (charAt16 >= 55296) {
                int i33 = charAt16 & 8191;
                int i34 = 13;
                while (true) {
                    i30 = i32 + 1;
                    charAt15 = zzd.charAt(i32);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i33 |= (charAt15 & 8191) << i34;
                    i34 += 13;
                    i32 = i30;
                }
                charAt16 = i33 | (charAt15 << i34);
                i32 = i30;
            }
            if (charAt16 == 0) {
                charAt = 0;
                charAt2 = 0;
                i3 = 0;
                i6 = 0;
                i2 = 0;
                i4 = 0;
                iArr = zza;
                i5 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt17 = zzd.charAt(i32);
                if (charAt17 >= 55296) {
                    int i36 = charAt17 & 8191;
                    int i37 = 13;
                    while (true) {
                        i14 = i35 + 1;
                        charAt10 = zzd.charAt(i35);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i36 |= (charAt10 & 8191) << i37;
                        i37 += 13;
                        i35 = i14;
                    }
                    charAt17 = i36 | (charAt10 << i37);
                    i35 = i14;
                }
                int i38 = i35 + 1;
                int charAt18 = zzd.charAt(i35);
                if (charAt18 >= 55296) {
                    int i39 = charAt18 & 8191;
                    int i40 = 13;
                    while (true) {
                        i13 = i38 + 1;
                        charAt9 = zzd.charAt(i38);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i39 |= (charAt9 & 8191) << i40;
                        i40 += 13;
                        i38 = i13;
                    }
                    charAt18 = i39 | (charAt9 << i40);
                    i38 = i13;
                }
                int i41 = i38 + 1;
                int charAt19 = zzd.charAt(i38);
                if (charAt19 >= 55296) {
                    int i42 = charAt19 & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        charAt8 = zzd.charAt(i41);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i42 |= (charAt8 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    charAt19 = i42 | (charAt8 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                int charAt20 = zzd.charAt(i41);
                if (charAt20 >= 55296) {
                    int i45 = charAt20 & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        charAt7 = zzd.charAt(i44);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i45 |= (charAt7 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    charAt20 = i45 | (charAt7 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                charAt = zzd.charAt(i44);
                if (charAt >= 55296) {
                    int i48 = charAt & 8191;
                    int i49 = 13;
                    while (true) {
                        i10 = i47 + 1;
                        charAt6 = zzd.charAt(i47);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i48 |= (charAt6 & 8191) << i49;
                        i49 += 13;
                        i47 = i10;
                    }
                    charAt = i48 | (charAt6 << i49);
                    i47 = i10;
                }
                int i50 = i47 + 1;
                charAt2 = zzd.charAt(i47);
                if (charAt2 >= 55296) {
                    int i51 = charAt2 & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        charAt5 = zzd.charAt(i50);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i51 |= (charAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    charAt2 = i51 | (charAt5 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int charAt21 = zzd.charAt(i50);
                if (charAt21 >= 55296) {
                    int i54 = charAt21 & 8191;
                    int i55 = 13;
                    while (true) {
                        i8 = i53 + 1;
                        charAt4 = zzd.charAt(i53);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i54 |= (charAt4 & 8191) << i55;
                        i55 += 13;
                        i53 = i8;
                    }
                    charAt21 = i54 | (charAt4 << i55);
                    i53 = i8;
                }
                int i56 = i53 + 1;
                int charAt22 = zzd.charAt(i53);
                if (charAt22 >= 55296) {
                    int i57 = charAt22 & 8191;
                    int i58 = 13;
                    while (true) {
                        i7 = i56 + 1;
                        charAt3 = zzd.charAt(i56);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i57 |= (charAt3 & 8191) << i58;
                        i58 += 13;
                        i56 = i7;
                    }
                    charAt22 = i57 | (charAt3 << i58);
                    i56 = i7;
                }
                i2 = charAt17 + charAt17 + charAt18;
                iArr = new int[charAt22 + charAt2 + charAt21];
                i3 = charAt19;
                i4 = charAt22;
                i5 = charAt17;
                i6 = charAt20;
                i32 = i56;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzdoVar.zze();
            Class<?> cls2 = zzdoVar.zza().getClass();
            int i59 = i4 + charAt2;
            int i60 = charAt + charAt;
            int[] iArr2 = new int[charAt * 3];
            Object[] objArr = new Object[i60];
            int i61 = 0;
            int i62 = 0;
            int i63 = i4;
            int i64 = i59;
            while (i32 < length) {
                int i65 = i32 + 1;
                int charAt23 = zzd.charAt(i32);
                if (charAt23 >= c) {
                    int i66 = charAt23 & 8191;
                    int i67 = i65;
                    int i68 = 13;
                    while (true) {
                        i29 = i67 + 1;
                        charAt14 = zzd.charAt(i67);
                        if (charAt14 < c) {
                            break;
                        }
                        i66 |= (charAt14 & 8191) << i68;
                        i68 += 13;
                        i67 = i29;
                    }
                    charAt23 = i66 | (charAt14 << i68);
                    i15 = i29;
                } else {
                    i15 = i65;
                }
                int i69 = i15 + 1;
                int charAt24 = zzd.charAt(i15);
                if (charAt24 >= c) {
                    int i70 = charAt24 & 8191;
                    int i71 = i69;
                    int i72 = 13;
                    while (true) {
                        i28 = i71 + 1;
                        charAt13 = zzd.charAt(i71);
                        if (charAt13 < c) {
                            break;
                        }
                        i70 |= (charAt13 & 8191) << i72;
                        i72 += 13;
                        i71 = i28;
                    }
                    charAt24 = i70 | (charAt13 << i72);
                    i16 = i28;
                } else {
                    i16 = i69;
                }
                if ((charAt24 & 1024) != 0) {
                    iArr[i61] = i62;
                    i61++;
                }
                int i73 = charAt24 & 255;
                if (i73 >= 51) {
                    int i74 = i16 + 1;
                    int charAt25 = zzd.charAt(i16);
                    i17 = length;
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i75 = charAt25 & 8191;
                        int i76 = 13;
                        while (true) {
                            i27 = i74 + 1;
                            charAt12 = zzd.charAt(i74);
                            if (charAt12 < c2) {
                                break;
                            }
                            i75 |= (charAt12 & 8191) << i76;
                            i76 += 13;
                            i74 = i27;
                            c2 = 55296;
                        }
                        charAt25 = i75 | (charAt12 << i76);
                        i74 = i27;
                    }
                    int i77 = i73 - 51;
                    int i78 = i74;
                    if (i77 == 9 || i77 == 17) {
                        int i79 = i62 / 3;
                        i26 = i2 + 1;
                        objArr[i79 + i79 + 1] = zze[i2];
                    } else {
                        if (i77 == 12 && (zzdoVar.zzc() == 1 || (charAt24 & 2048) != 0)) {
                            int i80 = i62 / 3;
                            i26 = i2 + 1;
                            objArr[i80 + i80 + 1] = zze[i2];
                        }
                        int i81 = charAt25 + charAt25;
                        obj = zze[i81];
                        if (!(obj instanceof Field)) {
                            zzF2 = (Field) obj;
                        } else {
                            zzF2 = zzF(cls2, (String) obj);
                            zze[i81] = zzF2;
                        }
                        int i82 = i3;
                        i18 = i6;
                        i24 = (int) unsafe.objectFieldOffset(zzF2);
                        int i83 = i81 + 1;
                        obj2 = zze[i83];
                        if (!(obj2 instanceof Field)) {
                            zzF3 = (Field) obj2;
                        } else {
                            zzF3 = zzF(cls2, (String) obj2);
                            zze[i83] = zzF3;
                        }
                        i19 = i82;
                        i20 = (int) unsafe.objectFieldOffset(zzF3);
                        i22 = i78;
                        i23 = 0;
                        str = zzd;
                    }
                    i2 = i26;
                    int i812 = charAt25 + charAt25;
                    obj = zze[i812];
                    if (!(obj instanceof Field)) {
                    }
                    int i822 = i3;
                    i18 = i6;
                    i24 = (int) unsafe.objectFieldOffset(zzF2);
                    int i832 = i812 + 1;
                    obj2 = zze[i832];
                    if (!(obj2 instanceof Field)) {
                    }
                    i19 = i822;
                    i20 = (int) unsafe.objectFieldOffset(zzF3);
                    i22 = i78;
                    i23 = 0;
                    str = zzd;
                } else {
                    i17 = length;
                    int i84 = i3;
                    i18 = i6;
                    int i85 = i2 + 1;
                    Field zzF4 = zzF(cls2, (String) zze[i2]);
                    if (i73 == 9 || i73 == 17) {
                        i19 = i84;
                        int i86 = i62 / 3;
                        objArr[i86 + i86 + 1] = zzF4.getType();
                    } else {
                        if (i73 == 27 || i73 == 49) {
                            i19 = i84;
                            int i87 = i62 / 3;
                            i25 = i85 + 1;
                            objArr[i87 + i87 + 1] = zze[i85];
                        } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                            i19 = i84;
                            if (zzdoVar.zzc() == 1 || (charAt24 & 2048) != 0) {
                                int i88 = i62 / 3;
                                i25 = i85 + 1;
                                objArr[i88 + i88 + 1] = zze[i85];
                            }
                        } else {
                            if (i73 == 50) {
                                int i89 = i63 + 1;
                                iArr[i63] = i62;
                                int i90 = i62 / 3;
                                int i91 = i85 + 1;
                                int i92 = i90 + i90;
                                objArr[i92] = zze[i85];
                                if ((charAt24 & 2048) != 0) {
                                    i85 = i91 + 1;
                                    objArr[i92 + 1] = zze[i91];
                                    i19 = i84;
                                    i63 = i89;
                                } else {
                                    i63 = i89;
                                    i85 = i91;
                                }
                            }
                            i19 = i84;
                        }
                        i85 = i25;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) == 0 || i73 > 17) {
                        str = zzd;
                        i21 = i85;
                        i22 = i16;
                        i23 = 0;
                    } else {
                        int i93 = i16 + 1;
                        int charAt26 = zzd.charAt(i16);
                        if (charAt26 >= 55296) {
                            int i94 = charAt26 & 8191;
                            int i95 = 13;
                            while (true) {
                                i22 = i93 + 1;
                                charAt11 = zzd.charAt(i93);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i94 |= (charAt11 & 8191) << i95;
                                i95 += 13;
                                i93 = i22;
                            }
                            charAt26 = i94 | (charAt11 << i95);
                        } else {
                            i22 = i93;
                        }
                        int i96 = i5 + i5 + (charAt26 / 32);
                        Object obj3 = zze[i96];
                        str = zzd;
                        if (obj3 instanceof Field) {
                            zzF = (Field) obj3;
                        } else {
                            zzF = zzF(cls2, (String) obj3);
                            zze[i96] = zzF;
                        }
                        i21 = i85;
                        i23 = charAt26 % 32;
                        i20 = (int) unsafe.objectFieldOffset(zzF);
                    }
                    if (i73 >= 18 && i73 <= 49) {
                        iArr[i64] = objectFieldOffset;
                        i64++;
                    }
                    i24 = objectFieldOffset;
                    i2 = i21;
                }
                int i97 = i62 + 1;
                iArr2[i62] = charAt23;
                int i98 = i97 + 1;
                iArr2[i97] = i24 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 << 20);
                i62 = i98 + 1;
                iArr2[i98] = (i23 << 20) | i20;
                i32 = i22;
                length = i17;
                i3 = i19;
                zzd = str;
                i6 = i18;
                c = 55296;
            }
            return new zzdi(iArr2, objArr, i3, i6, zzdoVar.zza(), zzdoVar.zzc(), false, iArr, i4, i59, zzdkVar, zzctVar, zzegVar, zzboVar, zzdaVar);
        }
        zzed zzedVar = (zzed) zzdcVar;
        throw null;
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzeq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzeq.zzf(obj, j)).floatValue();
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
                        zzx = zzbi.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzbi.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzbi.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzbi.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzbi.zzx(i8 << 3) + 1;
                        i6 += zzx4;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzba) {
                            int i12 = zzbi.zzb;
                            int zzd = ((zzba) object).zzd();
                            zzx5 = zzbi.zzx(zzd) + zzd;
                            zzx6 = zzbi.zzx(i8 << 3);
                            zzx4 = zzx6 + zzx5;
                            i6 += zzx4;
                            break;
                        } else {
                            zzy = zzbi.zzw((String) object);
                            zzx3 = zzbi.zzx(i8 << 3);
                            i6 += zzx3 + zzy;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzdr.zzn(i8, unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzx4;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i13 = zzbi.zzb;
                        int zzd2 = ((zzba) unsafe.getObject(obj, j)).zzd();
                        zzx5 = zzbi.zzx(zzd2) + zzd2;
                        zzx6 = zzbi.zzx(i8 << 3);
                        zzx4 = zzx6 + zzx5;
                        i6 += zzx4;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzx(unsafe.getInt(obj, j));
                        zzx3 = zzbi.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzbi.zzx(i8 << 3);
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i8 << 3);
                        zzx4 = zzx2 + 4;
                        i6 += zzx4;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i8 << 3);
                        zzx4 = zzx + 8;
                        i6 += zzx4;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzx3 = zzbi.zzx(i8 << 3);
                        zzy = zzbi.zzx((i14 >> 31) ^ (i14 + i14));
                        i6 += zzx3 + zzy;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i6 += zzbi.zzx(i8 << 3) + zzbi.zzy((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzbi.zzt(i8, (zzdf) unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzx4;
                        break;
                    }
                case 18:
                    zzx4 = zzdr.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 19:
                    zzx4 = zzdr.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 20:
                    zzx4 = zzdr.zzl(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 21:
                    zzx4 = zzdr.zzw(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 22:
                    zzx4 = zzdr.zzj(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 23:
                    zzx4 = zzdr.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 24:
                    zzx4 = zzdr.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 25:
                    zzx4 = zzdr.zza(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzx4;
                    break;
                case 26:
                    zzt = zzdr.zzt(i8, (List) unsafe.getObject(obj, j));
                    i6 += zzt;
                    break;
                case 27:
                    zzt = zzdr.zzo(i8, (List) unsafe.getObject(obj, j), zzB(i5));
                    i6 += zzt;
                    break;
                case 28:
                    zzt = zzdr.zzb(i8, (List) unsafe.getObject(obj, j));
                    i6 += zzt;
                    break;
                case 29:
                    zzt = zzdr.zzu(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzt;
                    break;
                case 30:
                    z = false;
                    zzc = zzdr.zzc(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 31:
                    z = false;
                    zzc = zzdr.zze(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 32:
                    z = false;
                    zzc = zzdr.zzg(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 33:
                    z = false;
                    zzc = zzdr.zzp(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 34:
                    z = false;
                    zzc = zzdr.zzr(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += zzc;
                    break;
                case 35:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 36:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 37:
                    zzh = zzdr.zzm((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 38:
                    zzh = zzdr.zzx((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 39:
                    zzh = zzdr.zzk((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 40:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 41:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 42:
                    int i15 = zzdr.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 43:
                    zzh = zzdr.zzv((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 44:
                    zzh = zzdr.zzd((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 45:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 46:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 47:
                    zzh = zzdr.zzq((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case 48:
                    zzh = zzdr.zzs((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        zzx7 = zzbi.zzx(zzh);
                        zzx8 = zzbi.zzx(i8 << 3);
                        i2 = zzx8 + zzx7;
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzt = zzdr.zzi(i8, (List) unsafe.getObject(obj, j), zzB(i5));
                    i6 += zzt;
                    break;
                case 50:
                    zzda.zza(i8, unsafe.getObject(obj, j), zzC(i5));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzT(obj, i8, i5)) {
                        zzx9 = zzbi.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzT(obj, i8, i5)) {
                        zzx10 = zzbi.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzbi.zzy(zzz(obj, j));
                        i2 = zzbi.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzbi.zzy(zzz(obj, j));
                        i2 = zzbi.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzbi.zzu(zzp(obj, j));
                        i2 = zzbi.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 56:
                    if (zzT(obj, i8, i5)) {
                        zzx9 = zzbi.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case 57:
                    if (zzT(obj, i8, i5)) {
                        zzx10 = zzbi.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case 58:
                    if (zzT(obj, i8, i5)) {
                        zzt = zzbi.zzx(i8 << 3) + 1;
                        i6 += zzt;
                    }
                    break;
                case 59:
                    if (zzT(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzba) {
                            int i16 = zzbi.zzb;
                            int zzd3 = ((zzba) object2).zzd();
                            zzx11 = zzbi.zzx(zzd3) + zzd3;
                            zzx12 = zzbi.zzx(i8 << 3);
                            zzt = zzx12 + zzx11;
                            i6 += zzt;
                        } else {
                            zzh = zzbi.zzw((String) object2);
                            i2 = zzbi.zzx(i8 << 3);
                            i6 += i2 + zzh;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzT(obj, i8, i5)) {
                        zzt = zzdr.zzn(i8, unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzt;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzT(obj, i8, i5)) {
                        int i17 = zzbi.zzb;
                        int zzd4 = ((zzba) unsafe.getObject(obj, j)).zzd();
                        zzx11 = zzbi.zzx(zzd4) + zzd4;
                        zzx12 = zzbi.zzx(i8 << 3);
                        zzt = zzx12 + zzx11;
                        i6 += zzt;
                    }
                    break;
                case SSL.SSL_PROTOCOL_TLS /* 62 */:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzbi.zzx(zzp(obj, j));
                        i2 = zzbi.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 63:
                    if (zzT(obj, i8, i5)) {
                        zzh = zzbi.zzu(zzp(obj, j));
                        i2 = zzbi.zzx(i8 << 3);
                        i6 += i2 + zzh;
                    }
                    break;
                case 64:
                    if (zzT(obj, i8, i5)) {
                        zzx10 = zzbi.zzx(i8 << 3);
                        zzt = zzx10 + 4;
                        i6 += zzt;
                    }
                    break;
                case 65:
                    if (zzT(obj, i8, i5)) {
                        zzx9 = zzbi.zzx(i8 << 3);
                        zzt = zzx9 + 8;
                        i6 += zzt;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzT(obj, i8, i5)) {
                        int zzp = zzp(obj, j);
                        i2 = zzbi.zzx(i8 << 3);
                        zzh = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                        i6 += i2 + zzh;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzT(obj, i8, i5)) {
                        long zzz = zzz(obj, j);
                        i6 += zzbi.zzx(i8 << 3) + zzbi.zzy((zzz >> 63) ^ (zzz + zzz));
                    }
                    break;
                case 68:
                    if (zzT(obj, i8, i5)) {
                        zzt = zzbi.zzt(i8, (zzdf) unsafe.getObject(obj, j), zzB(i5));
                        i6 += zzt;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        zzeg zzegVar = this.zzm;
        int zza2 = i6 + zzegVar.zza(zzegVar.zzd(obj));
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        return zza2;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzeq.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzcz) object).zze()) {
            zzcz zzb2 = zzcz.zza().zzb();
            zzda.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzcy zzcyVar = (zzcy) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzao.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzao.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i5 == 0) {
                    int zzm = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzanVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case SSL.SSL_PROTOCOL_TLS /* 62 */:
                if (i5 == 0) {
                    int zzj = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzanVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzao.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzao.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzanVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzao.zzj(bArr, i, zzanVar);
                    int i13 = zzanVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) == 0 || zzev.zze(bArr, zzj2, zzj2 + i13)) {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzcg.zzb));
                        zzj2 += i13;
                    } else {
                        throw zzci.zzc();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    Object zzE = zzE(obj, i4, i8);
                    int zzo = zzao.zzo(zzE, zzB(i8), bArr, i, i2, zzanVar);
                    zzM(obj, i4, i8, zzE);
                    return zzo;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int zza2 = zzao.zza(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, zzanVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzao.zzj(bArr, i, zzanVar);
                    int i14 = zzanVar.zza;
                    zzce zzA = zzA(i8);
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
                    int zzj4 = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzbe.zzb(zzanVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i5 == 0) {
                    int zzm3 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzbe.zzc(zzanVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzao.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzanVar);
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
    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzan zzanVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int zzl;
        int i13 = i;
        Unsafe unsafe = zzb;
        zzcf zzcfVar = (zzcf) unsafe.getObject(obj, j2);
        if (!zzcfVar.zzc()) {
            int size = zzcfVar.size();
            zzcfVar = zzcfVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzcfVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzbk zzbkVar = (zzbk) zzcfVar;
                    int zzj = zzao.zzj(bArr, i13, zzanVar);
                    int i14 = zzanVar.zza + zzj;
                    while (zzj < i14) {
                        zzbkVar.zze(Double.longBitsToDouble(zzao.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i14) {
                        return zzj;
                    }
                    throw zzci.zzg();
                } else if (i5 == 1) {
                    zzbk zzbkVar2 = (zzbk) zzcfVar;
                    zzbkVar2.zze(Double.longBitsToDouble(zzao.zzp(bArr, i)));
                    while (true) {
                        i8 = i13 + 8;
                        if (i8 < i2) {
                            i13 = zzao.zzj(bArr, i8, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzbkVar2.zze(Double.longBitsToDouble(zzao.zzp(bArr, i13)));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzbu zzbuVar = (zzbu) zzcfVar;
                    int zzj2 = zzao.zzj(bArr, i13, zzanVar);
                    int i15 = zzanVar.zza + zzj2;
                    while (zzj2 < i15) {
                        zzbuVar.zze(Float.intBitsToFloat(zzao.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i15) {
                        return zzj2;
                    }
                    throw zzci.zzg();
                } else if (i5 == 5) {
                    zzbu zzbuVar2 = (zzbu) zzcfVar;
                    zzbuVar2.zze(Float.intBitsToFloat(zzao.zzb(bArr, i)));
                    while (true) {
                        i9 = i13 + 4;
                        if (i9 < i2) {
                            i13 = zzao.zzj(bArr, i9, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzbuVar2.zze(Float.intBitsToFloat(zzao.zzb(bArr, i13)));
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
                    zzcu zzcuVar = (zzcu) zzcfVar;
                    int zzj3 = zzao.zzj(bArr, i13, zzanVar);
                    int i16 = zzanVar.zza + zzj3;
                    while (zzj3 < i16) {
                        zzj3 = zzao.zzm(bArr, zzj3, zzanVar);
                        zzcuVar.zzf(zzanVar.zzb);
                    }
                    if (zzj3 == i16) {
                        return zzj3;
                    }
                    throw zzci.zzg();
                } else if (i5 == 0) {
                    zzcu zzcuVar2 = (zzcu) zzcfVar;
                    int zzm = zzao.zzm(bArr, i13, zzanVar);
                    zzcuVar2.zzf(zzanVar.zzb);
                    while (zzm < i2) {
                        int zzj4 = zzao.zzj(bArr, zzm, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzm;
                        }
                        zzm = zzao.zzm(bArr, zzj4, zzanVar);
                        zzcuVar2.zzf(zzanVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzao.zzf(bArr, i13, zzcfVar, zzanVar);
                }
                if (i5 == 0) {
                    return zzao.zzl(i3, bArr, i, i2, zzcfVar, zzanVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzcu zzcuVar3 = (zzcu) zzcfVar;
                    int zzj5 = zzao.zzj(bArr, i13, zzanVar);
                    int i17 = zzanVar.zza + zzj5;
                    while (zzj5 < i17) {
                        zzcuVar3.zzf(zzao.zzp(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i17) {
                        return zzj5;
                    }
                    throw zzci.zzg();
                } else if (i5 == 1) {
                    zzcu zzcuVar4 = (zzcu) zzcfVar;
                    zzcuVar4.zzf(zzao.zzp(bArr, i));
                    while (true) {
                        i10 = i13 + 8;
                        if (i10 < i2) {
                            i13 = zzao.zzj(bArr, i10, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzcuVar4.zzf(zzao.zzp(bArr, i13));
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
                    zzcc zzccVar = (zzcc) zzcfVar;
                    int zzj6 = zzao.zzj(bArr, i13, zzanVar);
                    int i18 = zzanVar.zza + zzj6;
                    while (zzj6 < i18) {
                        zzccVar.zzf(zzao.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i18) {
                        return zzj6;
                    }
                    throw zzci.zzg();
                } else if (i5 == 5) {
                    zzcc zzccVar2 = (zzcc) zzcfVar;
                    zzccVar2.zzf(zzao.zzb(bArr, i));
                    while (true) {
                        i11 = i13 + 4;
                        if (i11 < i2) {
                            i13 = zzao.zzj(bArr, i11, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzccVar2.zzf(zzao.zzb(bArr, i13));
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzap zzapVar = (zzap) zzcfVar;
                    int zzj7 = zzao.zzj(bArr, i13, zzanVar);
                    int i19 = zzanVar.zza + zzj7;
                    while (zzj7 < i19) {
                        zzj7 = zzao.zzm(bArr, zzj7, zzanVar);
                        zzapVar.zze(zzanVar.zzb != 0);
                    }
                    if (zzj7 == i19) {
                        return zzj7;
                    }
                    throw zzci.zzg();
                } else if (i5 == 0) {
                    zzap zzapVar2 = (zzap) zzcfVar;
                    int zzm2 = zzao.zzm(bArr, i13, zzanVar);
                    zzapVar2.zze(zzanVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzao.zzj(bArr, zzm2, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzao.zzm(bArr, zzj8, zzanVar);
                        zzapVar2.zze(zzanVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) != 0) {
                        int zzj9 = zzao.zzj(bArr, i13, zzanVar);
                        int i20 = zzanVar.zza;
                        if (i20 >= 0) {
                            if (i20 == 0) {
                                zzcfVar.add("");
                                while (zzj9 < i2) {
                                    int zzj10 = zzao.zzj(bArr, zzj9, zzanVar);
                                    if (i3 != zzanVar.zza) {
                                        return zzj9;
                                    }
                                    zzj9 = zzao.zzj(bArr, zzj10, zzanVar);
                                    int i21 = zzanVar.zza;
                                    if (i21 < 0) {
                                        throw zzci.zzd();
                                    }
                                    if (i21 == 0) {
                                        zzcfVar.add("");
                                    } else {
                                        i12 = zzj9 + i21;
                                        if (zzev.zze(bArr, zzj9, i12)) {
                                            zzcfVar.add(new String(bArr, zzj9, i21, zzcg.zzb));
                                            zzj9 = i12;
                                            while (zzj9 < i2) {
                                            }
                                        } else {
                                            throw zzci.zzc();
                                        }
                                    }
                                }
                                return zzj9;
                            }
                            i12 = zzj9 + i20;
                            if (!zzev.zze(bArr, zzj9, i12)) {
                                throw zzci.zzc();
                            }
                            zzcfVar.add(new String(bArr, zzj9, i20, zzcg.zzb));
                            zzj9 = i12;
                            while (zzj9 < i2) {
                            }
                            return zzj9;
                        }
                        throw zzci.zzd();
                    }
                    int zzj11 = zzao.zzj(bArr, i13, zzanVar);
                    int i22 = zzanVar.zza;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            zzcfVar.add("");
                            while (zzj11 < i2) {
                                int zzj12 = zzao.zzj(bArr, zzj11, zzanVar);
                                if (i3 != zzanVar.zza) {
                                    return zzj11;
                                }
                                zzj11 = zzao.zzj(bArr, zzj12, zzanVar);
                                i22 = zzanVar.zza;
                                if (i22 < 0) {
                                    throw zzci.zzd();
                                }
                                if (i22 == 0) {
                                    zzcfVar.add("");
                                } else {
                                    zzcfVar.add(new String(bArr, zzj11, i22, zzcg.zzb));
                                    zzj11 += i22;
                                    while (zzj11 < i2) {
                                    }
                                }
                            }
                            return zzj11;
                        }
                        zzcfVar.add(new String(bArr, zzj11, i22, zzcg.zzb));
                        zzj11 += i22;
                        while (zzj11 < i2) {
                        }
                        return zzj11;
                    }
                    throw zzci.zzd();
                }
                break;
            case 27:
                if (i5 == 2) {
                    return zzao.zze(zzB(i6), i3, bArr, i, i2, zzcfVar, zzanVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzao.zzj(bArr, i13, zzanVar);
                    int i23 = zzanVar.zza;
                    if (i23 < 0) {
                        throw zzci.zzd();
                    }
                    if (i23 <= bArr.length - zzj13) {
                        if (i23 == 0) {
                            zzcfVar.add(zzba.zzb);
                            while (zzj13 < i2) {
                                int zzj14 = zzao.zzj(bArr, zzj13, zzanVar);
                                if (i3 != zzanVar.zza) {
                                    return zzj13;
                                }
                                zzj13 = zzao.zzj(bArr, zzj14, zzanVar);
                                i23 = zzanVar.zza;
                                if (i23 >= 0) {
                                    if (i23 > bArr.length - zzj13) {
                                        throw zzci.zzg();
                                    }
                                    if (i23 == 0) {
                                        zzcfVar.add(zzba.zzb);
                                    } else {
                                        zzcfVar.add(zzba.zzl(bArr, zzj13, i23));
                                        zzj13 += i23;
                                        while (zzj13 < i2) {
                                        }
                                    }
                                } else {
                                    throw zzci.zzd();
                                }
                            }
                            return zzj13;
                        }
                        zzcfVar.add(zzba.zzl(bArr, zzj13, i23));
                        zzj13 += i23;
                        while (zzj13 < i2) {
                        }
                        return zzj13;
                    }
                    throw zzci.zzg();
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    zzl = zzao.zzf(bArr, i13, zzcfVar, zzanVar);
                } else if (i5 == 0) {
                    zzl = zzao.zzl(i3, bArr, i, i2, zzcfVar, zzanVar);
                }
                zzce zzA = zzA(i6);
                zzeg zzegVar = this.zzm;
                int i24 = zzdr.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzcfVar instanceof RandomAccess) {
                        int size2 = zzcfVar.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            int intValue = ((Integer) zzcfVar.get(i26)).intValue();
                            if (zzA.zza(intValue)) {
                                if (i26 != i25) {
                                    zzcfVar.set(i25, Integer.valueOf(intValue));
                                }
                                i25++;
                            } else {
                                obj2 = zzdr.zzA(obj, i4, intValue, obj2, zzegVar);
                            }
                        }
                        if (i25 != size2) {
                            zzcfVar.subList(i25, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzcfVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzdr.zzA(obj, i4, intValue2, obj2, zzegVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzcc zzccVar3 = (zzcc) zzcfVar;
                    int zzj15 = zzao.zzj(bArr, i13, zzanVar);
                    int i27 = zzanVar.zza + zzj15;
                    while (zzj15 < i27) {
                        zzj15 = zzao.zzj(bArr, zzj15, zzanVar);
                        zzccVar3.zzf(zzbe.zzb(zzanVar.zza));
                    }
                    if (zzj15 == i27) {
                        return zzj15;
                    }
                    throw zzci.zzg();
                } else if (i5 == 0) {
                    zzcc zzccVar4 = (zzcc) zzcfVar;
                    int zzj16 = zzao.zzj(bArr, i13, zzanVar);
                    zzccVar4.zzf(zzbe.zzb(zzanVar.zza));
                    while (zzj16 < i2) {
                        int zzj17 = zzao.zzj(bArr, zzj16, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzao.zzj(bArr, zzj17, zzanVar);
                        zzccVar4.zzf(zzbe.zzb(zzanVar.zza));
                    }
                    return zzj16;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzcu zzcuVar5 = (zzcu) zzcfVar;
                    int zzj18 = zzao.zzj(bArr, i13, zzanVar);
                    int i28 = zzanVar.zza + zzj18;
                    while (zzj18 < i28) {
                        zzj18 = zzao.zzm(bArr, zzj18, zzanVar);
                        zzcuVar5.zzf(zzbe.zzc(zzanVar.zzb));
                    }
                    if (zzj18 == i28) {
                        return zzj18;
                    }
                    throw zzci.zzg();
                } else if (i5 == 0) {
                    zzcu zzcuVar6 = (zzcu) zzcfVar;
                    int zzm3 = zzao.zzm(bArr, i13, zzanVar);
                    zzcuVar6.zzf(zzbe.zzc(zzanVar.zzb));
                    while (zzm3 < i2) {
                        int zzj19 = zzao.zzj(bArr, zzm3, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzao.zzm(bArr, zzj19, zzanVar);
                        zzcuVar6.zzf(zzbe.zzc(zzanVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i5 == 3) {
                    zzdp zzB = zzB(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = zzao.zzc(zzB, bArr, i, i2, i29, zzanVar);
                    zzcfVar.add(zzanVar.zzc);
                    while (zzc < i2) {
                        int zzj20 = zzao.zzj(bArr, zzc, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzc;
                        }
                        zzc = zzao.zzc(zzB, bArr, zzj20, i2, i29, zzanVar);
                        zzcfVar.add(zzanVar.zzc);
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
        return ((Long) zzeq.zzf(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
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
        zzew zzewVar = zzew.DOUBLE;
        if (this.zzo - 1 != 0) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzy3 = zzy(i2);
                int zzx10 = zzx(zzy3);
                int i3 = this.zzc[i2];
                int i4 = zzy3 & 1048575;
                if (zzx10 >= zzbt.DOUBLE_LIST_PACKED.zza() && zzx10 <= zzbt.SINT64_LIST_PACKED.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzx10) {
                    case 0:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i2)) {
                            zzx4 = zzbi.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i2)) {
                            Object zzf = zzeq.zzf(obj, j);
                            if (zzf instanceof zzba) {
                                int i6 = i3 << 3;
                                int i7 = zzbi.zzb;
                                int zzd = ((zzba) zzf).zzd();
                                zzx5 = zzbi.zzx(zzd) + zzd;
                                zzx6 = zzbi.zzx(i6);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf);
                                zzx3 = zzbi.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i2)) {
                            zzn = zzdr.zzn(i3, zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i2)) {
                            int i8 = i3 << 3;
                            int i9 = zzbi.zzb;
                            int zzd2 = ((zzba) zzeq.zzf(obj, j)).zzd();
                            zzx5 = zzbi.zzx(zzd2) + zzd2;
                            zzx6 = zzbi.zzx(i8);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzx(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i2)) {
                            int zzc = zzeq.zzc(obj, j);
                            zzx3 = zzbi.zzx(i3 << 3);
                            zzy = zzbi.zzx((zzc >> 31) ^ (zzc + zzc));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i2)) {
                            long zzd3 = zzeq.zzd(obj, j);
                            zzx7 = zzbi.zzx(i3 << 3);
                            zzy2 = zzbi.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            zzn = zzx7 + zzy2;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i2)) {
                            zzn = zzbi.zzt(i3, (zzdf) zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 19:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 20:
                        zzn = zzdr.zzl(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 21:
                        zzn = zzdr.zzw(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 22:
                        zzn = zzdr.zzj(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 23:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 24:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 25:
                        zzn = zzdr.zza(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 26:
                        zzn = zzdr.zzt(i3, (List) zzeq.zzf(obj, j));
                        i += zzn;
                        break;
                    case 27:
                        zzn = zzdr.zzo(i3, (List) zzeq.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 28:
                        zzn = zzdr.zzb(i3, (List) zzeq.zzf(obj, j));
                        i += zzn;
                        break;
                    case 29:
                        zzn = zzdr.zzu(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 30:
                        zzn = zzdr.zzc(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 31:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 32:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 33:
                        zzn = zzdr.zzp(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 34:
                        zzn = zzdr.zzr(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 35:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i10 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i10);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i11 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i11);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzdr.zzm((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i12 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i12);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzdr.zzx((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i13 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i13);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzdr.zzk((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i14 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i14);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i15 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i15);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i16 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i16);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = zzdr.zza;
                        zzy = ((List) unsafe.getObject(obj, j)).size();
                        if (zzy > 0) {
                            int i18 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i18);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzdr.zzv((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i19 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i19);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzdr.zzd((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i20 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i20);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i21 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i21);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i22 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i22);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzdr.zzq((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i23 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i23);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzdr.zzs((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i24 = i3 << 3;
                            zzx8 = zzbi.zzx(zzy);
                            zzx9 = zzbi.zzx(i24);
                            zzx3 = zzx9 + zzx8;
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zzn = zzdr.zzi(i3, (List) zzeq.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 50:
                        zzda.zza(i3, zzeq.zzf(obj, j), zzC(i2));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzy(zzz(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzy(zzz(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzu(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i3, i2)) {
                            zzx4 = zzbi.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i3, i2)) {
                            Object zzf2 = zzeq.zzf(obj, j);
                            if (zzf2 instanceof zzba) {
                                int i25 = i3 << 3;
                                int i26 = zzbi.zzb;
                                int zzd4 = ((zzba) zzf2).zzd();
                                zzx5 = zzbi.zzx(zzd4) + zzd4;
                                zzx6 = zzbi.zzx(i25);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf2);
                                zzx3 = zzbi.zzx(i3 << 3);
                                i += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzdr.zzn(i3, zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (zzT(obj, i3, i2)) {
                            int i27 = i3 << 3;
                            int i28 = zzbi.zzb;
                            int zzd5 = ((zzba) zzeq.zzf(obj, j)).zzd();
                            zzx5 = zzbi.zzx(zzd5) + zzd5;
                            zzx6 = zzbi.zzx(i27);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case SSL.SSL_PROTOCOL_TLS /* 62 */:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzx(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzu(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (zzT(obj, i3, i2)) {
                            int zzp = zzp(obj, j);
                            zzx3 = zzbi.zzx(i3 << 3);
                            zzy = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                            i += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (zzT(obj, i3, i2)) {
                            long zzz = zzz(obj, j);
                            zzx7 = zzbi.zzx(i3 << 3);
                            zzy2 = zzbi.zzy((zzz + zzz) ^ (zzz >> 63));
                            zzn = zzx7 + zzy2;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzbi.zzt(i3, (zzdf) zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzeg zzegVar = this.zzm;
            return i + zzegVar.zza(zzegVar.zzd(obj));
        }
        return zzo(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
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
                    doubleToLongBits = Double.doubleToLongBits(zzeq.zza(obj, j));
                    byte[] bArr = zzcg.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(zzeq.zzb(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr2 = zzcg.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr3 = zzcg.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr4 = zzcg.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = zzcg.zza(zzeq.zzw(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) zzeq.zzf(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zzeq.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr5 = zzcg.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr6 = zzcg.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object zzf2 = zzeq.zzf(obj, j);
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
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzcg.zzd;
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
                        byte[] bArr8 = zzcg.zzd;
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
                        byte[] bArr9 = zzcg.zzd;
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
                        byte[] bArr10 = zzcg.zzd;
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
                        floatToIntBits = zzcg.zza(zzU(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) zzeq.zzf(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
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
                        byte[] bArr11 = zzcg.zzd;
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
                        byte[] bArr12 = zzcg.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzm.zzd(obj).hashCode();
        if (this.zzh) {
            this.zzn.zza(obj);
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
        r2 = r8.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040f, code lost:
        if (r2 >= r8.zzk) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0411, code lost:
        r4 = r8.zzi[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r8.zzy(r4) & 1048575);
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
        r5 = (com.google.android.gms.internal.play_billing.zzcz) r5;
        r0 = (com.google.android.gms.internal.play_billing.zzcy) r8.zzC(r4);
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
        throw com.google.android.gms.internal.play_billing.zzci.zze();
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
        throw com.google.android.gms.internal.play_billing.zzci.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzan zzanVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzdi<T> zzdiVar;
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
        zzan zzanVar2;
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
        zzdi<T> zzdiVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i25 = i2;
        int i26 = i3;
        zzan zzanVar3 = zzanVar;
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
                    int zzk = zzao.zzk(b2, bArr2, i34, zzanVar3);
                    b = zzanVar3.zza;
                    i34 = zzk;
                } else {
                    b = b2;
                }
                int i35 = b >>> 3;
                if (i35 > i29) {
                    zzt = zzdiVar2.zzu(i35, i30 / 3);
                } else {
                    zzt = zzdiVar2.zzt(i35);
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
                    int[] iArr = zzdiVar2.zzc;
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
                                    zzeq.zzo(obj4, j, Double.longBitsToDouble(zzao.zzp(bArr2, i17)));
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
                                    zzeq.zzp(obj4, j, Float.intBitsToFloat(zzao.zzb(bArr2, i17)));
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
                                    int zzm = zzao.zzm(bArr2, i17, zzanVar3);
                                    unsafe2.putLong(obj, j, zzanVar3.zzb);
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
                                    i28 = zzao.zzj(bArr2, i17, zzanVar3);
                                    unsafe2.putInt(obj4, j, zzanVar3.zza);
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
                                    unsafe2.putLong(obj, j, zzao.zzp(bArr2, i18));
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
                                    unsafe2.putInt(obj4, j, zzao.zzb(bArr2, i18));
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
                                    i28 = zzao.zzm(bArr2, i18, zzanVar3);
                                    zzeq.zzm(obj4, j, zzanVar3.zzb != 0);
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
                                        i28 = zzao.zzg(bArr2, i18, zzanVar3);
                                    } else {
                                        i28 = zzao.zzh(bArr2, i18, zzanVar3);
                                    }
                                    unsafe2.putObject(obj4, j, zzanVar3.zzc);
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
                                    Object zzD = zzdiVar2.zzD(obj4, i15);
                                    i40 = i40;
                                    i28 = zzao.zzo(zzD, zzdiVar2.zzB(i15), bArr, i18, i2, zzanVar);
                                    zzdiVar2.zzL(obj4, i15, zzD);
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
                                    i28 = zzao.zza(bArr2, i21, zzanVar3);
                                    unsafe2.putObject(obj4, j, zzanVar3.zzc);
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
                                    i28 = zzao.zzj(bArr2, i21, zzanVar3);
                                    int i44 = zzanVar3.zza;
                                    zzce zzA = zzdiVar2.zzA(i19);
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
                                    i28 = zzao.zzj(bArr2, i21, zzanVar3);
                                    unsafe2.putInt(obj4, j, zzbe.zzb(zzanVar3.zza));
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
                                    int zzm2 = zzao.zzm(bArr2, i39, zzanVar3);
                                    unsafe2.putLong(obj, j, zzbe.zzc(zzanVar3.zzb));
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
                                    Object zzD2 = zzdiVar2.zzD(obj4, i15);
                                    i28 = zzao.zzn(zzD2, zzdiVar2.zzB(i15), bArr, i17, i2, (i16 << 3) | 4, zzanVar);
                                    zzdiVar2.zzL(obj4, i15, zzD2);
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
                                i28 = zzs(obj, bArr, i39, i2, i40, i35, i37, i36, i38, zzx, j, zzanVar);
                            } else {
                                i5 = i35;
                                unsafe = unsafe2;
                                i11 = i36;
                                i24 = i39;
                                i9 = -1;
                                if (zzx != 50) {
                                    i28 = zzr(obj, bArr, i24, i2, i40, i5, i37, i38, zzx, j, i11, zzanVar);
                                } else if (i37 == 2) {
                                    i28 = zzq(obj, bArr, i24, i2, i11, j, zzanVar);
                                }
                            }
                        } else if (i37 == 2) {
                            zzcf zzcfVar = (zzcf) unsafe2.getObject(obj4, j);
                            if (!zzcfVar.zzc()) {
                                int size = zzcfVar.size();
                                zzcfVar = zzcfVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzcfVar);
                            }
                            i28 = zzao.zze(zzdiVar2.zzB(i36), i40, bArr, i39, i2, zzcfVar, zzanVar);
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
                        zzanVar2 = zzanVar;
                        zzbn zzbnVar = zzanVar2.zzd;
                        if (zzbnVar != zzbn.zza) {
                            i12 = i5;
                            if (zzbnVar.zzb(this.zzg, i12) == null) {
                                i28 = zzao.zzi(i7, bArr, i6, i2, zzd(obj), zzanVar);
                                obj3 = obj;
                                i25 = i2;
                                i31 = i7;
                                zzdiVar2 = this;
                                i29 = i12;
                                obj4 = obj3;
                                i27 = i9;
                                i32 = i8;
                                i30 = i11;
                                bArr2 = bArr;
                                i26 = i45;
                                zzanVar3 = zzanVar2;
                                unsafe2 = unsafe;
                            } else {
                                zzby zzbyVar = (zzby) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i12 = i5;
                        }
                    } else {
                        obj3 = obj;
                        i12 = i5;
                        zzanVar2 = zzanVar;
                    }
                    i28 = zzao.zzi(i7, bArr, i6, i2, zzd(obj), zzanVar);
                    i25 = i2;
                    i31 = i7;
                    zzdiVar2 = this;
                    i29 = i12;
                    obj4 = obj3;
                    i27 = i9;
                    i32 = i8;
                    i30 = i11;
                    bArr2 = bArr;
                    i26 = i45;
                    zzanVar3 = zzanVar2;
                    unsafe2 = unsafe;
                } else {
                    zzdiVar = this;
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
                zzdiVar = zzdiVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final Object zze() {
        return ((zzcb) this.zzg).zzi();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzcb) {
                zzcb zzcbVar = (zzcb) obj;
                zzcbVar.zzq(Integer.MAX_VALUE);
                zzcbVar.zza = 0;
                zzcbVar.zzo();
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
                                this.zzl.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzcz) object).zzc();
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
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
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
                        zzeq.zzo(obj, j, zzeq.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zzeq.zzp(obj, j, zzeq.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zzeq.zzm(obj, j, zzeq.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
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
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzdr.zza;
                    zzeq.zzs(obj, j, zzda.zzb(zzeq.zzf(obj, j), zzeq.zzf(obj2, j)));
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
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
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
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
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
        zzdr.zzB(this.zzm, obj, obj2);
        if (this.zzh) {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d9, code lost:
        if (r0 != r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02fd, code lost:
        if (r0 != r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0294, code lost:
        if (r0 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0296, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r18;
        r1 = r19;
        r2 = r22;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ac, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzan zzanVar) throws IOException {
        byte b;
        int i3;
        int zzt;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzdi<T> zzdiVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzan zzanVar2 = zzanVar;
        zzew zzewVar = zzew.DOUBLE;
        int i15 = -1;
        if (zzdiVar.zzo - 1 != 0) {
            zzG(obj);
            Unsafe unsafe2 = zzb;
            int i16 = 1048575;
            int i17 = i;
            int i18 = 1048575;
            int i19 = -1;
            int i20 = 0;
            int i21 = 0;
            while (i17 < i14) {
                int i22 = i17 + 1;
                byte b2 = bArr2[i17];
                if (b2 < 0) {
                    i3 = zzao.zzk(b2, bArr2, i22, zzanVar2);
                    b = zzanVar2.zza;
                } else {
                    b = b2;
                    i3 = i22;
                }
                int i23 = b >>> 3;
                if (i23 > i19) {
                    zzt = zzdiVar.zzu(i23, i20 / 3);
                } else {
                    zzt = zzdiVar.zzt(i23);
                }
                int i24 = zzt;
                if (i24 == i15) {
                    i4 = i3;
                    i5 = i23;
                    i6 = i15;
                    unsafe = unsafe2;
                    i7 = 0;
                } else {
                    int i25 = b & 7;
                    int[] iArr = zzdiVar.zzc;
                    int i26 = iArr[i24 + 1];
                    int zzx = zzx(i26);
                    long j = i26 & i16;
                    if (zzx <= 17) {
                        int i27 = iArr[i24 + 2];
                        int i28 = 1 << (i27 >>> 20);
                        int i29 = i27 & 1048575;
                        if (i29 != i18) {
                            if (i18 != 1048575) {
                                unsafe2.putInt(obj2, i18, i21);
                            }
                            if (i29 != 1048575) {
                                i21 = unsafe2.getInt(obj2, i29);
                            }
                            i18 = i29;
                        }
                        switch (zzx) {
                            case 0:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                i10 = i3;
                                if (i25 != 1) {
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    zzeq.zzo(obj2, j, Double.longBitsToDouble(zzao.zzp(bArr2, i10)));
                                    i17 = i10 + 8;
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 1:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                i10 = i3;
                                if (i25 != 5) {
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    zzeq.zzp(obj2, j, Float.intBitsToFloat(zzao.zzb(bArr2, i10)));
                                    i17 = i10 + 4;
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 2:
                            case 3:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                i10 = i3;
                                if (i25 != 0) {
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    int zzm = zzao.zzm(bArr2, i10, zzanVar2);
                                    unsafe2.putLong(obj, j, zzanVar2.zzb);
                                    i21 |= i28;
                                    i20 = i8;
                                    i17 = zzm;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 4:
                            case 11:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                i10 = i3;
                                if (i25 != 0) {
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i17 = zzao.zzj(bArr2, i10, zzanVar2);
                                    unsafe2.putInt(obj2, j, zzanVar2.zza);
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 5:
                            case 14:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 1) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j, zzao.zzp(bArr2, i3));
                                    i17 = i3 + 8;
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 6:
                            case 13:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 5) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    unsafe2.putInt(obj2, j, zzao.zzb(bArr2, i3));
                                    i17 = i3 + 4;
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 7:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 0) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i17 = zzao.zzm(bArr2, i3, zzanVar2);
                                    zzeq.zzm(obj2, j, zzanVar2.zzb != 0);
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 8:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 2) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    if ((i26 & 536870912) == 0) {
                                        i17 = zzao.zzg(bArr2, i3, zzanVar2);
                                    } else {
                                        i17 = zzao.zzh(bArr2, i3, zzanVar2);
                                    }
                                    unsafe2.putObject(obj2, j, zzanVar2.zzc);
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 9:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 2) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    Object zzD = zzdiVar.zzD(obj2, i8);
                                    i17 = zzao.zzo(zzD, zzdiVar.zzB(i8), bArr, i3, i2, zzanVar);
                                    zzdiVar.zzL(obj2, i8, zzD);
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 10:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 2) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i17 = zzao.zza(bArr2, i3, zzanVar2);
                                    unsafe2.putObject(obj2, j, zzanVar2.zzc);
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 12:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 0) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i17 = zzao.zzj(bArr2, i3, zzanVar2);
                                    unsafe2.putInt(obj2, j, zzanVar2.zza);
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 15:
                                i9 = 1048575;
                                i8 = i24;
                                i5 = i23;
                                if (i25 != 0) {
                                    i10 = i3;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i17 = zzao.zzj(bArr2, i3, zzanVar2);
                                    unsafe2.putInt(obj2, j, zzbe.zzb(zzanVar2.zza));
                                    i21 |= i28;
                                    i20 = i8;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            case 16:
                                if (i25 != 0) {
                                    i5 = i23;
                                    i10 = i3;
                                    i8 = i24;
                                    i4 = i10;
                                    unsafe = unsafe2;
                                    i7 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    int zzm2 = zzao.zzm(bArr2, i3, zzanVar2);
                                    i5 = i23;
                                    i9 = 1048575;
                                    unsafe2.putLong(obj, j, zzbe.zzc(zzanVar2.zzb));
                                    i21 |= i28;
                                    i20 = i24;
                                    i17 = zzm2;
                                    i19 = i5;
                                    i16 = i9;
                                    i15 = -1;
                                    i14 = i2;
                                    break;
                                }
                            default:
                                i8 = i24;
                                i5 = i23;
                                i10 = i3;
                                i4 = i10;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                        }
                    } else {
                        i5 = i23;
                        int i30 = i3;
                        if (zzx != 27) {
                            i7 = i24;
                            if (zzx <= 49) {
                                i12 = i21;
                                i13 = i18;
                                unsafe = unsafe2;
                                i6 = -1;
                                i17 = zzs(obj, bArr, i30, i2, b, i5, i25, i7, i26, zzx, j, zzanVar);
                            } else {
                                i11 = i30;
                                i12 = i21;
                                i13 = i18;
                                unsafe = unsafe2;
                                i6 = -1;
                                if (zzx != 50) {
                                    i17 = zzr(obj, bArr, i11, i2, b, i5, i25, i26, zzx, j, i7, zzanVar);
                                } else if (i25 == 2) {
                                    i17 = zzq(obj, bArr, i11, i2, i7, j, zzanVar);
                                }
                            }
                        } else if (i25 == 2) {
                            zzcf zzcfVar = (zzcf) unsafe2.getObject(obj2, j);
                            if (!zzcfVar.zzc()) {
                                int size = zzcfVar.size();
                                zzcfVar = zzcfVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzcfVar);
                            }
                            i17 = zzao.zze(zzdiVar.zzB(i24), b, bArr, i30, i2, zzcfVar, zzanVar);
                            i14 = i2;
                            i21 = i21;
                            i19 = i5;
                            i20 = i24;
                            i16 = 1048575;
                            i15 = -1;
                        } else {
                            i7 = i24;
                            i11 = i30;
                            i12 = i21;
                            i13 = i18;
                            unsafe = unsafe2;
                            i6 = -1;
                        }
                        i4 = i11;
                        i21 = i12;
                        i18 = i13;
                    }
                    unsafe2 = unsafe;
                    i16 = 1048575;
                }
                i17 = zzao.zzi(b, bArr, i4, i2, zzd(obj), zzanVar);
                zzdiVar = this;
                obj2 = obj;
                bArr2 = bArr;
                i14 = i2;
                zzanVar2 = zzanVar;
                i15 = i6;
                i19 = i5;
                i20 = i7;
                unsafe2 = unsafe;
                i16 = 1048575;
            }
            int i31 = i21;
            Unsafe unsafe3 = unsafe2;
            if (i18 != i16) {
                unsafe3.putInt(obj, i18, i31);
            }
            if (i17 != i2) {
                throw zzci.zze();
            }
            return;
        }
        zzc(obj, bArr, i, i2, 0, zzanVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzi(Object obj, zzey zzeyVar) throws IOException {
        int i;
        int i2;
        int i3;
        zzew zzewVar = zzew.DOUBLE;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzo - 1 == 0) {
            if (this.zzh) {
                this.zzn.zza(obj);
                throw null;
            } else {
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
                                zzeyVar.zzf(i9, zzeq.zza(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzo(i9, zzeq.zzb(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzt(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzJ(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzr(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzm(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzk(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzb(i9, zzeq.zzw(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzV(i9, unsafe.getObject(obj, j), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzv(i9, unsafe.getObject(obj, j), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzd(i9, (zzba) unsafe.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzH(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzi(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzw(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzy(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzA(i9, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzC(i9, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            i2 = 0;
                            if ((i7 & i) != 0) {
                                zzeyVar.zzq(i9, unsafe.getObject(obj, j), zzB(i6));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i2 = 0;
                            zzdr.zzF(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 19:
                            i2 = 0;
                            zzdr.zzJ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 20:
                            i2 = 0;
                            zzdr.zzM(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 21:
                            i2 = 0;
                            zzdr.zzU(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 22:
                            i2 = 0;
                            zzdr.zzL(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 23:
                            i2 = 0;
                            zzdr.zzI(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 24:
                            i2 = 0;
                            zzdr.zzH(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 25:
                            i2 = 0;
                            zzdr.zzD(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            break;
                        case 26:
                            zzdr.zzS(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar);
                            i2 = 0;
                            break;
                        case 27:
                            zzdr.zzN(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i6));
                            i2 = 0;
                            break;
                        case 28:
                            zzdr.zzE(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar);
                            i2 = 0;
                            break;
                        case 29:
                            i3 = 0;
                            zzdr.zzT(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            i2 = i3;
                            break;
                        case 30:
                            i3 = 0;
                            zzdr.zzG(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            i2 = i3;
                            break;
                        case 31:
                            i3 = 0;
                            zzdr.zzO(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            i2 = i3;
                            break;
                        case 32:
                            i3 = 0;
                            zzdr.zzP(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            i2 = i3;
                            break;
                        case 33:
                            i3 = 0;
                            zzdr.zzQ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            i2 = i3;
                            break;
                        case 34:
                            i3 = 0;
                            zzdr.zzR(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, false);
                            i2 = i3;
                            break;
                        case 35:
                            zzdr.zzF(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 36:
                            zzdr.zzJ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 37:
                            zzdr.zzM(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 38:
                            zzdr.zzU(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 39:
                            zzdr.zzL(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 40:
                            zzdr.zzI(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 41:
                            zzdr.zzH(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 42:
                            zzdr.zzD(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 43:
                            zzdr.zzT(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 44:
                            zzdr.zzG(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 45:
                            zzdr.zzO(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 46:
                            zzdr.zzP(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 47:
                            zzdr.zzQ(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case 48:
                            zzdr.zzR(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, true);
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzdr.zzK(this.zzc[i6], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i6));
                            i2 = 0;
                            break;
                        case 50:
                            zzN(zzeyVar, i9, unsafe.getObject(obj, j), i6);
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzf(i9, zzm(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzo(i9, zzn(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzt(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzJ(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzr(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 56:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzm(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 57:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzk(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 58:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzb(i9, zzU(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 59:
                            if (zzT(obj, i9, i6)) {
                                zzV(i9, unsafe.getObject(obj, j), zzeyVar);
                            }
                            i2 = 0;
                            break;
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzv(i9, unsafe.getObject(obj, j), zzB(i6));
                            }
                            i2 = 0;
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzd(i9, (zzba) unsafe.getObject(obj, j));
                            }
                            i2 = 0;
                            break;
                        case SSL.SSL_PROTOCOL_TLS /* 62 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzH(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 63:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzi(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 64:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzw(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 65:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzy(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzA(i9, zzp(obj, j));
                            }
                            i2 = 0;
                            break;
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzC(i9, zzz(obj, j));
                            }
                            i2 = 0;
                            break;
                        case 68:
                            if (zzT(obj, i9, i6)) {
                                zzeyVar.zzq(i9, unsafe.getObject(obj, j), zzB(i6));
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
                zzeg zzegVar = this.zzm;
                zzegVar.zzi(zzegVar.zzd(obj), zzeyVar);
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
                                zzeyVar.zzf(i13, zzeq.zza(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzo(i13, zzeq.zzb(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzt(i13, zzeq.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzJ(i13, zzeq.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzr(i13, zzeq.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzm(i13, zzeq.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzk(i13, zzeq.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzb(i13, zzeq.zzw(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i12)) {
                                zzV(i13, zzeq.zzf(obj, zzy2 & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzv(i13, zzeq.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzd(i13, (zzba) zzeq.zzf(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzH(i13, zzeq.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzi(i13, zzeq.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzw(i13, zzeq.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzy(i13, zzeq.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzA(i13, zzeq.zzc(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzC(i13, zzeq.zzd(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i12)) {
                                zzeyVar.zzq(i13, zzeq.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzdr.zzF(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 19:
                            zzdr.zzJ(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 20:
                            zzdr.zzM(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 21:
                            zzdr.zzU(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 22:
                            zzdr.zzL(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 23:
                            zzdr.zzI(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 24:
                            zzdr.zzH(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 25:
                            zzdr.zzD(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 26:
                            zzdr.zzS(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar);
                            break;
                        case 27:
                            zzdr.zzN(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, zzB(i12));
                            break;
                        case 28:
                            zzdr.zzE(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar);
                            break;
                        case 29:
                            zzdr.zzT(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 30:
                            zzdr.zzG(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 31:
                            zzdr.zzO(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 32:
                            zzdr.zzP(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 33:
                            zzdr.zzQ(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 34:
                            zzdr.zzR(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, false);
                            break;
                        case 35:
                            zzdr.zzF(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 36:
                            zzdr.zzJ(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 37:
                            zzdr.zzM(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 38:
                            zzdr.zzU(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 39:
                            zzdr.zzL(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 40:
                            zzdr.zzI(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 41:
                            zzdr.zzH(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 42:
                            zzdr.zzD(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 43:
                            zzdr.zzT(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 44:
                            zzdr.zzG(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 45:
                            zzdr.zzO(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 46:
                            zzdr.zzP(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 47:
                            zzdr.zzQ(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case 48:
                            zzdr.zzR(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzdr.zzK(i13, (List) zzeq.zzf(obj, zzy2 & 1048575), zzeyVar, zzB(i12));
                            break;
                        case 50:
                            zzN(zzeyVar, i13, zzeq.zzf(obj, zzy2 & 1048575), i12);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzf(i13, zzm(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzo(i13, zzn(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzt(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzJ(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzr(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzm(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzk(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzb(i13, zzU(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i13, i12)) {
                                zzV(i13, zzeq.zzf(obj, zzy2 & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzv(i13, zzeq.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzd(i13, (zzba) zzeq.zzf(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case SSL.SSL_PROTOCOL_TLS /* 62 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzH(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzi(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzw(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzy(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzA(i13, zzp(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzC(i13, zzz(obj, zzy2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i13, i12)) {
                                zzeyVar.zzq(i13, zzeq.zzf(obj, zzy2 & 1048575), zzB(i12));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzeg zzegVar2 = this.zzm;
                zzegVar2.zzi(zzegVar2.zzd(obj), zzeyVar);
                return;
            }
            this.zzn.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzeq.zza(obj, j)) == Double.doubleToLongBits(zzeq.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzeq.zzb(obj, j)) == Float.floatToIntBits(zzeq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzeq.zzw(obj, j) == zzeq.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
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
                    zzV = zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j));
                    break;
                case 50:
                    zzV = zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j));
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
                    if (zzeq.zzc(obj, zzv) == zzeq.zzc(obj2, zzv) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzV) {
                return false;
            }
        }
        if (this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            if (this.zzh) {
                this.zzn.zza(obj);
                this.zzn.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int i6 = this.zzi[i4];
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
                        if (zzx == 50 && !((zzcz) zzeq.zzf(obj, zzy & 1048575)).isEmpty()) {
                            zzcy zzcyVar = (zzcy) zzC(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzeq.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzdp zzB = zzB(i6);
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
            this.zzn.zza(obj);
            throw null;
        }
        return true;
    }
}
