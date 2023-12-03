package o8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: LoadEventInfo.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicLong f27264b = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f27265a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(long j10, b9.h hVar, long j11) {
        this(Collections.emptyMap());
        Uri uri = hVar.f4128a;
    }

    public d(Map map) {
        this.f27265a = map;
    }
}
