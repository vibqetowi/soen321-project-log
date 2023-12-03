package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS120Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/x4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x4 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19385w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19387v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19386u = LogHelper.INSTANCE.makeLogTag(x4.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19387v;
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
        return inflater.inflate(R.layout.fragment_screen_s120, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19387v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r5.equals("s117") == false) goto L10;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            String B0 = ((TemplateActivity) activity2).B0();
            TextView textView = (TextView) _$_findCachedViewById(R.id.textView2);
            int hashCode = B0.hashCode();
            if (hashCode != 3474628) {
                if (hashCode != 3474654) {
                    if (hashCode == 3474656) {
                        if (!B0.equals("s124")) {
                        }
                        Object obj = A0.get("s120_static_recommendation");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                        str = (String) obj;
                    }
                    str = "";
                } else {
                    if (B0.equals("s122")) {
                        Object obj2 = A0.get("s120_static_recommendation");
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        str = (String) obj2;
                    }
                    str = "";
                }
            }
            textView.setText(str);
            ((Button) _$_findCachedViewById(R.id.button1)).setOnClickListener(new sq.p(B0, 14, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19386u, "Exception", e10);
        }
    }
}
