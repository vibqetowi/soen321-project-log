package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: Log10ResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18177w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18179v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18178u = LogHelper.INSTANCE.makeLogTag(b.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18179v;
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
        return inflater.inflate(R.layout.fragment_log10_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18179v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(templateActivity.A0().get(templateActivity.B0().concat("_question_list")));
            Object obj = templateActivity.F.get("data");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult10Model");
            View inflate = getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(((ScreenResult10Model) obj).getText());
            RobertoTextView robertoTextView = (RobertoTextView) linearLayout.findViewById(R.id.text1);
            ArrayList k10 = ca.a.k("wRiML8ebB1zu56mdNwmN", "EjQgTOnS8HEBEJTVVyGy");
            TemplateModel templateModel = templateActivity.f10547y;
            if (templateModel != null) {
                str = templateModel.getLabel();
            } else {
                str = null;
            }
            if (is.u.Z1(k10, str)) {
                str2 = templateActivity.getString(R.string.worryTimeSubtitle);
            } else {
                str2 = paramsMapToList.get(0);
            }
            robertoTextView.setText(str2);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout);
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(templateActivity.z0());
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new a(templateActivity, 0));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18178u, "exception in on view created", e10);
        }
    }
}
