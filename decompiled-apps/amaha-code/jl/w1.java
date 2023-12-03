package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import java.util.List;
/* compiled from: NotV4RecentViewModel.kt */
/* loaded from: classes2.dex */
public final class w1 extends androidx.lifecycle.l0 {

    /* renamed from: x  reason: collision with root package name */
    public final u0 f22381x;

    /* renamed from: y  reason: collision with root package name */
    public final kotlinx.coroutines.flow.x f22382y;

    /* renamed from: z  reason: collision with root package name */
    public final hs.i f22383z;

    /* compiled from: NotV4RecentViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<List<? extends NotV4RecentModel>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f22384u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<List<? extends NotV4RecentModel>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    public w1(u0 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f22381x = repository;
        this.f22382y = tr.r.f(0L);
        this.f22383z = sp.b.O(a.f22384u);
    }
}
