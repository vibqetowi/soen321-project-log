package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: NotV4RecentViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4RecentViewModel$groupIntoDatesLogic$1", f = "NotV4RecentViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List<NotV4RecentModel> f22375u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w1 f22376v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(List<NotV4RecentModel> list, w1 w1Var, ls.d<? super v1> dVar) {
        super(2, dVar);
        this.f22375u = list;
        this.f22376v = w1Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new v1(this.f22375u, this.f22376v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((v1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r5 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
        r5 = "";
     */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        String sb2;
        sp.b.d0(obj);
        new il.a();
        ArrayList arrayList = new ArrayList();
        Iterator<NotV4RecentModel> it = this.f22375u.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            w1 w1Var = this.f22376v;
            if (hasNext) {
                NotV4RecentModel next = it.next();
                Long lastAccessedDate = next.getLastAccessedDate();
                kotlin.jvm.internal.i.d(lastAccessedDate);
                long longValue = lastAccessedDate.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(longValue);
                Utils utils = Utils.INSTANCE;
                if (utils.isToday(calendar)) {
                    sb2 = "Today";
                } else if (utils.isWithinDays(calendar, 1)) {
                    sb2 = "Yesterday";
                } else {
                    Calendar calendar2 = Calendar.getInstance();
                    boolean z12 = false;
                    if (calendar2.get(1) == calendar.get(1) && calendar2.get(3) == calendar.get(3)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str = "";
                    if (z10 && utils.isWithinDays(calendar, 7)) {
                        sb2 = calendar.getDisplayName(7, 2, Locale.ENGLISH);
                    } else {
                        Calendar calendar3 = Calendar.getInstance();
                        if (calendar3.get(1) == calendar.get(1) && calendar3.get(3) == calendar.get(3) + 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            sb2 = "Last Week";
                        } else {
                            if (Calendar.getInstance().get(1) == calendar.get(1)) {
                                z12 = true;
                            }
                            if (z12) {
                                sb2 = calendar.getDisplayName(2, 2, Locale.ENGLISH);
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                String displayName = calendar.getDisplayName(2, 2, Locale.ENGLISH);
                                if (displayName != null) {
                                    str = displayName;
                                }
                                sb3.append(str);
                                sb3.append(' ');
                                sb3.append(calendar.get(1));
                                sb2 = sb3.toString();
                            }
                        }
                    }
                }
                next.setHeaderTitle(sb2);
                next.setHeader(Boolean.FALSE);
                NotV4RecentModel notV4RecentModel = new NotV4RecentModel(null, null, null, null, null, false, false, null, null, false, null, Boolean.TRUE, next.getHeaderTitle());
                if (!arrayList.contains(notV4RecentModel)) {
                    w1Var.getClass();
                    arrayList.add(notV4RecentModel);
                }
                arrayList.add(next);
            } else {
                ((androidx.lifecycle.w) w1Var.f22383z.getValue()).i(arrayList);
                return hs.k.f19476a;
            }
        }
    }
}
