package nn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.VolleyError;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.monetization.models.CampaignElementModel;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
/* compiled from: DynamicCampaignFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/a1;", "Lrn/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a1 extends rn.d {
    public static final /* synthetic */ int K = 0;
    public String A;
    public List<c4.h> B;
    public String D;
    public rn.a E;
    public rn.c F;
    public int G;
    public ArrayList<CampaignElementModel> H;
    public MonetizationViewModel I;

    /* renamed from: w  reason: collision with root package name */
    public MonetizationActivity f26422w;

    /* renamed from: x  reason: collision with root package name */
    public String f26423x;

    /* renamed from: y  reason: collision with root package name */
    public String f26424y;

    /* renamed from: z  reason: collision with root package name */
    public String f26425z;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f26421v = LogHelper.INSTANCE.makeLogTag("DynamicCampaignFragment");
    public ArrayList<String> C = new ArrayList<>();

    /* compiled from: DynamicCampaignFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.q<Boolean, JSONObject, VolleyError, hs.k> {
        public a() {
            super(3);
        }

        @Override // ss.q
        public final hs.k invoke(Boolean bool, JSONObject jSONObject, VolleyError volleyError) {
            String str;
            boolean booleanValue = bool.booleanValue();
            JSONObject jSONObject2 = jSONObject;
            a1 a1Var = a1.this;
            boolean z10 = false;
            a1Var.Q(false);
            String str2 = a1Var.f26421v;
            if (booleanValue) {
                try {
                    if (a1Var.isAdded()) {
                        try {
                            a1Var.X().P = true;
                            Bundle bundle = new Bundle();
                            bundle.putString("plan", a1Var.Z());
                            bundle.putString("source", a1Var.X().B);
                            bundle.putBoolean("isOnboarding", a1Var.X().F);
                            bundle.putBoolean("signup_flow", a1Var.X().G);
                            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                            if (String.valueOf(jSONObject2).length() > 0) {
                                z10 = true;
                            }
                            if (z10) {
                                bundle.putString("serverResponse", String.valueOf(jSONObject2));
                            }
                            try {
                                StringBuilder sb2 = new StringBuilder("dynamic_");
                                CampaignModel campaignModel = a1Var.Y().B;
                                if (campaignModel != null) {
                                    str = campaignModel.getCampaignType();
                                } else {
                                    str = null;
                                }
                                sb2.append(str);
                                bundle.putString("screen", sb2.toString());
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(str2, e10);
                            }
                            if (a1Var.X().F || a1Var.X().G) {
                                bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                            }
                            gk.a.b(bundle, "premuim_buy_success");
                            a1Var.X().x0(true);
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(str2, e11);
                        }
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(str2, e12);
                }
            } else {
                try {
                    if (a1Var.isAdded()) {
                        try {
                            Utils.INSTANCE.showCustomToast(a1Var.X(), "Oops... Something went wrong. Please try again!");
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(str2, e13);
                        }
                    }
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e(str2, e14);
                }
            }
            return hs.k.f19476a;
        }
    }

    public a1() {
        new JSONObject();
        this.D = "";
    }

    @Override // rn.d
    public final void F() {
        String str;
        String str2 = this.f26421v;
        try {
            String str3 = null;
            if (kotlin.jvm.internal.i.b(Z(), Constants.SUBSCRIPTION_BASIC_FREE)) {
                Bundle bundle = new Bundle();
                bundle.putString("plan", Z());
                bundle.putString("source", X().B);
                bundle.putBoolean("isOnboarding", X().F);
                bundle.putBoolean("signup_flow", X().G);
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                try {
                    StringBuilder sb2 = new StringBuilder("dynamic_");
                    CampaignModel campaignModel = Y().B;
                    if (campaignModel != null) {
                        str3 = campaignModel.getCampaignType();
                    }
                    sb2.append(str3);
                    bundle.putString("screen", sb2.toString());
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str2, e10);
                }
                if (X().F || X().G) {
                    bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                }
                gk.a.b(bundle, "premium_buy_click");
                Q(true);
                new on.b().c(X().T, new a());
                return;
            }
            try {
                StringBuilder sb3 = new StringBuilder("dynamic_");
                CampaignModel campaignModel2 = Y().B;
                if (campaignModel2 != null) {
                    str = campaignModel2.getCampaignType();
                } else {
                    str = null;
                }
                sb3.append(str);
                String sb4 = sb3.toString();
                MonetizationActivity X = X();
                kotlin.jvm.internal.i.g(sb4, "<set-?>");
                X.X = sb4;
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str2, e11);
            }
            MonetizationActivity X2 = X();
            String Z = Z();
            String str4 = this.f26424y;
            if (str4 != null) {
                String str5 = this.f26425z;
                if (str5 != null) {
                    String str6 = this.A;
                    if (str6 != null) {
                        X2.o0(Z, str4, str5, str6);
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("selectedCurrency");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("selectedPrice");
                throw null;
            }
            kotlin.jvm.internal.i.q("selectedOfferToken");
            throw null;
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str2, e12);
        }
        LogHelper.INSTANCE.e(str2, e12);
    }

    @Override // rn.d
    public final List<c4.h> I() {
        List<c4.h> list = this.B;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.i.q("productDetailList");
        throw null;
    }

    @Override // rn.d
    public final ArrayList<String> J() {
        return this.C;
    }

    @Override // rn.d
    public final void K(String str, String str2, boolean z10) {
        try {
            if (z10) {
                this.f26423x = str2;
                X().T = str;
                X().U = str2;
                rn.c cVar = this.F;
                if (cVar != null) {
                    cVar.I(str2);
                    rn.a aVar = this.E;
                    if (aVar != null) {
                        aVar.I(str2);
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("ctaBlock");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("skuBlock");
                throw null;
            }
            rn.c cVar2 = this.F;
            if (cVar2 != null) {
                cVar2.J();
            } else {
                kotlin.jvm.internal.i.q("skuBlock");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26421v, e10);
        }
    }

    @Override // rn.d
    public final void M(String str, String str2, String price, String str3) {
        kotlin.jvm.internal.i.g(price, "price");
        try {
            this.f26423x = str;
            this.f26424y = str2;
            this.f26425z = price;
            this.A = str3;
            a0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26421v, e10);
        }
    }

    @Override // rn.d
    public final void O() {
        String str;
        try {
            StringBuilder sb2 = new StringBuilder("dynamic_");
            CampaignModel campaignModel = Y().B;
            if (campaignModel != null) {
                str = campaignModel.getCampaignType();
            } else {
                str = null;
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            MonetizationActivity X = X();
            kotlin.jvm.internal.i.g(sb3, "<set-?>");
            X.X = sb3;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26421v, e10);
        }
        X().v0();
    }

    @Override // rn.d
    public final void P() {
        X().w0();
    }

    @Override // rn.d
    public final void Q(boolean z10) {
        try {
            if (isAdded()) {
                Y().k().l(Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26421v, e10);
        }
    }

    @Override // rn.d
    public final void S() {
        X().y0();
    }

    @Override // rn.d
    public final void U() {
        try {
            int i6 = this.G + 1;
            this.G = i6;
            ArrayList<CampaignElementModel> arrayList = this.H;
            if (arrayList != null && i6 == arrayList.size()) {
                a0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26421v, e10);
        }
    }

    public final MonetizationActivity X() {
        MonetizationActivity monetizationActivity = this.f26422w;
        if (monetizationActivity != null) {
            return monetizationActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final MonetizationViewModel Y() {
        MonetizationViewModel monetizationViewModel = this.I;
        if (monetizationViewModel != null) {
            return monetizationViewModel;
        }
        kotlin.jvm.internal.i.q("monetizationViewModel");
        throw null;
    }

    public final String Z() {
        String str = this.f26423x;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("selected");
        throw null;
    }

    @Override // rn.d
    public final void _$_clearFindViewByIdCache() {
        this.J.clear();
    }

    public final void a0() {
        try {
            rn.a aVar = this.E;
            if (aVar != null && this.f26423x != null) {
                if (aVar != null) {
                    aVar.I(Z());
                } else {
                    kotlin.jvm.internal.i.q("ctaBlock");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26421v, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_dynamic_campaign, viewGroup, false);
    }

    @Override // rn.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new androidx.lifecycle.o0(requireActivity).a(MonetizationViewModel.class);
        kotlin.jvm.internal.i.g(monetizationViewModel, "<set-?>");
        this.I = monetizationViewModel;
        MonetizationViewModel Y = Y();
        Y.j().e(getViewLifecycleOwner(), new k(3, new b1(this)));
        Y.i().e(getViewLifecycleOwner(), new k(4, new c1(this)));
        Y.h().e(getViewLifecycleOwner(), new k(5, new e1(Y, this)));
    }
}
