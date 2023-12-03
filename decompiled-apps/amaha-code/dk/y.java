package dk;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SurveyActivity;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoRadioButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import e4.l;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12962u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SurveyActivity f12963v;

    public /* synthetic */ y(SurveyActivity surveyActivity, int i6) {
        this.f12962u = i6;
        this.f12963v = surveyActivity;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [dk.z] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final boolean z10;
        CharSequence text;
        CharSequence text2;
        int i6 = this.f12962u;
        final SurveyActivity this$0 = this.f12963v;
        switch (i6) {
            case 0:
                int i10 = SurveyActivity.f10504y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.finish();
                return;
            case 1:
                int i11 = SurveyActivity.f10504y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected()) {
                    if (((RadioGroup) this$0.n0(R.id.rgSurveyQuestion1)).getCheckedRadioButtonId() != -1) {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("q", ((RobertoTextView) this$0.n0(R.id.surveyQuestion1)).getText().toString());
                        switch (((RadioGroup) this$0.n0(R.id.rgSurveyQuestion1)).getCheckedRadioButtonId()) {
                            case R.id.surveyOption1 /* 2131366184 */:
                                if (ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE) == 0) {
                                    ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                                }
                                if (TimeUnit.DAYS.convert(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE), TimeUnit.MILLISECONDS) > 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                text = ((RobertoRadioButton) this$0.n0(R.id.surveyOption1)).getText();
                                break;
                            case R.id.surveyOption2 /* 2131366185 */:
                                text2 = ((RobertoRadioButton) this$0.n0(R.id.surveyOption2)).getText();
                                text = text2;
                                z10 = false;
                                break;
                            default:
                                text2 = ((RobertoRadioButton) this$0.n0(R.id.surveyOption3)).getText();
                                text = text2;
                                z10 = false;
                                break;
                        }
                        jSONObject.put("a", text);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("q", ((RobertoTextView) this$0.n0(R.id.surveyQuestion2)).getText().toString());
                        jSONObject2.put("a", gv.r.i1(String.valueOf(((RobertoEditText) this$0.n0(R.id.surveyAnswer2)).getText())).toString());
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("q", ((RobertoTextView) this$0.n0(R.id.surveyQuestion3)).getText().toString());
                        jSONObject3.put("a", gv.r.i1(String.valueOf(((RobertoEditText) this$0.n0(R.id.surveyAnswer3)).getText())).toString());
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("q", ((RobertoTextView) this$0.n0(R.id.surveyQuestion4)).getText().toString());
                        jSONObject4.put("a", gv.r.i1(String.valueOf(((RobertoEditText) this$0.n0(R.id.surveyAnswer4)).getText())).toString());
                        jSONArray.put(jSONObject);
                        jSONArray.put(jSONObject2);
                        jSONArray.put(jSONObject3);
                        jSONArray.put(jSONObject4);
                        JSONObject jSONObject5 = new JSONObject();
                        fd.f fVar = FirebaseAuth.getInstance().f;
                        kotlin.jvm.internal.i.d(fVar);
                        jSONObject5.put("firebase_id", fVar.j0());
                        jSONObject5.put("survey", jSONArray);
                        try {
                            ProgressDialog progressDialog = this$0.f10506w;
                            if (progressDialog != null) {
                                progressDialog.show();
                                b0 b0Var = new b0(jSONObject5, new l.b() { // from class: dk.z
                                    @Override // e4.l.b
                                    public final void a(Object obj) {
                                        JSONObject jSONObject6 = (JSONObject) obj;
                                        int i12 = SurveyActivity.f10504y;
                                        SurveyActivity this$02 = SurveyActivity.this;
                                        kotlin.jvm.internal.i.g(this$02, "this$0");
                                        String str = this$02.f10505v;
                                        try {
                                            LogHelper logHelper = LogHelper.INSTANCE;
                                            logHelper.i(str, "response from cloud functions " + jSONObject6);
                                            Toast.makeText(this$02, this$02.getString(R.string.feedback_submit_toast), 1).show();
                                            HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
                                            kotlin.jvm.internal.i.f(appConfig, "getInstance().user.appConfig");
                                            appConfig.put("isSurveyShown", Boolean.TRUE);
                                            FirebasePersistence.getInstance().updateUserOnFirebase();
                                            ProgressDialog progressDialog2 = this$02.f10506w;
                                            if (progressDialog2 != null) {
                                                progressDialog2.dismiss();
                                                if (z10) {
                                                    this$02.o0();
                                                    return;
                                                } else {
                                                    this$02.finish();
                                                    return;
                                                }
                                            }
                                            kotlin.jvm.internal.i.q("progressDialog");
                                            throw null;
                                        } catch (Exception unused) {
                                            LogHelper.INSTANCE.e(str, "exception in success sendfeedback");
                                        }
                                    }
                                }, new a0(this$0, 0));
                                b0Var.setRetryPolicy(new e4.d(0, 1));
                                VolleySingleton.getInstance().add(b0Var);
                                return;
                            }
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f10505v, "error in send", e10);
                            return;
                        }
                    }
                    Toast.makeText(this$0, this$0.getString(R.string.surveyErrorMessage), 1).show();
                    return;
                }
                Toast.makeText(this$0, this$0.getString(R.string.no_internet_msg), 1).show();
                return;
            case 2:
                int i12 = SurveyActivity.f10504y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                    intent.addFlags(1208483840);
                    try {
                        this$0.startActivity(intent);
                        this$0.finish();
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e11);
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                        this$0.finish();
                    }
                    UtilsKt.fireAnalytics("survey_play_store_feedback_submit", UtilsKt.getAnalyticsBundle());
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in creating intent for play store rating", e12);
                    return;
                }
            default:
                int i13 = SurveyActivity.f10504y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UtilsKt.fireAnalytics("survey_play_store_feedback_cancel", UtilsKt.getAnalyticsBundle());
                Utils utils = Utils.INSTANCE;
                String string = this$0.getString(R.string.surveyPageFeedbackNegativeToast);
                kotlin.jvm.internal.i.f(string, "getString(R.string.surve…ageFeedbackNegativeToast)");
                utils.showCustomToast(this$0, string);
                this$0.finish();
                return;
        }
    }
}
