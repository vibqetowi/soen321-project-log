package cr;

import android.view.View;
import android.widget.CheckBox;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: SleepChecklistFragment.java */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CheckBox f11936u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ GoalType f11937v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f11938w;

    public d(CheckBox checkBox, GoalType goalType, String str) {
        this.f11936u = checkBox;
        this.f11937v = goalType;
        this.f11938w = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CheckBox checkBox = this.f11936u;
        boolean isChecked = checkBox.isChecked();
        String str = this.f11938w;
        GoalType goalType = this.f11937v;
        if (isChecked) {
            FirebasePersistence.getInstance().removeGoalById(goalType.getGoalId(), str);
            checkBox.setChecked(false);
            return;
        }
        FirebasePersistence.getInstance().addNewGoal(goalType.getGoalId(), str, true);
        checkBox.setChecked(true);
    }
}
