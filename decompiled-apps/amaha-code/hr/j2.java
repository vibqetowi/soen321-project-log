package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult28Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/j2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j2 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18612w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18614v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18613u = LogHelper.INSTANCE.makeLogTag(j2.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18614v;
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
        return inflater.inflate(R.layout.fragment_screen_result_28, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18614v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            Goal y02 = templateActivity.y0();
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR28Title)).setText(UtilFunKt.paramsMapToString(A0.get("r28_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR28Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r28_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR28Desc)).setText(UtilFunKt.paramsMapToString(A0.get("r28_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r28_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("r28_btn_two_text")));
            boolean b10 = kotlin.jvm.internal.i.b(templateActivity.B0(), "s122");
            HashMap<String, Object> hashMap = templateActivity.F;
            if (b10) {
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    View inflate = activity2.getLayoutInflater().inflate(R.layout.row_s28, (ViewGroup) null);
                    ((RobertoTextView) inflate.findViewById(R.id.tvLabel)).setText((String) it.next());
                    ((ImageView) inflate.findViewById(R.id.imageView5)).setImageDrawable(getResources().getDrawable(R.drawable.ic_check_orange_24dp));
                    ((LinearLayout) _$_findCachedViewById(R.id.llR28List)).addView(inflate);
                }
                Object obj2 = hashMap.get("3u_model");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult28Model");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonTwo)).setOnClickListener(new ek.p(y02, templateActivity, "result_28", (ScreenResult28Model) obj2, this, 7));
            } else {
                ScreenResult28Model screenResult28Model = new ScreenResult28Model(Utils.INSTANCE.getTimeInSeconds());
                Object obj3 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                screenResult28Model.setList((ArrayList) obj3);
                Iterator<String> it2 = screenResult28Model.getList().iterator();
                while (it2.hasNext()) {
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    View inflate2 = activity3.getLayoutInflater().inflate(R.layout.row_s28, (ViewGroup) null);
                    ((RobertoTextView) inflate2.findViewById(R.id.tvLabel)).setText(it2.next());
                    ((ImageView) inflate2.findViewById(R.id.imageView5)).setImageDrawable(getResources().getDrawable(R.drawable.ic_check_orange_24dp));
                    ((LinearLayout) _$_findCachedViewById(R.id.llR28List)).addView(inflate2);
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonTwo)).setOnClickListener(new z0(this, 7));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR28ButtonOne)).setOnClickListener(new c0(templateActivity, 16));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 17));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18613u, "exception in on view created", e10);
        }
    }
}
