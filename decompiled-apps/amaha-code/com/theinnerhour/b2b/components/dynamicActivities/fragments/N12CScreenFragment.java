package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SmoothScrollLockLayoutManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.n;
import hs.j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
import t0.j0;
/* compiled from: N12CScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N12CScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N12CScreenFragment extends rr.d {
    public static final /* synthetic */ int L = 0;
    public boolean A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Calendar H;
    public boolean I;
    public int J;
    public final LinkedHashMap K = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final m0 f10929w = b0.j(this, y.a(t.class), new e(this), new f(this), new g(this));

    /* renamed from: x  reason: collision with root package name */
    public final String f10930x = LogHelper.INSTANCE.makeLogTag("N12CScreenFragment");

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<pl.f> f10931y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f10932z = new ArrayList<>();
    public String E = "";
    public String F = "";
    public String G = "";

    /* compiled from: N12CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<hs.k> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            N12CScreenFragment n12CScreenFragment = N12CScreenFragment.this;
            NestedScrollView nestedScrollView = (NestedScrollView) n12CScreenFragment._$_findCachedViewById(R.id.nsv12CScreenParentScroller);
            if (nestedScrollView != null) {
                nestedScrollView.smoothScrollTo(0, (int) n12CScreenFragment._$_findCachedViewById(R.id.viewN12CDivider).getY());
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: N12CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            RecyclerView.e adapter;
            RecyclerView.c0 H;
            View view;
            i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                N12CScreenFragment n12CScreenFragment = N12CScreenFragment.this;
                RecyclerView.m layoutManager = ((RecyclerView) n12CScreenFragment._$_findCachedViewById(R.id.rvN12CContainer)).getLayoutManager();
                i.e(layoutManager, "null cannot be cast to non-null type com.theinnerhour.b2b.utils.SmoothScrollLockLayoutManager");
                ((SmoothScrollLockLayoutManager) layoutManager).setScrollEnabled(false);
                if (n12CScreenFragment.A) {
                    n12CScreenFragment.A = false;
                    RecyclerView recyclerView2 = (RecyclerView) n12CScreenFragment._$_findCachedViewById(R.id.rvN12CContainer);
                    if (recyclerView2 != null && (H = recyclerView2.H(1)) != null && (view = H.f2751a) != null) {
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.llN12CAdditionalImageScroller);
                        if (linearLayout != null) {
                            Iterator<View> it = f6.b.B0(linearLayout).iterator();
                            while (true) {
                                j0 j0Var = (j0) it;
                                if (!j0Var.hasNext()) {
                                    break;
                                }
                                ((View) j0Var.next()).findViewById(R.id.ivRowN12CItemImageBlanket).setVisibility(8);
                            }
                        }
                        RobertoEditText robertoEditText = (RobertoEditText) view.findViewById(R.id.etN12CAdditionalTextInput);
                        if (robertoEditText != null) {
                            robertoEditText.setText("");
                        }
                        RobertoEditText robertoEditText2 = (RobertoEditText) view.findViewById(R.id.etN12CAdditionalTextInput);
                        if (robertoEditText2 != null) {
                            robertoEditText2.clearFocus();
                        }
                    }
                    RecyclerView recyclerView3 = (RecyclerView) n12CScreenFragment._$_findCachedViewById(R.id.rvN12CContainer);
                    if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
                        adapter.j(1);
                    }
                }
            }
        }
    }

    /* compiled from: N12CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<hs.k> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            int i6 = N12CScreenFragment.L;
            N12CScreenFragment.this.S();
            return hs.k.f19476a;
        }
    }

    /* compiled from: N12CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<hs.k> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            N12CScreenFragment n12CScreenFragment = N12CScreenFragment.this;
            RecyclerView.m layoutManager = ((RecyclerView) n12CScreenFragment._$_findCachedViewById(R.id.rvN12CContainer)).getLayoutManager();
            i.e(layoutManager, "null cannot be cast to non-null type com.theinnerhour.b2b.utils.SmoothScrollLockLayoutManager");
            ((SmoothScrollLockLayoutManager) layoutManager).setScrollEnabled(true);
            RecyclerView recyclerView = (RecyclerView) n12CScreenFragment._$_findCachedViewById(R.id.rvN12CContainer);
            if (recyclerView != null) {
                recyclerView.post(new pl.e(n12CScreenFragment, 1));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10937u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f10937u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f10937u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10938u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f10938u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f10938u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10939u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f10939u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f10939u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public N12CScreenFragment() {
        Calendar calendar = Calendar.getInstance();
        i.f(calendar, "getInstance()");
        this.H = calendar;
    }

    public static pl.f Q(HashMap hashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        Object obj = hashMap.get("preview_image");
        String str5 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = hashMap.get("card_image");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Object obj3 = hashMap.get("text");
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        Object obj4 = hashMap.get("text_color");
        if (obj4 instanceof String) {
            str4 = (String) obj4;
        } else {
            str4 = null;
        }
        Object obj5 = hashMap.get("card_image");
        if (obj5 instanceof String) {
            str5 = (String) obj5;
        }
        if (str5 != null && !n.B0(str5)) {
            z10 = false;
        } else {
            z10 = true;
        }
        return new pl.f(str, str2, str3, str4, z10);
    }

    @Override // rr.b
    public final boolean I() {
        if (this.I) {
            this.I = false;
            S();
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x02c2 A[EDGE_INSN: B:190:0x02c2->B:170:0x02c2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    @Override // rr.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        boolean z10;
        String str;
        RecyclerView.e eVar;
        ol.b bVar;
        ArrayList<pl.f> arrayList;
        boolean z11;
        String str2;
        Integer num;
        Object obj;
        ArrayList arrayList2;
        ArrayList<pl.f> arrayList3;
        boolean z12;
        boolean z13;
        String str3;
        boolean z14;
        pl.f fVar;
        String str4;
        String str5;
        Object obj2;
        RecyclerView.e eVar2;
        ol.b bVar2;
        int i6;
        Integer num2;
        ArrayList<String> arrayList4;
        RecyclerView.e eVar3;
        ol.b bVar3;
        RecyclerView.c0 H;
        View view;
        boolean z15 = true;
        NewDynamicParentActivity newDynamicParentActivity = null;
        r4 = null;
        r4 = null;
        RobertoEditText robertoEditText = null;
        if (this.I) {
            this.I = false;
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer);
            if (recyclerView != null) {
                eVar3 = recyclerView.getAdapter();
            } else {
                eVar3 = null;
            }
            if (eVar3 instanceof ol.b) {
                bVar3 = (ol.b) eVar3;
            } else {
                bVar3 = null;
            }
            if (bVar3 != null) {
                Context requireContext = requireContext();
                i.f(requireContext, "requireContext()");
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer);
                if (recyclerView2 != null && (H = recyclerView2.H(1)) != null && (view = H.f2751a) != null) {
                    robertoEditText = (RobertoEditText) view.findViewById(R.id.etN12CAdditionalTextInput);
                }
                bVar3.v(requireContext, robertoEditText);
                return;
            }
            return;
        }
        try {
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer);
            if (recyclerView3 != null) {
                eVar2 = recyclerView3.getAdapter();
            } else {
                eVar2 = null;
            }
            if (eVar2 instanceof ol.b) {
                bVar2 = (ol.b) eVar2;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null && (arrayList4 = bVar2.D) != null) {
                i6 = arrayList4.size();
            } else {
                i6 = -1;
            }
            num2 = this.D;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10930x, e10);
        }
        if (num2 != null && i6 != num2.intValue()) {
            Toast.makeText(requireActivity(), this.G, 0).show();
        } else {
            Integer num3 = this.B;
            if (num3 != null && i6 < num3.intValue()) {
                Toast.makeText(requireActivity(), this.E, 0).show();
            } else {
                Integer num4 = this.C;
                if (num4 != null && i6 > num4.intValue()) {
                    Toast.makeText(requireActivity(), this.F, 0).show();
                }
                z10 = true;
                if (!z10) {
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        str = arguments.getString("screenId");
                    } else {
                        str = null;
                    }
                    RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer);
                    if (recyclerView4 != null) {
                        eVar = recyclerView4.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof ol.b) {
                        bVar = (ol.b) eVar;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList = new ArrayList();
                        for (String str6 : bVar.D) {
                            Iterator<T> it = bVar.A.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (i.b(((pl.f) obj2).f28590c, str6)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            pl.f fVar2 = (pl.f) obj2;
                            if (fVar2 != null) {
                                arrayList.add(fVar2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        t P = P();
                        Bundle arguments2 = getArguments();
                        if (arguments2 != null) {
                            str4 = arguments2.getString("slug");
                        } else {
                            str4 = null;
                        }
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("n12c_list_" + str, arrayList);
                        hs.k kVar = hs.k.f19476a;
                        P.t(str4, str, hashMap);
                        t P2 = P();
                        Bundle arguments3 = getArguments();
                        if (arguments3 != null) {
                            str5 = arguments3.getString("slug");
                        } else {
                            str5 = null;
                        }
                        HashMap<String, Object> hashMap2 = new HashMap<>();
                        hashMap2.put("n12c_list_" + str, arrayList);
                        P2.s(str5, str, hashMap2);
                    }
                    t P3 = P();
                    HashMap<String, Object> hashMap3 = new HashMap<>();
                    hashMap3.put("date", Long.valueOf(this.H.getTimeInMillis()));
                    hs.k kVar2 = hs.k.f19476a;
                    P3.t("global_data", "global_data_id", hashMap3);
                    String str7 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("activity_name", P().T);
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle.putBoolean("main_activity", P().K);
                    bundle.putBoolean("is_revamped", true);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        t P4 = P();
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
                        HashMap m10 = P4.m(num, str2);
                        if (m10 != null) {
                            obj = m10.get("options_list");
                        } else {
                            obj = null;
                        }
                        if (obj instanceof ArrayList) {
                            arrayList2 = (ArrayList) obj;
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            arrayList3 = new ArrayList();
                            for (Object obj3 : arrayList2) {
                                if (obj3 instanceof HashMap) {
                                    fVar = Q((HashMap) obj3);
                                } else {
                                    fVar = null;
                                }
                                if (fVar != null) {
                                    arrayList3.add(fVar);
                                }
                            }
                        } else {
                            arrayList3 = null;
                        }
                        if (!(arrayList3 instanceof ArrayList)) {
                            arrayList3 = null;
                        }
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        if (!arrayList3.isEmpty()) {
                            for (pl.f fVar3 : arrayList3) {
                                String str8 = fVar3.f28590c;
                                if (str8 != null && !n.B0(str8)) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (!z12) {
                                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                        for (pl.f fVar4 : arrayList) {
                                            Locale ENGLISH = Locale.ENGLISH;
                                            i.f(ENGLISH, "ENGLISH");
                                            String lowerCase = fVar3.f28590c.toLowerCase(ENGLISH);
                                            i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                            String str9 = fVar4.f28590c;
                                            if (str9 != null) {
                                                str3 = str9.toLowerCase(ENGLISH);
                                                i.f(str3, "this as java.lang.String).toLowerCase(locale)");
                                            } else {
                                                str3 = null;
                                            }
                                            if (i.b(lowerCase, str3)) {
                                                z14 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z14 = false;
                                    if (z14) {
                                        z13 = true;
                                        continue;
                                        if (z13) {
                                            break;
                                        }
                                    }
                                }
                                z13 = false;
                                continue;
                                if (z13) {
                                }
                            }
                        }
                    }
                    z15 = false;
                    bundle.putBoolean("from_predefined_list", z15);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle, "activity_affirm_chosen");
                    p requireActivity = requireActivity();
                    if (requireActivity instanceof NewDynamicParentActivity) {
                        newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                    }
                    if (newDynamicParentActivity != null) {
                        int i10 = NewDynamicParentActivity.F;
                        newDynamicParentActivity.L0(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final t P() {
        return (t) this.f10929w.getValue();
    }

    public final void S() {
        try {
            this.I = false;
            RecyclerView.m layoutManager = ((RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer)).getLayoutManager();
            i.e(layoutManager, "null cannot be cast to non-null type com.theinnerhour.b2b.utils.SmoothScrollLockLayoutManager");
            ((SmoothScrollLockLayoutManager) layoutManager).setScrollEnabled(true);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer);
            if (recyclerView != null) {
                recyclerView.post(new pl.e(this, 0));
            }
            this.A = true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10930x, e10);
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.K.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.K;
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
        return inflater.inflate(R.layout.fragment_n12c_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        NewDynamicParentActivity newDynamicParentActivity3;
        NewDynamicParentActivity newDynamicParentActivity4;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList arrayList;
        Object obj5;
        String str2;
        Object obj6;
        String str3;
        Object obj7;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object obj9;
        String str4;
        Integer num2;
        Object obj10;
        String str5;
        Integer num3;
        Object obj11;
        String str6;
        Integer num4;
        Object obj12;
        String str7;
        Object obj13;
        String str8;
        Object obj14;
        String str9;
        Object obj15;
        String str10;
        Object obj16;
        String str11;
        Object obj17;
        int i6;
        RecyclerView.s recycledViewPool;
        RecyclerView.s recycledViewPool2;
        HashMap hashMap;
        HashMap hashMap2;
        Object obj18;
        ArrayList arrayList6;
        ArrayList<pl.f> arrayList7;
        pl.f fVar;
        String str12;
        Object obj19;
        String str13;
        Object obj20;
        String str14;
        Object obj21;
        Long l2;
        Bundle arguments;
        NewDynamicParentActivity newDynamicParentActivity5;
        Object obj22;
        String str15;
        Boolean bool;
        Object obj23;
        String str16;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        t P = P();
        Bundle arguments2 = getArguments();
        String str17 = null;
        if (arguments2 != null) {
            str = arguments2.getString("slug");
        } else {
            str = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            num = Integer.valueOf(arguments3.getInt(Constants.DAYMODEL_POSITION));
        } else {
            num = null;
        }
        HashMap m10 = P.m(num, str);
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            newDynamicParentActivity.E0("cta_type_1");
            hs.k kVar = hs.k.f19476a;
        }
        p requireActivity2 = requireActivity();
        if (requireActivity2 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
        } else {
            newDynamicParentActivity2 = null;
        }
        if (newDynamicParentActivity2 != null) {
            if (m10 != null) {
                obj23 = m10.get("cta1");
            } else {
                obj23 = null;
            }
            if (obj23 instanceof String) {
                str16 = (String) obj23;
            } else {
                str16 = null;
            }
            NewDynamicParentActivity.F0(newDynamicParentActivity2, str16, null, null, null, 14);
            hs.k kVar2 = hs.k.f19476a;
        }
        p requireActivity3 = requireActivity();
        if (requireActivity3 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
        } else {
            newDynamicParentActivity3 = null;
        }
        if (newDynamicParentActivity3 != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                bool = Boolean.valueOf(arguments4.getBoolean("show_info_button"));
            } else {
                bool = null;
            }
            newDynamicParentActivity3.O0(bool);
            hs.k kVar3 = hs.k.f19476a;
        }
        p requireActivity4 = requireActivity();
        if (requireActivity4 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity4;
        } else {
            newDynamicParentActivity4 = null;
        }
        if (newDynamicParentActivity4 != null) {
            if (m10 != null) {
                obj22 = m10.get("heading");
            } else {
                obj22 = null;
            }
            if (obj22 instanceof String) {
                str15 = (String) obj22;
            } else {
                str15 = null;
            }
            newDynamicParentActivity4.I0(str15);
            hs.k kVar4 = hs.k.f19476a;
        }
        if (this.f30998u && (arguments = getArguments()) != null) {
            int i10 = arguments.getInt(Constants.DAYMODEL_POSITION);
            p requireActivity5 = requireActivity();
            if (requireActivity5 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity5 = (NewDynamicParentActivity) requireActivity5;
            } else {
                newDynamicParentActivity5 = null;
            }
            if (newDynamicParentActivity5 != null) {
                newDynamicParentActivity5.C0(i10);
                hs.k kVar5 = hs.k.f19476a;
            }
        }
        int i11 = this.J;
        int i12 = P().M;
        ArrayList<String> arrayList8 = this.f10932z;
        if (i11 < i12) {
            this.J = P().M;
            this.f10931y.clear();
            arrayList8.clear();
        }
        if (m10 != null) {
            obj = m10.get("edit_time");
        } else {
            obj = null;
        }
        Boolean bool2 = Boolean.TRUE;
        if (i.b((Boolean) obj, bool2)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.iv12CScreenDate);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new pl.b(this, 0), this.H.get(11), this.H.get(12), false);
            timePickerDialog.setTitle("Pick time");
            DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 0), this.H.get(1), this.H.get(2), this.H.get(5));
            datePickerDialog.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.iv12CScreenDate);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new pl.d(datePickerDialog, 0));
                hs.k kVar6 = hs.k.f19476a;
            }
        } else {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.iv12CScreenDate);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(4);
            }
        }
        if (m10 != null) {
            obj2 = m10.get("show_time");
        } else {
            obj2 = null;
        }
        if (i.b((Boolean) obj2, bool2)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN12CScreenDate)).setVisibility(0);
            HashMap<String, Object> n10 = P().n("global_data", "global_data_id");
            if (n10 != null) {
                obj21 = n10.get("date");
            } else {
                obj21 = null;
            }
            if (obj21 instanceof Long) {
                l2 = (Long) obj21;
            } else {
                l2 = null;
            }
            if (l2 != null) {
                long longValue = l2.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(longValue);
                this.H = calendar;
                hs.k kVar7 = hs.k.f19476a;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.H.get(5));
            gd.d dVar = P().f29790z;
            int i13 = this.H.get(5);
            dVar.getClass();
            sb2.append(gd.d.b(i13));
            sb2.append(' ');
            sb2.append(P().f29790z.d(this.H.getTimeInMillis(), "MMM, hh:mm a"));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN12CScreenDate)).setText(sb2.toString());
        } else {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN12CScreenDate)).setVisibility(8);
        }
        _$_findCachedViewById(R.id.view12CScreenQuestion).setOnClickListener(new ol.k(1, this));
        ((AppCompatImageView) _$_findCachedViewById(R.id.iv12CScreenArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tv12CScreenQuestion);
        if (robertoTextView != null) {
            if (m10 != null) {
                obj20 = m10.get("question");
            } else {
                obj20 = null;
            }
            if (obj20 instanceof String) {
                str14 = (String) obj20;
            } else {
                str14 = null;
            }
            robertoTextView.setText(str14);
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tv12CScreenSupportText);
        if (robertoTextView2 != null) {
            if (m10 != null) {
                obj19 = m10.get("support_text");
            } else {
                obj19 = null;
            }
            if (obj19 instanceof String) {
                str13 = (String) obj19;
            } else {
                str13 = null;
            }
            robertoTextView2.setText(str13);
        }
        if (m10 != null) {
            obj3 = m10.get("help_card_color");
        } else {
            obj3 = null;
        }
        String str18 = (String) obj3;
        if (m10 != null) {
            obj4 = m10.get("help_text");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof ArrayList) {
            arrayList = (ArrayList) obj4;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (Object obj24 : arrayList) {
                if (obj24 instanceof HashMap) {
                    Object obj25 = ((Map) obj24).get("list_key");
                    if (obj25 instanceof String) {
                        str12 = (String) obj25;
                    } else {
                        str12 = null;
                    }
                    if (str12 != null) {
                        try {
                            int i14 = bn.a.f4534a;
                            p requireActivity6 = requireActivity();
                            i.f(requireActivity6, "requireActivity()");
                            ChipGroup cg12CScreen = (ChipGroup) _$_findCachedViewById(R.id.cg12CScreen);
                            i.f(cg12CScreen, "cg12CScreen");
                            ((ChipGroup) _$_findCachedViewById(R.id.cg12CScreen)).addView(bn.a.g(requireActivity6, str12, cg12CScreen, str18));
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this.f10930x, e10);
                        }
                    }
                }
            }
            hs.k kVar8 = hs.k.f19476a;
        }
        if (m10 != null) {
            obj5 = m10.get("user_select_image");
        } else {
            obj5 = null;
        }
        if (obj5 instanceof String) {
            str2 = (String) obj5;
        } else {
            str2 = null;
        }
        if (m10 != null) {
            obj6 = m10.get("user_select_prompt");
        } else {
            obj6 = null;
        }
        if (obj6 instanceof String) {
            str3 = (String) obj6;
        } else {
            str3 = null;
        }
        if (this.f10931y.isEmpty()) {
            if (m10 != null) {
                obj18 = m10.get("options_list");
            } else {
                obj18 = null;
            }
            if (obj18 instanceof ArrayList) {
                arrayList6 = (ArrayList) obj18;
            } else {
                arrayList6 = null;
            }
            if (arrayList6 != null) {
                arrayList7 = new ArrayList<>();
                for (Object obj26 : arrayList6) {
                    if (obj26 instanceof HashMap) {
                        fVar = Q((HashMap) obj26);
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        arrayList7.add(fVar);
                    }
                }
            } else {
                arrayList7 = null;
            }
            if (!(arrayList7 instanceof ArrayList)) {
                arrayList7 = null;
            }
            if (arrayList7 == null) {
                arrayList7 = new ArrayList<>();
            }
            this.f10931y = arrayList7;
        }
        if (m10 != null) {
            obj7 = m10.get("additional_options_text_list");
        } else {
            obj7 = null;
        }
        if (obj7 instanceof ArrayList) {
            arrayList2 = (ArrayList) obj7;
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            ArrayList arrayList9 = new ArrayList();
            for (Object obj27 : arrayList2) {
                if (obj27 instanceof HashMap) {
                    hashMap2 = (HashMap) obj27;
                } else {
                    hashMap2 = null;
                }
                if (hashMap2 != null) {
                    arrayList9.add(hashMap2);
                }
            }
            arrayList3 = arrayList9;
        } else {
            arrayList3 = null;
        }
        if (m10 != null) {
            obj8 = m10.get("additional_options_image_list");
        } else {
            obj8 = null;
        }
        if (obj8 instanceof ArrayList) {
            arrayList4 = (ArrayList) obj8;
        } else {
            arrayList4 = null;
        }
        if (arrayList4 != null) {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj28 : arrayList4) {
                if (obj28 instanceof HashMap) {
                    hashMap = (HashMap) obj28;
                } else {
                    hashMap = null;
                }
                if (hashMap != null) {
                    arrayList10.add(hashMap);
                }
            }
            arrayList5 = arrayList10;
        } else {
            arrayList5 = null;
        }
        if (m10 != null) {
            obj9 = m10.get("min_selection");
        } else {
            obj9 = null;
        }
        if (obj9 instanceof String) {
            str4 = (String) obj9;
        } else {
            str4 = null;
        }
        if (str4 != null) {
            num2 = m.w0(str4);
        } else {
            num2 = null;
        }
        this.B = num2;
        if (m10 != null) {
            obj10 = m10.get("max_selection");
        } else {
            obj10 = null;
        }
        if (obj10 instanceof String) {
            str5 = (String) obj10;
        } else {
            str5 = null;
        }
        if (str5 != null) {
            num3 = m.w0(str5);
        } else {
            num3 = null;
        }
        this.C = num3;
        if (m10 != null) {
            obj11 = m10.get("exact_selection");
        } else {
            obj11 = null;
        }
        if (obj11 instanceof String) {
            str6 = (String) obj11;
        } else {
            str6 = null;
        }
        if (str6 != null) {
            num4 = m.w0(str6);
        } else {
            num4 = null;
        }
        this.D = num4;
        if (m10 != null) {
            obj12 = m10.get("min_error");
        } else {
            obj12 = null;
        }
        if (obj12 instanceof String) {
            str7 = (String) obj12;
        } else {
            str7 = null;
        }
        String str19 = "";
        if (str7 == null) {
            str7 = "";
        }
        this.E = str7;
        if (m10 != null) {
            obj13 = m10.get("max_error");
        } else {
            obj13 = null;
        }
        if (obj13 instanceof String) {
            str8 = (String) obj13;
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str8 = "";
        }
        this.F = str8;
        if (m10 != null) {
            obj14 = m10.get("exact_error");
        } else {
            obj14 = null;
        }
        if (obj14 instanceof String) {
            str9 = (String) obj14;
        } else {
            str9 = null;
        }
        if (str9 == null) {
            str9 = "";
        }
        this.G = str9;
        if (m10 != null) {
            obj15 = m10.get("blank_text_error");
        } else {
            obj15 = null;
        }
        if (obj15 instanceof String) {
            str10 = (String) obj15;
        } else {
            str10 = null;
        }
        if (str10 == null) {
            str10 = "";
        }
        if (m10 != null) {
            obj16 = m10.get("no_image_error");
        } else {
            obj16 = null;
        }
        if (obj16 instanceof String) {
            str11 = (String) obj16;
        } else {
            str11 = null;
        }
        if (str11 == null) {
            str11 = "";
        }
        if (m10 != null) {
            obj17 = m10.get("existing_text_error");
        } else {
            obj17 = null;
        }
        if (obj17 instanceof String) {
            str17 = (String) obj17;
        }
        if (str17 != null) {
            str19 = str17;
        }
        SmoothScrollLockLayoutManager smoothScrollLockLayoutManager = new SmoothScrollLockLayoutManager(requireContext(), 0, false);
        smoothScrollLockLayoutManager.setScrollEnabled(false);
        ((RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer)).setLayoutManager(smoothScrollLockLayoutManager);
        ((RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer)).setAdapter(new ol.b(str2, str3, new j(str10, str11, str19), this.f10931y, arrayList3, arrayList5, arrayList8, new c(), new d(), new a()));
        ((RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer)).i(new b());
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer);
        if (recyclerView != null && (recycledViewPool2 = recyclerView.getRecycledViewPool()) != null) {
            i6 = 0;
            RecyclerView.s.a a10 = recycledViewPool2.a(0);
            a10.f2794b = 0;
            ArrayList<RecyclerView.c0> arrayList11 = a10.f2793a;
            while (arrayList11.size() > 0) {
                arrayList11.remove(arrayList11.size() - 1);
            }
            hs.k kVar9 = hs.k.f19476a;
        } else {
            i6 = 0;
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvN12CContainer);
        if (recyclerView2 != null && (recycledViewPool = recyclerView2.getRecycledViewPool()) != null) {
            RecyclerView.s.a a11 = recycledViewPool.a(1);
            a11.f2794b = i6;
            ArrayList<RecyclerView.c0> arrayList12 = a11.f2793a;
            while (arrayList12.size() > 0) {
                arrayList12.remove(arrayList12.size() - 1);
            }
            hs.k kVar10 = hs.k.f19476a;
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
