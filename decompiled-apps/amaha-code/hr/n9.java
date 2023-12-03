package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoCheckBox;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS8bFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/n9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n9 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18894w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18896v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18895u = LogHelper.INSTANCE.makeLogTag(n9.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18896v;
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
        return inflater.inflate(R.layout.fragment_screen_s8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18896v.clear();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        LayoutInflater layoutInflater;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ArrayList();
            if (kotlin.jvm.internal.i.b(B0, "s8b")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS8Header)).setText(UtilFunKt.paramsMapToString(A0.get("s8b_heading")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setText(UtilFunKt.paramsMapToString(A0.get("s8b_btn_text")));
                arrayList = UtilFunKt.paramsMapToList(A0.get("s8b_list"));
            } else {
                arrayList = new ArrayList<>();
            }
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity2).F.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            ArrayList arrayList2 = (ArrayList) obj;
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity3).J) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                androidx.fragment.app.p activity4 = getActivity();
                View view2 = null;
                if (activity4 != null && (layoutInflater = activity4.getLayoutInflater()) != null) {
                    view2 = layoutInflater.inflate(R.layout.row_checkbox, (ViewGroup) null);
                }
                kotlin.jvm.internal.i.e(view2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoCheckBox");
                RobertoCheckBox robertoCheckBox = (RobertoCheckBox) view2;
                robertoCheckBox.setText(next);
                robertoCheckBox.setOnCheckedChangeListener(new fl.m(xVar, 9, next));
                ((LinearLayout) _$_findCachedViewById(R.id.llS8List)).addView(robertoCheckBox);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new d9(xVar, 2, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18895u, "exception in on view created", e10);
        }
    }
}
