package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS52Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/a8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a8 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18160w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18162v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18161u = LogHelper.INSTANCE.makeLogTag(a8.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18162v;
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
        return inflater.inflate(R.layout.fragment_screen_s52, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18162v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            Object obj = templateActivity.F.get("thought_index");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS52Header)).setText(UtilFunKt.paramsMapToString(A0.get("s52_heading")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS52Button)).setText(UtilFunKt.paramsMapToString(A0.get("s52_btn_text")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS52ThoughtLabel)).setText(UtilFunKt.paramsMapToString(A0.get("s52_label")));
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s52_thought_heading_list"));
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvS52ThoughtHead);
            String str4 = "";
            if (intValue >= paramsMapToList.size()) {
                str = "";
            } else {
                str = paramsMapToList.get(intValue);
            }
            robertoTextView.setText(str);
            ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s28_list"));
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvLabel);
            if (intValue >= paramsMapToList2.size()) {
                str2 = "";
            } else {
                str2 = paramsMapToList2.get(intValue);
            }
            robertoTextView2.setText(str2);
            ArrayList<String> paramsMapToList3 = UtilFunKt.paramsMapToList(A0.get("s52_thought_description_list"));
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvS52ThoughtDesc);
            if (intValue >= paramsMapToList3.size()) {
                str3 = "";
            } else {
                str3 = paramsMapToList3.get(intValue);
            }
            robertoTextView3.setText(str3);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS52ExampleLabel)).setText(UtilFunKt.paramsMapToString(A0.get("s52_thought_example_text")));
            ArrayList<String> paramsMapToList4 = UtilFunKt.paramsMapToList(A0.get("s52_thought_example_list"));
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvS52Example);
            if (intValue < paramsMapToList4.size()) {
                str4 = paramsMapToList4.get(intValue);
            }
            robertoTextView4.setText(str4);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.selectedRow);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            _$_findCachedViewById.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.d(activity3);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 27));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS52Button)).setOnClickListener(new i4(templateActivity, 28));
        } catch (Exception e10) {
            LogHelper.INSTANCE.i(this.f18161u, "Exception in on view created", e10);
        }
    }
}
