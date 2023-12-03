package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult7Model;
import com.theinnerhour.b2b.utils.Constants;
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
/* compiled from: ScreenResult7Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/v3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v3 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19285w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19287v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19286u = LogHelper.INSTANCE.makeLogTag(v3.class);

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        TemplateActivity templateActivity = (TemplateActivity) activity;
        if (templateActivity.F.containsKey(Constants.DAYMODEL_POSITION)) {
            HashMap<String, Object> hashMap = templateActivity.F;
            Object obj = hashMap.get(Constants.DAYMODEL_POSITION);
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue > 0) {
                hashMap.put(Constants.DAYMODEL_POSITION, Integer.valueOf(intValue - 1));
            }
        }
        return true;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19287v;
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
        return inflater.inflate(R.layout.fragment_screen_result_7, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19287v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x015f, code lost:
        if (r1.getData().containsKey("result_7") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0161, code lost:
        r1 = com.theinnerhour.b2b.utils.UtilFunKt.result7MapToObject(r1.getData().get("result_7"));
        r5.f23469u = r1;
        r9.put("list", r1.getList());
        r9.put("userAdded", ((com.theinnerhour.b2b.model.ScreenResult7Model) r5.f23469u).getUserAdded());
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.theinnerhour.b2b.model.ScreenResult7Model] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, com.theinnerhour.b2b.model.ScreenResult7Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult7Model(Utils.INSTANCE.getTodayTimeInSeconds());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            Goal y02 = templateActivity.y0();
            HashMap<String, Object> A0 = templateActivity.A0();
            templateActivity.P = false;
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "r7")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r7_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOne)).setText(UtilFunKt.paramsMapToList(A0.get("r7_statement_list")).get(0));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwo)).setText(UtilFunKt.paramsMapToList(A0.get("r7_statement_list")).get(1));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThree)).setText(UtilFunKt.paramsMapToList(A0.get("r7_statement_list")).get(2));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Rem)).setText(UtilFunKt.paramsMapToString(A0.get("r7_remember_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7RemDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r7_remember_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r7_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("r7_btn_two_text")));
            }
            boolean z10 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z10 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ((ScreenResult7Model) xVar.f23469u).setList((ArrayList) obj);
                if (hashMap.containsKey("userAdded")) {
                    Object obj2 = hashMap.get("userAdded");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult7Model) xVar.f23469u).setUserAdded((ArrayList) obj2);
                }
                ((ScreenResult7Model) xVar.f23469u).setHeadings(UtilFunKt.paramsMapToList(templateActivity.A0().get("r7_statement_list")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOneDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(0));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwoDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(1));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThreeDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(2));
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setOnClickListener(new c0(templateActivity, 24));
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setOnClickListener(new tk.q((Object) this, (Object) uVar, (Object) "result_7", (Serializable) xVar, 18));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 25));
            }
            if (hashMap.containsKey("list")) {
                Object obj3 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                if (!((ArrayList) obj3).isEmpty()) {
                    Object obj4 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult7Model) xVar.f23469u).setList((ArrayList) obj4);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOneDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(0));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwoDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThreeDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(2));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setOnClickListener(new c0(templateActivity, 24));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setOnClickListener(new tk.q((Object) this, (Object) uVar, (Object) "result_7", (Serializable) xVar, 18));
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 25));
                }
            }
            if (hashMap.containsKey("userAdded")) {
                Object obj5 = hashMap.get("userAdded");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                if (!((ArrayList) obj5).isEmpty()) {
                    Object obj6 = hashMap.get("userAdded");
                    kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult7Model) xVar.f23469u).setList((ArrayList) obj6);
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOneDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(0));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwoDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(1));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThreeDesc)).setText(((ScreenResult7Model) xVar.f23469u).getList().get(2));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setOnClickListener(new c0(templateActivity, 24));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setOnClickListener(new tk.q((Object) this, (Object) uVar, (Object) "result_7", (Serializable) xVar, 18));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 25));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19286u, "exception on view created", e10);
        }
    }
}
