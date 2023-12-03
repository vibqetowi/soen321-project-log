package com.theinnerhour.b2b.components.bookmarking.activities;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ScrollLockLayoutManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import mk.d;
import mk.e;
import mk.f;
import mk.g;
import nk.b;
import ss.l;
import t0.j0;
import t0.u0;
/* compiled from: BookmarkingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/bookmarking/activities/BookmarkingActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarkingActivity extends c {
    public static final /* synthetic */ int I = 0;
    public int A;
    public CourseDayDomainModelV1 C;
    public boolean D;
    public int E;
    public final androidx.activity.result.c<Intent> F;
    public final androidx.activity.result.c<Intent> G;

    /* renamed from: v  reason: collision with root package name */
    public ok.b f10619v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f10621x;

    /* renamed from: y  reason: collision with root package name */
    public Course f10622y;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10620w = LogHelper.INSTANCE.makeLogTag(BookmarkingActivity.class);

    /* renamed from: z  reason: collision with root package name */
    public String f10623z = "";
    public final ArrayList<String> B = new ArrayList<>();

    /* compiled from: BookmarkingActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<ArrayList<CourseDayDomainModelV1>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<CourseDayDomainModelV1> arrayList) {
            boolean z10;
            ArrayList<CourseDayDomainModelV1> arrayList2 = arrayList;
            BookmarkingActivity bookmarkingActivity = BookmarkingActivity.this;
            if (arrayList2 != null) {
                int i6 = BookmarkingActivity.I;
                bookmarkingActivity.getClass();
                try {
                    bookmarkingActivity.A = arrayList2.size();
                    boolean z11 = true;
                    if (arrayList2.isEmpty()) {
                        AppCompatImageView appCompatImageView = (AppCompatImageView) bookmarkingActivity.n0(R.id.ivBookmarkingSearch);
                        if (appCompatImageView != null) {
                            appCompatImageView.setVisibility(8);
                        }
                        SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                        SubscriptionModel previousSubscriptionModel = subscriptionPersistence.previousSubscriptionModel();
                        ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setVisibility(0);
                        ((AppCompatImageView) bookmarkingActivity.n0(R.id.ivEmptyState)).setImageResource(R.drawable.ic_empty_bookmarked_activities);
                        if (previousSubscriptionModel != null && previousSubscriptionModel.getExpiryTime() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10 && !subscriptionPersistence.getSubscriptionEnabled()) {
                            ((RobertoTextView) bookmarkingActivity.n0(R.id.tvNullTitle)).setText(bookmarkingActivity.getString(R.string.BookmarkingEmptyActivityBody1));
                            ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setText(bookmarkingActivity.getString(R.string.BookmarkingUnlockAgain));
                            ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setOnClickListener(DebouncedOnClickListener.wrap(new mk.b(bookmarkingActivity, 6)));
                        } else {
                            if (previousSubscriptionModel == null || previousSubscriptionModel.getExpiryTime() != 0) {
                                z11 = false;
                            }
                            if (z11 && !subscriptionPersistence.getSubscriptionEnabled()) {
                                ((RobertoTextView) bookmarkingActivity.n0(R.id.tvNullTitle)).setText(bookmarkingActivity.getString(R.string.BookmarkingEmptyActivityBody2));
                                ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setText(bookmarkingActivity.getString(R.string.BookmarkingUnlockToAdd));
                                ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setOnClickListener(DebouncedOnClickListener.wrap(new mk.b(bookmarkingActivity, 7)));
                            } else {
                                ((RobertoTextView) bookmarkingActivity.n0(R.id.tvNullTitle)).setText(bookmarkingActivity.getString(R.string.BookmarkingEmptyActivityText));
                                ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setText(bookmarkingActivity.getString(R.string.BookmarkingEmptyActivityCta));
                                ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setOnClickListener(DebouncedOnClickListener.wrap(new mk.b(bookmarkingActivity, 8)));
                            }
                        }
                        ((RecyclerView) bookmarkingActivity.n0(R.id.rvBookmarkingActivities)).setVisibility(8);
                        ((ConstraintLayout) bookmarkingActivity.n0(R.id.clEmptyActivityListView)).setVisibility(0);
                    } else {
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) bookmarkingActivity.n0(R.id.ivBookmarkingSearch);
                        if (appCompatImageView2 != null) {
                            appCompatImageView2.setVisibility(0);
                        }
                        ((RecyclerView) bookmarkingActivity.n0(R.id.rvBookmarkingActivities)).setVisibility(0);
                        ((ConstraintLayout) bookmarkingActivity.n0(R.id.clEmptyActivityListView)).setVisibility(8);
                        ((RecyclerView) bookmarkingActivity.n0(R.id.rvBookmarkingActivities)).setLayoutManager(new ScrollLockLayoutManager(bookmarkingActivity, 1, false));
                        ((RecyclerView) bookmarkingActivity.n0(R.id.rvBookmarkingActivities)).setAdapter(new nk.b(bookmarkingActivity, arrayList2, new d(bookmarkingActivity), new e(bookmarkingActivity), new f(bookmarkingActivity)));
                        ScrollLockLayoutManager scrollLockLayoutManager = null;
                        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) bookmarkingActivity.n0(R.id.clBookmarkLockedView);
                            if (constraintLayout != null) {
                                constraintLayout.setVisibility(0);
                            }
                            bookmarkingActivity.D = true;
                            ((AppCompatImageView) bookmarkingActivity.n0(R.id.ivBookmarkingSearch)).setVisibility(8);
                            RobertoButton robertoButton = (RobertoButton) bookmarkingActivity.n0(R.id.rbBookmarkLockedCta);
                            if (robertoButton != null) {
                                robertoButton.setOnClickListener(new mk.b(bookmarkingActivity, 9));
                            }
                            RecyclerView.m layoutManager = ((RecyclerView) bookmarkingActivity.n0(R.id.rvBookmarkingActivities)).getLayoutManager();
                            if (layoutManager instanceof ScrollLockLayoutManager) {
                                scrollLockLayoutManager = (ScrollLockLayoutManager) layoutManager;
                            }
                            if (scrollLockLayoutManager != null) {
                                scrollLockLayoutManager.setScrollEnabled(false);
                            }
                        } else {
                            bookmarkingActivity.D = false;
                            ((AppCompatImageView) bookmarkingActivity.n0(R.id.ivBookmarkingSearch)).setVisibility(0);
                            RecyclerView.m layoutManager2 = ((RecyclerView) bookmarkingActivity.n0(R.id.rvBookmarkingActivities)).getLayoutManager();
                            if (layoutManager2 instanceof ScrollLockLayoutManager) {
                                scrollLockLayoutManager = (ScrollLockLayoutManager) layoutManager2;
                            }
                            if (scrollLockLayoutManager != null) {
                                scrollLockLayoutManager.setScrollEnabled(true);
                            }
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle.putString("source", bookmarkingActivity.f10623z);
                    bundle.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                    bundle.putInt("bookmarked_activity_count", arrayList2.size());
                    gk.a.b(bundle, "bookmark_repository_click");
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(bookmarkingActivity.f10620w, "exception", e10);
                }
            } else {
                Toast.makeText(bookmarkingActivity, "Error!", 0).show();
            }
            ((ConstraintLayout) bookmarkingActivity.n0(R.id.clBookmarkingLoadingLayout)).setVisibility(8);
            return hs.k.f19476a;
        }
    }

    public BookmarkingActivity() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: mk.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ BookmarkingActivity f25325v;

            {
                this.f25325v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                int i6 = r2;
                BookmarkingActivity this$0 = this.f25325v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a result = (androidx.activity.result.a) obj;
                        int i10 = BookmarkingActivity.I;
                        i.g(this$0, "this$0");
                        i.f(result, "result");
                        try {
                            if (this$0.f10621x) {
                                this$0.q0(false);
                            }
                            if (result.f976u == -1) {
                                Iterator<CourseDayModelV1> it = this$0.o0().getPlanV3().iterator();
                                while (it.hasNext()) {
                                    CourseDayModelV1 next = it.next();
                                    if (this$0.E == next.getPosition()) {
                                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                                        firebasePersistence.getCourseById(this$0.o0().get_id()).getPlanV3().get(next.getPosition()).setCompleted(true);
                                        firebasePersistence.updateUserOnFirebase();
                                    }
                                }
                            }
                            this$0.r0();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f10620w, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = BookmarkingActivity.I;
                        i.g(this$0, "this$0");
                        try {
                            this$0.r0();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10620w, e11);
                            return;
                        }
                }
            }
        });
        i.f(registerForActivityResult, "registerForActivityResul…ivityResult(result)\n    }");
        this.F = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: mk.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ BookmarkingActivity f25325v;

            {
                this.f25325v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                int i6 = r2;
                BookmarkingActivity this$0 = this.f25325v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a result = (androidx.activity.result.a) obj;
                        int i10 = BookmarkingActivity.I;
                        i.g(this$0, "this$0");
                        i.f(result, "result");
                        try {
                            if (this$0.f10621x) {
                                this$0.q0(false);
                            }
                            if (result.f976u == -1) {
                                Iterator<CourseDayModelV1> it = this$0.o0().getPlanV3().iterator();
                                while (it.hasNext()) {
                                    CourseDayModelV1 next = it.next();
                                    if (this$0.E == next.getPosition()) {
                                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                                        firebasePersistence.getCourseById(this$0.o0().get_id()).getPlanV3().get(next.getPosition()).setCompleted(true);
                                        firebasePersistence.updateUserOnFirebase();
                                    }
                                }
                            }
                            this$0.r0();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f10620w, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = BookmarkingActivity.I;
                        i.g(this$0, "this$0");
                        try {
                            this$0.r0();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10620w, e11);
                            return;
                        }
                }
            }
        });
        i.f(registerForActivityResult2, "registerForActivityResul…llingScreenResult()\n    }");
        this.G = registerForActivityResult2;
    }

    public final void init() {
        String string;
        String str = this.f10620w;
        try {
            ok.b bVar = this.f10619v;
            if (bVar != null) {
                bVar.f27590y.e(this, new dk.a(6, new a()));
                ((ConstraintLayout) n0(R.id.clBookmarkingLoadingLayout)).setVisibility(0);
                bVar.e();
                AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.ivBookmarkingArrowBack);
                if (appCompatImageView != null) {
                    appCompatImageView.setOnClickListener(new mk.b(this, 0));
                }
                try {
                    RobertoEditText robertoEditText = (RobertoEditText) n0(R.id.tvBookmarkingSearchEditText);
                    if (robertoEditText != null) {
                        robertoEditText.addTextChangedListener(new g(this));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(R.id.ivBookmarkingSearch);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setOnClickListener(new mk.b(this, 1));
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) n0(R.id.ivBookmarkingSearchClear);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setOnClickListener(new mk.b(this, 2));
                }
                BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clBookmarkBottomSheet));
                from.setPeekHeight(0);
                from.setState(4);
                from.addBottomSheetCallback(new b());
                View n02 = n0(R.id.viewBookmarkBlanketForeground);
                if (n02 != null) {
                    n02.setOnClickListener(new mk.b(this, 3));
                }
                RobertoButton robertoButton = (RobertoButton) n0(R.id.rbBookmarkBottomSheetCta1);
                if (robertoButton != null) {
                    robertoButton.setOnClickListener(new mk.b(this, 4));
                }
                RobertoButton robertoButton2 = (RobertoButton) n0(R.id.rbBookmarkBottomSheetConfirmationCta);
                if (robertoButton2 != null) {
                    robertoButton2.setOnClickListener(new mk.b(this, 5));
                }
                for (int i6 = 0; i6 < 3; i6++) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_bookmark_unsave_option, (ViewGroup) ((LinearLayout) n0(R.id.llBookmarkBottomSheetConfirmationOptions)), false);
                    if (i6 != 0) {
                        if (i6 != 1) {
                            string = getString(R.string.BookmarkingUnSaveActivityConfirmationOption3);
                        } else {
                            string = getString(R.string.BookmarkingUnSaveActivityConfirmationOption2);
                        }
                    } else {
                        string = getString(R.string.BookmarkingUnSaveActivityConfirmationOption1);
                    }
                    i.f(string, "when (i) {\n             …ption3)\n                }");
                    RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvBookmarkUnSaveHeader);
                    if (robertoTextView != null) {
                        robertoTextView.setText(string);
                    }
                    inflate.setOnClickListener(new t(4, this, string, inflate));
                    ((LinearLayout) n0(R.id.llBookmarkBottomSheetConfirmationOptions)).addView(inflate);
                }
                try {
                    Window window = getWindow();
                    if (Build.VERSION.SDK_INT >= 23) {
                        new u0(window.getDecorView(), window).a(true);
                    }
                    window.setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e11);
                    return;
                }
            }
            i.q("bookmarkingViewModel");
            throw null;
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str, "exception", e12);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.H;
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

    public final Course o0() {
        Course course = this.f10622y;
        if (course != null) {
            return course;
        }
        i.q("course");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        try {
            if (this.f10621x) {
                q0(false);
            } else if (BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clBookmarkBottomSheet)).getState() == 3) {
                BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clBookmarkBottomSheet)).setState(4);
            } else {
                super.onBackPressed();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10620w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_bookmarked);
            if (getIntent().hasExtra("source")) {
                this.f10623z = String.valueOf(getIntent().getStringExtra("source"));
            }
            this.f10619v = (ok.b) new o0(this, new ok.c(new s5(11))).a(ok.b.class);
            init();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10620w, "exception", e10);
        }
    }

    public final void p0() {
        try {
            setResult(-1, new Intent().putExtra("launch_today_plan", true));
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10620w, e10);
        }
    }

    public final void q0(boolean z10) {
        nk.b bVar;
        Editable text;
        b.a aVar;
        nk.b bVar2;
        b.a aVar2;
        IBinder iBinder = null;
        try {
            if (z10) {
                RobertoEditText robertoEditText = (RobertoEditText) n0(R.id.tvBookmarkingSearchEditText);
                if (robertoEditText != null) {
                    robertoEditText.setVisibility(0);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.ivBookmarkingSearch);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
                RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvBookmarkingHeaderTitle);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(8);
                }
                RecyclerView.e adapter = ((RecyclerView) n0(R.id.rvBookmarkingActivities)).getAdapter();
                if (adapter instanceof nk.b) {
                    bVar2 = (nk.b) adapter;
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null && (aVar2 = bVar2.F) != null) {
                    aVar2.filter(null);
                }
                this.f10621x = true;
                RobertoEditText robertoEditText2 = (RobertoEditText) n0(R.id.tvBookmarkingSearchEditText);
                if (robertoEditText2 != null) {
                    robertoEditText2.requestFocus();
                }
                Object systemService = getSystemService("input_method");
                i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).toggleSoftInput(2, 0);
                return;
            }
            RobertoEditText robertoEditText3 = (RobertoEditText) n0(R.id.tvBookmarkingSearchEditText);
            if (robertoEditText3 != null) {
                robertoEditText3.setVisibility(8);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(R.id.ivBookmarkingSearchClear);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(8);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) n0(R.id.ivBookmarkingSearch);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(0);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) n0(R.id.tvBookmarkingHeaderTitle);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(0);
            }
            RecyclerView.e adapter2 = ((RecyclerView) n0(R.id.rvBookmarkingActivities)).getAdapter();
            if (adapter2 instanceof nk.b) {
                bVar = (nk.b) adapter2;
            } else {
                bVar = null;
            }
            if (bVar != null && (aVar = bVar.F) != null) {
                aVar.filter(null);
            }
            this.f10621x = false;
            Object systemService2 = getSystemService("input_method");
            i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService2;
            RobertoEditText robertoEditText4 = (RobertoEditText) n0(R.id.tvBookmarkingSearchEditText);
            if (robertoEditText4 != null) {
                iBinder = robertoEditText4.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            RobertoEditText robertoEditText5 = (RobertoEditText) n0(R.id.tvBookmarkingSearchEditText);
            if (robertoEditText5 != null && (text = robertoEditText5.getText()) != null) {
                text.clear();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10620w, e10);
        }
    }

    public final void r0() {
        Editable text;
        try {
            if (this.f10619v != null) {
                ((ConstraintLayout) n0(R.id.clBookmarkingLoadingLayout)).setVisibility(0);
                ((ConstraintLayout) n0(R.id.clEmptyActivityListView)).setVisibility(8);
                ok.b bVar = this.f10619v;
                if (bVar != null) {
                    bVar.e();
                    RobertoEditText robertoEditText = (RobertoEditText) n0(R.id.tvBookmarkingSearchEditText);
                    if (robertoEditText != null && (text = robertoEditText.getText()) != null) {
                        text.clear();
                        return;
                    }
                    return;
                }
                i.q("bookmarkingViewModel");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10620w, e10);
        }
    }

    /* compiled from: BookmarkingActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends BottomSheetBehavior.f {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            BookmarkingActivity bookmarkingActivity = BookmarkingActivity.this;
            if (i6 != 1 && i6 != 3) {
                if (i6 == 4) {
                    View n02 = bookmarkingActivity.n0(R.id.viewBookmarkBlanketForeground);
                    if (n02 != null) {
                        n02.setVisibility(8);
                    }
                    try {
                        ConstraintLayout constraintLayout = (ConstraintLayout) bookmarkingActivity.n0(R.id.clBookmarkBottomSheetContainer2);
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) bookmarkingActivity.n0(R.id.clBookmarkBottomSheetContainer1);
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(0);
                        }
                        LinearLayout linearLayout = (LinearLayout) bookmarkingActivity.n0(R.id.llBookmarkBottomSheetConfirmationOptions);
                        if (linearLayout != null) {
                            Iterator<View> it = f6.b.B0(linearLayout).iterator();
                            while (true) {
                                j0 j0Var = (j0) it;
                                if (!j0Var.hasNext()) {
                                    break;
                                }
                                View view2 = (View) j0Var.next();
                                AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.ivBookmarkUnSaveCheckBox);
                                if (appCompatImageView != null) {
                                    appCompatImageView.setImageResource(R.drawable.ic_check_box_outline_blank_blue_24dp);
                                }
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(R.id.ivBookmarkUnSaveCheckBox);
                                if (appCompatImageView2 != null) {
                                    appCompatImageView2.setImageTintList(ColorStateList.valueOf(g0.a.b(bookmarkingActivity, R.color.title_high_contrast)));
                                }
                            }
                        }
                        bookmarkingActivity.B.clear();
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(bookmarkingActivity.f10620w, e10);
                        return;
                    }
                }
                return;
            }
            View n03 = bookmarkingActivity.n0(R.id.viewBookmarkBlanketForeground);
            if (n03 != null) {
                n03.setVisibility(0);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }
}
