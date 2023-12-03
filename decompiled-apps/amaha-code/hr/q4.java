package hr;

import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q4 implements View.OnClickListener {
    public final /* synthetic */ Serializable A;
    public final /* synthetic */ Serializable B;
    public final /* synthetic */ Serializable C;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19011u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f19012v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f19013w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ rr.b f19014x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Serializable f19015y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Serializable f19016z;

    public /* synthetic */ q4(r4 r4Var, ArrayList arrayList, int i6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, String str) {
        this.f19014x = r4Var;
        this.f19015y = arrayList;
        this.f19012v = i6;
        this.f19016z = arrayList2;
        this.A = arrayList3;
        this.B = arrayList4;
        this.C = arrayList5;
        this.f19013w = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i6 = this.f19011u;
        int i10 = this.f19012v;
        String popupBtn = this.f19013w;
        Serializable serializable = this.C;
        Serializable serializable2 = this.B;
        Serializable serializable3 = this.A;
        Serializable serializable4 = this.f19016z;
        Serializable serializable5 = this.f19015y;
        rr.b bVar = this.f19014x;
        switch (i6) {
            case 0:
                r4 this$0 = (r4) bVar;
                ArrayList popupHeadingList = (ArrayList) serializable5;
                ArrayList list1 = (ArrayList) serializable4;
                ArrayList popupDescriptionList = (ArrayList) serializable3;
                ArrayList popupExampleList = (ArrayList) serializable2;
                ArrayList popupExampleTextList = (ArrayList) serializable;
                int i11 = r4.f19081w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(popupHeadingList, "$popupHeadingList");
                kotlin.jvm.internal.i.g(list1, "$list1");
                kotlin.jvm.internal.i.g(popupDescriptionList, "$popupDescriptionList");
                kotlin.jvm.internal.i.g(popupExampleList, "$popupExampleList");
                kotlin.jvm.internal.i.g(popupExampleTextList, "$popupExampleTextList");
                kotlin.jvm.internal.i.g(popupBtn, "$popupBtn");
                try {
                    if (popupHeadingList.size() - 1 < i10) {
                        str = "";
                    } else {
                        str = (String) popupHeadingList.get(i10);
                    }
                    kotlin.jvm.internal.i.f(str, "if(popupHeadingList.size…pupHeadingList[i] else \"\"");
                    if (list1.size() < i10) {
                        str2 = "";
                    } else {
                        str2 = (String) list1.get(i10);
                    }
                    kotlin.jvm.internal.i.f(str2, "if(list1.size >= i) list1[i] else \"\"");
                    if (popupDescriptionList.size() - 1 < i10) {
                        str3 = "";
                    } else {
                        str3 = (String) popupDescriptionList.get(i10);
                    }
                    kotlin.jvm.internal.i.f(str3, "if(popupDescriptionList.…escriptionList[i] else \"\"");
                    if (popupExampleList.size() - 1 < i10) {
                        str4 = "";
                    } else {
                        str4 = (String) popupExampleList.get(i10);
                    }
                    kotlin.jvm.internal.i.f(str4, "if(popupExampleList.size…pupExampleList[i] else \"\"");
                    if (popupExampleTextList.size() - 1 < i10) {
                        str5 = "";
                    } else {
                        str5 = (String) popupExampleTextList.get(i10);
                    }
                    kotlin.jvm.internal.i.f(str5, "if(popupExampleTextList.…xampleTextList[i] else \"\"");
                    this$0.M(str, str2, str3, str4, str5, popupBtn);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f19082u, "exception", e10);
                    return;
                }
            default:
                ga this$02 = (ga) bVar;
                kotlin.jvm.internal.x popupHeadingList2 = (kotlin.jvm.internal.x) serializable5;
                kotlin.jvm.internal.x popupDescriptionList2 = (kotlin.jvm.internal.x) serializable4;
                kotlin.jvm.internal.x popupExampleList2 = (kotlin.jvm.internal.x) serializable3;
                kotlin.jvm.internal.x popupExampleTextList2 = (kotlin.jvm.internal.x) serializable2;
                kotlin.jvm.internal.x popupBtn2 = (kotlin.jvm.internal.x) serializable;
                int i12 = ga.f18476x;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(popupHeadingList2, "$popupHeadingList");
                kotlin.jvm.internal.i.g(popupBtn, "$tt");
                kotlin.jvm.internal.i.g(popupDescriptionList2, "$popupDescriptionList");
                kotlin.jvm.internal.i.g(popupExampleList2, "$popupExampleList");
                kotlin.jvm.internal.i.g(popupExampleTextList2, "$popupExampleTextList");
                kotlin.jvm.internal.i.g(popupBtn2, "$popupBtn");
                if (((ArrayList) popupHeadingList2.f23469u).size() - 1 < i10) {
                    str6 = "";
                } else {
                    str6 = (String) ((ArrayList) popupHeadingList2.f23469u).get(i10);
                }
                kotlin.jvm.internal.i.f(str6, "if(popupHeadingList.size…pupHeadingList[i] else \"\"");
                if (((ArrayList) popupDescriptionList2.f23469u).size() - 1 < i10) {
                    str7 = "";
                } else {
                    str7 = (String) ((ArrayList) popupDescriptionList2.f23469u).get(i10);
                }
                kotlin.jvm.internal.i.f(str7, "if(popupDescriptionList.…escriptionList[i] else \"\"");
                if (((ArrayList) popupExampleList2.f23469u).size() - 1 < i10) {
                    str8 = "";
                } else {
                    str8 = (String) ((ArrayList) popupExampleList2.f23469u).get(i10);
                }
                kotlin.jvm.internal.i.f(str8, "if(popupExampleList.size…pupExampleList[i] else \"\"");
                if (((ArrayList) popupExampleTextList2.f23469u).size() - 1 < i10) {
                    str9 = "";
                } else {
                    str9 = (String) ((ArrayList) popupExampleTextList2.f23469u).get(i10);
                }
                kotlin.jvm.internal.i.f(str9, "if(popupExampleTextList.…xampleTextList[i] else \"\"");
                String str10 = (String) popupBtn2.f23469u;
                try {
                    UiUtils.Companion companion = UiUtils.Companion;
                    androidx.fragment.app.p activity = this$02.getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    Dialog fullScreenDialog = companion.getFullScreenDialog(R.layout.fragment_screen_popup3, activity);
                    ((ImageView) fullScreenDialog.findViewById(R.id.ivEllipses)).setVisibility(4);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Header)).setText(str6);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvLabel)).setText(popupBtn);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Desc)).setText(str7);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3ExampleLabel)).setText(str8);
                    ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Example)).setText(str9);
                    ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setText(str10);
                    fullScreenDialog.show();
                    ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setOnClickListener(new nq.n(fullScreenDialog, 25));
                    ((ImageView) fullScreenDialog.findViewById(R.id.ivClose)).setOnClickListener(new nq.n(fullScreenDialog, 26));
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$02.f18477u, "exception", e11);
                    return;
                }
        }
    }

    public /* synthetic */ q4(ga gaVar, kotlin.jvm.internal.x xVar, int i6, String str, kotlin.jvm.internal.x xVar2, kotlin.jvm.internal.x xVar3, kotlin.jvm.internal.x xVar4, kotlin.jvm.internal.x xVar5) {
        this.f19014x = gaVar;
        this.f19015y = xVar;
        this.f19012v = i6;
        this.f19013w = str;
        this.f19016z = xVar2;
        this.A = xVar3;
        this.B = xVar4;
        this.C = xVar5;
    }
}
