package qq;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.a1;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResultThoughtsModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hr.j0;
import hr.k0;
import hr.n0;
import hr.v0;
import hr.w0;
import hr.y0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30051u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ rr.b f30052v;

    public /* synthetic */ n(rr.b bVar, int i6) {
        this.f30051u = i6;
        this.f30052v = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i6 = this.f30051u;
        Goal goal = null;
        rr.b bVar = this.f30052v;
        switch (i6) {
            case 0:
                o this$0 = (o) bVar;
                int i10 = o.f30053w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity).t0();
                return;
            case 1:
                p this$02 = (p) bVar;
                int i11 = p.f30056x;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (this$02.f30057u != null) {
                    androidx.fragment.app.p activity2 = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    View view2 = this$02.f30057u;
                    kotlin.jvm.internal.i.d(view2);
                    String obj = ((RobertoTextView) view2.findViewById(R.id.rowContent)).getText().toString();
                    kotlin.jvm.internal.i.g(obj, "<set-?>");
                    ((DepressionPleasurableActivity) activity2).C = obj;
                    androidx.fragment.app.p activity3 = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    ((DepressionPleasurableActivity) activity3).t0();
                    return;
                }
                Toast.makeText(this$02.getActivity(), this$02.getString(R.string.depressionPleasurablePickerError), 0).show();
                return;
            case 2:
                r this$03 = (r) bVar;
                int i12 = r.f30064x;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (this$03.f30065u == null) {
                    Toast.makeText(this$03.getActivity(), "Please select one of the two activities", 0).show();
                    return;
                }
                androidx.fragment.app.p activity4 = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                Boolean bool = this$03.f30065u;
                kotlin.jvm.internal.i.d(bool);
                ((DepressionPleasurableActivity) activity4).F = bool.booleanValue();
                androidx.fragment.app.p activity5 = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity5).t0();
                return;
            case 3:
                s this$04 = (s) bVar;
                int i13 = s.f30068w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                androidx.fragment.app.p activity6 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity6).t0();
                return;
            case 4:
                a0 this$05 = (a0) bVar;
                int i14 = a0.f30009w;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                androidx.fragment.app.p activity7 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity7).t0();
                return;
            case 5:
                b0 this$06 = (b0) bVar;
                int i15 = b0.f30015w;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                androidx.fragment.app.p activity8 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity8).t0();
                return;
            case 6:
                rq.b this$07 = (rq.b) bVar;
                int i16 = rq.b.f30921x;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                if (this$07.f30923v) {
                    androidx.fragment.app.p activity9 = this$07.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                    ((DepressionThoughtsActivity) activity9).t0();
                    return;
                }
                Toast.makeText(this$07.getActivity(), "Please pick an option to continue", 1).show();
                return;
            case 7:
                rq.c this$08 = (rq.c) bVar;
                int i17 = rq.c.f30925w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                androidx.fragment.app.p activity10 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity10).t0();
                return;
            case 8:
                rq.h this$09 = (rq.h) bVar;
                int i18 = rq.h.f30943w;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                androidx.fragment.app.p activity11 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity11).t0();
                return;
            case 9:
                rq.i this$010 = (rq.i) bVar;
                int i19 = rq.i.f30946x;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                androidx.fragment.app.p activity12 = this$010.getActivity();
                kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity12).t0();
                return;
            case 10:
                rq.j this$011 = (rq.j) bVar;
                int i20 = rq.j.f30951w;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                androidx.fragment.app.p activity13 = this$011.getActivity();
                kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity13).t0();
                return;
            case 11:
                rq.k this$012 = (rq.k) bVar;
                int i21 = rq.k.f30954w;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                androidx.fragment.app.p activity14 = this$012.getActivity();
                kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity14).t0();
                return;
            case 12:
                rq.l this$013 = (rq.l) bVar;
                int i22 = rq.l.A;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                if (kotlin.jvm.internal.i.b(this$013.f30958v, "")) {
                    Toast.makeText(this$013.getActivity(), "Please select any one emotion to continue", 1).show();
                    return;
                }
                androidx.fragment.app.p activity15 = this$013.getActivity();
                kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity15).t0();
                androidx.fragment.app.p activity16 = this$013.getActivity();
                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                String str = this$013.f30958v;
                kotlin.jvm.internal.i.g(str, "<set-?>");
                ((DepressionThoughtsActivity) activity16).A = str;
                return;
            case 13:
                rq.o this$014 = (rq.o) bVar;
                int i23 = rq.o.f30969y;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                try {
                    ScreenResultThoughtsModel screenResultThoughtsModel = new ScreenResultThoughtsModel(Utils.INSTANCE.getTimeInSeconds());
                    androidx.fragment.app.p activity17 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                    screenResultThoughtsModel.setSituation(((DepressionThoughtsActivity) activity17).B);
                    androidx.fragment.app.p activity18 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                    screenResultThoughtsModel.setFeelings(((DepressionThoughtsActivity) activity18).D);
                    androidx.fragment.app.p activity19 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                    screenResultThoughtsModel.setThoughts(((DepressionThoughtsActivity) activity19).C);
                    androidx.fragment.app.p activity20 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                    screenResultThoughtsModel.setMood(((DepressionThoughtsActivity) activity20).A);
                    try {
                        Iterator<Goal> it = FirebasePersistence.getInstance().getUserGoals().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Goal next = it.next();
                                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THOUGHTS_NEW, next.getGoalId()) && kotlin.jvm.internal.i.b(next.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    goal = next;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    String str2 = this$014.f30971v;
                    if (goal != null) {
                        goal.setSource("daily_plan");
                        Date time = Calendar.getInstance().getTime();
                        kotlin.jvm.internal.i.f(time, "getInstance().time");
                        goal.setmLastAdded(time);
                        if (!goal.getData().containsKey(str2)) {
                            goal.getData().put(str2, new ArrayList());
                        }
                        Object obj2 = goal.getData().get(str2);
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultThoughtsModel>");
                        ((ArrayList) obj2).add(screenResultThoughtsModel);
                    } else {
                        Goal goal2 = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THOUGHTS_NEW);
                        goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THOUGHTS_NEW).getType());
                        goal2.setVisible(true);
                        goal2.setNotificationScheduled(false);
                        goal2.setSource("daily_plan");
                        goal2.getData().put(str2, new ArrayList());
                        Object obj3 = goal2.getData().get(str2);
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultThoughtsModel>");
                        ((ArrayList) obj3).add(screenResultThoughtsModel);
                        FirebasePersistence.getInstance().getUserGoals().add(goal2);
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$014.f30972w, "Thoughts Summary", e10);
                }
                androidx.fragment.app.p activity21 = this$014.getActivity();
                kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity21).t0();
                return;
            case 14:
                rq.p this$015 = (rq.p) bVar;
                int i24 = rq.p.f30974x;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                androidx.fragment.app.p activity22 = this$015.getActivity();
                kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity22).t0();
                return;
            case 15:
                rq.q this$016 = (rq.q) bVar;
                int i25 = rq.q.f30978x;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                androidx.fragment.app.p activity23 = this$016.getActivity();
                kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity23).t0();
                return;
            case 16:
                rq.u this$017 = (rq.u) bVar;
                int i26 = rq.u.f30993w;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                androidx.fragment.app.p activity24 = this$017.getActivity();
                kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                ((DepressionThoughtsActivity) activity24).t0();
                return;
            case 17:
                sq.e this$018 = (sq.e) bVar;
                int i27 = sq.e.f31879w;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                androidx.fragment.app.p activity25 = this$018.getActivity();
                kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity25).t0();
                return;
            case 18:
                sq.i this$019 = (sq.i) bVar;
                int i28 = sq.i.f31888w;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                androidx.fragment.app.p activity26 = this$019.getActivity();
                kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity26).t0();
                return;
            case 19:
                sq.j this$020 = (sq.j) bVar;
                int i29 = sq.j.f31891w;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                androidx.fragment.app.p activity27 = this$020.getActivity();
                kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity27).t0();
                return;
            case 20:
                sq.k this$021 = (sq.k) bVar;
                int i30 = sq.k.f31894w;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                androidx.fragment.app.p activity28 = this$021.getActivity();
                kotlin.jvm.internal.i.e(activity28, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity28).t0();
                return;
            case 21:
                vq.b this$022 = (vq.b) bVar;
                int i31 = vq.b.A;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                if (gv.r.i1(String.valueOf(((RobertoEditText) this$022._$_findCachedViewById(R.id.a3EditText)).getText())).toString().length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    androidx.fragment.app.p activity29 = this$022.getActivity();
                    kotlin.jvm.internal.i.e(activity29, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity");
                    Toast.makeText((GratitudeJournalComponentActivity) activity29, this$022.getString(R.string.enter_text), 0).show();
                    return;
                } else if (this$022.f35356x) {
                    int i32 = this$022.f35355w;
                    if (i32 != 1) {
                        if (i32 != 2) {
                            if (i32 == 3) {
                                this$022.J(2, String.valueOf(((RobertoEditText) this$022._$_findCachedViewById(R.id.a3EditText)).getText()));
                            }
                        } else {
                            this$022.J(1, String.valueOf(((RobertoEditText) this$022._$_findCachedViewById(R.id.a3EditText)).getText()));
                        }
                    } else {
                        this$022.J(0, String.valueOf(((RobertoEditText) this$022._$_findCachedViewById(R.id.a3EditText)).getText()));
                    }
                    Context context = this$022.getContext();
                    kotlin.jvm.internal.i.d(context);
                    this$022.startActivity(new Intent(context, V2DashboardActivity.class));
                    return;
                } else {
                    int i33 = this$022.f35353u;
                    if (i33 != 1) {
                        if (i33 != 2) {
                            if (i33 == 3) {
                                this$022.J(2, String.valueOf(((RobertoEditText) this$022._$_findCachedViewById(R.id.a3EditText)).getText()));
                                androidx.fragment.app.p activity30 = this$022.getActivity();
                                kotlin.jvm.internal.i.e(activity30, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity");
                                Toast.makeText((GratitudeJournalComponentActivity) activity30, "  You can access your entry from Happiness Logs in the menu bar!", 0).show();
                            }
                        } else {
                            this$022.J(1, String.valueOf(((RobertoEditText) this$022._$_findCachedViewById(R.id.a3EditText)).getText()));
                        }
                    } else {
                        this$022.J(0, String.valueOf(((RobertoEditText) this$022._$_findCachedViewById(R.id.a3EditText)).getText()));
                    }
                    androidx.fragment.app.p activity31 = this$022.getActivity();
                    kotlin.jvm.internal.i.e(activity31, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity");
                    ((GratitudeJournalComponentActivity) activity31).t0();
                    return;
                }
            case 22:
                int i34 = gr.d.P;
                ((gr.d) bVar).J();
                return;
            case 23:
                hr.r this$023 = (hr.r) bVar;
                int i35 = hr.r.f19056x;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                androidx.fragment.app.p activity32 = this$023.getActivity();
                kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity32).onBackPressed();
                return;
            case 24:
                j0 this$024 = (j0) bVar;
                int i36 = j0.f18606y;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                Context context2 = this$024.getContext();
                kotlin.jvm.internal.i.d(context2);
                a1 a1Var = new a1(context2, (ImageView) this$024._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new fq.s(this$024, 5);
                a1Var.b();
                return;
            case 25:
                k0 this$025 = (k0) bVar;
                int i37 = k0.B;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                a1 a1Var2 = new a1(this$025.requireContext(), (ImageView) this$025._$_findCachedViewById(R.id.ivEllipses));
                a1Var2.a().inflate(R.menu.logs_menu, a1Var2.f1344b);
                a1Var2.f1346d = new fq.s(this$025, 6);
                a1Var2.b();
                return;
            case 26:
                n0 this$026 = (n0) bVar;
                int i38 = n0.C;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                TemplateActivity templateActivity = this$026.f18863z;
                if (templateActivity != null) {
                    templateActivity.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 27:
                v0 this$027 = (v0) bVar;
                int i39 = v0.f19269w;
                kotlin.jvm.internal.i.g(this$027, "this$0");
                androidx.fragment.app.p activity33 = this$027.getActivity();
                kotlin.jvm.internal.i.d(activity33);
                activity33.onBackPressed();
                return;
            case 28:
                w0 this$028 = (w0) bVar;
                int i40 = w0.f19314y;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                TemplateActivity templateActivity2 = this$028.f19317w;
                if (templateActivity2 != null) {
                    templateActivity2.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                y0 this$029 = (y0) bVar;
                int i41 = y0.f19404w;
                kotlin.jvm.internal.i.g(this$029, "this$0");
                androidx.fragment.app.p activity34 = this$029.getActivity();
                kotlin.jvm.internal.i.d(activity34);
                activity34.onBackPressed();
                return;
        }
    }
}
