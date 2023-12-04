package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzfb;
import java.util.List;
import org.json.JSONException;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public final class zzg extends BroadcastReceiver {
    final /* synthetic */ zzh zza;
    private final PurchasesUpdatedListener zzb;
    private final zzaz zzc;
    private final AlternativeBillingListener zzd;
    private final zzar zze;
    private boolean zzf;

    public /* synthetic */ zzg(zzh zzhVar, zzaz zzazVar, zzar zzarVar, zzf zzfVar) {
        this.zza = zzhVar;
        this.zzb = null;
        this.zzd = null;
        this.zzc = null;
        this.zze = zzarVar;
    }

    private final void zze(Bundle bundle, BillingResult billingResult, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.zze.zza(zzfb.zzx(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.zzbn.zza()));
                return;
            } catch (Throwable unused) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        this.zze.zza(zzaq.zza(23, i, billingResult));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingBroadcastManager", "Bundle is null.");
            this.zze.zza(zzaq.zza(11, 1, zzat.zzj));
            PurchasesUpdatedListener purchasesUpdatedListener = this.zzb;
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(zzat.zzj, null);
                return;
            }
            return;
        }
        BillingResult zzd = com.google.android.gms.internal.play_billing.zzb.zzd(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        int i = 2;
        if (string != "LAUNCH_BILLING_FLOW" && (string == null || !string.equals("LAUNCH_BILLING_FLOW"))) {
            i = 1;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List<Purchase> zzh = com.google.android.gms.internal.play_billing.zzb.zzh(extras);
            if (zzd.getResponseCode() == 0) {
                this.zze.zzb(zzaq.zzb(i));
            } else {
                zze(extras, zzd, i);
            }
            this.zzb.onPurchasesUpdated(zzd, zzh);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zzd.getResponseCode() != 0) {
                zze(extras, zzd, i);
                this.zzb.onPurchasesUpdated(zzd, com.google.android.gms.internal.play_billing.zzu.zzk());
            } else if (this.zzd == null) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingBroadcastManager", "AlternativeBillingListener is null.");
                this.zze.zza(zzaq.zza(15, i, zzat.zzj));
                this.zzb.onPurchasesUpdated(zzat.zzj, com.google.android.gms.internal.play_billing.zzu.zzk());
            } else {
                String string2 = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                    this.zze.zza(zzaq.zza(16, i, zzat.zzj));
                    this.zzb.onPurchasesUpdated(zzat.zzj, com.google.android.gms.internal.play_billing.zzu.zzk());
                    return;
                }
                try {
                    AlternativeChoiceDetails alternativeChoiceDetails = new AlternativeChoiceDetails(string2);
                    this.zze.zzb(zzaq.zzb(i));
                    this.zzd.userSelectedAlternativeBilling(alternativeChoiceDetails);
                } catch (JSONException unused) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string2));
                    this.zze.zza(zzaq.zza(17, i, zzat.zzj));
                    this.zzb.onPurchasesUpdated(zzat.zzj, com.google.android.gms.internal.play_billing.zzu.zzk());
                }
            }
        }
    }

    public final void zzc(Context context, IntentFilter intentFilter) {
        zzg zzgVar;
        zzg zzgVar2;
        if (this.zzf) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            zzgVar2 = this.zza.zzb;
            context.registerReceiver(zzgVar2, intentFilter, 2);
        } else {
            zzgVar = this.zza.zzb;
            context.registerReceiver(zzgVar, intentFilter);
        }
        this.zzf = true;
    }

    public final void zzd(Context context) {
        zzg zzgVar;
        if (!this.zzf) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingBroadcastManager", "Receiver is not registered.");
            return;
        }
        zzgVar = this.zza.zzb;
        context.unregisterReceiver(zzgVar);
        this.zzf = false;
    }

    public /* synthetic */ zzg(zzh zzhVar, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzar zzarVar, zzf zzfVar) {
        this.zza = zzhVar;
        this.zzb = purchasesUpdatedListener;
        this.zze = zzarVar;
        this.zzd = alternativeBillingListener;
        this.zzc = null;
    }
}
