package com.google.android.exoplayer2.drm;

import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern m(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaParser$InputReader m6531m(Object obj) {
        return (MediaParser$InputReader) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m6532m(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ NetworkEvent.Builder m6533m() {
        return new NetworkEvent.Builder();
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ PlaybackErrorEvent.Builder m6534m() {
        return new PlaybackErrorEvent.Builder();
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ PlaybackMetrics.Builder m6535m() {
        return new PlaybackMetrics.Builder();
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m6536m(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ PlaybackStateEvent.Builder m6537m() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder m(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ void m6539m() {
    }
}
