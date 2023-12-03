package s9;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public final Callable f31320e;

    public /* synthetic */ a0(n nVar) {
        super(false, null, null);
        this.f31320e = nVar;
    }

    @Override // s9.b0
    public final String a() {
        try {
            return (String) this.f31320e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
