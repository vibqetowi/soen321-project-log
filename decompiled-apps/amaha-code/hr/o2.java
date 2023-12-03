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
import com.theinnerhour.b2b.model.ScreenResult2Model;
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
/* compiled from: ScreenResult2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/o2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o2 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18909w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18911v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18910u = LogHelper.INSTANCE.makeLogTag(o2.class);

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
        LinkedHashMap linkedHashMap = this.f18911v;
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
        return inflater.inflate(R.layout.fragment_screen_result_2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18911v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0118, code lost:
        if (r13.getData().containsKey("result_2") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011a, code lost:
        r13 = com.theinnerhour.b2b.utils.UtilFunKt.result2MapToObject(r13.getData().get("result_2"));
        r6.f23469u = r13;
        r8.put("list", r13.getList());
        r8.put("userAdded", ((com.theinnerhour.b2b.model.ScreenResult2Model) r6.f23469u).getUserAdded());
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c A[Catch: Exception -> 0x01b2, LOOP:0: B:23:0x0146->B:25:0x014c, LOOP_END, TryCatch #0 {Exception -> 0x01b2, blocks: (B:3:0x000c, B:5:0x00ae, B:9:0x00cb, B:12:0x00df, B:15:0x00e4, B:17:0x00fd, B:22:0x013a, B:23:0x0146, B:25:0x014c, B:26:0x017e, B:19:0x0110, B:21:0x011a, B:8:0x00c1), top: B:31:0x000c }] */
    /* JADX WARN: Type inference failed for: r13v7, types: [T, com.theinnerhour.b2b.model.ScreenResult2Model] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.theinnerhour.b2b.model.ScreenResult2Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        Iterator<String> it;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            templateActivity.Q = false;
            Goal y02 = templateActivity.y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult2Model(Utils.INSTANCE.getTimeInSeconds());
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.text_2)).setText(UtilFunKt.paramsMapToString(A0.get("r2_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.text_1)).setText(UtilFunKt.paramsMapToString(A0.get("r2_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.text_3)).setText(UtilFunKt.paramsMapToString(A0.get("r2_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r2_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button);
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r2_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            boolean z10 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z10 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ((ScreenResult2Model) xVar.f23469u).setList((ArrayList) obj);
                if (hashMap.containsKey("userAdded")) {
                    Object obj2 = hashMap.get("userAdded");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult2Model) xVar.f23469u).setUserAdded((ArrayList) obj2);
                }
                it = ((ScreenResult2Model) xVar.f23469u).getList().iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    View inflate = activity2.getLayoutInflater().inflate(R.layout.row_result2, (ViewGroup) null);
                    ((RobertoTextView) inflate.findViewById(R.id.textView)).setText(it.next());
                    ((LinearLayout) _$_findCachedViewById(R.id.ll_list)).addView(inflate);
                }
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new ek.p((Object) this, uVar, (Object) "result_2", (Serializable) xVar, (Object) templateActivity, 8));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new z0(this, 8));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 20));
            }
            it = ((ScreenResult2Model) xVar.f23469u).getList().iterator();
            while (it.hasNext()) {
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new ek.p((Object) this, uVar, (Object) "result_2", (Serializable) xVar, (Object) templateActivity, 8));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new z0(this, 8));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 20));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18910u, "exception in on view created", e10);
        }
    }
}
