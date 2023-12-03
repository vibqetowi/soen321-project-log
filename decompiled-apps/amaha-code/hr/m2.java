package hr;

import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Serializable B;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18800u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f18801v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18802w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f18803x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f18804y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f18805z;

    public /* synthetic */ m2(RelativeLayout relativeLayout, z6 z6Var, String str, TemplateActivity templateActivity, kotlin.jvm.internal.x xVar, String str2, int i6) {
        this.f18804y = relativeLayout;
        this.f18805z = z6Var;
        this.f18801v = str;
        this.A = templateActivity;
        this.f18802w = xVar;
        this.B = str2;
        this.f18803x = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18800u;
        int i10 = this.f18803x;
        String slug = this.f18801v;
        kotlin.jvm.internal.x originalList = this.f18802w;
        Object obj = this.A;
        Serializable serializable = this.B;
        Object obj2 = this.f18805z;
        Object obj3 = this.f18804y;
        switch (i6) {
            case 0:
                n2 this$0 = (n2) obj3;
                ArrayList popupHeadingList = (ArrayList) obj2;
                kotlin.jvm.internal.v finalIndex = (kotlin.jvm.internal.v) serializable;
                ArrayList popupDescriptionList = (ArrayList) obj;
                int i11 = n2.f18875w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(popupHeadingList, "$popupHeadingList");
                kotlin.jvm.internal.i.g(finalIndex, "$finalIndex");
                kotlin.jvm.internal.i.g(originalList, "$list");
                kotlin.jvm.internal.i.g(popupDescriptionList, "$popupDescriptionList");
                kotlin.jvm.internal.i.g(slug, "$popupBtn");
                Object obj4 = popupHeadingList.get(finalIndex.f23467u);
                kotlin.jvm.internal.i.f(obj4, "popupHeadingList[finalIndex]");
                String str = (String) obj4;
                Object obj5 = ((ArrayList) originalList.f23469u).get(i10);
                kotlin.jvm.internal.i.f(obj5, "list[index]");
                String str2 = (String) obj5;
                Object obj6 = popupDescriptionList.get(finalIndex.f23467u);
                kotlin.jvm.internal.i.f(obj6, "popupDescriptionList[finalIndex]");
                String str3 = (String) obj6;
                try {
                    UiUtils.Companion companion = UiUtils.Companion;
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    Dialog fullScreenDialog = companion.getFullScreenDialog(R.layout.fragment_screen_popup3, activity);
                    ((ImageView) fullScreenDialog.findViewById(R.id.ivEllipses)).setVisibility(4);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Header)).setText(str);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvLabel)).setText(str2);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Desc)).setText(str3);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3ExampleLabel)).setText("");
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Example)).setText("");
                    ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setText(slug);
                    ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setOnClickListener(new nq.n(fullScreenDialog, 15));
                    ((ImageView) fullScreenDialog.findViewById(R.id.ivClose)).setOnClickListener(new nq.n(fullScreenDialog, 16));
                    fullScreenDialog.show();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f18876u, "exception", e10);
                    return;
                }
            default:
                RelativeLayout row = (RelativeLayout) obj3;
                z6 this$02 = (z6) obj2;
                TemplateActivity act = (TemplateActivity) obj;
                String tt2 = (String) serializable;
                int i12 = z6.f19444w;
                kotlin.jvm.internal.i.g(row, "$row");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(slug, "$slug");
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(originalList, "$originalList");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                androidx.fragment.app.p activity2 = this$02.getActivity();
                kotlin.jvm.internal.i.d(activity2);
                row.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
                androidx.fragment.app.p activity3 = this$02.getActivity();
                kotlin.jvm.internal.i.d(activity3);
                ((RobertoTextView) row.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
                boolean b10 = kotlin.jvm.internal.i.b(slug, "s136");
                HashMap<String, Object> hashMap = act.F;
                if (b10) {
                    hashMap.put("selection_index", Integer.valueOf(((ArrayList) originalList.f23469u).indexOf(tt2)));
                } else {
                    hashMap.put("selection_index", Integer.valueOf(i10));
                }
                act.s0(new aa());
                return;
        }
    }

    public /* synthetic */ m2(n2 n2Var, ArrayList arrayList, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.x xVar, int i6, ArrayList arrayList2, String str) {
        this.f18804y = n2Var;
        this.f18805z = arrayList;
        this.B = vVar;
        this.f18802w = xVar;
        this.f18803x = i6;
        this.A = arrayList2;
        this.f18801v = str;
    }
}
