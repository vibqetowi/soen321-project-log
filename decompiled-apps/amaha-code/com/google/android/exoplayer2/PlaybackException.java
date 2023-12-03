package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class PlaybackException extends Exception implements f {

    /* renamed from: u  reason: collision with root package name */
    public final int f6160u;

    /* renamed from: v  reason: collision with root package name */
    public final long f6161v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaybackException(Bundle bundle) {
        this(r2, r3, bundle.getInt(b(0), 1000), bundle.getLong(b(1), SystemClock.elapsedRealtime()));
        RemoteException remoteException;
        RemoteException remoteException2;
        String string = bundle.getString(b(2));
        String string2 = bundle.getString(b(3));
        String string3 = bundle.getString(b(4));
        if (!TextUtils.isEmpty(string2)) {
            try {
                Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                r6 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
            } catch (Throwable unused) {
                remoteException = new RemoteException(string3);
            }
            if (r6 == null) {
                remoteException = new RemoteException(string3);
                remoteException2 = remoteException;
            }
        }
        remoteException2 = r6;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.f6160u);
        bundle.putLong(b(1), this.f6161v);
        bundle.putString(b(2), getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(b(3), cause.getClass().getName());
            bundle.putString(b(4), cause.getMessage());
        }
        return bundle;
    }

    public PlaybackException(String str, Throwable th2, int i6, long j10) {
        super(str, th2);
        this.f6160u = i6;
        this.f6161v = j10;
    }
}
