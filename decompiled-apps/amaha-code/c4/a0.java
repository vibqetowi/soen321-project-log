package c4;

import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class a0 {
    public static g a(String str, Bundle bundle) {
        g gVar = z.f;
        if (bundle == null) {
            oa.i.f("BillingClient", String.format("%s got null owned items list", str));
            return gVar;
        }
        int a10 = oa.i.a(bundle, "BillingClient");
        String d10 = oa.i.d(bundle, "BillingClient");
        g gVar2 = new g();
        gVar2.f4918a = a10;
        gVar2.f4919b = d10;
        if (a10 != 0) {
            oa.i.f("BillingClient", String.format("%s failed. Response code: %s", str, Integer.valueOf(a10)));
            return gVar2;
        } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                oa.i.f("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str));
                return gVar;
            } else if (stringArrayList2 == null) {
                oa.i.f("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str));
                return gVar;
            } else if (stringArrayList3 == null) {
                oa.i.f("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str));
                return gVar;
            } else {
                return z.f4976g;
            }
        } else {
            oa.i.f("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str));
            return gVar;
        }
    }
}
