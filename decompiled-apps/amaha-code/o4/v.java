package o4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o4.n;
/* compiled from: UriLoader.java */
/* loaded from: classes.dex */
public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f27112b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f27113a;

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f27114a;

        public a(ContentResolver contentResolver) {
            this.f27114a = contentResolver;
        }

        @Override // o4.v.c
        public final i4.d<AssetFileDescriptor> a(Uri uri) {
            return new i4.a(this.f27114a, uri, 0);
        }

        @Override // o4.o
        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f27115a;

        public b(ContentResolver contentResolver) {
            this.f27115a = contentResolver;
        }

        @Override // o4.v.c
        public final i4.d<ParcelFileDescriptor> a(Uri uri) {
            return new i4.a(this.f27115a, uri, 1);
        }

        @Override // o4.o
        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public interface c<Data> {
        i4.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f27116a;

        public d(ContentResolver contentResolver) {
            this.f27116a = contentResolver;
        }

        @Override // o4.v.c
        public final i4.d<InputStream> a(Uri uri) {
            return new i4.m(this.f27116a, uri);
        }

        @Override // o4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new v(this);
        }
    }

    public v(c<Data> cVar) {
        this.f27113a = cVar;
    }

    @Override // o4.n
    public final boolean a(Uri uri) {
        return f27112b.contains(uri.getScheme());
    }

    @Override // o4.n
    public final n.a b(Uri uri, int i6, int i10, h4.g gVar) {
        Uri uri2 = uri;
        return new n.a(new c5.d(uri2), this.f27113a.a(uri2));
    }
}
