package fq;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.activity.DepressionHopeActivity;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.T4CActivity;
import com.theinnerhour.b2b.activity.TAActivity;
import com.theinnerhour.b2b.widgets.CustomViewPager;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15821u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f15822v;

    public /* synthetic */ x(int i6, Object obj) {
        this.f15821u = i6;
        this.f15822v = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15821u;
        boolean z10 = false;
        boolean z11 = true;
        Object obj = this.f15822v;
        switch (i6) {
            case 0:
                TAActivity act = (TAActivity) obj;
                int i10 = z.A;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 1:
                c0 this$0 = (c0) obj;
                int i11 = c0.f15674v;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    return;
                }
                return;
            case 2:
                T4CActivity act2 = (T4CActivity) obj;
                int i12 = c0.f15674v;
                kotlin.jvm.internal.i.g(act2, "$act");
                act2.t0();
                return;
            case 3:
                o0 this$02 = (o0) obj;
                int i13 = o0.f15772x;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                androidx.fragment.app.p activity2 = this$02.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity2).t0();
                return;
            case 4:
                d1 this$03 = (d1) obj;
                int i14 = d1.f15692w;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                androidx.fragment.app.p activity3 = this$03.getActivity();
                if (activity3 != null) {
                    activity3.onBackPressed();
                    return;
                }
                return;
            case 5:
                mq.a this$04 = (mq.a) obj;
                int i15 = mq.a.f25669w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                androidx.fragment.app.p activity4 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity4).t0();
                return;
            case 6:
                mq.k this$05 = (mq.k) obj;
                int i16 = mq.k.A;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                if (gv.n.B0(this$05.f25697x)) {
                    Context context = this$05.getContext();
                    kotlin.jvm.internal.i.d(context);
                    Toast.makeText(context, this$05.getString(R.string.depressionExercisesPlanSelectError), 1).show();
                    return;
                }
                androidx.fragment.app.p activity5 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                String str = this$05.f25697x;
                kotlin.jvm.internal.i.g(str, "<set-?>");
                ((DepressionExerciseActivity) activity5).f10361x = str;
                androidx.fragment.app.p activity6 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity6).t0();
                return;
            case 7:
                mq.o this$06 = (mq.o) obj;
                int i17 = mq.o.f25710w;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                androidx.fragment.app.p activity7 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity7).t0();
                return;
            case 8:
                mq.p this$07 = (mq.p) obj;
                int i18 = mq.p.f25713w;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                androidx.fragment.app.p activity8 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity8).t0();
                return;
            case 9:
                mq.q this$08 = (mq.q) obj;
                int i19 = mq.q.f25716w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                androidx.fragment.app.p activity9 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity9).t0();
                return;
            case 10:
                nq.c this$09 = (nq.c) obj;
                int i20 = nq.c.f26719w;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                androidx.fragment.app.p activity10 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                ((DepressionGoodthingsActivity) activity10).t0();
                return;
            case 11:
                nq.l this$010 = (nq.l) obj;
                int i21 = nq.l.f26740w;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                androidx.fragment.app.p activity11 = this$010.getActivity();
                kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                ((DepressionGoodthingsActivity) activity11).t0();
                return;
            case 12:
                nq.p this$011 = (nq.p) obj;
                int i22 = nq.p.f26750w;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                androidx.fragment.app.p activity12 = this$011.getActivity();
                kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                ((DepressionGoodthingsActivity) activity12).t0();
                return;
            case 13:
                nq.q this$012 = (nq.q) obj;
                int i23 = nq.q.f26753w;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                if (gv.r.i1(String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.a3EditText)).getText())).toString().length() != 0) {
                    z11 = false;
                }
                if (z11) {
                    androidx.fragment.app.p activity13 = this$012.getActivity();
                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                    Toast.makeText((DepressionGoodthingsActivity) activity13, this$012.getString(R.string.enter_text), 0).show();
                    return;
                }
                androidx.fragment.app.p activity14 = this$012.getActivity();
                kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                int i24 = ((DepressionGoodthingsActivity) activity14).f10364w;
                if (i24 != 4) {
                    if (i24 != 6) {
                        if (i24 == 7) {
                            androidx.fragment.app.p activity15 = this$012.getActivity();
                            kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            ((DepressionGoodthingsActivity) activity15).B = String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.a3EditText)).getText());
                        }
                    } else {
                        androidx.fragment.app.p activity16 = this$012.getActivity();
                        kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                        ((DepressionGoodthingsActivity) activity16).A = String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.a3EditText)).getText());
                    }
                } else {
                    androidx.fragment.app.p activity17 = this$012.getActivity();
                    kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                    ((DepressionGoodthingsActivity) activity17).f10367z = String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.a3EditText)).getText());
                }
                androidx.fragment.app.p activity18 = this$012.getActivity();
                kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                ((DepressionGoodthingsActivity) activity18).t0();
                return;
            case 14:
                oq.c this$013 = (oq.c) obj;
                int i25 = oq.c.f27716w;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                androidx.fragment.app.p activity19 = this$013.getActivity();
                kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                ((DepressionHopeActivity) activity19).t0();
                return;
            case 15:
                oq.d this$014 = (oq.d) obj;
                int i26 = oq.d.A;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                ArrayList<String> arrayList = this$014.f27721v;
                if (arrayList.size() == 0) {
                    Context context2 = this$014.getContext();
                    kotlin.jvm.internal.i.d(context2);
                    Toast.makeText(context2, this$014.getString(R.string.depressionHopeGoalSelectionErrorMessage1), 1).show();
                    return;
                } else if (arrayList.size() > 0 && !this$014.f27722w) {
                    androidx.fragment.app.p activity20 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                    ((DepressionHopeActivity) activity20).A = arrayList;
                    androidx.fragment.app.p activity21 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                    ((DepressionHopeActivity) activity21).t0();
                    return;
                } else if (this$014.f27722w) {
                    if (String.valueOf(((RobertoEditText) this$014._$_findCachedViewById(R.id.otherEdit)).getText()).length() == 0) {
                        z10 = true;
                    }
                    if (z10) {
                        Context context3 = this$014.getContext();
                        kotlin.jvm.internal.i.d(context3);
                        Toast.makeText(context3, this$014.getString(R.string.depressionHopeGoalSelectionErrorMessage2), 1).show();
                        return;
                    }
                    arrayList.add(this$014.f27723x);
                    androidx.fragment.app.p activity22 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                    ((DepressionHopeActivity) activity22).A = arrayList;
                    androidx.fragment.app.p activity23 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                    ((DepressionHopeActivity) activity23).t0();
                    return;
                } else {
                    return;
                }
            case 16:
                oq.n this$015 = (oq.n) obj;
                int i27 = oq.n.f27753w;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                androidx.fragment.app.p activity24 = this$015.getActivity();
                kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                ((DepressionHopeActivity) activity24).t0();
                return;
            case 17:
                oq.o this$016 = (oq.o) obj;
                int i28 = oq.o.f27756w;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                androidx.fragment.app.p activity25 = this$016.getActivity();
                kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                ((DepressionHopeActivity) activity25).t0();
                return;
            case 18:
                oq.r this$017 = (oq.r) obj;
                int i29 = oq.r.f27765w;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                androidx.fragment.app.p activity26 = this$017.getActivity();
                kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                ((DepressionHopeActivity) activity26).t0();
                return;
            case 19:
                oq.s this$018 = (oq.s) obj;
                int i30 = oq.s.f27768x;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                androidx.fragment.app.p activity27 = this$018.getActivity();
                kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                ((DepressionHopeActivity) activity27).t0();
                return;
            case 20:
                pq.o this$019 = (pq.o) obj;
                int i31 = pq.o.f28805x;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                if (kotlin.jvm.internal.i.b(this$019.f28807v, "")) {
                    Toast.makeText(this$019.requireContext(), this$019.getString(R.string.depressionMasteryDayError), 0).show();
                    return;
                }
                androidx.fragment.app.p activity28 = this$019.getActivity();
                kotlin.jvm.internal.i.e(activity28, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                String str2 = this$019.f28807v;
                kotlin.jvm.internal.i.g(str2, "<set-?>");
                ((DepressionMasteryActivity) activity28).A = str2;
                androidx.fragment.app.p activity29 = this$019.getActivity();
                kotlin.jvm.internal.i.e(activity29, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity29).t0();
                return;
            case 21:
                pq.p this$020 = (pq.p) obj;
                int i32 = pq.p.f28809w;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                androidx.fragment.app.p activity30 = this$020.getActivity();
                kotlin.jvm.internal.i.e(activity30, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity30).t0();
                return;
            case 22:
                pq.q this$021 = (pq.q) obj;
                int i33 = pq.q.f28813w;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                androidx.fragment.app.p activity31 = this$021.getActivity();
                kotlin.jvm.internal.i.e(activity31, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity31).t0();
                return;
            case 23:
                pq.r this$022 = (pq.r) obj;
                int i34 = pq.r.f28816w;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                androidx.fragment.app.p activity32 = this$022.getActivity();
                kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity32).t0();
                return;
            case 24:
                pq.s this$023 = (pq.s) obj;
                int i35 = pq.s.f28819w;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                androidx.fragment.app.p activity33 = this$023.getActivity();
                kotlin.jvm.internal.i.e(activity33, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity33).t0();
                return;
            case 25:
                pq.y this$024 = (pq.y) obj;
                int i36 = pq.y.f28838w;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                androidx.fragment.app.p activity34 = this$024.getActivity();
                kotlin.jvm.internal.i.e(activity34, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity34).t0();
                return;
            case 26:
                qq.c this$025 = (qq.c) obj;
                int i37 = qq.c.f30018x;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                if (this$025.f30019u < 2) {
                    ((CustomViewPager) this$025._$_findCachedViewById(R.id.a13ViewPager)).v(this$025.f30019u);
                    this$025.f30019u++;
                    return;
                }
                androidx.fragment.app.p activity35 = this$025.getActivity();
                kotlin.jvm.internal.i.e(activity35, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity35).t0();
                return;
            case 27:
                qq.d this$026 = (qq.d) obj;
                int i38 = qq.d.f30025w;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                androidx.fragment.app.p activity36 = this$026.getActivity();
                kotlin.jvm.internal.i.e(activity36, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity36).t0();
                return;
            case 28:
                qq.e this$027 = (qq.e) obj;
                int i39 = qq.e.f30028w;
                kotlin.jvm.internal.i.g(this$027, "this$0");
                androidx.fragment.app.p activity37 = this$027.getActivity();
                kotlin.jvm.internal.i.e(activity37, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity37).t0();
                return;
            default:
                qq.m this$028 = (qq.m) obj;
                int i40 = qq.m.f30048w;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                if (kotlin.jvm.internal.i.b(gv.r.i1(String.valueOf(((RobertoEditText) this$028._$_findCachedViewById(R.id.editText)).getText())).toString(), "")) {
                    Toast.makeText(this$028.getActivity(), "Please write something", 0).show();
                    return;
                }
                androidx.fragment.app.p activity38 = this$028.getActivity();
                kotlin.jvm.internal.i.e(activity38, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                String obj2 = gv.r.i1(String.valueOf(((RobertoEditText) this$028._$_findCachedViewById(R.id.editText)).getText())).toString();
                kotlin.jvm.internal.i.g(obj2, "<set-?>");
                ((DepressionPleasurableActivity) activity38).D = obj2;
                androidx.fragment.app.p activity39 = this$028.getActivity();
                kotlin.jvm.internal.i.e(activity39, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity39).t0();
                return;
        }
    }
}
