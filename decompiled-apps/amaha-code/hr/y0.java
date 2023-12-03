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
import com.theinnerhour.b2b.model.ScreenResult18Model;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult18Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/y0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class y0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19404w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19406v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19405u = LogHelper.INSTANCE.makeLogTag(y0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19406v;
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
        return inflater.inflate(R.layout.fragment_screen_result_18, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19406v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
        if (((com.theinnerhour.b2b.activity.TemplateActivity) r8).I != false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v17, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f19405u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity).F.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            xVar.f23469u = (ArrayList) obj;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity2).y0();
            try {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (!((TemplateActivity) activity3).J) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                }
                if (y02 != null && y02.getData().containsKey("list_result_18")) {
                    Object obj2 = y02.getData().get("list_result_18");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult18Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult18Model> }");
                    ArrayList arrayList = (ArrayList) obj2;
                    if (arrayList.size() > 0) {
                        ScreenResult18Model screenResult18Model = (ScreenResult18Model) is.u.o2(arrayList);
                        String text1 = screenResult18Model.getText1();
                        kotlin.jvm.internal.i.d(text1);
                        String text2 = screenResult18Model.getText2();
                        kotlin.jvm.internal.i.d(text2);
                        String text3 = screenResult18Model.getText3();
                        kotlin.jvm.internal.i.d(text3);
                        String text4 = screenResult18Model.getText4();
                        kotlin.jvm.internal.i.d(text4);
                        xVar.f23469u = ca.a.k(text1, text2, text3, text4);
                    }
                } else {
                    xVar.f23469u = new ArrayList();
                }
                androidx.fragment.app.p activity5 = getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity5).F.put("list", xVar.f23469u);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "exception in reading list from firebase", e10);
            }
            ((TextView) _$_findCachedViewById(R.id.result1)).setText((CharSequence) ((ArrayList) xVar.f23469u).get(0));
            ((TextView) _$_findCachedViewById(R.id.result2)).setText((CharSequence) ((ArrayList) xVar.f23469u).get(1));
            ((TextView) _$_findCachedViewById(R.id.result3)).setText((CharSequence) ((ArrayList) xVar.f23469u).get(2));
            ((TextView) _$_findCachedViewById(R.id.result4)).setText((CharSequence) ((ArrayList) xVar.f23469u).get(3));
            ((Button) _$_findCachedViewById(R.id.button1)).setOnClickListener(new qq.n(this, 29));
            ((Button) _$_findCachedViewById(R.id.button2)).setOnClickListener(new tk.q(y02, xVar, "list_result_18", this, 16));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "Exception in view created", e11);
        }
    }
}
