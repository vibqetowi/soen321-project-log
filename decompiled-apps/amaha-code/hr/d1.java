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
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ScreenResult19FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/d1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d1 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f18278y = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f18281w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f18282x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18279u = LogHelper.INSTANCE.makeLogTag(d1.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18280v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult19FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18284v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18285w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ArrayList<String>> f18286x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, kotlin.jvm.internal.x xVar) {
            super(1);
            this.f18284v = aVar;
            this.f18285w = str;
            this.f18286x = xVar;
        }

        /* JADX WARN: Type inference failed for: r8v8, types: [T, java.util.ArrayList] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            String str;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                d1 d1Var = d1.this;
                androidx.fragment.app.p activity = d1Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                boolean z10 = ((TemplateActivity) activity).J;
                boolean z11 = true;
                String str2 = this.f18285w;
                kotlin.jvm.internal.x<ArrayList<String>> xVar = this.f18286x;
                B b10 = fVar2.f19465v;
                if (!z10) {
                    androidx.fragment.app.p activity2 = d1Var.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (!((TemplateActivity) activity2).I) {
                        ArrayList<String> arrayList = xVar.f23469u;
                        if (b10 == 0) {
                            z11 = false;
                        }
                        d1.J(d1Var, arrayList, z11, str2);
                    }
                }
                FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                if (firestoreGoal != null) {
                    str = firestoreGoal.getDataTypeKey();
                } else {
                    str = null;
                }
                if (kotlin.jvm.internal.i.b(str, "list_result_19")) {
                    this.f18284v.o(str2, false);
                    d1Var.f18281w = true;
                } else {
                    xVar.f23469u = new ArrayList();
                    androidx.fragment.app.p activity3 = d1Var.getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity3).F.put("list", xVar.f23469u);
                    d1.J(d1Var, xVar.f23469u, false, str2);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult19FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ArrayList<String>> f18288v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18289w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.x<ArrayList<String>> xVar, String str) {
            super(1);
            this.f18288v = xVar;
            this.f18289w = str;
        }

        /* JADX WARN: Type inference failed for: r9v12, types: [T, java.util.ArrayList] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            HashMap hashMap;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            d1 d1Var = d1.this;
            if (d1Var.f18281w) {
                String str7 = null;
                if (fVar2 != null) {
                    hashMap = (HashMap) fVar2.f19465v;
                } else {
                    hashMap = null;
                }
                if (hashMap != null) {
                    d1Var.f18281w = false;
                    B b10 = fVar2.f19465v;
                    kotlin.jvm.internal.i.d(b10);
                    Set keySet = ((HashMap) b10).keySet();
                    kotlin.jvm.internal.i.f(keySet, "it.second!!.keys");
                    boolean z10 = !keySet.isEmpty();
                    kotlin.jvm.internal.x<ArrayList<String>> xVar = this.f18288v;
                    if (z10) {
                        String[] strArr = new String[7];
                        B b11 = fVar2.f19465v;
                        kotlin.jvm.internal.i.d(b11);
                        HashMap hashMap2 = (HashMap) b11;
                        Object obj = hashMap2.get("text1");
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        String str8 = "";
                        if (str == null) {
                            str = "";
                        }
                        strArr[0] = str;
                        Object obj2 = hashMap2.get("text2");
                        if (obj2 instanceof String) {
                            str2 = (String) obj2;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        strArr[1] = str2;
                        Object obj3 = hashMap2.get("text3");
                        if (obj3 instanceof String) {
                            str3 = (String) obj3;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        strArr[2] = str3;
                        Object obj4 = hashMap2.get("text4");
                        if (obj4 instanceof String) {
                            str4 = (String) obj4;
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "";
                        }
                        strArr[3] = str4;
                        Object obj5 = hashMap2.get("text5");
                        if (obj5 instanceof String) {
                            str5 = (String) obj5;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        strArr[4] = str5;
                        Object obj6 = hashMap2.get("text6");
                        if (obj6 instanceof String) {
                            str6 = (String) obj6;
                        } else {
                            str6 = null;
                        }
                        if (str6 == null) {
                            str6 = "";
                        }
                        strArr[5] = str6;
                        Object obj7 = hashMap2.get("text7");
                        if (obj7 instanceof String) {
                            str7 = (String) obj7;
                        }
                        if (str7 != null) {
                            str8 = str7;
                        }
                        strArr[6] = str8;
                        xVar.f23469u = ca.a.k(strArr);
                    }
                    androidx.fragment.app.p activity = d1Var.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity).F.put("list", xVar.f23469u);
                    d1.J(d1Var, xVar.f23469u, true, this.f18289w);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18290u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18290u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18290u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18291u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18291u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18291u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18292u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18292u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18292u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(d1 d1Var, ArrayList arrayList, boolean z10, String str) {
        ((TextView) d1Var._$_findCachedViewById(R.id.result1)).setText((CharSequence) arrayList.get(0));
        ((TextView) d1Var._$_findCachedViewById(R.id.result2)).setText((CharSequence) arrayList.get(1));
        ((TextView) d1Var._$_findCachedViewById(R.id.result3)).setText((CharSequence) arrayList.get(2));
        ((TextView) d1Var._$_findCachedViewById(R.id.result4)).setText((CharSequence) arrayList.get(3));
        ((TextView) d1Var._$_findCachedViewById(R.id.result5)).setText((CharSequence) arrayList.get(4));
        ((TextView) d1Var._$_findCachedViewById(R.id.result6)).setText((CharSequence) arrayList.get(5));
        ((TextView) d1Var._$_findCachedViewById(R.id.result7)).setText((CharSequence) arrayList.get(6));
        ((Button) d1Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new zk.k(z10, (rr.b) d1Var, (List) arrayList, str, 9));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18282x;
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
        return inflater.inflate(R.layout.fragment_screen_result_19, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18280v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18282x.clear();
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TemplateModel templateModel;
        String label;
        String str = this.f18279u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity).F.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            xVar.f23469u = (ArrayList) obj;
            try {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                templateModel = ((TemplateActivity) activity2).f10547y;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "exception in reading list from firebase", e10);
            }
            if (templateModel != null && (label = templateModel.getLabel()) != null) {
                fm.a aVar = (fm.a) this.f18280v.getValue();
                aVar.f15178l0.e(getViewLifecycleOwner(), new m0(13, new a(aVar, label, xVar)));
                aVar.f15181o0.e(getViewLifecycleOwner(), new m0(14, new b(xVar, label)));
                aVar.m(label, "list_result_19");
                ((Button) _$_findCachedViewById(R.id.button1)).setOnClickListener(new z0(this, 2));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "Exception in view created", e11);
        }
    }
}
