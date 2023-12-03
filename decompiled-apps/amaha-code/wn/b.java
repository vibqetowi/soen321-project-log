package wn;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.components.multiTracker.model.UserTrackFirestoreParentModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import fm.y0;
import he.j;
import java.util.ArrayList;
/* compiled from: MultiTrackerFirestoreSingleton.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f36765a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final String f36766b = LogHelper.INSTANCE.makeLogTag("MultiTrackerFSSingleton");

    /* renamed from: c  reason: collision with root package name */
    public static MultiTrackerFirestoreStatsModel f36767c;

    /* renamed from: d  reason: collision with root package name */
    public static he.t f36768d;

    /* renamed from: e  reason: collision with root package name */
    public static j f36769e;

    static {
        j jVar;
        ArrayList<Goal> userGoals;
        if (ApplicationPersistence.getInstance().getBooleanValue("skip_to_stat_write", false)) {
            jVar = j.STAT_WRITE_FAILED;
        } else {
            jVar = j.PENDING;
        }
        f36769e = jVar;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (userGoals = user.getUserGoals()) != null) {
            userGoals.isEmpty();
        }
    }

    public static int a() {
        int i6;
        int i10;
        int i11;
        int i12;
        MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = f36767c;
        int i13 = 0;
        if (multiTrackerFirestoreStatsModel != null) {
            i6 = multiTrackerFirestoreStatsModel.getMood1TrackCount();
        } else {
            i6 = 0;
        }
        MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel2 = f36767c;
        if (multiTrackerFirestoreStatsModel2 != null) {
            i10 = multiTrackerFirestoreStatsModel2.getMood2TrackCount();
        } else {
            i10 = 0;
        }
        int i14 = i6 + i10;
        MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel3 = f36767c;
        if (multiTrackerFirestoreStatsModel3 != null) {
            i11 = multiTrackerFirestoreStatsModel3.getMood3TrackCount();
        } else {
            i11 = 0;
        }
        int i15 = i14 + i11;
        MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel4 = f36767c;
        if (multiTrackerFirestoreStatsModel4 != null) {
            i12 = multiTrackerFirestoreStatsModel4.getMood4TrackCount();
        } else {
            i12 = 0;
        }
        int i16 = i15 + i12;
        MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel5 = f36767c;
        if (multiTrackerFirestoreStatsModel5 != null) {
            i13 = multiTrackerFirestoreStatsModel5.getMood5TrackCount();
        }
        return i16 + i13;
    }

    public static y0 b() {
        boolean z10;
        User user = FirebasePersistence.getInstance().getUser();
        y0 y0Var = y0.MIGRATION_PENDING;
        if (user != null) {
            ArrayList<Goal> userGoals = user.getUserGoals();
            if (userGoals != null && !userGoals.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return y0.MIGRATION_SUCCESS;
            }
            return y0Var;
        }
        return y0Var;
    }

    public static void c(String str) {
        if (str == null) {
            return;
        }
        try {
            he.t tVar = f36768d;
            if (tVar != null) {
                tVar.remove();
                f36768d = null;
                f36769e = j.PENDING;
            }
            com.google.firebase.firestore.a q10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str);
            fe.h hVar = new fe.h() { // from class: wn.a
                @Override // fe.h
                public final void a(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                    MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel;
                    int i6;
                    boolean z10;
                    UserTrackFirestoreParentModel userTrackFirestoreParentModel;
                    fe.g gVar = (fe.g) obj;
                    ArrayList<MultiTrackerModel> arrayList = null;
                    if (gVar != null && (userTrackFirestoreParentModel = (UserTrackFirestoreParentModel) gVar.d(UserTrackFirestoreParentModel.class)) != null) {
                        multiTrackerFirestoreStatsModel = userTrackFirestoreParentModel.getMultiTrackerStats();
                    } else {
                        multiTrackerFirestoreStatsModel = null;
                    }
                    b.f36767c = multiTrackerFirestoreStatsModel;
                    j jVar = b.f36769e;
                    j jVar2 = j.PENDING;
                    if (jVar == jVar2) {
                        if (multiTrackerFirestoreStatsModel != null) {
                            i6 = multiTrackerFirestoreStatsModel.getDayTrackedCount();
                        } else {
                            i6 = -1;
                        }
                        if (i6 > 0) {
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                arrayList = user.getUserMoodListV3();
                            }
                            if (arrayList != null && !arrayList.isEmpty()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                jVar2 = j.COMPLETED;
                            }
                        }
                        b.f36769e = jVar2;
                    }
                }
            };
            ya.t tVar2 = oe.g.f27420a;
            ca.a.w(tVar2, "Provided executor must not be null.");
            j.a aVar = new j.a();
            aVar.f17532a = false;
            aVar.f17533b = false;
            aVar.f17534c = false;
            f36768d = q10.a(tVar2, aVar, hVar);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(f36766b, e10);
        }
    }
}
