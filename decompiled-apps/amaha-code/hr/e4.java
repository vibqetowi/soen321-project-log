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
import com.theinnerhour.b2b.model.ScreenResult9Model;
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
/* compiled from: ScreenResult9Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/e4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e4 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18334w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18336v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18335u = LogHelper.INSTANCE.makeLogTag(e4.class);

    public final void J() {
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) _$_findCachedViewById(R.id.ivEllipses));
        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
        a1Var.f1346d = new fq.s(this, 21);
        a1Var.b();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18336v;
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
        return inflater.inflate(R.layout.fragment_screen_result_9, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18336v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0176, code lost:
        if (r7.getData().containsKey("result_9") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0178, code lost:
        r0 = com.theinnerhour.b2b.utils.UtilFunKt.result9MapToObject(r7.getData().get("result_9"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0184, code lost:
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x018c, code lost:
        if ((!r0.isEmpty()) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x018e, code lost:
        r0 = is.u.o2(r0);
        r6.f23469u = r0;
        r13.put("list", ((com.theinnerhour.b2b.model.ScreenResult9Model) r0).getList());
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [T, com.theinnerhour.b2b.model.ScreenResult9Model] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.theinnerhour.b2b.model.ScreenResult9Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        boolean z11;
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult9Model(Utils.INSTANCE.getTimeInSeconds());
            Goal y02 = templateActivity.y0();
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r9_heading")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r9_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(A0.get("r9_btn_two_text")));
            HashMap<String, Object> hashMap = templateActivity.F;
            if (kotlin.jvm.internal.i.b(hashMap.get("log"), Boolean.TRUE)) {
                ((RobertoButton) _$_findCachedViewById(R.id.buttonClose)).setVisibility(0);
                hashMap.put("log", Boolean.FALSE);
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.buttonClose)).setOnClickListener(new c0(templateActivity, 27));
                Object obj = hashMap.get("data");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult9Model");
                xVar.f23469u = (ScreenResult9Model) obj;
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r9_heading")));
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 28));
            } else {
                if (!templateActivity.J && !templateActivity.I) {
                    uVar.f23466u = true;
                    Object obj2 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ((ScreenResult9Model) xVar.f23469u).setList((ArrayList) obj2);
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d4

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ e4 f18309v;

                        {
                            this.f18309v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            e4 this$0 = this.f18309v;
                            switch (i6) {
                                case 0:
                                    int i10 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 1:
                                    int i11 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    if (activity2 != null) {
                                        activity2.onBackPressed();
                                        return;
                                    }
                                    return;
                                case 2:
                                    int i12 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.J();
                                    return;
                                default:
                                    int i13 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    if (activity3 != null) {
                                        activity3.onBackPressed();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d4

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ e4 f18309v;

                        {
                            this.f18309v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            e4 this$0 = this.f18309v;
                            switch (i6) {
                                case 0:
                                    int i10 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 1:
                                    int i11 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    if (activity2 != null) {
                                        activity2.onBackPressed();
                                        return;
                                    }
                                    return;
                                case 2:
                                    int i12 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.J();
                                    return;
                                default:
                                    int i13 = e4.f18334w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    if (activity3 != null) {
                                        activity3.onBackPressed();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d4

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ e4 f18309v;

                    {
                        this.f18309v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        e4 this$0 = this.f18309v;
                        switch (i6) {
                            case 0:
                                int i10 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J();
                                return;
                            case 1:
                                int i11 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                if (activity2 != null) {
                                    activity2.onBackPressed();
                                    return;
                                }
                                return;
                            case 2:
                                int i12 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J();
                                return;
                            default:
                                int i13 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    activity3.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d4

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ e4 f18309v;

                    {
                        this.f18309v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        e4 this$0 = this.f18309v;
                        switch (i6) {
                            case 0:
                                int i10 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J();
                                return;
                            case 1:
                                int i11 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                if (activity2 != null) {
                                    activity2.onBackPressed();
                                    return;
                                }
                                return;
                            case 2:
                                int i12 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J();
                                return;
                            default:
                                int i13 = e4.f18334w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    activity3.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("r9_statement_list"));
            int size = ((ScreenResult9Model) xVar.f23469u).getList().size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowQuestion);
                String str2 = "";
                if (i6 >= paramsMapToList.size()) {
                    str = "";
                } else {
                    str = paramsMapToList.get(i6);
                }
                robertoTextView.setText(str);
                RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.rowAnswer);
                if (i6 < ((ScreenResult9Model) xVar.f23469u).getList().size()) {
                    str2 = ((ScreenResult9Model) xVar.f23469u).getList().get(i6);
                }
                robertoTextView2.setText(str2);
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
            }
            if (A0.containsKey("r9_remember_text")) {
                boolean z12 = true;
                if (((ScreenResult9Model) xVar.f23469u).getList().size() > 1) {
                    String str3 = ((ScreenResult9Model) xVar.f23469u).getList().get(1);
                    kotlin.jvm.internal.i.f(str3, "model.list[1]");
                    int parseInt = Integer.parseInt(str3);
                    if (parseInt >= 0 && parseInt < 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        androidx.fragment.app.p activity3 = getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        View inflate2 = activity3.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                        ((RobertoTextView) inflate2.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_text")));
                        ((RobertoTextView) inflate2.findViewById(R.id.rowAnswer)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_description_low")));
                        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate2);
                    } else {
                        if (4 <= parseInt && parseInt < 7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.d(activity4);
                            View inflate3 = activity4.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                            ((RobertoTextView) inflate3.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_text")));
                            ((RobertoTextView) inflate3.findViewById(R.id.rowAnswer)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_description_moderate")));
                            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate3);
                        } else {
                            if (7 > parseInt || parseInt >= 11) {
                                z12 = false;
                            }
                            if (z12) {
                                androidx.fragment.app.p activity5 = getActivity();
                                kotlin.jvm.internal.i.d(activity5);
                                View inflate4 = activity5.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                                ((RobertoTextView) inflate4.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_text")));
                                ((RobertoTextView) inflate4.findViewById(R.id.rowAnswer)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_description_high")));
                                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate4);
                            }
                        }
                    }
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new c0(templateActivity, 29));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new ek.p((Object) templateActivity, uVar, (Object) "result_9", (Serializable) xVar, (Object) this, 12));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18335u, "Exception", e10);
        }
    }
}
