package zl;

import com.theinnerhour.b2b.network.model.UpcomingBooking;
/* compiled from: ExpertCareDashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.l<UpcomingBooking, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ o f39478u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar) {
        super(1);
        this.f39478u = oVar;
    }

    @Override // ss.l
    public final Boolean invoke(UpcomingBooking upcomingBooking) {
        Integer num;
        Integer num2;
        UpcomingBooking tt2 = upcomingBooking;
        kotlin.jvm.internal.i.g(tt2, "tt");
        Integer[] numArr = new Integer[3];
        o oVar = this.f39478u;
        UpcomingBooking upcomingBooking2 = oVar.G;
        Integer num3 = null;
        if (upcomingBooking2 != null) {
            num = Integer.valueOf(upcomingBooking2.getId());
        } else {
            num = null;
        }
        numArr[0] = num;
        UpcomingBooking upcomingBooking3 = oVar.I;
        if (upcomingBooking3 != null) {
            num2 = Integer.valueOf(upcomingBooking3.getId());
        } else {
            num2 = null;
        }
        numArr[1] = num2;
        UpcomingBooking upcomingBooking4 = oVar.H;
        if (upcomingBooking4 != null) {
            num3 = Integer.valueOf(upcomingBooking4.getId());
        }
        numArr[2] = num3;
        return Boolean.valueOf(is.k.Q1(Integer.valueOf(tt2.getId()), numArr));
    }
}
