package hr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/g1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g1 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18430x = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f18432v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18433w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18431u = LogHelper.INSTANCE.makeLogTag(g1.class);

    @Override // rr.b
    public final boolean I() {
        TemplateActivity templateActivity;
        boolean z10;
        TemplateActivity templateActivity2;
        String str;
        TemplateActivity templateActivity3;
        Goal y02;
        TemplateActivity templateActivity4 = this.f18432v;
        TemplateActivity templateActivity5 = null;
        if (templateActivity4 != null) {
            if (kotlin.jvm.internal.i.b(templateActivity4.F.get("log_back"), Boolean.TRUE)) {
                TemplateActivity templateActivity6 = this.f18432v;
                if (templateActivity6 != null) {
                    androidx.fragment.app.y yVar = templateActivity6.B;
                    kotlin.jvm.internal.i.d(yVar);
                    yVar.W();
                    return false;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            TemplateActivity templateActivity7 = this.f18432v;
            if (templateActivity7 != null) {
                if (templateActivity7.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity8 = this.f18432v;
                    if (templateActivity8 != null) {
                        if (r1.b0.c(templateActivity8, "source", "goals")) {
                            androidx.fragment.app.p activity = getActivity();
                            if (activity instanceof TemplateActivity) {
                                templateActivity = (TemplateActivity) activity;
                            } else {
                                templateActivity = null;
                            }
                            if (templateActivity != null && !templateActivity.R) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                androidx.fragment.app.p activity2 = getActivity();
                                if (activity2 instanceof TemplateActivity) {
                                    templateActivity2 = (TemplateActivity) activity2;
                                } else {
                                    templateActivity2 = null;
                                }
                                if (templateActivity2 != null && (y02 = templateActivity2.y0()) != null) {
                                    str = y02.getGoalId();
                                } else {
                                    str = null;
                                }
                                if (kotlin.jvm.internal.i.b(str, "AskzVbMafuaqKJtzT9g9")) {
                                    androidx.fragment.app.p activity3 = getActivity();
                                    if (activity3 instanceof TemplateActivity) {
                                        templateActivity3 = (TemplateActivity) activity3;
                                    } else {
                                        templateActivity3 = null;
                                    }
                                    if (templateActivity3 != null) {
                                        templateActivity3.I = false;
                                    }
                                    androidx.fragment.app.p activity4 = getActivity();
                                    if (activity4 instanceof TemplateActivity) {
                                        templateActivity5 = (TemplateActivity) activity4;
                                    }
                                    if (templateActivity5 != null) {
                                        templateActivity5.R = true;
                                    }
                                    return true;
                                }
                                androidx.fragment.app.p activity5 = getActivity();
                                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity5).o0();
                                return false;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                androidx.fragment.app.p activity6 = getActivity();
                if (activity6 instanceof TemplateActivity) {
                    templateActivity5 = (TemplateActivity) activity6;
                }
                if (templateActivity5 != null) {
                    templateActivity5.R = false;
                }
                return true;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18433w;
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
        return inflater.inflate(R.layout.fragment_screen_result_1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18433w.clear();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:24|(2:26|(2:28|(6:30|31|32|33|34|(8:36|37|(2:39|(2:41|(2:43|(1:45)(2:53|54))(2:55|56))(2:57|58))(2:59|(4:61|62|(1:(3:65|(1:67)|(2:71|(2:73|(2:75|(1:77)(2:78|79))(2:80|81))))(2:82|83))|(3:85|(1:(2:88|(2:90|(4:92|(1:94)(1:97)|95|96)(2:98|99))(2:100|101))(2:102|103))|(3:69|71|(0)))(2:104|105))(2:106|107))|46|(2:49|47)|50|51|52)(2:108|109)))(2:112|113))|114|31|32|33|34|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0266, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0267, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r8, "exception", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0261 A[Catch: Exception -> 0x0266, TryCatch #0 {Exception -> 0x0266, blocks: (B:35:0x010c, B:37:0x0110, B:40:0x0120, B:42:0x0124, B:44:0x015a, B:46:0x0172, B:47:0x0184, B:48:0x0188, B:49:0x0189, B:50:0x018d, B:51:0x018e, B:52:0x0192, B:53:0x0193, B:55:0x0197, B:59:0x019f, B:68:0x01b1, B:70:0x01bb, B:72:0x01cf, B:74:0x01d9, B:76:0x01e8, B:77:0x01f9, B:78:0x01fd, B:79:0x01fe, B:80:0x0202, B:62:0x01a4, B:63:0x01a8, B:65:0x01ab, B:82:0x0205, B:84:0x0210, B:86:0x0226, B:88:0x0232, B:89:0x0238, B:91:0x0244, B:90:0x023d, B:92:0x0248, B:93:0x024c, B:94:0x024d, B:95:0x0251, B:96:0x0252, B:97:0x0256, B:98:0x0257, B:99:0x025b, B:100:0x025c, B:101:0x0260, B:102:0x0261, B:103:0x0265), top: B:118:0x010c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110 A[Catch: Exception -> 0x0266, TRY_LEAVE, TryCatch #0 {Exception -> 0x0266, blocks: (B:35:0x010c, B:37:0x0110, B:40:0x0120, B:42:0x0124, B:44:0x015a, B:46:0x0172, B:47:0x0184, B:48:0x0188, B:49:0x0189, B:50:0x018d, B:51:0x018e, B:52:0x0192, B:53:0x0193, B:55:0x0197, B:59:0x019f, B:68:0x01b1, B:70:0x01bb, B:72:0x01cf, B:74:0x01d9, B:76:0x01e8, B:77:0x01f9, B:78:0x01fd, B:79:0x01fe, B:80:0x0202, B:62:0x01a4, B:63:0x01a8, B:65:0x01ab, B:82:0x0205, B:84:0x0210, B:86:0x0226, B:88:0x0232, B:89:0x0238, B:91:0x0244, B:90:0x023d, B:92:0x0248, B:93:0x024c, B:94:0x024d, B:95:0x0251, B:96:0x0252, B:97:0x0256, B:98:0x0257, B:99:0x025b, B:100:0x025c, B:101:0x0260, B:102:0x0261, B:103:0x0265), top: B:118:0x010c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf A[Catch: Exception -> 0x0266, TryCatch #0 {Exception -> 0x0266, blocks: (B:35:0x010c, B:37:0x0110, B:40:0x0120, B:42:0x0124, B:44:0x015a, B:46:0x0172, B:47:0x0184, B:48:0x0188, B:49:0x0189, B:50:0x018d, B:51:0x018e, B:52:0x0192, B:53:0x0193, B:55:0x0197, B:59:0x019f, B:68:0x01b1, B:70:0x01bb, B:72:0x01cf, B:74:0x01d9, B:76:0x01e8, B:77:0x01f9, B:78:0x01fd, B:79:0x01fe, B:80:0x0202, B:62:0x01a4, B:63:0x01a8, B:65:0x01ab, B:82:0x0205, B:84:0x0210, B:86:0x0226, B:88:0x0232, B:89:0x0238, B:91:0x0244, B:90:0x023d, B:92:0x0248, B:93:0x024c, B:94:0x024d, B:95:0x0251, B:96:0x0252, B:97:0x0256, B:98:0x0257, B:99:0x025b, B:100:0x025c, B:101:0x0260, B:102:0x0261, B:103:0x0265), top: B:118:0x010c, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, com.theinnerhour.b2b.model.ScreenResult1Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        TemplateActivity templateActivity;
        Object obj;
        ArrayList<ScreenResult1Model> result1ListMapToObject;
        String str;
        String str2 = this.f18431u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity2 = (TemplateActivity) activity;
            this.f18432v = templateActivity2;
            templateActivity2.Q = false;
            Goal y02 = templateActivity2.y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult1Model(Utils.INSTANCE.getTimeInSeconds());
            TemplateActivity templateActivity3 = this.f18432v;
            if (templateActivity3 != null) {
                HashMap<String, Object> A0 = templateActivity3.A0();
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity4 = this.f18432v;
                    if (templateActivity4 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity4.getIntent().getStringExtra("source"), "goals")) {
                            if (y02 != null) {
                                str = y02.getGoalId();
                            } else {
                                str = null;
                            }
                            if (!kotlin.jvm.internal.i.b(str, "AskzVbMafuaqKJtzT9g9")) {
                                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.textView9)).setText(UtilFunKt.paramsMapToString(A0.get("r1_heading")));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r1_btn_one_text")));
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
                TemplateActivity templateActivity5 = this.f18432v;
                if (templateActivity5 != null) {
                    if (templateActivity5.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity6 = this.f18432v;
                        if (templateActivity6 != null) {
                            if (kotlin.jvm.internal.i.b(templateActivity6.getIntent().getStringExtra("source"), "goals")) {
                                paramsMapToString = "DONE";
                                robertoButton.setText(paramsMapToString);
                                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                                templateActivity = this.f18432v;
                                if (templateActivity == null) {
                                    if (kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE)) {
                                        TemplateActivity templateActivity7 = this.f18432v;
                                        if (templateActivity7 != null) {
                                            templateActivity7.F.put("log", Boolean.FALSE);
                                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                                            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                                            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setVisibility(8);
                                            ScreenResult1Model screenResult1Model = (ScreenResult1Model) xVar.f23469u;
                                            TemplateActivity templateActivity8 = this.f18432v;
                                            if (templateActivity8 != null) {
                                                Object obj2 = templateActivity8.F.get("qus");
                                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                screenResult1Model.setHeadings((ArrayList) obj2);
                                                ScreenResult1Model screenResult1Model2 = (ScreenResult1Model) xVar.f23469u;
                                                TemplateActivity templateActivity9 = this.f18432v;
                                                if (templateActivity9 != null) {
                                                    Object obj3 = templateActivity9.F.get("ans");
                                                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                    screenResult1Model2.setList((ArrayList) obj3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    } else {
                                        TemplateActivity templateActivity10 = this.f18432v;
                                        if (templateActivity10 != null) {
                                            if (templateActivity10.J) {
                                                if (templateActivity10 != null) {
                                                    if (templateActivity10.S) {
                                                    }
                                                    if (y02 != null && y02.getData().containsKey("result_1")) {
                                                        result1ListMapToObject = UtilFunKt.result1ListMapToObject(y02.getData().get("result_1"));
                                                        if (!result1ListMapToObject.isEmpty()) {
                                                            ?? o22 = is.u.o2(result1ListMapToObject);
                                                            xVar.f23469u = o22;
                                                            TemplateActivity templateActivity11 = this.f18432v;
                                                            if (templateActivity11 != null) {
                                                                templateActivity11.F.put("list", ((ScreenResult1Model) o22).getList());
                                                                TemplateActivity templateActivity12 = this.f18432v;
                                                                if (templateActivity12 != null) {
                                                                    templateActivity12.F.put("list_selection", ((ScreenResult1Model) xVar.f23469u).getList());
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            }
                                            if (templateActivity10 != null) {
                                                if (!templateActivity10.I) {
                                                    if (templateActivity10 != null) {
                                                        templateActivity10.S = true;
                                                        uVar.f23466u = true;
                                                        ScreenResult1Model screenResult1Model3 = (ScreenResult1Model) xVar.f23469u;
                                                        if (templateActivity10 != null) {
                                                            Object obj4 = templateActivity10.F.get("list");
                                                            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                            screenResult1Model3.setList((ArrayList) obj4);
                                                            ScreenResult1Model screenResult1Model4 = (ScreenResult1Model) xVar.f23469u;
                                                            TemplateActivity templateActivity13 = this.f18432v;
                                                            if (templateActivity13 != null) {
                                                                if (kotlin.jvm.internal.i.b(templateActivity13.B0(), "s9")) {
                                                                    obj = A0.get("r1_heading_list");
                                                                } else {
                                                                    obj = A0.get("r1_sub_heading_list");
                                                                }
                                                                screenResult1Model4.setHeadings(UtilFunKt.paramsMapToList(obj));
                                                            } else {
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                        } else {
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                    } else {
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                }
                                                if (y02 != null) {
                                                    result1ListMapToObject = UtilFunKt.result1ListMapToObject(y02.getData().get("result_1"));
                                                    if (!result1ListMapToObject.isEmpty()) {
                                                    }
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                    Iterator<String> it = ((ScreenResult1Model) xVar.f23469u).getList().iterator();
                                    int i6 = 0;
                                    while (it.hasNext()) {
                                        androidx.fragment.app.p activity3 = getActivity();
                                        kotlin.jvm.internal.i.d(activity3);
                                        View inflate = activity3.getLayoutInflater().inflate(R.layout.row_result1, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearlayout)), false);
                                        ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(((ScreenResult1Model) xVar.f23469u).getHeadings().get(i6));
                                        ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(it.next());
                                        ((LinearLayout) _$_findCachedViewById(R.id.linearlayout)).addView(inflate);
                                        i6++;
                                    }
                                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.f1

                                        /* renamed from: v  reason: collision with root package name */
                                        public final /* synthetic */ g1 f18361v;

                                        {
                                            this.f18361v = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i10 = r2;
                                            g1 this$0 = this.f18361v;
                                            switch (i10) {
                                                case 0:
                                                    int i11 = g1.f18430x;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity4).I = false;
                                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity5).R = true;
                                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity6).onBackPressed();
                                                    return;
                                                default:
                                                    int i12 = g1.f18430x;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    Context context = this$0.getContext();
                                                    kotlin.jvm.internal.i.d(context);
                                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                    a1Var.f1346d = new fq.s(this$0, 9);
                                                    a1Var.b();
                                                    return;
                                            }
                                        }
                                    });
                                    ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new tk.q((Object) this, (Object) uVar, (Object) xVar, (Serializable) "result_1", 17));
                                    ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new sq.p(this, 4, y02));
                                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.f1

                                        /* renamed from: v  reason: collision with root package name */
                                        public final /* synthetic */ g1 f18361v;

                                        {
                                            this.f18361v = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i10 = r2;
                                            g1 this$0 = this.f18361v;
                                            switch (i10) {
                                                case 0:
                                                    int i11 = g1.f18430x;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity4).I = false;
                                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity5).R = true;
                                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity6).onBackPressed();
                                                    return;
                                                default:
                                                    int i12 = g1.f18430x;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    Context context = this$0.getContext();
                                                    kotlin.jvm.internal.i.d(context);
                                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                    a1Var.f1346d = new fq.s(this$0, 9);
                                                    a1Var.b();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r1_btn_two_text"));
                    robertoButton.setText(paramsMapToString);
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                    kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                    templateActivity = this.f18432v;
                    if (templateActivity == null) {
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str2, "exception on view created", e10);
        }
    }
}
