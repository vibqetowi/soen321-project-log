package fe;
/* compiled from: FieldValue.java */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final e f14997a;

    /* compiled from: FieldValue.java */
    /* loaded from: classes.dex */
    public static class a extends k {
        @Override // fe.k
        public final String a() {
            return "FieldValue.arrayRemove";
        }
    }

    /* compiled from: FieldValue.java */
    /* loaded from: classes.dex */
    public static class b extends k {
        @Override // fe.k
        public final String a() {
            return "FieldValue.arrayUnion";
        }
    }

    /* compiled from: FieldValue.java */
    /* loaded from: classes.dex */
    public static class c extends k {
        @Override // fe.k
        public final String a() {
            return "FieldValue.delete";
        }
    }

    /* compiled from: FieldValue.java */
    /* loaded from: classes.dex */
    public static class d extends k {
        @Override // fe.k
        public final String a() {
            return "FieldValue.increment";
        }
    }

    /* compiled from: FieldValue.java */
    /* loaded from: classes.dex */
    public static class e extends k {
        @Override // fe.k
        public final String a() {
            return "FieldValue.serverTimestamp";
        }
    }

    static {
        new c();
        f14997a = new e();
    }

    public abstract String a();
}
