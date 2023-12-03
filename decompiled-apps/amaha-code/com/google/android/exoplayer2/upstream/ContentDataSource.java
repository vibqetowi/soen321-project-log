package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import b9.c;
import b9.h;
import c9.w;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class ContentDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final ContentResolver f7147e;
    public Uri f;

    /* renamed from: g  reason: collision with root package name */
    public AssetFileDescriptor f7148g;

    /* renamed from: h  reason: collision with root package name */
    public FileInputStream f7149h;

    /* renamed from: i  reason: collision with root package name */
    public long f7150i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7151j;

    /* loaded from: classes.dex */
    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i6) {
            super(iOException, i6);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f7147e = context.getContentResolver();
    }

    @Override // b9.f
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f7149h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f7149h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f7148g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f7148g = null;
                        if (this.f7151j) {
                            this.f7151j = false;
                            o();
                        }
                    }
                } catch (IOException e10) {
                    throw new ContentDataSourceException(e10, 2000);
                }
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f7149h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f7148g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f7148g = null;
                    if (this.f7151j) {
                        this.f7151j = false;
                        o();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new ContentDataSourceException(e12, 2000);
                }
            } finally {
                this.f7148g = null;
                if (this.f7151j) {
                    this.f7151j = false;
                    o();
                }
            }
        }
    }

    @Override // b9.f
    public final Uri getUri() {
        return this.f;
    }

    @Override // b9.f
    public final long h(h hVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i6 = 2000;
        try {
            Uri uri = hVar.f4128a;
            this.f = uri;
            p(hVar);
            boolean equals = "content".equals(hVar.f4128a.getScheme());
            ContentResolver contentResolver = this.f7147e;
            if (equals) {
                Bundle bundle = new Bundle();
                if (w.f5205a >= 31) {
                    a.a(bundle);
                }
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.f7148g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f7149h = fileInputStream;
                long j10 = hVar.f;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i10 != 0 && j10 > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (skip == j10) {
                    if (i10 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f7150i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f7150i = position;
                            if (position < 0) {
                                throw new ContentDataSourceException(null, 2008);
                            }
                        }
                    } else {
                        long j11 = length - skip;
                        this.f7150i = j11;
                        if (j11 < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                    long j12 = hVar.f4133g;
                    int i11 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                    if (i11 != 0) {
                        long j13 = this.f7150i;
                        if (j13 == -1) {
                            min = j12;
                        } else {
                            min = Math.min(j13, j12);
                        }
                        this.f7150i = min;
                    }
                    this.f7151j = true;
                    q(hVar);
                    if (i11 == 0) {
                        return this.f7150i;
                    }
                    return j12;
                }
                throw new ContentDataSourceException(null, 2008);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
            sb2.append("Could not open file descriptor for: ");
            sb2.append(valueOf);
            throw new ContentDataSourceException(new IOException(sb2.toString()), 2000);
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i6 = 2005;
            }
            throw new ContentDataSourceException(e11, i6);
        }
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f7150i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i10 = (int) Math.min(j10, i10);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f7149h;
        int i11 = w.f5205a;
        int read = fileInputStream.read(bArr, i6, i10);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f7150i;
        if (j11 != -1) {
            this.f7150i = j11 - read;
        }
        n(read);
        return read;
    }
}
