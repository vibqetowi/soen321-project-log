package dm;

import com.theinnerhour.b2b.model.Goal;
import kotlin.jvm.internal.k;
import ss.p;
/* compiled from: V3GoalRepository.kt */
/* loaded from: classes2.dex */
public final class g extends k implements p<Goal, Goal, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public static final g f13160u = new g();

    public g() {
        super(2);
    }

    @Override // ss.p
    public final Integer invoke(Goal goal, Goal goal2) {
        return Integer.valueOf(goal.getmLastAdded().compareTo(goal2.getmLastAdded()));
    }
}
