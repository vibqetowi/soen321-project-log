package hs;
/* compiled from: Standard.kt */
/* loaded from: classes2.dex */
public final class e extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String message, int i6) {
        super(message);
        if (i6 != 2) {
            kotlin.jvm.internal.i.g(message, "message");
            return;
        }
        kotlin.jvm.internal.i.g(message, "message");
        super(message);
    }

    public /* synthetic */ e() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public /* synthetic */ e(String str, Throwable th2) {
        super(str, th2);
    }
}
