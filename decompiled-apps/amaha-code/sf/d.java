package sf;
/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class d extends v<Number> {
    @Override // sf.v
    public final Number a(yf.a aVar) {
        if (aVar.y0() == 9) {
            aVar.p0();
            return null;
        }
        return Double.valueOf(aVar.e0());
    }

    @Override // sf.v
    public final void b(yf.b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.G();
            return;
        }
        i.a(number2.doubleValue());
        bVar.c0(number2);
    }
}
