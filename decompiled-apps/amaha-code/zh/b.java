package zh;

import kotlin.jvm.internal.k;
import nd.z;
/* compiled from: SecurityManager.kt */
/* loaded from: classes.dex */
public final class b extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ z f39403u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z zVar) {
        super(0);
        this.f39403u = zVar;
    }

    @Override // ss.a
    public final String invoke() {
        return d.f39405a + " decrypt() : Cryptography Response State: " + ((kh.a) this.f39403u.f26149c);
    }
}
