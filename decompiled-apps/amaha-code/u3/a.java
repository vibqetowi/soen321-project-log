package u3;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import w3.j;
/* compiled from: Amplitude.kt */
/* loaded from: classes.dex */
public final class a extends k implements l<j, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public static final a f33765u = new a();

    public a() {
        super(1);
    }

    @Override // ss.l
    public final hs.k invoke(j jVar) {
        w3.g gVar;
        j it = jVar;
        i.g(it, "it");
        if (it instanceof w3.g) {
            gVar = (w3.g) it;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.flush();
        }
        return hs.k.f19476a;
    }
}
