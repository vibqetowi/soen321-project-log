package com.theinnerhour.b2b.components.pro.assessment.activity;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ho.t;
import ho.v;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import rr.a;
import rr.b;
/* compiled from: ProTakeAssessmentActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/assessment/activity/ProTakeAssessmentActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProTakeAssessmentActivity extends a {
    public static final /* synthetic */ int D = 0;
    public boolean B;

    /* renamed from: x  reason: collision with root package name */
    public int f11522x;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11521w = LogHelper.INSTANCE.makeLogTag(ProTakeAssessmentActivity.class);

    /* renamed from: y  reason: collision with root package name */
    public JSONArray f11523y = new JSONArray();

    /* renamed from: z  reason: collision with root package name */
    public JSONObject f11524z = new JSONObject();
    public final JSONArray A = new JSONArray();

    @Override // rr.a
    public final void o0() {
        try {
            final Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_pro_assessment_quit, this, R.style.Theme_Dialog);
            ((RobertoTextView) styledDialog.findViewById(R.id.proAssessmentQuitCtaYes)).setOnClickListener(new View.OnClickListener() { // from class: fo.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r3;
                    ProTakeAssessmentActivity this$0 = this;
                    Dialog dialog = styledDialog;
                    switch (i6) {
                        case 0:
                            int i10 = ProTakeAssessmentActivity.D;
                            i.g(dialog, "$dialog");
                            i.g(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            bundle.putInt("page", this$0.f11522x);
                            gk.a.b(bundle, "pro_assessment_quit_yes");
                            dialog.dismiss();
                            this$0.finish();
                            return;
                        default:
                            int i11 = ProTakeAssessmentActivity.D;
                            i.g(dialog, "$dialog");
                            i.g(this$0, "this$0");
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("page", this$0.f11522x);
                            gk.a.b(bundle2, "pro_assessment_quit_no");
                            dialog.dismiss();
                            return;
                    }
                }
            });
            ((RobertoTextView) styledDialog.findViewById(R.id.proAssessmentQuitCtaNo)).setOnClickListener(new View.OnClickListener() { // from class: fo.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r3;
                    ProTakeAssessmentActivity this$0 = this;
                    Dialog dialog = styledDialog;
                    switch (i6) {
                        case 0:
                            int i10 = ProTakeAssessmentActivity.D;
                            i.g(dialog, "$dialog");
                            i.g(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            bundle.putInt("page", this$0.f11522x);
                            gk.a.b(bundle, "pro_assessment_quit_yes");
                            dialog.dismiss();
                            this$0.finish();
                            return;
                        default:
                            int i11 = ProTakeAssessmentActivity.D;
                            i.g(dialog, "$dialog");
                            i.g(this$0, "this$0");
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("page", this$0.f11522x);
                            gk.a.b(bundle2, "pro_assessment_quit_no");
                            dialog.dismiss();
                            return;
                    }
                }
            });
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11521w, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.B) {
            o0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pro_take_assessment);
        Window window = getWindow();
        window.setStatusBarColor(g0.a.b(this, R.color.proPinkStatusBar));
        if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
        String stringExtra = getIntent().getStringExtra("assessment");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f11524z = new JSONObject(stringExtra);
        boolean booleanExtra = getIntent().getBooleanExtra("assessmentComplete", false);
        this.B = booleanExtra;
        if (!booleanExtra) {
            if (this.f11524z.length() > 0) {
                JSONArray optJSONArray = this.f11524z.optJSONArray("response_data");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                this.f11523y = optJSONArray;
                v0();
                return;
            }
            return;
        }
        t0();
    }

    @Override // rr.a
    public final void t0() {
        this.f11522x++;
        v0();
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.C;
        Integer valueOf = Integer.valueOf((int) R.id.proB2CAssessmentCounter);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View findViewById = findViewById(R.id.proB2CAssessmentCounter);
            if (findViewById != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void v0() {
        Fragment vVar;
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l2 = e.l(supportFragmentManager, supportFragmentManager);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        new b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11522x + 1);
        sb2.append('/');
        sb2.append(this.f11523y.length());
        ((RobertoTextView) u0(R.id.proB2CAssessmentCounter)).setText(sb2.toString());
        if (this.f11522x < this.f11523y.length()) {
            vVar = new t();
        } else {
            ((RobertoTextView) u0(R.id.proB2CAssessmentCounter)).setVisibility(8);
            vVar = new v();
        }
        l2.f(R.id.proB2CAssessmentContainer, vVar, String.valueOf(Calendar.getInstance().getTimeInMillis()));
        l2.j();
    }
}
