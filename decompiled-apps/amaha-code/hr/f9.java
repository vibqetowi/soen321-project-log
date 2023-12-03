package hr;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult23Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoCheckBox;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS84Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/f9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f9 extends rr.b {
    public static final /* synthetic */ int C = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18399w;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18397u = LogHelper.INSTANCE.makeLogTag(f9.class);

    /* renamed from: v  reason: collision with root package name */
    public final HashSet<String> f18398v = new HashSet<>();

    /* renamed from: x  reason: collision with root package name */
    public final long f18400x = 1;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<ScreenResult23Model> f18401y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18402z = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new f(this), new g(this), new h(this));
    public final String A = "result_23";

    /* compiled from: ScreenS84Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ScreenResult23Model f18404v;

        public a(ScreenResult23Model screenResult23Model) {
            this.f18404v = screenResult23Model;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            long j10;
            f9 f9Var = f9.this;
            ArrayList<ScreenResult23Model> arrayList = f9Var.f18401y;
            ScreenResult23Model screenResult23Model = arrayList.get(arrayList.indexOf(this.f18404v));
            if (z10) {
                j10 = f9Var.f18400x;
            } else {
                j10 = 0;
            }
            screenResult23Model.setState(j10);
        }
    }

    /* compiled from: ScreenS84Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ArrayList<ScreenResult23Model> f18405u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ScreenResult23Model f18406v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f9 f18407w;

        public b(ArrayList<ScreenResult23Model> arrayList, ScreenResult23Model screenResult23Model, f9 f9Var) {
            this.f18405u = arrayList;
            this.f18406v = screenResult23Model;
            this.f18407w = f9Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            long j10;
            ArrayList<ScreenResult23Model> arrayList = this.f18405u;
            ScreenResult23Model screenResult23Model = arrayList.get(arrayList.indexOf(this.f18406v));
            f9 f9Var = this.f18407w;
            if (z10) {
                j10 = f9Var.f18400x;
            } else {
                int i6 = f9.C;
                f9Var.getClass();
                j10 = 0;
            }
            screenResult23Model.setState(j10);
        }
    }

    /* compiled from: ScreenS84Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {
        public c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
            if (((java.lang.Boolean) r12.f19464u).booleanValue() == true) goto L5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [is.w] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            boolean z10;
            Object obj;
            ArrayList arrayList;
            ?? r12;
            Long l2;
            String str;
            Long l10;
            ScreenResult23Model screenResult23Model;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            if (fVar2 != null) {
                z10 = true;
            }
            z10 = false;
            if (z10) {
                HashMap hashMap = (HashMap) fVar2.f19465v;
                if (hashMap != null) {
                    obj = hashMap.get("list");
                } else {
                    obj = null;
                }
                if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    r12 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (obj2 instanceof HashMap) {
                            r12.add(obj2);
                        }
                    }
                } else {
                    r12 = is.w.f20676u;
                }
                ArrayList arrayList2 = new ArrayList((Collection) r12);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    HashMap hashMap2 = (HashMap) it.next();
                    Object obj3 = hashMap2.get("date");
                    if (obj3 instanceof Long) {
                        l2 = (Long) obj3;
                    } else {
                        l2 = null;
                    }
                    Object obj4 = hashMap2.get("task");
                    if (obj4 instanceof String) {
                        str = (String) obj4;
                    } else {
                        str = null;
                    }
                    Object obj5 = hashMap2.get("state");
                    if (obj5 instanceof Long) {
                        l10 = (Long) obj5;
                    } else {
                        l10 = null;
                    }
                    if (l2 != null && str != null && l10 != null) {
                        screenResult23Model = new ScreenResult23Model(l2.longValue(), str, l10.longValue());
                    } else {
                        screenResult23Model = null;
                    }
                    if (screenResult23Model != null) {
                        arrayList3.add(screenResult23Model);
                    }
                }
                ArrayList<ScreenResult23Model> arrayList4 = new ArrayList<>(arrayList3);
                f9 f9Var = f9.this;
                f9Var.getClass();
                f9Var.f18401y = arrayList4;
                f9Var.U(arrayList4);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS84Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool != null) {
                f9 f9Var = f9.this;
                if (f9Var.P().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(f9Var.P().getIntent().getStringExtra("source"), "goals")) {
                    f9Var.P().n0();
                } else {
                    f9Var.P().t0();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18411u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f18411u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18411u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18412u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f18412u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18412u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18413u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f18413u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18413u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* compiled from: ScreenS84Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool != null) {
                f9.this.P().n0();
            }
            return hs.k.f19476a;
        }
    }

    @Override // rr.b
    public final boolean I() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.etS84Edit)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.etS84Edit)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_screen_s84, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        return true;
    }

    public final void J(String str) {
        try {
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.row_textview_image, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS84List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            ((RobertoTextView) constraintLayout.findViewById(R.id.tvLabel)).setText(str);
            constraintLayout.setOnClickListener(new e9(this, constraintLayout, 1));
            ((LinearLayout) _$_findCachedViewById(R.id.llS84List)).addView(constraintLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18397u, "exception in add RadioButton", e10);
        }
    }

    public final void K(String str) {
        HashSet<String> hashSet = this.f18398v;
        try {
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                if (P().Q) {
                    M(str);
                } else {
                    J(str);
                }
                ((ScrollView) _$_findCachedViewById(R.id.scrollview)).postDelayed(new e8(2, this), 500L);
            } else {
                I();
                Utils.INSTANCE.showCustomToast(requireActivity(), "Item Already Exists");
            }
            S();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18397u, "exception", e10);
        }
    }

    public final void M(String str) {
        ScreenResult23Model screenResult23Model = new ScreenResult23Model(Utils.INSTANCE.getTimeInSeconds(), str, 0L);
        this.f18401y.add(screenResult23Model);
        boolean z10 = false;
        View inflate = requireActivity().getLayoutInflater().inflate(R.layout.row_textview_image, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS84List)), false);
        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        ((RobertoTextView) constraintLayout.findViewById(R.id.tvLabel)).setText(screenResult23Model.getTask());
        constraintLayout.setOnClickListener(new e9(this, constraintLayout, 2));
        ((RobertoCheckBox) constraintLayout.findViewById(R.id.taskCheckBox)).setVisibility(0);
        RobertoCheckBox robertoCheckBox = (RobertoCheckBox) constraintLayout.findViewById(R.id.taskCheckBox);
        if (screenResult23Model.getState() == this.f18400x) {
            z10 = true;
        }
        robertoCheckBox.setChecked(z10);
        ((RobertoCheckBox) constraintLayout.findViewById(R.id.taskCheckBox)).setOnCheckedChangeListener(new a(screenResult23Model));
        ((LinearLayout) _$_findCachedViewById(R.id.llS84List)).addView(constraintLayout);
    }

    public final void O(ConstraintLayout constraintLayout) {
        try {
            if (isAdded()) {
                String obj = ((RobertoTextView) constraintLayout.findViewById(R.id.tvLabel)).getText().toString();
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.layout_popup_todo, getActivity(), R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                kotlin.jvm.internal.i.d(window);
                window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                RobertoEditText robertoEditText = (RobertoEditText) styledDialog.findViewById(R.id.todoEditText);
                robertoEditText.setText(obj);
                ((RobertoTextView) styledDialog.findViewById(R.id.btnPositive)).setOnClickListener(new ek.p(this, robertoEditText, obj, constraintLayout, styledDialog, 15));
                ((RobertoTextView) styledDialog.findViewById(R.id.btnNegative)).setOnClickListener(new nq.n(styledDialog, 24));
                ((AppCompatImageView) styledDialog.findViewById(R.id.removeTodo)).setOnClickListener(new tk.q(this, obj, constraintLayout, styledDialog));
                styledDialog.create();
                styledDialog.show();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18397u, "Exception", e10);
        }
    }

    public final TemplateActivity P() {
        TemplateActivity templateActivity = this.f18399w;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final fm.a Q() {
        return (fm.a) this.f18402z.getValue();
    }

    public final void S() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.etS84Edit)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            RobertoEditText etS84Edit = (RobertoEditText) _$_findCachedViewById(R.id.etS84Edit);
            kotlin.jvm.internal.i.f(etS84Edit, "etS84Edit");
            ((TemplateActivity) activity).D0(requireContext, etS84Edit);
        }
    }

    public final void U(ArrayList<ScreenResult23Model> arrayList) {
        for (ScreenResult23Model screenResult23Model : arrayList) {
            boolean z10 = false;
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.row_textview_image, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS84List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            ((RobertoTextView) constraintLayout.findViewById(R.id.tvLabel)).setText(screenResult23Model.getTask());
            constraintLayout.setOnClickListener(new e9(this, constraintLayout, 0));
            ((RobertoCheckBox) constraintLayout.findViewById(R.id.taskCheckBox)).setVisibility(0);
            RobertoCheckBox robertoCheckBox = (RobertoCheckBox) constraintLayout.findViewById(R.id.taskCheckBox);
            if (screenResult23Model.getState() == this.f18400x) {
                z10 = true;
            }
            robertoCheckBox.setChecked(z10);
            ((RobertoCheckBox) constraintLayout.findViewById(R.id.taskCheckBox)).setOnCheckedChangeListener(new b(arrayList, screenResult23Model, this));
            ((LinearLayout) _$_findCachedViewById(R.id.llS84List)).addView(constraintLayout);
        }
    }

    public final void X() {
        HashMap<String, Object> data;
        String label;
        try {
            boolean z10 = P().W;
            HashSet<String> hashSet = this.f18398v;
            if (z10) {
                HashSet hashSet2 = new HashSet();
                for (ScreenResult23Model screenResult23Model : this.f18401y) {
                    hashSet2.add(screenResult23Model.getTask());
                }
                Iterator<String> it = hashSet.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!hashSet2.contains(next)) {
                        this.f18401y.add(new ScreenResult23Model(Calendar.getInstance().getTimeInMillis() / 1000, next, 0L));
                    }
                }
                fm.a Q = Q();
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateModel templateModel = ((TemplateActivity) activity).f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("list", this.f18401y);
                    hs.k kVar = hs.k.f19476a;
                    Q.getClass();
                    ta.v.H(kc.f.H(Q), null, 0, new fm.a0(Q, label, hashMap, null), 3);
                    Q.f15176j0.e(getViewLifecycleOwner(), new r3(28, new i()));
                    return;
                }
                return;
            }
            Goal y02 = P().y0();
            String str = this.A;
            if (y02 != null && y02.getData().containsKey(str)) {
                y02.getData().put(str, new ArrayList());
            }
            HashSet hashSet3 = new HashSet();
            for (ScreenResult23Model screenResult23Model2 : this.f18401y) {
                hashSet3.add(screenResult23Model2.getTask());
            }
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (!hashSet3.contains(next2)) {
                    this.f18401y.add(new ScreenResult23Model(Calendar.getInstance().getTimeInMillis() / 1000, next2, 0L));
                }
            }
            if (y02 != null && (data = y02.getData()) != null) {
                data.put(str, this.f18401y);
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            P().n0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18397u, "Error updating To-do List", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_screen_s84, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a Q = Q();
        Q.f15174h0.k(getViewLifecycleOwner());
        Q.f15177k0.k(getViewLifecycleOwner());
        Q.f15178l0.k(getViewLifecycleOwner());
        Q.f15180n0.k(getViewLifecycleOwner());
        Q.f15181o0.k(getViewLifecycleOwner());
        Q.f15182p0.k(getViewLifecycleOwner());
        Q.w();
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        String label2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18399w = (TemplateActivity) activity;
            HashMap<String, Object> A0 = P().A0();
            P().B0();
            boolean z10 = P().W;
            String str = this.A;
            if (z10) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateModel templateModel = ((TemplateActivity) activity2).f10547y;
                if (templateModel != null && (label2 = templateModel.getLabel()) != null) {
                    Q().m(label2, str);
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS84Header)).setText(UtilFunKt.paramsMapToString(A0.get("s84_heading")));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS84Edit)).setHint(UtilFunKt.paramsMapToString(A0.get("s84_placeholder")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS84Button)).setText(UtilFunKt.paramsMapToString(A0.get("s84_btn_text")));
            boolean z11 = P().J;
            HashSet<String> hashSet = this.f18398v;
            if (z11 && P().F.containsKey("S84_user_list")) {
                Object obj = P().F.get("S84_user_list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                hashSet.addAll((ArrayList) obj);
            }
            if (P().Q) {
                if (P().W) {
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateModel templateModel2 = ((TemplateActivity) activity3).f10547y;
                    if (templateModel2 != null && (label = templateModel2.getLabel()) != null) {
                        fm.a Q = Q();
                        Q.f15181o0.e(getViewLifecycleOwner(), new r3(26, new c()));
                        Q.o(label, true);
                    }
                } else {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y02 = ((TemplateActivity) activity4).y0();
                    kotlin.jvm.internal.i.d(y02);
                    if (!y02.getData().containsKey(str)) {
                        y02.getData().put(str, new ArrayList());
                    }
                    ArrayList<ScreenResult23Model> result23MapToObject = UtilFunKt.result23MapToObject(y02.getData().get(str));
                    this.f18401y = result23MapToObject;
                    U(result23MapToObject);
                }
            }
            for (String str2 : hashSet) {
                J(str2);
            }
            ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.c9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f9 f18265v;

                {
                    this.f18265v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z12;
                    int i6 = r2;
                    f9 this$0 = this.f18265v;
                    switch (i6) {
                        case 0:
                            int i10 = f9.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etS84Edit)).getText());
                            if (valueOf.length() == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            }
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etS84Edit)).setText("");
                            this$0.K(valueOf);
                            return;
                        default:
                            int i11 = f9.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P().onBackPressed();
                            return;
                    }
                }
            });
            ((RobertoEditText) _$_findCachedViewById(R.id.etS84Edit)).addTextChangedListener(new d());
            ((RobertoEditText) _$_findCachedViewById(R.id.etS84Edit)).setOnFocusChangeListener(new dc.b(15, this));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS84Edit)).setOnEditorActionListener(new dl.w(16, this));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS84Button)).setOnClickListener(new d9(this, 0, A0));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            if (P().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(P().getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.c9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f9 f18265v;

                {
                    this.f18265v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z12;
                    int i6 = r2;
                    f9 this$0 = this.f18265v;
                    switch (i6) {
                        case 0:
                            int i10 = f9.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etS84Edit)).getText());
                            if (valueOf.length() == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            }
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etS84Edit)).setText("");
                            this$0.K(valueOf);
                            return;
                        default:
                            int i11 = f9.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P().onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18397u, "Exception in on view created", e10);
        }
    }

    /* compiled from: ScreenS84Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            f9 f9Var = f9.this;
            if (String.valueOf(((RobertoEditText) f9Var._$_findCachedViewById(R.id.etS84Edit)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) f9Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) f9Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(((RobertoEditText) f9Var._$_findCachedViewById(R.id.etS84Edit)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) f9Var._$_findCachedViewById(R.id.llSearch)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) f9Var._$_findCachedViewById(R.id.llSearch)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(f9Var.f18397u, "exception", e10);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
