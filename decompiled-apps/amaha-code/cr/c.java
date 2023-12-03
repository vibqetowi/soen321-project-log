package cr;

import android.widget.CompoundButton;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: SleepChecklistFragment.java */
/* loaded from: classes2.dex */
public final class c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f11934u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f11935v;

    public c(GoalType goalType, String str) {
        this.f11934u = goalType;
        this.f11935v = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        String str = this.f11935v;
        GoalType goalType = this.f11934u;
        if (z10) {
            FirebasePersistence.getInstance().addNewGoal(goalType.getGoalId(), str, true);
        } else {
            FirebasePersistence.getInstance().removeGoalById(goalType.getGoalId(), str);
        }
    }
}
