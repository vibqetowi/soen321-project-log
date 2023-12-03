package sm;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cdflynn.android.library.turn.TurnLayoutManager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.TurnLayoutCustomManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: JournalThoughtLearningCarouselFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/u;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends Fragment {
    public static final /* synthetic */ int E = 0;
    public boolean B;

    /* renamed from: v  reason: collision with root package name */
    public androidx.recyclerview.widget.w f31746v;

    /* renamed from: w  reason: collision with root package name */
    public int f31747w;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f31745u = LogHelper.INSTANCE.makeLogTag("JournalTipsFragment");

    /* renamed from: x  reason: collision with root package name */
    public boolean f31748x = true;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<HashMap<String, Object>> f31749y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public hs.f<Integer, Integer> f31750z = new hs.f<>(4, 0);
    public String A = "journal_list";
    public final a C = new a();

    /* compiled from: JournalThoughtLearningCarouselFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            u uVar = u.this;
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                try {
                    RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                    kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type cdflynn.android.library.turn.TurnLayoutManager");
                    TurnLayoutManager turnLayoutManager = (TurnLayoutManager) layoutManager;
                    androidx.recyclerview.widget.w wVar = uVar.f31746v;
                    if (wVar != null) {
                        View d10 = wVar.d(turnLayoutManager);
                        if (d10 != null) {
                            int i10 = uVar.f31747w;
                            int position = turnLayoutManager.getPosition(d10);
                            uVar.f31747w = position;
                            if (i10 != position) {
                                uVar.I();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("snapper");
                    throw null;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(uVar.f31745u, e10);
                }
            }
        }
    }

    /* compiled from: JournalThoughtLearningCarouselFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ hs.j<String, String, String> f31753b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f31754c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f31755d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f31756e;
        public final /* synthetic */ ObjectAnimator f;

        public b(hs.j<String, String, String> jVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4) {
            this.f31753b = jVar;
            this.f31754c = objectAnimator;
            this.f31755d = objectAnimator2;
            this.f31756e = objectAnimator3;
            this.f = objectAnimator4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            u uVar = u.this;
            RobertoTextView robertoTextView = (RobertoTextView) uVar._$_findCachedViewById(R.id.tvTLCarouselCount);
            if (robertoTextView != null) {
                robertoTextView.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) uVar._$_findCachedViewById(R.id.tvTLCarouselTitle);
            if (robertoTextView2 != null) {
                robertoTextView2.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) uVar._$_findCachedViewById(R.id.tvTLCarouselDescription);
            if (robertoTextView3 != null) {
                robertoTextView3.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) uVar._$_findCachedViewById(R.id.tvTLCarouselCount);
            hs.j<String, String, String> jVar = this.f31753b;
            if (robertoTextView4 != null) {
                robertoTextView4.setText(jVar.f19473u);
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) uVar._$_findCachedViewById(R.id.tvTLCarouselTitle);
            if (robertoTextView5 != null) {
                robertoTextView5.setText(jVar.f19474v);
            }
            RobertoTextView robertoTextView6 = (RobertoTextView) uVar._$_findCachedViewById(R.id.tvTLCarouselDescription);
            if (robertoTextView6 != null) {
                robertoTextView6.setText(jVar.f19475w);
            }
            ObjectAnimator objectAnimator = this.f31754c;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            ObjectAnimator objectAnimator2 = this.f31755d;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
            ObjectAnimator objectAnimator3 = this.f31756e;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
            ObjectAnimator objectAnimator4 = this.f;
            if (objectAnimator4 != null) {
                objectAnimator4.removeAllListeners();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    /* compiled from: JournalThoughtLearningCarouselFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f31758b;

        public c(ObjectAnimator objectAnimator) {
            this.f31758b = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            u uVar = u.this;
            uVar.f31748x = true;
            ObjectAnimator objectAnimator = this.f31758b;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
            }
            if (uVar.f31747w == uVar.f31749y.size() - 1) {
                ((RobertoButton) uVar._$_findCachedViewById(R.id.rbTLCarouselButton)).setVisibility(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    public final Bundle F() {
        String str;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("template", "thought_journal");
            if (kotlin.jvm.internal.i.b(this.A, "journal_list")) {
                str = "list_screen";
            } else {
                str = "inside_entry";
            }
            bundle.putString("source", str);
            bundle.putBoolean("is_onboarding", this.B);
            bundle.putInt("step_num", this.f31747w + 1);
            return bundle;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31745u, e10);
            return new Bundle();
        }
    }

    public final void I() {
        Integer num;
        try {
            J();
            int i6 = this.f31747w;
            if (i6 == 0) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselPrevious);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(4);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselNext);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
            } else if (i6 == this.f31749y.size() - 1) {
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselPrevious);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(0);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselNext);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(4);
                }
            } else {
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselPrevious);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setVisibility(0);
                }
                AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselNext);
                if (appCompatImageView6 != null) {
                    appCompatImageView6.setVisibility(0);
                }
            }
            AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselPrevious);
            Integer num2 = null;
            if (appCompatImageView7 != null) {
                num = Integer.valueOf(appCompatImageView7.getVisibility());
            } else {
                num = null;
            }
            AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselNext);
            if (appCompatImageView8 != null) {
                num2 = Integer.valueOf(appCompatImageView8.getVisibility());
            }
            this.f31750z = new hs.f<>(num, num2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31745u, e10);
        }
    }

    public final void J() {
        Object obj;
        String str;
        Object obj2;
        try {
            this.f31748x = false;
            String str2 = (this.f31747w + 1) + " / " + this.f31749y.size();
            HashMap hashMap = (HashMap) is.u.j2(this.f31747w, this.f31749y);
            String str3 = null;
            if (hashMap != null) {
                obj = hashMap.get("title");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap hashMap2 = (HashMap) is.u.j2(this.f31747w, this.f31749y);
            if (hashMap2 != null) {
                obj2 = hashMap2.get("description");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str3 = (String) obj2;
            }
            hs.j jVar = new hs.j(str2, str, str3);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselCount), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselTitle), "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(250L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselDescription), "alpha", 1.0f, 0.0f);
            ofFloat3.setDuration(250L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselCount), "alpha", 0.0f, 1.0f);
            ofFloat4.setDuration(250L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselTitle), "alpha", 0.0f, 1.0f);
            ofFloat5.setDuration(250L);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselDescription), "alpha", 0.0f, 1.0f);
            ofFloat6.setDuration(250L);
            ofFloat.addListener(new b(jVar, ofFloat4, ofFloat5, ofFloat6, ofFloat));
            ofFloat4.addListener(new c(ofFloat4));
            ofFloat.start();
            ofFloat2.start();
            ofFloat3.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31745u, e10);
        }
    }

    public final void K() {
        ArrayList<HashMap<String, Object>> arrayList = this.f31749y;
        arrayList.add(is.e0.s0(new hs.f("title", getString(R.string.journal_tl_nutshell_title1)), new hs.f("description", getString(R.string.journal_tl_nutshell_description1))));
        arrayList.add(is.e0.s0(new hs.f("title", getString(R.string.journal_tl_nutshell_title2)), new hs.f("description", getString(R.string.journal_tl_nutshell_description2))));
        arrayList.add(is.e0.s0(new hs.f("title", getString(R.string.journal_tl_nutshell_title3)), new hs.f("description", getString(R.string.journal_tl_nutshell_description3))));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.D;
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
        return inflater.inflate(R.layout.fragment_journal_toughts_learning_carousel, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.D.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        int i6;
        int i10;
        Object obj;
        String str2;
        String str3;
        String str4;
        a aVar = this.C;
        String str5 = this.f31745u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("source");
        } else {
            str = null;
        }
        if (str == null) {
            str = "journal_list";
        }
        this.A = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z10 = arguments2.getBoolean("isOnboarding");
        } else {
            z10 = false;
        }
        this.B = z10;
        try {
            this.f31749y = new ArrayList<>();
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvTLCarouselTips);
            if (recyclerView != null) {
                recyclerView.setAdapter(null);
                recyclerView.c0(aVar);
                recyclerView.setLayoutManager(null);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str5, e10);
        }
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselPrevious);
            if (appCompatImageView != null) {
                Integer num = this.f31750z.f19464u;
                if (num != null) {
                    i6 = num.intValue();
                } else {
                    i6 = 0;
                }
                appCompatImageView.setVisibility(i6);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselNext);
            if (appCompatImageView2 != null) {
                Integer num2 = this.f31750z.f19465v;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = 0;
                }
                appCompatImageView2.setVisibility(i10);
            }
            K();
            List P0 = ca.a.P0("https://assets.theinnerhour.com/activity_assets/N1660721893547.png", "https://assets.theinnerhour.com/activity_assets/N1660721899250.png", "https://assets.theinnerhour.com/activity_assets/N1660721905439.png");
            androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w();
            this.f31746v = wVar;
            wVar.a((RecyclerView) _$_findCachedViewById(R.id.rvTLCarouselTips));
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            ((RecyclerView) _$_findCachedViewById(R.id.rvTLCarouselTips)).setLayoutManager(new TurnLayoutCustomManager(requireActivity, 8388613, 0, 5000, 0, true));
            if (this.f31749y.size() > 0) {
                androidx.fragment.app.p requireActivity2 = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                ((RecyclerView) _$_findCachedViewById(R.id.rvTLCarouselTips)).setAdapter(new ol.r(requireActivity2, P0));
                ((RecyclerView) _$_findCachedViewById(R.id.rvTLCarouselTips)).k0(15, 0, false);
                ((RecyclerView) _$_findCachedViewById(R.id.rvTLCarouselTips)).i(aVar);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselCount)).setText((this.f31747w + 1) + " / " + this.f31749y.size());
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselTitle);
                HashMap hashMap = (HashMap) is.u.j2(this.f31747w, this.f31749y);
                if (hashMap != null) {
                    obj = hashMap.get("title");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                robertoTextView.setText(str2);
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvTLCarouselDescription);
                HashMap hashMap2 = (HashMap) is.u.j2(this.f31747w, this.f31749y);
                if (hashMap2 != null) {
                    str3 = hashMap2.get("description");
                } else {
                    str3 = null;
                }
                if (str3 instanceof String) {
                    str4 = str3;
                } else {
                    str4 = null;
                }
                robertoTextView2.setText(str4);
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselPrevious)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ u f31744v;

                    {
                        this.f31744v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        int i13 = r2;
                        u this$0 = this.f31744v;
                        switch (i13) {
                            case 0:
                                int i14 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str6 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_previous_step");
                                    int i15 = this$0.f31747w;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f31747w = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str7 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_next_step");
                                    if (this$0.f31747w < this$0.f31749y.size() - 1) {
                                        i12 = this$0.f31747w + 1;
                                    } else {
                                        i12 = this$0.f31747w;
                                    }
                                    this$0.f31747w = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str8 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_next_cta");
                                JournalParentActivity journalParentActivity = null;
                                JournalActivity journalActivity = null;
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    if (requireActivity3 instanceof JournalActivity) {
                                        journalActivity = (JournalActivity) requireActivity3;
                                    }
                                    if (journalActivity != null) {
                                        journalActivity.r0(2, this$0.B);
                                        return;
                                    }
                                    return;
                                }
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof JournalParentActivity) {
                                    journalParentActivity = (JournalParentActivity) requireActivity4;
                                }
                                if (journalParentActivity != null) {
                                    journalParentActivity.x0(2);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str9 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_back");
                                this$0.requireActivity().onBackPressed();
                                return;
                            default:
                                int i19 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str10 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_skip");
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity5 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                    ((JournalActivity) requireActivity5).p0(this$0.B);
                                    return;
                                }
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity6).q0();
                                return;
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselNext)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ u f31744v;

                    {
                        this.f31744v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        int i13 = r2;
                        u this$0 = this.f31744v;
                        switch (i13) {
                            case 0:
                                int i14 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str6 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_previous_step");
                                    int i15 = this$0.f31747w;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f31747w = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str7 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_next_step");
                                    if (this$0.f31747w < this$0.f31749y.size() - 1) {
                                        i12 = this$0.f31747w + 1;
                                    } else {
                                        i12 = this$0.f31747w;
                                    }
                                    this$0.f31747w = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str8 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_next_cta");
                                JournalParentActivity journalParentActivity = null;
                                JournalActivity journalActivity = null;
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    if (requireActivity3 instanceof JournalActivity) {
                                        journalActivity = (JournalActivity) requireActivity3;
                                    }
                                    if (journalActivity != null) {
                                        journalActivity.r0(2, this$0.B);
                                        return;
                                    }
                                    return;
                                }
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof JournalParentActivity) {
                                    journalParentActivity = (JournalParentActivity) requireActivity4;
                                }
                                if (journalParentActivity != null) {
                                    journalParentActivity.x0(2);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str9 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_back");
                                this$0.requireActivity().onBackPressed();
                                return;
                            default:
                                int i19 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str10 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_skip");
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity5 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                    ((JournalActivity) requireActivity5).p0(this$0.B);
                                    return;
                                }
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity6).q0();
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.rbTLCarouselButton)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ u f31744v;

                    {
                        this.f31744v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        int i13 = r2;
                        u this$0 = this.f31744v;
                        switch (i13) {
                            case 0:
                                int i14 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str6 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_previous_step");
                                    int i15 = this$0.f31747w;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f31747w = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str7 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_next_step");
                                    if (this$0.f31747w < this$0.f31749y.size() - 1) {
                                        i12 = this$0.f31747w + 1;
                                    } else {
                                        i12 = this$0.f31747w;
                                    }
                                    this$0.f31747w = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str8 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_next_cta");
                                JournalParentActivity journalParentActivity = null;
                                JournalActivity journalActivity = null;
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    if (requireActivity3 instanceof JournalActivity) {
                                        journalActivity = (JournalActivity) requireActivity3;
                                    }
                                    if (journalActivity != null) {
                                        journalActivity.r0(2, this$0.B);
                                        return;
                                    }
                                    return;
                                }
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof JournalParentActivity) {
                                    journalParentActivity = (JournalParentActivity) requireActivity4;
                                }
                                if (journalParentActivity != null) {
                                    journalParentActivity.x0(2);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str9 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_back");
                                this$0.requireActivity().onBackPressed();
                                return;
                            default:
                                int i19 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str10 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_skip");
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity5 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                    ((JournalActivity) requireActivity5).p0(this$0.B);
                                    return;
                                }
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity6).q0();
                                return;
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivTLCarouselBack)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ u f31744v;

                    {
                        this.f31744v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        int i13 = r2;
                        u this$0 = this.f31744v;
                        switch (i13) {
                            case 0:
                                int i14 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str6 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_previous_step");
                                    int i15 = this$0.f31747w;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f31747w = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f31748x) {
                                    String str7 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_next_step");
                                    if (this$0.f31747w < this$0.f31749y.size() - 1) {
                                        i12 = this$0.f31747w + 1;
                                    } else {
                                        i12 = this$0.f31747w;
                                    }
                                    this$0.f31747w = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                    this$0.I();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str8 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_next_cta");
                                JournalParentActivity journalParentActivity = null;
                                JournalActivity journalActivity = null;
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    if (requireActivity3 instanceof JournalActivity) {
                                        journalActivity = (JournalActivity) requireActivity3;
                                    }
                                    if (journalActivity != null) {
                                        journalActivity.r0(2, this$0.B);
                                        return;
                                    }
                                    return;
                                }
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof JournalParentActivity) {
                                    journalParentActivity = (JournalParentActivity) requireActivity4;
                                }
                                if (journalParentActivity != null) {
                                    journalParentActivity.x0(2);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str9 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_back");
                                this$0.requireActivity().onBackPressed();
                                return;
                            default:
                                int i19 = u.E;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str10 = gk.a.f16573a;
                                gk.a.b(this$0.F(), "journal_learn_more_skip");
                                if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                    androidx.fragment.app.p requireActivity5 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                    ((JournalActivity) requireActivity5).p0(this$0.B);
                                    return;
                                }
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity6).q0();
                                return;
                        }
                    }
                });
                if (this.B) {
                    ((RobertoButton) _$_findCachedViewById(R.id.btnTLCarouselSkip)).setVisibility(0);
                    ((RobertoButton) _$_findCachedViewById(R.id.btnTLCarouselSkip)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.t

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ u f31744v;

                        {
                            this.f31744v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i11;
                            int i12;
                            int i13 = r2;
                            u this$0 = this.f31744v;
                            switch (i13) {
                                case 0:
                                    int i14 = u.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (this$0.f31748x) {
                                        String str6 = gk.a.f16573a;
                                        gk.a.b(this$0.F(), "journal_learn_more_previous_step");
                                        int i15 = this$0.f31747w;
                                        if (i15 > 0) {
                                            i11 = i15 - 1;
                                        } else {
                                            i11 = 0;
                                        }
                                        this$0.f31747w = i11;
                                        ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                        this$0.I();
                                        return;
                                    }
                                    return;
                                case 1:
                                    int i16 = u.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (this$0.f31748x) {
                                        String str7 = gk.a.f16573a;
                                        gk.a.b(this$0.F(), "journal_learn_more_next_step");
                                        if (this$0.f31747w < this$0.f31749y.size() - 1) {
                                            i12 = this$0.f31747w + 1;
                                        } else {
                                            i12 = this$0.f31747w;
                                        }
                                        this$0.f31747w = i12;
                                        ((RecyclerView) this$0._$_findCachedViewById(R.id.rvTLCarouselTips)).l0(this$0.f31747w);
                                        this$0.I();
                                        return;
                                    }
                                    return;
                                case 2:
                                    int i17 = u.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String str8 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_next_cta");
                                    JournalParentActivity journalParentActivity = null;
                                    JournalActivity journalActivity = null;
                                    if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                        if (requireActivity3 instanceof JournalActivity) {
                                            journalActivity = (JournalActivity) requireActivity3;
                                        }
                                        if (journalActivity != null) {
                                            journalActivity.r0(2, this$0.B);
                                            return;
                                        }
                                        return;
                                    }
                                    androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                    if (requireActivity4 instanceof JournalParentActivity) {
                                        journalParentActivity = (JournalParentActivity) requireActivity4;
                                    }
                                    if (journalParentActivity != null) {
                                        journalParentActivity.x0(2);
                                        return;
                                    }
                                    return;
                                case 3:
                                    int i18 = u.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String str9 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_back");
                                    this$0.requireActivity().onBackPressed();
                                    return;
                                default:
                                    int i19 = u.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String str10 = gk.a.f16573a;
                                    gk.a.b(this$0.F(), "journal_learn_more_skip");
                                    if (kotlin.jvm.internal.i.b(this$0.A, "journal_list")) {
                                        androidx.fragment.app.p requireActivity5 = this$0.requireActivity();
                                        kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                        ((JournalActivity) requireActivity5).p0(this$0.B);
                                        return;
                                    }
                                    androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                    ((JournalParentActivity) requireActivity6).q0();
                                    return;
                            }
                        }
                    });
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str5, e11);
        }
    }
}
