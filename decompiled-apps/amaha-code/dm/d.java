package dm;

import com.theinnerhour.b2b.model.Goal;
import kotlin.jvm.internal.k;
import ss.p;
/* compiled from: V3CustomGoalRepository.kt */
/* loaded from: classes2.dex */
public final class d extends k implements p<Goal, Goal, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public static final d f13147u = new d();

    public d() {
        super(2);
    }

    @Override // ss.p
    public final Integer invoke(Goal goal, Goal goal2) {
        return Integer.valueOf(goal.getmLastAdded().compareTo(goal2.getmLastAdded()));
    }
}
