package com.theinnerhour.b2b.persistence;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.model.UserAudioStatisticsDetail;
import com.theinnerhour.b2b.model.UserStatisticsDetail;
import com.theinnerhour.b2b.model.UserStatisticsModel;
import com.theinnerhour.b2b.utils.Constants;
import fd.f;
import is.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: StatPersistence.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\f\u0010\u000bJ1\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0017\u0010\u000bJ*\u0010\u001c\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u0002R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/theinnerhour/b2b/persistence/StatPersistence;", "", "Lhs/k;", "initialise", "", "count", "updateAllieTrackCount", "(Ljava/lang/Long;)V", "", "list", "updateUniqueActivitiesCount", "([Ljava/lang/Long;)V", "updateGoalTrackCount", "Lcom/theinnerhour/b2b/model/UserStatisticsDetail;", "goalStats", "", "courseName", "", ServerValues.NAME_OP_INCREMENT, "", "overrideCount", "updateGoalTrackCountByCourse", "(Lcom/theinnerhour/b2b/model/UserStatisticsDetail;Ljava/lang/String;ZLjava/lang/Integer;)V", "updateResourcesReadCount", Constants.NOTIFICATION_URL, "label", "minutes", "course", "addOrIncrementAudioMinutes", "onLogout", "Lcom/google/firebase/database/DatabaseReference;", "statisticDatabaseReference", "Lcom/google/firebase/database/DatabaseReference;", "Lcom/theinnerhour/b2b/model/UserStatisticsModel;", "statisticsModel", "Lcom/theinnerhour/b2b/model/UserStatisticsModel;", "getStatisticsModel", "()Lcom/theinnerhour/b2b/model/UserStatisticsModel;", "setStatisticsModel", "(Lcom/theinnerhour/b2b/model/UserStatisticsModel;)V", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class StatPersistence {
    public static final StatPersistence INSTANCE = new StatPersistence();
    private static DatabaseReference statisticDatabaseReference;
    private static UserStatisticsModel statisticsModel;

    private StatPersistence() {
    }

    public static /* synthetic */ void updateAllieTrackCount$default(StatPersistence statPersistence, Long l2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            l2 = null;
        }
        statPersistence.updateAllieTrackCount(l2);
    }

    public static /* synthetic */ void updateGoalTrackCountByCourse$default(StatPersistence statPersistence, UserStatisticsDetail userStatisticsDetail, String str, boolean z10, Integer num, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            num = null;
        }
        statPersistence.updateGoalTrackCountByCourse(userStatisticsDetail, str, z10, num);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addOrIncrementAudioMinutes(String str, String str2, long j10, String course) {
        UserAudioStatisticsDetail userAudioStatisticsDetail;
        Object obj;
        DatabaseReference child;
        i.g(course, "course");
        UserStatisticsModel userStatisticsModel = statisticsModel;
        if (userStatisticsModel != null) {
            Long l2 = null;
            if (userStatisticsModel != null) {
                userAudioStatisticsDetail = userStatisticsModel.getAudioMinutes();
            } else {
                userAudioStatisticsDetail = null;
            }
            if (userAudioStatisticsDetail != null) {
                userAudioStatisticsDetail.setTotal(userAudioStatisticsDetail.getTotal() + j10);
                Iterator<T> it = userAudioStatisticsDetail.getList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (i.b(((UserStatisticsDetail) obj).getUrl(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                UserStatisticsDetail userStatisticsDetail = (UserStatisticsDetail) obj;
                if (userStatisticsDetail == null) {
                    ArrayList<UserStatisticsDetail> list = userAudioStatisticsDetail.getList();
                    UserStatisticsDetail userStatisticsDetail2 = new UserStatisticsDetail();
                    userStatisticsDetail2.setUrl(str);
                    switch (course.hashCode()) {
                        case -2114782937:
                            if (course.equals(Constants.COURSE_HAPPINESS)) {
                                userStatisticsDetail2.setHappiness(userStatisticsDetail2.getHappiness() + j10);
                                break;
                            }
                            if (userStatisticsDetail2.getGeneric() == null) {
                                userStatisticsDetail2.setGeneric(Long.valueOf(j10));
                                break;
                            } else {
                                Long generic = userStatisticsDetail2.getGeneric();
                                if (generic != null) {
                                    l2 = Long.valueOf(generic.longValue() + j10);
                                }
                                userStatisticsDetail2.setGeneric(l2);
                                break;
                            }
                        case -1617042330:
                            if (course.equals(Constants.COURSE_DEPRESSION)) {
                                userStatisticsDetail2.setDepression(userStatisticsDetail2.getDepression() + j10);
                                break;
                            }
                            if (userStatisticsDetail2.getGeneric() == null) {
                            }
                            break;
                        case -891989580:
                            if (course.equals(Constants.COURSE_STRESS)) {
                                userStatisticsDetail2.setStress(userStatisticsDetail2.getStress() + j10);
                                break;
                            }
                            if (userStatisticsDetail2.getGeneric() == null) {
                            }
                            break;
                        case 92960775:
                            if (course.equals(Constants.COURSE_ANGER)) {
                                userStatisticsDetail2.setAnger(userStatisticsDetail2.getAnger() + j10);
                                break;
                            }
                            if (userStatisticsDetail2.getGeneric() == null) {
                            }
                            break;
                        case 109522647:
                            if (course.equals(Constants.COURSE_SLEEP)) {
                                userStatisticsDetail2.setSleep(userStatisticsDetail2.getSleep() + j10);
                                break;
                            }
                            if (userStatisticsDetail2.getGeneric() == null) {
                            }
                            break;
                        case 113319009:
                            if (course.equals(Constants.COURSE_WORRY)) {
                                userStatisticsDetail2.setWorry(userStatisticsDetail2.getWorry() + j10);
                                break;
                            }
                            if (userStatisticsDetail2.getGeneric() == null) {
                            }
                            break;
                        default:
                            if (userStatisticsDetail2.getGeneric() == null) {
                            }
                            break;
                    }
                    userStatisticsDetail2.setTotal(j10);
                    if (str2 != null) {
                        userStatisticsDetail2.setLabel(str2);
                    }
                    list.add(userStatisticsDetail2);
                } else {
                    switch (course.hashCode()) {
                        case -2114782937:
                            if (course.equals(Constants.COURSE_HAPPINESS)) {
                                userStatisticsDetail.setHappiness(userStatisticsDetail.getHappiness() + j10);
                                break;
                            }
                            break;
                        case -1617042330:
                            if (course.equals(Constants.COURSE_DEPRESSION)) {
                                userStatisticsDetail.setDepression(userStatisticsDetail.getDepression() + j10);
                                break;
                            }
                            break;
                        case -891989580:
                            if (course.equals(Constants.COURSE_STRESS)) {
                                userStatisticsDetail.setStress(userStatisticsDetail.getStress() + j10);
                                break;
                            }
                            break;
                        case 92960775:
                            if (course.equals(Constants.COURSE_ANGER)) {
                                userStatisticsDetail.setAnger(userStatisticsDetail.getAnger() + j10);
                                break;
                            }
                            break;
                        case 109522647:
                            if (course.equals(Constants.COURSE_SLEEP)) {
                                userStatisticsDetail.setSleep(userStatisticsDetail.getSleep() + j10);
                                break;
                            }
                            break;
                        case 113319009:
                            if (course.equals(Constants.COURSE_WORRY)) {
                                userStatisticsDetail.setWorry(userStatisticsDetail.getWorry() + j10);
                                break;
                            }
                            break;
                    }
                    userStatisticsDetail.setTotal(userStatisticsDetail.getTotal() + j10);
                    if (str2 != null && !i.b(userStatisticsDetail.getLabel(), str2)) {
                        userStatisticsDetail.setLabel(str2);
                    }
                }
                DatabaseReference databaseReference = statisticDatabaseReference;
                if (databaseReference != null && (child = databaseReference.child("audioMinutes")) != null) {
                    child.setValue(userAudioStatisticsDetail);
                }
            }
        }
    }

    public final UserStatisticsModel getStatisticsModel() {
        return statisticsModel;
    }

    public final void initialise() {
        final f fVar;
        if (statisticDatabaseReference == null && (fVar = FirebaseAuth.getInstance().f) != null) {
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            DatabaseReference reference = firebaseDatabase.getReference("userStatistics/" + fVar.j0());
            reference.addValueEventListener(new ValueEventListener() { // from class: com.theinnerhour.b2b.persistence.StatPersistence$initialise$1$1$1
                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError error) {
                    i.g(error, "error");
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot snapshot) {
                    i.g(snapshot, "snapshot");
                    if (snapshot.exists()) {
                        UserStatisticsModel userStatisticsModel = (UserStatisticsModel) snapshot.getValue(UserStatisticsModel.class);
                        if (userStatisticsModel != null) {
                            StatPersistence.INSTANCE.setStatisticsModel(userStatisticsModel);
                            return;
                        }
                        return;
                    }
                    FirebaseDatabase.getInstance().getReference("userStatistics/").child(f.this.j0()).setValue(new UserStatisticsModel());
                }
            });
            reference.keepSynced(true);
            statisticDatabaseReference = reference;
        }
    }

    public final void onLogout() {
        statisticDatabaseReference = null;
        statisticsModel = null;
    }

    public final void setStatisticsModel(UserStatisticsModel userStatisticsModel) {
        statisticsModel = userStatisticsModel;
    }

    public final void updateAllieTrackCount(Long l2) {
        DatabaseReference databaseReference;
        DatabaseReference child;
        long j10;
        long j11;
        if (statisticsModel != null && (databaseReference = statisticDatabaseReference) != null && (child = databaseReference.child("allieTaps")) != null) {
            if (l2 != null) {
                j11 = l2.longValue();
            } else {
                UserStatisticsModel userStatisticsModel = statisticsModel;
                if (userStatisticsModel != null) {
                    j10 = userStatisticsModel.getAllieTaps();
                } else {
                    j10 = 0;
                }
                j11 = j10 + 1;
            }
            child.setValue(Long.valueOf(j11));
        }
    }

    public final void updateGoalTrackCount(Long[] list) {
        DatabaseReference child;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        i.g(list, "list");
        DatabaseReference databaseReference = statisticDatabaseReference;
        if (databaseReference != null && (child = databaseReference.child("uniqueGoalTracks")) != null) {
            UserStatisticsDetail userStatisticsDetail = new UserStatisticsDetail();
            boolean z10 = false;
            Long l2 = (Long) k.V1(0, list);
            if (l2 != null) {
                j10 = l2.longValue();
            } else {
                j10 = 0;
            }
            userStatisticsDetail.setAnger(j10);
            Long l10 = (Long) k.V1(1, list);
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = 0;
            }
            userStatisticsDetail.setDepression(j11);
            Long l11 = (Long) k.V1(2, list);
            if (l11 != null) {
                j12 = l11.longValue();
            } else {
                j12 = 0;
            }
            userStatisticsDetail.setHappiness(j12);
            Long l12 = (Long) k.V1(3, list);
            if (l12 != null) {
                j13 = l12.longValue();
            } else {
                j13 = 0;
            }
            userStatisticsDetail.setSleep(j13);
            Long l13 = (Long) k.V1(4, list);
            if (l13 != null) {
                j14 = l13.longValue();
            } else {
                j14 = 0;
            }
            userStatisticsDetail.setStress(j14);
            Long l14 = (Long) k.V1(5, list);
            if (l14 != null) {
                j15 = l14.longValue();
            } else {
                j15 = 0;
            }
            userStatisticsDetail.setWorry(j15);
            long j16 = (Long) k.V1(6, list);
            if (j16 == null) {
                j16 = 0L;
            }
            userStatisticsDetail.setCustom(j16);
            Object V1 = k.V1(7, list);
            Long l15 = (Long) V1;
            if (Boolean.valueOf((l15 == null || l15.longValue() == 0) ? true : true).booleanValue()) {
                V1 = null;
            }
            userStatisticsDetail.setGeneric((Long) V1);
            userStatisticsDetail.setTotal(k.g2(list));
            child.setValue(userStatisticsDetail);
        }
    }

    public final void updateGoalTrackCountByCourse(UserStatisticsDetail goalStats, String courseName, boolean z10, Integer num) {
        int i6;
        DatabaseReference child;
        i.g(goalStats, "goalStats");
        i.g(courseName, "courseName");
        int i10 = 1;
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = 1;
        }
        if (!z10) {
            i10 = -1;
        }
        int i11 = i6 * i10;
        switch (courseName.hashCode()) {
            case -2114782937:
                if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                    goalStats.setHappiness(goalStats.getHappiness() + i11);
                    break;
                }
                break;
            case -1617042330:
                if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                    goalStats.setDepression(goalStats.getDepression() + i11);
                    break;
                }
                break;
            case -952207494:
                if (courseName.equals("independent") && goalStats.getCustom() != null) {
                    Long custom = goalStats.getCustom();
                    i.d(custom);
                    goalStats.setCustom(Long.valueOf(custom.longValue() + i11));
                    break;
                }
                break;
            case -891989580:
                if (courseName.equals(Constants.COURSE_STRESS)) {
                    goalStats.setStress(goalStats.getStress() + i11);
                    break;
                }
                break;
            case 92960775:
                if (courseName.equals(Constants.COURSE_ANGER)) {
                    goalStats.setAnger(goalStats.getAnger() + i11);
                    break;
                }
                break;
            case 109522647:
                if (courseName.equals(Constants.COURSE_SLEEP)) {
                    goalStats.setSleep(goalStats.getSleep() + i11);
                    break;
                }
                break;
            case 113319009:
                if (courseName.equals(Constants.COURSE_WORRY)) {
                    goalStats.setWorry(goalStats.getWorry() + i11);
                    break;
                }
                break;
            case 907087443:
                if (courseName.equals(Constants.LIBRARY_GOAL_COURSE) && goalStats.getGeneric() != null) {
                    Long generic = goalStats.getGeneric();
                    i.d(generic);
                    goalStats.setGeneric(Long.valueOf(generic.longValue() + i11));
                    break;
                }
                break;
        }
        goalStats.setTotal(goalStats.getTotal() + i11);
        DatabaseReference databaseReference = statisticDatabaseReference;
        if (databaseReference != null && (child = databaseReference.child("uniqueGoalTracks")) != null) {
            child.setValue(goalStats);
        }
    }

    public final void updateResourcesReadCount(Long[] list) {
        DatabaseReference child;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        i.g(list, "list");
        DatabaseReference databaseReference = statisticDatabaseReference;
        if (databaseReference != null && (child = databaseReference.child("resourcesRead")) != null) {
            UserStatisticsDetail userStatisticsDetail = new UserStatisticsDetail();
            boolean z10 = false;
            Long l2 = (Long) k.V1(0, list);
            if (l2 != null) {
                j10 = l2.longValue();
            } else {
                j10 = 0;
            }
            userStatisticsDetail.setAnger(j10);
            Long l10 = (Long) k.V1(1, list);
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = 0;
            }
            userStatisticsDetail.setDepression(j11);
            Long l11 = (Long) k.V1(2, list);
            if (l11 != null) {
                j12 = l11.longValue();
            } else {
                j12 = 0;
            }
            userStatisticsDetail.setHappiness(j12);
            Long l12 = (Long) k.V1(3, list);
            if (l12 != null) {
                j13 = l12.longValue();
            } else {
                j13 = 0;
            }
            userStatisticsDetail.setSleep(j13);
            Long l13 = (Long) k.V1(4, list);
            if (l13 != null) {
                j14 = l13.longValue();
            } else {
                j14 = 0;
            }
            userStatisticsDetail.setStress(j14);
            Long l14 = (Long) k.V1(5, list);
            if (l14 != null) {
                j15 = l14.longValue();
            } else {
                j15 = 0;
            }
            userStatisticsDetail.setWorry(j15);
            Object V1 = k.V1(6, list);
            Long l15 = (Long) V1;
            if (Boolean.valueOf((l15 == null || l15.longValue() == 0) ? true : true).booleanValue()) {
                V1 = null;
            }
            userStatisticsDetail.setGeneric((Long) V1);
            userStatisticsDetail.setTotal(k.g2(list));
            child.setValue(userStatisticsDetail);
        }
    }

    public final void updateUniqueActivitiesCount(Long[] list) {
        DatabaseReference child;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        i.g(list, "list");
        DatabaseReference databaseReference = statisticDatabaseReference;
        if (databaseReference != null && (child = databaseReference.child("uniqueActivities")) != null) {
            UserStatisticsDetail userStatisticsDetail = new UserStatisticsDetail();
            Long l2 = (Long) k.V1(0, list);
            long j15 = 0;
            if (l2 != null) {
                j10 = l2.longValue();
            } else {
                j10 = 0;
            }
            userStatisticsDetail.setAnger(j10);
            Long l10 = (Long) k.V1(1, list);
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = 0;
            }
            userStatisticsDetail.setDepression(j11);
            Long l11 = (Long) k.V1(2, list);
            if (l11 != null) {
                j12 = l11.longValue();
            } else {
                j12 = 0;
            }
            userStatisticsDetail.setHappiness(j12);
            Long l12 = (Long) k.V1(3, list);
            if (l12 != null) {
                j13 = l12.longValue();
            } else {
                j13 = 0;
            }
            userStatisticsDetail.setSleep(j13);
            Long l13 = (Long) k.V1(4, list);
            if (l13 != null) {
                j14 = l13.longValue();
            } else {
                j14 = 0;
            }
            userStatisticsDetail.setStress(j14);
            Long l14 = (Long) k.V1(5, list);
            if (l14 != null) {
                j15 = l14.longValue();
            }
            userStatisticsDetail.setWorry(j15);
            userStatisticsDetail.setTotal(k.g2(list));
            child.setValue(userStatisticsDetail);
        }
    }
}
