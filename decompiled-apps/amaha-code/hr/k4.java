package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS108Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/k4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k4 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18677x = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f18679v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18680w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18678u = LogHelper.INSTANCE.makeLogTag(k4.class);

    public static int K(String str, ArrayList arrayList) {
        if (str.length() < 12) {
            return -1;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = arrayList.get(i6);
            kotlin.jvm.internal.i.f(obj, "list[i]");
            String lowerCase = ((String) obj).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            String substring = lowerCase.substring(0, 12);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String lowerCase2 = str.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
            String substring2 = lowerCase2.substring(0, 12);
            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            if (gv.r.J0(substring, substring2)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
            return true;
        }
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (!r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
            return true;
        }
        androidx.fragment.app.p activity3 = getActivity();
        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        Goal y02 = ((TemplateActivity) activity3).y0();
        kotlin.jvm.internal.i.d(y02);
        if (is.k.Q1(y02.getGoalId(), new String[]{"pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4"})) {
            return true;
        }
        androidx.fragment.app.p activity4 = getActivity();
        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity4).Q = true;
        androidx.fragment.app.p activity5 = getActivity();
        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity5).I = true;
        androidx.fragment.app.p activity6 = getActivity();
        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity6).s0(new m4());
        return false;
    }

    public final void J(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final void M(int i6) {
        View childAt = ((LinearLayout) _$_findCachedViewById(R.id.lls108List)).getChildAt(i6);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) childAt.findViewById(R.id.chkBxSelected), childAt, R.id.tvLabel)).setFont("Lato-Medium.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
    }

    public final void O(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Medium.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18680w;
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
        return inflater.inflate(R.layout.fragment_screen_s108, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18680w.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0316 A[Catch: Exception -> 0x049d, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x0010, B:5:0x0021, B:7:0x002a, B:10:0x0039, B:12:0x0043, B:14:0x0047, B:16:0x0055, B:18:0x005d, B:20:0x006e, B:22:0x0072, B:24:0x0087, B:26:0x008b, B:28:0x008f, B:29:0x0092, B:30:0x0093, B:31:0x0096, B:32:0x0097, B:33:0x009a, B:34:0x009b, B:35:0x009e, B:36:0x009f, B:39:0x00a8, B:41:0x00b9, B:43:0x0103, B:46:0x0117, B:48:0x011b, B:50:0x0123, B:52:0x0127, B:103:0x01ef, B:105:0x0215, B:107:0x021d, B:109:0x0221, B:113:0x0235, B:114:0x0245, B:116:0x024b, B:118:0x0280, B:120:0x028a, B:122:0x028e, B:124:0x029c, B:126:0x02a0, B:128:0x02b3, B:130:0x02b7, B:132:0x02ca, B:134:0x02ce, B:136:0x02df, B:138:0x02e3, B:148:0x0308, B:149:0x0310, B:151:0x0316, B:153:0x0324, B:155:0x0335, B:157:0x0339, B:160:0x034b, B:162:0x0357, B:179:0x039d, B:183:0x03aa, B:189:0x03c4, B:184:0x03ae, B:186:0x03b3, B:188:0x03bd, B:163:0x035f, B:164:0x0363, B:165:0x0364, B:167:0x0375, B:170:0x0386, B:171:0x038a, B:141:0x02f7, B:142:0x02fb, B:143:0x02fc, B:144:0x0300, B:145:0x0301, B:146:0x0305, B:173:0x038e, B:174:0x0392, B:175:0x0393, B:176:0x0397, B:190:0x0405, B:191:0x0409, B:192:0x040a, B:194:0x0434, B:196:0x043b, B:195:0x0438, B:110:0x022b, B:111:0x022f, B:112:0x0230, B:197:0x0484, B:198:0x0488, B:53:0x0135, B:54:0x0139, B:55:0x013a, B:57:0x013e, B:59:0x0146, B:61:0x014c, B:62:0x015d, B:63:0x0161, B:65:0x0166, B:66:0x016a, B:67:0x016b, B:68:0x016f, B:69:0x0170, B:71:0x0174, B:73:0x017a, B:75:0x0182, B:77:0x0186, B:78:0x0194, B:79:0x0198, B:80:0x0199, B:82:0x019d, B:84:0x01a1, B:86:0x01a9, B:88:0x01ad, B:90:0x01b7, B:92:0x01bb, B:94:0x01c9, B:96:0x01cf, B:97:0x01e0, B:98:0x01e4, B:99:0x01e5, B:100:0x01e9, B:101:0x01ea, B:102:0x01ee, B:199:0x0489, B:200:0x048d, B:201:0x048e, B:202:0x0492, B:203:0x0493, B:204:0x0497, B:205:0x0498, B:206:0x049c), top: B:210:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b3 A[Catch: Exception -> 0x049d, TryCatch #0 {Exception -> 0x049d, blocks: (B:3:0x0010, B:5:0x0021, B:7:0x002a, B:10:0x0039, B:12:0x0043, B:14:0x0047, B:16:0x0055, B:18:0x005d, B:20:0x006e, B:22:0x0072, B:24:0x0087, B:26:0x008b, B:28:0x008f, B:29:0x0092, B:30:0x0093, B:31:0x0096, B:32:0x0097, B:33:0x009a, B:34:0x009b, B:35:0x009e, B:36:0x009f, B:39:0x00a8, B:41:0x00b9, B:43:0x0103, B:46:0x0117, B:48:0x011b, B:50:0x0123, B:52:0x0127, B:103:0x01ef, B:105:0x0215, B:107:0x021d, B:109:0x0221, B:113:0x0235, B:114:0x0245, B:116:0x024b, B:118:0x0280, B:120:0x028a, B:122:0x028e, B:124:0x029c, B:126:0x02a0, B:128:0x02b3, B:130:0x02b7, B:132:0x02ca, B:134:0x02ce, B:136:0x02df, B:138:0x02e3, B:148:0x0308, B:149:0x0310, B:151:0x0316, B:153:0x0324, B:155:0x0335, B:157:0x0339, B:160:0x034b, B:162:0x0357, B:179:0x039d, B:183:0x03aa, B:189:0x03c4, B:184:0x03ae, B:186:0x03b3, B:188:0x03bd, B:163:0x035f, B:164:0x0363, B:165:0x0364, B:167:0x0375, B:170:0x0386, B:171:0x038a, B:141:0x02f7, B:142:0x02fb, B:143:0x02fc, B:144:0x0300, B:145:0x0301, B:146:0x0305, B:173:0x038e, B:174:0x0392, B:175:0x0393, B:176:0x0397, B:190:0x0405, B:191:0x0409, B:192:0x040a, B:194:0x0434, B:196:0x043b, B:195:0x0438, B:110:0x022b, B:111:0x022f, B:112:0x0230, B:197:0x0484, B:198:0x0488, B:53:0x0135, B:54:0x0139, B:55:0x013a, B:57:0x013e, B:59:0x0146, B:61:0x014c, B:62:0x015d, B:63:0x0161, B:65:0x0166, B:66:0x016a, B:67:0x016b, B:68:0x016f, B:69:0x0170, B:71:0x0174, B:73:0x017a, B:75:0x0182, B:77:0x0186, B:78:0x0194, B:79:0x0198, B:80:0x0199, B:82:0x019d, B:84:0x01a1, B:86:0x01a9, B:88:0x01ad, B:90:0x01b7, B:92:0x01bb, B:94:0x01c9, B:96:0x01cf, B:97:0x01e0, B:98:0x01e4, B:99:0x01e5, B:100:0x01e9, B:101:0x01ea, B:102:0x01ee, B:199:0x0489, B:200:0x048d, B:201:0x048e, B:202:0x0492, B:203:0x0493, B:204:0x0497, B:205:0x0498, B:206:0x049c), top: B:210:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c4 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.util.HashSet, T] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        FrameLayout frameLayout;
        Object obj2;
        boolean z10;
        Iterator it;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18679v = templateActivity;
            if (templateActivity.Q) {
                templateActivity.s0(new m4());
                return;
            }
            if (templateActivity.J && templateActivity.getIntent().hasExtra("source")) {
                TemplateActivity templateActivity2 = this.f18679v;
                if (templateActivity2 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity2.getIntent().getStringExtra("source"), "goals")) {
                        String[] strArr = {"pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4"};
                        TemplateActivity templateActivity3 = this.f18679v;
                        if (templateActivity3 != null) {
                            Goal y02 = templateActivity3.y0();
                            kotlin.jvm.internal.i.d(y02);
                            if (is.k.Q1(y02.getGoalId(), strArr)) {
                                TemplateActivity templateActivity4 = this.f18679v;
                                if (templateActivity4 != null) {
                                    Object obj3 = templateActivity4.F.get("fromEdit");
                                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                    if (((Boolean) obj3).booleanValue()) {
                                        TemplateActivity templateActivity5 = this.f18679v;
                                        if (templateActivity5 != null) {
                                            templateActivity5.onBackPressed();
                                            return;
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
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            TemplateActivity templateActivity6 = this.f18679v;
            if (templateActivity6 != null) {
                HashMap<String, Object> A0 = templateActivity6.A0();
                ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s108_list"));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvs108Header)).setText(UtilFunKt.paramsMapToString(A0.get("s108_heading")));
                ((RobertoButton) _$_findCachedViewById(R.id.btns108Button)).setText(UtilFunKt.paramsMapToString(A0.get("s108_btn_text")));
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                xVar.f23469u = new HashSet();
                TemplateActivity templateActivity7 = this.f18679v;
                if (templateActivity7 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity7.B0(), "s92-d")) {
                        TemplateActivity templateActivity8 = this.f18679v;
                        if (templateActivity8 != null) {
                            if (templateActivity8.F.containsKey("s108_user_list")) {
                                TemplateActivity templateActivity9 = this.f18679v;
                                if (templateActivity9 != null) {
                                    Object obj4 = templateActivity9.F.get("s108_user_list");
                                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                                    xVar.f23469u = (HashSet) obj4;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                TemplateActivity templateActivity10 = this.f18679v;
                                if (templateActivity10 != null) {
                                    if (templateActivity10.F.containsKey("list")) {
                                        TemplateActivity templateActivity11 = this.f18679v;
                                        if (templateActivity11 != null) {
                                            Object obj5 = templateActivity11.F.get("list");
                                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            xVar.f23469u = new HashSet((ArrayList) obj5);
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
                            obj = "hFSM0DtKqmPlpmt7bTE4";
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        TemplateActivity templateActivity12 = this.f18679v;
                        if (templateActivity12 != null) {
                            obj = "hFSM0DtKqmPlpmt7bTE4";
                            if (templateActivity12.J && templateActivity12.F.containsKey("s108_user_list")) {
                                TemplateActivity templateActivity13 = this.f18679v;
                                if (templateActivity13 != null) {
                                    Object obj6 = templateActivity13.F.get("s108_user_list");
                                    kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                                    xVar.f23469u = (HashSet) obj6;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                TemplateActivity templateActivity14 = this.f18679v;
                                if (templateActivity14 != null) {
                                    if (templateActivity14.J && templateActivity14.F.containsKey("list")) {
                                        TemplateActivity templateActivity15 = this.f18679v;
                                        if (templateActivity15 != null) {
                                            if (templateActivity15.getIntent().hasExtra("source")) {
                                                TemplateActivity templateActivity16 = this.f18679v;
                                                if (templateActivity16 != null) {
                                                    if (!kotlin.jvm.internal.i.b(templateActivity16.getIntent().getStringExtra("source"), "goals")) {
                                                        TemplateActivity templateActivity17 = this.f18679v;
                                                        if (templateActivity17 != null) {
                                                            Object obj7 = templateActivity17.F.get("list");
                                                            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                            xVar.f23469u = new HashSet((ArrayList) obj7);
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
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    LayoutInflater layoutInflater = activity2.getLayoutInflater();
                    int i6 = R.id.lls108List;
                    int i10 = R.layout.row_checkbox;
                    boolean z11 = false;
                    View inflate = layoutInflater.inflate(R.layout.row_checkbox, (LinearLayout) _$_findCachedViewById(R.id.lls108List), false);
                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout2 = (FrameLayout) inflate;
                    TemplateActivity templateActivity18 = this.f18679v;
                    if (templateActivity18 != null) {
                        if (templateActivity18.F.containsKey("none_of_those")) {
                            TemplateActivity templateActivity19 = this.f18679v;
                            if (templateActivity19 != null) {
                                frameLayout2.setTag(templateActivity19.F.get("none_of_those"));
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            frameLayout2.setTag(Boolean.FALSE);
                        }
                        ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s109_goal_description_list"));
                        Iterator<String> it2 = paramsMapToList.iterator();
                        int i11 = 0;
                        while (it2.hasNext()) {
                            int i12 = i11 + 1;
                            String next = it2.next();
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            View inflate2 = activity3.getLayoutInflater().inflate(i10, (LinearLayout) _$_findCachedViewById(i6), z11);
                            kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
                            View view2 = (FrameLayout) inflate2;
                            ((RobertoTextView) view2.findViewById(R.id.tvLabel)).setText(next);
                            TemplateActivity templateActivity20 = this.f18679v;
                            if (templateActivity20 != null) {
                                if (templateActivity20.getIntent().hasExtra("source")) {
                                    TemplateActivity templateActivity21 = this.f18679v;
                                    if (templateActivity21 != null) {
                                        if (kotlin.jvm.internal.i.b(templateActivity21.getIntent().getStringExtra("source"), "goals")) {
                                            TemplateActivity templateActivity22 = this.f18679v;
                                            if (templateActivity22 != null) {
                                                Goal y03 = templateActivity22.y0();
                                                kotlin.jvm.internal.i.d(y03);
                                                if (!kotlin.jvm.internal.i.b(y03.getGoalId(), "Hu1zjaK518AGX6p1uNyw")) {
                                                    TemplateActivity templateActivity23 = this.f18679v;
                                                    if (templateActivity23 != null) {
                                                        Goal y04 = templateActivity23.y0();
                                                        kotlin.jvm.internal.i.d(y04);
                                                        if (!kotlin.jvm.internal.i.b(y04.getGoalId(), "TVjSoqFdOrM0CE0YU1ja")) {
                                                            TemplateActivity templateActivity24 = this.f18679v;
                                                            if (templateActivity24 != null) {
                                                                Goal y05 = templateActivity24.y0();
                                                                kotlin.jvm.internal.i.d(y05);
                                                                if (!kotlin.jvm.internal.i.b(y05.getGoalId(), "pIjSaq3mFoJJuwZZr1BW")) {
                                                                    TemplateActivity templateActivity25 = this.f18679v;
                                                                    if (templateActivity25 != null) {
                                                                        Goal y06 = templateActivity25.y0();
                                                                        kotlin.jvm.internal.i.d(y06);
                                                                        obj2 = obj;
                                                                        if (kotlin.jvm.internal.i.b(y06.getGoalId(), obj2)) {
                                                                            it = ((HashSet) xVar.f23469u).iterator();
                                                                            while (it.hasNext()) {
                                                                                String i13 = (String) it.next();
                                                                                Iterator it3 = it;
                                                                                TemplateActivity templateActivity26 = this.f18679v;
                                                                                if (templateActivity26 != null) {
                                                                                    Goal y07 = templateActivity26.y0();
                                                                                    kotlin.jvm.internal.i.d(y07);
                                                                                    if (!kotlin.jvm.internal.i.b(y07.getGoalId(), "pIjSaq3mFoJJuwZZr1BW")) {
                                                                                        TemplateActivity templateActivity27 = this.f18679v;
                                                                                        if (templateActivity27 != null) {
                                                                                            Goal y08 = templateActivity27.y0();
                                                                                            kotlin.jvm.internal.i.d(y08);
                                                                                            if (!kotlin.jvm.internal.i.b(y08.getGoalId(), obj2)) {
                                                                                                frameLayout = frameLayout2;
                                                                                                if (paramsMapToList2.indexOf(i13) == paramsMapToList.indexOf(next)) {
                                                                                                    ((HashSet) xVar.f23469u).remove(i13);
                                                                                                    z10 = true;
                                                                                                    break;
                                                                                                }
                                                                                                it = it3;
                                                                                                frameLayout2 = frameLayout;
                                                                                            }
                                                                                        } else {
                                                                                            kotlin.jvm.internal.i.q("act");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                    frameLayout = frameLayout2;
                                                                                    kotlin.jvm.internal.i.f(i13, "i");
                                                                                    if (K(i13, paramsMapToList2) == paramsMapToList.indexOf(next)) {
                                                                                        ((HashSet) xVar.f23469u).remove(i13);
                                                                                        z10 = true;
                                                                                        break;
                                                                                    }
                                                                                    it = it3;
                                                                                    frameLayout2 = frameLayout;
                                                                                } else {
                                                                                    kotlin.jvm.internal.i.q("act");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                        }
                                                                        frameLayout = frameLayout2;
                                                                        z10 = false;
                                                                        if (!((HashSet) xVar.f23469u).contains(next) && !z10) {
                                                                            O(view2);
                                                                            FrameLayout frameLayout3 = frameLayout;
                                                                            Object obj8 = obj2;
                                                                            view2.setOnClickListener(new el.c(xVar, next, this, i11, frameLayout3));
                                                                            ((LinearLayout) _$_findCachedViewById(R.id.lls108List)).addView(view2);
                                                                            frameLayout2 = frameLayout3;
                                                                            paramsMapToList = paramsMapToList;
                                                                            i11 = i12;
                                                                            xVar = xVar;
                                                                            paramsMapToList2 = paramsMapToList2;
                                                                            obj = obj8;
                                                                            z11 = false;
                                                                            i6 = R.id.lls108List;
                                                                            i10 = R.layout.row_checkbox;
                                                                        }
                                                                        J(view2);
                                                                        if (!z10 && !((HashSet) xVar.f23469u).contains(next)) {
                                                                            ((HashSet) xVar.f23469u).add(next);
                                                                        }
                                                                        FrameLayout frameLayout32 = frameLayout;
                                                                        Object obj82 = obj2;
                                                                        view2.setOnClickListener(new el.c(xVar, next, this, i11, frameLayout32));
                                                                        ((LinearLayout) _$_findCachedViewById(R.id.lls108List)).addView(view2);
                                                                        frameLayout2 = frameLayout32;
                                                                        paramsMapToList = paramsMapToList;
                                                                        i11 = i12;
                                                                        xVar = xVar;
                                                                        paramsMapToList2 = paramsMapToList2;
                                                                        obj = obj82;
                                                                        z11 = false;
                                                                        i6 = R.id.lls108List;
                                                                        i10 = R.layout.row_checkbox;
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
                                                    } else {
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                }
                                                obj2 = obj;
                                                it = ((HashSet) xVar.f23469u).iterator();
                                                while (it.hasNext()) {
                                                }
                                                frameLayout = frameLayout2;
                                                z10 = false;
                                                if (!((HashSet) xVar.f23469u).contains(next)) {
                                                    O(view2);
                                                    FrameLayout frameLayout322 = frameLayout;
                                                    Object obj822 = obj2;
                                                    view2.setOnClickListener(new el.c(xVar, next, this, i11, frameLayout322));
                                                    ((LinearLayout) _$_findCachedViewById(R.id.lls108List)).addView(view2);
                                                    frameLayout2 = frameLayout322;
                                                    paramsMapToList = paramsMapToList;
                                                    i11 = i12;
                                                    xVar = xVar;
                                                    paramsMapToList2 = paramsMapToList2;
                                                    obj = obj822;
                                                    z11 = false;
                                                    i6 = R.id.lls108List;
                                                    i10 = R.layout.row_checkbox;
                                                }
                                                J(view2);
                                                if (!z10) {
                                                    ((HashSet) xVar.f23469u).add(next);
                                                }
                                                FrameLayout frameLayout3222 = frameLayout;
                                                Object obj8222 = obj2;
                                                view2.setOnClickListener(new el.c(xVar, next, this, i11, frameLayout3222));
                                                ((LinearLayout) _$_findCachedViewById(R.id.lls108List)).addView(view2);
                                                frameLayout2 = frameLayout3222;
                                                paramsMapToList = paramsMapToList;
                                                i11 = i12;
                                                xVar = xVar;
                                                paramsMapToList2 = paramsMapToList2;
                                                obj = obj8222;
                                                z11 = false;
                                                i6 = R.id.lls108List;
                                                i10 = R.layout.row_checkbox;
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
                                frameLayout = frameLayout2;
                                obj2 = obj;
                                z10 = false;
                                if (!((HashSet) xVar.f23469u).contains(next)) {
                                }
                                J(view2);
                                if (!z10) {
                                }
                                FrameLayout frameLayout32222 = frameLayout;
                                Object obj82222 = obj2;
                                view2.setOnClickListener(new el.c(xVar, next, this, i11, frameLayout32222));
                                ((LinearLayout) _$_findCachedViewById(R.id.lls108List)).addView(view2);
                                frameLayout2 = frameLayout32222;
                                paramsMapToList = paramsMapToList;
                                i11 = i12;
                                xVar = xVar;
                                paramsMapToList2 = paramsMapToList2;
                                obj = obj82222;
                                z11 = false;
                                i6 = R.id.lls108List;
                                i10 = R.layout.row_checkbox;
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        FrameLayout frameLayout4 = frameLayout2;
                        kotlin.jvm.internal.x xVar2 = xVar;
                        ArrayList<String> arrayList = paramsMapToList;
                        ((RobertoTextView) frameLayout4.findViewById(R.id.tvLabel)).setText(UtilFunKt.paramsMapToString(A0.get("s108_none_of_these_text")));
                        if (kotlin.jvm.internal.i.b(frameLayout4.getTag(), Boolean.TRUE)) {
                            J(frameLayout4);
                        } else {
                            O(frameLayout4);
                        }
                        frameLayout4.setOnClickListener(new tk.q((Object) frameLayout4, (Object) this, (Object) xVar2, (Object) arrayList, 19));
                        ((LinearLayout) _$_findCachedViewById(R.id.lls108List)).addView(frameLayout4);
                        ((RobertoButton) _$_findCachedViewById(R.id.btns108Button)).setOnClickListener(new ek.p(xVar2, frameLayout4, this, A0, arrayList));
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new z0(this, 13));
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18678u, "exception", e10);
        }
    }
}
