package ml;

import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.HashMap;
import java.util.Set;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchAndUpdateB2BExperimentOverrideValues$1", f = "V3DashboardViewModel.kt", l = {1401}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25449u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f25450v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c0 c0Var, ls.d<? super f0> dVar) {
        super(2, dVar);
        this.f25450v = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f0(this.f25450v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Set keySet;
        Object obj2;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25449u;
        c0 c0Var = this.f25450v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            u uVar = c0Var.f25368y;
            this.f25449u = 1;
            uVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            ((or.k) nr.b.a(or.k.class)).b("https://api.theinnerhour.com/v1/org/org-offering").I(new r(hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        hs.f fVar = (hs.f) obj;
        if (((Boolean) fVar.f19464u).booleanValue()) {
            B b10 = fVar.f19465v;
            if (b10 != 0) {
                HashMap hashMap = (HashMap) b10;
                kotlin.jvm.internal.i.f(hashMap.keySet(), "it.second!!.keys");
                if (!keySet.isEmpty()) {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    Set<String> keySet2 = hashMap.keySet();
                    kotlin.jvm.internal.i.f(keySet2, "it.second!!.keys");
                    boolean z10 = false;
                    for (String str : keySet2) {
                        User user = firebasePersistence.getUser();
                        String str2 = null;
                        if (user != null && (appConfig2 = user.getAppConfig()) != null) {
                            obj2 = appConfig2.get(str);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof String) {
                            str2 = (String) obj2;
                        }
                        if (str2 == null || (kotlin.jvm.internal.i.b(str2, "default") && !kotlin.jvm.internal.i.b(hashMap.get(str), "default"))) {
                            User user2 = firebasePersistence.getUser();
                            if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                                appConfig.put(str, hashMap.get(str));
                            }
                            z10 = true;
                        }
                    }
                    if (z10) {
                        firebasePersistence.updateUserOnFirebase();
                        c0Var.D.i(new SingleUseEvent<>(Boolean.TRUE));
                    }
                }
            }
            ApplicationPersistence.getInstance().setBooleanValue("b2b_experiment_check", true);
        }
        return hs.k.f19476a;
    }
}
