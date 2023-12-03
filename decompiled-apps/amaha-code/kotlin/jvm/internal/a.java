package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* compiled from: CallableReference.java */
/* loaded from: classes2.dex */
public abstract class a implements ys.c, Serializable {
    public static final Object NO_RECEIVER = C0359a.f23445u;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ys.c reflected;
    private final String signature;

    /* compiled from: CallableReference.java */
    /* renamed from: kotlin.jvm.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0359a implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public static final C0359a f23445u = new C0359a();

        private Object readResolve() {
            return f23445u;
        }
    }

    public a() {
        this(NO_RECEIVER);
    }

    @Override // ys.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ys.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ys.c compute() {
        ys.c cVar = this.reflected;
        if (cVar == null) {
            ys.c computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return cVar;
    }

    public abstract ys.c computeReflected();

    @Override // ys.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // ys.c
    public String getName() {
        return this.name;
    }

    public ys.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return y.f23470a.c(cls, "");
        }
        return y.a(cls);
    }

    @Override // ys.c
    public List<ys.j> getParameters() {
        return getReflected().getParameters();
    }

    public ys.c getReflected() {
        ys.c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new hs.e();
    }

    @Override // ys.c
    public ys.n getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ys.c
    public List<ys.o> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ys.c
    public ys.q getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ys.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ys.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ys.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // ys.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public a(Object obj) {
        this(obj, null, null, null, false);
    }

    public a(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
