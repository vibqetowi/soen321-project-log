package hc;

import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class i extends ic.l {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f17380v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ya.i f17381w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ k f17382x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, ya.i iVar, String str, ya.i iVar2) {
        super(iVar);
        this.f17382x = kVar;
        this.f17380v = str;
        this.f17381w = iVar2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ic.g, android.os.IInterface] */
    @Override // ic.l
    public final void a() {
        ya.i iVar = this.f17381w;
        k kVar = this.f17382x;
        String str = this.f17380v;
        try {
            kVar.f17388a.f19955m.f0(kVar.f17389b, k.a(kVar, str), new j(kVar, iVar, str));
        } catch (RemoteException e10) {
            ic.k kVar2 = k.f17387e;
            Object[] objArr = {str};
            kVar2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ic.k.b(kVar2.f19932a, "requestUpdateInfo(%s)", objArr), e10);
            }
            iVar.c(new RuntimeException(e10));
        }
    }
}
