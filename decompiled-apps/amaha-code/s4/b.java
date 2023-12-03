package s4;

import java.io.File;
import k4.v;
import kc.f;
/* compiled from: BytesResource.java */
/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31268u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final Object f31269v;

    public b(byte[] bArr) {
        f.p(bArr);
        this.f31269v = bArr;
    }

    @Override // k4.v
    public final int a() {
        switch (this.f31268u) {
            case 0:
                return ((byte[]) this.f31269v).length;
            default:
                return 1;
        }
    }

    @Override // k4.v
    public final Class b() {
        switch (this.f31268u) {
            case 0:
                return byte[].class;
            default:
                return this.f31269v.getClass();
        }
    }

    @Override // k4.v
    public final Object get() {
        int i6 = this.f31268u;
        Object obj = this.f31269v;
        switch (i6) {
            case 0:
                return (byte[]) obj;
            default:
                return obj;
        }
    }

    public b(File file) {
        f.p(file);
        this.f31269v = file;
    }

    @Override // k4.v
    public final void recycle() {
    }
}
