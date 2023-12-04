package com.android.billingclient.api;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        /* synthetic */ Builder(zzas zzasVar) {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public String toString() {
        String zzg = com.google.android.gms.internal.play_billing.zzb.zzg(this.zza);
        String str = this.zzb;
        return "Response Code: " + zzg + ", Debug Message: " + str;
    }
}
