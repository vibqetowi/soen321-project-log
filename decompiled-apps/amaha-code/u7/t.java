package u7;
/* compiled from: SeekMap.java */
/* loaded from: classes.dex */
public interface t {

    /* compiled from: SeekMap.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final u f33906a;

        /* renamed from: b  reason: collision with root package name */
        public final u f33907b;

        public a() {
            throw null;
        }

        public a(u uVar, u uVar2) {
            this.f33906a = uVar;
            this.f33907b = uVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f33906a.equals(aVar.f33906a) && this.f33907b.equals(aVar.f33907b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f33907b.hashCode() + (this.f33906a.hashCode() * 31);
        }

        public final String toString() {
            String sb2;
            u uVar = this.f33906a;
            String valueOf = String.valueOf(uVar);
            u uVar2 = this.f33907b;
            if (uVar.equals(uVar2)) {
                sb2 = "";
            } else {
                String valueOf2 = String.valueOf(uVar2);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 2);
                sb3.append(", ");
                sb3.append(valueOf2);
                sb2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder(ri.e.c(sb2, valueOf.length() + 2));
            sb4.append("[");
            sb4.append(valueOf);
            sb4.append(sb2);
            sb4.append("]");
            return sb4.toString();
        }
    }

    /* compiled from: SeekMap.java */
    /* loaded from: classes.dex */
    public static class b implements t {

        /* renamed from: a  reason: collision with root package name */
        public final long f33908a;

        /* renamed from: b  reason: collision with root package name */
        public final a f33909b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // u7.t
        public final boolean d() {
            return false;
        }

        @Override // u7.t
        public final a i(long j10) {
            return this.f33909b;
        }

        @Override // u7.t
        public final long j() {
            return this.f33908a;
        }

        public b(long j10, long j11) {
            this.f33908a = j10;
            u uVar = j11 == 0 ? u.f33910c : new u(0L, j11);
            this.f33909b = new a(uVar, uVar);
        }
    }

    boolean d();

    a i(long j10);

    long j();
}
