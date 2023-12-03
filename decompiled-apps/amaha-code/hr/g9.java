package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
/* compiled from: ScreenS86Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/g9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g9 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18473w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18475v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18474u = LogHelper.INSTANCE.makeLogTag(g9.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18475v;
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
        return inflater.inflate(R.layout.fragment_screen_s86, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18475v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> paramsMapToList;
        ArrayList<String> paramsMapToList2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 7));
            HashMap<String, Object> A0 = templateActivity.A0();
            String str = "DONE";
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s118-b")) {
                Object obj = templateActivity.F.get("prefix");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj;
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get(str2.concat("_heading"))));
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button);
                if (!templateActivity.getIntent().hasExtra("source") || !kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    str = UtilFunKt.paramsMapToString(A0.get(str2.concat("_btn_text")));
                }
                robertoButton.setText(str);
                paramsMapToList = UtilFunKt.paramsMapToList(A0.get(str2.concat("_heading_list")));
                paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get(str2.concat("_description_list")));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s86_heading")));
                RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.button);
                if (!templateActivity.getIntent().hasExtra("source") || !kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    str = UtilFunKt.paramsMapToString(A0.get("s86_btn_text"));
                }
                robertoButton2.setText(str);
                paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s86_heading_list"));
                paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s86_description_list"));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new b8(templateActivity, 8));
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
            LogHelper.INSTANCE.e(this.f18474u, "exception", e10);
        }
    }
}
