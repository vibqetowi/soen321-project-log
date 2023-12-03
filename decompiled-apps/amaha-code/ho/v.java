package ho;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.ArcProgressBar;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
import org.json.JSONObject;
/* compiled from: ProB2CResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/v;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18061x = 0;

    /* renamed from: v  reason: collision with root package name */
    public ProTakeAssessmentActivity f18063v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18064w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18062u = LogHelper.INSTANCE.makeLogTag(v.class);

    public final void J(JSONObject jSONObject) {
        Spanned fromHtml;
        ((ScrollView) _$_findCachedViewById(R.id.svB2CResultContainer)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.btnB2CResultCTA)).setVisibility(0);
        ((ProgressBar) _$_findCachedViewById(R.id.pbB2CResultProgress)).setVisibility(8);
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvB2CResultTitle);
        ProTakeAssessmentActivity proTakeAssessmentActivity = this.f18063v;
        if (proTakeAssessmentActivity != null) {
            String optString = proTakeAssessmentActivity.f11524z.optString("assessment_name");
            String str = "";
            if (optString == null) {
                optString = "";
            }
            robertoTextView.setText(optString);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvB2CResultSubtitle);
            String optString2 = jSONObject.optString("result_title");
            if (optString2 == null) {
                optString2 = "";
            }
            robertoTextView2.setText(optString2);
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvB2CResultLevel);
            String optString3 = jSONObject.optString("result_value");
            if (optString3 == null) {
                optString3 = "";
            }
            robertoTextView3.setText(optString3);
            String optString4 = jSONObject.optString("result_statement");
            if (optString4 != null) {
                str = optString4;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml(str, 63);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvB2CResultText)).setText(fromHtml);
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvB2CResultText)).setText(Html.fromHtml(str));
            }
            int optInt = jSONObject.optInt("result_max_score");
            int optInt2 = jSONObject.optInt("result_user_score");
            ArcProgressBar arcProgressBar = (ArcProgressBar) _$_findCachedViewById(R.id.pbB2CProgressBar);
            if (arcProgressBar != null) {
                arcProgressBar.c((optInt2 * 100) / optInt, 750);
                return;
            }
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18064w;
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
        return inflater.inflate(R.layout.fragment_pro_b2c_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18064w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity");
        ProTakeAssessmentActivity proTakeAssessmentActivity = (ProTakeAssessmentActivity) activity;
        this.f18063v = proTakeAssessmentActivity;
        if (proTakeAssessmentActivity.B) {
            JSONObject jSONObject = proTakeAssessmentActivity.f11524z.getJSONObject("response_data");
            kotlin.jvm.internal.i.f(jSONObject, "act.assessment.getJSONObject(\"response_data\")");
            J(jSONObject);
        } else {
            try {
                ((ScrollView) _$_findCachedViewById(R.id.svB2CResultContainer)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnB2CResultCTA)).setVisibility(8);
                ((ProgressBar) _$_findCachedViewById(R.id.pbB2CResultProgress)).setVisibility(0);
                JSONObject jSONObject2 = new JSONObject();
                ProTakeAssessmentActivity proTakeAssessmentActivity2 = this.f18063v;
                if (proTakeAssessmentActivity2 != null) {
                    jSONObject2.put("assessment_type", proTakeAssessmentActivity2.f11524z.getString("assessment_type"));
                    ProTakeAssessmentActivity proTakeAssessmentActivity3 = this.f18063v;
                    if (proTakeAssessmentActivity3 != null) {
                        jSONObject2.put("assigned_assessment_id", proTakeAssessmentActivity3.f11524z.getInt("assigned_assessment_id"));
                        ProTakeAssessmentActivity proTakeAssessmentActivity4 = this.f18063v;
                        if (proTakeAssessmentActivity4 != null) {
                            jSONObject2.put("response_data", proTakeAssessmentActivity4.A);
                            CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/submit_b2c_assessment", jSONObject2, new am.w(3, this), new u(this));
                            customVolleyJsonObjectRequest.setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 0));
                            VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f18062u, e10);
            }
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnB2CResultCTA)).setOnClickListener(new v0(17, this));
    }
}
