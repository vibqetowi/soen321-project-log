package ql;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assetDownloader.DynamicActivityAssetDownloadJobScheduler;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityUploadModel;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import fm.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.o0;
/* compiled from: NewDynamicActivityViewModel.kt */
/* loaded from: classes2.dex */
public final class t extends androidx.lifecycle.b implements ConnectionStatusReceiver.ConnectivityListener {
    public final ArrayList<NewDynamicActivityScreenDataClass> A;
    public boolean B;
    public boolean C;
    public String D;
    public int E;
    public ArrayList<hs.f<String, String>> F;
    public String G;
    public ArrayList<String> H;
    public final HashSet<Integer> I;
    public final hs.i J;
    public boolean K;
    public final androidx.lifecycle.w<Boolean> L;
    public int M;
    public NewDynamicActivityScreenDataClass N;
    public hs.j<String, String, String> O;
    public ArrayList<NewDynamicActivityScreenDataClass> P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public boolean U;
    public final HashMap<hs.f<String, String>, HashMap<String, Object>> V;
    public boolean W;
    public hs.f<String, String> X;
    public final HashMap<hs.f<String, String>, HashMap<String, Object>> Y;
    public NewDynamicActivityUploadModel Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.w<h0> f29779a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f29780b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f29781d0;
    public final hs.i e0;

    /* renamed from: f0  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<List<HashMap<String, Object>>>> f29782f0;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> f29783g0;

    /* renamed from: h0  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> f29784h0;

    /* renamed from: i0  reason: collision with root package name */
    public final c f29785i0;

    /* renamed from: j0  reason: collision with root package name */
    public final androidx.lifecycle.w<ArrayList<hs.f<String, a>>> f29786j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList<StorageTask<UploadTask.TaskSnapshot>> f29787k0;

    /* renamed from: l0  reason: collision with root package name */
    public final kotlinx.coroutines.sync.c f29788l0;

    /* renamed from: y  reason: collision with root package name */
    public final String f29789y;

    /* renamed from: z  reason: collision with root package name */
    public final gd.d f29790z;

    /* compiled from: NewDynamicActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public enum a {
        PENDING,
        COMPLETED,
        FAILED
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$addFirestoreGoalWithFrequency$1$1", f = "NewDynamicActivityViewModel.kt", l = {341, 345, 378}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ Date B;

        /* renamed from: u  reason: collision with root package name */
        public FirestoreGoal f29795u;

