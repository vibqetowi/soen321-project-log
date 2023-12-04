package com.google.android.gms.internal.measurement;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zznu {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zznt zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0154  */
    static {
        boolean z;
        zznt zzntVar;
        boolean z2;
        Field zzB;
        zznt zzntVar2;
        Unsafe zzg2 = zzg();
        zzc = zzg2;
        int i = zzjm.zza;
        zzd = Memory.class;
        boolean zzv = zzv(Long.TYPE);
        zze = zzv;
        boolean zzv2 = zzv(Integer.TYPE);
        zznt zzntVar3 = null;
        if (zzg2 != null) {
            if (zzv) {
                zzntVar3 = new zzns(zzg2);
            } else if (zzv2) {
                zzntVar3 = new zznr(zzg2);
            }
        }
        zzf = zzntVar3;
        if (zzntVar3 != null) {
            try {
                Class<?> cls = zzntVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzh(th);
            }
            if (zzB() != null) {
                z = true;
                zzg = z;
                zzntVar = zzf;
                if (zzntVar != null) {
                    try {
                        Class<?> cls2 = zzntVar.zza.getClass();
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
                    zzh = z2;
                    zza = zzz(byte[].class);
                    zzz(boolean[].class);
                    zzA(boolean[].class);
                    zzz(int[].class);
                    zzA(int[].class);
                    zzz(long[].class);
                    zzA(long[].class);
                    zzz(float[].class);
                    zzA(float[].class);
                    zzz(double[].class);
                    zzA(double[].class);
                    zzz(Object[].class);
                    zzA(Object[].class);
                    zzB = zzB();
                    if (zzB != null && (zzntVar2 = zzf) != null) {
                        zzntVar2.zza.objectFieldOffset(zzB);
                    }
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                zzh = z2;
                zza = zzz(byte[].class);
                zzz(boolean[].class);
                zzA(boolean[].class);
                zzz(int[].class);
                zzA(int[].class);
                zzz(long[].class);
                zzA(long[].class);
                zzz(float[].class);
                zzA(float[].class);
                zzz(double[].class);
                zzA(double[].class);
                zzz(Object[].class);
                zzA(Object[].class);
                zzB = zzB();
                if (zzB != null) {
                    zzntVar2.zza.objectFieldOffset(zzB);
                }
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzntVar = zzf;
        if (zzntVar != null) {
        }
        z2 = false;
        zzh = z2;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        zzB = zzB();
        if (zzB != null) {
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zznu() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzjm.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC == null) {
            Field zzC2 = zzC(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            if (zzC2 == null || zzC2.getType() != Long.TYPE) {
                return null;
            }
            return zzC2;
        }
        return zzC;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b) {
        zznt zzntVar = zzf;
        long j2 = (-4) & j;
        int i = zzntVar.zza.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zzntVar.zza.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b) {
        zznt zzntVar = zzf;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzntVar.zza.putInt(obj, j2, ((255 & b) << i) | (zzntVar.zza.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzf(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zznq());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zznu.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzm(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzn(byte[] bArr, long j, byte b) {
        zzf.zzd(bArr, zza + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(Object obj, long j, double d) {
        zzf.zze(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(Object obj, long j, float f) {
        zzf.zzf(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzr(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzs(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzv(Class cls) {
        int i = zzjm.zza;
        try {
            Class cls2 = zzd;
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
    public static boolean zzw(Object obj, long j) {
        return zzf.zzg(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzx() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
