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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS3Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/t7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t7 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19206w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19208v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19207u = LogHelper.INSTANCE.makeLogTag(t7.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19208v;
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
        return inflater.inflate(R.layout.fragment_screen_s3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19208v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s3_heading")));
            Iterator<String> it = UtilFunKt.paramsMapToList(A0.get("s3_list")).iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6++;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_screen_s3, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i6);
                sb2.append('.');
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(sb2.toString());
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s3_btn_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new i4(templateActivity, 26));
            ((ImageView) _$_findCachedViewById(R.id.imageView1)).setOnClickListener(new z0(this, 28));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19207u, "Exception", e10);
        }
    }
}
