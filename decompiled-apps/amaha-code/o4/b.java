package o4;

import i4.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o4.n;
/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0447b<Data> f27043a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: o4.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0446a implements InterfaceC0447b<ByteBuffer> {
            @Override // o4.b.InterfaceC0447b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // o4.b.InterfaceC0447b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // o4.o
        public final n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0446a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: o4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0447b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: classes.dex */
        public class a implements InterfaceC0447b<InputStream> {
            @Override // o4.b.InterfaceC0447b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // o4.b.InterfaceC0447b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // o4.o
        public final n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0447b<Data> interfaceC0447b) {
        this.f27043a = interfaceC0447b;
    }

    @Override // o4.n
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // o4.n
    public final n.a b(byte[] bArr, int i6, int i10, h4.g gVar) {
        byte[] bArr2 = bArr;
        return new n.a(new c5.d(bArr2), new c(bArr2, this.f27043a));
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class c<Data> implements i4.d<Data> {

        /* renamed from: u  reason: collision with root package name */
        public final byte[] f27044u;

        /* renamed from: v  reason: collision with root package name */
        public final InterfaceC0447b<Data> f27045v;

        public c(byte[] bArr, InterfaceC0447b<Data> interfaceC0447b) {
            this.f27044u = bArr;
            this.f27045v = interfaceC0447b;
        }

        @Override // i4.d
        public final Class<Data> a() {
            return this.f27045v.a();
        }

        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super Data> aVar) {
            aVar.f((Data) this.f27045v.b(this.f27044u));
        }

        @Override // i4.d
        public final h4.a e() {
            return h4.a.LOCAL;
        }

        @Override // i4.d
        public final void b() {
        }

        @Override // i4.d
        public final void cancel() {
        }
    }
}
