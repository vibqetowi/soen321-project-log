package o4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import o4.n;
/* compiled from: ResourceLoader.java */
/* loaded from: classes.dex */
public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f27102a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f27103b;

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f27104a;

        public a(Resources resources) {
            this.f27104a = resources;
        }

        @Override // o4.o
        public final n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f27104a, rVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f27105a;

        public b(Resources resources) {
            this.f27105a = resources;
        }

        @Override // o4.o
        public final n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f27105a, rVar.c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f27106a;

        public c(Resources resources) {
            this.f27106a = resources;
        }

        @Override // o4.o
        public final n<Integer, InputStream> b(r rVar) {
            return new s(this.f27106a, rVar.c(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f27107a;

        public d(Resources resources) {
            this.f27107a = resources;
        }

        @Override // o4.o
        public final n<Integer, Uri> b(r rVar) {
            return new s(this.f27107a, u.f27109a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f27103b = resources;
        this.f27102a = nVar;
    }

    @Override // o4.n
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // o4.n
    public final n.a b(Integer num, int i6, int i10, h4.g gVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f27103b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f27102a.b(uri, i6, i10, gVar);
    }
}
