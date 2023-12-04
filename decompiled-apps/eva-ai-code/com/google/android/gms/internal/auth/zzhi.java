package com.google.android.gms.internal.auth;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzhi {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    static {
        boolean z;
        zzhh zzhhVar;
        boolean z2;
        Field zzy;
        zzhh zzhhVar2;
        Unsafe zzg2 = zzg();
        zzb = zzg2;
        zzc = zzdr.zza();
        boolean zzs = zzs(Long.TYPE);
        zzd = zzs;
        boolean zzs2 = zzs(Integer.TYPE);
        zzhh zzhhVar3 = null;
        if (zzg2 != null) {
            if (zzs) {
                zzhhVar3 = new zzhg(zzg2);
            } else if (zzs2) {
                zzhhVar3 = new zzhf(zzg2);
            }
        }
        zze = zzhhVar3;
        if (zzhhVar3 != null) {
            try {
                Class<?> cls = zzhhVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzh(th);
            }
            if (zzy() != null) {
                z = true;
                zzf = z;
                zzhhVar = zze;
                if (zzhhVar != null) {
                    try {
                        Class<?> cls2 = zzhhVar.zza.getClass();
                        cls2.getMethod("objectFieldOffset", Field.class);
                        cls2.getMethod("arrayBaseOffset", Class.class);
                        cls2.getMethod("arrayIndexScale", Class.class);
                        cls2.getMethod("getInt", Object.class, Long.TYPE);
                        cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                        cls2.getMethod("getLong", Object.class, Long.TYPE);
                        cls2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                        cls2.getMethod("getObject", Object.class, Long.TYPE);
                        cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        zzh(th2);
                    }
                    zzg = z2;
                    zzw(byte[].class);
                    zzw(boolean[].class);
                    zzx(boolean[].class);
                    zzw(int[].class);
                    zzx(int[].class);
                    zzw(long[].class);
                    zzx(long[].class);
                    zzw(float[].class);
                    zzx(float[].class);
                    zzw(double[].class);
                    zzx(double[].class);
                    zzw(Object[].class);
                    zzx(Object[].class);
                    zzy = zzy();
                    if (zzy != null && (zzhhVar2 = zze) != null) {
                        zzhhVar2.zzk(zzy);
                    }
                    zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                zzg = z2;
                zzw(byte[].class);
                zzw(boolean[].class);
                zzx(boolean[].class);
                zzw(int[].class);
                zzx(int[].class);
                zzw(long[].class);
                zzx(long[].class);
                zzw(float[].class);
                zzx(float[].class);
                zzw(double[].class);
                zzx(double[].class);
                zzw(Object[].class);
                zzx(Object[].class);
                zzy = zzy();
                if (zzy != null) {
                    zzhhVar2.zzk(zzy);
                }
                zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzf = z;
        zzhhVar = zze;
        if (zzhhVar != null) {
        }
        z2 = false;
        zzg = z2;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        zzy = zzy();
        if (zzy != null) {
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhi() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(Object obj, long j) {
        return zze.zza(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(Object obj, long j) {
        return zze.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, long j) {
        return zze.zzi(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(Object obj, long j) {
        return zze.zzj(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzf(Object obj, long j) {
        return zze.zzl(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhe());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        zzhh zzhhVar = zze;
        int zzi = zzhhVar.zzi(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzhhVar.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzi));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        zzhh zzhhVar = zze;
        int zzi = zzhhVar.zzi(obj, j2);
        int i = (((int) j) & 3) << 3;
        zzhhVar.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzi));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzk(Object obj, long j, boolean z) {
        zze.zzc(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzl(Object obj, long j, double d) {
        zze.zzd(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzm(Object obj, long j, float f) {
        zze.zze(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzn(Object obj, long j, int i) {
        zze.zzm(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(Object obj, long j, long j2) {
        zze.zzn(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(Object obj, long j, Object obj2) {
        zze.zzo(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j) {
        return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j) {
        return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzs(Class cls) {
        int i = zzdr.zza;
        try {
            Class cls2 = zzc;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzt(Object obj, long j) {
        return zze.zzf(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzu() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i = zzdr.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz == null) {
            Field zzz2 = zzz(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            if (zzz2 == null || zzz2.getType() != Long.TYPE) {
                return null;
            }
            return zzz2;
        }
        return zzz;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
