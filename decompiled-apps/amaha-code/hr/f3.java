package hr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult4Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/f3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f3 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18365x = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f18367v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18368w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18366u = LogHelper.INSTANCE.makeLogTag(f3.class);

    @Override // rr.b
    public final boolean I() {
        TemplateActivity templateActivity;
        boolean z10;
        TemplateActivity templateActivity2;
        boolean z11;
        Intent intent;
        TemplateActivity templateActivity3 = this.f18367v;
        TemplateActivity templateActivity4 = null;
        if (templateActivity3 != null) {
            if (kotlin.jvm.internal.i.b(templateActivity3.F.get("log_back"), Boolean.TRUE)) {
                TemplateActivity templateActivity5 = this.f18367v;
                if (templateActivity5 != null) {
                    androidx.fragment.app.y yVar = templateActivity5.B;
                    kotlin.jvm.internal.i.d(yVar);
                    yVar.W();
                    return false;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            androidx.fragment.app.p activity = getActivity();
            if (activity instanceof TemplateActivity) {
                templateActivity = (TemplateActivity) activity;
            } else {
                templateActivity = null;
            }
            if (templateActivity != null && (intent = templateActivity.getIntent()) != null && intent.hasExtra("source")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TemplateActivity templateActivity6 = this.f18367v;
                if (templateActivity6 != null) {
                    if (r1.b0.c(templateActivity6, "source", "goals")) {
                        androidx.fragment.app.p activity2 = getActivity();
                        if (activity2 instanceof TemplateActivity) {
                            templateActivity2 = (TemplateActivity) activity2;
                        } else {
                            templateActivity2 = null;
                        }
                        if (templateActivity2 != null && !templateActivity2.R) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity3).o0();
                            return false;
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            androidx.fragment.app.p activity4 = getActivity();
            if (activity4 instanceof TemplateActivity) {
                templateActivity4 = (TemplateActivity) activity4;
            }
            if (templateActivity4 != null) {
                templateActivity4.R = false;
            }
            return true;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18368w;
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
        return inflater.inflate(R.layout.fragment_screen_result_4, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18368w.clear();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:20|(2:22|(2:24|(6:26|27|28|29|30|(4:32|(2:34|(2:36|(1:38)(2:41|42))(2:43|44))(2:45|(4:47|48|(1:(3:51|(1:53)|(2:57|(2:59|(1:61)(2:62|63))(2:64|65)))(2:66|67))|(3:69|(1:(2:72|(1:74)(2:75|76))(2:77|78))|(3:55|57|(0)(0)))(2:79|80))(2:81|82))|39|40)(2:83|84)))(2:87|88))|89|27|28|29|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0276, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0277, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r9, "exception in reading list from firebase", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b A[Catch: Exception -> 0x0276, TryCatch #0 {Exception -> 0x0276, blocks: (B:31:0x0137, B:33:0x013b, B:35:0x0149, B:37:0x014d, B:39:0x017f, B:40:0x01b3, B:41:0x01b7, B:42:0x01b8, B:43:0x01bc, B:44:0x01bd, B:46:0x01c1, B:50:0x01c9, B:59:0x01db, B:61:0x01e5, B:63:0x0202, B:65:0x0219, B:66:0x022e, B:67:0x0232, B:68:0x0233, B:69:0x0237, B:53:0x01ce, B:54:0x01d2, B:56:0x01d5, B:71:0x023a, B:73:0x0245, B:74:0x025d, B:75:0x0261, B:76:0x0262, B:77:0x0266, B:78:0x0267, B:79:0x026b, B:80:0x026c, B:81:0x0270, B:82:0x0271, B:83:0x0275), top: B:96:0x0137, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0202 A[Catch: Exception -> 0x0276, TryCatch #0 {Exception -> 0x0276, blocks: (B:31:0x0137, B:33:0x013b, B:35:0x0149, B:37:0x014d, B:39:0x017f, B:40:0x01b3, B:41:0x01b7, B:42:0x01b8, B:43:0x01bc, B:44:0x01bd, B:46:0x01c1, B:50:0x01c9, B:59:0x01db, B:61:0x01e5, B:63:0x0202, B:65:0x0219, B:66:0x022e, B:67:0x0232, B:68:0x0233, B:69:0x0237, B:53:0x01ce, B:54:0x01d2, B:56:0x01d5, B:71:0x023a, B:73:0x0245, B:74:0x025d, B:75:0x0261, B:76:0x0262, B:77:0x0266, B:78:0x0267, B:79:0x026b, B:80:0x026c, B:81:0x0270, B:82:0x0271, B:83:0x0275), top: B:96:0x0137, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0233 A[Catch: Exception -> 0x0276, TryCatch #0 {Exception -> 0x0276, blocks: (B:31:0x0137, B:33:0x013b, B:35:0x0149, B:37:0x014d, B:39:0x017f, B:40:0x01b3, B:41:0x01b7, B:42:0x01b8, B:43:0x01bc, B:44:0x01bd, B:46:0x01c1, B:50:0x01c9, B:59:0x01db, B:61:0x01e5, B:63:0x0202, B:65:0x0219, B:66:0x022e, B:67:0x0232, B:68:0x0233, B:69:0x0237, B:53:0x01ce, B:54:0x01d2, B:56:0x01d5, B:71:0x023a, B:73:0x0245, B:74:0x025d, B:75:0x0261, B:76:0x0262, B:77:0x0266, B:78:0x0267, B:79:0x026b, B:80:0x026c, B:81:0x0270, B:82:0x0271, B:83:0x0275), top: B:96:0x0137, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0271 A[Catch: Exception -> 0x0276, TryCatch #0 {Exception -> 0x0276, blocks: (B:31:0x0137, B:33:0x013b, B:35:0x0149, B:37:0x014d, B:39:0x017f, B:40:0x01b3, B:41:0x01b7, B:42:0x01b8, B:43:0x01bc, B:44:0x01bd, B:46:0x01c1, B:50:0x01c9, B:59:0x01db, B:61:0x01e5, B:63:0x0202, B:65:0x0219, B:66:0x022e, B:67:0x0232, B:68:0x0233, B:69:0x0237, B:53:0x01ce, B:54:0x01d2, B:56:0x01d5, B:71:0x023a, B:73:0x0245, B:74:0x025d, B:75:0x0261, B:76:0x0262, B:77:0x0266, B:78:0x0267, B:79:0x026b, B:80:0x026c, B:81:0x0270, B:82:0x0271, B:83:0x0275), top: B:96:0x0137, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, com.theinnerhour.b2b.model.ScreenResult4Model] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, com.theinnerhour.b2b.model.ScreenResult4Model] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.theinnerhour.b2b.model.ScreenResult4Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        TemplateActivity templateActivity;
        TemplateActivity templateActivity2;
        String str = this.f18366u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult4Model(Utils.INSTANCE.getTimeInSeconds());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity3 = (TemplateActivity) activity;
            this.f18367v = templateActivity3;
            templateActivity3.Q = false;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity4 = this.f18367v;
                if (templateActivity4 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity4.getIntent().getStringExtra("source"), "goals")) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            TemplateActivity templateActivity5 = this.f18367v;
            if (templateActivity5 != null) {
                Goal y02 = templateActivity5.y0();
                TemplateActivity templateActivity6 = this.f18367v;
                if (templateActivity6 != null) {
                    HashMap<String, Object> A0 = templateActivity6.A0();
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(gv.r.i1(UtilFunKt.paramsMapToString(A0.get("r4_heading"))).toString());
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("r4_sub_heading")));
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(A0.get("r4_description")));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r4_btn_one_text")));
                    RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
                    TemplateActivity templateActivity7 = this.f18367v;
                    if (templateActivity7 != null) {
                        if (templateActivity7.getIntent().hasExtra("source")) {
                            TemplateActivity templateActivity8 = this.f18367v;
                            if (templateActivity8 != null) {
                                if (kotlin.jvm.internal.i.b(templateActivity8.getIntent().getStringExtra("source"), "goals")) {
                                    paramsMapToString = "DONE";
                                    robertoButton.setText(paramsMapToString);
                                    kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                                    templateActivity = this.f18367v;
                                    if (templateActivity == null) {
                                        if (kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE)) {
                                            TemplateActivity templateActivity9 = this.f18367v;
                                            if (templateActivity9 != null) {
                                                templateActivity9.F.put("log", Boolean.FALSE);
                                                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                                                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                                                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                                                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setVisibility(8);
                                                TemplateActivity templateActivity10 = this.f18367v;
                                                if (templateActivity10 != null) {
                                                    Object obj = templateActivity10.F.get("data");
                                                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult4Model");
                                                    xVar.f23469u = (ScreenResult4Model) obj;
                                                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                                                    ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                                                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.e3

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ f3 f18333v;

                                                        {
                                                            this.f18333v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i6 = r2;
                                                            f3 this$0 = this.f18333v;
                                                            switch (i6) {
                                                                case 0:
                                                                    int i10 = f3.f18365x;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    TemplateActivity templateActivity11 = this$0.f18367v;
                                                                    if (templateActivity11 != null) {
                                                                        androidx.fragment.app.y yVar = templateActivity11.B;
                                                                        kotlin.jvm.internal.i.d(yVar);
                                                                        yVar.W();
                                                                        return;
                                                                    }
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                case 1:
                                                                    int i11 = f3.f18365x;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                    ((TemplateActivity) activity3).I = false;
                                                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                    ((TemplateActivity) activity4).R = true;
                                                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                    ((TemplateActivity) activity5).onBackPressed();
                                                                    return;
                                                                case 2:
                                                                    int i12 = f3.f18365x;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    Context context = this$0.getContext();
                                                                    kotlin.jvm.internal.i.d(context);
                                                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                                    a1Var.f1346d = new fq.s(this$0, 17);
                                                                    a1Var.b();
                                                                    return;
                                                                default:
                                                                    int i13 = f3.f18365x;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    TemplateActivity templateActivity12 = this$0.f18367v;
                                                                    if (templateActivity12 != null) {
                                                                        if (kotlin.jvm.internal.i.b(templateActivity12.F.get("log_back"), Boolean.TRUE)) {
                                                                            TemplateActivity templateActivity13 = this$0.f18367v;
                                                                            if (templateActivity13 != null) {
                                                                                androidx.fragment.app.y yVar2 = templateActivity13.B;
                                                                                kotlin.jvm.internal.i.d(yVar2);
                                                                                yVar2.W();
                                                                                return;
                                                                            }
                                                                            kotlin.jvm.internal.i.q("act");
                                                                            throw null;
                                                                        }
                                                                        androidx.fragment.app.p activity6 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                        if (((TemplateActivity) activity6).getIntent().hasExtra("source")) {
                                                                            TemplateActivity templateActivity14 = this$0.f18367v;
                                                                            if (templateActivity14 != null) {
                                                                                if (r1.b0.c(templateActivity14, "source", "goals")) {
                                                                                    androidx.fragment.app.p activity7 = this$0.getActivity();
                                                                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                                    ((TemplateActivity) activity7).o0();
                                                                                    return;
                                                                                }
                                                                            } else {
                                                                                kotlin.jvm.internal.i.q("act");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        androidx.fragment.app.p activity8 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                        ((TemplateActivity) activity8).I = false;
                                                                        androidx.fragment.app.p activity9 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                        ((TemplateActivity) activity9).onBackPressed();
                                                                        return;
                                                                    }
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        } else {
                                            TemplateActivity templateActivity11 = this.f18367v;
                                            if (templateActivity11 != null) {
                                                if (templateActivity11.J) {
                                                    if (templateActivity11 != null) {
                                                        if (templateActivity11.S) {
                                                        }
                                                        if (y02 != null && y02.getData().containsKey("result_4")) {
                                                            Object obj2 = y02.getData().get("result_4");
                                                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                                            ?? result4MapToObject = UtilFunKt.result4MapToObject(is.u.o2((ArrayList) obj2));
                                                            xVar.f23469u = result4MapToObject;
                                                            templateActivity2 = this.f18367v;
                                                            if (templateActivity2 == null) {
                                                                templateActivity2.F.put("list", ca.a.k(result4MapToObject.getText()));
                                                                TemplateActivity templateActivity12 = this.f18367v;
                                                                if (templateActivity12 != null) {
                                                                    HashMap<String, Object> hashMap = templateActivity12.F;
                                                                    String text = ((ScreenResult4Model) xVar.f23469u).getText();
                                                                    kotlin.jvm.internal.i.e(text, "null cannot be cast to non-null type kotlin.String");
                                                                    hashMap.put("s18_user_data", text);
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
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
                                                if (templateActivity11 != null) {
                                                    if (!templateActivity11.I) {
                                                        if (templateActivity11 != null) {
                                                            templateActivity11.S = true;
                                                            uVar.f23466u = true;
                                                            ScreenResult4Model screenResult4Model = (ScreenResult4Model) xVar.f23469u;
                                                            if (templateActivity11 != null) {
                                                                Object obj3 = templateActivity11.F.get("list");
                                                                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                                screenResult4Model.setText((String) ((ArrayList) obj3).get(0));
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
                                                        Object obj22 = y02.getData().get("result_4");
                                                        kotlin.jvm.internal.i.e(obj22, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                                        ?? result4MapToObject2 = UtilFunKt.result4MapToObject(is.u.o2((ArrayList) obj22));
                                                        xVar.f23469u = result4MapToObject2;
                                                        templateActivity2 = this.f18367v;
                                                        if (templateActivity2 == null) {
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
                                        ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(((ScreenResult4Model) xVar.f23469u).getText());
                                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.e3

                                            /* renamed from: v  reason: collision with root package name */
                                            public final /* synthetic */ f3 f18333v;

                                            {
                                                this.f18333v = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i6 = r2;
                                                f3 this$0 = this.f18333v;
                                                switch (i6) {
                                                    case 0:
                                                        int i10 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        TemplateActivity templateActivity112 = this$0.f18367v;
                                                        if (templateActivity112 != null) {
                                                            androidx.fragment.app.y yVar = templateActivity112.B;
                                                            kotlin.jvm.internal.i.d(yVar);
                                                            yVar.W();
                                                            return;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    case 1:
                                                        int i11 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity3).I = false;
                                                        androidx.fragment.app.p activity4 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity4).R = true;
                                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity5).onBackPressed();
                                                        return;
                                                    case 2:
                                                        int i12 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        Context context = this$0.getContext();
                                                        kotlin.jvm.internal.i.d(context);
                                                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                        a1Var.f1346d = new fq.s(this$0, 17);
                                                        a1Var.b();
                                                        return;
                                                    default:
                                                        int i13 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        TemplateActivity templateActivity122 = this$0.f18367v;
                                                        if (templateActivity122 != null) {
                                                            if (kotlin.jvm.internal.i.b(templateActivity122.F.get("log_back"), Boolean.TRUE)) {
                                                                TemplateActivity templateActivity13 = this$0.f18367v;
                                                                if (templateActivity13 != null) {
                                                                    androidx.fragment.app.y yVar2 = templateActivity13.B;
                                                                    kotlin.jvm.internal.i.d(yVar2);
                                                                    yVar2.W();
                                                                    return;
                                                                }
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                            androidx.fragment.app.p activity6 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            if (((TemplateActivity) activity6).getIntent().hasExtra("source")) {
                                                                TemplateActivity templateActivity14 = this$0.f18367v;
                                                                if (templateActivity14 != null) {
                                                                    if (r1.b0.c(templateActivity14, "source", "goals")) {
                                                                        androidx.fragment.app.p activity7 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                        ((TemplateActivity) activity7).o0();
                                                                        return;
                                                                    }
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            androidx.fragment.app.p activity8 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            ((TemplateActivity) activity8).I = false;
                                                            androidx.fragment.app.p activity9 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            ((TemplateActivity) activity9).onBackPressed();
                                                            return;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                }
                                            }
                                        });
                                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new ek.p((Object) y02, uVar, (Object) this, (Serializable) "result_4", (Object) xVar, 10));
                                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.e3

                                            /* renamed from: v  reason: collision with root package name */
                                            public final /* synthetic */ f3 f18333v;

                                            {
                                                this.f18333v = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i6 = r2;
                                                f3 this$0 = this.f18333v;
                                                switch (i6) {
                                                    case 0:
                                                        int i10 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        TemplateActivity templateActivity112 = this$0.f18367v;
                                                        if (templateActivity112 != null) {
                                                            androidx.fragment.app.y yVar = templateActivity112.B;
                                                            kotlin.jvm.internal.i.d(yVar);
                                                            yVar.W();
                                                            return;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    case 1:
                                                        int i11 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity3).I = false;
                                                        androidx.fragment.app.p activity4 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity4).R = true;
                                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity5).onBackPressed();
                                                        return;
                                                    case 2:
                                                        int i12 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        Context context = this$0.getContext();
                                                        kotlin.jvm.internal.i.d(context);
                                                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                        a1Var.f1346d = new fq.s(this$0, 17);
                                                        a1Var.b();
                                                        return;
                                                    default:
                                                        int i13 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        TemplateActivity templateActivity122 = this$0.f18367v;
                                                        if (templateActivity122 != null) {
                                                            if (kotlin.jvm.internal.i.b(templateActivity122.F.get("log_back"), Boolean.TRUE)) {
                                                                TemplateActivity templateActivity13 = this$0.f18367v;
                                                                if (templateActivity13 != null) {
                                                                    androidx.fragment.app.y yVar2 = templateActivity13.B;
                                                                    kotlin.jvm.internal.i.d(yVar2);
                                                                    yVar2.W();
                                                                    return;
                                                                }
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                            androidx.fragment.app.p activity6 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            if (((TemplateActivity) activity6).getIntent().hasExtra("source")) {
                                                                TemplateActivity templateActivity14 = this$0.f18367v;
                                                                if (templateActivity14 != null) {
                                                                    if (r1.b0.c(templateActivity14, "source", "goals")) {
                                                                        androidx.fragment.app.p activity7 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                        ((TemplateActivity) activity7).o0();
                                                                        return;
                                                                    }
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            androidx.fragment.app.p activity8 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            ((TemplateActivity) activity8).I = false;
                                                            androidx.fragment.app.p activity9 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            ((TemplateActivity) activity9).onBackPressed();
                                                            return;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                }
                                            }
                                        });
                                        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.e3

                                            /* renamed from: v  reason: collision with root package name */
                                            public final /* synthetic */ f3 f18333v;

                                            {
                                                this.f18333v = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i6 = r2;
                                                f3 this$0 = this.f18333v;
                                                switch (i6) {
                                                    case 0:
                                                        int i10 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        TemplateActivity templateActivity112 = this$0.f18367v;
                                                        if (templateActivity112 != null) {
                                                            androidx.fragment.app.y yVar = templateActivity112.B;
                                                            kotlin.jvm.internal.i.d(yVar);
                                                            yVar.W();
                                                            return;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    case 1:
                                                        int i11 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity3).I = false;
                                                        androidx.fragment.app.p activity4 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity4).R = true;
                                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                        ((TemplateActivity) activity5).onBackPressed();
                                                        return;
                                                    case 2:
                                                        int i12 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        Context context = this$0.getContext();
                                                        kotlin.jvm.internal.i.d(context);
                                                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                        a1Var.f1346d = new fq.s(this$0, 17);
                                                        a1Var.b();
                                                        return;
                                                    default:
                                                        int i13 = f3.f18365x;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        TemplateActivity templateActivity122 = this$0.f18367v;
                                                        if (templateActivity122 != null) {
                                                            if (kotlin.jvm.internal.i.b(templateActivity122.F.get("log_back"), Boolean.TRUE)) {
                                                                TemplateActivity templateActivity13 = this$0.f18367v;
                                                                if (templateActivity13 != null) {
                                                                    androidx.fragment.app.y yVar2 = templateActivity13.B;
                                                                    kotlin.jvm.internal.i.d(yVar2);
                                                                    yVar2.W();
                                                                    return;
                                                                }
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                            androidx.fragment.app.p activity6 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            if (((TemplateActivity) activity6).getIntent().hasExtra("source")) {
                                                                TemplateActivity templateActivity14 = this$0.f18367v;
                                                                if (templateActivity14 != null) {
                                                                    if (r1.b0.c(templateActivity14, "source", "goals")) {
                                                                        androidx.fragment.app.p activity7 = this$0.getActivity();
                                                                        kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                                        ((TemplateActivity) activity7).o0();
                                                                        return;
                                                                    }
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            androidx.fragment.app.p activity8 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            ((TemplateActivity) activity8).I = false;
                                                            androidx.fragment.app.p activity9 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                            ((TemplateActivity) activity9).onBackPressed();
                                                            return;
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
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r4_btn_two_text"));
                        robertoButton.setText(paramsMapToString);
                        kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                        templateActivity = this.f18367v;
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
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "Exception", e10);
        }
    }
}
