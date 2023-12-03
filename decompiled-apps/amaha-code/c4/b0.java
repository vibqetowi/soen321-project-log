package c4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class b0 extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f4897d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final o f4898a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4899b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.l f4900c;

    public /* synthetic */ b0(androidx.appcompat.widget.l lVar, o oVar) {
        this.f4900c = lVar;
        this.f4898a = oVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        g c10 = oa.i.c(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        boolean equals = action.equals("com.android.vending.billing.PURCHASES_UPDATED");
        o oVar = this.f4898a;
        if (equals) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                arrayList = new ArrayList();
                if (stringArrayList != null && stringArrayList2 != null) {
                    int size = stringArrayList.size();
                    oa.i.e("BillingHelper", "Found purchase list of " + size + " items");
                    for (int i6 = 0; i6 < stringArrayList.size() && i6 < stringArrayList2.size(); i6++) {
                        Purchase h10 = oa.i.h(stringArrayList.get(i6), stringArrayList2.get(i6));
                        if (h10 != null) {
                            arrayList.add(h10);
                        }
                    }
                } else {
                    Purchase h11 = oa.i.h(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                    if (h11 == null) {
                        oa.i.e("BillingHelper", "Couldn't find single purchase data as well.");
                    } else {
                        arrayList.add(h11);
                    }
                }
                oVar.i(c10, arrayList);
            }
            arrayList = null;
            oVar.i(c10, arrayList);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            intent.getExtras();
            if (c10.f4918a != 0) {
                oa.o oVar2 = oa.q.f27340v;
                oVar.i(c10, oa.b.f27315y);
                return;
            }
            oa.i.f("BillingBroadcastManager", "AlternativeBillingListener is null.");
            g gVar = z.f;
            oa.o oVar3 = oa.q.f27340v;
            oVar.i(gVar, oa.b.f27315y);
        }
    }
}
