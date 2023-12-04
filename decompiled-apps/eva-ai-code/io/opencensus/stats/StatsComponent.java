package io.opencensus.stats;
/* loaded from: classes4.dex */
public abstract class StatsComponent {
    public abstract StatsCollectionState getState();

    public abstract StatsRecorder getStatsRecorder();

    public abstract ViewManager getViewManager();

    @Deprecated
    public abstract void setState(StatsCollectionState statsCollectionState);
}
