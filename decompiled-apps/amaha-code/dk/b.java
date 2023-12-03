package dk;

import com.theinnerhour.b2b.activity.AddCustomGoalsActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: AddCustomGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.k implements ss.l<String, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AddCustomGoalsActivity f12906u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AddCustomGoalsActivity addCustomGoalsActivity) {
        super(1);
        this.f12906u = addCustomGoalsActivity;
    }

    @Override // ss.l
    public final Boolean invoke(String str) {
        boolean z10;
        String goalName = str;
        kotlin.jvm.internal.i.g(goalName, "goalName");
        ArrayList<FirestoreGoal> arrayList = this.f12906u.E;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (FirestoreGoal firestoreGoal : arrayList) {
                z10 = true;
                if (gv.n.A0(firestoreGoal.getGoalName(), goalName, true)) {
                    break;
                }
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
