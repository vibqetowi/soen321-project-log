package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult17Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScreenResult17FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/w0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w0 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19314y = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f19317w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f19318x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19315u = LogHelper.INSTANCE.makeLogTag(w0.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f19316v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult17FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f19320v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f19321w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ArrayList<String>> f19322x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, kotlin.jvm.internal.x xVar) {
            super(1);
            this.f19320v = aVar;
            this.f19321w = str;
            this.f19322x = xVar;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.ArrayList] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                boolean z10 = false;
                String str = this.f19321w;
                w0 w0Var = w0.this;
                B b10 = fVar2.f19465v;
                if (b10 != 0 && kotlin.jvm.internal.i.b(((FirestoreGoal) b10).getDataTypeKey(), "list_result_17")) {
                    int i6 = w0.f19314y;
                    w0Var.getClass();
                    this.f19320v.o(str, false);
                } else {
                    ?? arrayList = new ArrayList();
                    this.f19322x.f23469u = arrayList;
                    if (b10 != 0) {
                        z10 = true;
                    }
                    w0.J(w0Var, str, z10, arrayList);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult17FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ArrayList<String>> f19323u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ w0 f19324v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f19325w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.x<ArrayList<String>> xVar, w0 w0Var, String str) {
            super(1);
            this.f19323u = xVar;
            this.f19324v = w0Var;
            this.f19325w = str;
        }

        /* JADX WARN: Type inference failed for: r5v7, types: [T, java.util.ArrayList] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            if (fVar2 != null && ((Boolean) fVar2.f19464u).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                B b10 = fVar2.f19465v;
                kotlin.jvm.internal.i.d(b10);
                ScreenResult17Model result17MapToObject = UtilFunKt.result17MapToObject((HashMap) b10);
                ?? k10 = ca.a.k(result17MapToObject.getText1(), result17MapToObject.getText2(), result17MapToObject.getText3());
                this.f19323u.f23469u = k10;
                w0.J(this.f19324v, this.f19325w, true, k10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19326u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19326u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19326u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19327u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19327u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19327u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19328u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f19328u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19328u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x009b, code lost:
        if (((com.theinnerhour.b2b.activity.TemplateActivity) r0).I != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(w0 w0Var, String str, boolean z10, ArrayList arrayList) {
        TemplateActivity templateActivity = w0Var.f19317w;
        if (templateActivity != null) {
            HashMap<String, Object> A0 = templateActivity.A0();
            Object obj = A0.get("text1");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = arrayList.get(0);
            kotlin.jvm.internal.i.f(obj2, "list[0]");
            ((TextView) w0Var._$_findCachedViewById(R.id.textView1)).setText(gv.n.F0((String) obj, "%replace%", (String) obj2));
            Object obj3 = A0.get("text2");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = arrayList.get(1);
            kotlin.jvm.internal.i.f(obj4, "list[1]");
            ((TextView) w0Var._$_findCachedViewById(R.id.textView2)).setText(gv.n.F0((String) obj3, "%replace%", (String) obj4));
            Object obj5 = A0.get("text3");
            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
            Object obj6 = arrayList.get(2);
            kotlin.jvm.internal.i.f(obj6, "list[2]");
            ((TextView) w0Var._$_findCachedViewById(R.id.textView3)).setText(gv.n.F0((String) obj5, "%replace%", (String) obj6));
            androidx.fragment.app.p activity = w0Var.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (!((TemplateActivity) activity).J) {
                androidx.fragment.app.p activity2 = w0Var.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            }
            androidx.fragment.app.p activity3 = w0Var.getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity3).F.put("list", arrayList);
            ((Button) w0Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new zk.k(z10, (rr.b) w0Var, (List) arrayList, str, 7));
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19318x;
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
        return inflater.inflate(R.layout.fragment_screen_result_17, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f19316v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19318x.clear();
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f19317w = (TemplateActivity) activity;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            TemplateActivity templateActivity = this.f19317w;
            if (templateActivity != null) {
                Object obj = templateActivity.F.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                xVar.f23469u = (ArrayList) obj;
                ((Button) _$_findCachedViewById(R.id.button1)).setOnClickListener(new qq.n(this, 28));
                TemplateActivity templateActivity2 = this.f19317w;
                if (templateActivity2 != null) {
                    TemplateModel templateModel = templateActivity2.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        fm.a aVar = (fm.a) this.f19316v.getValue();
                        aVar.f15178l0.e(getViewLifecycleOwner(), new m0(7, new a(aVar, label, xVar)));
                        aVar.f15181o0.e(getViewLifecycleOwner(), new m0(8, new b(xVar, this, label)));
                        aVar.m(label, "list_result_17");
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19315u, "Exception in view created", e10);
        }
    }
}
