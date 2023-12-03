package androidx.activity.result;

import java.util.HashMap;
/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public final class e extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f981a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f982b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f983c;

    public e(f fVar, String str, e.a aVar) {
        this.f983c = fVar;
        this.f981a = str;
        this.f982b = aVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        f fVar = this.f983c;
        HashMap hashMap = fVar.f986c;
        String str = this.f981a;
        Integer num = (Integer) hashMap.get(str);
        e.a aVar = this.f982b;
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
        this.f983c.f(this.f981a);
    }
}
