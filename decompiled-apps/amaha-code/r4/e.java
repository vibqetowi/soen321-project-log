package r4;

import android.os.ParcelFileDescriptor;
import d5.a;
import java.nio.ByteBuffer;
import r4.o;
/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes.dex */
public final class e implements h4.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30392a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30393b;

    public /* synthetic */ e(int i6, Object obj) {
        this.f30392a = i6;
        this.f30393b = obj;
    }

    @Override // h4.i
    public final boolean a(Object obj, h4.g gVar) {
        int i6 = this.f30392a;
        Object obj2 = this.f30393b;
        switch (i6) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                ((i) obj2).getClass();
                return true;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                ((i) obj2).getClass();
                return true;
            default:
                g4.a aVar = (g4.a) obj;
                return true;
        }
    }

    @Override // h4.i
    public final k4.v b(Object obj, int i6, int i10, h4.g gVar) {
        int i11 = this.f30392a;
        Object obj2 = this.f30393b;
        switch (i11) {
            case 0:
                int i12 = d5.a.f12178a;
                a.C0184a c0184a = new a.C0184a((ByteBuffer) obj);
                i iVar = (i) obj2;
                return iVar.a(new o.a(iVar.f30410c, c0184a, iVar.f30411d), i6, i10, gVar, i.f30406k);
            case 1:
                i iVar2 = (i) obj2;
                return iVar2.a(new o.b((ParcelFileDescriptor) obj, iVar2.f30411d, iVar2.f30410c), i6, i10, gVar, i.f30406k);
            default:
                return c.c(((g4.a) obj).a(), (l4.d) obj2);
        }
    }
}
