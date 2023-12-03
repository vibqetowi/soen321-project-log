package c7;

import android.util.SparseArray;
/* compiled from: QosTier.java */
/* loaded from: classes.dex */
public enum p {
    DEFAULT,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY,
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER,
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED;

    static {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        p pVar5;
        p pVar6 = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, pVar6);
        sparseArray.put(1, pVar);
        sparseArray.put(2, pVar2);
        sparseArray.put(3, pVar3);
        sparseArray.put(4, pVar4);
        sparseArray.put(-1, pVar5);
    }
}
