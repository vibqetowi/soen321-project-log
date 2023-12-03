package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult8Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult8Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/z3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z3 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19436w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19438v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19437u = LogHelper.INSTANCE.makeLogTag(z3.class);

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (!((TemplateActivity) activity3).R) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).o0();
                    return false;
                }
            }
        }
        androidx.fragment.app.p activity5 = getActivity();
        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity5).R = false;
        return true;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19438v;
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
        return inflater.inflate(R.layout.fragment_screen_result_8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19438v.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0290 A[Catch: Exception -> 0x0308, TRY_ENTER, TryCatch #0 {Exception -> 0x0308, blocks: (B:3:0x0014, B:6:0x003c, B:8:0x004a, B:9:0x0056, B:11:0x00c1, B:15:0x00dc, B:18:0x0149, B:21:0x014e, B:23:0x0160, B:25:0x0166, B:27:0x016c, B:31:0x0193, B:33:0x0199, B:57:0x0277, B:60:0x0290, B:62:0x02a1, B:64:0x02bb, B:65:0x02ca, B:67:0x02dc, B:68:0x02f4, B:28:0x017d, B:30:0x0183, B:37:0x01af, B:39:0x01b9, B:41:0x01c5, B:43:0x01e5, B:45:0x01fe, B:46:0x0214, B:42:0x01d7, B:47:0x022a, B:49:0x0230, B:51:0x0240, B:52:0x0251, B:54:0x0257, B:56:0x0267, B:14:0x00d2), top: B:73:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bb A[Catch: Exception -> 0x0308, TryCatch #0 {Exception -> 0x0308, blocks: (B:3:0x0014, B:6:0x003c, B:8:0x004a, B:9:0x0056, B:11:0x00c1, B:15:0x00dc, B:18:0x0149, B:21:0x014e, B:23:0x0160, B:25:0x0166, B:27:0x016c, B:31:0x0193, B:33:0x0199, B:57:0x0277, B:60:0x0290, B:62:0x02a1, B:64:0x02bb, B:65:0x02ca, B:67:0x02dc, B:68:0x02f4, B:28:0x017d, B:30:0x0183, B:37:0x01af, B:39:0x01b9, B:41:0x01c5, B:43:0x01e5, B:45:0x01fe, B:46:0x0214, B:42:0x01d7, B:47:0x022a, B:49:0x0230, B:51:0x0240, B:52:0x0251, B:54:0x0257, B:56:0x0267, B:14:0x00d2), top: B:73:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02dc A[Catch: Exception -> 0x0308, TryCatch #0 {Exception -> 0x0308, blocks: (B:3:0x0014, B:6:0x003c, B:8:0x004a, B:9:0x0056, B:11:0x00c1, B:15:0x00dc, B:18:0x0149, B:21:0x014e, B:23:0x0160, B:25:0x0166, B:27:0x016c, B:31:0x0193, B:33:0x0199, B:57:0x0277, B:60:0x0290, B:62:0x02a1, B:64:0x02bb, B:65:0x02ca, B:67:0x02dc, B:68:0x02f4, B:28:0x017d, B:30:0x0183, B:37:0x01af, B:39:0x01b9, B:41:0x01c5, B:43:0x01e5, B:45:0x01fe, B:46:0x0214, B:42:0x01d7, B:47:0x022a, B:49:0x0230, B:51:0x0240, B:52:0x0251, B:54:0x0257, B:56:0x0267, B:14:0x00d2), top: B:73:0x0014 }] */
    /* JADX WARN: Type inference failed for: r2v23, types: [T, com.theinnerhour.b2b.model.ScreenResult8Model] */
    /* JADX WARN: Type inference failed for: r2v39, types: [T, com.theinnerhour.b2b.model.ScreenResult8Model] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.theinnerhour.b2b.model.ScreenResult8Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        String str;
        String str2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            templateActivity.Q = false;
            HashMap<String, Object> A0 = templateActivity.A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Title)).setText(UtilFunKt.paramsMapToString(A0.get("r8_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r8_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Desc)).setText(UtilFunKt.paramsMapToString(A0.get("r8_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r8_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonTwo);
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r8_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            Goal y02 = templateActivity.y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult8Model(Utils.INSTANCE.getTimeInSeconds());
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonOne)).setOnClickListener(new sq.p(this, 8, templateActivity));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonTwo)).setOnClickListener(new d0(templateActivity, uVar, "result_8", xVar, 2));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new z0(this, 11));
            boolean z10 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z10 && !templateActivity.I) {
                uVar.f23466u = true;
                ArrayList k10 = ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4");
                Goal y03 = templateActivity.y0();
                if (y03 != null) {
                    str2 = y03.getGoalId();
                } else {
                    str2 = null;
                }
                if (!is.u.Z1(k10, str2)) {
                    Object obj = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult8Model) xVar.f23469u).setList((ArrayList) obj);
                } else if (hashMap.containsKey("s109_t13_list")) {
                    Object obj2 = hashMap.get("s109_t13_list");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult8Model) xVar.f23469u).setList((ArrayList) obj2);
                }
                if (hashMap.containsKey("userAdded")) {
                    Object obj3 = hashMap.get("userAdded");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult8Model) xVar.f23469u).setUserAdded((ArrayList) obj3);
                }
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.result1);
                String str3 = "";
                if (((ScreenResult8Model) xVar.f23469u).getList().size() > 0) {
                    str = "";
                } else {
                    str = ((ScreenResult8Model) xVar.f23469u).getList().get(0);
                }
                robertoTextView.setText(str);
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.result2);
                if (((ScreenResult8Model) xVar.f23469u).getList().size() > 1) {
                    str3 = ((ScreenResult8Model) xVar.f23469u).getList().get(1);
                }
                robertoTextView2.setText(str3);
                if (((ScreenResult8Model) xVar.f23469u).getList().size() < 2) {
                    ((ImageView) _$_findCachedViewById(R.id.imageView6)).setVisibility(8);
                    _$_findCachedViewById(R.id.view3).setVisibility(8);
                }
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 26));
            }
            if (y02 != null && y02.getData().containsKey("result_8")) {
                if (y02.getData().get("result_8") instanceof ScreenResult8Model) {
                    Object obj4 = y02.getData().get("result_8");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult8Model");
                    xVar.f23469u = (ScreenResult8Model) obj4;
                } else {
                    xVar.f23469u = UtilFunKt.result8MapToObject(y02.getData().get("result_8"));
                }
                ArrayList k11 = ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4");
                Goal y04 = templateActivity.y0();
                kotlin.jvm.internal.i.d(y04);
                if (!is.u.Z1(k11, y04.getGoalId())) {
                    hashMap.put("list", ((ScreenResult8Model) xVar.f23469u).getList());
                    hashMap.put("selected_list", ((ScreenResult8Model) xVar.f23469u).getList());
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((ScreenResult8Model) xVar.f23469u).getList());
                hashMap.put("s109_user_list", arrayList);
            } else {
                if (hashMap.containsKey("list")) {
                    Object obj5 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    if (!((ArrayList) obj5).isEmpty()) {
                        Object obj6 = hashMap.get("list");
                        kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        ((ScreenResult8Model) xVar.f23469u).setList((ArrayList) obj6);
                    }
                }
                if (hashMap.containsKey("selected_list")) {
                    Object obj7 = hashMap.get("selected_list");
                    kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    if (!((ArrayList) obj7).isEmpty()) {
                        Object obj8 = hashMap.get("selected_list");
                        kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        ((ScreenResult8Model) xVar.f23469u).setList((ArrayList) obj8);
                    }
                }
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.result1);
            String str32 = "";
            if (((ScreenResult8Model) xVar.f23469u).getList().size() > 0) {
            }
            robertoTextView3.setText(str);
            RobertoTextView robertoTextView22 = (RobertoTextView) _$_findCachedViewById(R.id.result2);
            if (((ScreenResult8Model) xVar.f23469u).getList().size() > 1) {
            }
            robertoTextView22.setText(str32);
            if (((ScreenResult8Model) xVar.f23469u).getList().size() < 2) {
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 26));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19437u, "Exception in on view created", e10);
        }
    }
}
