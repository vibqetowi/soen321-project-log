package fm;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: V3CustomGoalViewModel.kt */
/* loaded from: classes2.dex */
public final class q1 extends androidx.lifecycle.l0 {
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
    public final dm.e f15516x;

    /* renamed from: y  reason: collision with root package name */
    public final String f15517y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<ArrayList<hs.f<String, ?>>> f15518z;

    public q1(dm.e repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f15516x = repository;
        this.f15517y = LogHelper.INSTANCE.makeLogTag(q1.class);
        this.f15518z = new androidx.lifecycle.w<>();
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

    public final void e(Date date, boolean z10) {
        ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new p1(this, date, z10, null), 3);
    }
}
