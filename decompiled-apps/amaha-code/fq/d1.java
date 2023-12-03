package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS8Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/d1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15692w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15694v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15693u = LogHelper.INSTANCE.makeLogTag(d1.class);

    public final void J(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final void K(View view) {
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
        LinkedHashMap linkedHashMap = this.f15694v;
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
        return inflater.inflate(R.layout.fragment_static_s8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15694v.clear();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashSet, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
            T1Activity t1Activity = (T1Activity) activity;
            String str = t1Activity.C;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ArrayList();
            if (kotlin.jvm.internal.i.b(str, "s8-b")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS8Header)).setText("Choose up to 2 activities to engage in if you can't fall asleep");
                ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setText("NEXT");
                ((ArrayList) xVar.f23469u).add("Practising deep breathing");
                ((ArrayList) xVar.f23469u).add("Writing down your thoughts");
                ((ArrayList) xVar.f23469u).add("Reading something light");
                ((ArrayList) xVar.f23469u).add("Listening to soothing music");
                ((ArrayList) xVar.f23469u).add("Preparing for the next day");
                ((ArrayList) xVar.f23469u).add("Having warm milk");
                ((ArrayList) xVar.f23469u).add("Drinking chamomile tea");
            }
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            xVar2.f23469u = new HashSet();
            Iterator it = ((ArrayList) xVar.f23469u).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_checkbox, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS8List)), false);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) inflate;
                ((RobertoTextView) frameLayout.findViewById(R.id.tvLabel)).setText(str2);
                if (((HashSet) xVar2.f23469u).contains(str2)) {
                    J(frameLayout);
                } else {
                    K(frameLayout);
                }
                frameLayout.setOnClickListener(new ek.p(xVar2, str2, this, xVar, str, 4));
                ((LinearLayout) _$_findCachedViewById(R.id.llS8List)).addView(frameLayout);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new tk.q(str, xVar2, this, t1Activity, 13));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new x(4, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15693u, "exception in on view created", e10);
        }
    }
}
