package pt;

import java.util.Arrays;
/* compiled from: JavaClassFinder.kt */
/* loaded from: classes2.dex */
public interface q {

    /* compiled from: JavaClassFinder.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final fu.b f28947a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f28948b;

        /* renamed from: c  reason: collision with root package name */
        public final wt.g f28949c;

        public a(fu.b bVar, wt.g gVar, int i6) {
            gVar = (i6 & 4) != 0 ? null : gVar;
            this.f28947a = bVar;
            this.f28948b = null;
            this.f28949c = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f28947a, aVar.f28947a) && kotlin.jvm.internal.i.b(this.f28948b, aVar.f28948b) && kotlin.jvm.internal.i.b(this.f28949c, aVar.f28949c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.f28947a.hashCode() * 31;
            int i6 = 0;
            byte[] bArr = this.f28948b;
            if (bArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(bArr);
            }
            int i10 = (hashCode2 + hashCode) * 31;
            wt.g gVar = this.f28949c;
            if (gVar != null) {
                i6 = gVar.hashCode();
            }
            return i10 + i6;
        }

        public final String toString() {
            return "Request(classId=" + this.f28947a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f28948b) + ", outerClass=" + this.f28949c + ')';
        }
    }

    void a(fu.c cVar);

    nt.s b(a aVar);

    nt.d0 c(fu.c cVar);
}
