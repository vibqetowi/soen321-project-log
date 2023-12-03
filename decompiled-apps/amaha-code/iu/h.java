package iu;
/* compiled from: ExternalOverridabilityCondition.java */
/* loaded from: classes2.dex */
public interface h {

    /* compiled from: ExternalOverridabilityCondition.java */
    /* loaded from: classes2.dex */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    /* loaded from: classes2.dex */
    public enum b {
        OVERRIDABLE,
        /* JADX INFO: Fake field, exist only in values array */
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    b a(gt.a aVar, gt.a aVar2, gt.e eVar);

    a b();
}
