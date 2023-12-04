package com.google.common.base;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class Ticker {
    private static final Ticker SYSTEM_TICKER = new Ticker() { // from class: com.google.common.base.Ticker.1
        @Override // com.google.common.base.Ticker
        public long read() {
            return Platform.systemNanoTime();
        }
    };

    public abstract long read();

    public static Ticker systemTicker() {
        return SYSTEM_TICKER;
    }
}
