package com.theinnerhour.b2b.components.monetization.viewModel;

import android.content.SharedPreferences;
import c4.c;
import c4.l;
import c4.q;
import c4.t;
import c4.u;
import c4.z;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.appsflyer.R;
import com.google.gson.reflect.TypeToken;
import hs.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.j;
import kotlinx.coroutines.r;
import ls.d;
import ms.a;
import ns.e;
import ns.i;
import org.json.JSONArray;
import org.json.JSONObject;
import sp.b;
import ss.p;
/* compiled from: MonetizationRepository.kt */
@e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1", f = "MonetizationRepository.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1 extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f11446u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f11447v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ androidx.work.k f11448w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ q f11449x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ j<ArrayList<String>> f11450y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1(androidx.work.k kVar, q qVar, j<? super ArrayList<String>> jVar, d<? super MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1> dVar) {
        super(2, dVar);
        this.f11448w = kVar;
        this.f11449x = qVar;
        this.f11450y = jVar;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1 monetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1 = new MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1(this.f11448w, this.f11449x, this.f11450y, dVar);
        monetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1.f11447v = obj;
        return monetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i6 = this.f11446u;
        if (i6 != 0) {
            if (i6 == 1) {
                d0 d0Var = (d0) this.f11447v;
                b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.d0(obj);
            d0 d0Var2 = (d0) this.f11447v;
            String str = this.f11449x.f4948a;
            if (str != null) {
                this.f11447v = d0Var2;
                this.f11446u = 1;
                r rVar = new r(null);
                c cVar = new c(rVar);
                c4.a aVar2 = (c4.a) this.f11448w;
                aVar2.getClass();
                if (!aVar2.D()) {
                    cVar.a(z.f4977h, null);
                } else if (aVar2.H(new t(2, aVar2, str, cVar), 30000L, new u(3, cVar), aVar2.E()) == null) {
                    cVar.a(aVar2.G(), null);
                }
                obj = rVar.x(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException("Product type must be set");
            }
        }
        l lVar = (l) obj;
        int i10 = lVar.f4938a.f4918a;
        j<ArrayList<String>> jVar = this.f11450y;
        if (i10 == 0) {
            ArrayList arrayList = new ArrayList();
            List<PurchaseHistoryRecord> list = lVar.f4939b;
            if (list != null) {
                for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                    purchaseHistoryRecord.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObject = purchaseHistoryRecord.f5863c;
                    if (jSONObject.has("productIds")) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
                        if (optJSONArray != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                arrayList2.add(optJSONArray.optString(i11));
                            }
                        }
                    } else if (jSONObject.has("productId")) {
                        arrayList2.add(jSONObject.optString("productId"));
                    }
                    arrayList.addAll(arrayList2);
                }
                if (arrayList.size() > 0) {
                    Type type = new TypeToken<ArrayList<String>>() { // from class: com.theinnerhour.b2b.components.monetization.viewModel.MonetizationRepository$fetchPaymentHistory$2$1$onBillingSetupFinished$1$1$typeToken$1
                    }.getType();
                    SharedPreferences sharedPreferences = pn.a.f28723a;
                    String h10 = new sf.i().h(arrayList, type);
                    if (h10 != null) {
                        SharedPreferences.Editor edit = pn.a.f28723a.edit();
                        edit.putString("purchase_history", h10);
                        edit.apply();
                    }
                }
                if (jVar.a()) {
                    jVar.resumeWith(arrayList);
                }
                kVar = k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null && jVar.a()) {
                jVar.resumeWith(null);
            }
        } else if (jVar.a()) {
            jVar.resumeWith(null);
        }
        return k.f19476a;
    }
}
