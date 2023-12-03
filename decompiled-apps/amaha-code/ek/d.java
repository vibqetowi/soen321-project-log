package ek;

import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.HashSet;
/* compiled from: ActivitySelectionAdapter.java */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GoalType f14093u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f14094v;

    public d(e eVar, GoalType goalType) {
        this.f14094v = eVar;
        this.f14093u = goalType;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        e eVar = this.f14094v;
        HashSet<String> hashSet = eVar.A;
        GoalType goalType = this.f14093u;
        if (hashSet.contains(goalType.getGoalId())) {
            appCompatImageView.setImageResource(R.drawable.ic_plus);
            eVar.A.remove(goalType.getGoalId());
            Toast.makeText(eVar.f14105x, "Removed from Goals", 0).show();
            FirebasePersistence.getInstance().removeGoalById(goalType.getGoalId(), eVar.B);
            return;
        }
        appCompatImageView.setImageResource(R.drawable.ic_minus);
        eVar.A.add(goalType.getGoalId());
        Toast.makeText(eVar.f14105x, "Added to Goals", 0).show();
        FirebasePersistence.getInstance().addNewGoal(goalType.getGoalId(), eVar.B, true);
    }
}
