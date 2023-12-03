package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ol.g;
import pl.g0;
import ql.t;
import rr.d;
/* compiled from: N30ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N30ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N30ScreenFragment extends d {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f11045z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f11048y = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11046w = LogHelper.INSTANCE.makeLogTag("N30ScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11047x = b0.j(this, y.a(t.class), new a(this), new b(this), new c(this));

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11049u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f11049u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11049u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11050u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11050u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11050u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11051u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11051u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11051u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.b
    public final boolean I() {
        NewDynamicParentActivity newDynamicParentActivity;
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            newDynamicParentActivity.v0();
            return false;
        }
        return false;
    }

    @Override // rr.d
    public final void K() {
        NewDynamicParentActivity newDynamicParentActivity;
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

    public final t P() {
        return (t) this.f11047x.getValue();
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.f11048y.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f11048y;
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
        return inflater.inflate(R.layout.fragment_n30_screen, viewGroup, false);
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
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str2;
        String str3;
        Boolean bool;
        Object obj5;
        String str4;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            t P = P();
            Bundle arguments = getArguments();
            ArrayList arrayList = null;
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
            HashMap m10 = P.m(num, str);
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                try {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) newDynamicParentActivity.u0(R.id.parentNavBarBackButton);
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageResource(R.drawable.ic_features_cross);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(newDynamicParentActivity.f10901w, e10);
                }
                if (m10 != null) {
                    obj4 = m10.get("cta1");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str2, null, null, null, 14);
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    str3 = arguments3.getString("cta_slug");
                } else {
                    str3 = null;
                }
                newDynamicParentActivity.E0(str3);
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    bool = Boolean.valueOf(arguments4.getBoolean("show_info_button"));
                } else {
                    bool = null;
                }
                newDynamicParentActivity.O0(bool);
                if (m10 != null) {
                    obj5 = m10.get("heading");
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof String) {
                    str4 = (String) obj5;
                } else {
                    str4 = null;
                }
                newDynamicParentActivity.I0(str4);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN30ScreenDescription);
            if (m10 != null) {
                obj = m10.get("description");
            } else {
                obj = null;
            }
            robertoTextView.setText((String) obj);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN30ScreenDoLaterCta);
            if (m10 != null) {
                obj2 = m10.get("cta2");
            } else {
                obj2 = null;
            }
            robertoTextView2.setText((String) obj2);
            if (m10 != null) {
                obj3 = m10.get("items");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof ArrayList) {
                arrayList = (ArrayList) obj3;
            }
            if (arrayList != null) {
                ((RecyclerView) _$_findCachedViewById(R.id.rvN30ScreenListView)).setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
                p requireActivity2 = requireActivity();
                i.f(requireActivity2, "requireActivity()");
                ((RecyclerView) _$_findCachedViewById(R.id.rvN30ScreenListView)).setAdapter(new g(requireActivity2, arrayList, new g0(this)));
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN30ScreenDoLaterCta)).setOnClickListener(new ol.k(4, this));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f11046w, e11);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
