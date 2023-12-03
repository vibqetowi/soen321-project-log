package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.n;
import gv.m;
import gv.r;
import is.u;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import pl.w0;
import ql.t;
import rr.d;
/* compiled from: N9AScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N9AScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N9AScreenFragment extends d {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f11084z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f11087y = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final m0 f11085w = b0.j(this, y.a(t.class), new a(this), new b(this), new c(this));

    /* renamed from: x  reason: collision with root package name */
    public final String f11086x = LogHelper.INSTANCE.makeLogTag("N9AScreenFragment");

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11088u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f11088u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11088u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11089u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11089u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11089u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11090u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11090u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11090u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.b
    public final boolean I() {
        WindowManager.LayoutParams layoutParams;
        if (((t) this.f11085w.getValue()).F.isEmpty()) {
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
            robertoTextView.setOnClickListener(new w0(styledDialog, 0, this));
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(R.id.f39931no);
        if (robertoTextView2 != null) {
            robertoTextView2.setOnClickListener(new n(styledDialog, 20));
        }
        styledDialog.show();
        return false;
    }

    @Override // rr.d
    public final void K() {
        NewDynamicParentActivity newDynamicParentActivity;
        try {
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11086x, e10);
        }
    }

    public final void P() {
        String str;
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        NewDynamicParentActivity newDynamicParentActivity;
        Object obj4;
        try {
            t tVar = (t) this.f11085w.getValue();
            Bundle arguments = getArguments();
            String str2 = null;
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
            Q(m10);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN9AScreenDescription1);
            if (m10 != null) {
                obj = m10.get("description1");
            } else {
                obj = null;
            }
            robertoTextView.setText((String) obj);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN9AScreenDescription2);
            if (m10 != null) {
                obj2 = m10.get("description2");
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
            a10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN9AScreen));
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                if (m10 != null) {
                    obj4 = m10.get("cta");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str2, null, null, null, 14);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11086x, e10);
        }
    }

    public final void Q(HashMap<String, Object> hashMap) {
        Object obj;
        String str;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        int i6;
        Integer w02;
        Integer w03;
        Object obj2;
        String str2;
        NewDynamicParentActivity newDynamicParentActivity3 = null;
        if (hashMap != null) {
            try {
                obj = hashMap.get(Constants.SCREEN_PROGRESS);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11086x, "exception", e10);
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
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            if (hashMap != null) {
                obj2 = hashMap.get("heading");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            newDynamicParentActivity.I0(str2);
        }
        if (str != null) {
            int i10 = 0;
            List a12 = r.a1(str, new String[]{"/"}, 0, 6);
            String str3 = (String) u.j2(0, a12);
            String str4 = (String) u.j2(1, a12);
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                newDynamicParentActivity2.M0();
            }
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
            }
            if (newDynamicParentActivity3 != null) {
                if (str3 != null && (w03 = m.w0(str3)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = 0;
                }
                if (str4 != null && (w02 = m.w0(str4)) != null) {
                    i10 = w02.intValue();
                }
                newDynamicParentActivity3.G0(i6, i10);
                return;
            }
            return;
        }
        p requireActivity4 = requireActivity();
        if (requireActivity4 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity4;
        }
        if (newDynamicParentActivity3 != null) {
            newDynamicParentActivity3.y0();
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.f11087y.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f11087y;
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
        return inflater.inflate(R.layout.fragment_n9_a_screen, viewGroup, false);
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
        String str;
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
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str = arguments.getString("cta_slug");
                } else {
                    str = null;
                }
                newDynamicParentActivity.E0(str);
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    bool = Boolean.valueOf(arguments2.getBoolean("show_info_button"));
                }
                newDynamicParentActivity2.O0(bool);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11086x, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
