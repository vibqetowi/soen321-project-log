package com.theinnerhour.b2b.components.pro.assessment.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentDetailActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import fo.b;
import fo.d;
import fo.e;
import java.util.LinkedHashMap;
import jo.a;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import nn.k;
import org.json.JSONObject;
import ta.v;
/* compiled from: ProAssessmentListingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/assessment/activity/ProAssessmentListingActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProAssessmentListingActivity extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f11511z = 0;

    /* renamed from: v  reason: collision with root package name */
    public jo.c f11512v;

    /* renamed from: w  reason: collision with root package name */
    public JSONObject f11513w;

    /* renamed from: x  reason: collision with root package name */
    public final int f11514x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f11515y = new LinkedHashMap();

    public ProAssessmentListingActivity() {
        LogHelper.INSTANCE.makeLogTag(ProAssessmentListingActivity.class);
        this.f11513w = new JSONObject();
        this.f11514x = 45554;
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11515y;
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

    public final jo.c o0() {
        jo.c cVar = this.f11512v;
        if (cVar != null) {
            return cVar;
        }
        i.q("proAssessmentViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i6 == this.f11514x) {
            jo.c o02 = o0();
            v.H(f.H(o02), null, 0, new a(o02, null), 3);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pro_assessment_listing);
        Window window = getWindow();
        window.setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
        if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
        jo.c cVar = (jo.c) new o0(this).a(jo.c.class);
        i.g(cVar, "<set-?>");
        this.f11512v = cVar;
        o0().f22533z.e(this, new k(16, new b(this)));
        o0().C.e(this, new k(17, new fo.c(this)));
        o0().A.e(this, new k(18, new d(this)));
        o0().B.e(this, new k(19, new e(this)));
        jo.c o02 = o0();
        v.H(f.H(o02), null, 0, new a(o02, null), 3);
        ((ConstraintLayout) n0(R.id.clAssessmentListingRowProAssessment)).setOnClickListener(new View.OnClickListener(this) { // from class: fo.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProAssessmentListingActivity f15636v;

            {
                this.f15636v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProAssessmentListingActivity this$0 = this.f15636v;
                switch (i6) {
                    case 0:
                        int i10 = ProAssessmentListingActivity.f11511z;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i11 = ProAssessmentListingActivity.f11511z;
                        i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, ProAssessmentDetailActivity.class).putExtra("assessment", this$0.f11513w.toString()));
                        gk.a.b(null, "assessment_list_pro_click");
                        return;
                }
            }
        });
        ((AppCompatImageView) n0(R.id.ivAssessmentListingBack)).setOnClickListener(new View.OnClickListener(this) { // from class: fo.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProAssessmentListingActivity f15636v;

            {
                this.f15636v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProAssessmentListingActivity this$0 = this.f15636v;
                switch (i6) {
                    case 0:
                        int i10 = ProAssessmentListingActivity.f11511z;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i11 = ProAssessmentListingActivity.f11511z;
                        i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, ProAssessmentDetailActivity.class).putExtra("assessment", this$0.f11513w.toString()));
                        gk.a.b(null, "assessment_list_pro_click");
                        return;
                }
            }
        });
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f11512v != null) {
            o0().f22533z.k(this);
            o0().C.k(this);
            o0().A.k(this);
            o0().B.k(this);
        }
    }
}
