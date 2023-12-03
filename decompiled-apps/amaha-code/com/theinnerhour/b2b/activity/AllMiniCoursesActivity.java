package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AllMiniCoursesActivity;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.d;
import ek.f;
import is.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
/* compiled from: AllMiniCoursesActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/AllMiniCoursesActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AllMiniCoursesActivity extends a {
    public static final /* synthetic */ int G = 0;
    public MiniCoursesViewModel A;
    public List<MiniCourse> B;
    public ArrayList C;

    /* renamed from: z  reason: collision with root package name */
    public f f10308z;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10305w = LogHelper.INSTANCE.makeLogTag(AllMiniCoursesActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public final int f10306x = 1032;

    /* renamed from: y  reason: collision with root package name */
    public final int f10307y = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
    public final ArrayList<View> D = new ArrayList<>();
    public boolean E = true;

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        MiniCoursesViewModel miniCoursesViewModel = this.A;
        if (miniCoursesViewModel != null) {
            miniCoursesViewModel.k(null);
        } else {
            i.q("miniCourseViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_all_mini_courses);
        try {
            gk.a.b(null, "all_mini_course_list_open");
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.btnBack);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new d(this, 2));
            }
            Window window = getWindow();
            window.setStatusBarColor(g0.a.b(this, R.color.mini_course_progress_background));
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            }
            ((RobertoTextView) u0(R.id.seeAllText)).setOnClickListener(new d(this, 3));
            ((RecyclerView) u0(R.id.mcRecycler)).setFocusable(false);
            v0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10305w, "Error in setting custom status bar", e10);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
            ((RobertoTextView) u0(R.id.continueText)).setVisibility(8);
            ((LinearLayout) u0(R.id.continueContainer)).setVisibility(8);
            ((RobertoTextView) u0(R.id.seeAllText)).setVisibility(8);
            ((RobertoTextView) u0(R.id.tryNewText)).setVisibility(8);
        }
        CardView cardView = (CardView) u0(R.id.unlockCardView);
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.unlockAll);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        CardView cardView2 = (CardView) u0(R.id.unlockCardViewExp);
        if (cardView2 != null) {
            cardView2.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) u0(R.id.unlockAllExp);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            if (b.u(SessionManager.KEY_USERTYPE, "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                if (LocationPersistence.INSTANCE.isIndianUser()) {
                    CardView cardView3 = (CardView) u0(R.id.unlockCardView);
                    if (cardView3 != null) {
                        cardView3.setVisibility(0);
                    }
                    CardView cardView4 = (CardView) u0(R.id.unlockCardView);
                    if (cardView4 != null) {
                        cardView4.setOnClickListener(new d(this, 0));
                        return;
                    }
                    return;
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) u0(R.id.unlockAll);
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(0);
                }
                ConstraintLayout constraintLayout4 = (ConstraintLayout) u0(R.id.unlockAll);
                if (constraintLayout4 != null) {
                    constraintLayout4.setBackgroundResource(R.drawable.ic_subscription_bg_alt);
                }
                ConstraintLayout constraintLayout5 = (ConstraintLayout) u0(R.id.unlockAll);
                if (constraintLayout5 != null) {
                    constraintLayout5.setOnClickListener(new d(this, 1));
                }
            }
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.F;
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

    public final void v0() {
        if (k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION})) {
            MiniCoursesViewModel miniCoursesViewModel = this.A;
            if (miniCoursesViewModel != null) {
                if (miniCoursesViewModel != null) {
                    miniCoursesViewModel.k(null);
                    return;
                } else {
                    i.q("miniCourseViewModel");
                    throw null;
                }
            }
            MiniCoursesViewModel miniCoursesViewModel2 = (MiniCoursesViewModel) new o0(this).a(MiniCoursesViewModel.class);
            this.A = miniCoursesViewModel2;
            if (miniCoursesViewModel2 != null) {
                miniCoursesViewModel2.f11379z.e(this, new x(this) { // from class: dk.e

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ AllMiniCoursesActivity f12914b;

                    {
                        this.f12914b = this;
                    }

                    @Override // androidx.lifecycle.x
                    public final void a(Object obj) {
                        int i6;
                        List<MiniCourse> list;
                        boolean z10;
                        ArrayList arrayList;
                        boolean z11;
                        int i10 = r2;
                        AllMiniCoursesActivity this$0 = this.f12914b;
                        switch (i10) {
                            case 0:
                                List<MiniCourse> it = (List) obj;
                                int i11 = AllMiniCoursesActivity.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(it, "it");
                                this$0.B = it;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : it) {
                                    String domain = ((MiniCourse) obj2).getDomain();
                                    kotlin.jvm.internal.i.d(domain);
                                    if (MiniCourseUtilsKt.getMcDayProgress(domain) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                this$0.getClass();
                                if (arrayList2.isEmpty()) {
                                    ((RobertoTextView) this$0.u0(R.id.continueText)).setVisibility(8);
                                    ((LinearLayout) this$0.u0(R.id.continueContainer)).setVisibility(8);
                                    ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(8);
                                    ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(8);
                                    return;
                                }
                                ((RobertoTextView) this$0.u0(R.id.continueText)).setVisibility(0);
                                ((LinearLayout) this$0.u0(R.id.continueContainer)).setVisibility(0);
                                ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(0);
                                ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(0);
                                ((LinearLayout) this$0.u0(R.id.continueContainer)).removeAllViews();
                                ArrayList<View> arrayList3 = this$0.D;
                                arrayList3.clear();
                                Iterator it2 = arrayList2.iterator();
                                int i12 = 0;
                                while (it2.hasNext()) {
                                    MiniCourse miniCourse = (MiniCourse) it2.next();
                                    View inflate = this$0.getLayoutInflater().inflate(R.layout.row_minicourse_item, (ViewGroup) ((LinearLayout) this$0.u0(R.id.continueContainer)), false);
                                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    String domain2 = miniCourse.getDomain();
                                    kotlin.jvm.internal.i.d(domain2);
                                    ((AppCompatImageView) constraintLayout.findViewById(R.id.image)).setBackgroundColor(Color.parseColor(MiniCourseUtilsKt.getMcColor(domain2)));
                                    String domain3 = miniCourse.getDomain();
                                    kotlin.jvm.internal.i.d(domain3);
                                    Integer[] miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain3);
                                    if (miniCourseImage != null) {
                                        Glide.c(this$0).d(this$0).o(miniCourseImage[0]).B((AppCompatImageView) constraintLayout.findViewById(R.id.image));
                                    }
                                    RobertoTextView robertoTextView = (RobertoTextView) constraintLayout.findViewById(R.id.title);
                                    MiniCoursesViewModel miniCoursesViewModel3 = this$0.A;
                                    if (miniCoursesViewModel3 != null) {
                                        String domain4 = miniCourse.getDomain();
                                        kotlin.jvm.internal.i.d(domain4);
                                        robertoTextView.setText(miniCoursesViewModel3.h(domain4));
                                        ((ProgressBar) constraintLayout.findViewById(R.id.progressBar)).setMax(miniCourse.getPlan().size());
                                        ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(R.id.progressBar);
                                        Iterator<CourseDayModelV1> it3 = miniCourse.getPlan().iterator();
                                        int i13 = 0;
                                        while (it3.hasNext()) {
                                            if (it3.next().getStart_date() != 0) {
                                                i13++;
                                            }
                                        }
                                        progressBar.setProgress(i13);
                                        ((LinearLayout) this$0.u0(R.id.continueContainer)).addView(constraintLayout);
                                        i12++;
                                        if (i12 > 3) {
                                            constraintLayout.setVisibility(8);
                                            arrayList3.add(constraintLayout);
                                        }
                                        constraintLayout.setOnClickListener(new defpackage.a(miniCourse, 1, this$0));
                                    } else {
                                        kotlin.jvm.internal.i.q("miniCourseViewModel");
                                        throw null;
                                    }
                                }
                                int size = arrayList2.size();
                                List<MiniCourse> list2 = this$0.B;
                                if (list2 != null) {
                                    if (size != list2.size() && !arrayList3.isEmpty()) {
                                        ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(0);
                                    } else {
                                        ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(8);
                                        this$0.E = false;
                                    }
                                    int size2 = arrayList2.size();
                                    List<MiniCourse> list3 = this$0.B;
                                    if (list3 != null) {
                                        if (size2 == list3.size()) {
                                            ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(8);
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setVisibility(8);
                                        }
                                        if (this$0.E) {
                                            for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                                                arrayList3.get(size3).setVisibility(8);
                                            }
                                            ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW ALL");
                                            return;
                                        }
                                        Iterator<View> it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            it4.next().setVisibility(0);
                                        }
                                        ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW LESS");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("miniCourseList");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("miniCourseList");
                                throw null;
                            case 1:
                                List it5 = (List) obj;
                                int i14 = AllMiniCoursesActivity.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(it5, "it");
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj3 : it5) {
                                    String domain5 = ((MiniCourse) obj3).getDomain();
                                    kotlin.jvm.internal.i.d(domain5);
                                    if (MiniCourseUtilsKt.getMcDayProgress(domain5) == 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList4.add(obj3);
                                    }
                                }
                                this$0.C = arrayList4;
                                ek.f fVar = this$0.f10308z;
                                if (fVar != null) {
                                    fVar.f14123y = arrayList4;
                                    fVar.i();
                                } else {
                                    MiniCoursesViewModel miniCoursesViewModel4 = this$0.A;
                                    if (miniCoursesViewModel4 != null) {
                                        this$0.f10308z = new ek.f(this$0, arrayList4, miniCoursesViewModel4.i());
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setLayoutManager(new GridLayoutManager(this$0, 2));
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setHasFixedSize(true);
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setItemAnimator(new androidx.recyclerview.widget.c());
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setNestedScrollingEnabled(false);
                                        RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.mcRecycler);
                                        ek.f fVar2 = this$0.f10308z;
                                        if (fVar2 != null) {
                                            recyclerView.setAdapter(fVar2);
                                        } else {
                                            kotlin.jvm.internal.i.q("adapter");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("miniCourseViewModel");
                                        throw null;
                                    }
                                }
                                if (this$0.C != null) {
                                    if (!arrayList.isEmpty()) {
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setVisibility(0);
                                        return;
                                    }
                                    return;
                                }
                                kotlin.jvm.internal.i.q("miniCourseFreshList");
                                throw null;
                            default:
                                List<MiniCourse> it6 = (List) obj;
                                int i15 = AllMiniCoursesActivity.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(it6, "it");
                                this$0.B = it6;
                                ek.f fVar3 = this$0.f10308z;
                                if (fVar3 != null) {
                                    fVar3.f14123y = it6;
                                    fVar3.i();
                                    i6 = R.id.mcRecycler;
                                } else {
                                    MiniCoursesViewModel miniCoursesViewModel5 = this$0.A;
                                    if (miniCoursesViewModel5 != null) {
                                        this$0.f10308z = new ek.f(this$0, it6, miniCoursesViewModel5.i());
                                        i6 = R.id.mcRecycler;
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setLayoutManager(new GridLayoutManager(this$0, 2));
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setHasFixedSize(true);
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setItemAnimator(new androidx.recyclerview.widget.c());
                                        RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.mcRecycler);
                                        ek.f fVar4 = this$0.f10308z;
                                        if (fVar4 != null) {
                                            recyclerView2.setAdapter(fVar4);
                                        } else {
                                            kotlin.jvm.internal.i.q("adapter");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("miniCourseViewModel");
                                        throw null;
                                    }
                                }
                                if (this$0.B != null) {
                                    if (!list.isEmpty()) {
                                        ((RecyclerView) this$0.u0(i6)).setVisibility(0);
                                        return;
                                    }
                                    return;
                                }
                                kotlin.jvm.internal.i.q("miniCourseList");
                                throw null;
                        }
                    }
                });
                MiniCoursesViewModel miniCoursesViewModel3 = this.A;
                if (miniCoursesViewModel3 != null) {
                    miniCoursesViewModel3.A.e(this, new x(this) { // from class: dk.e

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ AllMiniCoursesActivity f12914b;

                        {
                            this.f12914b = this;
                        }

                        @Override // androidx.lifecycle.x
                        public final void a(Object obj) {
                            int i6;
                            List<MiniCourse> list;
                            boolean z10;
                            ArrayList arrayList;
                            boolean z11;
                            int i10 = r2;
                            AllMiniCoursesActivity this$0 = this.f12914b;
                            switch (i10) {
                                case 0:
                                    List<MiniCourse> it = (List) obj;
                                    int i11 = AllMiniCoursesActivity.G;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.f(it, "it");
                                    this$0.B = it;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : it) {
                                        String domain = ((MiniCourse) obj2).getDomain();
                                        kotlin.jvm.internal.i.d(domain);
                                        if (MiniCourseUtilsKt.getMcDayProgress(domain) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    this$0.getClass();
                                    if (arrayList2.isEmpty()) {
                                        ((RobertoTextView) this$0.u0(R.id.continueText)).setVisibility(8);
                                        ((LinearLayout) this$0.u0(R.id.continueContainer)).setVisibility(8);
                                        ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(8);
                                        ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(8);
                                        return;
                                    }
                                    ((RobertoTextView) this$0.u0(R.id.continueText)).setVisibility(0);
                                    ((LinearLayout) this$0.u0(R.id.continueContainer)).setVisibility(0);
                                    ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(0);
                                    ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(0);
                                    ((LinearLayout) this$0.u0(R.id.continueContainer)).removeAllViews();
                                    ArrayList<View> arrayList3 = this$0.D;
                                    arrayList3.clear();
                                    Iterator it2 = arrayList2.iterator();
                                    int i12 = 0;
                                    while (it2.hasNext()) {
                                        MiniCourse miniCourse = (MiniCourse) it2.next();
                                        View inflate = this$0.getLayoutInflater().inflate(R.layout.row_minicourse_item, (ViewGroup) ((LinearLayout) this$0.u0(R.id.continueContainer)), false);
                                        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                        String domain2 = miniCourse.getDomain();
                                        kotlin.jvm.internal.i.d(domain2);
                                        ((AppCompatImageView) constraintLayout.findViewById(R.id.image)).setBackgroundColor(Color.parseColor(MiniCourseUtilsKt.getMcColor(domain2)));
                                        String domain3 = miniCourse.getDomain();
                                        kotlin.jvm.internal.i.d(domain3);
                                        Integer[] miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain3);
                                        if (miniCourseImage != null) {
                                            Glide.c(this$0).d(this$0).o(miniCourseImage[0]).B((AppCompatImageView) constraintLayout.findViewById(R.id.image));
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) constraintLayout.findViewById(R.id.title);
                                        MiniCoursesViewModel miniCoursesViewModel32 = this$0.A;
                                        if (miniCoursesViewModel32 != null) {
                                            String domain4 = miniCourse.getDomain();
                                            kotlin.jvm.internal.i.d(domain4);
                                            robertoTextView.setText(miniCoursesViewModel32.h(domain4));
                                            ((ProgressBar) constraintLayout.findViewById(R.id.progressBar)).setMax(miniCourse.getPlan().size());
                                            ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(R.id.progressBar);
                                            Iterator<CourseDayModelV1> it3 = miniCourse.getPlan().iterator();
                                            int i13 = 0;
                                            while (it3.hasNext()) {
                                                if (it3.next().getStart_date() != 0) {
                                                    i13++;
                                                }
                                            }
                                            progressBar.setProgress(i13);
                                            ((LinearLayout) this$0.u0(R.id.continueContainer)).addView(constraintLayout);
                                            i12++;
                                            if (i12 > 3) {
                                                constraintLayout.setVisibility(8);
                                                arrayList3.add(constraintLayout);
                                            }
                                            constraintLayout.setOnClickListener(new defpackage.a(miniCourse, 1, this$0));
                                        } else {
                                            kotlin.jvm.internal.i.q("miniCourseViewModel");
                                            throw null;
                                        }
                                    }
                                    int size = arrayList2.size();
                                    List<MiniCourse> list2 = this$0.B;
                                    if (list2 != null) {
                                        if (size != list2.size() && !arrayList3.isEmpty()) {
                                            ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(0);
                                        } else {
                                            ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(8);
                                            this$0.E = false;
                                        }
                                        int size2 = arrayList2.size();
                                        List<MiniCourse> list3 = this$0.B;
                                        if (list3 != null) {
                                            if (size2 == list3.size()) {
                                                ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(8);
                                                ((RecyclerView) this$0.u0(R.id.mcRecycler)).setVisibility(8);
                                            }
                                            if (this$0.E) {
                                                for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                                                    arrayList3.get(size3).setVisibility(8);
                                                }
                                                ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW ALL");
                                                return;
                                            }
                                            Iterator<View> it4 = arrayList3.iterator();
                                            while (it4.hasNext()) {
                                                it4.next().setVisibility(0);
                                            }
                                            ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW LESS");
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("miniCourseList");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("miniCourseList");
                                    throw null;
                                case 1:
                                    List it5 = (List) obj;
                                    int i14 = AllMiniCoursesActivity.G;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.f(it5, "it");
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj3 : it5) {
                                        String domain5 = ((MiniCourse) obj3).getDomain();
                                        kotlin.jvm.internal.i.d(domain5);
                                        if (MiniCourseUtilsKt.getMcDayProgress(domain5) == 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    this$0.C = arrayList4;
                                    ek.f fVar = this$0.f10308z;
                                    if (fVar != null) {
                                        fVar.f14123y = arrayList4;
                                        fVar.i();
                                    } else {
                                        MiniCoursesViewModel miniCoursesViewModel4 = this$0.A;
                                        if (miniCoursesViewModel4 != null) {
                                            this$0.f10308z = new ek.f(this$0, arrayList4, miniCoursesViewModel4.i());
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setLayoutManager(new GridLayoutManager(this$0, 2));
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setHasFixedSize(true);
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setItemAnimator(new androidx.recyclerview.widget.c());
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setNestedScrollingEnabled(false);
                                            RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.mcRecycler);
                                            ek.f fVar2 = this$0.f10308z;
                                            if (fVar2 != null) {
                                                recyclerView.setAdapter(fVar2);
                                            } else {
                                                kotlin.jvm.internal.i.q("adapter");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.i.q("miniCourseViewModel");
                                            throw null;
                                        }
                                    }
                                    if (this$0.C != null) {
                                        if (!arrayList.isEmpty()) {
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setVisibility(0);
                                            return;
                                        }
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("miniCourseFreshList");
                                    throw null;
                                default:
                                    List<MiniCourse> it6 = (List) obj;
                                    int i15 = AllMiniCoursesActivity.G;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.f(it6, "it");
                                    this$0.B = it6;
                                    ek.f fVar3 = this$0.f10308z;
                                    if (fVar3 != null) {
                                        fVar3.f14123y = it6;
                                        fVar3.i();
                                        i6 = R.id.mcRecycler;
                                    } else {
                                        MiniCoursesViewModel miniCoursesViewModel5 = this$0.A;
                                        if (miniCoursesViewModel5 != null) {
                                            this$0.f10308z = new ek.f(this$0, it6, miniCoursesViewModel5.i());
                                            i6 = R.id.mcRecycler;
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setLayoutManager(new GridLayoutManager(this$0, 2));
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setHasFixedSize(true);
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setItemAnimator(new androidx.recyclerview.widget.c());
                                            RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.mcRecycler);
                                            ek.f fVar4 = this$0.f10308z;
                                            if (fVar4 != null) {
                                                recyclerView2.setAdapter(fVar4);
                                            } else {
                                                kotlin.jvm.internal.i.q("adapter");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.i.q("miniCourseViewModel");
                                            throw null;
                                        }
                                    }
                                    if (this$0.B != null) {
                                        if (!list.isEmpty()) {
                                            ((RecyclerView) this$0.u0(i6)).setVisibility(0);
                                            return;
                                        }
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("miniCourseList");
                                    throw null;
                            }
                        }
                    });
                    MiniCoursesViewModel miniCoursesViewModel4 = this.A;
                    if (miniCoursesViewModel4 != null) {
                        miniCoursesViewModel4.k(null);
                        return;
                    } else {
                        i.q("miniCourseViewModel");
                        throw null;
                    }
                }
                i.q("miniCourseViewModel");
                throw null;
            }
            i.q("miniCourseViewModel");
            throw null;
        }
        if (k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
            MiniCoursesViewModel miniCoursesViewModel5 = this.A;
            if (miniCoursesViewModel5 != null) {
                if (miniCoursesViewModel5 != null) {
                    miniCoursesViewModel5.k(null);
                    return;
                } else {
                    i.q("miniCourseViewModel");
                    throw null;
                }
            }
            MiniCoursesViewModel miniCoursesViewModel6 = (MiniCoursesViewModel) new o0(this).a(MiniCoursesViewModel.class);
            this.A = miniCoursesViewModel6;
            if (miniCoursesViewModel6 != null) {
                miniCoursesViewModel6.f11379z.e(this, new x(this) { // from class: dk.e

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ AllMiniCoursesActivity f12914b;

                    {
                        this.f12914b = this;
                    }

                    @Override // androidx.lifecycle.x
                    public final void a(Object obj) {
                        int i6;
                        List<MiniCourse> list;
                        boolean z10;
                        ArrayList arrayList;
                        boolean z11;
                        int i10 = r2;
                        AllMiniCoursesActivity this$0 = this.f12914b;
                        switch (i10) {
                            case 0:
                                List<MiniCourse> it = (List) obj;
                                int i11 = AllMiniCoursesActivity.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(it, "it");
                                this$0.B = it;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : it) {
                                    String domain = ((MiniCourse) obj2).getDomain();
                                    kotlin.jvm.internal.i.d(domain);
                                    if (MiniCourseUtilsKt.getMcDayProgress(domain) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                this$0.getClass();
                                if (arrayList2.isEmpty()) {
                                    ((RobertoTextView) this$0.u0(R.id.continueText)).setVisibility(8);
                                    ((LinearLayout) this$0.u0(R.id.continueContainer)).setVisibility(8);
                                    ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(8);
                                    ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(8);
                                    return;
                                }
                                ((RobertoTextView) this$0.u0(R.id.continueText)).setVisibility(0);
                                ((LinearLayout) this$0.u0(R.id.continueContainer)).setVisibility(0);
                                ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(0);
                                ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(0);
                                ((LinearLayout) this$0.u0(R.id.continueContainer)).removeAllViews();
                                ArrayList<View> arrayList3 = this$0.D;
                                arrayList3.clear();
                                Iterator it2 = arrayList2.iterator();
                                int i12 = 0;
                                while (it2.hasNext()) {
                                    MiniCourse miniCourse = (MiniCourse) it2.next();
                                    View inflate = this$0.getLayoutInflater().inflate(R.layout.row_minicourse_item, (ViewGroup) ((LinearLayout) this$0.u0(R.id.continueContainer)), false);
                                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    String domain2 = miniCourse.getDomain();
                                    kotlin.jvm.internal.i.d(domain2);
                                    ((AppCompatImageView) constraintLayout.findViewById(R.id.image)).setBackgroundColor(Color.parseColor(MiniCourseUtilsKt.getMcColor(domain2)));
                                    String domain3 = miniCourse.getDomain();
                                    kotlin.jvm.internal.i.d(domain3);
                                    Integer[] miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain3);
                                    if (miniCourseImage != null) {
                                        Glide.c(this$0).d(this$0).o(miniCourseImage[0]).B((AppCompatImageView) constraintLayout.findViewById(R.id.image));
                                    }
                                    RobertoTextView robertoTextView = (RobertoTextView) constraintLayout.findViewById(R.id.title);
                                    MiniCoursesViewModel miniCoursesViewModel32 = this$0.A;
                                    if (miniCoursesViewModel32 != null) {
                                        String domain4 = miniCourse.getDomain();
                                        kotlin.jvm.internal.i.d(domain4);
                                        robertoTextView.setText(miniCoursesViewModel32.h(domain4));
                                        ((ProgressBar) constraintLayout.findViewById(R.id.progressBar)).setMax(miniCourse.getPlan().size());
                                        ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(R.id.progressBar);
                                        Iterator<CourseDayModelV1> it3 = miniCourse.getPlan().iterator();
                                        int i13 = 0;
                                        while (it3.hasNext()) {
                                            if (it3.next().getStart_date() != 0) {
                                                i13++;
                                            }
                                        }
                                        progressBar.setProgress(i13);
                                        ((LinearLayout) this$0.u0(R.id.continueContainer)).addView(constraintLayout);
                                        i12++;
                                        if (i12 > 3) {
                                            constraintLayout.setVisibility(8);
                                            arrayList3.add(constraintLayout);
                                        }
                                        constraintLayout.setOnClickListener(new defpackage.a(miniCourse, 1, this$0));
                                    } else {
                                        kotlin.jvm.internal.i.q("miniCourseViewModel");
                                        throw null;
                                    }
                                }
                                int size = arrayList2.size();
                                List<MiniCourse> list2 = this$0.B;
                                if (list2 != null) {
                                    if (size != list2.size() && !arrayList3.isEmpty()) {
                                        ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(0);
                                    } else {
                                        ((RobertoTextView) this$0.u0(R.id.seeAllText)).setVisibility(8);
                                        this$0.E = false;
                                    }
                                    int size2 = arrayList2.size();
                                    List<MiniCourse> list3 = this$0.B;
                                    if (list3 != null) {
                                        if (size2 == list3.size()) {
                                            ((RobertoTextView) this$0.u0(R.id.tryNewText)).setVisibility(8);
                                            ((RecyclerView) this$0.u0(R.id.mcRecycler)).setVisibility(8);
                                        }
                                        if (this$0.E) {
                                            for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                                                arrayList3.get(size3).setVisibility(8);
                                            }
                                            ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW ALL");
                                            return;
                                        }
                                        Iterator<View> it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            it4.next().setVisibility(0);
                                        }
                                        ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW LESS");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("miniCourseList");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("miniCourseList");
                                throw null;
                            case 1:
                                List it5 = (List) obj;
                                int i14 = AllMiniCoursesActivity.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(it5, "it");
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj3 : it5) {
                                    String domain5 = ((MiniCourse) obj3).getDomain();
                                    kotlin.jvm.internal.i.d(domain5);
                                    if (MiniCourseUtilsKt.getMcDayProgress(domain5) == 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList4.add(obj3);
                                    }
                                }
                                this$0.C = arrayList4;
                                ek.f fVar = this$0.f10308z;
                                if (fVar != null) {
                                    fVar.f14123y = arrayList4;
                                    fVar.i();
                                } else {
                                    MiniCoursesViewModel miniCoursesViewModel42 = this$0.A;
                                    if (miniCoursesViewModel42 != null) {
                                        this$0.f10308z = new ek.f(this$0, arrayList4, miniCoursesViewModel42.i());
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setLayoutManager(new GridLayoutManager(this$0, 2));
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setHasFixedSize(true);
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setItemAnimator(new androidx.recyclerview.widget.c());
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setNestedScrollingEnabled(false);
                                        RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.mcRecycler);
                                        ek.f fVar2 = this$0.f10308z;
                                        if (fVar2 != null) {
                                            recyclerView.setAdapter(fVar2);
                                        } else {
                                            kotlin.jvm.internal.i.q("adapter");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("miniCourseViewModel");
                                        throw null;
                                    }
                                }
                                if (this$0.C != null) {
                                    if (!arrayList.isEmpty()) {
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setVisibility(0);
                                        return;
                                    }
                                    return;
                                }
                                kotlin.jvm.internal.i.q("miniCourseFreshList");
                                throw null;
                            default:
                                List<MiniCourse> it6 = (List) obj;
                                int i15 = AllMiniCoursesActivity.G;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.f(it6, "it");
                                this$0.B = it6;
                                ek.f fVar3 = this$0.f10308z;
                                if (fVar3 != null) {
                                    fVar3.f14123y = it6;
                                    fVar3.i();
                                    i6 = R.id.mcRecycler;
                                } else {
                                    MiniCoursesViewModel miniCoursesViewModel52 = this$0.A;
                                    if (miniCoursesViewModel52 != null) {
                                        this$0.f10308z = new ek.f(this$0, it6, miniCoursesViewModel52.i());
                                        i6 = R.id.mcRecycler;
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setLayoutManager(new GridLayoutManager(this$0, 2));
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setHasFixedSize(true);
                                        ((RecyclerView) this$0.u0(R.id.mcRecycler)).setItemAnimator(new androidx.recyclerview.widget.c());
                                        RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.mcRecycler);
                                        ek.f fVar4 = this$0.f10308z;
                                        if (fVar4 != null) {
                                            recyclerView2.setAdapter(fVar4);
                                        } else {
                                            kotlin.jvm.internal.i.q("adapter");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("miniCourseViewModel");
                                        throw null;
                                    }
                                }
                                if (this$0.B != null) {
                                    if (!list.isEmpty()) {
                                        ((RecyclerView) this$0.u0(i6)).setVisibility(0);
                                        return;
                                    }
                                    return;
                                }
                                kotlin.jvm.internal.i.q("miniCourseList");
                                throw null;
                        }
                    }
                });
                MiniCoursesViewModel miniCoursesViewModel7 = this.A;
                if (miniCoursesViewModel7 != null) {
                    miniCoursesViewModel7.k(null);
                    return;
                } else {
                    i.q("miniCourseViewModel");
                    throw null;
                }
            }
            i.q("miniCourseViewModel");
            throw null;
        }
    }
}
