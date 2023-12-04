package org.threeten.bp.temporal;

import java.util.List;
/* loaded from: classes5.dex */
public interface TemporalAmount {
    Temporal addTo(Temporal temporal);

    long get(TemporalUnit temporalUnit);

    List<TemporalUnit> getUnits();

    Temporal subtractFrom(Temporal temporal);
}
