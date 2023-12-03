package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS31Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/h7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h7 extends rr.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18536u = LogHelper.INSTANCE.makeLogTag(h7.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18537v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* renamed from: w  reason: collision with root package name */
    public FirestoreGoal f18538w;

    /* renamed from: x  reason: collision with root package name */
    public Goal f18539x;

    /* renamed from: y  reason: collision with root package name */
    public TemplateActivity f18540y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f18541z;

    /* compiled from: ScreenS31Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
            if (((java.lang.Boolean) r3.f19464u).booleanValue() == true) goto L5;
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                z10 = true;
            }
            z10 = false;
            h7 h7Var = h7.this;
            if (z10) {
                h7Var.f18538w = (FirestoreGoal) fVar2.f19465v;
            }
            int i6 = h7.B;
            h7Var.J();
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS31Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<FirestoreGoal, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(FirestoreGoal firestoreGoal) {
            if (firestoreGoal != null) {
                androidx.fragment.app.p activity = h7.this.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18544u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18544u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18544u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18545u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18545u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18545u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18546u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18546u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18546u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:3:0x0002, B:6:0x0013, B:8:0x004c, B:10:0x0071, B:12:0x008b, B:14:0x0093, B:16:0x0097, B:18:0x00a2, B:22:0x00ab, B:24:0x00b2, B:28:0x00ba, B:42:0x0102, B:30:0x00bf, B:32:0x00c5, B:33:0x00cd, B:35:0x00d3, B:37:0x00e5, B:39:0x00f1, B:41:0x00f5, B:43:0x0134, B:44:0x0137, B:45:0x0138, B:46:0x013b, B:9:0x005e, B:47:0x013c, B:48:0x013f), top: B:52:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z10;
        try {
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
            TemplateActivity templateActivity = this.f18540y;
            if (templateActivity != null) {
                HashMap<String, Object> A0 = templateActivity.A0();
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("s31_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(A0.get("s31_description")));
                if (A0.containsKey("s31_switch_one_text")) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(A0.get("s31_switch_one_text")));
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(A0.get("s31_switch_text")));
                }
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setText(UtilFunKt.paramsMapToString(A0.get("s31_btn_text")));
                TemplateActivity templateActivity2 = this.f18540y;
                if (templateActivity2 != null) {
                    boolean z11 = true;
                    if (templateActivity2.W) {
                        if (this.f18538w != null) {
                            SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal);
                            FirestoreGoal firestoreGoal = this.f18538w;
                            if (firestoreGoal != null && firestoreGoal.isVisible()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            switchCompat.setChecked(z10);
                            FirestoreGoal firestoreGoal2 = this.f18538w;
                            if (firestoreGoal2 == null || !firestoreGoal2.isVisible()) {
                                z11 = false;
                            }
                            this.f18541z = z11;
                        }
                    } else if (templateActivity2 != null) {
                        Goal y02 = templateActivity2.y0();
                        if (y02 != null) {
                            Iterator<GamificationModel> it = y02.getGoalgamificationList().iterator();
                            while (it.hasNext()) {
                                GamificationModel next = it.next();
                                if (kotlin.jvm.internal.i.b(next.getTask(), Constants.GAMIFICATION_GOAL_UPDATION_TASK) || kotlin.jvm.internal.i.b(next.getTask(), Constants.GAMIFICATION_ADD_NEW_GOAL_TASK)) {
                                    uVar.f23466u = true;
                                    break;
                                }
                                while (it.hasNext()) {
                                }
                            }
                        }
                        if (y02 != null) {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setChecked(y02.isVisible());
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setOnCheckedChangeListener(new fl.m(this, 6, uVar2));
                    ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new o4(7, this, uVar2, uVar));
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new z0(this, 27));
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18536u, "exception in on view created", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
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
        return inflater.inflate(R.layout.fragment_screen_s31, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18537v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18540y = templateActivity;
            if (templateActivity.W) {
                fm.a aVar = (fm.a) this.f18537v.getValue();
                TemplateActivity templateActivity2 = this.f18540y;
                if (templateActivity2 != null) {
                    TemplateModel templateModel = templateActivity2.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        aVar.f15178l0.e(getViewLifecycleOwner(), new r3(19, new a()));
                        aVar.l(label);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            this.f18539x = templateActivity.y0();
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18536u, "exception in on view created", e10);
        }
    }
}
