package o4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import i4.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o4.n;
/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public final class e<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f27052a;

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f27053a;

        public a(d<Data> dVar) {
            this.f27053a = dVar;
        }

        @Override // o4.o
        public final n<File, Data> b(r rVar) {
            return new e(this.f27053a);
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // o4.e.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // o4.e.d
            public final void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // o4.e.d
            public final ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* compiled from: FileLoader.java */
    /* renamed from: o4.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0448e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* renamed from: o4.e$e$a */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // o4.e.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // o4.e.d
            public final void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // o4.e.d
            public final InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public C0448e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f27052a = dVar;
    }

    @Override // o4.n
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // o4.n
    public final n.a b(File file, int i6, int i10, h4.g gVar) {
        File file2 = file;
        return new n.a(new c5.d(file2), new c(file2, this.f27052a));
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Data> implements i4.d<Data> {

        /* renamed from: u  reason: collision with root package name */
        public final File f27054u;

        /* renamed from: v  reason: collision with root package name */
        public final d<Data> f27055v;

        /* renamed from: w  reason: collision with root package name */
        public Data f27056w;

        public c(File file, d<Data> dVar) {
            this.f27054u = file;
            this.f27055v = dVar;
        }

        @Override // i4.d
        public final Class<Data> a() {
            return this.f27055v.a();
        }

        @Override // i4.d
        public final void b() {
            Data data = this.f27056w;
            if (data != null) {
                try {
                    this.f27055v.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f27055v.c(this.f27054u);
                this.f27056w = c10;
                aVar.f(c10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.d(e10);
            }
        }

        @Override // i4.d
        public final h4.a e() {
            return h4.a.LOCAL;
        }

        @Override // i4.d
        public final void cancel() {
        }
    }
}
