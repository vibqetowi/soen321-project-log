package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult31Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: Log31ResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18421w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18423v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18422u = LogHelper.INSTANCE.makeLogTag(g.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18423v;
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
        return inflater.inflate(R.layout.fragment_log31_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18423v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(templateActivity.z0());
            Object obj = templateActivity.F.get("data");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult31Model");
            ScreenResult31Model screenResult31Model = (ScreenResult31Model) obj;
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)).removeAllViews();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            View inflate = activity2.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText("Name of the person");
            ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(screenResult31Model.getName());
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)).addView(linearLayout);
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.d(activity3);
            View inflate2 = activity3.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)), false);
            kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout2 = (LinearLayout) inflate2;
            ((RobertoTextView) linearLayout2.findViewById(R.id.text1)).setText("Similarities");
            ((RobertoTextView) linearLayout2.findViewById(R.id.text2)).setText(screenResult31Model.getSelection());
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout1)).addView(linearLayout2);
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new a(templateActivity, 8));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new a(templateActivity, 9));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18422u, "exception in on view created", e10);
        }
    }
}
