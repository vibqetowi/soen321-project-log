package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public class zzkx<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjj<MessageType, BuilderType> {
    protected zzlb zza;
    private final zzlb zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzkx(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzbR()) {
            this.zza = messagetype.zzbD();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzmq.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    /* renamed from: zzaA */
    public final zzkx zzav() {
        zzkx zzkxVar = (zzkx) this.zzb.zzl(5, null, null);
        zzkxVar.zza = zzaF();
        return zzkxVar;
    }

    public final zzkx zzaB(zzlb zzlbVar) {
        if (!this.zzb.equals(zzlbVar)) {
            if (!this.zza.zzbR()) {
                zzaI();
            }
            zza(this.zza, zzlbVar);
        }
        return this;
    }

    public final zzkx zzaC(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        if (!this.zza.zzbR()) {
            zzaI();
        }
        try {
            zzmq.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zzjn(zzknVar));
            return this;
        } catch (zzll e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType zzaD() {
        MessageType zzaF = zzaF();
        Boolean bool = Boolean.TRUE;
        byte byteValue = ((Byte) zzaF.zzl(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean zzk = zzmq.zza().zzb(zzaF.getClass()).zzk(zzaF);
                zzaF.zzl(2, true != zzk ? null : zzaF, null);
            }
            throw new zznj(zzaF);
        }
        return zzaF;
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* renamed from: zzaE */
    public MessageType zzaF() {
        if (this.zza.zzbR()) {
            this.zza.zzbM();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaH() {
        if (this.zza.zzbR()) {
            return;
        }
        zzaI();
    }

    protected void zzaI() {
        zzlb zzbD = this.zzb.zzbD();
        zza(zzbD, this.zza);
        this.zza = zzbD;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzaw(byte[] bArr, int i, int i2) throws zzll {
        zzaC(bArr, 0, i2, zzkn.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzax(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        zzaC(bArr, 0, i2, zzknVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmi zzbV() {
        throw null;
    }
}
