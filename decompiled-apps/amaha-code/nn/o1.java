package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.models.CampaignElementModel;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: MiniMonetizationParentFragment.kt */
/* loaded from: classes2.dex */
public final class o1 extends kotlin.jvm.internal.k implements ss.l<List<? extends c4.h>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m1 f26566u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(m1 m1Var) {
        super(1);
        this.f26566u = m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss.l
    public final hs.k invoke(List<? extends c4.h> list) {
        String str;
        ArrayList<CampaignElementModel> arrayList;
        Iterator it;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        String str2;
        Iterator it2;
        Iterator it3;
        List<? extends c4.h> list2 = list;
        if (list2 != null) {
            m1 m1Var = this.f26566u;
            m1Var.getClass();
            m1Var.B = list2;
            String str3 = m1Var.f26549v;
            try {
                androidx.fragment.app.p requireActivity = m1Var.requireActivity();
                kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity");
                m1Var.f26550w = (MiniMonetizationActivity) requireActivity;
                androidx.fragment.app.y childFragmentManager = m1Var.getChildFragmentManager();
                kotlin.jvm.internal.i.f(childFragmentManager, "this@MiniMonetizationPar…ment.childFragmentManager");
                CampaignModel campaignModel = m1Var.Y().B;
                if (campaignModel != null) {
                    str = campaignModel.getTemplateColor();
                } else {
                    str = null;
                }
                m1Var.D = String.valueOf(str);
                CampaignModel campaignModel2 = m1Var.Y().B;
                if (campaignModel2 != null) {
                    arrayList = campaignModel2.getMiniSellingScreen();
                } else {
                    arrayList = null;
                }
                m1Var.H = arrayList;
                if (arrayList != null) {
                    Iterator it4 = arrayList.iterator();
                    int i6 = 1;
                    while (it4.hasNext()) {
                        CampaignElementModel campaignElementModel = (CampaignElementModel) it4.next();
                        ArrayList<HashMap<String, Object>> attributes = campaignElementModel.getAttributes();
                        LogHelper.INSTANCE.makeLogTag(on.b.class);
                        rn.b a10 = on.b.a(campaignElementModel.getName());
                        if (a10 != null) {
                            Bundle bundle = new Bundle();
                            Iterator it5 = attributes.iterator();
                            while (it5.hasNext()) {
                                HashMap hashMap = (HashMap) it5.next();
                                Object obj = hashMap.get("label");
                                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                                String str4 = (String) obj;
                                Object obj2 = hashMap.get(str4);
                                if (obj2 != null) {
                                    Object obj3 = hashMap.get("data_type");
                                    it2 = it5;
                                    if (kotlin.jvm.internal.i.b(obj3, "lottie")) {
                                        String str5 = (String) is.k.b2(gv.r.a1((String) obj2, new String[]{"/"}, 0, 6).toArray(new String[0]));
                                        if (str5 != null) {
                                            bundle.putString(str4, str5);
                                        }
                                    } else if (kotlin.jvm.internal.i.b(obj3, "list_skus")) {
                                        bundle.putStringArrayList(str4, (ArrayList) obj2);
                                    } else if (kotlin.jvm.internal.i.b(obj3, "text_input")) {
                                        bundle.putString(str4, (String) obj2);
                                    } else if (kotlin.jvm.internal.i.b(obj3, "text_area")) {
                                        bundle.putString(str4, (String) obj2);
                                    } else if (kotlin.jvm.internal.i.b(obj3, Constants.API_COURSE_LINK)) {
                                        String str6 = (String) is.k.b2(gv.r.a1((String) obj2, new String[]{"/"}, 0, 6).toArray(new String[0]));
                                        if (str6 != null) {
                                            bundle.putString(str4, str6);
                                        }
                                    } else {
                                        if (kotlin.jvm.internal.i.b(obj3, "list_links")) {
                                            ArrayList arrayList2 = (ArrayList) obj2;
                                            ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
                                            Iterator it6 = arrayList2.iterator();
                                            while (it6.hasNext()) {
                                                Iterator it7 = it6;
                                                Iterator it8 = it4;
                                                String str7 = (String) is.k.b2(gv.r.a1((String) it6.next(), new String[]{"/"}, 0, 6).toArray(new String[0]));
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                arrayList3.add(str7);
                                                it6 = it7;
                                                it4 = it8;
                                            }
                                            it3 = it4;
                                            bundle.putStringArrayList(str4, new ArrayList<>(arrayList3));
                                        } else {
                                            it3 = it4;
                                            if (kotlin.jvm.internal.i.b(obj3, "list_text")) {
                                                bundle.putStringArrayList(str4, (ArrayList) obj2);
                                            } else if (kotlin.jvm.internal.i.b(obj3, "list_faq")) {
                                                Object obj4 = hashMap.get("label");
                                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                                                if (!gv.r.J0((String) obj4, "ios")) {
                                                    ArrayList<String> arrayList4 = new ArrayList<>();
                                                    ArrayList<String> arrayList5 = new ArrayList<>();
                                                    for (Map map : (ArrayList) obj2) {
                                                        String str8 = (String) map.get("question");
                                                        if (str8 != null) {
                                                            arrayList4.add(str8);
                                                        }
                                                        String str9 = (String) map.get("answer");
                                                        if (str9 != null) {
                                                            arrayList5.add(str9);
                                                        }
                                                    }
                                                    bundle.putStringArrayList("faq1_questions_list", arrayList4);
                                                    bundle.putStringArrayList("faq1_answers_list", arrayList5);
                                                }
                                            }
                                        }
                                        it5 = it2;
                                        it4 = it3;
                                    }
                                } else {
                                    it2 = it5;
                                }
                                it3 = it4;
                                it5 = it2;
                                it4 = it3;
                            }
                            it = it4;
                            if (!gv.r.J0(campaignElementModel.getName(), "SKU")) {
                                gv.r.J0(campaignElementModel.getName(), "CC");
                            }
                            bundle.putString("template_colour", m1Var.D);
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("dynamic_");
                                CampaignModel campaignModel3 = m1Var.Y().B;
                                if (campaignModel3 != null) {
                                    str2 = campaignModel3.getCampaignType();
                                } else {
                                    str2 = null;
                                }
                                sb2.append(str2);
                                sb2.append("mini");
                                bundle.putString("screen", sb2.toString());
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(str3, e10);
                            }
                            a10.setArguments(bundle);
                            if (gv.r.J0(campaignElementModel.getName(), "CTA")) {
                                m1Var.E = (rn.a) a10;
                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                                aVar.f(R.id.ctaContainer, a10, campaignElementModel.getName());
                                aVar.j();
                                childFragmentManager.B();
                            } else {
                                LayoutInflater layoutInflater = m1Var.X().getLayoutInflater();
                                View view = m1Var.getView();
                                if (view != null) {
                                    viewGroup = (ViewGroup) view.findViewById(R.id.elementContainer);
                                } else {
                                    viewGroup = null;
                                }
                                View inflate = layoutInflater.inflate(R.layout.row_campaign_blank, viewGroup, false);
                                View view2 = m1Var.getView();
                                if (view2 != null) {
                                    linearLayout = (LinearLayout) view2.findViewById(R.id.elementContainer);
                                } else {
                                    linearLayout = null;
                                }
                                kotlin.jvm.internal.i.e(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
                                linearLayout.addView(inflate);
                                inflate.setId(i6);
                                i6++;
                                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
                                aVar2.f(inflate.getId(), a10, campaignElementModel.getName());
                                aVar2.j();
                                childFragmentManager.B();
                                if (gv.r.J0(campaignElementModel.getName(), "SKU")) {
                                    m1Var.F = (rn.c) a10;
                                }
                            }
                        } else {
                            it = it4;
                        }
                        it4 = it;
                    }
                }
                ((AppCompatImageView) m1Var._$_findCachedViewById(R.id.arrow_back)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(m1Var.D)));
                ((AppCompatImageView) m1Var._$_findCachedViewById(R.id.arrow_back)).setOnClickListener(new v0(2, m1Var));
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str3, e11);
            }
        }
        return hs.k.f19476a;
    }
}
