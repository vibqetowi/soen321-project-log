package r4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
public interface o {

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final i4.j f30423a;

        /* renamed from: b  reason: collision with root package name */
        public final l4.b f30424b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f30425c;

        public a(l4.b bVar, InputStream inputStream, List list) {
            kc.f.p(bVar);
            this.f30424b = bVar;
            kc.f.p(list);
            this.f30425c = list;
            this.f30423a = new i4.j(inputStream, bVar);
        }

        @Override // r4.o
        public final int a() {
            p pVar = this.f30423a.f19823a;
            pVar.reset();
            return com.bumptech.glide.load.a.a(this.f30424b, pVar, this.f30425c);
        }

        @Override // r4.o
        public final Bitmap b(BitmapFactory.Options options) {
            p pVar = this.f30423a.f19823a;
            pVar.reset();
            return BitmapFactory.decodeStream(pVar, null, options);
        }

        @Override // r4.o
        public final void c() {
            p pVar = this.f30423a.f19823a;
            synchronized (pVar) {
                pVar.f30431w = pVar.f30429u.length;
            }
        }

        @Override // r4.o
        public final ImageHeaderParser.ImageType d() {
            p pVar = this.f30423a.f19823a;
            pVar.reset();
            return com.bumptech.glide.load.a.b(this.f30424b, pVar, this.f30425c);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public final l4.b f30426a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f30427b;

        /* renamed from: c  reason: collision with root package name */
        public final i4.l f30428c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, l4.b bVar) {
            kc.f.p(bVar);
            this.f30426a = bVar;
            kc.f.p(list);
            this.f30427b = list;
            this.f30428c = new i4.l(parcelFileDescriptor);
        }

        @Override // r4.o
        public final int a() {
            p pVar;
            i4.l lVar = this.f30428c;
            l4.b bVar = this.f30426a;
            List<ImageHeaderParser> list = this.f30427b;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ImageHeaderParser imageHeaderParser = list.get(i6);
                try {
                    pVar = new p(new FileInputStream(lVar.a().getFileDescriptor()), bVar);
                    try {
                        int c10 = imageHeaderParser.c(pVar, bVar);
                        try {
                            pVar.close();
                        } catch (IOException unused) {
                        }
                        lVar.a();
                        if (c10 != -1) {
                            return c10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (pVar != null) {
                            try {
                                pVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        lVar.a();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    pVar = null;
                }
            }
            return -1;
        }

        @Override // r4.o
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f30428c.a().getFileDescriptor(), null, options);
        }

        @Override // r4.o
        public final ImageHeaderParser.ImageType d() {
            p pVar;
            i4.l lVar = this.f30428c;
            l4.b bVar = this.f30426a;
            List<ImageHeaderParser> list = this.f30427b;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ImageHeaderParser imageHeaderParser = list.get(i6);
                try {
                    pVar = new p(new FileInputStream(lVar.a().getFileDescriptor()), bVar);
                    try {
                        ImageHeaderParser.ImageType b10 = imageHeaderParser.b(pVar);
                        try {
                            pVar.close();
                        } catch (IOException unused) {
                        }
                        lVar.a();
                        if (b10 != ImageHeaderParser.ImageType.UNKNOWN) {
                            return b10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (pVar != null) {
                            try {
                                pVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        lVar.a();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    pVar = null;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // r4.o
        public final void c() {
        }
    }
}
