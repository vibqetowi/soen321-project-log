package hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult15Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult15Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/l0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l0 extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f18717v;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18721z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18716u = LogHelper.INSTANCE.makeLogTag(l0.class);

    /* renamed from: w  reason: collision with root package name */
    public final String f18718w = "list_result_15";

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f18719x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f18720y = new ArrayList<>();

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals") && this.f18717v == 0) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).o0();
                return false;
            }
        }
        int i6 = this.f18717v;
        if (i6 > 0) {
            this.f18717v = i6 - 1;
            J();
            return false;
        }
        return true;
    }

    public final void J() {
        String str;
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Text)).setVisibility(4);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Header)).setVisibility(4);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvR15Text);
            String str2 = "";
            if (this.f18717v >= this.f18719x.size()) {
                str = "";
            } else {
                str = this.f18719x.get(this.f18717v);
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvR15Header);
            if (this.f18717v < this.f18720y.size()) {
                str2 = this.f18720y.get(this.f18717v);
            }
            robertoTextView2.setText(str2);
            boolean z10 = false;
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Text)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Header)).setVisibility(0);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Intent intent = ((TemplateActivity) activity).getIntent();
            if (intent != null && intent.hasExtra("source")) {
                z10 = true;
            }
            if (z10) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (kotlin.jvm.internal.i.b(((TemplateActivity) activity2).getIntent().getStringExtra("source"), "goals")) {
                    if (this.f18717v + 1 < this.f18719x.size()) {
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText("NEXT");
                    } else {
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText("DONE");
                    }
                    if (this.f18717v == 0) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    } else {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18716u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18721z;
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
        return inflater.inflate(R.layout.fragment_screen_result_15, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18721z.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
        if (r12.getData().containsKey(r0) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        r12 = com.theinnerhour.b2b.utils.UtilFunKt.result15MapToObject(r12.getData().get(r0));
        r6.f23469u = r12;
        r10.put("list", r12.getList());
        r12 = r10.get("list");
        kotlin.jvm.internal.i.e(r12, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        r11.f18719x = (java.util.ArrayList) r12;
     */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.theinnerhour.b2b.model.ScreenResult15Model, T] */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.theinnerhour.b2b.model.ScreenResult15Model, T] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f18718w;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            Goal y02 = templateActivity.y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult15Model(new ArrayList());
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            boolean z10 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z10 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList<String> arrayList = (ArrayList) obj;
                this.f18719x = arrayList;
                ((ScreenResult15Model) xVar.f23469u).setList(arrayList);
                templateActivity.Q = false;
                HashMap<String, Object> A0 = templateActivity.A0();
                this.f18720y = UtilFunKt.paramsMapToList(A0.get("r15_heading_list"));
                if (!templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    if (this.f18719x.size() == 1) {
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText("DONE");
                    } else {
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText("NEXT");
                    }
                } else {
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText(UtilFunKt.paramsMapToString(A0.get("r15_btn_text")));
                }
                J();
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 6));
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setOnClickListener(new tk.q((rr.b) this, (Object) templateActivity, uVar, (Object) xVar, 15));
            }
            Object obj2 = hashMap.get("list");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            this.f18719x = (ArrayList) obj2;
            templateActivity.Q = false;
            HashMap<String, Object> A02 = templateActivity.A0();
            this.f18720y = UtilFunKt.paramsMapToList(A02.get("r15_heading_list"));
            if (!templateActivity.getIntent().hasExtra("source")) {
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText(UtilFunKt.paramsMapToString(A02.get("r15_btn_text")));
            J();
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 6));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setOnClickListener(new tk.q((rr.b) this, (Object) templateActivity, uVar, (Object) xVar, 15));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18716u, "exception in on view created", e10);
        }
    }
}
