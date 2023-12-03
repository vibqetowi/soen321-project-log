package yt;
/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39043a = new c(nu.c.BOOLEAN);

    /* renamed from: b  reason: collision with root package name */
    public static final c f39044b = new c(nu.c.CHAR);

    /* renamed from: c  reason: collision with root package name */
    public static final c f39045c = new c(nu.c.BYTE);

    /* renamed from: d  reason: collision with root package name */
    public static final c f39046d = new c(nu.c.SHORT);

    /* renamed from: e  reason: collision with root package name */
    public static final c f39047e = new c(nu.c.INT);
    public static final c f = new c(nu.c.FLOAT);

    /* renamed from: g  reason: collision with root package name */
    public static final c f39048g = new c(nu.c.LONG);

    /* renamed from: h  reason: collision with root package name */
    public static final c f39049h = new c(nu.c.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class a extends m {

        /* renamed from: i  reason: collision with root package name */
        public final m f39050i;

        public a(m elementType) {
            kotlin.jvm.internal.i.g(elementType, "elementType");
            this.f39050i = elementType;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class b extends m {

        /* renamed from: i  reason: collision with root package name */
        public final String f39051i;

        public b(String internalName) {
            kotlin.jvm.internal.i.g(internalName, "internalName");
            this.f39051i = internalName;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public static final class c extends m {

        /* renamed from: i  reason: collision with root package name */
        public final nu.c f39052i;

        public c(nu.c cVar) {
            this.f39052i = cVar;
        }
    }

    public final String toString() {
        return kc.f.b0(this);
    }
}
