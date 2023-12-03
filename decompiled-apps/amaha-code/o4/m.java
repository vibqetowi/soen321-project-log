package o4;

import java.util.ArrayDeque;
/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final l f27074a = new l();

    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayDeque f27075d;

        /* renamed from: a  reason: collision with root package name */
        public int f27076a;

        /* renamed from: b  reason: collision with root package name */
        public int f27077b;

        /* renamed from: c  reason: collision with root package name */
        public A f27078c;

        static {
            char[] cArr = d5.j.f12201a;
            f27075d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f27075d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f27078c = obj;
            aVar.f27077b = 0;
            aVar.f27076a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27077b != aVar.f27077b || this.f27076a != aVar.f27076a || !this.f27078c.equals(aVar.f27078c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f27078c.hashCode() + (((this.f27076a * 31) + this.f27077b) * 31);
        }
    }
}
