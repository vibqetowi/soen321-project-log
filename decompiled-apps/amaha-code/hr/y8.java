package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.UrgentImportantModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS78Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/y8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class y8 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19422w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19424v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19423u = LogHelper.INSTANCE.makeLogTag(y8.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19424v;
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
        return inflater.inflate(R.layout.fragment_screen_s78, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19424v.clear();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ArrayList();
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> hashMap = templateActivity.F;
            HashMap<String, Object> A0 = templateActivity.A0();
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s78")) {
                if (A0.containsKey("s78_heading")) {
                    Object obj = A0.get("s78_heading");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS78Header)).setText((String) obj);
                }
                if (A0.containsKey("s78_important_text")) {
                    Object obj2 = A0.get("s78_important_text");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS78ImportantText)).setText((String) obj2);
                }
                if (A0.containsKey("s78_urgent_text")) {
                    Object obj3 = A0.get("s78_urgent_text");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS78UrgentText)).setText((String) obj3);
                }
                if (A0.containsKey("s78_btn_text")) {
                    Object obj4 = A0.get("s78_btn_text");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS78Button)).setText((String) obj4);
                }
            }
            ((ArrayList) xVar.f23469u).clear();
            Object obj5 = hashMap.get("list");
            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            Iterator it = ((ArrayList) obj5).iterator();
            while (it.hasNext()) {
                String tt2 = (String) it.next();
                kotlin.jvm.internal.i.f(tt2, "tt");
                ((ArrayList) xVar.f23469u).add(new UrgentImportantModel(tt2, false, false, 6, null));
            }
            if (hashMap.containsKey("s78_user_list")) {
                Object obj6 = hashMap.get("s78_user_list");
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.UrgentImportantModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.UrgentImportantModel> }");
                ArrayList arrayList = (ArrayList) obj6;
                Iterator it2 = ((ArrayList) xVar.f23469u).iterator();
                while (it2.hasNext()) {
                    UrgentImportantModel urgentImportantModel = (UrgentImportantModel) it2.next();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        UrgentImportantModel urgentImportantModel2 = (UrgentImportantModel) it3.next();
                        if (kotlin.jvm.internal.i.b(urgentImportantModel2.getText(), urgentImportantModel.getText())) {
                            urgentImportantModel.setImportant(urgentImportantModel2.getImportant());
                            urgentImportantModel.setUrgent(urgentImportantModel2.getUrgent());
                        }
                    }
                }
            }
            Iterator it4 = ((ArrayList) xVar.f23469u).iterator();
            while (it4.hasNext()) {
                final UrgentImportantModel urgentImportantModel3 = (UrgentImportantModel) it4.next();
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_card_text_2_checkbox, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS78List)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView)).setText(urgentImportantModel3.getText());
                ((AppCompatCheckBox) inflate.findViewById(R.id.checkBox1)).setChecked(urgentImportantModel3.getUrgent());
                ((AppCompatCheckBox) inflate.findViewById(R.id.checkBox2)).setChecked(urgentImportantModel3.getImportant());
                ((AppCompatCheckBox) inflate.findViewById(R.id.checkBox1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hr.x8
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                        int i6 = r2;
                        UrgentImportantModel tt3 = urgentImportantModel3;
                        switch (i6) {
                            case 0:
                                int i10 = y8.f19422w;
                                kotlin.jvm.internal.i.g(tt3, "$tt");
                                tt3.setUrgent(z10);
                                return;
                            default:
                                int i11 = y8.f19422w;
                                kotlin.jvm.internal.i.g(tt3, "$tt");
                                tt3.setImportant(z10);
                                return;
                        }
                    }
                });
                ((AppCompatCheckBox) inflate.findViewById(R.id.checkBox2)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hr.x8
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                        int i6 = r2;
                        UrgentImportantModel tt3 = urgentImportantModel3;
                        switch (i6) {
                            case 0:
                                int i10 = y8.f19422w;
                                kotlin.jvm.internal.i.g(tt3, "$tt");
                                tt3.setUrgent(z10);
                                return;
                            default:
                                int i11 = y8.f19422w;
                                kotlin.jvm.internal.i.g(tt3, "$tt");
                                tt3.setImportant(z10);
                                return;
                        }
                    }
                });
                ((LinearLayout) _$_findCachedViewById(R.id.llS78List)).addView(inflate);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS78Button)).setOnClickListener(new sq.p(this, 28, xVar));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new o4(hashMap, xVar, this));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19423u, "Exception in on view created ", e10);
        }
    }
}
