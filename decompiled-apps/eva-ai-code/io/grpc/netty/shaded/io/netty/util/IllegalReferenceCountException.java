package io.grpc.netty.shaded.io.netty.util;
/* loaded from: classes4.dex */
public class IllegalReferenceCountException extends IllegalStateException {
    private static final long serialVersionUID = -2507492394288153468L;

    public IllegalReferenceCountException() {
    }

    public IllegalReferenceCountException(int i) {
        this("refCnt: " + i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IllegalReferenceCountException(int i, int i2) {
        this(r0.toString());
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder("refCnt: ");
        sb2.append(i);
        sb2.append(", ");
        if (i2 > 0) {
            sb = new StringBuilder("increment: ");
        } else {
            sb = new StringBuilder("decrement: ");
            i2 = -i2;
        }
        sb.append(i2);
        sb2.append(sb.toString());
    }

    public IllegalReferenceCountException(String str) {
        super(str);
    }

    public IllegalReferenceCountException(String str, Throwable th) {
        super(str, th);
    }

    public IllegalReferenceCountException(Throwable th) {
        super(th);
    }
}
