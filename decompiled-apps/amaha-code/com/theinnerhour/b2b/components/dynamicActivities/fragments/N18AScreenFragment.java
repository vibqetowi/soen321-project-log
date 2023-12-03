package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N18AListModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.n;
import gv.m;
import ik.j1;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
import ss.l;
/* compiled from: N18AScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N18AScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N18AScreenFragment extends rr.d {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y  reason: collision with root package name */
    public N18AListModel f10996y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f10997z = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final m0 f10994w = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));

    /* renamed from: x  reason: collision with root package name */
    public final String f10995x = LogHelper.INSTANCE.makeLogTag("N18AScreenFragment");

    /* compiled from: N18AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<N18AListModel, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(N18AListModel n18AListModel) {
            N18AListModel model = n18AListModel;
            i.g(model, "model");
            N18AScreenFragment n18AScreenFragment = N18AScreenFragment.this;
            n18AScreenFragment.f10996y = model;
            RecyclerView.e adapter = ((RecyclerView) n18AScreenFragment._$_findCachedViewById(R.id.rVN18AScreenTimeSelector)).getAdapter();
            i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dynamicActivities.adapter.N18AScreenListAdapter");
            ol.d dVar = (ol.d) adapter;
            N18AListModel n18AListModel2 = n18AScreenFragment.f10996y;
            i.d(n18AListModel2);
            dVar.f27621z = n18AListModel2;
            dVar.i();
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10999u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f10999u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f10999u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11000u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11000u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11000u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11001u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11001u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11001u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.b
    public final boolean I() {
        WindowManager.LayoutParams layoutParams;
        if (((t) this.f10994w.getValue()).F.isEmpty()) {
            return true;
        }
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_new_dynamic_exit, requireActivity(), R.style.Theme_Dialog);
        Window window = styledDialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
        }
        RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(R.id.yes);
        if (robertoTextView != null) {
            robertoTextView.setOnClickListener(new j1(styledDialog, 28, this));
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(R.id.f39931no);
        if (robertoTextView2 != null) {
            robertoTextView2.setOnClickListener(new n(styledDialog, 18));
        }
        styledDialog.show();
        return false;
    }

    @Override // rr.d
    public final void K() {
        String str;
        String str2;
        int i6;
        String noOfLoops;
        Integer w02;
        try {
            if (this.f10996y != null) {
                Bundle arguments = getArguments();
                NewDynamicParentActivity newDynamicParentActivity = null;
                if (arguments != null) {
                    str = arguments.getString("screenId");
                } else {
                    str = null;
                }
                t tVar = (t) this.f10994w.getValue();
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str2 = arguments2.getString("slug");
                } else {
                    str2 = null;
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                String str3 = "n18a_data_" + str;
                N18AListModel n18AListModel = this.f10996y;
                if (n18AListModel != null && (noOfLoops = n18AListModel.getNoOfLoops()) != null && (w02 = m.w0(noOfLoops)) != null) {
                    i6 = w02.intValue();
                } else {
                    i6 = 1;
                }
                hashMap.put(str3, Integer.valueOf(i6));
                hs.k kVar = hs.k.f19476a;
                tVar.s(str2, str, hashMap);
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
            Toast.makeText(requireContext(), "Please select a time slot", 0).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10995x, e10);
        }
    }

    public final void P() {
        String str;
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList<HashMap> arrayList;
        NewDynamicParentActivity newDynamicParentActivity;
        Object obj5;
        N18AListModel n18AListModel;
        String str2;
        String str3;
        String str4;
        NewDynamicParentActivity newDynamicParentActivity2;
        Object obj6;
        String str5;
        String str6 = this.f10995x;
        try {
            t tVar = (t) this.f10994w.getValue();
            Bundle arguments = getArguments();
            String str7 = null;
            if (arguments != null) {
                str = arguments.getString("slug");
            } else {
                str = null;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                num = Integer.valueOf(arguments2.getInt(Constants.DAYMODEL_POSITION));
            } else {
                num = null;
            }
            HashMap m10 = tVar.m(num, str);
            ((RecyclerView) _$_findCachedViewById(R.id.rVN18AScreenTimeSelector)).setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
            try {
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity2 = null;
                }
                if (newDynamicParentActivity2 != null) {
                    if (m10 != null) {
                        obj6 = m10.get("heading");
                    } else {
                        obj6 = null;
                    }
                    if (obj6 instanceof String) {
                        str5 = (String) obj6;
                    } else {
                        str5 = null;
                    }
                    newDynamicParentActivity2.I0(str5);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str6, "exception", e10);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN18AScreenTitle);
            if (m10 != null) {
                obj = m10.get("title");
            } else {
                obj = null;
            }
            robertoTextView.setText((String) obj);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN18AScreenSubText);
            if (m10 != null) {
                obj2 = m10.get("subtext");
            } else {
                obj2 = null;
            }
            robertoTextView2.setText((String) obj2);
            e<Bitmap> a10 = Glide.i(requireActivity()).a();
            if (m10 != null) {
                obj3 = m10.get("image");
            } else {
                obj3 = null;
            }
            a10.Z = (String) obj3;
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN18AScreen));
            if (m10 != null) {
                obj4 = m10.get("item_list");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof ArrayList) {
                arrayList = (ArrayList) obj4;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (HashMap hashMap : arrayList) {
                    if (hashMap instanceof HashMap) {
                        Object obj7 = hashMap.get("loop_count");
                        if (obj7 instanceof String) {
                            str2 = (String) obj7;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "1";
                        }
                        Object obj8 = hashMap.get("duration");
                        if (obj8 instanceof String) {
                            str3 = (String) obj8;
                        } else {
                            str3 = null;
                        }
                        String str8 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        Object obj9 = hashMap.get("subtext");
                        if (obj9 instanceof String) {
                            str4 = (String) obj9;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            str8 = str4;
                        }
                        n18AListModel = new N18AListModel(str2, str3, str8);
                    } else {
                        n18AListModel = null;
                    }
                    if (n18AListModel != null) {
                        arrayList2.add(n18AListModel);
                    }
                }
                if (this.f10996y == null) {
                    this.f10996y = (N18AListModel) u.i2(arrayList2);
                }
                ((RecyclerView) _$_findCachedViewById(R.id.rVN18AScreenTimeSelector)).setAdapter(new ol.d(arrayList2, new a(), this.f10996y));
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                if (m10 != null) {
                    obj5 = m10.get("cta1");
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof String) {
                    str7 = (String) obj5;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str7, null, null, null, 14);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str6, e11);
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.f10997z.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f10997z;
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
        return inflater.inflate(R.layout.fragment_n18_a_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            P();
            p requireActivity = requireActivity();
            Boolean bool = null;
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                newDynamicParentActivity.E0("cta_type_1");
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    bool = Boolean.valueOf(arguments.getBoolean("show_info_button"));
                }
                newDynamicParentActivity2.O0(bool);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10995x, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
