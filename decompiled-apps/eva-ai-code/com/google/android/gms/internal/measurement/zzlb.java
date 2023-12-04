package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzlb<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjk<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznl zzc = zznl.zzc();

    private final int zza(zzmt zzmtVar) {
        if (zzmtVar == null) {
            return zzmq.zza().zzb(getClass()).zza(this);
        }
        return zzmtVar.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlb zzbC(Class cls) {
        Map map = zza;
        zzlb zzlbVar = (zzlb) map.get(cls);
        if (zzlbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzlbVar = (zzlb) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzlbVar == null) {
            zzlbVar = (zzlb) ((zzlb) zznu.zze(cls)).zzl(6, null, null);
            if (zzlbVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzlbVar);
        }
        return zzlbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzlg zzbE() {
        return zzlc.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzlh zzbF() {
        return zzlx.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzlh zzbG(zzlh zzlhVar) {
        int size = zzlhVar.size();
        return zzlhVar.zze(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzli zzbH() {
        return zzmr.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzli zzbI(zzli zzliVar) {
        int size = zzliVar.size();
        return zzliVar.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzbK(Method method, Object obj, Object... objArr) {
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
    public static Object zzbL(zzmi zzmiVar, String str, Object[] objArr) {
        return new zzms(zzmiVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzbO(Class cls, zzlb zzlbVar) {
        zzlbVar.zzbN();
        zza.put(cls, zzlbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzmq.zza().zzb(getClass()).zzj(this, (zzlb) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzbR()) {
            return zzby();
        }
        int i = this.zzb;
        if (i == 0) {
            int zzby = zzby();
            this.zzb = zzby;
            return zzby;
        }
        return i;
    }

    public final String toString() {
        return zzmk.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzkx zzbA() {
        return (zzkx) zzl(5, null, null);
    }

    public final zzkx zzbB() {
        zzkx zzkxVar = (zzkx) zzl(5, null, null);
        zzkxVar.zzaB(this);
        return zzkxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzlb zzbD() {
        return (zzlb) zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh zzbJ() {
        return (zzkx) zzl(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbM() {
        zzmq.zza().zzb(getClass()).zzf(this);
        zzbN();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbN() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbP(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void zzbQ(zzki zzkiVar) throws IOException {
        zzmq.zza().zzb(getClass()).zzi(this, zzkj.zza(zzkiVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzbR() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* synthetic */ zzmi zzbV() {
        return (zzlb) zzl(6, null, null);
    }

    final int zzby() {
        return zzmq.zza().zzb(getClass()).zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzl(int i, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzjk
    public final int zzbu(zzmt zzmtVar) {
        if (zzbR()) {
            int zza2 = zza(zzmtVar);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza3 = zza(zzmtVar);
        if (zza3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza3;
            return zza3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza3);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final int zzbz() {
        int i;
        if (zzbR()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }
}
