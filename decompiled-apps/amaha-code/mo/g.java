package mo;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.model.CoachModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import is.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
/* compiled from: ProDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class g implements ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j<hs.f<? extends ArrayList<Goal>, Boolean>> f25665u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f25666v;

    public g(a aVar, k kVar) {
        this.f25665u = kVar;
        this.f25666v = aVar;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onCancelled(DatabaseError error) {
        i.g(error, "error");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = this.f25666v.f25647a;
        String message = error.getMessage();
        i.f(message, "error.message");
        logHelper.e(str, message);
        j<hs.f<? extends ArrayList<Goal>, Boolean>> jVar = this.f25665u;
        if (jVar.a()) {
            jVar.resumeWith(null);
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onDataChange(DataSnapshot snapshot) {
        ArrayList<Goal> arrayList;
        boolean z10;
        i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        hs.f fVar = null;
        j<hs.f<? extends ArrayList<Goal>, Boolean>> jVar = this.f25665u;
        if (exists) {
            if (jVar.a()) {
                CoachModel coachModel = (CoachModel) snapshot.getValue(CoachModel.class);
                if (coachModel != null) {
                    arrayList = coachModel.getGoals();
                } else {
                    arrayList = null;
                }
                this.f25666v.getClass();
                if (arrayList != null) {
                    ArrayList<Goal> arrayList2 = new ArrayList();
                    Iterator<T> it = arrayList.iterator();
                    while (true) {
                        z10 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((Goal) next).getStartDate().getTime() <= Utils.INSTANCE.getTodayTimeInSeconds()) {
                            z10 = true;
                        }
                        if (z10) {
                            arrayList2.add(next);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
                        i.f(userGoals, "getInstance().user.userGoals");
                        for (Goal goal : userGoals) {
                            String goalId = goal.getGoalId();
                            String str = "-1";
                            if (goalId == null) {
                                goalId = "-1";
                            }
                            String courseId = goal.getCourseId();
                            if (courseId != null) {
                                str = courseId;
                            }
                            hashSet.add(new hs.f(goalId, str));
                        }
                        long time = ((Goal) arrayList2.get(0)).getStartDate().getTime();
                        ArrayList arrayList3 = new ArrayList();
                        for (Goal goal2 : arrayList2) {
                            if (!u.Z1(hashSet, new hs.f(goal2.getGoalId(), goal2.getCourseId()))) {
                                if (goal2.getGoalName() == null) {
                                    goal2.setGoalName("Custom Added Goal");
                                }
                                goal2.setVisible(true);
                                arrayList3.add(goal2);
                            }
                            if (goal2.getStartDate().getTime() > time) {
                                time = goal2.getStartDate().getTime();
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                            firebasePersistence.getUser().getUserGoals().addAll(arrayList3);
                            firebasePersistence.updateUserOnFirebase();
                        }
                        long j10 = time * 1000;
                        if (ApplicationPersistence.getInstance().getLongValue("pro_db_goal_start_timestamp", -1L) < j10) {
                            z10 = true;
                        }
                        if (z10) {
                            ApplicationPersistence.getInstance().setLongValue("pro_db_goal_start_timestamp", j10);
                        }
                        fVar = new hs.f(new ArrayList(arrayList2), Boolean.valueOf(z10));
                    }
                }
                jVar.resumeWith(fVar);
            }
        } else if (jVar.a()) {
            jVar.resumeWith(null);
        }
    }
}
