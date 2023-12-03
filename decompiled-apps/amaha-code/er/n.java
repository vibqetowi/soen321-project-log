package er;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: SleepGoalsResultFragment.java */
/* loaded from: classes2.dex */
public final class n implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public boolean f14525u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Button f14526v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ GoalType f14527w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ CheckBox f14528x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Dialog f14529y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ k f14530z;

    public n(k kVar, boolean z10, Button button, GoalType goalType, CheckBox checkBox, Dialog dialog) {
        this.f14530z = kVar;
        this.f14526v = button;
        this.f14527w = goalType;
        this.f14528x = checkBox;
        this.f14529y = dialog;
        this.f14525u = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = this.f14525u;
        k kVar = this.f14530z;
        if (!z10 && kVar.f14518y >= 2) {
            Toast.makeText(kVar.getActivity(), "Adding more than 2 goals is not recommended", 0).show();
            return;
        }
        Dialog dialog = this.f14529y;
        CheckBox checkBox = this.f14528x;
        Button button = this.f14526v;
        GoalType goalType = this.f14527w;
        if (z10) {
            kVar.f14518y--;
            this.f14525u = false;
            button.setText("ADD THIS GOAL");
            kVar.f14516w.remove(goalType.getGoalId());
            checkBox.setChecked(false);
            Toast.makeText(kVar.getActivity(), "Removed from goals", 0).show();
            FirebasePersistence.getInstance().removeGoalById(goalType.getGoalId(), kVar.f14517x);
            dialog.dismiss();
            return;
        }
        kVar.f14518y++;
        this.f14525u = true;
        kVar.f14516w.add(goalType.getGoalId());
        button.setText("REMOVE THIS GOAL");
        checkBox.setChecked(true);
        FirebasePersistence.getInstance().addNewGoal(goalType.getGoalId(), kVar.f14517x, true);
        Toast.makeText(kVar.getActivity(), "Added to goals", 0).show();
        dialog.dismiss();
    }
}
