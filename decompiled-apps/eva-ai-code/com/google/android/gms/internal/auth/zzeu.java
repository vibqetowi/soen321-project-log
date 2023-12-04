package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzes;
import com.google.android.gms.internal.auth.zzeu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public abstract class zzeu<MessageType extends zzeu<MessageType, BuilderType>, BuilderType extends zzes<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgz zzc = zzgz.zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeu zza(Class cls) {
        Map map = zzb;
        zzeu zzeuVar = (zzeu) map.get(cls);
        if (zzeuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeuVar = (zzeu) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzeuVar == null) {
            zzeuVar = (zzeu) ((zzeu) zzhi.zze(cls)).zzi(6, null, null);
            if (zzeuVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzeuVar);
        }
        return zzeuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzeu zzb(zzeu zzeuVar, byte[] bArr) throws zzfa {
        zzeu zzj = zzj(zzeuVar, bArr, 0, bArr.length, zzek.zza);
        if (zzj != null) {
            Boolean bool = Boolean.TRUE;
            byte byteValue = ((Byte) zzj.zzi(1, null, null)).byteValue();
            if (byteValue != 1) {
                if (byteValue != 0) {
                    boolean zzi = zzge.zza().zzb(zzj.getClass()).zzi(zzj);
                    zzj.zzi(2, true != zzi ? null : zzj, null);
                }
                zzfa zza = new zzgx(zzj).zza();
                zza.zze(zzj);
                throw zza;
            }
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzey zzc() {
        return zzgf.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zze(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzf(zzfw zzfwVar, String str, Object[] objArr) {
        return new zzgg(zzfwVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzg(Class cls, zzeu zzeuVar) {
        zzb.put(cls, zzeuVar);
    }

    private static zzeu zzj(zzeu zzeuVar, byte[] bArr, int i, int i2, zzek zzekVar) throws zzfa {
        zzeu zzeuVar2 = (zzeu) zzeuVar.zzi(4, null, null);
        try {
            zzgh zzb2 = zzge.zza().zzb(zzeuVar2.getClass());
            zzb2.zzg(zzeuVar2, bArr, 0, i2, new zzds(zzekVar));
            zzb2.zze(zzeuVar2);
            if (zzeuVar2.zza == 0) {
                return zzeuVar2;
            }
            throw new RuntimeException();
        } catch (zzfa e) {
            e.zze(zzeuVar2);
            throw e;
        } catch (zzgx e2) {
            zzfa zza = e2.zza();
            zza.zze(zzeuVar2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzfa) {
                throw ((zzfa) e3.getCause());
            }
            zzfa zzfaVar = new zzfa(e3);
            zzfaVar.zze(zzeuVar2);
            throw zzfaVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfa zzf = zzfa.zzf();
            zzf.zze(zzeuVar2);
            throw zzf;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzge.zza().zzb(getClass()).zzh(this, (zzeu) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = zzge.zza().zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfy.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    public final /* synthetic */ zzfv zzd() {
        zzes zzesVar = (zzes) zzi(5, null, null);
        zzesVar.zze(this);
        return zzesVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfx
    public final /* synthetic */ zzfw zzh() {
        return (zzeu) zzi(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzi(int i, Object obj, Object obj2);
}
