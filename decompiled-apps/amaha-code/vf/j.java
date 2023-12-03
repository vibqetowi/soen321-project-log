package vf;

import com.google.gson.JsonSyntaxException;
import r1.b0;
import sf.s;
import sf.v;
/* compiled from: NumberTypeAdapter.java */
/* loaded from: classes.dex */
public final class j extends v<Number> {

    /* renamed from: b  reason: collision with root package name */
    public static final i f35011b = new i(new j(sf.s.f31516v));

    /* renamed from: a  reason: collision with root package name */
    public final sf.t f35012a;

    public j(s.b bVar) {
        this.f35012a = bVar;
    }

    @Override // sf.v
    public final Number a(yf.a aVar) {
        int y02 = aVar.y0();
        int d10 = v.h.d(y02);
        if (d10 != 5 && d10 != 6) {
            if (d10 == 8) {
                aVar.p0();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + b0.k(y02) + "; at path " + aVar.s());
        }
        return this.f35012a.d(aVar);
    }

    @Override // sf.v
    public final void b(yf.b bVar, Number number) {
        bVar.c0(number);
    }
}
