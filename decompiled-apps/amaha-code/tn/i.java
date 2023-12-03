package tn;

import am.w;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.a1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33359u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f33360v;

    public /* synthetic */ i(j jVar, int i6) {
        this.f33359u = i6;
        this.f33360v = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RobertoTextView robertoTextView;
        ConstraintLayout constraintLayout;
        RobertoTextView robertoTextView2;
        ConstraintLayout constraintLayout2;
        RobertoTextView robertoTextView3;
        int i6 = this.f33359u;
        boolean z10 = true;
        j this$0 = this.f33360v;
        switch (i6) {
            case 0:
                int i10 = j.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity");
                ((MultiTrackerInsightsActivity) activity).s0(new k());
                Bundle bundle = new Bundle();
                bundle.putString("source", "insights");
                defpackage.b.s(bundle, "course", bundle, "new_tracker_logs_open");
                return;
            case 1:
                int i11 = j.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                p activity2 = this$0.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
            case 2:
                int i12 = j.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    yp.j jVar = this$0.C;
                    if (jVar == null || (constraintLayout2 = jVar.f38835o) == null || constraintLayout2.getVisibility() != 8) {
                        z10 = false;
                    }
                    ConstraintLayout constraintLayout3 = null;
                    RobertoTextView robertoTextView4 = null;
                    if (z10) {
                        yp.j jVar2 = this$0.C;
                        if (jVar2 != null) {
                            constraintLayout = jVar2.f38835o;
                        } else {
                            constraintLayout = null;
                        }
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(0);
                        }
                        yp.j jVar3 = this$0.C;
                        if (jVar3 != null) {
                            robertoTextView4 = jVar3.f38834n;
                        }
                        if (robertoTextView4 != null) {
                            robertoTextView4.setText(this$0.getString(R.string.insightsViewLess));
                        }
                        String format = LocalDateTime.ofEpochSecond(this$0.f33362v / 1000, 0, this$0.f33364x).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ENGLISH));
                        kotlin.jvm.internal.i.f(format, "ofEpochSecond(selectedTi…thLocale(Locale.ENGLISH))");
                        String substring = format.substring(0, 3);
                        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        this$0.J(substring);
                        yp.j jVar4 = this$0.C;
                        if (jVar4 != null && (robertoTextView2 = jVar4.f38826e) != null) {
                            robertoTextView2.setOnClickListener(new i(this$0, 3));
                            return;
                        }
                        return;
                    }
                    yp.j jVar5 = this$0.C;
                    if (jVar5 != null) {
                        robertoTextView = jVar5.f38834n;
                    } else {
                        robertoTextView = null;
                    }
                    if (robertoTextView != null) {
                        robertoTextView.setText(this$0.getString(R.string.insightsViewMore));
                    }
                    yp.j jVar6 = this$0.C;
                    if (jVar6 != null) {
                        constraintLayout3 = jVar6.f38835o;
                    }
                    if (constraintLayout3 != null) {
                        constraintLayout3.setVisibility(8);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f33361u, e10);
                    return;
                }
            case 3:
                int i13 = j.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.j jVar7 = this$0.C;
                if (jVar7 != null && (robertoTextView3 = jVar7.f38826e) != null) {
                    a1 a1Var = new a1(this$0.requireContext(), robertoTextView3);
                    a1Var.a().inflate(R.menu.multi_tracker_daily_mood_menu, a1Var.f1344b);
                    a1Var.f1346d = new w(24, this$0);
                    a1Var.b();
                    return;
                }
                return;
            case 4:
                int i14 = j.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.f33365y++;
                this$0.f33366z--;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this$0.f33362v);
                calendar.add(5, 7);
                this$0.f33362v = calendar.getTimeInMillis();
                this$0.K();
                this$0.O();
                this$0.M();
                return;
            default:
                int i15 = j.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.f33365y--;
                this$0.f33366z++;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(this$0.f33362v);
                calendar2.add(5, -7);
                this$0.f33362v = calendar2.getTimeInMillis();
                this$0.K();
                this$0.O();
                this$0.M();
                return;
        }
    }
}
