package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticScreenLog1ResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/f1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15706w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15708v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15707u = LogHelper.INSTANCE.makeLogTag(f1.class);

    public final void J(ScreenResult1Model screenResult1Model, ArrayList<String> arrayList) {
        String str;
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).removeAllViews();
        if (arrayList.size() == 1) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(screenResult1Model.getList().get(screenResult1Model.getList().size() - 1));
            ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText(arrayList.get(0));
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout);
            return;
        }
        Iterator<String> it = screenResult1Model.getList().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            int i10 = i6 + 1;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
            kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout2 = (LinearLayout) inflate2;
            ((RobertoTextView) linearLayout2.findViewById(R.id.text2)).setText(it.next());
            RobertoTextView robertoTextView = (RobertoTextView) linearLayout2.findViewById(R.id.text1);
            if (i6 < arrayList.size()) {
                str = arrayList.get(i6);
            } else {
                str = "";
            }
            robertoTextView.setText(str);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout2);
            i6 = i10;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15708v;
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
        return inflater.inflate(R.layout.fragment_log6_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15708v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
            T8Activity t8Activity = (T8Activity) activity;
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(getString(R.string.logTitleStatic3GoodThings));
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            String string = arguments.getString("resultKey");
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Good Thing #1");
            arrayList.add("Good Thing #2");
            arrayList.add("Good Thing #3");
            Object obj = t8Activity.B.get(string);
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult1Model");
            J((ScreenResult1Model) obj, arrayList);
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new r(t8Activity, 4));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r(t8Activity, 5));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15707u, "exception in on view created", e10);
        }
    }
}
