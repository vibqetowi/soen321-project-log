package androidx.work;

import android.net.Uri;
import java.util.Set;
/* compiled from: Constraints.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f3224i = new c(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f3225a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3226b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3227c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3228d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3229e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3230g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<a> f3231h;

    /* compiled from: Constraints.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f3232a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3233b;

        public a(boolean z10, Uri uri) {
            this.f3232a = uri;
            this.f3233b = z10;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!kotlin.jvm.internal.i.b(a.class, cls)) {
                return false;
            }
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f3232a, aVar.f3232a) && this.f3233b == aVar.f3233b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i6;
            int hashCode = this.f3232a.hashCode() * 31;
            if (this.f3233b) {
                i6 = 1231;
            } else {
                i6 = 1237;
            }
            return hashCode + i6;
        }
    }

    public c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.i.b(c.class, obj.getClass())) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3226b != cVar.f3226b || this.f3227c != cVar.f3227c || this.f3228d != cVar.f3228d || this.f3229e != cVar.f3229e || this.f != cVar.f || this.f3230g != cVar.f3230g || this.f3225a != cVar.f3225a) {
            return false;
        }
        return kotlin.jvm.internal.i.b(this.f3231h, cVar.f3231h);
    }

    public final int hashCode() {
        long j10 = this.f;
        long j11 = this.f3230g;
        return this.f3231h.hashCode() + (((((((((((((v.h.d(this.f3225a) * 31) + (this.f3226b ? 1 : 0)) * 31) + (this.f3227c ? 1 : 0)) * 31) + (this.f3228d ? 1 : 0)) * 31) + (this.f3229e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;ZZZZJJLjava/util/Set<Landroidx/work/c$a;>;)V */
    public c(int i6, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set contentUriTriggers) {
        defpackage.d.j(i6, "requiredNetworkType");
        kotlin.jvm.internal.i.g(contentUriTriggers, "contentUriTriggers");
        this.f3225a = i6;
        this.f3226b = z10;
        this.f3227c = z11;
        this.f3228d = z12;
        this.f3229e = z13;
        this.f = j10;
        this.f3230g = j11;
        this.f3231h = contentUriTriggers;
    }

    public /* synthetic */ c(int i6) {
        this(1, false, false, false, false, -1L, -1L, is.y.f20678u);
    }
}
