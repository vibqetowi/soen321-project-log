package androidx.activity.result;

import java.util.HashMap;
/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public final class d extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f979b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f980c;

    public d(f fVar, String str, e.a aVar) {
        this.f980c = fVar;
        this.f978a = str;
        this.f979b = aVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        f fVar = this.f980c;
        HashMap hashMap = fVar.f986c;
        String str = this.f978a;
        Integer num = (Integer) hashMap.get(str);
        e.a aVar = this.f979b;
        if (num != null) {
            fVar.f988e.add(str);
            try {
                fVar.b(num.intValue(), aVar, obj);
                return;
            } catch (Exception e10) {
                fVar.f988e.remove(str);
                throw e10;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // androidx.activity.result.c
    public final void b() {
        this.f980c.f(this.f978a);
    }
}
