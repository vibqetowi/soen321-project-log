package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.Purchase;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzj("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return zzl(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzi(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            zzj(str, "Unexpected type for bundle response code: ".concat(String.valueOf(obj.getClass().getName())));
            return 6;
        }
    }

    public static Bundle zzc(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static BillingResult zzd(Intent intent, String str) {
        if (intent == null) {
            zzj("BillingHelper", "Got null intent!");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(6);
            newBuilder.setDebugMessage("An internal error occurred.");
            return newBuilder.build();
        }
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(zzb(intent.getExtras(), str));
        newBuilder2.setDebugMessage(zzf(intent.getExtras(), str));
        return newBuilder2.build();
    }

    public static InAppMessageResult zze(Bundle bundle, String str) {
        if (bundle == null) {
            return new InAppMessageResult(0, null);
        }
        return new InAppMessageResult(zzl(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzf(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzi(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            zzj(str, "Unexpected type for debug message: ".concat(String.valueOf(obj.getClass().getName())));
            return "";
        }
    }

    public static String zzg(int i) {
        return zza.zza(i).toString();
    }

    public static List zzh(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzm = zzm(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzm == null) {
                zzi("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzm);
        } else {
            int size = stringArrayList.size();
            zzi("BillingHelper", "Found purchase list of " + size + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase zzm2 = zzm(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzm2 != null) {
                    arrayList.add(zzm2);
                }
            }
        }
        return arrayList;
    }

    public static void zzi(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i = MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
                while (!str2.isEmpty() && i > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void zzj(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzk(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzl(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    private static Purchase zzm(String str, String str2) {
        if (str == null || str2 == null) {
            zzi("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            zzj("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
