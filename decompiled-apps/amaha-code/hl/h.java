package hl;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.components.monetization.models.CampaignElementModel;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nn.x0;
import nn.z0;
/* compiled from: CustomDashboardFragment.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f17695u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, MonetizationViewModel monetizationViewModel) {
        super(1);
        this.f17695u = gVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        View view;
        ArrayList<CampaignElementModel> arrayList;
        CampaignElementModel campaignElementModel;
        Object obj;
        Object obj2;
        Boolean it = bool;
        kotlin.jvm.internal.i.f(it, "it");
        if (it.booleanValue()) {
            g gVar = this.f17695u;
            MonetizationViewModel monetizationViewModel = gVar.f17679w;
            hs.k kVar = null;
            if (monetizationViewModel != null) {
                CampaignModel campaignModel = monetizationViewModel.B;
                if (campaignModel != null) {
                    arrayList = campaignModel.getDashboardCard();
                } else {
                    arrayList = null;
                }
                if (arrayList != null && (campaignElementModel = (CampaignElementModel) is.u.j2(0, arrayList)) != null) {
                    if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        if (kotlin.jvm.internal.i.b(campaignElementModel.getName(), "DBC1")) {
                            ArrayList k10 = ca.a.k("dbc1_title", "dbc1_title_color", "dbc1_description", "dbc1_description_color", "dbc1_cta", "dbc1_cta_text_color", "dbc1_cta_bg_color", "dbc1_image");
                            x0 x0Var = new x0();
                            Bundle bundle = new Bundle();
                            Iterator<HashMap<String, Object>> it2 = campaignElementModel.getAttributes().iterator();
                            while (it2.hasNext()) {
                                HashMap<String, Object> next = it2.next();
                                Iterator it3 = k10.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj2 = it3.next();
                                        if (next.containsKey((String) obj2)) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                String str = (String) obj2;
                                if (str != null) {
                                    if (gv.r.J0(str, "image")) {
                                        Object obj3 = next.get(str);
                                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                                        bundle.putString(str, (String) is.k.a2(new gv.e("/").c((String) obj3).toArray(new String[0])));
                                    } else {
                                        Object obj4 = next.get(str);
                                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                                        bundle.putString(str, (String) obj4);
                                    }
                                    k10.remove(str);
                                }
                            }
                            x0Var.setArguments(bundle);
                            gVar.J(x0Var);
                        } else if (kotlin.jvm.internal.i.b(campaignElementModel.getName(), "DBC2")) {
                            ArrayList k11 = ca.a.k("dbc2_question", "dbc2_question_color", "dbc2_answer1", "dbc2_answer2", "dbc2_answer_text_color", "dbc2_answer_bg_color", "dbc2_question_image", "dbc2_option1_title", "dbc2_option1_description", "dbc2_option1_cta", "dbc2_option2_title", "dbc2_option2_description", "dbc2_option2_cta", "dbc2_option_image", "dbc2_option_cta_text_color", "dbc2_option_cta_bg_color", "dbc2_option_title_color", "dbc2_option_description_color", "dbc2_option0_title", "dbc2_option0_description");
                            z0 z0Var = new z0();
                            Bundle bundle2 = new Bundle();
                            Iterator<HashMap<String, Object>> it4 = campaignElementModel.getAttributes().iterator();
                            while (it4.hasNext()) {
                                HashMap<String, Object> next2 = it4.next();
                                Iterator it5 = k11.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj = it5.next();
                                        if (next2.containsKey((String) obj)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                String str2 = (String) obj;
                                if (str2 != null) {
                                    if (gv.r.J0(str2, "image")) {
                                        Object obj5 = next2.get(str2);
                                        kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                                        bundle2.putString(str2, (String) is.k.a2(new gv.e("/").c((String) obj5).toArray(new String[0])));
                                    } else {
                                        Object obj6 = next2.get(str2);
                                        kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                                        bundle2.putString(str2, (String) obj6);
                                    }
                                    k11.remove(str2);
                                }
                            }
                            z0Var.setArguments(bundle2);
                            gVar.J(z0Var);
                        }
                    }
                    kVar = hs.k.f19476a;
                }
            }
            if (kVar == null && (view = gVar.G.get(f.CAMPAIGN)) != null) {
                view.setVisibility(8);
            }
        }
        return hs.k.f19476a;
    }
}
