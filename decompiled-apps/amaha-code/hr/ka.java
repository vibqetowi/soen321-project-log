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
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS9Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/ka;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ka extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public RobertoEditText f18699v;

    /* renamed from: w  reason: collision with root package name */
    public ImageButton f18700w;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18703z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18698u = LogHelper.INSTANCE.makeLogTag(ka.class);

    /* renamed from: x  reason: collision with root package name */
    public String f18701x = "";

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f18702y = new ArrayList<>();

    @Override // rr.b
    public final boolean I() {
        try {
            RobertoEditText robertoEditText = this.f18699v;
            kotlin.jvm.internal.i.d(robertoEditText);
            if (robertoEditText.hasFocus()) {
                RobertoEditText robertoEditText2 = this.f18699v;
                kotlin.jvm.internal.i.d(robertoEditText2);
                robertoEditText2.clearFocus();
                ImageButton imageButton = this.f18700w;
                kotlin.jvm.internal.i.d(imageButton);
                imageButton.setVisibility(8);
                UiUtils.Companion.showSearch(R.layout.fragment_screen_s9, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18698u, "exception", e10);
            return true;
        }
    }

    public final void J(final RobertoEditText robertoEditText, final ImageButton imageButton) {
        try {
            imageButton.setOnClickListener(new o4(25, robertoEditText, this, imageButton));
            robertoEditText.addTextChangedListener(new a(imageButton, this, robertoEditText));
            robertoEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hr.ja
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    boolean z11;
                    int i6 = ka.A;
                    ka this$0 = this;
                    kotlin.jvm.internal.i.g(this$0, "this$0");
                    RobertoEditText input = robertoEditText;
                    kotlin.jvm.internal.i.g(input, "$input");
                    ImageButton imgAdd = imageButton;
                    kotlin.jvm.internal.i.g(imgAdd, "$imgAdd");
                    if (z10) {
                        this$0.f18699v = input;
                        this$0.f18700w = imgAdd;
                        Editable text = input.getText();
                        if (text != null && !gv.n.B0(text)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            imgAdd.setVisibility(0);
                        }
                        this$0.M("");
                        String obj = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input1)).getText())).toString();
                        String obj2 = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input2)).getText())).toString();
                        String obj3 = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input3)).getText())).toString();
                        ArrayList<String> arrayList = this$0.f18702y;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (!ca.a.k(obj, obj2, obj3).contains((String) obj4)) {
                                arrayList2.add(obj4);
                            }
                        }
                        this$0.K(arrayList2);
                        switch (input.getId()) {
                            case R.id.input1 /* 2131363959 */:
                                UiUtils.Companion.showSearch(R.layout.fragment_screen_s9_1, (ConstraintLayout) this$0._$_findCachedViewById(R.id.constraintRoot), this$0.getActivity());
                                return;
                            case R.id.input2 /* 2131363960 */:
                                UiUtils.Companion.showSearch(R.layout.fragment_screen_s9_2, (ConstraintLayout) this$0._$_findCachedViewById(R.id.constraintRoot), this$0.getActivity());
                                return;
                            case R.id.input3 /* 2131363961 */:
                                UiUtils.Companion.showSearch(R.layout.fragment_screen_s9_3, (ConstraintLayout) this$0._$_findCachedViewById(R.id.constraintRoot), this$0.getActivity());
                                return;
                            default:
                                return;
                        }
                    }
                }
            });
            imageButton.post(new e8(3, imageButton));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18698u, "exception", e10);
        }
    }

    public final void K(ArrayList<String> arrayList) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).removeAllViews();
            for (String str : arrayList) {
                View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSearch)), false);
                ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(str);
                inflate.setOnClickListener(new o4(24, this, inflate, str));
                ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18698u, "exception", e10);
        }
    }

    public final void M(String str) {
        String str2 = this.f18698u;
        try {
            LogHelper.INSTANCE.i(str2, "search text ".concat(str));
            int childCount = ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).getChildAt(i6);
                String lowerCase = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                if (gv.r.J0(lowerCase, str)) {
                    childAt.setVisibility(0);
                } else {
                    childAt.setVisibility(8);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str2, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18703z;
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
        return inflater.inflate(R.layout.fragment_screen_s9, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18703z.clear();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        rr.b g1Var;
        String str2 = this.f18698u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            if (templateActivity.Q) {
                if (templateActivity.W) {
                    g1Var = new i1();
                } else {
                    g1Var = new g1();
                }
                templateActivity.s0(g1Var);
                return;
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView12)).setText(UtilFunKt.paramsMapToString(A0.get("s9_heading")));
            ((RobertoEditText) _$_findCachedViewById(R.id.input1)).setHint(UtilFunKt.paramsMapToString(A0.get("s9_placeholder_one")));
            ((RobertoEditText) _$_findCachedViewById(R.id.input2)).setHint(UtilFunKt.paramsMapToString(A0.get("s9_placeholder_two")));
            ((RobertoEditText) _$_findCachedViewById(R.id.input3)).setHint(UtilFunKt.paramsMapToString(A0.get("s9_placeholder_three")));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(A0.get("s9_btn_two_text")));
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s9_search_list"));
            this.f18702y = paramsMapToList;
            K(paramsMapToList);
            if (A0.containsKey("s9_error")) {
                str = UtilFunKt.paramsMapToString(A0.get("s9_error"));
            } else {
                str = "";
            }
            this.f18701x = str;
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.ha

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ka f18553v;

                {
                    this.f18553v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    String str3;
                    boolean z11;
                    rr.b g1Var2;
                    int i6 = r2;
                    ka this$0 = this.f18553v;
                    switch (i6) {
                        case 0:
                            int i10 = ka.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String obj = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input1)).getText())).toString();
                            String obj2 = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input2)).getText())).toString();
                            String obj3 = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input3)).getText())).toString();
                            boolean z12 = true;
                            if (obj != null && obj.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                if (obj2 != null && obj2.length() != 0) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (!z11) {
                                    if (obj3 != null && obj3.length() != 0) {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(obj);
                                        arrayList.add(obj2);
                                        arrayList.add(obj3);
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity2).F.put("list", arrayList);
                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity3).F.put("list_selection", arrayList);
                                        androidx.fragment.app.p activity4 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        rr.a aVar = (rr.a) activity4;
                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        if (((TemplateActivity) activity5).W) {
                                            g1Var2 = new i1();
                                        } else {
                                            g1Var2 = new g1();
                                        }
                                        aVar.s0(g1Var2);
                                        return;
                                    }
                                }
                            }
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            if (kotlin.jvm.internal.i.b(this$0.f18701x, "")) {
                                str3 = "Select options";
                            } else {
                                str3 = this$0.f18701x;
                            }
                            utils.showCustomToast(activity6, str3);
                            return;
                        default:
                            int i11 = ka.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(16, this$0);
                            a1Var.b();
                            return;
                    }
                }
            });
            try {
                if (templateActivity.J) {
                    HashMap<String, Object> hashMap = templateActivity.F;
                    if (hashMap.containsKey("list_selection")) {
                        final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        Object obj = hashMap.get("list_selection");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        xVar.f23469u = (ArrayList) obj;
                        ((RobertoEditText) _$_findCachedViewById(R.id.input1)).post(new Runnable(this) { // from class: hr.ia

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ ka f18595v;

                            {
                                this.f18595v = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i6 = r3;
                                kotlin.jvm.internal.x selected = xVar;
                                ka this$0 = this.f18595v;
                                switch (i6) {
                                    case 0:
                                        int i10 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input1)).setText((CharSequence) ((ArrayList) selected.f23469u).get(0));
                                        return;
                                    case 1:
                                        int i11 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input2)).setText((CharSequence) ((ArrayList) selected.f23469u).get(1));
                                        return;
                                    default:
                                        int i12 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input3)).setText((CharSequence) ((ArrayList) selected.f23469u).get(2));
                                        return;
                                }
                            }
                        });
                        ((RobertoEditText) _$_findCachedViewById(R.id.input2)).post(new Runnable(this) { // from class: hr.ia

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ ka f18595v;

                            {
                                this.f18595v = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i6 = r3;
                                kotlin.jvm.internal.x selected = xVar;
                                ka this$0 = this.f18595v;
                                switch (i6) {
                                    case 0:
                                        int i10 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input1)).setText((CharSequence) ((ArrayList) selected.f23469u).get(0));
                                        return;
                                    case 1:
                                        int i11 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input2)).setText((CharSequence) ((ArrayList) selected.f23469u).get(1));
                                        return;
                                    default:
                                        int i12 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input3)).setText((CharSequence) ((ArrayList) selected.f23469u).get(2));
                                        return;
                                }
                            }
                        });
                        ((RobertoEditText) _$_findCachedViewById(R.id.input3)).post(new Runnable(this) { // from class: hr.ia

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ ka f18595v;

                            {
                                this.f18595v = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i6 = r3;
                                kotlin.jvm.internal.x selected = xVar;
                                ka this$0 = this.f18595v;
                                switch (i6) {
                                    case 0:
                                        int i10 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input1)).setText((CharSequence) ((ArrayList) selected.f23469u).get(0));
                                        return;
                                    case 1:
                                        int i11 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input2)).setText((CharSequence) ((ArrayList) selected.f23469u).get(1));
                                        return;
                                    default:
                                        int i12 = ka.A;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(selected, "$selected");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.input3)).setText((CharSequence) ((ArrayList) selected.f23469u).get(2));
                                        return;
                                }
                            }
                        });
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, "exception", e10);
            }
            RobertoEditText input1 = (RobertoEditText) _$_findCachedViewById(R.id.input1);
            kotlin.jvm.internal.i.f(input1, "input1");
            ImageButton imgTextAdd1 = (ImageButton) _$_findCachedViewById(R.id.imgTextAdd1);
            kotlin.jvm.internal.i.f(imgTextAdd1, "imgTextAdd1");
            J(input1, imgTextAdd1);
            RobertoEditText input2 = (RobertoEditText) _$_findCachedViewById(R.id.input2);
            kotlin.jvm.internal.i.f(input2, "input2");
            ImageButton imgTextAdd2 = (ImageButton) _$_findCachedViewById(R.id.imgTextAdd2);
            kotlin.jvm.internal.i.f(imgTextAdd2, "imgTextAdd2");
            J(input2, imgTextAdd2);
            RobertoEditText input3 = (RobertoEditText) _$_findCachedViewById(R.id.input3);
            kotlin.jvm.internal.i.f(input3, "input3");
            ImageButton imgTextAdd3 = (ImageButton) _$_findCachedViewById(R.id.imgTextAdd3);
            kotlin.jvm.internal.i.f(imgTextAdd3, "imgTextAdd3");
            J(input3, imgTextAdd3);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.ha

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ka f18553v;

                {
                    this.f18553v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    String str3;
                    boolean z11;
                    rr.b g1Var2;
                    int i6 = r2;
                    ka this$0 = this.f18553v;
                    switch (i6) {
                        case 0:
                            int i10 = ka.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String obj2 = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input1)).getText())).toString();
                            String obj22 = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input2)).getText())).toString();
                            String obj3 = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input3)).getText())).toString();
                            boolean z12 = true;
                            if (obj2 != null && obj2.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                if (obj22 != null && obj22.length() != 0) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (!z11) {
                                    if (obj3 != null && obj3.length() != 0) {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(obj2);
                                        arrayList.add(obj22);
                                        arrayList.add(obj3);
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity2).F.put("list", arrayList);
                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity3).F.put("list_selection", arrayList);
                                        androidx.fragment.app.p activity4 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        rr.a aVar = (rr.a) activity4;
                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        if (((TemplateActivity) activity5).W) {
                                            g1Var2 = new i1();
                                        } else {
                                            g1Var2 = new g1();
                                        }
                                        aVar.s0(g1Var2);
                                        return;
                                    }
                                }
                            }
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            if (kotlin.jvm.internal.i.b(this$0.f18701x, "")) {
                                str3 = "Select options";
                            } else {
                                str3 = this$0.f18701x;
                            }
                            utils.showCustomToast(activity6, str3);
                            return;
                        default:
                            int i11 = ka.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(16, this$0);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 7, templateActivity));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, "exception in on view created", e11);
        }
    }

    /* compiled from: ScreenS9Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ RobertoEditText f18704u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ImageButton f18705v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ka f18706w;

        public a(ImageButton imageButton, ka kaVar, RobertoEditText robertoEditText) {
            this.f18704u = robertoEditText;
            this.f18705v = imageButton;
            this.f18706w = kaVar;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            RobertoEditText robertoEditText = this.f18704u;
            if (String.valueOf(robertoEditText.getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageButton imageButton = this.f18705v;
            if (z10) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
            String lowerCase = String.valueOf(robertoEditText.getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            int i12 = ka.A;
            this.f18706w.M(lowerCase);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
