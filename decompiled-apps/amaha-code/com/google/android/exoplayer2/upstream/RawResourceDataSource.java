package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import b9.c;
import b9.h;
import c9.w;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class RawResourceDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final Resources f7173e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f7174g;

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f7175h;

    /* renamed from: i  reason: collision with root package name */
    public FileInputStream f7176i;

    /* renamed from: j  reason: collision with root package name */
    public long f7177j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7178k;

    /* loaded from: classes.dex */
    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(int i6, String str, Exception exc) {
            super(i6, str, exc);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f7173e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i6) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(i6);
        return Uri.parse(sb2.toString());
    }

    @Override // b9.f
    public final void close() {
        this.f7174g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f7176i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f7176i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f7175h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new RawResourceDataSourceException(2000, null, e10);
                    }
                } finally {
                    this.f7175h = null;
                    if (this.f7178k) {
                        this.f7178k = false;
                        o();
                    }
                }
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(2000, null, e11);
            }
        } catch (Throwable th2) {
            this.f7176i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f7175h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f7175h = null;
                    if (this.f7178k) {
                        this.f7178k = false;
                        o();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new RawResourceDataSourceException(2000, null, e12);
                }
            } finally {
                this.f7175h = null;
                if (this.f7178k) {
                    this.f7178k = false;
                    o();
                }
            }
        }
    }

    @Override // b9.f
    public final Uri getUri() {
        return this.f7174g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r3.matches("\\d+") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    @Override // b9.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(h hVar) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long min;
        String concat;
        String str;
        Uri uri = hVar.f4128a;
        this.f7174g = uri;
        boolean equals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.f7173e;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (TextUtils.equals("android.resource", uri.getScheme())) {
                        String path = uri.getPath();
                        path.getClass();
                        if (path.startsWith("/")) {
                            path = path.substring(1);
                        }
                        String host = uri.getHost();
                        if (TextUtils.isEmpty(host)) {
                            concat = "";
                        } else {
                            concat = String.valueOf(host).concat(":");
                        }
                        String valueOf = String.valueOf(concat);
                        String valueOf2 = String.valueOf(path);
                        if (valueOf2.length() != 0) {
                            str = valueOf.concat(valueOf2);
                        } else {
                            str = new String(valueOf);
                        }
                        parseInt = resources.getIdentifier(str, "raw", this.f);
                        if (parseInt == 0) {
                            throw new RawResourceDataSourceException(2005, "Resource not found.", null);
                        }
                        p(hVar);
                        openRawResourceFd = resources.openRawResourceFd(parseInt);
                        this.f7175h = openRawResourceFd;
                        if (openRawResourceFd == null) {
                            long length = openRawResourceFd.getLength();
                            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                            this.f7176i = fileInputStream;
                            long j10 = hVar.f;
                            int i6 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                            try {
                                if (i6 != 0 && j10 > length) {
                                    throw new RawResourceDataSourceException(2008, null, null);
                                }
                                long startOffset = openRawResourceFd.getStartOffset();
                                long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                                if (skip == j10) {
                                    if (i6 == 0) {
                                        FileChannel channel = fileInputStream.getChannel();
                                        if (channel.size() == 0) {
                                            this.f7177j = -1L;
                                        } else {
                                            long size = channel.size() - channel.position();
                                            this.f7177j = size;
                                            if (size < 0) {
                                                throw new RawResourceDataSourceException(2008, null, null);
                                            }
                                        }
                                    } else {
                                        long j11 = length - skip;
                                        this.f7177j = j11;
                                        if (j11 < 0) {
                                            throw new DataSourceException(2008);
                                        }
                                    }
                                    long j12 = hVar.f4133g;
                                    int i10 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                                    if (i10 != 0) {
                                        long j13 = this.f7177j;
                                        if (j13 == -1) {
                                            min = j12;
                                        } else {
                                            min = Math.min(j13, j12);
                                        }
                                        this.f7177j = min;
                                    }
                                    this.f7178k = true;
                                    q(hVar);
                                    if (i10 == 0) {
                                        return this.f7177j;
                                    }
                                    return j12;
                                }
                                throw new RawResourceDataSourceException(2008, null, null);
                            } catch (RawResourceDataSourceException e10) {
                                throw e10;
                            } catch (IOException e11) {
                                throw new RawResourceDataSourceException(2000, null, e11);
                            }
                        }
                        String valueOf3 = String.valueOf(uri);
                        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 24);
                        sb2.append("Resource is compressed: ");
                        sb2.append(valueOf3);
                        throw new RawResourceDataSourceException(2000, sb2.toString(), null);
                    }
                    throw new RawResourceDataSourceException(1004, "URI must either use scheme rawresource or android.resource", null);
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.f7175h = openRawResourceFd;
                if (openRawResourceFd == null) {
                }
            } catch (Resources.NotFoundException e12) {
                throw new RawResourceDataSourceException(2005, null, e12);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            p(hVar);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException(1004, "Resource identifier must be an integer.", null);
        }
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f7177j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i10 = (int) Math.min(j10, i10);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(2000, null, e10);
            }
        }
        FileInputStream fileInputStream = this.f7176i;
        int i11 = w.f5205a;
        int read = fileInputStream.read(bArr, i6, i10);
        if (read == -1) {
            if (this.f7177j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j11 = this.f7177j;
        if (j11 != -1) {
            this.f7177j = j11 - read;
        }
        n(read);
        return read;
    }
}
