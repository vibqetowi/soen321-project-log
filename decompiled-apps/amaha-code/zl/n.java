package zl;

import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.network.model.UpcomingSessionsModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.util.Locale;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchUpcomingSessions$2$1", f = "ExpertCareDashboardViewModel.kt", l = {417}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39558u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39559v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f39560w;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchUpcomingSessions$2$1$1", f = "ExpertCareDashboardViewModel.kt", l = {418}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39561u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f39562v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f39563w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f39564x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o oVar, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f39563w = oVar;
            this.f39564x = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f39563w, this.f39564x, dVar);
            aVar.f39562v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            TherapistPackagesModel peekContent;
            Integer num2;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
            TherapistPackagesModel therapistPackagesModel;
            Integer num3;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent3;
            TherapistPackagesModel therapistPackagesModel2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39561u;
            o oVar = this.f39563w;
            if (i6 != 0) {
                if (i6 == 1) {
                    d0 d0Var = (d0) this.f39562v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = oVar.f39565x;
                this.f39562v = (d0) this.f39562v;
                this.f39561u = 1;
                obj = aVar2.i(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            UpcomingSessionsModel upcomingSessionsModel = (UpcomingSessionsModel) obj;
            ls.d<Boolean> dVar = this.f39564x;
            hs.k kVar = null;
            if (upcomingSessionsModel != null) {
                oVar.F = null;
                oVar.G = null;
                oVar.H = null;
                oVar.I = null;
                oVar.F = upcomingSessionsModel.getBookings();
                for (UpcomingBooking upcomingBooking : upcomingSessionsModel.getBookings()) {
                    if (kotlin.jvm.internal.i.b(upcomingBooking.getStatus(), "booked") && !kotlin.jvm.internal.i.b(upcomingBooking.getBookingtype(), "couple") && !kotlin.jvm.internal.i.b(upcomingBooking.getTypeofsession(), "offline")) {
                        LocalDateTime parse = LocalDateTime.parse(upcomingBooking.getDatetimeAtCustomerTimezone().getDate() + ' ' + upcomingBooking.getDatetimeAtCustomerTimezone().getSlot(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withLocale(Locale.ENGLISH));
                        kotlin.jvm.internal.i.f(parse, "parse(bookingDateTimeString, dateFormat)");
                        if (ChronoUnit.SECONDS.between(LocalDateTime.now(), parse) < 900) {
                            Integer therapistId = upcomingBooking.getTherapistId();
                            w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar = oVar.f39567z;
                            if (therapistId != null && kotlin.jvm.internal.i.b(upcomingBooking.getBookingtype(), "single")) {
                                Integer therapistId2 = upcomingBooking.getTherapistId();
                                SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10 = wVar.d();
                                if (d10 != null && (peekContent3 = d10.peekContent()) != null && (therapistPackagesModel2 = peekContent3.f19464u) != null) {
                                    num3 = new Integer(therapistPackagesModel2.getId());
                                } else {
                                    num3 = null;
                                }
                                if (kotlin.jvm.internal.i.b(therapistId2, num3)) {
                                    oVar.G = upcomingBooking;
                                }
                            }
                            if (upcomingBooking.getTherapistId() != null && kotlin.jvm.internal.i.b(upcomingBooking.getBookingtype(), "couple")) {
                                Integer therapistId3 = upcomingBooking.getTherapistId();
                                SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d11 = wVar.d();
                                if (d11 != null && (peekContent2 = d11.peekContent()) != null && (therapistPackagesModel = peekContent2.f19465v) != null) {
                                    num2 = new Integer(therapistPackagesModel.getId());
                                } else {
                                    num2 = null;
                                }
                                if (kotlin.jvm.internal.i.b(therapistId3, num2)) {
                                    oVar.H = upcomingBooking;
                                }
                            }
                            if (upcomingBooking.getPsychiatristId() != null) {
                                Integer psychiatristId = upcomingBooking.getPsychiatristId();
                                SingleUseEvent<TherapistPackagesModel> d12 = oVar.A.d();
                                if (d12 != null && (peekContent = d12.peekContent()) != null) {
                                    num = new Integer(peekContent.getId());
                                } else {
                                    num = null;
                                }
                                if (kotlin.jvm.internal.i.b(psychiatristId, num)) {
                                    oVar.I = upcomingBooking;
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
    public n(o oVar, ls.d<? super Boolean> dVar, ls.d<? super n> dVar2) {
        super(2, dVar2);
        this.f39559v = oVar;
        this.f39560w = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f39559v, this.f39560w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39558u;
        o oVar = this.f39559v;
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
                a aVar2 = new a(oVar, this.f39560w, null);
                this.f39558u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
        return hs.k.f19476a;
    }
}
