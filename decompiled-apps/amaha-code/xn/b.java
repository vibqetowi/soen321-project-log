package xn;

import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import fd.f;
import hs.k;
import kotlinx.coroutines.d0;
import ls.d;
import ls.h;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: TrackerViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.multiTracker.viewmodels.TrackerViewModel$deleteUserMoodNode$1", f = "TrackerViewModel.kt", l = {R.styleable.AppCompatTheme_colorSwitchThumbNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f37869u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f37870v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f37871w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, d<? super b> dVar) {
        super(2, dVar);
        this.f37870v = aVar;
        this.f37871w = str;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new b(this.f37870v, this.f37871w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f37869u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            vn.b bVar = this.f37870v.f37864y;
            String str2 = this.f37871w;
            this.f37869u = 1;
            bVar.getClass();
            h hVar = new h(ca.a.G0(this));
            try {
                f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null) {
                    str = fVar.j0();
                } else {
                    str = null;
                }
                if (str == null) {
                    hVar.resumeWith(Boolean.FALSE);
                } else if (kotlin.jvm.internal.i.b(str2, "userMoodList")) {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    User user = firebasePersistence.getUser();
                    if (user != null) {
                        user.setUserMoodList(null);
                    }
                    firebasePersistence.updateUserOnFirebase();
                    hVar.resumeWith(Boolean.TRUE);
                } else if (kotlin.jvm.internal.i.b(str2, "userMoodListV1")) {
                    FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                    User user2 = firebasePersistence2.getUser();
                    if (user2 != null) {
                        user2.setUserMoodListV1(null);
                    }
                    firebasePersistence2.updateUserOnFirebase();
                    hVar.resumeWith(Boolean.TRUE);
                } else {
                    hVar.resumeWith(Boolean.FALSE);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bVar.f35290a, e10);
                hVar.resumeWith(Boolean.FALSE);
            }
            if (hVar.b() == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
