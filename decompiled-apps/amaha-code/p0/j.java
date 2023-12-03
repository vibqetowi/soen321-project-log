package p0;

import java.util.ArrayList;
import p0.k;
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class j implements s0.a<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f27845a;

    public j(String str) {
        this.f27845a = str;
    }

    @Override // s0.a
    public final void accept(k.a aVar) {
        k.a aVar2 = aVar;
        synchronized (k.f27848c) {
            t.h<String, ArrayList<s0.a<k.a>>> hVar = k.f27849d;
            ArrayList<s0.a<k.a>> orDefault = hVar.getOrDefault(this.f27845a, null);
            if (orDefault != null) {
                hVar.remove(this.f27845a);
                for (int i6 = 0; i6 < orDefault.size(); i6++) {
                    orDefault.get(i6).accept(aVar2);
                }
            }
        }
    }
}
