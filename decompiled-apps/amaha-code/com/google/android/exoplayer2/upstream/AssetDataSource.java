package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import b9.c;
import b9.h;
import c9.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class AssetDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f7143e;
    public Uri f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f7144g;

    /* renamed from: h  reason: collision with root package name */
    public long f7145h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7146i;

    /* loaded from: classes.dex */
    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(IOException iOException, int i6) {
            super(iOException, i6);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f7143e = context.getAssets();
    }

    @Override // b9.f
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.f7144g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } finally {
            this.f7144g = null;
            if (this.f7146i) {
                this.f7146i = false;
                o();
            }
        }
    }

    @Override // b9.f
    public final Uri getUri() {
        return this.f;
    }

    @Override // b9.f
    public final long h(h hVar) {
        int i6;
        try {
            Uri uri = hVar.f4128a;
            long j10 = hVar.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            p(hVar);
            InputStream open = this.f7143e.open(path, 1);
            this.f7144g = open;
            if (open.skip(j10) >= j10) {
                long j11 = hVar.f4133g;
                if (j11 != -1) {
                    this.f7145h = j11;
                } else {
                    long available = this.f7144g.available();
                    this.f7145h = available;
                    if (available == 2147483647L) {
                        this.f7145h = -1L;
                    }
                }
                this.f7146i = true;
                q(hVar);
                return this.f7145h;
            }
            throw new AssetDataSourceException(null, 2008);
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i6 = 2005;
            } else {
                i6 = 2000;
            }
            throw new AssetDataSourceException(e11, i6);
        }
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f7145h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i10 = (int) Math.min(j10, i10);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        InputStream inputStream = this.f7144g;
        int i11 = w.f5205a;
        int read = inputStream.read(bArr, i6, i10);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f7145h;
        if (j11 != -1) {
            this.f7145h = j11 - read;
        }
        n(read);
        return read;
    }
}
