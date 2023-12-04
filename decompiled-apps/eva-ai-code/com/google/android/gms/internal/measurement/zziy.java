package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zziy extends zzis {
    private final zzja zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziy(zzja zzjaVar, int i) {
        super(zzjaVar.size(), i);
        this.zza = zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
