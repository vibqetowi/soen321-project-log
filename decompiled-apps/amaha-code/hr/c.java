package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ProsAndConsModel;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: Log14ResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/c;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18215z = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f18218w;

    /* renamed from: x  reason: collision with root package name */
    public int f18219x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18220y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18216u = LogHelper.INSTANCE.makeLogTag(c.class);

    /* renamed from: v  reason: collision with root package name */
    public ScreenResult14Model f18217v = new ScreenResult14Model(Utils.INSTANCE.getTimeInSeconds(), "");

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18220y;
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
        return inflater.inflate(R.layout.fragment_log14_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18220y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> hashMap = templateActivity.F;
            HashMap<String, Object> A0 = templateActivity.A0();
            Object obj = hashMap.get("data");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult14Model");
            this.f18217v = (ScreenResult14Model) obj;
            Object obj2 = A0.get("r14_heading");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS6061Header)).setText((String) obj2);
            Object obj3 = A0.get("r14_pros_text");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) _$_findCachedViewById(R.id.prosHeading)).setText((String) obj3);
            Object obj4 = A0.get("r14_cons_text");
            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) _$_findCachedViewById(R.id.consHeading)).setText((String) obj4);
            ((RobertoTextView) _$_findCachedViewById(R.id.textView13)).setText(this.f18217v.getStatement());
            Iterator<ProsAndConsModel> it = this.f18217v.getPros().iterator();
            while (it.hasNext()) {
                ProsAndConsModel next = it.next();
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_pros_and_cons, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llPros)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(String.valueOf(next.getValue()));
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(next.getText());
                ((LinearLayout) _$_findCachedViewById(R.id.llPros)).addView(inflate);
            }
            Iterator<ProsAndConsModel> it2 = this.f18217v.getCons().iterator();
            while (it2.hasNext()) {
                ProsAndConsModel next2 = it2.next();
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                View inflate2 = activity3.getLayoutInflater().inflate(R.layout.row_pros_and_cons, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llCons)), false);
                ((RobertoTextView) inflate2.findViewById(R.id.textView1)).setText(String.valueOf(next2.getValue()));
                ((RobertoTextView) inflate2.findViewById(R.id.textView2)).setText(next2.getText());
                ((LinearLayout) _$_findCachedViewById(R.id.llCons)).addView(inflate2);
            }
            if (!this.f18217v.getPros().isEmpty()) {
                Iterator<ProsAndConsModel> it3 = this.f18217v.getPros().iterator();
                while (it3.hasNext()) {
                    this.f18219x += it3.next().getValue();
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsCountText)).setText(String.valueOf(this.f18219x));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsCountText)).setText("0");
            }
            if (!this.f18217v.getCons().isEmpty()) {
                Iterator<ProsAndConsModel> it4 = this.f18217v.getCons().iterator();
                while (it4.hasNext()) {
                    this.f18218w += it4.next().getValue();
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsCountText)).setText(String.valueOf(this.f18218w));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsCountText)).setText("0");
            }
            int i6 = this.f18219x;
            int i10 = this.f18218w;
            if (i6 > i10) {
                Object obj5 = A0.get("r14_pros_more_text");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14Statement)).setText((String) obj5);
            } else if (i10 > i6) {
                Object obj6 = A0.get("r14_cons_more_text");
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14Statement)).setText((String) obj6);
            } else {
                Object obj7 = A0.get("r14_similar_text");
                kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14Statement)).setText((String) obj7);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new a(templateActivity, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18216u, "Exception in on view created ", e10);
        }
    }
}
