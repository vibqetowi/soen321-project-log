package com.google.android.gms.fido.fido2.api.common;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public enum EC2Algorithm implements Algorithm {
    ED256(-260),
    ED512(-261),
    ES256(-7),
    ES384(-35),
    ES512(-36);
    
    private final int zzb;

    EC2Algorithm(int i) {
        this.zzb = i;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.Algorithm
    public int getAlgoValue() {
        return this.zzb;
    }
}
