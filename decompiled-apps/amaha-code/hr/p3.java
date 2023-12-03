package hr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult6Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/p3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p3 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18950w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18952v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18951u = LogHelper.INSTANCE.makeLogTag(p3.class);

    @Override // rr.b
    public final boolean I() {
        boolean z10;
        TemplateActivity templateActivity;
        String str;
        TemplateActivity templateActivity2;
        boolean z11;
        TemplateActivity templateActivity3;
        String str2;
        Goal y02;
        Intent intent;
        Intent intent2;
        androidx.fragment.app.p activity = getActivity();
        if (activity != null && (intent2 = activity.getIntent()) != null && intent2.hasExtra("source")) {
            z10 = true;
        } else {
            z10 = false;
        }
        TemplateActivity templateActivity4 = null;
        if (z10) {
            androidx.fragment.app.p activity2 = getActivity();
            if (activity2 instanceof TemplateActivity) {
                templateActivity = (TemplateActivity) activity2;
            } else {
                templateActivity = null;
            }
            if (templateActivity != null && (intent = templateActivity.getIntent()) != null) {
                str = intent.getStringExtra("source");
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.i.b(str, "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                if (activity3 instanceof TemplateActivity) {
                    templateActivity2 = (TemplateActivity) activity3;
                } else {
                    templateActivity2 = null;
                }
                if (templateActivity2 != null && !templateActivity2.R) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e", "GOorgabeKajhZhtBwFqL");
                    androidx.fragment.app.p activity4 = getActivity();
                    if (activity4 instanceof TemplateActivity) {
                        templateActivity3 = (TemplateActivity) activity4;
                    } else {
                        templateActivity3 = null;
                    }
                    if (templateActivity3 != null && (y02 = templateActivity3.y0()) != null) {
                        str2 = y02.getGoalId();
                    } else {
                        str2 = null;
                    }
                    if (!is.u.Z1(k10, str2)) {
                        androidx.fragment.app.p activity5 = getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity5).o0();
                        return false;
                    }
                }
            }
        }
        androidx.fragment.app.p activity6 = getActivity();
        if (activity6 instanceof TemplateActivity) {
            templateActivity4 = (TemplateActivity) activity6;
        }
        if (templateActivity4 == null) {
            return true;
        }
        templateActivity4.R = false;
        return true;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18952v;
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
        return inflater.inflate(R.layout.fragment_screen_result_6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18952v.clear();
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.theinnerhour.b2b.model.ScreenResult6Model] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u uVar;
        String paramsMapToString;
        String paramsMapToString2;
        String str;
        String str2;
        String str3;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            templateActivity.Q = false;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ArrayList k10 = ca.a.k("GOorgabeKajhZhtBwFqL", "HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                Goal y02 = templateActivity.y0();
                if (y02 != null) {
                    str3 = y02.getGoalId();
                } else {
                    str3 = null;
                }
                if (!is.u.Z1(k10, str3)) {
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                }
            }
            kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult6Model(Utils.INSTANCE.getTimeInSeconds());
            Goal y03 = templateActivity.y0();
            HashMap<String, Object> A0 = templateActivity.A0();
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o3

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p3 f18913v;

                {
                    this.f18913v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str4;
                    int i6 = r2;
                    p3 this$0 = this.f18913v;
                    switch (i6) {
                        case 0:
                            int i10 = p3.f18950w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 19);
                            a1Var.b();
                            return;
                        default:
                            int i11 = p3.f18950w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity3).getIntent().hasExtra("source")) {
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (r1.b0.c((TemplateActivity) activity4, "source", "goals")) {
                                    ArrayList k11 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e", "GOorgabeKajhZhtBwFqL");
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    Goal y04 = ((TemplateActivity) activity5).y0();
                                    if (y04 != null) {
                                        str4 = y04.getGoalId();
                                    } else {
                                        str4 = null;
                                    }
                                    if (!is.u.Z1(k11, str4)) {
                                        androidx.fragment.app.p activity6 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity6).o0();
                                        return;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity7).I = false;
                            androidx.fragment.app.p activity8 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity8).onBackPressed();
                            return;
                    }
                }
            });
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("r6_sub_heading_list"));
            uVar2.f23466u = true;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (kotlin.jvm.internal.i.b(hashMap.get("log"), Boolean.TRUE)) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                Object obj = hashMap.get("ans");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ((ScreenResult6Model) xVar.f23469u).setList((ArrayList) obj);
                Object obj2 = hashMap.get("heading");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText((String) obj2);
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                hashMap.put("log", Boolean.FALSE);
                uVar = uVar2;
            } else {
                uVar = uVar2;
                if ((templateActivity.J && !templateActivity.S) || templateActivity.I) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_btn_one_text")));
                    RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
                    if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                        paramsMapToString2 = "DONE";
                    } else {
                        paramsMapToString2 = UtilFunKt.paramsMapToString(A0.get("r6_btn_two_text"));
                    }
                    robertoButton.setText(paramsMapToString2);
                    if (y03 != null && y03.getData().containsKey("result_6")) {
                        ArrayList<ScreenResult6Model> result6MapToObject = UtilFunKt.result6MapToObject(y03.getData().get("result_6"));
                        if (!result6MapToObject.isEmpty()) {
                            ?? o22 = is.u.o2(result6MapToObject);
                            xVar.f23469u = o22;
                            hashMap.put("list", ((ScreenResult6Model) o22).getList());
                            hashMap.put("result_6_initial_val", ((ScreenResult6Model) xVar.f23469u).getList());
                        }
                    }
                } else {
                    templateActivity.S = true;
                    Object obj3 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult6Model) xVar.f23469u).setList((ArrayList) obj3);
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_btn_one_text")));
                    RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.button2);
                    if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                        paramsMapToString = "DONE";
                    } else {
                        paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r6_btn_two_text"));
                    }
                    robertoButton2.setText(paramsMapToString);
                }
            }
            if (paramsMapToList.size() == 1) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                View inflate = activity3.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(paramsMapToList.get(0));
                ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(((ScreenResult6Model) xVar.f23469u).getList().get(((ScreenResult6Model) xVar.f23469u).getList().size() - 1));
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
            } else {
                int size = ((ScreenResult6Model) xVar.f23469u).getList().size();
                for (int i6 = 0; i6 < size; i6++) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    View inflate2 = activity4.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    RobertoTextView robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.rowQuestion);
                    if (i6 < paramsMapToList.size()) {
                        str = paramsMapToList.get(i6);
                    } else {
                        str = "";
                    }
                    robertoTextView.setText(str);
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate2.findViewById(R.id.rowAnswer);
                    if (i6 < ((ScreenResult6Model) xVar.f23469u).getList().size()) {
                        str2 = ((ScreenResult6Model) xVar.f23469u).getList().get(i6);
                    } else {
                        str2 = "";
                    }
                    robertoTextView2.setText(str2);
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate2);
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new sq.p(this, 7, templateActivity));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new ek.p((Object) this, uVar, (Object) templateActivity, (Serializable) "result_6", (Object) xVar, 11));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o3

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p3 f18913v;

                {
                    this.f18913v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str4;
                    int i62 = r2;
                    p3 this$0 = this.f18913v;
                    switch (i62) {
                        case 0:
                            int i10 = p3.f18950w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 19);
                            a1Var.b();
                            return;
                        default:
                            int i11 = p3.f18950w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity32 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity32).getIntent().hasExtra("source")) {
                                androidx.fragment.app.p activity42 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity42, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (r1.b0.c((TemplateActivity) activity42, "source", "goals")) {
                                    ArrayList k11 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e", "GOorgabeKajhZhtBwFqL");
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    Goal y04 = ((TemplateActivity) activity5).y0();
                                    if (y04 != null) {
                                        str4 = y04.getGoalId();
                                    } else {
                                        str4 = null;
                                    }
                                    if (!is.u.Z1(k11, str4)) {
                                        androidx.fragment.app.p activity6 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity6).o0();
                                        return;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity7).I = false;
                            androidx.fragment.app.p activity8 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity8).onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18951u, "Exception", e10);
        }
    }
}
