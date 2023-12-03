package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS99Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/ga;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ga extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18476x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18479w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18477u = LogHelper.INSTANCE.makeLogTag(ga.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<RelativeLayout> f18478v = new ArrayList<>();

    public final void J(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final void K(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Medium.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18479w;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_s99, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18479w.clear();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v22, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v25, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r2v59, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v68, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v71, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v74, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v77, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v80, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        TemplateActivity templateActivity;
        kotlin.jvm.internal.x xVar;
        RelativeLayout relativeLayout;
        String str2 = "null cannot be cast to non-null type android.widget.RelativeLayout";
        String str3 = "exception";
        String str4 = this.f18477u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity2 = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity2.A0();
            HashMap<String, Object> hashMap = templateActivity2.F;
            Object obj = hashMap.get("other_duration");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
            int parseInt = Integer.parseInt((String) obj);
            Object obj2 = hashMap.get("sleep_duration");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
            if (parseInt - Integer.parseInt((String) obj2) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar4 = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar5 = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar6 = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar7 = new kotlin.jvm.internal.x();
            String str5 = "";
            if (z10) {
                templateActivity = templateActivity2;
                ((RobertoTextView) _$_findCachedViewById(R.id.tvs99Header)).setText(UtilFunKt.paramsMapToString(A0.get("s99_heading")));
                xVar2.f23469u = UtilFunKt.paramsMapToList(A0.get("s99_list"));
                str5 = UtilFunKt.paramsMapToString(A0.get("s99_none_of_these_text"));
                ((RobertoButton) _$_findCachedViewById(R.id.btns99Button)).setText(UtilFunKt.paramsMapToString(A0.get("s99_btn_text")));
                xVar3.f23469u = UtilFunKt.paramsMapToList(A0.get("s99_popup3_title_list"));
                xVar4.f23469u = UtilFunKt.paramsMapToList(A0.get("s99_popup3_description_list"));
                xVar5.f23469u = UtilFunKt.paramsMapToList(A0.get("s99_popup3_example_title_list"));
                xVar6.f23469u = UtilFunKt.paramsMapToList(A0.get("s99_popup3_example_description_list"));
                xVar7.f23469u = UtilFunKt.paramsMapToString(A0.get("s99_popup3_btn_text"));
            } else {
                templateActivity = templateActivity2;
                ((RobertoTextView) _$_findCachedViewById(R.id.tvs99Header)).setText(UtilFunKt.paramsMapToString(A0.get("s99b_heading")));
                xVar2.f23469u = UtilFunKt.paramsMapToList(A0.get("s99b_list"));
                ((RobertoButton) _$_findCachedViewById(R.id.btns99Button)).setText(UtilFunKt.paramsMapToString(A0.get("s99b_btn_text")));
                xVar3.f23469u = UtilFunKt.paramsMapToList(A0.get("s99b_popup3_title_list"));
                xVar4.f23469u = UtilFunKt.paramsMapToList(A0.get("s99b_popup3_description_list"));
                xVar5.f23469u = UtilFunKt.paramsMapToList(A0.get("s99b_popup3_example_title_list"));
                xVar6.f23469u = UtilFunKt.paramsMapToList(A0.get("s99b_popup3_example_description_list"));
                xVar7.f23469u = UtilFunKt.paramsMapToString(A0.get("s99b_popup3_btn_text"));
            }
            String str6 = str5;
            kotlin.jvm.internal.x xVar8 = new kotlin.jvm.internal.x();
            xVar8.f23469u = new HashSet();
            try {
                if (hashMap.containsKey("s99_user_list")) {
                    Object obj3 = hashMap.get("s99_user_list");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                    xVar8.f23469u = (HashSet) obj3;
                } else if (hashMap.containsKey("list")) {
                    Object obj4 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    xVar8.f23469u = new HashSet((ArrayList) obj4);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str4, "exception", e10);
            }
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            View inflate = activity2.getLayoutInflater().inflate(R.layout.row_checkbox_text_image, (LinearLayout) _$_findCachedViewById(R.id.lls99List), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            final RelativeLayout relativeLayout2 = (RelativeLayout) inflate;
            relativeLayout2.setTag(Boolean.FALSE);
            ((AppCompatImageView) relativeLayout2.findViewById(R.id.ivRight)).setVisibility(4);
            K(relativeLayout2);
            Iterator it = ((ArrayList) xVar2.f23469u).iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int i10 = i6 + 1;
                String str7 = (String) it.next();
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                LayoutInflater layoutInflater = activity3.getLayoutInflater();
                kotlin.jvm.internal.x xVar9 = xVar6;
                str = str3;
                try {
                    View inflate2 = layoutInflater.inflate(R.layout.row_checkbox_text_image, (LinearLayout) _$_findCachedViewById(R.id.lls99List), false);
                    kotlin.jvm.internal.i.e(inflate2, str2);
                    final RelativeLayout relativeLayout3 = (RelativeLayout) inflate2;
                    ((RobertoTextView) relativeLayout3.findViewById(R.id.tvLabel)).setText(str7);
                    if (((HashSet) xVar8.f23469u).contains(str7)) {
                        J(relativeLayout3);
                        this.f18478v.add(relativeLayout3);
                    } else {
                        K(relativeLayout3);
                    }
                    ((AppCompatImageView) relativeLayout3.findViewById(R.id.ivRight)).setImageResource(R.drawable.ic_help_outline_gray_24dp);
                    String str8 = str2;
                    final kotlin.jvm.internal.x xVar10 = xVar8;
                    kotlin.jvm.internal.x xVar11 = xVar5;
                    kotlin.jvm.internal.x xVar12 = xVar4;
                    kotlin.jvm.internal.x xVar13 = xVar3;
                    final kotlin.jvm.internal.x xVar14 = xVar2;
                    ((AppCompatImageView) relativeLayout3.findViewById(R.id.ivRight)).setOnClickListener(new q4(this, xVar3, i6, str7, xVar4, xVar11, xVar9, xVar7));
                    if (z10) {
                        final int i11 = i6;
                        final boolean z11 = z10;
                        relativeLayout = relativeLayout3;
                        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: hr.fa
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i12 = ga.f18476x;
                                ga this$0 = ga.this;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                RelativeLayout row = relativeLayout3;
                                kotlin.jvm.internal.i.g(row, "$row");
                                kotlin.jvm.internal.x selectedOptions = xVar10;
                                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                                kotlin.jvm.internal.x list = xVar14;
                                kotlin.jvm.internal.i.g(list, "$list");
                                RelativeLayout noneOfThese = relativeLayout2;
                                kotlin.jvm.internal.i.g(noneOfThese, "$noneOfThese");
                                ArrayList<RelativeLayout> arrayList = this$0.f18478v;
                                try {
                                    boolean contains = arrayList.contains(row);
                                    int i13 = i11;
                                    if (contains) {
                                        arrayList.remove(row);
                                        ((HashSet) selectedOptions.f23469u).remove(((ArrayList) list.f23469u).get(i13));
                                        this$0.K(row);
                                    } else if (((HashSet) selectedOptions.f23469u).size() >= 3) {
                                        Utils utils = Utils.INSTANCE;
                                        androidx.fragment.app.p activity4 = this$0.getActivity();
                                        kotlin.jvm.internal.i.d(activity4);
                                        String string = this$0.getString(R.string.max_3_options_to_select);
                                        kotlin.jvm.internal.i.f(string, "getString(R.string.max_3_options_to_select)");
                                        utils.showCustomToast(activity4, string);
                                    } else {
                                        arrayList.add(row);
                                        ((HashSet) selectedOptions.f23469u).add(((ArrayList) list.f23469u).get(i13));
                                        this$0.J(row);
                                        if (z11) {
                                            Object tag = noneOfThese.getTag();
                                            kotlin.jvm.internal.i.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
                                            if (((Boolean) tag).booleanValue()) {
                                                noneOfThese.setTag(Boolean.FALSE);
                                                this$0.K(noneOfThese);
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    LogHelper.INSTANCE.e(this$0.f18477u, "exception", e11);
                                }
                            }
                        });
                    } else {
                        relativeLayout = relativeLayout3;
                        ((ImageView) relativeLayout.findViewById(R.id.chkBxSelected)).setVisibility(8);
                    }
                    ((LinearLayout) _$_findCachedViewById(R.id.lls99List)).addView(relativeLayout);
                    xVar8 = xVar10;
                    xVar5 = xVar11;
                    i6 = i10;
                    str3 = str;
                    xVar6 = xVar9;
                    str2 = str8;
                    xVar4 = xVar12;
                    xVar3 = xVar13;
                    xVar2 = xVar14;
                } catch (Exception e11) {
                    e = e11;
                    LogHelper.INSTANCE.e(str4, str, e);
                }
            }
            kotlin.jvm.internal.x xVar15 = xVar8;
            str = str3;
            if (z10) {
                ((RobertoTextView) relativeLayout2.findViewById(R.id.tvLabel)).setText(str6);
                xVar = xVar15;
                relativeLayout2.setOnClickListener(new o4(23, relativeLayout2, this, xVar));
                ((LinearLayout) _$_findCachedViewById(R.id.lls99List)).addView(relativeLayout2);
            } else {
                xVar = xVar15;
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btns99Button)).setOnClickListener(new g0(this, xVar, z10, relativeLayout2, templateActivity));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 17));
        } catch (Exception e12) {
            e = e12;
            str = str3;
            LogHelper.INSTANCE.e(str4, str, e);
        }
    }
}
