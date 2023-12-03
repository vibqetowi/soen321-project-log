package vr;
/* compiled from: ClientStreamListener.java */
/* loaded from: classes2.dex */
public interface s extends i3 {

    /* compiled from: ClientStreamListener.java */
    /* loaded from: classes2.dex */
    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void b(tr.i0 i0Var, a aVar, tr.c0 c0Var);

    void c(tr.c0 c0Var);
}
