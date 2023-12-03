package i4;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import i4.d;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class k<T> implements d<T> {

    /* renamed from: u  reason: collision with root package name */
    public final Uri f19825u;

    /* renamed from: v  reason: collision with root package name */
    public final ContentResolver f19826v;

    /* renamed from: w  reason: collision with root package name */
    public T f19827w;

    public k(ContentResolver contentResolver, Uri uri) {
        this.f19826v = contentResolver;
        this.f19825u = uri;
    }

    @Override // i4.d
    public final void b() {
        T t3 = this.f19827w;
        if (t3 != null) {
            try {
                d(t3);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // i4.d
    public final void c(com.bumptech.glide.d dVar, d.a<? super T> aVar) {
        try {
            ?? r32 = (T) f(this.f19826v, this.f19825u);
            this.f19827w = r32;
            aVar.f(r32);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.d(e10);
        }
    }

    public abstract void d(T t3);

    @Override // i4.d
    public final h4.a e() {
        return h4.a.LOCAL;
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // i4.d
    public final void cancel() {
    }
}
