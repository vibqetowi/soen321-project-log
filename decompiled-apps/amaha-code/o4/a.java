package o4;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import o4.n;
/* compiled from: AssetUriLoader.java */
/* loaded from: classes.dex */
public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f27039a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0445a<Data> f27040b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: o4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0445a<Data> {
        i4.h a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0445a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f27041a;

        public b(AssetManager assetManager) {
            this.f27041a = assetManager;
        }

        @Override // o4.a.InterfaceC0445a
        public final i4.h a(AssetManager assetManager, String str) {
            return new i4.h(assetManager, str, 0);
        }

        @Override // o4.o
        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.f27041a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0445a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f27042a;

        public c(AssetManager assetManager) {
            this.f27042a = assetManager;
        }

        @Override // o4.a.InterfaceC0445a
        public final i4.h a(AssetManager assetManager, String str) {
            return new i4.h(assetManager, str, 1);
        }

        @Override // o4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new a(this.f27042a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0445a<Data> interfaceC0445a) {
        this.f27039a = assetManager;
        this.f27040b = interfaceC0445a;
    }

    @Override // o4.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (!"file".equals(uri2.getScheme()) || uri2.getPathSegments().isEmpty() || !"android_asset".equals(uri2.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // o4.n
    public final n.a b(Uri uri, int i6, int i10, h4.g gVar) {
        Uri uri2 = uri;
        return new n.a(new c5.d(uri2), this.f27040b.a(this.f27039a, uri2.toString().substring(22)));
    }
}
