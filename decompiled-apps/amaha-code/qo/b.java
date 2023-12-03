package qo;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import hs.f;
import is.u;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: GoalCoachViewModelNew.kt */
/* loaded from: classes2.dex */
public final class b extends l0 {
    public long A;

    /* renamed from: x  reason: collision with root package name */
    public final w<ArrayList<f<String, ?>>> f29981x = new w<>();

    /* renamed from: y  reason: collision with root package name */
    public final w<Boolean> f29982y = new w<>();

    /* renamed from: z  reason: collision with root package name */
    public final w<f<Integer, Integer>> f29983z = new w<>();

    public final void e() {
        String str;
        f fVar;
        w<ArrayList<f<String, ?>>> wVar = this.f29981x;
        ArrayList<f<String, ?>> d10 = wVar.d();
        if (d10 != null && (fVar = (f) u.o2(d10)) != null) {
            str = (String) fVar.f19464u;
        } else {
            str = null;
        }
        if (i.b(str, "alert")) {
            d10.remove(d10.size() - 1);
            ApplicationPersistence.getInstance().setBooleanValue("pro_goal_alert_1", false);
            wVar.i(d10);
        }
    }

    public final void f(ArrayList goalsList, Date date) {
        i.g(goalsList, "goalsList");
        v.H(h.c(o0.f23640a), null, 0, new a(date, this, goalsList, null), 3);
    }
}
