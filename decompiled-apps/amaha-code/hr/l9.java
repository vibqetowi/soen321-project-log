package hr;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l9 implements View.OnClickListener {
    public final /* synthetic */ HashMap A;
    public final /* synthetic */ Object B;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18768u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f18769v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18770w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m9 f18771x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18772y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18773z;

    public /* synthetic */ l9(String str, kotlin.jvm.internal.x xVar, m9 m9Var, TemplateActivity templateActivity, kotlin.jvm.internal.x xVar2, kotlin.jvm.internal.x xVar3, HashMap hashMap) {
        this.f18769v = str;
        this.f18770w = xVar;
        this.f18771x = m9Var;
        this.B = templateActivity;
        this.f18772y = xVar2;
        this.f18773z = xVar3;
        this.A = hashMap;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18768u;
        HashMap params = this.A;
        kotlin.jvm.internal.x removedOptions = this.f18773z;
        kotlin.jvm.internal.x checkList = this.f18772y;
        m9 this$0 = this.f18771x;
        String tt2 = this.f18769v;
        kotlin.jvm.internal.x selectedOptions = this.f18770w;
        Object obj = this.B;
        switch (i6) {
            case 0:
                String slug = (String) obj;
                int i10 = m9.f18846w;
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(checkList, "$checkList");
                kotlin.jvm.internal.i.g(removedOptions, "$removedOptions");
                kotlin.jvm.internal.i.g(slug, "$slug");
                kotlin.jvm.internal.i.g(params, "$params");
                if (((HashSet) selectedOptions.f23469u).contains(tt2)) {
                    View childAt = ((LinearLayout) this$0._$_findCachedViewById(R.id.llS8List)).getChildAt(((ArrayList) checkList.f23469u).indexOf(tt2));
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    Object obj2 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) childAt.findViewById(R.id.chkBxSelected), childAt, R.id.tvLabel)).setFont("Lato-Medium.ttf");
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
                    ((HashSet) selectedOptions.f23469u).remove(tt2);
                    if (!((HashSet) removedOptions.f23469u).contains(tt2)) {
                        ((HashSet) removedOptions.f23469u).add(tt2);
                        return;
                    }
                    return;
                } else if (kotlin.jvm.internal.i.b(slug, "s8") && ((HashSet) selectedOptions.f23469u).size() == 3) {
                    if (params.containsKey("s8_error_2")) {
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        utils.showCustomToast(activity3, UtilFunKt.paramsMapToString(params.get("s8_error_2")));
                        return;
                    }
                    Utils utils2 = Utils.INSTANCE;
                    androidx.fragment.app.p activity4 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    String string = this$0.getString(R.string.max_3_options_to_select);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.max_3_options_to_select)");
                    utils2.showCustomToast(activity4, string);
                    return;
                } else if ((kotlin.jvm.internal.i.b(slug, "s8b") || kotlin.jvm.internal.i.b(slug, "s8-b")) && ((HashSet) selectedOptions.f23469u).size() == 2) {
                    if (params.containsKey("s8b_error_2")) {
                        Utils utils3 = Utils.INSTANCE;
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity5);
                        utils3.showCustomToast(activity5, UtilFunKt.paramsMapToString(params.get("s8b_error_2")));
                        return;
                    }
                    Utils utils4 = Utils.INSTANCE;
                    androidx.fragment.app.p activity6 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity6);
                    String string2 = this$0.getString(R.string.max_2_options_to_select);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.max_2_options_to_select)");
                    utils4.showCustomToast(activity6, string2);
                    return;
                } else {
                    ((HashSet) selectedOptions.f23469u).add(tt2);
                    View childAt2 = ((LinearLayout) this$0._$_findCachedViewById(R.id.llS8List)).getChildAt(((ArrayList) checkList.f23469u).indexOf(tt2));
                    androidx.fragment.app.p activity7 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity7);
                    Object obj3 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity7, R.drawable.ic_check_box_orange_24dp, (ImageView) childAt2.findViewById(R.id.chkBxSelected), childAt2, R.id.tvLabel)).setFont("Lato-Bold.ttf");
                    androidx.fragment.app.p activity8 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity8);
                    ((RobertoTextView) childAt2.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity8, R.color.title_high_contrast));
                    return;
                }
            default:
                TemplateActivity act = (TemplateActivity) obj;
                int i11 = m9.f18846w;
                kotlin.jvm.internal.i.g(tt2, "$slug");
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(checkList, "$removedOptions");
                kotlin.jvm.internal.i.g(removedOptions, "$checkList");
                kotlin.jvm.internal.i.g(params, "$params");
                try {
                    int hashCode = tt2.hashCode();
                    HashMap<String, Object> hashMap = act.F;
                    if (hashCode != 3621) {
                        if (hashCode != 3474684) {
                            if (hashCode != 3474687) {
                                if (hashCode == 3481274 && tt2.equals("s8-b")) {
                                    if (((HashSet) selectedOptions.f23469u).size() == 0) {
                                        if (params.containsKey("s8b_error_1")) {
                                            Utils utils5 = Utils.INSTANCE;
                                            androidx.fragment.app.p activity9 = this$0.getActivity();
                                            kotlin.jvm.internal.i.d(activity9);
                                            utils5.showCustomToast(activity9, UtilFunKt.paramsMapToString(params.get("s8b_error_1")));
                                        } else {
                                            Utils utils6 = Utils.INSTANCE;
                                            androidx.fragment.app.p activity10 = this$0.getActivity();
                                            kotlin.jvm.internal.i.d(activity10);
                                            String string3 = this$0.getString(R.string.select_any_2);
                                            kotlin.jvm.internal.i.f(string3, "getString(R.string.select_any_2)");
                                            utils6.showCustomToast(activity10, string3);
                                        }
                                    } else if (((HashSet) selectedOptions.f23469u).size() > 2) {
                                        if (params.containsKey("s8b_error_2")) {
                                            Utils utils7 = Utils.INSTANCE;
                                            androidx.fragment.app.p activity11 = this$0.getActivity();
                                            kotlin.jvm.internal.i.d(activity11);
                                            utils7.showCustomToast(activity11, UtilFunKt.paramsMapToString(params.get("s8b_error_2")));
                                        } else {
                                            Utils utils8 = Utils.INSTANCE;
                                            androidx.fragment.app.p activity12 = this$0.getActivity();
                                            kotlin.jvm.internal.i.d(activity12);
                                            String string4 = this$0.getString(R.string.max_2_options_to_select);
                                            kotlin.jvm.internal.i.f(string4, "getString(R.string.max_2_options_to_select)");
                                            utils8.showCustomToast(activity12, string4);
                                        }
                                    } else {
                                        androidx.fragment.app.p activity13 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity13).F.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                                        act.t0();
                                    }
                                    hashMap.put("s8_user_list", selectedOptions.f23469u);
                                    return;
                                }
                                androidx.fragment.app.p activity14 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity14).F.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                                act.t0();
                                hashMap.put("s8_user_list", selectedOptions.f23469u);
                                return;
                            } else if (tt2.equals("s134")) {
                                if (hashMap.get("list") == null) {
                                    Object obj4 = hashMap.get("list");
                                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    ((ArrayList) obj4).addAll(new ArrayList((Collection) selectedOptions.f23469u));
                                } else {
                                    Iterator it = ((HashSet) selectedOptions.f23469u).iterator();
                                    while (it.hasNext()) {
                                        String str = (String) it.next();
                                        Object obj5 = hashMap.get("list");
                                        kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        if (!((ArrayList) obj5).contains(str)) {
                                            Object obj6 = hashMap.get("list");
                                            kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            ((ArrayList) obj6).add(str);
                                        }
                                    }
                                    Iterator it2 = ((HashSet) checkList.f23469u).iterator();
                                    while (it2.hasNext()) {
                                        String str2 = (String) it2.next();
                                        if (!((HashSet) selectedOptions.f23469u).contains(str2)) {
                                            Object obj7 = hashMap.get("list");
                                            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            if (((ArrayList) obj7).contains(str2)) {
                                                Object obj8 = hashMap.get("list");
                                                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                ((ArrayList) obj8).remove(str2);
                                            }
                                        }
                                    }
                                }
                                if (!hashMap.containsKey("list_all")) {
                                    hashMap.put("list_all", new ArrayList());
                                }
                                if (!hashMap.containsKey("heading_list_all")) {
                                    hashMap.put("heading_list_all", new ArrayList());
                                }
                                if (!hashMap.containsKey("description_list_all")) {
                                    hashMap.put("description_list_all", new ArrayList());
                                }
                                if (!hashMap.containsKey("example_list_all")) {
                                    hashMap.put("example_list_all", new ArrayList());
                                }
                                if (!hashMap.containsKey("example_text_list_all")) {
                                    hashMap.put("example_text_list_all", new ArrayList());
                                }
                                Iterator it3 = ((ArrayList) removedOptions.f23469u).iterator();
                                while (it3.hasNext()) {
                                    String str3 = (String) it3.next();
                                    Object obj9 = hashMap.get("list_all");
                                    kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    if (!((ArrayList) obj9).contains(str3)) {
                                        Object obj10 = hashMap.get("list_all");
                                        kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        ((ArrayList) obj10).add(str3);
                                    }
                                }
                                Iterator<String> it4 = UtilFunKt.paramsMapToList(params.get("r29_popup3_title_list")).iterator();
                                while (it4.hasNext()) {
                                    String next = it4.next();
                                    Object obj11 = hashMap.get("heading_list_all");
                                    kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    if (!((ArrayList) obj11).contains(next)) {
                                        Object obj12 = hashMap.get("heading_list_all");
                                        kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        ((ArrayList) obj12).add(next);
                                    }
                                }
                                Iterator<String> it5 = UtilFunKt.paramsMapToList(params.get("r29_popup3_description_list")).iterator();
                                while (it5.hasNext()) {
                                    String next2 = it5.next();
                                    Object obj13 = hashMap.get("description_list_all");
                                    kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    if (!((ArrayList) obj13).contains(next2)) {
                                        Object obj14 = hashMap.get("description_list_all");
                                        kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        ((ArrayList) obj14).add(next2);
                                    }
                                }
                                Object obj15 = hashMap.get("example_list_all");
                                kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                ((ArrayList) obj15).addAll(UtilFunKt.paramsMapToList(params.get("r29_popup3_example_title_list")));
                                Object obj16 = hashMap.get("example_text_list_all");
                                kotlin.jvm.internal.i.e(obj16, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                ((ArrayList) obj16).addAll(UtilFunKt.paramsMapToList(params.get("r29_popup3_example_description_list")));
                                hashMap.put("popup_btn_text", UtilFunKt.paramsMapToString(params.get("r29_popup3_btn_text")));
                                act.t0();
                                hashMap.put("s8_user_list", selectedOptions.f23469u);
                                return;
                            } else {
                                androidx.fragment.app.p activity142 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity142, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity142).F.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                                act.t0();
                                hashMap.put("s8_user_list", selectedOptions.f23469u);
                                return;
                            }
                        } else if (tt2.equals("s131")) {
                            if (((HashSet) selectedOptions.f23469u).size() == 0) {
                                Utils utils9 = Utils.INSTANCE;
                                androidx.fragment.app.p activity15 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity15);
                                String string5 = this$0.getString(R.string.select_option);
                                kotlin.jvm.internal.i.f(string5, "getString(R.string.select_option)");
                                utils9.showCustomToast(activity15, string5);
                            } else {
                                hashMap.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                                act.s0(new z6());
                            }
                            hashMap.put("s8_user_list", selectedOptions.f23469u);
                            return;
                        } else {
                            androidx.fragment.app.p activity1422 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity1422, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity1422).F.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                            act.t0();
                            hashMap.put("s8_user_list", selectedOptions.f23469u);
                            return;
                        }
                    }
                    if (tt2.equals("s8")) {
                        if (((HashSet) selectedOptions.f23469u).size() == 0) {
                            if (params.containsKey("s8_error_1")) {
                                Utils utils10 = Utils.INSTANCE;
                                androidx.fragment.app.p activity16 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity16);
                                utils10.showCustomToast(activity16, UtilFunKt.paramsMapToString(params.get("s8_error_1")));
                            } else {
                                Utils utils11 = Utils.INSTANCE;
                                androidx.fragment.app.p activity17 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity17);
                                String string6 = this$0.getString(R.string.select_upto_3);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.select_upto_3)");
                                utils11.showCustomToast(activity17, string6);
                            }
                        } else if (((HashSet) selectedOptions.f23469u).size() > 3) {
                            if (params.containsKey("s8_error_2")) {
                                Utils utils12 = Utils.INSTANCE;
                                androidx.fragment.app.p activity18 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity18);
                                utils12.showCustomToast(activity18, UtilFunKt.paramsMapToString(params.get("s8_error_2")));
                            } else {
                                Utils utils13 = Utils.INSTANCE;
                                androidx.fragment.app.p activity19 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity19);
                                String string7 = this$0.getString(R.string.max_3_options_to_select);
                                kotlin.jvm.internal.i.f(string7, "getString(R.string.max_3_options_to_select)");
                                utils13.showCustomToast(activity19, string7);
                            }
                        } else {
                            androidx.fragment.app.p activity20 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity20).F.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                            act.t0();
                        }
                        hashMap.put("s8_user_list", selectedOptions.f23469u);
                        return;
                    }
                    androidx.fragment.app.p activity14222 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity14222, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity14222).F.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                    act.t0();
                    hashMap.put("s8_user_list", selectedOptions.f23469u);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f18847u, "exception", e10);
                    return;
                }
        }
    }

    public /* synthetic */ l9(kotlin.jvm.internal.x xVar, String str, m9 m9Var, kotlin.jvm.internal.x xVar2, kotlin.jvm.internal.x xVar3, String str2, HashMap hashMap) {
        this.f18770w = xVar;
        this.f18769v = str;
        this.f18771x = m9Var;
        this.f18772y = xVar2;
        this.f18773z = xVar3;
        this.B = str2;
        this.A = hashMap;
    }
}
