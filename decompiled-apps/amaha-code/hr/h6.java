package hr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS18Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/h6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h6 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18533w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18535v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18534u = LogHelper.INSTANCE.makeLogTag(h6.class);

    @Override // rr.b
    public final boolean I() {
        boolean z10;
        String str;
        rr.b f3Var;
        Intent intent;
        androidx.fragment.app.p activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && intent.hasExtra("source")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                ArrayList k10 = ca.a.k("Lj2zwDdiNxT4itYu6L0I", "uquIBmnMQ0VfrDhPxhzB", "36snYADYS5ECgALKCjY4");
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y02 = ((TemplateActivity) activity3).y0();
                if (y02 != null) {
                    str = y02.getGoalId();
                } else {
                    str = null;
                }
                if (is.u.Z1(k10, str)) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).Q = true;
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateActivity templateActivity = (TemplateActivity) activity5;
                    androidx.fragment.app.p activity6 = getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity6).W) {
                        f3Var = new h3();
                    } else {
                        f3Var = new f3();
                    }
                    templateActivity.s0(f3Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void J(String str, ArrayList<String> arrayList) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            View view = (ConstraintLayout) inflate;
            ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setText(str);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            context.getResources().getDimensionPixelSize(R.dimen.card_heading_margin_bottom);
            ViewGroup.LayoutParams layoutParams = ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            aVar.setMargins(0, 0, 0, 0);
            ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.setMargins(0, 0, 0, 0);
            view.setLayoutParams(layoutParams3);
            ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)).addView(view);
            Iterator<String> it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6++;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                View view2 = (ConstraintLayout) inflate2;
                ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setText(i6 + ". " + it.next());
                ViewGroup.LayoutParams layoutParams4 = ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams4;
                aVar2.setMargins(0, 0, 0, 0);
                ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar2);
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.setMargins(0, 0, 0, 0);
                view2.setLayoutParams(layoutParams6);
                ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)).addView(view2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18534u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18535v;
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
        return inflater.inflate(R.layout.fragment_screen_s18, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18535v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        rr.b f3Var;
        String str = this.f18534u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            if (templateActivity.Q) {
                if (templateActivity.W) {
                    f3Var = new h3();
                } else {
                    f3Var = new f3();
                }
                templateActivity.s0(f3Var);
                return;
            }
            templateActivity.getWindow().setSoftInputMode(32);
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView32)).setText(gv.r.i1(UtilFunKt.paramsMapToString(A0.get("s18_heading"))).toString());
            J(UtilFunKt.paramsMapToString(A0.get("s18_list_heading")), UtilFunKt.paramsMapToList(A0.get("s18_list")));
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setHint(UtilFunKt.paramsMapToString(A0.get("s18_placeholder")));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(A0.get("s18_btn_two_text")));
            try {
                if (templateActivity.J && templateActivity.F.containsKey("s18_user_data")) {
                    ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new nn.f(this, 7, templateActivity));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "exception", e10);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new o4(3, this, A0, templateActivity));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new z0(this, 24));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new sq.p(this, 21, templateActivity));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "Exception", e11);
        }
    }
}
