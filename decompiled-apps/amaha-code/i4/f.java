package i4;

import i4.e;
import java.util.HashMap;
/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19810b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f19811a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    public class a implements e.a<Object> {
        @Override // i4.e.a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // i4.e.a
        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f19812a;

        public b(Object obj) {
            this.f19812a = obj;
        }

        @Override // i4.e
        public final Object a() {
            return this.f19812a;
        }

        @Override // i4.e
        public final void b() {
        }
    }
}
