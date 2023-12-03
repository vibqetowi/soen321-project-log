package com.theinnerhour.b2b.persistence;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UtilsKt;
import fk.g;
import is.q;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import lg.f;
import og.b;
import org.json.JSONObject;
/* compiled from: SubscriptionPersistence.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0004R\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00070(j\b\u0012\u0004\u0012\u00020\u0007`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence;", "", "", "success", "Lhs/k;", "subscriptionDataChanged", "validateSubscription", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "subscriptionInitialiseListener", "fetchData", "Lcom/theinnerhour/b2b/model/SubscriptionModel;", "getCurrentSubscriptionModel", "previousSubscriptionModel", "listener", "removeSubscriptionInitialiseListener", "removeAllSubscriptionInitialiseListeners", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Lcom/google/firebase/database/DatabaseReference;", "databaseReference", "Lcom/google/firebase/database/DatabaseReference;", "subscriptionModel", "Lcom/theinnerhour/b2b/model/SubscriptionModel;", "SUBSCRIPTION_PERSISTENCE_STRING", "subscriptionEnabled", "Z", "getSubscriptionEnabled", "()Z", "setSubscriptionEnabled", "(Z)V", "subscriptionType", "getSubscriptionType", "()Ljava/lang/String;", "setSubscriptionType", "(Ljava/lang/String;)V", "subscriptionState", "getSubscriptionState", "setSubscriptionState", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "subscriptionInitialiseListenerList", "Ljava/util/ArrayList;", "<init>", "()V", "SubscriptionInitialiseListener", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriptionPersistence {
    public static final SubscriptionPersistence INSTANCE;
    private static String SUBSCRIPTION_PERSISTENCE_STRING;
    private static final String TAG;
    private static DatabaseReference databaseReference;
    private static boolean subscriptionEnabled;
    private static final ArrayList<SubscriptionInitialiseListener> subscriptionInitialiseListenerList;
    private static SubscriptionModel subscriptionModel;
    private static String subscriptionState;
    private static String subscriptionType;

    /* compiled from: SubscriptionPersistence.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "", "", "success", "Lhs/k;", "initialiseComplete", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface SubscriptionInitialiseListener {
        void initialiseComplete(boolean z10);
    }

    static {
        SubscriptionPersistence subscriptionPersistence = new SubscriptionPersistence();
        INSTANCE = subscriptionPersistence;
        TAG = subscriptionPersistence.getClass().getSimpleName();
        subscriptionModel = new SubscriptionModel();
        SUBSCRIPTION_PERSISTENCE_STRING = "subscription_data";
        subscriptionType = Constants.SUBSCRIPTION_NONE;
        subscriptionState = Constants.STATE_NOT_PURCHASED;
        subscriptionInitialiseListenerList = new ArrayList<>();
    }

    private SubscriptionPersistence() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscriptionDataChanged(boolean z10) {
        try {
            Iterator<SubscriptionInitialiseListener> it = subscriptionInitialiseListenerList.iterator();
            while (it.hasNext()) {
                it.next().initialiseComplete(z10);
            }
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String TAG2 = TAG;
            i.f(TAG2, "TAG");
            logHelper.e(TAG2, "exception monetization listener update", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb A[Catch: Exception -> 0x0153, TRY_ENTER, TryCatch #0 {Exception -> 0x0153, blocks: (B:3:0x0004, B:5:0x0021, B:7:0x0033, B:8:0x003f, B:17:0x008e, B:22:0x009b, B:28:0x00bb, B:32:0x00c2, B:36:0x00cf, B:40:0x00db, B:42:0x00e3, B:44:0x00eb, B:46:0x00f1, B:48:0x00f7, B:58:0x0141, B:62:0x014c, B:49:0x010d, B:53:0x0114, B:55:0x011c, B:57:0x0124, B:11:0x005f, B:13:0x0071), top: B:67:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[Catch: Exception -> 0x0153, TryCatch #0 {Exception -> 0x0153, blocks: (B:3:0x0004, B:5:0x0021, B:7:0x0033, B:8:0x003f, B:17:0x008e, B:22:0x009b, B:28:0x00bb, B:32:0x00c2, B:36:0x00cf, B:40:0x00db, B:42:0x00e3, B:44:0x00eb, B:46:0x00f1, B:48:0x00f7, B:58:0x0141, B:62:0x014c, B:49:0x010d, B:53:0x0114, B:55:0x011c, B:57:0x0124, B:11:0x005f, B:13:0x0071), top: B:67:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void validateSubscription() {
        boolean z10;
        Object obj;
        String previousSubscriptionStatus;
        String str;
        String str2;
        try {
            MyApplication.a aVar = MyApplication.V;
            f d10 = aVar.a().d();
            boolean z11 = true;
            if (!i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                subscriptionEnabled = true;
                subscriptionType = Constants.SUBSCRIPTION_BASIC_3;
                subscriptionState = Constants.STATE_PURCHASED;
                return;
            }
            subscriptionType = subscriptionModel.getPlan();
            subscriptionState = subscriptionModel.getStatus();
            if (!i.b(subscriptionModel.getStatus(), Constants.STATE_NOT_PURCHASED) && subscriptionModel.getExpiryTime() >= Calendar.getInstance().getTimeInMillis() && !ca.a.k(Constants.STATE_ON_HOLD, Constants.STATE_SUBSCRIPTION_EXPIRED, Constants.STATE_SUBSCRIPTION_REVOKED).contains(subscriptionModel.getStatus())) {
                z10 = true;
                subscriptionEnabled = z10;
                f.b bVar = d10.f;
                String str3 = "active";
                if (!z10) {
                    obj = "active";
                } else {
                    obj = "inactive";
                }
                bVar.f(obj, "Subscription Status");
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                ArrayList<String> arrayList = g.f15127b;
                previousSubscriptionStatus = applicationPersistence.getStringValue("moengage_previous_user_subscription_status");
                i.f(previousSubscriptionStatus, "previousSubscriptionStatus");
                if (previousSubscriptionStatus.length() <= 0) {
                    z11 = false;
                }
                if (!z11) {
                    if (subscriptionEnabled) {
                        str2 = "active";
                    } else {
                        str2 = "inactive";
                    }
                    String stringValue = ApplicationPersistence.getInstance().getStringValue("moengage_user_saved_organisation_id");
                    String str4 = "";
                    if (stringValue == null) {
                        stringValue = "";
                    }
                    String stringValue2 = ApplicationPersistence.getInstance().getStringValue("moengage_user_status_organisation_id");
                    if (stringValue2 != null) {
                        str4 = stringValue2;
                    }
                    if (aVar.a().Q && aVar.a().P && (!i.b(previousSubscriptionStatus, str2) || !i.b(stringValue, str4))) {
                        b.b(aVar.a(), str2, "Subscription Status");
                        ApplicationPersistence.getInstance().setStringValue("moengage_previous_user_subscription_status", str2);
                        ApplicationPersistence.getInstance().setStringValue("moengage_user_status_organisation_id", stringValue);
                    }
                } else {
                    if (subscriptionEnabled) {
                        str = "active";
                    } else {
                        str = "inactive";
                    }
                    if (aVar.a().Q && aVar.a().P) {
                        b.b(aVar.a(), str, "Subscription Status");
                        ApplicationPersistence.getInstance().setStringValue("moengage_previous_user_subscription_status", str);
                        ApplicationPersistence.getInstance().setStringValue("moengage_user_status_organisation_id", ApplicationPersistence.getInstance().getStringValue("moengage_user_saved_organisation_id"));
                    }
                }
                JSONObject jSONObject = new JSONObject();
                if (subscriptionEnabled) {
                    str3 = "inactive";
                }
                jSONObject.put("Subscription Status", str3);
                d10.k(jSONObject);
            }
            z10 = false;
            subscriptionEnabled = z10;
            f.b bVar2 = d10.f;
            String str32 = "active";
            if (!z10) {
            }
            bVar2.f(obj, "Subscription Status");
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            ArrayList<String> arrayList2 = g.f15127b;
            previousSubscriptionStatus = applicationPersistence2.getStringValue("moengage_previous_user_subscription_status");
            i.f(previousSubscriptionStatus, "previousSubscriptionStatus");
            if (previousSubscriptionStatus.length() <= 0) {
            }
            if (!z11) {
            }
            JSONObject jSONObject2 = new JSONObject();
            if (subscriptionEnabled) {
            }
            jSONObject2.put("Subscription Status", str32);
            d10.k(jSONObject2);
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String TAG2 = TAG;
            i.f(TAG2, "TAG");
            logHelper.e(TAG2, e10.toString());
        }
    }

    public final void fetchData(SubscriptionInitialiseListener subscriptionInitialiseListener) {
        String str;
        i.g(subscriptionInitialiseListener, "subscriptionInitialiseListener");
        try {
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                str = fVar.j0();
            } else {
                str = null;
            }
            if (str != null) {
                subscriptionInitialiseListenerList.add(subscriptionInitialiseListener);
                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                StringBuilder sb2 = new StringBuilder("subscriptionList/");
                fd.f fVar2 = FirebaseAuth.getInstance().f;
                i.d(fVar2);
                sb2.append(fVar2.j0());
                DatabaseReference reference = firebaseDatabase.getReference(sb2.toString());
                databaseReference = reference;
                i.d(reference);
                reference.addValueEventListener(new ValueEventListener() { // from class: com.theinnerhour.b2b.persistence.SubscriptionPersistence$fetchData$1
                    @Override // com.google.firebase.database.ValueEventListener
                    public void onCancelled(DatabaseError p02) {
                        String TAG2;
                        i.g(p02, "p0");
                        TAG2 = SubscriptionPersistence.TAG;
                        i.f(TAG2, "TAG");
                        UtilsKt.logError$default(TAG2, null, SubscriptionPersistence$fetchData$1$onCancelled$1.INSTANCE, 2, null);
                    }

                    @Override // com.google.firebase.database.ValueEventListener
                    public void onDataChange(DataSnapshot p02) {
                        String TAG2;
                        i.g(p02, "p0");
                        TAG2 = SubscriptionPersistence.TAG;
                        i.f(TAG2, "TAG");
                        UtilsKt.logError$default(TAG2, null, new SubscriptionPersistence$fetchData$1$onDataChange$1(p02), 2, null);
                    }
                });
                return;
            }
            String TAG2 = TAG;
            i.f(TAG2, "TAG");
            UtilsKt.logError$default(TAG2, null, SubscriptionPersistence$fetchData$2.INSTANCE, 2, null);
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String TAG3 = TAG;
            i.f(TAG3, "TAG");
            logHelper.e(TAG3, e10.toString());
            subscriptionDataChanged(false);
        }
    }

    public final SubscriptionModel getCurrentSubscriptionModel() {
        try {
            return subscriptionModel;
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String TAG2 = TAG;
            i.f(TAG2, "TAG");
            logHelper.e(TAG2, e10.toString());
            return subscriptionModel;
        }
    }

    public final boolean getSubscriptionEnabled() {
        return subscriptionEnabled;
    }

    public final String getSubscriptionState() {
        return subscriptionState;
    }

    public final String getSubscriptionType() {
        return subscriptionType;
    }

    public final SubscriptionModel previousSubscriptionModel() {
        SubscriptionModel subscriptionModel2;
        try {
            String stringValue = ApplicationPersistence.getInstance().getStringValue(SUBSCRIPTION_PERSISTENCE_STRING);
            if (stringValue != null && !i.b(stringValue, "")) {
                Object b10 = new sf.i().b(SubscriptionModel.class, stringValue);
                i.f(b10, "{\n                val gs…class.java)\n            }");
                subscriptionModel2 = (SubscriptionModel) b10;
            } else {
                subscriptionModel2 = new SubscriptionModel();
            }
            subscriptionModel = subscriptionModel2;
            validateSubscription();
            return subscriptionModel;
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String TAG2 = TAG;
            i.f(TAG2, "TAG");
            logHelper.e(TAG2, e10.toString());
            return subscriptionModel;
        }
    }

    public final void removeAllSubscriptionInitialiseListeners() {
        try {
            ArrayList<SubscriptionInitialiseListener> arrayList = subscriptionInitialiseListenerList;
            if (arrayList.size() > 0) {
                arrayList.clear();
            }
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String TAG2 = TAG;
            i.f(TAG2, "TAG");
            logHelper.e(TAG2, e10.toString());
        }
    }

    public final void removeSubscriptionInitialiseListener(SubscriptionInitialiseListener listener) {
        i.g(listener, "listener");
        try {
            q.U1(subscriptionInitialiseListenerList, new SubscriptionPersistence$removeSubscriptionInitialiseListener$1(listener));
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String TAG2 = TAG;
            i.f(TAG2, "TAG");
            logHelper.e(TAG2, e10.toString());
        }
    }

    public final void setSubscriptionEnabled(boolean z10) {
        subscriptionEnabled = z10;
    }

    public final void setSubscriptionState(String str) {
        i.g(str, "<set-?>");
        subscriptionState = str;
    }

    public final void setSubscriptionType(String str) {
        i.g(str, "<set-?>");
        subscriptionType = str;
    }
}
