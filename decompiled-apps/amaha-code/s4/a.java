package s4;

import i4.e;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes.dex */
public final class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f31267a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: s4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0532a implements e.a<ByteBuffer> {
        @Override // i4.e.a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // i4.e.a
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f31267a = byteBuffer;
    }

    @Override // i4.e
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f31267a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // i4.e
    public final void b() {
    }
}
