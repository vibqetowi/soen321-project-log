package fm;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.model.UserStatisticsDetail;
import com.theinnerhour.b2b.persistence.StatPersistence;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class l0 implements ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f15435u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Integer f15436v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15437w;

    public l0(String str, Integer num, kotlinx.coroutines.k kVar) {
        this.f15435u = str;
        this.f15436v = num;
        this.f15437w = kVar;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onCancelled(DatabaseError error) {
        kotlin.jvm.internal.i.g(error, "error");
        kotlinx.coroutines.j<Boolean> jVar = this.f15437w;
        if (jVar.a()) {
            jVar.resumeWith(Boolean.FALSE);
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onDataChange(DataSnapshot snapshot) {
        kotlin.jvm.internal.i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        Integer num = this.f15436v;
        String str = this.f15435u;
        kotlinx.coroutines.j<Boolean> jVar = this.f15437w;
        if (exists) {
            UserStatisticsDetail userStatisticsDetail = (UserStatisticsDetail) snapshot.getValue(UserStatisticsDetail.class);
            if (userStatisticsDetail == null) {
                userStatisticsDetail = new UserStatisticsDetail();
            }
            StatPersistence.INSTANCE.updateGoalTrackCountByCourse(userStatisticsDetail, str, false, num);
            if (jVar.a()) {
                jVar.resumeWith(Boolean.TRUE);
                return;
            }
            return;
        }
        StatPersistence.INSTANCE.updateGoalTrackCountByCourse(new UserStatisticsDetail(), str, false, num);
        if (jVar.a()) {
            jVar.resumeWith(Boolean.TRUE);
        }
    }
}
