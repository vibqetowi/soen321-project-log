package b9;

import android.content.Context;
import b9.f;
import b9.n;
/* compiled from: DefaultDataSourceFactory.java */
@Deprecated
/* loaded from: classes.dex */
public final class m implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4179a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f4180b;

    public m(Context context) {
        n.a aVar = new n.a();
        aVar.f4194b = "ua";
        this.f4179a = context.getApplicationContext();
        this.f4180b = aVar;
    }

    @Override // b9.f.a
    public final f a() {
        return new l(this.f4179a, this.f4180b.a());
    }
}
