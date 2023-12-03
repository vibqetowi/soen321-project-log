package w5;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: CallbackManagerImpl.kt */
/* loaded from: classes.dex */
public final class d implements h5.l {

    /* renamed from: b  reason: collision with root package name */
    public static final b f36445b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f36446c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f36447a = new HashMap();

    /* compiled from: CallbackManagerImpl.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(Intent intent, int i6);
    }

    /* compiled from: CallbackManagerImpl.kt */
    /* loaded from: classes.dex */
    public static final class b {
    }

    /* compiled from: CallbackManagerImpl.kt */
    /* loaded from: classes.dex */
    public enum c {
        Login(0),
        /* JADX INFO: Fake field, exist only in values array */
        Share(1),
        /* JADX INFO: Fake field, exist only in values array */
        Message(2),
        /* JADX INFO: Fake field, exist only in values array */
        Like(3),
        /* JADX INFO: Fake field, exist only in values array */
        GameRequest(4),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupCreate(5),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupJoin(6),
        /* JADX INFO: Fake field, exist only in values array */
        AppInvite(7),
        /* JADX INFO: Fake field, exist only in values array */
        DeviceShare(8),
        /* JADX INFO: Fake field, exist only in values array */
        GamingFriendFinder(9),
        /* JADX INFO: Fake field, exist only in values array */
        GamingGroupIntegration(10),
        /* JADX INFO: Fake field, exist only in values array */
        Referral(11),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextCreate(12),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextSwitch(13),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextChoose(14),
        /* JADX INFO: Fake field, exist only in values array */
        TournamentShareDialog(15),
        /* JADX INFO: Fake field, exist only in values array */
        TournamentJoinDialog(16);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f36450u;

        c(int i6) {
            this.f36450u = i6;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            return (c[]) Arrays.copyOf(values(), 17);
        }

        public final int d() {
            h5.p pVar = h5.p.f17269a;
            f0.e();
            return h5.p.f17277j + this.f36450u;
        }
    }

    @Override // h5.l
    public final boolean a(int i6, int i10, Intent intent) {
        a aVar;
        a aVar2 = (a) this.f36447a.get(Integer.valueOf(i6));
        if (aVar2 == null) {
            synchronized (f36445b) {
                aVar = (a) f36446c.get(Integer.valueOf(i6));
            }
            if (aVar == null) {
                return false;
            }
            aVar.a(intent, i10);
            return true;
        }
        aVar2.a(intent, i10);
        return true;
    }
}
