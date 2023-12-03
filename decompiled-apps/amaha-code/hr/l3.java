package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult5Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/l3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l3 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18737w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18739v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18738u = LogHelper.INSTANCE.makeLogTag(l3.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18739v;
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
        return inflater.inflate(R.layout.fragment_screen_result_5, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18739v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
        if (((com.theinnerhour.b2b.activity.TemplateActivity) r5).I != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        T t3;
        LayoutInflater layoutInflater;
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
            if (!((TemplateActivity) activity3).J) {
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            }
            if (y02 != null && y02.getData().containsKey("result_5")) {
                Object obj2 = y02.getData().get("result_5");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                t3 = (ArrayList) obj2;
            } else {
                t3 = new ArrayList();
            }
            xVar.f23469u = t3;
            androidx.fragment.app.p activity5 = getActivity();
            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity5).F.put("list", xVar.f23469u);
            Object obj3 = ((ArrayList) xVar.f23469u).get(0);
            kotlin.jvm.internal.i.f(obj3, "list[0]");
            String str = (String) obj3;
            androidx.fragment.app.p activity6 = getActivity();
            View view2 = null;
            if (activity6 != null && (layoutInflater = activity6.getLayoutInflater()) != null) {
                view2 = layoutInflater.inflate(R.layout.row_textview, (ViewGroup) null);
            }
            kotlin.jvm.internal.i.e(view2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView = (RobertoTextView) view2;
            robertoTextView.setText("The strength you have selected is\n".concat(str));
            ((LinearLayout) _$_findCachedViewById(R.id.linearlayout)).addView(robertoTextView);
            ((Button) _$_findCachedViewById(R.id.button6)).setOnClickListener(new z0(this, 9));
            ((Button) _$_findCachedViewById(R.id.button7)).setOnClickListener(new sq.p(this, 6, xVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18738u, "exception in on view created", e10);
        }
    }
}
