package s9;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final b0 f31326d = new b0(true, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31327a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31328b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f31329c;

    public b0(boolean z10, String str, Exception exc) {
        this.f31327a = z10;
        this.f31328b = str;
        this.f31329c = exc;
    }

    public static b0 b(String str) {
        return new b0(false, str, null);
    }

    public static b0 c(String str, Exception exc) {
        return new b0(false, str, exc);
    }

    public String a() {
        return this.f31328b;
    }
}
