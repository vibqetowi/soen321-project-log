package am;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult31Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.h0;
import hr.a8;
import hr.aa;
import hr.p9;
import hr.w5;
import hr.y6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import up.c;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f623u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f624v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f625w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f626x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f627y;

    public /* synthetic */ c(Object obj, Object obj2, int i6, Object obj3, int i10) {
        this.f623u = i10;
        this.f625w = obj;
        this.f626x = obj2;
        this.f624v = i6;
        this.f627y = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String label;
        int i6 = this.f623u;
        int i10 = this.f624v;
        Object obj = this.f627y;
        Object obj2 = this.f626x;
        Object obj3 = this.f625w;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.v score = (kotlin.jvm.internal.v) obj3;
                FirestoreGoalsActivity this$0 = (FirestoreGoalsActivity) obj2;
                ConstraintLayout bottomSheet = (ConstraintLayout) obj;
                int i11 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(score, "$score");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(bottomSheet, "$bottomSheet");
                int i12 = score.f23467u;
                if (i12 != -1) {
                    fm.a aVar = this$0.f11151x;
                    if (aVar != null) {
                        ta.v.H(kc.f.H(aVar), null, 0, new h0(aVar, i12, i10, null), 3);
                    }
                    BottomSheetBehavior.from(bottomSheet).setState(4);
                    String str2 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    defpackage.e.s(bundle, "course", "type", "goals");
                    bundle.putInt("rating", score.f23467u);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "self_care_nps_submit");
                    return;
                }
                return;
            case 1:
                Dialog dialog = (Dialog) obj3;
                bm.i this$02 = (bm.i) obj2;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                dialog.dismiss();
                ArrayList<Object> arrayList = this$02.f4468z;
                Object obj4 = arrayList.get(i10);
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                int progress = ((AppCompatSeekBar) obj).getProgress();
                Object obj5 = arrayList.get(i10);
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                ((Goal) obj5).getType();
                this$02.A.y((Goal) obj4, progress);
                return;
            case 2:
                Dialog dialog2 = (Dialog) obj3;
                to.c this$03 = (to.c) obj2;
                Bundle analyticsBundle = (Bundle) obj;
                kotlin.jvm.internal.i.g(dialog2, "$dialog");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                dialog2.dismiss();
                if (ConnectionStatusReceiver.isConnected()) {
                    this$03.f33390z.A(i10);
                } else {
                    Toast.makeText(this$03.f33389y, "Connect to Internet", 0).show();
                }
                gk.a.b(analyticsBundle, "remove_family_confirm");
                return;
            case 3:
                kotlin.jvm.internal.v goalProgressStatus = (kotlin.jvm.internal.v) obj3;
                up.c this$04 = (up.c) obj2;
                kotlin.jvm.internal.i.g(goalProgressStatus, "$goalProgressStatus");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                int i13 = goalProgressStatus.f23467u;
                c.b bVar = this$04.C;
                ArrayList<Goal> arrayList2 = this$04.B;
                if (i13 == 2) {
                    Goal goal = arrayList2.get(i10);
                    kotlin.jvm.internal.i.f(goal, "goalList[position]");
                    bVar.q(goal, 1, i10);
                    return;
                }
                Goal goal2 = arrayList2.get(i10);
                kotlin.jvm.internal.i.f(goal2, "goalList[position]");
                bVar.q(goal2, 2, i10);
                return;
            case 4:
                List filteredList = (List) obj3;
                Goal goal3 = (Goal) obj2;
                wp.e this$05 = (wp.e) obj;
                int i14 = wp.e.D;
                kotlin.jvm.internal.i.g(filteredList, "$filteredList");
                kotlin.jvm.internal.i.g(goal3, "$goal");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                wp.b bVar2 = new wp.b();
                Bundle bundle2 = new Bundle();
                bundle2.putString("key", (String) filteredList.get(i10));
                bundle2.putString("goalName", goal3.getGoalName());
                bundle2.putString("goalId", goal3.getGoalId());
                bundle2.putBoolean("isV3Log", false);
                bVar2.setArguments(bundle2);
                androidx.fragment.app.p activity = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity");
                ((TopicalLogsActivity) activity).s0(bVar2);
                return;
            case 5:
                RelativeLayout row = (RelativeLayout) obj3;
                y6 this$06 = (y6) obj2;
                TemplateActivity act = (TemplateActivity) obj;
                int i15 = y6.f19417w;
                kotlin.jvm.internal.i.g(row, "$row");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                androidx.fragment.app.p activity2 = this$06.getActivity();
                kotlin.jvm.internal.i.d(activity2);
                row.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
                androidx.fragment.app.p activity3 = this$06.getActivity();
                kotlin.jvm.internal.i.d(activity3);
                ((RobertoTextView) row.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
                act.F.put("thought_index", Integer.valueOf(i10));
                androidx.fragment.app.p activity4 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity4).s0(new a8());
                return;
            default:
                String slug = (String) obj3;
                aa this$07 = (aa) obj2;
                HashMap params = (HashMap) obj;
                int i16 = aa.A;
                kotlin.jvm.internal.i.g(slug, "$slug");
                kotlin.jvm.internal.i.g(this$07, "this$0");
                ScreenResult31Model screenResult31Model = this$07.f18169x;
                kotlin.jvm.internal.i.g(params, "$params");
                if (kotlin.jvm.internal.i.b(slug, "s59-c")) {
                    try {
                        Object obj6 = this$07.J().F.get("s59_user_data");
                        kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                        screenResult31Model.setName((String) obj6);
                        ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(params.get("s28e_list"));
                        if (i10 < paramsMapToList.size()) {
                            str = paramsMapToList.get(i10);
                        } else {
                            str = "";
                        }
                        screenResult31Model.setSelection(str);
                        if (this$07.J().W) {
                            TemplateModel templateModel = this$07.J().f10547y;
                            if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                fm.a K = this$07.K();
                                K.f15178l0.e(this$07.getViewLifecycleOwner(), new p9(2, new aa.a(this$07, label)));
                                K.l(label);
                                return;
                            }
                            return;
                        }
                        androidx.fragment.app.p activity5 = this$07.getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        Goal y02 = ((TemplateActivity) activity5).y0();
                        if (y02 != null) {
                            boolean z10 = this$07.J().K;
                            String str3 = this$07.f18170y;
                            if (z10) {
                                if (y02.getData().containsKey(str3)) {
                                    Object obj7 = y02.getData().get(str3);
                                    kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult31Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult31Model> }");
                                    ArrayList arrayList3 = (ArrayList) obj7;
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList3.add(screenResult31Model);
                                    y02.getData().put(str3, arrayList3);
                                } else {
                                    y02.getData().put(str3, new ArrayList());
                                    Object obj8 = y02.getData().get(str3);
                                    kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult31Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult31Model> }");
                                    ((ArrayList) obj8).add(screenResult31Model);
                                }
                            } else {
                                this$07.J().K = true;
                                if (!y02.getData().containsKey(str3)) {
                                    y02.getData().put(str3, new ArrayList());
                                }
                                Object obj9 = y02.getData().get(str3);
                                kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult31Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult31Model> }");
                                ((ArrayList) obj9).add(screenResult31Model);
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                        this$07.J().s0(new w5());
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$07.f18166u, "Exception : ", e10);
                        return;
                    }
                }
                this$07.J().t0();
                return;
        }
    }

    public /* synthetic */ c(Object obj, rr.b bVar, Object obj2, int i6, int i10) {
        this.f623u = i10;
        this.f625w = obj;
        this.f626x = bVar;
        this.f627y = obj2;
        this.f624v = i6;
    }

    public /* synthetic */ c(List list, int i6, Goal goal, wp.e eVar) {
        this.f623u = 4;
        this.f625w = list;
        this.f624v = i6;
        this.f626x = goal;
        this.f627y = eVar;
    }
}
