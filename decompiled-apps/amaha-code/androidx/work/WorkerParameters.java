package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f3200a;

    /* renamed from: b  reason: collision with root package name */
    public final d f3201b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f3202c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3203d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3204e;
    public final Executor f;

    /* renamed from: g  reason: collision with root package name */
    public final y2.a f3205g;

    /* renamed from: h  reason: collision with root package name */
    public final y f3206h;

    /* renamed from: i  reason: collision with root package name */
    public final t f3207i;

    /* renamed from: j  reason: collision with root package name */
    public final h f3208j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f3209a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f3210b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f3211c;
    }

    public WorkerParameters(UUID uuid, d dVar, List list, a aVar, int i6, ExecutorService executorService, y2.a aVar2, x xVar, w2.y yVar, w2.w wVar) {
        this.f3200a = uuid;
        this.f3201b = dVar;
        this.f3202c = new HashSet(list);
        this.f3203d = aVar;
        this.f3204e = i6;
        this.f = executorService;
        this.f3205g = aVar2;
        this.f3206h = xVar;
        this.f3207i = yVar;
        this.f3208j = wVar;
    }
}
