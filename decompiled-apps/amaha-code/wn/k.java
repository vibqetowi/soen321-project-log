package wn;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import kotlinx.coroutines.d0;
import ta.v;
/* compiled from: MultiTrackerMigrationViewModel.kt */
/* loaded from: classes2.dex */
public final class k extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final String f36803x = LogHelper.INSTANCE.makeLogTag("MultiTrackerMigrationVM");

    /* renamed from: y  reason: collision with root package name */
    public final w<Boolean> f36804y = new w<>();

    /* compiled from: MultiTrackerMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerMigrationViewModel$checkAndInitMoodTrackerMigration$2", f = "MultiTrackerMigrationViewModel.kt", l = {R.styleable.AppCompatTheme_editTextBackground, R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36805u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f36806v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k f36807w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, k kVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f36806v = z10;
            this.f36807w = kVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f36806v, this.f36807w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:6:0x0013, B:23:0x007c, B:25:0x0084, B:27:0x0093, B:29:0x0099, B:31:0x00a4, B:35:0x00ae, B:38:0x00cd, B:40:0x00d2, B:41:0x00db, B:34:0x00ab, B:42:0x00e1, B:10:0x001f, B:18:0x004e, B:20:0x0056, B:45:0x00fb, B:15:0x002a), top: B:50:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:6:0x0013, B:23:0x007c, B:25:0x0084, B:27:0x0093, B:29:0x0099, B:31:0x00a4, B:35:0x00ae, B:38:0x00cd, B:40:0x00d2, B:41:0x00db, B:34:0x00ab, B:42:0x00e1, B:10:0x001f, B:18:0x004e, B:20:0x0056, B:45:0x00fb, B:15:0x002a), top: B:50:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:6:0x0013, B:23:0x007c, B:25:0x0084, B:27:0x0093, B:29:0x0099, B:31:0x00a4, B:35:0x00ae, B:38:0x00cd, B:40:0x00d2, B:41:0x00db, B:34:0x00ab, B:42:0x00e1, B:10:0x001f, B:18:0x004e, B:20:0x0056, B:45:0x00fb, B:15:0x002a), top: B:50:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[Catch: Exception -> 0x00f9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f9, blocks: (B:6:0x0013, B:23:0x007c, B:25:0x0084, B:27:0x0093, B:29:0x0099, B:31:0x00a4, B:35:0x00ae, B:38:0x00cd, B:40:0x00d2, B:41:0x00db, B:34:0x00ab, B:42:0x00e1, B:10:0x001f, B:18:0x004e, B:20:0x0056, B:45:0x00fb, B:15:0x002a), top: B:50:0x000d }] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Integer num;
            ArrayList<MultiTrackerModel> userMoodListV3;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36805u;
            boolean z11 = false;
            boolean z12 = this.f36806v;
            k kVar = this.f36807w;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f36803x, e10);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            gk.a.b(null, "moodtracker_migrate_stats_success");
                            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                            User user = firebasePersistence.getUser();
                            if (user != null && (userMoodListV3 = user.getUserMoodListV3()) != null) {
                                num = new Integer(userMoodListV3.size());
                            } else {
                                num = null;
                            }
                            User user2 = firebasePersistence.getUser();
                            if (user2 != null) {
                                user2.setUserMoodListV3(null);
                            }
                            firebasePersistence.updateUserOnFirebase();
                            b bVar = b.f36765a;
                            j jVar = j.COMPLETED;
                            bVar.getClass();
                            b.f36769e = jVar;
                            kVar.f36804y.i(Boolean.TRUE);
                            Bundle bundle = new Bundle();
                            if (z12) {
                                z11 = true;
                            }
                            bundle.putBoolean("skipToStatMigration", z11);
                            if (num != null) {
                                bundle.putInt("moodListSize", num.intValue());
                            }
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle, "moodtracker_migrate_fullprocess_success");
                        } else {
                            gk.a.b(null, "moodtracker_migrate_stats_failure");
                            b bVar2 = b.f36765a;
                            j jVar2 = j.STAT_WRITE_FAILED;
                            bVar2.getClass();
                            b.f36769e = jVar2;
                            ApplicationPersistence.getInstance().setBooleanValue("skip_to_stat_write", true);
                        }
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                if (z12) {
                    z10 = true;
                    if (!z10) {
                        gk.a.b(null, "moodtracker_migrate_stats_start");
                        this.f36805u = 2;
                        kVar.getClass();
                        ls.h hVar = new ls.h(ca.a.G0(this));
                        v.H(kc.f.H(kVar), null, 0, new m(kVar, hVar, null), 3);
                        obj = hVar.b();
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return hs.k.f19476a;
                    }
                    b bVar3 = b.f36765a;
                    j jVar3 = j.COLLECTION_WRITE_FAILED;
                    bVar3.getClass();
                    b.f36769e = jVar3;
                    return hs.k.f19476a;
                }
                this.f36805u = 1;
                kVar.getClass();
                kotlinx.coroutines.k kVar3 = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar3.u();
                v.H(kc.f.H(kVar), null, 0, new l(kVar, kVar3, null), 3);
                obj = kVar3.s();
                if (obj == aVar) {
                    return aVar;
                }
            }
            z10 = ((Boolean) obj).booleanValue();
            if (!z10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:2:0x0000, B:4:0x000b, B:8:0x0015, B:14:0x0021, B:16:0x0032, B:19:0x0046, B:23:0x004e, B:25:0x0068, B:27:0x006e, B:28:0x0077), top: B:33:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:2:0x0000, B:4:0x000b, B:8:0x0015, B:14:0x0021, B:16:0x0032, B:19:0x0046, B:23:0x004e, B:25:0x0068, B:27:0x006e, B:28:0x0077), top: B:33:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        ArrayList<MultiTrackerModel> arrayList;
        boolean z10;
        ArrayList<MultiTrackerModel> userMoodListV3;
        try {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                arrayList = user.getUserMoodListV3();
            } else {
                arrayList = null;
            }
            boolean z11 = true;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = false;
                if (!z10) {
                    b bVar = b.f36765a;
                    j jVar = j.COMPLETED;
                    bVar.getClass();
                    b.f36769e = jVar;
                    this.f36804y.i(Boolean.TRUE);
                    return;
                }
                j jVar2 = j.IN_PROGRESS;
                j[] jVarArr = {jVar2};
                b.f36765a.getClass();
                if (is.k.Q1(b.f36769e, jVarArr)) {
                    return;
                }
                if (b.f36769e != j.STAT_WRITE_FAILED) {
                    z11 = false;
                }
                b.f36769e = jVar2;
                String str = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putBoolean("skipToStatMigration", z11);
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null && (userMoodListV3 = user2.getUserMoodListV3()) != null) {
                    bundle.putInt("moodListSize", userMoodListV3.size());
                }
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "moodtracker_migrate_fullprocess_start");
                v.H(kc.f.H(this), null, 0, new a(z11, this, null), 3);
                return;
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36803x, e10);
        }
    }
}
