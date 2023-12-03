package nn;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.models.CampaignElementModel;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import q.d;
/* compiled from: MiniMonetizationParentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/m1;", "Lrn/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m1 extends rn.d {
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
    public MiniMonetizationActivity f26550w;

    /* renamed from: x  reason: collision with root package name */
    public String f26551x;

    /* renamed from: y  reason: collision with root package name */
    public String f26552y;

    /* renamed from: z  reason: collision with root package name */
    public String f26553z;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f26549v = LogHelper.INSTANCE.makeLogTag(m1.class);
    public ArrayList<String> C = new ArrayList<>();

    /* compiled from: MiniMonetizationParentFragment.kt */
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
            m1 m1Var = m1.this;
            m1Var.Q(false);
            String str2 = m1Var.f26549v;
            if (booleanValue) {
                try {
                    if (m1Var.isAdded()) {
                        try {
                            boolean z10 = true;
                            m1Var.X().P = true;
                            Bundle bundle = new Bundle();
                            bundle.putString("plan", m1Var.Z());
                            bundle.putString("source", m1Var.X().B);
                            bundle.putBoolean("isOnboarding", m1Var.X().F);
                            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                            if (String.valueOf(jSONObject2).length() <= 0) {
                                z10 = false;
                            }
                            if (z10) {
                                bundle.putString("serverResponse", String.valueOf(jSONObject2));
                            }
                            try {
                                StringBuilder sb2 = new StringBuilder("dynamic_");
                                CampaignModel campaignModel = m1Var.Y().B;
                                if (campaignModel != null) {
                                    str = campaignModel.getCampaignType();
                                } else {
                                    str = null;
                                }
                                sb2.append(str);
                                sb2.append("mini");
                                bundle.putString("screen", sb2.toString());
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(str2, e10);
                            }
                            if (m1Var.X().F) {
                                bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                            }
                            gk.a.b(bundle, "premuim_buy_success");
                            m1Var.X().x0(false);
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(str2, e11);
                        }
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(str2, e12);
                }
            } else {
                try {
                    if (m1Var.isAdded()) {
                        try {
                            Utils.INSTANCE.showCustomToast(m1Var.X(), "Oops... Something went wrong. Please try again!");
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

    public m1() {
        new JSONObject();
        this.D = "";
    }

    @Override // rn.d
    public final void F() {
        String str;
        String str2 = this.f26549v;
        try {
            String str3 = null;
            if (kotlin.jvm.internal.i.b(Z(), Constants.SUBSCRIPTION_BASIC_FREE)) {
                Bundle bundle = new Bundle();
                bundle.putString("plan", Z());
                bundle.putString("source", X().B);
                bundle.putBoolean("isOnboarding", X().F);
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                try {
                    StringBuilder sb2 = new StringBuilder("dynamic_");
                    CampaignModel campaignModel = Y().B;
                    if (campaignModel != null) {
                        str3 = campaignModel.getCampaignType();
                    }
                    sb2.append(str3);
                    sb2.append("mini");
                    bundle.putString("screen", sb2.toString());
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str2, e10);
                }
                if (X().F) {
                    bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                }
                gk.a.b(bundle, "premium_buy_click");
                Q(true);
                new on.b().c(X().S, new a());
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
                sb3.append("mini");
                String sb4 = sb3.toString();
                MiniMonetizationActivity X = X();
                kotlin.jvm.internal.i.g(sb4, "<set-?>");
                X.U = sb4;
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str2, e11);
            }
            MiniMonetizationActivity X2 = X();
            String Z = Z();
            String str4 = this.f26552y;
            if (str4 != null) {
                String str5 = this.f26553z;
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
                this.f26551x = str2;
                X().S = str;
                X();
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
            LogHelper.INSTANCE.e(this.f26549v, e10);
        }
    }

    @Override // rn.d
    public final void M(String str, String str2, String price, String str3) {
        kotlin.jvm.internal.i.g(price, "price");
        try {
            this.f26551x = str;
            this.f26552y = str2;
            this.f26553z = price;
            this.A = str3;
            a0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26549v, e10);
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
            sb2.append("mini");
            String sb3 = sb2.toString();
            MiniMonetizationActivity X = X();
            kotlin.jvm.internal.i.g(sb3, "<set-?>");
            X.U = sb3;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26549v, e10);
        }
        MiniMonetizationActivity X2 = X();
        String str2 = "plus";
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_feedback_fullscreen, X2, R.style.Theme_Dialog_Fullscreen);
            View findViewById = styledDialog.findViewById(R.id.robertoTextView);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(X2.getString(R.string.monetization_feedback));
            View findViewById2 = styledDialog.findViewById(R.id.btnSubmit);
            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
            ((RobertoButton) findViewById2).setOnClickListener(new pl.w0(styledDialog, 27, X2));
            View findViewById3 = styledDialog.findViewById(R.id.btnSkip);
            kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
            ((RobertoButton) findViewById3).setOnClickListener(new lm.f(styledDialog, 5));
            View findViewById4 = styledDialog.findViewById(R.id.close);
            kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) findViewById4).setOnClickListener(new lm.f(styledDialog, 6));
            Window window = styledDialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            styledDialog.show();
            String str3 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("variant", "0");
            bundle.putString("screen", X2.U);
            if (!gv.r.J0(X2.U, "plus")) {
                str2 = "pro";
            }
            bundle.putString("package", str2);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "monetization_feedback_click");
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(X2.f11398v, "exception", e11);
        }
    }

    @Override // rn.d
    public final void P() {
        MiniMonetizationActivity X = X();
        try {
            if (new s5(15).b(X)) {
                d.b bVar = new d.b();
                Integer valueOf = Integer.valueOf(g0.a.b(X, R.color.dashboard_grey) | (-16777216));
                Bundle bundle = new Bundle();
                if (valueOf != null) {
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                }
                bVar.f29100c = bundle;
                bVar.a().a(X, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                return;
            }
            Intent intent = new Intent(X, WebviewActivity.class);
            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
            X.startActivity(intent);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(X.f11398v, e10);
        }
    }

    @Override // rn.d
    public final void Q(boolean z10) {
        try {
            if (isAdded()) {
                Y().k().l(Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26549v, e10);
        }
    }

    @Override // rn.d
    public final void S() {
        MiniMonetizationActivity X = X();
        try {
            if (new s5(15).b(X)) {
                d.b bVar = new d.b();
                Integer valueOf = Integer.valueOf(g0.a.b(X, R.color.dashboard_grey) | (-16777216));
                Bundle bundle = new Bundle();
                if (valueOf != null) {
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                }
                bVar.f29100c = bundle;
                bVar.a().a(X, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                return;
            }
            Intent intent = new Intent(X, WebviewActivity.class);
            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
            X.startActivity(intent);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(X.f11398v, e10);
        }
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
            LogHelper.INSTANCE.e(this.f26549v, e10);
        }
    }

    public final MiniMonetizationActivity X() {
        MiniMonetizationActivity miniMonetizationActivity = this.f26550w;
        if (miniMonetizationActivity != null) {
            return miniMonetizationActivity;
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
        String str = this.f26551x;
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

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
        Integer valueOf = Integer.valueOf((int) R.id.arrow_back);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.arrow_back)) != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void a0() {
        try {
            rn.a aVar = this.E;
            if (aVar != null && this.f26551x != null) {
                if (aVar != null) {
                    aVar.I(Z());
                } else {
                    kotlin.jvm.internal.i.q("ctaBlock");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26549v, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_mini_monetization_parent, viewGroup, false);
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
        Y.j().e(getViewLifecycleOwner(), new k(7, new n1(this)));
        Y.i().e(getViewLifecycleOwner(), new k(8, new o1(this)));
        Y.h().e(getViewLifecycleOwner(), new k(9, new q1(Y, this)));
    }
}
