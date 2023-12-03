package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult25Model;
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
/* compiled from: ScreenResult25Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/z1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19431w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19433v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19432u = LogHelper.INSTANCE.makeLogTag(z1.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19433v;
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
        return inflater.inflate(R.layout.fragment_screen_result_2b, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19433v.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x015a A[Catch: Exception -> 0x01cd, LOOP:0: B:21:0x0154->B:23:0x015a, LOOP_END, TryCatch #1 {Exception -> 0x01cd, blocks: (B:3:0x000c, B:20:0x0148, B:21:0x0154, B:23:0x015a, B:24:0x0198, B:19:0x0141, B:5:0x00a7, B:8:0x00b3, B:11:0x00b8, B:12:0x00fe, B:14:0x0102, B:16:0x010c), top: B:32:0x000c, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r15v18, types: [T, com.theinnerhour.b2b.model.ScreenResult25Model] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.theinnerhour.b2b.model.ScreenResult25Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        Iterator<String> it;
        boolean z10;
        HashMap<String, Object> hashMap;
        String str = this.f19432u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            Goal y02 = templateActivity.y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult25Model(Utils.INSTANCE.getTimeInSeconds());
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR2bTitle)).setText(UtilFunKt.paramsMapToString(A0.get("r25_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR2bHeading)).setText(UtilFunKt.paramsMapToString(A0.get("r25_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR2bDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r25_desc")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r25_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("r25_btn_two_text")));
            try {
                z10 = templateActivity.J;
                hashMap = templateActivity.F;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "exception in reading list from firebase", e10);
            }
            if (!z10 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ((ScreenResult25Model) xVar.f23469u).setList((ArrayList) obj);
                Object obj2 = hashMap.get("other_duration");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((ScreenResult25Model) xVar.f23469u).setOtherDuration(Integer.valueOf(Integer.parseInt((String) obj2)));
                Object obj3 = hashMap.get("sleep_duration");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                ((ScreenResult25Model) xVar.f23469u).setSleepDuration(Integer.valueOf(Integer.parseInt((String) obj3)));
                it = ((ScreenResult25Model) xVar.f23469u).getList().iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    View inflate = activity2.getLayoutInflater().inflate(R.layout.row_tick_underline_card, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(it.next());
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(relativeLayout);
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonTwo)).setOnClickListener(new d0(templateActivity, uVar, "result_25", xVar, 1));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 13));
                ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonOne)).setOnClickListener(new c0(templateActivity, 14));
            }
            uVar.f23466u = false;
            if (y02 != null && y02.getData().containsKey("result_25")) {
                ?? result25MapToObject = UtilFunKt.result25MapToObject(y02.getData().get("result_25"));
                xVar.f23469u = result25MapToObject;
                hashMap.put("sleep_duration", String.valueOf(result25MapToObject.getSleepDuration()));
                hashMap.put("other_duration", String.valueOf(((ScreenResult25Model) xVar.f23469u).getOtherDuration()));
                hashMap.put("list", ((ScreenResult25Model) xVar.f23469u).getList());
            }
            it = ((ScreenResult25Model) xVar.f23469u).getList().iterator();
            while (it.hasNext()) {
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonTwo)).setOnClickListener(new d0(templateActivity, uVar, "result_25", xVar, 1));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 13));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonOne)).setOnClickListener(new c0(templateActivity, 14));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "exception", e11);
        }
    }
}
