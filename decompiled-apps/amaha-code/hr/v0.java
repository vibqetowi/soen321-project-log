package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult17Model;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult17Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/v0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19269w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19271v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19270u = LogHelper.INSTANCE.makeLogTag(v0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19271v;
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
        return inflater.inflate(R.layout.fragment_screen_result_17, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19271v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((com.theinnerhour.b2b.activity.TemplateActivity) r10).I != false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r14v26, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v36, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v6, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f19270u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity).F.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            xVar.f23469u = (ArrayList) obj;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity2).y0();
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity3).A0();
            try {
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (!((TemplateActivity) activity4).J) {
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                }
                if (y02 != null && y02.getData().containsKey("list_result_17")) {
                    Object obj2 = y02.getData().get("list_result_17");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult17Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult17Model> }");
                    ArrayList arrayList = (ArrayList) obj2;
                    if (arrayList.size() > 0) {
                        ScreenResult17Model screenResult17Model = (ScreenResult17Model) is.u.o2(arrayList);
                        String text1 = screenResult17Model.getText1();
                        kotlin.jvm.internal.i.d(text1);
                        String text2 = screenResult17Model.getText2();
                        kotlin.jvm.internal.i.d(text2);
                        String text3 = screenResult17Model.getText3();
                        kotlin.jvm.internal.i.d(text3);
                        xVar.f23469u = ca.a.k(text1, text2, text3);
                    }
                } else {
                    xVar.f23469u = new ArrayList();
                }
                androidx.fragment.app.p activity6 = getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity6).F.put("list", xVar.f23469u);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "exception in reading list from firebase", e10);
            }
            Object obj3 = A0.get("text1");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = ((ArrayList) xVar.f23469u).get(0);
            kotlin.jvm.internal.i.f(obj4, "list[0]");
            ((TextView) _$_findCachedViewById(R.id.textView1)).setText(gv.n.F0((String) obj3, "%replace%", (String) obj4));
            Object obj5 = A0.get("text2");
            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
            Object obj6 = ((ArrayList) xVar.f23469u).get(1);
            kotlin.jvm.internal.i.f(obj6, "list[1]");
            ((TextView) _$_findCachedViewById(R.id.textView2)).setText(gv.n.F0((String) obj5, "%replace%", (String) obj6));
            Object obj7 = A0.get("text3");
            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
            Object obj8 = ((ArrayList) xVar.f23469u).get(2);
            kotlin.jvm.internal.i.f(obj8, "list[2]");
            ((TextView) _$_findCachedViewById(R.id.textView3)).setText(gv.n.F0((String) obj7, "%replace%", (String) obj8));
            ((Button) _$_findCachedViewById(R.id.button1)).setOnClickListener(new qq.n(this, 27));
            ((Button) _$_findCachedViewById(R.id.button2)).setOnClickListener(new nn.g(25, this, xVar, "list_result_17"));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "Exception in view created", e11);
        }
    }
}
