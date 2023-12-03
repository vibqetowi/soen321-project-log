package an;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import cn.j0;
import com.bumptech.glide.Glide;
import com.google.android.material.chip.ChipGroup;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import t0.u0;
/* compiled from: LibraryShortCourseDetailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan/d0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d0 extends Fragment {
    public static final /* synthetic */ int N = 0;
    public j0 A;
    public boolean B;
    public boolean C;
    public int E;
    public int F;
    public String G;
    public AnimatorSet H;
    public final boolean J;
    public final androidx.activity.result.c<Intent> K;
    public final androidx.activity.result.c<Intent> L;

    /* renamed from: v  reason: collision with root package name */
    public MiniCourse f689v;

    /* renamed from: w  reason: collision with root package name */
    public MiniCourseMetadata f690w;

    /* renamed from: y  reason: collision with root package name */
    public CourseDayModelV1 f692y;
    public final LinkedHashMap M = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f688u = LogHelper.INSTANCE.makeLogTag(d0.class);

    /* renamed from: x  reason: collision with root package name */
    public int f691x = -1;

    /* renamed from: z  reason: collision with root package name */
    public final cg.a f693z = new cg.a(1);
    public String D = "";
    public String I = "not_started";

    /* compiled from: LibraryShortCourseDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<List<? extends hs.f<? extends String, ? extends UserLibraryItemAccessModel>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ArrayList<CourseDayModelV1> f695v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<CourseDayModelV1> arrayList) {
            super(1);
            this.f695v = arrayList;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends hs.f<? extends String, ? extends UserLibraryItemAccessModel>> list) {
            String str;
            RecyclerView recyclerView;
            String str2;
            boolean z10;
            List<? extends hs.f<? extends String, ? extends UserLibraryItemAccessModel>> list2 = list;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list2.iterator();
                while (true) {
                    str = null;
                    hs.f fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    hs.f fVar2 = (hs.f) it.next();
                    if (fVar2 != null) {
                        str2 = (String) fVar2.f19464u;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        A a10 = fVar2.f19464u;
                        UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) fVar2.f19465v;
                        if (userLibraryItemAccessModel != null) {
                            z10 = userLibraryItemAccessModel.isFavourite();
                        } else {
                            z10 = false;
                        }
                        fVar = new hs.f(a10, Boolean.valueOf(z10));
                    }
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                d0 d0Var = d0.this;
                d0Var.getClass();
                ArrayList<CourseDayModelV1> dayPlanList = this.f695v;
                kotlin.jvm.internal.i.g(dayPlanList, "dayPlanList");
                boolean z11 = d0Var.J;
                androidx.fragment.app.p requireActivity = d0Var.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                ((RecyclerView) d0Var._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).setAdapter(new zm.m(dayPlanList, arrayList2, z11, requireActivity, new e0(d0Var), new f0(d0Var)));
                String str3 = d0Var.G;
                if (str3 != null) {
                    if (!gv.n.B0(str3)) {
                        str = str3;
                    }
                    if (str != null && (recyclerView = (RecyclerView) d0Var._$_findCachedViewById(R.id.rvShortCoursesDayPlan)) != null) {
                        recyclerView.post(new ni.c(dayPlanList, d0Var, str));
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Integer.valueOf(((String) t3).length()), Integer.valueOf(((String) t10).length()));
        }
    }

    public d0() {
        boolean z10;
        boolean z11;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            HashMap<String, Object> appConfig = user.getAppConfig();
            if (appConfig != null && appConfig.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && !kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                z10 = true;
                this.J = z10;
                androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.b0

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ d0 f679v;

                    {
                        this.f679v = this;
                    }

                    @Override // androidx.activity.result.b
                    public final void b(Object obj) {
                        Bundle bundle;
                        String str;
                        ArrayList<MiniCourse> topicalCourseList;
                        Object obj2;
                        ArrayList<MiniCourse> topicalCourseList2;
                        Object obj3;
                        ArrayList<CourseDayModelV1> plan;
                        Object obj4;
                        String str2;
                        String domain;
                        CourseDayModelV1 courseDayModelV1;
                        String content_id;
                        String str3;
                        boolean z12;
                        Boolean isFree;
                        ArrayList<MiniCourse> miniCourses;
                        Object obj5;
                        ArrayList<MiniCourse> miniCourses2;
                        Object obj6;
                        ArrayList<CourseDayModelV1> plan2;
                        Object obj7;
                        String str4;
                        int i6 = r2;
                        d0 this$0 = this.f679v;
                        switch (i6) {
                            case 0:
                                androidx.activity.result.a result = (androidx.activity.result.a) obj;
                                int i10 = d0.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(result, "result");
                                try {
                                    bundle = new Bundle();
                                    bundle.putString("miniCourse", this$0.J().getName());
                                    CourseDayModelV1 courseDayModelV12 = this$0.f692y;
                                    if (courseDayModelV12 != null) {
                                        str = courseDayModelV12.getContent_id();
                                    } else {
                                        str = null;
                                    }
                                    bundle.putString("activity_id", str);
                                    bundle.putInt("activity_position", this$0.f691x);
                                    bundle.putString("miniCourse_chip", this$0.D);
                                    bundle.putInt("miniCourse_position_in_list", this$0.F);
                                    bundle.putInt("miniCourse_progress", this$0.E);
                                    bundle.putString("source", "lib_short_course");
                                    bundle.putBoolean("paid_miniCourse", this$0.C);
                                    bundle.putBoolean("isTopicalCourse", this$0.B);
                                    bundle.putString("status_of_activity_when_clicked", this$0.I);
                                    bundle.putString("source", "lib_short_course");
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f688u, e10);
                                    return;
                                }
                                if (result.f976u == -1) {
                                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                                    boolean z13 = true;
                                    ((LibraryActivity) requireActivity).A = true;
                                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                                    ((LibraryActivity) requireActivity2).B = true;
                                    if (!this$0.B) {
                                        User user2 = FirebasePersistence.getInstance().getUser();
                                        if (user2 != null && (miniCourses2 = user2.getMiniCourses()) != null) {
                                            Iterator<T> it = miniCourses2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj6 = it.next();
                                                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj6).getDomain(), this$0.K().getDomain())) {
                                                    }
                                                } else {
                                                    obj6 = null;
                                                }
                                            }
                                            MiniCourse miniCourse = (MiniCourse) obj6;
                                            if (miniCourse != null && (plan2 = miniCourse.getPlan()) != null) {
                                                Iterator<T> it2 = plan2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        obj7 = it2.next();
                                                        String content_id2 = ((CourseDayModelV1) obj7).getContent_id();
                                                        CourseDayModelV1 courseDayModelV13 = this$0.f692y;
                                                        if (courseDayModelV13 != null) {
                                                            str4 = courseDayModelV13.getContent_id();
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        if (kotlin.jvm.internal.i.b(content_id2, str4)) {
                                                        }
                                                    } else {
                                                        obj7 = null;
                                                    }
                                                }
                                                CourseDayModelV1 courseDayModelV14 = (CourseDayModelV1) obj7;
                                                if (courseDayModelV14 != null && !courseDayModelV14.isCompleted()) {
                                                    courseDayModelV14.setCompleted(true);
                                                    FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                                }
                                            }
                                        }
                                        User user3 = FirebasePersistence.getInstance().getUser();
                                        if (user3 != null && (miniCourses = user3.getMiniCourses()) != null) {
                                            Iterator<T> it3 = miniCourses.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    obj5 = it3.next();
                                                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj5).getDomain(), this$0.K().getDomain())) {
                                                    }
                                                } else {
                                                    obj5 = null;
                                                }
                                            }
                                            MiniCourse miniCourse2 = (MiniCourse) obj5;
                                            if (miniCourse2 != null) {
                                                this$0.f689v = miniCourse2;
                                            }
                                        }
                                        RecyclerView.e adapter = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                                        kotlin.jvm.internal.i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                                        zm.m mVar = (zm.m) adapter;
                                        ArrayList<CourseDayModelV1> plan3 = this$0.K().getPlan();
                                        kotlin.jvm.internal.i.e(plan3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                                        try {
                                            mVar.f39670x = plan3;
                                            mVar.i();
                                        } catch (Exception e11) {
                                            LogHelper.INSTANCE.e(mVar.E, e11);
                                        }
                                        gk.a.b(bundle, "mini_activity_finish");
                                        if (this$0.A == null && (domain = this$0.K().getDomain()) != null && (courseDayModelV1 = this$0.f692y) != null && (content_id = courseDayModelV1.getContent_id()) != null) {
                                            j0 j0Var = this$0.A;
                                            if (j0Var != null) {
                                                CourseDayModelV1 courseDayModelV15 = this$0.f692y;
                                                if (courseDayModelV15 != null) {
                                                    str3 = courseDayModelV15.getContent_label();
                                                } else {
                                                    str3 = null;
                                                }
                                                kotlin.jvm.internal.i.d(str3);
                                                if (this$0.f690w != null && (isFree = this$0.J().isFree()) != null) {
                                                    z12 = isFree.booleanValue();
                                                } else {
                                                    z12 = true;
                                                }
                                                try {
                                                    if (content_id.length() != 0) {
                                                        z13 = false;
                                                    }
                                                    if (!z13) {
                                                        ta.v.H(kc.f.H(j0Var), null, 0, new cn.b0(j0Var, content_id, str3, true, domain, z12, null), 3);
                                                        return;
                                                    }
                                                    return;
                                                } catch (Exception e12) {
                                                    LogHelper.INSTANCE.e(j0Var.f5582y, e12);
                                                    return;
                                                }
                                            }
                                            kotlin.jvm.internal.i.q("libraryShortCoursesViewModel");
                                            throw null;
                                        }
                                        return;
                                    }
                                    User user4 = FirebasePersistence.getInstance().getUser();
                                    if (user4 != null && (topicalCourseList2 = user4.getTopicalCourseList()) != null) {
                                        Iterator<T> it4 = topicalCourseList2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj3 = it4.next();
                                                if (kotlin.jvm.internal.i.b(((MiniCourse) obj3).getDomain(), this$0.K().getDomain())) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        MiniCourse miniCourse3 = (MiniCourse) obj3;
                                        if (miniCourse3 != null && (plan = miniCourse3.getPlan()) != null) {
                                            Iterator<T> it5 = plan.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj4 = it5.next();
                                                    String content_id3 = ((CourseDayModelV1) obj4).getContent_id();
                                                    CourseDayModelV1 courseDayModelV16 = this$0.f692y;
                                                    if (courseDayModelV16 != null) {
                                                        str2 = courseDayModelV16.getContent_id();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (kotlin.jvm.internal.i.b(content_id3, str2)) {
                                                    }
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                            CourseDayModelV1 courseDayModelV17 = (CourseDayModelV1) obj4;
                                            if (courseDayModelV17 != null && !courseDayModelV17.isCompleted()) {
                                                courseDayModelV17.setCompleted(true);
                                                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                                FirebasePersistence.getInstance().updateUserOnFirebase();
                                            }
                                        }
                                    }
                                    User user5 = FirebasePersistence.getInstance().getUser();
                                    if (user5 != null && (topicalCourseList = user5.getTopicalCourseList()) != null) {
                                        Iterator<T> it6 = topicalCourseList.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj2 = it6.next();
                                                if (kotlin.jvm.internal.i.b(((MiniCourse) obj2).getDomain(), this$0.K().getDomain())) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        MiniCourse miniCourse4 = (MiniCourse) obj2;
                                        if (miniCourse4 != null) {
                                            this$0.f689v = miniCourse4;
                                        }
                                    }
                                    RecyclerView.e adapter2 = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                                    kotlin.jvm.internal.i.e(adapter2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                                    zm.m mVar2 = (zm.m) adapter2;
                                    ArrayList<CourseDayModelV1> plan4 = this$0.K().getPlan();
                                    kotlin.jvm.internal.i.e(plan4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                                    try {
                                        mVar2.f39670x = plan4;
                                        mVar2.i();
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(mVar2.E, e13);
                                    }
                                    gk.a.b(bundle, "mini_activity_finish");
                                    if (this$0.A == null) {
                                        return;
                                    }
                                    return;
                                    LogHelper.INSTANCE.e(this$0.f688u, e10);
                                    return;
                                }
                                gk.a.b(bundle, "mini_activity_incomplete");
                                return;
                            default:
                                androidx.activity.result.a result2 = (androidx.activity.result.a) obj;
                                int i11 = d0.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(result2, "result");
                                try {
                                    if (result2.f976u == -1) {
                                        this$0.I();
                                        return;
                                    }
                                    return;
                                } catch (Exception e14) {
                                    LogHelper.INSTANCE.e(this$0.f688u, e14);
                                    return;
                                }
                        }
                    }
                });
                kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…ivityResult(result)\n    }");
                this.K = registerForActivityResult;
                androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.b0

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ d0 f679v;

                    {
                        this.f679v = this;
                    }

                    @Override // androidx.activity.result.b
                    public final void b(Object obj) {
                        Bundle bundle;
                        String str;
                        ArrayList<MiniCourse> topicalCourseList;
                        Object obj2;
                        ArrayList<MiniCourse> topicalCourseList2;
                        Object obj3;
                        ArrayList<CourseDayModelV1> plan;
                        Object obj4;
                        String str2;
                        String domain;
                        CourseDayModelV1 courseDayModelV1;
                        String content_id;
                        String str3;
                        boolean z12;
                        Boolean isFree;
                        ArrayList<MiniCourse> miniCourses;
                        Object obj5;
                        ArrayList<MiniCourse> miniCourses2;
                        Object obj6;
                        ArrayList<CourseDayModelV1> plan2;
                        Object obj7;
                        String str4;
                        int i6 = r2;
                        d0 this$0 = this.f679v;
                        switch (i6) {
                            case 0:
                                androidx.activity.result.a result = (androidx.activity.result.a) obj;
                                int i10 = d0.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(result, "result");
                                try {
                                    bundle = new Bundle();
                                    bundle.putString("miniCourse", this$0.J().getName());
                                    CourseDayModelV1 courseDayModelV12 = this$0.f692y;
                                    if (courseDayModelV12 != null) {
                                        str = courseDayModelV12.getContent_id();
                                    } else {
                                        str = null;
                                    }
                                    bundle.putString("activity_id", str);
                                    bundle.putInt("activity_position", this$0.f691x);
                                    bundle.putString("miniCourse_chip", this$0.D);
                                    bundle.putInt("miniCourse_position_in_list", this$0.F);
                                    bundle.putInt("miniCourse_progress", this$0.E);
                                    bundle.putString("source", "lib_short_course");
                                    bundle.putBoolean("paid_miniCourse", this$0.C);
                                    bundle.putBoolean("isTopicalCourse", this$0.B);
                                    bundle.putString("status_of_activity_when_clicked", this$0.I);
                                    bundle.putString("source", "lib_short_course");
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f688u, e10);
                                    return;
                                }
                                if (result.f976u == -1) {
                                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                                    boolean z13 = true;
                                    ((LibraryActivity) requireActivity).A = true;
                                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                                    ((LibraryActivity) requireActivity2).B = true;
                                    if (!this$0.B) {
                                        User user2 = FirebasePersistence.getInstance().getUser();
                                        if (user2 != null && (miniCourses2 = user2.getMiniCourses()) != null) {
                                            Iterator<T> it = miniCourses2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj6 = it.next();
                                                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj6).getDomain(), this$0.K().getDomain())) {
                                                    }
                                                } else {
                                                    obj6 = null;
                                                }
                                            }
                                            MiniCourse miniCourse = (MiniCourse) obj6;
                                            if (miniCourse != null && (plan2 = miniCourse.getPlan()) != null) {
                                                Iterator<T> it2 = plan2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        obj7 = it2.next();
                                                        String content_id2 = ((CourseDayModelV1) obj7).getContent_id();
                                                        CourseDayModelV1 courseDayModelV13 = this$0.f692y;
                                                        if (courseDayModelV13 != null) {
                                                            str4 = courseDayModelV13.getContent_id();
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        if (kotlin.jvm.internal.i.b(content_id2, str4)) {
                                                        }
                                                    } else {
                                                        obj7 = null;
                                                    }
                                                }
                                                CourseDayModelV1 courseDayModelV14 = (CourseDayModelV1) obj7;
                                                if (courseDayModelV14 != null && !courseDayModelV14.isCompleted()) {
                                                    courseDayModelV14.setCompleted(true);
                                                    FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                                }
                                            }
                                        }
                                        User user3 = FirebasePersistence.getInstance().getUser();
                                        if (user3 != null && (miniCourses = user3.getMiniCourses()) != null) {
                                            Iterator<T> it3 = miniCourses.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    obj5 = it3.next();
                                                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj5).getDomain(), this$0.K().getDomain())) {
                                                    }
                                                } else {
                                                    obj5 = null;
                                                }
                                            }
                                            MiniCourse miniCourse2 = (MiniCourse) obj5;
                                            if (miniCourse2 != null) {
                                                this$0.f689v = miniCourse2;
                                            }
                                        }
                                        RecyclerView.e adapter = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                                        kotlin.jvm.internal.i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                                        zm.m mVar = (zm.m) adapter;
                                        ArrayList<CourseDayModelV1> plan3 = this$0.K().getPlan();
                                        kotlin.jvm.internal.i.e(plan3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                                        try {
                                            mVar.f39670x = plan3;
                                            mVar.i();
                                        } catch (Exception e11) {
                                            LogHelper.INSTANCE.e(mVar.E, e11);
                                        }
                                        gk.a.b(bundle, "mini_activity_finish");
                                        if (this$0.A == null && (domain = this$0.K().getDomain()) != null && (courseDayModelV1 = this$0.f692y) != null && (content_id = courseDayModelV1.getContent_id()) != null) {
                                            j0 j0Var = this$0.A;
                                            if (j0Var != null) {
                                                CourseDayModelV1 courseDayModelV15 = this$0.f692y;
                                                if (courseDayModelV15 != null) {
                                                    str3 = courseDayModelV15.getContent_label();
                                                } else {
                                                    str3 = null;
                                                }
                                                kotlin.jvm.internal.i.d(str3);
                                                if (this$0.f690w != null && (isFree = this$0.J().isFree()) != null) {
                                                    z12 = isFree.booleanValue();
                                                } else {
                                                    z12 = true;
                                                }
                                                try {
                                                    if (content_id.length() != 0) {
                                                        z13 = false;
                                                    }
                                                    if (!z13) {
                                                        ta.v.H(kc.f.H(j0Var), null, 0, new cn.b0(j0Var, content_id, str3, true, domain, z12, null), 3);
                                                        return;
                                                    }
                                                    return;
                                                } catch (Exception e12) {
                                                    LogHelper.INSTANCE.e(j0Var.f5582y, e12);
                                                    return;
                                                }
                                            }
                                            kotlin.jvm.internal.i.q("libraryShortCoursesViewModel");
                                            throw null;
                                        }
                                        return;
                                    }
                                    User user4 = FirebasePersistence.getInstance().getUser();
                                    if (user4 != null && (topicalCourseList2 = user4.getTopicalCourseList()) != null) {
                                        Iterator<T> it4 = topicalCourseList2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj3 = it4.next();
                                                if (kotlin.jvm.internal.i.b(((MiniCourse) obj3).getDomain(), this$0.K().getDomain())) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        MiniCourse miniCourse3 = (MiniCourse) obj3;
                                        if (miniCourse3 != null && (plan = miniCourse3.getPlan()) != null) {
                                            Iterator<T> it5 = plan.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj4 = it5.next();
                                                    String content_id3 = ((CourseDayModelV1) obj4).getContent_id();
                                                    CourseDayModelV1 courseDayModelV16 = this$0.f692y;
                                                    if (courseDayModelV16 != null) {
                                                        str2 = courseDayModelV16.getContent_id();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (kotlin.jvm.internal.i.b(content_id3, str2)) {
                                                    }
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                            CourseDayModelV1 courseDayModelV17 = (CourseDayModelV1) obj4;
                                            if (courseDayModelV17 != null && !courseDayModelV17.isCompleted()) {
                                                courseDayModelV17.setCompleted(true);
                                                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                                FirebasePersistence.getInstance().updateUserOnFirebase();
                                            }
                                        }
                                    }
                                    User user5 = FirebasePersistence.getInstance().getUser();
                                    if (user5 != null && (topicalCourseList = user5.getTopicalCourseList()) != null) {
                                        Iterator<T> it6 = topicalCourseList.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj2 = it6.next();
                                                if (kotlin.jvm.internal.i.b(((MiniCourse) obj2).getDomain(), this$0.K().getDomain())) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        MiniCourse miniCourse4 = (MiniCourse) obj2;
                                        if (miniCourse4 != null) {
                                            this$0.f689v = miniCourse4;
                                        }
                                    }
                                    RecyclerView.e adapter2 = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                                    kotlin.jvm.internal.i.e(adapter2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                                    zm.m mVar2 = (zm.m) adapter2;
                                    ArrayList<CourseDayModelV1> plan4 = this$0.K().getPlan();
                                    kotlin.jvm.internal.i.e(plan4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                                    try {
                                        mVar2.f39670x = plan4;
                                        mVar2.i();
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(mVar2.E, e13);
                                    }
                                    gk.a.b(bundle, "mini_activity_finish");
                                    if (this$0.A == null) {
                                        return;
                                    }
                                    return;
                                    LogHelper.INSTANCE.e(this$0.f688u, e10);
                                    return;
                                }
                                gk.a.b(bundle, "mini_activity_incomplete");
                                return;
                            default:
                                androidx.activity.result.a result2 = (androidx.activity.result.a) obj;
                                int i11 = d0.N;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(result2, "result");
                                try {
                                    if (result2.f976u == -1) {
                                        this$0.I();
                                        return;
                                    }
                                    return;
                                } catch (Exception e14) {
                                    LogHelper.INSTANCE.e(this$0.f688u, e14);
                                    return;
                                }
                        }
                    }
                });
                kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…creenResult(result)\n    }");
                this.L = registerForActivityResult2;
            }
        }
        z10 = false;
        this.J = z10;
        androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.b0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d0 f679v;

            {
                this.f679v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                Bundle bundle;
                String str;
                ArrayList<MiniCourse> topicalCourseList;
                Object obj2;
                ArrayList<MiniCourse> topicalCourseList2;
                Object obj3;
                ArrayList<CourseDayModelV1> plan;
                Object obj4;
                String str2;
                String domain;
                CourseDayModelV1 courseDayModelV1;
                String content_id;
                String str3;
                boolean z12;
                Boolean isFree;
                ArrayList<MiniCourse> miniCourses;
                Object obj5;
                ArrayList<MiniCourse> miniCourses2;
                Object obj6;
                ArrayList<CourseDayModelV1> plan2;
                Object obj7;
                String str4;
                int i6 = r2;
                d0 this$0 = this.f679v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a result = (androidx.activity.result.a) obj;
                        int i10 = d0.N;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.i.f(result, "result");
                        try {
                            bundle = new Bundle();
                            bundle.putString("miniCourse", this$0.J().getName());
                            CourseDayModelV1 courseDayModelV12 = this$0.f692y;
                            if (courseDayModelV12 != null) {
                                str = courseDayModelV12.getContent_id();
                            } else {
                                str = null;
                            }
                            bundle.putString("activity_id", str);
                            bundle.putInt("activity_position", this$0.f691x);
                            bundle.putString("miniCourse_chip", this$0.D);
                            bundle.putInt("miniCourse_position_in_list", this$0.F);
                            bundle.putInt("miniCourse_progress", this$0.E);
                            bundle.putString("source", "lib_short_course");
                            bundle.putBoolean("paid_miniCourse", this$0.C);
                            bundle.putBoolean("isTopicalCourse", this$0.B);
                            bundle.putString("status_of_activity_when_clicked", this$0.I);
                            bundle.putString("source", "lib_short_course");
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f688u, e10);
                            return;
                        }
                        if (result.f976u == -1) {
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                            boolean z13 = true;
                            ((LibraryActivity) requireActivity).A = true;
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                            ((LibraryActivity) requireActivity2).B = true;
                            if (!this$0.B) {
                                User user2 = FirebasePersistence.getInstance().getUser();
                                if (user2 != null && (miniCourses2 = user2.getMiniCourses()) != null) {
                                    Iterator<T> it = miniCourses2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj6 = it.next();
                                            if (kotlin.jvm.internal.i.b(((MiniCourse) obj6).getDomain(), this$0.K().getDomain())) {
                                            }
                                        } else {
                                            obj6 = null;
                                        }
                                    }
                                    MiniCourse miniCourse = (MiniCourse) obj6;
                                    if (miniCourse != null && (plan2 = miniCourse.getPlan()) != null) {
                                        Iterator<T> it2 = plan2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj7 = it2.next();
                                                String content_id2 = ((CourseDayModelV1) obj7).getContent_id();
                                                CourseDayModelV1 courseDayModelV13 = this$0.f692y;
                                                if (courseDayModelV13 != null) {
                                                    str4 = courseDayModelV13.getContent_id();
                                                } else {
                                                    str4 = null;
                                                }
                                                if (kotlin.jvm.internal.i.b(content_id2, str4)) {
                                                }
                                            } else {
                                                obj7 = null;
                                            }
                                        }
                                        CourseDayModelV1 courseDayModelV14 = (CourseDayModelV1) obj7;
                                        if (courseDayModelV14 != null && !courseDayModelV14.isCompleted()) {
                                            courseDayModelV14.setCompleted(true);
                                            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                            FirebasePersistence.getInstance().updateUserOnFirebase();
                                        }
                                    }
                                }
                                User user3 = FirebasePersistence.getInstance().getUser();
                                if (user3 != null && (miniCourses = user3.getMiniCourses()) != null) {
                                    Iterator<T> it3 = miniCourses.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj5 = it3.next();
                                            if (kotlin.jvm.internal.i.b(((MiniCourse) obj5).getDomain(), this$0.K().getDomain())) {
                                            }
                                        } else {
                                            obj5 = null;
                                        }
                                    }
                                    MiniCourse miniCourse2 = (MiniCourse) obj5;
                                    if (miniCourse2 != null) {
                                        this$0.f689v = miniCourse2;
                                    }
                                }
                                RecyclerView.e adapter = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                                kotlin.jvm.internal.i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                                zm.m mVar = (zm.m) adapter;
                                ArrayList<CourseDayModelV1> plan3 = this$0.K().getPlan();
                                kotlin.jvm.internal.i.e(plan3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                                try {
                                    mVar.f39670x = plan3;
                                    mVar.i();
                                } catch (Exception e11) {
                                    LogHelper.INSTANCE.e(mVar.E, e11);
                                }
                                gk.a.b(bundle, "mini_activity_finish");
                                if (this$0.A == null && (domain = this$0.K().getDomain()) != null && (courseDayModelV1 = this$0.f692y) != null && (content_id = courseDayModelV1.getContent_id()) != null) {
                                    j0 j0Var = this$0.A;
                                    if (j0Var != null) {
                                        CourseDayModelV1 courseDayModelV15 = this$0.f692y;
                                        if (courseDayModelV15 != null) {
                                            str3 = courseDayModelV15.getContent_label();
                                        } else {
                                            str3 = null;
                                        }
                                        kotlin.jvm.internal.i.d(str3);
                                        if (this$0.f690w != null && (isFree = this$0.J().isFree()) != null) {
                                            z12 = isFree.booleanValue();
                                        } else {
                                            z12 = true;
                                        }
                                        try {
                                            if (content_id.length() != 0) {
                                                z13 = false;
                                            }
                                            if (!z13) {
                                                ta.v.H(kc.f.H(j0Var), null, 0, new cn.b0(j0Var, content_id, str3, true, domain, z12, null), 3);
                                                return;
                                            }
                                            return;
                                        } catch (Exception e12) {
                                            LogHelper.INSTANCE.e(j0Var.f5582y, e12);
                                            return;
                                        }
                                    }
                                    kotlin.jvm.internal.i.q("libraryShortCoursesViewModel");
                                    throw null;
                                }
                                return;
                            }
                            User user4 = FirebasePersistence.getInstance().getUser();
                            if (user4 != null && (topicalCourseList2 = user4.getTopicalCourseList()) != null) {
                                Iterator<T> it4 = topicalCourseList2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj3 = it4.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj3).getDomain(), this$0.K().getDomain())) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                MiniCourse miniCourse3 = (MiniCourse) obj3;
                                if (miniCourse3 != null && (plan = miniCourse3.getPlan()) != null) {
                                    Iterator<T> it5 = plan.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj4 = it5.next();
                                            String content_id3 = ((CourseDayModelV1) obj4).getContent_id();
                                            CourseDayModelV1 courseDayModelV16 = this$0.f692y;
                                            if (courseDayModelV16 != null) {
                                                str2 = courseDayModelV16.getContent_id();
                                            } else {
                                                str2 = null;
                                            }
                                            if (kotlin.jvm.internal.i.b(content_id3, str2)) {
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    CourseDayModelV1 courseDayModelV17 = (CourseDayModelV1) obj4;
                                    if (courseDayModelV17 != null && !courseDayModelV17.isCompleted()) {
                                        courseDayModelV17.setCompleted(true);
                                        FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                        FirebasePersistence.getInstance().updateUserOnFirebase();
                                    }
                                }
                            }
                            User user5 = FirebasePersistence.getInstance().getUser();
                            if (user5 != null && (topicalCourseList = user5.getTopicalCourseList()) != null) {
                                Iterator<T> it6 = topicalCourseList.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj2 = it6.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj2).getDomain(), this$0.K().getDomain())) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                MiniCourse miniCourse4 = (MiniCourse) obj2;
                                if (miniCourse4 != null) {
                                    this$0.f689v = miniCourse4;
                                }
                            }
                            RecyclerView.e adapter2 = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                            kotlin.jvm.internal.i.e(adapter2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                            zm.m mVar2 = (zm.m) adapter2;
                            ArrayList<CourseDayModelV1> plan4 = this$0.K().getPlan();
                            kotlin.jvm.internal.i.e(plan4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                            try {
                                mVar2.f39670x = plan4;
                                mVar2.i();
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(mVar2.E, e13);
                            }
                            gk.a.b(bundle, "mini_activity_finish");
                            if (this$0.A == null) {
                                return;
                            }
                            return;
                            LogHelper.INSTANCE.e(this$0.f688u, e10);
                            return;
                        }
                        gk.a.b(bundle, "mini_activity_incomplete");
                        return;
                    default:
                        androidx.activity.result.a result2 = (androidx.activity.result.a) obj;
                        int i11 = d0.N;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.i.f(result2, "result");
                        try {
                            if (result2.f976u == -1) {
                                this$0.I();
                                return;
                            }
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f688u, e14);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…ivityResult(result)\n    }");
        this.K = registerForActivityResult3;
        androidx.activity.result.c<Intent> registerForActivityResult22 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.b0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d0 f679v;

            {
                this.f679v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                Bundle bundle;
                String str;
                ArrayList<MiniCourse> topicalCourseList;
                Object obj2;
                ArrayList<MiniCourse> topicalCourseList2;
                Object obj3;
                ArrayList<CourseDayModelV1> plan;
                Object obj4;
                String str2;
                String domain;
                CourseDayModelV1 courseDayModelV1;
                String content_id;
                String str3;
                boolean z12;
                Boolean isFree;
                ArrayList<MiniCourse> miniCourses;
                Object obj5;
                ArrayList<MiniCourse> miniCourses2;
                Object obj6;
                ArrayList<CourseDayModelV1> plan2;
                Object obj7;
                String str4;
                int i6 = r2;
                d0 this$0 = this.f679v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a result = (androidx.activity.result.a) obj;
                        int i10 = d0.N;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.i.f(result, "result");
                        try {
                            bundle = new Bundle();
                            bundle.putString("miniCourse", this$0.J().getName());
                            CourseDayModelV1 courseDayModelV12 = this$0.f692y;
                            if (courseDayModelV12 != null) {
                                str = courseDayModelV12.getContent_id();
                            } else {
                                str = null;
                            }
                            bundle.putString("activity_id", str);
                            bundle.putInt("activity_position", this$0.f691x);
                            bundle.putString("miniCourse_chip", this$0.D);
                            bundle.putInt("miniCourse_position_in_list", this$0.F);
                            bundle.putInt("miniCourse_progress", this$0.E);
                            bundle.putString("source", "lib_short_course");
                            bundle.putBoolean("paid_miniCourse", this$0.C);
                            bundle.putBoolean("isTopicalCourse", this$0.B);
                            bundle.putString("status_of_activity_when_clicked", this$0.I);
                            bundle.putString("source", "lib_short_course");
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f688u, e10);
                            return;
                        }
                        if (result.f976u == -1) {
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                            boolean z13 = true;
                            ((LibraryActivity) requireActivity).A = true;
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                            ((LibraryActivity) requireActivity2).B = true;
                            if (!this$0.B) {
                                User user2 = FirebasePersistence.getInstance().getUser();
                                if (user2 != null && (miniCourses2 = user2.getMiniCourses()) != null) {
                                    Iterator<T> it = miniCourses2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj6 = it.next();
                                            if (kotlin.jvm.internal.i.b(((MiniCourse) obj6).getDomain(), this$0.K().getDomain())) {
                                            }
                                        } else {
                                            obj6 = null;
                                        }
                                    }
                                    MiniCourse miniCourse = (MiniCourse) obj6;
                                    if (miniCourse != null && (plan2 = miniCourse.getPlan()) != null) {
                                        Iterator<T> it2 = plan2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj7 = it2.next();
                                                String content_id2 = ((CourseDayModelV1) obj7).getContent_id();
                                                CourseDayModelV1 courseDayModelV13 = this$0.f692y;
                                                if (courseDayModelV13 != null) {
                                                    str4 = courseDayModelV13.getContent_id();
                                                } else {
                                                    str4 = null;
                                                }
                                                if (kotlin.jvm.internal.i.b(content_id2, str4)) {
                                                }
                                            } else {
                                                obj7 = null;
                                            }
                                        }
                                        CourseDayModelV1 courseDayModelV14 = (CourseDayModelV1) obj7;
                                        if (courseDayModelV14 != null && !courseDayModelV14.isCompleted()) {
                                            courseDayModelV14.setCompleted(true);
                                            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                            FirebasePersistence.getInstance().updateUserOnFirebase();
                                        }
                                    }
                                }
                                User user3 = FirebasePersistence.getInstance().getUser();
                                if (user3 != null && (miniCourses = user3.getMiniCourses()) != null) {
                                    Iterator<T> it3 = miniCourses.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj5 = it3.next();
                                            if (kotlin.jvm.internal.i.b(((MiniCourse) obj5).getDomain(), this$0.K().getDomain())) {
                                            }
                                        } else {
                                            obj5 = null;
                                        }
                                    }
                                    MiniCourse miniCourse2 = (MiniCourse) obj5;
                                    if (miniCourse2 != null) {
                                        this$0.f689v = miniCourse2;
                                    }
                                }
                                RecyclerView.e adapter = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                                kotlin.jvm.internal.i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                                zm.m mVar = (zm.m) adapter;
                                ArrayList<CourseDayModelV1> plan3 = this$0.K().getPlan();
                                kotlin.jvm.internal.i.e(plan3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                                try {
                                    mVar.f39670x = plan3;
                                    mVar.i();
                                } catch (Exception e11) {
                                    LogHelper.INSTANCE.e(mVar.E, e11);
                                }
                                gk.a.b(bundle, "mini_activity_finish");
                                if (this$0.A == null && (domain = this$0.K().getDomain()) != null && (courseDayModelV1 = this$0.f692y) != null && (content_id = courseDayModelV1.getContent_id()) != null) {
                                    j0 j0Var = this$0.A;
                                    if (j0Var != null) {
                                        CourseDayModelV1 courseDayModelV15 = this$0.f692y;
                                        if (courseDayModelV15 != null) {
                                            str3 = courseDayModelV15.getContent_label();
                                        } else {
                                            str3 = null;
                                        }
                                        kotlin.jvm.internal.i.d(str3);
                                        if (this$0.f690w != null && (isFree = this$0.J().isFree()) != null) {
                                            z12 = isFree.booleanValue();
                                        } else {
                                            z12 = true;
                                        }
                                        try {
                                            if (content_id.length() != 0) {
                                                z13 = false;
                                            }
                                            if (!z13) {
                                                ta.v.H(kc.f.H(j0Var), null, 0, new cn.b0(j0Var, content_id, str3, true, domain, z12, null), 3);
                                                return;
                                            }
                                            return;
                                        } catch (Exception e12) {
                                            LogHelper.INSTANCE.e(j0Var.f5582y, e12);
                                            return;
                                        }
                                    }
                                    kotlin.jvm.internal.i.q("libraryShortCoursesViewModel");
                                    throw null;
                                }
                                return;
                            }
                            User user4 = FirebasePersistence.getInstance().getUser();
                            if (user4 != null && (topicalCourseList2 = user4.getTopicalCourseList()) != null) {
                                Iterator<T> it4 = topicalCourseList2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj3 = it4.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj3).getDomain(), this$0.K().getDomain())) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                MiniCourse miniCourse3 = (MiniCourse) obj3;
                                if (miniCourse3 != null && (plan = miniCourse3.getPlan()) != null) {
                                    Iterator<T> it5 = plan.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj4 = it5.next();
                                            String content_id3 = ((CourseDayModelV1) obj4).getContent_id();
                                            CourseDayModelV1 courseDayModelV16 = this$0.f692y;
                                            if (courseDayModelV16 != null) {
                                                str2 = courseDayModelV16.getContent_id();
                                            } else {
                                                str2 = null;
                                            }
                                            if (kotlin.jvm.internal.i.b(content_id3, str2)) {
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    CourseDayModelV1 courseDayModelV17 = (CourseDayModelV1) obj4;
                                    if (courseDayModelV17 != null && !courseDayModelV17.isCompleted()) {
                                        courseDayModelV17.setCompleted(true);
                                        FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, this$0.K().getCourse()));
                                        FirebasePersistence.getInstance().updateUserOnFirebase();
                                    }
                                }
                            }
                            User user5 = FirebasePersistence.getInstance().getUser();
                            if (user5 != null && (topicalCourseList = user5.getTopicalCourseList()) != null) {
                                Iterator<T> it6 = topicalCourseList.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj2 = it6.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj2).getDomain(), this$0.K().getDomain())) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                MiniCourse miniCourse4 = (MiniCourse) obj2;
                                if (miniCourse4 != null) {
                                    this$0.f689v = miniCourse4;
                                }
                            }
                            RecyclerView.e adapter2 = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvShortCoursesDayPlan)).getAdapter();
                            kotlin.jvm.internal.i.e(adapter2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.adapter.LibraryShortCourseDayPlanAdapter");
                            zm.m mVar2 = (zm.m) adapter2;
                            ArrayList<CourseDayModelV1> plan4 = this$0.K().getPlan();
                            kotlin.jvm.internal.i.e(plan4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                            try {
                                mVar2.f39670x = plan4;
                                mVar2.i();
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(mVar2.E, e13);
                            }
                            gk.a.b(bundle, "mini_activity_finish");
                            if (this$0.A == null) {
                                return;
                            }
                            return;
                            LogHelper.INSTANCE.e(this$0.f688u, e10);
                            return;
                        }
                        gk.a.b(bundle, "mini_activity_incomplete");
                        return;
                    default:
                        androidx.activity.result.a result2 = (androidx.activity.result.a) obj;
                        int i11 = d0.N;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.i.f(result2, "result");
                        try {
                            if (result2.f976u == -1) {
                                this$0.I();
                                return;
                            }
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f688u, e14);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult22, "registerForActivityResul…creenResult(result)\n    }");
        this.L = registerForActivityResult22;
    }

    public static final void F(d0 d0Var) {
        d0Var.getClass();
        try {
            androidx.activity.result.c<Intent> cVar = d0Var.L;
            androidx.fragment.app.p requireActivity = d0Var.requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            cVar.a(tr.r.s(requireActivity, false).putExtra("source", d0Var.J().getName()));
            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_REWARD_SCREEN, false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(d0Var.f688u, e10);
        }
    }

    public final void I() {
        j0 j0Var;
        fd.f fVar;
        String j02;
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str = this.f688u;
        try {
            ((ConstraintLayout) _$_findCachedViewById(R.id.clShortCoursesExpandedView)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: an.c0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d0 f685v;

                {
                    this.f685v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z11;
                    Object obj5;
                    Object obj6;
                    int i6 = r2;
                    d0 this$0 = this.f685v;
                    switch (i6) {
                        case 0:
                            int i10 = d0.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            bundle.putString("miniCourse", this$0.J().getName());
                            bundle.putString("miniCourse_chip", this$0.D);
                            bundle.putInt("miniCourse_position_in_list", this$0.F);
                            bundle.putInt("miniCourse_progress", this$0.E);
                            bundle.putBoolean("paid_miniCourse", this$0.C);
                            bundle.putBoolean("isTopicalCourse", this$0.B);
                            RobertoTextView tvShortCoursesLongDescription = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesLongDescription);
                            kotlin.jvm.internal.i.f(tvShortCoursesLongDescription, "tvShortCoursesLongDescription");
                            if (tvShortCoursesLongDescription.getVisibility() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                gk.a.b(bundle, "lib_course_inside_see_less");
                                HashMap<String, Object> libraryContent = this$0.J().getLibraryContent();
                                if (libraryContent != null && (obj6 = libraryContent.get("libraryCtaMore")) != null) {
                                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandText)).setText((String) obj6);
                                }
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesLongDescription)).setVisibility(8);
                                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandIcon)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 0.0f));
                                return;
                            }
                            gk.a.b(bundle, "lib_course_inside_see_more");
                            HashMap<String, Object> libraryContent2 = this$0.J().getLibraryContent();
                            if (libraryContent2 != null && (obj5 = libraryContent2.get("libraryCtaLess")) != null) {
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandText)).setText((String) obj5);
                            }
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesLongDescription)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandIcon)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                            return;
                        default:
                            int i11 = d0.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("miniCourse", this$0.J().getName());
                            bundle2.putString("miniCourse_chip", this$0.D);
                            bundle2.putInt("miniCourse_position_in_list", this$0.F);
                            bundle2.putInt("miniCourse_progress", this$0.E);
                            bundle2.putBoolean("paid_miniCourse", this$0.C);
                            bundle2.putBoolean("isTopicalCourse", this$0.B);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_course_inside_back_click");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            }));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivShortCoursesBack)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: an.c0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d0 f685v;

                {
                    this.f685v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z11;
                    Object obj5;
                    Object obj6;
                    int i6 = r2;
                    d0 this$0 = this.f685v;
                    switch (i6) {
                        case 0:
                            int i10 = d0.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            bundle.putString("miniCourse", this$0.J().getName());
                            bundle.putString("miniCourse_chip", this$0.D);
                            bundle.putInt("miniCourse_position_in_list", this$0.F);
                            bundle.putInt("miniCourse_progress", this$0.E);
                            bundle.putBoolean("paid_miniCourse", this$0.C);
                            bundle.putBoolean("isTopicalCourse", this$0.B);
                            RobertoTextView tvShortCoursesLongDescription = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesLongDescription);
                            kotlin.jvm.internal.i.f(tvShortCoursesLongDescription, "tvShortCoursesLongDescription");
                            if (tvShortCoursesLongDescription.getVisibility() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                gk.a.b(bundle, "lib_course_inside_see_less");
                                HashMap<String, Object> libraryContent = this$0.J().getLibraryContent();
                                if (libraryContent != null && (obj6 = libraryContent.get("libraryCtaMore")) != null) {
                                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandText)).setText((String) obj6);
                                }
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesLongDescription)).setVisibility(8);
                                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandIcon)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 0.0f));
                                return;
                            }
                            gk.a.b(bundle, "lib_course_inside_see_more");
                            HashMap<String, Object> libraryContent2 = this$0.J().getLibraryContent();
                            if (libraryContent2 != null && (obj5 = libraryContent2.get("libraryCtaLess")) != null) {
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandText)).setText((String) obj5);
                            }
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvShortCoursesLongDescription)).setVisibility(0);
                            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.tvShortCoursesExpandIcon)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                            return;
                        default:
                            int i11 = d0.N;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("miniCourse", this$0.J().getName());
                            bundle2.putString("miniCourse_chip", this$0.D);
                            bundle2.putInt("miniCourse_position_in_list", this$0.F);
                            bundle2.putInt("miniCourse_progress", this$0.E);
                            bundle2.putBoolean("paid_miniCourse", this$0.C);
                            bundle2.putBoolean("isTopicalCourse", this$0.B);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_course_inside_back_click");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            }));
            ArrayList<CourseDayModelV1> dayPlanList = K().getPlan();
            MiniCourseMetadata J = J();
            try {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvShortCoursesTitle)).setText(J.getName());
                HashMap<String, Object> libraryContent = J.getLibraryContent();
                if (libraryContent != null && (obj4 = libraryContent.get("libraryCourseDescription")) != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvShortCoursesShortDescription)).setText((String) obj4);
                }
                HashMap<String, Object> libraryContent2 = J.getLibraryContent();
                if (libraryContent2 != null && (obj3 = libraryContent2.get("libraryCourseLongDescription")) != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvShortCoursesLongDescription)).setText(r0.b.a((String) obj3, 0));
                }
                HashMap<String, Object> libraryContent3 = J.getLibraryContent();
                if (libraryContent3 != null && (obj2 = libraryContent3.get("libraryBanner")) != null) {
                    Glide.i(requireActivity()).p((String) obj2).x(new z4.f()).B((AppCompatImageView) _$_findCachedViewById(R.id.ivShortCoursesBanner));
                }
                HashMap<String, Object> libraryContent4 = J.getLibraryContent();
                if (libraryContent4 != null && libraryContent4.containsKey("libraryFeatures")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    HashMap<String, Object> libraryContent5 = J.getLibraryContent();
                    kotlin.jvm.internal.i.d(libraryContent5);
                    Object obj5 = libraryContent5.get("libraryFeatures");
                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                    ArrayList arrayList = (ArrayList) gv.r.a1((String) obj5, new String[]{","}, 0, 6);
                    if (arrayList.size() > 1) {
                        is.p.P1(arrayList, new b());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String feature = (String) it.next();
                        kotlin.jvm.internal.i.f(feature, "feature");
                        O(feature);
                    }
                }
                HashMap<String, Object> libraryContent6 = J.getLibraryContent();
                if (libraryContent6 != null && (obj = libraryContent6.get("libraryPremiumTag")) != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvShortCoursesPremiumTag)).setText((String) obj);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            if (!kotlin.jvm.internal.i.b(J.isFree(), Boolean.TRUE) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvShortCoursesPremiumTag)).setVisibility(0);
                ((RecyclerView) _$_findCachedViewById(R.id.rvShortCoursesDayPlan)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                ((RecyclerView) _$_findCachedViewById(R.id.rvShortCoursesDayPlan)).suppressLayout(false);
                ((RecyclerView) _$_findCachedViewById(R.id.rvShortCoursesDayPlan)).setNestedScrollingEnabled(true);
                l0 a10 = new o0(this, new jl.b0(new e1(), 6)).a(j0.class);
                j0Var = (j0) a10;
                j0Var.C.e(getViewLifecycleOwner(), new p(12, new a(dayPlanList)));
                kotlin.jvm.internal.i.g(dayPlanList, "dayPlanList");
                fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    ta.v.H(kc.f.H(j0Var), null, 0, new cn.c0(dayPlanList, j0Var, j02, null), 3);
                }
                j0 j0Var2 = (j0) a10;
                kotlin.jvm.internal.i.g(j0Var2, "<set-?>");
                this.A = j0Var2;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvShortCoursesPremiumTag)).setVisibility(8);
            ((RecyclerView) _$_findCachedViewById(R.id.rvShortCoursesDayPlan)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            ((RecyclerView) _$_findCachedViewById(R.id.rvShortCoursesDayPlan)).suppressLayout(false);
            ((RecyclerView) _$_findCachedViewById(R.id.rvShortCoursesDayPlan)).setNestedScrollingEnabled(true);
            l0 a102 = new o0(this, new jl.b0(new e1(), 6)).a(j0.class);
            j0Var = (j0) a102;
            j0Var.C.e(getViewLifecycleOwner(), new p(12, new a(dayPlanList)));
            kotlin.jvm.internal.i.g(dayPlanList, "dayPlanList");
            fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                ta.v.H(kc.f.H(j0Var), null, 0, new cn.c0(dayPlanList, j0Var, j02, null), 3);
            }
            j0 j0Var22 = (j0) a102;
            kotlin.jvm.internal.i.g(j0Var22, "<set-?>");
            this.A = j0Var22;
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final MiniCourseMetadata J() {
        MiniCourseMetadata miniCourseMetadata = this.f690w;
        if (miniCourseMetadata != null) {
            return miniCourseMetadata;
        }
        kotlin.jvm.internal.i.q("mcMetadata");
        throw null;
    }

    public final MiniCourse K() {
        MiniCourse miniCourse = this.f689v;
        if (miniCourse != null) {
            return miniCourse;
        }
        kotlin.jvm.internal.i.q("miniCourse");
        throw null;
    }

    public final Intent M(CourseDayModelV1 courseDay) {
        String str;
        ArrayList<MiniCourse> topicalCourseList;
        Object obj;
        ArrayList<CourseDayModelV1> plan;
        Object obj2;
        ArrayList<MiniCourse> miniCourses;
        Object obj3;
        ArrayList<CourseDayModelV1> plan2;
        Object obj4;
        kotlin.jvm.internal.i.g(courseDay, "courseDay");
        try {
            if (courseDay.getStart_date() == 0) {
                if (!this.B) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (miniCourses = user.getMiniCourses()) != null) {
                        Iterator<T> it = miniCourses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (kotlin.jvm.internal.i.b(((MiniCourse) obj3).getDomain(), K().getDomain())) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        MiniCourse miniCourse = (MiniCourse) obj3;
                        if (miniCourse != null && (plan2 = miniCourse.getPlan()) != null) {
                            Iterator<T> it2 = plan2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj4 = it2.next();
                                    if (kotlin.jvm.internal.i.b(((CourseDayModelV1) obj4).getContent_id(), courseDay.getContent_id())) {
                                        break;
                                    }
                                } else {
                                    obj4 = null;
                                    break;
                                }
                            }
                            CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) obj4;
                            if (courseDayModelV1 != null) {
                                courseDayModelV1.setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                            }
                        }
                    }
                } else {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (topicalCourseList = user2.getTopicalCourseList()) != null) {
                        Iterator<T> it3 = topicalCourseList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), K().getDomain())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        MiniCourse miniCourse2 = (MiniCourse) obj;
                        if (miniCourse2 != null && (plan = miniCourse2.getPlan()) != null) {
                            Iterator<T> it4 = plan.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj2 = it4.next();
                                    if (kotlin.jvm.internal.i.b(((CourseDayModelV1) obj2).getContent_id(), courseDay.getContent_id())) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            CourseDayModelV1 courseDayModelV12 = (CourseDayModelV1) obj2;
                            if (courseDayModelV12 != null) {
                                courseDayModelV12.setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                            }
                        }
                    }
                }
            }
            this.f692y = courseDay;
            Bundle bundle = new Bundle();
            bundle.putString("miniCourse", J().getName());
            CourseDayModelV1 courseDayModelV13 = this.f692y;
            if (courseDayModelV13 != null) {
                str = courseDayModelV13.getContent_id();
            } else {
                str = null;
            }
            bundle.putString("activity_id", str);
            bundle.putInt("activity_position", this.f691x);
            bundle.putString("miniCourse_chip", this.D);
            bundle.putInt("miniCourse_position_in_list", this.F);
            bundle.putInt("miniCourse_progress", this.E);
            bundle.putString("source", "lib_short_course");
            bundle.putBoolean("paid_miniCourse", this.C);
            bundle.putBoolean("isTopicalCourse", this.B);
            bundle.putString("status_of_activity_when_clicked", this.I);
            bundle.putString("source", "lib_short_course");
            gk.a.b(bundle, "basic_activity_start");
            Intent intent = new Intent(requireActivity(), TemplateActivity.class);
            intent.putExtra("day_plan", courseDay);
            intent.putExtra("miniCourse", K().getDomain());
            intent.putExtra("mcCourse", Constants.LIBRARY_GOAL_COURSE);
            intent.putExtra("goalSource", K().getDomain());
            intent.putExtra("showAltFeedback", true);
            intent.putExtra("mcCourseId", Constants.LIBRARY_GOAL_COURSE_ID);
            return intent;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f688u, "exception", e10);
            return null;
        }
    }

    public final void O(String str) {
        try {
            int i6 = bn.a.f4534a;
            ChipGroup featuresChipGroup = (ChipGroup) _$_findCachedViewById(R.id.featuresChipGroup);
            kotlin.jvm.internal.i.f(featuresChipGroup, "featuresChipGroup");
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            ((ChipGroup) _$_findCachedViewById(R.id.featuresChipGroup)).addView(bn.a.d(requireContext, featuresChipGroup, str));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f688u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.M;
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
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("miniCourse");
            kotlin.jvm.internal.i.e(serializable, "null cannot be cast to non-null type com.theinnerhour.b2b.model.MiniCourse");
            this.f689v = (MiniCourse) serializable;
            Serializable serializable2 = arguments.getSerializable("mcMetaData");
            kotlin.jvm.internal.i.e(serializable2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata");
            this.f690w = (MiniCourseMetadata) serializable2;
            String string = arguments.getString("miniCourse_chip", "");
            kotlin.jvm.internal.i.f(string, "it.getString(\"miniCourse_chip\", \"\")");
            this.D = string;
            int i6 = 0;
            this.F = arguments.getInt("miniCourse_position_in_list", 0);
            ArrayList<CourseDayModelV1> plan = K().getPlan();
            Iterator<CourseDayModelV1> it = plan.iterator();
            while (it.hasNext() && it.next().isCompleted()) {
                i6++;
            }
            if (plan.size() <= i6) {
                i6--;
            }
            this.E = i6;
            String domain = K().getDomain();
            if (domain != null) {
                gv.r.J0(domain, "basic");
            }
            this.B = kotlin.jvm.internal.i.b(K().getCourse(), Constants.COURSE_GENERIC);
            this.C = !kotlin.jvm.internal.i.b(J().isFree(), Boolean.TRUE);
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str = arguments2.getString("scroll_and_highlight_id", "");
            } else {
                str = null;
            }
            this.G = str;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_library_short_course_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.M.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Window window = requireActivity().getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                new u0(window.getDecorView(), window).a(true);
            }
            window.setStatusBarColor(g0.a.b(requireActivity(), R.color.login_grey_background));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f688u, "Error in setting custom status bar", e10);
        }
        I();
    }
}
