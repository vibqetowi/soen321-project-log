package com.theinnerhour.b2b.components.dashboard.experiment.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.h;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.SuggestedActivityDetailsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import is.p;
import is.u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import jl.b0;
import jl.x1;
import jl.y1;
import jl.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e0;
import ss.l;
import ss.r;
import t0.d0;
import t0.j0;
import t0.u0;
import ta.v;
import yp.i;
/* compiled from: SuggestedActivityDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/activity/SuggestedActivityDetailsActivity;", "Lrr/a;", "Lcom/google/android/material/chip/ChipGroup$d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SuggestedActivityDetailsActivity extends rr.a implements ChipGroup.d {
    public static final /* synthetic */ int Q = 0;
    public x1 A;
    public SuggestedActivityModel B;
    public String C;
    public int D;
    public ArrayList<hs.f<String, String>> E;
    public String F;
    public SuggestedActivityModel G;
    public HashMap<String, String> H;
    public int I;
    public boolean J;
    public Integer K;
    public final hc.d L;
    public final boolean M;
    public final androidx.activity.result.c<Intent> N;
    public final androidx.activity.result.c<Intent> O;
    public i P;

    /* renamed from: w  reason: collision with root package name */
    public final String f10842w;

    /* renamed from: x  reason: collision with root package name */
    public String f10843x;

    /* renamed from: y  reason: collision with root package name */
    public Course f10844y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f10845z;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            A a10 = ((hs.f) t10).f19464u;
            SuggestedActivityDetailsActivity suggestedActivityDetailsActivity = SuggestedActivityDetailsActivity.this;
            return sp.b.g(Boolean.valueOf(kotlin.jvm.internal.i.b(a10, suggestedActivityDetailsActivity.F)), Boolean.valueOf(kotlin.jvm.internal.i.b(((hs.f) t3).f19464u, suggestedActivityDetailsActivity.F)));
        }
    }

    /* compiled from: SuggestedActivityDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<Integer, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            i iVar;
            RecyclerView recyclerView;
            RecyclerView.e adapter;
            Integer it = num;
            if ((it == null || it.intValue() != -1) && (iVar = SuggestedActivityDetailsActivity.this.P) != null && (recyclerView = iVar.f38815k) != null && (adapter = recyclerView.getAdapter()) != null) {
                kotlin.jvm.internal.i.f(it, "it");
                adapter.j(it.intValue());
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SuggestedActivityDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
                SuggestedActivityDetailsActivity.this.I++;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SuggestedActivityDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements l<HashMap<String, String>, hs.k> {
        public d() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[Catch: Exception -> 0x0102, TryCatch #1 {Exception -> 0x0102, blocks: (B:5:0x000a, B:7:0x0013, B:9:0x0019, B:11:0x001f, B:15:0x002a, B:22:0x0038, B:23:0x003c, B:25:0x0042, B:29:0x0055, B:31:0x0059, B:33:0x005d, B:36:0x0064, B:37:0x0069, B:39:0x006f, B:41:0x007b, B:44:0x0080, B:45:0x0083, B:47:0x0085, B:49:0x0089, B:51:0x0093, B:53:0x0099, B:78:0x00d5, B:79:0x00da, B:81:0x00e0, B:83:0x00e8, B:85:0x00ec, B:87:0x00f0, B:91:0x00f8, B:90:0x00f5, B:54:0x00a7, B:56:0x00ab, B:62:0x00b7, B:64:0x00bb, B:69:0x00c5, B:71:0x00c9, B:75:0x00d0, B:68:0x00c2, B:61:0x00b4), top: B:99:0x000a, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0089 A[Catch: Exception -> 0x0102, TryCatch #1 {Exception -> 0x0102, blocks: (B:5:0x000a, B:7:0x0013, B:9:0x0019, B:11:0x001f, B:15:0x002a, B:22:0x0038, B:23:0x003c, B:25:0x0042, B:29:0x0055, B:31:0x0059, B:33:0x005d, B:36:0x0064, B:37:0x0069, B:39:0x006f, B:41:0x007b, B:44:0x0080, B:45:0x0083, B:47:0x0085, B:49:0x0089, B:51:0x0093, B:53:0x0099, B:78:0x00d5, B:79:0x00da, B:81:0x00e0, B:83:0x00e8, B:85:0x00ec, B:87:0x00f0, B:91:0x00f8, B:90:0x00f5, B:54:0x00a7, B:56:0x00ab, B:62:0x00b7, B:64:0x00bb, B:69:0x00c5, B:71:0x00c9, B:75:0x00d0, B:68:0x00c2, B:61:0x00b4), top: B:99:0x000a, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00e0 A[Catch: Exception -> 0x0102, TryCatch #1 {Exception -> 0x0102, blocks: (B:5:0x000a, B:7:0x0013, B:9:0x0019, B:11:0x001f, B:15:0x002a, B:22:0x0038, B:23:0x003c, B:25:0x0042, B:29:0x0055, B:31:0x0059, B:33:0x005d, B:36:0x0064, B:37:0x0069, B:39:0x006f, B:41:0x007b, B:44:0x0080, B:45:0x0083, B:47:0x0085, B:49:0x0089, B:51:0x0093, B:53:0x0099, B:78:0x00d5, B:79:0x00da, B:81:0x00e0, B:83:0x00e8, B:85:0x00ec, B:87:0x00f0, B:91:0x00f8, B:90:0x00f5, B:54:0x00a7, B:56:0x00ab, B:62:0x00b7, B:64:0x00bb, B:69:0x00c5, B:71:0x00c9, B:75:0x00d0, B:68:0x00c2, B:61:0x00b4), top: B:99:0x000a, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00ec A[Catch: Exception -> 0x0102, TryCatch #1 {Exception -> 0x0102, blocks: (B:5:0x000a, B:7:0x0013, B:9:0x0019, B:11:0x001f, B:15:0x002a, B:22:0x0038, B:23:0x003c, B:25:0x0042, B:29:0x0055, B:31:0x0059, B:33:0x005d, B:36:0x0064, B:37:0x0069, B:39:0x006f, B:41:0x007b, B:44:0x0080, B:45:0x0083, B:47:0x0085, B:49:0x0089, B:51:0x0093, B:53:0x0099, B:78:0x00d5, B:79:0x00da, B:81:0x00e0, B:83:0x00e8, B:85:0x00ec, B:87:0x00f0, B:91:0x00f8, B:90:0x00f5, B:54:0x00a7, B:56:0x00ab, B:62:0x00b7, B:64:0x00bb, B:69:0x00c5, B:71:0x00c9, B:75:0x00d0, B:68:0x00c2, B:61:0x00b4), top: B:99:0x000a, inners: #0 }] */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(HashMap<String, String> hashMap) {
            ArrayList<SuggestedActivityModel> arrayList;
            String str;
            boolean z10;
            int i6;
            Intent intent;
            boolean z11;
            String str2;
            LinearLayout linearLayout;
            ShimmerFrameLayout shimmerFrameLayout;
            ConstraintLayout constraintLayout;
            SuggestedActivityModel suggestedActivityModel;
            Object obj;
            HashMap<String, String> hashMap2 = hashMap;
            if (hashMap2 != null) {
                SuggestedActivityDetailsActivity suggestedActivityDetailsActivity = SuggestedActivityDetailsActivity.this;
                suggestedActivityDetailsActivity.H = hashMap2;
                String str3 = suggestedActivityDetailsActivity.f10842w;
                try {
                    hs.f<ArrayList<SuggestedActivityModel>, HashMap<String, ArrayList<String>>> v02 = suggestedActivityDetailsActivity.v0();
                    Course course = suggestedActivityDetailsActivity.f10844y;
                    ConstraintLayout constraintLayout2 = null;
                    if (course != null) {
                        arrayList = course.getPlanSuggested();
                    } else {
                        arrayList = null;
                    }
                    Intent intent2 = suggestedActivityDetailsActivity.getIntent();
                    if (intent2 != null) {
                        str = intent2.getStringExtra("highlightedActivityId");
                    } else {
                        str = null;
                    }
                    if (str != null && !n.B0(str)) {
                        z10 = false;
                        if (!z10) {
                            if (arrayList != null) {
                                Iterator<T> it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        if (kotlin.jvm.internal.i.b(((SuggestedActivityModel) obj).getContent_id(), str)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                suggestedActivityModel = (SuggestedActivityModel) obj;
                            } else {
                                suggestedActivityModel = null;
                            }
                            suggestedActivityDetailsActivity.G = suggestedActivityModel;
                        }
                        if (arrayList != null && !arrayList.isEmpty()) {
                            i6 = 0;
                            for (SuggestedActivityModel suggestedActivityModel2 : arrayList) {
                                if (suggestedActivityModel2.isCompleted() && (i6 = i6 + 1) < 0) {
                                    ca.a.s1();
                                    throw null;
                                }
                            }
                            suggestedActivityDetailsActivity.I = i6;
                            if (arrayList != null) {
                                ArrayList<hs.f<String, String>> w02 = suggestedActivityDetailsActivity.w0(arrayList);
                                suggestedActivityDetailsActivity.E = w02;
                                SuggestedActivityModel suggestedActivityModel3 = suggestedActivityDetailsActivity.G;
                                if (suggestedActivityModel3 != null) {
                                    str2 = suggestedActivityModel3.getSymptom();
                                } else {
                                    str2 = null;
                                }
                                suggestedActivityDetailsActivity.x0(str2, w02);
                                suggestedActivityDetailsActivity.y0(arrayList, v02.f19464u, v02.f19465v);
                                try {
                                    i iVar = suggestedActivityDetailsActivity.P;
                                    if (iVar != null) {
                                        linearLayout = iVar.f38813i;
                                    } else {
                                        linearLayout = null;
                                    }
                                    if (linearLayout != null) {
                                        linearLayout.setVisibility(8);
                                    }
                                    i iVar2 = suggestedActivityDetailsActivity.P;
                                    if (iVar2 != null) {
                                        shimmerFrameLayout = iVar2.f38816l;
                                    } else {
                                        shimmerFrameLayout = null;
                                    }
                                    if (shimmerFrameLayout != null) {
                                        shimmerFrameLayout.setVisibility(8);
                                    }
                                    i iVar3 = suggestedActivityDetailsActivity.P;
                                    if (iVar3 != null) {
                                        constraintLayout = iVar3.f38810e;
                                    } else {
                                        constraintLayout = null;
                                    }
                                    if (constraintLayout != null) {
                                        constraintLayout.setVisibility(8);
                                    }
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(str3, e10);
                                }
                            }
                            intent = suggestedActivityDetailsActivity.getIntent();
                            if (intent == null) {
                                z11 = intent.getBooleanExtra("setPlanCardToolTipExtra", false);
                            } else {
                                z11 = false;
                            }
                            suggestedActivityDetailsActivity.J = z11;
                            if (z11) {
                                i iVar4 = suggestedActivityDetailsActivity.P;
                                if (iVar4 != null) {
                                    constraintLayout2 = iVar4.f38808c;
                                }
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setVisibility(0);
                                }
                                UtilsKt.fireAnalytics("ch_mark_plan_in_tooltipshow", UtilsKt.getAnalyticsBundle());
                            }
                        }
                        i6 = 0;
                        suggestedActivityDetailsActivity.I = i6;
                        if (arrayList != null) {
                        }
                        intent = suggestedActivityDetailsActivity.getIntent();
                        if (intent == null) {
                        }
                        suggestedActivityDetailsActivity.J = z11;
                        if (z11) {
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    if (arrayList != null) {
                        i6 = 0;
                        while (r4.hasNext()) {
                        }
                        suggestedActivityDetailsActivity.I = i6;
                        if (arrayList != null) {
                        }
                        intent = suggestedActivityDetailsActivity.getIntent();
                        if (intent == null) {
                        }
                        suggestedActivityDetailsActivity.J = z11;
                        if (z11) {
                        }
                    }
                    i6 = 0;
                    suggestedActivityDetailsActivity.I = i6;
                    if (arrayList != null) {
                    }
                    intent = suggestedActivityDetailsActivity.getIntent();
                    if (intent == null) {
                    }
                    suggestedActivityDetailsActivity.J = z11;
                    if (z11) {
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str3, e11);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SuggestedActivityDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends h {
        public e() {
            super(true);
        }

        @Override // androidx.activity.h
        public final void a() {
            String str;
            Bundle bundle = new Bundle();
            SuggestedActivityDetailsActivity suggestedActivityDetailsActivity = SuggestedActivityDetailsActivity.this;
            Course course = suggestedActivityDetailsActivity.f10844y;
            if (course != null) {
                str = course.getCourseName();
            } else {
                str = null;
            }
            bundle.putString("course", str);
            bundle.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
            bundle.putString("type", "hard_back");
            UtilsKt.fireAnalytics("suggested_activities_back_click", bundle);
            suggestedActivityDetailsActivity.finish();
        }
    }

    /* compiled from: SuggestedActivityDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements r<SuggestedActivityModel, Integer, Boolean, String, hs.k> {
        public f() {
            super(4);
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
        @Override // ss.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k r(SuggestedActivityModel suggestedActivityModel, Integer num, Boolean bool, String str) {
            SuggestedActivityDetailsActivity suggestedActivityDetailsActivity;
            Course course;
            String parentActivity;
            boolean z10;
            String str2;
            String parentActivity2;
            boolean z11;
            String dynamicVariant;
            boolean z12;
            boolean z13;
            String str3;
            SuggestedActivityDetailsActivity suggestedActivityDetailsActivity2;
            String str4;
            SuggestedActivityModel suggestedActivityModel2 = suggestedActivityModel;
            int intValue = num.intValue();
            Boolean bool2 = bool;
            String str5 = str;
            if (suggestedActivityModel2 != null) {
                boolean isFree = suggestedActivityModel2.isFree();
                String str6 = null;
                boolean z14 = false;
                SuggestedActivityDetailsActivity suggestedActivityDetailsActivity3 = SuggestedActivityDetailsActivity.this;
                if ((isFree && !suggestedActivityDetailsActivity3.M) || SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    Boolean bool3 = Boolean.FALSE;
                    if (!kotlin.jvm.internal.i.b(bool2, bool3)) {
                        String dynamicVariant2 = suggestedActivityModel2.getDynamicVariant();
                        if (dynamicVariant2 != null && !n.B0(dynamicVariant2)) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            androidx.activity.result.c<Intent> cVar = suggestedActivityDetailsActivity3.N;
                            Intent intent = new Intent(suggestedActivityDetailsActivity3, TemplateActivity.class);
                            CourseDayModelV1 courseDayModelV1 = new CourseDayModelV1();
                            courseDayModelV1.setContent_label(suggestedActivityModel2.getContent_label());
                            courseDayModelV1.setContent_id(suggestedActivityModel2.getContent_id());
                            courseDayModelV1.setAssessment(bool3);
                            hs.k kVar = hs.k.f19476a;
                            intent.putExtra("day_plan", courseDayModelV1);
                            intent.putExtra("type", "daily");
                            intent.putExtra("goalSource", "suggested_activity");
                            cVar.a(intent);
                        } else {
                            androidx.activity.result.c<Intent> cVar2 = suggestedActivityDetailsActivity3.O;
                            Intent intent2 = new Intent(suggestedActivityDetailsActivity3, NewDynamicParentActivity.class);
                            intent2.putExtra("activity_id", suggestedActivityModel2.getContent_id());
                            intent2.putExtra("activity_name", suggestedActivityModel2.getContent_label());
                            Course course2 = suggestedActivityDetailsActivity3.f10844y;
                            if (course2 != null) {
                                str3 = course2.getCourseName();
                            } else {
                                str3 = null;
                            }
                            intent2.putExtra(Constants.COURSE_NAME, str3);
                            intent2.putStringArrayListExtra("course_tags", suggestedActivityModel2.getTags());
                            intent2.putExtra("goalSource", "suggested_activity");
                            intent2.putExtra("isMainActivity", kotlin.jvm.internal.i.b(suggestedActivityModel2.isFiller(), bool3));
                            cVar2.a(intent2);
                        }
                        suggestedActivityDetailsActivity3.B = suggestedActivityModel2;
                        suggestedActivityDetailsActivity3.D = intValue;
                        suggestedActivityDetailsActivity3.C = str5;
                        x1 x1Var = suggestedActivityDetailsActivity3.A;
                        if (x1Var != null) {
                            Course course3 = suggestedActivityDetailsActivity3.f10844y;
                            if (course3 != null) {
                                str4 = course3.getCourseName();
                            } else {
                                str4 = null;
                            }
                            if (str4 != null) {
                                try {
                                    suggestedActivityDetailsActivity2 = suggestedActivityDetailsActivity3;
                                } catch (Exception e10) {
                                    e = e10;
                                    suggestedActivityDetailsActivity2 = suggestedActivityDetailsActivity3;
                                }
                                try {
                                    v.H(kc.f.H(x1Var), null, 0, new y1(suggestedActivityModel2, x1Var, str4, intValue, null), 3);
                                } catch (Exception e11) {
                                    e = e11;
                                    LogHelper.INSTANCE.e(x1Var.f22388y, e);
                                    suggestedActivityDetailsActivity = suggestedActivityDetailsActivity2;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("symptom_name", suggestedActivityModel2.getSymptom());
                                    course = suggestedActivityDetailsActivity.f10844y;
                                    if (course != null) {
                                    }
                                    bundle.putString("course", str6);
                                    bundle.putString("activity_name", suggestedActivityModel2.getContent_label());
                                    parentActivity = suggestedActivityModel2.getParentActivity();
                                    if (parentActivity == null) {
                                    }
                                    z10 = true;
                                    bundle.putBoolean("main_activity", z10);
                                    if (suggestedActivityModel2.getStart_date() != 0) {
                                    }
                                    bundle.putString("status_of_activity_when_clicked", str2);
                                    bundle.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                                    bundle.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                                    parentActivity2 = suggestedActivityModel2.getParentActivity();
                                    if (parentActivity2 == null) {
                                    }
                                    z11 = true;
                                    if (!z11) {
                                    }
                                    bundle.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                                    dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                                    if (dynamicVariant == null) {
                                    }
                                    z12 = true;
                                    z14 = true;
                                    bundle.putBoolean("dynamicV1", z12 ^ z14);
                                    UtilsKt.fireAnalytics("suggested_activities_inside_click", bundle);
                                    return hs.k.f19476a;
                                }
                                suggestedActivityDetailsActivity = suggestedActivityDetailsActivity2;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("symptom_name", suggestedActivityModel2.getSymptom());
                                course = suggestedActivityDetailsActivity.f10844y;
                                if (course != null) {
                                    str6 = course.getCourseName();
                                }
                                bundle2.putString("course", str6);
                                bundle2.putString("activity_name", suggestedActivityModel2.getContent_label());
                                parentActivity = suggestedActivityModel2.getParentActivity();
                                if (parentActivity == null && !n.B0(parentActivity)) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                bundle2.putBoolean("main_activity", z10);
                                if (suggestedActivityModel2.getStart_date() != 0) {
                                    str2 = "not_started";
                                } else if (suggestedActivityModel2.isCompleted()) {
                                    str2 = "completed";
                                } else {
                                    str2 = "incomplete";
                                }
                                bundle2.putString("status_of_activity_when_clicked", str2);
                                bundle2.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                                bundle2.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                                parentActivity2 = suggestedActivityModel2.getParentActivity();
                                if (parentActivity2 == null && !n.B0(parentActivity2)) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (!z11) {
                                    bundle2.putInt("activity_position_in_list", intValue);
                                } else {
                                    bundle2.putString("parent_activity", str5);
                                    bundle2.putBoolean("parent_activity_completed", kotlin.jvm.internal.i.b(bool2, Boolean.TRUE));
                                }
                                bundle2.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                                dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                                if (dynamicVariant == null && !n.B0(dynamicVariant)) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                    z14 = true;
                                }
                                bundle2.putBoolean("dynamicV1", z12 ^ z14);
                                UtilsKt.fireAnalytics("suggested_activities_inside_click", bundle2);
                            }
                        }
                        suggestedActivityDetailsActivity2 = suggestedActivityDetailsActivity3;
                        suggestedActivityDetailsActivity = suggestedActivityDetailsActivity2;
                        Bundle bundle22 = new Bundle();
                        bundle22.putString("symptom_name", suggestedActivityModel2.getSymptom());
                        course = suggestedActivityDetailsActivity.f10844y;
                        if (course != null) {
                        }
                        bundle22.putString("course", str6);
                        bundle22.putString("activity_name", suggestedActivityModel2.getContent_label());
                        parentActivity = suggestedActivityModel2.getParentActivity();
                        if (parentActivity == null) {
                        }
                        z10 = true;
                        bundle22.putBoolean("main_activity", z10);
                        if (suggestedActivityModel2.getStart_date() != 0) {
                        }
                        bundle22.putString("status_of_activity_when_clicked", str2);
                        bundle22.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                        bundle22.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                        parentActivity2 = suggestedActivityModel2.getParentActivity();
                        if (parentActivity2 == null) {
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        bundle22.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                        dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                        if (dynamicVariant == null) {
                        }
                        z12 = true;
                        z14 = true;
                        bundle22.putBoolean("dynamicV1", z12 ^ z14);
                        UtilsKt.fireAnalytics("suggested_activities_inside_click", bundle22);
                    }
                }
                if (kotlin.jvm.internal.i.b(bool2, Boolean.FALSE)) {
                    suggestedActivityDetailsActivity = suggestedActivityDetailsActivity3;
                    Toast.makeText(suggestedActivityDetailsActivity, suggestedActivityDetailsActivity.getString(R.string.fillerActivityAccessToast), 0).show();
                } else {
                    suggestedActivityDetailsActivity = suggestedActivityDetailsActivity3;
                    suggestedActivityDetailsActivity.startActivity(tr.r.s(suggestedActivityDetailsActivity, false).putExtra("source", "suggested_activity"));
                }
                Bundle bundle222 = new Bundle();
                bundle222.putString("symptom_name", suggestedActivityModel2.getSymptom());
                course = suggestedActivityDetailsActivity.f10844y;
                if (course != null) {
                }
                bundle222.putString("course", str6);
                bundle222.putString("activity_name", suggestedActivityModel2.getContent_label());
                parentActivity = suggestedActivityModel2.getParentActivity();
                if (parentActivity == null) {
                }
                z10 = true;
                bundle222.putBoolean("main_activity", z10);
                if (suggestedActivityModel2.getStart_date() != 0) {
                }
                bundle222.putString("status_of_activity_when_clicked", str2);
                bundle222.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                bundle222.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                parentActivity2 = suggestedActivityModel2.getParentActivity();
                if (parentActivity2 == null) {
                }
                z11 = true;
                if (!z11) {
                }
                bundle222.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                if (dynamicVariant == null) {
                }
                z12 = true;
                z14 = true;
                bundle222.putBoolean("dynamicV1", z12 ^ z14);
                UtilsKt.fireAnalytics("suggested_activities_inside_click", bundle222);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SuggestedActivityDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements r<SuggestedActivityModel, Integer, Boolean, String, hs.k> {
        public g() {
            super(4);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
        @Override // ss.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k r(SuggestedActivityModel suggestedActivityModel, Integer num, Boolean bool, String str) {
            String str2;
            int i6;
            String str3;
            Course course;
            String str4;
            String parentActivity;
            boolean z10;
            String str5;
            String parentActivity2;
            boolean z11;
            String dynamicVariant;
            boolean z12;
            boolean z13;
            String str6;
            String str7;
            x1 x1Var;
            SuggestedActivityModel suggestedActivityModel2 = suggestedActivityModel;
            int intValue = num.intValue();
            Boolean bool2 = bool;
            String str8 = str;
            if (suggestedActivityModel2 != null) {
                boolean z14 = !suggestedActivityModel2.isFavorite();
                SuggestedActivityDetailsActivity suggestedActivityDetailsActivity = SuggestedActivityDetailsActivity.this;
                x1 x1Var2 = suggestedActivityDetailsActivity.A;
                if (x1Var2 != null) {
                    Course course2 = suggestedActivityDetailsActivity.f10844y;
                    if (course2 != null) {
                        str7 = course2.getCourseName();
                    } else {
                        str7 = null;
                    }
                    if (str7 != null) {
                        try {
                            str2 = null;
                            x1Var = x1Var2;
                        } catch (Exception e10) {
                            e = e10;
                            str2 = null;
                            x1Var = x1Var2;
                        }
                        try {
                            i6 = 0;
                        } catch (Exception e11) {
                            e = e11;
                            i6 = 0;
                            LogHelper.INSTANCE.e(x1Var.f22388y, e);
                            if (!z14) {
                            }
                            Toast.makeText(suggestedActivityDetailsActivity, str3, i6).show();
                            Bundle bundle = new Bundle();
                            bundle.putString("symptom_name", suggestedActivityModel2.getSymptom());
                            course = suggestedActivityDetailsActivity.f10844y;
                            if (course == null) {
                            }
                            bundle.putString("course", str4);
                            bundle.putString("activity_name", suggestedActivityModel2.getContent_label());
                            parentActivity = suggestedActivityModel2.getParentActivity();
                            if (parentActivity == null) {
                            }
                            z10 = true;
                            bundle.putBoolean("main_activity", z10);
                            if (suggestedActivityModel2.getStart_date() != 0) {
                            }
                            bundle.putString("status_of_activity_when_clicked", str5);
                            bundle.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                            bundle.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                            parentActivity2 = suggestedActivityModel2.getParentActivity();
                            if (parentActivity2 == null) {
                            }
                            z11 = true;
                            if (!z11) {
                            }
                            bundle.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                            dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                            if (dynamicVariant == null) {
                            }
                            z12 = true;
                            z13 = true;
                            bundle.putBoolean("dynamicV1", z12 ^ z13);
                            if (!z14) {
                            }
                            UtilsKt.fireAnalytics(str6, bundle);
                            return hs.k.f19476a;
                        }
                        try {
                            v.H(kc.f.H(x1Var2), null, 0, new z1(suggestedActivityModel2, x1Var2, z14, str7, intValue, null), 3);
                        } catch (Exception e12) {
                            e = e12;
                            LogHelper.INSTANCE.e(x1Var.f22388y, e);
                            if (!z14) {
                            }
                            Toast.makeText(suggestedActivityDetailsActivity, str3, i6).show();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("symptom_name", suggestedActivityModel2.getSymptom());
                            course = suggestedActivityDetailsActivity.f10844y;
                            if (course == null) {
                            }
                            bundle2.putString("course", str4);
                            bundle2.putString("activity_name", suggestedActivityModel2.getContent_label());
                            parentActivity = suggestedActivityModel2.getParentActivity();
                            if (parentActivity == null) {
                            }
                            z10 = true;
                            bundle2.putBoolean("main_activity", z10);
                            if (suggestedActivityModel2.getStart_date() != 0) {
                            }
                            bundle2.putString("status_of_activity_when_clicked", str5);
                            bundle2.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                            bundle2.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                            parentActivity2 = suggestedActivityModel2.getParentActivity();
                            if (parentActivity2 == null) {
                            }
                            z11 = true;
                            if (!z11) {
                            }
                            bundle2.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                            dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                            if (dynamicVariant == null) {
                            }
                            z12 = true;
                            z13 = true;
                            bundle2.putBoolean("dynamicV1", z12 ^ z13);
                            if (!z14) {
                            }
                            UtilsKt.fireAnalytics(str6, bundle2);
                            return hs.k.f19476a;
                        }
                        if (!z14) {
                            str3 = "Activity saved!";
                        } else {
                            str3 = "Activity unsaved!";
                        }
                        Toast.makeText(suggestedActivityDetailsActivity, str3, i6).show();
                        Bundle bundle22 = new Bundle();
                        bundle22.putString("symptom_name", suggestedActivityModel2.getSymptom());
                        course = suggestedActivityDetailsActivity.f10844y;
                        if (course == null) {
                            str4 = course.getCourseName();
                        } else {
                            str4 = str2;
                        }
                        bundle22.putString("course", str4);
                        bundle22.putString("activity_name", suggestedActivityModel2.getContent_label());
                        parentActivity = suggestedActivityModel2.getParentActivity();
                        if (parentActivity == null && !n.B0(parentActivity)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        bundle22.putBoolean("main_activity", z10);
                        if (suggestedActivityModel2.getStart_date() != 0) {
                            str5 = "not_started";
                        } else if (suggestedActivityModel2.isCompleted()) {
                            str5 = "completed";
                        } else {
                            str5 = "incomplete";
                        }
                        bundle22.putString("status_of_activity_when_clicked", str5);
                        bundle22.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                        bundle22.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                        parentActivity2 = suggestedActivityModel2.getParentActivity();
                        if (parentActivity2 == null && !n.B0(parentActivity2)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            bundle22.putInt("activity_position_in_list", intValue);
                        } else {
                            bundle22.putString("parent_activity", str8);
                            bundle22.putBoolean("parent_activity_completed", kotlin.jvm.internal.i.b(bool2, Boolean.TRUE));
                        }
                        bundle22.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                        dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                        if (dynamicVariant == null && !n.B0(dynamicVariant)) {
                            z12 = true;
                            z13 = false;
                        } else {
                            z12 = true;
                            z13 = true;
                        }
                        bundle22.putBoolean("dynamicV1", z12 ^ z13);
                        if (!z14) {
                            str6 = "suggested_activities_inside_bookmark";
                        } else {
                            str6 = "suggested_activities_inside_bookmark_un";
                        }
                        UtilsKt.fireAnalytics(str6, bundle22);
                    }
                }
                str2 = null;
                i6 = 0;
                if (!z14) {
                }
                Toast.makeText(suggestedActivityDetailsActivity, str3, i6).show();
                Bundle bundle222 = new Bundle();
                bundle222.putString("symptom_name", suggestedActivityModel2.getSymptom());
                course = suggestedActivityDetailsActivity.f10844y;
                if (course == null) {
                }
                bundle222.putString("course", str4);
                bundle222.putString("activity_name", suggestedActivityModel2.getContent_label());
                parentActivity = suggestedActivityModel2.getParentActivity();
                if (parentActivity == null) {
                }
                z10 = true;
                bundle222.putBoolean("main_activity", z10);
                if (suggestedActivityModel2.getStart_date() != 0) {
                }
                bundle222.putString("status_of_activity_when_clicked", str5);
                bundle222.putStringArrayList("tags_from_backend", suggestedActivityModel2.getTags());
                bundle222.putBoolean("paid_activity", !suggestedActivityModel2.isFree());
                parentActivity2 = suggestedActivityModel2.getParentActivity();
                if (parentActivity2 == null) {
                }
                z11 = true;
                if (!z11) {
                }
                bundle222.putInt("progress_rate_when_clicked", suggestedActivityDetailsActivity.I);
                dynamicVariant = suggestedActivityModel2.getDynamicVariant();
                if (dynamicVariant == null) {
                }
                z12 = true;
                z13 = true;
                bundle222.putBoolean("dynamicV1", z12 ^ z13);
                if (!z14) {
                }
                UtilsKt.fireAnalytics(str6, bundle222);
            }
            return hs.k.f19476a;
        }
    }

    public SuggestedActivityDetailsActivity() {
        boolean z10;
        HashMap<String, Object> appConfig;
        new LinkedHashMap();
        this.f10842w = LogHelper.INSTANCE.makeLogTag("SuggestedActivityDetailsActivity");
        this.f10843x = "";
        this.D = -1;
        this.E = new ArrayList<>();
        this.F = "";
        this.H = new HashMap<>();
        this.L = new hc.d();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.NO_FREE_SYMPTOM_EXPERIMENT_NOT_V4), Boolean.TRUE);
        } else {
            z10 = false;
        }
        this.M = z10;
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: fl.x

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SuggestedActivityDetailsActivity f15166v;

            {
                this.f15166v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z11;
                String str;
                boolean z12;
                String str2;
                int i6 = r2;
                SuggestedActivityDetailsActivity this$0 = this.f15166v;
                boolean z13 = true;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = SuggestedActivityDetailsActivity.Q;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle u02 = this$0.u0();
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                x1 x1Var = this$0.A;
                                if (x1Var != null) {
                                    SuggestedActivityModel suggestedActivityModel = this$0.B;
                                    Course course = this$0.f10844y;
                                    if (course != null) {
                                        str2 = course.getCourseName();
                                    } else {
                                        str2 = null;
                                    }
                                    x1Var.e(suggestedActivityModel, str2, this$0.D);
                                }
                                Intent intent2 = aVar.f977v;
                                if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                    z13 = false;
                                }
                                u02.putBoolean("feedback_helpful", z13);
                                UtilsKt.fireAnalytics("suggested_activities_inside_complete", u02);
                            } else {
                                UtilsKt.fireAnalytics("suggested_activities_inside_incomplete", u02);
                            }
                            this$0.B = null;
                            this$0.C = null;
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f10842w, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = SuggestedActivityDetailsActivity.Q;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle u03 = this$0.u0();
                            Intent intent3 = aVar2.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                x1 x1Var2 = this$0.A;
                                if (x1Var2 != null) {
                                    SuggestedActivityModel suggestedActivityModel2 = this$0.B;
                                    Course course2 = this$0.f10844y;
                                    if (course2 != null) {
                                        str = course2.getCourseName();
                                    } else {
                                        str = null;
                                    }
                                    x1Var2.e(suggestedActivityModel2, str, this$0.D);
                                }
                                Intent intent4 = aVar2.f977v;
                                if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                    z13 = false;
                                }
                                u03.putBoolean("feedback_helpful", z13);
                                UtilsKt.fireAnalytics("suggested_activities_inside_complete", u03);
                            } else {
                                UtilsKt.fireAnalytics("suggested_activities_inside_incomplete", u03);
                            }
                            this$0.B = null;
                            this$0.C = null;
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10842w, e11);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.N = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: fl.x

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SuggestedActivityDetailsActivity f15166v;

            {
                this.f15166v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z11;
                String str;
                boolean z12;
                String str2;
                int i6 = r2;
                SuggestedActivityDetailsActivity this$0 = this.f15166v;
                boolean z13 = true;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = SuggestedActivityDetailsActivity.Q;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle u02 = this$0.u0();
                            Intent intent = aVar.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                x1 x1Var = this$0.A;
                                if (x1Var != null) {
                                    SuggestedActivityModel suggestedActivityModel = this$0.B;
                                    Course course = this$0.f10844y;
                                    if (course != null) {
                                        str2 = course.getCourseName();
                                    } else {
                                        str2 = null;
                                    }
                                    x1Var.e(suggestedActivityModel, str2, this$0.D);
                                }
                                Intent intent2 = aVar.f977v;
                                if (intent2 == null || !intent2.getBooleanExtra("showSelling", false)) {
                                    z13 = false;
                                }
                                u02.putBoolean("feedback_helpful", z13);
                                UtilsKt.fireAnalytics("suggested_activities_inside_complete", u02);
                            } else {
                                UtilsKt.fireAnalytics("suggested_activities_inside_incomplete", u02);
                            }
                            this$0.B = null;
                            this$0.C = null;
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f10842w, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = SuggestedActivityDetailsActivity.Q;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle u03 = this$0.u0();
                            Intent intent3 = aVar2.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("isCompleted", false)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                x1 x1Var2 = this$0.A;
                                if (x1Var2 != null) {
                                    SuggestedActivityModel suggestedActivityModel2 = this$0.B;
                                    Course course2 = this$0.f10844y;
                                    if (course2 != null) {
                                        str = course2.getCourseName();
                                    } else {
                                        str = null;
                                    }
                                    x1Var2.e(suggestedActivityModel2, str, this$0.D);
                                }
                                Intent intent4 = aVar2.f977v;
                                if (intent4 == null || !intent4.getBooleanExtra("showSelling", false)) {
                                    z13 = false;
                                }
                                u03.putBoolean("feedback_helpful", z13);
                                UtilsKt.fireAnalytics("suggested_activities_inside_complete", u03);
                            } else {
                                UtilsKt.fireAnalytics("suggested_activities_inside_incomplete", u03);
                            }
                            this$0.B = null;
                            this$0.C = null;
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10842w, e11);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…)\n            }\n        }");
        this.O = registerForActivityResult2;
    }

    public final void A0(String str) {
        RobertoTextView robertoTextView;
        hs.f<String, String> fVar;
        RecyclerView.e eVar;
        gl.e eVar2;
        RobertoTextView robertoTextView2;
        View view;
        ConstraintLayout constraintLayout;
        Integer num;
        String str2;
        String str3;
        RobertoTextView robertoTextView3;
        View view2;
        ConstraintLayout constraintLayout2;
        RecyclerView recyclerView;
        try {
            Iterator<hs.f<String, String>> it = this.E.iterator();
            while (true) {
                robertoTextView = null;
                if (it.hasNext()) {
                    fVar = it.next();
                    if (kotlin.jvm.internal.i.b(fVar.f19465v, str)) {
                        break;
                    }
                } else {
                    fVar = null;
                    break;
                }
            }
            hs.f<String, String> fVar2 = fVar;
            if (fVar2 != null) {
                String str4 = fVar2.f19464u;
                this.f10843x = str4;
                i iVar = this.P;
                if (iVar != null && (recyclerView = iVar.f38815k) != null) {
                    eVar = recyclerView.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof gl.e) {
                    eVar2 = (gl.e) eVar;
                } else {
                    eVar2 = null;
                }
                if (eVar2 != null) {
                    eVar2.v(this.f10843x, false);
                }
                if ((kotlin.jvm.internal.i.b(this.F, str4) && !this.M) || SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    i iVar2 = this.P;
                    if (iVar2 != null) {
                        robertoTextView3 = iVar2.f38820p;
                    } else {
                        robertoTextView3 = null;
                    }
                    if (robertoTextView3 != null) {
                        robertoTextView3.setVisibility(8);
                    }
                    i iVar3 = this.P;
                    if (iVar3 != null) {
                        view2 = iVar3.f38821q;
                    } else {
                        view2 = null;
                    }
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    i iVar4 = this.P;
                    if (iVar4 != null && (constraintLayout2 = iVar4.f38809d) != null) {
                        constraintLayout2.setBackgroundColor(g0.a.b(this, R.color.white));
                    }
                } else {
                    i iVar5 = this.P;
                    if (iVar5 != null) {
                        robertoTextView2 = iVar5.f38820p;
                    } else {
                        robertoTextView2 = null;
                    }
                    if (robertoTextView2 != null) {
                        robertoTextView2.setVisibility(0);
                    }
                    i iVar6 = this.P;
                    if (iVar6 != null) {
                        view = iVar6.f38821q;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    i iVar7 = this.P;
                    if (iVar7 != null && (constraintLayout = iVar7.f38809d) != null) {
                        constraintLayout.setBackgroundColor(g0.a.b(this, R.color.darker_grey_background));
                    }
                }
                if (this.A != null) {
                    Course course = this.f10844y;
                    if (course != null) {
                        str3 = course.getCourseName();
                    } else {
                        str3 = null;
                    }
                    kotlin.jvm.internal.i.d(str3);
                    num = x1.g(str3, this.f10843x, this.L);
                } else {
                    num = null;
                }
                i iVar8 = this.P;
                if (iVar8 != null) {
                    robertoTextView = iVar8.f38817m;
                }
                if (robertoTextView != null) {
                    if (num != null) {
                        str2 = getString(num.intValue());
                    } else {
                        str2 = "";
                    }
                    robertoTextView.setText(str2);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10842w, e10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ConstraintLayout constraintLayout;
        if (this.J) {
            this.J = false;
            i iVar = this.P;
            if (iVar != null) {
                constraintLayout = iVar.f38808c;
            } else {
                constraintLayout = null;
            }
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.chip.ChipGroup.d
    public final void n(ChipGroup group, ArrayList arrayList) {
        String str;
        Object obj;
        Chip chip;
        boolean z10;
        Object obj2;
        Chip chip2;
        hs.f<String, String> fVar;
        String str2;
        String str3;
        ArrayList<SuggestedActivityModel> planSuggested;
        SuggestedActivityModel suggestedActivityModel;
        Chip chip3;
        boolean z11;
        Chip chip4;
        Integer num;
        kotlin.jvm.internal.i.g(group, "group");
        try {
            if (arrayList.isEmpty()) {
                Integer num2 = this.K;
                if (num2 != null) {
                    group.b(num2.intValue());
                    return;
                }
                return;
            }
            Iterator<View> it = f6.b.B0(group).iterator();
            while (true) {
                j0 j0Var = (j0) it;
                str = null;
                if (j0Var.hasNext()) {
                    obj = j0Var.next();
                    View view = (View) obj;
                    if (view instanceof Chip) {
                        chip4 = (Chip) view;
                    } else {
                        chip4 = null;
                    }
                    if (chip4 != null) {
                        num = Integer.valueOf(chip4.getId());
                    } else {
                        num = null;
                    }
                    if (kotlin.jvm.internal.i.b(num, this.K)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj instanceof Chip) {
                chip = (Chip) obj;
            } else {
                chip = null;
            }
            if (chip != null) {
                chip.setChipBackgroundColorResource(R.color.white);
                chip.setChipStrokeColorResource(R.color.title_high_contrast);
                chip.setTextColor(g0.a.b(this, R.color.title_high_contrast));
            }
            Iterator<View> it2 = f6.b.B0(group).iterator();
            while (true) {
                j0 j0Var2 = (j0) it2;
                z10 = false;
                if (j0Var2.hasNext()) {
                    obj2 = j0Var2.next();
                    View view2 = (View) obj2;
                    if (view2 instanceof Chip) {
                        chip3 = (Chip) view2;
                    } else {
                        chip3 = null;
                    }
                    if (chip3 != null && chip3.getId() == ((Number) u.g2(arrayList)).intValue()) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 instanceof Chip) {
                chip2 = (Chip) obj2;
            } else {
                chip2 = null;
            }
            if (chip2 != null) {
                Integer num3 = this.f10845z;
                if (num3 != null) {
                    int intValue = num3.intValue();
                    chip2.setChipBackgroundColorResource(intValue);
                    chip2.setChipStrokeColorResource(intValue);
                }
                chip2.setTextColor(g0.a.b(this, R.color.white));
                String obj3 = chip2.getText().toString();
                A0(obj3);
                this.K = Integer.valueOf(chip2.getId());
                Bundle bundle = new Bundle();
                Iterator<hs.f<String, String>> it3 = this.E.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        fVar = it3.next();
                        if (kotlin.jvm.internal.i.b(fVar.f19465v, obj3)) {
                            break;
                        }
                    } else {
                        fVar = null;
                        break;
                    }
                }
                hs.f<String, String> fVar2 = fVar;
                if (fVar2 != null) {
                    str2 = fVar2.f19464u;
                } else {
                    str2 = null;
                }
                bundle.putString("symptom", str2);
                Course course = this.f10844y;
                if (course != null) {
                    str3 = course.getCourseName();
                } else {
                    str3 = null;
                }
                bundle.putString("course", str3);
                Course course2 = this.f10844y;
                if (course2 != null && (planSuggested = course2.getPlanSuggested()) != null && (suggestedActivityModel = (SuggestedActivityModel) u.i2(planSuggested)) != null) {
                    str = suggestedActivityModel.getSymptom();
                }
                if (!kotlin.jvm.internal.i.b(str, str2)) {
                    z10 = true;
                }
                bundle.putBoolean("paid_symptom", z10);
                UtilsKt.fireAnalytics("suggested_activities_symptom_chip_click", bundle);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10842w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        u0.e aVar;
        u0.e eVar;
        String str2 = this.f10842w;
        super.onCreate(bundle);
        try {
            i a10 = i.a(getLayoutInflater());
            this.P = a10;
            setContentView(a10.f38806a);
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
                window.setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, "Error in setting custom status bar", e10);
            }
            z0();
            l0 a11 = new o0(this, new b0(new e1(), 2)).a(x1.class);
            x1 x1Var = (x1) a11;
            x1Var.f22389z.e(this, new fl.k(5, new b()));
            x1Var.A.e(this, new fl.k(6, new c()));
            ((w) x1Var.B.getValue()).e(this, new fl.k(7, new d()));
            Course course = this.f10844y;
            if (course != null) {
                str = course.getCourseName();
            } else {
                str = null;
            }
            x1Var.f(str);
            this.A = (x1) a11;
            i iVar = this.P;
            if (iVar != null && (appCompatImageView2 = iVar.f38812h) != null) {
                appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: fl.y

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ SuggestedActivityDetailsActivity f15168v;

                    {
                        this.f15168v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList<CourseDayModelV1> planV3;
                        int i10 = r2;
                        CourseDayModelV1 courseDayModelV1 = null;
                        String str3 = null;
                        courseDayModelV1 = null;
                        SuggestedActivityDetailsActivity this$0 = this.f15168v;
                        switch (i10) {
                            case 0:
                                int i11 = SuggestedActivityDetailsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle bundle2 = new Bundle();
                                Course course2 = this$0.f10844y;
                                if (course2 != null) {
                                    str3 = course2.getCourseName();
                                }
                                bundle2.putString("course", str3);
                                bundle2.putInt("progress_rate_when_clicked", this$0.I);
                                bundle2.putString("type", "soft_back");
                                UtilsKt.fireAnalytics("suggested_activities_back_click", bundle2);
                                this$0.finish();
                                return;
                            default:
                                int i12 = SuggestedActivityDetailsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Course course3 = this$0.f10844y;
                                boolean z10 = false;
                                if (course3 != null && (planV3 = course3.getPlanV3()) != null) {
                                    courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3);
                                }
                                if (courseDayModelV1 != null && courseDayModelV1.isCompleted()) {
                                    z10 = true;
                                }
                                if (z10) {
                                    Intent s10 = e0.s(this$0);
                                    s10.putExtra(Constants.API_COURSE_LINK, courseDayModelV1.getContent_id());
                                    s10.putExtra(Constants.COURSE_TITLE, courseDayModelV1.getContent_label());
                                    s10.putExtra(Constants.DAYMODEL_POSITION, courseDayModelV1.getPosition());
                                    s10.putExtra("showTopNav", true);
                                    this$0.startActivity(s10);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            i iVar2 = this.P;
            if (iVar2 != null && (appCompatImageView = iVar2.f38811g) != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: fl.y

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ SuggestedActivityDetailsActivity f15168v;

                    {
                        this.f15168v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList<CourseDayModelV1> planV3;
                        int i10 = r2;
                        CourseDayModelV1 courseDayModelV1 = null;
                        String str3 = null;
                        courseDayModelV1 = null;
                        SuggestedActivityDetailsActivity this$0 = this.f15168v;
                        switch (i10) {
                            case 0:
                                int i11 = SuggestedActivityDetailsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle bundle2 = new Bundle();
                                Course course2 = this$0.f10844y;
                                if (course2 != null) {
                                    str3 = course2.getCourseName();
                                }
                                bundle2.putString("course", str3);
                                bundle2.putInt("progress_rate_when_clicked", this$0.I);
                                bundle2.putString("type", "soft_back");
                                UtilsKt.fireAnalytics("suggested_activities_back_click", bundle2);
                                this$0.finish();
                                return;
                            default:
                                int i12 = SuggestedActivityDetailsActivity.Q;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Course course3 = this$0.f10844y;
                                boolean z10 = false;
                                if (course3 != null && (planV3 = course3.getPlanV3()) != null) {
                                    courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3);
                                }
                                if (courseDayModelV1 != null && courseDayModelV1.isCompleted()) {
                                    z10 = true;
                                }
                                if (z10) {
                                    Intent s10 = e0.s(this$0);
                                    s10.putExtra(Constants.API_COURSE_LINK, courseDayModelV1.getContent_id());
                                    s10.putExtra(Constants.COURSE_TITLE, courseDayModelV1.getContent_label());
                                    s10.putExtra(Constants.DAYMODEL_POSITION, courseDayModelV1.getPosition());
                                    s10.putExtra("showTopNav", true);
                                    this$0.startActivity(s10);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            getOnBackPressedDispatcher().a(this, new e());
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        this.P = null;
        super.onDestroy();
    }

    public final Bundle u0() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        boolean z11;
        boolean z12;
        String str5;
        ArrayList<String> arrayList;
        boolean z13;
        String str6;
        boolean z14;
        Bundle bundle = new Bundle();
        SuggestedActivityModel suggestedActivityModel = this.B;
        String str7 = null;
        if (suggestedActivityModel != null) {
            str = suggestedActivityModel.getSymptom();
        } else {
            str = null;
        }
        bundle.putString("symptom_name", str);
        Course course = this.f10844y;
        if (course != null) {
            str2 = course.getCourseName();
        } else {
            str2 = null;
        }
        bundle.putString("course", str2);
        SuggestedActivityModel suggestedActivityModel2 = this.B;
        if (suggestedActivityModel2 != null) {
            str3 = suggestedActivityModel2.getContent_label();
        } else {
            str3 = null;
        }
        bundle.putString("activity_name", str3);
        SuggestedActivityModel suggestedActivityModel3 = this.B;
        if (suggestedActivityModel3 != null) {
            str4 = suggestedActivityModel3.getParentActivity();
        } else {
            str4 = null;
        }
        boolean z15 = false;
        if (str4 != null && !n.B0(str4)) {
            z10 = false;
        } else {
            z10 = true;
        }
        bundle.putBoolean("main_activity", z10);
        SuggestedActivityModel suggestedActivityModel4 = this.B;
        if (suggestedActivityModel4 != null && suggestedActivityModel4.getStart_date() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            str5 = "not_started";
        } else {
            SuggestedActivityModel suggestedActivityModel5 = this.B;
            if (suggestedActivityModel5 != null && suggestedActivityModel5.isCompleted()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                str5 = "completed";
            } else {
                str5 = "incomplete";
            }
        }
        bundle.putString("status_of_activity_when_clicked", str5);
        SuggestedActivityModel suggestedActivityModel6 = this.B;
        if (suggestedActivityModel6 != null) {
            arrayList = suggestedActivityModel6.getTags();
        } else {
            arrayList = null;
        }
        bundle.putStringArrayList("tags_from_backend", arrayList);
        SuggestedActivityModel suggestedActivityModel7 = this.B;
        if (suggestedActivityModel7 != null && !suggestedActivityModel7.isFree()) {
            z13 = true;
        } else {
            z13 = false;
        }
        bundle.putBoolean("paid_activity", z13);
        SuggestedActivityModel suggestedActivityModel8 = this.B;
        if (suggestedActivityModel8 != null) {
            str6 = suggestedActivityModel8.getParentActivity();
        } else {
            str6 = null;
        }
        if (str6 != null && !n.B0(str6)) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            bundle.putInt("activity_position_in_list", this.D);
        } else {
            bundle.putString("parent_activity", this.C);
            bundle.putBoolean("parent_activity_completed", true);
        }
        bundle.putInt("progress_rate_when_clicked", this.I);
        SuggestedActivityModel suggestedActivityModel9 = this.B;
        if (suggestedActivityModel9 != null) {
            str7 = suggestedActivityModel9.getDynamicVariant();
        }
        bundle.putBoolean("dynamicV1", !((str7 == null || n.B0(str7)) ? true : true));
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.f<ArrayList<SuggestedActivityModel>, HashMap<String, ArrayList<String>>> v0() {
        ArrayList<SuggestedActivityModel> arrayList;
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        try {
            Course course = this.f10844y;
            if (course != null) {
                arrayList = course.getPlanSuggested();
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator<SuggestedActivityModel> it = arrayList.iterator();
                while (it.hasNext()) {
                    SuggestedActivityModel next = it.next();
                    String parentActivity = next.getParentActivity();
                    if (parentActivity != null && parentActivity.length() != 0) {
                        z10 = false;
                        if (!z10) {
                            arrayList2.add(next);
                        } else if (hashMap.containsKey(next.getParentActivity())) {
                            ArrayList arrayList3 = (ArrayList) hashMap.get(next.getParentActivity());
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(String.valueOf(next.getContent_id()));
                            c0.c(hashMap).remove(next.getParentActivity());
                            String parentActivity2 = next.getParentActivity();
                            kotlin.jvm.internal.i.d(parentActivity2);
                            hashMap.put(parentActivity2, arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(String.valueOf(next.getContent_id()));
                            String parentActivity3 = next.getParentActivity();
                            kotlin.jvm.internal.i.d(parentActivity3);
                            hashMap.put(parentActivity3, arrayList4);
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10842w, e10);
        }
        return new hs.f<>(arrayList2, hashMap);
    }

    public final ArrayList<hs.f<String, String>> w0(ArrayList<SuggestedActivityModel> arrayList) {
        String str;
        ArrayList<hs.f<String, String>> arrayList2 = new ArrayList<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        try {
            Iterator<SuggestedActivityModel> it = arrayList.iterator();
            while (it.hasNext()) {
                SuggestedActivityModel next = it.next();
                if (next.isFree() && n.B0(this.F) && next.getSymptom() != null) {
                    String symptom = next.getSymptom();
                    kotlin.jvm.internal.i.d(symptom);
                    this.F = symptom;
                }
                linkedHashSet.add(next.getSymptom());
            }
            for (String str2 : linkedHashSet) {
                x1 x1Var = this.A;
                if (x1Var != null) {
                    Course course = this.f10844y;
                    String str3 = null;
                    if (course != null) {
                        str = course.getCourseName();
                    } else {
                        str = null;
                    }
                    kotlin.jvm.internal.i.d(str);
                    kotlin.jvm.internal.i.d(str2);
                    Integer h10 = x1Var.h(str, str2, this.L);
                    if (h10 != null) {
                        str3 = getString(h10.intValue());
                    }
                    arrayList2.add(new hs.f<>(str2, String.valueOf(str3)));
                }
            }
            if (arrayList2.size() > 1) {
                p.P1(arrayList2, new a());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10842w, e10);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(String str, ArrayList arrayList) {
        Chip chip;
        String str2;
        i iVar;
        ChipGroup chipGroup;
        ChipGroup chipGroup2;
        RobertoTextView robertoTextView;
        View view;
        ConstraintLayout constraintLayout;
        Integer num;
        String str3;
        String str4;
        RobertoTextView robertoTextView2;
        View view2;
        ConstraintLayout constraintLayout2;
        ChipGroup chipGroup3;
        ChipGroup chipGroup4;
        try {
            i iVar2 = this.P;
            if (iVar2 != null && (chipGroup4 = iVar2.f38807b) != null) {
                chipGroup4.setOnCheckedStateChangeListener(this);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hs.f fVar = (hs.f) it.next();
                i iVar3 = this.P;
                RobertoTextView robertoTextView3 = null;
                if (iVar3 != null && (chipGroup3 = iVar3.f38807b) != null) {
                    int i6 = bn.a.f4534a;
                    chip = bn.a.f(this, chipGroup3, (String) fVar.f19465v);
                    if (chip != null) {
                        WeakHashMap<View, t0.o0> weakHashMap = d0.f32288a;
                        chip.setId(d0.e.a());
                        if (chip == null) {
                            A a10 = fVar.f19464u;
                            if (str == null) {
                                str2 = (String) ((hs.f) u.g2(arrayList)).f19464u;
                            } else {
                                str2 = str;
                            }
                            boolean z10 = false;
                            if (kotlin.jvm.internal.i.b(a10, str2)) {
                                A a11 = fVar.f19464u;
                                this.f10843x = (String) a11;
                                if ((kotlin.jvm.internal.i.b(this.F, a11) && !this.M) || SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                    i iVar4 = this.P;
                                    if (iVar4 != null) {
                                        robertoTextView2 = iVar4.f38820p;
                                    } else {
                                        robertoTextView2 = null;
                                    }
                                    if (robertoTextView2 != null) {
                                        robertoTextView2.setVisibility(8);
                                    }
                                    i iVar5 = this.P;
                                    if (iVar5 != null) {
                                        view2 = iVar5.f38821q;
                                    } else {
                                        view2 = null;
                                    }
                                    if (view2 != null) {
                                        view2.setVisibility(8);
                                    }
                                    i iVar6 = this.P;
                                    if (iVar6 != null && (constraintLayout2 = iVar6.f38809d) != null) {
                                        constraintLayout2.setBackgroundColor(g0.a.b(this, R.color.white));
                                    }
                                } else {
                                    i iVar7 = this.P;
                                    if (iVar7 != null) {
                                        robertoTextView = iVar7.f38820p;
                                    } else {
                                        robertoTextView = null;
                                    }
                                    if (robertoTextView != null) {
                                        robertoTextView.setVisibility(0);
                                    }
                                    i iVar8 = this.P;
                                    if (iVar8 != null) {
                                        view = iVar8.f38821q;
                                    } else {
                                        view = null;
                                    }
                                    if (view != null) {
                                        view.setVisibility(0);
                                    }
                                    i iVar9 = this.P;
                                    if (iVar9 != null && (constraintLayout = iVar9.f38809d) != null) {
                                        constraintLayout.setBackgroundColor(g0.a.b(this, R.color.darker_grey_background));
                                    }
                                }
                                if (str != null) {
                                    z10 = true;
                                }
                                this.K = Integer.valueOf(chip.getId());
                                chip.setChecked(true);
                                chip.setChipBackgroundColorResource(R.color.title_high_contrast);
                                chip.setChipStrokeColorResource(R.color.title_high_contrast);
                                Integer num2 = this.f10845z;
                                if (num2 != null) {
                                    int intValue = num2.intValue();
                                    chip.setChipBackgroundColorResource(intValue);
                                    chip.setChipStrokeColorResource(intValue);
                                }
                                chip.setTextColor(g0.a.b(this, R.color.white));
                                if (this.A != null) {
                                    Course course = this.f10844y;
                                    if (course != null) {
                                        str4 = course.getCourseName();
                                    } else {
                                        str4 = null;
                                    }
                                    kotlin.jvm.internal.i.d(str4);
                                    num = x1.g(str4, this.f10843x, this.L);
                                } else {
                                    num = null;
                                }
                                i iVar10 = this.P;
                                if (iVar10 != null) {
                                    robertoTextView3 = iVar10.f38817m;
                                }
                                if (robertoTextView3 != null) {
                                    if (num != null) {
                                        str3 = getString(num.intValue());
                                    } else {
                                        str3 = "";
                                    }
                                    robertoTextView3.setText(str3);
                                }
                            } else {
                                chip.setChipBackgroundColorResource(R.color.white);
                                chip.setChipStrokeColorResource(R.color.title_high_contrast);
                                chip.setTextColor(g0.a.b(this, R.color.title_high_contrast));
                            }
                            i iVar11 = this.P;
                            if (iVar11 != null && (chipGroup2 = iVar11.f38807b) != null) {
                                chipGroup2.addView(chip);
                            }
                            if (z10 && (iVar = this.P) != null && (chipGroup = iVar.f38807b) != null) {
                                chipGroup.post(new ne.u(this, 22, chip));
                            }
                        }
                    }
                }
                chip = null;
                if (chip == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10842w, "Error adding chip", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: Exception -> 0x00c9, TryCatch #0 {Exception -> 0x00c9, blocks: (B:3:0x0004, B:5:0x0009, B:11:0x001f, B:13:0x0023, B:18:0x0034, B:20:0x0038, B:53:0x00c3, B:24:0x003f, B:26:0x0045, B:28:0x004c, B:30:0x0059, B:33:0x0061, B:35:0x0067, B:37:0x0073, B:39:0x0077, B:41:0x007e, B:17:0x002a, B:6:0x000e, B:8:0x0018, B:42:0x0095, B:44:0x009b, B:46:0x00a3, B:50:0x00ac), top: B:58:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[Catch: Exception -> 0x00c9, TryCatch #0 {Exception -> 0x00c9, blocks: (B:3:0x0004, B:5:0x0009, B:11:0x001f, B:13:0x0023, B:18:0x0034, B:20:0x0038, B:53:0x00c3, B:24:0x003f, B:26:0x0045, B:28:0x004c, B:30:0x0059, B:33:0x0061, B:35:0x0067, B:37:0x0073, B:39:0x0077, B:41:0x007e, B:17:0x002a, B:6:0x000e, B:8:0x0018, B:42:0x0095, B:44:0x009b, B:46:0x00a3, B:50:0x00ac), top: B:58:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: Exception -> 0x00c9, TryCatch #0 {Exception -> 0x00c9, blocks: (B:3:0x0004, B:5:0x0009, B:11:0x001f, B:13:0x0023, B:18:0x0034, B:20:0x0038, B:53:0x00c3, B:24:0x003f, B:26:0x0045, B:28:0x004c, B:30:0x0059, B:33:0x0061, B:35:0x0067, B:37:0x0073, B:39:0x0077, B:41:0x007e, B:17:0x002a, B:6:0x000e, B:8:0x0018, B:42:0x0095, B:44:0x009b, B:46:0x00a3, B:50:0x00ac), top: B:58:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[Catch: Exception -> 0x00c9, TryCatch #0 {Exception -> 0x00c9, blocks: (B:3:0x0004, B:5:0x0009, B:11:0x001f, B:13:0x0023, B:18:0x0034, B:20:0x0038, B:53:0x00c3, B:24:0x003f, B:26:0x0045, B:28:0x004c, B:30:0x0059, B:33:0x0061, B:35:0x0067, B:37:0x0073, B:39:0x0077, B:41:0x007e, B:17:0x002a, B:6:0x000e, B:8:0x0018, B:42:0x0095, B:44:0x009b, B:46:0x00a3, B:50:0x00ac), top: B:58:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(ArrayList<SuggestedActivityModel> arrayList, ArrayList<SuggestedActivityModel> arrayList2, HashMap<String, ArrayList<String>> hashMap) {
        String str;
        String str2;
        i iVar;
        RecyclerView recyclerView;
        i iVar2;
        RecyclerView recyclerView2;
        String str3;
        String str4;
        int i6;
        String str5;
        Intent intent;
        String stringExtra;
        String str6 = this.f10842w;
        try {
            SuggestedActivityModel suggestedActivityModel = this.G;
            String str7 = null;
            try {
                if (suggestedActivityModel != null) {
                    str2 = suggestedActivityModel.getSymptom();
                } else {
                    hs.f fVar = (hs.f) u.i2(this.E);
                    if (fVar != null) {
                        str2 = (String) fVar.f19464u;
                    } else {
                        str = null;
                        iVar = this.P;
                        if (iVar == null) {
                            recyclerView = iVar.f38815k;
                        } else {
                            recyclerView = null;
                        }
                        if (recyclerView == null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
                        }
                        iVar2 = this.P;
                        if (iVar2 == null) {
                            recyclerView2 = iVar2.f38815k;
                        } else {
                            recyclerView2 = null;
                        }
                        if (recyclerView2 != null) {
                            Course course = this.f10844y;
                            if (course != null) {
                                str3 = course.getCourseName();
                            } else {
                                str3 = null;
                            }
                            HashMap<String, String> hashMap2 = this.H;
                            LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
                            Course course2 = this.f10844y;
                            if (course2 == null || (str4 = course2.getCourseName()) == null) {
                                str4 = Constants.COURSE_HAPPINESS;
                            }
                            Integer f2 = s5.f(str4);
                            if (f2 != null) {
                                i6 = f2.intValue();
                            } else {
                                i6 = R.color.newDbDomainHappiness;
                            }
                            SuggestedActivityModel suggestedActivityModel2 = this.G;
                            if (suggestedActivityModel2 != null) {
                                str5 = suggestedActivityModel2.getContent_id();
                            } else {
                                str5 = null;
                            }
                            recyclerView2.setAdapter(new gl.e(str3, arrayList, arrayList2, hashMap, hashMap2, i6, str, str5, new f(), new g()));
                        }
                        intent = getIntent();
                        if (intent == null && (stringExtra = intent.getStringExtra("highlightedActivityId")) != null) {
                            if (!n.B0(stringExtra)) {
                                str7 = stringExtra;
                            }
                            if (str7 != null) {
                                new Handler(Looper.getMainLooper()).postDelayed(new ne.u(this, 23, str7), 250L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                intent = getIntent();
                if (intent == null) {
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str6, e10);
                return;
            }
            str = str2;
            iVar = this.P;
            if (iVar == null) {
            }
            if (recyclerView == null) {
            }
            iVar2 = this.P;
            if (iVar2 == null) {
            }
            if (recyclerView2 != null) {
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str6, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:3:0x0002, B:5:0x0009, B:7:0x0011, B:9:0x0019, B:20:0x0036, B:22:0x003e, B:24:0x0044, B:30:0x0050, B:32:0x0054, B:45:0x0071, B:47:0x0075, B:49:0x007b, B:51:0x0091, B:53:0x0099, B:55:0x009d, B:56:0x00a0, B:58:0x00a4, B:60:0x00ac, B:63:0x00b1, B:36:0x005b, B:38:0x005f, B:40:0x0065, B:44:0x006e, B:64:0x00b9, B:16:0x0026, B:18:0x0030), top: B:69:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:3:0x0002, B:5:0x0009, B:7:0x0011, B:9:0x0019, B:20:0x0036, B:22:0x003e, B:24:0x0044, B:30:0x0050, B:32:0x0054, B:45:0x0071, B:47:0x0075, B:49:0x007b, B:51:0x0091, B:53:0x0099, B:55:0x009d, B:56:0x00a0, B:58:0x00a4, B:60:0x00ac, B:63:0x00b1, B:36:0x005b, B:38:0x005f, B:40:0x0065, B:44:0x006e, B:64:0x00b9, B:16:0x0026, B:18:0x0030), top: B:69:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        String str;
        boolean z10;
        Course courseByName;
        RobertoTextView robertoTextView;
        String str2;
        String courseName;
        AppCompatImageView appCompatImageView;
        try {
            Intent intent = getIntent();
            RobertoTextView robertoTextView2 = null;
            if (intent != null) {
                str = intent.getStringExtra("highlightedActivityCourse");
            } else {
                str = null;
            }
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            boolean z11 = true;
            if (str != null && !n.B0(str)) {
                z10 = false;
                if (z10) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getCurrentCourseName();
                    } else {
                        str = null;
                    }
                }
                courseByName = firebasePersistence.getCourseByName(str);
                this.f10844y = courseByName;
                if (courseByName != null) {
                    ArrayList<SuggestedActivityModel> planSuggested = courseByName.getPlanSuggested();
                    if (planSuggested != null && !planSuggested.isEmpty()) {
                        z11 = false;
                    }
                    i iVar = this.P;
                    if (iVar != null) {
                        robertoTextView = iVar.f38818n;
                    } else {
                        robertoTextView = null;
                    }
                    if (robertoTextView != null) {
                        Course course = this.f10844y;
                        if (course != null) {
                            str2 = course.getCourseName();
                        } else {
                            str2 = null;
                        }
                        String courseDisplayName = Constants.getCourseDisplayName(str2);
                        if (courseDisplayName == null) {
                            courseDisplayName = "";
                        }
                        robertoTextView.setText(courseDisplayName);
                    }
                    Course course2 = this.f10844y;
                    if (course2 != null && (courseName = course2.getCourseName()) != null) {
                        LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
                        this.f10845z = s5.f(courseName);
                        LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
                        Integer i6 = s5.i(courseName);
                        if (i6 != null) {
                            int intValue = i6.intValue();
                            i iVar2 = this.P;
                            if (iVar2 != null && (appCompatImageView = iVar2.f38819o) != null) {
                                appCompatImageView.setImageResource(intValue);
                            }
                        }
                        Integer num = this.f10845z;
                        if (num != null) {
                            int intValue2 = num.intValue();
                            i iVar3 = this.P;
                            if (iVar3 != null) {
                                robertoTextView2 = iVar3.f38820p;
                            }
                            if (robertoTextView2 != null) {
                                robertoTextView2.setBackgroundTintList(g0.a.c(intValue2, this));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                Toast.makeText(this, getString(R.string.telecommunicationsError), 0).show();
                finish();
            }
            z10 = true;
            if (z10) {
            }
            courseByName = firebasePersistence.getCourseByName(str);
            this.f10844y = courseByName;
            if (courseByName != null) {
            }
            Toast.makeText(this, getString(R.string.telecommunicationsError), 0).show();
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10842w, e10);
        }
    }
}
