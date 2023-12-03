package lp;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.subscriptionMessaging.model.SubscriptionMessageScreen;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
/* compiled from: SubscriptionMessagingViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends l0 {
    public SubscriptionMessageScreen A;
    public SubscriptionModel B;
    public long C;

    /* renamed from: x  reason: collision with root package name */
    public final w<Boolean> f24482x = new w<>();

    /* renamed from: y  reason: collision with root package name */
    public final w<Boolean> f24483y = new w<>();

    /* renamed from: z  reason: collision with root package name */
    public String f24484z;

    /* compiled from: SubscriptionMessagingViewModel.kt */
    /* renamed from: lp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0389a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24485a;

        static {
            int[] iArr = new int[SubscriptionMessageScreen.values().length];
            try {
                iArr[SubscriptionMessageScreen.GRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionMessageScreen.HOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24485a = iArr;
        }
    }

    public final long e() {
        long j10;
        long j11;
        SubscriptionMessageScreen subscriptionMessageScreen = this.A;
        if (subscriptionMessageScreen != null) {
            int i6 = C0389a.f24485a[subscriptionMessageScreen.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    return 0L;
                }
                j10 = 30;
                j11 = this.C;
            } else {
                j10 = 3;
                j11 = this.C;
            }
            return j10 - j11;
        }
        i.q("selectedScreenCategory");
        throw null;
    }

    public final String f() {
        String str = this.f24484z;
        if (str != null) {
            if (str == null) {
                i.q("selectedScreen");
                throw null;
            }
            return str;
        }
        return "";
    }

    public final void g() {
        SubscriptionModel currentSubscriptionModel = SubscriptionPersistence.INSTANCE.getCurrentSubscriptionModel();
        this.B = currentSubscriptionModel;
        if (currentSubscriptionModel != null) {
            this.C = TimeUnit.MILLISECONDS.toDays(currentSubscriptionModel.getExpiryTime() - Calendar.getInstance().getTimeInMillis());
            SubscriptionModel subscriptionModel = this.B;
            if (subscriptionModel != null) {
                if (subscriptionModel.getExpiryTime() > Calendar.getInstance().getTimeInMillis()) {
                    SubscriptionModel subscriptionModel2 = this.B;
                    if (subscriptionModel2 != null) {
                        String status = subscriptionModel2.getStatus();
                        int hashCode = status.hashCode();
                        w<Boolean> wVar = this.f24482x;
                        if (hashCode != -677165568) {
                            if (hashCode != -277386755) {
                                if (hashCode == 1407800699 && status.equals(Constants.STATE_CANCELLED) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.CANCELLED_DIALOG_1_SHOWN, false)) {
                                    this.A = SubscriptionMessageScreen.CANCELLED;
                                    this.f24484z = Constants.CANCELLED_DIALOG_1_SHOWN;
                                    wVar.l(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else if (status.equals(Constants.STATE_ON_HOLD)) {
                                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.HOLD_DIALOG_4_SHOWN, false) && this.C == 0) {
                                    this.A = SubscriptionMessageScreen.HOLD;
                                    this.f24484z = Constants.HOLD_DIALOG_4_SHOWN;
                                    wVar.l(Boolean.TRUE);
                                    return;
                                }
                                boolean booleanValue = ApplicationPersistence.getInstance().getBooleanValue(Constants.HOLD_DIALOG_3_SHOWN, false);
                                w<Boolean> wVar2 = this.f24483y;
                                if (!booleanValue) {
                                    long j10 = this.C;
                                    if (j10 > 0 && j10 <= 10) {
                                        this.A = SubscriptionMessageScreen.HOLD;
                                        this.f24484z = Constants.HOLD_DIALOG_3_SHOWN;
                                        wVar2.l(Boolean.TRUE);
                                        return;
                                    }
                                }
                                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.HOLD_DIALOG_2_SHOWN, false)) {
                                    long j11 = this.C;
                                    if (j11 > 10 && j11 <= 20) {
                                        this.A = SubscriptionMessageScreen.HOLD;
                                        this.f24484z = Constants.HOLD_DIALOG_2_SHOWN;
                                        wVar2.l(Boolean.TRUE);
                                        return;
                                    }
                                }
                                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.HOLD_DIALOG_1_SHOWN, false) && this.C > 20) {
                                    this.A = SubscriptionMessageScreen.HOLD;
                                    this.f24484z = Constants.HOLD_DIALOG_1_SHOWN;
                                    wVar.l(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (status.equals(Constants.STATE_GRACE_PERIOD)) {
                            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.GRACE_DIALOG_2_SHOWN, false) && this.C == 0) {
                                this.A = SubscriptionMessageScreen.GRACE;
                                this.f24484z = Constants.GRACE_DIALOG_2_SHOWN;
                                wVar.l(Boolean.TRUE);
                                return;
                            } else if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.GRACE_DIALOG_1_SHOWN, false) && this.C > 0) {
                                this.A = SubscriptionMessageScreen.GRACE;
                                this.f24484z = Constants.GRACE_DIALOG_1_SHOWN;
                                wVar.l(Boolean.TRUE);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    i.q("subscriptionModel");
                    throw null;
                }
                return;
            }
            i.q("subscriptionModel");
            throw null;
        }
        i.q("subscriptionModel");
        throw null;
    }
}
