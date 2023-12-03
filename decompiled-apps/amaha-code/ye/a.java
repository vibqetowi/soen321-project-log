package ye;
/* compiled from: MessagingClientEvent.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f38510a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38511b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38512c;

    /* renamed from: d  reason: collision with root package name */
    public final b f38513d;

    /* renamed from: e  reason: collision with root package name */
    public final c f38514e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f38515g;

    /* renamed from: i  reason: collision with root package name */
    public final int f38517i;

    /* renamed from: j  reason: collision with root package name */
    public final String f38518j;

    /* renamed from: l  reason: collision with root package name */
    public final EnumC0650a f38520l;

    /* renamed from: m  reason: collision with root package name */
    public final String f38521m;

    /* renamed from: o  reason: collision with root package name */
    public final String f38523o;

    /* renamed from: h  reason: collision with root package name */
    public final int f38516h = 0;

    /* renamed from: k  reason: collision with root package name */
    public final long f38519k = 0;

    /* renamed from: n  reason: collision with root package name */
    public final long f38522n = 0;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: ye.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0650a implements de.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f38526u;

        EnumC0650a(int i6) {
            this.f38526u = i6;
        }

        @Override // de.c
        public final int e() {
            return this.f38526u;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes.dex */
    public enum b implements de.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f38530u;

        b(int i6) {
            this.f38530u = i6;
        }

        @Override // de.c
        public final int e() {
            return this.f38530u;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes.dex */
    public enum c implements de.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f38533u;

        c(int i6) {
            this.f38533u = i6;
        }

        @Override // de.c
        public final int e() {
            return this.f38533u;
        }
    }

    public a(long j10, String str, String str2, b bVar, c cVar, String str3, String str4, int i6, String str5, EnumC0650a enumC0650a, String str6, String str7) {
        this.f38510a = j10;
        this.f38511b = str;
        this.f38512c = str2;
        this.f38513d = bVar;
        this.f38514e = cVar;
        this.f = str3;
        this.f38515g = str4;
        this.f38517i = i6;
        this.f38518j = str5;
        this.f38520l = enumC0650a;
        this.f38521m = str6;
        this.f38523o = str7;
    }
}
