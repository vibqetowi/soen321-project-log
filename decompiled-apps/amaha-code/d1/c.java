package d1;

import java.nio.ByteBuffer;
import kotlinx.coroutines.e0;
/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f12129a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f12130b;

    /* renamed from: c  reason: collision with root package name */
    public int f12131c;

    /* renamed from: d  reason: collision with root package name */
    public int f12132d;

    public c() {
        if (e0.f23499v == null) {
            e0.f23499v = new e0();
        }
    }

    public final int a(int i6) {
        if (i6 < this.f12132d) {
            return this.f12130b.getShort(this.f12131c + i6);
        }
        return 0;
    }

    public final void b(int i6, ByteBuffer byteBuffer) {
        this.f12130b = byteBuffer;
        if (byteBuffer != null) {
            this.f12129a = i6;
            int i10 = i6 - byteBuffer.getInt(i6);
            this.f12131c = i10;
            this.f12132d = this.f12130b.getShort(i10);
            return;
        }
        this.f12129a = 0;
        this.f12131c = 0;
        this.f12132d = 0;
    }
}
