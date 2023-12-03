package hr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult30Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/t2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t2 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19195w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19197v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19196u = LogHelper.INSTANCE.makeLogTag(t2.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19197v;
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
        return inflater.inflate(R.layout.fragment_screen_result_30, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19197v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            HashMap<String, Object> hashMap = templateActivity.F;
            if (kotlin.jvm.internal.i.b(hashMap.get("log"), Boolean.TRUE)) {
                hashMap.put("log", Boolean.FALSE);
                Object obj = hashMap.get("data");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult30Model");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR30StmtOneDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r30_description")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Subheading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_subheading")));
                Iterator<String> it = ((ScreenResult30Model) obj).getList().iterator();
                while (it.hasNext()) {
                    LayoutInflater layoutInflater = getLayoutInflater();
                    kotlin.jvm.internal.i.d(layoutInflater);
                    View inflate = layoutInflater.inflate(R.layout.row_result_30, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.text2)).setText(it.next());
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonOne)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonTwo)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 21));
                return;
            }
            Object obj2 = hashMap.get("screen_model_30");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult30Model");
            ScreenResult30Model screenResult30Model = (ScreenResult30Model) obj2;
            Iterator<String> it2 = screenResult30Model.getList().iterator();
            while (it2.hasNext()) {
                LayoutInflater layoutInflater2 = getLayoutInflater();
                kotlin.jvm.internal.i.d(layoutInflater2);
                View inflate2 = layoutInflater2.inflate(R.layout.row_result_30, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                ((RobertoTextView) inflate2.findViewById(R.id.text2)).setText(it2.next());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate2);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Subheading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_subheading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR30StmtOneDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r30_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r30_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonTwo);
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r30_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonOne)).setOnClickListener(new c0(templateActivity, 22));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonTwo)).setOnClickListener(new nn.g(29, this, templateActivity, screenResult30Model));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.s2

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t2 f19128v;

                {
                    this.f19128v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    t2 this$0 = this.f19128v;
                    switch (i6) {
                        case 0:
                            int i10 = t2.f19195w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 15);
                            a1Var.b();
                            return;
                        default:
                            int i11 = t2.f19195w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).onBackPressed();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.s2

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t2 f19128v;

                {
                    this.f19128v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    t2 this$0 = this.f19128v;
                    switch (i6) {
                        case 0:
                            int i10 = t2.f19195w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 15);
                            a1Var.b();
                            return;
                        default:
                            int i11 = t2.f19195w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19196u, "exception", e10);
        }
    }
}
