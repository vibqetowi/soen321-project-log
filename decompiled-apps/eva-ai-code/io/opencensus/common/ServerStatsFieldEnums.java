package io.opencensus.common;

import java.util.TreeMap;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public final class ServerStatsFieldEnums {
    private static final int TOTALSIZE = computeTotalSize();

    /* loaded from: classes4.dex */
    public enum Id {
        SERVER_STATS_LB_LATENCY_ID(0),
        SERVER_STATS_SERVICE_LATENCY_ID(1),
        SERVER_STATS_TRACE_OPTION_ID(2);
        
        private static final TreeMap<Integer, Id> map = new TreeMap<>();
        private final int value;

        static {
            Id[] values;
            for (Id id : values()) {
                map.put(Integer.valueOf(id.value), id);
            }
        }

        Id(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }

        @Nullable
        public static Id valueOf(int i) {
            return map.get(Integer.valueOf(i));
        }
    }

    /* loaded from: classes4.dex */
    public enum Size {
        SERVER_STATS_LB_LATENCY_SIZE(8),
        SERVER_STATS_SERVICE_LATENCY_SIZE(8),
        SERVER_STATS_TRACE_OPTION_SIZE(1);
        
        private final int value;

        Size(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    private ServerStatsFieldEnums() {
    }

    private static int computeTotalSize() {
        int i = 0;
        for (Size size : Size.values()) {
            i = i + size.value() + 1;
        }
        return i;
    }

    public static int getTotalSize() {
        return TOTALSIZE;
    }
}
