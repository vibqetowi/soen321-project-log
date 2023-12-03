package com.google.android.exoplayer2.ui;

import com.google.android.exoplayer2.ui.c;
/* compiled from: TimeBar.java */
/* loaded from: classes.dex */
public interface e {

    /* compiled from: TimeBar.java */
    /* loaded from: classes.dex */
    public interface a {
        void d(long j10);

        void j(long j10);

        void k(long j10, boolean z10);
    }

    void a(long[] jArr, boolean[] zArr, int i6);

    void b(c.b bVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
