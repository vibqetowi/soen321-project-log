package kotlin.jvm.internal;
/* compiled from: FunctionReference.java */
/* loaded from: classes2.dex */
public class f extends a implements e, ys.g {
    private final int arity;
    private final int flags;

    public f(int i6) {
        this(i6, a.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.a
    public ys.c computeReflected() {
        return y.f23470a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (getName().equals(fVar.getName()) && getSignature().equals(fVar.getSignature()) && this.flags == fVar.flags && this.arity == fVar.arity && i.b(getBoundReceiver(), fVar.getBoundReceiver()) && i.b(getOwner(), fVar.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof ys.g)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // ys.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ys.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ys.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ys.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ys.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public f(int i6, Object obj) {
        this(i6, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.a
    public ys.g getReflected() {
        return (ys.g) super.getReflected();
    }

    public f(int i6, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i6;
        this.flags = i10 >> 1;
    }
}
