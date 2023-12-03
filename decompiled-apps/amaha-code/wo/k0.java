package wo;

import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.network.model.UpcomingSessionsModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
import kotlinx.coroutines.o0;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchPastSessions$1", f = "ExperimentProfileActivityViewModel.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36942u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n0 f36943v;

    /* compiled from: ExperimentProfileActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchPastSessions$1$1", f = "ExperimentProfileActivityViewModel.kt", l = {211}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public androidx.lifecycle.w f36944u;

        /* renamed from: v  reason: collision with root package name */
        public n0 f36945v;

        /* renamed from: w  reason: collision with root package name */
        public int f36946w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n0 f36947x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f36947x = n0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f36947x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.w<Integer[]> wVar;
            n0 n0Var;
            List<UpcomingBooking> bookings;
            int i6;
            int i10;
            int i11;
            UpcomingBooking upcomingBooking;
            Integer[] numArr;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i12 = this.f36946w;
            if (i12 != 0) {
                if (i12 == 1) {
                    n0Var = this.f36945v;
                    wVar = this.f36944u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                n0 n0Var2 = this.f36947x;
                wVar = n0Var2.L;
                this.f36944u = wVar;
                this.f36945v = n0Var2;
                this.f36946w = 1;
                e0 e0Var = n0Var2.f36970y;
                e0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.i) nr.b.a(or.i.class)).b("https://api.theinnerhour.com/v1/customer/completedsessions").I(new c0(e0Var, hVar));
                Object b10 = hVar.b();
                if (b10 == aVar) {
                    return aVar;
                }
                n0Var = n0Var2;
                obj = b10;
            }
            UpcomingSessionsModel upcomingSessionsModel = (UpcomingSessionsModel) obj;
            n0Var.getClass();
            if (upcomingSessionsModel != null) {
                try {
                    bookings = upcomingSessionsModel.getBookings();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(n0Var.f36971z, e10);
                    numArr = new Integer[0];
                }
                if (bookings != null) {
                    i6 = 0;
                    i10 = 0;
                    i11 = 0;
                    for (UpcomingBooking upcomingBooking2 : bookings) {
                        if (!(!kotlin.jvm.internal.i.b(upcomingBooking2.getStatus(), "completed"))) {
                            upcomingBooking = upcomingBooking2;
                        } else {
                            upcomingBooking = null;
                        }
                        if (upcomingBooking != null) {
                            if (upcomingBooking2.getPsychiatristId() != null) {
                                i11++;
                            } else if (upcomingBooking2.getTherapistId() != null) {
                                if (kotlin.jvm.internal.i.b(upcomingBooking2.getBookingtype(), "couple")) {
                                    i10++;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                    numArr = new Integer[]{Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11)};
                    wVar.i(numArr);
                    return hs.k.f19476a;
                }
            }
            i6 = 0;
            i10 = 0;
            i11 = 0;
            numArr = new Integer[]{Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11)};
            wVar.i(numArr);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, ls.d<? super k0> dVar) {
        super(2, dVar);
        this.f36943v = n0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new k0(this.f36943v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36942u;
        n0 n0Var = this.f36943v;
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
                a aVar2 = new a(n0Var, null);
                this.f36942u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(n0Var.f36971z, e10);
        }
        return hs.k.f19476a;
    }
}
