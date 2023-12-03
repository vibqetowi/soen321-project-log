package kc;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.integrity.internal.zzu;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class h extends mc.h {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ byte[] f23238v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Long f23239w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ya.i f23240x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ b f23241y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ j f23242z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, ya.i iVar, byte[] bArr, Long l2, ya.i iVar2, d dVar) {
        super(iVar);
        this.f23242z = jVar;
        this.f23238v = bArr;
        this.f23239w = l2;
        this.f23240x = iVar2;
        this.f23241y = dVar;
    }

    @Override // mc.h
    public final void a(Exception exc) {
        if (exc instanceof zzu) {
            super.a(new IntegrityServiceException(exc, -9));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.IInterface, mc.e] */
    @Override // mc.h
    public final void b() {
        ya.i iVar = this.f23240x;
        j jVar = this.f23242z;
        try {
            ?? r22 = jVar.f23248c.f25034m;
            byte[] bArr = this.f23238v;
            Long l2 = this.f23239w;
            Bundle bundle = new Bundle();
            bundle.putString("package.name", jVar.f23247b);
            bundle.putByteArray("nonce", bArr);
            if (l2 != null) {
                bundle.putLong("cloud.prj", l2.longValue());
            }
            r22.Z(bundle, new i(jVar, iVar));
        } catch (RemoteException e10) {
            mc.g gVar = jVar.f23246a;
            Object[] objArr = {this.f23241y};
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", mc.g.b(gVar.f25015a, "requestIntegrityToken(%s)", objArr), e10);
            }
            iVar.c(new IntegrityServiceException(e10, -100));
        }
    }
}
