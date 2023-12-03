package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.TaskIn2Min;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: Log22BResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18269x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18272w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18270u = LogHelper.INSTANCE.makeLogTag(d.class);

    /* renamed from: v  reason: collision with root package name */
    public String f18271v = "";

    public final void J(ScreenResult22Model screenResult22Model) {
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).removeAllViews();
        Iterator<TaskIn2Min> it = screenResult22Model.getItems().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            TaskIn2Min next = it.next();
            if (!next.getIn2Min()) {
                i6++;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                View inflate = activity.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)), false);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout = (LinearLayout) inflate;
                ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText(this.f18271v + ' ' + i6);
                ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(next.getText());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).addView(linearLayout);
            }
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18272w;
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
        return inflater.inflate(R.layout.fragment_log22_b_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18272w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            Object obj = templateActivity.F.get("data");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult22Model");
            ScreenResult22Model screenResult22Model = (ScreenResult22Model) obj;
            String prefix = screenResult22Model.getPrefix();
            kotlin.jvm.internal.i.d(prefix);
            this.f18271v = prefix;
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(screenResult22Model.getTitle2());
            ((RobertoTextView) _$_findCachedViewById(R.id.tvRememberLabel2)).setText(screenResult22Model.getRememberLabel());
            ((RobertoTextView) _$_findCachedViewById(R.id.tvRemember2)).setText(screenResult22Model.getRememberText2());
            J(screenResult22Model);
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new a(templateActivity, 2));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new a(templateActivity, 3));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18270u, "exception in on view created", e10);
        }
    }
}
