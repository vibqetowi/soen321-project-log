package c4;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import c4.p;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import ta.b3;
import ta.d4;
import ta.d6;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4955u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f4956v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f4957w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f4958x;

    public /* synthetic */ t(int i6, Object obj, Object obj2, Object obj3) {
        this.f4955u = i6;
        this.f4957w = obj;
        this.f4956v = obj2;
        this.f4958x = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
        r2 = "Item is unavailable for purchase.";
        r0 = 4;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        y yVar;
        Bundle J0;
        y yVar2;
        String str;
        int i6;
        int i10;
        String str2;
        String str3 = "INAPP_DATA_SIGNATURE_LIST";
        String str4 = "INAPP_PURCHASE_DATA_LIST";
        switch (this.f4955u) {
            case 0:
                a aVar = (a) this.f4957w;
                return aVar.f4884g.x1(aVar.f.getPackageName(), (String) this.f4956v, (String) this.f4958x);
            case 1:
                a aVar2 = (a) this.f4957w;
                String str5 = (String) this.f4956v;
                oa.i.e("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str5)));
                ArrayList arrayList = new ArrayList();
                boolean z10 = aVar2.f4889l;
                boolean z11 = aVar2.f4894q;
                Bundle a10 = r1.b0.a("playBillingLibraryVersion", aVar2.f4881c);
                if (z10 && z11) {
                    a10.putBoolean("enablePendingPurchases", true);
                }
                String str6 = null;
                while (true) {
                    try {
                        if (aVar2.f4889l) {
                            J0 = aVar2.f4884g.z1(aVar2.f.getPackageName(), str5, str6, a10);
                        } else {
                            J0 = aVar2.f4884g.J0(aVar2.f.getPackageName(), str5, str6);
                        }
                        g a11 = a0.a("getPurchase()", J0);
                        if (a11 != z.f4976g) {
                            yVar = new y(a11, null, 1);
                        } else {
                            ArrayList<String> stringArrayList = J0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList2 = J0.getStringArrayList(str4);
                            ArrayList<String> stringArrayList3 = J0.getStringArrayList(str3);
                            a aVar3 = aVar2;
                            Bundle bundle = a10;
                            int i11 = 0;
                            while (i11 < stringArrayList2.size()) {
                                String str7 = stringArrayList2.get(i11);
                                String str8 = str3;
                                String str9 = stringArrayList3.get(i11);
                                ArrayList<String> arrayList2 = stringArrayList;
                                String str10 = str4;
                                oa.i.e("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                                try {
                                    Purchase purchase = new Purchase(str7, str9);
                                    if (TextUtils.isEmpty(purchase.b())) {
                                        oa.i.f("BillingClient", "BUG: empty/null token!");
                                    }
                                    arrayList.add(purchase);
                                    i11++;
                                    str4 = str10;
                                    str3 = str8;
                                    stringArrayList = arrayList2;
                                } catch (JSONException e10) {
                                    oa.i.g("BillingClient", "Got an exception trying to decode the purchase!", e10);
                                    yVar = new y(z.f, null, 1);
                                }
                            }
                            String str11 = str3;
                            String str12 = str4;
                            str6 = J0.getString("INAPP_CONTINUATION_TOKEN");
                            oa.i.e("BillingClient", "Continuation token: ".concat(String.valueOf(str6)));
                            if (TextUtils.isEmpty(str6)) {
                                yVar = new y(z.f4976g, arrayList, 1);
                            } else {
                                a10 = bundle;
                                aVar2 = aVar3;
                                str4 = str12;
                                str3 = str11;
                            }
                        }
                    } catch (Exception e11) {
                        oa.i.g("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                        yVar = new y(z.f4977h, null, 1);
                    }
                }
                List<Purchase> list = yVar.f4969a;
                if (list != null) {
                    ((d) ((m) this.f4958x)).a(yVar.f4970b, list);
                    return null;
                }
                g gVar = yVar.f4970b;
                oa.o oVar = oa.q.f27340v;
                ((d) ((m) this.f4958x)).a(gVar, oa.b.f27315y);
                return null;
            case 2:
                a aVar4 = (a) this.f4957w;
                String str13 = (String) this.f4956v;
                oa.i.e("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str13)));
                ArrayList arrayList3 = new ArrayList();
                boolean z12 = aVar4.f4889l;
                boolean z13 = aVar4.f4894q;
                Bundle a12 = r1.b0.a("playBillingLibraryVersion", aVar4.f4881c);
                if (z12 && z13) {
                    a12.putBoolean("enablePendingPurchases", true);
                }
                String str14 = null;
                while (true) {
                    if (!aVar4.f4888k) {
                        oa.i.f("BillingClient", "getPurchaseHistory is not supported on current device");
                        yVar2 = new y(z.f4980k, null, 0);
                    } else {
                        try {
                            Bundle V0 = aVar4.f4884g.V0(aVar4.f.getPackageName(), str13, str14, a12);
                            g a13 = a0.a("getPurchaseHistory()", V0);
                            if (a13 != z.f4976g) {
                                yVar2 = new y(a13, null, 0);
                            } else {
                                ArrayList<String> stringArrayList4 = V0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList5 = V0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList6 = V0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                a aVar5 = aVar4;
                                Bundle bundle2 = a12;
                                int i12 = 0;
                                while (i12 < stringArrayList5.size()) {
                                    String str15 = stringArrayList5.get(i12);
                                    String str16 = str13;
                                    String str17 = stringArrayList6.get(i12);
                                    ArrayList<String> arrayList4 = stringArrayList4;
                                    ArrayList<String> arrayList5 = stringArrayList5;
                                    oa.i.e("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList4.get(i12))));
                                    try {
                                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str15, str17);
                                        JSONObject jSONObject = purchaseHistoryRecord.f5863c;
                                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                            oa.i.f("BillingClient", "BUG: empty/null token!");
                                        }
                                        arrayList3.add(purchaseHistoryRecord);
                                        i12++;
                                        stringArrayList5 = arrayList5;
                                        str13 = str16;
                                        stringArrayList4 = arrayList4;
                                    } catch (JSONException e12) {
                                        oa.i.g("BillingClient", "Got an exception trying to decode the purchase!", e12);
                                        yVar2 = new y(z.f, null, 0);
                                    }
                                }
                                String str18 = str13;
                                str14 = V0.getString("INAPP_CONTINUATION_TOKEN");
                                oa.i.e("BillingClient", "Continuation token: ".concat(String.valueOf(str14)));
                                if (TextUtils.isEmpty(str14)) {
                                    yVar2 = new y(z.f4976g, arrayList3, 0);
                                } else {
                                    a12 = bundle2;
                                    aVar4 = aVar5;
                                    str13 = str18;
                                }
                            }
                        } catch (RemoteException e13) {
                            oa.i.g("BillingClient", "Got exception trying to get purchase history, try to reconnect", e13);
                            yVar2 = new y(z.f4977h, null, 0);
                        }
                    }
                }
                ((c) ((k) this.f4958x)).a(yVar2.f4970b, yVar2.f4969a);
                return null;
            case 3:
                a aVar6 = (a) this.f4957w;
                p pVar = (p) this.f4956v;
                i iVar = (i) this.f4958x;
                aVar6.getClass();
                ArrayList arrayList6 = new ArrayList();
                String str19 = ((p.b) pVar.f4942a.get(0)).f4945b;
                oa.q qVar = pVar.f4942a;
                int size = qVar.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size) {
                        int i14 = i13 + 20;
                        if (i14 > size) {
                            i10 = size;
                        } else {
                            i10 = i14;
                        }
                        ArrayList arrayList7 = new ArrayList(qVar.subList(i13, i10));
                        ArrayList<String> arrayList8 = new ArrayList<>();
                        int size2 = arrayList7.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            arrayList8.add(((p.b) arrayList7.get(i15)).f4944a);
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putStringArrayList("ITEM_ID_LIST", arrayList8);
                        bundle3.putString("playBillingLibraryVersion", aVar6.f4881c);
                        try {
                            Bundle T0 = aVar6.f4884g.T0(aVar6.f.getPackageName(), str19, bundle3, oa.i.b(aVar6.f4881c, arrayList7));
                            if (T0 == null) {
                                oa.i.f("BillingClient", "queryProductDetailsAsync got empty product details response.");
                                break;
                            } else if (!T0.containsKey("DETAILS_LIST")) {
                                i6 = oa.i.a(T0, "BillingClient");
                                str = oa.i.d(T0, "BillingClient");
                                if (i6 != 0) {
                                    oa.i.f("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i6);
                                } else {
                                    oa.i.f("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                }
                            } else {
                                ArrayList<String> stringArrayList7 = T0.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList7 == null) {
                                    oa.i.f("BillingClient", "queryProductDetailsAsync got null response list");
                                    break;
                                } else {
                                    for (int i16 = 0; i16 < stringArrayList7.size(); i16++) {
                                        try {
                                            h hVar = new h(stringArrayList7.get(i16));
                                            oa.i.e("BillingClient", "Got product details: ".concat(hVar.toString()));
                                            arrayList6.add(hVar);
                                        } catch (JSONException e14) {
                                            oa.i.g("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e14);
                                            str2 = "Error trying to decode SkuDetails.";
                                            str = str2;
                                            i6 = 6;
                                            g gVar2 = new g();
                                            gVar2.f4918a = i6;
                                            gVar2.f4919b = str;
                                            ((b) iVar).a(gVar2, arrayList6);
                                            return null;
                                        }
                                    }
                                    i13 = i14;
                                }
                            }
                        } catch (Exception e15) {
                            oa.i.g("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e15);
                            str2 = "An internal error occurred.";
                        }
                    } else {
                        str = "";
                        i6 = 0;
                    }
                }
                g gVar22 = new g();
                gVar22.f4918a = i6;
                gVar22.f4919b = str;
                ((b) iVar).a(gVar22, arrayList6);
                return null;
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.f4957w).getBoolean((String) this.f4956v, ((Boolean) this.f4958x).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f4957w).getInt((String) this.f4956v, ((Integer) this.f4958x).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f4957w).getLong((String) this.f4956v, ((Long) this.f4958x).longValue()));
            case 7:
                return ((SharedPreferences) this.f4957w).getString((String) this.f4956v, (String) this.f4958x);
            default:
                d4 d4Var = (d4) this.f4958x;
                d4Var.f32521a.e();
                b3 b3Var = d4Var.f32521a.B;
                d6.H(b3Var);
                b3Var.h();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public t(d4 d4Var, ta.s sVar, String str) {
        this.f4955u = 8;
        this.f4958x = d4Var;
        this.f4957w = sVar;
        this.f4956v = str;
    }
}
