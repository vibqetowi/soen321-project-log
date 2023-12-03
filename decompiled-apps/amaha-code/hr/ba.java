package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS96Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/ba;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ba extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18212w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18214v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18213u = LogHelper.INSTANCE.makeLogTag(ba.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18214v;
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
        return inflater.inflate(R.layout.fragment_screen_s96, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18214v.clear();
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
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).Q) {
                int hashCode = B0.hashCode();
                if (hashCode != 112336) {
                    if (hashCode != 3482390) {
                        if (hashCode == 107952545) {
                            if (!B0.equals("s92-b")) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!B0.equals("s92b")) {
                        return;
                    }
                    templateActivity.s0(new j4());
                    return;
                } else if (B0.equals("s96")) {
                    templateActivity.s0(new ca());
                    return;
                } else {
                    return;
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvs96Header)).setText(UtilFunKt.paramsMapToString(A0.get("s96_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvInputHeading)).setText(UtilFunKt.paramsMapToString(A0.get("s96_input_heading")));
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setHint(UtilFunKt.paramsMapToString(A0.get("s96_placeholder")));
            ((RobertoButton) _$_findCachedViewById(R.id.btns96Button)).setText(UtilFunKt.paramsMapToString(A0.get("s96_btn_text")));
            boolean b10 = kotlin.jvm.internal.i.b(templateActivity.B0(), "s92-b");
            HashMap<String, Object> hashMap = templateActivity.F;
            if (b10) {
                if (hashMap.containsKey("s96_user_data")) {
                    Object obj = hashMap.get("s96_user_data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setText((String) obj);
                } else if (hashMap.containsKey("age") && templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new nn.f(this, 13, templateActivity));
                }
            } else if (templateActivity.J && hashMap.containsKey("s96_user_data")) {
                Object obj2 = hashMap.get("s96_user_data");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setText((String) obj2);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btns96Button)).setOnClickListener(new tk.q(this, B0, A0, templateActivity, 23));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 14));
        } catch (Exception e10) {
            LogHelper.INSTANCE.i(this.f18213u, "Exception", e10);
        }
    }
}
