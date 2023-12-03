package o4;

import android.util.Log;
import i4.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o4.n;
/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes.dex */
public final class c implements n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // o4.o
        public final n<File, ByteBuffer> b(r rVar) {
            return new c();
        }
    }

    @Override // o4.n
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // o4.n
    public final n.a<ByteBuffer> b(File file, int i6, int i10, h4.g gVar) {
        File file2 = file;
        return new n.a<>(new c5.d(file2), new a(file2));
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements i4.d<ByteBuffer> {

        /* renamed from: u  reason: collision with root package name */
        public final File f27046u;

        public a(File file) {
            this.f27046u = file;
        }

        @Override // i4.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(d5.a.a(this.f27046u));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.d(e10);
            }
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
