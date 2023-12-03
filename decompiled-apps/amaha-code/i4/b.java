package i4;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i4.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: u  reason: collision with root package name */
    public final String f19803u;

    /* renamed from: v  reason: collision with root package name */
    public final AssetManager f19804v;

    /* renamed from: w  reason: collision with root package name */
    public Closeable f19805w;

    public b(AssetManager assetManager, String str) {
        this.f19804v = assetManager;
        this.f19803u = str;
    }

    @Override // i4.d
    public final void b() {
        Closeable closeable = this.f19805w;
        if (closeable == null) {
            return;
        }
        try {
            switch (((h) this).f19817x) {
                case 0:
                    ((ParcelFileDescriptor) closeable).close();
                    break;
                default:
                    ((InputStream) closeable).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // i4.d
    public final void c(com.bumptech.glide.d dVar, d.a<? super T> aVar) {
        Closeable parcelFileDescriptor;
        try {
            AssetManager assetManager = this.f19804v;
            String str = this.f19803u;
            switch (((h) this).f19817x) {
                case 0:
                    parcelFileDescriptor = assetManager.openFd(str).getParcelFileDescriptor();
                    break;
                default:
                    parcelFileDescriptor = assetManager.open(str);
                    break;
            }
            this.f19805w = parcelFileDescriptor;
            aVar.f(parcelFileDescriptor);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
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
