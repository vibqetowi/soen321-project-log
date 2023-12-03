package ml;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.network.model.UpcomingSessionsModel;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.util.Locale;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchUpcomingSessions$2$1", f = "DashboardTelecommunicationsViewModel.kt", l = {285}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25536u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25537v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25538w;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchUpcomingSessions$2$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {286}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25539u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f25540v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f25541w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f25542x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p pVar, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f25541w = pVar;
            this.f25542x = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f25541w, this.f25542x, dVar);
            aVar.f25540v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            Integer num2;
            TherapistPackagesModel therapistPackagesModel;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25539u;
            p pVar = this.f25541w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25540v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = pVar.f25558y;
                this.f25540v = (kotlinx.coroutines.d0) this.f25540v;
                this.f25539u = 1;
                obj = aVar2.i(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            UpcomingSessionsModel upcomingSessionsModel = (UpcomingSessionsModel) obj;
            ls.d<Boolean> dVar = this.f25542x;
            hs.k kVar = null;
            if (upcomingSessionsModel != null) {
                pVar.I = upcomingSessionsModel.getBookings();
                for (UpcomingBooking upcomingBooking : upcomingSessionsModel.getBookings()) {
                    if (kotlin.jvm.internal.i.b(upcomingBooking.getStatus(), "booked") && !kotlin.jvm.internal.i.b(upcomingBooking.getBookingtype(), "couple")) {
                        LocalDateTime parse = LocalDateTime.parse(upcomingBooking.getDatetimeAtCustomerTimezone().getDate() + ' ' + upcomingBooking.getDatetimeAtCustomerTimezone().getSlot(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withLocale(Locale.ENGLISH));
                        kotlin.jvm.internal.i.f(parse, "parse(bookingDateTimeString, dateFormat)");
                        if (ChronoUnit.SECONDS.between(LocalDateTime.now(), parse) < 900) {
                            if (upcomingBooking.getTherapistId() != null) {
                                Integer therapistId = upcomingBooking.getTherapistId();
                                hs.f<TherapistPackagesModel, TherapistPackagesModel> d10 = pVar.A.d();
                                if (d10 != null && (therapistPackagesModel = d10.f19464u) != null) {
                                    num2 = new Integer(therapistPackagesModel.getId());
                                } else {
                                    num2 = null;
                                }
                                if (kotlin.jvm.internal.i.b(therapistId, num2)) {
                                    pVar.K = upcomingBooking;
                                }
                            }
                            if (upcomingBooking.getPsychiatristId() != null) {
                                Integer psychiatristId = upcomingBooking.getPsychiatristId();
                                TherapistPackagesModel d11 = pVar.B.d();
                                if (d11 != null) {
                                    num = new Integer(d11.getId());
                                } else {
                                    num = null;
                                }
                                if (kotlin.jvm.internal.i.b(psychiatristId, num)) {
                                    pVar.L = upcomingBooking;
                                }
                            }
                        }
                    }
                }
                dVar.resumeWith(Boolean.TRUE);
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                dVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(p pVar, ls.d<? super Boolean> dVar, ls.d<? super n> dVar2) {
        super(2, dVar2);
        this.f25537v = pVar;
        this.f25538w = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f25537v, this.f25538w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25536u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25537v, this.f25538w, null);
            this.f25536u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
