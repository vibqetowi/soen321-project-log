package r0;
/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final d f30177a = new d(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f30178b = new d(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f30179c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f30180d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f30181a = new a();

        @Override // r0.f.b
        public final int a(CharSequence charSequence, int i6) {
            int i10 = i6 + 0;
            int i11 = 2;
            for (int i12 = 0; i12 < i10 && i11 == 2; i12++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i12));
                d dVar = f.f30177a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i11 = 2;
                                break;
                        }
                    }
                    i11 = 0;
                }
                i11 = 1;
            }
            return i11;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i6);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c implements e {

        /* renamed from: a  reason: collision with root package name */
        public final b f30182a;

        public c(a aVar) {
            this.f30182a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i6) {
            if (charSequence != null && i6 >= 0 && charSequence.length() - i6 >= 0) {
                b bVar = this.f30182a;
                if (bVar == null) {
                    return a();
                }
                int a10 = bVar.a(charSequence, i6);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    return a();
                }
                return false;
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30183b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f30183b = z10;
        }

        @Override // r0.f.c
        public final boolean a() {
            return this.f30183b;
        }
    }

    static {
        a aVar = a.f30181a;
        f30179c = new d(aVar, false);
        f30180d = new d(aVar, true);
    }
}
