package com.theinnerhour.b2b.persistence;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.model.DashboardNpsDayTrack;
import com.theinnerhour.b2b.model.NpsCourseTrack;
import com.theinnerhour.b2b.model.NpsDayTrack;
import com.theinnerhour.b2b.model.NpsGoalIndividualTrack;
import com.theinnerhour.b2b.model.NpsGoalTrack;
import com.theinnerhour.b2b.model.UserNpsCheckModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import fd.f;
import hs.k;
import is.q;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import ss.l;
/* compiled from: NpsPersistence.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003J\u001e\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\tJ\u0016\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0010\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0003J\u0014\u0010!\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001fJ\u0010\u0010\"\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010#\u001a\u00020\u0005R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/theinnerhour/b2b/persistence/NpsPersistence;", "", "Lkotlin/Function1;", "", "onLoad", "Lhs/k;", "initialise", "", "slug", "", "day", "npsShown", "updateMainPlanDayNps", "updateMiniCoursePlanDayNps", "isNpsForMainPlanDayComplete", "isNpsForMiniCoursePlanDayComplete", "incrementNpsGoalTrackCount", "getNpsGoalTrackCount", "()Ljava/lang/Integer;", "track", "isNpsForGoalTrackComplete", "getHighestNpsGoalTrackCount", "isTracked", "updateNpsGoalStatusForTrack", "isNpsSlotAvailable", "isSourceFeedback", "updateNpsSlot", "checkAndUpdateAppOpenDay", "isDashboardNpsPendingForDay", "npsComplete", "updateDashboardNpsForDay", "Ljava/util/ArrayList;", "slugList", "resetNpsDataForMainPlan", "resetNpsDataForMiniCourse", "onLogout", "Lcom/google/firebase/database/DatabaseReference;", "npsDatabaseReference", "Lcom/google/firebase/database/DatabaseReference;", "Lcom/theinnerhour/b2b/model/UserNpsCheckModel;", "npsCheckModel", "Lcom/theinnerhour/b2b/model/UserNpsCheckModel;", "getNpsCheckModel", "()Lcom/theinnerhour/b2b/model/UserNpsCheckModel;", "setNpsCheckModel", "(Lcom/theinnerhour/b2b/model/UserNpsCheckModel;)V", "npsInitComplete", "Z", "getNpsInitComplete", "()Z", "setNpsInitComplete", "(Z)V", "Lcom/google/firebase/database/ValueEventListener;", "listener", "Lcom/google/firebase/database/ValueEventListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NpsPersistence {
    public static final NpsPersistence INSTANCE = new NpsPersistence();
    private static ValueEventListener listener;
    private static UserNpsCheckModel npsCheckModel;
    private static DatabaseReference npsDatabaseReference;
    private static boolean npsInitComplete;

    private NpsPersistence() {
    }

    public static /* synthetic */ void updateNpsSlot$default(NpsPersistence npsPersistence, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = false;
        }
        npsPersistence.updateNpsSlot(z10);
    }

    public final void checkAndUpdateAppOpenDay() {
        DashboardNpsDayTrack dashboardNps;
        long j10;
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel != null) {
            if (userNpsCheckModel != null && (dashboardNps = userNpsCheckModel.getDashboardNps()) != null) {
                long timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                Long lastAppOpenDay = dashboardNps.getLastAppOpenDay();
                if (lastAppOpenDay != null) {
                    j10 = lastAppOpenDay.longValue();
                } else {
                    j10 = 0;
                }
                if (timeInSeconds - j10 > 86400) {
                    dashboardNps.setLastAppOpenDay(Long.valueOf(timeInSeconds));
                    dashboardNps.setAppOpenDayCount(dashboardNps.getAppOpenDayCount() + 1);
                }
            }
            DatabaseReference databaseReference = npsDatabaseReference;
            if (databaseReference != null) {
                databaseReference.setValue(npsCheckModel);
            }
        }
    }

    public final int getHighestNpsGoalTrackCount() {
        ArrayList<NpsGoalIndividualTrack> arrayList;
        boolean z10;
        UserNpsCheckModel userNpsCheckModel;
        NpsGoalTrack goalsNps;
        ArrayList<NpsGoalIndividualTrack> nps;
        int i6;
        int i10;
        NpsGoalTrack goalsNps2;
        UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
        Integer num = null;
        if (userNpsCheckModel2 != null && (goalsNps2 = userNpsCheckModel2.getGoalsNps()) != null) {
            arrayList = goalsNps2.getNps();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || (userNpsCheckModel = npsCheckModel) == null || (goalsNps = userNpsCheckModel.getGoalsNps()) == null || (nps = goalsNps.getNps()) == null) {
            return 0;
        }
        Iterator<T> it = nps.iterator();
        if (it.hasNext()) {
            Integer track = ((NpsGoalIndividualTrack) it.next()).getTrack();
            if (track != null) {
                i6 = track.intValue();
            } else {
                i6 = 0;
            }
            num = Integer.valueOf(i6);
            while (it.hasNext()) {
                Integer track2 = ((NpsGoalIndividualTrack) it.next()).getTrack();
                if (track2 != null) {
                    i10 = track2.intValue();
                } else {
                    i10 = 0;
                }
                Integer valueOf = Integer.valueOf(i10);
                if (num.compareTo(valueOf) < 0) {
                    num = valueOf;
                }
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return 0;
        }
        return num2.intValue();
    }

    public final UserNpsCheckModel getNpsCheckModel() {
        return npsCheckModel;
    }

    public final Integer getNpsGoalTrackCount() {
        NpsGoalTrack goalsNps;
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel != null && (goalsNps = userNpsCheckModel.getGoalsNps()) != null) {
            return goalsNps.getTrackCount();
        }
        return null;
    }

    public final boolean getNpsInitComplete() {
        return npsInitComplete;
    }

    public final void incrementNpsGoalTrackCount() {
        DatabaseReference databaseReference;
        DatabaseReference child;
        DatabaseReference child2;
        int i6;
        NpsGoalTrack goalsNps;
        Integer trackCount;
        if (npsCheckModel != null && (databaseReference = npsDatabaseReference) != null && (child = databaseReference.child("goalsNps")) != null && (child2 = child.child("trackCount")) != null) {
            UserNpsCheckModel userNpsCheckModel = npsCheckModel;
            if (userNpsCheckModel != null && (goalsNps = userNpsCheckModel.getGoalsNps()) != null && (trackCount = goalsNps.getTrackCount()) != null) {
                i6 = trackCount.intValue();
            } else {
                i6 = 0;
            }
            child2.setValue(Integer.valueOf(i6 + 1));
        }
    }

    public final void initialise(l<? super Boolean, ? extends Object> onLoad) {
        DatabaseReference databaseReference;
        i.g(onLoad, "onLoad");
        ValueEventListener valueEventListener = listener;
        if (valueEventListener != null) {
            if (valueEventListener != null && (databaseReference = npsDatabaseReference) != null) {
                databaseReference.removeEventListener(valueEventListener);
            }
            npsDatabaseReference = null;
            npsCheckModel = null;
        }
        f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            DatabaseReference reference = firebaseDatabase.getReference("userNps/" + fVar.j0());
            NpsPersistence$initialise$2$1$1 npsPersistence$initialise$2$1$1 = new NpsPersistence$initialise$2$1$1(onLoad, fVar);
            listener = npsPersistence$initialise$2$1$1;
            reference.addValueEventListener(npsPersistence$initialise$2$1$1);
            reference.keepSynced(true);
            npsDatabaseReference = reference;
        }
    }

    public final boolean isDashboardNpsPendingForDay(int i6) {
        ArrayList<NpsDayTrack> arrayList;
        boolean z10;
        DashboardNpsDayTrack dashboardNps;
        ArrayList<NpsDayTrack> nps;
        Boolean npsComplete;
        boolean z11;
        DashboardNpsDayTrack dashboardNps2;
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel == null) {
            return false;
        }
        Object obj = null;
        if (userNpsCheckModel != null && (dashboardNps2 = userNpsCheckModel.getDashboardNps()) != null) {
            arrayList = dashboardNps2.getNps();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
            if (userNpsCheckModel2 == null || (dashboardNps = userNpsCheckModel2.getDashboardNps()) == null || (nps = dashboardNps.getNps()) == null) {
                return false;
            }
            Iterator<T> it = nps.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer day = ((NpsDayTrack) next).getDay();
                if (day != null && day.intValue() == i6) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    obj = next;
                    break;
                }
            }
            NpsDayTrack npsDayTrack = (NpsDayTrack) obj;
            if (npsDayTrack == null || (npsComplete = npsDayTrack.getNpsComplete()) == null || npsComplete.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isNpsForGoalTrackComplete(int i6) {
        NpsGoalTrack goalsNps;
        ArrayList<NpsGoalIndividualTrack> nps;
        Object obj;
        Boolean npsComplete;
        boolean z10;
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel == null || (goalsNps = userNpsCheckModel.getGoalsNps()) == null || (nps = goalsNps.getNps()) == null) {
            return false;
        }
        Iterator<T> it = nps.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer track = ((NpsGoalIndividualTrack) obj).getTrack();
                if (track != null && track.intValue() == i6) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NpsGoalIndividualTrack npsGoalIndividualTrack = (NpsGoalIndividualTrack) obj;
        if (npsGoalIndividualTrack == null || (npsComplete = npsGoalIndividualTrack.getNpsComplete()) == null) {
            return false;
        }
        return npsComplete.booleanValue();
    }

    public final boolean isNpsForMainPlanDayComplete(String slug, int i6) {
        ArrayList<NpsCourseTrack> mainPlanNps;
        Object obj;
        Object obj2;
        Boolean npsComplete;
        boolean z10;
        i.g(slug, "slug");
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel == null || (mainPlanNps = userNpsCheckModel.getMainPlanNps()) == null) {
            return false;
        }
        Iterator<T> it = mainPlanNps.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (i.b(((NpsCourseTrack) obj2).getSlug(), slug)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        NpsCourseTrack npsCourseTrack = (NpsCourseTrack) obj2;
        if (npsCourseTrack == null) {
            return false;
        }
        Iterator<T> it2 = npsCourseTrack.getNps().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Integer day = ((NpsDayTrack) next).getDay();
            if (day != null && day.intValue() == i6) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        NpsDayTrack npsDayTrack = (NpsDayTrack) obj;
        if (npsDayTrack == null || (npsComplete = npsDayTrack.getNpsComplete()) == null) {
            return false;
        }
        return npsComplete.booleanValue();
    }

    public final boolean isNpsForMiniCoursePlanDayComplete(String slug, int i6) {
        ArrayList<NpsCourseTrack> miniCourseNps;
        Object obj;
        Object obj2;
        Boolean npsComplete;
        boolean z10;
        i.g(slug, "slug");
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel == null || (miniCourseNps = userNpsCheckModel.getMiniCourseNps()) == null) {
            return false;
        }
        Iterator<T> it = miniCourseNps.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (i.b(((NpsCourseTrack) obj2).getSlug(), slug)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        NpsCourseTrack npsCourseTrack = (NpsCourseTrack) obj2;
        if (npsCourseTrack == null) {
            return false;
        }
        Iterator<T> it2 = npsCourseTrack.getNps().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Integer day = ((NpsDayTrack) next).getDay();
            if (day != null && day.intValue() == i6) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        NpsDayTrack npsDayTrack = (NpsDayTrack) obj;
        if (npsDayTrack == null || (npsComplete = npsDayTrack.getNpsComplete()) == null) {
            return false;
        }
        return npsComplete.booleanValue();
    }

    public final boolean isNpsSlotAvailable() {
        long j10;
        Long lastNpsDisplay;
        long timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel != null && (lastNpsDisplay = userNpsCheckModel.getLastNpsDisplay()) != null) {
            j10 = lastNpsDisplay.longValue();
        } else {
            j10 = 0;
        }
        if (timeInSeconds - j10 > 432000) {
            return true;
        }
        return false;
    }

    public final void onLogout() {
        DatabaseReference databaseReference;
        ValueEventListener valueEventListener = listener;
        if (valueEventListener != null && (databaseReference = npsDatabaseReference) != null) {
            databaseReference.removeEventListener(valueEventListener);
        }
        npsDatabaseReference = null;
        npsCheckModel = null;
    }

    public final void resetNpsDataForMainPlan(ArrayList<String> slugList) {
        ArrayList<NpsCourseTrack> mainPlanNps;
        ArrayList<NpsCourseTrack> mainPlanNps2;
        boolean z10;
        i.g(slugList, "slugList");
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        boolean z11 = false;
        if (userNpsCheckModel != null && (mainPlanNps2 = userNpsCheckModel.getMainPlanNps()) != null) {
            if (!mainPlanNps2.isEmpty()) {
                for (NpsCourseTrack npsCourseTrack : mainPlanNps2) {
                    if (u.Z1(slugList, npsCourseTrack.getSlug())) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
            if (userNpsCheckModel2 != null && (mainPlanNps = userNpsCheckModel2.getMainPlanNps()) != null) {
                q.U1(mainPlanNps, new NpsPersistence$resetNpsDataForMainPlan$2(slugList));
            }
            DatabaseReference databaseReference = npsDatabaseReference;
            if (databaseReference != null) {
                databaseReference.setValue(npsCheckModel);
            }
        }
    }

    public final void resetNpsDataForMiniCourse(String str) {
        ArrayList<NpsCourseTrack> miniCourseNps;
        ArrayList<NpsCourseTrack> miniCourseNps2;
        boolean z10;
        if (str != null) {
            UserNpsCheckModel userNpsCheckModel = npsCheckModel;
            boolean z11 = false;
            if (userNpsCheckModel != null && (miniCourseNps2 = userNpsCheckModel.getMiniCourseNps()) != null) {
                if (!miniCourseNps2.isEmpty()) {
                    for (NpsCourseTrack npsCourseTrack : miniCourseNps2) {
                        if (i.b(npsCourseTrack.getSlug(), str)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    z11 = true;
                }
            }
            if (z11) {
                UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
                if (userNpsCheckModel2 != null && (miniCourseNps = userNpsCheckModel2.getMiniCourseNps()) != null) {
                    q.U1(miniCourseNps, new NpsPersistence$resetNpsDataForMiniCourse$2(str));
                }
                DatabaseReference databaseReference = npsDatabaseReference;
                if (databaseReference != null) {
                    databaseReference.setValue(npsCheckModel);
                }
            }
        }
    }

    public final void setNpsCheckModel(UserNpsCheckModel userNpsCheckModel) {
        npsCheckModel = userNpsCheckModel;
    }

    public final void setNpsInitComplete(boolean z10) {
        npsInitComplete = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateDashboardNpsForDay(int i6, boolean z10) {
        DashboardNpsDayTrack dashboardNps;
        ArrayList<NpsDayTrack> nps;
        DatabaseReference databaseReference;
        DashboardNpsDayTrack dashboardNps2;
        ArrayList<NpsDayTrack> nps2;
        Object obj;
        boolean z11;
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel != null && (dashboardNps2 = userNpsCheckModel.getDashboardNps()) != null && (nps2 = dashboardNps2.getNps()) != null) {
            Iterator<T> it = nps2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Integer day = ((NpsDayTrack) obj).getDay();
                    if (day != null && day.intValue() == i6) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NpsDayTrack npsDayTrack = (NpsDayTrack) obj;
            if (npsDayTrack != null) {
                npsDayTrack.setNpsComplete(Boolean.valueOf(z10));
                databaseReference = npsDatabaseReference;
                if (databaseReference == null) {
                    databaseReference.setValue(npsCheckModel);
                    return;
                }
                return;
            }
        }
        UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
        if (userNpsCheckModel2 != null && (dashboardNps = userNpsCheckModel2.getDashboardNps()) != null && (nps = dashboardNps.getNps()) != null) {
            NpsDayTrack npsDayTrack2 = new NpsDayTrack(null, null, 3, null);
            npsDayTrack2.setNpsComplete(Boolean.valueOf(z10));
            npsDayTrack2.setDay(Integer.valueOf(i6));
            nps.add(npsDayTrack2);
        }
        databaseReference = npsDatabaseReference;
        if (databaseReference == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateMainPlanDayNps(String slug, int i6, boolean z10) {
        ArrayList<NpsCourseTrack> mainPlanNps;
        DatabaseReference databaseReference;
        ArrayList<NpsCourseTrack> mainPlanNps2;
        Object obj;
        Object obj2;
        boolean z11;
        i.g(slug, "slug");
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel != null && (mainPlanNps2 = userNpsCheckModel.getMainPlanNps()) != null) {
            Iterator<T> it = mainPlanNps2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (i.b(((NpsCourseTrack) obj).getSlug(), slug)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NpsCourseTrack npsCourseTrack = (NpsCourseTrack) obj;
            if (npsCourseTrack != null) {
                Iterator<T> it2 = npsCourseTrack.getNps().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        Integer day = ((NpsDayTrack) obj2).getDay();
                        if (day != null && day.intValue() == i6) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                NpsDayTrack npsDayTrack = (NpsDayTrack) obj2;
                if (npsDayTrack != null) {
                    npsDayTrack.setNpsComplete(Boolean.valueOf(z10));
                } else {
                    ArrayList<NpsDayTrack> nps = npsCourseTrack.getNps();
                    NpsDayTrack npsDayTrack2 = new NpsDayTrack(null, null, 3, null);
                    npsDayTrack2.setDay(Integer.valueOf(i6));
                    npsDayTrack2.setNpsComplete(Boolean.valueOf(z10));
                    nps.add(npsDayTrack2);
                }
                databaseReference = npsDatabaseReference;
                if (databaseReference == null) {
                    databaseReference.setValue(npsCheckModel);
                    return;
                }
                return;
            }
        }
        UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
        if (userNpsCheckModel2 != null && (mainPlanNps = userNpsCheckModel2.getMainPlanNps()) != null) {
            NpsCourseTrack npsCourseTrack2 = new NpsCourseTrack(null, null, 3, null);
            npsCourseTrack2.setSlug(slug);
            NpsDayTrack npsDayTrack3 = new NpsDayTrack(null, null, 3, null);
            npsDayTrack3.setDay(Integer.valueOf(i6));
            npsDayTrack3.setNpsComplete(Boolean.valueOf(z10));
            k kVar = k.f19476a;
            npsCourseTrack2.setNps(ca.a.k(npsDayTrack3));
            mainPlanNps.add(npsCourseTrack2);
        }
        databaseReference = npsDatabaseReference;
        if (databaseReference == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateMiniCoursePlanDayNps(String slug, int i6, boolean z10) {
        ArrayList<NpsCourseTrack> miniCourseNps;
        DatabaseReference databaseReference;
        ArrayList<NpsCourseTrack> miniCourseNps2;
        Object obj;
        Object obj2;
        boolean z11;
        i.g(slug, "slug");
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel != null && (miniCourseNps2 = userNpsCheckModel.getMiniCourseNps()) != null) {
            Iterator<T> it = miniCourseNps2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (i.b(((NpsCourseTrack) obj).getSlug(), slug)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NpsCourseTrack npsCourseTrack = (NpsCourseTrack) obj;
            if (npsCourseTrack != null) {
                Iterator<T> it2 = npsCourseTrack.getNps().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        Integer day = ((NpsDayTrack) obj2).getDay();
                        if (day != null && day.intValue() == i6) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                NpsDayTrack npsDayTrack = (NpsDayTrack) obj2;
                if (npsDayTrack != null) {
                    npsDayTrack.setNpsComplete(Boolean.valueOf(z10));
                } else {
                    ArrayList<NpsDayTrack> nps = npsCourseTrack.getNps();
                    NpsDayTrack npsDayTrack2 = new NpsDayTrack(null, null, 3, null);
                    npsDayTrack2.setDay(Integer.valueOf(i6));
                    npsDayTrack2.setNpsComplete(Boolean.valueOf(z10));
                    nps.add(npsDayTrack2);
                }
                databaseReference = npsDatabaseReference;
                if (databaseReference == null) {
                    databaseReference.setValue(npsCheckModel);
                    return;
                }
                return;
            }
        }
        UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
        if (userNpsCheckModel2 != null && (miniCourseNps = userNpsCheckModel2.getMiniCourseNps()) != null) {
            NpsCourseTrack npsCourseTrack2 = new NpsCourseTrack(null, null, 3, null);
            npsCourseTrack2.setSlug(slug);
            NpsDayTrack npsDayTrack3 = new NpsDayTrack(null, null, 3, null);
            npsDayTrack3.setDay(Integer.valueOf(i6));
            npsDayTrack3.setNpsComplete(Boolean.valueOf(z10));
            k kVar = k.f19476a;
            npsCourseTrack2.setNps(ca.a.k(npsDayTrack3));
            miniCourseNps.add(npsCourseTrack2);
        }
        databaseReference = npsDatabaseReference;
        if (databaseReference == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateNpsGoalStatusForTrack(int i6, boolean z10) {
        NpsGoalTrack goalsNps;
        ArrayList<NpsGoalIndividualTrack> nps;
        DatabaseReference databaseReference;
        NpsGoalTrack goalsNps2;
        ArrayList<NpsGoalIndividualTrack> nps2;
        Object obj;
        boolean z11;
        UserNpsCheckModel userNpsCheckModel = npsCheckModel;
        if (userNpsCheckModel != null && (goalsNps2 = userNpsCheckModel.getGoalsNps()) != null && (nps2 = goalsNps2.getNps()) != null) {
            Iterator<T> it = nps2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Integer track = ((NpsGoalIndividualTrack) obj).getTrack();
                    if (track != null && track.intValue() == i6) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NpsGoalIndividualTrack npsGoalIndividualTrack = (NpsGoalIndividualTrack) obj;
            if (npsGoalIndividualTrack != null) {
                npsGoalIndividualTrack.setNpsComplete(Boolean.valueOf(z10));
                databaseReference = npsDatabaseReference;
                if (databaseReference == null) {
                    databaseReference.setValue(npsCheckModel);
                    return;
                }
                return;
            }
        }
        UserNpsCheckModel userNpsCheckModel2 = npsCheckModel;
        if (userNpsCheckModel2 != null && (goalsNps = userNpsCheckModel2.getGoalsNps()) != null && (nps = goalsNps.getNps()) != null) {
            NpsGoalIndividualTrack npsGoalIndividualTrack2 = new NpsGoalIndividualTrack(null, null, 3, null);
            npsGoalIndividualTrack2.setTrack(Integer.valueOf(i6));
            npsGoalIndividualTrack2.setNpsComplete(Boolean.valueOf(z10));
            nps.add(npsGoalIndividualTrack2);
        }
        databaseReference = npsDatabaseReference;
        if (databaseReference == null) {
        }
    }

    public final void updateNpsSlot(boolean z10) {
        DatabaseReference child;
        DatabaseReference databaseReference = npsDatabaseReference;
        if (databaseReference != null && (child = databaseReference.child("lastNpsDisplay")) != null) {
            child.setValue(Long.valueOf(Utils.INSTANCE.getTimeInSeconds()));
        }
        if (!z10) {
            Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
            todayCalendar.add(5, 3);
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, todayCalendar.getTimeInMillis());
        }
    }
}
