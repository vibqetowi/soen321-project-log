package wn;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.components.multiTracker.model.UserTrackFirestoreParentModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
/* compiled from: MultiTrackerMigrationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerMigrationViewModel$migrateMoodStatsToFirestore$2$1", f = "MultiTrackerMigrationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f36812u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f36813v;

    /* compiled from: MultiTrackerMigrationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f36814a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ls.d<? super Boolean> dVar) {
            this.f36814a = dVar;
        }

        @Override // ya.d
        public final void a(ya.h<Void> it) {
            kotlin.jvm.internal.i.g(it, "it");
            this.f36814a.resumeWith(Boolean.valueOf(it.isSuccessful()));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Long.valueOf(((MultiTrackerModel) t10).getDate().getTime()), Long.valueOf(((MultiTrackerModel) t3).getDate().getTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(k kVar, ls.d<? super Boolean> dVar, ls.d<? super m> dVar2) {
        super(2, dVar2);
        this.f36812u = kVar;
        this.f36813v = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m(this.f36812u, this.f36813v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
        if (((r13.getTodayTimeInSeconds() * r4) - r12.getTimeInMillis()) != 86400000) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157 A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0005, B:5:0x0034, B:7:0x003a, B:8:0x0048, B:10:0x004e, B:12:0x0091, B:14:0x00ab, B:19:0x00bf, B:22:0x00c5, B:41:0x011b, B:52:0x012f, B:53:0x0139, B:54:0x0143, B:55:0x014d, B:56:0x0157, B:26:0x00d0, B:28:0x00d4, B:32:0x00e2, B:34:0x00f2, B:36:0x0101, B:40:0x010e, B:37:0x0108, B:39:0x010c, B:59:0x0166), top: B:65:0x0005 }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList<MultiTrackerModel> userMoodListV3;
        int i6;
        int mood;
        boolean z10;
        sp.b.d0(obj);
        try {
            MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = new MultiTrackerFirestoreStatsModel(0, 0, 0, 0, 0, 0, 0L, 0L, 0, 511, null);
            v vVar = new v();
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            uVar.f23466u = true;
            User user = FirebasePersistence.getInstance().getUser();
            int i10 = 1000;
            long j10 = 0;
            if (user != null && (userMoodListV3 = user.getUserMoodListV3()) != null) {
                Iterator it = is.u.D2(userMoodListV3, new b()).iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    MultiTrackerModel multiTrackerModel = (MultiTrackerModel) it.next();
                    Calendar calendar = Calendar.getInstance();
                    Iterator it2 = it;
                    long j12 = i10;
                    calendar.setTimeInMillis(multiTrackerModel.getDate().getTime() * j12);
                    calendar.clear(11);
                    calendar.clear(9);
                    calendar.clear(12);
                    calendar.clear(10);
                    calendar.clear(13);
                    calendar.clear(14);
                    if (multiTrackerFirestoreStatsModel.getLatestTrackedDateInSeconds() == 0) {
                        multiTrackerFirestoreStatsModel.setLatestTrackedDateInSeconds(calendar.getTimeInMillis() / j12);
                        long timeInMillis = calendar.getTimeInMillis();
                        Utils utils = Utils.INSTANCE;
                        if (timeInMillis != utils.getTodayCalendar().getTimeInMillis() && (utils.getTodayTimeInSeconds() * j12) - calendar.getTimeInMillis() != 86400000) {
                            z10 = false;
                            uVar.f23466u = z10;
                        }
                        z10 = true;
                        uVar.f23466u = z10;
                    }
                    if (j11 != 0 && j11 <= calendar.getTimeInMillis()) {
                        i6 = 1;
                        mood = multiTrackerModel.getMood();
                        if (mood != i6) {
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
                            multiTrackerFirestoreStatsModel.setMood1TrackCount(multiTrackerFirestoreStatsModel.getMood1TrackCount() + i6);
                        }
                        it = it2;
                        i10 = 1000;
                    }
                    if (uVar.f23466u) {
                        if (j11 - calendar.getTimeInMillis() != 86400000) {
                            if (j11 == 0) {
                                long timeInMillis2 = calendar.getTimeInMillis();
                                Utils utils2 = Utils.INSTANCE;
                                if (timeInMillis2 != utils2.getTodayTimeInSeconds() * j12) {
                                }
                            }
                        }
                        vVar.f23467u++;
                        j11 = calendar.getTimeInMillis();
                        i6 = 1;
                        multiTrackerFirestoreStatsModel.setDayTrackedCount(multiTrackerFirestoreStatsModel.getDayTrackedCount() + 1);
                        mood = multiTrackerModel.getMood();
                        if (mood != i6) {
                        }
                        it = it2;
                        i10 = 1000;
                    }
                    if (uVar.f23466u) {
                        uVar.f23466u = false;
                    }
                    j11 = calendar.getTimeInMillis();
                    i6 = 1;
                    multiTrackerFirestoreStatsModel.setDayTrackedCount(multiTrackerFirestoreStatsModel.getDayTrackedCount() + 1);
                    mood = multiTrackerModel.getMood();
                    if (mood != i6) {
                    }
                    it = it2;
                    i10 = 1000;
                }
                j10 = j11;
            }
            multiTrackerFirestoreStatsModel.setEarliestTrackedDateInSeconds(j10 / 1000);
            multiTrackerFirestoreStatsModel.setTrackStreak(vVar.f23467u);
            fe.c b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION);
            fd.f fVar = FirebaseAuth.getInstance().f;
            kotlin.jvm.internal.i.d(fVar);
            b10.q(fVar.j0()).e(new UserTrackFirestoreParentModel(multiTrackerFirestoreStatsModel)).addOnCompleteListener(new a(this.f36813v));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36812u.f36803x, e10);
        }
        return hs.k.f19476a;
    }
}
