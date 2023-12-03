package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.Dialog;
import android.graphics.Bitmap;
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
import com.google.android.material.bottomsheet.e;
import com.google.android.material.bottomsheet.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.r;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.y;
import ol.k;
import pl.a0;
import ql.t;
/* compiled from: N1ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N1ScreenFragment;", "Lrr/d;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N1ScreenFragment extends rr.d {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11017w = LogHelper.INSTANCE.makeLogTag("N1ScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11018x = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));

    /* renamed from: y  reason: collision with root package name */
    public a f11019y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, Object> f11020z;

    /* compiled from: N1ScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {

        /* renamed from: y  reason: collision with root package name */
        public static final /* synthetic */ int f11021y = 0;

        /* renamed from: u  reason: collision with root package name */
        public final HashMap<String, Object> f11022u;

        /* renamed from: w  reason: collision with root package name */
        public e f11024w;

        /* renamed from: x  reason: collision with root package name */
        public final LinkedHashMap f11025x = new LinkedHashMap();

        /* renamed from: v  reason: collision with root package name */
        public final String f11023v = LogHelper.INSTANCE.makeLogTag("HelpTextBottomSheetFragment");

        public a(HashMap hashMap) {
            this.f11022u = hashMap;
        }

        public final View _$_findCachedViewById(int i6) {
            View findViewById;
            LinkedHashMap linkedHashMap = this.f11025x;
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

        @Override // com.google.android.material.bottomsheet.f, g.s, androidx.fragment.app.n
        public final Dialog onCreateDialog(Bundle bundle) {
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            i.e(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            this.f11024w = (e) onCreateDialog;
            setStyle(0, R.style.TransparentBottomSheetDialog);
            e eVar = this.f11024w;
            if (eVar != null) {
                eVar.setOnShowListener(new a0(this, 0));
                e eVar2 = this.f11024w;
                if (eVar2 != null) {
                    return eVar2;
                }
                i.q("dialog");
                throw null;
            }
            i.q("dialog");
            throw null;
        }

        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
            i.g(inflater, "inflater");
            return inflater.inflate(R.layout.layout_n2_screen_help_dialog, viewGroup, false);
        }

        @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
        public final void onDestroyView() {
            super.onDestroyView();
            this.f11025x.clear();
        }

        @Override // androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            Object obj;
            Object obj2;
            i.g(view, "view");
            super.onViewCreated(view, bundle);
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivN2ScreenHelpDialogClose)).setOnClickListener(new k(3, this));
            try {
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN2ScreenHelpDialogTitle);
                HashMap<String, Object> hashMap = this.f11022u;
                ArrayList arrayList = null;
                if (hashMap != null) {
                    obj = hashMap.get("popup_heading");
                } else {
                    obj = null;
                }
                robertoTextView.setText((String) obj);
                if (hashMap != null) {
                    obj2 = hashMap.get("popup_description_list");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof ArrayList) {
                    arrayList = (ArrayList) obj2;
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        View inflate = getLayoutInflater().inflate(R.layout.row_n2_description_list_view, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llN2ScreenHelpDialogDescriptionView)), false);
                        ((RobertoTextView) inflate.findViewById(R.id.tvN2ScreenHelpDialogDescription)).setText((CharSequence) ((HashMap) it.next()).get("list_key"));
                        ((LinearLayout) _$_findCachedViewById(R.id.llN2ScreenHelpDialogDescriptionView)).addView(inflate);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11023v, e10);
            }
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11026u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11026u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11026u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11027u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11027u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11027u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11028u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11028u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11028u, "requireActivity().defaultViewModelProviderFactory");
        }
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

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.A.clear();
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n1_screen, viewGroup, false);
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
        Object obj;
        NewDynamicParentActivity newDynamicParentActivity;
        String str2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        NewDynamicParentActivity newDynamicParentActivity2;
        Object obj7;
        String str3;
        String str4;
        NewDynamicParentActivity newDynamicParentActivity3;
        NewDynamicParentActivity newDynamicParentActivity4;
        NewDynamicParentActivity newDynamicParentActivity5;
        NewDynamicParentActivity newDynamicParentActivity6;
        int i6;
        Integer w02;
        Integer w03;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        t tVar = (t) this.f11018x.getValue();
        Bundle arguments = getArguments();
        Boolean bool = null;
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
        HashMap<String, Object> m10 = tVar.m(num, str);
        this.f11020z = m10;
        String str5 = "";
        String str6 = this.f11017w;
        if (m10 != null) {
            try {
                obj = m10.get(Constants.SCREEN_PROGRESS);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str6, "exception", e10);
            }
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str4 = (String) obj;
        } else {
            str4 = null;
        }
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity3 = null;
        }
        if (newDynamicParentActivity3 != null) {
            newDynamicParentActivity3.I0("");
        }
        if (str4 != null) {
            int i10 = 0;
            List a12 = r.a1(str4, new String[]{"/"}, 0, 6);
            String str7 = (String) u.j2(0, a12);
            String str8 = (String) u.j2(1, a12);
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity5 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity5 = null;
            }
            if (newDynamicParentActivity5 != null) {
                newDynamicParentActivity5.M0();
            }
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity6 = (NewDynamicParentActivity) requireActivity3;
            } else {
                newDynamicParentActivity6 = null;
            }
            if (newDynamicParentActivity6 != null) {
                if (str7 != null && (w03 = m.w0(str7)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = 0;
                }
                if (str8 != null && (w02 = m.w0(str8)) != null) {
                    i10 = w02.intValue();
                }
                newDynamicParentActivity6.G0(i6, i10);
            }
        } else {
            p requireActivity4 = requireActivity();
            if (requireActivity4 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity4;
            } else {
                newDynamicParentActivity4 = null;
            }
            if (newDynamicParentActivity4 != null) {
                newDynamicParentActivity4.y0();
            }
        }
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN1ScreenTitle);
            HashMap<String, Object> hashMap = this.f11020z;
            if (hashMap != null) {
                obj2 = hashMap.get("heading");
            } else {
                obj2 = null;
            }
            robertoTextView.setText((String) obj2);
            StringBuilder sb2 = new StringBuilder("");
            HashMap<String, Object> hashMap2 = this.f11020z;
            if (hashMap2 != null) {
                obj3 = hashMap2.get("description1");
            } else {
                obj3 = null;
            }
            String str9 = (String) obj3;
            if (str9 == null) {
                str9 = "";
            }
            sb2.append(str9);
            sb2.append("\n\n");
            HashMap<String, Object> hashMap3 = this.f11020z;
            if (hashMap3 != null) {
                obj4 = hashMap3.get("description2");
            } else {
                obj4 = null;
            }
            String str10 = (String) obj4;
            if (str10 != null) {
                str5 = str10;
            }
            sb2.append(str5);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN1ScreenDescription)).setText(sb2.toString());
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN1ScreenHelpCta);
            HashMap<String, Object> hashMap4 = this.f11020z;
            if (hashMap4 != null) {
                obj5 = hashMap4.get("cta1");
            } else {
                obj5 = null;
            }
            robertoTextView2.setText((String) obj5);
            com.bumptech.glide.e<Bitmap> a10 = Glide.i(requireActivity()).a();
            HashMap<String, Object> hashMap5 = this.f11020z;
            if (hashMap5 != null) {
                obj6 = hashMap5.get("image");
            } else {
                obj6 = null;
            }
            a10.Z = (String) obj6;
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN1Screen));
            p requireActivity5 = requireActivity();
            if (requireActivity5 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity5;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                HashMap<String, Object> hashMap6 = this.f11020z;
                if (hashMap6 != null) {
                    obj7 = hashMap6.get("cta2");
                } else {
                    obj7 = null;
                }
                if (obj7 instanceof String) {
                    str3 = (String) obj7;
                } else {
                    str3 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity2, str3, null, null, null, 14);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str6, e11);
        }
        try {
            getArguments();
            this.f11019y = new a(this.f11020z);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN1ScreenHelpCta)).setOnClickListener(new k(2, this));
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str6, e12);
        }
        p requireActivity6 = requireActivity();
        if (requireActivity6 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity6;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            newDynamicParentActivity.J0();
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str2 = arguments3.getString("cta_slug");
            } else {
                str2 = null;
            }
            newDynamicParentActivity.E0(str2);
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                bool = Boolean.valueOf(arguments4.getBoolean("show_info_button"));
            }
            newDynamicParentActivity.O0(bool);
            newDynamicParentActivity.H0(true);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
