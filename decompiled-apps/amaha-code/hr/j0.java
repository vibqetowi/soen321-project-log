package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ProsAndConsModel;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult14Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/j0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j0 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f18606y = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f18608v;

    /* renamed from: w  reason: collision with root package name */
    public int f18609w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f18610x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18607u = LogHelper.INSTANCE.makeLogTag(j0.class);

    public final View J(int i6, String str) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        View inflate = activity.getLayoutInflater().inflate(R.layout.row_pros_and_cons_result, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.prosLinearLayout)), false);
        ((TextView) inflate.findViewById(R.id.textView1)).setText(str);
        ((TextView) inflate.findViewById(R.id.textView2)).setText(String.valueOf(i6));
        return inflate;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18610x;
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
        return inflater.inflate(R.layout.fragment_screen_result_14, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18610x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            templateActivity.B0();
            Object obj = templateActivity.F.get("pros-and-cons");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult14Model");
            ScreenResult14Model screenResult14Model = (ScreenResult14Model) obj;
            this.f18609w = 0;
            this.f18608v = 0;
            if (A0.containsKey("r14_heading")) {
                Object obj2 = A0.get("r14_heading");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14Header)).setText((String) obj2);
            }
            if (A0.containsKey("r14_pros_text")) {
                Object obj3 = A0.get("r14_pros_text");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsText)).setText((String) obj3);
            }
            if (A0.containsKey("r14_cons_text")) {
                Object obj4 = A0.get("r14_cons_text");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsText)).setText((String) obj4);
            }
            if (A0.containsKey("r14_btn_one_text")) {
                Object obj5 = A0.get("r14_btn_one_text");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonOne)).setText((String) obj5);
            }
            if (A0.containsKey("r14_btn_two_text")) {
                Object obj6 = A0.get("r14_btn_two_text");
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonTwo)).setText((String) obj6);
            }
            if (!screenResult14Model.getPros().isEmpty()) {
                Iterator<ProsAndConsModel> it = screenResult14Model.getPros().iterator();
                while (it.hasNext()) {
                    ProsAndConsModel next = it.next();
                    this.f18609w += next.getValue();
                    ((LinearLayout) _$_findCachedViewById(R.id.prosLinearLayout)).addView(J(next.getValue(), next.getText()));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsCountText)).setText(String.valueOf(this.f18609w));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsCountText)).setText("0");
            }
            if (!screenResult14Model.getCons().isEmpty()) {
                Iterator<ProsAndConsModel> it2 = screenResult14Model.getCons().iterator();
                while (it2.hasNext()) {
                    ProsAndConsModel next2 = it2.next();
                    this.f18608v += next2.getValue();
                    ((LinearLayout) _$_findCachedViewById(R.id.consLinearLayout)).addView(J(next2.getValue(), next2.getText()));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsCountText)).setText(String.valueOf(this.f18608v));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsCountText)).setText("0");
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.textView13)).setText(screenResult14Model.getStatement());
            int i6 = this.f18609w;
            int i10 = this.f18608v;
            if (i6 > i10) {
                Object obj7 = A0.get("r14_pros_more_text");
                kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14)).setText((String) obj7);
            } else if (i10 > i6) {
                Object obj8 = A0.get("r14_cons_more_text");
                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14)).setText((String) obj8);
            } else {
                Object obj9 = A0.get("r14_similar_text");
                kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14)).setText((String) obj9);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonTwo)).setOnClickListener(new nn.g(24, this, templateActivity, screenResult14Model));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonOne)).setOnClickListener(new c0(templateActivity, 2));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new qq.n(this, 24));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18607u, "Exception in on view created", e10);
        }
    }
}
