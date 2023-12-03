package androidx.startup;
/* loaded from: classes.dex */
public final class StartupException extends RuntimeException {
    public StartupException() {
        super("Context cannot be null");
    }

    public StartupException(Throwable th2) {
        super(th2);
    }
}
