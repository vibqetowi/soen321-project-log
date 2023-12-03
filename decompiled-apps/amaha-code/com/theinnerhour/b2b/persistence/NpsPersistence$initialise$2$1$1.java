package com.theinnerhour.b2b.persistence;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.model.DashboardNpsDayTrack;
import com.theinnerhour.b2b.model.NpsGoalTrack;
import com.theinnerhour.b2b.model.UserNpsCheckModel;
import com.theinnerhour.b2b.utils.Utils;
import fd.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rk.b;
import ss.l;
/* compiled from: NpsPersistence.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/theinnerhour/b2b/persistence/NpsPersistence$initialise$2$1$1", "Lcom/google/firebase/database/ValueEventListener;", "Lcom/google/firebase/database/DataSnapshot;", "snapshot", "Lhs/k;", "onDataChange", "Lcom/google/firebase/database/DatabaseError;", "error", "onCancelled", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NpsPersistence$initialise$2$1$1 implements ValueEventListener {
    final /* synthetic */ f $it;
    final /* synthetic */ l<Boolean, Object> $onLoad;

    /* JADX WARN: Multi-variable type inference failed */
    public NpsPersistence$initialise$2$1$1(l<? super Boolean, ? extends Object> lVar, f fVar) {
        this.$onLoad = lVar;
        this.$it = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataChange$lambda$3(l tmp0, Object obj) {
        i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataChange$lambda$4(l onLoad, Exception it) {
        i.g(onLoad, "$onLoad");
        i.g(it, "it");
        onLoad.invoke(Boolean.FALSE);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onCancelled(DatabaseError error) {
        i.g(error, "error");
        this.$onLoad.invoke(Boolean.FALSE);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onDataChange(DataSnapshot snapshot) {
        i.g(snapshot, "snapshot");
        boolean z10 = false;
        if (snapshot.exists()) {
            NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
            if (npsPersistence.getNpsCheckModel() == null) {
                z10 = true;
            }
            UserNpsCheckModel userNpsCheckModel = (UserNpsCheckModel) snapshot.getValue(UserNpsCheckModel.class);
            if (userNpsCheckModel != null) {
                npsPersistence.setNpsCheckModel(userNpsCheckModel);
                if (z10) {
                    this.$onLoad.invoke(Boolean.TRUE);
                    npsPersistence.setNpsInitComplete(true);
                    return;
                }
                return;
            }
            return;
        }
        DatabaseReference child = FirebaseDatabase.getInstance().getReference("userNps/").child(this.$it.j0());
        UserNpsCheckModel userNpsCheckModel2 = new UserNpsCheckModel(null, null, null, null, null, null, null, null, null, 511, null);
        DashboardNpsDayTrack dashboardNpsDayTrack = new DashboardNpsDayTrack(null, 0, null, 7, null);
        dashboardNpsDayTrack.setAppOpenDayCount(1);
        dashboardNpsDayTrack.setLastAppOpenDay(Long.valueOf(Utils.INSTANCE.getTimeInSeconds()));
        userNpsCheckModel2.setDashboardNps(dashboardNpsDayTrack);
        userNpsCheckModel2.setLastNpsDisplay(0L);
        NpsGoalTrack npsGoalTrack = new NpsGoalTrack(null, null, 3, null);
        npsGoalTrack.setTrackCount(0);
        userNpsCheckModel2.setGoalsNps(npsGoalTrack);
        child.setValue(userNpsCheckModel2).addOnSuccessListener(new b(12, new NpsPersistence$initialise$2$1$1$onDataChange$2(this.$onLoad))).addOnFailureListener(new ad.f(3, this.$onLoad));
    }
}
