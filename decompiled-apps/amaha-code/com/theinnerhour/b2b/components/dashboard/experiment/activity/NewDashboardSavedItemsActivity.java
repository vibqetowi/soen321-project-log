package com.theinnerhour.b2b.components.dashboard.experiment.activity;

import am.w;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.HorizontalScrollView;
import androidx.activity.result.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NewDashboardSavedItemsActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import dl.h0;
import e.d;
import fl.m;
import fl.n;
import fl.o;
import fl.p;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jl.b0;
import jl.d0;
import jl.e0;
import jl.k0;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import t0.u0;
import ta.v;
/* compiled from: NewDashboardSavedItemsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/activity/NewDashboardSavedItemsActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NewDashboardSavedItemsActivity extends rr.a {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public final c<Intent> B;

    /* renamed from: x  reason: collision with root package name */
    public k0 f10818x;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10817w = LogHelper.INSTANCE.makeLogTag("NewDashboardSavedItemsActivity");

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, LibraryCollectionItemAccessModel> f10819y = new HashMap<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<UserLibraryItemAccessModel> f10820z = new ArrayList<>();

    /* compiled from: NewDashboardSavedItemsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<List<? extends UserLibraryItemAccessModel>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k0 f10821u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NewDashboardSavedItemsActivity f10822v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, NewDashboardSavedItemsActivity newDashboardSavedItemsActivity) {
            super(1);
            this.f10821u = k0Var;
            this.f10822v = newDashboardSavedItemsActivity;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends UserLibraryItemAccessModel> list) {
            NewDashboardSavedItemsActivity newDashboardSavedItemsActivity;
            hs.k kVar;
            Long lastAccessedDate;
            List<? extends UserLibraryItemAccessModel> it = list;
            i.f(it, "it");
            Iterator<T> it2 = it.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                newDashboardSavedItemsActivity = this.f10822v;
                if (!hasNext) {
                    break;
                }
                UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) it2.next();
                if (i.b(userLibraryItemAccessModel.getParentType(), "collections") && userLibraryItemAccessModel.getId() != null) {
                    HashMap<String, LibraryCollectionItemAccessModel> hashMap = newDashboardSavedItemsActivity.f10819y;
                    String id2 = userLibraryItemAccessModel.getId();
                    i.d(id2);
                    hashMap.put(id2, new LibraryCollectionItemAccessModel(userLibraryItemAccessModel));
                }
                if (userLibraryItemAccessModel.isFavourite()) {
                    newDashboardSavedItemsActivity.f10820z.add(userLibraryItemAccessModel);
                }
            }
            UserLibraryItemAccessModel userLibraryItemAccessModel2 = (UserLibraryItemAccessModel) u.p2(it);
            k0 k0Var = this.f10821u;
            if (userLibraryItemAccessModel2 != null && (lastAccessedDate = userLibraryItemAccessModel2.getLastAccessedDate()) != null) {
                long longValue = lastAccessedDate.longValue();
                if (((Number) k0Var.A.getValue()).longValue() != longValue) {
                    k0Var.A.setValue(Long.valueOf(longValue));
                }
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                if (i.b(k0Var.H.d(), Boolean.TRUE)) {
                    NewDashboardSavedItemsActivity.v0(newDashboardSavedItemsActivity, u.D2(newDashboardSavedItemsActivity.f10820z, new n()));
                } else {
                    ArrayList<UserLibraryItemAccessModel> items = newDashboardSavedItemsActivity.f10820z;
                    i.g(items, "items");
                    v.H(f.H(k0Var), null, 0, new d0(items, k0Var, null), 3);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NewDashboardSavedItemsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<Boolean, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            i.f(it, "it");
            if (it.booleanValue()) {
                NewDashboardSavedItemsActivity newDashboardSavedItemsActivity = NewDashboardSavedItemsActivity.this;
                NewDashboardSavedItemsActivity.v0(newDashboardSavedItemsActivity, u.D2(newDashboardSavedItemsActivity.f10820z, new o()));
            }
            return hs.k.f19476a;
        }
    }

    public NewDashboardSavedItemsActivity() {
        c<Intent> registerForActivityResult = registerForActivityResult(new d(), new w(13, this));
        i.f(registerForActivityResult, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.B = registerForActivityResult;
    }

    public static final void v0(NewDashboardSavedItemsActivity newDashboardSavedItemsActivity, List list) {
        RecyclerView.e eVar;
        il.c cVar;
        hs.k kVar;
        HashMap<String, LearningHubModel> hashMap;
        HashMap<String, LibraryCollection> hashMap2;
        HashMap<String, MiniCourse> hashMap3;
        HashMap<String, MiniCourseMetadata> hashMap4;
        HashMap<String, String> hashMap5;
        int i6;
        newDashboardSavedItemsActivity.getClass();
        try {
            if (list.isEmpty()) {
                ConstraintLayout constraintLayout = (ConstraintLayout) newDashboardSavedItemsActivity.u0(R.id.clSiNullState);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) newDashboardSavedItemsActivity.u0(R.id.hsvSiFilterContainer);
                if (horizontalScrollView != null) {
                    horizontalScrollView.setVisibility(8);
                }
            } else {
                RecyclerView recyclerView = (RecyclerView) newDashboardSavedItemsActivity.u0(R.id.rvSiItemsRecycler);
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                RecyclerView recyclerView2 = (RecyclerView) newDashboardSavedItemsActivity.u0(R.id.rvSiItemsRecycler);
                if (recyclerView2 != null) {
                    eVar = recyclerView2.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof il.c) {
                    cVar = (il.c) eVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.f20353x = list;
                    boolean v10 = cVar.v(cVar.G, true);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) newDashboardSavedItemsActivity.u0(R.id.clSiNullState);
                    if (constraintLayout2 != null) {
                        if (v10) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        constraintLayout2.setVisibility(i6);
                    }
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    RecyclerView recyclerView3 = (RecyclerView) newDashboardSavedItemsActivity.u0(R.id.rvSiItemsRecycler);
                    if (recyclerView3 != null) {
                        recyclerView3.setLayoutManager(new LinearLayoutManager(newDashboardSavedItemsActivity, 1, false));
                    }
                    RecyclerView recyclerView4 = (RecyclerView) newDashboardSavedItemsActivity.u0(R.id.rvSiItemsRecycler);
                    if (recyclerView4 != null) {
                        k0 k0Var = newDashboardSavedItemsActivity.f10818x;
                        if (k0Var != null) {
                            hashMap = k0Var.B;
                        } else {
                            hashMap = null;
                        }
                        if (k0Var != null) {
                            hashMap2 = k0Var.C;
                        } else {
                            hashMap2 = null;
                        }
                        if (k0Var != null) {
                            hashMap3 = k0Var.D;
                        } else {
                            hashMap3 = null;
                        }
                        if (k0Var != null) {
                            hashMap4 = k0Var.E;
                        } else {
                            hashMap4 = null;
                        }
                        if (k0Var != null) {
                            hashMap5 = k0Var.G;
                        } else {
                            hashMap5 = null;
                        }
                        recyclerView4.setAdapter(new il.c(list, hashMap, hashMap2, hashMap3, hashMap4, hashMap5, new p(newDashboardSavedItemsActivity, newDashboardSavedItemsActivity)));
                    }
                    newDashboardSavedItemsActivity.w0();
                }
            }
            CardView cardView = (CardView) newDashboardSavedItemsActivity.u0(R.id.cvSiLoader);
            if (cardView != null) {
                cardView.setVisibility(8);
            }
            if (!newDashboardSavedItemsActivity.A) {
                newDashboardSavedItemsActivity.A = true;
                gk.a.b(null, "lib_saved_items_screen_load");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(newDashboardSavedItemsActivity.f10817w, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        gk.a.b(null, "lib_saved_items_hard_back_click");
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        u0.e aVar;
        u0.e eVar;
        String str = this.f10817w;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.fragment_new_dashboard_saved_items);
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
                LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
            }
            l0 a10 = new o0(this, new b0(new e1(), 1)).a(k0.class);
            k0 k0Var = (k0) a10;
            k0Var.f22261z.e(this, new h0(29, new a(k0Var, this)));
            k0Var.H.e(this, new fl.k(0, new b()));
            v.H(f.H(k0Var), null, 0, new e0(k0Var, null), 3);
            this.f10818x = (k0) a10;
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.ivSiBack);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: fl.l

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ NewDashboardSavedItemsActivity f15148v;

                    {
                        this.f15148v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = r2;
                        NewDashboardSavedItemsActivity this$0 = this.f15148v;
                        switch (i10) {
                            case 0:
                                int i11 = NewDashboardSavedItemsActivity.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "lib_saved_items_screen_back_click");
                                this$0.finish();
                                return;
                            default:
                                int i12 = NewDashboardSavedItemsActivity.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.startActivity(new Intent(this$0, LibraryActivity.class));
                                this$0.finish();
                                return;
                        }
                    }
                });
            }
            RobertoButton robertoButton = (RobertoButton) u0(R.id.rbSiNullStateCta);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: fl.l

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ NewDashboardSavedItemsActivity f15148v;

                    {
                        this.f15148v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = r2;
                        NewDashboardSavedItemsActivity this$0 = this.f15148v;
                        switch (i10) {
                            case 0:
                                int i11 = NewDashboardSavedItemsActivity.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "lib_saved_items_screen_back_click");
                                this$0.finish();
                                return;
                            default:
                                int i12 = NewDashboardSavedItemsActivity.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.startActivity(new Intent(this$0, LibraryActivity.class));
                                this$0.finish();
                                return;
                        }
                    }
                });
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.C;
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

    public final void w0() {
        int i6;
        try {
            ChipGroup chipGroup = (ChipGroup) u0(R.id.cgSiFilters);
            if (chipGroup != null) {
                i6 = chipGroup.getChildCount();
            } else {
                i6 = -1;
            }
            if (i6 > 0) {
                return;
            }
            String[] strArr = {"all", "courses", Constants.SCREEN_ACTIVITIES, "resources"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                int i11 = bn.a.f4534a;
                ChipGroup cgSiFilters = (ChipGroup) u0(R.id.cgSiFilters);
                i.f(cgSiFilters, "cgSiFilters");
                Chip b10 = bn.a.b(this, cgSiFilters, str);
                if (i.b(str, "all") && b10 != null) {
                    b10.setChipBackgroundColorResource(R.color.title_high_contrast);
                    b10.setChipStrokeColorResource(R.color.title_high_contrast);
                    b10.setTextColor(g0.a.b(this, R.color.white));
                    b10.setChecked(true);
                }
                if (b10 != null) {
                    b10.setOnCheckedChangeListener(new m(this, 0, str));
                }
                ((ChipGroup) u0(R.id.cgSiFilters)).addView(b10);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10817w, e10);
        }
    }
}
