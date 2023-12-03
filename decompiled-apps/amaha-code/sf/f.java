package sf;
/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class f extends v<Number> {
    @Override // sf.v
    public final Number a(yf.a aVar) {
        if (aVar.y0() == 9) {
            aVar.p0();
            return null;
        }
        return Long.valueOf(aVar.h0());
    }

    @Override // sf.v
    public final void b(yf.b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.G();
        } else {
            bVar.e0(number2.toString());
        }
    }
}
