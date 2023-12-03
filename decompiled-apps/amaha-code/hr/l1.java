package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult20Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/l1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18722w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18724v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18723u = LogHelper.INSTANCE.makeLogTag(l1.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18724v;
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
        return inflater.inflate(R.layout.fragment_screen_result_20, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18724v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
        if (((com.theinnerhour.b2b.activity.TemplateActivity) r3).I != false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity).F.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            xVar.f23469u = (ArrayList) obj;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity2).y0();
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (!((TemplateActivity) activity3).J) {
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            }
            kotlin.jvm.internal.i.d(y02);
            Object obj2 = y02.getData().get("result_20");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            xVar.f23469u = (ArrayList) obj2;
            androidx.fragment.app.p activity5 = getActivity();
            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity5).F.put("list", xVar.f23469u);
            ((TextView) _$_findCachedViewById(R.id.result1)).setText((CharSequence) ((ArrayList) xVar.f23469u).get(0));
            ((Button) _$_findCachedViewById(R.id.button1)).setOnClickListener(new z0(this, 3));
            ((Button) _$_findCachedViewById(R.id.button2)).setOnClickListener(new nn.g(27, this, "result_20", xVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18723u, "Excption in on view created", e10);
        }
    }
}
