package w3;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.atomic.AtomicInteger;
import ta.v;
/* compiled from: EventPipeline.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final u3.b f36375a;

    /* renamed from: e  reason: collision with root package name */
    public final y3.j f36379e;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f36378d = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f36381h = new AtomicInteger(1);
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f36380g = false;

    /* renamed from: b  reason: collision with root package name */
    public final iv.a f36376b = v.c(SubsamplingScaleImageView.TILE_SIZE_AUTO, null, 6);

    /* renamed from: c  reason: collision with root package name */
    public final iv.a f36377c = v.c(SubsamplingScaleImageView.TILE_SIZE_AUTO, null, 6);

    public f(u3.b bVar) {
        this.f36375a = bVar;
        this.f36379e = new y3.j(bVar.f33766a);
        Runtime.getRuntime().addShutdownHook(new b(this));
    }
}
