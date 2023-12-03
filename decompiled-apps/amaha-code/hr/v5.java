package hr;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.Metadata;
/* compiled from: ScreenS148Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/v5;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v5 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19292y = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f19294v;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f19296x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19293u = LogHelper.INSTANCE.makeLogTag(v5.class);

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f19295w = new ArrayList<>();

    public final void J(String str, String str2) {
        try {
            View inflate = getLayoutInflater().inflate(R.layout.row_edittext, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
            RobertoEditText robertoEditText = (RobertoEditText) inflate;
            robertoEditText.setHint(str);
            robertoEditText.setId(new Random().nextInt());
            robertoEditText.setText(str2);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(robertoEditText);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19293u, "exception", e10);
        }
    }

    public final void K() {
        boolean z10;
        ArrayList<String> arrayList = this.f19295w;
        arrayList.clear();
        int childCount = ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).getChildAt(i6);
            kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
            RobertoEditText robertoEditText = (RobertoEditText) childAt;
            Editable text = robertoEditText.getText();
            if (text != null && !gv.n.B0(text)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                arrayList.add(String.valueOf(robertoEditText.getText()));
            }
        }
        TemplateActivity templateActivity = this.f19294v;
        if (templateActivity != null) {
            templateActivity.F.put("s148_user_data", arrayList);
        } else {
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19296x;
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
        return inflater.inflate(R.layout.fragment_screen_s148, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19296x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3 = this.f19293u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f19294v = (TemplateActivity) activity;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            final HashMap<String, Object> A0 = ((TemplateActivity) activity2).A0();
            LogHelper.INSTANCE.i(str3, "on view created");
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.t5

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ v5 f19203v;

                {
                    this.f19203v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    v5 this$0 = this.f19203v;
                    switch (i6) {
                        case 0:
                            int i10 = v5.f19292y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 26);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = v5.f19292y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            TemplateActivity templateActivity = this$0.f19294v;
                            if (templateActivity != null) {
                                templateActivity.s0(new b0());
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        default:
                            int i12 = v5.f19292y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            TemplateActivity templateActivity2 = this$0.f19294v;
                            if (templateActivity2 != null) {
                                templateActivity2.t0();
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                    }
                }
            });
            Object obj = A0.get("s148_heading");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS148Heading)).setText((String) obj);
            Object obj2 = A0.get("s148_btn_one_text");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
            ((RobertoButton) _$_findCachedViewById(R.id.btnS148ButtonOne)).setText((String) obj2);
            Object obj3 = A0.get("s148_btn_two_text");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
            ((RobertoButton) _$_findCachedViewById(R.id.btnS148ButtonTwo)).setText((String) obj3);
            ArrayList arrayList = new ArrayList();
            TemplateActivity templateActivity = this.f19294v;
            if (templateActivity != null) {
                if (templateActivity.J) {
                    if (templateActivity != null) {
                        if (templateActivity.F.containsKey("s148_user_data")) {
                            TemplateActivity templateActivity2 = this.f19294v;
                            if (templateActivity2 != null) {
                                Object obj4 = templateActivity2.F.get("s148_user_data");
                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                                arrayList = (ArrayList) obj4;
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                String paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s148_placeholder_one"));
                String str4 = "";
                if (arrayList.size() <= 0) {
                    str = "";
                } else {
                    str = (String) arrayList.get(0);
                }
                kotlin.jvm.internal.i.f(str, "if (userAdded.size > 0) userAdded[0] else \"\"");
                J(paramsMapToString, str);
                String paramsMapToString2 = UtilFunKt.paramsMapToString(A0.get("s148_placeholder_two"));
                if (arrayList.size() <= 1) {
                    str2 = "";
                } else {
                    str2 = (String) arrayList.get(1);
                }
                kotlin.jvm.internal.i.f(str2, "if (userAdded.size > 1) userAdded[1] else \"\"");
                J(paramsMapToString2, str2);
                String paramsMapToString3 = UtilFunKt.paramsMapToString(A0.get("s148_placeholder_three"));
                if (arrayList.size() > 2) {
                    str4 = (String) arrayList.get(2);
                }
                kotlin.jvm.internal.i.f(str4, "if (userAdded.size > 2) userAdded[2] else \"\"");
                J(paramsMapToString3, str4);
                if (arrayList.size() > 3) {
                    int size = arrayList.size();
                    for (int i6 = 3; i6 < size; i6++) {
                        String paramsMapToString4 = UtilFunKt.paramsMapToString(A0.get("s148_placeholder_generic"));
                        Object obj5 = arrayList.get(i6);
                        kotlin.jvm.internal.i.f(obj5, "userAdded[i]");
                        J(paramsMapToString4, (String) obj5);
                    }
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.floatingActionButton)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u5

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ v5 f19241v;

                    {
                        this.f19241v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        rr.b t2Var;
                        boolean z10;
                        int i10 = r3;
                        HashMap params = A0;
                        v5 this$0 = this.f19241v;
                        switch (i10) {
                            case 0:
                                int i11 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(params, "$params");
                                this$0.J(UtilFunKt.paramsMapToString(params.get("s148_placeholder_generic")), "");
                                return;
                            default:
                                int i12 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(params, "$params");
                                ArrayList<String> arrayList2 = this$0.f19295w;
                                arrayList2.clear();
                                int childCount = ((LinearLayout) this$0._$_findCachedViewById(R.id.linearLayout)).getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt = ((LinearLayout) this$0._$_findCachedViewById(R.id.linearLayout)).getChildAt(i13);
                                    kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                                    RobertoEditText robertoEditText = (RobertoEditText) childAt;
                                    Editable text = robertoEditText.getText();
                                    if (text != null && !gv.n.B0(text)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        if (params.containsKey("s148_error_input")) {
                                            Utils utils = Utils.INSTANCE;
                                            TemplateActivity templateActivity3 = this$0.f19294v;
                                            if (templateActivity3 != null) {
                                                utils.showCustomToast(templateActivity3, UtilFunKt.paramsMapToString(params.get("s148_error_input")));
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        }
                                        Utils utils2 = Utils.INSTANCE;
                                        TemplateActivity templateActivity4 = this$0.f19294v;
                                        if (templateActivity4 != null) {
                                            String string = this$0.getResources().getString(R.string.enter_text);
                                            kotlin.jvm.internal.i.f(string, "resources.getString(R.string.enter_text)");
                                            utils2.showCustomToast(templateActivity4, string);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    arrayList2.add(String.valueOf(robertoEditText.getText()));
                                }
                                if (arrayList2.size() < 3) {
                                    Utils utils3 = Utils.INSTANCE;
                                    TemplateActivity templateActivity5 = this$0.f19294v;
                                    if (templateActivity5 != null) {
                                        String string2 = this$0.getResources().getString(R.string.atleast_3_options_to_add);
                                        kotlin.jvm.internal.i.f(string2, "resources.getString(R.st…atleast_3_options_to_add)");
                                        utils3.showCustomToast(templateActivity5, string2);
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                TemplateActivity templateActivity6 = this$0.f19294v;
                                if (templateActivity6 != null) {
                                    templateActivity6.F.put("s148_user_data", arrayList2);
                                    TemplateActivity templateActivity7 = this$0.f19294v;
                                    if (templateActivity7 != null) {
                                        HashMap<String, Object> hashMap = templateActivity7.F;
                                        ScreenResult30Model screenResult30Model = new ScreenResult30Model(Utils.INSTANCE.getTimeInSeconds());
                                        screenResult30Model.setList(arrayList2);
                                        hashMap.put("screen_model_30", screenResult30Model);
                                        TemplateActivity templateActivity8 = this$0.f19294v;
                                        if (templateActivity8 != null) {
                                            androidx.fragment.app.p activity3 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            if (((TemplateActivity) activity3).W) {
                                                t2Var = new v2();
                                            } else {
                                                t2Var = new t2();
                                            }
                                            templateActivity8.s0(t2Var);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                        }
                    }
                });
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.t5

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ v5 f19203v;

                    {
                        this.f19203v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i62 = r2;
                        v5 this$0 = this.f19203v;
                        switch (i62) {
                            case 0:
                                int i10 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Context context = this$0.getContext();
                                kotlin.jvm.internal.i.d(context);
                                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                a1Var.f1346d = new fq.s(this$0, 26);
                                a1Var.b();
                                return;
                            case 1:
                                int i11 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K();
                                TemplateActivity templateActivity3 = this$0.f19294v;
                                if (templateActivity3 != null) {
                                    templateActivity3.s0(new b0());
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            default:
                                int i12 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                TemplateActivity templateActivity22 = this$0.f19294v;
                                if (templateActivity22 != null) {
                                    templateActivity22.t0();
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.btnS148ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.t5

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ v5 f19203v;

                    {
                        this.f19203v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i62 = r2;
                        v5 this$0 = this.f19203v;
                        switch (i62) {
                            case 0:
                                int i10 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Context context = this$0.getContext();
                                kotlin.jvm.internal.i.d(context);
                                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                a1Var.f1346d = new fq.s(this$0, 26);
                                a1Var.b();
                                return;
                            case 1:
                                int i11 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K();
                                TemplateActivity templateActivity3 = this$0.f19294v;
                                if (templateActivity3 != null) {
                                    templateActivity3.s0(new b0());
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            default:
                                int i12 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                TemplateActivity templateActivity22 = this$0.f19294v;
                                if (templateActivity22 != null) {
                                    templateActivity22.t0();
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.btnS148ButtonTwo)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u5

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ v5 f19241v;

                    {
                        this.f19241v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        rr.b t2Var;
                        boolean z10;
                        int i10 = r3;
                        HashMap params = A0;
                        v5 this$0 = this.f19241v;
                        switch (i10) {
                            case 0:
                                int i11 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(params, "$params");
                                this$0.J(UtilFunKt.paramsMapToString(params.get("s148_placeholder_generic")), "");
                                return;
                            default:
                                int i12 = v5.f19292y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(params, "$params");
                                ArrayList<String> arrayList2 = this$0.f19295w;
                                arrayList2.clear();
                                int childCount = ((LinearLayout) this$0._$_findCachedViewById(R.id.linearLayout)).getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt = ((LinearLayout) this$0._$_findCachedViewById(R.id.linearLayout)).getChildAt(i13);
                                    kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                                    RobertoEditText robertoEditText = (RobertoEditText) childAt;
                                    Editable text = robertoEditText.getText();
                                    if (text != null && !gv.n.B0(text)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        if (params.containsKey("s148_error_input")) {
                                            Utils utils = Utils.INSTANCE;
                                            TemplateActivity templateActivity3 = this$0.f19294v;
                                            if (templateActivity3 != null) {
                                                utils.showCustomToast(templateActivity3, UtilFunKt.paramsMapToString(params.get("s148_error_input")));
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        }
                                        Utils utils2 = Utils.INSTANCE;
                                        TemplateActivity templateActivity4 = this$0.f19294v;
                                        if (templateActivity4 != null) {
                                            String string = this$0.getResources().getString(R.string.enter_text);
                                            kotlin.jvm.internal.i.f(string, "resources.getString(R.string.enter_text)");
                                            utils2.showCustomToast(templateActivity4, string);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    arrayList2.add(String.valueOf(robertoEditText.getText()));
                                }
                                if (arrayList2.size() < 3) {
                                    Utils utils3 = Utils.INSTANCE;
                                    TemplateActivity templateActivity5 = this$0.f19294v;
                                    if (templateActivity5 != null) {
                                        String string2 = this$0.getResources().getString(R.string.atleast_3_options_to_add);
                                        kotlin.jvm.internal.i.f(string2, "resources.getString(R.st…atleast_3_options_to_add)");
                                        utils3.showCustomToast(templateActivity5, string2);
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                TemplateActivity templateActivity6 = this$0.f19294v;
                                if (templateActivity6 != null) {
                                    templateActivity6.F.put("s148_user_data", arrayList2);
                                    TemplateActivity templateActivity7 = this$0.f19294v;
                                    if (templateActivity7 != null) {
                                        HashMap<String, Object> hashMap = templateActivity7.F;
                                        ScreenResult30Model screenResult30Model = new ScreenResult30Model(Utils.INSTANCE.getTimeInSeconds());
                                        screenResult30Model.setList(arrayList2);
                                        hashMap.put("screen_model_30", screenResult30Model);
                                        TemplateActivity templateActivity8 = this$0.f19294v;
                                        if (templateActivity8 != null) {
                                            androidx.fragment.app.p activity3 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            if (((TemplateActivity) activity3).W) {
                                                t2Var = new v2();
                                            } else {
                                                t2Var = new t2();
                                            }
                                            templateActivity8.s0(t2Var);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                        }
                    }
                });
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str3, "exception", e10);
        }
    }
}
