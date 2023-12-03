package ik;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AppsFlyerLib;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.libPackage.SymptomGraphView;
import com.theinnerhour.b2b.model.AssessmentResponse;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.AssessmentResponseCategory;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import ik.j0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/j0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j0 extends rr.b {
    public static final /* synthetic */ int G = 0;
    public boolean B;
    public boolean C;
    public int D;
    public hc.d E;

    /* renamed from: v  reason: collision with root package name */
    public AssessmentListener f20204v;

    /* renamed from: w  reason: collision with root package name */
    public View f20205w;

    /* renamed from: x  reason: collision with root package name */
    public View f20206x;

    /* renamed from: y  reason: collision with root package name */
    public AssessmentResponseAll f20207y;

    /* renamed from: z  reason: collision with root package name */
    public AssessmentResponseAll f20208z;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20203u = LogHelper.INSTANCE.makeLogTag(j0.class);
    public String A = "";

    /* compiled from: ExptInitialAssessmentResultFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            int i6;
            int i10;
            Object obj;
            String str;
            String str2;
            int i11;
            int i12;
            Integer score;
            Object obj2;
            Object obj3;
            String str3;
            HashMap<String, Object> appConfig;
            HashMap<String, Object> appConfig2;
            HashMap<String, Object> appConfig3;
            Integer score2;
            j0 j0Var = j0.this;
            if (j0Var.C) {
                AssessmentListener assessmentListener = j0Var.f20204v;
                if (assessmentListener != null) {
                    AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                }
            } else if (Utils.INSTANCE.checkConnectivity(j0Var.getActivity())) {
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                AssessmentResponseAll assessmentResponseAll = j0Var.f20207y;
                if (assessmentResponseAll != null && (score2 = assessmentResponseAll.getScore()) != null) {
                    i6 = score2.intValue();
                } else {
                    i6 = -1;
                }
                analyticsBundle.putInt("score", i6);
                int i13 = j0Var.D;
                if (i13 != 0) {
                    if (i13 != 15) {
                        if (i13 != 30) {
                            i10 = -1;
                        } else {
                            i10 = 28;
                        }
                    } else {
                        i10 = 15;
                    }
                } else {
                    i10 = 0;
                }
                analyticsBundle.putInt("day", i10);
                analyticsBundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                String[] strArr = {"a", Constants.ONBOARDING_VARIANT};
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig3 = user.getAppConfig()) != null) {
                    obj = appConfig3.get(Constants.A3_ONBOARDING_REVAMP);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (is.k.Q1(str, strArr) && ApplicationPersistence.getInstance().getBooleanValue("add_a3_variant_on_assessment", false)) {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (appConfig2 = user2.getAppConfig()) != null) {
                        obj2 = appConfig2.get(Constants.A3_ONBOARDING_REVAMP);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    } else {
                        str2 = null;
                    }
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null && (appConfig = user3.getAppConfig()) != null) {
                        obj3 = appConfig.get(Constants.A3_ONBOARDING_REVAMP);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 instanceof String) {
                        str3 = (String) obj3;
                    } else {
                        str3 = null;
                    }
                    analyticsBundle.putString("a3_variant", str3);
                    ApplicationPersistence.getInstance().deleteKey("add_a3_variant_on_assessment");
                } else {
                    str2 = null;
                }
                UtilsKt.fireAnalytics("assessment_result_click", analyticsBundle);
                if (new gk.e().a()) {
                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                    Context applicationContext = j0Var.requireActivity().getApplicationContext();
                    HashMap hashMap = new HashMap();
                    AssessmentResponseAll assessmentResponseAll2 = j0Var.f20207y;
                    if (assessmentResponseAll2 != null && (score = assessmentResponseAll2.getScore()) != null) {
                        i11 = score.intValue();
                    } else {
                        i11 = -1;
                    }
                    hashMap.put("score", Integer.valueOf(i11));
                    int i14 = j0Var.D;
                    if (i14 != 0) {
                        if (i14 != 15) {
                            if (i14 != 30) {
                                i12 = -1;
                            } else {
                                i12 = 28;
                            }
                        } else {
                            i12 = 15;
                        }
                    } else {
                        i12 = 0;
                    }
                    hashMap.put("day", Integer.valueOf(i12));
                    hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    hashMap.put("version", FirebasePersistence.getInstance().getUser().getVersion());
                    if (str2 != null) {
                        hashMap.put("a3_variant", str2);
                    }
                    hs.k kVar = hs.k.f19476a;
                    appsFlyerLib.logEvent(applicationContext, "assessment_result_click", hashMap);
                }
                AssessmentListener assessmentListener2 = j0Var.f20204v;
                if (assessmentListener2 != null) {
                    assessmentListener2.onAssessmentCompleted();
                    if (j0Var.D == 30) {
                        t tVar = new t();
                        tVar.setArguments(j0Var.getArguments());
                        assessmentListener2.goToNextScreen(tVar);
                    } else {
                        AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener2, null, 1, null);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    public final hc.d J() {
        hc.d dVar = this.E;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.i.q("assessmentUtils");
        throw null;
    }

    public final BitmapDrawable K(int i6, int i10) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb_text, (ViewGroup) null, false);
        kotlin.jvm.internal.i.f(inflate, "from(activity).inflate(R…_thumb_text, null, false)");
        this.f20205w = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.progress);
        textView.setText(String.valueOf(i6));
        textView.setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast));
        View view = this.f20205w;
        if (view != null) {
            ((ImageView) view.findViewById(R.id.progressBg)).setColorFilter(g0.a.b(requireContext(), i10), PorterDuff.Mode.SRC_ATOP);
            View view2 = this.f20205w;
            if (view2 != null) {
                ((ImageView) view2.findViewById(R.id.progressDot)).setColorFilter(g0.a.b(requireContext(), i10), PorterDuff.Mode.SRC_ATOP);
                View view3 = this.f20205w;
                if (view3 != null) {
                    view3.measure(0, 0);
                    View view4 = this.f20205w;
                    if (view4 != null) {
                        int measuredWidth = view4.getMeasuredWidth();
                        View view5 = this.f20205w;
                        if (view5 != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, view5.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            View view6 = this.f20205w;
                            if (view6 != null) {
                                int measuredWidth2 = view6.getMeasuredWidth();
                                View view7 = this.f20205w;
                                if (view7 != null) {
                                    view6.layout(0, 0, measuredWidth2, view7.getMeasuredHeight());
                                    View view8 = this.f20205w;
                                    if (view8 != null) {
                                        view8.draw(canvas);
                                        return new BitmapDrawable(getResources(), createBitmap);
                                    }
                                    kotlin.jvm.internal.i.q("thumbViewCurrent");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("thumbViewCurrent");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("thumbViewCurrent");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("thumbViewCurrent");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("thumbViewCurrent");
                    throw null;
                }
                kotlin.jvm.internal.i.q("thumbViewCurrent");
                throw null;
            }
            kotlin.jvm.internal.i.q("thumbViewCurrent");
            throw null;
        }
        kotlin.jvm.internal.i.q("thumbViewCurrent");
        throw null;
    }

    public final BitmapDrawable M(int i6) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb_text_bottom, (ViewGroup) null, false);
        kotlin.jvm.internal.i.f(inflate, "from(activity).inflate(R…text_bottom, null, false)");
        this.f20206x = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.progress);
        textView.setText(String.valueOf(i6));
        textView.setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_54_opacity));
        View view = this.f20206x;
        if (view != null) {
            ((ImageView) view.findViewById(R.id.progressBg)).setColorFilter(g0.a.b(requireContext(), R.color.onboardingGrey), PorterDuff.Mode.SRC_ATOP);
            View view2 = this.f20206x;
            if (view2 != null) {
                ((ImageView) view2.findViewById(R.id.progressDot)).setColorFilter(g0.a.b(requireContext(), R.color.onboardingGrey), PorterDuff.Mode.SRC_ATOP);
                View view3 = this.f20206x;
                if (view3 != null) {
                    view3.measure(0, 0);
                    View view4 = this.f20206x;
                    if (view4 != null) {
                        int measuredWidth = view4.getMeasuredWidth();
                        View view5 = this.f20206x;
                        if (view5 != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, view5.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            View view6 = this.f20206x;
                            if (view6 != null) {
                                int measuredWidth2 = view6.getMeasuredWidth();
                                View view7 = this.f20206x;
                                if (view7 != null) {
                                    view6.layout(0, 0, measuredWidth2, view7.getMeasuredHeight());
                                    View view8 = this.f20206x;
                                    if (view8 != null) {
                                        view8.draw(canvas);
                                        return new BitmapDrawable(getResources(), createBitmap);
                                    }
                                    kotlin.jvm.internal.i.q("thumbViewPrevious");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("thumbViewPrevious");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("thumbViewPrevious");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("thumbViewPrevious");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("thumbViewPrevious");
                    throw null;
                }
                kotlin.jvm.internal.i.q("thumbViewPrevious");
                throw null;
            }
            kotlin.jvm.internal.i.q("thumbViewPrevious");
            throw null;
        }
        kotlin.jvm.internal.i.q("thumbViewPrevious");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01af A[LOOP:1: B:45:0x0118->B:78:0x01af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(AssessmentResponseAll assessmentResponseAll) {
        ArrayList<AssessmentResponse> arrayList;
        String str;
        int i6;
        String str2;
        Integer value;
        int i10;
        AssessmentResponseCategory symptom;
        int i11;
        String str3;
        j0 j0Var = this;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ((SymptomGraphView) j0Var._$_findCachedViewById(R.id.assessmentGraphView)).getLayoutParams().height = displayMetrics.widthPixels - 20;
        ArrayList<AssessmentResponse> values = assessmentResponseAll.getSymptom().getValues();
        int i12 = 3;
        if (!j0Var.B) {
            SymptomGraphView symptomGraphView = (SymptomGraphView) j0Var._$_findCachedViewById(R.id.assessmentGraphView);
            if (symptomGraphView != null) {
                symptomGraphView.setSectionsCount(values.size());
                symptomGraphView.setLinesCount(5);
                symptomGraphView.getSectionLabels().clear();
                int size = values.size();
                int i13 = 0;
                while (i13 < size) {
                    String symptom2 = values.get(i13).getSymptom();
                    if (symptom2 == null) {
                        symptom2 = "";
                    }
                    J();
                    Integer a02 = hc.d.a0(j0Var.A, symptom2);
                    List<String> sectionLabels = symptomGraphView.getSectionLabels();
                    if (a02 != null) {
                        symptom2 = j0Var.getString(a02.intValue());
                    }
                    kotlin.jvm.internal.i.f(symptom2, "if (symptomTagId != null…ymptomTagId) else symptom");
                    sectionLabels.add(symptom2);
                    Integer value2 = values.get(i13).getValue();
                    if (value2 != null) {
                        i11 = value2.intValue();
                    } else {
                        i11 = 0;
                    }
                    int i14 = i11 + 1;
                    J();
                    String str4 = j0Var.A;
                    if (i11 != 0 && i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != i12 && i11 != 4) {
                                J();
                            } else {
                                J();
                                str3 = "high";
                            }
                        } else {
                            J();
                            str3 = "mid";
                        }
                        symptomGraphView.d(i13, i14, hc.d.G(str4, str3));
                        i13++;
                        i12 = 3;
                    } else {
                        J();
                    }
                    str3 = "low";
                    symptomGraphView.d(i13, i14, hc.d.G(str4, str3));
                    i13++;
                    i12 = 3;
                }
                return;
            }
            return;
        }
        AssessmentResponseAll assessmentResponseAll2 = j0Var.f20208z;
        if (assessmentResponseAll2 != null && (symptom = assessmentResponseAll2.getSymptom()) != null) {
            arrayList = symptom.getValues();
        } else {
            arrayList = null;
        }
        SymptomGraphView symptomGraphView2 = (SymptomGraphView) j0Var._$_findCachedViewById(R.id.assessmentGraphView);
        if (symptomGraphView2 != null) {
            symptomGraphView2.setSectionsCount(values.size() * 2);
            symptomGraphView2.setShowComparison(true);
            symptomGraphView2.setLinesCount(5);
            symptomGraphView2.getSectionLabels().clear();
            xs.d h02 = kotlin.jvm.internal.h.h0(kotlin.jvm.internal.h.k0(0, symptomGraphView2.getSectionsCount()), 2);
            int i15 = h02.f37996u;
            int i16 = h02.f37997v;
            int i17 = h02.f37998w;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                int i18 = 0;
                while (true) {
                    int i19 = i18 + 1;
                    String symptom3 = values.get(i18).getSymptom();
                    if (symptom3 == null) {
                        str = "";
                    } else {
                        str = symptom3;
                    }
                    J();
                    Integer a03 = hc.d.a0(j0Var.A, str);
                    List<String> sectionLabels2 = symptomGraphView2.getSectionLabels();
                    if (a03 != null) {
                        str = j0Var.getString(a03.intValue());
                    }
                    kotlin.jvm.internal.i.f(str, "if (symptomTagId != null…ymptomTagId) else symptom");
                    sectionLabels2.add(str);
                    Integer value3 = values.get(i18).getValue();
                    if (value3 != null) {
                        i6 = value3.intValue();
                    } else {
                        i6 = 0;
                    }
                    int i20 = i6 + 1;
                    J();
                    String str5 = j0Var.A;
                    if (i6 != 0 && i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3 && i6 != 4) {
                                J();
                            }
                            J();
                            str2 = "high";
                        } else {
                            J();
                            str2 = "mid";
                        }
                        symptomGraphView2.d(i15, i20, hc.d.G(str5, str2));
                        kotlin.jvm.internal.i.d(arrayList);
                        value = arrayList.get(i18).getValue();
                        if (value == null) {
                            i10 = value.intValue();
                        } else {
                            i10 = 0;
                        }
                        J();
                        symptomGraphView2.d(i15 + 1, i10 + 1, hc.d.G("", "high"));
                        if (i15 == i16) {
                            i15 += i17;
                            i18 = i19;
                            j0Var = this;
                        } else {
                            return;
                        }
                    } else {
                        J();
                    }
                    str2 = "low";
                    symptomGraphView2.d(i15, i20, hc.d.G(str5, str2));
                    kotlin.jvm.internal.i.d(arrayList);
                    value = arrayList.get(i18).getValue();
                    if (value == null) {
                    }
                    J();
                    symptomGraphView2.d(i15 + 1, i10 + 1, hc.d.G("", "high"));
                    if (i15 == i16) {
                    }
                }
            }
        }
    }

    public final void P(AssessmentResponseAll assessmentResponseAll) {
        boolean z10;
        boolean z11;
        Object obj;
        String string;
        Integer score = assessmentResponseAll.getScore();
        if (score != null) {
            int intValue = score.intValue();
            J();
            HashMap N = hc.d.N(this.A);
            J();
            String course = this.A;
            J();
            Object obj2 = N.get("low");
            kotlin.jvm.internal.i.d(obj2);
            xs.f fVar = (xs.f) obj2;
            boolean z12 = false;
            if (intValue <= fVar.f37997v && fVar.f37996u <= intValue) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                J();
                obj = "low";
            } else {
                J();
                Object obj3 = N.get("mid");
                kotlin.jvm.internal.i.d(obj3);
                xs.f fVar2 = (xs.f) obj3;
                if (intValue <= fVar2.f37997v && fVar2.f37996u <= intValue) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    J();
                    obj = "mid";
                } else {
                    J();
                    Object obj4 = N.get("high");
                    kotlin.jvm.internal.i.d(obj4);
                    xs.f fVar3 = (xs.f) obj4;
                    if (intValue <= fVar3.f37997v && fVar3.f37996u <= intValue) {
                        z12 = true;
                    }
                    if (z12) {
                        J();
                        obj = "high";
                    } else {
                        obj = null;
                    }
                }
            }
            boolean z13 = this.B;
            kotlin.jvm.internal.i.g(course, "course");
            Bundle bundle = new Bundle();
            switch (course.hashCode()) {
                case -2114782937:
                    if (course.equals(Constants.COURSE_HAPPINESS)) {
                        bundle.putInt("title", R.string.assessmentResultGraphHappinessTitle);
                        bundle.putInt("dialogCTA", R.string.assessmentResultGraphHappinessDialogCTA);
                        if (z13) {
                            bundle.putInt("desc", R.string.assessmentResultGraphCompareHappiness);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphHappinessLowText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphHappinessModerateText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphHappinessHighText);
                            break;
                        }
                    }
                    break;
                case -1617042330:
                    if (course.equals(Constants.COURSE_DEPRESSION)) {
                        bundle.putInt("title", R.string.assessmentResultGraphDepressionTitle);
                        bundle.putInt("dialogCTA", R.string.assessmentResultGraphDialogCTA);
                        if (z13) {
                            bundle.putInt("desc", R.string.assessmentResultGraphCompareDepression);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphDepressionLowText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphDepressionModerateText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphDepressionHighText);
                            break;
                        }
                    }
                    break;
                case -891989580:
                    if (course.equals(Constants.COURSE_STRESS)) {
                        bundle.putInt("title", R.string.assessmentResultGraphStressTitle);
                        bundle.putInt("dialogCTA", R.string.assessmentResultGraphDialogCTA);
                        if (z13) {
                            bundle.putInt("desc", R.string.assessmentResultGraphCompareStress);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphStressLowText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphStressModerateText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphStressHighText);
                            break;
                        }
                    }
                    break;
                case 92960775:
                    if (course.equals(Constants.COURSE_ANGER)) {
                        bundle.putInt("title", R.string.assessmentResultGraphAngerTitle);
                        bundle.putInt("dialogCTA", R.string.assessmentResultGraphDialogCTA);
                        if (z13) {
                            bundle.putInt("desc", R.string.assessmentResultGraphCompareAnger);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphAngerLowText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphAngerModerateText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphAngerHighText);
                            break;
                        }
                    }
                    break;
                case 109522647:
                    if (course.equals(Constants.COURSE_SLEEP)) {
                        bundle.putInt("title", R.string.assessmentResultGraphSleepTitle);
                        bundle.putInt("dialogCTA", R.string.assessmentResultGraphSleepDialogCTA);
                        if (z13) {
                            bundle.putInt("desc", R.string.assessmentResultGraphCompareSleep);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphSleepLowText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphSleepModerateText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphSleepHighText);
                            break;
                        }
                    }
                    break;
                case 113319009:
                    if (course.equals(Constants.COURSE_WORRY)) {
                        bundle.putInt("title", R.string.assessmentResultGraphAnxietyTitle);
                        bundle.putInt("dialogCTA", R.string.assessmentResultGraphDialogCTA);
                        if (z13) {
                            bundle.putInt("desc", R.string.assessmentResultGraphCompareWorry);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphAnxietyLowText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphAnxietyModerateText);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("desc", R.string.assessmentResultGraphAnxietyHighText);
                            break;
                        }
                    }
                    break;
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.assessmentGraphTitle);
            String str = this.A;
            if (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS)) {
                string = getString(R.string.graphTitleFactor);
            } else if (kotlin.jvm.internal.i.b(str, Constants.COURSE_SLEEP)) {
                string = getString(R.string.graphTitleIndicator);
            } else {
                string = getString(R.string.graphTitleSymptom);
            }
            robertoTextView.setText(string);
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentGraphDescription)).setText(getString(bundle.getInt("desc")));
            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(bundle.getInt("dialogCTA")));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Q(AssessmentResponseAll assessmentResponseAll) {
        Integer num;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        J();
        String course = this.A;
        kotlin.jvm.internal.i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    num = Integer.valueOf((int) R.string.scoreTitleHappiness);
                    break;
                }
                num = null;
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    num = Integer.valueOf((int) R.string.scoreTitleDepression);
                    break;
                }
                num = null;
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    num = Integer.valueOf((int) R.string.scoreTitleStress);
                    break;
                }
                num = null;
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    num = Integer.valueOf((int) R.string.scoreTitleAnger);
                    break;
                }
                num = null;
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    num = Integer.valueOf((int) R.string.scoreTitleSleep);
                    break;
                }
                num = null;
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    num = Integer.valueOf((int) R.string.scoreTitleWorry);
                    break;
                }
                num = null;
                break;
            default:
                num = null;
                break;
        }
        if (num != null) {
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreTitle)).setText(getString(num.intValue()));
        }
        Integer score = assessmentResponseAll.getScore();
        if (score != null) {
            int intValue = score.intValue();
            J();
            HashMap N = hc.d.N(this.A);
            J();
            String course2 = this.A;
            J();
            Object obj2 = N.get("low");
            kotlin.jvm.internal.i.d(obj2);
            xs.f fVar = (xs.f) obj2;
            if (intValue <= fVar.f37997v && fVar.f37996u <= intValue) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                J();
                obj = "low";
            } else {
                J();
                Object obj3 = N.get("mid");
                kotlin.jvm.internal.i.d(obj3);
                xs.f fVar2 = (xs.f) obj3;
                if (intValue <= fVar2.f37997v && fVar2.f37996u <= intValue) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    J();
                    obj = "mid";
                } else {
                    J();
                    Object obj4 = N.get("high");
                    kotlin.jvm.internal.i.d(obj4);
                    xs.f fVar3 = (xs.f) obj4;
                    if (intValue <= fVar3.f37997v && fVar3.f37996u <= intValue) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        J();
                        obj = "high";
                    } else {
                        obj = null;
                    }
                }
            }
            boolean z13 = this.B;
            kotlin.jvm.internal.i.g(course2, "course");
            Bundle bundle = new Bundle();
            switch (course2.hashCode()) {
                case -2114782937:
                    if (course2.equals(Constants.COURSE_HAPPINESS)) {
                        if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("result", R.string.assessmentResultHappinessLow);
                            bundle.putInt("desc1", R.string.assessmentResultScoreHappinessLowTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreHappinessLowBottomText);
                            bundle.putInt("desc3", R.string.assessmentLowImpTextInverse);
                            if (z13) {
                                i10 = R.string.assessmentGotYourBack2;
                            } else {
                                i10 = R.string.assessmentGotYourBack3;
                            }
                            bundle.putInt("prompt", i10);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("result", R.string.assessmentResultHappinessModerate);
                            bundle.putInt("desc1", R.string.assessmentResultScoreHappinessModerateTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreHappinessModerateBottomText);
                            bundle.putInt("desc3", R.string.happinessAssessmentMedImpText);
                            if (z13) {
                                i6 = R.string.assessmentDoingBetter;
                            } else {
                                i6 = R.string.assessmentDoingGood2;
                            }
                            bundle.putInt("prompt", i6);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("result", R.string.assessmentResultHappinessHigh);
                            bundle.putInt("desc1", R.string.assessmentResultScoreHappinessHighTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreHappinessHighBottomText);
                            bundle.putInt("desc3", R.string.happinessAssessmentHighImpText);
                            bundle.putInt("prompt", R.string.assessmentFantastic);
                            break;
                        }
                    }
                    break;
                case -1617042330:
                    int i23 = R.string.assessmentGotYourBack2;
                    if (course2.equals(Constants.COURSE_DEPRESSION)) {
                        if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("result", R.string.assessmentResultDepressionLow);
                            bundle.putInt("desc1", R.string.assessmentResultScoreDepressionLowTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreDepressionLowBottomText);
                            bundle.putInt("desc3", R.string.assessmentLowImpText);
                            if (z13) {
                                i12 = R.string.assessmentDoingGreat1;
                            } else {
                                i12 = R.string.depressionTimeoutSeperatorPrompt1Head;
                            }
                            bundle.putInt("prompt", i12);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("result", R.string.assessmentResultDepressionModerate);
                            bundle.putInt("desc1", R.string.assessmentResultScoreDepressionModerateTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreDepressionModerateBottomText);
                            bundle.putInt("desc3", R.string.depressionAssessmentMedImpText);
                            if (z13) {
                                i11 = R.string.assessmentDoingGreat4;
                            } else {
                                i11 = R.string.assessmentHereForYou1;
                            }
                            bundle.putInt("prompt", i11);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("result", R.string.assessmentResultDepressionHigh);
                            bundle.putInt("desc1", R.string.assessmentResultScoreDepressionHighTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreDepressionHighBottomText);
                            bundle.putInt("desc3", R.string.depressionAssessmentHighImpText);
                            if (!z13) {
                                i23 = R.string.assessmentGotYourBack1;
                            }
                            bundle.putInt("prompt", i23);
                            break;
                        }
                    }
                    break;
                case -891989580:
                    if (course2.equals(Constants.COURSE_STRESS)) {
                        if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("result", R.string.assessmentResultStressLow);
                            bundle.putInt("desc1", R.string.assessmentResultScoreStressLowTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreStressLowBottomText);
                            bundle.putInt("desc3", R.string.assessmentLowImpText);
                            if (z13) {
                                i15 = R.string.assessmentDoingWell1;
                            } else {
                                i15 = R.string.depressionTimeoutSeperatorPrompt1Head;
                            }
                            bundle.putInt("prompt", i15);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("result", R.string.assessmentResultStressModerate);
                            bundle.putInt("desc1", R.string.assessmentResultScoreStressModerateTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreStressModerateBottomText);
                            bundle.putInt("desc3", R.string.stressAssessmentMedImpText);
                            if (z13) {
                                i14 = R.string.assessmentCopingWell2;
                            } else {
                                i14 = R.string.assessmentGotYourBack2;
                            }
                            bundle.putInt("prompt", i14);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("result", R.string.assessmentResultStressHigh);
                            bundle.putInt("desc1", R.string.assessmentResultScoreStressHighTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreStressHighBottomText);
                            bundle.putInt("desc3", R.string.stressAssessmentHighImpText);
                            if (z13) {
                                i13 = R.string.assessmentGetThrough1;
                            } else {
                                i13 = R.string.assessmentHereForYou3;
                            }
                            bundle.putInt("prompt", i13);
                            break;
                        }
                    }
                    break;
                case 92960775:
                    if (course2.equals(Constants.COURSE_ANGER)) {
                        if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("result", R.string.assessmentResultAngerLow);
                            bundle.putInt("desc1", R.string.assessmentResultScoreAngerLowTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreAngerLowBottomText);
                            bundle.putInt("desc3", R.string.assessmentLowImpText);
                            if (z13) {
                                i16 = R.string.assessmentDoingGreat1;
                            } else {
                                i16 = R.string.assessmentDoingGood2;
                            }
                            bundle.putInt("prompt", i16);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("result", R.string.assessmentResultAngerModerate);
                            bundle.putInt("desc1", R.string.assessmentResultScoreAngerModerateTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreAngerModerateBottomText);
                            bundle.putInt("desc3", R.string.angerAssessmentMedImpText);
                            bundle.putInt("prompt", R.string.assessmentGotYourBack2);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("result", R.string.assessmentResultAngerHigh);
                            bundle.putInt("desc1", R.string.assessmentResultScoreAngerHighTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreAngerHighBottomText);
                            bundle.putInt("desc3", R.string.angerAssessmentHighImpText);
                            bundle.putInt("prompt", R.string.assessmentGetThrough2);
                            break;
                        }
                    }
                    break;
                case 109522647:
                    if (course2.equals(Constants.COURSE_SLEEP)) {
                        if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("result", R.string.assessmentResultSleepLow);
                            bundle.putInt("desc1", R.string.assessmentResultScoreSleepLowTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreSleepLowBottomText);
                            bundle.putInt("desc3", R.string.assessmentLowImpText);
                            if (z13) {
                                i19 = R.string.assessmentMadeProgress;
                            } else {
                                i19 = R.string.assessmentDoingGreat3;
                            }
                            bundle.putInt("prompt", i19);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("result", R.string.assessmentResultSleepModerate);
                            bundle.putInt("desc1", R.string.assessmentResultScoreSleepModerateTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreSleepModerateBottomText);
                            bundle.putInt("desc3", R.string.sleepAssessmentMedImpText);
                            if (z13) {
                                i18 = R.string.assessmentKeepGoing;
                            } else {
                                i18 = R.string.assessmentHereForYou5;
                            }
                            bundle.putInt("prompt", i18);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("result", R.string.assessmentResultSleepHigh);
                            bundle.putInt("desc1", R.string.assessmentResultScoreSleepHighTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreSleepHighBottomText);
                            bundle.putInt("desc3", R.string.sleepAssessmentHighImpText);
                            if (z13) {
                                i17 = R.string.assessmentHereForYou6;
                            } else {
                                i17 = R.string.assessmentGotYourBack1;
                            }
                            bundle.putInt("prompt", i17);
                            break;
                        }
                    }
                    break;
                case 113319009:
                    if (course2.equals(Constants.COURSE_WORRY)) {
                        if (kotlin.jvm.internal.i.b(obj, "low")) {
                            bundle.putInt("result", R.string.assessmentResultAnxietyLow);
                            bundle.putInt("desc1", R.string.assessmentResultScoreAnxietyLowTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreAnxietyLowBottomText);
                            bundle.putInt("desc3", R.string.assessmentLowImpText);
                            if (z13) {
                                i22 = R.string.assessmentDoingWell2;
                            } else {
                                i22 = R.string.assessmentDoingGood1;
                            }
                            bundle.putInt("prompt", i22);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "mid")) {
                            bundle.putInt("result", R.string.assessmentResultAnxietyModerate);
                            bundle.putInt("desc1", R.string.assessmentResultScoreAnxietyModerateTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreAnxietyModerateBottomText);
                            bundle.putInt("desc3", R.string.worryAssessmentMedImpText);
                            if (z13) {
                                i21 = R.string.assessmentCopingWell3;
                            } else {
                                i21 = R.string.assessmentHereForYou4;
                            }
                            bundle.putInt("prompt", i21);
                            break;
                        } else if (kotlin.jvm.internal.i.b(obj, "high")) {
                            bundle.putInt("result", R.string.assessmentResultAnxietyHigh);
                            bundle.putInt("desc1", R.string.assessmentResultScoreAnxietyHighTopText);
                            bundle.putInt("desc2", R.string.assessmentResultScoreAnxietyHighBottomText);
                            bundle.putInt("desc3", R.string.worryAssessmentHighImpText);
                            if (z13) {
                                i20 = R.string.assessmentGotYourBack1;
                            } else {
                                i20 = R.string.assessmentGetThrough1;
                            }
                            bundle.putInt("prompt", i20);
                            break;
                        }
                    }
                    break;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreLevelTitle)).setText(getString(bundle.getInt("result")));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreLevelSubtitle)).setText(getString(bundle.getInt("prompt")));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreDescription1)).setText(getString(bundle.getInt("desc1")));
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreDescription2)).setText(getString(bundle.getInt("desc2")));
            if (this.B) {
                Extensions extensions = Extensions.INSTANCE;
                RobertoTextView assessmentScoreDescription3 = (RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreDescription3);
                kotlin.jvm.internal.i.f(assessmentScoreDescription3, "assessmentScoreDescription3");
                extensions.visible(assessmentScoreDescription3);
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreDescription3)).setText(getString(bundle.getInt("desc3")));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void S(AssessmentResponseAll assessmentResponseAll) {
        boolean z10;
        boolean z11;
        int i6;
        Integer score;
        Integer score2;
        int i10;
        Integer score3;
        Integer score4;
        Integer num;
        boolean z12;
        boolean z13;
        int i11 = 0;
        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent)).setEnabled(false);
        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarPrevious)).setEnabled(false);
        String str = "mid";
        boolean z14 = true;
        if (!this.B) {
            J();
            String course = this.A;
            kotlin.jvm.internal.i.g(course, "course");
            switch (course.hashCode()) {
                case -2114782937:
                    if (course.equals(Constants.COURSE_HAPPINESS)) {
                        num = Integer.valueOf((int) R.drawable.seekbar_gradient_happiness);
                        break;
                    }
                    num = null;
                    break;
                case -1617042330:
                    if (course.equals(Constants.COURSE_DEPRESSION)) {
                        num = Integer.valueOf((int) R.drawable.seekbar_gradient_depression);
                        break;
                    }
                    num = null;
                    break;
                case -891989580:
                    if (course.equals(Constants.COURSE_STRESS)) {
                        num = Integer.valueOf((int) R.drawable.seekbar_gradient_stress);
                        break;
                    }
                    num = null;
                    break;
                case 92960775:
                    if (course.equals(Constants.COURSE_ANGER)) {
                        num = Integer.valueOf((int) R.drawable.seekbar_gradient_anger);
                        break;
                    }
                    num = null;
                    break;
                case 109522647:
                    if (course.equals(Constants.COURSE_SLEEP)) {
                        num = Integer.valueOf((int) R.drawable.seekbar_gradient_sleep);
                        break;
                    }
                    num = null;
                    break;
                case 113319009:
                    if (course.equals(Constants.COURSE_WORRY)) {
                        num = Integer.valueOf((int) R.drawable.seekbar_gradient_worry);
                        break;
                    }
                    num = null;
                    break;
                default:
                    num = null;
                    break;
            }
            if (num != null) {
                int intValue = num.intValue();
                Context requireContext = requireContext();
                Object obj = g0.a.f16164a;
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent)).setProgressDrawable(a.c.b(requireContext, intValue));
            }
            Integer score5 = assessmentResponseAll.getScore();
            if (score5 != null) {
                int intValue2 = score5.intValue();
                J();
                HashMap N = hc.d.N(this.A);
                J();
                Object obj2 = N.get("high");
                kotlin.jvm.internal.i.d(obj2);
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent)).setMax(((xs.f) obj2).f37997v);
                J();
                String str2 = this.A;
                J();
                Object obj3 = N.get("low");
                kotlin.jvm.internal.i.d(obj3);
                xs.f fVar = (xs.f) obj3;
                if (intValue2 <= fVar.f37997v && fVar.f37996u <= intValue2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    J();
                    str = "low";
                } else {
                    J();
                    Object obj4 = N.get("mid");
                    kotlin.jvm.internal.i.d(obj4);
                    xs.f fVar2 = (xs.f) obj4;
                    if (intValue2 <= fVar2.f37997v && fVar2.f37996u <= intValue2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        J();
                    } else {
                        J();
                        Object obj5 = N.get("high");
                        kotlin.jvm.internal.i.d(obj5);
                        xs.f fVar3 = (xs.f) obj5;
                        if (intValue2 <= fVar3.f37997v && fVar3.f37996u <= intValue2) {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            J();
                        } else {
                            J();
                        }
                        str = "high";
                    }
                }
                int G2 = hc.d.G(str2, str);
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent)).setProgress(intValue2);
                ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent)).setThumb(K(intValue2, G2));
                return;
            }
            return;
        }
        ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarPrevious)).setVisibility(0);
        Extensions extensions = Extensions.INSTANCE;
        View assessmentResultSpace = _$_findCachedViewById(R.id.assessmentResultSpace);
        kotlin.jvm.internal.i.f(assessmentResultSpace, "assessmentResultSpace");
        extensions.gone(assessmentResultSpace);
        Integer score6 = assessmentResponseAll.getScore();
        if (score6 != null) {
            int intValue3 = score6.intValue();
            J();
            HashMap N2 = hc.d.N(this.A);
            J();
            Object obj6 = N2.get("high");
            kotlin.jvm.internal.i.d(obj6);
            int i12 = ((xs.f) obj6).f37997v;
            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent)).setMax(i12);
            ((SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarPrevious)).setMax(i12);
            J();
            String str3 = this.A;
            J();
            Object obj7 = N2.get("low");
            kotlin.jvm.internal.i.d(obj7);
            xs.f fVar4 = (xs.f) obj7;
            if (intValue3 <= fVar4.f37997v && fVar4.f37996u <= intValue3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                J();
                str = "low";
            } else {
                J();
                Object obj8 = N2.get("mid");
                kotlin.jvm.internal.i.d(obj8);
                xs.f fVar5 = (xs.f) obj8;
                if (intValue3 <= fVar5.f37997v && fVar5.f37996u <= intValue3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    J();
                } else {
                    J();
                    Object obj9 = N2.get("high");
                    kotlin.jvm.internal.i.d(obj9);
                    xs.f fVar6 = (xs.f) obj9;
                    if ((intValue3 > fVar6.f37997v || fVar6.f37996u > intValue3) ? false : false) {
                        J();
                    } else {
                        J();
                    }
                    str = "high";
                }
            }
            int G3 = hc.d.G(str3, str);
            if (kotlin.jvm.internal.i.b(this.A, Constants.COURSE_HAPPINESS)) {
                SeekBar seekBar = (SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent);
                Context requireContext2 = requireContext();
                Object obj10 = g0.a.f16164a;
                seekBar.setProgressDrawable(a.c.b(requireContext2, R.drawable.seekbar_solid_grey));
                AssessmentResponseAll assessmentResponseAll2 = this.f20208z;
                if (assessmentResponseAll2 != null && (score4 = assessmentResponseAll2.getScore()) != null) {
                    i10 = score4.intValue();
                } else {
                    i10 = 0;
                }
                seekBar.setThumb(M(i10));
                AssessmentResponseAll assessmentResponseAll3 = this.f20208z;
                if (assessmentResponseAll3 != null && (score3 = assessmentResponseAll3.getScore()) != null) {
                    i11 = score3.intValue();
                }
                seekBar.setProgress(i11);
                SeekBar seekBar2 = (SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarPrevious);
                Context requireContext3 = requireContext();
                J();
                seekBar2.setProgressDrawable(a.c.b(requireContext3, hc.d.K(this.A)));
                seekBar2.setProgress(intValue3);
                seekBar2.setThumb(K(intValue3, G3));
                return;
            }
            SeekBar seekBar3 = (SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarCurrent);
            Context requireContext4 = requireContext();
            J();
            int K = hc.d.K(this.A);
            Object obj11 = g0.a.f16164a;
            seekBar3.setProgressDrawable(a.c.b(requireContext4, K));
            seekBar3.setProgress(intValue3);
            seekBar3.setThumb(K(intValue3, G3));
            SeekBar seekBar4 = (SeekBar) _$_findCachedViewById(R.id.assessmentScoreSeekbarPrevious);
            Context requireContext5 = requireContext();
            J();
            seekBar4.setProgressDrawable(a.c.b(requireContext5, hc.d.K("")));
            AssessmentResponseAll assessmentResponseAll4 = this.f20208z;
            if (assessmentResponseAll4 != null && (score2 = assessmentResponseAll4.getScore()) != null) {
                i6 = score2.intValue();
            } else {
                i6 = 0;
            }
            seekBar4.setProgress(i6);
            AssessmentResponseAll assessmentResponseAll5 = this.f20208z;
            if (assessmentResponseAll5 != null && (score = assessmentResponseAll5.getScore()) != null) {
                i11 = score.intValue();
            }
            seekBar4.setThumb(M(i11));
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.F;
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
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof AssessmentListener) {
            this.f20204v = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        Serializable serializable2;
        boolean z10;
        boolean z11;
        super.onCreate(bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity");
        hc.d dVar = ((ExptInitialAssessmentActivity) requireActivity).f10585d0;
        kotlin.jvm.internal.i.g(dVar, "<set-?>");
        this.E = dVar;
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("responseData");
        } else {
            serializable = null;
        }
        this.f20207y = (AssessmentResponseAll) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("previousResponseData");
        } else {
            serializable2 = null;
        }
        this.f20208z = (AssessmentResponseAll) serializable2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString("course");
        }
        if (str == null) {
            str = "";
        }
        this.A = str;
        Bundle arguments4 = getArguments();
        int i6 = 0;
        if (arguments4 != null) {
            z10 = arguments4.getBoolean("showResult");
        } else {
            z10 = false;
        }
        this.C = z10;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z11 = arguments5.getBoolean("showComparison");
        } else {
            z11 = false;
        }
        this.B = z11;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            i6 = arguments6.getInt("dayPlanPosition");
        }
        this.D = i6;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.F.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0117 A[Catch: Exception -> 0x01bd, TryCatch #0 {Exception -> 0x01bd, blocks: (B:3:0x0008, B:5:0x0026, B:6:0x003c, B:8:0x0047, B:9:0x005b, B:11:0x005f, B:12:0x006b, B:14:0x0094, B:19:0x00b3, B:21:0x00d2, B:24:0x00d9, B:26:0x00e8, B:28:0x0117, B:31:0x011d, B:36:0x0126, B:40:0x0132, B:43:0x013e, B:39:0x012f, B:44:0x0141, B:46:0x0147, B:50:0x015b, B:54:0x016b, B:58:0x0178, B:62:0x0187, B:66:0x0196, B:68:0x019e, B:65:0x0193, B:61:0x0184, B:57:0x0175, B:53:0x0168, B:69:0x01a7, B:25:0x00e1, B:15:0x009c, B:17:0x00a4, B:18:0x00ac), top: B:74:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126 A[Catch: Exception -> 0x01bd, TryCatch #0 {Exception -> 0x01bd, blocks: (B:3:0x0008, B:5:0x0026, B:6:0x003c, B:8:0x0047, B:9:0x005b, B:11:0x005f, B:12:0x006b, B:14:0x0094, B:19:0x00b3, B:21:0x00d2, B:24:0x00d9, B:26:0x00e8, B:28:0x0117, B:31:0x011d, B:36:0x0126, B:40:0x0132, B:43:0x013e, B:39:0x012f, B:44:0x0141, B:46:0x0147, B:50:0x015b, B:54:0x016b, B:58:0x0178, B:62:0x0187, B:66:0x0196, B:68:0x019e, B:65:0x0193, B:61:0x0184, B:57:0x0175, B:53:0x0168, B:69:0x01a7, B:25:0x00e1, B:15:0x009c, B:17:0x00a4, B:18:0x00ac), top: B:74:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147 A[Catch: Exception -> 0x01bd, TryCatch #0 {Exception -> 0x01bd, blocks: (B:3:0x0008, B:5:0x0026, B:6:0x003c, B:8:0x0047, B:9:0x005b, B:11:0x005f, B:12:0x006b, B:14:0x0094, B:19:0x00b3, B:21:0x00d2, B:24:0x00d9, B:26:0x00e8, B:28:0x0117, B:31:0x011d, B:36:0x0126, B:40:0x0132, B:43:0x013e, B:39:0x012f, B:44:0x0141, B:46:0x0147, B:50:0x015b, B:54:0x016b, B:58:0x0178, B:62:0x0187, B:66:0x0196, B:68:0x019e, B:65:0x0193, B:61:0x0184, B:57:0x0175, B:53:0x0168, B:69:0x01a7, B:25:0x00e1, B:15:0x009c, B:17:0x00a4, B:18:0x00ac), top: B:74:0x0008 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        androidx.fragment.app.p requireActivity;
        ExptInitialAssessmentActivity exptInitialAssessmentActivity;
        boolean z10;
        Bundle arguments;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ConstraintLayout assessmentResultScrollView = (ConstraintLayout) _$_findCachedViewById(R.id.assessmentResultScrollView);
            kotlin.jvm.internal.i.f(assessmentResultScrollView, "assessmentResultScrollView");
            insetsUtils.addStatusBarHeight(assessmentResultScrollView);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.assessmentScoreLevelTitle);
            if (robertoTextView != null) {
                Context requireContext = requireContext();
                J();
                robertoTextView.setTextColor(g0.a.b(requireContext, hc.d.G(this.A, "high")));
            }
            J();
            Integer O = hc.d.O(this.A);
            if (O != null) {
                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentResultTitle)).setText(getString(O.intValue()));
            }
            AssessmentResponseAll assessmentResponseAll = this.f20207y;
            if (assessmentResponseAll != null) {
                S(assessmentResponseAll);
                Q(assessmentResponseAll);
                O(assessmentResponseAll);
                P(assessmentResponseAll);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).getPaintFlags() | 8);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA);
            String str = this.A;
            if (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS)) {
                string = getString(R.string.graphSecondaryCTAFactors);
            } else if (kotlin.jvm.internal.i.b(str, Constants.COURSE_SLEEP)) {
                string = getString(R.string.graphSecondaryCTAIndicators);
            } else {
                string = getString(R.string.graphSecondaryCTASymptoms);
            }
            robertoTextView2.setText(string);
            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j0 f20185v;

                {
                    this.f20185v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6;
                    Integer score;
                    int i10 = r2;
                    j0 this$0 = this.f20185v;
                    switch (i10) {
                        case 0:
                            int i11 = j0.G;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            AssessmentResponseAll assessmentResponseAll2 = this$0.f20207y;
                            if (assessmentResponseAll2 != null && (score = assessmentResponseAll2.getScore()) != null) {
                                i6 = score.intValue();
                            } else {
                                i6 = -1;
                            }
                            analyticsBundle.putInt("score", i6);
                            UtilsKt.fireAnalytics("assessment_graph_secondary_cta_click", analyticsBundle);
                            UtilsKt.logError$default(this$0.f20203u, null, new k0(this$0), 2, null);
                            return;
                        case 1:
                            int i12 = j0.G;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            UtilsKt.logError$default(this$0.f20203u, null, new j0.a(), 2, null);
                            return;
                        default:
                            int i13 = j0.G;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            });
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.assessmentResultCTA);
            if (!this.C && this.D != 30) {
                string2 = getString(R.string.assessmentGraphButtonTwo);
                robertoButton.setText(string2);
                View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: ik.g0

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j0 f20185v;

                    {
                        this.f20185v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6;
                        Integer score;
                        int i10 = r2;
                        j0 this$0 = this.f20185v;
                        switch (i10) {
                            case 0:
                                int i11 = j0.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                                AssessmentResponseAll assessmentResponseAll2 = this$0.f20207y;
                                if (assessmentResponseAll2 != null && (score = assessmentResponseAll2.getScore()) != null) {
                                    i6 = score.intValue();
                                } else {
                                    i6 = -1;
                                }
                                analyticsBundle.putInt("score", i6);
                                UtilsKt.fireAnalytics("assessment_graph_secondary_cta_click", analyticsBundle);
                                UtilsKt.logError$default(this$0.f20203u, null, new k0(this$0), 2, null);
                                return;
                            case 1:
                                int i12 = j0.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                UtilsKt.logError$default(this$0.f20203u, null, new j0.a(), 2, null);
                                return;
                            default:
                                int i13 = j0.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                };
                ((RobertoButton) _$_findCachedViewById(R.id.assessmentResultCTA)).setOnClickListener(DebouncedOnClickListener.wrap(onClickListener));
                ((RobertoButton) _$_findCachedViewById(R.id.assessmentResultFooterCTA)).setOnClickListener(DebouncedOnClickListener.wrap(onClickListener));
                requireActivity = requireActivity();
                Boolean bool = null;
                if (!(requireActivity instanceof ExptInitialAssessmentActivity)) {
                    exptInitialAssessmentActivity = (ExptInitialAssessmentActivity) requireActivity;
                } else {
                    exptInitialAssessmentActivity = null;
                }
                if (exptInitialAssessmentActivity == null && exptInitialAssessmentActivity.f10583a0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.assessmentResultCTA);
                    if (robertoButton2 != null) {
                        robertoButton2.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clAssessmentCtaFooter);
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                }
                arguments = getArguments();
                if (arguments != null) {
                    Boolean valueOf = Boolean.valueOf(arguments.getBoolean("showTopNav"));
                    if (!(!valueOf.booleanValue())) {
                        bool = valueOf;
                    }
                    if (bool != null) {
                        bool.booleanValue();
                        View _$_findCachedViewById = _$_findCachedViewById(R.id.viewAssessmentHeaderBottom);
                        if (_$_findCachedViewById != null) {
                            _$_findCachedViewById.setVisibility(0);
                        }
                        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.viewAssessmentHeaderBackground);
                        if (_$_findCachedViewById2 != null) {
                            _$_findCachedViewById2.setVisibility(0);
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvSaHeader);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setVisibility(0);
                        }
                        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivAssessmentBack);
                        if (appCompatImageView != null) {
                            appCompatImageView.setVisibility(0);
                        }
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivAssessmentBack);
                        if (appCompatImageView2 != null) {
                            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ik.g0

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ j0 f20185v;

                                {
                                    this.f20185v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i6;
                                    Integer score;
                                    int i10 = r2;
                                    j0 this$0 = this.f20185v;
                                    switch (i10) {
                                        case 0:
                                            int i11 = j0.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                                            AssessmentResponseAll assessmentResponseAll2 = this$0.f20207y;
                                            if (assessmentResponseAll2 != null && (score = assessmentResponseAll2.getScore()) != null) {
                                                i6 = score.intValue();
                                            } else {
                                                i6 = -1;
                                            }
                                            analyticsBundle.putInt("score", i6);
                                            UtilsKt.fireAnalytics("assessment_graph_secondary_cta_click", analyticsBundle);
                                            UtilsKt.logError$default(this$0.f20203u, null, new k0(this$0), 2, null);
                                            return;
                                        case 1:
                                            int i12 = j0.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            UtilsKt.logError$default(this$0.f20203u, null, new j0.a(), 2, null);
                                            return;
                                        default:
                                            int i13 = j0.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.requireActivity().onBackPressed();
                                            return;
                                    }
                                }
                            });
                        }
                    }
                }
                androidx.fragment.app.p requireActivity2 = requireActivity();
                kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity");
                ((ExptInitialAssessmentActivity) requireActivity2).w0(Integer.valueOf((int) R.color.white), true);
            }
            string2 = getString(R.string.assessmentGraphButton);
            robertoButton.setText(string2);
            View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: ik.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j0 f20185v;

                {
                    this.f20185v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6;
                    Integer score;
                    int i10 = r2;
                    j0 this$0 = this.f20185v;
                    switch (i10) {
                        case 0:
                            int i11 = j0.G;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            AssessmentResponseAll assessmentResponseAll2 = this$0.f20207y;
                            if (assessmentResponseAll2 != null && (score = assessmentResponseAll2.getScore()) != null) {
                                i6 = score.intValue();
                            } else {
                                i6 = -1;
                            }
                            analyticsBundle.putInt("score", i6);
                            UtilsKt.fireAnalytics("assessment_graph_secondary_cta_click", analyticsBundle);
                            UtilsKt.logError$default(this$0.f20203u, null, new k0(this$0), 2, null);
                            return;
                        case 1:
                            int i12 = j0.G;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            UtilsKt.logError$default(this$0.f20203u, null, new j0.a(), 2, null);
                            return;
                        default:
                            int i13 = j0.G;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            };
            ((RobertoButton) _$_findCachedViewById(R.id.assessmentResultCTA)).setOnClickListener(DebouncedOnClickListener.wrap(onClickListener2));
            ((RobertoButton) _$_findCachedViewById(R.id.assessmentResultFooterCTA)).setOnClickListener(DebouncedOnClickListener.wrap(onClickListener2));
            requireActivity = requireActivity();
            Boolean bool2 = null;
            if (!(requireActivity instanceof ExptInitialAssessmentActivity)) {
            }
            if (exptInitialAssessmentActivity == null) {
            }
            z10 = false;
            if (z10) {
            }
            arguments = getArguments();
            if (arguments != null) {
            }
            androidx.fragment.app.p requireActivity22 = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity22, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity");
            ((ExptInitialAssessmentActivity) requireActivity22).w0(Integer.valueOf((int) R.color.white), true);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20203u, e10);
        }
    }
}
