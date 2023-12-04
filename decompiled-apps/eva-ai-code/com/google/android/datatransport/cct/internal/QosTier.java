package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
/* loaded from: classes2.dex */
public enum QosTier {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<QosTier> valueMap;
    private final int value;

    static {
        QosTier qosTier = DEFAULT;
        QosTier qosTier2 = UNMETERED_ONLY;
        QosTier qosTier3 = UNMETERED_OR_DAILY;
        QosTier qosTier4 = FAST_IF_RADIO_AWAKE;
        QosTier qosTier5 = NEVER;
        QosTier qosTier6 = UNRECOGNIZED;
        SparseArray<QosTier> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, qosTier);
        sparseArray.put(1, qosTier2);
        sparseArray.put(2, qosTier3);
        sparseArray.put(3, qosTier4);
        sparseArray.put(4, qosTier5);
        sparseArray.put(-1, qosTier6);
    }

    QosTier(int i) {
        this.value = i;
    }

    public final int getNumber() {
        return this.value;
    }

    public static QosTier forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }
}
