package k4;
/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f22878a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f22879b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f22880c;

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class a extends l {
        @Override // k4.l
        public final boolean a() {
            return true;
        }

        @Override // k4.l
        public final boolean b() {
            return true;
        }

        @Override // k4.l
        public final boolean c(h4.a aVar) {
            if (aVar == h4.a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // k4.l
        public final boolean d(boolean z10, h4.a aVar, h4.c cVar) {
            if (aVar != h4.a.RESOURCE_DISK_CACHE && aVar != h4.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class b extends l {
        @Override // k4.l
        public final boolean a() {
            return false;
        }

        @Override // k4.l
        public final boolean b() {
            return false;
        }

        @Override // k4.l
        public final boolean c(h4.a aVar) {
            return false;
        }

        @Override // k4.l
        public final boolean d(boolean z10, h4.a aVar, h4.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class c extends l {
        @Override // k4.l
        public final boolean a() {
            return true;
        }

        @Override // k4.l
        public final boolean b() {
            return false;
        }

        @Override // k4.l
        public final boolean c(h4.a aVar) {
            if (aVar != h4.a.DATA_DISK_CACHE && aVar != h4.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }

        @Override // k4.l
        public final boolean d(boolean z10, h4.a aVar, h4.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class d extends l {
        @Override // k4.l
        public final boolean a() {
            return false;
        }

        @Override // k4.l
        public final boolean b() {
            return true;
        }

        @Override // k4.l
        public final boolean c(h4.a aVar) {
            return false;
        }

        @Override // k4.l
        public final boolean d(boolean z10, h4.a aVar, h4.c cVar) {
            if (aVar != h4.a.RESOURCE_DISK_CACHE && aVar != h4.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class e extends l {
        @Override // k4.l
        public final boolean a() {
            return true;
        }

        @Override // k4.l
        public final boolean b() {
            return true;
        }

        @Override // k4.l
        public final boolean c(h4.a aVar) {
            if (aVar == h4.a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // k4.l
        public final boolean d(boolean z10, h4.a aVar, h4.c cVar) {
            if (((z10 && aVar == h4.a.DATA_DISK_CACHE) || aVar == h4.a.LOCAL) && cVar == h4.c.TRANSFORMED) {
                return true;
            }
            return false;
        }
    }

    static {
        new a();
        f22878a = new b();
        f22879b = new c();
        new d();
        f22880c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(h4.a aVar);

    public abstract boolean d(boolean z10, h4.a aVar, h4.c cVar);
}
