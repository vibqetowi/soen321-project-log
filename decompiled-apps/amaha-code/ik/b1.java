package ik;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.appsflyer.AppsFlyerLib;
import com.github.mikephil.charting.charts.RadarChart;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.model.AssessmentResponse;
import com.theinnerhour.b2b.model.AssessmentResponseCategory;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentGraphFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/b1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b1 extends rr.b {
    public static final /* synthetic */ int I = 0;
    public final ArrayList<String> A;
    public final ArrayList<Integer> B;
    public final ArrayList<String> C;
    public final ArrayList<String> D;
    public String E;
    public final ArrayList<Integer> F;
    public int G;

    /* renamed from: v  reason: collision with root package name */
    public RadarChart f20129v;

    /* renamed from: z  reason: collision with root package name */
    public AssessmentResponseCategory f20133z;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20128u = LogHelper.INSTANCE.makeLogTag(b1.class);

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<r6.p> f20130w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<r6.p> f20131x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<v6.h> f20132y = new ArrayList<>();

    /* compiled from: InitialAssessmentGraphFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements s6.b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<String> f20134a;

        public a(b1 b1Var) {
            this.f20134a = b1Var.A;
        }

        @Override // s6.b
        public final String a(float f, q6.a axis) {
            kotlin.jvm.internal.i.g(axis, "axis");
            ArrayList<String> arrayList = this.f20134a;
            String str = arrayList.get(((int) f) % arrayList.size());
            kotlin.jvm.internal.i.f(str, "mFactors[value.toInt() % mFactors.size]");
            return str;
        }
    }

    public b1() {
        new AssessmentResponseCategory();
        this.f20133z = new AssessmentResponseCategory();
        new AssessmentResponseCategory();
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = "";
        this.F = new ArrayList<>();
        this.G = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x028e A[Catch: Exception -> 0x0292, TryCatch #0 {Exception -> 0x0292, blocks: (B:3:0x0002, B:7:0x0019, B:8:0x0025, B:36:0x0090, B:38:0x0095, B:40:0x009a, B:42:0x00a1, B:43:0x00b7, B:45:0x00d1, B:46:0x00d8, B:10:0x002a, B:13:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x004c, B:21:0x0055, B:22:0x005d, B:25:0x0066, B:26:0x006e, B:29:0x0077, B:30:0x007f, B:33:0x0086, B:48:0x00fd, B:50:0x0109, B:51:0x0121, B:53:0x0140, B:58:0x0166, B:60:0x016e, B:61:0x0175, B:63:0x0194, B:67:0x01b6, B:71:0x01ce, B:72:0x01e0, B:74:0x01e6, B:75:0x01f0, B:76:0x01fc, B:78:0x0202, B:79:0x020c, B:82:0x0213, B:84:0x021a, B:86:0x0221, B:87:0x022d, B:89:0x0233, B:90:0x023d, B:92:0x0241, B:94:0x024a, B:96:0x0253, B:98:0x0265, B:100:0x026e, B:101:0x0272, B:102:0x0275, B:103:0x0276, B:104:0x0279, B:105:0x027a, B:106:0x027d, B:107:0x027e, B:108:0x0281, B:109:0x0282, B:110:0x0285, B:111:0x0286, B:112:0x0289, B:113:0x028a, B:114:0x028d, B:115:0x028e, B:116:0x0291), top: B:120:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e A[Catch: Exception -> 0x0292, TryCatch #0 {Exception -> 0x0292, blocks: (B:3:0x0002, B:7:0x0019, B:8:0x0025, B:36:0x0090, B:38:0x0095, B:40:0x009a, B:42:0x00a1, B:43:0x00b7, B:45:0x00d1, B:46:0x00d8, B:10:0x002a, B:13:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x004c, B:21:0x0055, B:22:0x005d, B:25:0x0066, B:26:0x006e, B:29:0x0077, B:30:0x007f, B:33:0x0086, B:48:0x00fd, B:50:0x0109, B:51:0x0121, B:53:0x0140, B:58:0x0166, B:60:0x016e, B:61:0x0175, B:63:0x0194, B:67:0x01b6, B:71:0x01ce, B:72:0x01e0, B:74:0x01e6, B:75:0x01f0, B:76:0x01fc, B:78:0x0202, B:79:0x020c, B:82:0x0213, B:84:0x021a, B:86:0x0221, B:87:0x022d, B:89:0x0233, B:90:0x023d, B:92:0x0241, B:94:0x024a, B:96:0x0253, B:98:0x0265, B:100:0x026e, B:101:0x0272, B:102:0x0275, B:103:0x0276, B:104:0x0279, B:105:0x027a, B:106:0x027d, B:107:0x027e, B:108:0x0281, B:109:0x0282, B:110:0x0285, B:111:0x0286, B:112:0x0289, B:113:0x028a, B:114:0x028d, B:115:0x028e, B:116:0x0291), top: B:120:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6 A[Catch: Exception -> 0x0292, LOOP:2: B:72:0x01e0->B:74:0x01e6, LOOP_END, TryCatch #0 {Exception -> 0x0292, blocks: (B:3:0x0002, B:7:0x0019, B:8:0x0025, B:36:0x0090, B:38:0x0095, B:40:0x009a, B:42:0x00a1, B:43:0x00b7, B:45:0x00d1, B:46:0x00d8, B:10:0x002a, B:13:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x004c, B:21:0x0055, B:22:0x005d, B:25:0x0066, B:26:0x006e, B:29:0x0077, B:30:0x007f, B:33:0x0086, B:48:0x00fd, B:50:0x0109, B:51:0x0121, B:53:0x0140, B:58:0x0166, B:60:0x016e, B:61:0x0175, B:63:0x0194, B:67:0x01b6, B:71:0x01ce, B:72:0x01e0, B:74:0x01e6, B:75:0x01f0, B:76:0x01fc, B:78:0x0202, B:79:0x020c, B:82:0x0213, B:84:0x021a, B:86:0x0221, B:87:0x022d, B:89:0x0233, B:90:0x023d, B:92:0x0241, B:94:0x024a, B:96:0x0253, B:98:0x0265, B:100:0x026e, B:101:0x0272, B:102:0x0275, B:103:0x0276, B:104:0x0279, B:105:0x027a, B:106:0x027d, B:107:0x027e, B:108:0x0281, B:109:0x0282, B:110:0x0285, B:111:0x0286, B:112:0x0289, B:113:0x028a, B:114:0x028d, B:115:0x028e, B:116:0x0291), top: B:120:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0202 A[Catch: Exception -> 0x0292, LOOP:3: B:76:0x01fc->B:78:0x0202, LOOP_END, TryCatch #0 {Exception -> 0x0292, blocks: (B:3:0x0002, B:7:0x0019, B:8:0x0025, B:36:0x0090, B:38:0x0095, B:40:0x009a, B:42:0x00a1, B:43:0x00b7, B:45:0x00d1, B:46:0x00d8, B:10:0x002a, B:13:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x004c, B:21:0x0055, B:22:0x005d, B:25:0x0066, B:26:0x006e, B:29:0x0077, B:30:0x007f, B:33:0x0086, B:48:0x00fd, B:50:0x0109, B:51:0x0121, B:53:0x0140, B:58:0x0166, B:60:0x016e, B:61:0x0175, B:63:0x0194, B:67:0x01b6, B:71:0x01ce, B:72:0x01e0, B:74:0x01e6, B:75:0x01f0, B:76:0x01fc, B:78:0x0202, B:79:0x020c, B:82:0x0213, B:84:0x021a, B:86:0x0221, B:87:0x022d, B:89:0x0233, B:90:0x023d, B:92:0x0241, B:94:0x024a, B:96:0x0253, B:98:0x0265, B:100:0x026e, B:101:0x0272, B:102:0x0275, B:103:0x0276, B:104:0x0279, B:105:0x027a, B:106:0x027d, B:107:0x027e, B:108:0x0281, B:109:0x0282, B:110:0x0285, B:111:0x0286, B:112:0x0289, B:113:0x028a, B:114:0x028d, B:115:0x028e, B:116:0x0291), top: B:120:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0213 A[Catch: Exception -> 0x0292, TRY_ENTER, TryCatch #0 {Exception -> 0x0292, blocks: (B:3:0x0002, B:7:0x0019, B:8:0x0025, B:36:0x0090, B:38:0x0095, B:40:0x009a, B:42:0x00a1, B:43:0x00b7, B:45:0x00d1, B:46:0x00d8, B:10:0x002a, B:13:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x004c, B:21:0x0055, B:22:0x005d, B:25:0x0066, B:26:0x006e, B:29:0x0077, B:30:0x007f, B:33:0x0086, B:48:0x00fd, B:50:0x0109, B:51:0x0121, B:53:0x0140, B:58:0x0166, B:60:0x016e, B:61:0x0175, B:63:0x0194, B:67:0x01b6, B:71:0x01ce, B:72:0x01e0, B:74:0x01e6, B:75:0x01f0, B:76:0x01fc, B:78:0x0202, B:79:0x020c, B:82:0x0213, B:84:0x021a, B:86:0x0221, B:87:0x022d, B:89:0x0233, B:90:0x023d, B:92:0x0241, B:94:0x024a, B:96:0x0253, B:98:0x0265, B:100:0x026e, B:101:0x0272, B:102:0x0275, B:103:0x0276, B:104:0x0279, B:105:0x027a, B:106:0x027d, B:107:0x027e, B:108:0x0281, B:109:0x0282, B:110:0x0285, B:111:0x0286, B:112:0x0289, B:113:0x028a, B:114:0x028d, B:115:0x028e, B:116:0x0291), top: B:120:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        int i6;
        androidx.fragment.app.p activity;
        androidx.fragment.app.p activity2;
        int i10;
        Iterator<v6.h> it;
        RadarChart radarChart;
        String string;
        try {
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            boolean z10 = ((InitialAssessmentActivity) activity3).M;
            ArrayList<v6.h> arrayList = this.f20132y;
            if (z10) {
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.assessmentText);
                String str = this.E;
                switch (str.hashCode()) {
                    case -2114782937:
                        if (str.equals(Constants.COURSE_HAPPINESS)) {
                            string = getString(R.string.assessmentResultGraphCompareHappiness);
                            break;
                        } else {
                            string = "";
                            break;
                        }
                    case -1617042330:
                        if (str.equals(Constants.COURSE_DEPRESSION)) {
                            string = getString(R.string.assessmentResultGraphCompareDepression);
                            break;
                        } else {
                            string = "";
                            break;
                        }
                    case -891989580:
                        if (str.equals(Constants.COURSE_STRESS)) {
                            string = getString(R.string.assessmentResultGraphCompareStress);
                            break;
                        } else {
                            string = "";
                            break;
                        }
                    case 92960775:
                        if (str.equals(Constants.COURSE_ANGER)) {
                            string = getString(R.string.assessmentResultGraphCompareAnger);
                            break;
                        } else {
                            string = "";
                            break;
                        }
                    case 109522647:
                        if (str.equals(Constants.COURSE_SLEEP)) {
                            string = getString(R.string.assessmentResultGraphCompareSleep);
                            break;
                        } else {
                            string = "";
                            break;
                        }
                    case 113319009:
                        if (str.equals(Constants.COURSE_WORRY)) {
                            string = getString(R.string.assessmentResultGraphCompareWorry);
                            break;
                        } else {
                            string = "";
                            break;
                        }
                    default:
                        string = "";
                        break;
                }
                robertoTextView.setText(string);
                ArrayList<r6.p> arrayList2 = this.f20131x;
                arrayList2.clear();
                ArrayList<Integer> arrayList3 = this.F;
                int size = arrayList3.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList2.add(new r6.p(arrayList3.get(i11).intValue()));
                }
                r6.o oVar = new r6.o(arrayList2);
                oVar.f30527z = y6.f.c(0.0f);
                int b10 = g0.a.b(requireContext(), R.color.grey_2);
                if (oVar.f30490a == null) {
                    oVar.f30490a = new ArrayList();
                }
                oVar.f30490a.clear();
                oVar.f30490a.add(Integer.valueOf(b10));
                oVar.f30525x = g0.a.b(requireContext(), R.color.grey_2);
                oVar.f30526y = 150;
                oVar.A = true;
                oVar.f30498j = false;
                arrayList.add(oVar);
            }
            ArrayList<r6.p> arrayList4 = this.f20130w;
            arrayList4.clear();
            int size2 = this.A.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList4.add(new r6.p(this.B.get(i12).intValue()));
            }
            r6.o oVar2 = new r6.o(arrayList4);
            oVar2.f30527z = y6.f.c(0.0f);
            Context requireContext = requireContext();
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            boolean z11 = ((InitialAssessmentActivity) activity4).M;
            int i13 = R.color.sea;
            if (!z11 && !kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseName(), Constants.COURSE_HAPPINESS)) {
                i6 = R.color.assessment_result;
                int b11 = g0.a.b(requireContext, i6);
                if (oVar2.f30490a == null) {
                    oVar2.f30490a = new ArrayList();
                }
                oVar2.f30490a.clear();
                oVar2.f30490a.add(Integer.valueOf(b11));
                Context requireContext2 = requireContext();
                activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (!((InitialAssessmentActivity) activity).M && !kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseName(), Constants.COURSE_HAPPINESS)) {
                    i13 = R.color.assessment_result;
                }
                oVar2.f30525x = g0.a.b(requireContext2, i13);
                activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (!((InitialAssessmentActivity) activity2).M) {
                    i10 = 170;
                } else {
                    i10 = 230;
                }
                oVar2.f30526y = i10;
                oVar2.A = true;
                oVar2.f30498j = false;
                arrayList.add(oVar2);
                r6.n nVar = new r6.n(arrayList);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                com.google.firebase.messaging.j jVar = new com.google.firebase.messaging.j(6);
                for (T t3 : nVar.f30512i) {
                    t3.n(jVar);
                }
                radarChart = this.f20129v;
                if (radarChart == null) {
                    radarChart.setData(nVar);
                    RadarChart radarChart2 = this.f20129v;
                    if (radarChart2 != null) {
                        radarChart2.setRotationEnabled(false);
                        RadarChart radarChart3 = this.f20129v;
                        if (radarChart3 != null) {
                            for (T t10 : ((r6.n) radarChart3.getData()).f30512i) {
                                t10.H();
                            }
                            RadarChart radarChart4 = this.f20129v;
                            if (radarChart4 != null) {
                                radarChart4.setWebLineWidth(0.5f);
                                RadarChart radarChart5 = this.f20129v;
                                if (radarChart5 != null) {
                                    radarChart5.setWebLineWidthInner(1.0f);
                                    RadarChart radarChart6 = this.f20129v;
                                    if (radarChart6 != null) {
                                        radarChart6.setWebColor(g0.a.b(requireContext(), R.color.title_high_contrast));
                                        RadarChart radarChart7 = this.f20129v;
                                        if (radarChart7 != null) {
                                            radarChart7.setWebAlpha(255);
                                            RadarChart radarChart8 = this.f20129v;
                                            if (radarChart8 != null) {
                                                radarChart8.invalidate();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("radarChart");
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.i.q("radarChart");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("radarChart");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("radarChart");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("radarChart");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("radarChart");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("radarChart");
                    throw null;
                }
                kotlin.jvm.internal.i.q("radarChart");
                throw null;
            }
            i6 = R.color.sea;
            int b112 = g0.a.b(requireContext, i6);
            if (oVar2.f30490a == null) {
            }
            oVar2.f30490a.clear();
            oVar2.f30490a.add(Integer.valueOf(b112));
            Context requireContext22 = requireContext();
            activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (!((InitialAssessmentActivity) activity).M) {
                i13 = R.color.assessment_result;
            }
            oVar2.f30525x = g0.a.b(requireContext22, i13);
            activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (!((InitialAssessmentActivity) activity2).M) {
            }
            oVar2.f30526y = i10;
            oVar2.A = true;
            oVar2.f30498j = false;
            arrayList.add(oVar2);
            r6.n nVar2 = new r6.n(arrayList);
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            com.google.firebase.messaging.j jVar2 = new com.google.firebase.messaging.j(6);
            while (r2.hasNext()) {
            }
            radarChart = this.f20129v;
            if (radarChart == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20128u, "Error drawing chart", e10);
        }
    }

    public final void K(Dialog dialog) {
        try {
            View findViewById = dialog.findViewById(R.id.graphDialogTitle);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView = (RobertoTextView) findViewById;
            View findViewById2 = dialog.findViewById(R.id.graphDialogBody);
            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView2 = (RobertoTextView) findViewById2;
            LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.graphDialogSymptomContainer);
            ArrayList<String> arrayList = this.C;
            arrayList.clear();
            ArrayList<String> arrayList2 = this.D;
            arrayList2.clear();
            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                if (currentCourseName != null) {
                    switch (currentCourseName.hashCode()) {
                        case -2114782937:
                            if (currentCourseName.equals(Constants.COURSE_HAPPINESS)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleHappiness));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyHappiness));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogHappinessTitle1), getString(R.string.graphDialogHappinessTitle2), getString(R.string.graphDialogHappinessTitle3), getString(R.string.graphDialogHappinessTitle4), getString(R.string.graphDialogHappinessTitle5), getString(R.string.graphDialogHappinessTitle6), getString(R.string.graphDialogHappinessTitle7)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogHappinessBody1), getString(R.string.graphDialogHappinessBody2), getString(R.string.graphDialogHappinessBody3), getString(R.string.graphDialogHappinessBody4), getString(R.string.graphDialogHappinessBody5), getString(R.string.graphDialogHappinessBody6), getString(R.string.graphDialogHappinessBody7)));
                                break;
                            } else {
                                break;
                            }
                        case -1617042330:
                            if (currentCourseName.equals(Constants.COURSE_DEPRESSION)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleDepression));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyDepression));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogDepressionTitle1), getString(R.string.graphDialogDepressionTitle2), getString(R.string.graphDialogDepressionTitle3), getString(R.string.graphDialogDepressionTitle4), getString(R.string.graphDialogDepressionTitle5), getString(R.string.graphDialogDepressionTitle6)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogDepressionBody1), getString(R.string.graphDialogDepressionBody2), getString(R.string.graphDialogDepressionBody3), getString(R.string.graphDialogDepressionBody4), getString(R.string.graphDialogDepressionBody5), getString(R.string.graphDialogDepressionBody6)));
                                break;
                            } else {
                                break;
                            }
                        case -891989580:
                            if (currentCourseName.equals(Constants.COURSE_STRESS)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleStress));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyStress));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogStressTitle1), getString(R.string.graphDialogStressTitle2), getString(R.string.graphDialogStressTitle3), getString(R.string.graphDialogStressTitle4), getString(R.string.graphDialogStressTitle5), getString(R.string.graphDialogStressTitle6), getString(R.string.graphDialogStressTitle7)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogStressBody1), getString(R.string.graphDialogStressBody2), getString(R.string.graphDialogStressBody3), getString(R.string.graphDialogStressBody4), getString(R.string.graphDialogStressBody5), getString(R.string.graphDialogStressBody6), getString(R.string.graphDialogStressBody7)));
                                break;
                            } else {
                                break;
                            }
                        case 92960775:
                            if (currentCourseName.equals(Constants.COURSE_ANGER)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleAnger));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyAnger));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogAngerTitle1), getString(R.string.graphDialogAngerTitle2), getString(R.string.graphDialogAngerTitle3), getString(R.string.graphDialogAngerTitle4), getString(R.string.graphDialogAngerTitle5), getString(R.string.graphDialogAngerTitle6), getString(R.string.graphDialogAngerTitle7)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogAngerBody1), getString(R.string.graphDialogAngerBody2), getString(R.string.graphDialogAngerBody3), getString(R.string.graphDialogAngerBody4), getString(R.string.graphDialogAngerBody5), getString(R.string.graphDialogAngerBody6), getString(R.string.graphDialogAngerBody7)));
                                break;
                            }
                            break;
                        case 109522647:
                            if (currentCourseName.equals(Constants.COURSE_SLEEP)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleSleep));
                                robertoTextView2.setText(getString(R.string.graphDialogBodySleep));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogSleepTitle2), getString(R.string.graphDialogSleepTitle3), getString(R.string.graphDialogSleepTitle4), getString(R.string.graphDialogSleepTitle1), getString(R.string.graphDialogSleepTitle5)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogSleepBody2), getString(R.string.graphDialogSleepBody3), getString(R.string.graphDialogSleepBody4), getString(R.string.graphDialogSleepBody1), getString(R.string.graphDialogSleepBody5)));
                                break;
                            } else {
                                break;
                            }
                        case 113319009:
                            if (currentCourseName.equals(Constants.COURSE_WORRY)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleAnxiety));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyAnxiety));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogAnxietyTitle1), getString(R.string.graphDialogAnxietyTitle2), getString(R.string.graphDialogAnxietyTitle3), getString(R.string.graphDialogAnxietyTitle4), getString(R.string.graphDialogAnxietyTitle5), getString(R.string.graphDialogAnxietyTitle6), getString(R.string.graphDialogAnxietyTitle7)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogAnxietyBody1), getString(R.string.graphDialogAnxietyBody2), getString(R.string.graphDialogAnxietyBody3), getString(R.string.graphDialogAnxietyBody4), getString(R.string.graphDialogAnxietyBody5), getString(R.string.graphDialogAnxietyBody6), getString(R.string.graphDialogAnxietyBody7)));
                                break;
                            } else {
                                break;
                            }
                    }
                }
            } else {
                String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                if (currentCourseName2 != null) {
                    switch (currentCourseName2.hashCode()) {
                        case -2114782937:
                            if (currentCourseName2.equals(Constants.COURSE_HAPPINESS)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleHappiness));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyHappiness));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogHappinessOgTitle1), getString(R.string.graphDialogHappinessTitle1), getString(R.string.graphDialogHappinessTitle2), getString(R.string.graphDialogHappinessTitle3), getString(R.string.graphDialogHappinessTitle4), getString(R.string.graphDialogHappinessOgTitle2), getString(R.string.graphDialogHappinessOgTitle3), getString(R.string.graphDialogHappinessOgTitle4), getString(R.string.graphDialogHappinessOgTitle5)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogHappinessOgBody1), getString(R.string.graphDialogHappinessBody1), getString(R.string.graphDialogHappinessBody2), getString(R.string.graphDialogHappinessBody3), getString(R.string.graphDialogHappinessBody4), getString(R.string.graphDialogHappinessOgBody2), getString(R.string.graphDialogHappinessOgBody3), getString(R.string.graphDialogHappinessOgBody4), getString(R.string.graphDialogHappinessOgBody5)));
                                break;
                            } else {
                                break;
                            }
                        case -1617042330:
                            if (currentCourseName2.equals(Constants.COURSE_DEPRESSION)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleDepression));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyDepression));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogDepressionOgTitle1), getString(R.string.graphDialogDepressionTitle1), getString(R.string.graphDialogDepressionTitle2), getString(R.string.graphDialogDepressionTitle3), getString(R.string.graphDialogDepressionTitle4), getString(R.string.graphDialogDepressionOgTitle2)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogDepressionOgBody1), getString(R.string.graphDialogDepressionBody1), getString(R.string.graphDialogDepressionBody2), getString(R.string.graphDialogDepressionBody3), getString(R.string.graphDialogDepressionBody4), getString(R.string.graphDialogDepressionOgBody2)));
                                break;
                            } else {
                                break;
                            }
                        case -891989580:
                            if (currentCourseName2.equals(Constants.COURSE_STRESS)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleStress));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyStress));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogStressTitle1), getString(R.string.graphDialogStressTitle2), getString(R.string.graphDialogStressOgTitle1), getString(R.string.graphDialogStressTitle4), getString(R.string.graphDialogStressOgTitle2), getString(R.string.graphDialogStressOgTitle3), getString(R.string.graphDialogStressTitle7)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogStressBody1), getString(R.string.graphDialogStressBody2), getString(R.string.graphDialogStressOgBody1), getString(R.string.graphDialogStressBody4), getString(R.string.graphDialogStressOgBody2), getString(R.string.graphDialogStressOgBody3), getString(R.string.graphDialogStressBody7)));
                                break;
                            } else {
                                break;
                            }
                        case 92960775:
                            if (currentCourseName2.equals(Constants.COURSE_ANGER)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleAnger));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyAnger));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogAngerTitle1), getString(R.string.graphDialogAngerTitle2), getString(R.string.graphDialogAngerTitle3), getString(R.string.graphDialogAngerTitle4), getString(R.string.graphDialogAngerTitle5), getString(R.string.graphDialogAngerTitle6)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogAngerBody1), getString(R.string.graphDialogAngerBody2), getString(R.string.graphDialogAngerBody3), getString(R.string.graphDialogAngerBody4), getString(R.string.graphDialogAngerBody5), getString(R.string.graphDialogAngerBody6)));
                                break;
                            }
                            break;
                        case 109522647:
                            if (currentCourseName2.equals(Constants.COURSE_SLEEP)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleSleep));
                                robertoTextView2.setText(getString(R.string.graphDialogBodySleep));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogSleepOgTitle1), getString(R.string.graphDialogSleepOgTitle2), getString(R.string.graphDialogSleepTitle3), getString(R.string.graphDialogSleepTitle4), getString(R.string.graphDialogSleepTitle5), getString(R.string.graphDialogSleepOgTitle3), getString(R.string.graphDialogSleepOgTitle4), getString(R.string.graphDialogSleepOgTitle5), getString(R.string.graphDialogSleepOgTitle6)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogSleepOgBody1), getString(R.string.graphDialogSleepOgBody2), getString(R.string.graphDialogSleepBody3), getString(R.string.graphDialogSleepBody4), getString(R.string.graphDialogSleepBody5), getString(R.string.graphDialogSleepOgBody3), getString(R.string.graphDialogSleepOgBody4), getString(R.string.graphDialogSleepOgBody5), getString(R.string.graphDialogSleepOgBody6)));
                                break;
                            } else {
                                break;
                            }
                        case 113319009:
                            if (currentCourseName2.equals(Constants.COURSE_WORRY)) {
                                robertoTextView.setText(getString(R.string.graphDialogTitleAnxiety));
                                robertoTextView2.setText(getString(R.string.graphDialogBodyAnxiety));
                                arrayList.addAll(ca.a.P0(getString(R.string.graphDialogAnxietyTitle1), getString(R.string.graphDialogAnxietyOgTitle2), getString(R.string.graphDialogAnxietyOgTitle3), getString(R.string.graphDialogAnxietyTitle4), getString(R.string.graphDialogAnxietyOgTitle4), getString(R.string.graphDialogAnxietyTitle6), getString(R.string.graphDialogAnxietyOgTitle5), getString(R.string.graphDialogAnxietyTitle7), getString(R.string.graphDialogAnxietyOgTitle6)));
                                arrayList2.addAll(ca.a.P0(getString(R.string.graphDialogAnxietyBody1), getString(R.string.graphDialogAnxietyOgBody2), getString(R.string.graphDialogAnxietyBody3), getString(R.string.graphDialogAnxietyBody4), getString(R.string.graphDialogAnxietyOgBody4), getString(R.string.graphDialogAnxietyBody6), getString(R.string.graphDialogAnxietyOgBody5), getString(R.string.graphDialogAnxietyBody7), getString(R.string.graphDialogAnxietyOgBody6)));
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_graph_symptom_explanation, (ViewGroup) null);
                ((RobertoTextView) inflate.findViewById(R.id.graphDialogSymptomTitle)).setText(arrayList.get(i6));
                ((RobertoTextView) inflate.findViewById(R.id.graphDialogSymptomBody)).setText(arrayList2.get(i6));
                inflate.setOnClickListener(new h0(inflate, 1));
                linearLayout.addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20128u, "Error displaying symptoms dialog", e10);
        }
    }

    public final void M(int i6) {
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
        try {
            boolean z34 = true;
            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                String str = this.E;
                switch (str.hashCode()) {
                    case -2114782937:
                        if (!str.equals(Constants.COURSE_HAPPINESS)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphHappinessTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphHappinessDialogCTA));
                            if (i6 >= 0 && i6 < 15) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if (z22) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphHappinessLowText));
                                break;
                            } else {
                                if (15 <= i6 && i6 < 30) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (z23) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphHappinessModerateText));
                                    break;
                                } else {
                                    if (30 > i6 || i6 >= 45) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphHappinessHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case -1617042330:
                        if (!str.equals(Constants.COURSE_DEPRESSION)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphDepressionTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 13) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if (z24) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphDepressionLowText));
                                break;
                            } else {
                                if (13 <= i6 && i6 < 28) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                if (z25) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphDepressionModerateText));
                                    break;
                                } else {
                                    if (28 > i6 || i6 >= 41) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphDepressionHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case -891989580:
                        if (!str.equals(Constants.COURSE_STRESS)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphStressTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 15) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z26) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphStressLowText));
                                break;
                            } else {
                                if (15 <= i6 && i6 < 30) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if (z27) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphStressModerateText));
                                    break;
                                } else {
                                    if (30 > i6 || i6 >= 45) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphStressHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 92960775:
                        if (!str.equals(Constants.COURSE_ANGER)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphAngerTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 15) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            if (z28) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAngerLowText));
                                break;
                            } else {
                                if (15 <= i6 && i6 < 30) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (z29) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAngerModerateText));
                                    break;
                                } else {
                                    if (30 > i6 || i6 >= 45) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAngerHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 109522647:
                        if (!str.equals(Constants.COURSE_SLEEP)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphSleepTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphSleepDialogCTA));
                            if (i6 >= 0 && i6 < 12) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            if (z30) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphSleepLowText));
                                break;
                            } else {
                                if (12 <= i6 && i6 < 25) {
                                    z31 = true;
                                } else {
                                    z31 = false;
                                }
                                if (z31) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphSleepModerateText));
                                    break;
                                } else {
                                    if (25 > i6 || i6 >= 37) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphSleepHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 113319009:
                        if (!str.equals(Constants.COURSE_WORRY)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphAnxietyTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 15) {
                                z32 = true;
                            } else {
                                z32 = false;
                            }
                            if (z32) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAnxietyLowText));
                                break;
                            } else {
                                if (15 <= i6 && i6 < 30) {
                                    z33 = true;
                                } else {
                                    z33 = false;
                                }
                                if (z33) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAnxietyModerateText));
                                    break;
                                } else {
                                    if (30 > i6 || i6 >= 45) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAnxietyHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            } else {
                String str2 = this.E;
                switch (str2.hashCode()) {
                    case -2114782937:
                        if (!str2.equals(Constants.COURSE_HAPPINESS)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphHappinessTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphHappinessDialogCTA));
                            if (i6 >= 0 && i6 < 17) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphHappinessLowText));
                                break;
                            } else {
                                if (17 <= i6 && i6 < 36) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphHappinessModerateText));
                                    break;
                                } else {
                                    if (36 > i6 || i6 >= 53) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphHappinessHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case -1617042330:
                        if (!str2.equals(Constants.COURSE_DEPRESSION)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphDepressionTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 17) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphDepressionLowText));
                                break;
                            } else {
                                if (17 <= i6 && i6 < 36) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphDepressionModerateText));
                                    break;
                                } else {
                                    if (36 > i6 || i6 >= 53) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphDepressionHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case -891989580:
                        if (!str2.equals(Constants.COURSE_STRESS)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphStressTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 15) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphStressLowText));
                                break;
                            } else {
                                if (15 <= i6 && i6 < 30) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphStressModerateText));
                                    break;
                                } else {
                                    if (30 > i6 || i6 >= 45) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphStressHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 92960775:
                        if (!str2.equals(Constants.COURSE_ANGER)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphAngerTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 13) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAngerLowText));
                                break;
                            } else {
                                if (13 <= i6 && i6 < 28) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAngerModerateText));
                                    break;
                                } else {
                                    if (28 > i6 || i6 >= 41) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAngerHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 109522647:
                        if (!str2.equals(Constants.COURSE_SLEEP)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphSleepTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphSleepDialogCTA));
                            if (i6 >= 0 && i6 < 17) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphSleepLowText));
                                break;
                            } else {
                                if (17 <= i6 && i6 < 36) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphSleepModerateText));
                                    break;
                                } else {
                                    if (36 > i6 || i6 >= 53) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphSleepHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 113319009:
                        if (!str2.equals(Constants.COURSE_WORRY)) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.titleAssessmentResult)).setText(getString(R.string.assessmentResultGraphAnxietyTitle));
                            ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setText(getString(R.string.assessmentResultGraphDialogCTA));
                            if (i6 >= 0 && i6 < 17) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if (z20) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAnxietyLowText));
                                break;
                            } else {
                                if (17 <= i6 && i6 < 36) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (z21) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAnxietyModerateText));
                                    break;
                                } else {
                                    if (36 > i6 || i6 >= 53) {
                                        z34 = false;
                                    }
                                    if (z34) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.assessmentText)).setText(getString(R.string.assessmentResultGraphAnxietyHighText));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20128u, "Error setting texts on Graph Fragment", e10);
        }
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
        return inflater.inflate(R.layout.fragment_initial_assessment_graph, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.H.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:3:0x000e, B:5:0x0041, B:7:0x004f, B:12:0x006e, B:14:0x0093, B:16:0x00ac, B:18:0x00c5, B:20:0x00e6, B:28:0x0100, B:29:0x0127, B:31:0x012d, B:34:0x013b, B:35:0x0146, B:36:0x014e, B:38:0x0165, B:39:0x0182, B:41:0x0188, B:44:0x01a2, B:46:0x01af, B:49:0x01d6, B:47:0x01c1, B:48:0x01cc, B:51:0x01ef, B:54:0x021c, B:56:0x0230, B:58:0x0257, B:60:0x028a, B:62:0x0294, B:64:0x029e, B:65:0x02d9, B:66:0x02dc, B:67:0x02dd, B:68:0x02e0, B:69:0x02e1, B:70:0x02e4, B:71:0x02e5, B:72:0x02e8, B:73:0x02e9, B:74:0x02ec, B:75:0x02ed, B:76:0x02f0, B:50:0x01e3, B:15:0x009f), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:3:0x000e, B:5:0x0041, B:7:0x004f, B:12:0x006e, B:14:0x0093, B:16:0x00ac, B:18:0x00c5, B:20:0x00e6, B:28:0x0100, B:29:0x0127, B:31:0x012d, B:34:0x013b, B:35:0x0146, B:36:0x014e, B:38:0x0165, B:39:0x0182, B:41:0x0188, B:44:0x01a2, B:46:0x01af, B:49:0x01d6, B:47:0x01c1, B:48:0x01cc, B:51:0x01ef, B:54:0x021c, B:56:0x0230, B:58:0x0257, B:60:0x028a, B:62:0x0294, B:64:0x029e, B:65:0x02d9, B:66:0x02dc, B:67:0x02dd, B:68:0x02e0, B:69:0x02e1, B:70:0x02e4, B:71:0x02e5, B:72:0x02e8, B:73:0x02e9, B:74:0x02ec, B:75:0x02ed, B:76:0x02f0, B:50:0x01e3, B:15:0x009f), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5 A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:3:0x000e, B:5:0x0041, B:7:0x004f, B:12:0x006e, B:14:0x0093, B:16:0x00ac, B:18:0x00c5, B:20:0x00e6, B:28:0x0100, B:29:0x0127, B:31:0x012d, B:34:0x013b, B:35:0x0146, B:36:0x014e, B:38:0x0165, B:39:0x0182, B:41:0x0188, B:44:0x01a2, B:46:0x01af, B:49:0x01d6, B:47:0x01c1, B:48:0x01cc, B:51:0x01ef, B:54:0x021c, B:56:0x0230, B:58:0x0257, B:60:0x028a, B:62:0x0294, B:64:0x029e, B:65:0x02d9, B:66:0x02dc, B:67:0x02dd, B:68:0x02e0, B:69:0x02e1, B:70:0x02e4, B:71:0x02e5, B:72:0x02e8, B:73:0x02e9, B:74:0x02ec, B:75:0x02ed, B:76:0x02f0, B:50:0x01e3, B:15:0x009f), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165 A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:3:0x000e, B:5:0x0041, B:7:0x004f, B:12:0x006e, B:14:0x0093, B:16:0x00ac, B:18:0x00c5, B:20:0x00e6, B:28:0x0100, B:29:0x0127, B:31:0x012d, B:34:0x013b, B:35:0x0146, B:36:0x014e, B:38:0x0165, B:39:0x0182, B:41:0x0188, B:44:0x01a2, B:46:0x01af, B:49:0x01d6, B:47:0x01c1, B:48:0x01cc, B:51:0x01ef, B:54:0x021c, B:56:0x0230, B:58:0x0257, B:60:0x028a, B:62:0x0294, B:64:0x029e, B:65:0x02d9, B:66:0x02dc, B:67:0x02dd, B:68:0x02e0, B:69:0x02e1, B:70:0x02e4, B:71:0x02e5, B:72:0x02e8, B:73:0x02e9, B:74:0x02ec, B:75:0x02ed, B:76:0x02f0, B:50:0x01e3, B:15:0x009f), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3 A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:3:0x000e, B:5:0x0041, B:7:0x004f, B:12:0x006e, B:14:0x0093, B:16:0x00ac, B:18:0x00c5, B:20:0x00e6, B:28:0x0100, B:29:0x0127, B:31:0x012d, B:34:0x013b, B:35:0x0146, B:36:0x014e, B:38:0x0165, B:39:0x0182, B:41:0x0188, B:44:0x01a2, B:46:0x01af, B:49:0x01d6, B:47:0x01c1, B:48:0x01cc, B:51:0x01ef, B:54:0x021c, B:56:0x0230, B:58:0x0257, B:60:0x028a, B:62:0x0294, B:64:0x029e, B:65:0x02d9, B:66:0x02dc, B:67:0x02dd, B:68:0x02e0, B:69:0x02e1, B:70:0x02e4, B:71:0x02e5, B:72:0x02e8, B:73:0x02e9, B:74:0x02ec, B:75:0x02ed, B:76:0x02f0, B:50:0x01e3, B:15:0x009f), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021c A[Catch: Exception -> 0x02f1, TRY_ENTER, TryCatch #0 {Exception -> 0x02f1, blocks: (B:3:0x000e, B:5:0x0041, B:7:0x004f, B:12:0x006e, B:14:0x0093, B:16:0x00ac, B:18:0x00c5, B:20:0x00e6, B:28:0x0100, B:29:0x0127, B:31:0x012d, B:34:0x013b, B:35:0x0146, B:36:0x014e, B:38:0x0165, B:39:0x0182, B:41:0x0188, B:44:0x01a2, B:46:0x01af, B:49:0x01d6, B:47:0x01c1, B:48:0x01cc, B:51:0x01ef, B:54:0x021c, B:56:0x0230, B:58:0x0257, B:60:0x028a, B:62:0x0294, B:64:0x029e, B:65:0x02d9, B:66:0x02dc, B:67:0x02dd, B:68:0x02e0, B:69:0x02e1, B:70:0x02e4, B:71:0x02e5, B:72:0x02e8, B:73:0x02e9, B:74:0x02ec, B:75:0x02ed, B:76:0x02f0, B:50:0x01e3, B:15:0x009f), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ed A[Catch: Exception -> 0x02f1, TryCatch #0 {Exception -> 0x02f1, blocks: (B:3:0x000e, B:5:0x0041, B:7:0x004f, B:12:0x006e, B:14:0x0093, B:16:0x00ac, B:18:0x00c5, B:20:0x00e6, B:28:0x0100, B:29:0x0127, B:31:0x012d, B:34:0x013b, B:35:0x0146, B:36:0x014e, B:38:0x0165, B:39:0x0182, B:41:0x0188, B:44:0x01a2, B:46:0x01af, B:49:0x01d6, B:47:0x01c1, B:48:0x01cc, B:51:0x01ef, B:54:0x021c, B:56:0x0230, B:58:0x0257, B:60:0x028a, B:62:0x0294, B:64:0x029e, B:65:0x02d9, B:66:0x02dc, B:67:0x02dd, B:68:0x02e0, B:69:0x02e1, B:70:0x02e4, B:71:0x02e5, B:72:0x02e8, B:73:0x02e9, B:74:0x02ec, B:75:0x02ed, B:76:0x02f0, B:50:0x01e3, B:15:0x009f), top: B:80:0x000e }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        androidx.fragment.app.p activity;
        int v02;
        AssessmentResponseCategory assessmentResponseCategory;
        RadarChart radarChart;
        int i10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView assessmentGraphParent = (ScrollView) _$_findCachedViewById(R.id.assessmentGraphParent);
            kotlin.jvm.internal.i.f(assessmentGraphParent, "assessmentGraphParent");
            insetsUtils.addStatusBarHeight(assessmentGraphParent);
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnContinue);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            InitialAssessmentActivity initialAssessmentActivity = (InitialAssessmentActivity) activity2;
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (((InitialAssessmentActivity) activity3).J <= -1) {
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (((InitialAssessmentActivity) activity4).K != 2) {
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    if (((InitialAssessmentActivity) activity5).getIntent().getIntExtra("daymodel_position", -1) != 28) {
                        i6 = R.string.assessmentGraphButtonTwo;
                        robertoButton.setText(getString(i6));
                        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                        this.E = currentCourseName;
                        activity = getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (((InitialAssessmentActivity) activity).J <= -1) {
                            androidx.fragment.app.p activity6 = getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            v02 = ((InitialAssessmentActivity) activity6).J;
                        } else {
                            androidx.fragment.app.p activity7 = getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            v02 = ((InitialAssessmentActivity) activity7).v0();
                        }
                        this.G = v02;
                        M(v02);
                        if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                            androidx.fragment.app.p activity8 = getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            if (((InitialAssessmentActivity) activity8).K > 0) {
                                androidx.fragment.app.p activity9 = getActivity();
                                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                int i11 = ((InitialAssessmentActivity) activity9).L;
                                if (i11 != 15) {
                                    if (i11 != 30) {
                                        i10 = -1;
                                    } else {
                                        i10 = 1;
                                    }
                                } else {
                                    i10 = 0;
                                }
                                if (i10 != -1) {
                                    courseById.getAssessments().get(i10).getSymptom().getScore();
                                    Iterator<AssessmentResponse> it = courseById.getAssessments().get(i10).getSymptom().getValues().iterator();
                                    while (it.hasNext()) {
                                        AssessmentResponse next = it.next();
                                        Integer value = next.getValue();
                                        ArrayList<Integer> arrayList = this.F;
                                        if (value != null) {
                                            Integer value2 = next.getValue();
                                            kotlin.jvm.internal.i.d(value2);
                                            arrayList.add(value2);
                                        } else {
                                            arrayList.add(0);
                                        }
                                    }
                                }
                            }
                        }
                        androidx.fragment.app.p activity10 = getActivity();
                        kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        assessmentResponseCategory = ((InitialAssessmentActivity) activity10).D;
                        this.f20133z = assessmentResponseCategory;
                        if (assessmentResponseCategory.getValues().size() <= 0) {
                            String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                            kotlin.jvm.internal.i.f(currentCourseName2, "getInstance().user.currentCourseName");
                            HashMap L = hc.d.L(currentCourseName2);
                            Iterator<AssessmentResponse> it2 = this.f20133z.getValues().iterator();
                            while (it2.hasNext()) {
                                AssessmentResponse next2 = it2.next();
                                boolean b10 = kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION);
                                ArrayList<String> arrayList2 = this.A;
                                if (b10) {
                                    String symptom = next2.getSymptom();
                                    kotlin.jvm.internal.i.d(symptom);
                                    if (L.containsKey(symptom)) {
                                        String symptom2 = next2.getSymptom();
                                        kotlin.jvm.internal.i.d(symptom2);
                                        Object obj = L.get(symptom2);
                                        kotlin.jvm.internal.i.d(obj);
                                        arrayList2.add(obj);
                                    } else {
                                        String symptom3 = next2.getSymptom();
                                        kotlin.jvm.internal.i.d(symptom3);
                                        arrayList2.add(symptom3);
                                    }
                                } else {
                                    String symptom4 = next2.getSymptom();
                                    kotlin.jvm.internal.i.d(symptom4);
                                    arrayList2.add(symptom4);
                                }
                                ArrayList<Integer> arrayList3 = this.B;
                                Integer value3 = next2.getValue();
                                kotlin.jvm.internal.i.d(value3);
                                arrayList3.add(value3);
                            }
                        } else {
                            androidx.fragment.app.p activity11 = getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity11).n0();
                        }
                        View findViewById = view.findViewById(R.id.assessmentRadarChart);
                        kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.assessmentRadarChart)");
                        this.f20129v = (RadarChart) findViewById;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i12 = displayMetrics.widthPixels;
                        radarChart = this.f20129v;
                        if (radarChart == null) {
                            radarChart.getLayoutParams().height = (int) (i12 - (50 * displayMetrics.density));
                            RadarChart radarChart2 = this.f20129v;
                            if (radarChart2 != null) {
                                q6.h xAxis = radarChart2.getXAxis();
                                xAxis.getClass();
                                xAxis.f29199b = y6.f.c(0.0f);
                                xAxis.f29200c = y6.f.c(0.0f);
                                xAxis.f29201d = y6.f.c(8.0f);
                                xAxis.f = new a(this);
                                RadarChart radarChart3 = this.f20129v;
                                if (radarChart3 != null) {
                                    q6.i yAxis = radarChart3.getYAxis();
                                    yAxis.f29195x = true;
                                    yAxis.A = 0.0f;
                                    yAxis.B = Math.abs(yAxis.f29197z - 0.0f);
                                    yAxis.f29196y = true;
                                    yAxis.f29197z = 4.0f;
                                    yAxis.B = Math.abs(4.0f - yAxis.A);
                                    yAxis.f29201d = y6.f.c(12.0f);
                                    yAxis.f29186n = 5;
                                    yAxis.f29189q = true;
                                    yAxis.f29191t = false;
                                    RadarChart radarChart4 = this.f20129v;
                                    if (radarChart4 != null) {
                                        radarChart4.getLegend().f29198a = false;
                                        RadarChart radarChart5 = this.f20129v;
                                        if (radarChart5 != null) {
                                            radarChart5.getDescription().f29198a = false;
                                            RadarChart radarChart6 = this.f20129v;
                                            if (radarChart6 != null) {
                                                radarChart6.e();
                                                ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).getPaintFlags() | 8);
                                                ((RobertoTextView) _$_findCachedViewById(R.id.learnMoreGraphCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.a1

                                                    /* renamed from: v  reason: collision with root package name */
                                                    public final /* synthetic */ b1 f20123v;

                                                    {
                                                        this.f20123v = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        Object obj2;
                                                        HashMap<String, Object> appConfig;
                                                        int i13 = r2;
                                                        b1 this$0 = this.f20123v;
                                                        switch (i13) {
                                                            case 0:
                                                                int i14 = b1.I;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                androidx.fragment.app.p activity12 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                if (((InitialAssessmentActivity) activity12).J == -1) {
                                                                    Bundle bundle2 = new Bundle();
                                                                    defpackage.d.m(bundle2, "course");
                                                                    bundle2.putInt("score", this$0.G);
                                                                    bundle2.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                                                                    gk.a.b(bundle2, "assessment_graph_secondary_cta_click");
                                                                }
                                                                try {
                                                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_initial_assessment_graph, this$0.requireContext(), R.style.Theme_Dialog_Fullscreen);
                                                                    styledDialog.findViewById(R.id.btnGraphDialogBack).setOnClickListener(new dk.n(styledDialog, 6));
                                                                    styledDialog.findViewById(R.id.btnGraphDialogDone).setOnClickListener(new dk.n(styledDialog, 7));
                                                                    Window window = styledDialog.getWindow();
                                                                    if (window != null) {
                                                                        window.setLayout(-1, -1);
                                                                    }
                                                                    this$0.K(styledDialog);
                                                                    styledDialog.show();
                                                                    return;
                                                                } catch (Exception e10) {
                                                                    LogHelper.INSTANCE.e(this$0.f20128u, e10);
                                                                    return;
                                                                }
                                                            default:
                                                                int i15 = b1.I;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                androidx.fragment.app.p activity13 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                if (((InitialAssessmentActivity) activity13).J > -1) {
                                                                    if (defpackage.d.q(Constants.USER_VERSION)) {
                                                                        int size = FirebasePersistence.getInstance().getCourseByName(FirebasePersistence.getInstance().getUser().getCurrentCourseName()).getPlanV3().size();
                                                                        androidx.fragment.app.p activity14 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                        if (size == ((InitialAssessmentActivity) activity14).L + 1) {
                                                                            androidx.fragment.app.p activity15 = this$0.getActivity();
                                                                            kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                            if (((InitialAssessmentActivity) activity15).L < 30) {
                                                                                androidx.fragment.app.p activity16 = this$0.getActivity();
                                                                                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                if (((InitialAssessmentActivity) activity16).L < 30) {
                                                                                    androidx.fragment.app.p activity17 = this$0.getActivity();
                                                                                    kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                    ((InitialAssessmentActivity) activity17).P = true;
                                                                                    androidx.fragment.app.p activity18 = this$0.getActivity();
                                                                                    kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                    ((InitialAssessmentActivity) activity18).t0();
                                                                                    return;
                                                                                }
                                                                                androidx.fragment.app.p activity19 = this$0.getActivity();
                                                                                kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                ((InitialAssessmentActivity) activity19).t0();
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                    androidx.fragment.app.p activity20 = this$0.getActivity();
                                                                    kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                    ((InitialAssessmentActivity) activity20).n0();
                                                                    return;
                                                                }
                                                                Bundle bundle3 = new Bundle();
                                                                defpackage.d.m(bundle3, "course");
                                                                bundle3.putInt("score", this$0.G);
                                                                bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                                androidx.fragment.app.p activity21 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                int i16 = ((InitialAssessmentActivity) activity21).L;
                                                                int i17 = 28;
                                                                if (i16 != 0) {
                                                                    if (i16 != 15) {
                                                                        bundle3.putInt("day", 28);
                                                                    } else {
                                                                        bundle3.putInt("day", 15);
                                                                    }
                                                                } else {
                                                                    bundle3.putInt("day", 0);
                                                                }
                                                                bundle3.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                                                                gk.a.b(bundle3, "assessment_graph_click");
                                                                if (new gk.e().a()) {
                                                                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                                                                    Context applicationContext = this$0.requireActivity().getApplicationContext();
                                                                    HashMap hashMap = new HashMap();
                                                                    hashMap.put("score", Integer.valueOf(this$0.G));
                                                                    androidx.fragment.app.p activity22 = this$0.getActivity();
                                                                    kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                    int i18 = ((InitialAssessmentActivity) activity22).L;
                                                                    if (i18 != 0) {
                                                                        if (i18 != 15) {
                                                                            if (i18 != 30) {
                                                                                i17 = -1;
                                                                            }
                                                                        } else {
                                                                            i17 = 15;
                                                                        }
                                                                    } else {
                                                                        i17 = 0;
                                                                    }
                                                                    hashMap.put("day", Integer.valueOf(i17));
                                                                    hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                                    hashMap.put("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                                    User user = FirebasePersistence.getInstance().getUser();
                                                                    if (user != null && (appConfig = user.getAppConfig()) != null) {
                                                                        obj2 = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
                                                                    } else {
                                                                        obj2 = null;
                                                                    }
                                                                    String str = (String) obj2;
                                                                    if (str == null) {
                                                                        str = "";
                                                                    }
                                                                    hashMap.put("variant", str);
                                                                    hs.k kVar = hs.k.f19476a;
                                                                    appsFlyerLib.logEvent(applicationContext, "assessment_result_click", hashMap);
                                                                }
                                                                androidx.fragment.app.p activity23 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                ((InitialAssessmentActivity) activity23).t0();
                                                                return;
                                                        }
                                                    }
                                                });
                                                J();
                                                ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.a1

                                                    /* renamed from: v  reason: collision with root package name */
                                                    public final /* synthetic */ b1 f20123v;

                                                    {
                                                        this.f20123v = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        Object obj2;
                                                        HashMap<String, Object> appConfig;
                                                        int i13 = r2;
                                                        b1 this$0 = this.f20123v;
                                                        switch (i13) {
                                                            case 0:
                                                                int i14 = b1.I;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                androidx.fragment.app.p activity12 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                if (((InitialAssessmentActivity) activity12).J == -1) {
                                                                    Bundle bundle2 = new Bundle();
                                                                    defpackage.d.m(bundle2, "course");
                                                                    bundle2.putInt("score", this$0.G);
                                                                    bundle2.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                                                                    gk.a.b(bundle2, "assessment_graph_secondary_cta_click");
                                                                }
                                                                try {
                                                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_initial_assessment_graph, this$0.requireContext(), R.style.Theme_Dialog_Fullscreen);
                                                                    styledDialog.findViewById(R.id.btnGraphDialogBack).setOnClickListener(new dk.n(styledDialog, 6));
                                                                    styledDialog.findViewById(R.id.btnGraphDialogDone).setOnClickListener(new dk.n(styledDialog, 7));
                                                                    Window window = styledDialog.getWindow();
                                                                    if (window != null) {
                                                                        window.setLayout(-1, -1);
                                                                    }
                                                                    this$0.K(styledDialog);
                                                                    styledDialog.show();
                                                                    return;
                                                                } catch (Exception e10) {
                                                                    LogHelper.INSTANCE.e(this$0.f20128u, e10);
                                                                    return;
                                                                }
                                                            default:
                                                                int i15 = b1.I;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                androidx.fragment.app.p activity13 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                if (((InitialAssessmentActivity) activity13).J > -1) {
                                                                    if (defpackage.d.q(Constants.USER_VERSION)) {
                                                                        int size = FirebasePersistence.getInstance().getCourseByName(FirebasePersistence.getInstance().getUser().getCurrentCourseName()).getPlanV3().size();
                                                                        androidx.fragment.app.p activity14 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                        if (size == ((InitialAssessmentActivity) activity14).L + 1) {
                                                                            androidx.fragment.app.p activity15 = this$0.getActivity();
                                                                            kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                            if (((InitialAssessmentActivity) activity15).L < 30) {
                                                                                androidx.fragment.app.p activity16 = this$0.getActivity();
                                                                                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                if (((InitialAssessmentActivity) activity16).L < 30) {
                                                                                    androidx.fragment.app.p activity17 = this$0.getActivity();
                                                                                    kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                    ((InitialAssessmentActivity) activity17).P = true;
                                                                                    androidx.fragment.app.p activity18 = this$0.getActivity();
                                                                                    kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                    ((InitialAssessmentActivity) activity18).t0();
                                                                                    return;
                                                                                }
                                                                                androidx.fragment.app.p activity19 = this$0.getActivity();
                                                                                kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                                ((InitialAssessmentActivity) activity19).t0();
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                    androidx.fragment.app.p activity20 = this$0.getActivity();
                                                                    kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                    ((InitialAssessmentActivity) activity20).n0();
                                                                    return;
                                                                }
                                                                Bundle bundle3 = new Bundle();
                                                                defpackage.d.m(bundle3, "course");
                                                                bundle3.putInt("score", this$0.G);
                                                                bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                                androidx.fragment.app.p activity21 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                int i16 = ((InitialAssessmentActivity) activity21).L;
                                                                int i17 = 28;
                                                                if (i16 != 0) {
                                                                    if (i16 != 15) {
                                                                        bundle3.putInt("day", 28);
                                                                    } else {
                                                                        bundle3.putInt("day", 15);
                                                                    }
                                                                } else {
                                                                    bundle3.putInt("day", 0);
                                                                }
                                                                bundle3.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                                                                gk.a.b(bundle3, "assessment_graph_click");
                                                                if (new gk.e().a()) {
                                                                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                                                                    Context applicationContext = this$0.requireActivity().getApplicationContext();
                                                                    HashMap hashMap = new HashMap();
                                                                    hashMap.put("score", Integer.valueOf(this$0.G));
                                                                    androidx.fragment.app.p activity22 = this$0.getActivity();
                                                                    kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                    int i18 = ((InitialAssessmentActivity) activity22).L;
                                                                    if (i18 != 0) {
                                                                        if (i18 != 15) {
                                                                            if (i18 != 30) {
                                                                                i17 = -1;
                                                                            }
                                                                        } else {
                                                                            i17 = 15;
                                                                        }
                                                                    } else {
                                                                        i17 = 0;
                                                                    }
                                                                    hashMap.put("day", Integer.valueOf(i17));
                                                                    hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                                    hashMap.put("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                                    User user = FirebasePersistence.getInstance().getUser();
                                                                    if (user != null && (appConfig = user.getAppConfig()) != null) {
                                                                        obj2 = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
                                                                    } else {
                                                                        obj2 = null;
                                                                    }
                                                                    String str = (String) obj2;
                                                                    if (str == null) {
                                                                        str = "";
                                                                    }
                                                                    hashMap.put("variant", str);
                                                                    hs.k kVar = hs.k.f19476a;
                                                                    appsFlyerLib.logEvent(applicationContext, "assessment_result_click", hashMap);
                                                                }
                                                                androidx.fragment.app.p activity23 = this$0.getActivity();
                                                                kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                                                ((InitialAssessmentActivity) activity23).t0();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("radarChart");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.i.q("radarChart");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("radarChart");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("radarChart");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("radarChart");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("radarChart");
                        throw null;
                    }
                }
            }
            i6 = R.string.assessmentGraphButton;
            robertoButton.setText(getString(i6));
            String currentCourseName3 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            kotlin.jvm.internal.i.f(currentCourseName3, "getInstance().user.currentCourseName");
            this.E = currentCourseName3;
            activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (((InitialAssessmentActivity) activity).J <= -1) {
            }
            this.G = v02;
            M(v02);
            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
            }
            androidx.fragment.app.p activity102 = getActivity();
            kotlin.jvm.internal.i.e(activity102, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            assessmentResponseCategory = ((InitialAssessmentActivity) activity102).D;
            this.f20133z = assessmentResponseCategory;
            if (assessmentResponseCategory.getValues().size() <= 0) {
            }
            View findViewById2 = view.findViewById(R.id.assessmentRadarChart);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.assessmentRadarChart)");
            this.f20129v = (RadarChart) findViewById2;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            int i122 = displayMetrics2.widthPixels;
            radarChart = this.f20129v;
            if (radarChart == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20128u, e10);
        }
    }
}
