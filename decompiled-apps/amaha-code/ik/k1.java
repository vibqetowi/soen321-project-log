package ik;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentScoreFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/k1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k1 extends rr.b {
    public static final /* synthetic */ int I = 0;
    public InitialAssessmentActivity D;
    public Integer F;
    public boolean G;

    /* renamed from: v  reason: collision with root package name */
    public View f20220v;

    /* renamed from: w  reason: collision with root package name */
    public View f20221w;

    /* renamed from: x  reason: collision with root package name */
    public String f20222x;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20219u = LogHelper.INSTANCE.makeLogTag(k1.class);

    /* renamed from: y  reason: collision with root package name */
    public int f20223y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f20224z = -1;
    public String A = "";
    public String B = "";
    public String C = "";
    public int E = -1;

    public final BitmapDrawable J(int i6, boolean z10) {
        int i10;
        if (z10) {
            View view = this.f20221w;
            if (view != null) {
                ((TextView) view.findViewById(R.id.progress)).setText(String.valueOf(i6));
                View view2 = this.f20221w;
                if (view2 != null) {
                    Context context = getContext();
                    kotlin.jvm.internal.i.d(context);
                    ((ImageView) view2.findViewById(R.id.progressBg)).setColorFilter(g0.a.b(context, this.f20224z), PorterDuff.Mode.SRC_ATOP);
                    View view3 = this.f20221w;
                    if (view3 != null) {
                        Context context2 = getContext();
                        kotlin.jvm.internal.i.d(context2);
                        ((ImageView) view3.findViewById(R.id.progressDot)).setColorFilter(g0.a.b(context2, this.f20224z), PorterDuff.Mode.SRC_ATOP);
                        View view4 = this.f20221w;
                        if (view4 != null) {
                            view4.measure(0, 0);
                            View view5 = this.f20221w;
                            if (view5 != null) {
                                int measuredWidth = view5.getMeasuredWidth();
                                View view6 = this.f20221w;
                                if (view6 != null) {
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, view6.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    View view7 = this.f20221w;
                                    if (view7 != null) {
                                        int measuredWidth2 = view7.getMeasuredWidth();
                                        View view8 = this.f20221w;
                                        if (view8 != null) {
                                            view7.layout(0, 0, measuredWidth2, view8.getMeasuredHeight());
                                            View view9 = this.f20221w;
                                            if (view9 != null) {
                                                view9.draw(canvas);
                                                return new BitmapDrawable(getResources(), createBitmap);
                                            }
                                            kotlin.jvm.internal.i.q("thumbViewBottom");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.i.q("thumbViewBottom");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("thumbViewBottom");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("thumbViewBottom");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("thumbViewBottom");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("thumbViewBottom");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("thumbViewBottom");
                    throw null;
                }
                kotlin.jvm.internal.i.q("thumbViewBottom");
                throw null;
            }
            kotlin.jvm.internal.i.q("thumbViewBottom");
            throw null;
        }
        View view10 = this.f20220v;
        if (view10 != null) {
            ((TextView) view10.findViewById(R.id.progress)).setText(String.valueOf(i6));
            View view11 = this.f20220v;
            if (view11 != null) {
                ImageView imageView = (ImageView) view11.findViewById(R.id.progressBg);
                Context context3 = getContext();
                kotlin.jvm.internal.i.d(context3);
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                boolean z11 = ((InitialAssessmentActivity) activity).M;
                int i11 = R.color.grey_2;
                if (z11) {
                    i10 = R.color.grey_2;
                } else {
                    i10 = this.f20224z;
                }
                imageView.setColorFilter(g0.a.b(context3, i10), PorterDuff.Mode.SRC_ATOP);
                View view12 = this.f20220v;
                if (view12 != null) {
                    ImageView imageView2 = (ImageView) view12.findViewById(R.id.progressDot);
                    Context context4 = getContext();
                    kotlin.jvm.internal.i.d(context4);
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    if (!((InitialAssessmentActivity) activity2).M) {
                        i11 = this.f20224z;
                    }
                    imageView2.setColorFilter(g0.a.b(context4, i11), PorterDuff.Mode.SRC_ATOP);
                    View view13 = this.f20220v;
                    if (view13 != null) {
                        view13.measure(0, 0);
                        View view14 = this.f20220v;
                        if (view14 != null) {
                            int measuredWidth3 = view14.getMeasuredWidth();
                            View view15 = this.f20220v;
                            if (view15 != null) {
                                Bitmap createBitmap2 = Bitmap.createBitmap(measuredWidth3, view15.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(createBitmap2);
                                View view16 = this.f20220v;
                                if (view16 != null) {
                                    int measuredWidth4 = view16.getMeasuredWidth();
                                    View view17 = this.f20220v;
                                    if (view17 != null) {
                                        view16.layout(0, 0, measuredWidth4, view17.getMeasuredHeight());
                                        View view18 = this.f20220v;
                                        if (view18 != null) {
                                            view18.draw(canvas2);
                                            return new BitmapDrawable(getResources(), createBitmap2);
                                        }
                                        kotlin.jvm.internal.i.q("thumbView");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("thumbView");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("thumbView");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("thumbView");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("thumbView");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("thumbView");
                    throw null;
                }
                kotlin.jvm.internal.i.q("thumbView");
                throw null;
            }
            kotlin.jvm.internal.i.q("thumbView");
            throw null;
        }
        kotlin.jvm.internal.i.q("thumbView");
        throw null;
    }

    public final void K() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z40;
        boolean z41;
        boolean z42;
        boolean z43;
        boolean z44;
        boolean z45;
        try {
            String str = this.f20222x;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2114782937:
                        if (str.equals(Constants.COURSE_HAPPINESS)) {
                            Context context = getContext();
                            kotlin.jvm.internal.i.d(context);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setProgressDrawableTiled(g0.a.d(context, R.drawable.seekbar_gradient_bg_redblue));
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultHappiness));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(52);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(52);
                            int i6 = this.f20223y;
                            if (i6 >= 0 && i6 < 17) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                androidx.fragment.app.p activity = getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity = (InitialAssessmentActivity) activity;
                                int i10 = InitialAssessmentActivity.T;
                                this.f20224z = R.color.assessment_result;
                                String string = getString(R.string.assessmentResultHappinessLow);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.assessmentResultHappinessLow)");
                                this.A = string;
                                String string2 = getString(R.string.assessmentResultScoreHappinessLowTopText);
                                kotlin.jvm.internal.i.f(string2, "getString(R.string.asses…ScoreHappinessLowTopText)");
                                this.B = string2;
                                String string3 = getString(R.string.assessmentResultScoreHappinessLowBottomText);
                                kotlin.jvm.internal.i.f(string3, "getString(R.string.asses…reHappinessLowBottomText)");
                                this.C = string3;
                            } else {
                                if (17 <= i6 && i6 < 36) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    androidx.fragment.app.p activity2 = getActivity();
                                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity2 = (InitialAssessmentActivity) activity2;
                                    int i11 = InitialAssessmentActivity.T;
                                    this.f20224z = R.color.seekbar_middle;
                                    String string4 = getString(R.string.assessmentResultHappinessModerate);
                                    kotlin.jvm.internal.i.f(string4, "getString(R.string.asses…tResultHappinessModerate)");
                                    this.A = string4;
                                    String string5 = getString(R.string.assessmentResultScoreHappinessModerateTopText);
                                    kotlin.jvm.internal.i.f(string5, "getString(R.string.asses…HappinessModerateTopText)");
                                    this.B = string5;
                                    String string6 = getString(R.string.assessmentResultScoreHappinessModerateBottomText);
                                    kotlin.jvm.internal.i.f(string6, "getString(R.string.asses…pinessModerateBottomText)");
                                    this.C = string6;
                                } else {
                                    if (36 <= i6 && i6 < 53) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        androidx.fragment.app.p activity3 = getActivity();
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity3 = (InitialAssessmentActivity) activity3;
                                        int i12 = InitialAssessmentActivity.T;
                                        this.f20224z = R.color.sea;
                                        String string7 = getString(R.string.assessmentResultHappinessHigh);
                                        kotlin.jvm.internal.i.f(string7, "getString(R.string.assessmentResultHappinessHigh)");
                                        this.A = string7;
                                        String string8 = getString(R.string.assessmentResultScoreHappinessHighTopText);
                                        kotlin.jvm.internal.i.f(string8, "getString(R.string.asses…coreHappinessHighTopText)");
                                        this.B = string8;
                                        String string9 = getString(R.string.assessmentResultScoreHappinessHighBottomText);
                                        kotlin.jvm.internal.i.f(string9, "getString(R.string.asses…eHappinessHighBottomText)");
                                        this.C = string9;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity4).w0()) {
                                int i13 = this.E;
                                if (i13 >= 0 && i13 < 17) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    androidx.fragment.app.p activity5 = getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity4 = (InitialAssessmentActivity) activity5;
                                    int i14 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (17 <= i13 && i13 < 36) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    androidx.fragment.app.p activity6 = getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity5 = (InitialAssessmentActivity) activity6;
                                    int i15 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (36 <= i13 && i13 < 53) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    androidx.fragment.app.p activity7 = getActivity();
                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity6 = (InitialAssessmentActivity) activity7;
                                    int i16 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -1617042330:
                        if (str.equals(Constants.COURSE_DEPRESSION)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultDepression));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(52);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(52);
                            int i17 = this.f20223y;
                            if (i17 >= 0 && i17 < 17) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                androidx.fragment.app.p activity8 = getActivity();
                                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity7 = (InitialAssessmentActivity) activity8;
                                int i18 = InitialAssessmentActivity.T;
                                this.f20224z = R.color.sea;
                                String string10 = getString(R.string.assessmentResultDepressionLow);
                                kotlin.jvm.internal.i.f(string10, "getString(R.string.assessmentResultDepressionLow)");
                                this.A = string10;
                                String string11 = getString(R.string.assessmentResultScoreDepressionLowTopText);
                                kotlin.jvm.internal.i.f(string11, "getString(R.string.asses…coreDepressionLowTopText)");
                                this.B = string11;
                                String string12 = getString(R.string.assessmentResultScoreDepressionLowBottomText);
                                kotlin.jvm.internal.i.f(string12, "getString(R.string.asses…eDepressionLowBottomText)");
                                this.C = string12;
                            } else {
                                if (17 <= i17 && i17 < 36) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    androidx.fragment.app.p activity9 = getActivity();
                                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity8 = (InitialAssessmentActivity) activity9;
                                    int i19 = InitialAssessmentActivity.T;
                                    this.f20224z = R.color.seekbar_middle;
                                    String string13 = getString(R.string.assessmentResultDepressionModerate);
                                    kotlin.jvm.internal.i.f(string13, "getString(R.string.asses…ResultDepressionModerate)");
                                    this.A = string13;
                                    String string14 = getString(R.string.assessmentResultScoreDepressionModerateTopText);
                                    kotlin.jvm.internal.i.f(string14, "getString(R.string.asses…epressionModerateTopText)");
                                    this.B = string14;
                                    String string15 = getString(R.string.assessmentResultScoreDepressionModerateBottomText);
                                    kotlin.jvm.internal.i.f(string15, "getString(R.string.asses…essionModerateBottomText)");
                                    this.C = string15;
                                } else {
                                    if (36 <= i17 && i17 < 53) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (z18) {
                                        androidx.fragment.app.p activity10 = getActivity();
                                        kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity9 = (InitialAssessmentActivity) activity10;
                                        int i20 = InitialAssessmentActivity.T;
                                        this.f20224z = R.color.assessment_result;
                                        String string16 = getString(R.string.assessmentResultDepressionHigh);
                                        kotlin.jvm.internal.i.f(string16, "getString(R.string.assessmentResultDepressionHigh)");
                                        this.A = string16;
                                        String string17 = getString(R.string.assessmentResultScoreDepressionHighTopText);
                                        kotlin.jvm.internal.i.f(string17, "getString(R.string.asses…oreDepressionHighTopText)");
                                        this.B = string17;
                                        String string18 = getString(R.string.assessmentResultScoreDepressionHighBottomText);
                                        kotlin.jvm.internal.i.f(string18, "getString(R.string.asses…DepressionHighBottomText)");
                                        this.C = string18;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity11 = getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity11).w0()) {
                                int i21 = this.E;
                                if (i21 >= 0 && i21 < 17) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    androidx.fragment.app.p activity12 = getActivity();
                                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity10 = (InitialAssessmentActivity) activity12;
                                    int i22 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (17 <= i21 && i21 < 36) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (z20) {
                                    androidx.fragment.app.p activity13 = getActivity();
                                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity11 = (InitialAssessmentActivity) activity13;
                                    int i23 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (36 <= i21 && i21 < 53) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (z21) {
                                    androidx.fragment.app.p activity14 = getActivity();
                                    kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity12 = (InitialAssessmentActivity) activity14;
                                    int i24 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -891989580:
                        if (str.equals(Constants.COURSE_STRESS)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultStress));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(44);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(44);
                            int i25 = this.f20223y;
                            if (i25 >= 0 && i25 < 15) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if (z22) {
                                androidx.fragment.app.p activity15 = getActivity();
                                kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity13 = (InitialAssessmentActivity) activity15;
                                int i26 = InitialAssessmentActivity.T;
                                this.f20224z = R.color.sea;
                                String string19 = getString(R.string.assessmentResultStressLow);
                                kotlin.jvm.internal.i.f(string19, "getString(R.string.assessmentResultStressLow)");
                                this.A = string19;
                                String string20 = getString(R.string.assessmentResultScoreStressLowTopText);
                                kotlin.jvm.internal.i.f(string20, "getString(R.string.asses…ultScoreStressLowTopText)");
                                this.B = string20;
                                String string21 = getString(R.string.assessmentResultScoreStressLowBottomText);
                                kotlin.jvm.internal.i.f(string21, "getString(R.string.asses…ScoreStressLowBottomText)");
                                this.C = string21;
                            } else {
                                if (15 <= i25 && i25 < 30) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (z23) {
                                    androidx.fragment.app.p activity16 = getActivity();
                                    kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity14 = (InitialAssessmentActivity) activity16;
                                    int i27 = InitialAssessmentActivity.T;
                                    this.f20224z = R.color.seekbar_middle;
                                    String string22 = getString(R.string.assessmentResultStressModerate);
                                    kotlin.jvm.internal.i.f(string22, "getString(R.string.assessmentResultStressModerate)");
                                    this.A = string22;
                                    String string23 = getString(R.string.assessmentResultScoreStressModerateTopText);
                                    kotlin.jvm.internal.i.f(string23, "getString(R.string.asses…oreStressModerateTopText)");
                                    this.B = string23;
                                    String string24 = getString(R.string.assessmentResultScoreStressModerateBottomText);
                                    kotlin.jvm.internal.i.f(string24, "getString(R.string.asses…StressModerateBottomText)");
                                    this.C = string24;
                                } else {
                                    if (30 <= i25 && i25 < 45) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        androidx.fragment.app.p activity17 = getActivity();
                                        kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity15 = (InitialAssessmentActivity) activity17;
                                        int i28 = InitialAssessmentActivity.T;
                                        this.f20224z = R.color.assessment_result;
                                        String string25 = getString(R.string.assessmentResultStressHigh);
                                        kotlin.jvm.internal.i.f(string25, "getString(R.string.assessmentResultStressHigh)");
                                        this.A = string25;
                                        String string26 = getString(R.string.assessmentResultScoreStressHighTopText);
                                        kotlin.jvm.internal.i.f(string26, "getString(R.string.asses…ltScoreStressHighTopText)");
                                        this.B = string26;
                                        String string27 = getString(R.string.assessmentResultScoreStressHighBottomText);
                                        kotlin.jvm.internal.i.f(string27, "getString(R.string.asses…coreStressHighBottomText)");
                                        this.C = string27;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity18 = getActivity();
                            kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity18).w0()) {
                                int i29 = this.E;
                                if (i29 >= 0 && i29 < 15) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                if (z25) {
                                    androidx.fragment.app.p activity19 = getActivity();
                                    kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity16 = (InitialAssessmentActivity) activity19;
                                    int i30 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (15 <= i29 && i29 < 30) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (z26) {
                                    androidx.fragment.app.p activity20 = getActivity();
                                    kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity17 = (InitialAssessmentActivity) activity20;
                                    int i31 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (30 <= i29 && i29 < 45) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if (z27) {
                                    androidx.fragment.app.p activity21 = getActivity();
                                    kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity18 = (InitialAssessmentActivity) activity21;
                                    int i32 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 92960775:
                        if (str.equals(Constants.COURSE_ANGER)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultAnger));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(40);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(40);
                            int i33 = this.f20223y;
                            if (i33 >= 0 && i33 < 13) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            if (z28) {
                                androidx.fragment.app.p activity22 = getActivity();
                                kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity19 = (InitialAssessmentActivity) activity22;
                                int i34 = InitialAssessmentActivity.T;
                                this.f20224z = R.color.sea;
                                String string28 = getString(R.string.assessmentResultAngerLow);
                                kotlin.jvm.internal.i.f(string28, "getString(R.string.assessmentResultAngerLow)");
                                this.A = string28;
                                String string29 = getString(R.string.assessmentResultScoreAngerLowTopText);
                                kotlin.jvm.internal.i.f(string29, "getString(R.string.asses…sultScoreAngerLowTopText)");
                                this.B = string29;
                                String string30 = getString(R.string.assessmentResultScoreAngerLowBottomText);
                                kotlin.jvm.internal.i.f(string30, "getString(R.string.asses…tScoreAngerLowBottomText)");
                                this.C = string30;
                            } else {
                                if (13 <= i33 && i33 < 28) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (z29) {
                                    androidx.fragment.app.p activity23 = getActivity();
                                    kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity20 = (InitialAssessmentActivity) activity23;
                                    int i35 = InitialAssessmentActivity.T;
                                    this.f20224z = R.color.seekbar_middle;
                                    String string31 = getString(R.string.assessmentResultAngerModerate);
                                    kotlin.jvm.internal.i.f(string31, "getString(R.string.assessmentResultAngerModerate)");
                                    this.A = string31;
                                    String string32 = getString(R.string.assessmentResultScoreAngerModerateTopText);
                                    kotlin.jvm.internal.i.f(string32, "getString(R.string.asses…coreAngerModerateTopText)");
                                    this.B = string32;
                                    String string33 = getString(R.string.assessmentResultScoreAngerModerateBottomText);
                                    kotlin.jvm.internal.i.f(string33, "getString(R.string.asses…eAngerModerateBottomText)");
                                    this.C = string33;
                                } else {
                                    if (28 <= i33 && i33 < 41) {
                                        z30 = true;
                                    } else {
                                        z30 = false;
                                    }
                                    if (z30) {
                                        androidx.fragment.app.p activity24 = getActivity();
                                        kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity21 = (InitialAssessmentActivity) activity24;
                                        int i36 = InitialAssessmentActivity.T;
                                        this.f20224z = R.color.assessment_result;
                                        String string34 = getString(R.string.assessmentResultAngerHigh);
                                        kotlin.jvm.internal.i.f(string34, "getString(R.string.assessmentResultAngerHigh)");
                                        this.A = string34;
                                        String string35 = getString(R.string.assessmentResultScoreAngerHighTopText);
                                        kotlin.jvm.internal.i.f(string35, "getString(R.string.asses…ultScoreAngerHighTopText)");
                                        this.B = string35;
                                        String string36 = getString(R.string.assessmentResultScoreAngerHighBottomText);
                                        kotlin.jvm.internal.i.f(string36, "getString(R.string.asses…ScoreAngerHighBottomText)");
                                        this.C = string36;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity25 = getActivity();
                            kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity25).w0()) {
                                int i37 = this.E;
                                if (i37 >= 0 && i37 < 13) {
                                    z31 = true;
                                } else {
                                    z31 = false;
                                }
                                if (z31) {
                                    androidx.fragment.app.p activity26 = getActivity();
                                    kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity22 = (InitialAssessmentActivity) activity26;
                                    int i38 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (13 <= i37 && i37 < 28) {
                                    z32 = true;
                                } else {
                                    z32 = false;
                                }
                                if (z32) {
                                    androidx.fragment.app.p activity27 = getActivity();
                                    kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity23 = (InitialAssessmentActivity) activity27;
                                    int i39 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (28 <= i37 && i37 < 41) {
                                    z33 = true;
                                } else {
                                    z33 = false;
                                }
                                if (z33) {
                                    androidx.fragment.app.p activity28 = getActivity();
                                    kotlin.jvm.internal.i.e(activity28, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity24 = (InitialAssessmentActivity) activity28;
                                    int i40 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 109522647:
                        if (str.equals(Constants.COURSE_SLEEP)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultSleep));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(52);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(52);
                            int i41 = this.f20223y;
                            if (i41 >= 0 && i41 < 17) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if (z34) {
                                androidx.fragment.app.p activity29 = getActivity();
                                kotlin.jvm.internal.i.e(activity29, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity25 = (InitialAssessmentActivity) activity29;
                                int i42 = InitialAssessmentActivity.T;
                                this.f20224z = R.color.sea;
                                String string37 = getString(R.string.assessmentResultSleepLow);
                                kotlin.jvm.internal.i.f(string37, "getString(R.string.assessmentResultSleepLow)");
                                this.A = string37;
                                String string38 = getString(R.string.assessmentResultScoreSleepLowTopText);
                                kotlin.jvm.internal.i.f(string38, "getString(R.string.asses…sultScoreSleepLowTopText)");
                                this.B = string38;
                                String string39 = getString(R.string.assessmentResultScoreSleepLowBottomText);
                                kotlin.jvm.internal.i.f(string39, "getString(R.string.asses…tScoreSleepLowBottomText)");
                                this.C = string39;
                            } else {
                                if (17 <= i41 && i41 < 36) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                if (z35) {
                                    androidx.fragment.app.p activity30 = getActivity();
                                    kotlin.jvm.internal.i.e(activity30, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity26 = (InitialAssessmentActivity) activity30;
                                    int i43 = InitialAssessmentActivity.T;
                                    this.f20224z = R.color.seekbar_middle;
                                    String string40 = getString(R.string.assessmentResultSleepModerate);
                                    kotlin.jvm.internal.i.f(string40, "getString(R.string.assessmentResultSleepModerate)");
                                    this.A = string40;
                                    String string41 = getString(R.string.assessmentResultScoreSleepModerateTopText);
                                    kotlin.jvm.internal.i.f(string41, "getString(R.string.asses…coreSleepModerateTopText)");
                                    this.B = string41;
                                    String string42 = getString(R.string.assessmentResultScoreSleepModerateBottomText);
                                    kotlin.jvm.internal.i.f(string42, "getString(R.string.asses…eSleepModerateBottomText)");
                                    this.C = string42;
                                } else {
                                    if (36 <= i41 && i41 < 53) {
                                        z36 = true;
                                    } else {
                                        z36 = false;
                                    }
                                    if (z36) {
                                        androidx.fragment.app.p activity31 = getActivity();
                                        kotlin.jvm.internal.i.e(activity31, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity27 = (InitialAssessmentActivity) activity31;
                                        int i44 = InitialAssessmentActivity.T;
                                        this.f20224z = R.color.assessment_result;
                                        String string43 = getString(R.string.assessmentResultSleepHigh);
                                        kotlin.jvm.internal.i.f(string43, "getString(R.string.assessmentResultSleepHigh)");
                                        this.A = string43;
                                        String string44 = getString(R.string.assessmentResultScoreSleepHighTopText);
                                        kotlin.jvm.internal.i.f(string44, "getString(R.string.asses…ultScoreSleepHighTopText)");
                                        this.B = string44;
                                        String string45 = getString(R.string.assessmentResultScoreSleepHighBottomText);
                                        kotlin.jvm.internal.i.f(string45, "getString(R.string.asses…ScoreSleepHighBottomText)");
                                        this.C = string45;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity32 = getActivity();
                            kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity32).w0()) {
                                int i45 = this.E;
                                if (i45 >= 0 && i45 < 17) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                if (z37) {
                                    androidx.fragment.app.p activity33 = getActivity();
                                    kotlin.jvm.internal.i.e(activity33, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity28 = (InitialAssessmentActivity) activity33;
                                    int i46 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (17 <= i45 && i45 < 36) {
                                    z38 = true;
                                } else {
                                    z38 = false;
                                }
                                if (z38) {
                                    androidx.fragment.app.p activity34 = getActivity();
                                    kotlin.jvm.internal.i.e(activity34, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity29 = (InitialAssessmentActivity) activity34;
                                    int i47 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (36 <= i45 && i45 < 53) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                if (z39) {
                                    androidx.fragment.app.p activity35 = getActivity();
                                    kotlin.jvm.internal.i.e(activity35, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity30 = (InitialAssessmentActivity) activity35;
                                    int i48 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 113319009:
                        if (str.equals(Constants.COURSE_WORRY)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultAnxiety));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(52);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(52);
                            int i49 = this.f20223y;
                            if (i49 >= 0 && i49 < 17) {
                                z40 = true;
                            } else {
                                z40 = false;
                            }
                            if (z40) {
                                androidx.fragment.app.p activity36 = getActivity();
                                kotlin.jvm.internal.i.e(activity36, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity31 = (InitialAssessmentActivity) activity36;
                                int i50 = InitialAssessmentActivity.T;
                                this.f20224z = R.color.sea;
                                String string46 = getString(R.string.assessmentResultAnxietyLow);
                                kotlin.jvm.internal.i.f(string46, "getString(R.string.assessmentResultAnxietyLow)");
                                this.A = string46;
                                String string47 = getString(R.string.assessmentResultScoreAnxietyLowTopText);
                                kotlin.jvm.internal.i.f(string47, "getString(R.string.asses…ltScoreAnxietyLowTopText)");
                                this.B = string47;
                                String string48 = getString(R.string.assessmentResultScoreAnxietyLowBottomText);
                                kotlin.jvm.internal.i.f(string48, "getString(R.string.asses…coreAnxietyLowBottomText)");
                                this.C = string48;
                            } else {
                                if (17 <= i49 && i49 < 36) {
                                    z41 = true;
                                } else {
                                    z41 = false;
                                }
                                if (z41) {
                                    androidx.fragment.app.p activity37 = getActivity();
                                    kotlin.jvm.internal.i.e(activity37, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity32 = (InitialAssessmentActivity) activity37;
                                    int i51 = InitialAssessmentActivity.T;
                                    this.f20224z = R.color.seekbar_middle;
                                    String string49 = getString(R.string.assessmentResultAnxietyModerate);
                                    kotlin.jvm.internal.i.f(string49, "getString(R.string.asses…entResultAnxietyModerate)");
                                    this.A = string49;
                                    String string50 = getString(R.string.assessmentResultScoreAnxietyModerateTopText);
                                    kotlin.jvm.internal.i.f(string50, "getString(R.string.asses…reAnxietyModerateTopText)");
                                    this.B = string50;
                                    String string51 = getString(R.string.assessmentResultScoreAnxietyModerateBottomText);
                                    kotlin.jvm.internal.i.f(string51, "getString(R.string.asses…nxietyModerateBottomText)");
                                    this.C = string51;
                                } else {
                                    if (36 <= i49 && i49 < 53) {
                                        z42 = true;
                                    } else {
                                        z42 = false;
                                    }
                                    if (z42) {
                                        androidx.fragment.app.p activity38 = getActivity();
                                        kotlin.jvm.internal.i.e(activity38, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity33 = (InitialAssessmentActivity) activity38;
                                        int i52 = InitialAssessmentActivity.T;
                                        this.f20224z = R.color.assessment_result;
                                        String string52 = getString(R.string.assessmentResultAnxietyHigh);
                                        kotlin.jvm.internal.i.f(string52, "getString(R.string.assessmentResultAnxietyHigh)");
                                        this.A = string52;
                                        String string53 = getString(R.string.assessmentResultScoreAnxietyHighTopText);
                                        kotlin.jvm.internal.i.f(string53, "getString(R.string.asses…tScoreAnxietyHighTopText)");
                                        this.B = string53;
                                        String string54 = getString(R.string.assessmentResultScoreAnxietyHighBottomText);
                                        kotlin.jvm.internal.i.f(string54, "getString(R.string.asses…oreAnxietyHighBottomText)");
                                        this.C = string54;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity39 = getActivity();
                            kotlin.jvm.internal.i.e(activity39, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity39).w0()) {
                                int i53 = this.E;
                                if (i53 >= 0 && i53 < 17) {
                                    z43 = true;
                                } else {
                                    z43 = false;
                                }
                                if (z43) {
                                    androidx.fragment.app.p activity40 = getActivity();
                                    kotlin.jvm.internal.i.e(activity40, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity34 = (InitialAssessmentActivity) activity40;
                                    int i54 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (17 <= i53 && i53 < 36) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                if (z44) {
                                    androidx.fragment.app.p activity41 = getActivity();
                                    kotlin.jvm.internal.i.e(activity41, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity35 = (InitialAssessmentActivity) activity41;
                                    int i55 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (36 <= i53 && i53 < 53) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                if (z45) {
                                    androidx.fragment.app.p activity42 = getActivity();
                                    kotlin.jvm.internal.i.e(activity42, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity36 = (InitialAssessmentActivity) activity42;
                                    int i56 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            kotlin.jvm.internal.i.q("courseName");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20219u, e10);
        }
    }

    public final void M() {
        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setVisibility(8);
        String str = this.f20222x;
        if (str != null) {
            switch (str.hashCode()) {
                case -2114782937:
                    if (str.equals(Constants.COURSE_HAPPINESS)) {
                        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(24);
                        int i6 = this.f20223y;
                        if (i6 >= 0 && i6 <= 10) {
                            this.f20224z = R.color.assessment_result;
                            this.A = "Can be much happier";
                            String[] strArr = {"It looks like you are not feeling happy at all.", "Though you may not be feeling great right now, you can learn important skills to feel happier."};
                            this.B = strArr[0];
                            this.C = strArr[1];
                            return;
                        } else if (i6 > 10 && i6 < 17) {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Can be happier";
                            String[] strArr2 = {"It looks like you are not feeling very happy.", "Though you may not be feeling great right now, you can learn important skills to feel happier."};
                            this.B = strArr2[0];
                            this.C = strArr2[1];
                            return;
                        } else if (i6 >= 17) {
                            this.f20224z = R.color.sea;
                            this.A = "Doing great!";
                            String[] strArr3 = {"Good news! It looks like you are happy.", "Though you may not be experiencing unhappiness at the moment, you can still learn important skills to feel happier."};
                            this.B = strArr3[0];
                            this.C = strArr3[1];
                            return;
                        } else {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Can be happier";
                            String[] strArr4 = {"It looks like you are not feeling very happy.", "Though you may not be feeling great right now, you can learn important skills to feel happier."};
                            this.B = strArr4[0];
                            this.C = strArr4[1];
                            return;
                        }
                    }
                    return;
                case -1617042330:
                    if (str.equals(Constants.COURSE_DEPRESSION)) {
                        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(44);
                        int i10 = this.f20223y;
                        if (i10 >= 0 && i10 <= 15) {
                            this.f20224z = R.color.sea;
                            this.A = "Coping well";
                            String[] strArr5 = {"Good news! You seem to be coping well and experiencing positive emotions.", "Though you may not be facing any difficulties with your mood at the moment, you can still learn important skills to feel happier."};
                            this.B = strArr5[0];
                            this.C = strArr5[1];
                            return;
                        } else if (i10 > 15 && i10 < 29) {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Low mood";
                            String[] strArr6 = {"It seems that you are not experiencing as many positive emotions as you'd like.", "Though you may not be feeling great right now, you can learn ways to cope with your negative feelings and manage your mood better."};
                            this.B = strArr6[0];
                            this.C = strArr6[1];
                            return;
                        } else if (i10 >= 29) {
                            this.f20224z = R.color.assessment_result;
                            this.A = "Very low mood";
                            String[] strArr7 = {"It looks like you are experiencing a significant number of the symptoms of depression.", "Though you may not be feeling great right now, you can learn ways to cope with your negative feelings and manage your mood better."};
                            this.B = strArr7[0];
                            this.C = strArr7[1];
                            return;
                        } else {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Low mood";
                            String[] strArr8 = {"It seems that you are not experiencing as many positive emotions as you'd like.", "Though you may not be feeling great right now, you can learn ways to cope with your negative feelings and manage your mood better."};
                            this.B = strArr8[0];
                            this.C = strArr8[1];
                            return;
                        }
                    }
                    return;
                case -891989580:
                    if (str.equals(Constants.COURSE_STRESS)) {
                        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(24);
                        int i11 = this.f20223y;
                        if (i11 >= 0 && i11 <= 10) {
                            this.f20224z = R.color.sea;
                            this.A = "Coping well";
                            String[] strArr9 = {"You seem to be coping well with stress.", "Great news! It looks like you are coping with stress well enough. Although you may not be facing any difficulties right now, you can still learn to improve your coping techniques."};
                            this.B = strArr9[0];
                            this.C = strArr9[1];
                            return;
                        } else if (i11 > 10 && i11 < 17) {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Moderate stress";
                            String[] strArr10 = {"It looks like you are not coping with stress well enough.", "Although you may not be coping with stress very well right now, you can learn how to improve your coping techniques to feel better. "};
                            this.B = strArr10[0];
                            this.C = strArr10[1];
                            return;
                        } else if (i11 >= 17) {
                            this.f20224z = R.color.assessment_result;
                            this.A = "Severe stress";
                            String[] strArr11 = {"It looks like your stress levels are very high.", "Although you may not be coping with stress very well right now, you can learn to improve your coping techniques to feel better."};
                            this.B = strArr11[0];
                            this.C = strArr11[1];
                            return;
                        } else {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Moderate stress";
                            String[] strArr12 = {"It looks like you are not coping with stress well enough.", "Although you may not be coping with stress very well right now, you can learn how to improve your coping techniques to feel better. "};
                            this.B = strArr12[0];
                            this.C = strArr12[1];
                            return;
                        }
                    }
                    return;
                case 92960775:
                    if (str.equals(Constants.COURSE_ANGER)) {
                        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(24);
                        int i12 = this.f20223y;
                        if (i12 >= 0 && i12 <= 10) {
                            this.f20224z = R.color.sea;
                            this.A = "Managing Well";
                            String[] strArr13 = {"You seem to be managing your anger in a healthy and constructive manner.", "Great news! It looks like you are coping well. Though you may not be facing any problems with your anger right now, you can still learn techniques to manage your anger in a healthy way."};
                            this.B = strArr13[0];
                            this.C = strArr13[1];
                            return;
                        } else if (i12 > 10 && i12 < 17) {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Moderate Levels of Anger";
                            String[] strArr14 = {"It looks like you are not managing your anger as well as you could.", "Although you may not be coping with anger very well right now, you can learn techniques to manage your anger in a healthy way."};
                            this.B = strArr14[0];
                            this.C = strArr14[1];
                            return;
                        } else if (i12 >= 17) {
                            this.f20224z = R.color.assessment_result;
                            this.A = "High Levels of Anger";
                            String[] strArr15 = {"You seem to get angry very often.", "Although you may not be coping with anger very well right now, you can learn techniques to manage your anger in a healthy way."};
                            this.B = strArr15[0];
                            this.C = strArr15[1];
                            return;
                        } else {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Moderate Levels of Anger";
                            String[] strArr16 = {"It looks like you are not managing your anger as well as you could.", "Although you may not be coping with anger very well right now, you can learn techniques to manage your anger in a healthy way."};
                            this.B = strArr16[0];
                            this.C = strArr16[1];
                            return;
                        }
                    }
                    return;
                case 109522647:
                    if (str.equals(Constants.COURSE_SLEEP)) {
                        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(24);
                        int i13 = this.f20223y;
                        if (i13 >= 0 && i13 <= 10) {
                            this.f20224z = R.color.sea;
                            this.A = "Sleeping Well";
                            String[] strArr17 = {"You seem to be sleeping well.", "Great news! Sounds like you are sleeping well enough. Although you may not be facing any problems with sleep, you can still learn to improve your sleeping habits."};
                            this.B = strArr17[0];
                            this.C = strArr17[1];
                            return;
                        } else if (i13 > 10 && i13 < 17) {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Could Sleep Better";
                            String[] strArr18 = {"It looks like you are not sleeping as well as you could.", "You could be sleeping better. Good sleep is within your control. This programme will guide you through the daily changes you need to make to improve your sleep."};
                            this.B = strArr18[0];
                            this.C = strArr18[1];
                            return;
                        } else if (i13 >= 17) {
                            this.f20224z = R.color.assessment_result;
                            this.A = "Sleeping Poorly";
                            String[] strArr19 = {"It looks like you are not sleeping well.", "You could be sleeping better. Good sleep is within your control. This programme will guide you through the daily changes you need to make in order to improve your sleep."};
                            this.B = strArr19[0];
                            this.C = strArr19[1];
                            return;
                        } else {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Could Sleep Better";
                            String[] strArr20 = {"It looks like you are not sleeping as well as you could.", "You could be sleeping better. Good sleep is within your control. This programme will guide you through the daily changes you need to make to improve your sleep."};
                            this.B = strArr20[0];
                            this.C = strArr20[1];
                            return;
                        }
                    }
                    return;
                case 113319009:
                    if (str.equals(Constants.COURSE_WORRY)) {
                        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(20);
                        int i14 = this.f20223y;
                        if (i14 >= 0 && i14 <= 7) {
                            this.f20224z = R.color.sea;
                            this.A = "Coping Well";
                            String[] strArr21 = {"You seem to be coping well.", "Great news! It looks like you are coping well with your worries. Though you may not be facing any difficulties right now, you can still learn to improve your coping techniques."};
                            this.B = strArr21[0];
                            this.C = strArr21[1];
                            return;
                        } else if (i14 > 7 && i14 < 15) {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Moderate Worry";
                            String[] strArr22 = {"It looks like you are not coping with your worry well enough.", "Although you may not be coping with your worries very well right now, you can learn to improve your coping techniques to feel better."};
                            this.B = strArr22[0];
                            this.C = strArr22[1];
                            return;
                        } else if (i14 >= 15) {
                            this.f20224z = R.color.assessment_result;
                            this.A = "Severe Worry";
                            String[] strArr23 = {"It looks like you are not coping well and worrying too much.", "Although you may not be coping with your worries very well right now, you can learn to improve your coping techniques to feel better."};
                            this.B = strArr23[0];
                            this.C = strArr23[1];
                            return;
                        } else {
                            this.f20224z = R.color.seekbar_middle;
                            this.A = "Moderate Worry";
                            String[] strArr24 = {"It looks like you are not coping with your worry well enough.", "Although you may not be coping with your worries very well right now, you can learn to improve your coping techniques to feel better."};
                            this.B = strArr24[0];
                            this.C = strArr24[1];
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
        kotlin.jvm.internal.i.q("courseName");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.H;
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
        return inflater.inflate(R.layout.fragment_initial_assessment_score, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.H.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0162, code lost:
        if (kotlin.jvm.internal.i.b(com.theinnerhour.b2b.persistence.FirebasePersistence.getInstance().getUser().getCurrentCourse(), com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0240, code lost:
        if (kotlin.jvm.internal.i.b(com.theinnerhour.b2b.persistence.FirebasePersistence.getInstance().getUser().getCurrentCourse(), com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) != false) goto L66;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        int i10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            this.D = (InitialAssessmentActivity) activity;
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView titleAssessmentResultScore = (RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore);
            kotlin.jvm.internal.i.f(titleAssessmentResultScore, "titleAssessmentResultScore");
            insetsUtils.addStatusBarHeight(titleAssessmentResultScore);
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb_text, (ViewGroup) null, false);
            kotlin.jvm.internal.i.f(inflate, "from(activity).inflate(R…_thumb_text, null, false)");
            this.f20220v = inflate;
            View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb_text_bottom, (ViewGroup) null, false);
            kotlin.jvm.internal.i.f(inflate2, "from(activity).inflate(R…text_bottom, null, false)");
            this.f20221w = inflate2;
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
            this.f20222x = currentCourseName;
            if (courseById.getInitialAssessmentScore() != -1 && courseById.getAssessments().size() == 0) {
                this.G = true;
            } else if (courseById.getInitialAssessmentScore() == -1 || (courseById.getInitialAssessmentScore() != -1 && courseById.getAssessments().size() != 0)) {
                this.G = false;
            }
            InitialAssessmentActivity initialAssessmentActivity = this.D;
            if (initialAssessmentActivity != null) {
                int i11 = initialAssessmentActivity.J;
                if (i11 > -1) {
                    this.f20223y = i11;
                    if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (((InitialAssessmentActivity) activity2).K > 0) {
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            int i12 = ((InitialAssessmentActivity) activity3).L;
                            if (i12 != 15) {
                                if (i12 != 30) {
                                    i10 = -1;
                                } else {
                                    i10 = 1;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i10 != -1) {
                                Integer score = courseById.getAssessments().get(i10).getScore();
                                kotlin.jvm.internal.i.d(score);
                                this.F = Integer.valueOf(score.intValue() - this.f20223y);
                                Integer score2 = courseById.getAssessments().get(i10).getScore();
                                kotlin.jvm.internal.i.d(score2);
                                this.E = score2.intValue();
                            }
                        }
                        Integer num = this.F;
                        if (num != null) {
                            if (num.intValue() <= 0 || kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.COURSE_HAPPINESS)) {
                                Integer num2 = this.F;
                                kotlin.jvm.internal.i.d(num2);
                                if (num2.intValue() < 0) {
                                }
                            }
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity4).M = true;
                        }
                    }
                    if (this.G) {
                        M();
                        ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.i1

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ k1 f20201v;

                            {
                                this.f20201v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i13 = r2;
                                k1 this$0 = this.f20201v;
                                switch (i13) {
                                    case 0:
                                        int i14 = k1.I;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        InitialAssessmentActivity initialAssessmentActivity2 = this$0.D;
                                        if (initialAssessmentActivity2 != null) {
                                            initialAssessmentActivity2.n0();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    default:
                                        int i15 = k1.I;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        InitialAssessmentActivity initialAssessmentActivity3 = this$0.D;
                                        if (initialAssessmentActivity3 != null) {
                                            initialAssessmentActivity3.t0();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                }
                            }
                        });
                    } else {
                        K();
                        ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.i1

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ k1 f20201v;

                            {
                                this.f20201v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i13 = r2;
                                k1 this$0 = this.f20201v;
                                switch (i13) {
                                    case 0:
                                        int i14 = k1.I;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        InitialAssessmentActivity initialAssessmentActivity2 = this$0.D;
                                        if (initialAssessmentActivity2 != null) {
                                            initialAssessmentActivity2.n0();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    default:
                                        int i15 = k1.I;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        InitialAssessmentActivity initialAssessmentActivity3 = this$0.D;
                                        if (initialAssessmentActivity3 != null) {
                                            initialAssessmentActivity3.t0();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                }
                            }
                        });
                    }
                } else {
                    this.f20223y = initialAssessmentActivity.v0();
                    if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                        androidx.fragment.app.p activity5 = getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (((InitialAssessmentActivity) activity5).K > 0) {
                            androidx.fragment.app.p activity6 = getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            int i13 = ((InitialAssessmentActivity) activity6).L;
                            if (i13 != 15) {
                                if (i13 != 30) {
                                    i6 = -1;
                                } else {
                                    i6 = 1;
                                }
                            } else {
                                i6 = 0;
                            }
                            if (i6 != -1) {
                                Integer score3 = courseById.getAssessments().get(i6).getScore();
                                kotlin.jvm.internal.i.d(score3);
                                this.F = Integer.valueOf(score3.intValue() - this.f20223y);
                                Integer score4 = courseById.getAssessments().get(i6).getScore();
                                kotlin.jvm.internal.i.d(score4);
                                this.E = score4.intValue();
                            }
                        }
                        Integer num3 = this.F;
                        if (num3 != null) {
                            if (num3.intValue() <= 0 || kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.COURSE_HAPPINESS)) {
                                Integer num4 = this.F;
                                kotlin.jvm.internal.i.d(num4);
                                if (num4.intValue() < 0) {
                                }
                            }
                            androidx.fragment.app.p activity7 = getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity7).M = true;
                        }
                    }
                    K();
                    ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new j1(this, 0, courseById));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentResultScore)).setText(this.A);
                Context context = getContext();
                kotlin.jvm.internal.i.d(context);
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentResultScore)).setTextColor(g0.a.b(context, this.f20224z));
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(this.B);
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText2)).setText(this.C);
                androidx.fragment.app.p activity8 = getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (((InitialAssessmentActivity) activity8).M) {
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setVisibility(0);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setProgress(this.E);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setEnabled(false);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setThumb(J(this.E, false));
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setProgress(this.f20223y);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setEnabled(false);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setThumb(J(this.f20223y, true));
                    return;
                }
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setProgress(this.f20223y);
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setEnabled(false);
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setThumb(J(this.f20223y, false));
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20219u, e10);
        }
    }
}
