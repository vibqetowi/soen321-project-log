package z8;

import android.os.Bundle;
import com.google.common.collect.m0;
import com.google.common.collect.q;
import com.google.common.collect.s;
import com.google.common.collect.t;
import java.util.Collections;
import java.util.List;
import o8.o;
/* compiled from: TrackSelectionOverrides.java */
/* loaded from: classes.dex */
public final class i implements com.google.android.exoplayer2.f {

    /* renamed from: v  reason: collision with root package name */
    public static final i f39320v = new i(m0.A);

    /* renamed from: u  reason: collision with root package name */
    public final t<o, a> f39321u;

    static {
        new p7.e(24);
    }

    public i(m0 m0Var) {
        this.f39321u = t.a(m0Var);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        String num = Integer.toString(0, 36);
        t<o, a> tVar = this.f39321u;
        q qVar = tVar.f9454w;
        if (qVar == null) {
            qVar = tVar.d();
            tVar.f9454w = qVar;
        }
        bundle.putParcelableArrayList(num, c9.a.c(qVar));
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return this.f39321u.equals(((i) obj).f39321u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39321u.hashCode();
    }

    /* compiled from: TrackSelectionOverrides.java */
    /* loaded from: classes.dex */
    public static final class a implements com.google.android.exoplayer2.f {

        /* renamed from: w  reason: collision with root package name */
        public static final p7.e f39322w = new p7.e(25);

        /* renamed from: u  reason: collision with root package name */
        public final o f39323u;

        /* renamed from: v  reason: collision with root package name */
        public final s<Integer> f39324v;

        public a(o oVar) {
            this.f39323u = oVar;
            s.a aVar = new s.a();
            for (int i6 = 0; i6 < oVar.f27302u; i6++) {
                aVar.b(Integer.valueOf(i6));
            }
            this.f39324v = aVar.c();
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(Integer.toString(0, 36), this.f39323u.a());
            bundle.putIntArray(Integer.toString(1, 36), qc.a.G(this.f39324v));
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f39323u.equals(aVar.f39323u) && this.f39324v.equals(aVar.f39324v)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f39324v.hashCode() * 31) + this.f39323u.hashCode();
        }

        public a(o oVar, List<Integer> list) {
            if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= oVar.f27302u)) {
                throw new IndexOutOfBoundsException();
            }
            this.f39323u = oVar;
            this.f39324v = s.z(list);
        }
    }
}
