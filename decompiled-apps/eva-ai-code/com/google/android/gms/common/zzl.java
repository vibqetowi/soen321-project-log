package com.google.android.gms.common;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
abstract class zzl extends zzj {
    private static final WeakReference zza = new WeakReference(null);
    private WeakReference zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(byte[] bArr) {
        super(bArr);
        this.zzb = zza;
    }

    protected abstract byte[] zzb();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.zzb.get();
            if (bArr == null) {
                bArr = zzb();
                this.zzb = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
