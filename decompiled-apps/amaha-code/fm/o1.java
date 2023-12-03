package fm;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: GoalViewModel.kt */
/* loaded from: classes2.dex */
public final class o1 extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<Integer> A;
    public final androidx.lifecycle.w<Integer> B;
    public final androidx.lifecycle.w<Integer> C;
    public final androidx.lifecycle.w<Integer> D;
    public final androidx.lifecycle.w<Integer> E;
    public final androidx.lifecycle.w<Integer> F;
    public final androidx.lifecycle.w<Integer> G;
    public final androidx.lifecycle.w<Integer> H;
    public final androidx.lifecycle.w<Integer> I;

    /* renamed from: x  reason: collision with root package name */
    public final dm.c f15481x;

    /* renamed from: y  reason: collision with root package name */
    public final String f15482y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<ArrayList<Object>> f15483z;

    public o1(dm.c repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f15481x = repository;
        this.f15482y = LogHelper.INSTANCE.makeLogTag(o1.class);
        this.f15483z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>(-1);
        this.B = new androidx.lifecycle.w<>(-1);
        this.C = new androidx.lifecycle.w<>(-1);
        this.D = new androidx.lifecycle.w<>(0);
        this.E = new androidx.lifecycle.w<>(0);
        this.F = new androidx.lifecycle.w<>(0);
        this.G = new androidx.lifecycle.w<>(-1);
        this.H = new androidx.lifecycle.w<>(-1);
        this.I = new androidx.lifecycle.w<>(-1);
    }

    public final void e(Date date) {
        ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new n1(this, date, null), 3);
    }
}
