package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticScreenLog38ResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/i1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15729w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15731v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15730u = LogHelper.INSTANCE.makeLogTag(i1.class);

    public final void J(ScreenResult10Model screenResult10Model) {
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).removeAllViews();
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        View inflate = activity.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) inflate;
        ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(screenResult10Model.getText());
        ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText("What you were worried about");
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15731v;
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
        this.f15731v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
            T5Activity t5Activity = (T5Activity) activity;
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(getString(R.string.logTitleWorryTime));
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            Object obj = t5Activity.B.get(arguments.getString("resultKey"));
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult10Model");
            J((ScreenResult10Model) obj);
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new g1(t5Activity, 3));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new g1(t5Activity, 4));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15730u, "exception in on view created", e10);
        }
    }
}
