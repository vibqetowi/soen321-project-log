package am;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f666u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V2GoalsActivity f667v;

    public /* synthetic */ u(V2GoalsActivity v2GoalsActivity, int i6) {
        this.f666u = i6;
        this.f667v = v2GoalsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        JSONObject jSONObject;
        ProgressDialog progressDialog;
        int i6 = this.f666u;
        V2GoalsActivity this$0 = this.f667v;
        switch (i6) {
            case 0:
                int i10 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.onBackPressed();
                return;
            case 1:
                int i11 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                bm.i iVar = this$0.O;
                ArrayList<Object> arrayList = this$0.L;
                if (iVar != null && iVar.D && arrayList.isEmpty()) {
                    this$0.startActivity(new Intent(this$0, V2GoalsActivity.class));
                    this$0.finish();
                    return;
                } else if (arrayList.isEmpty()) {
                    Toast.makeText(this$0, "No goals added yet", 0).show();
                    return;
                } else {
                    bm.i iVar2 = this$0.O;
                    if (iVar2 != null) {
                        bm.i iVar3 = this$0.O;
                        kotlin.jvm.internal.i.d(iVar3);
                        iVar2.D = !iVar3.D;
                        bm.i iVar4 = this$0.O;
                        kotlin.jvm.internal.i.d(iVar4);
                        iVar4.i();
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) this$0.n0(R.id.ivMenu);
                    bm.i iVar5 = this$0.O;
                    if (iVar5 != null && iVar5.D) {
                        str = "Done";
                    } else {
                        str = "Edit Goals";
                    }
                    robertoTextView.setText(str);
                    return;
                }
            case 2:
                int i12 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(new Intent(this$0, AddGoalsActivity.class), this$0.f11177z);
                return;
            case 3:
                int i13 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.p0(ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false), false);
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Utils.INSTANCE.showCustomToast(this$0, "Thank you for your feedback! Keep tracking your goals regularly!");
                    ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                    return;
                }
                return;
            case 4:
                int i14 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.p0(false, true);
                return;
            case 5:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String valueOf = String.valueOf(((RobertoEditText) this$0.n0(R.id.feedbackTextInput)).getText());
                if (!gv.n.B0(valueOf) && !gv.n.B0(gv.r.i1(valueOf).toString())) {
                    if (Utils.INSTANCE.checkConnectivity(this$0)) {
                        try {
                            PackageInfo packageInfo = this$0.getPackageManager().getPackageInfo(this$0.getPackageName(), 0);
                            jSONObject = new JSONObject();
                            jSONObject.put("feedbackDetails", "feedback: " + valueOf + " \n rating: " + FirebasePersistence.getInstance().getUser().getAppFeedback().getTopMenuFeedback());
                            jSONObject.put("userName", SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
                            jSONObject.put("versionName", packageInfo.versionName);
                            jSONObject.put("versionCode", String.valueOf(h0.a.a(packageInfo)));
                            jSONObject.put("device", Build.DEVICE);
                            jSONObject.put("model", Build.MODEL);
                            jSONObject.put("product", Build.PRODUCT);
                            progressDialog = this$0.H;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e("dashboardactivity", "error in send", e10);
                        }
                        if (progressDialog != null) {
                            progressDialog.show();
                            y yVar = new y(jSONObject, new w(0, this$0), new dk.a0(this$0, 1));
                            yVar.setRetryPolicy(new e4.d(0, 1));
                            VolleySingleton.getInstance().add(yVar);
                            ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                            this$0.p0(true, false);
                            UtilsKt.fireAnalytics("goal_negative_feedback_submit", UtilsKt.getAnalyticsBundle());
                            return;
                        }
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                    return;
                }
                Toast.makeText(this$0, "Please enter some text", 0).show();
                return;
            case 6:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                intent.addFlags(1208483840);
                try {
                    this$0.startActivity(intent);
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e11);
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                }
                this$0.p0(true, false);
                ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                UtilsKt.fireAnalytics("goal_play_store_feedback_submit", UtilsKt.getAnalyticsBundle());
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                int i15 = V2GoalsActivity.Q;
                this$0.p0(true, false);
                ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                Toast.makeText(this$0, this$0.getString(R.string.recommended_activity_feedback_negative_toast), 0).show();
                UtilsKt.fireAnalytics("goal_play_store_feedback_cancel", UtilsKt.getAnalyticsBundle());
                return;
        }
    }
}
