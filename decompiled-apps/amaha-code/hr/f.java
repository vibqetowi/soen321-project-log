package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: Log28ResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/f;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18355w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18357v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18356u = LogHelper.INSTANCE.makeLogTag(f.class);

    public final void J(ScreenResult28Model screenResult28Model, ArrayList<String> arrayList) {
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)).removeAllViews();
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).removeAllViews();
        Iterator<String> it = screenResult28Model.getAnswers().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(it.next());
            ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText(arrayList.get(i6));
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)).addView(linearLayout);
            i6++;
        }
        if (screenResult28Model.getList().size() > 0) {
            Iterator<String> it2 = screenResult28Model.getList().iterator();
            while (it2.hasNext()) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_single_text_side_margin, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                ((RobertoTextView) constraintLayout.findViewById(R.id.tvSingleLine)).setText(it2.next());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).addView(constraintLayout);
            }
            return;
        }
        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setVisibility(8);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18357v;
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
        return inflater.inflate(R.layout.fragment_log28_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18357v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(UtilFunKt.paramsMapToString(A0.get("s122_two_question")));
            arrayList.add(UtilFunKt.paramsMapToString(A0.get("s122_three_question")));
            arrayList.add(UtilFunKt.paramsMapToString(A0.get("s122_four_question")));
            Object obj = templateActivity.F.get("data");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult28Model");
            ScreenResult28Model screenResult28Model = (ScreenResult28Model) obj;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            View inflate = activity2.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText("Situation");
            ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(screenResult28Model.getSituation());
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)).addView(linearLayout);
            J(screenResult28Model, arrayList);
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new a(templateActivity, 6));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new a(templateActivity, 7));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18356u, "exception in on view created", e10);
        }
    }
}
