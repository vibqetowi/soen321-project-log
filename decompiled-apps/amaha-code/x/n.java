package x;

import java.util.ArrayList;
/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class n extends e {

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList<e> f37443w0 = new ArrayList<>();

    @Override // x.e
    public void G() {
        this.f37443w0.clear();
        super.G();
    }

    @Override // x.e
    public final void J(v.c cVar) {
        super.J(cVar);
        int size = this.f37443w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f37443w0.get(i6).J(cVar);
        }
    }

    public void U() {
        ArrayList<e> arrayList = this.f37443w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = this.f37443w0.get(i6);
            if (eVar instanceof n) {
                ((n) eVar).U();
            }
        }
    }
}
