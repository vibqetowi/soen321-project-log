package androidx.work;

import android.os.Build;
import androidx.work.r;
import androidx.work.u;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
/* compiled from: WorkRequest.kt */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f3351a;

    /* renamed from: b  reason: collision with root package name */
    public final v2.s f3352b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f3353c;

    /* compiled from: WorkRequest.kt */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<B, ?>, W extends w> {

        /* renamed from: a  reason: collision with root package name */
        public UUID f3354a;

        /* renamed from: b  reason: collision with root package name */
        public v2.s f3355b;

        /* renamed from: c  reason: collision with root package name */
        public final Set<String> f3356c;

        public a(Class<? extends p> cls) {
            UUID randomUUID = UUID.randomUUID();
            kotlin.jvm.internal.i.f(randomUUID, "randomUUID()");
            this.f3354a = randomUUID;
            String uuid = this.f3354a.toString();
            kotlin.jvm.internal.i.f(uuid, "id.toString()");
            this.f3355b = new v2.s(uuid, null, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(1));
            is.k.h2(linkedHashSet, strArr);
            this.f3356c = linkedHashSet;
        }

        public final W a() {
            boolean z10;
            r b10 = b();
            c cVar = this.f3355b.f34742j;
            int i6 = Build.VERSION.SDK_INT;
            boolean z11 = false;
            if ((i6 < 24 || !(!cVar.f3231h.isEmpty())) && !cVar.f3228d && !cVar.f3226b && (i6 < 23 || !cVar.f3227c)) {
                z10 = false;
            } else {
                z10 = true;
            }
            v2.s sVar = this.f3355b;
            if (sVar.f34749q) {
                if (!z10) {
                    if (sVar.f34739g <= 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            kotlin.jvm.internal.i.f(randomUUID, "randomUUID()");
            this.f3354a = randomUUID;
            String uuid = randomUUID.toString();
            kotlin.jvm.internal.i.f(uuid, "id.toString()");
            v2.s other = this.f3355b;
            kotlin.jvm.internal.i.g(other, "other");
            String str = other.f34736c;
            u.a aVar = other.f34735b;
            String str2 = other.f34737d;
            d dVar = new d(other.f34738e);
            d dVar2 = new d(other.f);
            long j10 = other.f34739g;
            long j11 = other.f34740h;
            long j12 = other.f34741i;
            c other2 = other.f34742j;
            kotlin.jvm.internal.i.g(other2, "other");
            boolean z12 = other2.f3226b;
            boolean z13 = other2.f3227c;
            this.f3355b = new v2.s(uuid, aVar, str, str2, dVar, dVar2, j10, j11, j12, new c(other2.f3225a, z12, z13, other2.f3228d, other2.f3229e, other2.f, other2.f3230g, other2.f3231h), other.f34743k, other.f34744l, other.f34745m, other.f34746n, other.f34747o, other.f34748p, other.f34749q, other.r, other.f34750s, 524288, 0);
            c();
            return b10;
        }

        public abstract r b();

        public abstract r.a c();
    }

    public w(UUID id2, v2.s workSpec, Set<String> tags) {
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(workSpec, "workSpec");
        kotlin.jvm.internal.i.g(tags, "tags");
        this.f3351a = id2;
        this.f3352b = workSpec;
        this.f3353c = tags;
    }
}
