package io.grpc.netty.shaded.io.netty.util;
/* loaded from: classes4.dex */
public final class Signal extends Error implements Constant<Signal> {
    private static final ConstantPool<Signal> pool = new ConstantPool<Signal>() { // from class: io.grpc.netty.shaded.io.netty.util.Signal.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.netty.shaded.io.netty.util.ConstantPool
        public Signal newConstant(int i, String str) {
            return new Signal(i, str);
        }
    };
    private static final long serialVersionUID = -221145131122459977L;
    private final SignalConstant constant;

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public Throwable initCause(Throwable th) {
        return this;
    }

    public static Signal valueOf(String str) {
        return pool.valueOf(str);
    }

    public static Signal valueOf(Class<?> cls, String str) {
        return pool.valueOf(cls, str);
    }

    private Signal(int i, String str) {
        this.constant = new SignalConstant(i, str);
    }

    public void expect(Signal signal) {
        if (this == signal) {
            return;
        }
        throw new IllegalStateException("unexpected signal: " + signal);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.Constant
    public int id() {
        return this.constant.id();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.Constant
    public String name() {
        return this.constant.name();
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Signal signal) {
        if (this == signal) {
            return 0;
        }
        return this.constant.compareTo(signal.constant);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SignalConstant extends AbstractConstant<SignalConstant> {
        SignalConstant(int i, String str) {
            super(i, str);
        }
    }
}
