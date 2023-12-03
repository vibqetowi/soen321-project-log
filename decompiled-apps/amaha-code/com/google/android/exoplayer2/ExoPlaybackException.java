package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.i;
/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int A;
    public final o8.f B;
    public final boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final int f6154w;

    /* renamed from: x  reason: collision with root package name */
    public final String f6155x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6156y;

    /* renamed from: z  reason: collision with root package name */
    public final n f6157z;

    public ExoPlaybackException(int i6, Throwable th2, int i10) {
        this(i6, th2, i10, null, -1, null, 4, false);
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle a10 = super.a();
        a10.putInt(PlaybackException.b(1001), this.f6154w);
        a10.putString(PlaybackException.b(1002), this.f6155x);
        a10.putInt(PlaybackException.b(1003), this.f6156y);
        a10.putBundle(PlaybackException.b(1004), c9.a.d(this.f6157z));
        a10.putInt(PlaybackException.b(1005), this.A);
        a10.putBoolean(PlaybackException.b(1006), this.C);
        return a10;
    }

    public final ExoPlaybackException c(i.a aVar) {
        String message = getMessage();
        int i6 = c9.w.f5205a;
        return new ExoPlaybackException(message, getCause(), this.f6160u, this.f6154w, this.f6155x, this.f6156y, this.f6157z, this.A, aVar, this.f6161v, this.C);
    }

    public ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.f6154w = bundle.getInt(PlaybackException.b(1001), 2);
        this.f6155x = bundle.getString(PlaybackException.b(1002));
        this.f6156y = bundle.getInt(PlaybackException.b(1003), -1);
        this.f6157z = (n) c9.a.b(n.f6649b0, bundle.getBundle(PlaybackException.b(1004)));
        this.A = bundle.getInt(PlaybackException.b(1005), 4);
        this.C = bundle.getBoolean(PlaybackException.b(1006), false);
        this.B = null;
    }

    public ExoPlaybackException(String str, Throwable th2, int i6, int i10, String str2, int i11, n nVar, int i12, i.a aVar, long j10, boolean z10) {
        super(str, th2, i6, j10);
        boolean z11 = false;
        sc.b.q(!z10 || i10 == 1);
        sc.b.q((th2 != null || i10 == 3) ? true : true);
        this.f6154w = i10;
        this.f6155x = str2;
        this.f6156y = i11;
        this.f6157z = nVar;
        this.A = i12;
        this.B = aVar;
        this.C = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExoPlaybackException(int i6, Throwable th2, int i10, String str, int i11, n nVar, int i12, boolean z10) {
        this(r1, th2, i10, i6, str, i11, nVar, i12, null, SystemClock.elapsedRealtime(), z10);
        String str2;
        String str3;
        if (i6 == 0) {
            str2 = "Source error";
        } else if (i6 != 1) {
            str2 = i6 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String valueOf = String.valueOf(nVar);
            int i13 = c9.w.f5205a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i12 != 4) {
                throw new IllegalStateException();
            } else {
                str3 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str3.length() + valueOf.length() + ri.e.c(str, 53));
            sb2.append(str);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(valueOf);
            sb2.append(", format_supported=");
            sb2.append(str3);
            str2 = sb2.toString();
        }
        if (!TextUtils.isEmpty(null)) {
            String valueOf2 = String.valueOf(str2);
            StringBuilder sb3 = new StringBuilder("null".length() + valueOf2.length() + 2);
            sb3.append(valueOf2);
            sb3.append(": null");
            str2 = sb3.toString();
        }
    }
}
