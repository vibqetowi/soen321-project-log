package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.n;
import hs.f;
import ik.j1;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.o;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import ol.e;
import pl.c0;
import ql.t;
/* compiled from: N24ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N24ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N24ScreenFragment extends rr.d {
    public static final /* synthetic */ int F = 0;
    public ArrayList A;
    public Integer D;

    /* renamed from: w  reason: collision with root package name */
    public int f11036w;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f11038y;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11037x = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));

    /* renamed from: z  reason: collision with root package name */
    public final String f11039z = LogHelper.INSTANCE.makeLogTag("N24ScreenFragment");
    public int B = -1;
    public final ArrayList<f<String, Bitmap>> C = new ArrayList<>();

    /* compiled from: N24ScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ View f11041v;

        public a(View view) {
            this.f11041v = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int i6 = N24ScreenFragment.F;
            N24ScreenFragment n24ScreenFragment = N24ScreenFragment.this;
            n24ScreenFragment.requireActivity().runOnUiThread(new o(27, n24ScreenFragment));
            this.f11041v.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11042u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11042u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11042u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11043u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11043u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11043u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11044u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11044u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11044u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.d
    public final void O() {
        NewDynamicParentActivity newDynamicParentActivity;
        Integer num = this.D;
        if (num != null && num.intValue() == 0) {
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                newDynamicParentActivity.J0();
            }
        }
    }

    public final t P() {
        return (t) this.f11037x.getValue();
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.E.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
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
        return inflater.inflate(R.layout.fragment_n24_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0171, code lost:
        if (r4 == null) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x029c A[SYNTHETIC] */
    @Override // rr.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        NewDynamicParentActivity newDynamicParentActivity;
        Integer num;
        String str;
        Integer num2;
        NewDynamicParentActivity newDynamicParentActivity2;
        Object obj;
        String str2;
        int i6;
        Object obj2;
        ArrayList arrayList;
        ArrayList<HashMap> arrayList2;
        int i10;
        Object obj3;
        ArrayList arrayList3;
        List<String> list;
        int i11;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str7;
        c0 c0Var;
        pl.f fVar;
        boolean z10;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer num3;
        HashMap hashMap;
        Integer w02;
        Boolean bool;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            num = newDynamicParentActivity.x0();
        } else {
            num = null;
        }
        this.D = num;
        t P = P();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("slug");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num2 = Integer.valueOf(arguments2.getInt(Constants.DAYMODEL_POSITION));
        } else {
            num2 = null;
        }
        HashMap m10 = P.m(num2, str);
        p requireActivity2 = requireActivity();
        if (requireActivity2 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
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
        v vVar = new v();
        if (m10 != null) {
            obj = m10.get("default_frequency_count");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (str2 != null && (w02 = m.w0(str2)) != null) {
            i6 = w02.intValue();
        } else {
            i6 = 1;
        }
        vVar.f23467u = i6;
        if (m10 != null) {
            obj2 = m10.get("local_data");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof ArrayList) {
            arrayList = (ArrayList) obj2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (obj4 instanceof HashMap) {
                    hashMap = (HashMap) obj4;
                } else {
                    hashMap = null;
                }
                if (hashMap != null) {
                    arrayList2.add(hashMap);
                }
            }
        } else {
            arrayList2 = null;
        }
        this.f11038y = arrayList2;
        int i12 = 0;
        if (arrayList2 != null) {
            for (HashMap hashMap2 : arrayList2) {
                Object obj5 = hashMap2.get("populate_key");
                if (i.b(obj5, "n24_options")) {
                    t P2 = P();
                    Object obj6 = hashMap2.get("screen_slug");
                    if (obj6 instanceof String) {
                        str4 = (String) obj6;
                    } else {
                        str4 = null;
                    }
                    Object obj7 = hashMap2.get("screen_id");
                    if (obj7 instanceof String) {
                        str5 = (String) obj7;
                    } else {
                        str5 = null;
                    }
                    Object obj8 = hashMap2.get("screen_data_key");
                    if (obj8 instanceof String) {
                        str6 = (String) obj8;
                    } else {
                        str6 = null;
                    }
                    Object o10 = P2.o(str4, str5, str6);
                    if (o10 instanceof ArrayList) {
                        arrayList4 = (ArrayList) o10;
                    } else {
                        arrayList4 = null;
                    }
                    if (arrayList4 != null) {
                        arrayList5 = new ArrayList();
                        for (Object obj9 : arrayList4) {
                            gd.d dVar = P().f29790z;
                            Object obj10 = hashMap2.get("screen_slug");
                            if (obj10 instanceof String) {
                                str7 = (String) obj10;
                            } else {
                                str7 = null;
                            }
                            dVar.getClass();
                            if (i.b(str7, "n12c")) {
                                if (obj9 instanceof pl.f) {
                                    fVar = (pl.f) obj9;
                                } else {
                                    fVar = null;
                                }
                                if (fVar != null) {
                                    String str12 = fVar.f28589b;
                                    if (str12 != null) {
                                        if (n.B0(str12)) {
                                            str12 = null;
                                        }
                                    }
                                    str12 = fVar.f28588a;
                                    String str13 = fVar.f28589b;
                                    if (str13 != null && !n.B0(str13)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (!z10) {
                                        str8 = "";
                                    } else {
                                        str8 = fVar.f28590c;
                                    }
                                    c0Var = new c0(str12, str8, fVar.f28591d, fVar.f28592e);
                                    if (c0Var == null) {
                                        arrayList5.add(c0Var);
                                    }
                                }
                            }
                            c0Var = null;
                            if (c0Var == null) {
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                    this.A = arrayList5;
                } else if (i.b(obj5, "n24_count")) {
                    t P3 = P();
                    Object obj11 = hashMap2.get("screen_slug");
                    if (obj11 instanceof String) {
                        str9 = (String) obj11;
                    } else {
                        str9 = null;
                    }
                    Object obj12 = hashMap2.get("screen_id");
                    if (obj12 instanceof String) {
                        str10 = (String) obj12;
                    } else {
                        str10 = null;
                    }
                    Object obj13 = hashMap2.get("screen_data_key");
                    if (obj13 instanceof String) {
                        str11 = (String) obj13;
                    } else {
                        str11 = null;
                    }
                    Object o11 = P3.o(str9, str10, str11);
                    if (o11 instanceof Integer) {
                        num3 = (Integer) o11;
                    } else {
                        num3 = null;
                    }
                    if (num3 != null) {
                        vVar.f23467u = num3.intValue();
                    }
                }
            }
        }
        if (this.A != null) {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN24ScreenCounter);
            StringBuilder sb2 = new StringBuilder("1/");
            ArrayList arrayList6 = this.A;
            if (arrayList6 != null) {
                i10 = arrayList6.size();
            } else {
                i10 = 1;
            }
            sb2.append(i10 * vVar.f23467u);
            robertoTextView.setText(sb2.toString());
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewN24ScreenBlanketView);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setOnClickListener(new j1(this, 29, vVar));
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenImageScroller);
            if (recyclerView != null) {
                recyclerView.setAdapter(new e(vVar.f23467u, this.A));
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenImageScroller);
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new CenterZoomLayoutManager(requireContext(), 0, false, 0.01f, 0.0f, null, 48, null));
            }
            new w().a((RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenImageScroller));
            if (m10 != null) {
                obj3 = m10.get("prompt_list");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof ArrayList) {
                arrayList3 = (ArrayList) obj3;
            } else {
                arrayList3 = null;
            }
            if (arrayList3 != null) {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj14 : arrayList3) {
                    if (obj14 instanceof HashMap) {
                        Object obj15 = ((Map) obj14).get("list_key");
                        if (obj15 instanceof String) {
                            str3 = (String) obj15;
                            if (str3 == null) {
                                arrayList7.add(str3);
                            }
                        }
                    }
                    str3 = null;
                    if (str3 == null) {
                    }
                }
                list = arrayList7;
            } else {
                list = null;
            }
            if (list != null) {
                if (list.size() > 4) {
                    list = list.subList(0, 4);
                }
                int i13 = vVar.f23467u;
                ArrayList arrayList8 = this.A;
                if (arrayList8 != null) {
                    i11 = arrayList8.size();
                } else {
                    i11 = 1;
                }
                int i14 = i13 * i11;
                if (i14 < list.size()) {
                    RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenPromptScroller);
                    if (recyclerView3 != null) {
                        recyclerView3.setAdapter(new ol.f(list.subList(0, i14)));
                    }
                } else if (i14 == list.size()) {
                    RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenPromptScroller);
                    if (recyclerView4 != null) {
                        recyclerView4.setAdapter(new ol.f(list));
                    }
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    if (i14 <= list.size() * 2) {
                        while (i12 < i14) {
                            if (i12 % 2 == 0) {
                                arrayList9.add("");
                            } else {
                                String str14 = (String) u.j2((i12 - 1) / 2, list);
                                if (str14 == null) {
                                    str14 = "";
                                }
                                arrayList9.add(str14);
                            }
                            i12++;
                        }
                    } else {
                        int size = i14 - (list.size() * 2);
                        int i15 = 1;
                        if (size % 2 != 1) {
                            i15 = 0;
                        }
                        int i16 = size / 2;
                        if ((size ^ 2) < 0 && i16 * 2 != size) {
                            i16--;
                        }
                        for (int i17 = 0; i17 < i16; i17++) {
                            arrayList9.add("");
                        }
                        for (String str15 : list) {
                            arrayList9.add("");
                            arrayList9.add(str15);
                        }
                        int i18 = i16 + i15;
                        while (i12 < i18) {
                            arrayList9.add("");
                            i12++;
                        }
                    }
                    RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenPromptScroller);
                    if (recyclerView5 != null) {
                        recyclerView5.setAdapter(new ol.f(arrayList9));
                    }
                }
                RecyclerView recyclerView6 = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenPromptScroller);
                if (recyclerView6 != null) {
                    recyclerView6.setLayoutManager(new CenterZoomLayoutManager(requireContext(), 1, false, 0.01f, 0.0f, Float.valueOf(900.0f), 16, null));
                }
                new w().a((RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenPromptScroller));
            }
        }
        RecyclerView recyclerView7 = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenPromptScroller);
        if (recyclerView7 != null) {
            recyclerView7.h0(this.f11036w);
        }
        RecyclerView recyclerView8 = (RecyclerView) _$_findCachedViewById(R.id.rvN24ScreenImageScroller);
        if (recyclerView8 != null) {
            recyclerView8.h0(this.f11036w);
        }
    }

    @Override // rr.d
    public final void K() {
    }

    @Override // rr.d
    public final void M() {
    }
}
