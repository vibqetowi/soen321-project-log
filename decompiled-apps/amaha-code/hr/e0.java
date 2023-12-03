package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult13Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult13Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/e0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18327w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18329v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18328u = LogHelper.INSTANCE.makeLogTag(e0.class);

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
        LinkedHashMap linkedHashMap = this.f18329v;
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
        return inflater.inflate(R.layout.fragment_screen_result_13, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18329v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x013c, code lost:
        if (r0.getData().containsKey("result_13") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013e, code lost:
        r0 = com.theinnerhour.b2b.utils.UtilFunKt.result13MapToObject(r0.getData().get("result_13"));
        r6.f23469u = r0;
        r11.put("list", ca.a.k(r0.getAns1(), ((com.theinnerhour.b2b.model.ScreenResult13Model) r6.f23469u).getAns2()));
        r11.put("s10_user_list", ca.a.k(((com.theinnerhour.b2b.model.ScreenResult13Model) r6.f23469u).getAns1(), ((com.theinnerhour.b2b.model.ScreenResult13Model) r6.f23469u).getAns2()));
        r0 = ((com.theinnerhour.b2b.model.ScreenResult13Model) r6.f23469u).getAns1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x018c, code lost:
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0192, code lost:
        if (gv.n.B0(r0) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0195, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0197, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0198, code lost:
        if (r0 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x019a, code lost:
        r2 = ((com.theinnerhour.b2b.model.ScreenResult13Model) r6.f23469u).getAns1();
        kotlin.jvm.internal.i.d(r2);
        r11.put("s147a_user_data", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01aa, code lost:
        r0 = ((com.theinnerhour.b2b.model.ScreenResult13Model) r6.f23469u).getAns2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b2, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b8, code lost:
        if (gv.n.B0(r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bb, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bd, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01be, code lost:
        if (r0 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c0, code lost:
        r2 = ((com.theinnerhour.b2b.model.ScreenResult13Model) r6.f23469u).getAns2();
        kotlin.jvm.internal.i.d(r2);
        r11.put("s147b_user_data", r2);
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.theinnerhour.b2b.model.ScreenResult13Model] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.theinnerhour.b2b.model.ScreenResult13Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
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
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r13_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("r13_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(A0.get("r13_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r13_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r13_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            Goal y02 = templateActivity.y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult13Model(Utils.INSTANCE.getTimeInSeconds());
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            boolean z10 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z10 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() >= 2) {
                    ((ScreenResult13Model) xVar.f23469u).setAns1((String) arrayList.get(0));
                    ((ScreenResult13Model) xVar.f23469u).setAns2((String) arrayList.get(1));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.result1)).setText(((ScreenResult13Model) xVar.f23469u).getAns1());
                ((RobertoTextView) _$_findCachedViewById(R.id.result2)).setText(((ScreenResult13Model) xVar.f23469u).getAns2());
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new c0(templateActivity, 0));
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new d0(templateActivity, uVar, "result_13", xVar, 0));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 1));
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.result1)).setText(((ScreenResult13Model) xVar.f23469u).getAns1());
            ((RobertoTextView) _$_findCachedViewById(R.id.result2)).setText(((ScreenResult13Model) xVar.f23469u).getAns2());
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new c0(templateActivity, 0));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new d0(templateActivity, uVar, "result_13", xVar, 0));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18328u, "Exception in on view created", e10);
        }
    }
}
