package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS76Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/u8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u8 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19252w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19254v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19253u = LogHelper.INSTANCE.makeLogTag(u8.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19254v;
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
        return inflater.inflate(R.layout.fragment_screen_s76, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19254v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            Object obj = A0.get("s76_heading");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText((String) obj);
            Object obj2 = A0.get("s76_description");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText((String) obj2);
            Object obj3 = A0.get("s76_btn_text");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setText((String) obj3);
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new r8(2, this));
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s76_heading_list"));
            ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s76_description_list"));
            Iterator<String> it = paramsMapToList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int i10 = i6 + 1;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_screen_s88, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(it.next());
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(paramsMapToList2.get(i6));
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                i6 = i10;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19253u, "exceptioin in on view created", e10);
        }
    }
}
