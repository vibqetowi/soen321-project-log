package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult3Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/y2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class y2 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19408w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19410v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19409u = LogHelper.INSTANCE.makeLogTag(y2.class);

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
        LinkedHashMap linkedHashMap = this.f19410v;
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
        return inflater.inflate(R.layout.fragment_screen_result_3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19410v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0106, code lost:
        if (r2.getData().containsKey("result_3") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0108, code lost:
        r2 = com.theinnerhour.b2b.utils.UtilFunKt.result3ListMapToObject(r2.getData().get("result_3"));
        r2 = r2.get(r2.size() - 1);
        kotlin.jvm.internal.i.f(r2, "modelList[modelList.size - 1]");
        r6.f23469u = r2;
        r10.put("list", ((com.theinnerhour.b2b.model.ScreenResult3Model) r2).getList());
        r10.put("result_3_initial_val", ((com.theinnerhour.b2b.model.ScreenResult3Model) r6.f23469u).getList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0149, code lost:
        if ((!((com.theinnerhour.b2b.model.ScreenResult3Model) r6.f23469u).getList().isEmpty()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x014b, code lost:
        r8 = ((com.theinnerhour.b2b.model.ScreenResult3Model) r6.f23469u).getList().get(0);
        kotlin.jvm.internal.i.f(r8, "model.list[0]");
        r10.put("s5_user_data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x015f, code lost:
        r2 = ((com.theinnerhour.b2b.model.ScreenResult3Model) r6.f23469u).getList().get(0);
        kotlin.jvm.internal.i.f(r2, "model.list[0]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0175, code lost:
        if ((!gv.n.B0(r2)) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0177, code lost:
        r8 = ((com.theinnerhour.b2b.model.ScreenResult3Model) r6.f23469u).getList().get(0);
        kotlin.jvm.internal.i.f(r8, "model.list[0]");
        r10.put("s6_user_data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x018b, code lost:
        r2 = ((com.theinnerhour.b2b.model.ScreenResult3Model) r6.f23469u).getList().get(0);
        kotlin.jvm.internal.i.f(r2, "model.list[0]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a1, code lost:
        if ((!gv.n.B0(r2)) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01a3, code lost:
        r10.put("s12_user_list", ca.a.w0(((com.theinnerhour.b2b.model.ScreenResult3Model) r6.f23469u).getList().get(0)));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d4 A[Catch: Exception -> 0x0274, TryCatch #0 {Exception -> 0x0274, blocks: (B:3:0x000a, B:5:0x00b1, B:9:0x00ce, B:12:0x00e1, B:15:0x00e6, B:29:0x01be, B:31:0x01d4, B:36:0x023f, B:32:0x0205, B:33:0x0211, B:35:0x0217, B:17:0x00fe, B:19:0x0108, B:22:0x014b, B:23:0x015f, B:25:0x0177, B:26:0x018b, B:28:0x01a3, B:8:0x00c4), top: B:41:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0205 A[Catch: Exception -> 0x0274, TryCatch #0 {Exception -> 0x0274, blocks: (B:3:0x000a, B:5:0x00b1, B:9:0x00ce, B:12:0x00e1, B:15:0x00e6, B:29:0x01be, B:31:0x01d4, B:36:0x023f, B:32:0x0205, B:33:0x0211, B:35:0x0217, B:17:0x00fe, B:19:0x0108, B:22:0x014b, B:23:0x015f, B:25:0x0177, B:26:0x018b, B:28:0x01a3, B:8:0x00c4), top: B:41:0x000a }] */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.theinnerhour.b2b.model.ScreenResult3Model, T] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            new ArrayList();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult3Model(Utils.INSTANCE.getTimeInSeconds());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            templateActivity.Q = false;
            Goal y02 = templateActivity.y0();
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.text_1)).setText(UtilFunKt.paramsMapToString(A0.get("r3_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.text_2)).setText(UtilFunKt.paramsMapToString(A0.get("r3_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.text_3)).setText(UtilFunKt.paramsMapToString(A0.get("r3_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r3_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button);
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r3_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            boolean z10 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z10 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ((ScreenResult3Model) xVar.f23469u).setList((ArrayList) obj);
                if (!kotlin.jvm.internal.i.b(templateActivity.B0(), "s142")) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    View inflate = activity2.getLayoutInflater().inflate(R.layout.row_result3, (ViewGroup) null);
                    ((RobertoTextView) inflate.findViewById(R.id.textView)).setText(((ScreenResult3Model) xVar.f23469u).getList().get(2));
                    ((LinearLayout) _$_findCachedViewById(R.id.ll_list)).addView(inflate);
                } else {
                    Iterator<String> it = ((ScreenResult3Model) xVar.f23469u).getList().iterator();
                    while (it.hasNext()) {
                        androidx.fragment.app.p activity3 = getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        View inflate2 = activity3.getLayoutInflater().inflate(R.layout.row_result3, (ViewGroup) null);
                        ((RobertoTextView) inflate2.findViewById(R.id.textView)).setText(it.next());
                        ((LinearLayout) _$_findCachedViewById(R.id.ll_list)).addView(inflate2);
                    }
                }
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new sq.p(this, 5, templateActivity));
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new ek.p((Object) this, uVar, (Object) templateActivity, (Serializable) "result_3", (Object) xVar, 9));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 23));
            }
            if (!kotlin.jvm.internal.i.b(templateActivity.B0(), "s142")) {
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new sq.p(this, 5, templateActivity));
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new ek.p((Object) this, uVar, (Object) templateActivity, (Serializable) "result_3", (Object) xVar, 9));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 23));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19409u, "exception on view created", e10);
        }
    }
}
