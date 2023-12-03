package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.f;
import e.a;
/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f959u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a.C0212a f960v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f961w;

    public e(ComponentActivity.b bVar, int i6, a.C0212a c0212a) {
        this.f961w = bVar;
        this.f959u = i6;
        this.f960v = c0212a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b<O> bVar;
        T t3 = this.f960v.f13698a;
        ComponentActivity.b bVar2 = this.f961w;
        String str = (String) bVar2.f985b.get(Integer.valueOf(this.f959u));
        if (str != null) {
            f.a aVar = (f.a) bVar2.f.get(str);
            if (aVar != null && (bVar = aVar.f991a) != 0) {
                if (bVar2.f988e.remove(str)) {
                    bVar.b(t3);
                    return;
                }
                return;
            }
            bVar2.f990h.remove(str);
            bVar2.f989g.put(str, t3);
        }
    }
}
