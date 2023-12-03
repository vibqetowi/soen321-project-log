package gp;

import com.theinnerhour.b2b.utils.LogHelper;
import ls.d;
import ls.h;
/* compiled from: ResourceRepository.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f16677a = LogHelper.INSTANCE.makeLogTag("ResourceRepository");

    public final Object a(int i6, String str, d dVar) {
        h hVar = new h(ca.a.G0(dVar));
        ((fp.a) nr.b.a(fp.a.class)).b("https://api.theinnerhour.com/v1/customers/resources/articles/list", i6, 10, str).I(new a(this, hVar));
        return hVar.b();
    }
}
