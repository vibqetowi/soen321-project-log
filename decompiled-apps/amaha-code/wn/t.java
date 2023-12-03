package wn;

import androidx.lifecycle.l0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.components.multiTracker.model.UserTrackFirestoreParentModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: MultiTrackerViewModel.kt */
/* loaded from: classes2.dex */
public final class t extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final String f36859x = LogHelper.INSTANCE.makeLogTag("MultiTrackerVM");

    public static final Object e(t tVar, String str, MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel, MultiTrackerModel multiTrackerModel, ls.d dVar) {
        tVar.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            Utils utils = Utils.INSTANCE;
            if (utils.getTodayTimeInSeconds() > multiTrackerFirestoreStatsModel.getLatestTrackedDateInSeconds()) {
                if (utils.getTodayTimeInSeconds() - multiTrackerFirestoreStatsModel.getLatestTrackedDateInSeconds() == 86400) {
                    multiTrackerFirestoreStatsModel.setTrackStreak(multiTrackerFirestoreStatsModel.getTrackStreak() + 1);
                    if (multiTrackerFirestoreStatsModel.getTrackStreak() >= 3) {
                        uVar.f23466u = true;
                    }
                } else {
                    multiTrackerFirestoreStatsModel.setTrackStreak(0);
                }
                multiTrackerFirestoreStatsModel.setLatestTrackedDateInSeconds(utils.getTodayTimeInSeconds());
                multiTrackerFirestoreStatsModel.setDayTrackedCount(multiTrackerFirestoreStatsModel.getDayTrackedCount() + 1);
            }
            int mood = multiTrackerModel.getMood();
            if (mood != 1) {
                if (mood != 2) {
                    if (mood != 3) {
                        if (mood != 4) {
                            if (mood == 5) {
                                multiTrackerFirestoreStatsModel.setMood5TrackCount(multiTrackerFirestoreStatsModel.getMood5TrackCount() + 1);
                            }
                        } else {
                            multiTrackerFirestoreStatsModel.setMood4TrackCount(multiTrackerFirestoreStatsModel.getMood4TrackCount() + 1);
                        }
                    } else {
                        multiTrackerFirestoreStatsModel.setMood3TrackCount(multiTrackerFirestoreStatsModel.getMood3TrackCount() + 1);
                    }
                } else {
                    multiTrackerFirestoreStatsModel.setMood2TrackCount(multiTrackerFirestoreStatsModel.getMood2TrackCount() + 1);
                }
            } else {
                multiTrackerFirestoreStatsModel.setMood1TrackCount(multiTrackerFirestoreStatsModel.getMood1TrackCount() + 1);
            }
            FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str).f(new UserTrackFirestoreParentModel(multiTrackerFirestoreStatsModel), fe.t.f15012d).addOnCompleteListener(new s(hVar, uVar, tVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tVar.f36859x, e10);
        }
        return hVar.b();
    }
}