        /* renamed from: v  reason: collision with root package name */
        public int f29796v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ hs.j<String, String, String> f29798x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f29799y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f29800z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hs.j<String, String, String> jVar, String str, boolean z10, String str2, Date date, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f29798x = jVar;
            this.f29799y = str;
            this.f29800z = z10;
            this.A = str2;
            this.B = date;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f29798x, this.f29799y, this.f29800z, this.A, this.B, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Object k10;
            t tVar;
            long todayTimeInSeconds;
            Object b10;
            FirestoreGoal firestoreGoal;
            Object b11;
            FirestoreGoal firestoreGoal2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29796v;
            String str = this.f29799y;
            hs.j<String, String, String> jVar = this.f29798x;
            t tVar2 = t.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            firestoreGoal = this.f29795u;
                            sp.b.d0(obj);
                            b10 = obj;
                            tVar = tVar2;
                            ((Boolean) b10).booleanValue();
                            tVar.getClass();
                            ta.v.H(kc.f.H(tVar), null, 0, new z(tVar, firestoreGoal, null), 3);
                            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                            String g5 = defpackage.b.g();
                            String str2 = jVar.f19473u;
                            kotlin.jvm.internal.i.d(str2);
                            firebasePersistence.addUserGamificationPointsToFirebaseWithoutUserUpdate(new GamificationModel(10, Constants.GAMIFICATION_ADD_NEW_GOAL_TASK, g5, Constants.getGoalName(str2)));
                            tVar.f29784h0.i(new SingleUseEvent<>(Boolean.TRUE));
                            return hs.k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    firestoreGoal2 = this.f29795u;
                    sp.b.d0(obj);
                    b11 = obj;
                    ((Boolean) b11).booleanValue();
                    tVar2.f29784h0.i(new SingleUseEvent<>(Boolean.TRUE));
                    ta.v.H(kc.f.H(tVar2), null, 0, new z(tVar2, firestoreGoal2, null), 3);
                    return hs.k.f19476a;
                }
                sp.b.d0(obj);
                k10 = obj;
            } else {
                sp.b.d0(obj);
                j0 f = t.f(tVar2);
                String str3 = jVar.f19473u;
                kotlin.jvm.internal.i.d(str3);
                this.f29796v = 1;
                k10 = f.k(str3, str, this);
                if (k10 == aVar) {
                    return aVar;
                }
            }
            FirestoreGoal firestoreGoal3 = (FirestoreGoal) k10;
            Date date = this.B;
            boolean z10 = this.f29800z;
            if (firestoreGoal3 != null) {
                boolean z11 = !firestoreGoal3.isVisible();
                j0 f2 = t.f(tVar2);
                firestoreGoal3.setVisible(z10);
                firestoreGoal3.setNotificationScheduled(z10);
                firestoreGoal3.setType(this.A);
                if (date != null) {
                    CustomDate customDate = new CustomDate();
                    customDate.setTime(date.getTime());
                    firestoreGoal3.setScheduledDate(customDate);
                }
                this.f29795u = firestoreGoal3;
                this.f29796v = 2;
                b11 = f2.b(firestoreGoal3, str, z11, this);
                if (b11 == aVar) {
                    return aVar;
                }
                firestoreGoal2 = firestoreGoal3;
                ((Boolean) b11).booleanValue();
                tVar2.f29784h0.i(new SingleUseEvent<>(Boolean.TRUE));
                ta.v.H(kc.f.H(tVar2), null, 0, new z(tVar2, firestoreGoal2, null), 3);
                return hs.k.f19476a;
            } else if (z10) {
                String str4 = tVar2.R;
                String str5 = jVar.f19473u;
                kotlin.jvm.internal.i.d(str5);
                String str6 = str5;
                String str7 = tVar2.Q;
                String str8 = jVar.f19474v;
                String str9 = tVar2.S;
                CustomDate customDate2 = new CustomDate();
                Utils utils = Utils.INSTANCE;
                customDate2.setTime(utils.getTodayTimeInSeconds());
                hs.k kVar = hs.k.f19476a;
                CustomDate customDate3 = new CustomDate();
                tVar = tVar2;
                customDate3.setTime(utils.getTodayTimeInSeconds());
                CustomDate customDate4 = new CustomDate();
                if (date != null) {
                    todayTimeInSeconds = date.getTime();
                } else {
                    todayTimeInSeconds = utils.getTodayTimeInSeconds();
                }
                customDate4.setTime(todayTimeInSeconds);
                FirestoreGoal firestoreGoal4 = new FirestoreGoal(str4, str6, str7, str8, str9, customDate2, null, customDate3, customDate4, true, "dynamicV1", this.A, true, null, 64, null);
                this.f29795u = firestoreGoal4;
                this.f29796v = 3;
                b10 = ((j0) tVar.J.getValue()).b(firestoreGoal4, str, true, this);
                if (b10 == aVar) {
                    return aVar;
                }
                firestoreGoal = firestoreGoal4;
                ((Boolean) b10).booleanValue();
                tVar.getClass();
                ta.v.H(kc.f.H(tVar), null, 0, new z(tVar, firestoreGoal, null), 3);
                FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                String g52 = defpackage.b.g();
                String str22 = jVar.f19473u;
                kotlin.jvm.internal.i.d(str22);
                firebasePersistence2.addUserGamificationPointsToFirebaseWithoutUserUpdate(new GamificationModel(10, Constants.GAMIFICATION_ADD_NEW_GOAL_TASK, g52, Constants.getGoalName(str22)));
                tVar.f29784h0.i(new SingleUseEvent<>(Boolean.TRUE));
                return hs.k.f19476a;
            } else {
                tVar2.f29784h0.i(new SingleUseEvent<>(Boolean.TRUE));
                return hs.k.f19476a;
            }
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0004, B:6:0x000a, B:12:0x0018, B:14:0x001e, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:20:0x0039, B:22:0x0040, B:29:0x0057, B:31:0x0066, B:35:0x0084, B:32:0x006f, B:34:0x007c), top: B:39:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: Exception -> 0x0011, TRY_LEAVE, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0004, B:6:0x000a, B:12:0x0018, B:14:0x001e, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:20:0x0039, B:22:0x0040, B:29:0x0057, B:31:0x0066, B:35:0x0084, B:32:0x006f, B:34:0x007c), top: B:39:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0057 A[Catch: Exception -> 0x0011, TRY_ENTER, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0004, B:6:0x000a, B:12:0x0018, B:14:0x001e, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:20:0x0039, B:22:0x0040, B:29:0x0057, B:31:0x0066, B:35:0x0084, B:32:0x006f, B:34:0x007c), top: B:39:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0052 A[SYNTHETIC] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            String string;
            int i6;
            boolean z10;
            ArrayList<hs.f<String, a>> d10;
            Iterator<hs.f<String, a>> it;
            Bundle extras;
            t tVar = t.this;
            if (intent != null) {
                try {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        string = extras2.getString("asset_file_name");
                        i6 = 0;
                        if (intent == null && (extras = intent.getExtras()) != null) {
                            z10 = extras.getBoolean("asset_file_download_status", false);
                        } else {
                            z10 = false;
                        }
                        d10 = tVar.f29786j0.d();
                        if (d10 == null) {
                            d10 = new ArrayList<>();
                        }
                        it = d10.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (kotlin.jvm.internal.i.b(it.next().f19464u, string)) {
                                    break;
                                }
                                i6++;
                            } else {
                                i6 = -1;
                                break;
                            }
                        }
                        a aVar = a.COMPLETED;
                        if (i6 == -1) {
                            hs.f<String, a> fVar = d10.get(i6);
                            kotlin.jvm.internal.i.f(fVar, "currList[currAssetStatusIndex]");
                            String str = fVar.f19464u;
                            if (z10) {
                                d10.set(i6, new hs.f<>(str, aVar));
                            } else {
                                d10.set(i6, new hs.f<>(str, a.FAILED));
                            }
                        } else if (string != null) {
                            d10.add(new hs.f<>(string, aVar));
                        }
                        tVar.f29786j0.i(d10);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(tVar.f29789y, e10);
                    return;
                }
            }
            string = null;
            i6 = 0;
            if (intent == null) {
            }
            z10 = false;
            d10 = tVar.f29786j0.d();
            if (d10 == null) {
            }
            it = d10.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
                i6++;
            }
            a aVar2 = a.COMPLETED;
            if (i6 == -1) {
            }
            tVar.f29786j0.i(d10);
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<em.d> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Application f29802u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Application application) {
            super(0);
            this.f29802u = application;
        }

        @Override // ss.a
        public final em.d invoke() {
            return new em.d(this.f29802u);
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<j0> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f29803u = new e();

        public e() {
            super(0);
        }

        @Override // ss.a
        public final j0 invoke() {
            return new j0();
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$networkDisconnected$1", f = "NewDynamicActivityViewModel.kt", l = {949}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public kotlinx.coroutines.sync.c f29804u;

        /* renamed from: v  reason: collision with root package name */
        public t f29805v;

        /* renamed from: w  reason: collision with root package name */
        public int f29806w;

        public f(ls.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.c cVar;
            t tVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29806w;
            t tVar2 = t.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        tVar = this.f29805v;
                        cVar = this.f29804u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cVar = tVar2.f29788l0;
                    this.f29804u = cVar;
                    this.f29805v = tVar2;
                    this.f29806w = 1;
                    if (cVar.b(this) == aVar) {
                        return aVar;
                    }
                    tVar = tVar2;
                }
                if (true ^ tVar.f29787k0.isEmpty()) {
                    ArrayList<StorageTask<UploadTask.TaskSnapshot>> arrayList = tVar.f29787k0;
                    Iterator<StorageTask<UploadTask.TaskSnapshot>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        StorageTask<UploadTask.TaskSnapshot> next = it.next();
                        if (next != null) {
                            next.cancel();
                        }
                    }
                    arrayList.clear();
                    tVar.f29779a0.i(h0.FAILURE);
                }
                hs.k kVar = hs.k.f19476a;
                cVar.a(null);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar2.f29789y, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class g implements ya.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ss.l f29808a;

        public g(ss.l lVar) {
            this.f29808a = lVar;
        }

        @Override // ya.f
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f29808a.invoke(obj);
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$saveLogDataToFirebase$1", f = "NewDynamicActivityViewModel.kt", l = {204, 213, 217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public String f29809u;

        /* renamed from: v  reason: collision with root package name */
        public String f29810v;

        /* renamed from: w  reason: collision with root package name */
        public int f29811w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ HashMap<String, Object> f29813y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HashMap<String, Object> hashMap, ls.d<? super h> dVar) {
            super(2, dVar);
            this.f29813y = hashMap;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new h(this.f29813y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            String o10;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29811w;
            t tVar = t.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            sp.b.d0(obj);
                            ((Boolean) obj).booleanValue();
                            tVar.f29783g0.i(new SingleUseEvent<>(Boolean.TRUE));
                            return hs.k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sp.b.d0(obj);
                    ((Boolean) obj).booleanValue();
                    tVar.f29783g0.i(new SingleUseEvent<>(Boolean.TRUE));
                    return hs.k.f19476a;
                }
                str2 = this.f29810v;
                str = this.f29809u;
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                hs.j<String, String, String> jVar = tVar.O;
                if (jVar != null) {
                    str = jVar.f19473u;
                } else {
                    str = null;
                }
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null) {
                    str2 = fVar.j0();
                } else {
                    str2 = null;
                }
                if (str != null && str2 != null) {
                    this.f29809u = str;
                    this.f29810v = str2;
                    this.f29811w = 1;
                    ((j0) tVar.J.getValue()).getClass();
                    obj = j0.h(str2, str, this, false);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
            String str4 = str2;
            String str5 = str;
            fe.q qVar = (fe.q) obj;
            if (qVar != null) {
                str3 = qVar.b();
            } else {
                str3 = null;
            }
            if (str3 != null) {
                Integer w02 = gv.m.w0(str3);
                if (w02 != null) {
                    o10 = defpackage.b.o(new Object[]{new Integer(w02.intValue() + 1)}, 1, "%09d", "format(this, *args)");
                } else {
                    o10 = defpackage.b.o(new Object[]{new Integer(0)}, 1, "%09d", "format(this, *args)");
                }
                j0 f = t.f(tVar);
                HashMap<String, Object> hashMap = this.f29813y;
                this.f29809u = null;
                this.f29810v = null;
                this.f29811w = 2;
                obj = f.d(str5, hashMap, str4, o10, this);
                if (obj == aVar) {
                    return aVar;
                }
                ((Boolean) obj).booleanValue();
                tVar.f29783g0.i(new SingleUseEvent<>(Boolean.TRUE));
                return hs.k.f19476a;
            }
            j0 f2 = t.f(tVar);
            HashMap<String, Object> hashMap2 = this.f29813y;
            String o11 = defpackage.b.o(new Object[]{new Integer(0)}, 1, "%09d", "format(this, *args)");
            this.f29809u = null;
            this.f29810v = null;
            this.f29811w = 3;
            obj = f2.d(str5, hashMap2, str4, o11, this);
            if (obj == aVar) {
                return aVar;
            }
            ((Boolean) obj).booleanValue();
            tVar.f29783g0.i(new SingleUseEvent<>(Boolean.TRUE));
            return hs.k.f19476a;
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$setGoalNotification$1", f = "NewDynamicActivityViewModel.kt", l = {435}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f29814u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f29816w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Long f29817x;

        /* compiled from: NewDynamicActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$setGoalNotification$1$1", f = "NewDynamicActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ t f29818u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Goal f29819v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Long f29820w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, Goal goal, Long l2, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f29818u = tVar;
                this.f29819v = goal;
                this.f29820w = l2;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f29818u, this.f29819v, this.f29820w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                String string;
                String string2;
                String str;
                sp.b.d0(obj);
                Utils utils = Utils.INSTANCE;
                t tVar = this.f29818u;
                Context applicationContext = tVar.f2382x.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                Goal goal = this.f29819v;
                boolean notificationScheduled = goal.getNotificationScheduled();
                long longValue = this.f29820w.longValue();
                String type = goal.getType();
                kotlin.jvm.internal.i.d(type);
                String goalId = goal.getGoalId();
                kotlin.jvm.internal.i.d(goalId);
                String goalName = goal.getGoalName();
                kotlin.jvm.internal.i.d(goalName);
                String courseName = goal.getCourseName();
                kotlin.jvm.internal.i.d(courseName);
                hs.f<String, String> fVar = tVar.X;
                if (fVar == null || (string = fVar.f19464u) == null) {
                    string = tVar.f2382x.getApplicationContext().getString(R.string.customGoalNotifiationHeader);
                    kotlin.jvm.internal.i.f(string, "getApplication<Applicati…tomGoalNotifiationHeader)");
                }
                hs.f<String, String> fVar2 = tVar.X;
                if (fVar2 != null && (str = fVar2.f19465v) != null) {
                    string2 = str;
                } else {
                    string2 = tVar.f2382x.getApplicationContext().getString(R.string.customGoalNotifiationBody, goal.getGoalName());
                    kotlin.jvm.internal.i.f(string2, "getApplication<Applicati…ationBody, goal.goalName)");
                }
                utils.updateV3ActivityNotification(applicationContext, notificationScheduled, longValue, type, goalId, goalName, courseName, string, string2);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Goal goal, Long l2, ls.d<? super i> dVar) {
            super(2, dVar);
            this.f29816w = goal;
            this.f29817x = l2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(this.f29816w, this.f29817x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29814u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                a aVar2 = new a(t.this, this.f29816w, this.f29817x, null);
                this.f29814u = 1;
                if (ta.v.S(cVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f29789y = LogHelper.INSTANCE.makeLogTag("NewDynamicActivityViewModel");
        this.f29790z = new gd.d(10);
        this.A = new ArrayList<>();
        this.E = -1;
        this.F = new ArrayList<>();
        this.I = new HashSet<>();
        this.J = sp.b.O(e.f29803u);
        this.K = true;
        this.L = new androidx.lifecycle.w<>(null);
        this.V = new HashMap<>();
        this.Y = new HashMap<>();
        this.f29779a0 = new androidx.lifecycle.w<>(null);
        this.f29781d0 = sp.b.K();
        this.e0 = sp.b.O(new d(application));
        this.f29782f0 = new androidx.lifecycle.w<>();
        this.f29783g0 = new androidx.lifecycle.w<>();
        this.f29784h0 = new androidx.lifecycle.w<>();
        this.f29785i0 = new c();
        this.f29786j0 = new androidx.lifecycle.w<>(new ArrayList());
        this.f29787k0 = new ArrayList<>();
        this.f29788l0 = new kotlinx.coroutines.sync.c(false);
    }

    public static final void e(t tVar, NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass, String str) {
        Object obj;
        String str2;
        String str3;
        boolean z10;
        Object obj2;
        String str4;
        String[] strArr;
        String[] strArr2;
        if (str != null) {
            try {
                if (kotlin.jvm.internal.i.b(str, "n14a")) {
                    ArrayList<hs.f<String, String>> arrayList = new ArrayList<>();
                    HashMap<String, Object> data = newDynamicActivityScreenDataClass.getData();
                    String str5 = null;
                    if (data != null) {
                        obj = data.get("video_url");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        str2 = null;
                    }
                    boolean z11 = false;
                    if (str2 != null && (strArr2 = (String[]) gv.r.a1(str2, new String[]{"/"}, 0, 6).toArray(new String[0])) != null) {
                        str3 = (String) is.k.b2(strArr2);
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && !gv.n.B0(str3)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    Application application = tVar.f2382x;
                    if (!z10 && !new File(application.getApplicationContext().getFilesDir(), str3).exists()) {
                        arrayList.add(new hs.f<>(str2, str3));
                    }
                    HashMap<String, Object> data2 = newDynamicActivityScreenDataClass.getData();
                    if (data2 != null) {
                        obj2 = data2.get("lottie_url");
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof String) {
                        str4 = (String) obj2;
                    } else {
                        str4 = null;
                    }
                    if (str4 != null && (strArr = (String[]) gv.r.a1(str4, new String[]{"/"}, 0, 6).toArray(new String[0])) != null) {
                        str5 = (String) is.k.b2(strArr);
                    }
                    if (!((str5 == null || gv.n.B0(str5)) ? true : true) && !new File(application.getApplicationContext().getFilesDir(), str5).exists()) {
                        arrayList.add(new hs.f<>(str4, str5));
                    }
                    tVar.v(arrayList);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f29789y, e10);
            }
        }
    }

    public static final j0 f(t tVar) {
        return (j0) tVar.J.getValue();
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        MyApplication myApplication;
        Context applicationContext = this.f2382x.getApplicationContext();
        if (applicationContext instanceof MyApplication) {
            myApplication = (MyApplication) applicationContext;
        } else {
            myApplication = null;
        }
        if (myApplication != null) {
            myApplication.i(this);
        }
    }

    public final void g(List<NewDynamicActivityScreenDataClass> list) {
        ArrayList<NewDynamicActivityScreenDataClass> arrayList = this.A;
        arrayList.clear();
        arrayList.addAll(list);
        this.E = list.size();
    }

    public final void h(String type, Date date, boolean z10) {
        String str;
        kotlin.jvm.internal.i.g(type, "type");
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str = fVar.j0();
        } else {
            str = null;
        }
        if (str != null && is.k.Q1(type, new String[]{Constants.GOAL_TYPE_ACTIVITY_DAILY, Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE})) {
            hs.j<String, String, String> jVar = this.O;
            if (jVar != null && jVar.f19473u != null) {
                ta.v.H(kc.f.H(this), null, 0, new b(jVar, str, z10, type, date, null), 3);
                return;
            }
            return;
        }
        this.f29784h0.i(new SingleUseEvent<>(Boolean.FALSE));
    }

    public final void i(String type, Date date, boolean z10) {
        hs.j<String, String, String> jVar;
        String str;
        Goal goal;
        ArrayList<Goal> userGoals;
        ArrayList<Goal> userGoals2;
        Object obj;
        kotlin.jvm.internal.i.g(type, "type");
        if (is.k.Q1(type, new String[]{Constants.GOAL_TYPE_ACTIVITY_DAILY, Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && (jVar = this.O) != null && (str = jVar.f19473u) != null) {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = firebasePersistence.getUser();
            Long l2 = null;
            if (user != null && (userGoals2 = user.getUserGoals()) != null) {
                Iterator<T> it = userGoals2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.i.b(((Goal) obj).getGoalId(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                goal = (Goal) obj;
            } else {
                goal = null;
            }
            if (goal != null) {
                goal.setVisible(z10);
                goal.setNotificationScheduled(z10);
                goal.setType(type);
                if (date != null) {
                    goal.setmScheduleDate(date);
                }
                if (date != null) {
                    l2 = Long.valueOf(date.getTime());
                }
                u(goal, l2);
                firebasePersistence.updateUserOnFirebase();
            } else if (z10) {
                User user2 = firebasePersistence.getUser();
                if (user2 != null && (userGoals = user2.getUserGoals()) != null) {
                    String str2 = str;
                    Goal goal2 = new Goal(this.R, str2);
                    goal2.setCourseName(this.Q);
                    goal2.setGoalName(jVar.f19474v);
                    goal2.setVisible(true);
                    goal2.setType(type);
                    goal2.setSource(this.S);
                    goal2.setDynamicVariant("dynamicV1");
                    goal2.setNotificationScheduled(true);
                    if (date != null) {
                        goal2.setmScheduleDate(date);
                    }
                    GamificationModel gamificationModel = new GamificationModel(10, Constants.GAMIFICATION_ADD_NEW_GOAL_TASK, defpackage.b.g(), Constants.getGoalName(str2));
                    goal2.getGoalgamificationList().add(gamificationModel);
                    firebasePersistence.addUserGamificationPointsToFirebaseWithoutUserUpdate(gamificationModel);
                    if (date != null) {
                        l2 = Long.valueOf(date.getTime());
                    }
                    u(goal2, l2);
                    userGoals.add(goal2);
                }
                firebasePersistence.updateUserOnFirebase();
            }
        }
    }

    public final void j(String str) {
        if (str == null) {
            return;
        }
        try {
            int intValue = ApplicationPersistence.getInstance().getIntValue("daec_".concat(str)) + 1;
            if (intValue > 2) {
                this.f2382x.getApplicationContext().deleteFile(str);
                ApplicationPersistence.getInstance().deleteKey("daec_".concat(str));
            } else {
                ApplicationPersistence.getInstance().setIntValue("daec_".concat(str), intValue);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29789y, e10);
        }
    }

    public final Object k(int i6, String screenSlug, String str) {
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass;
        HashMap<String, Object> data;
        kotlin.jvm.internal.i.g(screenSlug, "screenSlug");
        ArrayList<NewDynamicActivityScreenDataClass> arrayList = this.P;
        if (arrayList == null || (newDynamicActivityScreenDataClass = (NewDynamicActivityScreenDataClass) is.u.j2(i6, arrayList)) == null) {
            return null;
        }
        if (!kotlin.jvm.internal.i.b(newDynamicActivityScreenDataClass.getSlug(), screenSlug)) {
            newDynamicActivityScreenDataClass = null;
        }
        if (newDynamicActivityScreenDataClass == null || (data = newDynamicActivityScreenDataClass.getData()) == null) {
            return null;
        }
        return data.get(str);
    }

    public final Object l(String str, String str2) {
        Object obj;
        HashMap<String, Object> data;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList = this.P;
        if (arrayList == null) {
            return null;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.i.b(((NewDynamicActivityScreenDataClass) obj).getScreenId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass = (NewDynamicActivityScreenDataClass) obj;
        if (newDynamicActivityScreenDataClass == null || (data = newDynamicActivityScreenDataClass.getData()) == null) {
            return null;
        }
        return data.get(str2);
    }

    public final HashMap m(Integer num, String str) {
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        ArrayList<NewDynamicActivityScreenDataClass> arrayList = this.P;
        if (arrayList == null || (newDynamicActivityScreenDataClass = (NewDynamicActivityScreenDataClass) is.u.j2(intValue, arrayList)) == null) {
            return null;
        }
        if (!kotlin.jvm.internal.i.b(newDynamicActivityScreenDataClass.getSlug(), str)) {
            newDynamicActivityScreenDataClass = null;
        }
        if (newDynamicActivityScreenDataClass == null) {
            return null;
        }
        return newDynamicActivityScreenDataClass.getData();
    }

    public final HashMap<String, Object> n(String str, String str2) {
        if (str != null && str2 != null) {
            return this.V.get(new hs.f(str, str2));
        }
        return null;
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkConnected() {
        this.c0 = true;
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkDisconnected() {
        try {
            this.c0 = false;
            ta.v.H(kc.f.H(this), o0.f23640a, 0, new f(null), 2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29789y, e10);
        }
    }

    public final Object o(String str, String str2, String str3) {
        HashMap<String, Object> hashMap;
        if (str == null || str2 == null || str3 == null || (hashMap = this.Y.get(new hs.f(str, str2))) == null) {
            return null;
        }
        return hashMap.get(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<?> p() {
        Object obj;
        ArrayList<Goal> userGoals;
        Object obj2;
        HashMap<String, Object> data;
        String str;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (userGoals = user.getUserGoals()) != null) {
            Iterator<T> it = userGoals.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    String goalId = ((Goal) obj2).getGoalId();
                    hs.j<String, String, String> jVar = this.O;
                    if (jVar != null) {
                        str = jVar.f19473u;
                    } else {
                        str = null;
                    }
                    if (kotlin.jvm.internal.i.b(goalId, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Goal goal = (Goal) obj2;
            if (goal != null && (data = goal.getData()) != null) {
                obj = data.get("result");
                if (obj instanceof ArrayList) {
                    return null;
                }
                return (ArrayList) obj;
            }
        }
        obj = null;
        if (obj instanceof ArrayList) {
        }
    }

    public final void q() {
        boolean z10 = this.c0;
        androidx.lifecycle.w<h0> wVar = this.f29779a0;
        if (!z10) {
            wVar.i(h0.NO_INTERNET);
            return;
        }
        NewDynamicActivityUploadModel newDynamicActivityUploadModel = this.Z;
        if (newDynamicActivityUploadModel != null) {
            boolean b10 = kotlin.jvm.internal.i.b(newDynamicActivityUploadModel.getScreenSlug(), "n12c");
            h0 h0Var = h0.SUCCESS;
            if (b10) {
                wVar.i(h0.IN_PROGRESS);
                if (newDynamicActivityUploadModel.getBitmapList().isEmpty()) {
                    wVar.i(h0Var);
                    return;
                } else {
                    ta.v.H(kc.f.H(this), null, 0, new y(newDynamicActivityUploadModel, this, null), 3);
                    return;
                }
            }
            wVar.i(h0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(boolean z10) {
        Goal goal;
        Object obj;
        ArrayList arrayList;
        hs.j<String, String, String> jVar;
        String str;
        ArrayList<Goal> userGoals;
        ArrayList<Goal> userGoals2;
        Object obj2;
        ArrayList<Goal> userGoals3;
        Object obj3;
        HashMap<String, Object> data;
        String str2;
        String str3;
        Object obj4;
        ArrayList arrayList2;
        N12AItemListModel n12AItemListModel;
        Object obj5;
        Object obj6;
        ArrayList arrayList3;
        Object obj7;
        String str4;
        Object obj8;
        ArrayList arrayList4;
        N12AItemListModel n12AItemListModel2;
        Object obj9;
        ArrayList arrayList5;
        HashMap hashMap;
        pl.f fVar;
        Object obj10;
        this.U = true;
        if (this.F.isEmpty()) {
            return;
        }
        ArrayList<hs.f<String, String>> arrayList6 = this.F;
        ArrayList arrayList7 = new ArrayList(is.i.H1(arrayList6, 10));
        Iterator<hs.f<String, String>> it = arrayList6.iterator();
        while (it.hasNext()) {
            hs.f<String, String> next = it.next();
            String str5 = next.f19464u;
            String str6 = next.f19465v;
            arrayList7.add(new hs.j(str5, str6, n(str5, str6)));
        }
        this.f29790z.getClass();
        HashMap hashMap2 = new HashMap();
        Iterator it2 = arrayList7.iterator();
        while (true) {
            goal = null;
            Long l2 = null;
            ArrayList<N12AItemListModel> arrayList8 = null;
            String str7 = null;
            String str8 = null;
            ArrayList<N12AItemListModel> arrayList9 = null;
            obj2 = null;
            goal = null;
            if (!it2.hasNext()) {
                break;
            }
            hs.j jVar2 = (hs.j) it2.next();
            String str9 = (String) jVar2.f19473u;
            if (str9 != null) {
                Locale locale = Locale.ENGLISH;
                str3 = ri.e.e(locale, "ENGLISH", str9, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str3 = null;
            }
            boolean Q1 = is.k.Q1(str3, new String[]{"n12a"});
            C c10 = jVar2.f19475w;
            B b10 = jVar2.f19474v;
            if (Q1) {
                HashMap hashMap3 = (HashMap) c10;
                if (hashMap3 != null) {
                    obj4 = hashMap3.get("n12a_list_" + ((String) b10));
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof ArrayList) {
                    arrayList2 = (ArrayList) obj4;
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj11 : arrayList2) {
                        if (obj11 instanceof N12AItemListModel) {
                            n12AItemListModel = (N12AItemListModel) obj11;
                        } else {
                            n12AItemListModel = null;
                        }
                        if (n12AItemListModel != null) {
                            arrayList10.add(n12AItemListModel);
                        }
                    }
                    if (!arrayList10.isEmpty()) {
                        arrayList9 = arrayList10;
                    }
                    if (arrayList9 != null) {
                        String str10 = "n12a_list_" + ((String) b10);
                        ArrayList arrayList11 = new ArrayList(is.i.H1(arrayList9, 10));
                        for (N12AItemListModel n12AItemListModel3 : arrayList9) {
                            arrayList11.add(n12AItemListModel3.getId());
                        }
                        hashMap2.put(str10, arrayList11);
                        hashMap2.put("date", Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                    }
                }
            } else if (is.k.Q1(str3, new String[]{"n4a"})) {
                HashMap hashMap4 = (HashMap) c10;
                if (hashMap4 != null) {
                    obj5 = hashMap4.get("n4_data_" + ((String) b10));
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof String) {
                    str8 = (String) obj5;
                }
                if (str8 != null) {
                    hashMap2.put("n4_data_" + ((String) b10), str8);
                }
            } else if (is.k.Q1(str3, new String[]{"n5a"})) {
                HashMap hashMap5 = (HashMap) c10;
                if (hashMap5 != null) {
                    obj6 = hashMap5.get("n5_list_" + ((String) b10));
                } else {
                    obj6 = null;
                }
                if (obj6 instanceof ArrayList) {
                    arrayList3 = (ArrayList) obj6;
                } else {
                    arrayList3 = null;
                }
                if (arrayList3 != null) {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj12 : arrayList3) {
                        if (obj12 instanceof String) {
                            str4 = (String) obj12;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            arrayList12.add(str4);
                        }
                    }
                    hashMap2.put("n5_list_" + ((String) b10), arrayList12);
                }
                if (hashMap5 != null) {
                    obj7 = hashMap5.get("n5_data_" + ((String) b10));
                } else {
                    obj7 = null;
                }
                if (obj7 instanceof String) {
                    str7 = (String) obj7;
                }
                if (str7 != null) {
                    hashMap2.put("n5_data_" + ((String) b10), str7);
                }
            } else if (is.k.Q1(str3, new String[]{"n6a"})) {
                HashMap hashMap6 = (HashMap) c10;
                if (hashMap6 != null) {
                    obj8 = hashMap6.get("n6a_list_" + ((String) b10));
                } else {
                    obj8 = null;
                }
                if (obj8 instanceof ArrayList) {
                    arrayList4 = (ArrayList) obj8;
                } else {
                    arrayList4 = null;
                }
                if (arrayList4 != null) {
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj13 : arrayList4) {
                        if (obj13 instanceof N12AItemListModel) {
                            n12AItemListModel2 = (N12AItemListModel) obj13;
                        } else {
                            n12AItemListModel2 = null;
                        }
                        if (n12AItemListModel2 != null) {
                            arrayList13.add(n12AItemListModel2);
                        }
                    }
                    if (!arrayList13.isEmpty()) {
                        arrayList8 = arrayList13;
                    }
                    if (arrayList8 != null) {
                        String str11 = "n6a_list_" + ((String) b10);
                        ArrayList arrayList14 = new ArrayList(is.i.H1(arrayList8, 10));
                        for (N12AItemListModel n12AItemListModel4 : arrayList8) {
                            arrayList14.add(n12AItemListModel4.getId());
                        }
                        hashMap2.put(str11, arrayList14);
                    }
                }
            } else if (is.k.Q1(str3, new String[]{"n12c"})) {
                HashMap hashMap7 = (HashMap) c10;
                if (hashMap7 != null) {
                    obj9 = hashMap7.get("n12c_list_" + ((String) b10));
                } else {
                    obj9 = null;
                }
                if (obj9 instanceof ArrayList) {
                    arrayList5 = (ArrayList) obj9;
                } else {
                    arrayList5 = null;
                }
                if (arrayList5 != null) {
                    ArrayList<pl.f> arrayList15 = new ArrayList();
                    for (Object obj14 : arrayList5) {
                        if (obj14 instanceof pl.f) {
                            fVar = (pl.f) obj14;
                        } else {
                            fVar = null;
                        }
                        if (fVar != null) {
                            arrayList15.add(fVar);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        arrayList15 = null;
                    }
                    if (arrayList15 != null) {
                        String str12 = "n12c_list_" + ((String) b10);
                        ArrayList arrayList16 = new ArrayList();
                        for (pl.f fVar2 : arrayList15) {
                            String str13 = fVar2.f28590c;
                            if (str13 != null) {
                                String str14 = fVar2.f28589b;
                                if (str14 == null) {
                                    str14 = "";
                                }
                                hashMap = new HashMap();
                                hashMap.put("imageLink", str14);
                                hashMap.put("text", str13);
                            } else {
                                hashMap = null;
                            }
                            if (hashMap != null) {
                                arrayList16.add(hashMap);
                            }
                        }
                        hashMap2.put(str12, arrayList16);
                    }
                }
            } else if (kotlin.jvm.internal.i.b(str3, "global_data")) {
                HashMap hashMap8 = (HashMap) c10;
                if (hashMap8 != null) {
                    obj10 = hashMap8.get("date");
                } else {
                    obj10 = null;
                }
                if (obj10 instanceof Long) {
                    l2 = (Long) obj10;
                }
                if (l2 != null) {
                    hashMap2.put("date", Long.valueOf(l2.longValue()));
                }
            }
        }
        Set keySet = hashMap2.keySet();
        kotlin.jvm.internal.i.f(keySet, "mapToSave.keys");
        if (true ^ keySet.isEmpty()) {
            if (z10) {
                ta.v.H(kc.f.H(this), null, 0, new h(hashMap2, null), 3);
                return;
            }
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (userGoals3 = user.getUserGoals()) != null) {
                Iterator<T> it3 = userGoals3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        String goalId = ((Goal) obj3).getGoalId();
                        hs.j<String, String, String> jVar3 = this.O;
                        if (jVar3 != null) {
                            str2 = jVar3.f19473u;
                        } else {
                            str2 = null;
                        }
                        if (kotlin.jvm.internal.i.b(goalId, str2)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                Goal goal2 = (Goal) obj3;
                if (goal2 != null && (data = goal2.getData()) != null) {
                    obj = data.get("result");
                    if (!(obj instanceof ArrayList)) {
                        arrayList = (ArrayList) obj;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hashMap2);
                    jVar = this.O;
                    if (jVar == null && (str = jVar.f19473u) != null) {
                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                        User user2 = firebasePersistence.getUser();
                        if (user2 != null && (userGoals2 = user2.getUserGoals()) != null) {
                            Iterator<T> it4 = userGoals2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                Object next2 = it4.next();
                                if (kotlin.jvm.internal.i.b(((Goal) next2).getGoalId(), str)) {
                                    obj2 = next2;
                                    break;
                                }
                            }
                            goal = (Goal) obj2;
                        }
                        if (goal != null) {
                            goal.getData().put("result", arrayList);
                        } else {
                            User user3 = firebasePersistence.getUser();
                            if (user3 != null && (userGoals = user3.getUserGoals()) != null) {
                                Goal goal3 = new Goal(this.R, str);
                                goal3.setCourseName(this.Q);
                                goal3.setGoalName(jVar.f19474v);
                                goal3.setVisible(false);
                                goal3.getData().put("result", arrayList);
                                goal3.setType(jVar.f19475w);
                                goal3.setSource(this.S);
                                goal3.setDynamicVariant("dynamicV1");
                                userGoals.add(goal3);
                            }
                        }
                        firebasePersistence.updateUserOnFirebase();
                        this.B = false;
                        return;
                    }
                }
            }
            obj = null;
            if (!(obj instanceof ArrayList)) {
            }
            if (arrayList == null) {
            }
            arrayList.add(hashMap2);
            jVar = this.O;
            if (jVar == null) {
            }
        }
    }

    public final void s(String str, String str2, HashMap<String, Object> hashMap) {
        if (str != null && str2 != null) {
            HashMap<hs.f<String, String>, HashMap<String, Object>> hashMap2 = this.Y;
            hs.f<String, String> fVar = new hs.f<>(str, str2);
            HashMap<String, Object> hashMap3 = new HashMap<>();
            hashMap3.putAll(hashMap);
            hashMap2.put(fVar, hashMap3);
        }
    }

    public final void t(String str, String str2, HashMap<String, Object> hashMap) {
        if (str != null && str2 != null) {
            HashMap<hs.f<String, String>, HashMap<String, Object>> hashMap2 = this.V;
            hs.f<String, String> fVar = new hs.f<>(str, str2);
            HashMap<String, Object> hashMap3 = new HashMap<>();
            hashMap3.putAll(hashMap);
            hashMap2.put(fVar, hashMap3);
        }
    }

    public final void u(Goal goal, Long l2) {
        if (goal.getType() != null && goal.getGoalId() != null && goal.getGoalName() != null && goal.getCourseName() != null && l2 != null) {
            ta.v.H(kc.f.H(this), null, 0, new i(goal, l2, null), 3);
        }
    }

    public final void v(ArrayList<hs.f<String, String>> arrayList) {
        Application application = this.f2382x;
        try {
            JobInfo.Builder builder = new JobInfo.Builder(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID, new ComponentName(application.getApplicationContext(), DynamicActivityAssetDownloadJobScheduler.class.getName()));
            builder.setRequiredNetworkType(1);
            builder.setRequiresCharging(false);
            PersistableBundle persistableBundle = new PersistableBundle();
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((hs.f) it.next()).f19464u);
            }
            persistableBundle.putStringArray("asset_list", (String[]) arrayList2.toArray(new String[0]));
            builder.setExtras(persistableBundle);
            Object systemService = application.getApplicationContext().getSystemService("jobscheduler");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).schedule(builder.build());
            n1.a.a(application.getApplicationContext()).b(this.f29785i0, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
            androidx.lifecycle.w<ArrayList<hs.f<String, a>>> wVar = this.f29786j0;
            ArrayList<hs.f<String, a>> d10 = wVar.d();
            if (d10 == null) {
                d10 = new ArrayList<>();
            }
            ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new hs.f(((hs.f) it2.next()).f19465v, a.PENDING));
            }
            d10.addAll(arrayList3);
            wVar.i(d10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29789y, e10);
        }
    }
}
