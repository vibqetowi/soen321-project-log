package com.theinnerhour.b2b.components.learningHub.experiment.activities;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AssetProviderSingleton;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.f;
import is.p;
import is.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import r1.b0;
import t0.j0;
import t0.u0;
import w5.h0;
/* compiled from: LearningHubExperimentActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/learningHub/experiment/activities/LearningHubExperimentActivity;", "Landroidx/appcompat/app/c;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LearningHubExperimentActivity extends androidx.appcompat.app.c implements CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ int F = 0;
    public LearningHubModel A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public int f11270w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11271x;

    /* renamed from: z  reason: collision with root package name */
    public int f11273z;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11269v = LogHelper.INSTANCE.makeLogTag(LearningHubExperimentActivity.class);

    /* renamed from: y  reason: collision with root package name */
    public final xm.b f11272y = new xm.b();
    public ArrayList<LearningHubModel> C = new ArrayList<>();
    public final b D = new b();

    /* compiled from: LearningHubExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends r {
        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.c0
        public final int[] b(RecyclerView.m layoutManager, View targetView) {
            i.g(layoutManager, "layoutManager");
            i.g(targetView, "targetView");
            int[] iArr = new int[2];
            if (layoutManager.canScrollHorizontally()) {
                new Rect();
                iArr[0] = (layoutManager.getDecoratedLeft(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).leftMargin) - layoutManager.getPaddingLeft();
            } else {
                iArr[0] = 0;
            }
            if (layoutManager.canScrollVertically()) {
                new Rect();
                iArr[1] = (layoutManager.getDecoratedTop(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).topMargin) - layoutManager.getPaddingTop();
            } else {
                iArr[1] = 0;
            }
            return iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ArrayList f11275u;

        public c(ArrayList arrayList) {
            this.f11275u = arrayList;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            boolean z10;
            LearningHubModel learningHubModel = (LearningHubModel) t3;
            ArrayList<PostsRead> postsRead = this.f11275u;
            i.f(postsRead, "postsRead");
            boolean z11 = true;
            if (!(postsRead instanceof Collection) || !postsRead.isEmpty()) {
                for (PostsRead postsRead2 : postsRead) {
                    if (i.b(postsRead2.getPostId(), learningHubModel.getId())) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            Boolean valueOf = Boolean.valueOf(z10);
            LearningHubModel learningHubModel2 = (LearningHubModel) t10;
            i.f(postsRead, "postsRead");
            if (!(postsRead instanceof Collection) || !postsRead.isEmpty()) {
                for (PostsRead postsRead3 : postsRead) {
                    if (i.b(postsRead3.getPostId(), learningHubModel2.getId())) {
                        break;
                    }
                }
            }
            z11 = false;
            return sp.b.g(valueOf, Boolean.valueOf(z11));
        }
    }

    /* compiled from: LearningHubExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<hs.k> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            LearningHubExperimentActivity.this.B = true;
            return hs.k.f19476a;
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.E;
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

    public final void o0() {
        MotionLayout motionLayout;
        a.b s10;
        Editable text;
        this.f11271x = false;
        xm.b bVar = this.f11272y;
        RobertoEditText robertoEditText = (RobertoEditText) bVar._$_findCachedViewById(R.id.tvLearningHubExperimentSearchSearchEditText);
        if (robertoEditText != null && (text = robertoEditText.getText()) != null) {
            text.clear();
        }
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.o(bVar);
        aVar.j();
        FrameLayout frameLayout = (FrameLayout) n0(R.id.flLearningHubExperimentSearchFragmentContainer);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        if (this.f11273z > 0 && (motionLayout = (MotionLayout) n0(R.id.mlLearningHubExperimentParent)) != null && (s10 = motionLayout.s(R.id.transitionLearningHubExperiment)) != null) {
            s10.f1685o = false;
        }
        getWindow().setStatusBarColor(g0.a.b(this, R.color.loginBGNew));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f11271x) {
            o0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Chip chip;
        RecyclerView.e eVar;
        Chip chip2 = null;
        wm.b bVar = null;
        if (z10) {
            if (compoundButton instanceof Chip) {
                chip = (Chip) compoundButton;
            } else {
                chip = null;
            }
            if (chip != null) {
                chip.setChipBackgroundColorResource(R.color.title_high_contrast);
                chip.setChipStrokeColorResource(R.color.title_high_contrast);
                chip.setTextColor(g0.a.b(this, R.color.white));
                RecyclerView recyclerView = (RecyclerView) n0(R.id.rvLearningHubExperimentHistory);
                if (recyclerView != null) {
                    eVar = recyclerView.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof wm.b) {
                    bVar = (wm.b) eVar;
                }
                if (bVar != null) {
                    String chipFilter = chip.getText().toString();
                    i.g(chipFilter, "chipFilter");
                    bVar.f36755z = new f<>(chipFilter, bVar.f36755z.f19465v);
                    bVar.v();
                }
                Bundle a10 = b0.a("status", "selected");
                String lowerCase = chip.getText().toString().toLowerCase();
                i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                a10.putString("chip", lowerCase);
                gk.a.b(a10, "cm_post_chip_click");
                return;
            }
            return;
        }
        if (compoundButton instanceof Chip) {
            chip2 = (Chip) compoundButton;
        }
        if (chip2 != null) {
            chip2.setChipBackgroundColorResource(R.color.statusBarGrey);
            chip2.setChipStrokeColorResource(R.color.statusBarGrey);
            chip2.setTextColor(g0.a.b(this, R.color.title_high_contrast));
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        u0.e aVar;
        u0.e eVar;
        ArrayList<?> arrayList;
        super.onCreate(bundle);
        setContentView(R.layout.activity_learning_hub_experiment);
        try {
            Window window = getWindow();
            View decorView = getWindow().getDecorView();
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
            getWindow().setStatusBarColor(g0.a.b(this, R.color.loginBGNew));
            Serializable serializableExtra = getIntent().getSerializableExtra("learningHubList");
            if (serializableExtra instanceof ArrayList) {
                arrayList = (ArrayList) serializableExtra;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                r0(arrayList);
            }
            if (!getIntent().getBooleanExtra("showPage", true)) {
                startActivity(new Intent(this, LearningHubArticleExperimentActivity.class).putExtra("model", getIntent().getSerializableExtra("model")));
            }
            String str = gk.a.f16573a;
            Bundle bundle2 = new Bundle();
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            if (getIntent().hasExtra("isOnboarding") && getIntent().getBooleanExtra("isOnboarding", false)) {
                bundle2.putBoolean("isOnboarding", true);
            } else {
                bundle2.putBoolean("isOnboarding", false);
            }
            String stringExtra = getIntent().getStringExtra("source");
            if (stringExtra != null) {
                bundle2.putString("source", stringExtra);
            }
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle2, "cm_list");
            String string = getString(R.string.all);
            i.f(string, "getString(R.string.all)");
            String string2 = getString(R.string.articles);
            i.f(string2, "getString(R.string.articles)");
            String string3 = getString(R.string.quotes);
            i.f(string3, "getString(R.string.quotes)");
            String string4 = getString(R.string.tips);
            i.f(string4, "getString(R.string.tips)");
            String string5 = getString(R.string.therapistSays);
            i.f(string5, "getString(R.string.therapistSays)");
            String string6 = getString(R.string.creatives);
            i.f(string6, "getString(R.string.creatives)");
            String string7 = getString(R.string.videos);
            i.f(string7, "getString(R.string.videos)");
            p0(ca.a.k(string, string2, string3, string4, string5, string6, string7));
            q0();
            AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.ivLearningHubExperimentSearch);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new vm.e(this, 0));
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(R.id.ivLearningHubExperimentBack);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new vm.e(this, 1));
            }
            FrameLayout frameLayout = (FrameLayout) n0(R.id.flLearningHubExperimentSearchFragmentContainer);
            if (frameLayout != null) {
                frameLayout.setOnTouchListener(new h0(12));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        int i6;
        wm.d dVar;
        RecyclerView.e eVar;
        wm.b bVar;
        String str;
        AppCompatImageView appCompatImageView;
        View childAt;
        String str2;
        super.onResume();
        if (this.B) {
            boolean z10 = false;
            this.B = false;
            this.f11270w++;
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvLearningHubExperimentTodayCounterText);
            if (robertoTextView != null) {
                if (this.f11273z - this.f11270w > 0) {
                    str2 = (this.f11273z - this.f11270w) + " left";
                } else {
                    str2 = "Completed";
                }
                robertoTextView.setText(str2);
            }
            LinearLayout linearLayout = (LinearLayout) n0(R.id.llLearningHubExperimentTodayCounter);
            if (linearLayout != null) {
                i6 = linearLayout.getChildCount();
            } else {
                i6 = this.f11270w - 1;
            }
            Integer num = null;
            if (i6 >= this.f11270w) {
                LinearLayout linearLayout2 = (LinearLayout) n0(R.id.llLearningHubExperimentTodayCounter);
                if (linearLayout2 != null && (childAt = linearLayout2.getChildAt(this.f11270w - 1)) != null) {
                    appCompatImageView = (AppCompatImageView) childAt.findViewById(R.id.ivLearningHubExperimentCircle);
                } else {
                    appCompatImageView = null;
                }
                if (appCompatImageView != null) {
                    appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(this, R.color.sea)));
                }
            }
            RecyclerView.e adapter = ((RecyclerView) n0(R.id.rvLearningHubExperimentTodayScroller)).getAdapter();
            if (adapter instanceof wm.d) {
                dVar = (wm.d) adapter;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
                ArrayList<LearningHubModel> arrayList = dVar.f36761x;
                if (arrayList.size() > 1) {
                    p.P1(arrayList, new wm.e(postsRead));
                }
                dVar.i();
            }
            RecyclerView recyclerView = (RecyclerView) n0(R.id.rvLearningHubExperimentHistory);
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = null;
            }
            if (eVar instanceof wm.b) {
                bVar = (wm.b) eVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                LearningHubModel learningHubModel = this.A;
                if (learningHubModel != null) {
                    str = learningHubModel.getId();
                } else {
                    str = null;
                }
                if (str != null) {
                    Iterator<LearningHubModel> it = bVar.A.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (i.b(it.next().getId(), str)) {
                                break;
                            }
                            i10++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i10);
                    if (valueOf.intValue() == -1) {
                        z10 = true;
                    }
                    if (!z10) {
                        num = valueOf;
                    }
                    if (num != null) {
                        bVar.j(num.intValue());
                    }
                }
            }
            o0();
        }
    }

    public final void p0(ArrayList<String> arrayList) {
        try {
            for (String str : arrayList) {
                Chip chip = new Chip(((ChipGroup) n0(R.id.cgLearningHubExperimentChipContainer)).getContext(), null);
                chip.setLayoutParams(new ChipGroup.b());
                chip.setTypeface(AssetProviderSingleton.INSTANCE.getTypeface(this, "Lato-Medium.ttf"));
                chip.setText(str);
                chip.setCheckable(true);
                chip.setGravity(17);
                chip.setCheckedIconVisible(false);
                chip.setChipIconVisible(false);
                chip.setCloseIconResource(R.drawable.ic_remove_circle_black_outline);
                chip.setCloseIconVisible(false);
                chip.setCloseIconTint(null);
                chip.setChipStrokeWidthResource(R.dimen._1sdp);
                chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics())));
                chip.setChipStartPaddingResource(R.dimen.margin_16);
                chip.setChipEndPaddingResource(R.dimen.margin_16);
                if (i.b(str, getString(R.string.all))) {
                    chip.setChecked(true);
                    chip.setChipBackgroundColorResource(R.color.title_high_contrast);
                    chip.setChipStrokeColorResource(R.color.title_high_contrast);
                    chip.setTextColor(g0.a.b(this, R.color.white));
                } else {
                    chip.setChipBackgroundColorResource(R.color.statusBarGrey);
                    chip.setChipStrokeColorResource(R.color.statusBarGrey);
                    chip.setTextColor(g0.a.b(this, R.color.title_high_contrast));
                }
                ((ChipGroup) n0(R.id.cgLearningHubExperimentChipContainer)).addView(chip);
                chip.setOnCheckedChangeListener(this);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11269v, "Error adding chip", e10);
        }
    }

    public final void q0() {
        BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clLearningHubExperimentBottomSheet));
        from.setPeekHeight(0);
        from.setState(4);
        from.addBottomSheetCallback(new a());
        View n02 = n0(R.id.viewLearningHubExperimentBlanket);
        if (n02 != null) {
            n02.setOnClickListener(new vm.e(this, 2));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.ivLearningHubExperimentHistoryFilter);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new vm.e(this, 3));
        }
        RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvLearningHubExperimentBottomSheetFilterRead);
        if (robertoTextView != null) {
            robertoTextView.setOnClickListener(new vm.e(this, 4));
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) n0(R.id.tvLearningHubExperimentBottomSheetFilterUnread);
        if (robertoTextView2 != null) {
            robertoTextView2.setOnClickListener(new vm.e(this, 5));
        }
        RobertoTextView robertoTextView3 = (RobertoTextView) n0(R.id.tvLearningHubExperimentBottomSheetFilterAll);
        if (robertoTextView3 != null) {
            robertoTextView3.setOnClickListener(new vm.e(this, 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(ArrayList<?> arrayList) {
        int i6;
        a.b s10;
        AppCompatImageView appCompatImageView;
        String str;
        this.C = arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
        Course courseById = firebasePersistence.getCourseById(firebasePersistence.getUser().getCurrentCourse());
        ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
        Iterator<T> it = q.S1(arrayList).iterator();
        while (true) {
            i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            LearningHubModel learningHubModel = (LearningHubModel) it.next();
            if (learningHubModel.getDay() == ((int) courseById.getCourseOpenDay())) {
                arrayList2.add(learningHubModel);
                View inflate = getLayoutInflater().inflate(R.layout.row_learning_hub_experiment_counter_circle, (ViewGroup) ((LinearLayout) n0(R.id.llLearningHubExperimentTodayCounter)), false);
                Iterator<PostsRead> it2 = postsRead.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (i.b(it2.next().getPostId(), learningHubModel.getId())) {
                        this.f11270w++;
                        break;
                    }
                }
                ((LinearLayout) n0(R.id.llLearningHubExperimentTodayCounter)).addView(inflate);
            } else {
                arrayList3.add(learningHubModel);
            }
        }
        if (arrayList2.size() > 1) {
            p.P1(arrayList2, new c(postsRead));
        }
        ((RecyclerView) n0(R.id.rvLearningHubExperimentHistory)).setLayoutManager(new GridLayoutManager(this, 2, 0));
        ((RecyclerView) n0(R.id.rvLearningHubExperimentHistory)).setAdapter(new wm.b(this, arrayList3));
        s0(arrayList3.isEmpty());
        ((RecyclerView) n0(R.id.rvLearningHubExperimentTodayScroller)).setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((RecyclerView) n0(R.id.rvLearningHubExperimentTodayScroller)).setAdapter(new wm.d(arrayList2, new d()));
        this.D.a((RecyclerView) n0(R.id.rvLearningHubExperimentTodayScroller));
        RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvLearningHubExperimentTodayCounterText);
        if (robertoTextView != null) {
            if (arrayList2.size() - this.f11270w == 0) {
                str = "Completed";
            } else {
                str = (arrayList2.size() - this.f11270w) + " left";
            }
            robertoTextView.setText(str);
        }
        LinearLayout linearLayout = (LinearLayout) n0(R.id.llLearningHubExperimentTodayCounter);
        if (linearLayout != null) {
            Iterator<View> it3 = f6.b.B0(linearLayout).iterator();
            while (true) {
                j0 j0Var = (j0) it3;
                if (!j0Var.hasNext()) {
                    break;
                }
                Object next = j0Var.next();
                int i10 = i6 + 1;
                if (i6 >= 0) {
                    View view = (View) next;
                    if (i6 < this.f11270w && (appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivLearningHubExperimentCircle)) != null) {
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(this, R.color.sea)));
                    }
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            MotionLayout motionLayout = (MotionLayout) n0(R.id.mlLearningHubExperimentParent);
            if (motionLayout != null) {
                motionLayout.A();
            }
            MotionLayout motionLayout2 = (MotionLayout) n0(R.id.mlLearningHubExperimentParent);
            if (motionLayout2 != null && (s10 = motionLayout2.s(R.id.transitionLearningHubExperiment)) != null) {
                s10.f1685o = true;
            }
        }
        this.f11273z = arrayList2.size();
        MotionLayout motionLayout3 = (MotionLayout) n0(R.id.mlLearningHubExperimentParent);
        if (motionLayout3 != null) {
            motionLayout3.setTransitionListener(new e());
        }
    }

    public final void s0(boolean z10) {
        int i6;
        AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.ivLearningHubExperimentHistoryNull);
        int i10 = 0;
        if (appCompatImageView != null) {
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            appCompatImageView.setVisibility(i6);
        }
        RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvLearningHubExperimentHistoryNull);
        if (robertoTextView != null) {
            if (!z10) {
                i10 = 8;
            }
            robertoTextView.setVisibility(i10);
        }
    }

    /* compiled from: LearningHubExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e implements MotionLayout.h {
        public e() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public final void a(int i6) {
            wm.d dVar;
            boolean z10;
            RecyclerView.e adapter = ((RecyclerView) LearningHubExperimentActivity.this.n0(R.id.rvLearningHubExperimentTodayScroller)).getAdapter();
            if (adapter instanceof wm.d) {
                dVar = (wm.d) adapter;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                if (i6 == R.id.transitionLearningHubExperimentStart) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.f36763z = z10;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public final void b() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public final void c() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public final void d() {
        }
    }

    /* compiled from: LearningHubExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends BottomSheetBehavior.f {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            int i10;
            View n02 = LearningHubExperimentActivity.this.n0(R.id.viewLearningHubExperimentBlanket);
            if (n02 != null) {
                if (i6 == 3) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                n02.setVisibility(i10);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }
}
