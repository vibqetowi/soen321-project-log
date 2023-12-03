package o4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import o4.n;
/* compiled from: StringLoader.java */
/* loaded from: classes.dex */
public final class t<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f27108a;

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // o4.o
        public final n<String, AssetFileDescriptor> b(r rVar) {
            return new t(rVar.c(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // o4.o
        public final n<String, ParcelFileDescriptor> b(r rVar) {
            return new t(rVar.c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // o4.o
        public final n<String, InputStream> b(r rVar) {
            return new t(rVar.c(Uri.class, InputStream.class));
        }
    }

    public t(n<Uri, Data> nVar) {
        this.f27108a = nVar;
    }

    @Override // o4.n
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // o4.n
    public final n.a b(String str, int i6, int i10, h4.g gVar) {
        Uri uri;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else if (str2.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            if (parse.getScheme() == null) {
                uri = Uri.fromFile(new File(str2));
            } else {
                uri = parse;
            }
        }
        if (uri == null) {
            return null;
        }
        n<Uri, Data> nVar = this.f27108a;
        if (!nVar.a(uri)) {
            return null;
        }
        return nVar.b(uri, i6, i10, gVar);
    }
}
