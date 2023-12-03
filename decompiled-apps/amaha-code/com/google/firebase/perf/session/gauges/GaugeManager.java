package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import bf.a;
import bf.m;
import bf.p;
import hd.g;
import hd.l;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jf.e;
import kf.i;
import kf.j;
import lf.d;
import lf.f;
import lf.g;
import p002if.b;
import p002if.c;
import p002if.f;
@Keep
/* loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private d applicationProcessState;
    private final a configResolver;
    private final l<b> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final l<ScheduledExecutorService> gaugeManagerExecutor;
    private p002if.d gaugeMetadataManager;
    private final l<f> memoryGaugeCollector;
    private String sessionId;
    private final e transportManager;
    private static final df.a logger = df.a.d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new l(new g(6)), e.M, a.e(), null, new l(new g(7)), new l(new g(8)));
    }

    private static void collectGaugeMetricOnce(b bVar, f fVar, i iVar) {
        synchronized (bVar) {
            try {
                bVar.f20010b.schedule(new p002if.a(bVar, iVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                df.a aVar = b.f20007g;
                aVar.f("Unable to collect Cpu Metric: " + e10.getMessage());
            }
        }
        fVar.a(iVar);
    }

    private long getCpuGaugeCollectionFrequencyMs(d dVar) {
        long n10;
        m mVar;
        int ordinal = dVar.ordinal();
        boolean z10 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                n10 = -1;
            } else {
                a aVar = this.configResolver;
                aVar.getClass();
                synchronized (m.class) {
                    if (m.f4267v == null) {
                        m.f4267v = new m();
                    }
                    mVar = m.f4267v;
                }
                kf.e<Long> k10 = aVar.k(mVar);
                if (k10.b() && a.t(k10.a().longValue())) {
                    n10 = k10.a().longValue();
                } else {
                    kf.e<Long> m10 = aVar.m(mVar);
                    if (m10.b() && a.t(m10.a().longValue())) {
                        aVar.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                        n10 = m10.a().longValue();
                    } else {
                        kf.e<Long> c10 = aVar.c(mVar);
                        if (c10.b() && a.t(c10.a().longValue())) {
                            n10 = c10.a().longValue();
                        } else {
                            Long l2 = 0L;
                            n10 = l2.longValue();
                        }
                    }
                }
            }
        } else {
            n10 = this.configResolver.n();
        }
        df.a aVar2 = b.f20007g;
        if (n10 > 0) {
            z10 = false;
        }
        if (z10) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return n10;
    }

    private lf.f getGaugeMetadata() {
        f.a R = lf.f.R();
        int b10 = j.b((this.gaugeMetadataManager.f20020c.totalMem * 1) / 1024);
        R.u();
        lf.f.O((lf.f) R.f10073v, b10);
        int b11 = j.b((this.gaugeMetadataManager.f20018a.maxMemory() * 1) / 1024);
        R.u();
        lf.f.M((lf.f) R.f10073v, b11);
        int b12 = j.b((this.gaugeMetadataManager.f20019b.getMemoryClass() * 1048576) / 1024);
        R.u();
        lf.f.N((lf.f) R.f10073v, b12);
        return R.r();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(d dVar) {
        long o10;
        p pVar;
        int ordinal = dVar.ordinal();
        boolean z10 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                o10 = -1;
            } else {
                a aVar = this.configResolver;
                aVar.getClass();
                synchronized (p.class) {
                    if (p.f4270v == null) {
                        p.f4270v = new p();
                    }
                    pVar = p.f4270v;
                }
                kf.e<Long> k10 = aVar.k(pVar);
                if (k10.b() && a.t(k10.a().longValue())) {
                    o10 = k10.a().longValue();
                } else {
                    kf.e<Long> m10 = aVar.m(pVar);
                    if (m10.b() && a.t(m10.a().longValue())) {
                        aVar.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                        o10 = m10.a().longValue();
                    } else {
                        kf.e<Long> c10 = aVar.c(pVar);
                        if (c10.b() && a.t(c10.a().longValue())) {
                            o10 = c10.a().longValue();
                        } else {
                            Long l2 = 0L;
                            o10 = l2.longValue();
                        }
                    }
                }
            }
        } else {
            o10 = this.configResolver.o();
        }
        df.a aVar2 = p002if.f.f;
        if (o10 > 0) {
            z10 = false;
        }
        if (z10) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return o10;
    }

    public static /* synthetic */ b lambda$new$0() {
        return new b();
    }

    public static /* synthetic */ p002if.f lambda$new$1() {
        return new p002if.f();
    }

    private boolean startCollectingCpuMetrics(long j10, i iVar) {
        boolean z10;
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        b bVar = this.cpuGaugeCollector.get();
        long j11 = bVar.f20012d;
        if (j11 != INVALID_GAUGE_COLLECTION_FREQUENCY && j11 != 0) {
            if (j10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                ScheduledFuture scheduledFuture = bVar.f20013e;
                if (scheduledFuture != null) {
                    if (bVar.f != j10) {
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            bVar.f20013e = null;
                            bVar.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
                        }
                        bVar.a(j10, iVar);
                    }
                } else {
                    bVar.a(j10, iVar);
                }
            }
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, i iVar) {
        boolean z10;
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        p002if.f fVar = this.memoryGaugeCollector.get();
        df.a aVar = p002if.f.f;
        if (j10 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            fVar.getClass();
        } else {
            ScheduledFuture scheduledFuture = fVar.f20027d;
            if (scheduledFuture != null) {
                if (fVar.f20028e != j10) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        fVar.f20027d = null;
                        fVar.f20028e = INVALID_GAUGE_COLLECTION_FREQUENCY;
                    }
                    fVar.b(j10, iVar);
                }
            } else {
                fVar.b(j10, iVar);
            }
        }
        return true;
    }

    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, d dVar) {
        g.a W = lf.g.W();
        while (!this.cpuGaugeCollector.get().f20009a.isEmpty()) {
            W.u();
            lf.g.P((lf.g) W.f10073v, this.cpuGaugeCollector.get().f20009a.poll());
        }
        while (!this.memoryGaugeCollector.get().f20025b.isEmpty()) {
            W.u();
            lf.g.N((lf.g) W.f10073v, this.memoryGaugeCollector.get().f20025b.poll());
        }
        W.u();
        lf.g.M((lf.g) W.f10073v, str);
        e eVar = this.transportManager;
        eVar.C.execute(new androidx.emoji2.text.g(18, eVar, W.r(), dVar));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new p002if.d(context);
    }

    public boolean logGaugeMetadata(String str, d dVar) {
        if (this.gaugeMetadataManager != null) {
            g.a W = lf.g.W();
            W.u();
            lf.g.M((lf.g) W.f10073v, str);
            lf.f gaugeMetadata = getGaugeMetadata();
            W.u();
            lf.g.O((lf.g) W.f10073v, gaugeMetadata);
            e eVar = this.transportManager;
            eVar.C.execute(new androidx.emoji2.text.g(18, eVar, W.r(), dVar));
            return true;
        }
        return false;
    }

    public void startCollectingGauges(hf.a aVar, d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, aVar.f17593v);
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = aVar.f17592u;
        this.sessionId = str;
        this.applicationProcessState = dVar;
        try {
            long j10 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new c(this, str, dVar, 1), j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            df.a aVar2 = logger;
            aVar2.f("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        d dVar = this.applicationProcessState;
        b bVar = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = bVar.f20013e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bVar.f20013e = null;
            bVar.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        p002if.f fVar = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = fVar.f20027d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            fVar.f20027d = null;
            fVar.f20028e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new c(this, str, dVar, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(l<ScheduledExecutorService> lVar, e eVar, a aVar, p002if.d dVar, l<b> lVar2, l<p002if.f> lVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lVar;
        this.transportManager = eVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = dVar;
        this.cpuGaugeCollector = lVar2;
        this.memoryGaugeCollector = lVar3;
    }

    public void collectGaugeMetricOnce(i iVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), iVar);
    }

    private long startCollectingGauges(d dVar, i iVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, iVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, iVar) ? cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
