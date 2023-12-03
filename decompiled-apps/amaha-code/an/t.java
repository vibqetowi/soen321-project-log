package an;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.k0;
import cn.q0;
import cn.s0;
import cn.u0;
import cn.w0;
import cn.x0;
import cn.y0;
import cn.z0;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ScrollStateListenerCustomNestedScrollView;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import kotlin.Metadata;
import t0.d0;
import t0.o0;
import t0.u0;
/* compiled from: LibraryHomeFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lan/t;", "Lrr/b;", "Lil/n;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t extends rr.b implements il.n {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f770g0 = 0;
    public boolean A;
    public k0 B;
    public ArrayList<LearningHubModel> C;
    public ArrayList<MiniCourseMetadata> D;
    public ArrayList<MiniCourse> E;
    public ArrayList<MiniCourseMetadata> F;
    public ArrayList<MiniCourse> G;
    public HashSet<String> H;
    public String I;
    public ArrayList<MiniCourseMetadata> J;
    public ArrayList<MiniCourse> K;
    public boolean L;
    public boolean M;
    public final Boolean[] N;
    public final HashSet<String> O;
    public int P;
    public boolean Q;
    public String[] R;
    public boolean S;
    public xj.b T;
    public final Boolean[] U;
    public final Boolean[] V;
    public final Boolean[] W;
    public final Boolean[] X;
    public final androidx.activity.result.c<Intent> Y;
    public final androidx.activity.result.c<Intent> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f771a0;

    /* renamed from: b0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f772b0;
    public bn.c c0;

    /* renamed from: d0  reason: collision with root package name */
    public final hs.i f773d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public final LinkedHashMap f774f0 = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f775u = LogHelper.INSTANCE.makeLogTag("LibraryHomeFragment");

    /* renamed from: v  reason: collision with root package name */
    public String f776v = "";

    /* renamed from: w  reason: collision with root package name */
    public String f777w = "";

    /* renamed from: x  reason: collision with root package name */
    public String f778x = "";

    /* renamed from: y  reason: collision with root package name */
    public Chip f779y;

    /* renamed from: z  reason: collision with root package name */
    public final String[] f780z;

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            t tVar = t.this;
            ((RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryDbShortCourses)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            tVar.V[0] = Boolean.TRUE;
            tVar.S();
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            t tVar = t.this;
            ((RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryCollectionsRecycler)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            tVar.V[1] = Boolean.TRUE;
            tVar.S();
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            t tVar = t.this;
            ((RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryDbResources)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            tVar.V[2] = Boolean.TRUE;
            tVar.S();
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<xj.b, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(xj.b bVar) {
            t.this.T = bVar;
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<il.q> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final il.q invoke() {
            t tVar = t.this;
            androidx.fragment.app.p requireActivity = tVar.requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            return new il.q(requireActivity, tVar);
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourse>, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourse> list) {
            ArrayList<MiniCourse> arrayList;
            List<? extends MiniCourse> list2 = list;
            t tVar = t.this;
            try {
                arrayList = tVar.G;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f775u, e10);
            }
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.MiniCourse?>");
                    tVar.E = (ArrayList) list2;
                }
                tVar.N[1] = Boolean.TRUE;
                t.J(tVar);
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("topicalCoursesList");
            throw null;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourseMetadata>, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourseMetadata> list) {
            ArrayList<MiniCourseMetadata> arrayList;
            List<? extends MiniCourseMetadata> list2 = list;
            t tVar = t.this;
            try {
                arrayList = tVar.F;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f775u, e10);
            }
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?>");
                    ArrayList<MiniCourseMetadata> arrayList2 = (ArrayList) list2;
                    tVar.F = arrayList2;
                    ArrayList<MiniCourseMetadata> arrayList3 = tVar.D;
                    if (arrayList3 != null) {
                        arrayList3.addAll(arrayList2);
                    } else {
                        kotlin.jvm.internal.i.q("mcMetaDataList");
                        throw null;
                    }
                }
                tVar.N[2] = Boolean.TRUE;
                t.J(tVar);
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("tcMetaDataList");
            throw null;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<HashSet<String>, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(HashSet<String> hashSet) {
            HashSet<String> hashSet2 = hashSet;
            t tVar = t.this;
            try {
                if (tVar.H.isEmpty()) {
                    kotlin.jvm.internal.i.e(hashSet2, "null cannot be cast to non-null type java.util.HashSet<kotlin.String?>");
                    tVar.H = hashSet2;
                    t.K(tVar, hashSet2);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f775u, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourse>, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourse> list) {
            ArrayList<MiniCourse> arrayList;
            List<? extends MiniCourse> list2 = list;
            t tVar = t.this;
            try {
                arrayList = tVar.G;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f775u, e10);
            }
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.MiniCourse?>");
                    tVar.G = (ArrayList) list2;
                    ArrayList<MiniCourse> arrayList2 = tVar.E;
                    if (arrayList2 != null) {
                        arrayList2.addAll(list2);
                    } else {
                        kotlin.jvm.internal.i.q("miniCoursesList");
                        throw null;
                    }
                }
                tVar.N[3] = Boolean.TRUE;
                t.J(tVar);
                tVar.a0(tVar.Z());
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("topicalCoursesList");
            throw null;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public j() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            t tVar = t.this;
            if (bool2 != null) {
                try {
                    bool2.booleanValue();
                    if (bool2.booleanValue()) {
                        CardView cardView = (CardView) tVar._$_findCachedViewById(R.id.cvLibrarySCLoader);
                        if (cardView != null) {
                            cardView.setVisibility(0);
                        }
                        RecyclerView recyclerView = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryDbShortCourses);
                        if (recyclerView != null) {
                            recyclerView.setVisibility(8);
                        }
                    } else {
                        CardView cardView2 = (CardView) tVar._$_findCachedViewById(R.id.cvLibrarySCLoader);
                        if (cardView2 != null) {
                            cardView2.setVisibility(8);
                        }
                        RecyclerView recyclerView2 = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryDbShortCourses);
                        if (recyclerView2 != null) {
                            recyclerView2.setVisibility(0);
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public k() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            ConstraintLayout constraintLayout;
            Boolean bool2 = bool;
            t tVar = t.this;
            if (bool2 != null) {
                try {
                    if (bool2.booleanValue()) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar._$_findCachedViewById(R.id.clLibraryDashboardLoadingDots);
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(0);
                        }
                    } else {
                        androidx.fragment.app.p requireActivity = tVar.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                        if (!((LibraryActivity) requireActivity).C && (constraintLayout = (ConstraintLayout) tVar._$_findCachedViewById(R.id.clLibraryDashboardLoadingDots)) != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends hs.f<? extends MiniCourseMetadata, ? extends MiniCourse>>, hs.k> {
        public l() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends hs.f<? extends MiniCourseMetadata, ? extends MiniCourse>> singleUseEvent) {
            String str;
            Bundle extras;
            String str2;
            Bundle extras2;
            SingleUseEvent<? extends hs.f<? extends MiniCourseMetadata, ? extends MiniCourse>> singleUseEvent2 = singleUseEvent;
            t tVar = t.this;
            if (singleUseEvent2 != null) {
                try {
                    hs.f<? extends MiniCourseMetadata, ? extends MiniCourse> contentIfNotHandled = singleUseEvent2.getContentIfNotHandled();
                    if (contentIfNotHandled != null) {
                        A a10 = contentIfNotHandled.f19464u;
                        Context context = tVar.getContext();
                        kotlin.jvm.internal.i.e(context, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                        LibraryActivity libraryActivity = (LibraryActivity) context;
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("mcMetaData", (Serializable) a10);
                        bundle.putSerializable("miniCourse", (Serializable) contentIfNotHandled.f19465v);
                        Intent intent = tVar.requireActivity().getIntent();
                        Bundle bundle2 = null;
                        if (intent != null && (extras2 = intent.getExtras()) != null) {
                            str = extras2.getString("id");
                        } else {
                            str = null;
                        }
                        bundle.putString("scroll_and_highlight_id", str);
                        hs.k kVar = hs.k.f19476a;
                        libraryActivity.n0(bundle, "short_courses");
                        Intent intent2 = tVar.requireActivity().getIntent();
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            if (is.k.Q1(extras.getString("recentSource"), new String[]{"homescreen", "recent_list_view"})) {
                                bundle2 = extras;
                            }
                            if (bundle2 != null) {
                                Bundle bundle3 = new Bundle();
                                if (bundle2.getBoolean("isCompleted", false)) {
                                    str2 = "completed";
                                } else {
                                    str2 = "incomplete";
                                }
                                bundle3.putString("status_of_activity_when_clicked", str2);
                                bundle3.putString("recent_item_name", bundle2.getString("label"));
                                bundle3.putString("recent_item_type", "course_activity");
                                bundle3.putString("source", bundle2.getString("recentSource"));
                                bundle3.putString("mini_course", ((MiniCourseMetadata) a10).getName());
                                bundle3.putBoolean("paid_recent_item", !bundle2.getBoolean("isFree", true));
                                UtilsKt.fireAnalytics("lib_recent_cta_click", bundle3);
                            }
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {
        public m() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
            Dialog b10;
            String contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null && (b10 = ((il.q) t.this.f773d0.getValue()).b(contentIfNotHandled)) != null) {
                b10.show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {
        public n() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
            String contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                Toast.makeText(t.this.requireContext(), contentIfNotHandled, 1).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.l<LibraryCollection, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k0 f796v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(k0 k0Var) {
            super(1);
            this.f796v = k0Var;
        }

        @Override // ss.l
        public final hs.k invoke(LibraryCollection libraryCollection) {
            LibraryCollection libraryCollection2 = libraryCollection;
            t tVar = t.this;
            if (libraryCollection2 != null) {
                try {
                    k0 k0Var = this.f796v;
                    if (tVar.M) {
                        HashSet<String> hashSet = tVar.O;
                        ArrayList<LibraryCollectionItem> itemList = libraryCollection2.getItemList();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : itemList) {
                            if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) obj).getItemType(), "mini_course")) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((LibraryCollectionItem) it.next()).getId());
                        }
                        hashSet.addAll(arrayList2);
                        t.J(tVar);
                    }
                    ArrayList<LibraryCollectionItem> itemList2 = libraryCollection2.getItemList();
                    ArrayList arrayList3 = new ArrayList(is.i.H1(itemList2, 10));
                    for (LibraryCollectionItem libraryCollectionItem : itemList2) {
                        arrayList3.add(libraryCollectionItem.getId());
                    }
                    k0Var.k(arrayList3, false, false);
                    String id2 = libraryCollection2.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    tVar.f777w = id2;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class p extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k0 f798v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(k0 k0Var) {
            super(1);
            this.f798v = k0Var;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            ArrayList<LibraryCollectionItem> itemList;
            String str;
            LibraryActivity libraryActivity;
            Bundle extras;
            String str2;
            Boolean bool2 = bool;
            t tVar = t.this;
            if (bool2 != null) {
                try {
                    k0 k0Var = this.f798v;
                    bool2.booleanValue();
                    if (tVar.Q) {
                        Bundle extras2 = tVar.requireActivity().getIntent().getExtras();
                        LibraryCollection d10 = k0Var.A.d();
                        if (d10 != null && (itemList = d10.getItemList()) != null) {
                            Iterator<LibraryCollectionItem> it = itemList.iterator();
                            while (it.hasNext()) {
                                String id2 = it.next().getId();
                                Bundle bundle = null;
                                if (extras2 != null) {
                                    str = extras2.getString("id");
                                } else {
                                    str = null;
                                }
                                if (kotlin.jvm.internal.i.b(id2, str)) {
                                    androidx.fragment.app.p requireActivity = tVar.requireActivity();
                                    if (requireActivity instanceof LibraryActivity) {
                                        libraryActivity = (LibraryActivity) requireActivity;
                                    } else {
                                        libraryActivity = null;
                                    }
                                    if (libraryActivity != null) {
                                        int i6 = LibraryActivity.E;
                                        libraryActivity.n0(null, "top_picks");
                                    }
                                    Intent intent = tVar.requireActivity().getIntent();
                                    if (intent != null && (extras = intent.getExtras()) != null) {
                                        if (is.k.Q1(extras.getString("recentSource"), new String[]{"homescreen", "recent_list_view"})) {
                                            bundle = extras;
                                        }
                                        if (bundle != null) {
                                            Bundle bundle2 = new Bundle();
                                            if (bundle.getBoolean("isCompleted", false)) {
                                                str2 = "completed";
                                            } else {
                                                str2 = "incomplete";
                                            }
                                            bundle2.putString("status_of_activity_when_clicked", str2);
                                            bundle2.putString("recent_item_name", bundle.getString("label"));
                                            bundle2.putString("recent_item_type", "top_pick_activity");
                                            bundle2.putString("source", bundle.getString("recentSource"));
                                            bundle2.putBoolean("paid_recent_item", !bundle.getBoolean("isFree", true));
                                            UtilsKt.fireAnalytics("lib_recent_cta_click", bundle2);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        t.P(tVar, k0Var.A.d(), k0Var.V);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends RecommendedActivityModel>, hs.k> {
        public q() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent) {
            SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent2 = singleUseEvent;
            t tVar = t.this;
            if (singleUseEvent2 != null) {
                try {
                    RecommendedActivityModel contentIfNotHandled = singleUseEvent2.getContentIfNotHandled();
                    if (contentIfNotHandled != null) {
                        tVar.f772b0.a(new Intent(tVar.requireActivity(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", contentIfNotHandled).putExtra("source", "library"));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class r extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends LearningHubModel>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k0 f801v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(k0 k0Var) {
            super(1);
            this.f801v = k0Var;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends LearningHubModel> singleUseEvent) {
            Boolean bool;
            Bundle extras;
            Object obj;
            Object obj2;
            String str;
            Object obj3;
            boolean z10;
            boolean z11;
            ArrayList<PostsRead> postsRead;
            ArrayList<PostsRead> postsRead2;
            boolean z12;
            SingleUseEvent<? extends LearningHubModel> singleUseEvent2 = singleUseEvent;
            t tVar = t.this;
            if (singleUseEvent2 != null) {
                try {
                    LearningHubModel contentIfNotHandled = singleUseEvent2.getContentIfNotHandled();
                    if (contentIfNotHandled != null) {
                        k0 k0Var = this.f801v;
                        tVar.Y.a(new Intent(tVar.requireActivity(), LearningHubArticleExperimentActivity.class).putExtra("model", contentIfNotHandled));
                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                        User user = firebasePersistence.getUser();
                        Bundle bundle = null;
                        if (user != null && (postsRead2 = user.getPostsRead()) != null) {
                            if (!postsRead2.isEmpty()) {
                                for (PostsRead postsRead3 : postsRead2) {
                                    if (kotlin.jvm.internal.i.b(postsRead3.getPostId(), contentIfNotHandled.getId())) {
                                        z12 = true;
                                        break;
                                    }
                                }
                            }
                            z12 = false;
                            bool = Boolean.valueOf(z12);
                        } else {
                            bool = null;
                        }
                        if (kotlin.jvm.internal.i.b(bool, Boolean.FALSE)) {
                            User user2 = firebasePersistence.getUser();
                            if (user2 != null && (postsRead = user2.getPostsRead()) != null) {
                                PostsRead postsRead4 = new PostsRead();
                                postsRead4.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                postsRead4.setPostId(contentIfNotHandled.getId());
                                postsRead.add(postsRead4);
                            }
                            firebasePersistence.updateUserOnFirebase();
                        }
                        if (contentIfNotHandled.getId() != null) {
                            Iterator<T> it = contentIfNotHandled.getFields().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj;
                                    if (kotlin.jvm.internal.i.b(learningHubFieldModel.getData_title(), "title") && kotlin.jvm.internal.i.b(learningHubFieldModel.getData_type(), "text")) {
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
                                    obj = null;
                                    break;
                                }
                            }
                            LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj;
                            if (learningHubFieldModel2 == null) {
                                Iterator<T> it2 = contentIfNotHandled.getFields().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        LearningHubFieldModel learningHubFieldModel3 = (LearningHubFieldModel) obj3;
                                        if (kotlin.jvm.internal.i.b(learningHubFieldModel3.getData_title(), "short_desc") && kotlin.jvm.internal.i.b(learningHubFieldModel3.getData_type(), "text")) {
                                            z10 = true;
                                            continue;
                                        } else {
                                            z10 = false;
                                            continue;
                                        }
                                        if (z10) {
                                            break;
                                        }
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                learningHubFieldModel2 = (LearningHubFieldModel) obj3;
                            }
                            if (learningHubFieldModel2 != null) {
                                obj2 = learningHubFieldModel2.getValue();
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str = (String) obj2;
                            } else {
                                str = null;
                            }
                            String id2 = contentIfNotHandled.getId();
                            if (str == null) {
                                str = "";
                            }
                            k0Var.h(id2, "resource", str, Calendar.getInstance().getTimeInMillis(), true, "resource", "resource", true);
                        }
                        Intent intent = tVar.requireActivity().getIntent();
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            if (is.k.Q1(extras.getString("recentSource"), new String[]{"homescreen", "recent_list_view"})) {
                                bundle = extras;
                            }
                            if (bundle != null) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("paid_recent_item", !bundle.getBoolean("isFree", true));
                                bundle2.putString("recent_item_name", bundle.getString("label"));
                                bundle2.putString("recent_item_type", "resource");
                                bundle2.putString("post_type", contentIfNotHandled.getPost_type());
                                bundle2.putString("post_id", bundle.getString("id"));
                                bundle2.putString("source", bundle.getString("recentSource"));
                                UtilsKt.fireAnalytics("lib_recent_cta_click", bundle2);
                            }
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class s extends kotlin.jvm.internal.k implements ss.l<List<? extends LibraryCollection>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k0 f803v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(k0 k0Var) {
            super(1);
            this.f803v = k0Var;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends LibraryCollection> list) {
            ArrayList<LibraryCollectionItem> arrayList;
            List<? extends LibraryCollection> list2 = list;
            t tVar = t.this;
            if (list2 != null) {
                try {
                    k0 k0Var = this.f803v;
                    t.M(tVar, list2);
                    ArrayList arrayList2 = new ArrayList();
                    for (LibraryCollection libraryCollection : list2) {
                        if (libraryCollection == null || (arrayList = libraryCollection.getItemList()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        is.q.R1(arrayList, arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((LibraryCollectionItem) it.next()).getId());
                    }
                    k0Var.k(arrayList3, true, false);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* renamed from: an.t$t  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0013t extends kotlin.jvm.internal.k implements ss.l<HashMap<String, LibraryCollectionItemAccessModel>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k0 f805v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0013t(k0 k0Var) {
            super(1);
            this.f805v = k0Var;
        }

        @Override // ss.l
        public final hs.k invoke(HashMap<String, LibraryCollectionItemAccessModel> hashMap) {
            LibraryActivity libraryActivity;
            LibraryActivity libraryActivity2;
            Bundle extras;
            String str;
            String str2;
            Bundle extras2;
            HashMap<String, LibraryCollectionItemAccessModel> hashMap2 = hashMap;
            t tVar = t.this;
            if (hashMap2 != null) {
                try {
                    k0 k0Var = this.f805v;
                    androidx.fragment.app.p requireActivity = tVar.requireActivity();
                    hs.k kVar = null;
                    if (requireActivity instanceof LibraryActivity) {
                        libraryActivity = (LibraryActivity) requireActivity;
                    } else {
                        libraryActivity = null;
                    }
                    if (libraryActivity != null) {
                        libraryActivity.f11294y = hashMap2;
                    }
                    if (tVar.S) {
                        LibraryCollection libraryCollection = k0Var.Q;
                        if (libraryCollection != null) {
                            androidx.fragment.app.p requireActivity2 = tVar.requireActivity();
                            if (requireActivity2 instanceof LibraryActivity) {
                                libraryActivity2 = (LibraryActivity) requireActivity2;
                            } else {
                                libraryActivity2 = null;
                            }
                            if (libraryActivity2 != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("collection_id", libraryCollection.getId());
                                Intent intent = tVar.requireActivity().getIntent();
                                if (intent != null && (extras2 = intent.getExtras()) != null) {
                                    str2 = extras2.getString("id");
                                } else {
                                    str2 = null;
                                }
                                bundle.putString("scroll_and_highlight_id", str2);
                                bundle.putInt("collection_pos", libraryCollection.getPosition());
                                bundle.putSerializable("collection", libraryCollection);
                                hs.k kVar2 = hs.k.f19476a;
                                libraryActivity2.n0(bundle, "collection");
                            }
                            Intent intent2 = tVar.requireActivity().getIntent();
                            if (intent2 != null && (extras = intent2.getExtras()) != null) {
                                if (!is.k.Q1(extras.getString("recentSource"), new String[]{"homescreen", "recent_list_view"})) {
                                    extras = null;
                                }
                                if (extras != null) {
                                    Bundle bundle2 = new Bundle();
                                    if (extras.getBoolean("isCompleted", false)) {
                                        str = "completed";
                                    } else {
                                        str = "incomplete";
                                    }
                                    bundle2.putString("status_of_activity_when_clicked", str);
                                    bundle2.putString("recent_item_name", extras.getString("label"));
                                    bundle2.putString("recent_item_type", "collection_activity");
                                    bundle2.putString("source", extras.getString("recentSource"));
                                    bundle2.putString("collection_name", (String) is.u.j2(0, libraryCollection.getStrings()));
                                    bundle2.putBoolean("paid_recent_item", !extras.getBoolean("isFree", true));
                                    UtilsKt.fireAnalytics("lib_recent_cta_click", bundle2);
                                    kVar = hs.k.f19476a;
                                }
                            }
                        }
                        if (kVar == null) {
                            Extensions extensions = Extensions.INSTANCE;
                            Context requireContext = tVar.requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            String string = tVar.getString(R.string.telecommunicationsError);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.telecommunicationsError)");
                            Extensions.toast$default(extensions, requireContext, string, 0, 2, null);
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class u extends kotlin.jvm.internal.k implements ss.l<List<? extends LearningHubModel>, hs.k> {
        public u() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends LearningHubModel> list) {
            List<? extends LearningHubModel> list2 = list;
            t tVar = t.this;
            try {
                kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.LearningHubModel?>");
                tVar.C = (ArrayList) list2;
                t.O(tVar);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f775u, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class v extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public v() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            t tVar = t.this;
            if (bool2 != null) {
                try {
                    bool2.booleanValue();
                    if (bool2.booleanValue()) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) tVar._$_findCachedViewById(R.id.clProgressView);
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(0);
                        }
                    } else {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar._$_findCachedViewById(R.id.clProgressView);
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f775u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class w extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourseMetadata>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k0 f809v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(k0 k0Var) {
            super(1);
            this.f809v = k0Var;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourseMetadata> list) {
            ArrayList<MiniCourseMetadata> arrayList;
            List<? extends MiniCourseMetadata> list2 = list;
            t tVar = t.this;
            try {
                arrayList = tVar.F;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f775u, e10);
            }
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?>");
                    tVar.D = (ArrayList) list2;
                    k0 k0Var = this.f809v;
                    k0Var.getClass();
                    try {
                        ta.v.H(kc.f.H(k0Var), null, 0, new w0(k0Var, null), 3);
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(k0Var.f5596y, e11);
                    }
                }
                tVar.N[0] = Boolean.TRUE;
                t.J(tVar);
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("tcMetaDataList");
            throw null;
        }
    }

    /* compiled from: LibraryHomeFragment.kt */
    /* loaded from: classes2.dex */
    public static final class x extends kotlin.jvm.internal.k implements ss.r<MiniCourseMetadata, MiniCourse, String, Integer, hs.k> {
        public x() {
            super(4);
        }

        @Override // ss.r
        public final hs.k r(MiniCourseMetadata miniCourseMetadata, MiniCourse miniCourse, String str, Integer num) {
            LibraryActivity libraryActivity;
            MiniCourseMetadata miniCourseMetadata2 = miniCourseMetadata;
            MiniCourse miniCourseModel = miniCourse;
            String chip = str;
            int intValue = num.intValue();
            kotlin.jvm.internal.i.g(miniCourseModel, "miniCourseModel");
            kotlin.jvm.internal.i.g(chip, "chip");
            t tVar = t.this;
            androidx.fragment.app.p requireActivity = tVar.requireActivity();
            if (requireActivity instanceof LibraryActivity) {
                libraryActivity = (LibraryActivity) requireActivity;
            } else {
                libraryActivity = null;
            }
            if (libraryActivity != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("mcMetaData", miniCourseMetadata2);
                bundle.putSerializable("miniCourse", miniCourseModel);
                bundle.putString("miniCourse_chip", chip);
                bundle.putInt("miniCourse_position_in_list", intValue);
                hs.k kVar = hs.k.f19476a;
                libraryActivity.n0(bundle, "short_courses");
            }
            bn.c cVar = tVar.c0;
            if (cVar != null) {
                cVar.c("short_courses");
            }
            String[] strArr = new String[3];
            String str2 = "";
            strArr[0] = (miniCourseMetadata2 == null || (r6 = miniCourseMetadata2.getId()) == null) ? "" : "";
            String domain = miniCourseModel.getDomain();
            if (domain == null) {
                domain = "";
            }
            strArr[1] = domain;
            String course = miniCourseModel.getCourse();
            if (course != null) {
                str2 = course;
            }
            strArr[2] = str2;
            tVar.R = strArr;
            return hs.k.f19476a;
        }
    }

    public t() {
        String[] strArr = new String[3];
        for (int i6 = 0; i6 < 3; i6++) {
            strArr[i6] = "";
        }
        this.f780z = strArr;
        this.C = new ArrayList<>();
        this.H = new HashSet<>();
        this.J = new ArrayList<>();
        this.K = new ArrayList<>();
        this.M = true;
        Boolean[] boolArr = new Boolean[4];
        for (int i10 = 0; i10 < 4; i10++) {
            boolArr[i10] = Boolean.FALSE;
        }
        this.N = boolArr;
        this.O = new HashSet<>();
        String[] strArr2 = new String[3];
        for (int i11 = 0; i11 < 3; i11++) {
            strArr2[i11] = "";
        }
        this.R = strArr2;
        Boolean[] boolArr2 = new Boolean[5];
        for (int i12 = 0; i12 < 5; i12++) {
            boolArr2[i12] = Boolean.FALSE;
        }
        this.U = boolArr2;
        Boolean[] boolArr3 = new Boolean[3];
        for (int i13 = 0; i13 < 3; i13++) {
            boolArr3[i13] = Boolean.FALSE;
        }
        this.V = boolArr3;
        Boolean[] boolArr4 = new Boolean[3];
        for (int i14 = 0; i14 < 3; i14++) {
            boolArr4[i14] = Boolean.FALSE;
        }
        this.W = boolArr4;
        Boolean[] boolArr5 = new Boolean[3];
        for (int i15 = 0; i15 < 3; i15++) {
            boolArr5[i15] = Boolean.FALSE;
        }
        this.X = boolArr5;
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.o

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ t f759v;

            {
                this.f759v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                RecyclerView.e eVar;
                boolean z11;
                RecyclerView.e eVar2;
                boolean z12;
                RecyclerView.e eVar3;
                boolean z13;
                RecyclerView.e eVar4;
                boolean z14;
                RecyclerView.e eVar5;
                boolean z15;
                RecyclerView.e eVar6;
                int i16 = r2;
                zm.c cVar = null;
                t this$0 = this.f759v;
                boolean z16 = true;
                switch (i16) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i17 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                        if (((LibraryActivity) requireActivity).C) {
                            this$0.requireActivity().onBackPressed();
                            return;
                        }
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i18 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent = aVar2.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String[] strArr3 = this$0.f780z;
                            if (z12) {
                                if (strArr3.length == 3) {
                                    int length = strArr3.length;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < length) {
                                            if (gv.n.B0(strArr3[i19])) {
                                                z13 = false;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        k0 k0Var = this$0.B;
                                        if (k0Var != null) {
                                            k0Var.i(strArr3[0], strArr3[1], strArr3[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView != null) {
                                            eVar4 = recyclerView.getAdapter();
                                        } else {
                                            eVar4 = null;
                                        }
                                        if (eVar4 instanceof zm.c) {
                                            cVar = eVar4;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr3[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr3.length == 3) {
                                int length2 = strArr3.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length2) {
                                        if (gv.n.B0(strArr3[i20])) {
                                            z16 = false;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView2 != null) {
                                        eVar3 = recyclerView2.getAdapter();
                                    } else {
                                        eVar3 = null;
                                    }
                                    if (eVar3 instanceof zm.c) {
                                        cVar = eVar3;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr3[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f775u, e10);
                            return;
                        }
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i21 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent2 = aVar3.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("isCompleted", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String[] strArr4 = this$0.f780z;
                            if (z14) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < length3) {
                                            if (gv.n.B0(strArr4[i22])) {
                                                z15 = false;
                                            } else {
                                                i22++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        k0 k0Var2 = this$0.B;
                                        if (k0Var2 != null) {
                                            k0Var2.i(strArr4[0], strArr4[1], strArr4[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView3 != null) {
                                            eVar6 = recyclerView3.getAdapter();
                                        } else {
                                            eVar6 = null;
                                        }
                                        if (eVar6 instanceof zm.c) {
                                            cVar = eVar6;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr4[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr4.length == 3) {
                                int length4 = strArr4.length;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < length4) {
                                        if (gv.n.B0(strArr4[i23])) {
                                            z16 = false;
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView4 != null) {
                                        eVar5 = recyclerView4.getAdapter();
                                    } else {
                                        eVar5 = null;
                                    }
                                    if (eVar5 instanceof zm.c) {
                                        cVar = eVar5;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr4[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f775u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i24 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent3 = aVar4.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("wasActivityPlayed", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String[] strArr5 = this$0.f780z;
                            if (z10) {
                                if (strArr5.length == 3) {
                                    int length5 = strArr5.length;
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 < length5) {
                                            if (gv.n.B0(strArr5[i25])) {
                                                z11 = false;
                                            } else {
                                                i25++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        k0 k0Var3 = this$0.B;
                                        if (k0Var3 != null) {
                                            k0Var3.i(strArr5[0], strArr5[1], strArr5[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView5 != null) {
                                            eVar2 = recyclerView5.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar = eVar2;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr5[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr5.length == 3) {
                                int length6 = strArr5.length;
                                int i26 = 0;
                                while (true) {
                                    if (i26 < length6) {
                                        if (gv.n.B0(strArr5[i26])) {
                                            z16 = false;
                                        } else {
                                            i26++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView6 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView6 != null) {
                                        eVar = recyclerView6.getAdapter();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar instanceof zm.c) {
                                        cVar = eVar;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr5[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f775u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…Pressed()\n        }\n    }");
        this.Y = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.o

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ t f759v;

            {
                this.f759v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                RecyclerView.e eVar;
                boolean z11;
                RecyclerView.e eVar2;
                boolean z12;
                RecyclerView.e eVar3;
                boolean z13;
                RecyclerView.e eVar4;
                boolean z14;
                RecyclerView.e eVar5;
                boolean z15;
                RecyclerView.e eVar6;
                int i16 = r2;
                zm.c cVar = null;
                t this$0 = this.f759v;
                boolean z16 = true;
                switch (i16) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i17 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                        if (((LibraryActivity) requireActivity).C) {
                            this$0.requireActivity().onBackPressed();
                            return;
                        }
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i18 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent = aVar2.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String[] strArr3 = this$0.f780z;
                            if (z12) {
                                if (strArr3.length == 3) {
                                    int length = strArr3.length;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < length) {
                                            if (gv.n.B0(strArr3[i19])) {
                                                z13 = false;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        k0 k0Var = this$0.B;
                                        if (k0Var != null) {
                                            k0Var.i(strArr3[0], strArr3[1], strArr3[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView != null) {
                                            eVar4 = recyclerView.getAdapter();
                                        } else {
                                            eVar4 = null;
                                        }
                                        if (eVar4 instanceof zm.c) {
                                            cVar = eVar4;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr3[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr3.length == 3) {
                                int length2 = strArr3.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length2) {
                                        if (gv.n.B0(strArr3[i20])) {
                                            z16 = false;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView2 != null) {
                                        eVar3 = recyclerView2.getAdapter();
                                    } else {
                                        eVar3 = null;
                                    }
                                    if (eVar3 instanceof zm.c) {
                                        cVar = eVar3;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr3[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f775u, e10);
                            return;
                        }
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i21 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent2 = aVar3.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("isCompleted", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String[] strArr4 = this$0.f780z;
                            if (z14) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < length3) {
                                            if (gv.n.B0(strArr4[i22])) {
                                                z15 = false;
                                            } else {
                                                i22++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        k0 k0Var2 = this$0.B;
                                        if (k0Var2 != null) {
                                            k0Var2.i(strArr4[0], strArr4[1], strArr4[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView3 != null) {
                                            eVar6 = recyclerView3.getAdapter();
                                        } else {
                                            eVar6 = null;
                                        }
                                        if (eVar6 instanceof zm.c) {
                                            cVar = eVar6;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr4[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr4.length == 3) {
                                int length4 = strArr4.length;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < length4) {
                                        if (gv.n.B0(strArr4[i23])) {
                                            z16 = false;
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView4 != null) {
                                        eVar5 = recyclerView4.getAdapter();
                                    } else {
                                        eVar5 = null;
                                    }
                                    if (eVar5 instanceof zm.c) {
                                        cVar = eVar5;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr4[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f775u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i24 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent3 = aVar4.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("wasActivityPlayed", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String[] strArr5 = this$0.f780z;
                            if (z10) {
                                if (strArr5.length == 3) {
                                    int length5 = strArr5.length;
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 < length5) {
                                            if (gv.n.B0(strArr5[i25])) {
                                                z11 = false;
                                            } else {
                                                i25++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        k0 k0Var3 = this$0.B;
                                        if (k0Var3 != null) {
                                            k0Var3.i(strArr5[0], strArr5[1], strArr5[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView5 != null) {
                                            eVar2 = recyclerView5.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar = eVar2;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr5[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr5.length == 3) {
                                int length6 = strArr5.length;
                                int i26 = 0;
                                while (true) {
                                    if (i26 < length6) {
                                        if (gv.n.B0(strArr5[i26])) {
                                            z16 = false;
                                        } else {
                                            i26++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView6 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView6 != null) {
                                        eVar = recyclerView6.getAdapter();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar instanceof zm.c) {
                                        cVar = eVar;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr5[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f775u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.Z = registerForActivityResult2;
        androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.o

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ t f759v;

            {
                this.f759v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                RecyclerView.e eVar;
                boolean z11;
                RecyclerView.e eVar2;
                boolean z12;
                RecyclerView.e eVar3;
                boolean z13;
                RecyclerView.e eVar4;
                boolean z14;
                RecyclerView.e eVar5;
                boolean z15;
                RecyclerView.e eVar6;
                int i16 = r2;
                zm.c cVar = null;
                t this$0 = this.f759v;
                boolean z16 = true;
                switch (i16) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i17 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                        if (((LibraryActivity) requireActivity).C) {
                            this$0.requireActivity().onBackPressed();
                            return;
                        }
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i18 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent = aVar2.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String[] strArr3 = this$0.f780z;
                            if (z12) {
                                if (strArr3.length == 3) {
                                    int length = strArr3.length;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < length) {
                                            if (gv.n.B0(strArr3[i19])) {
                                                z13 = false;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        k0 k0Var = this$0.B;
                                        if (k0Var != null) {
                                            k0Var.i(strArr3[0], strArr3[1], strArr3[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView != null) {
                                            eVar4 = recyclerView.getAdapter();
                                        } else {
                                            eVar4 = null;
                                        }
                                        if (eVar4 instanceof zm.c) {
                                            cVar = eVar4;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr3[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr3.length == 3) {
                                int length2 = strArr3.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length2) {
                                        if (gv.n.B0(strArr3[i20])) {
                                            z16 = false;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView2 != null) {
                                        eVar3 = recyclerView2.getAdapter();
                                    } else {
                                        eVar3 = null;
                                    }
                                    if (eVar3 instanceof zm.c) {
                                        cVar = eVar3;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr3[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f775u, e10);
                            return;
                        }
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i21 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent2 = aVar3.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("isCompleted", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String[] strArr4 = this$0.f780z;
                            if (z14) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < length3) {
                                            if (gv.n.B0(strArr4[i22])) {
                                                z15 = false;
                                            } else {
                                                i22++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        k0 k0Var2 = this$0.B;
                                        if (k0Var2 != null) {
                                            k0Var2.i(strArr4[0], strArr4[1], strArr4[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView3 != null) {
                                            eVar6 = recyclerView3.getAdapter();
                                        } else {
                                            eVar6 = null;
                                        }
                                        if (eVar6 instanceof zm.c) {
                                            cVar = eVar6;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr4[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr4.length == 3) {
                                int length4 = strArr4.length;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < length4) {
                                        if (gv.n.B0(strArr4[i23])) {
                                            z16 = false;
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView4 != null) {
                                        eVar5 = recyclerView4.getAdapter();
                                    } else {
                                        eVar5 = null;
                                    }
                                    if (eVar5 instanceof zm.c) {
                                        cVar = eVar5;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr4[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f775u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i24 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent3 = aVar4.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("wasActivityPlayed", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String[] strArr5 = this$0.f780z;
                            if (z10) {
                                if (strArr5.length == 3) {
                                    int length5 = strArr5.length;
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 < length5) {
                                            if (gv.n.B0(strArr5[i25])) {
                                                z11 = false;
                                            } else {
                                                i25++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        k0 k0Var3 = this$0.B;
                                        if (k0Var3 != null) {
                                            k0Var3.i(strArr5[0], strArr5[1], strArr5[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView5 != null) {
                                            eVar2 = recyclerView5.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar = eVar2;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr5[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr5.length == 3) {
                                int length6 = strArr5.length;
                                int i26 = 0;
                                while (true) {
                                    if (i26 < length6) {
                                        if (gv.n.B0(strArr5[i26])) {
                                            z16 = false;
                                        } else {
                                            i26++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView6 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView6 != null) {
                                        eVar = recyclerView6.getAdapter();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar instanceof zm.c) {
                                        cVar = eVar;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr5[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f775u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.f771a0 = registerForActivityResult3;
        androidx.activity.result.c<Intent> registerForActivityResult4 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: an.o

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ t f759v;

            {
                this.f759v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                RecyclerView.e eVar;
                boolean z11;
                RecyclerView.e eVar2;
                boolean z12;
                RecyclerView.e eVar3;
                boolean z13;
                RecyclerView.e eVar4;
                boolean z14;
                RecyclerView.e eVar5;
                boolean z15;
                RecyclerView.e eVar6;
                int i16 = r2;
                zm.c cVar = null;
                t this$0 = this.f759v;
                boolean z16 = true;
                switch (i16) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i17 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                        if (((LibraryActivity) requireActivity).C) {
                            this$0.requireActivity().onBackPressed();
                            return;
                        }
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i18 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent = aVar2.f977v;
                            if (intent != null && intent.hasExtra("showSelling")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String[] strArr3 = this$0.f780z;
                            if (z12) {
                                if (strArr3.length == 3) {
                                    int length = strArr3.length;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < length) {
                                            if (gv.n.B0(strArr3[i19])) {
                                                z13 = false;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        k0 k0Var = this$0.B;
                                        if (k0Var != null) {
                                            k0Var.i(strArr3[0], strArr3[1], strArr3[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView != null) {
                                            eVar4 = recyclerView.getAdapter();
                                        } else {
                                            eVar4 = null;
                                        }
                                        if (eVar4 instanceof zm.c) {
                                            cVar = eVar4;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr3[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr3.length == 3) {
                                int length2 = strArr3.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length2) {
                                        if (gv.n.B0(strArr3[i20])) {
                                            z16 = false;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView2 != null) {
                                        eVar3 = recyclerView2.getAdapter();
                                    } else {
                                        eVar3 = null;
                                    }
                                    if (eVar3 instanceof zm.c) {
                                        cVar = eVar3;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr3[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f775u, e10);
                            return;
                        }
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i21 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent2 = aVar3.f977v;
                            if (intent2 != null && intent2.getBooleanExtra("isCompleted", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String[] strArr4 = this$0.f780z;
                            if (z14) {
                                if (strArr4.length == 3) {
                                    int length3 = strArr4.length;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < length3) {
                                            if (gv.n.B0(strArr4[i22])) {
                                                z15 = false;
                                            } else {
                                                i22++;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        k0 k0Var2 = this$0.B;
                                        if (k0Var2 != null) {
                                            k0Var2.i(strArr4[0], strArr4[1], strArr4[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                        if (recyclerView3 != null) {
                                            eVar6 = recyclerView3.getAdapter();
                                        } else {
                                            eVar6 = null;
                                        }
                                        if (eVar6 instanceof zm.c) {
                                            cVar = eVar6;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr4[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr4.length == 3) {
                                int length4 = strArr4.length;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < length4) {
                                        if (gv.n.B0(strArr4[i23])) {
                                            z16 = false;
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                    if (recyclerView4 != null) {
                                        eVar5 = recyclerView4.getAdapter();
                                    } else {
                                        eVar5 = null;
                                    }
                                    if (eVar5 instanceof zm.c) {
                                        cVar = eVar5;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr4[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f775u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i24 = t.f770g0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Intent intent3 = aVar4.f977v;
                            if (intent3 != null && intent3.getBooleanExtra("wasActivityPlayed", false)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String[] strArr5 = this$0.f780z;
                            if (z10) {
                                if (strArr5.length == 3) {
                                    int length5 = strArr5.length;
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 < length5) {
                                            if (gv.n.B0(strArr5[i25])) {
                                                z11 = false;
                                            } else {
                                                i25++;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        k0 k0Var3 = this$0.B;
                                        if (k0Var3 != null) {
                                            k0Var3.i(strArr5[0], strArr5[1], strArr5[2], this$0.f777w, this$0.A);
                                        }
                                        RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                        if (recyclerView5 != null) {
                                            eVar2 = recyclerView5.getAdapter();
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 instanceof zm.c) {
                                            cVar = eVar2;
                                        }
                                        if (cVar != null) {
                                            cVar.y(strArr5[0]);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (strArr5.length == 3) {
                                int length6 = strArr5.length;
                                int i26 = 0;
                                while (true) {
                                    if (i26 < length6) {
                                        if (gv.n.B0(strArr5[i26])) {
                                            z16 = false;
                                        } else {
                                            i26++;
                                        }
                                    }
                                }
                                if (z16) {
                                    RecyclerView recyclerView6 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                    if (recyclerView6 != null) {
                                        eVar = recyclerView6.getAdapter();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar instanceof zm.c) {
                                        cVar = eVar;
                                    }
                                    if (cVar != null) {
                                        cVar.x(strArr5[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f775u, e12);
                            return;
                        }
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult4, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.f772b0 = registerForActivityResult4;
        this.f773d0 = sp.b.O(new e());
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(t tVar) {
        boolean z10;
        LibraryActivity libraryActivity;
        LibraryActivity libraryActivity2;
        androidx.lifecycle.w<LibraryCollection> wVar;
        LibraryCollection d10;
        ArrayList<LibraryCollectionItem> itemList;
        Object obj;
        Object obj2;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        boolean z13;
        String str3;
        String str4;
        boolean z14;
        RecyclerView.e eVar;
        zm.c cVar;
        LibraryActivity libraryActivity3;
        String str5;
        boolean z15;
        String str6;
        boolean z16;
        String str7;
        tVar.getClass();
        try {
            if (tVar.M) {
                Boolean[] boolArr = tVar.N;
                int length = boolArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        if (!boolArr[i6].booleanValue()) {
                            z10 = false;
                            break;
                        }
                        i6++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    HashSet<String> hashSet = tVar.O;
                    if (!hashSet.isEmpty()) {
                        ArrayList<MiniCourseMetadata> arrayList = tVar.D;
                        HashMap<String, String> hashMap = null;
                        if (arrayList != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) obj3;
                                if (miniCourseMetadata != null) {
                                    str7 = miniCourseMetadata.getId();
                                } else {
                                    str7 = null;
                                }
                                if (is.u.Z1(hashSet, str7)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList<MiniCourse> arrayList3 = tVar.E;
                            if (arrayList3 != null) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : arrayList3) {
                                    MiniCourse miniCourse = (MiniCourse) obj4;
                                    if (miniCourse != null) {
                                        str5 = miniCourse.getDomain();
                                    } else {
                                        str5 = null;
                                    }
                                    if (str5 != null) {
                                        if (!arrayList2.isEmpty()) {
                                            Iterator it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                MiniCourseMetadata miniCourseMetadata2 = (MiniCourseMetadata) it.next();
                                                if (miniCourseMetadata2 != null) {
                                                    str6 = miniCourseMetadata2.getSlug();
                                                } else {
                                                    str6 = null;
                                                }
                                                if (kotlin.jvm.internal.i.b(str6, miniCourse.getDomain())) {
                                                    z16 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z16 = false;
                                        if (z16) {
                                            z15 = true;
                                            if (!z15) {
                                                arrayList4.add(obj4);
                                            }
                                        }
                                    }
                                    z15 = false;
                                    if (!z15) {
                                    }
                                }
                                androidx.fragment.app.p requireActivity = tVar.requireActivity();
                                if (requireActivity instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null) {
                                    libraryActivity.f11292w.addAll(arrayList2);
                                    libraryActivity.f11293x.addAll(arrayList4);
                                }
                                tVar.M = false;
                                androidx.fragment.app.p requireActivity2 = tVar.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity2 = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity2 = null;
                                }
                                if (libraryActivity2 != null) {
                                    HashMap<String, String> hashMap2 = new HashMap<>();
                                    k0 k0Var = tVar.B;
                                    if (k0Var != null && (wVar = k0Var.A) != null && (d10 = wVar.d()) != null && (itemList = d10.getItemList()) != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj5 : itemList) {
                                            if (kotlin.jvm.internal.i.b(((LibraryCollectionItem) obj5).getItemType(), "mini_course")) {
                                                arrayList5.add(obj5);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList(is.i.H1(arrayList5, 10));
                                        Iterator it2 = arrayList5.iterator();
                                        while (it2.hasNext()) {
                                            arrayList6.add(((LibraryCollectionItem) it2.next()).getId());
                                        }
                                        Iterator it3 = arrayList6.iterator();
                                        while (it3.hasNext()) {
                                            String str8 = (String) it3.next();
                                            ArrayList<MiniCourseMetadata> arrayList7 = tVar.D;
                                            if (arrayList7 != null) {
                                                Iterator<T> it4 = arrayList7.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        obj = it4.next();
                                                        MiniCourseMetadata miniCourseMetadata3 = (MiniCourseMetadata) obj;
                                                        if (miniCourseMetadata3 != null) {
                                                            str4 = miniCourseMetadata3.getId();
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        if (kotlin.jvm.internal.i.b(str4, str8) && kotlin.jvm.internal.i.b(miniCourseMetadata3.getPublished(), Boolean.TRUE)) {
                                                            z14 = true;
                                                            continue;
                                                        } else {
                                                            z14 = false;
                                                            continue;
                                                        }
                                                        if (z14) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj = null;
                                                        break;
                                                    }
                                                }
                                                MiniCourseMetadata miniCourseMetadata4 = (MiniCourseMetadata) obj;
                                                ArrayList<MiniCourse> arrayList8 = tVar.E;
                                                if (arrayList8 != null) {
                                                    Iterator<T> it5 = arrayList8.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            obj2 = it5.next();
                                                            MiniCourse miniCourse2 = (MiniCourse) obj2;
                                                            if (miniCourse2 != null) {
                                                                str2 = miniCourse2.getDomain();
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (str2 != null) {
                                                                String domain = miniCourse2.getDomain();
                                                                if (miniCourseMetadata4 != null) {
                                                                    str3 = miniCourseMetadata4.getSlug();
                                                                } else {
                                                                    str3 = null;
                                                                }
                                                                if (kotlin.jvm.internal.i.b(domain, str3)) {
                                                                    z13 = true;
                                                                    continue;
                                                                    if (z13) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z13 = false;
                                                            continue;
                                                            if (z13) {
                                                            }
                                                        } else {
                                                            obj2 = null;
                                                            break;
                                                        }
                                                    }
                                                    MiniCourse miniCourse3 = (MiniCourse) obj2;
                                                    if (miniCourse3 != null) {
                                                        CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) is.u.i2(miniCourse3.getPlan());
                                                        if (courseDayModelV1 != null && courseDayModelV1.getStart_date() == 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            str = "not_started";
                                                        } else {
                                                            ArrayList<CourseDayModelV1> plan = miniCourse3.getPlan();
                                                            if (!(plan instanceof Collection) || !plan.isEmpty()) {
                                                                for (CourseDayModelV1 courseDayModelV12 : plan) {
                                                                    if (!courseDayModelV12.isCompleted()) {
                                                                        z12 = false;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z12 = true;
                                                            if (z12) {
                                                                str = "completed";
                                                            } else {
                                                                str = "in_progress";
                                                            }
                                                        }
                                                        hashMap2.put(str8, str);
                                                    }
                                                } else {
                                                    kotlin.jvm.internal.i.q("miniCoursesList");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.q("mcMetaDataList");
                                                throw null;
                                            }
                                        }
                                    }
                                    libraryActivity2.f11295z = hashMap2;
                                }
                                RecyclerView recyclerView = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                if (recyclerView != null) {
                                    eVar = recyclerView.getAdapter();
                                } else {
                                    eVar = null;
                                }
                                if (eVar instanceof zm.c) {
                                    cVar = (zm.c) eVar;
                                } else {
                                    cVar = null;
                                }
                                if (cVar != null) {
                                    androidx.fragment.app.p requireActivity3 = tVar.requireActivity();
                                    if (requireActivity3 instanceof LibraryActivity) {
                                        libraryActivity3 = (LibraryActivity) requireActivity3;
                                    } else {
                                        libraryActivity3 = null;
                                    }
                                    if (libraryActivity3 != null) {
                                        hashMap = libraryActivity3.f11295z;
                                    }
                                    cVar.z(hashMap);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q("miniCoursesList");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("mcMetaDataList");
                        throw null;
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tVar.f775u, e10);
        }
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    public static final void K(t tVar, HashSet hashSet) {
        tVar.getClass();
        try {
            ((ChipGroup) tVar._$_findCachedViewById(R.id.cgShortCoursesFilters)).removeAllViews();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            xVar2.f23469u = "";
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ?? r32 = (String) it.next();
                if (r32 != 0) {
                    int i6 = bn.a.f4534a;
                    ChipGroup cgShortCoursesFilters = (ChipGroup) tVar._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    kotlin.jvm.internal.i.f(cgShortCoursesFilters, "cgShortCoursesFilters");
                    Context requireContext = tVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    Chip b10 = bn.a.b(requireContext, cgShortCoursesFilters, r32);
                    if (b10 != null) {
                        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                        b10.setId(d0.e.a());
                    } else {
                        b10 = null;
                    }
                    if (b10 != null) {
                        if (gv.n.A0(r32, tVar.Z(), true)) {
                            xVar2.f23469u = r32;
                            xVar.f23469u = Integer.valueOf(b10.getId());
                            b10.setChecked(true);
                            b10.setChipBackgroundColorResource(R.color.title_high_contrast);
                            b10.setChipStrokeColorResource(R.color.title_high_contrast);
                            b10.setTextColor(g0.a.b(tVar.requireActivity(), R.color.white));
                        } else {
                            b10.setChipBackgroundColorResource(R.color.white);
                            b10.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                            b10.setTextColor(g0.a.b(tVar.requireActivity(), R.color.title_high_contrast));
                        }
                        ((ChipGroup) tVar._$_findCachedViewById(R.id.cgShortCoursesFilters)).addView(b10);
                    }
                }
            }
            ChipGroup chipGroup = (ChipGroup) tVar._$_findCachedViewById(R.id.cgShortCoursesFilters);
            if (chipGroup != null) {
                chipGroup.setOnCheckedStateChangeListener(new an.q(0, tVar, xVar));
            }
            ((ChipGroup) tVar._$_findCachedViewById(R.id.cgShortCoursesFilters)).post(new an.r(0, tVar, xVar2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tVar.f775u, "Error adding chip", e10);
        }
    }

    public static final void M(t tVar, List list) {
        tVar.getClass();
        try {
            if (list.size() > 3) {
                list = list.subList(0, 3);
            }
            RecyclerView recyclerView = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryCollectionsRecycler);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(tVar.requireContext(), 1, false));
            }
            RecyclerView recyclerView2 = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryCollectionsRecycler);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(new zm.b(is.u.e2(list), new an.u(tVar), new an.v(tVar, list)));
            }
            CardView cardView = (CardView) tVar._$_findCachedViewById(R.id.cvLibraryCollectionLoader);
            if (cardView != null) {
                cardView.setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) tVar._$_findCachedViewById(R.id.shimmerLibraryCollectionBanner);
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.c();
            }
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) tVar._$_findCachedViewById(R.id.shimmerLibraryCollectionHeader);
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.c();
            }
            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) tVar._$_findCachedViewById(R.id.shimmerLibraryCollectionSubHeader);
            if (shimmerFrameLayout3 != null) {
                shimmerFrameLayout3.c();
            }
            ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) tVar._$_findCachedViewById(R.id.shimmerLibraryCollectionCta);
            if (shimmerFrameLayout4 != null) {
                shimmerFrameLayout4.c();
            }
            tVar.U[2] = Boolean.TRUE;
            tVar.U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tVar.f775u, e10);
        }
    }

    public static final void O(t tVar) {
        RecyclerView.e eVar;
        tVar.getClass();
        try {
            if (((RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryDbResources)).getAdapter() == null) {
                ArrayList<LearningHubModel> arrayList = tVar.C;
                androidx.fragment.app.p requireActivity = tVar.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                ((RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryDbResources)).setAdapter(new zm.g(requireActivity, arrayList, new an.w(tVar)));
            } else {
                RecyclerView recyclerView = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryDbResources);
                zm.g gVar = null;
                if (recyclerView != null) {
                    eVar = recyclerView.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof zm.g) {
                    gVar = (zm.g) eVar;
                }
                if (gVar != null) {
                    ArrayList<LearningHubModel> list = tVar.C;
                    kotlin.jvm.internal.i.g(list, "list");
                    gVar.f39651z = list;
                    gVar.i();
                }
            }
            tVar.U[3] = Boolean.TRUE;
            tVar.U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tVar.f775u, e10);
        }
    }

    public static final void P(t tVar, LibraryCollection libraryCollection, HashMap hashMap) {
        LibraryActivity libraryActivity;
        HashMap<String, String> hashMap2;
        RecyclerView.e eVar;
        String str = tVar.f775u;
        if (libraryCollection != null) {
            try {
                ArrayList<LibraryCollectionItem> itemList = libraryCollection.getItemList();
                if (itemList.size() > 1) {
                    is.p.P1(itemList, new an.x());
                }
                RecyclerView recyclerView = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(tVar.requireContext(), 0, false));
                }
                RecyclerView recyclerView2 = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                zm.c cVar = null;
                if (recyclerView2 != null) {
                    ArrayList<LibraryCollectionItem> itemList2 = libraryCollection.getItemList();
                    androidx.fragment.app.p requireActivity = tVar.requireActivity();
                    if (requireActivity instanceof LibraryActivity) {
                        libraryActivity = (LibraryActivity) requireActivity;
                    } else {
                        libraryActivity = null;
                    }
                    if (libraryActivity != null) {
                        hashMap2 = libraryActivity.f11295z;
                    } else {
                        hashMap2 = null;
                    }
                    recyclerView2.setAdapter(new zm.c(itemList2, hashMap, hashMap2, true, new y(tVar)));
                }
                ChipGroup chipGroup = (ChipGroup) tVar._$_findCachedViewById(R.id.cgLibraryTopPicksFilters);
                if (chipGroup != null) {
                    chipGroup.removeAllViews();
                }
                ArrayList<LibraryCollectionItem> itemList3 = libraryCollection.getItemList();
                HashSet hashSet = new HashSet();
                try {
                    for (LibraryCollectionItem libraryCollectionItem : itemList3) {
                        hashSet.addAll(libraryCollectionItem.getChips());
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Locale ENGLISH = Locale.ENGLISH;
                    kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                    String upperCase = str2.toUpperCase(ENGLISH);
                    kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    String lowerCase = str2.toLowerCase(ENGLISH);
                    kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    tVar.c0(upperCase, kotlin.jvm.internal.i.b(lowerCase, "all"));
                }
                try {
                    ChipGroup chipGroup2 = (ChipGroup) tVar._$_findCachedViewById(R.id.cgLibraryTopPicksFilters);
                    if (chipGroup2 != null) {
                        chipGroup2.setOnCheckedStateChangeListener(new fq.s(tVar, 2));
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, e11);
                }
                a0 a0Var = new a0(tVar);
                a0Var.a((RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler));
                RecyclerView recyclerView3 = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                if (recyclerView3 != null) {
                    recyclerView3.i(new z(tVar, a0Var, libraryCollection));
                }
                int i6 = tVar.P;
                int i10 = 6;
                if (libraryCollection.getItemList().size() <= 6) {
                    i10 = libraryCollection.getItemList().size();
                }
                tVar.Q(i6, i10);
                RecyclerView recyclerView4 = (RecyclerView) tVar._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                if (recyclerView4 != null) {
                    eVar = recyclerView4.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof zm.c) {
                    cVar = eVar;
                }
                if (cVar != null) {
                    cVar.v("all");
                }
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) tVar._$_findCachedViewById(R.id.shimmerLibraryTopPicksHeader);
                if (shimmerFrameLayout != null) {
                    shimmerFrameLayout.c();
                }
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) tVar._$_findCachedViewById(R.id.shimmerLibraryTopPicksSubHeader);
                if (shimmerFrameLayout2 != null) {
                    shimmerFrameLayout2.c();
                }
                ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) tVar._$_findCachedViewById(R.id.shimmerLibraryTopPicksCta);
                if (shimmerFrameLayout3 != null) {
                    shimmerFrameLayout3.c();
                }
                CardView cardView = (CardView) tVar._$_findCachedViewById(R.id.cvLibraryTopPicksLoader);
                if (cardView != null) {
                    cardView.setVisibility(8);
                }
                tVar.U[0] = Boolean.TRUE;
                tVar.U();
            } catch (Exception e12) {
                LogHelper.INSTANCE.e(str, e12);
            }
        }
    }

    @Override // il.n
    public final void H(int i6, String str) {
        k0 k0Var = this.B;
        if (k0Var != null) {
            ta.v.H(kc.f.H(k0Var), kotlinx.coroutines.o0.f23642c, 0, new y0(k0Var, i6, str, null), 2);
        }
    }

    @Override // rr.b
    public final boolean I() {
        try {
            xj.b bVar = this.T;
            if (bVar != null) {
                bVar.a();
                this.T = null;
                return false;
            }
            gk.a.b(null, "lib_explore_hard_back_click");
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f775u, e10);
            return true;
        }
    }

    public final void Q(int i6, int i10) {
        try {
            View[] viewArr = new View[i10];
            ((LinearLayout) _$_findCachedViewById(R.id.llLibraryTopPicksPageIndicator)).removeAllViews();
            if (getActivity() != null) {
                boolean z10 = false;
                for (int i11 = 0; i11 < i10; i11++) {
                    View inflate = getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llLibraryTopPicksPageIndicator)), false);
                    viewArr[i11] = inflate;
                    if (inflate != null) {
                        Context requireContext = requireContext();
                        Object obj = g0.a.f16164a;
                        inflate.setBackground(a.c.b(requireContext, R.drawable.circle_hollow_dark_grey));
                    }
                    ((LinearLayout) _$_findCachedViewById(R.id.llLibraryTopPicksPageIndicator)).addView(viewArr[i11]);
                }
                if (i10 == 0) {
                    z10 = true;
                }
                if (!z10) {
                    View view = viewArr[i6];
                    if (view != null) {
                        Context requireContext2 = requireContext();
                        Object obj2 = g0.a.f16164a;
                        view.setBackground(a.c.b(requireContext2, R.drawable.thumb));
                    }
                    View view2 = viewArr[i6];
                    if (view2 != null) {
                        view2.setBackgroundTintList(g0.a.c(R.color.title_high_contrast, requireContext()));
                    }
                }
            }
            this.P = i6;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void S() {
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView2;
        ViewTreeObserver viewTreeObserver2;
        RecyclerView recyclerView3;
        ViewTreeObserver viewTreeObserver3;
        Boolean[] boolArr = this.V;
        if (!boolArr[0].booleanValue() && (recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses)) != null && (viewTreeObserver3 = recyclerView3.getViewTreeObserver()) != null) {
            viewTreeObserver3.addOnGlobalLayoutListener(new a());
        }
        if (!boolArr[1].booleanValue() && (recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvLibraryCollectionsRecycler)) != null && (viewTreeObserver2 = recyclerView2.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new b());
        }
        if (!boolArr[2].booleanValue() && (recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbResources)) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new c());
        }
        if (boolArr[0].booleanValue() && boolArr[1].booleanValue() && boolArr[2].booleanValue()) {
            Boolean[] boolArr2 = this.W;
            if (boolArr2[0].booleanValue()) {
                ((ScrollStateListenerCustomNestedScrollView) _$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) _$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
            } else if (boolArr2[1].booleanValue()) {
                ((ScrollStateListenerCustomNestedScrollView) _$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) _$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
            } else if (boolArr2[2].booleanValue()) {
                ((ScrollStateListenerCustomNestedScrollView) _$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) _$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
            }
        }
    }

    public final void U() {
        LibraryActivity libraryActivity;
        LibraryActivity libraryActivity2;
        LibraryActivity libraryActivity3;
        Boolean[] boolArr = this.U;
        if (boolArr[0].booleanValue() && boolArr[1].booleanValue() && boolArr[2].booleanValue() && boolArr[3].booleanValue() && !boolArr[4].booleanValue()) {
            Boolean bool = Boolean.TRUE;
            boolArr[4] = bool;
            LibraryActivity libraryActivity4 = null;
            gk.a.b(null, "lib_explore_screen_load");
            if (is.k.Q1(bool, this.W)) {
                S();
            }
            Boolean[] boolArr2 = this.X;
            if (is.k.Q1(bool, boolArr2)) {
                if (boolArr2[0].booleanValue()) {
                    androidx.fragment.app.p requireActivity = requireActivity();
                    if (requireActivity instanceof LibraryActivity) {
                        libraryActivity3 = (LibraryActivity) requireActivity;
                    } else {
                        libraryActivity3 = null;
                    }
                    if (libraryActivity3 != null) {
                        int i6 = LibraryActivity.E;
                        libraryActivity3.n0(null, "all_short_courses");
                    }
                    bn.c cVar = this.c0;
                    if (cVar != null) {
                        cVar.c("short_courses");
                    }
                } else if (boolArr2[1].booleanValue()) {
                    if (Utils.INSTANCE.checkConnectivity(requireActivity())) {
                        androidx.fragment.app.p requireActivity2 = requireActivity();
                        if (requireActivity2 instanceof LibraryActivity) {
                            libraryActivity2 = (LibraryActivity) requireActivity2;
                        } else {
                            libraryActivity2 = null;
                        }
                        if (libraryActivity2 != null) {
                            int i10 = LibraryActivity.E;
                            libraryActivity2.n0(null, "all_collections");
                        }
                        bn.c cVar2 = this.c0;
                        if (cVar2 != null) {
                            cVar2.c("collection");
                        }
                    }
                } else if (Utils.INSTANCE.checkConnectivity(requireActivity())) {
                    androidx.fragment.app.p requireActivity3 = requireActivity();
                    if (requireActivity3 instanceof LibraryActivity) {
                        libraryActivity = (LibraryActivity) requireActivity3;
                    } else {
                        libraryActivity = null;
                    }
                    if (libraryActivity != null) {
                        int i11 = LibraryActivity.E;
                        libraryActivity.n0(null, "resources");
                    }
                }
            }
            if (ApplicationPersistence.getInstance().getBooleanValue("new_user", false) && !this.e0) {
                boolean z10 = !ApplicationPersistence.getInstance().getBooleanValue("lib_coach_mark_tp", false);
                boolean z11 = !ApplicationPersistence.getInstance().getBooleanValue("lib_coach_mark_sc", false);
                boolean z12 = !ApplicationPersistence.getInstance().getBooleanValue("lib_coach_mark_co", false);
                if (!z10 && !z11 && !z12) {
                    androidx.fragment.app.p requireActivity4 = requireActivity();
                    if (requireActivity4 instanceof LibraryActivity) {
                        libraryActivity4 = (LibraryActivity) requireActivity4;
                    }
                    if (libraryActivity4 != null) {
                        libraryActivity4.D = true;
                        return;
                    }
                    return;
                }
                androidx.fragment.app.p requireActivity5 = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity5, "requireActivity()");
                this.c0 = new bn.c(requireActivity5, getView(), new d());
                return;
            }
            androidx.fragment.app.p requireActivity6 = requireActivity();
            if (requireActivity6 instanceof LibraryActivity) {
                libraryActivity4 = (LibraryActivity) requireActivity6;
            }
            if (libraryActivity4 != null) {
                libraryActivity4.D = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x03e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Bundle extras;
        boolean z11;
        boolean z12;
        boolean z13;
        String str6;
        String str7;
        String str8;
        String str9;
        MiniCourse miniCourse;
        MiniCourseMetadata miniCourseMetadata;
        androidx.lifecycle.w<Boolean> wVar;
        String str10;
        Bundle extras2;
        androidx.lifecycle.w<Boolean> wVar2;
        HashMap<String, LibraryCollectionItemAccessModel> hashMap;
        LibraryCollection libraryCollection;
        String string;
        LibraryActivity libraryActivity;
        LibraryActivity libraryActivity2;
        String str11;
        Bundle extras3;
        boolean z14;
        LearningHubModel learningHubModel;
        Boolean bool;
        Object obj;
        Object obj2;
        String str12;
        String str13;
        Object obj3;
        boolean z15;
        boolean z16;
        ArrayList<PostsRead> postsRead;
        ArrayList<PostsRead> postsRead2;
        boolean z17;
        Bundle extras4 = requireActivity().getIntent().getExtras();
        if (extras4 != null && extras4.containsKey("operation")) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str14 = null;
        if (z10) {
            Bundle extras5 = requireActivity().getIntent().getExtras();
            if (extras5 != null) {
                z13 = extras5.getBoolean("finish_on_back_pressed", true);
            } else {
                z13 = true;
            }
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
            ((LibraryActivity) requireActivity).C = z13;
            Bundle extras6 = requireActivity().getIntent().getExtras();
            if (extras6 != null) {
                str6 = extras6.getString("itemType", "");
            } else {
                str6 = null;
            }
            if (kotlin.jvm.internal.i.b(str6, "resource")) {
                Serializable serializable = extras6.getSerializable("resourceModel");
                if (serializable instanceof LearningHubModel) {
                    learningHubModel = (LearningHubModel) serializable;
                } else {
                    learningHubModel = null;
                }
                if (learningHubModel != null) {
                    this.Y.a(new Intent(requireActivity(), LearningHubArticleExperimentActivity.class).putExtra("model", learningHubModel));
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    User user = firebasePersistence.getUser();
                    if (user != null && (postsRead2 = user.getPostsRead()) != null) {
                        if (!postsRead2.isEmpty()) {
                            for (PostsRead postsRead3 : postsRead2) {
                                if (kotlin.jvm.internal.i.b(postsRead3.getPostId(), learningHubModel.getId())) {
                                    z17 = true;
                                    break;
                                }
                            }
                        }
                        z17 = false;
                        bool = Boolean.valueOf(z17);
                    } else {
                        bool = null;
                    }
                    if (kotlin.jvm.internal.i.b(bool, Boolean.FALSE)) {
                        User user2 = firebasePersistence.getUser();
                        if (user2 != null && (postsRead = user2.getPostsRead()) != null) {
                            PostsRead postsRead4 = new PostsRead();
                            postsRead4.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            postsRead4.setPostId(learningHubModel.getId());
                            postsRead.add(postsRead4);
                        }
                        firebasePersistence.updateUserOnFirebase();
                    }
                    if (learningHubModel.getId() != null) {
                        Iterator<T> it = learningHubModel.getFields().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj;
                                if (kotlin.jvm.internal.i.b(learningHubFieldModel.getData_title(), "title") && kotlin.jvm.internal.i.b(learningHubFieldModel.getData_type(), "text")) {
                                    z16 = true;
                                    continue;
                                } else {
                                    z16 = false;
                                    continue;
                                }
                                if (z16) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj;
                        if (learningHubFieldModel2 == null) {
                            Iterator<T> it2 = learningHubModel.getFields().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    LearningHubFieldModel learningHubFieldModel3 = (LearningHubFieldModel) obj3;
                                    if (kotlin.jvm.internal.i.b(learningHubFieldModel3.getData_title(), "short_desc") && kotlin.jvm.internal.i.b(learningHubFieldModel3.getData_type(), "text")) {
                                        z15 = true;
                                        continue;
                                    } else {
                                        z15 = false;
                                        continue;
                                    }
                                    if (z15) {
                                        break;
                                    }
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            }
                            learningHubFieldModel2 = (LearningHubFieldModel) obj3;
                        }
                        if (learningHubFieldModel2 != null) {
                            obj2 = learningHubFieldModel2.getValue();
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof String) {
                            str12 = (String) obj2;
                        } else {
                            str12 = null;
                        }
                        k0 k0Var = this.B;
                        if (k0Var != null) {
                            String id2 = learningHubModel.getId();
                            if (str12 == null) {
                                str13 = "";
                            } else {
                                str13 = str12;
                            }
                            k0Var.h(id2, "resource", str13, Calendar.getInstance().getTimeInMillis(), true, "resource", "resource", true);
                        }
                    }
                } else {
                    k0 k0Var2 = this.B;
                    if (k0Var2 != null) {
                        k0Var2.m(extras6.getString("id"));
                    }
                }
            } else {
                if (extras6 != null) {
                    str7 = extras6.getString("parentType", "");
                } else {
                    str7 = null;
                }
                if (kotlin.jvm.internal.i.b(str7, "collections")) {
                    Serializable serializable2 = extras6.getSerializable("completionMap");
                    if (serializable2 instanceof HashMap) {
                        hashMap = (HashMap) serializable2;
                    } else {
                        hashMap = null;
                    }
                    Serializable serializable3 = extras6.getSerializable("collectionModel");
                    if (serializable3 instanceof LibraryCollection) {
                        libraryCollection = (LibraryCollection) serializable3;
                    } else {
                        libraryCollection = null;
                    }
                    if (hashMap != null && libraryCollection != null) {
                        androidx.fragment.app.p requireActivity2 = requireActivity();
                        if (requireActivity2 instanceof LibraryActivity) {
                            libraryActivity = (LibraryActivity) requireActivity2;
                        } else {
                            libraryActivity = null;
                        }
                        if (libraryActivity != null) {
                            libraryActivity.f11294y = hashMap;
                        }
                        androidx.fragment.app.p requireActivity3 = requireActivity();
                        if (requireActivity3 instanceof LibraryActivity) {
                            libraryActivity2 = (LibraryActivity) requireActivity3;
                        } else {
                            libraryActivity2 = null;
                        }
                        if (libraryActivity2 != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("collection_id", libraryCollection.getId());
                            Intent intent = requireActivity().getIntent();
                            if (intent != null && (extras3 = intent.getExtras()) != null) {
                                str11 = extras3.getString("id");
                            } else {
                                str11 = null;
                            }
                            bundle.putString("scroll_and_highlight_id", str11);
                            bundle.putInt("collection_pos", libraryCollection.getPosition());
                            bundle.putSerializable("collection", libraryCollection);
                            hs.k kVar = hs.k.f19476a;
                            libraryActivity2.n0(bundle, "collection");
                        }
                    } else {
                        k0 k0Var3 = this.B;
                        if (k0Var3 != null && (string = extras6.getString("parentId")) != null) {
                            try {
                                ta.v.H(kc.f.H(k0Var3), null, 0, new q0(k0Var3, string, null), 3);
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(k0Var3.f5596y, e10);
                            }
                        }
                        this.S = true;
                    }
                } else {
                    if (extras6 != null) {
                        str8 = extras6.getString("parentType", "");
                    } else {
                        str8 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str8, "top_picks")) {
                        this.Q = true;
                        k0 k0Var4 = this.B;
                        if (k0Var4 != null) {
                            wVar2 = k0Var4.p();
                        } else {
                            wVar2 = null;
                        }
                        if (wVar2 != null) {
                            wVar2.l(Boolean.TRUE);
                        }
                        k0 k0Var5 = this.B;
                        if (k0Var5 != null) {
                            try {
                                ta.v.H(kc.f.H(k0Var5), null, 0, new u0(k0Var5, null), 3);
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(k0Var5.f5596y, e11);
                            }
                        }
                    } else {
                        if (extras6 != null) {
                            str9 = extras6.getString("parentType", "");
                        } else {
                            str9 = null;
                        }
                        if (kotlin.jvm.internal.i.b(str9, "mini_course")) {
                            Serializable serializable4 = extras6.getSerializable("mc_model");
                            if (serializable4 instanceof MiniCourse) {
                                miniCourse = (MiniCourse) serializable4;
                            } else {
                                miniCourse = null;
                            }
                            Serializable serializable5 = extras6.getSerializable("mc_meta");
                            if (serializable5 instanceof MiniCourseMetadata) {
                                miniCourseMetadata = (MiniCourseMetadata) serializable5;
                            } else {
                                miniCourseMetadata = null;
                            }
                            if (miniCourse != null && miniCourseMetadata != null) {
                                androidx.fragment.app.p requireActivity4 = requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                                LibraryActivity libraryActivity3 = (LibraryActivity) requireActivity4;
                                Bundle bundle2 = new Bundle();
                                Intent intent2 = requireActivity().getIntent();
                                if (intent2 != null && (extras2 = intent2.getExtras()) != null) {
                                    str10 = extras2.getString("id");
                                } else {
                                    str10 = null;
                                }
                                bundle2.putString("scroll_and_highlight_id", str10);
                                bundle2.putSerializable("mcMetaData", miniCourseMetadata);
                                bundle2.putSerializable("miniCourse", miniCourse);
                                hs.k kVar2 = hs.k.f19476a;
                                libraryActivity3.n0(bundle2, "short_courses");
                            } else {
                                this.L = true;
                                k0 k0Var6 = this.B;
                                if (k0Var6 != null) {
                                    wVar = k0Var6.p();
                                } else {
                                    wVar = null;
                                }
                                if (wVar != null) {
                                    wVar.l(Boolean.TRUE);
                                }
                                Y();
                            }
                        }
                    }
                }
            }
            Bundle extras7 = requireActivity().getIntent().getExtras();
            if (extras7 != null) {
                z14 = extras7.getBoolean("disable_coachmark", false);
            } else {
                z14 = false;
            }
            this.e0 = z14;
        }
        Bundle extras8 = requireActivity().getIntent().getExtras();
        if (extras8 != null) {
            str = extras8.getString("highlight", "");
        } else {
            str = null;
        }
        boolean b10 = kotlin.jvm.internal.i.b(str, "short_courses");
        Boolean[] boolArr = this.W;
        if (b10) {
            boolArr[0] = Boolean.TRUE;
        } else {
            if (extras8 != null) {
                str2 = extras8.getString("highlight", "");
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.i.b(str2, "collections")) {
                boolArr[1] = Boolean.TRUE;
            } else {
                if (extras8 != null) {
                    str3 = extras8.getString("highlight", "");
                } else {
                    str3 = null;
                }
                if (kotlin.jvm.internal.i.b(str3, "resources")) {
                    boolArr[2] = Boolean.TRUE;
                } else {
                    if (extras8 != null) {
                        str4 = extras8.getString("view_all", "");
                    } else {
                        str4 = null;
                    }
                    boolean b11 = kotlin.jvm.internal.i.b(str4, "short_courses");
                    Boolean[] boolArr2 = this.X;
                    if (b11) {
                        boolArr2[0] = Boolean.TRUE;
                    } else {
                        if (extras8 != null) {
                            str5 = extras8.getString("view_all", "");
                        } else {
                            str5 = null;
                        }
                        if (kotlin.jvm.internal.i.b(str5, "collections")) {
                            boolArr2[1] = Boolean.TRUE;
                        } else {
                            if (extras8 != null) {
                                str14 = extras8.getString("view_all", "");
                            }
                            if (kotlin.jvm.internal.i.b(str14, "resources")) {
                                boolArr2[2] = Boolean.TRUE;
                            }
                        }
                    }
                    extras = requireActivity().getIntent().getExtras();
                    if (extras == null && extras.containsKey("operation")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Bundle extras9 = requireActivity().getIntent().getExtras();
                        if (extras9 != null) {
                            z12 = extras9.getBoolean("finish_on_back_pressed", true);
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        extras = requireActivity().getIntent().getExtras();
        if (extras == null) {
        }
        z11 = false;
        if (z11) {
        }
        return false;
    }

    public final void Y() {
        try {
            this.D = new ArrayList<>();
            this.E = new ArrayList<>();
            this.G = new ArrayList<>();
            this.F = new ArrayList<>();
            k0 k0Var = this.B;
            if (k0Var != null) {
                try {
                    k0Var.H.l(Boolean.TRUE);
                    ta.v.H(kc.f.H(k0Var), null, 0, new s0(k0Var, null), 3);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(k0Var.f5596y, e10);
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f775u, e11);
        }
    }

    public final String Z() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("shortCoursesChipFilter");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f774f0;
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

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        r3.add(r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(String str) {
        String str2;
        String str3;
        ArrayList<String> arrayList;
        boolean z10;
        try {
            this.J = new ArrayList<>();
            this.K = new ArrayList<>();
            ArrayList<MiniCourseMetadata> arrayList2 = this.J;
            ArrayList<MiniCourseMetadata> arrayList3 = this.D;
            if (arrayList3 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) obj;
                    if (miniCourseMetadata != null) {
                        arrayList = miniCourseMetadata.getChips();
                    } else {
                        arrayList = null;
                    }
                    kotlin.jvm.internal.i.d(arrayList);
                    if (!arrayList.isEmpty()) {
                        for (String str4 : arrayList) {
                            z10 = true;
                            if (gv.n.A0(str4, str, true)) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        arrayList4.add(obj);
                    }
                }
                arrayList2.addAll(arrayList4);
                Iterator<MiniCourseMetadata> it = this.J.iterator();
                while (it.hasNext()) {
                    MiniCourseMetadata next = it.next();
                    ArrayList<MiniCourse> arrayList5 = this.K;
                    ArrayList<MiniCourse> arrayList6 = this.E;
                    if (arrayList6 != null) {
                        Iterator<T> it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            MiniCourse miniCourse = (MiniCourse) next2;
                            if (miniCourse != null) {
                                str2 = miniCourse.getDomain();
                            } else {
                                str2 = null;
                            }
                            if (next != null) {
                                str3 = next.getSlug();
                            } else {
                                str3 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str2, str3)) {
                                break;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    kotlin.jvm.internal.i.q("miniCoursesList");
                    throw null;
                }
                this.I = str;
                g0();
                return;
            }
            kotlin.jvm.internal.i.q("mcMetaDataList");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f775u, e10);
        }
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object, java.lang.String] */
    public final void b0(ArrayList<String> arrayList) {
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            xVar2.f23469u = "";
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ?? r22 = (String) it.next();
                int i6 = bn.a.f4534a;
                String j10 = kn.a.j(r22);
                ChipGroup cgResourcesFilters = (ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters);
                kotlin.jvm.internal.i.f(cgResourcesFilters, "cgResourcesFilters");
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                Chip b10 = bn.a.b(requireContext, cgResourcesFilters, j10);
                String str = null;
                if (b10 != null) {
                    WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                    b10.setId(d0.e.a());
                } else {
                    b10 = null;
                }
                if (b10 != null) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getCurrentCourseName();
                    }
                    if (kotlin.jvm.internal.i.b(r22, kn.a.o(str))) {
                        xVar2.f23469u = r22;
                        b10.setChecked(true);
                        b10.setChipBackgroundColorResource(R.color.title_high_contrast);
                        b10.setChipStrokeColorResource(R.color.title_high_contrast);
                        b10.setTextColor(g0.a.b(requireActivity(), R.color.white));
                        this.f778x = kn.a.n(b10.getText().toString());
                        xVar.f23469u = Integer.valueOf(b10.getId());
                    } else {
                        b10.setChipBackgroundColorResource(R.color.white);
                        b10.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                        b10.setTextColor(g0.a.b(requireActivity(), R.color.title_high_contrast));
                    }
                    ((ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters)).addView(b10);
                }
            }
            ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters);
            if (chipGroup != null) {
                chipGroup.setOnCheckedStateChangeListener(new an.q(1, this, xVar));
            }
            ((ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters)).post(new an.r(1, this, xVar2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f775u, "Error adding chip", e10);
        }
    }

    public final void c0(String str, boolean z10) {
        try {
            int i6 = bn.a.f4534a;
            ChipGroup cgLibraryTopPicksFilters = (ChipGroup) _$_findCachedViewById(R.id.cgLibraryTopPicksFilters);
            kotlin.jvm.internal.i.f(cgLibraryTopPicksFilters, "cgLibraryTopPicksFilters");
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            Chip b10 = bn.a.b(requireContext, cgLibraryTopPicksFilters, str);
            if (b10 != null) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                b10.setId(d0.e.a());
            } else {
                b10 = null;
            }
            ((ChipGroup) _$_findCachedViewById(R.id.cgLibraryTopPicksFilters)).addView(b10);
            if (z10) {
                this.f776v = str;
                if (b10 != null) {
                    b10.setChecked(true);
                }
                if (b10 != null) {
                    b10.setChipBackgroundColorResource(R.color.title_high_contrast);
                }
                if (b10 != null) {
                    b10.setChipStrokeColorResource(R.color.title_high_contrast);
                }
                if (b10 != null) {
                    b10.setTextColor(g0.a.b(requireActivity(), R.color.white));
                }
                this.f779y = b10;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f775u, e10);
        }
    }

    public final void g0() {
        Object obj;
        Object obj2;
        RecyclerView.e eVar;
        String str;
        try {
            zm.j jVar = null;
            if (this.L) {
                Bundle extras = requireActivity().getIntent().getExtras();
                if (extras != null) {
                    str = extras.getString("parentId", "");
                } else {
                    str = null;
                }
                k0 k0Var = this.B;
                if (k0Var != null) {
                    ArrayList<MiniCourseMetadata> arrayList = this.D;
                    if (arrayList != null) {
                        ArrayList<MiniCourse> arrayList2 = this.E;
                        if (arrayList2 != null) {
                            k0Var.l(str, arrayList, arrayList2);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("miniCoursesList");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q("mcMetaDataList");
                    throw null;
                }
                return;
            }
            if (this.J.size() > 3) {
                obj = is.u.E2(this.J, 3);
            } else {
                obj = this.J;
            }
            if (this.K.size() > 3) {
                obj2 = is.u.E2(this.K, 3);
            } else {
                obj2 = this.K;
            }
            if (((RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses)).getAdapter() == null) {
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?>");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.MiniCourse?>");
                String Z = Z();
                androidx.fragment.app.p requireActivity = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                ((RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses)).setAdapter(new zm.j((ArrayList) obj, (ArrayList) obj2, "lib_main_screen", Z, requireActivity, new x()));
                this.U[1] = Boolean.TRUE;
                U();
                return;
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses);
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = null;
            }
            if (eVar instanceof zm.j) {
                jVar = eVar;
            }
            if (jVar != null) {
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?>");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.MiniCourse?>");
                jVar.w(Z(), (ArrayList) obj, (ArrayList) obj2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f775u, e10);
        }
    }

    public final void h0() {
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvLibraryTopPicksSeeAllCta);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: an.s

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ t f769v;

                    {
                        this.f769v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LibraryActivity libraryActivity;
                        LibraryActivity libraryActivity2;
                        LibraryActivity libraryActivity3;
                        LibraryActivity libraryActivity4;
                        int i6 = r2;
                        t this$0 = this.f769v;
                        switch (i6) {
                            case 0:
                                int i10 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                bundle.putString("top_pick_chip", this$0.f776v);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "lib_top_pick_see_all_click");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                    if (requireActivity instanceof LibraryActivity) {
                                        libraryActivity = (LibraryActivity) requireActivity;
                                    } else {
                                        libraryActivity = null;
                                    }
                                    if (libraryActivity != null) {
                                        int i11 = LibraryActivity.E;
                                        libraryActivity.n0(null, "top_picks");
                                    }
                                    bn.c cVar = this$0.c0;
                                    if (cVar != null) {
                                        cVar.c("top_picks");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                    if (requireActivity2 instanceof LibraryActivity) {
                                        libraryActivity2 = (LibraryActivity) requireActivity2;
                                    } else {
                                        libraryActivity2 = null;
                                    }
                                    if (libraryActivity2 != null) {
                                        int i13 = LibraryActivity.E;
                                        libraryActivity2.n0(null, "all_collections");
                                    }
                                }
                                gk.a.b(null, "lib_collect_see_all_click");
                                return;
                            case 2:
                                int i14 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("resource_chip", this$0.f778x);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "lib_resource_see_all_click");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    if (requireActivity3 instanceof LibraryActivity) {
                                        libraryActivity3 = (LibraryActivity) requireActivity3;
                                    } else {
                                        libraryActivity3 = null;
                                    }
                                    if (libraryActivity3 != null) {
                                        int i15 = LibraryActivity.E;
                                        libraryActivity3.n0(null, "resources");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 3:
                                int i16 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    String str3 = gk.a.f16573a;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle3, "lib_course_see_all_click");
                                    androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                    if (requireActivity4 instanceof LibraryActivity) {
                                        libraryActivity4 = (LibraryActivity) requireActivity4;
                                    } else {
                                        libraryActivity4 = null;
                                    }
                                    if (libraryActivity4 != null) {
                                        int i17 = LibraryActivity.E;
                                        libraryActivity4.n0(null, "all_short_courses");
                                    }
                                    bn.c cVar2 = this$0.c0;
                                    if (cVar2 != null) {
                                        cVar2.c("short_courses");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "lib_explore_screen_back_click");
                                this$0.requireActivity().finish();
                                return;
                            case 5:
                                int i19 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                                gk.a.b(null, "lib_main_summary_short_course_click");
                                return;
                            case 6:
                                int i20 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                                gk.a.b(null, "lib_main_summary_collection_click");
                                return;
                            default:
                                int i21 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                                gk.a.b(null, "lib_main_summary_resources_click");
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvLibraryCollectionsSeeAllCta);
            if (robertoTextView2 != null) {
                robertoTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: an.s

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ t f769v;

                    {
                        this.f769v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LibraryActivity libraryActivity;
                        LibraryActivity libraryActivity2;
                        LibraryActivity libraryActivity3;
                        LibraryActivity libraryActivity4;
                        int i6 = r2;
                        t this$0 = this.f769v;
                        switch (i6) {
                            case 0:
                                int i10 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                bundle.putString("top_pick_chip", this$0.f776v);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "lib_top_pick_see_all_click");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                    if (requireActivity instanceof LibraryActivity) {
                                        libraryActivity = (LibraryActivity) requireActivity;
                                    } else {
                                        libraryActivity = null;
                                    }
                                    if (libraryActivity != null) {
                                        int i11 = LibraryActivity.E;
                                        libraryActivity.n0(null, "top_picks");
                                    }
                                    bn.c cVar = this$0.c0;
                                    if (cVar != null) {
                                        cVar.c("top_picks");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                    if (requireActivity2 instanceof LibraryActivity) {
                                        libraryActivity2 = (LibraryActivity) requireActivity2;
                                    } else {
                                        libraryActivity2 = null;
                                    }
                                    if (libraryActivity2 != null) {
                                        int i13 = LibraryActivity.E;
                                        libraryActivity2.n0(null, "all_collections");
                                    }
                                }
                                gk.a.b(null, "lib_collect_see_all_click");
                                return;
                            case 2:
                                int i14 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("resource_chip", this$0.f778x);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "lib_resource_see_all_click");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    if (requireActivity3 instanceof LibraryActivity) {
                                        libraryActivity3 = (LibraryActivity) requireActivity3;
                                    } else {
                                        libraryActivity3 = null;
                                    }
                                    if (libraryActivity3 != null) {
                                        int i15 = LibraryActivity.E;
                                        libraryActivity3.n0(null, "resources");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 3:
                                int i16 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                    String str3 = gk.a.f16573a;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle3, "lib_course_see_all_click");
                                    androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                    if (requireActivity4 instanceof LibraryActivity) {
                                        libraryActivity4 = (LibraryActivity) requireActivity4;
                                    } else {
                                        libraryActivity4 = null;
                                    }
                                    if (libraryActivity4 != null) {
                                        int i17 = LibraryActivity.E;
                                        libraryActivity4.n0(null, "all_short_courses");
                                    }
                                    bn.c cVar2 = this$0.c0;
                                    if (cVar2 != null) {
                                        cVar2.c("short_courses");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "lib_explore_screen_back_click");
                                this$0.requireActivity().finish();
                                return;
                            case 5:
                                int i19 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                                gk.a.b(null, "lib_main_summary_short_course_click");
                                return;
                            case 6:
                                int i20 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                                gk.a.b(null, "lib_main_summary_collection_click");
                                return;
                            default:
                                int i21 = t.f770g0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                                gk.a.b(null, "lib_main_summary_resources_click");
                                return;
                        }
                    }
                });
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvLibraryDbResourcesViewAllCTA)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: an.s

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f769v;

                {
                    this.f769v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LibraryActivity libraryActivity;
                    LibraryActivity libraryActivity2;
                    LibraryActivity libraryActivity3;
                    LibraryActivity libraryActivity4;
                    int i6 = r2;
                    t this$0 = this.f769v;
                    switch (i6) {
                        case 0:
                            int i10 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("top_pick_chip", this$0.f776v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_top_pick_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null) {
                                    int i11 = LibraryActivity.E;
                                    libraryActivity.n0(null, "top_picks");
                                }
                                bn.c cVar = this$0.c0;
                                if (cVar != null) {
                                    cVar.c("top_picks");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 1:
                            int i12 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity2 = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity2 = null;
                                }
                                if (libraryActivity2 != null) {
                                    int i13 = LibraryActivity.E;
                                    libraryActivity2.n0(null, "all_collections");
                                }
                            }
                            gk.a.b(null, "lib_collect_see_all_click");
                            return;
                        case 2:
                            int i14 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f778x);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof LibraryActivity) {
                                    libraryActivity3 = (LibraryActivity) requireActivity3;
                                } else {
                                    libraryActivity3 = null;
                                }
                                if (libraryActivity3 != null) {
                                    int i15 = LibraryActivity.E;
                                    libraryActivity3.n0(null, "resources");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 3:
                            int i16 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_course_see_all_click");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof LibraryActivity) {
                                    libraryActivity4 = (LibraryActivity) requireActivity4;
                                } else {
                                    libraryActivity4 = null;
                                }
                                if (libraryActivity4 != null) {
                                    int i17 = LibraryActivity.E;
                                    libraryActivity4.n0(null, "all_short_courses");
                                }
                                bn.c cVar2 = this$0.c0;
                                if (cVar2 != null) {
                                    cVar2.c("short_courses");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 4:
                            int i18 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "lib_explore_screen_back_click");
                            this$0.requireActivity().finish();
                            return;
                        case 5:
                            int i19 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                            gk.a.b(null, "lib_main_summary_short_course_click");
                            return;
                        case 6:
                            int i20 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                            gk.a.b(null, "lib_main_summary_collection_click");
                            return;
                        default:
                            int i21 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                            gk.a.b(null, "lib_main_summary_resources_click");
                            return;
                    }
                }
            }));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvLibraryDbShortCoursesViewAllCTA)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: an.s

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f769v;

                {
                    this.f769v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LibraryActivity libraryActivity;
                    LibraryActivity libraryActivity2;
                    LibraryActivity libraryActivity3;
                    LibraryActivity libraryActivity4;
                    int i6 = r2;
                    t this$0 = this.f769v;
                    switch (i6) {
                        case 0:
                            int i10 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("top_pick_chip", this$0.f776v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_top_pick_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null) {
                                    int i11 = LibraryActivity.E;
                                    libraryActivity.n0(null, "top_picks");
                                }
                                bn.c cVar = this$0.c0;
                                if (cVar != null) {
                                    cVar.c("top_picks");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 1:
                            int i12 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity2 = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity2 = null;
                                }
                                if (libraryActivity2 != null) {
                                    int i13 = LibraryActivity.E;
                                    libraryActivity2.n0(null, "all_collections");
                                }
                            }
                            gk.a.b(null, "lib_collect_see_all_click");
                            return;
                        case 2:
                            int i14 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f778x);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof LibraryActivity) {
                                    libraryActivity3 = (LibraryActivity) requireActivity3;
                                } else {
                                    libraryActivity3 = null;
                                }
                                if (libraryActivity3 != null) {
                                    int i15 = LibraryActivity.E;
                                    libraryActivity3.n0(null, "resources");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 3:
                            int i16 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_course_see_all_click");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof LibraryActivity) {
                                    libraryActivity4 = (LibraryActivity) requireActivity4;
                                } else {
                                    libraryActivity4 = null;
                                }
                                if (libraryActivity4 != null) {
                                    int i17 = LibraryActivity.E;
                                    libraryActivity4.n0(null, "all_short_courses");
                                }
                                bn.c cVar2 = this$0.c0;
                                if (cVar2 != null) {
                                    cVar2.c("short_courses");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 4:
                            int i18 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "lib_explore_screen_back_click");
                            this$0.requireActivity().finish();
                            return;
                        case 5:
                            int i19 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                            gk.a.b(null, "lib_main_summary_short_course_click");
                            return;
                        case 6:
                            int i20 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                            gk.a.b(null, "lib_main_summary_collection_click");
                            return;
                        default:
                            int i21 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                            gk.a.b(null, "lib_main_summary_resources_click");
                            return;
                    }
                }
            }));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivLibraryBack)).setOnClickListener(new View.OnClickListener(this) { // from class: an.s

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f769v;

                {
                    this.f769v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LibraryActivity libraryActivity;
                    LibraryActivity libraryActivity2;
                    LibraryActivity libraryActivity3;
                    LibraryActivity libraryActivity4;
                    int i6 = r2;
                    t this$0 = this.f769v;
                    switch (i6) {
                        case 0:
                            int i10 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("top_pick_chip", this$0.f776v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_top_pick_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null) {
                                    int i11 = LibraryActivity.E;
                                    libraryActivity.n0(null, "top_picks");
                                }
                                bn.c cVar = this$0.c0;
                                if (cVar != null) {
                                    cVar.c("top_picks");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 1:
                            int i12 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity2 = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity2 = null;
                                }
                                if (libraryActivity2 != null) {
                                    int i13 = LibraryActivity.E;
                                    libraryActivity2.n0(null, "all_collections");
                                }
                            }
                            gk.a.b(null, "lib_collect_see_all_click");
                            return;
                        case 2:
                            int i14 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f778x);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof LibraryActivity) {
                                    libraryActivity3 = (LibraryActivity) requireActivity3;
                                } else {
                                    libraryActivity3 = null;
                                }
                                if (libraryActivity3 != null) {
                                    int i15 = LibraryActivity.E;
                                    libraryActivity3.n0(null, "resources");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 3:
                            int i16 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_course_see_all_click");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof LibraryActivity) {
                                    libraryActivity4 = (LibraryActivity) requireActivity4;
                                } else {
                                    libraryActivity4 = null;
                                }
                                if (libraryActivity4 != null) {
                                    int i17 = LibraryActivity.E;
                                    libraryActivity4.n0(null, "all_short_courses");
                                }
                                bn.c cVar2 = this$0.c0;
                                if (cVar2 != null) {
                                    cVar2.c("short_courses");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 4:
                            int i18 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "lib_explore_screen_back_click");
                            this$0.requireActivity().finish();
                            return;
                        case 5:
                            int i19 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                            gk.a.b(null, "lib_main_summary_short_course_click");
                            return;
                        case 6:
                            int i20 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                            gk.a.b(null, "lib_main_summary_collection_click");
                            return;
                        default:
                            int i21 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                            gk.a.b(null, "lib_main_summary_resources_click");
                            return;
                    }
                }
            });
            ((ConstraintLayout) _$_findCachedViewById(R.id.clLibrarySCContainer)).setOnClickListener(new View.OnClickListener(this) { // from class: an.s

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f769v;

                {
                    this.f769v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LibraryActivity libraryActivity;
                    LibraryActivity libraryActivity2;
                    LibraryActivity libraryActivity3;
                    LibraryActivity libraryActivity4;
                    int i6 = r2;
                    t this$0 = this.f769v;
                    switch (i6) {
                        case 0:
                            int i10 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("top_pick_chip", this$0.f776v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_top_pick_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null) {
                                    int i11 = LibraryActivity.E;
                                    libraryActivity.n0(null, "top_picks");
                                }
                                bn.c cVar = this$0.c0;
                                if (cVar != null) {
                                    cVar.c("top_picks");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 1:
                            int i12 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity2 = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity2 = null;
                                }
                                if (libraryActivity2 != null) {
                                    int i13 = LibraryActivity.E;
                                    libraryActivity2.n0(null, "all_collections");
                                }
                            }
                            gk.a.b(null, "lib_collect_see_all_click");
                            return;
                        case 2:
                            int i14 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f778x);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof LibraryActivity) {
                                    libraryActivity3 = (LibraryActivity) requireActivity3;
                                } else {
                                    libraryActivity3 = null;
                                }
                                if (libraryActivity3 != null) {
                                    int i15 = LibraryActivity.E;
                                    libraryActivity3.n0(null, "resources");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 3:
                            int i16 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_course_see_all_click");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof LibraryActivity) {
                                    libraryActivity4 = (LibraryActivity) requireActivity4;
                                } else {
                                    libraryActivity4 = null;
                                }
                                if (libraryActivity4 != null) {
                                    int i17 = LibraryActivity.E;
                                    libraryActivity4.n0(null, "all_short_courses");
                                }
                                bn.c cVar2 = this$0.c0;
                                if (cVar2 != null) {
                                    cVar2.c("short_courses");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 4:
                            int i18 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "lib_explore_screen_back_click");
                            this$0.requireActivity().finish();
                            return;
                        case 5:
                            int i19 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                            gk.a.b(null, "lib_main_summary_short_course_click");
                            return;
                        case 6:
                            int i20 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                            gk.a.b(null, "lib_main_summary_collection_click");
                            return;
                        default:
                            int i21 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                            gk.a.b(null, "lib_main_summary_resources_click");
                            return;
                    }
                }
            });
            ((ConstraintLayout) _$_findCachedViewById(R.id.clLibraryCollectionsContainer)).setOnClickListener(new View.OnClickListener(this) { // from class: an.s

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f769v;

                {
                    this.f769v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LibraryActivity libraryActivity;
                    LibraryActivity libraryActivity2;
                    LibraryActivity libraryActivity3;
                    LibraryActivity libraryActivity4;
                    int i6 = r2;
                    t this$0 = this.f769v;
                    switch (i6) {
                        case 0:
                            int i10 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("top_pick_chip", this$0.f776v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_top_pick_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null) {
                                    int i11 = LibraryActivity.E;
                                    libraryActivity.n0(null, "top_picks");
                                }
                                bn.c cVar = this$0.c0;
                                if (cVar != null) {
                                    cVar.c("top_picks");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 1:
                            int i12 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity2 = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity2 = null;
                                }
                                if (libraryActivity2 != null) {
                                    int i13 = LibraryActivity.E;
                                    libraryActivity2.n0(null, "all_collections");
                                }
                            }
                            gk.a.b(null, "lib_collect_see_all_click");
                            return;
                        case 2:
                            int i14 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f778x);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof LibraryActivity) {
                                    libraryActivity3 = (LibraryActivity) requireActivity3;
                                } else {
                                    libraryActivity3 = null;
                                }
                                if (libraryActivity3 != null) {
                                    int i15 = LibraryActivity.E;
                                    libraryActivity3.n0(null, "resources");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 3:
                            int i16 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_course_see_all_click");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof LibraryActivity) {
                                    libraryActivity4 = (LibraryActivity) requireActivity4;
                                } else {
                                    libraryActivity4 = null;
                                }
                                if (libraryActivity4 != null) {
                                    int i17 = LibraryActivity.E;
                                    libraryActivity4.n0(null, "all_short_courses");
                                }
                                bn.c cVar2 = this$0.c0;
                                if (cVar2 != null) {
                                    cVar2.c("short_courses");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 4:
                            int i18 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "lib_explore_screen_back_click");
                            this$0.requireActivity().finish();
                            return;
                        case 5:
                            int i19 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                            gk.a.b(null, "lib_main_summary_short_course_click");
                            return;
                        case 6:
                            int i20 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                            gk.a.b(null, "lib_main_summary_collection_click");
                            return;
                        default:
                            int i21 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                            gk.a.b(null, "lib_main_summary_resources_click");
                            return;
                    }
                }
            });
            ((ConstraintLayout) _$_findCachedViewById(R.id.clLibraryResourcesContainer)).setOnClickListener(new View.OnClickListener(this) { // from class: an.s

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f769v;

                {
                    this.f769v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LibraryActivity libraryActivity;
                    LibraryActivity libraryActivity2;
                    LibraryActivity libraryActivity3;
                    LibraryActivity libraryActivity4;
                    int i6 = r2;
                    t this$0 = this.f769v;
                    switch (i6) {
                        case 0:
                            int i10 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("top_pick_chip", this$0.f776v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_top_pick_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null) {
                                    int i11 = LibraryActivity.E;
                                    libraryActivity.n0(null, "top_picks");
                                }
                                bn.c cVar = this$0.c0;
                                if (cVar != null) {
                                    cVar.c("top_picks");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 1:
                            int i12 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity2 = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity2 = null;
                                }
                                if (libraryActivity2 != null) {
                                    int i13 = LibraryActivity.E;
                                    libraryActivity2.n0(null, "all_collections");
                                }
                            }
                            gk.a.b(null, "lib_collect_see_all_click");
                            return;
                        case 2:
                            int i14 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f778x);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_see_all_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof LibraryActivity) {
                                    libraryActivity3 = (LibraryActivity) requireActivity3;
                                } else {
                                    libraryActivity3 = null;
                                }
                                if (libraryActivity3 != null) {
                                    int i15 = LibraryActivity.E;
                                    libraryActivity3.n0(null, "resources");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 3:
                            int i16 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                String str3 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("miniCourse_chip_selected", this$0.Z());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle3, "lib_course_see_all_click");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof LibraryActivity) {
                                    libraryActivity4 = (LibraryActivity) requireActivity4;
                                } else {
                                    libraryActivity4 = null;
                                }
                                if (libraryActivity4 != null) {
                                    int i17 = LibraryActivity.E;
                                    libraryActivity4.n0(null, "all_short_courses");
                                }
                                bn.c cVar2 = this$0.c0;
                                if (cVar2 != null) {
                                    cVar2.c("short_courses");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 4:
                            int i18 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "lib_explore_screen_back_click");
                            this$0.requireActivity().finish();
                            return;
                        case 5:
                            int i19 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardShortCourses).getY(), 500);
                            gk.a.b(null, "lib_main_summary_short_course_click");
                            return;
                        case 6:
                            int i20 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardCollections).getY(), 700);
                            gk.a.b(null, "lib_main_summary_collection_click");
                            return;
                        default:
                            int i21 = t.f770g0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((ScrollStateListenerCustomNestedScrollView) this$0._$_findCachedViewById(R.id.libraryContainer)).smoothScrollTo(0, (int) this$0._$_findCachedViewById(R.id.libraryDashboardResources).getY(), 1000);
                            gk.a.b(null, "lib_main_summary_resources_click");
                            return;
                    }
                }
            });
            ((RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbResources)).setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
            ((RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            b0(ca.a.k(Constants.COURSE_DEPRESSION, Constants.COURSE_WORRY, Constants.COURSE_STRESS, Constants.COURSE_SLEEP, Constants.COURSE_HAPPINESS, Constants.COURSE_ANGER));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f775u, e10);
        }
    }

    @Override // il.n
    public final void k(String str) {
        k0 k0Var = this.B;
        if (k0Var != null) {
            ta.v.H(kc.f.H(k0Var), kotlinx.coroutines.o0.f23642c, 0, new x0(k0Var, str, null), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_library_home, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f779y = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f774f0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
            if (((LibraryActivity) requireActivity).A) {
                Y();
                androidx.fragment.app.p requireActivity2 = requireActivity();
                kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity");
                ((LibraryActivity) requireActivity2).A = false;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f775u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        k0 k0Var = this.B;
        if (k0Var != null) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && kotlin.jvm.internal.i.b(String.valueOf(FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT)), "default") && !applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                long longValue = applicationPersistence.getLongValue(Constants.APP_FEEDBACK_DATE, 0L);
                Utils utils = Utils.INSTANCE;
                if (longValue != utils.getTodayCalendar().getTimeInMillis()) {
                    if (applicationPersistence.getIntValue(Constants.APP_OPEN_DAY) - applicationPersistence.getIntValue(Constants.APP_FEEDBACK_DAY) >= 2 || applicationPersistence.getIntValue(Constants.APP_FEEDBACK_DAY, -1) == -1) {
                        if (applicationPersistence.getBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, false) || applicationPersistence.getBooleanValue(Constants.RESOURCES_SHOW_FEEDBACK, false)) {
                            applicationPersistence.setLongValue(Constants.APP_FEEDBACK_DATE, utils.getTodayCalendar().getTimeInMillis());
                            applicationPersistence.setIntValue(Constants.APP_FEEDBACK_DAY, applicationPersistence.getIntValue(Constants.APP_OPEN_DAY));
                            boolean booleanValue = applicationPersistence.getBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, false);
                            hs.i iVar = k0Var.R;
                            if (booleanValue) {
                                applicationPersistence.setBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, false);
                                ((androidx.lifecycle.w) iVar.getValue()).i(new SingleUseEvent(Constants.FEEDBACK_ACTIVITY));
                                return;
                            }
                            applicationPersistence.setBooleanValue(Constants.RESOURCES_SHOW_FEEDBACK, false);
                            ((androidx.lifecycle.w) iVar.getValue()).i(new SingleUseEvent(Constants.LEARNING_HUB_READ));
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        u0.e aVar;
        u0.e eVar;
        String str2 = this.f775u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            try {
                Window window = requireActivity().getWindow();
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
                window.setStatusBarColor(g0.a.b(requireActivity(), R.color.login_grey_background));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, "Error in setting custom status bar", e10);
            }
            ArrayList<LogModel> arrayList = kn.a.f23436a;
            User user = FirebasePersistence.getInstance().getUser();
            String str3 = null;
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            this.I = kn.a.j(kn.a.o(str));
            Application application = requireActivity().getApplication();
            kotlin.jvm.internal.i.f(application, "requireActivity().application");
            l0 a10 = new androidx.lifecycle.o0(this, new z0(application, 0)).a(k0.class);
            k0 k0Var = (k0) a10;
            k0Var.A.e(getViewLifecycleOwner(), new qm.c(24, new o(k0Var)));
            k0Var.W.e(getViewLifecycleOwner(), new an.p(3, new p(k0Var)));
            k0Var.B.e(getViewLifecycleOwner(), new an.p(4, new q()));
            k0Var.C.e(getViewLifecycleOwner(), new an.p(5, new r(k0Var)));
            k0Var.E.e(getViewLifecycleOwner(), new an.p(6, new s(k0Var)));
            k0Var.U.e(getViewLifecycleOwner(), new an.p(7, new C0013t(k0Var)));
            k0Var.G.e(getViewLifecycleOwner(), new an.p(8, new u()));
            k0Var.F.e(requireActivity(), new an.p(9, new v()));
            k0Var.I.e(getViewLifecycleOwner(), new an.p(10, new w(k0Var)));
            k0Var.J.e(getViewLifecycleOwner(), new an.p(11, new f()));
            k0Var.N.e(getViewLifecycleOwner(), new qm.c(25, new g()));
            k0Var.K.e(getViewLifecycleOwner(), new qm.c(26, new h()));
            k0Var.O.e(getViewLifecycleOwner(), new qm.c(27, new i()));
            k0Var.H.e(requireActivity(), new qm.c(28, new j()));
            k0Var.p().e(getViewLifecycleOwner(), new qm.c(29, new k()));
            k0Var.D.e(getViewLifecycleOwner(), new an.p(0, new l()));
            ((androidx.lifecycle.w) k0Var.R.getValue()).e(getViewLifecycleOwner(), new an.p(1, new m()));
            ((androidx.lifecycle.w) k0Var.T.getValue()).e(getViewLifecycleOwner(), new an.p(2, new n()));
            this.B = (k0) a10;
            k0 k0Var2 = this.B;
            if (k0Var2 != null) {
                k0Var2.j();
            }
            if (!X()) {
                k0 k0Var3 = this.B;
                if (k0Var3 != null) {
                    try {
                        ta.v.H(kc.f.H(k0Var3), null, 0, new cn.u0(k0Var3, null), 3);
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(k0Var3.f5596y, e11);
                    }
                }
                k0 k0Var4 = this.B;
                if (k0Var4 != null) {
                    try {
                        ta.v.H(kc.f.H(k0Var4), null, 0, new cn.o0(k0Var4, null), 3);
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(k0Var4.f5596y, e12);
                    }
                }
                k0 k0Var5 = this.B;
                if (k0Var5 != null) {
                    ArrayList<LogModel> arrayList2 = kn.a.f23436a;
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null) {
                        str3 = user2.getCurrentCourseName();
                    }
                    k0Var5.n(kn.a.o(str3));
                }
                Y();
            }
            h0();
            if (ApplicationPersistence.getInstance().getBooleanValue("new_user", false)) {
                ApplicationPersistence.getInstance().setBooleanValue("notV4HomeCoachMarkSkipLibraryStep", true);
            }
        } catch (Exception e13) {
            LogHelper.INSTANCE.e(str2, e13);
        }
    }
}
