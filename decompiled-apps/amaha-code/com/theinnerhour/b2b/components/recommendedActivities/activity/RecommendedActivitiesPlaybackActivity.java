package com.theinnerhour.b2b.components.recommendedActivities.activity;

import a3.t;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import gv.n;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import so.b0;
import ss.l;
import ta.v;
import xo.d;
import zo.e;
import zo.p;
/* compiled from: RecommendedActivitiesPlaybackActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/recommendedActivities/activity/RecommendedActivitiesPlaybackActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendedActivitiesPlaybackActivity extends rr.a {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public boolean B;
    public Dialog C;
    public String D;
    public boolean E;

    /* renamed from: w  reason: collision with root package name */
    public final String f11608w;

    /* renamed from: x  reason: collision with root package name */
    public RecommendedActivityModel f11609x;

    /* renamed from: y  reason: collision with root package name */
    public String f11610y;

    /* renamed from: z  reason: collision with root package name */
    public ap.a f11611z;

    /* compiled from: RecommendedActivitiesPlaybackActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled;
            SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                if (!contentIfNotHandled.booleanValue()) {
                    contentIfNotHandled = null;
                }
                if (contentIfNotHandled != null) {
                    contentIfNotHandled.booleanValue();
                    int i6 = RecommendedActivitiesPlaybackActivity.F;
                    RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = RecommendedActivitiesPlaybackActivity.this;
                    recommendedActivitiesPlaybackActivity.getClass();
                    try {
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_goal_check, recommendedActivitiesPlaybackActivity, R.style.Theme_Dialog_Fullscreen);
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) styledDialog.findViewById(R.id.goalCheckAnimation);
                        if (Build.VERSION.SDK_INT < 25) {
                            if (lottieAnimationView != null) {
                                lottieAnimationView.setRenderMode(t.SOFTWARE);
                            }
                        } else if (lottieAnimationView != null) {
                            lottieAnimationView.setRenderMode(t.HARDWARE);
                        }
                        lottieAnimationView.c(new d(styledDialog, lottieAnimationView, recommendedActivitiesPlaybackActivity));
                        styledDialog.setCancelable(false);
                        styledDialog.show();
                        lottieAnimationView.h();
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(recommendedActivitiesPlaybackActivity.f11608w, e10);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivitiesPlaybackActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                contentIfNotHandled.booleanValue();
                int i6 = RecommendedActivitiesPlaybackActivity.F;
                RecommendedActivitiesPlaybackActivity.this.x0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivitiesPlaybackActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled;
            Boolean bool;
            boolean z10;
            SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                boolean booleanValue = contentIfNotHandled.booleanValue();
                StringBuilder sb2 = new StringBuilder("showing : ");
                RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = RecommendedActivitiesPlaybackActivity.this;
                Dialog dialog = recommendedActivitiesPlaybackActivity.C;
                if (dialog != null) {
                    bool = Boolean.valueOf(dialog.isShowing());
                } else {
                    bool = null;
                }
                sb2.append(bool);
                sb2.append(" && bollen :");
                sb2.append(booleanValue);
                Log.d("GoalLoaderTAg", sb2.toString());
                if (booleanValue) {
                    Dialog dialog2 = recommendedActivitiesPlaybackActivity.C;
                    if (dialog2 != null && !dialog2.isShowing()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Dialog dialog3 = recommendedActivitiesPlaybackActivity.C;
                        if (dialog3 != null) {
                            dialog3.show();
                        }
                    }
                }
                Dialog dialog4 = recommendedActivitiesPlaybackActivity.C;
                if (dialog4 != null) {
                    dialog4.dismiss();
                }
            }
            return hs.k.f19476a;
        }
    }

    public RecommendedActivitiesPlaybackActivity() {
        new LinkedHashMap();
        this.f11608w = LogHelper.INSTANCE.makeLogTag("RecommendedActivitiesPlaybackActivity");
        this.f11610y = "";
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("wasActivityPlayed", this.A);
        intent.putExtra("wasGoalAddedInCurrentSession", this.B);
        intent.putExtra("trackedGoalId", this.D);
        intent.putExtra("markGoalComplete", this.E);
        setResult(-1, intent);
        super.finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recommended_activities_playback);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        xo.c cVar = new xo.c(this);
        String str = this.f11608w;
        UtilsKt.logError(str, "Error in setting custom status bar", cVar);
        try {
            RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) getIntent().getParcelableExtra("model");
            if (recommendedActivityModel == null) {
                return;
            }
            this.f11609x = recommendedActivityModel;
            if (getIntent().hasExtra("source")) {
                this.f11610y = getIntent().getStringExtra("source");
            }
            w0();
            if (!sp.b.K()) {
                x0();
            }
            Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_loading_dots, this);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            this.C = dialog;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, e10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f11609x != null && intent != null && intent.hasExtra("audio_click")) {
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString("activity_id", u0().getGoalId());
            bundle.putString("activity_name", u0().getTitle());
            String lowerCase = u0().getTemplateType().toLowerCase();
            i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            bundle.putString("type", lowerCase);
            gk.a.b(bundle, "activity_media_notif_click");
        }
    }

    @Override // rr.a
    public final void s0(rr.b bVar) {
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l2 = e.l(supportFragmentManager, supportFragmentManager);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
        String.valueOf(Calendar.getInstance().getTimeInMillis());
        l2.f(R.id.flRAActivity, bVar, null);
        l2.d(null);
        l2.j();
    }

    public final RecommendedActivityModel u0() {
        RecommendedActivityModel recommendedActivityModel = this.f11609x;
        if (recommendedActivityModel != null) {
            return recommendedActivityModel;
        }
        i.q("recommendedActivityModel");
        throw null;
    }

    public final void v0(String goalId) {
        i.g(goalId, "goalId");
        if (i.b(this.f11610y, "goals")) {
            this.E = true;
            n0();
            return;
        }
        this.D = goalId;
        ap.a aVar = this.f11611z;
        if (aVar != null) {
            try {
                if (!n.B0(goalId)) {
                    v.H(f.H(aVar), null, 0, new ap.c(aVar, goalId, null), 3);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar.f3365x, e10);
            }
        }
    }

    public final void w0() {
        ap.a aVar = (ap.a) new o0(this).a(ap.a.class);
        aVar.f3366y.e(this, new b0(8, new a()));
        aVar.B.e(this, new b0(9, new b()));
        aVar.f3367z.e(this, new b0(10, new c()));
        if (sp.b.K()) {
            String goalId = u0().getGoalId();
            i.g(goalId, "goalId");
            v.H(f.H(aVar), null, 0, new ap.b(aVar, goalId, true, null), 3);
        }
        this.f11611z = aVar;
    }

    public final void x0() {
        rr.b withArgs;
        Bundle bundle = new Bundle();
        bundle.putParcelable("model", u0());
        String templateType = u0().getTemplateType();
        if (i.b(templateType, "Audio")) {
            withArgs = UtilsKt.withArgs(new e(), bundle);
        } else if (i.b(templateType, "Gif")) {
            withArgs = UtilsKt.withArgs(new zo.i(), bundle);
        } else {
            withArgs = UtilsKt.withArgs(new p(), bundle);
        }
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l2 = e.l(supportFragmentManager, supportFragmentManager);
        l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
        l2.f(R.id.flRAActivity, withArgs, null);
        l2.j();
    }
}
