package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: u  reason: collision with root package name */
    public final Map<String, List<String>> f6423u;

    public MediaDrmCallbackException(b9.h hVar, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.f6423u = map;
    }
}
