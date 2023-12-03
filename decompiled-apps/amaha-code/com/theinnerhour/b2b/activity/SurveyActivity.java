package com.theinnerhour.b2b.activity;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SurveyActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import dk.y;
import g0.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SurveyActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/SurveyActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SurveyActivity extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f10504y = 0;

    /* renamed from: w  reason: collision with root package name */
    public ProgressDialog f10506w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f10507x = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10505v = LogHelper.INSTANCE.makeLogTag(SurveyActivity.class);

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f10507x;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void o0() {
        if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
            UtilsKt.fireAnalytics("survey_feedback_show", UtilsKt.getAnalyticsBundle());
            ((ConstraintLayout) n0(R.id.feedbackContainer)).setVisibility(0);
            ((ConstraintLayout) n0(R.id.surveyContainer)).setVisibility(8);
            ((RobertoButton) n0(R.id.feedbackRateButton)).setOnClickListener(new y(this, 2));
            ((RobertoButton) n0(R.id.feedbackCancelButton)).setOnClickListener(new y(this, 3));
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_survey);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f10506w = progressDialog;
        progressDialog.setMessage("Loading...");
        ProgressDialog progressDialog2 = this.f10506w;
        if (progressDialog2 != null) {
            progressDialog2.setCancelable(false);
            getWindow().getDecorView().setSystemUiVisibility(1280);
            ((ConstraintLayout) n0(R.id.surveyParentLayout)).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dk.x
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
                    int i6 = SurveyActivity.f10504y;
                    SurveyActivity this$0 = SurveyActivity.this;
                    kotlin.jvm.internal.i.g(this$0, "this$0");
                    kotlin.jvm.internal.i.g(view, "<anonymous parameter 0>");
                    kotlin.jvm.internal.i.g(insets, "insets");
                    int systemWindowInsetTop = insets.getSystemWindowInsetTop();
                    float f = this$0.getResources().getDisplayMetrics().density * 8;
                    ViewGroup.LayoutParams layoutParams = ((AppCompatImageView) this$0.n0(R.id.btnSurveyBack)).getLayoutParams();
                    kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(0, (int) (f + systemWindowInsetTop), 0, 0);
                    ((AppCompatImageView) this$0.n0(R.id.btnSurveyBack)).setLayoutParams(marginLayoutParams);
                    return insets.consumeSystemWindowInsets();
                }
            });
            try {
                Window window = getWindow();
                if (Build.VERSION.SDK_INT >= 23) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                    window.setStatusBarColor(a.b(this, R.color.transparent));
                } else {
                    window.setStatusBarColor(a.b(this, R.color.status_bar_grey));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10505v, "Error in setting custom status bar", e10);
            }
            ((AppCompatImageView) n0(R.id.btnSurveyBack)).setOnClickListener(new y(this, 0));
            ((RobertoButton) n0(R.id.surveySubmitButton)).setOnClickListener(new y(this, 1));
            return;
        }
        i.q("progressDialog");
        throw null;
    }
}
