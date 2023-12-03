package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Screen136Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS28bFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/z6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z6 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19444w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19446v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19445u = LogHelper.INSTANCE.makeLogTag(z6.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19446v;
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
        return inflater.inflate(R.layout.fragment_screen_s28b, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19446v.clear();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        String str;
        kotlin.jvm.internal.x xVar;
        String str2;
        String str3;
        String str4;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            xVar2.f23469u = new ArrayList();
            int hashCode = B0.hashCode();
            HashMap<String, Object> hashMap = templateActivity.F;
            String str5 = "s59-c";
            String str6 = "s28c";
            String str7 = "s136";
            String str8 = "s131";
            switch (hashCode) {
                case 3474684:
                    if (!B0.equals("s131")) {
                        break;
                    } else {
                        Object obj = hashMap.get("list");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        arrayList3 = (ArrayList) obj;
                        break;
                    }
                case 3474689:
                    if (!B0.equals("s136")) {
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS28bHeader)).setText(UtilFunKt.paramsMapToString(A0.get("s28d_heading")));
                        Object obj2 = hashMap.get("model_136_list");
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.Screen136Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.Screen136Model> }");
                        Object obj3 = hashMap.get("model_136_original_list");
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        xVar2.f23469u = (ArrayList) obj3;
                        Iterator it = ((ArrayList) obj2).iterator();
                        while (it.hasNext()) {
                            Screen136Model screen136Model = (Screen136Model) it.next();
                            arrayList2.add(screen136Model.getHeadingTxt());
                            if (screen136Model.getIncluded()) {
                                arrayList3.add(screen136Model.getHeadingTxt());
                            }
                        }
                        break;
                    }
                case 3475849:
                    if (!B0.equals("s28b")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS28bHeader)).setText(UtilFunKt.paramsMapToString(A0.get("s28b_heading")));
                    arrayList2 = UtilFunKt.paramsMapToList(A0.get("s28b_list"));
                    break;
                case 3475850:
                    if (!B0.equals("s28c")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS28bHeader)).setText(UtilFunKt.paramsMapToString(A0.get("s28c_heading")));
                    arrayList2 = UtilFunKt.paramsMapToList(A0.get("s28c_list"));
                    break;
                case 107749774:
                    if (!B0.equals("s28-b")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS28bHeader)).setText(UtilFunKt.paramsMapToString(A0.get("s28b_heading")));
                    arrayList2 = UtilFunKt.paramsMapToList(A0.get("s28b_list"));
                    break;
                case 107749775:
                    if (!B0.equals("s28-c")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS28bHeader)).setText(UtilFunKt.paramsMapToString(A0.get("s28c_heading")));
                    arrayList2 = UtilFunKt.paramsMapToList(A0.get("s28c_list"));
                    break;
                case 107840109:
                    if (!B0.equals("s59-c")) {
                        break;
                    } else {
                        Object obj4 = hashMap.get("list");
                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        String paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s28e_heading"));
                        Object obj5 = ((ArrayList) obj4).get(0);
                        kotlin.jvm.internal.i.f(obj5, "tempList[0]");
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS28bHeader)).setText(gv.n.F0(paramsMapToString, "%user_activity%", (String) obj5));
                        arrayList2 = UtilFunKt.paramsMapToList(A0.get("s28e_list"));
                        break;
                    }
            }
            ArrayList arrayList4 = arrayList3;
            Iterator<String> it2 = arrayList2.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                int i10 = i6 + 1;
                String next = it2.next();
                if ((!kotlin.jvm.internal.i.b(B0, str8) && !kotlin.jvm.internal.i.b(B0, str7)) || arrayList4.contains(next)) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    arrayList = arrayList4;
                    View inflate = activity2.getLayoutInflater().inflate(R.layout.row_s28, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS28bList)), false);
                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(next);
                    ((ImageView) relativeLayout.findViewById(R.id.imageView5)).setBackgroundResource(R.drawable.circle_hollow_orange_small);
                    str2 = str8;
                    str3 = str5;
                    kotlin.jvm.internal.x xVar3 = xVar2;
                    str = str7;
                    xVar = xVar2;
                    str4 = str6;
                    relativeLayout.setOnClickListener(new m2(relativeLayout, this, B0, templateActivity, xVar3, next, i6));
                    ((LinearLayout) _$_findCachedViewById(R.id.llS28bList)).addView(relativeLayout);
                } else {
                    arrayList = arrayList4;
                    str = str7;
                    xVar = xVar2;
                    str2 = str8;
                    str3 = str5;
                    str4 = str6;
                }
                str8 = str2;
                str6 = str4;
                xVar2 = xVar;
                i6 = i10;
                arrayList4 = arrayList;
                str7 = str;
                str5 = str3;
            }
            String str9 = str5;
            if (kotlin.jvm.internal.i.b(B0, str6) || kotlin.jvm.internal.i.b(B0, "s28-c")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                View inflate2 = activity3.getLayoutInflater().inflate(R.layout.row_s28, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS28bList)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout2 = (RelativeLayout) inflate2;
                ((RobertoTextView) relativeLayout2.findViewById(R.id.tvLabel)).setText(UtilFunKt.paramsMapToString(A0.get("s28c_none_of_these_text")));
                ((ImageView) relativeLayout2.findViewById(R.id.imageView5)).setBackgroundResource(R.drawable.circle_hollow_orange_small);
                relativeLayout2.setOnClickListener(new o4(5, relativeLayout2, this, templateActivity));
                ((LinearLayout) _$_findCachedViewById(R.id.llS28bList)).addView(relativeLayout2);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 21));
            if (kotlin.jvm.internal.i.b(B0, str9)) {
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new z0(this, 26));
                return;
            }
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19445u, "Exception in on view created", e10);
        }
    }
}
