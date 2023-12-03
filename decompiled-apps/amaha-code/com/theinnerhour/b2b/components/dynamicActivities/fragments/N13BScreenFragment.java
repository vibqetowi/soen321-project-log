package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.r;
import is.u;
import is.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
import ri.e;
import rr.d;
/* compiled from: N13BScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N13BScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N13BScreenFragment extends d {

    /* renamed from: z  reason: collision with root package name */
    public N12AItemListModel f10943z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10940w = LogHelper.INSTANCE.makeLogTag("N13BScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f10941x = b0.j(this, y.a(t.class), new a(this), new b(this), new c(this));

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<N12AItemListModel> f10942y = new ArrayList<>();
    public String A = "";

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10944u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f10944u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f10944u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10945u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f10945u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f10945u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10946u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f10946u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f10946u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.b
    public final boolean I() {
        boolean z10;
        NewDynamicParentActivity newDynamicParentActivity;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("isBranchedFlow")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        p requireActivity = requireActivity();
        NewDynamicParentActivity newDynamicParentActivity2 = null;
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            try {
                t tVar = newDynamicParentActivity.f10904z;
                if (tVar != null) {
                    tVar.g(w.f20676u);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(newDynamicParentActivity.f10901w, e10);
            }
        }
        String str = this.A;
        Locale locale = Locale.ENGLISH;
        String e11 = e.e(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        if (i.b(e11, "n12a")) {
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            }
            if (newDynamicParentActivity2 != null) {
                newDynamicParentActivity2.B0("N12A");
            }
        } else if (i.b(e11, "n6a")) {
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
            }
            if (newDynamicParentActivity2 != null) {
                newDynamicParentActivity2.B0("N6A");
            }
        }
        return false;
    }

    @Override // rr.d
    public final void K() {
        try {
            String str = this.A;
            Locale ENGLISH = Locale.ENGLISH;
            i.f(ENGLISH, "ENGLISH");
            String lowerCase = str.toLowerCase(ENGLISH);
            i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            NewDynamicParentActivity newDynamicParentActivity = null;
            if (i.b(lowerCase, "n12a")) {
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                }
                if (newDynamicParentActivity != null) {
                    int i6 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                }
            } else if (i.b(lowerCase, "n6a")) {
                P(true);
                p requireActivity2 = requireActivity();
                if (requireActivity2 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.B0("N6A");
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10940w, e10);
        }
    }

    @Override // rr.d
    public final void M() {
        try {
            String str = this.A;
            Locale ENGLISH = Locale.ENGLISH;
            i.f(ENGLISH, "ENGLISH");
            String lowerCase = str.toLowerCase(ENGLISH);
            i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            NewDynamicParentActivity newDynamicParentActivity = null;
            if (i.b(lowerCase, "n12a")) {
                P(false);
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                }
                if (newDynamicParentActivity != null) {
                    int i6 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                }
            } else if (i.b(lowerCase, "n6a")) {
                P(false);
                p requireActivity2 = requireActivity();
                if (requireActivity2 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.B0("N6A");
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10940w, e10);
        }
    }

    public final void P(boolean z10) {
        String str;
        String string;
        String str2;
        N12AItemListModel n12AItemListModel;
        String str3;
        try {
            Iterator<N12AItemListModel> it = this.f10942y.iterator();
            int i6 = 0;
            while (true) {
                str = null;
                if (it.hasNext()) {
                    String id2 = it.next().getId();
                    N12AItemListModel n12AItemListModel2 = this.f10943z;
                    if (n12AItemListModel2 != null) {
                        str3 = n12AItemListModel2.getId();
                    } else {
                        str3 = null;
                    }
                    if (i.b(id2, str3)) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (z10 && i6 == -1 && (n12AItemListModel = this.f10943z) != null) {
                this.f10942y.add(n12AItemListModel);
            } else if (!z10 && i6 != -1) {
                this.f10942y.remove(i6);
            }
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("parentDataSlug")) != null) {
                t tVar = (t) this.f10941x.getValue();
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str2 = arguments2.getString("parentSlug");
                } else {
                    str2 = null;
                }
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    str = arguments3.getString("parentScreenId");
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(string, this.f10942y);
                hs.k kVar = hs.k.f19476a;
                tVar.t(str2, str, hashMap);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10940w, e10);
        }
    }

    public final void Q(HashMap<String, Object> hashMap) {
        Object obj;
        String str;
        NewDynamicParentActivity newDynamicParentActivity;
        int i6;
        Integer w02;
        Integer w03;
        NewDynamicParentActivity newDynamicParentActivity2 = null;
        if (hashMap != null) {
            try {
                obj = hashMap.get(Constants.SCREEN_PROGRESS);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10940w, "exception", e10);
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
        if (str != null) {
            int i10 = 0;
            List a12 = r.a1(str, new String[]{"/"}, 0, 6);
            String str2 = (String) u.j2(0, a12);
            String str3 = (String) u.j2(1, a12);
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                newDynamicParentActivity.M0();
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            }
            if (newDynamicParentActivity2 != null) {
                if (str2 != null && (w03 = m.w0(str2)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = 0;
                }
                if (str3 != null && (w02 = m.w0(str3)) != null) {
                    i10 = w02.intValue();
                }
                newDynamicParentActivity2.G0(i6, i10);
                return;
            }
            return;
        }
        p requireActivity3 = requireActivity();
        if (requireActivity3 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
        }
        if (newDynamicParentActivity2 != null) {
            newDynamicParentActivity2.y0();
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.B.clear();
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n13b_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Serializable serializable;
        N12AItemListModel n12AItemListModel;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        NewDynamicParentActivity newDynamicParentActivity3;
        String str2;
        String str3;
        Object obj;
        ArrayList<N12AItemListModel> arrayList;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        String str9;
        int i6;
        String imageHeader;
        m0 m0Var = this.f10941x;
        String str10 = this.f10940w;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            Integer num = null;
            if (arguments != null) {
                str = arguments.getString("parentSlug");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.A = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                serializable = arguments2.getSerializable("n13b_data");
            } else {
                serializable = null;
            }
            if (serializable instanceof N12AItemListModel) {
                n12AItemListModel = (N12AItemListModel) serializable;
            } else {
                n12AItemListModel = null;
            }
            this.f10943z = n12AItemListModel;
            if (n12AItemListModel != null) {
                Glide.i(requireActivity()).p(n12AItemListModel.getImageLink()).B((AppCompatImageView) _$_findCachedViewById(R.id.ivFragmentN13BImage));
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    i6 = arguments3.getInt("n13b_index");
                } else {
                    i6 = -1;
                }
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN13BImageHeader);
                if (robertoTextView != null) {
                    if (i6 != -1) {
                        imageHeader = n12AItemListModel.getImageHeader() + (i6 + 1);
                    } else {
                        imageHeader = n12AItemListModel.getImageHeader();
                    }
                    robertoTextView.setText(imageHeader);
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN13BImageFooterTitle);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(n12AItemListModel.getHeader());
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN13BImageFooterDescription);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(n12AItemListModel.getSubHeader());
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN13BDescriptionHeader);
                if (robertoTextView4 != null) {
                    robertoTextView4.setText(n12AItemListModel.getDescriptionHeader());
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN13BDescriptionBody);
                if (robertoTextView5 != null) {
                    robertoTextView5.setText(n12AItemListModel.getDescriptionText());
                }
                RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN13BCharacteristicsHeader);
                if (robertoTextView6 != null) {
                    robertoTextView6.setText(n12AItemListModel.getCharacteristicHeader());
                }
                for (String str11 : n12AItemListModel.getCharacteristicList()) {
                    try {
                        View inflate = requireActivity().getLayoutInflater().inflate(R.layout.row_n13b_characteristic_item, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN13BCharacteristicsContainer)), false);
                        RobertoTextView robertoTextView7 = (RobertoTextView) inflate.findViewById(R.id.tvRowN13BCharacteristicText);
                        if (robertoTextView7 != null) {
                            robertoTextView7.setText(str11);
                        }
                        ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN13BCharacteristicsContainer)).addView(inflate);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str10, e10);
                    }
                }
            }
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    str9 = arguments4.getString("cta_slug");
                } else {
                    str9 = null;
                }
                newDynamicParentActivity.E0(str9);
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    bool = Boolean.valueOf(arguments5.getBoolean("show_info_button"));
                } else {
                    bool = null;
                }
                newDynamicParentActivity2.O0(bool);
            }
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
            } else {
                newDynamicParentActivity3 = null;
            }
            if (newDynamicParentActivity3 != null) {
                Bundle arguments6 = getArguments();
                if (arguments6 != null) {
                    str6 = arguments6.getString("n13b_cta_1");
                } else {
                    str6 = null;
                }
                Bundle arguments7 = getArguments();
                if (arguments7 != null) {
                    str7 = arguments7.getString("n13b_cta_2");
                } else {
                    str7 = null;
                }
                Bundle arguments8 = getArguments();
                if (arguments8 != null) {
                    str8 = arguments8.getString("n13b_cta_prompt");
                } else {
                    str8 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity3, str6, str7, str8, null, 8);
            }
            t tVar = (t) m0Var.getValue();
            Bundle arguments9 = getArguments();
            if (arguments9 != null) {
                str2 = arguments9.getString("parentSlug");
            } else {
                str2 = null;
            }
            Bundle arguments10 = getArguments();
            if (arguments10 != null) {
                str3 = arguments10.getString("parentScreenId");
            } else {
                str3 = null;
            }
            HashMap<String, Object> n10 = tVar.n(str2, str3);
            if (n10 != null) {
                Bundle arguments11 = getArguments();
                if (arguments11 != null) {
                    str5 = arguments11.getString("parentDataSlug");
                } else {
                    str5 = null;
                }
                obj = n10.get(str5);
            } else {
                obj = null;
            }
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.f10942y = arrayList;
            t tVar2 = (t) m0Var.getValue();
            Bundle arguments12 = getArguments();
            if (arguments12 != null) {
                str4 = arguments12.getString("slug");
            } else {
                str4 = null;
            }
            Bundle arguments13 = getArguments();
            if (arguments13 != null) {
                num = Integer.valueOf(arguments13.getInt(Constants.DAYMODEL_POSITION));
            }
            Q(tVar2.m(num, str4));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str10, e11);
        }
    }
}
