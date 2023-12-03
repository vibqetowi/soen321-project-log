package hr;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS109Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/m4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m4 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18820z = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18823w;

    /* renamed from: x  reason: collision with root package name */
    public FirestoreGoal f18824x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18825y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18821u = LogHelper.INSTANCE.makeLogTag(m4.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18822v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new d(this), new e(this), new f(this));

    /* compiled from: ScreenS109Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
            if (((java.lang.Boolean) r3.f19464u).booleanValue() == true) goto L5;
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                z10 = true;
            }
            z10 = false;
            if (z10) {
                m4 m4Var = m4.this;
                m4Var.f18824x = (FirestoreGoal) fVar2.f19465v;
                m4Var.K();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS109Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool != null) {
                m4.this.J().s0(new p6());
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS109Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<String, String> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f18828u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18829v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18830w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f18831x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f18832y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f18833z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super(1);
            this.f18828u = str;
            this.f18829v = str2;
            this.f18830w = str3;
            this.f18831x = str4;
            this.f18832y = str5;
            this.f18833z = str6;
            this.A = str7;
            this.B = str8;
            this.C = str9;
        }

        @Override // ss.l
        public final String invoke(String str) {
            String str2 = str;
            kotlin.jvm.internal.i.g(str2, "str");
            String minus0 = this.f18828u;
            kotlin.jvm.internal.i.f(minus0, "minus0");
            String F0 = gv.n.F0(str2, "%minus_zero%", minus0);
            String minus1 = this.f18829v;
            kotlin.jvm.internal.i.f(minus1, "minus1");
            String F02 = gv.n.F0(F0, "%minus_one%", minus1);
            String minus2 = this.f18830w;
            kotlin.jvm.internal.i.f(minus2, "minus2");
            String F03 = gv.n.F0(F02, "%minus_two%", minus2);
            String minus3 = this.f18831x;
            kotlin.jvm.internal.i.f(minus3, "minus3");
            String F04 = gv.n.F0(F03, "%minus_three%", minus3);
            String minus4 = this.f18832y;
            kotlin.jvm.internal.i.f(minus4, "minus4");
            String F05 = gv.n.F0(F04, "%minus_four%", minus4);
            String minus5 = this.f18833z;
            kotlin.jvm.internal.i.f(minus5, "minus5");
            String F06 = gv.n.F0(F05, "%minus_five%", minus5);
            String minus6 = this.A;
            kotlin.jvm.internal.i.f(minus6, "minus6");
            String F07 = gv.n.F0(F06, "%minus_six%", minus6);
            String minus7 = this.B;
            kotlin.jvm.internal.i.f(minus7, "minus7");
            String F08 = gv.n.F0(F07, "%minus_seven%", minus7);
            String minus8 = this.C;
            kotlin.jvm.internal.i.f(minus8, "minus8");
            return gv.n.F0(F08, "%minus_eight%", minus8);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18834u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18834u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18834u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18835u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18835u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18835u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18836u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f18836u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18836u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final TemplateActivity J() {
        TemplateActivity templateActivity = this.f18823w;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v35, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v38, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v41, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v44, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v47, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.util.ArrayList] */
    public final void K() {
        Object obj;
        Calendar calendar;
        HashMap<String, Object> hashMap;
        kotlin.jvm.internal.x xVar;
        c cVar;
        ArrayList<String> arrayList;
        String str;
        String str2;
        String str3;
        HashMap<String, Object> data;
        String str4;
        try {
            boolean z10 = true;
            if (J().Q) {
                if (J().W) {
                    FirestoreGoal firestoreGoal = this.f18824x;
                    if (firestoreGoal != null) {
                        str4 = firestoreGoal.getDataTypeKey();
                    } else {
                        str4 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str4, "result_8")) {
                        J().s0(new b4());
                        return;
                    } else {
                        J().s0(new p6());
                        return;
                    }
                }
                Goal y02 = J().y0();
                if (y02 == null || (data = y02.getData()) == null || !data.containsKey("result_8")) {
                    z10 = false;
                }
                if (z10) {
                    J().s0(new z3());
                } else {
                    J().s0(new p6());
                }
            } else if (J().J && J().getIntent().hasExtra("source")) {
                J().getOnBackPressedDispatcher().b();
            } else {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
                ((RobertoButton) _$_findCachedViewById(R.id.btns109Button)).setText(UtilFunKt.paramsMapToString(A0.get("s109_btn_text")));
                Object obj2 = J().F.get("none_of_those");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvS109Header);
                if (!booleanValue) {
                    obj = A0.get("s109_heading");
                } else {
                    obj = A0.get("s109b_heading");
                }
                robertoTextView.setText(UtilFunKt.paramsMapToString(obj));
                Object obj3 = J().F.get("selected_list");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList<String> arrayList2 = (ArrayList) obj3;
                ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s108_list"));
                ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s109_goal_description_list"));
                kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                xVar2.f23469u = new HashSet();
                if (J().J && J().F.containsKey("s109_user_list")) {
                    Object obj4 = J().F.get("s109_user_list");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>");
                    xVar2.f23469u = (HashSet) obj4;
                }
                if (kotlin.jvm.internal.i.b(J().B0(), "s92-d")) {
                    Object obj5 = J().F.get("sleep_time");
                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.Calendar");
                    calendar = (Calendar) obj5;
                } else {
                    calendar = Calendar.getInstance();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
                String format = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format2 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format3 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format4 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format5 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format6 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format7 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format8 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, -1);
                String format9 = simpleDateFormat.format(calendar.getTime());
                calendar.add(11, 8);
                c cVar2 = new c(format, format2, format3, format4, format5, format6, format7, format8, format9);
                final kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                final kotlin.jvm.internal.x xVar4 = new kotlin.jvm.internal.x();
                final kotlin.jvm.internal.x xVar5 = new kotlin.jvm.internal.x();
                final kotlin.jvm.internal.x xVar6 = new kotlin.jvm.internal.x();
                final kotlin.jvm.internal.x xVar7 = new kotlin.jvm.internal.x();
                if (!booleanValue) {
                    xVar3.f23469u = UtilFunKt.paramsMapToList(A0.get("s109_popup3_title_list"));
                    xVar4.f23469u = UtilFunKt.paramsMapToList(A0.get("s109_popup3_description_list"));
                    xVar5.f23469u = UtilFunKt.paramsMapToList(A0.get("s109_popup3_example_title_list"));
                    xVar6.f23469u = UtilFunKt.paramsMapToList(A0.get("s109_popup3_example_description_list"));
                    xVar7.f23469u = UtilFunKt.paramsMapToString(A0.get("s109_popup3_btn_text"));
                } else {
                    xVar3.f23469u = UtilFunKt.paramsMapToList(A0.get("s109b_popup3_title_list"));
                    xVar4.f23469u = UtilFunKt.paramsMapToList(A0.get("s109b_popup3_description_list"));
                    xVar5.f23469u = UtilFunKt.paramsMapToList(A0.get("s109b_popup3_example_title_list"));
                    xVar6.f23469u = UtilFunKt.paramsMapToList(A0.get("s109b_popup3_example_description_list"));
                    xVar7.f23469u = UtilFunKt.paramsMapToString(A0.get("s109b_popup3_btn_text"));
                }
                String str5 = "descriptions[index]";
                int i6 = R.id.linearLayout;
                if (booleanValue) {
                    _$_findCachedViewById(R.id.divider).setVisibility(8);
                    Iterator<String> it = paramsMapToList.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        int i11 = i10 + 1;
                        final String next = it.next();
                        final kotlin.jvm.internal.x xVar8 = xVar5;
                        final kotlin.jvm.internal.x xVar9 = xVar4;
                        View inflate = J().getLayoutInflater().inflate(R.layout.row_s109, (ViewGroup) ((LinearLayout) _$_findCachedViewById(i6)), false);
                        ((AppCompatImageView) inflate.findViewById(R.id.imageView_left)).setVisibility(8);
                        ((RobertoTextView) inflate.findViewById(R.id.tvRowTitle)).setText(next);
                        if (kotlin.jvm.internal.i.b(J().B0(), "s92-d")) {
                            String str6 = paramsMapToList2.get(i10);
                            kotlin.jvm.internal.i.f(str6, str5);
                            str3 = cVar2.invoke(str6);
                        } else {
                            if (paramsMapToList2.size() - 1 >= i10) {
                                str3 = paramsMapToList2.get(i10);
                            } else {
                                str3 = "";
                            }
                            kotlin.jvm.internal.i.f(str3, "{\n                      … \"\"\n                    }");
                        }
                        ((RobertoTextView) inflate.findViewById(R.id.tvRowDesc)).setText(str3);
                        ((TextView) inflate.findViewById(R.id.tvUnderline)).setVisibility(4);
                        final kotlin.jvm.internal.x xVar10 = xVar3;
                        kotlin.jvm.internal.x xVar11 = xVar3;
                        final int i12 = i10;
                        final kotlin.jvm.internal.x xVar12 = xVar6;
                        ((AppCompatImageView) inflate.findViewById(R.id.imageView_right)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.l4

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ m4 f18741v;

                            {
                                this.f18741v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str7;
                                String str8;
                                String str9;
                                String str10;
                                String str11;
                                String str12;
                                String str13;
                                String str14;
                                int i13 = r9;
                                int i14 = i12;
                                kotlin.jvm.internal.x popupBtn = xVar7;
                                kotlin.jvm.internal.x popupExampleTextList = xVar12;
                                kotlin.jvm.internal.x popupExampleList = xVar8;
                                kotlin.jvm.internal.x popupDescriptionList = xVar9;
                                String tt2 = next;
                                kotlin.jvm.internal.x popupHeadingList = xVar10;
                                m4 this$0 = this.f18741v;
                                switch (i13) {
                                    case 0:
                                        int i15 = m4.f18820z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(popupHeadingList, "$popupHeadingList");
                                        kotlin.jvm.internal.i.g(tt2, "$tt");
                                        kotlin.jvm.internal.i.g(popupDescriptionList, "$popupDescriptionList");
                                        kotlin.jvm.internal.i.g(popupExampleList, "$popupExampleList");
                                        kotlin.jvm.internal.i.g(popupExampleTextList, "$popupExampleTextList");
                                        kotlin.jvm.internal.i.g(popupBtn, "$popupBtn");
                                        if (((ArrayList) popupHeadingList.f23469u).size() - 1 < i14) {
                                            str7 = "";
                                        } else {
                                            str7 = (String) ((ArrayList) popupHeadingList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str7, "if(popupHeadingList.size…eadingList[index] else \"\"");
                                        if (((ArrayList) popupDescriptionList.f23469u).size() - 1 < i14) {
                                            str8 = "";
                                        } else {
                                            str8 = (String) ((ArrayList) popupDescriptionList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str8, "if(popupDescriptionList.…iptionList[index] else \"\"");
                                        if (((ArrayList) popupExampleList.f23469u).size() - 1 < i14) {
                                            str9 = "";
                                        } else {
                                            str9 = (String) ((ArrayList) popupExampleList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str9, "if(popupExampleList.size…xampleList[index] else \"\"");
                                        if (((ArrayList) popupExampleTextList.f23469u).size() - 1 < i14) {
                                            str10 = "";
                                        } else {
                                            str10 = (String) ((ArrayList) popupExampleTextList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str10, "if(popupExampleTextList.…leTextList[index] else \"\"");
                                        this$0.M(str7, tt2, str8, str9, str10, (String) popupBtn.f23469u);
                                        return;
                                    default:
                                        int i16 = m4.f18820z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(popupHeadingList, "$popupHeadingList");
                                        kotlin.jvm.internal.i.g(tt2, "$it");
                                        kotlin.jvm.internal.i.g(popupDescriptionList, "$popupDescriptionList");
                                        kotlin.jvm.internal.i.g(popupExampleList, "$popupExampleList");
                                        kotlin.jvm.internal.i.g(popupExampleTextList, "$popupExampleTextList");
                                        kotlin.jvm.internal.i.g(popupBtn, "$popupBtn");
                                        if (((ArrayList) popupHeadingList.f23469u).size() - 1 < i14) {
                                            str11 = "";
                                        } else {
                                            str11 = (String) ((ArrayList) popupHeadingList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str11, "if(popupHeadingList.size…eadingList[index] else \"\"");
                                        if (((ArrayList) popupDescriptionList.f23469u).size() - 1 < i14) {
                                            str12 = "";
                                        } else {
                                            str12 = (String) ((ArrayList) popupDescriptionList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str12, "if(popupDescriptionList.…iptionList[index] else \"\"");
                                        if (((ArrayList) popupExampleList.f23469u).size() - 1 < i14) {
                                            str13 = "";
                                        } else {
                                            str13 = (String) ((ArrayList) popupExampleList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str13, "if(popupExampleList.size…xampleList[index] else \"\"");
                                        if (((ArrayList) popupExampleTextList.f23469u).size() - 1 < i14) {
                                            str14 = "";
                                        } else {
                                            str14 = (String) ((ArrayList) popupExampleTextList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str14, "if(popupExampleTextList.…leTextList[index] else \"\"");
                                        this$0.M(str11, tt2, str12, str13, str14, (String) popupBtn.f23469u);
                                        return;
                                }
                            }
                        });
                        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                        cVar2 = cVar2;
                        xVar6 = xVar6;
                        A0 = A0;
                        i10 = i11;
                        xVar5 = xVar8;
                        xVar4 = xVar9;
                        xVar3 = xVar11;
                        paramsMapToList2 = paramsMapToList2;
                        xVar2 = xVar2;
                        str5 = str5;
                        i6 = R.id.linearLayout;
                    }
                    hashMap = A0;
                    xVar = xVar2;
                } else {
                    c cVar3 = cVar2;
                    kotlin.jvm.internal.x xVar13 = xVar2;
                    ArrayList<String> arrayList3 = paramsMapToList2;
                    String str7 = "descriptions[index]";
                    hashMap = A0;
                    for (final String str8 : arrayList2) {
                        final int indexOf = paramsMapToList.indexOf(str8);
                        View inflate2 = J().getLayoutInflater().inflate(R.layout.row_s109, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                        ((RobertoTextView) inflate2.findViewById(R.id.tvRowTitle)).setText(str8);
                        if (kotlin.jvm.internal.i.b(J().B0(), "s92-d")) {
                            arrayList = arrayList3;
                            String str9 = arrayList.get(indexOf);
                            str = str7;
                            kotlin.jvm.internal.i.f(str9, str);
                            cVar = cVar3;
                            str2 = cVar.invoke(str9);
                        } else {
                            cVar = cVar3;
                            arrayList = arrayList3;
                            str = str7;
                            String str10 = arrayList.get(indexOf);
                            kotlin.jvm.internal.i.f(str10, "{\n                      …ex]\n                    }");
                            str2 = str10;
                        }
                        String str11 = str2;
                        kotlin.jvm.internal.x xVar14 = xVar13;
                        if (((HashSet) xVar14.f23469u).contains(str11)) {
                            ((AppCompatImageView) inflate2.findViewById(R.id.imageView_left)).setImageResource(R.drawable.ic_check_box_orange_24dp);
                        } else {
                            ((AppCompatImageView) inflate2.findViewById(R.id.imageView_left)).setImageResource(R.drawable.ic_check_box_outline_blank_gray_24dp);
                        }
                        ((RobertoTextView) inflate2.findViewById(R.id.tvRowDesc)).setText(str11);
                        ((AppCompatImageView) inflate2.findViewById(R.id.imageView_right)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.l4

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ m4 f18741v;

                            {
                                this.f18741v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str72;
                                String str82;
                                String str92;
                                String str102;
                                String str112;
                                String str12;
                                String str13;
                                String str14;
                                int i13 = r9;
                                int i14 = indexOf;
                                kotlin.jvm.internal.x popupBtn = xVar7;
                                kotlin.jvm.internal.x popupExampleTextList = xVar6;
                                kotlin.jvm.internal.x popupExampleList = xVar5;
                                kotlin.jvm.internal.x popupDescriptionList = xVar4;
                                String tt2 = str8;
                                kotlin.jvm.internal.x popupHeadingList = xVar3;
                                m4 this$0 = this.f18741v;
                                switch (i13) {
                                    case 0:
                                        int i15 = m4.f18820z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(popupHeadingList, "$popupHeadingList");
                                        kotlin.jvm.internal.i.g(tt2, "$tt");
                                        kotlin.jvm.internal.i.g(popupDescriptionList, "$popupDescriptionList");
                                        kotlin.jvm.internal.i.g(popupExampleList, "$popupExampleList");
                                        kotlin.jvm.internal.i.g(popupExampleTextList, "$popupExampleTextList");
                                        kotlin.jvm.internal.i.g(popupBtn, "$popupBtn");
                                        if (((ArrayList) popupHeadingList.f23469u).size() - 1 < i14) {
                                            str72 = "";
                                        } else {
                                            str72 = (String) ((ArrayList) popupHeadingList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str72, "if(popupHeadingList.size…eadingList[index] else \"\"");
                                        if (((ArrayList) popupDescriptionList.f23469u).size() - 1 < i14) {
                                            str82 = "";
                                        } else {
                                            str82 = (String) ((ArrayList) popupDescriptionList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str82, "if(popupDescriptionList.…iptionList[index] else \"\"");
                                        if (((ArrayList) popupExampleList.f23469u).size() - 1 < i14) {
                                            str92 = "";
                                        } else {
                                            str92 = (String) ((ArrayList) popupExampleList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str92, "if(popupExampleList.size…xampleList[index] else \"\"");
                                        if (((ArrayList) popupExampleTextList.f23469u).size() - 1 < i14) {
                                            str102 = "";
                                        } else {
                                            str102 = (String) ((ArrayList) popupExampleTextList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str102, "if(popupExampleTextList.…leTextList[index] else \"\"");
                                        this$0.M(str72, tt2, str82, str92, str102, (String) popupBtn.f23469u);
                                        return;
                                    default:
                                        int i16 = m4.f18820z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(popupHeadingList, "$popupHeadingList");
                                        kotlin.jvm.internal.i.g(tt2, "$it");
                                        kotlin.jvm.internal.i.g(popupDescriptionList, "$popupDescriptionList");
                                        kotlin.jvm.internal.i.g(popupExampleList, "$popupExampleList");
                                        kotlin.jvm.internal.i.g(popupExampleTextList, "$popupExampleTextList");
                                        kotlin.jvm.internal.i.g(popupBtn, "$popupBtn");
                                        if (((ArrayList) popupHeadingList.f23469u).size() - 1 < i14) {
                                            str112 = "";
                                        } else {
                                            str112 = (String) ((ArrayList) popupHeadingList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str112, "if(popupHeadingList.size…eadingList[index] else \"\"");
                                        if (((ArrayList) popupDescriptionList.f23469u).size() - 1 < i14) {
                                            str12 = "";
                                        } else {
                                            str12 = (String) ((ArrayList) popupDescriptionList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str12, "if(popupDescriptionList.…iptionList[index] else \"\"");
                                        if (((ArrayList) popupExampleList.f23469u).size() - 1 < i14) {
                                            str13 = "";
                                        } else {
                                            str13 = (String) ((ArrayList) popupExampleList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str13, "if(popupExampleList.size…xampleList[index] else \"\"");
                                        if (((ArrayList) popupExampleTextList.f23469u).size() - 1 < i14) {
                                            str14 = "";
                                        } else {
                                            str14 = (String) ((ArrayList) popupExampleTextList.f23469u).get(i14);
                                        }
                                        kotlin.jvm.internal.i.f(str14, "if(popupExampleTextList.…leTextList[index] else \"\"");
                                        this$0.M(str112, tt2, str12, str13, str14, (String) popupBtn.f23469u);
                                        return;
                                }
                            }
                        });
                        inflate2.setOnClickListener(new ek.p(xVar14, str11, inflate2, this, hashMap));
                        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate2);
                        xVar13 = xVar14;
                        cVar3 = cVar;
                        str7 = str;
                        arrayList3 = arrayList;
                        paramsMapToList = paramsMapToList;
                    }
                    xVar = xVar13;
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btns109Button)).setOnClickListener(new zk.k(booleanValue, xVar, this, hashMap, 16));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new z0(this, 14));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18821u, "Exception", e10);
        }
    }

    public final void M(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            Dialog fullScreenDialog = UiUtils.Companion.getFullScreenDialog(R.layout.fragment_screen_popup3, requireActivity());
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Header)).setText(str);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvLabel)).setText(str2);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Desc)).setText(str3);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3ExampleLabel)).setText(str4);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Example)).setText(str5);
            ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setText(str6);
            ((ImageView) fullScreenDialog.findViewById(R.id.imageView5)).setColorFilter(requireContext().getResources().getColor(R.color.selected_row));
            ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setOnClickListener(new nq.n(fullScreenDialog, 17));
            ((ImageView) fullScreenDialog.findViewById(R.id.ivClose)).setOnClickListener(new nq.n(fullScreenDialog, 18));
            fullScreenDialog.show();
            ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setOnClickListener(new nq.n(fullScreenDialog, 19));
            ((ImageView) fullScreenDialog.findViewById(R.id.ivClose)).setOnClickListener(new nq.n(fullScreenDialog, 20));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18821u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18825y;
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
        return inflater.inflate(R.layout.fragment_screen_s109, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18822v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18825y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        this.f18823w = (TemplateActivity) activity;
        if (J().W) {
            fm.a aVar = (fm.a) this.f18822v.getValue();
            TemplateModel templateModel = J().f10547y;
            if (templateModel != null && (label = templateModel.getLabel()) != null) {
                aVar.f15178l0.e(getViewLifecycleOwner(), new r3(10, new a()));
                aVar.l(label);
                return;
            }
            return;
        }
        K();
    }
}
