package zl;

import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$getRegionIfCentresPresent$2", f = "ExpertCareViewModel.kt", l = {137}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39588u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f39589v;

    /* compiled from: ExpertCareViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$getRegionIfCentresPresent$2$1", f = "ExpertCareViewModel.kt", l = {138, 140}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39590u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ v f39591v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f39591v = vVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f39591v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39590u;
            v vVar = this.f39591v;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        str = (String) obj;
                        vVar.B.i(str);
                        if (str == null) {
                            ApplicationPersistence.getInstance().setStringValue(Constants.OFFLINE_CENTERS_IN_CURRENT_LOCATION, str);
                        } else {
                            ApplicationPersistence.getInstance().deleteKey(Constants.OFFLINE_CENTERS_IN_CURRENT_LOCATION);
                        }
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                yl.b bVar = vVar.f39602x;
                this.f39590u = 1;
                bVar.getClass();
                obj = yl.b.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                yl.b bVar2 = vVar.f39602x;
                this.f39590u = 2;
                bVar2.getClass();
                obj = yl.b.a(str2, this);
                if (obj == aVar) {
                    return aVar;
                }
                str = (String) obj;
                vVar.B.i(str);
                if (str == null) {
                }
                return hs.k.f19476a;
            }
            vVar.B.i(null);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, ls.d<? super s> dVar) {
        super(2, dVar);
        this.f39589v = vVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new s(this.f39589v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((s) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39588u;
        v vVar = this.f39589v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                a aVar2 = new a(vVar, null);
                this.f39588u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(vVar.D, e10);
        }
        return hs.k.f19476a;
    }
}
