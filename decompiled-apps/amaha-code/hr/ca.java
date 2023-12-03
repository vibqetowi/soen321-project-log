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
/* compiled from: ScreenS97Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/ca;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ca extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18266w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18268v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18267u = LogHelper.INSTANCE.makeLogTag(ca.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18268v;
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
        return inflater.inflate(R.layout.fragment_screen_s97, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18268v.clear();
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
            ((RobertoTextView) _$_findCachedViewById(R.id.tvs97Header)).setText(UtilFunKt.paramsMapToString(A0.get("s97_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS97Description)).setText(UtilFunKt.paramsMapToString(A0.get("s97_description")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvInputHeading)).setText(UtilFunKt.paramsMapToString(A0.get("s97_input_heading")));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS97Input)).setHint(UtilFunKt.paramsMapToString(A0.get("s97_placeholder")));
            ((RobertoButton) _$_findCachedViewById(R.id.btns97Button)).setText(UtilFunKt.paramsMapToString(A0.get("s97_btn_text")));
            HashMap<String, Object> hashMap = templateActivity.F;
            if (hashMap.containsKey("s97_user_data")) {
                Object obj = hashMap.get("s97_user_data");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) _$_findCachedViewById(R.id.etS97Input)).setText((String) obj);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btns97Button)).setOnClickListener(new r8(7, this));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 15));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18267u, "Exception", e10);
        }
    }
}
