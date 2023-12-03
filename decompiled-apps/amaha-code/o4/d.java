package o4;

import android.util.Base64;
import i4.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o4.n;
/* compiled from: DataUrlLoader.java */
/* loaded from: classes.dex */
public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f27047a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a f27051a = new a();

        /* compiled from: DataUrlLoader.java */
        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // o4.o
        public final n<Model, InputStream> b(r rVar) {
            return new d(this.f27051a);
        }
    }

    public d(c.a aVar) {
        this.f27047a = aVar;
    }

    @Override // o4.n
    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // o4.n
    public final n.a<Data> b(Model model, int i6, int i10, h4.g gVar) {
        return new n.a<>(new c5.d(model), new b(model.toString(), this.f27047a));
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class b<Data> implements i4.d<Data> {

        /* renamed from: u  reason: collision with root package name */
        public final String f27048u;

        /* renamed from: v  reason: collision with root package name */
        public final a<Data> f27049v;

        /* renamed from: w  reason: collision with root package name */
        public ByteArrayInputStream f27050w;

        public b(String str, a<Data> aVar) {
            this.f27048u = str;
            this.f27049v = aVar;
        }

        @Override // i4.d
        public final Class<Data> a() {
            this.f27049v.getClass();
            return InputStream.class;
        }

        @Override // i4.d
        public final void b() {
            try {
                a<Data> aVar = this.f27049v;
                ByteArrayInputStream byteArrayInputStream = this.f27050w;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a10 = ((c.a) this.f27049v).a(this.f27048u);
                this.f27050w = a10;
                aVar.f(a10);
            } catch (IllegalArgumentException e10) {
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
