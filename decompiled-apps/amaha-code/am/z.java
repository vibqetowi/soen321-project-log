package am;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f673u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3GoalsActivity f674v;

    public /* synthetic */ z(V3GoalsActivity v3GoalsActivity, int i6) {
        this.f673u = i6;
        this.f674v = v3GoalsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment;
        boolean z10;
        boolean z11;
        Fragment fragment2;
        JSONObject jSONObject;
        ProgressDialog progressDialog;
        int i6 = this.f673u;
        boolean z12 = true;
        V3GoalsActivity this$0 = this.f674v;
        switch (i6) {
            case 0:
                int i10 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.r0(ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false), false);
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Utils.INSTANCE.showCustomToast(this$0, "Thank you for your feedback! Keep tracking your goals regularly!");
                    ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                    return;
                }
                return;
            case 1:
                int i11 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.r0(false, true);
                return;
            case 2:
                int i12 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.onBackPressed();
                return;
            case 3:
                int i13 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.F == 0) {
                    V3GoalsActivity.a aVar = this$0.P;
                    if (aVar != null) {
                        fragment2 = aVar.q(0);
                    } else {
                        fragment2 = null;
                    }
                    kotlin.jvm.internal.i.e(fragment2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
                    cm.c0 c0Var = (cm.c0) fragment2;
                    String str = c0Var.f5316u;
                    try {
                        bm.o oVar = c0Var.f5319x;
                        ArrayList<hs.f<?, ?>> arrayList = c0Var.f5320y;
                        if (oVar != null && oVar.F && arrayList.isEmpty()) {
                            if (c0Var.f5318w != null) {
                                V3GoalsActivity v3GoalsActivity = c0Var.f5318w;
                                if (v3GoalsActivity != null) {
                                    c0Var.startActivity(new Intent(v3GoalsActivity, V3GoalsActivity.class));
                                    V3GoalsActivity v3GoalsActivity2 = c0Var.f5318w;
                                    if (v3GoalsActivity2 != null) {
                                        v3GoalsActivity2.finish();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                        throw null;
                                    }
                                }
                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                throw null;
                            }
                            return;
                        } else if (arrayList.isEmpty()) {
                            V3GoalsActivity v3GoalsActivity3 = c0Var.f5318w;
                            if (v3GoalsActivity3 != null) {
                                Toast.makeText(v3GoalsActivity3, "No goals added yet", 0).show();
                                return;
                            }
                            return;
                        } else {
                            try {
                                bm.o oVar2 = c0Var.f5319x;
                                if (oVar2 != null) {
                                    oVar2.F = !oVar2.F;
                                    oVar2.i();
                                }
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(str, e10);
                            }
                            V3GoalsActivity v3GoalsActivity4 = c0Var.f5318w;
                            if (v3GoalsActivity4 != null) {
                                bm.o oVar3 = c0Var.f5319x;
                                if (oVar3 != null && oVar3.F) {
                                    v3GoalsActivity4.v0("Done");
                                    return;
                                } else {
                                    v3GoalsActivity4.v0("Edit Goals");
                                    return;
                                }
                            }
                            return;
                        }
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(str, e11);
                        return;
                    }
                }
                V3GoalsActivity.a aVar2 = this$0.P;
                if (aVar2 != null) {
                    fragment = aVar2.q(1);
                } else {
                    fragment = null;
                }
                kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
                cm.z zVar = (cm.z) fragment;
                String str2 = zVar.f5390u;
                try {
                    bm.m mVar = zVar.f5393x;
                    ArrayList<hs.f<?, ?>> arrayList2 = zVar.f5394y;
                    if (mVar != null) {
                        if (mVar.G) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && arrayList2.isEmpty()) {
                            V3GoalsActivity v3GoalsActivity5 = zVar.f5392w;
                            if (v3GoalsActivity5 != null) {
                                zVar.startActivity(new Intent(v3GoalsActivity5, V3GoalsActivity.class));
                                V3GoalsActivity v3GoalsActivity6 = zVar.f5392w;
                                if (v3GoalsActivity6 != null) {
                                    v3GoalsActivity6.finish();
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                            throw null;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        V3GoalsActivity v3GoalsActivity7 = zVar.f5392w;
                        if (v3GoalsActivity7 != null) {
                            Toast.makeText(v3GoalsActivity7, "No goals added yet", 0).show();
                            return;
                        }
                        return;
                    }
                    try {
                        bm.m mVar2 = zVar.f5393x;
                        if (mVar2 != null) {
                            if (!mVar2.G) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            mVar2.v(z10);
                        }
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(str2, e12);
                    }
                    V3GoalsActivity v3GoalsActivity8 = zVar.f5392w;
                    if (v3GoalsActivity8 != null) {
                        bm.m mVar3 = zVar.f5393x;
                        if (mVar3 != null) {
                            if (!mVar3.G) {
                                z12 = false;
                            }
                            if (z12) {
                                v3GoalsActivity8.v0("Done");
                                return;
                            }
                        }
                        v3GoalsActivity8.v0("Edit Goals");
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(str2, e13);
                    return;
                }
            case 4:
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
                            progressDialog = this$0.D;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e("dashboardactivity", "error in send", e14);
                        }
                        if (progressDialog != null) {
                            progressDialog.show();
                            e0 e0Var = new e0(jSONObject, new w(1, this$0), new dk.a0(this$0, 2));
                            e0Var.setRetryPolicy(new e4.d(0, 1));
                            VolleySingleton.getInstance().add(e0Var);
                            ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                            this$0.r0(true, false);
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
            case 5:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                intent.addFlags(1208483840);
                try {
                    this$0.startActivity(intent);
                } catch (Exception e15) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e15);
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                }
                this$0.r0(true, false);
                ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                UtilsKt.fireAnalytics("goal_play_store_feedback_submit", UtilsKt.getAnalyticsBundle());
                return;
            case 6:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                int i14 = V3GoalsActivity.X;
                this$0.r0(true, false);
                ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                Toast.makeText(this$0, this$0.getString(R.string.surveyPageFeedbackNegativeToast), 0).show();
                UtilsKt.fireAnalytics("goal_play_store_feedback_cancel", UtilsKt.getAnalyticsBundle());
                return;
            case 7:
                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(8);
                    return;
                }
                return;
            case 8:
                AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar2 != null) {
                    appCompatSeekBar2.setProgress(9);
                    return;
                }
                return;
            case 9:
                AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar3 != null) {
                    appCompatSeekBar3.setProgress(10);
                    return;
                }
                return;
            case 10:
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clNPSBottomSheet)).setState(4);
                String str3 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                defpackage.e.s(bundle, "course", "type", "goals");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "self_care_nps_cancel");
                return;
            case 11:
                AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar4 != null) {
                    appCompatSeekBar4.setProgress(0);
                    return;
                }
                return;
            case 12:
                AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar5 != null) {
                    appCompatSeekBar5.setProgress(1);
                    return;
                }
                return;
            case 13:
                AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar6 != null) {
                    appCompatSeekBar6.setProgress(2);
                    return;
                }
                return;
            case 14:
                AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar7 != null) {
                    appCompatSeekBar7.setProgress(3);
                    return;
                }
                return;
            case 15:
                AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar8 != null) {
                    appCompatSeekBar8.setProgress(4);
                    return;
                }
                return;
            case 16:
                AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar9 != null) {
                    appCompatSeekBar9.setProgress(5);
                    return;
                }
                return;
            case 17:
                AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar10 != null) {
                    appCompatSeekBar10.setProgress(6);
                    return;
                }
                return;
            default:
                AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0.n0(R.id.sbNPSSelector);
                if (appCompatSeekBar11 != null) {
                    appCompatSeekBar11.setProgress(7);
                    return;
                }
                return;
        }
    }
}
