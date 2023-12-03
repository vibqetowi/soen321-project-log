package bw;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: GifRenderingExecutor.java */
/* loaded from: classes2.dex */
public final class c extends ScheduledThreadPoolExecutor {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f4730u = 0;

    /* compiled from: GifRenderingExecutor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f4731a = new c();
    }

    public c() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
