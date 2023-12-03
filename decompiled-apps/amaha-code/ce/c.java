package ce;

import java.io.Writer;
/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f5245a;

    public c(d dVar) {
        this.f5245a = dVar;
    }

    public final void a(Object obj, Writer writer) {
        d dVar = this.f5245a;
        e eVar = new e(writer, dVar.f5249a, dVar.f5250b, dVar.f5251c, dVar.f5252d);
        eVar.g(obj);
        eVar.i();
        eVar.f5255b.flush();
    }
}
