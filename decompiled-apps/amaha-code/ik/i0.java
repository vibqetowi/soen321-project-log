package ik;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: ExptInitialAssessmentResultFragment.kt */
/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Dialog f20198u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j0 f20199v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Dialog dialog, j0 j0Var) {
        super(0);
        this.f20198u = dialog;
        this.f20199v = j0Var;
    }

    @Override // ss.a
    public final hs.k invoke() {
        Dialog dialog = this.f20198u;
        View findViewById = dialog.findViewById(R.id.graphDialogTitle);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView = (RobertoTextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.graphDialogBody);
        kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView2 = (RobertoTextView) findViewById2;
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.graphDialogSymptomContainer);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String g5 = defpackage.b.g();
        j0 j0Var = this.f20199v;
        if (g5 != null) {
            switch (g5.hashCode()) {
                case -2114782937:
                    if (g5.equals(Constants.COURSE_HAPPINESS)) {
                        robertoTextView.setText(j0Var.getString(R.string.graphDialogTitleHappiness));
                        robertoTextView2.setText(j0Var.getString(R.string.graphDialogBodyHappiness));
                        arrayList.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogHappinessTitle1), j0Var.getString(R.string.graphDialogHappinessTitle2), j0Var.getString(R.string.graphDialogHappinessTitle3), j0Var.getString(R.string.graphDialogHappinessTitle4), j0Var.getString(R.string.graphDialogHappinessTitle5), j0Var.getString(R.string.graphDialogHappinessTitle6), j0Var.getString(R.string.graphDialogHappinessTitle7)));
                        arrayList2.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogHappinessBody1), j0Var.getString(R.string.graphDialogHappinessBody2), j0Var.getString(R.string.graphDialogHappinessBody3), j0Var.getString(R.string.graphDialogHappinessBody4), j0Var.getString(R.string.graphDialogHappinessBody5), j0Var.getString(R.string.graphDialogHappinessBody6), j0Var.getString(R.string.graphDialogHappinessBody7)));
                        break;
                    }
                    break;
                case -1617042330:
                    if (g5.equals(Constants.COURSE_DEPRESSION)) {
                        robertoTextView.setText(j0Var.getString(R.string.graphDialogTitleDepression));
                        robertoTextView2.setText(j0Var.getString(R.string.graphDialogBodyDepression));
                        arrayList.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogDepressionTitle1), j0Var.getString(R.string.graphDialogDepressionTitle2), j0Var.getString(R.string.graphDialogDepressionTitle3), j0Var.getString(R.string.graphDialogDepressionTitle4), j0Var.getString(R.string.graphDialogDepressionTitle5), j0Var.getString(R.string.graphDialogDepressionTitle6)));
                        arrayList2.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogDepressionBody1), j0Var.getString(R.string.graphDialogDepressionBody2), j0Var.getString(R.string.graphDialogDepressionBody3), j0Var.getString(R.string.graphDialogDepressionBody4), j0Var.getString(R.string.graphDialogDepressionBody5), j0Var.getString(R.string.graphDialogDepressionBody6)));
                        break;
                    }
                    break;
                case -891989580:
                    if (g5.equals(Constants.COURSE_STRESS)) {
                        robertoTextView.setText(j0Var.getString(R.string.graphDialogTitleStress));
                        robertoTextView2.setText(j0Var.getString(R.string.graphDialogBodyStress));
                        arrayList.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogStressTitle1), j0Var.getString(R.string.graphDialogStressTitle2), j0Var.getString(R.string.graphDialogStressTitle3), j0Var.getString(R.string.graphDialogStressTitle4), j0Var.getString(R.string.graphDialogStressTitle5), j0Var.getString(R.string.graphDialogStressTitle6), j0Var.getString(R.string.graphDialogStressTitle7)));
                        arrayList2.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogStressBody1), j0Var.getString(R.string.graphDialogStressBody2), j0Var.getString(R.string.graphDialogStressBody3), j0Var.getString(R.string.graphDialogStressBody4), j0Var.getString(R.string.graphDialogStressBody5), j0Var.getString(R.string.graphDialogStressBody6), j0Var.getString(R.string.graphDialogStressBody7)));
                        break;
                    }
                    break;
                case 92960775:
                    if (g5.equals(Constants.COURSE_ANGER)) {
                        robertoTextView.setText(j0Var.getString(R.string.graphDialogTitleAnger));
                        robertoTextView2.setText(j0Var.getString(R.string.graphDialogBodyAnger));
                        arrayList.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogAngerTitle1), j0Var.getString(R.string.graphDialogAngerTitle2), j0Var.getString(R.string.graphDialogAngerTitle3), j0Var.getString(R.string.graphDialogAngerTitle4), j0Var.getString(R.string.graphDialogAngerTitle5), j0Var.getString(R.string.graphDialogAngerTitle6), j0Var.getString(R.string.graphDialogAngerTitle7)));
                        arrayList2.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogAngerBody1), j0Var.getString(R.string.graphDialogAngerBody2), j0Var.getString(R.string.graphDialogAngerBody3), j0Var.getString(R.string.graphDialogAngerBody4), j0Var.getString(R.string.graphDialogAngerBody5), j0Var.getString(R.string.graphDialogAngerBody6), j0Var.getString(R.string.graphDialogAngerBody7)));
                        break;
                    }
                    break;
                case 109522647:
                    if (g5.equals(Constants.COURSE_SLEEP)) {
                        robertoTextView.setText(j0Var.getString(R.string.graphDialogTitleSleep));
                        robertoTextView2.setText(j0Var.getString(R.string.graphDialogBodySleep));
                        arrayList.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogSleepTitle2), j0Var.getString(R.string.graphDialogSleepTitle3), j0Var.getString(R.string.graphDialogSleepTitle4), j0Var.getString(R.string.graphDialogSleepTitle1), j0Var.getString(R.string.graphDialogSleepTitle5)));
                        arrayList2.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogSleepBody2), j0Var.getString(R.string.graphDialogSleepBody3), j0Var.getString(R.string.graphDialogSleepBody4), j0Var.getString(R.string.graphDialogSleepBody1), j0Var.getString(R.string.graphDialogSleepBody5)));
                        break;
                    }
                    break;
                case 113319009:
                    if (g5.equals(Constants.COURSE_WORRY)) {
                        robertoTextView.setText(j0Var.getString(R.string.graphDialogTitleAnxiety));
                        robertoTextView2.setText(j0Var.getString(R.string.graphDialogBodyAnxiety));
                        arrayList.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogAnxietyTitle1), j0Var.getString(R.string.graphDialogAnxietyTitle2), j0Var.getString(R.string.graphDialogAnxietyTitle3), j0Var.getString(R.string.graphDialogAnxietyTitle4), j0Var.getString(R.string.graphDialogAnxietyTitle5), j0Var.getString(R.string.graphDialogAnxietyTitle6), j0Var.getString(R.string.graphDialogAnxietyTitle7)));
                        arrayList2.addAll(ca.a.P0(j0Var.getString(R.string.graphDialogAnxietyBody1), j0Var.getString(R.string.graphDialogAnxietyBody2), j0Var.getString(R.string.graphDialogAnxietyBody3), j0Var.getString(R.string.graphDialogAnxietyBody4), j0Var.getString(R.string.graphDialogAnxietyBody5), j0Var.getString(R.string.graphDialogAnxietyBody6), j0Var.getString(R.string.graphDialogAnxietyBody7)));
                        break;
                    }
                    break;
            }
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View inflate = j0Var.getLayoutInflater().inflate(R.layout.row_graph_symptom_explanation, (ViewGroup) null);
            ((RobertoTextView) inflate.findViewById(R.id.graphDialogSymptomTitle)).setText((CharSequence) arrayList.get(i6));
            ((RobertoTextView) inflate.findViewById(R.id.graphDialogSymptomBody)).setText((CharSequence) arrayList2.get(i6));
            inflate.setOnClickListener(new h0(inflate, 0));
            linearLayout.addView(inflate);
        }
        return hs.k.f19476a;
    }
}
