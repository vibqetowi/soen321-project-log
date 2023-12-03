package hr;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.TaskIn2Min;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS82Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/b9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b9 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18209w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18211v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18210u = LogHelper.INSTANCE.makeLogTag(b9.class);

    public final void J(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((ImageView) view.findViewById(R.id.chkBxSelected)).setImageDrawable(a.c.b(activity, R.drawable.ic_check_box_orange_24dp));
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Bold.ttf"));
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final void K(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((ImageView) view.findViewById(R.id.chkBxSelected)).setImageDrawable(a.c.b(activity, R.drawable.ic_check_box_outline_blank_gray_24dp));
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Medium.ttf"));
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18211v;
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
        return inflater.inflate(R.layout.fragment_screen_s82, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18211v.clear();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ArrayList();
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            if (A0.containsKey("s82_heading")) {
                Object obj = A0.get("s82_heading");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS82Header)).setText((String) obj);
            }
            if (A0.containsKey("s82_btn_text")) {
                Object obj2 = A0.get("s82_btn_text");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) _$_findCachedViewById(R.id.btnS82Button)).setText((String) obj2);
            }
            HashMap<String, Object> hashMap = templateActivity.F;
            Object obj3 = hashMap.get("list");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            Iterator it = ((ArrayList) obj3).iterator();
            while (it.hasNext()) {
                String tt2 = (String) it.next();
                kotlin.jvm.internal.i.f(tt2, "tt");
                ((ArrayList) xVar.f23469u).add(new TaskIn2Min(tt2, false));
            }
            if (hashMap.containsKey("s82_user_list")) {
                Object obj4 = hashMap.get("s82_user_list");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.TaskIn2Min>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.TaskIn2Min> }");
                ArrayList arrayList = (ArrayList) obj4;
                Iterator it2 = ((ArrayList) xVar.f23469u).iterator();
                while (it2.hasNext()) {
                    TaskIn2Min taskIn2Min = (TaskIn2Min) it2.next();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        TaskIn2Min taskIn2Min2 = (TaskIn2Min) it3.next();
                        if (kotlin.jvm.internal.i.b(taskIn2Min2.getText(), taskIn2Min.getText())) {
                            taskIn2Min.setIn2Min(taskIn2Min2.getIn2Min());
                        }
                    }
                }
            }
            Iterator it4 = ((ArrayList) xVar.f23469u).iterator();
            while (it4.hasNext()) {
                TaskIn2Min taskIn2Min3 = (TaskIn2Min) it4.next();
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_checkbox, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS82List)), false);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) inflate;
                ((RobertoTextView) frameLayout.findViewById(R.id.tvLabel)).setText(taskIn2Min3.getText());
                if (taskIn2Min3.getIn2Min()) {
                    J(frameLayout);
                } else {
                    K(frameLayout);
                }
                frameLayout.setOnClickListener(new o4(17, taskIn2Min3, this, xVar));
                ((LinearLayout) _$_findCachedViewById(R.id.llS82List)).addView(frameLayout);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS82Button)).setOnClickListener(new sq.p(this, 29, xVar));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new r8(5, this));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18210u, "Exception in on view created ", e10);
        }
    }
}
