package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzma implements zzmu {
    private static final zzmg zza = new zzly();
    private final zzmg zzb;

    public zzma() {
        zzmg zzmgVar;
        zzmg[] zzmgVarArr = new zzmg[2];
        zzmgVarArr[0] = zzkw.zza();
        try {
            zzmgVar = (zzmg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzmgVar = zza;
        }
        zzmgVarArr[1] = zzmgVar;
        zzlz zzlzVar = new zzlz(zzmgVarArr);
        byte[] bArr = zzlj.zzd;
        this.zzb = zzlzVar;
    }

    private static boolean zzb(zzmf zzmfVar) {
        return zzmfVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final zzmt zza(Class cls) {
        zzmv.zzC(cls);
        zzmf zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            if (zzlb.class.isAssignableFrom(cls)) {
                if (zzb(zzb)) {
                    return zzml.zzl(cls, zzb, zzmo.zzb(), zzlw.zzd(), zzmv.zzz(), zzkq.zzb(), zzme.zzb());
                }
                return zzml.zzl(cls, zzb, zzmo.zzb(), zzlw.zzd(), zzmv.zzz(), null, zzme.zzb());
            } else if (zzb(zzb)) {
                return zzml.zzl(cls, zzb, zzmo.zza(), zzlw.zzc(), zzmv.zzy(), zzkq.zza(), zzme.zza());
            } else {
                return zzml.zzl(cls, zzb, zzmo.zza(), zzlw.zzc(), zzmv.zzy(), null, zzme.zza());
            }
        } else if (zzlb.class.isAssignableFrom(cls)) {
            return zzmm.zzc(zzmv.zzz(), zzkq.zzb(), zzb.zza());
        } else {
            return zzmm.zzc(zzmv.zzy(), zzkq.zza(), zzb.zza());
        }
    }
}
