package com.theinnerhour.b2b.components.pro.assessment.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import nn.v0;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProAssessmentDetailActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/assessment/activity/ProAssessmentDetailActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProAssessmentDetailActivity extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f11507y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f11510x = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11508v = LogHelper.INSTANCE.makeLogTag("ProAssessmentDetailActivity");

    /* renamed from: w  reason: collision with root package name */
    public JSONObject f11509w = new JSONObject();

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11510x;
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

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str = this.f11508v;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_pro_assessment_detail);
            try {
                Window window = getWindow();
                window.setStatusBarColor(a.b(this, R.color.login_grey_background));
                if (Build.VERSION.SDK_INT >= 23) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            ((AppCompatImageView) n0(R.id.ivAssessmentDetailBack)).setOnClickListener(new v0(8, this));
            String stringExtra = getIntent().getStringExtra("assessment");
            String str2 = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f11509w = new JSONObject(stringExtra);
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvAssessmentDetailTitle);
            String optString = this.f11509w.optString("assessment_name");
            if (optString != null) {
                str2 = optString;
            }
            robertoTextView.setText(str2);
            if (this.f11509w.has("response_data") && !this.f11509w.isNull("response_data")) {
                JSONArray jSONArray = this.f11509w.getJSONArray("response_data");
                i.f(jSONArray, "assessment.getJSONArray(\"response_data\")");
                try {
                    go.a aVar = new go.a(this, jSONArray);
                    ((RecyclerView) n0(R.id.rvAssessmentDetailRecycler)).setLayoutManager(new LinearLayoutManager(this, 1, false));
                    ((RecyclerView) n0(R.id.rvAssessmentDetailRecycler)).setAdapter(aVar);
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, e11);
                }
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str, e12);
        }
    }
}
