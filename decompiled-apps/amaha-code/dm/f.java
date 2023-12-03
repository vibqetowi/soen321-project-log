package dm;

import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityContentModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityHintListModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.network.model.NpsSubmissionModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import dw.z;
import fe.q;
import fe.r;
import gv.n;
import is.k;
import is.p;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import ls.h;
import sf.m;
import ya.v;
/* compiled from: V3GoalRepository.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f13149a = LogHelper.INSTANCE.makeLogTag(f.class);

    /* compiled from: V3GoalRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<RecommendedActivityModel> f13150a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f13151b;

        public a(f fVar, h hVar) {
            this.f13150a = hVar;
            this.f13151b = fVar;
        }

        @Override // ya.d
        public final void a(ya.h<r> it) {
            RecommendedActivityModel recommendedActivityModel;
            q qVar;
            ls.d<RecommendedActivityModel> dVar = this.f13150a;
            i.g(it, "it");
            try {
                if (it.isSuccessful()) {
                    r result = it.getResult();
                    if (result != null && (qVar = (q) u.h2(result)) != null) {
                        recommendedActivityModel = (RecommendedActivityModel) qVar.d(RecommendedActivityModel.class);
                    } else {
                        recommendedActivityModel = null;
                    }
                    dVar.resumeWith(recommendedActivityModel);
                }
            } catch (Throwable th2) {
                LogHelper.INSTANCE.e(this.f13151b.f13149a, "exception in fetch learning hub content", th2);
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: V3GoalRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ya.e {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<RecommendedActivityModel> f13153b;

        public b(h hVar) {
            this.f13153b = hVar;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            i.g(it, "it");
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = f.this.f13149a;
            logHelper.e(str, "on failure listener fetch learning hub content " + it);
            this.f13153b.resumeWith(null);
        }
    }

    /* compiled from: V3GoalRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<hs.f<? extends ArrayList<RecommendedActivityModel>, ? extends ArrayList<String>>> f13154a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f13155b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String[] f13156c;

        public c(h hVar, f fVar, String[] strArr) {
            this.f13154a = hVar;
            this.f13155b = fVar;
            this.f13156c = strArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x012d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x00fb A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[Catch: all -> 0x013a, TryCatch #0 {all -> 0x013a, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a3, B:45:0x00a9, B:54:0x00c5, B:55:0x00c8, B:57:0x00ce, B:58:0x00d2, B:60:0x00d8, B:64:0x00ed, B:66:0x00f1, B:68:0x00f7, B:69:0x00fb, B:71:0x0101, B:73:0x0111, B:82:0x012d, B:83:0x0131), top: B:88:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[Catch: all -> 0x013a, TryCatch #0 {all -> 0x013a, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a3, B:45:0x00a9, B:54:0x00c5, B:55:0x00c8, B:57:0x00ce, B:58:0x00d2, B:60:0x00d8, B:64:0x00ed, B:66:0x00f1, B:68:0x00f7, B:69:0x00fb, B:71:0x0101, B:73:0x0111, B:82:0x012d, B:83:0x0131), top: B:88:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00c5 A[Catch: all -> 0x013a, TryCatch #0 {all -> 0x013a, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0020, B:8:0x0026, B:10:0x002f, B:12:0x0042, B:15:0x004d, B:17:0x0053, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:31:0x007e, B:40:0x009a, B:41:0x009d, B:43:0x00a3, B:45:0x00a9, B:54:0x00c5, B:55:0x00c8, B:57:0x00ce, B:58:0x00d2, B:60:0x00d8, B:64:0x00ed, B:66:0x00f1, B:68:0x00f7, B:69:0x00fb, B:71:0x0101, B:73:0x0111, B:82:0x012d, B:83:0x0131), top: B:88:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
        @Override // ya.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(ya.h<r> it) {
            Object obj;
            ArrayList<RecommendedActivityHintListModel> tipsIconsList;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            ls.d<hs.f<? extends ArrayList<RecommendedActivityModel>, ? extends ArrayList<String>>> dVar = this.f13154a;
            i.g(it, "it");
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (it.isSuccessful()) {
                    r result = it.getResult();
                    if (result != null) {
                        String[] strArr = this.f13156c;
                        Iterator<q> it2 = result.iterator();
                        while (true) {
                            r.a aVar = (r.a) it2;
                            if (!aVar.hasNext()) {
                                break;
                            }
                            RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) ((q) aVar.next()).d(RecommendedActivityModel.class);
                            arrayList.add(recommendedActivityModel);
                            if (strArr != null) {
                                String backgroundUrl = recommendedActivityModel.getBackgroundUrl();
                                if (backgroundUrl != null) {
                                    if (!n.B0(backgroundUrl) && !k.Q1(u.o2(gv.r.a1(backgroundUrl, new String[]{"/"}, 0, 6)), strArr)) {
                                        z13 = false;
                                        if (!z13) {
                                            backgroundUrl = null;
                                        }
                                        if (backgroundUrl != null) {
                                            arrayList2.add(backgroundUrl);
                                        }
                                    }
                                    z13 = true;
                                    if (!z13) {
                                    }
                                    if (backgroundUrl != null) {
                                    }
                                }
                                String lottieUrl = recommendedActivityModel.getLottieUrl();
                                if (lottieUrl != null) {
                                    if (!n.B0(lottieUrl) && !k.Q1(u.o2(gv.r.a1(lottieUrl, new String[]{"/"}, 0, 6)), strArr)) {
                                        z12 = false;
                                        if (!z12) {
                                            lottieUrl = null;
                                        }
                                        if (lottieUrl != null) {
                                            arrayList2.add(lottieUrl);
                                        }
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                    if (lottieUrl != null) {
                                    }
                                }
                                String thumbUrl = recommendedActivityModel.getThumbUrl();
                                if (thumbUrl != null) {
                                    if (!n.B0(thumbUrl) && !k.Q1(u.o2(gv.r.a1(thumbUrl, new String[]{"/"}, 0, 6)), strArr)) {
                                        z11 = false;
                                        if (!z11) {
                                            thumbUrl = null;
                                        }
                                        if (thumbUrl != null) {
                                            arrayList2.add(thumbUrl);
                                        }
                                    }
                                    z11 = true;
                                    if (!z11) {
                                    }
                                    if (thumbUrl != null) {
                                    }
                                }
                                ArrayList<RecommendedActivityContentModel> activityContent = recommendedActivityModel.getActivityContent();
                                if (activityContent != null) {
                                    Iterator<T> it3 = activityContent.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj = it3.next();
                                            if (i.b(((RecommendedActivityContentModel) obj).getLabel(), "tips_icons_url")) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    RecommendedActivityContentModel recommendedActivityContentModel = (RecommendedActivityContentModel) obj;
                                    if (recommendedActivityContentModel != null && (tipsIconsList = recommendedActivityContentModel.getTipsIconsList()) != null) {
                                        for (RecommendedActivityHintListModel recommendedActivityHintListModel : tipsIconsList) {
                                            String content = recommendedActivityHintListModel.getContent();
                                            if (!n.B0(content) && !k.Q1(u.o2(gv.r.a1(content, new String[]{"/"}, 0, 6)), strArr)) {
                                                z10 = false;
                                                if (!z10) {
                                                    content = null;
                                                }
                                                if (content == null) {
                                                    arrayList2.add(content);
                                                }
                                            }
                                            z10 = true;
                                            if (!z10) {
                                            }
                                            if (content == null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    dVar.resumeWith(new hs.f(arrayList, arrayList2));
                }
            } catch (Throwable th2) {
                LogHelper.INSTANCE.e(this.f13155b.f13149a, "exception in fetch learning hub content", th2);
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: V3GoalRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d implements ya.e {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<hs.f<? extends ArrayList<RecommendedActivityModel>, ? extends ArrayList<String>>> f13158b;

        public d(h hVar) {
            this.f13158b = hVar;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            i.g(it, "it");
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = f.this.f13149a;
            logHelper.e(str, "on failure listener fetch learning hub content " + it);
            this.f13158b.resumeWith(null);
        }
    }

    /* compiled from: V3GoalRepository.kt */
    /* loaded from: classes2.dex */
    public static final class e implements CustomRetrofitCallback<m> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f13159u;

        public e(h hVar) {
            this.f13159u = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<m> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            this.f13159u.resumeWith(Boolean.FALSE);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<m> call, z<m> response) {
            i.g(call, "call");
            i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                this.f13159u.resumeWith(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r11.after(r2.getmStartDate()) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c(ArrayList arrayList, Date displayDate) {
        boolean z10;
        boolean z11;
        i.g(displayDate, "displayDate");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Goal goal = (Goal) obj;
            String courseName = goal.getCourseName();
            boolean z12 = true;
            if (courseName != null && !n.B0(courseName)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !i.b(goal.getCourseName(), "independent")) {
                String goalId = goal.getGoalId();
                if (goalId != null && !n.B0(goalId)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    if (goal.isVisible()) {
                        if (displayDate.getTime() != goal.getmStartDate().getTime()) {
                        }
                        if (!z12) {
                            arrayList2.add(obj);
                        }
                    }
                }
            }
            z12 = false;
            if (!z12) {
            }
        }
        p.P1(arrayList2, new dm.a(g.f13160u, 2));
        return arrayList2;
    }

    public static Object e(int i6, int i10, ls.d dVar) {
        h hVar = new h(ca.a.G0(dVar));
        ((or.g) nr.b.a(or.g.class)).a("https://api.theinnerhour.com/v1/save_nps", new NpsSubmissionModel(i6, i10, null, null, "goals")).I(new e(hVar));
        return hVar.b();
    }

    public final Object a(String str, ls.d<? super RecommendedActivityModel> dVar) {
        h hVar = new h(ca.a.G0(dVar));
        v a10 = FirebaseFirestore.d().b("recommended_activity_data").m(str, Constants.GOAL_ID).a();
        a10.addOnCompleteListener(new a(this, hVar));
        a10.addOnFailureListener(new b(hVar));
        return hVar.b();
    }

    public final Object b(String[] strArr, ls.d<? super hs.f<? extends ArrayList<RecommendedActivityModel>, ? extends ArrayList<String>>> dVar) {
        h hVar = new h(ca.a.G0(dVar));
        v a10 = FirebaseFirestore.d().b("recommended_activity_data").a();
        a10.addOnCompleteListener(new c(hVar, this, strArr));
        a10.addOnFailureListener(new d(hVar));
        return hVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0115 A[Catch: Exception -> 0x03fe, TryCatch #0 {Exception -> 0x03fe, blocks: (B:3:0x0007, B:4:0x0094, B:6:0x009a, B:9:0x00b2, B:11:0x00be, B:13:0x00ca, B:15:0x00d6, B:18:0x00e4, B:20:0x00f0, B:22:0x0109, B:28:0x0115, B:29:0x011d, B:31:0x0123, B:33:0x0149, B:35:0x0150, B:38:0x015d, B:39:0x0169, B:41:0x0177, B:43:0x0183, B:45:0x0195, B:47:0x019c, B:49:0x01ad, B:50:0x01b9, B:52:0x01bf, B:54:0x01d9, B:57:0x01e6, B:59:0x01ef, B:61:0x01ff, B:65:0x0208, B:66:0x0214, B:68:0x022e, B:71:0x025b, B:74:0x026e, B:76:0x0274, B:78:0x027a, B:80:0x0283, B:82:0x02ab, B:83:0x02ce, B:85:0x02d6, B:101:0x03f8, B:86:0x02fb, B:88:0x0326, B:89:0x0349, B:91:0x0351, B:92:0x0376, B:94:0x037e, B:95:0x03a2, B:97:0x03aa, B:98:0x03cd, B:100:0x03d5), top: B:106:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.f<ArrayList<hs.f<String, ?>>, Integer[]> d(Date displayDate) {
        GoalHelper goalHelper;
        ArrayList<Calendar> arrayList;
        ArrayList<Calendar> arrayList2;
        String str;
        Integer num;
        Object obj;
        boolean z10;
        String str2;
        i.g(displayDate, "displayDate");
        try {
            GoalHelper goalHelper2 = new GoalHelper();
            ArrayList<Calendar> weekOf = goalHelper2.getWeekOf(displayDate.getTime());
            ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
            i.f(userGoals, "getInstance().user.userGoals");
            ArrayList c10 = c(userGoals, displayDate);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            int i6 = 0;
            Integer[] numArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
            Iterator it = c10.iterator();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                Goal goal = (Goal) it.next();
                String str3 = "1";
                if (!i.b(goal.getType(), Constants.GOAL_TYPE_HABIT) && !i.b(goal.getType(), "physical_activity") && !i.b(goal.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY) && !i.b(goal.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY) && !i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                    if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                        Calendar calendar = goalHelper2.getWeekOf(displayDate.getTime()).get(i6);
                        i.f(calendar, "goalHelper.getWeekOf(displayDate.time)[0]");
                        Calendar calendar2 = calendar;
                        ArrayList<GoalDateObj> trackList = goal.getTrackList();
                        if (trackList != null && !trackList.isEmpty()) {
                            z10 = false;
                            if (!z10) {
                                Iterator<GoalDateObj> it2 = goal.getTrackList().iterator();
                                while (it2.hasNext()) {
                                    GoalDateObj next = it2.next();
                                    Iterator<GoalDateObj> it3 = it2;
                                    String str4 = str3;
                                    if (i.b(goalHelper2.getWeekOf(1000 * next.getDate().getTime()).get(0), calendar2) && next.getVal() == 2) {
                                        i11++;
                                        str2 = str4;
                                        break;
                                    }
                                    str3 = str4;
                                    it2 = it3;
                                }
                            }
                            str2 = "0";
                            arrayList4.add(new hs.f(str2, goal));
                            arrayList7.add(goal);
                        }
                        z10 = true;
                        if (!z10) {
                        }
                        str2 = "0";
                        arrayList4.add(new hs.f(str2, goal));
                        arrayList7.add(goal);
                    } else if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        if (!(!goal.getTrackList().isEmpty()) || goal.getTrackList().get(0).getVal() != 2) {
                            obj = "0";
                        } else {
                            i12++;
                            obj = "1";
                        }
                        arrayList5.add(new hs.f(obj, goal));
                        arrayList7.add(goal);
                    }
                    goalHelper = goalHelper2;
                    arrayList = weekOf;
                    goalHelper2 = goalHelper;
                    weekOf = arrayList;
                    i6 = 0;
                }
                String str5 = "";
                HashMap<Date, Integer> trackMap = goal.getTrackMap();
                Iterator<Calendar> it4 = weekOf.iterator();
                while (it4.hasNext()) {
                    Calendar next2 = it4.next();
                    GoalHelper goalHelper3 = goalHelper2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str5);
                    if (trackMap.containsKey(next2.getTime()) && (num = trackMap.get(next2.getTime())) != null) {
                        arrayList2 = weekOf;
                        if (num.intValue() == 2) {
                            if (next2.getTime().getTime() == displayDate.getTime()) {
                                i10++;
                            }
                            str = "1";
                            sb2.append(str);
                            str5 = sb2.toString();
                            goalHelper2 = goalHelper3;
                            weekOf = arrayList2;
                        }
                        str = "0";
                        sb2.append(str);
                        str5 = sb2.toString();
                        goalHelper2 = goalHelper3;
                        weekOf = arrayList2;
                    }
                    arrayList2 = weekOf;
                    str = "0";
                    sb2.append(str);
                    str5 = sb2.toString();
                    goalHelper2 = goalHelper3;
                    weekOf = arrayList2;
                }
                goalHelper = goalHelper2;
                arrayList = weekOf;
                arrayList3.add(new hs.f(str5, goal));
                arrayList7.add(goal);
                goalHelper2 = goalHelper;
                weekOf = arrayList;
                i6 = 0;
            }
            numArr[0] = Integer.valueOf(i10);
            numArr[1] = Integer.valueOf(i11);
            numArr[2] = Integer.valueOf(i12);
            if (!displayDate.before(Utils.INSTANCE.getTodayCalendar().getTime())) {
                numArr[3] = Integer.valueOf(arrayList3.size());
                if (arrayList3.isEmpty()) {
                    if (arrayList4.isEmpty() && arrayList5.isEmpty()) {
                        arrayList6.clear();
                        return new hs.f<>(arrayList6, numArr);
                    }
                    arrayList6.add(new hs.f("D", Integer.valueOf(i10)));
                    arrayList6.add(new hs.f("C", -1));
                    numArr[6] = 0;
                    if (!arrayList4.isEmpty()) {
                        numArr[4] = Integer.valueOf(arrayList4.size());
                        numArr[7] = Integer.valueOf(arrayList6.size());
                        arrayList6.add(new hs.f("W", Integer.valueOf(i11)));
                        arrayList6.addAll(arrayList4);
                    }
                    if (!arrayList5.isEmpty()) {
                        numArr[5] = Integer.valueOf(arrayList5.size());
                        numArr[8] = Integer.valueOf(arrayList6.size());
                        arrayList6.add(new hs.f("O", Integer.valueOf(i12)));
                        arrayList6.addAll(arrayList5);
                    }
                } else {
                    arrayList6.add(new hs.f("D", Integer.valueOf(i10)));
                    arrayList6.addAll(arrayList3);
                    numArr[6] = 0;
                    arrayList6.add(new hs.f("C", -1));
                    if (!arrayList4.isEmpty()) {
                        numArr[4] = Integer.valueOf(arrayList4.size());
                        numArr[7] = Integer.valueOf(arrayList6.size());
                        arrayList6.add(new hs.f("W", Integer.valueOf(i11)));
                        arrayList6.addAll(arrayList4);
                    }
                    if (!arrayList5.isEmpty()) {
                        numArr[5] = Integer.valueOf(arrayList5.size());
                        numArr[8] = Integer.valueOf(arrayList6.size());
                        arrayList6.add(new hs.f("O", Integer.valueOf(i12)));
                        arrayList6.addAll(arrayList5);
                    }
                }
            } else {
                if (!arrayList3.isEmpty()) {
                    numArr[3] = Integer.valueOf(arrayList3.size());
                    numArr[6] = Integer.valueOf(arrayList6.size());
                    arrayList6.add(new hs.f("D", Integer.valueOf(i10)));
                    arrayList6.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    numArr[4] = Integer.valueOf(arrayList4.size());
                    numArr[7] = Integer.valueOf(arrayList6.size());
                    arrayList6.add(new hs.f("W", Integer.valueOf(i11)));
                    arrayList6.addAll(arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    numArr[5] = Integer.valueOf(arrayList5.size());
                    numArr[8] = Integer.valueOf(arrayList6.size());
                    arrayList6.add(new hs.f("O", Integer.valueOf(i12)));
                    arrayList6.addAll(arrayList5);
                }
            }
            return new hs.f<>(arrayList6, numArr);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f13149a, e10);
            return null;
        }
    }
}
