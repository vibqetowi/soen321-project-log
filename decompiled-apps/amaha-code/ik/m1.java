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
/* compiled from: InitialAssessmentScorePersonalisedFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/m1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m1 extends rr.b {
    public static final /* synthetic */ int J = 0;
    public InitialAssessmentActivity F;
    public Integer H;

    /* renamed from: v  reason: collision with root package name */
    public View f20244v;

    /* renamed from: w  reason: collision with root package name */
    public View f20245w;

    /* renamed from: x  reason: collision with root package name */
    public String f20246x;
    public final LinkedHashMap I = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20243u = LogHelper.INSTANCE.makeLogTag(m1.class);

    /* renamed from: y  reason: collision with root package name */
    public int f20247y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f20248z = -1;
    public String A = "";
    public String B = "";
    public String C = "";
    public String D = "";
    public String E = "";
    public int G = -1;

    public final BitmapDrawable J(int i6, boolean z10) {
        int i10;
        if (z10) {
            View view = this.f20245w;
            if (view != null) {
                ((TextView) view.findViewById(R.id.progress)).setText(String.valueOf(i6));
                View view2 = this.f20245w;
                if (view2 != null) {
                    ((ImageView) view2.findViewById(R.id.progressBg)).setColorFilter(g0.a.b(requireContext(), this.f20248z), PorterDuff.Mode.SRC_ATOP);
                    View view3 = this.f20245w;
                    if (view3 != null) {
                        ((ImageView) view3.findViewById(R.id.progressDot)).setColorFilter(g0.a.b(requireContext(), this.f20248z), PorterDuff.Mode.SRC_ATOP);
                        View view4 = this.f20245w;
                        if (view4 != null) {
                            view4.measure(0, 0);
                            View view5 = this.f20245w;
                            if (view5 != null) {
                                int measuredWidth = view5.getMeasuredWidth();
                                View view6 = this.f20245w;
                                if (view6 != null) {
                                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, view6.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    View view7 = this.f20245w;
                                    if (view7 != null) {
                                        int measuredWidth2 = view7.getMeasuredWidth();
                                        View view8 = this.f20245w;
                                        if (view8 != null) {
                                            view7.layout(0, 0, measuredWidth2, view8.getMeasuredHeight());
                                            View view9 = this.f20245w;
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
        View view10 = this.f20244v;
        if (view10 != null) {
            ((TextView) view10.findViewById(R.id.progress)).setText(String.valueOf(i6));
            View view11 = this.f20244v;
            if (view11 != null) {
                ImageView imageView = (ImageView) view11.findViewById(R.id.progressBg);
                Context requireContext = requireContext();
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                boolean z11 = ((InitialAssessmentActivity) activity).M;
                int i11 = R.color.grey_2;
                if (z11) {
                    i10 = R.color.grey_2;
                } else {
                    i10 = this.f20248z;
                }
                imageView.setColorFilter(g0.a.b(requireContext, i10), PorterDuff.Mode.SRC_ATOP);
                View view12 = this.f20244v;
                if (view12 != null) {
                    ImageView imageView2 = (ImageView) view12.findViewById(R.id.progressDot);
                    Context requireContext2 = requireContext();
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    if (!((InitialAssessmentActivity) activity2).M) {
                        i11 = this.f20248z;
                    }
                    imageView2.setColorFilter(g0.a.b(requireContext2, i11), PorterDuff.Mode.SRC_ATOP);
                    View view13 = this.f20244v;
                    if (view13 != null) {
                        view13.measure(0, 0);
                        View view14 = this.f20244v;
                        if (view14 != null) {
                            int measuredWidth3 = view14.getMeasuredWidth();
                            View view15 = this.f20244v;
                            if (view15 != null) {
                                Bitmap createBitmap2 = Bitmap.createBitmap(measuredWidth3, view15.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(createBitmap2);
                                View view16 = this.f20244v;
                                if (view16 != null) {
                                    int measuredWidth4 = view16.getMeasuredWidth();
                                    View view17 = this.f20244v;
                                    if (view17 != null) {
                                        view16.layout(0, 0, measuredWidth4, view17.getMeasuredHeight());
                                        View view18 = this.f20244v;
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
        String string;
        String str;
        boolean z13;
        boolean z14;
        String string2;
        boolean z15;
        boolean z16;
        boolean z17;
        String string3;
        String string4;
        String str2;
        boolean z18;
        boolean z19;
        String string5;
        boolean z20;
        boolean z21;
        boolean z22;
        String string6;
        String str3;
        String string7;
        boolean z23;
        boolean z24;
        String string8;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        String string9;
        boolean z30;
        boolean z31;
        boolean z32;
        String string10;
        String string11;
        String str4;
        boolean z33;
        boolean z34;
        String string12;
        String str5;
        boolean z35;
        boolean z36;
        boolean z37;
        String string13;
        String string14;
        String str6;
        boolean z38;
        boolean z39;
        String string15;
        String str7;
        try {
            String str8 = this.f20246x;
            if (str8 != null) {
                String str9 = "getString(R.string.assessmentDoingGreat1)";
                String str10 = "getString(R.string.depre…eoutSeperatorPrompt1Head)";
                String str11 = "getString(R.string.assessmentGotYourBack1)";
                String str12 = "getString(R.string.assessmentGotYourBack2)";
                boolean z40 = true;
                switch (str8.hashCode()) {
                    case -2114782937:
                        if (str8.equals(Constants.COURSE_HAPPINESS)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultHappiness));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setProgressDrawableTiled(g0.a.d(requireContext(), R.drawable.seekbar_gradient_bg_redblue));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(44);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(44);
                            int i6 = this.f20247y;
                            if (i6 >= 0 && i6 < 15) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                androidx.fragment.app.p activity = getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity = (InitialAssessmentActivity) activity;
                                int i10 = InitialAssessmentActivity.T;
                                this.f20248z = R.color.assessment_result;
                                String string16 = getString(R.string.assessmentResultHappinessLow);
                                kotlin.jvm.internal.i.f(string16, "getString(R.string.assessmentResultHappinessLow)");
                                this.A = string16;
                                String string17 = getString(R.string.assessmentResultScoreHappinessLowTopText);
                                kotlin.jvm.internal.i.f(string17, "getString(R.string.asses…ScoreHappinessLowTopText)");
                                this.B = string17;
                                String string18 = getString(R.string.assessmentResultScoreHappinessLowBottomText);
                                kotlin.jvm.internal.i.f(string18, "getString(R.string.asses…reHappinessLowBottomText)");
                                this.C = string18;
                                String string19 = getString(R.string.assessmentLowImpTextInverse);
                                kotlin.jvm.internal.i.f(string19, "getString(R.string.assessmentLowImpTextInverse)");
                                this.D = string19;
                                InitialAssessmentActivity initialAssessmentActivity2 = this.F;
                                if (initialAssessmentActivity2 != null) {
                                    if (initialAssessmentActivity2.w0()) {
                                        string2 = getString(R.string.assessmentGotYourBack2);
                                    } else {
                                        string2 = getString(R.string.assessmentGotYourBack3);
                                        str12 = "getString(R.string.assessmentGotYourBack3)";
                                    }
                                    kotlin.jvm.internal.i.f(string2, str12);
                                    this.E = string2;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                if (15 <= i6 && i6 < 30) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    androidx.fragment.app.p activity2 = getActivity();
                                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity3 = (InitialAssessmentActivity) activity2;
                                    int i11 = InitialAssessmentActivity.T;
                                    this.f20248z = R.color.seekbar_middle;
                                    String string20 = getString(R.string.assessmentResultHappinessModerate);
                                    kotlin.jvm.internal.i.f(string20, "getString(R.string.asses…tResultHappinessModerate)");
                                    this.A = string20;
                                    String string21 = getString(R.string.assessmentResultScoreHappinessModerateTopText);
                                    kotlin.jvm.internal.i.f(string21, "getString(R.string.asses…HappinessModerateTopText)");
                                    this.B = string21;
                                    String string22 = getString(R.string.assessmentResultScoreHappinessModerateBottomText);
                                    kotlin.jvm.internal.i.f(string22, "getString(R.string.asses…pinessModerateBottomText)");
                                    this.C = string22;
                                    String string23 = getString(R.string.happinessAssessmentMedImpText);
                                    kotlin.jvm.internal.i.f(string23, "getString(R.string.happinessAssessmentMedImpText)");
                                    this.D = string23;
                                    InitialAssessmentActivity initialAssessmentActivity4 = this.F;
                                    if (initialAssessmentActivity4 != null) {
                                        if (initialAssessmentActivity4.w0()) {
                                            string = getString(R.string.assessmentDoingBetter);
                                            str = "getString(R.string.assessmentDoingBetter)";
                                        } else {
                                            string = getString(R.string.assessmentDoingGood2);
                                            str = "getString(R.string.assessmentDoingGood2)";
                                        }
                                        kotlin.jvm.internal.i.f(string, str);
                                        this.E = string;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                } else {
                                    if (30 <= i6 && i6 < 45) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        androidx.fragment.app.p activity3 = getActivity();
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity5 = (InitialAssessmentActivity) activity3;
                                        int i12 = InitialAssessmentActivity.T;
                                        this.f20248z = R.color.sea;
                                        String string24 = getString(R.string.assessmentResultHappinessHigh);
                                        kotlin.jvm.internal.i.f(string24, "getString(R.string.assessmentResultHappinessHigh)");
                                        this.A = string24;
                                        String string25 = getString(R.string.assessmentResultScoreHappinessHighTopText);
                                        kotlin.jvm.internal.i.f(string25, "getString(R.string.asses…coreHappinessHighTopText)");
                                        this.B = string25;
                                        String string26 = getString(R.string.assessmentResultScoreHappinessHighBottomText);
                                        kotlin.jvm.internal.i.f(string26, "getString(R.string.asses…eHappinessHighBottomText)");
                                        this.C = string26;
                                        String string27 = getString(R.string.happinessAssessmentHighImpText);
                                        kotlin.jvm.internal.i.f(string27, "getString(R.string.happinessAssessmentHighImpText)");
                                        this.D = string27;
                                        String string28 = getString(R.string.assessmentFantastic);
                                        kotlin.jvm.internal.i.f(string28, "getString(R.string.assessmentFantastic)");
                                        this.E = string28;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity4).w0()) {
                                int i13 = this.G;
                                if (i13 >= 0 && i13 < 15) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    androidx.fragment.app.p activity5 = getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity6 = (InitialAssessmentActivity) activity5;
                                    int i14 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (15 <= i13 && i13 < 30) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    androidx.fragment.app.p activity6 = getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity7 = (InitialAssessmentActivity) activity6;
                                    int i15 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (30 > i13 || i13 >= 45) {
                                    z40 = false;
                                }
                                if (z40) {
                                    androidx.fragment.app.p activity7 = getActivity();
                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity8 = (InitialAssessmentActivity) activity7;
                                    int i16 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -1617042330:
                        if (str8.equals(Constants.COURSE_DEPRESSION)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultDepression));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(40);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(40);
                            int i17 = this.f20247y;
                            if (i17 >= 0 && i17 < 13) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                androidx.fragment.app.p activity8 = getActivity();
                                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity9 = (InitialAssessmentActivity) activity8;
                                int i18 = InitialAssessmentActivity.T;
                                this.f20248z = R.color.sea;
                                String string29 = getString(R.string.assessmentResultDepressionLow);
                                kotlin.jvm.internal.i.f(string29, "getString(R.string.assessmentResultDepressionLow)");
                                this.A = string29;
                                String string30 = getString(R.string.assessmentResultScoreDepressionLowTopText);
                                kotlin.jvm.internal.i.f(string30, "getString(R.string.asses…coreDepressionLowTopText)");
                                this.B = string30;
                                String string31 = getString(R.string.assessmentResultScoreDepressionLowBottomText);
                                kotlin.jvm.internal.i.f(string31, "getString(R.string.asses…eDepressionLowBottomText)");
                                this.C = string31;
                                String string32 = getString(R.string.assessmentLowImpText);
                                kotlin.jvm.internal.i.f(string32, "getString(R.string.assessmentLowImpText)");
                                this.D = string32;
                                InitialAssessmentActivity initialAssessmentActivity10 = this.F;
                                if (initialAssessmentActivity10 != null) {
                                    if (initialAssessmentActivity10.w0()) {
                                        string5 = getString(R.string.assessmentDoingGreat1);
                                    } else {
                                        string5 = getString(R.string.depressionTimeoutSeperatorPrompt1Head);
                                        str9 = "getString(R.string.depre…eoutSeperatorPrompt1Head)";
                                    }
                                    kotlin.jvm.internal.i.f(string5, str9);
                                    this.E = string5;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                if (13 <= i17 && i17 < 28) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    androidx.fragment.app.p activity9 = getActivity();
                                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity11 = (InitialAssessmentActivity) activity9;
                                    int i19 = InitialAssessmentActivity.T;
                                    this.f20248z = R.color.seekbar_middle;
                                    String string33 = getString(R.string.assessmentResultDepressionModerate);
                                    kotlin.jvm.internal.i.f(string33, "getString(R.string.asses…ResultDepressionModerate)");
                                    this.A = string33;
                                    String string34 = getString(R.string.assessmentResultScoreDepressionModerateTopText);
                                    kotlin.jvm.internal.i.f(string34, "getString(R.string.asses…epressionModerateTopText)");
                                    this.B = string34;
                                    String string35 = getString(R.string.assessmentResultScoreDepressionModerateBottomText);
                                    kotlin.jvm.internal.i.f(string35, "getString(R.string.asses…essionModerateBottomText)");
                                    this.C = string35;
                                    String string36 = getString(R.string.depressionAssessmentMedImpText);
                                    kotlin.jvm.internal.i.f(string36, "getString(R.string.depressionAssessmentMedImpText)");
                                    this.D = string36;
                                    InitialAssessmentActivity initialAssessmentActivity12 = this.F;
                                    if (initialAssessmentActivity12 != null) {
                                        if (initialAssessmentActivity12.w0()) {
                                            string4 = getString(R.string.assessmentDoingGreat4);
                                            str2 = "getString(R.string.assessmentDoingGreat4)";
                                        } else {
                                            string4 = getString(R.string.assessmentHereForYou1);
                                            str2 = "getString(R.string.assessmentHereForYou1)";
                                        }
                                        kotlin.jvm.internal.i.f(string4, str2);
                                        this.E = string4;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                } else {
                                    if (28 <= i17 && i17 < 41) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        androidx.fragment.app.p activity10 = getActivity();
                                        kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity13 = (InitialAssessmentActivity) activity10;
                                        int i20 = InitialAssessmentActivity.T;
                                        this.f20248z = R.color.assessment_result;
                                        String string37 = getString(R.string.assessmentResultDepressionHigh);
                                        kotlin.jvm.internal.i.f(string37, "getString(R.string.assessmentResultDepressionHigh)");
                                        this.A = string37;
                                        String string38 = getString(R.string.assessmentResultScoreDepressionHighTopText);
                                        kotlin.jvm.internal.i.f(string38, "getString(R.string.asses…oreDepressionHighTopText)");
                                        this.B = string38;
                                        String string39 = getString(R.string.assessmentResultScoreDepressionHighBottomText);
                                        kotlin.jvm.internal.i.f(string39, "getString(R.string.asses…DepressionHighBottomText)");
                                        this.C = string39;
                                        String string40 = getString(R.string.depressionAssessmentHighImpText);
                                        kotlin.jvm.internal.i.f(string40, "getString(R.string.depre…ionAssessmentHighImpText)");
                                        this.D = string40;
                                        InitialAssessmentActivity initialAssessmentActivity14 = this.F;
                                        if (initialAssessmentActivity14 != null) {
                                            if (initialAssessmentActivity14.w0()) {
                                                string3 = getString(R.string.assessmentGotYourBack2);
                                                str11 = "getString(R.string.assessmentGotYourBack2)";
                                            } else {
                                                string3 = getString(R.string.assessmentGotYourBack1);
                                            }
                                            kotlin.jvm.internal.i.f(string3, str11);
                                            this.E = string3;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                }
                            }
                            androidx.fragment.app.p activity11 = getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity11).w0()) {
                                int i21 = this.G;
                                if (i21 >= 0 && i21 < 13) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (z18) {
                                    androidx.fragment.app.p activity12 = getActivity();
                                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity15 = (InitialAssessmentActivity) activity12;
                                    int i22 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (13 <= i21 && i21 < 28) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    androidx.fragment.app.p activity13 = getActivity();
                                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity16 = (InitialAssessmentActivity) activity13;
                                    int i23 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (28 > i21 || i21 >= 41) {
                                    z40 = false;
                                }
                                if (z40) {
                                    androidx.fragment.app.p activity14 = getActivity();
                                    kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity17 = (InitialAssessmentActivity) activity14;
                                    int i24 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -891989580:
                        if (str8.equals(Constants.COURSE_STRESS)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultStress));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(44);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(44);
                            int i25 = this.f20247y;
                            if (i25 >= 0 && i25 < 15) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if (z20) {
                                androidx.fragment.app.p activity15 = getActivity();
                                kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity18 = (InitialAssessmentActivity) activity15;
                                int i26 = InitialAssessmentActivity.T;
                                this.f20248z = R.color.sea;
                                String string41 = getString(R.string.assessmentResultStressLow);
                                kotlin.jvm.internal.i.f(string41, "getString(R.string.assessmentResultStressLow)");
                                this.A = string41;
                                String string42 = getString(R.string.assessmentResultScoreStressLowTopText);
                                kotlin.jvm.internal.i.f(string42, "getString(R.string.asses…ultScoreStressLowTopText)");
                                this.B = string42;
                                String string43 = getString(R.string.assessmentResultScoreStressLowBottomText);
                                kotlin.jvm.internal.i.f(string43, "getString(R.string.asses…ScoreStressLowBottomText)");
                                this.C = string43;
                                String string44 = getString(R.string.assessmentLowImpText);
                                kotlin.jvm.internal.i.f(string44, "getString(R.string.assessmentLowImpText)");
                                this.D = string44;
                                InitialAssessmentActivity initialAssessmentActivity19 = this.F;
                                if (initialAssessmentActivity19 != null) {
                                    if (initialAssessmentActivity19.w0()) {
                                        string8 = getString(R.string.assessmentDoingWell1);
                                        str10 = "getString(R.string.assessmentDoingWell1)";
                                    } else {
                                        string8 = getString(R.string.depressionTimeoutSeperatorPrompt1Head);
                                    }
                                    kotlin.jvm.internal.i.f(string8, str10);
                                    this.E = string8;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                if (15 <= i25 && i25 < 30) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (z21) {
                                    androidx.fragment.app.p activity16 = getActivity();
                                    kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity20 = (InitialAssessmentActivity) activity16;
                                    int i27 = InitialAssessmentActivity.T;
                                    this.f20248z = R.color.seekbar_middle;
                                    String string45 = getString(R.string.assessmentResultStressModerate);
                                    kotlin.jvm.internal.i.f(string45, "getString(R.string.assessmentResultStressModerate)");
                                    this.A = string45;
                                    String string46 = getString(R.string.assessmentResultScoreStressModerateTopText);
                                    kotlin.jvm.internal.i.f(string46, "getString(R.string.asses…oreStressModerateTopText)");
                                    this.B = string46;
                                    String string47 = getString(R.string.assessmentResultScoreStressModerateBottomText);
                                    kotlin.jvm.internal.i.f(string47, "getString(R.string.asses…StressModerateBottomText)");
                                    this.C = string47;
                                    String string48 = getString(R.string.stressAssessmentMedImpText);
                                    kotlin.jvm.internal.i.f(string48, "getString(R.string.stressAssessmentMedImpText)");
                                    this.D = string48;
                                    InitialAssessmentActivity initialAssessmentActivity21 = this.F;
                                    if (initialAssessmentActivity21 != null) {
                                        if (initialAssessmentActivity21.w0()) {
                                            string7 = getString(R.string.assessmentCopingWell2);
                                            str12 = "getString(R.string.assessmentCopingWell2)";
                                        } else {
                                            string7 = getString(R.string.assessmentGotYourBack2);
                                        }
                                        kotlin.jvm.internal.i.f(string7, str12);
                                        this.E = string7;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                } else {
                                    if (30 <= i25 && i25 < 45) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (z22) {
                                        androidx.fragment.app.p activity17 = getActivity();
                                        kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity22 = (InitialAssessmentActivity) activity17;
                                        int i28 = InitialAssessmentActivity.T;
                                        this.f20248z = R.color.assessment_result;
                                        String string49 = getString(R.string.assessmentResultStressHigh);
                                        kotlin.jvm.internal.i.f(string49, "getString(R.string.assessmentResultStressHigh)");
                                        this.A = string49;
                                        String string50 = getString(R.string.assessmentResultScoreStressHighTopText);
                                        kotlin.jvm.internal.i.f(string50, "getString(R.string.asses…ltScoreStressHighTopText)");
                                        this.B = string50;
                                        String string51 = getString(R.string.assessmentResultScoreStressHighBottomText);
                                        kotlin.jvm.internal.i.f(string51, "getString(R.string.asses…coreStressHighBottomText)");
                                        this.C = string51;
                                        String string52 = getString(R.string.stressAssessmentHighImpText);
                                        kotlin.jvm.internal.i.f(string52, "getString(R.string.stressAssessmentHighImpText)");
                                        this.D = string52;
                                        InitialAssessmentActivity initialAssessmentActivity23 = this.F;
                                        if (initialAssessmentActivity23 != null) {
                                            if (initialAssessmentActivity23.w0()) {
                                                string6 = getString(R.string.assessmentGetThrough1);
                                                str3 = "getString(R.string.assessmentGetThrough1)";
                                            } else {
                                                string6 = getString(R.string.assessmentHereForYou3);
                                                str3 = "getString(R.string.assessmentHereForYou3)";
                                            }
                                            kotlin.jvm.internal.i.f(string6, str3);
                                            this.E = string6;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                }
                            }
                            androidx.fragment.app.p activity18 = getActivity();
                            kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity18).w0()) {
                                int i29 = this.G;
                                if (i29 >= 0 && i29 < 15) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (z23) {
                                    androidx.fragment.app.p activity19 = getActivity();
                                    kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity24 = (InitialAssessmentActivity) activity19;
                                    int i30 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (15 <= i29 && i29 < 30) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (z24) {
                                    androidx.fragment.app.p activity20 = getActivity();
                                    kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity25 = (InitialAssessmentActivity) activity20;
                                    int i31 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (30 > i29 || i29 >= 45) {
                                    z40 = false;
                                }
                                if (z40) {
                                    androidx.fragment.app.p activity21 = getActivity();
                                    kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity26 = (InitialAssessmentActivity) activity21;
                                    int i32 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 92960775:
                        if (str8.equals(Constants.COURSE_ANGER)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultAnger));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(44);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(44);
                            int i33 = this.f20247y;
                            if (i33 >= 0 && i33 < 15) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (z25) {
                                androidx.fragment.app.p activity22 = getActivity();
                                kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity27 = (InitialAssessmentActivity) activity22;
                                int i34 = InitialAssessmentActivity.T;
                                this.f20248z = R.color.sea;
                                String string53 = getString(R.string.assessmentResultAngerLow);
                                kotlin.jvm.internal.i.f(string53, "getString(R.string.assessmentResultAngerLow)");
                                this.A = string53;
                                String string54 = getString(R.string.assessmentResultScoreAngerLowTopText);
                                kotlin.jvm.internal.i.f(string54, "getString(R.string.asses…sultScoreAngerLowTopText)");
                                this.B = string54;
                                String string55 = getString(R.string.assessmentResultScoreAngerLowBottomText);
                                kotlin.jvm.internal.i.f(string55, "getString(R.string.asses…tScoreAngerLowBottomText)");
                                this.C = string55;
                                String string56 = getString(R.string.assessmentLowImpText);
                                kotlin.jvm.internal.i.f(string56, "getString(R.string.assessmentLowImpText)");
                                this.D = string56;
                                InitialAssessmentActivity initialAssessmentActivity28 = this.F;
                                if (initialAssessmentActivity28 != null) {
                                    if (initialAssessmentActivity28.w0()) {
                                        string9 = getString(R.string.assessmentDoingGreat1);
                                    } else {
                                        string9 = getString(R.string.assessmentDoingGood2);
                                        str9 = "getString(R.string.assessmentDoingGood2)";
                                    }
                                    kotlin.jvm.internal.i.f(string9, str9);
                                    this.E = string9;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                if (15 <= i33 && i33 < 30) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (z26) {
                                    androidx.fragment.app.p activity23 = getActivity();
                                    kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity29 = (InitialAssessmentActivity) activity23;
                                    int i35 = InitialAssessmentActivity.T;
                                    this.f20248z = R.color.seekbar_middle;
                                    String string57 = getString(R.string.assessmentResultAngerModerate);
                                    kotlin.jvm.internal.i.f(string57, "getString(R.string.assessmentResultAngerModerate)");
                                    this.A = string57;
                                    String string58 = getString(R.string.assessmentResultScoreAngerModerateTopText);
                                    kotlin.jvm.internal.i.f(string58, "getString(R.string.asses…coreAngerModerateTopText)");
                                    this.B = string58;
                                    String string59 = getString(R.string.assessmentResultScoreAngerModerateBottomText);
                                    kotlin.jvm.internal.i.f(string59, "getString(R.string.asses…eAngerModerateBottomText)");
                                    this.C = string59;
                                    String string60 = getString(R.string.angerAssessmentMedImpText);
                                    kotlin.jvm.internal.i.f(string60, "getString(R.string.angerAssessmentMedImpText)");
                                    this.D = string60;
                                    String string61 = getString(R.string.assessmentGotYourBack2);
                                    kotlin.jvm.internal.i.f(string61, "getString(R.string.assessmentGotYourBack2)");
                                    this.E = string61;
                                } else {
                                    if (30 <= i33 && i33 < 45) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    if (z27) {
                                        androidx.fragment.app.p activity24 = getActivity();
                                        kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity30 = (InitialAssessmentActivity) activity24;
                                        int i36 = InitialAssessmentActivity.T;
                                        this.f20248z = R.color.assessment_result;
                                        String string62 = getString(R.string.assessmentResultAngerHigh);
                                        kotlin.jvm.internal.i.f(string62, "getString(R.string.assessmentResultAngerHigh)");
                                        this.A = string62;
                                        String string63 = getString(R.string.assessmentResultScoreAngerHighTopText);
                                        kotlin.jvm.internal.i.f(string63, "getString(R.string.asses…ultScoreAngerHighTopText)");
                                        this.B = string63;
                                        String string64 = getString(R.string.assessmentResultScoreAngerHighBottomText);
                                        kotlin.jvm.internal.i.f(string64, "getString(R.string.asses…ScoreAngerHighBottomText)");
                                        this.C = string64;
                                        String string65 = getString(R.string.angerAssessmentHighImpText);
                                        kotlin.jvm.internal.i.f(string65, "getString(R.string.angerAssessmentHighImpText)");
                                        this.D = string65;
                                        String string66 = getString(R.string.assessmentGetThrough2);
                                        kotlin.jvm.internal.i.f(string66, "getString(R.string.assessmentGetThrough2)");
                                        this.E = string66;
                                    }
                                }
                            }
                            androidx.fragment.app.p activity25 = getActivity();
                            kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity25).w0()) {
                                int i37 = this.G;
                                if (i37 >= 0 && i37 < 15) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                if (z28) {
                                    androidx.fragment.app.p activity26 = getActivity();
                                    kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity31 = (InitialAssessmentActivity) activity26;
                                    int i38 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (15 <= i37 && i37 < 30) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (z29) {
                                    androidx.fragment.app.p activity27 = getActivity();
                                    kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity32 = (InitialAssessmentActivity) activity27;
                                    int i39 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (30 > i37 || i37 >= 45) {
                                    z40 = false;
                                }
                                if (z40) {
                                    androidx.fragment.app.p activity28 = getActivity();
                                    kotlin.jvm.internal.i.e(activity28, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity33 = (InitialAssessmentActivity) activity28;
                                    int i40 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 109522647:
                        if (str8.equals(Constants.COURSE_SLEEP)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultSleep));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(36);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(36);
                            int i41 = this.f20247y;
                            if (i41 >= 0 && i41 < 12) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            if (z30) {
                                androidx.fragment.app.p activity29 = getActivity();
                                kotlin.jvm.internal.i.e(activity29, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity34 = (InitialAssessmentActivity) activity29;
                                int i42 = InitialAssessmentActivity.T;
                                this.f20248z = R.color.sea;
                                String string67 = getString(R.string.assessmentResultSleepLow);
                                kotlin.jvm.internal.i.f(string67, "getString(R.string.assessmentResultSleepLow)");
                                this.A = string67;
                                String string68 = getString(R.string.assessmentResultScoreSleepLowTopText);
                                kotlin.jvm.internal.i.f(string68, "getString(R.string.asses…sultScoreSleepLowTopText)");
                                this.B = string68;
                                String string69 = getString(R.string.assessmentResultScoreSleepLowBottomText);
                                kotlin.jvm.internal.i.f(string69, "getString(R.string.asses…tScoreSleepLowBottomText)");
                                this.C = string69;
                                String string70 = getString(R.string.assessmentLowImpText);
                                kotlin.jvm.internal.i.f(string70, "getString(R.string.assessmentLowImpText)");
                                this.D = string70;
                                InitialAssessmentActivity initialAssessmentActivity35 = this.F;
                                if (initialAssessmentActivity35 != null) {
                                    if (initialAssessmentActivity35.w0()) {
                                        string12 = getString(R.string.assessmentMadeProgress);
                                        str5 = "getString(R.string.assessmentMadeProgress)";
                                    } else {
                                        string12 = getString(R.string.assessmentDoingGreat3);
                                        str5 = "getString(R.string.assessmentDoingGreat3)";
                                    }
                                    kotlin.jvm.internal.i.f(string12, str5);
                                    this.E = string12;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                if (12 <= i41 && i41 < 25) {
                                    z31 = true;
                                } else {
                                    z31 = false;
                                }
                                if (z31) {
                                    androidx.fragment.app.p activity30 = getActivity();
                                    kotlin.jvm.internal.i.e(activity30, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity36 = (InitialAssessmentActivity) activity30;
                                    int i43 = InitialAssessmentActivity.T;
                                    this.f20248z = R.color.seekbar_middle;
                                    String string71 = getString(R.string.assessmentResultSleepModerate);
                                    kotlin.jvm.internal.i.f(string71, "getString(R.string.assessmentResultSleepModerate)");
                                    this.A = string71;
                                    String string72 = getString(R.string.assessmentResultScoreSleepModerateTopText);
                                    kotlin.jvm.internal.i.f(string72, "getString(R.string.asses…coreSleepModerateTopText)");
                                    this.B = string72;
                                    String string73 = getString(R.string.assessmentResultScoreSleepModerateBottomText);
                                    kotlin.jvm.internal.i.f(string73, "getString(R.string.asses…eSleepModerateBottomText)");
                                    this.C = string73;
                                    String string74 = getString(R.string.sleepAssessmentMedImpText);
                                    kotlin.jvm.internal.i.f(string74, "getString(R.string.sleepAssessmentMedImpText)");
                                    this.D = string74;
                                    InitialAssessmentActivity initialAssessmentActivity37 = this.F;
                                    if (initialAssessmentActivity37 != null) {
                                        if (initialAssessmentActivity37.w0()) {
                                            string11 = getString(R.string.assessmentKeepGoing);
                                            str4 = "getString(R.string.assessmentKeepGoing)";
                                        } else {
                                            string11 = getString(R.string.assessmentHereForYou5);
                                            str4 = "getString(R.string.assessmentHereForYou5)";
                                        }
                                        kotlin.jvm.internal.i.f(string11, str4);
                                        this.E = string11;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                } else {
                                    if (25 <= i41 && i41 < 37) {
                                        z32 = true;
                                    } else {
                                        z32 = false;
                                    }
                                    if (z32) {
                                        androidx.fragment.app.p activity31 = getActivity();
                                        kotlin.jvm.internal.i.e(activity31, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity38 = (InitialAssessmentActivity) activity31;
                                        int i44 = InitialAssessmentActivity.T;
                                        this.f20248z = R.color.assessment_result;
                                        String string75 = getString(R.string.assessmentResultSleepHigh);
                                        kotlin.jvm.internal.i.f(string75, "getString(R.string.assessmentResultSleepHigh)");
                                        this.A = string75;
                                        String string76 = getString(R.string.assessmentResultScoreSleepHighTopText);
                                        kotlin.jvm.internal.i.f(string76, "getString(R.string.asses…ultScoreSleepHighTopText)");
                                        this.B = string76;
                                        String string77 = getString(R.string.assessmentResultScoreSleepHighBottomText);
                                        kotlin.jvm.internal.i.f(string77, "getString(R.string.asses…ScoreSleepHighBottomText)");
                                        this.C = string77;
                                        String string78 = getString(R.string.sleepAssessmentHighImpText);
                                        kotlin.jvm.internal.i.f(string78, "getString(R.string.sleepAssessmentHighImpText)");
                                        this.D = string78;
                                        InitialAssessmentActivity initialAssessmentActivity39 = this.F;
                                        if (initialAssessmentActivity39 != null) {
                                            if (initialAssessmentActivity39.w0()) {
                                                string10 = getString(R.string.assessmentHereForYou6);
                                                str11 = "getString(R.string.assessmentHereForYou6)";
                                            } else {
                                                string10 = getString(R.string.assessmentGotYourBack1);
                                            }
                                            kotlin.jvm.internal.i.f(string10, str11);
                                            this.E = string10;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                }
                            }
                            androidx.fragment.app.p activity32 = getActivity();
                            kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity32).w0()) {
                                int i45 = this.G;
                                if (i45 >= 0 && i45 < 12) {
                                    z33 = true;
                                } else {
                                    z33 = false;
                                }
                                if (z33) {
                                    androidx.fragment.app.p activity33 = getActivity();
                                    kotlin.jvm.internal.i.e(activity33, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity40 = (InitialAssessmentActivity) activity33;
                                    int i46 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (12 <= i45 && i45 < 25) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if (z34) {
                                    androidx.fragment.app.p activity34 = getActivity();
                                    kotlin.jvm.internal.i.e(activity34, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity41 = (InitialAssessmentActivity) activity34;
                                    int i47 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (25 > i45 || i45 >= 37) {
                                    z40 = false;
                                }
                                if (z40) {
                                    androidx.fragment.app.p activity35 = getActivity();
                                    kotlin.jvm.internal.i.e(activity35, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity42 = (InitialAssessmentActivity) activity35;
                                    int i48 = InitialAssessmentActivity.T;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 113319009:
                        if (str8.equals(Constants.COURSE_WORRY)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore)).setText(getString(R.string.assessmentResultAnxiety));
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setMax(44);
                            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setMax(44);
                            int i49 = this.f20247y;
                            if (i49 >= 0 && i49 < 15) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            if (z35) {
                                androidx.fragment.app.p activity36 = getActivity();
                                kotlin.jvm.internal.i.e(activity36, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                InitialAssessmentActivity initialAssessmentActivity43 = (InitialAssessmentActivity) activity36;
                                int i50 = InitialAssessmentActivity.T;
                                this.f20248z = R.color.sea;
                                String string79 = getString(R.string.assessmentResultAnxietyLow);
                                kotlin.jvm.internal.i.f(string79, "getString(R.string.assessmentResultAnxietyLow)");
                                this.A = string79;
                                String string80 = getString(R.string.assessmentResultScoreAnxietyLowTopText);
                                kotlin.jvm.internal.i.f(string80, "getString(R.string.asses…ltScoreAnxietyLowTopText)");
                                this.B = string80;
                                String string81 = getString(R.string.assessmentResultScoreAnxietyLowBottomText);
                                kotlin.jvm.internal.i.f(string81, "getString(R.string.asses…coreAnxietyLowBottomText)");
                                this.C = string81;
                                String string82 = getString(R.string.assessmentLowImpText);
                                kotlin.jvm.internal.i.f(string82, "getString(R.string.assessmentLowImpText)");
                                this.D = string82;
                                InitialAssessmentActivity initialAssessmentActivity44 = this.F;
                                if (initialAssessmentActivity44 != null) {
                                    if (initialAssessmentActivity44.w0()) {
                                        string15 = getString(R.string.assessmentDoingWell2);
                                        str7 = "getString(R.string.assessmentDoingWell2)";
                                    } else {
                                        string15 = getString(R.string.assessmentDoingGood1);
                                        str7 = "getString(R.string.assessmentDoingGood1)";
                                    }
                                    kotlin.jvm.internal.i.f(string15, str7);
                                    this.E = string15;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                if (15 <= i49 && i49 < 30) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                if (z36) {
                                    androidx.fragment.app.p activity37 = getActivity();
                                    kotlin.jvm.internal.i.e(activity37, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity45 = (InitialAssessmentActivity) activity37;
                                    int i51 = InitialAssessmentActivity.T;
                                    this.f20248z = R.color.seekbar_middle;
                                    String string83 = getString(R.string.assessmentResultAnxietyModerate);
                                    kotlin.jvm.internal.i.f(string83, "getString(R.string.asses…entResultAnxietyModerate)");
                                    this.A = string83;
                                    String string84 = getString(R.string.assessmentResultScoreAnxietyModerateTopText);
                                    kotlin.jvm.internal.i.f(string84, "getString(R.string.asses…reAnxietyModerateTopText)");
                                    this.B = string84;
                                    String string85 = getString(R.string.assessmentResultScoreAnxietyModerateBottomText);
                                    kotlin.jvm.internal.i.f(string85, "getString(R.string.asses…nxietyModerateBottomText)");
                                    this.C = string85;
                                    String string86 = getString(R.string.worryAssessmentMedImpText);
                                    kotlin.jvm.internal.i.f(string86, "getString(R.string.worryAssessmentMedImpText)");
                                    this.D = string86;
                                    InitialAssessmentActivity initialAssessmentActivity46 = this.F;
                                    if (initialAssessmentActivity46 != null) {
                                        if (initialAssessmentActivity46.w0()) {
                                            string14 = getString(R.string.assessmentCopingWell3);
                                            str6 = "getString(R.string.assessmentCopingWell3)";
                                        } else {
                                            string14 = getString(R.string.assessmentHereForYou4);
                                            str6 = "getString(R.string.assessmentHereForYou4)";
                                        }
                                        kotlin.jvm.internal.i.f(string14, str6);
                                        this.E = string14;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                } else {
                                    if (30 <= i49 && i49 < 45) {
                                        z37 = true;
                                    } else {
                                        z37 = false;
                                    }
                                    if (z37) {
                                        androidx.fragment.app.p activity38 = getActivity();
                                        kotlin.jvm.internal.i.e(activity38, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                        InitialAssessmentActivity initialAssessmentActivity47 = (InitialAssessmentActivity) activity38;
                                        int i52 = InitialAssessmentActivity.T;
                                        this.f20248z = R.color.assessment_result;
                                        String string87 = getString(R.string.assessmentResultAnxietyHigh);
                                        kotlin.jvm.internal.i.f(string87, "getString(R.string.assessmentResultAnxietyHigh)");
                                        this.A = string87;
                                        String string88 = getString(R.string.assessmentResultScoreAnxietyHighTopText);
                                        kotlin.jvm.internal.i.f(string88, "getString(R.string.asses…tScoreAnxietyHighTopText)");
                                        this.B = string88;
                                        String string89 = getString(R.string.assessmentResultScoreAnxietyHighBottomText);
                                        kotlin.jvm.internal.i.f(string89, "getString(R.string.asses…oreAnxietyHighBottomText)");
                                        this.C = string89;
                                        String string90 = getString(R.string.worryAssessmentHighImpText);
                                        kotlin.jvm.internal.i.f(string90, "getString(R.string.worryAssessmentHighImpText)");
                                        this.D = string90;
                                        InitialAssessmentActivity initialAssessmentActivity48 = this.F;
                                        if (initialAssessmentActivity48 != null) {
                                            if (initialAssessmentActivity48.w0()) {
                                                string13 = getString(R.string.assessmentGotYourBack1);
                                            } else {
                                                string13 = getString(R.string.assessmentGetThrough1);
                                                str11 = "getString(R.string.assessmentGetThrough1)";
                                            }
                                            kotlin.jvm.internal.i.f(string13, str11);
                                            this.E = string13;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                }
                            }
                            androidx.fragment.app.p activity39 = getActivity();
                            kotlin.jvm.internal.i.e(activity39, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity39).w0()) {
                                int i53 = this.G;
                                if (i53 >= 0 && i53 < 15) {
                                    z38 = true;
                                } else {
                                    z38 = false;
                                }
                                if (z38) {
                                    androidx.fragment.app.p activity40 = getActivity();
                                    kotlin.jvm.internal.i.e(activity40, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity49 = (InitialAssessmentActivity) activity40;
                                    int i54 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (15 <= i53 && i53 < 30) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                if (z39) {
                                    androidx.fragment.app.p activity41 = getActivity();
                                    kotlin.jvm.internal.i.e(activity41, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity50 = (InitialAssessmentActivity) activity41;
                                    int i55 = InitialAssessmentActivity.T;
                                    return;
                                }
                                if (30 > i53 || i53 >= 45) {
                                    z40 = false;
                                }
                                if (z40) {
                                    androidx.fragment.app.p activity42 = getActivity();
                                    kotlin.jvm.internal.i.e(activity42, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                    InitialAssessmentActivity initialAssessmentActivity51 = (InitialAssessmentActivity) activity42;
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
            LogHelper.INSTANCE.e(this.f20243u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.I;
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
        return inflater.inflate(R.layout.fragment_initial_assessment_score_personalised, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.I.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0155, code lost:
        if (kotlin.jvm.internal.i.b(com.theinnerhour.b2b.persistence.FirebasePersistence.getInstance().getUser().getCurrentCourseName(), com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022f, code lost:
        if (kotlin.jvm.internal.i.b(com.theinnerhour.b2b.persistence.FirebasePersistence.getInstance().getUser().getCurrentCourseName(), com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) != false) goto L59;
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
            this.F = (InitialAssessmentActivity) activity;
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView titleAssessmentResultScore = (RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResultScore);
            kotlin.jvm.internal.i.f(titleAssessmentResultScore, "titleAssessmentResultScore");
            insetsUtils.addStatusBarHeight(titleAssessmentResultScore);
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb_text, (ViewGroup) null, false);
            kotlin.jvm.internal.i.f(inflate, "from(activity).inflate(R…_thumb_text, null, false)");
            this.f20244v = inflate;
            View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb_text_bottom, (ViewGroup) null, false);
            kotlin.jvm.internal.i.f(inflate2, "from(activity).inflate(R…text_bottom, null, false)");
            this.f20245w = inflate2;
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
            this.f20246x = currentCourseName;
            InitialAssessmentActivity initialAssessmentActivity = this.F;
            if (initialAssessmentActivity != null) {
                int i11 = initialAssessmentActivity.J;
                int i12 = 15;
                if (i11 > -1) {
                    this.f20247y = i11;
                    if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (((InitialAssessmentActivity) activity2).K > 0) {
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity3).K == 1) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentSubheader)).setVisibility(8);
                            }
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            int i13 = ((InitialAssessmentActivity) activity4).L;
                            if (i13 != 15) {
                                if (i13 != 30) {
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
                                this.H = Integer.valueOf(score.intValue() - this.f20247y);
                                Integer score2 = courseById.getAssessments().get(i10).getScore();
                                kotlin.jvm.internal.i.d(score2);
                                this.G = score2.intValue();
                            }
                        }
                        Integer num = this.H;
                        if (num != null) {
                            if (num.intValue() <= 0 || kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_HAPPINESS)) {
                                Integer num2 = this.H;
                                kotlin.jvm.internal.i.d(num2);
                                if (num2.intValue() < 0) {
                                }
                            }
                            androidx.fragment.app.p activity5 = getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity5).M = true;
                            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText3)).setVisibility(0);
                        }
                    }
                    K();
                    ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new j1(courseById, this, 1));
                } else {
                    this.f20247y = initialAssessmentActivity.v0();
                    if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                        androidx.fragment.app.p activity6 = getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (((InitialAssessmentActivity) activity6).K > 0) {
                            androidx.fragment.app.p activity7 = getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            int i14 = ((InitialAssessmentActivity) activity7).L;
                            if (i14 != 15) {
                                if (i14 != 30) {
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
                                this.H = Integer.valueOf(score3.intValue() - this.f20247y);
                                Integer score4 = courseById.getAssessments().get(i6).getScore();
                                kotlin.jvm.internal.i.d(score4);
                                this.G = score4.intValue();
                            }
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentSubheader)).setVisibility(8);
                        }
                        Integer num3 = this.H;
                        if (num3 != null) {
                            if (num3.intValue() <= 0 || kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_HAPPINESS)) {
                                Integer num4 = this.H;
                                kotlin.jvm.internal.i.d(num4);
                                if (num4.intValue() < 0) {
                                }
                            }
                            androidx.fragment.app.p activity8 = getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity8).M = true;
                            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText3)).setVisibility(0);
                        }
                    }
                    K();
                    androidx.fragment.app.p activity9 = getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    int i15 = ((InitialAssessmentActivity) activity9).K;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                i12 = -1;
                            } else {
                                i12 = 30;
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new l1(this, courseById, i12, 0));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentResultScore)).setText(this.A);
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentResultScore)).setTextColor(g0.a.b(requireContext(), this.f20248z));
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(this.B);
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText2)).setText(this.C);
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText3)).setText(this.D);
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentSubheader)).setText(this.E);
                androidx.fragment.app.p activity10 = getActivity();
                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (((InitialAssessmentActivity) activity10).M) {
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setVisibility(0);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setProgress(this.G);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setEnabled(false);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarTwo)).setThumb(J(this.G, false));
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setProgress(this.f20247y);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setEnabled(false);
                    ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setThumb(J(this.f20247y, true));
                    return;
                }
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setProgress(this.f20247y);
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setEnabled(false);
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbar)).setThumb(J(this.f20247y, false));
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20243u, e10);
        }
    }
}
