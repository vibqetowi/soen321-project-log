package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult29Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/n2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n2 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18875w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18877v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18876u = LogHelper.INSTANCE.makeLogTag(n2.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18877v;
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
        return inflater.inflate(R.layout.fragment_screen_result_29, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18877v.clear();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        Object obj;
        int indexOf;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            Object obj2 = templateActivity.F.get("list");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            xVar.f23469u = (ArrayList) obj2;
            HashMap<String, Object> hashMap = templateActivity.F;
            Object obj3 = hashMap.get("list_all");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            ?? r12 = (ArrayList) obj3;
            boolean z11 = false;
            if (((ArrayList) xVar.f23469u).size() == 0) {
                xVar.f23469u = r12;
                z10 = true;
            } else {
                z10 = false;
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            Object obj4 = hashMap.get("heading_list_all");
            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            ArrayList arrayList = (ArrayList) obj4;
            Object obj5 = hashMap.get("description_list_all");
            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            ArrayList arrayList2 = (ArrayList) obj5;
            Object obj6 = hashMap.get("example_list_all");
            kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            ArrayList arrayList3 = (ArrayList) obj6;
            Object obj7 = hashMap.get("example_text_list_all");
            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            ArrayList arrayList4 = (ArrayList) obj7;
            Object obj8 = hashMap.get("popup_btn_text");
            kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj8;
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvR29Header);
            if (z10) {
                obj = A0.get("r29_heading_flow_2");
            } else {
                obj = A0.get("r29_heading_flow_1");
            }
            robertoTextView.setText(UtilFunKt.paramsMapToString(obj));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR29Button)).setText(UtilFunKt.paramsMapToString(A0.get("r29_btn_text")));
            Iterator it = ((ArrayList) xVar.f23469u).iterator();
            int i6 = 0;
            ArrayList arrayList5 = r12;
            while (it.hasNext()) {
                int i10 = i6 + 1;
                String str2 = (String) it.next();
                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                if (z10) {
                    indexOf = i6;
                } else {
                    indexOf = arrayList5.indexOf(str2);
                }
                vVar.f23467u = indexOf;
                View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_card_text_image, (LinearLayout) _$_findCachedViewById(R.id.llR29List), z11);
                ((RobertoTextView) inflate.findViewById(R.id.textView)).setText(str2);
                ((ImageView) inflate.findViewById(R.id.imageView)).setImageResource(R.drawable.ic_help_outline_gray_24dp);
                ((ImageView) inflate.findViewById(R.id.imageView)).setOnClickListener(new m2(this, arrayList, vVar, xVar, i6, arrayList2, str));
                ((LinearLayout) _$_findCachedViewById(R.id.llR29List)).addView(inflate);
                arrayList5 = arrayList5;
                i6 = i10;
                z10 = z10;
                xVar = xVar;
                z11 = false;
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR29Button)).setOnClickListener(new c0(templateActivity, 18));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 19));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18876u, "exception", e10);
        }
    }
}
