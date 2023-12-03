package com.theinnerhour.b2b.components.recommendedActivities.activity;

import am.w;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import ap.f;
import ap.g;
import ap.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import e.d;
import g0.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import so.b0;
import t0.u0;
import ta.v;
import xo.b;
/* compiled from: RecommendedActivitiesExperimentActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/recommendedActivities/activity/RecommendedActivitiesExperimentActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendedActivitiesExperimentActivity extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f11603z = 0;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f11606x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f11607y = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11604v = LogHelper.INSTANCE.makeLogTag(RecommendedActivitiesExperimentActivity.class);

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f11605w = new ArrayList<>();

    public RecommendedActivitiesExperimentActivity() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new d(), new w(26, this));
        i.f(registerForActivityResult, "registerForActivityResul…t.add(it)\n        }\n    }");
        this.f11606x = registerForActivityResult;
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("updateGoalIdList", this.f11605w);
        setResult(-1, intent);
        super.finish();
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11607y;
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        u0.e aVar;
        u0.e eVar;
        super.onCreate(bundle);
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                View decorView = window.getDecorView();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 30) {
                    eVar = new u0.d(window);
                } else {
                    if (i6 >= 26) {
                        aVar = new u0.c(decorView, window);
                    } else if (i6 >= 23) {
                        aVar = new u0.b(decorView, window);
                    } else {
                        aVar = new u0.a(decorView, window);
                    }
                    eVar = aVar;
                }
                eVar.d(true);
            }
            window.setStatusBarColor(a.b(this, R.color.recommendedActivityActivityTaskbar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11604v, "Error in setting custom status bar", e10);
        }
        setContentView(R.layout.activity_recommended_activities_experiment);
        f fVar = new f();
        Application application = getApplication();
        i.f(application, "application");
        h hVar = (h) new o0(this, new kk.c(application, fVar)).a(h.class);
        hVar.f3410z.e(this, new b0(7, new b(this)));
        ((ConstraintLayout) n0(R.id.clRAExperimentLoadingLayout)).setVisibility(0);
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        v.H(kc.f.H(hVar), null, 0, new g(hVar, false, false, str, null), 3);
    }
}
