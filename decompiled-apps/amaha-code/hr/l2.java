package hr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult28FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/l2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l2 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f18725y = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18728w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f18729x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18726u = LogHelper.INSTANCE.makeLogTag(l2.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18727v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new d(this), new e(this), new f(this));

    /* compiled from: ScreenResult28FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18731v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f18731v = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                if (fVar2.f19465v != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i6 = l2.f18725y;
                l2.this.J(this.f18731v, z10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult28FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            l2 l2Var = l2.this;
            TemplateActivity templateActivity = l2Var.f18728w;
            if (templateActivity != null) {
                templateActivity.K0(false);
                androidx.fragment.app.p activity = l2Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
    }

    /* compiled from: ScreenResult28FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            l2 l2Var = l2.this;
            TemplateActivity templateActivity = l2Var.f18728w;
            if (templateActivity != null) {
                templateActivity.K0(false);
                androidx.fragment.app.p activity = l2Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18734u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18734u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18734u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18735u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18735u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18735u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18736u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f18736u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18736u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final void J(String str, boolean z10) {
        TemplateActivity templateActivity = this.f18728w;
        if (templateActivity != null) {
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s122")) {
                TemplateActivity templateActivity2 = this.f18728w;
                if (templateActivity2 != null) {
                    Object obj = templateActivity2.F.get("list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        View inflate = getLayoutInflater().inflate(R.layout.row_s28, (LinearLayout) _$_findCachedViewById(R.id.llR28List));
                        ((RobertoTextView) inflate.findViewById(R.id.tvLabel)).setText((String) it.next());
                        Context requireContext = requireContext();
                        Object obj2 = g0.a.f16164a;
                        ((ImageView) inflate.findViewById(R.id.imageView5)).setImageDrawable(a.c.b(requireContext, R.drawable.ic_check_orange_24dp));
                        ((LinearLayout) _$_findCachedViewById(R.id.llR28List)).addView(inflate);
                    }
                    TemplateActivity templateActivity3 = this.f18728w;
                    if (templateActivity3 != null) {
                        Object obj3 = templateActivity3.F.get("3u_model");
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult28Model");
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonTwo)).setOnClickListener(new zk.k(z10, (Object) this, str, (Serializable) ((ScreenResult28Model) obj3), 12));
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            ScreenResult28Model screenResult28Model = new ScreenResult28Model(Utils.INSTANCE.getTimeInSeconds());
            TemplateActivity templateActivity4 = this.f18728w;
            if (templateActivity4 != null) {
                Object obj4 = templateActivity4.F.get("list");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                screenResult28Model.setList((ArrayList) obj4);
                Iterator<String> it2 = screenResult28Model.getList().iterator();
                while (it2.hasNext()) {
                    View inflate2 = getLayoutInflater().inflate(R.layout.row_s28, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llR28List)), false);
                    ((RobertoTextView) inflate2.findViewById(R.id.tvLabel)).setText(it2.next());
                    Context requireContext2 = requireContext();
                    Object obj5 = g0.a.f16164a;
                    ((ImageView) inflate2.findViewById(R.id.imageView5)).setImageDrawable(a.c.b(requireContext2, R.drawable.ic_check_orange_24dp));
                    ((LinearLayout) _$_findCachedViewById(R.id.llR28List)).addView(inflate2);
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonTwo)).setOnClickListener(new k2(this, 2));
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18729x;
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
        return inflater.inflate(R.layout.fragment_screen_result_28, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18727v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18729x.clear();
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
            this.f18728w = templateActivity;
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR28Title)).setText(UtilFunKt.paramsMapToString(A0.get("r28_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR28Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r28_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR28Desc)).setText(UtilFunKt.paramsMapToString(A0.get("r28_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r28_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("r28_btn_two_text")));
            TemplateActivity templateActivity2 = this.f18728w;
            if (templateActivity2 != null) {
                TemplateModel templateModel = templateActivity2.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    TemplateActivity templateActivity3 = this.f18728w;
                    if (templateActivity3 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity3.B0(), "s122")) {
                            fm.a aVar = (fm.a) this.f18727v.getValue();
                            aVar.f15178l0.e(getViewLifecycleOwner(), new a2(5, new a(label)));
                            aVar.m(label, "result_28");
                        } else {
                            J(label, false);
                        }
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonOne)).setOnClickListener(new k2(this, 0));
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new k2(this, 1));
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18726u, "exception in on view created", e10);
        }
    }
}
