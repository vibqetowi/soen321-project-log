package uf;

import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.List;
import sf.v;
import sf.w;
/* compiled from: Excluder.java */
/* loaded from: classes.dex */
public final class h implements w, Cloneable {

    /* renamed from: z  reason: collision with root package name */
    public static final h f34062z = new h();

    /* renamed from: u  reason: collision with root package name */
    public final double f34063u = -1.0d;

    /* renamed from: v  reason: collision with root package name */
    public final int f34064v = 136;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f34065w = true;

    /* renamed from: x  reason: collision with root package name */
    public final List<sf.a> f34066x = Collections.emptyList();

    /* renamed from: y  reason: collision with root package name */
    public final List<sf.a> f34067y = Collections.emptyList();

    /* compiled from: Excluder.java */
    /* loaded from: classes.dex */
    public class a extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public v<T> f34068a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f34069b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f34070c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ sf.i f34071d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ TypeToken f34072e;

        public a(boolean z10, boolean z11, sf.i iVar, TypeToken typeToken) {
            this.f34069b = z10;
            this.f34070c = z11;
            this.f34071d = iVar;
            this.f34072e = typeToken;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
        @Override // sf.v
        public final T a(yf.a aVar) {
            if (this.f34069b) {
                aVar.N0();
                return null;
            }
            v vVar = this.f34068a;
            if (vVar == null) {
                vVar = this.f34071d.e(h.this, this.f34072e);
                this.f34068a = vVar;
            }
            return vVar.a(aVar);
        }

        @Override // sf.v
        public final void b(yf.b bVar, T t3) {
            if (this.f34070c) {
                bVar.G();
                return;
            }
            v vVar = this.f34068a;
            if (vVar == null) {
                vVar = this.f34071d.e(h.this, this.f34072e);
                this.f34068a = vVar;
            }
            vVar.b(bVar, t3);
        }
    }

    public static boolean d(Class cls) {
        boolean z10;
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if ((cls.getModifiers() & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            return false;
        }
        return true;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        boolean z10;
        boolean z11;
        Class<? super T> rawType = typeToken.getRawType();
        boolean b10 = b(rawType);
        if (!b10 && !c(rawType, true)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!b10 && !c(rawType, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return null;
        }
        return new a(z11, z10, iVar, typeToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Class<?> cls) {
        boolean z10;
        boolean z11;
        if (this.f34063u != -1.0d && !e((tf.c) cls.getAnnotation(tf.c.class), (tf.d) cls.getAnnotation(tf.d.class))) {
            return true;
        }
        if (!this.f34065w) {
            if (cls.isMemberClass()) {
                if ((cls.getModifiers() & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    z10 = true;
                    if (z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        if (d(cls)) {
            return true;
        }
        return false;
    }

    public final boolean c(Class<?> cls, boolean z10) {
        List<sf.a> list;
        if (z10) {
            list = this.f34066x;
        } else {
            list = this.f34067y;
        }
        for (sf.a aVar : list) {
            if (aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean e(tf.c cVar, tf.d dVar) {
        boolean z10;
        boolean z11;
        double d10 = this.f34063u;
        if (cVar != null && cVar.value() > d10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (dVar != null && dVar.value() <= d10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        return true;
    }
}
