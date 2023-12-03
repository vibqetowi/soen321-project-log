package tr;
/* compiled from: ChannelLogger.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* compiled from: ChannelLogger.java */
    /* loaded from: classes2.dex */
    public enum a {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public abstract void a(a aVar, String str);

    public abstract void b(a aVar, String str, Object... objArr);
}
