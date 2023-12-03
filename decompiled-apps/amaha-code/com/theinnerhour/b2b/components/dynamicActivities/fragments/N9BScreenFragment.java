package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import cdflynn.android.library.turn.TurnLayoutManager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N9BScreenFragment;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.TurnLayoutCustomManager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.r;
import hs.j;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
/* compiled from: N9BScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N9BScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N9BScreenFragment extends rr.d {
    public static final /* synthetic */ int I = 0;
    public boolean D;

    /* renamed from: y  reason: collision with root package name */
    public w f11093y;

    /* renamed from: z  reason: collision with root package name */
    public int f11094z;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final m0 f11091w = b0.j(this, y.a(t.class), new d(this), new e(this), new f(this));

    /* renamed from: x  reason: collision with root package name */
    public final String f11092x = LogHelper.INSTANCE.makeLogTag("N9BScreenFragment");
    public String A = "";
    public int B = -1;
    public boolean C = true;
    public ArrayList<HashMap<String, Object>> E = new ArrayList<>();
    public hs.f<Integer, Integer> F = new hs.f<>(4, 0);
    public final a G = new a();

    /* compiled from: N9BScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                i.e(layoutManager, "null cannot be cast to non-null type cdflynn.android.library.turn.TurnLayoutManager");
                TurnLayoutManager turnLayoutManager = (TurnLayoutManager) layoutManager;
                N9BScreenFragment n9BScreenFragment = N9BScreenFragment.this;
                w wVar = n9BScreenFragment.f11093y;
                if (wVar != null) {
                    View d10 = wVar.d(turnLayoutManager);
                    if (d10 != null) {
                        int i10 = n9BScreenFragment.f11094z;
                        int position = turnLayoutManager.getPosition(d10);
                        n9BScreenFragment.f11094z = position;
                        if (i10 != position) {
                            n9BScreenFragment.P();
                            return;
                        }
                        return;
                    }
                    return;
                }
                i.q("snapper");
                throw null;
            }
        }
    }

    /* compiled from: N9BScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j<String, String, String> f11097b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11098c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11099d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11100e;
        public final /* synthetic */ ObjectAnimator f;

        public b(j<String, String, String> jVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4) {
            this.f11097b = jVar;
            this.f11098c = objectAnimator;
            this.f11099d = objectAnimator2;
            this.f11100e = objectAnimator3;
            this.f = objectAnimator4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            i.g(p02, "p0");
            N9BScreenFragment n9BScreenFragment = N9BScreenFragment.this;
            RobertoTextView robertoTextView = (RobertoTextView) n9BScreenFragment._$_findCachedViewById(R.id.tvN9BScreenCount);
            if (robertoTextView != null) {
                robertoTextView.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) n9BScreenFragment._$_findCachedViewById(R.id.tvN9BScreenTip);
            if (robertoTextView2 != null) {
                robertoTextView2.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) n9BScreenFragment._$_findCachedViewById(R.id.tvN9BScreenDescription);
            if (robertoTextView3 != null) {
                robertoTextView3.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) n9BScreenFragment._$_findCachedViewById(R.id.tvN9BScreenCount);
            j<String, String, String> jVar = this.f11097b;
            if (robertoTextView4 != null) {
                robertoTextView4.setText(jVar.f19473u);
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) n9BScreenFragment._$_findCachedViewById(R.id.tvN9BScreenTip);
            if (robertoTextView5 != null) {
                robertoTextView5.setText(jVar.f19474v);
            }
            RobertoTextView robertoTextView6 = (RobertoTextView) n9BScreenFragment._$_findCachedViewById(R.id.tvN9BScreenDescription);
            if (robertoTextView6 != null) {
                robertoTextView6.setText(jVar.f19475w);
            }
            ObjectAnimator objectAnimator = this.f11098c;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            ObjectAnimator objectAnimator2 = this.f11099d;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
            ObjectAnimator objectAnimator3 = this.f11100e;
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
            i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            i.g(p02, "p0");
        }
    }

    /* compiled from: N9BScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f11102b;

        public c(ObjectAnimator objectAnimator) {
            this.f11102b = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            NewDynamicParentActivity newDynamicParentActivity;
            i.g(p02, "p0");
            N9BScreenFragment n9BScreenFragment = N9BScreenFragment.this;
            n9BScreenFragment.C = true;
            ObjectAnimator objectAnimator = this.f11102b;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
            }
            if (n9BScreenFragment.f11094z == n9BScreenFragment.E.size() - 1 && !n9BScreenFragment.D) {
                n9BScreenFragment.D = true;
                p requireActivity = n9BScreenFragment.requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity = null;
                }
                if (newDynamicParentActivity != null) {
                    try {
                        ConstraintLayout constraintLayout = (ConstraintLayout) newDynamicParentActivity.u0(R.id.parentCtaContainer);
                        if (constraintLayout != null) {
                            constraintLayout.setAlpha(0.0f);
                            constraintLayout.setVisibility(0);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, "alpha", 0.0f, 1.0f);
                            ofFloat.setDuration(500L);
                            ofFloat.setStartDelay(600L);
                            ofFloat.start();
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(newDynamicParentActivity.f10901w, e10);
                    }
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            i.g(p02, "p0");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11103u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11103u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f11103u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11104u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f11104u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11104u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11105u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f11105u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11105u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.d
    public final void K() {
        NewDynamicParentActivity newDynamicParentActivity;
        try {
            if (this.D) {
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity = null;
                }
                if (newDynamicParentActivity != null) {
                    int i6 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11092x, e10);
        }
    }

    public final void P() {
        Integer num;
        try {
            Q();
            int i6 = this.f11094z;
            if (i6 == 0) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenPrevious);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(4);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenNext);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
            } else if (i6 == this.E.size() - 1) {
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenPrevious);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(0);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenNext);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(4);
                }
            } else {
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenPrevious);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setVisibility(0);
                }
                AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenNext);
                if (appCompatImageView6 != null) {
                    appCompatImageView6.setVisibility(0);
                }
            }
            AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenPrevious);
            Integer num2 = null;
            if (appCompatImageView7 != null) {
                num = Integer.valueOf(appCompatImageView7.getVisibility());
            } else {
                num = null;
            }
            AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenNext);
            if (appCompatImageView8 != null) {
                num2 = Integer.valueOf(appCompatImageView8.getVisibility());
            }
            this.F = new hs.f<>(num, num2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11092x, e10);
        }
    }

    public final void Q() {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        try {
            this.C = false;
            HashMap hashMap = (HashMap) u.j2(this.f11094z, this.E);
            String str3 = null;
            if (hashMap != null) {
                obj = hashMap.get("progress_text");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap hashMap2 = (HashMap) u.j2(this.f11094z, this.E);
            if (hashMap2 != null) {
                obj2 = hashMap2.get("title");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            HashMap hashMap3 = (HashMap) u.j2(this.f11094z, this.E);
            if (hashMap3 != null) {
                obj3 = hashMap3.get("description");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            }
            j jVar = new j(str, str2, str3);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenCount), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenTip), "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(250L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenDescription), "alpha", 1.0f, 0.0f);
            ofFloat3.setDuration(250L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenCount), "alpha", 0.0f, 1.0f);
            ofFloat4.setDuration(250L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenTip), "alpha", 0.0f, 1.0f);
            ofFloat5.setDuration(250L);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenDescription), "alpha", 0.0f, 1.0f);
            ofFloat6.setDuration(250L);
            ofFloat.addListener(new b(jVar, ofFloat4, ofFloat5, ofFloat6, ofFloat));
            ofFloat4.addListener(new c(ofFloat4));
            ofFloat.start();
            ofFloat2.start();
            ofFloat3.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11092x, e10);
        }
    }

    public final void S(HashMap<String, Object> hashMap) {
        Object obj;
        String str;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        int i6;
        Integer w02;
        Integer w03;
        Object obj2;
        String str2;
        NewDynamicParentActivity newDynamicParentActivity3 = null;
        if (hashMap != null) {
            try {
                obj = hashMap.get(Constants.SCREEN_PROGRESS);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11092x, "exception", e10);
                return;
            }
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            if (hashMap != null) {
                obj2 = hashMap.get("heading");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            newDynamicParentActivity.I0(str2);
        }
        if (str != null) {
            int i10 = 0;
            List a12 = r.a1(str, new String[]{"/"}, 0, 6);
            String str3 = (String) u.j2(0, a12);
            String str4 = (String) u.j2(1, a12);
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                newDynamicParentActivity2.M0();
            }
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
            }
            if (newDynamicParentActivity3 != null) {
                if (str3 != null && (w03 = m.w0(str3)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = 0;
                }
                if (str4 != null && (w02 = m.w0(str4)) != null) {
                    i10 = w02.intValue();
                }
                newDynamicParentActivity3.G0(i6, i10);
                return;
            }
            return;
        }
        p requireActivity4 = requireActivity();
        if (requireActivity4 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity4;
        }
        if (newDynamicParentActivity3 != null) {
            newDynamicParentActivity3.y0();
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.H.clear();
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n9_b_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i6;
        int i10;
        int i11;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        ArrayList<HashMap<String, Object>> arrayList;
        String str2;
        Integer num;
        Object obj;
        String str3;
        Object obj2;
        String str4;
        Object obj3;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        String str9;
        NewDynamicParentActivity newDynamicParentActivity3;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.E = new ArrayList<>();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvN9BScreen);
        a aVar = this.G;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
            recyclerView.c0(aVar);
            recyclerView.setLayoutManager(null);
        }
        try {
            if (!this.D) {
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity3 = null;
                }
                if (newDynamicParentActivity3 != null) {
                    newDynamicParentActivity3.x0();
                }
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("slug");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.A = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                i6 = arguments2.getInt(Constants.DAYMODEL_POSITION);
            } else {
                i6 = -1;
            }
            this.B = i6;
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenPrevious);
            if (appCompatImageView != null) {
                Integer num2 = this.F.f19464u;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = 0;
                }
                appCompatImageView.setVisibility(i10);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenNext);
            if (appCompatImageView2 != null) {
                Integer num3 = this.F.f19465v;
                if (num3 != null) {
                    i11 = num3.intValue();
                } else {
                    i11 = 0;
                }
                appCompatImageView2.setVisibility(i11);
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity = null;
            }
            m0 m0Var = this.f11091w;
            if (newDynamicParentActivity != null) {
                Object k10 = ((t) m0Var.getValue()).k(this.B, this.A, "cta");
                if (k10 instanceof String) {
                    str9 = (String) k10;
                } else {
                    str9 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str9, null, null, null, 14);
            }
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    bool = Boolean.valueOf(arguments3.getBoolean("show_info_button"));
                } else {
                    bool = null;
                }
                newDynamicParentActivity2.O0(bool);
            }
            w wVar = new w();
            this.f11093y = wVar;
            wVar.a((RecyclerView) _$_findCachedViewById(R.id.rvN9BScreen));
            p requireActivity4 = requireActivity();
            i.f(requireActivity4, "requireActivity()");
            ((RecyclerView) _$_findCachedViewById(R.id.rvN9BScreen)).setLayoutManager(new TurnLayoutCustomManager(requireActivity4, 8388613, 0, 5000, 0, true));
            Object k11 = ((t) m0Var.getValue()).k(this.B, this.A, "items");
            if (k11 instanceof ArrayList) {
                arrayList = (ArrayList) k11;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.E = arrayList;
            t tVar = (t) m0Var.getValue();
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                str2 = arguments4.getString("slug");
            } else {
                str2 = null;
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                num = Integer.valueOf(arguments5.getInt(Constants.DAYMODEL_POSITION));
            } else {
                num = null;
            }
            HashMap m10 = tVar.m(num, str2);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvTaExperimentTitle);
            if (robertoTextView != null) {
                if (m10 != null) {
                    obj = m10.get("question");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str3 = (String) obj;
                } else {
                    str3 = null;
                }
                robertoTextView.setText(str3);
            }
            S(m10);
            if (this.E.size() > 0) {
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvN9BScreen);
                ArrayList<HashMap<String, Object>> arrayList2 = this.E;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object obj4 = ((HashMap) it.next()).get("image");
                    if (obj4 instanceof String) {
                        str8 = (String) obj4;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        arrayList3.add(str8);
                    }
                }
                p requireActivity5 = requireActivity();
                i.f(requireActivity5, "requireActivity()");
                recyclerView2.setAdapter(new ol.r(requireActivity5, arrayList3));
                if (!this.D) {
                    ((RecyclerView) _$_findCachedViewById(R.id.rvN9BScreen)).k0(15, 0, false);
                }
                ((RecyclerView) _$_findCachedViewById(R.id.rvN9BScreen)).i(aVar);
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenCount);
                HashMap hashMap = (HashMap) u.j2(this.f11094z, this.E);
                if (hashMap != null) {
                    obj2 = hashMap.get("progress_text");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str4 = (String) obj2;
                } else {
                    str4 = null;
                }
                robertoTextView2.setText(str4);
                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenTip);
                HashMap hashMap2 = (HashMap) u.j2(this.f11094z, this.E);
                if (hashMap2 != null) {
                    obj3 = hashMap2.get("title");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof String) {
                    str5 = (String) obj3;
                } else {
                    str5 = null;
                }
                robertoTextView3.setText(str5);
                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN9BScreenDescription);
                HashMap hashMap3 = (HashMap) u.j2(this.f11094z, this.E);
                if (hashMap3 != null) {
                    str6 = hashMap3.get("description");
                } else {
                    str6 = null;
                }
                if (str6 instanceof String) {
                    str7 = str6;
                } else {
                    str7 = null;
                }
                robertoTextView4.setText(str7);
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenPrevious)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.x0

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N9BScreenFragment f28668v;

                    {
                        this.f28668v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i12;
                        int i13;
                        int i14 = r2;
                        N9BScreenFragment this$0 = this.f28668v;
                        switch (i14) {
                            case 0:
                                int i15 = N9BScreenFragment.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.C) {
                                    int i16 = this$0.f11094z;
                                    if (i16 > 0) {
                                        i13 = i16 - 1;
                                    } else {
                                        i13 = 0;
                                    }
                                    this$0.f11094z = i13;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvN9BScreen)).l0(this$0.f11094z);
                                    this$0.P();
                                    return;
                                }
                                return;
                            default:
                                int i17 = N9BScreenFragment.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.C) {
                                    if (this$0.f11094z < this$0.E.size() - 1) {
                                        i12 = this$0.f11094z + 1;
                                    } else {
                                        i12 = this$0.f11094z;
                                    }
                                    this$0.f11094z = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvN9BScreen)).l0(this$0.f11094z);
                                    this$0.P();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN9BScreenNext)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.x0

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N9BScreenFragment f28668v;

                    {
                        this.f28668v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i12;
                        int i13;
                        int i14 = r2;
                        N9BScreenFragment this$0 = this.f28668v;
                        switch (i14) {
                            case 0:
                                int i15 = N9BScreenFragment.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.C) {
                                    int i16 = this$0.f11094z;
                                    if (i16 > 0) {
                                        i13 = i16 - 1;
                                    } else {
                                        i13 = 0;
                                    }
                                    this$0.f11094z = i13;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvN9BScreen)).l0(this$0.f11094z);
                                    this$0.P();
                                    return;
                                }
                                return;
                            default:
                                int i17 = N9BScreenFragment.I;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.C) {
                                    if (this$0.f11094z < this$0.E.size() - 1) {
                                        i12 = this$0.f11094z + 1;
                                    } else {
                                        i12 = this$0.f11094z;
                                    }
                                    this$0.f11094z = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvN9BScreen)).l0(this$0.f11094z);
                                    this$0.P();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11092x, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
