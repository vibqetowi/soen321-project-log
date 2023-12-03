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
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS28Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/y6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class y6 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19417w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19419v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19418u = LogHelper.INSTANCE.makeLogTag(y6.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19419v;
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
        return inflater.inflate(R.layout.fragment_screen_s28, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19419v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            ArrayList<String> arrayList = new ArrayList<>();
            if (kotlin.jvm.internal.i.b(B0, "s28")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS28Header)).setText(UtilFunKt.paramsMapToString(A0.get("s28_heading")));
                arrayList = UtilFunKt.paramsMapToList(A0.get("s28_list"));
            }
            Iterator<String> it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_s28, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS28List)), false);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(it.next());
                ((ImageView) relativeLayout.findViewById(R.id.imageView5)).setBackgroundResource(R.drawable.circle_hollow_orange_small);
                relativeLayout.setOnClickListener(new am.c(relativeLayout, this, templateActivity, i6, 5));
                ((LinearLayout) _$_findCachedViewById(R.id.llS28List)).addView(relativeLayout);
                i6++;
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 20));
        } catch (Exception e10) {
            LogHelper.INSTANCE.i(this.f19418u, "Exception in on view created", e10);
        }
    }
}
