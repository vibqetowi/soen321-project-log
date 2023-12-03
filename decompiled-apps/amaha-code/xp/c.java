package xp;

import com.theinnerhour.b2b.model.Goal;
import kotlin.jvm.internal.k;
import ss.p;
/* compiled from: TopicalGoalViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends k implements p<Goal, Goal, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public static final c f37886u = new c();

    public c() {
        super(2);
    }

    @Override // ss.p
    public final Integer invoke(Goal goal, Goal goal2) {
        return Integer.valueOf(goal.getmLastAdded().compareTo(goal2.getmLastAdded()));
    }
}
