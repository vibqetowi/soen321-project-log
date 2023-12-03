package tr;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: Context.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f33516a = Logger.getLogger(l.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final l f33517b = new l();

    /* compiled from: Context.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33518a;

        static {
            b m0Var;
            AtomicReference atomicReference = new AtomicReference();
            try {
                m0Var = (b) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(b.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                m0Var = new m0();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
            f33518a = m0Var;
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                l.f33516a.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }
    }

    /* compiled from: Context.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract l a();

        public abstract void b(l lVar, l lVar2);

        public l c(l lVar) {
            a();
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }
    }

    public static l b() {
        l a10 = a.f33518a.a();
        if (a10 == null) {
            return f33517b;
        }
        return a10;
    }

    public final l a() {
        l c10 = a.f33518a.c(this);
        if (c10 == null) {
            return f33517b;
        }
        return c10;
    }

    public final void c(l lVar) {
        if (lVar != null) {
            a.f33518a.b(this, lVar);
            return;
        }
        throw new NullPointerException("toAttach");
    }
}
