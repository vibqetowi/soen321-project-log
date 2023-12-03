package er;

import android.app.Dialog;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: SleepDropDownResultFragment.java */
/* loaded from: classes2.dex */
public final class i implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f14503u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f14504v;

    public i(h hVar, GoalType goalType) {
        this.f14504v = hVar;
        this.f14503u = goalType;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = h.f14497x;
        h hVar = this.f14504v;
        hVar.getClass();
        Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_time_table, hVar.getContext());
        GoalType goalType = this.f14503u;
        ((RobertoTextView) dialog.findViewById(R.id.popupGoalHeader)).setText(goalType.getGoalName());
        RobertoTextView robertoTextView = (RobertoTextView) dialog.findViewById(R.id.popupGoalDesc);
        if (goalType.getGoalName().contains("dinner")) {
            str = "Finish your dinner at least two hours before bedtime.";
        } else if (goalType.getGoalName().contains("Exercise")) {
            str = "Stop all heavy exercise at least three hours before bedtime.";
        } else if (goalType.getGoalName().contains("Watch TV")) {
            str = "Switch off your TV an hour before bedtime.";
        } else if (goalType.getGoalName().contains("laptop or phone")) {
            str = "Stop using your laptop or phone an hour before bedtime.";
        } else if (goalType.getGoalName().contains("Finish work")) {
            str = "Stop all work 90 minutes before bedtime.";
        } else if (goalType.getGoalName().contains("last cigarette")) {
            str = "Stop smoking at least three hours before bedtime.";
        } else if (goalType.getGoalName().contains("last drink")) {
            str = "Stop drinking at least three hours before bedtime.";
        } else if (goalType.getGoalName().contains("coffee/tea")) {
            str = "Have your last tea/coffee at least five hours before bedtime.";
        } else {
            str = "";
        }
        robertoTextView.setText(str);
        dialog.show();
    }
}
