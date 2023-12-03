package ho;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.l1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProB2CAssessmentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/t;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18054z = 0;

    /* renamed from: v  reason: collision with root package name */
    public ProTakeAssessmentActivity f18056v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18058x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18059y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18055u = LogHelper.INSTANCE.makeLogTag(t.class);

    /* renamed from: w  reason: collision with root package name */
    public JSONObject f18057w = new JSONObject();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18059y;
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
        return inflater.inflate(R.layout.fragment_pro_b2c_assessment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18059y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity");
        ProTakeAssessmentActivity proTakeAssessmentActivity = (ProTakeAssessmentActivity) activity;
        this.f18056v = proTakeAssessmentActivity;
        JSONObject jSONObject = proTakeAssessmentActivity.f11523y.getJSONObject(proTakeAssessmentActivity.f11522x);
        kotlin.jvm.internal.i.f(jSONObject, "act.questionsList.getJSONObject(act.position)");
        this.f18057w = jSONObject;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvProB2CQuestion);
        String optString = this.f18057w.optString("question");
        if (optString == null) {
            optString = "";
        }
        robertoTextView.setText(optString);
        JSONArray jSONArray = this.f18057w.getJSONArray("options");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            View inflate = getLayoutInflater().inflate(R.layout.row_pa_option, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llProB2COptions)), false);
            ((RobertoButton) inflate.findViewById(R.id.optionButton)).setText(jSONArray.getJSONObject(i6).getString("label"));
            inflate.setOnClickListener(DebouncedOnClickListener.wrap(new l1(this, jSONArray, i6, 27)));
            ((LinearLayout) _$_findCachedViewById(R.id.llProB2COptions)).addView(inflate);
        }
    }
}
