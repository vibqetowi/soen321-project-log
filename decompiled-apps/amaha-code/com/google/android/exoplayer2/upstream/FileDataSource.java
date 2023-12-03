package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import b9.c;
import b9.h;
import c9.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class FileDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public RandomAccessFile f7154e;
    public Uri f;

    /* renamed from: g  reason: collision with root package name */
    public long f7155g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7156h;

    /* loaded from: classes.dex */
    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Exception exc, int i6) {
            super(exc, i6);
        }

        public FileDataSourceException(int i6, String str, FileNotFoundException fileNotFoundException) {
            super(i6, str, fileNotFoundException);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            if ((th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // b9.f
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f7154e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } finally {
            this.f7154e = null;
            if (this.f7156h) {
                this.f7156h = false;
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
        Uri uri = hVar.f4128a;
        long j10 = hVar.f;
        this.f = uri;
        p(hVar);
        int i6 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f7154e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = hVar.f4133g;
                if (j11 == -1) {
                    j11 = this.f7154e.length() - j10;
                }
                this.f7155g = j11;
                if (j11 >= 0) {
                    this.f7156h = true;
                    q(hVar);
                    return this.f7155g;
                }
                throw new FileDataSourceException(2008, null, null);
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e11, (w.f5205a < 21 || !a.b(e11.getCause())) ? 2005 : 2005);
            }
            throw new FileDataSourceException(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11);
        } catch (SecurityException e12) {
            throw new FileDataSourceException(e12, 2006);
        } catch (RuntimeException e13) {
            throw new FileDataSourceException(e13, 2000);
        }
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f7155g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f7154e;
            int i11 = w.f5205a;
            int read = randomAccessFile.read(bArr, i6, (int) Math.min(j10, i10));
            if (read > 0) {
                this.f7155g -= read;
                n(read);
            }
            return read;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
