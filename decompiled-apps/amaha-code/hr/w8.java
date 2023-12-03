package hr;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS77Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/w8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w8 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19358y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f19362x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19359u = LogHelper.INSTANCE.makeLogTag(w8.class);

    /* renamed from: v  reason: collision with root package name */
    public final HashSet<String> f19360v = new HashSet<>();

    /* renamed from: w  reason: collision with root package name */
    public String f19361w = "";

    public w8() {
        new ArrayList();
    }

    @Override // rr.b
    public final boolean I() {
        boolean z10;
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etS77Edit);
        if (robertoEditText != null && robertoEditText.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etS77Edit);
        if (robertoEditText2 != null) {
            robertoEditText2.clearFocus();
        }
        UiUtils.Companion.showSearch(R.layout.fragment_screen_s77, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
        return false;
    }

    public final void J(String str) {
        try {
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS77List)), false);
            ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(str);
            ((LinearLayout) _$_findCachedViewById(R.id.llS77List)).addView(inflate);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19359u, "exception in add RadioButton", e10);
        }
    }

    public final void K(String str) {
        HashSet<String> hashSet = this.f19360v;
        try {
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                J(str);
                ((ScrollView) _$_findCachedViewById(R.id.scrollview)).postDelayed(new e8(1, this), 500L);
            } else {
                I();
                Utils.INSTANCE.showCustomToast(requireActivity(), "Item Already Exists");
            }
            M();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19359u, "exception", e10);
        }
    }

    public final void M() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.etS77Edit)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            RobertoEditText etS77Edit = (RobertoEditText) _$_findCachedViewById(R.id.etS77Edit);
            kotlin.jvm.internal.i.f(etS77Edit, "etS77Edit");
            ((TemplateActivity) activity).D0(requireContext, etS77Edit);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19362x;
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
        return inflater.inflate(R.layout.fragment_screen_s77, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19362x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            this.f19361w = B0;
            int hashCode = B0.hashCode();
            if (hashCode != 112275) {
                if (hashCode != 3474628) {
                    if (hashCode == 3474654 && B0.equals("s122")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS77Header)).setText(UtilFunKt.paramsMapToString(A0.get("s77_heading")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS77Button)).setText(UtilFunKt.paramsMapToString(A0.get("s77_btn_text")));
                    }
                } else if (B0.equals("s117")) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS77Header)).setText(UtilFunKt.paramsMapToString(A0.get("s77_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS77Button)).setText(UtilFunKt.paramsMapToString(A0.get("s77_btn_text")));
                    ((RobertoEditText) _$_findCachedViewById(R.id.etS77Edit)).setHint(UtilFunKt.paramsMapToString(A0.get("s77_placeholder")));
                }
            } else if (B0.equals("s77")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS77Header)).setText(UtilFunKt.paramsMapToString(A0.get("s77_heading")));
                ((RobertoEditText) _$_findCachedViewById(R.id.etS77Edit)).setHint(UtilFunKt.paramsMapToString(A0.get("s77_placeholder")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS77Button)).setText(UtilFunKt.paramsMapToString(A0.get("s77_btn_text")));
            }
            boolean z10 = templateActivity.J;
            HashSet<String> hashSet = this.f19360v;
            if (z10) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s77_user_list")) {
                    Object obj = hashMap.get("s77_user_list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    hashSet.addAll((ArrayList) obj);
                }
            }
            for (String str : hashSet) {
                J(str);
            }
            ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.v8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ w8 f19302v;

                {
                    this.f19302v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z11;
                    int i6 = r2;
                    w8 this$0 = this.f19302v;
                    switch (i6) {
                        case 0:
                            int i10 = w8.f19358y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etS77Edit)).getText());
                            if (gv.r.i1(valueOf).toString().length() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && !kotlin.jvm.internal.i.b(gv.r.i1(valueOf).toString(), "")) {
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.etS77Edit)).setText("");
                                this$0.K(valueOf);
                                return;
                            }
                            Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                            return;
                        default:
                            int i11 = w8.f19358y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(11, this$0);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((RobertoEditText) _$_findCachedViewById(R.id.etS77Edit)).addTextChangedListener(new a());
            ((RobertoEditText) _$_findCachedViewById(R.id.etS77Edit)).setOnFocusChangeListener(new dc.b(14, this));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS77Edit)).setOnEditorActionListener(new dl.w(15, this));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS77Button)).setOnClickListener(new o4(templateActivity, this, A0));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            if (kotlin.jvm.internal.i.b(this.f19361w, "s77")) {
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.v8

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ w8 f19302v;

                    {
                        this.f19302v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z11;
                        int i6 = r2;
                        w8 this$0 = this.f19302v;
                        switch (i6) {
                            case 0:
                                int i10 = w8.f19358y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etS77Edit)).getText());
                                if (gv.r.i1(valueOf).toString().length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11 && !kotlin.jvm.internal.i.b(gv.r.i1(valueOf).toString(), "")) {
                                    ((RobertoEditText) this$0._$_findCachedViewById(R.id.etS77Edit)).setText("");
                                    this$0.K(valueOf);
                                    return;
                                }
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            default:
                                int i11 = w8.f19358y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                a1Var.f1346d = new hd.a(11, this$0);
                                a1Var.b();
                                return;
                        }
                    }
                });
            } else {
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19359u, "Exception in on view created", e10);
        }
    }

    /* compiled from: ScreenS77Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            w8 w8Var = w8.this;
            if (String.valueOf(((RobertoEditText) w8Var._$_findCachedViewById(R.id.etS77Edit)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) w8Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) w8Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(((RobertoEditText) w8Var._$_findCachedViewById(R.id.etS77Edit)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) w8Var._$_findCachedViewById(R.id.llSearch)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) w8Var._$_findCachedViewById(R.id.llSearch)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(w8Var.f19359u, "exception", e10);
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
