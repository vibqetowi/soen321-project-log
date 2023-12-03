package com.theinnerhour.b2b.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import ca.a;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.x;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.model.OfferModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationUtilKt;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import f0.s;
import f0.t;
import gv.r;
import hh.g;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import t.b;
import t.h;
/* compiled from: MyFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/service/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Lcom/google/firebase/messaging/x;", "remoteMessage", "Lhs/k;", "handleDataMessage", "Landroid/content/Intent;", "notificationIntent", "", "title", "desc", "notificationTag", "", "notificationId", "displayNotification", "p0", "onNewToken", "onMessageReceived", "NOTIFICATION_TITLE", "Ljava/lang/String;", "NOTIFICATION_DESC", "TAG", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    private final String NOTIFICATION_TITLE = "title";
    private final String NOTIFICATION_DESC = "shortdesc";
    private final String TAG = LogHelper.INSTANCE.makeLogTag("MyFirebaseMessagingService");

    private final void displayNotification(Intent intent, String str, String str2, String str3, int i6) {
        int i10;
        try {
            Context applicationContext = getApplicationContext();
            int nextInt = new Random().nextInt();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                i10 = 201326592;
            } else {
                i10 = 134217728;
            }
            PendingIntent activity = PendingIntent.getActivity(applicationContext, nextInt, intent, i10);
            t tVar = new t(getApplicationContext(), "channel_push_notification");
            tVar.e(str);
            tVar.d(str2);
            tVar.l(str2);
            tVar.i(RingtoneManager.getDefaultUri(2));
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            tVar.f14665j = 1;
            tVar.h(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
            tVar.f14677w = 0;
            tVar.g(16, true);
            tVar.f14680z = "channel_push_notification";
            tVar.f14674t = "msg";
            s sVar = new s();
            sVar.j(str2);
            tVar.j(sVar);
            tVar.f14670o = Constants.NOTIFICATION_GROUP_COMMON;
            tVar.f14662g = activity;
            Notification b10 = tVar.b();
            i.f(b10, "builder.setContentTitle(…nt(pendingIntent).build()");
            Object systemService = getApplicationContext().getSystemService("notification");
            i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (i11 >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("channel_push_notification", "Updates", 3));
                notificationManager.createNotificationChannel(new NotificationChannel(Constants.SUMMARY_NOTIFICATION_CHANNEL, "Default", 2));
            }
            notificationManager.notify(str3, i6, b10);
            if (i11 >= 24) {
                t tVar2 = new t(getApplicationContext(), Constants.SUMMARY_NOTIFICATION_CHANNEL);
                tVar2.e(str);
                tVar2.d(str2);
                tVar2.l(str2);
                tVar2.D.icon = R.drawable.ic_stat_notification_amaha;
                tVar2.f14665j = 1;
                tVar2.h(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                tVar2.f14677w = 1;
                tVar2.i(Uri.parse("android.resource://" + getPackageName() + "/raw/notification_sound"));
                tVar2.g(16, true);
                tVar2.f14680z = Constants.SUMMARY_NOTIFICATION_CHANNEL;
                tVar2.f14674t = "reminder";
                s sVar2 = new s();
                sVar2.j(str2);
                tVar2.j(sVar2);
                tVar2.f14670o = Constants.NOTIFICATION_GROUP_COMMON;
                tVar2.f14671p = true;
                tVar2.f14662g = activity;
                Notification b11 = tVar2.b();
                i.f(b11, "summaryBuilder.setConten…nt(pendingIntent).build()");
                notificationManager.notify(0, b11);
            }
            if (i11 <= 23) {
                Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(), RingtoneManager.getDefaultUri(2));
                if (ringtone != null) {
                    ringtone.play();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception in display notification", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x029f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0266 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleDataMessage(x xVar) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList<HashMap> arrayList;
        try {
            Map<String, String> f02 = xVar.f0();
            i.f(f02, "remoteMessage.data");
            Intent intent = new Intent(getApplicationContext(), SplashScreenActivity.class);
            intent.setAction(String.valueOf(Calendar.getInstance().getTimeInMillis()));
            intent.putExtra(Constants.NOTIFICATION_INTENT, true);
            h hVar = (h) f02;
            Object obj = hVar.get(Constants.API_COURSE_LINK);
            i.d(obj);
            if (i.b(obj, Constants.LINK_DYNAMIC_CAMPAIGN)) {
                if (FirebaseAuth.getInstance().a() != null) {
                    if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        return;
                    }
                    if ((!i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) || !a.k("v2.3", Constants.USER_VERSION, "v2.2", "v2.21").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                        return;
                    }
                    Object obj2 = hVar.get(Constants.CONTAINED_SKU);
                    i.d(obj2);
                    for (String str2 : r.a1((CharSequence) obj2, new String[]{","}, 0, 6)) {
                        if (PaymentUtils.INSTANCE.isSkuInPurchaseList(str2)) {
                            return;
                        }
                    }
                    if (UtilsKt.checkActiveOffers()) {
                        return;
                    }
                    intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                    intent.putExtra(Constants.NOTIFICATION_URL, (String) hVar.get(Constants.NOTIFICATION_URL));
                    intent.putExtra(Constants.CONTAINED_SKU, (String) hVar.get(Constants.CONTAINED_SKU));
                    intent.addFlags(268435456);
                    displayNotification(intent, (String) hVar.get(this.NOTIFICATION_TITLE), (String) hVar.get(this.NOTIFICATION_DESC), (String) hVar.get(Constants.API_COURSE_LINK), new Random().nextInt());
                }
                str = "campaign";
            } else {
                Object obj3 = hVar.get(Constants.API_COURSE_LINK);
                i.d(obj3);
                str = "campaign";
                if (r.J0((CharSequence) obj3, "offer")) {
                    if (FirebaseAuth.getInstance().a() != null) {
                        try {
                            String[] strArr = {Constants.SUBSCRIPTION_GOLD_3, Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3, Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL, Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED};
                            int i6 = 0;
                            while (true) {
                                if (i6 < 4) {
                                    String str3 = strArr[i6];
                                    Object obj4 = hVar.get(Constants.API_COURSE_LINK);
                                    i.d(obj4);
                                    String[] strArr2 = strArr;
                                    if (r.J0((CharSequence) obj4, str3)) {
                                        z11 = false;
                                        break;
                                    } else {
                                        i6++;
                                        strArr = strArr2;
                                    }
                                } else {
                                    z11 = true;
                                    break;
                                }
                            }
                            if (z11) {
                                if (!a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                                    return;
                                }
                                PaymentUtils paymentUtils = PaymentUtils.INSTANCE;
                                Object obj5 = hVar.get(Constants.API_COURSE_LINK);
                                i.d(obj5);
                                if (paymentUtils.isSkuInPurchaseList((String) obj5) || UtilsKt.checkActiveOffers()) {
                                    return;
                                }
                                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("show_discount_40_time")) {
                                    ArrayList k10 = a.k(Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4, Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3);
                                    Object obj6 = hVar.get(Constants.API_COURSE_LINK);
                                    i.d(obj6);
                                    if (k10.contains(obj6)) {
                                        return;
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("offer") && (arrayList = (ArrayList) FirebasePersistence.getInstance().getUser().getAppConfig().get("offer")) != null) {
                                    for (HashMap hashMap : arrayList) {
                                        Object obj7 = hashMap.get("slug");
                                        i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                                        String str4 = (String) obj7;
                                        Object obj8 = hashMap.get("time");
                                        i.e(obj8, "null cannot be cast to non-null type kotlin.Long");
                                        long longValue = ((Long) obj8).longValue();
                                        Object obj9 = hashMap.get("used");
                                        i.e(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                                        boolean booleanValue = ((Boolean) obj9).booleanValue();
                                        Object obj10 = hashMap.get("reusable");
                                        i.e(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                                        arrayList2.add(new OfferModel(str4, longValue, booleanValue, ((Boolean) obj10).booleanValue()));
                                    }
                                    k kVar = k.f19476a;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    OfferModel offerModel = (OfferModel) next;
                                    if (!i.b(offerModel.getSlug(), hVar.get(Constants.API_COURSE_LINK)) && (Calendar.getInstance().getTimeInMillis() / 1000) - offerModel.getTime() >= 86400) {
                                        z12 = false;
                                        if (!z12) {
                                            arrayList3.add(next);
                                        }
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    return;
                                }
                                if (arrayList3.isEmpty()) {
                                    Object obj11 = hVar.get(Constants.API_COURSE_LINK);
                                    i.d(obj11);
                                    arrayList2.add(new OfferModel((String) obj11, Calendar.getInstance().getTimeInMillis() / 1000, false, false));
                                    HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
                                    i.f(appConfig, "getInstance().user.appConfig");
                                    appConfig.put("offer", arrayList2);
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                                    intent.putExtra(Constants.NOTIFICATION_URL, (String) hVar.get(Constants.NOTIFICATION_URL));
                                    intent.addFlags(268435456);
                                    displayNotification(intent, (String) hVar.get(this.NOTIFICATION_TITLE), (String) hVar.get(this.NOTIFICATION_DESC), (String) hVar.get(Constants.API_COURSE_LINK), new Random().nextInt());
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(e);
                            return;
                        }
                    }
                } else if (i.b(hVar.get(Constants.API_COURSE_LINK), Constants.SCREEN_IN_REPURCHASE)) {
                    if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        return;
                    }
                    intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                    intent.putExtra(Constants.NOTIFICATION_URL, (String) hVar.get(Constants.NOTIFICATION_URL));
                    intent.addFlags(268435456);
                    displayNotification(intent, (String) hVar.get(this.NOTIFICATION_TITLE), (String) hVar.get(this.NOTIFICATION_DESC), (String) hVar.get(Constants.API_COURSE_LINK), new Random().nextInt());
                } else if (i.b(hVar.get(Constants.API_COURSE_LINK), Constants.SCREEN_MONETIZATION)) {
                    if (FirebaseAuth.getInstance().a() != null) {
                        if (!a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion()) || PaymentUtils.INSTANCE.isSkuInPurchaseList("offer=ip_plus_annual_50discount") || UtilsKt.checkActiveOffers()) {
                            return;
                        }
                        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("offer")) {
                            Object obj12 = FirebasePersistence.getInstance().getUser().getAppConfig().get("offer");
                            i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<java.util.HashMap<kotlin.String, kotlin.Any>>{ kotlin.collections.TypeAliasesKt.ArrayList<java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }> }");
                            ArrayList<HashMap> arrayList4 = (ArrayList) obj12;
                            if (!arrayList4.isEmpty()) {
                                for (HashMap hashMap2 : arrayList4) {
                                    if (u.Z1(a.k(Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4, Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3), hashMap2.get("slug"))) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                            if (z10) {
                                return;
                            }
                        }
                        intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                        intent.putExtra(Constants.NOTIFICATION_URL, (String) hVar.get(Constants.NOTIFICATION_URL));
                        intent.addFlags(268435456);
                        if (!FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("show_discount_40_time")) {
                            HashMap<String, Object> appConfig2 = FirebasePersistence.getInstance().getUser().getAppConfig();
                            i.f(appConfig2, "appConfig");
                            appConfig2.put("show_discount_40_time", Long.valueOf(Calendar.getInstance().getTimeInMillis() / 1000));
                            FirebasePersistence.getInstance().getUser().setAppConfig(appConfig2);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            displayNotification(intent, (String) hVar.get(this.NOTIFICATION_TITLE), (String) hVar.get(this.NOTIFICATION_DESC), (String) hVar.get(Constants.API_COURSE_LINK), new Random().nextInt());
                        }
                    }
                } else if (i.b(hVar.get(Constants.API_COURSE_LINK), Constants.SCREEN_BROWSER)) {
                    intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                    intent.putExtra(Constants.NOTIFICATION_URL, (String) hVar.get(Constants.NOTIFICATION_URL));
                    intent.addFlags(268435456);
                    displayNotification(intent, (String) hVar.get(this.NOTIFICATION_TITLE), (String) hVar.get(this.NOTIFICATION_DESC), (String) hVar.get(Constants.API_COURSE_LINK), new Random().nextInt());
                } else if (i.b(hVar.get(Constants.API_COURSE_LINK), Constants.SCREEN_FIREBASE_CHAT)) {
                    String a10 = FirebaseAuth.getInstance().a();
                    if (a10 != null && !i.b(a10, "") && hVar.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(hVar.get(Constants.FIREBASE_CHAT_TO_USER_ID), a10)) {
                        intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                        intent.putExtra(Constants.FIREBASE_CHAT_FROM_USER_ID, (String) hVar.get(Constants.FIREBASE_CHAT_FROM_USER_ID));
                        intent.putExtra(Constants.FIREBASE_CHAT_USERNAME, (String) hVar.get(Constants.FIREBASE_CHAT_USERNAME));
                        intent.putExtra(Constants.FIREBASE_CHAT_TO_USER_ID, (String) hVar.get(Constants.FIREBASE_CHAT_TO_USER_ID));
                        intent.addFlags(268435456);
                        MyApplication.a aVar = MyApplication.V;
                        if (!aVar.a().h()) {
                            displayNotification(intent, aVar.a().getString(R.string.chatNotificationTitle, SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME)), aVar.a().getString(R.string.chatNotificationBody, hVar.get(Constants.FIREBASE_CHAT_USERNAME)), (String) hVar.get(Constants.FIREBASE_CHAT_FROM_USER_ID), com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                        }
                    }
                } else if (i.b(hVar.get(Constants.API_COURSE_LINK), Constants.SCREEN_PSYCHIATRIST_CHAT)) {
                    String a11 = FirebaseAuth.getInstance().a();
                    if (a11 != null && !i.b(a11, "") && hVar.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(hVar.get(Constants.FIREBASE_CHAT_TO_USER_ID), a11)) {
                        intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                        intent.putExtra(Constants.FIREBASE_CHAT_FROM_USER_ID, (String) hVar.get(Constants.FIREBASE_CHAT_FROM_USER_ID));
                        intent.putExtra(Constants.FIREBASE_CHAT_USERNAME, (String) hVar.get(Constants.FIREBASE_CHAT_USERNAME));
                        intent.putExtra(Constants.FIREBASE_CHAT_TO_USER_ID, (String) hVar.get(Constants.FIREBASE_CHAT_TO_USER_ID));
                        intent.addFlags(268435456);
                        MyApplication.a aVar2 = MyApplication.V;
                        if (!aVar2.a().h()) {
                            displayNotification(intent, aVar2.a().getString(R.string.chatNotificationTitle, SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME)), aVar2.a().getString(R.string.psychiatristChatNotificationBody, hVar.get(Constants.FIREBASE_CHAT_USERNAME)), (String) hVar.get(Constants.FIREBASE_CHAT_FROM_USER_ID), com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle);
                        }
                    }
                } else if (i.b(hVar.get(Constants.API_COURSE_LINK), Constants.SCREEN_COACH_CHAT)) {
                    String a12 = FirebaseAuth.getInstance().a();
                    if (a12 != null && !i.b(a12, "") && hVar.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(hVar.get(Constants.FIREBASE_CHAT_TO_USER_ID), a12)) {
                        intent.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                        intent.putExtra(Constants.FIREBASE_CHAT_FROM_USER_ID, (String) hVar.get(Constants.FIREBASE_CHAT_FROM_USER_ID));
                        intent.putExtra(Constants.FIREBASE_CHAT_USERNAME, (String) hVar.get(Constants.FIREBASE_CHAT_USERNAME));
                        intent.putExtra(Constants.FIREBASE_CHAT_TO_USER_ID, (String) hVar.get(Constants.FIREBASE_CHAT_TO_USER_ID));
                        intent.addFlags(268435456);
                        MyApplication.a aVar3 = MyApplication.V;
                        if (!aVar3.a().h()) {
                            displayNotification(intent, aVar3.a().getString(R.string.chatNotificationTitle, SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME)), aVar3.a().getString(R.string.chatNotificationBody, hVar.get(Constants.FIREBASE_CHAT_USERNAME)), (String) hVar.get(Constants.FIREBASE_CHAT_FROM_USER_ID), com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        }
                    }
                } else if (is.k.Q1(hVar.get(Constants.API_COURSE_LINK), new String[]{Constants.SESSION_DASHBOARD_THERAPY, Constants.SESSION_DASHBOARD_PSYCHIATRY})) {
                    for (Map.Entry entry : ((b) f02).entrySet()) {
                        intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                    }
                    intent.addFlags(268435456);
                    MyApplication.a aVar4 = MyApplication.V;
                    if (i.b(aVar4.a().e(), hVar.get(Constants.API_COURSE_LINK))) {
                        Intent intent2 = new Intent(Constants.FIREBASE_MESSAGE_BROADCAST);
                        intent2.putExtra(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
                        n1.a.a(aVar4.a()).c(intent2);
                    } else {
                        displayNotification(intent, (String) hVar.get(this.NOTIFICATION_TITLE), (String) hVar.get(this.NOTIFICATION_DESC), (String) hVar.get(Constants.API_COURSE_LINK), new Random().nextInt());
                    }
                } else if (hVar.containsKey(Constants.API_COURSE_LINK)) {
                    for (Map.Entry entry2 : ((b) f02).entrySet()) {
                        intent.putExtra((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    intent.addFlags(268435456);
                    Object obj13 = hVar.get(this.NOTIFICATION_TITLE);
                    i.d(obj13);
                    String replaceName$default = NotificationUtilKt.replaceName$default((String) obj13, null, 2, null);
                    Object obj14 = hVar.get(this.NOTIFICATION_DESC);
                    i.d(obj14);
                    displayNotification(intent, replaceName$default, NotificationUtilKt.replaceName$default((String) obj14, null, 2, null), (String) hVar.get(Constants.API_COURSE_LINK), new Random().nextInt());
                } else {
                    intent.addFlags(268435456);
                    Object obj15 = hVar.get(this.NOTIFICATION_TITLE);
                    i.d(obj15);
                    String replaceName$default2 = NotificationUtilKt.replaceName$default((String) obj15, null, 2, null);
                    Object obj16 = hVar.get(this.NOTIFICATION_DESC);
                    i.d(obj16);
                    displayNotification(intent, replaceName$default2, NotificationUtilKt.replaceName$default((String) obj16, null, 2, null), "FCM_Generic", new Random().nextInt());
                }
            }
            Bundle bundle = new Bundle();
            if (hVar.containsKey(Constants.API_COURSE_LINK)) {
                bundle.putString(Constants.API_COURSE_LINK, (String) hVar.get(Constants.API_COURSE_LINK));
            }
            String str5 = str;
            if (hVar.containsKey(str5)) {
                bundle.putString(str5, (String) hVar.get(str5));
            }
            if (hVar.containsKey(Constants.API_COURSE_LINK) && u.Z1(a.k(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY_POST, Constants.LINK_COMMUNITIES_NOTIFICATION), hVar.get(Constants.API_COURSE_LINK))) {
                bundle.putBoolean("community_notif", true);
            } else {
                bundle.putBoolean("community_notif", false);
            }
            gk.a.b(bundle, "notification_push_show");
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[Catch: Exception -> 0x00c0, TryCatch #3 {Exception -> 0x00c0, blocks: (B:3:0x0007, B:6:0x000d, B:11:0x0019, B:16:0x001f, B:27:0x0054, B:30:0x005a, B:35:0x0068, B:40:0x006d, B:42:0x0071, B:43:0x0087, B:44:0x008e, B:45:0x008f, B:47:0x00a1, B:24:0x0047, B:31:0x005b, B:33:0x005f, B:34:0x0066, B:18:0x002c, B:20:0x0035, B:7:0x000e, B:9:0x0012, B:10:0x0017), top: B:54:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[Catch: Exception -> 0x00c0, TryCatch #3 {Exception -> 0x00c0, blocks: (B:3:0x0007, B:6:0x000d, B:11:0x0019, B:16:0x001f, B:27:0x0054, B:30:0x005a, B:35:0x0068, B:40:0x006d, B:42:0x0071, B:43:0x0087, B:44:0x008e, B:45:0x008f, B:47:0x00a1, B:24:0x0047, B:31:0x005b, B:33:0x005f, B:34:0x0066, B:18:0x002c, B:20:0x0035, B:7:0x000e, B:9:0x0012, B:10:0x0017), top: B:54:0x0007 }] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMessageReceived(x remoteMessage) {
        boolean z10;
        ej.b bVar;
        i.g(remoteMessage, "remoteMessage");
        try {
            ej.b bVar2 = ej.b.f14047b;
            if (bVar2 == null) {
                synchronized (ej.b.class) {
                    bVar = ej.b.f14047b;
                    if (bVar == null) {
                        bVar = new ej.b();
                    }
                    ej.b.f14047b = bVar;
                }
                bVar2 = bVar;
            }
            Map<String, String> f02 = remoteMessage.f0();
            i.f(f02, "remoteMessage.data");
            try {
            } catch (Exception e10) {
                hh.a aVar = g.f17610d;
                g.a.a(1, e10, new ej.a(bVar2));
            }
            if (((h) f02).containsKey("push_from")) {
                if (i.b("moengage", ((h) f02).getOrDefault("push_from", null))) {
                    z10 = true;
                    if (!z10) {
                        if (ii.a.f20110b == null) {
                            synchronized (ii.a.class) {
                                if (ii.a.f20110b == null) {
                                    ii.a.f20110b = new ii.a();
                                }
                                k kVar = k.f19476a;
                            }
                        }
                        ii.a aVar2 = ii.a.f20110b;
                        if (aVar2 != null) {
                            Context applicationContext = getApplicationContext();
                            i.f(applicationContext, "applicationContext");
                            Map<String, String> f03 = remoteMessage.f0();
                            i.f(f03, "remoteMessage.data");
                            aVar2.a(applicationContext, f03);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.moengage.firebase.MoEFireBaseHelper");
                    }
                    Map<String, String> f04 = remoteMessage.f0();
                    i.f(f04, "remoteMessage.data");
                    if (!((h) f04).isEmpty()) {
                        LogHelper logHelper = LogHelper.INSTANCE;
                        String str = this.TAG;
                        logHelper.i(str, "Data Payload: " + remoteMessage.f0());
                        handleDataMessage(remoteMessage);
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            if (!z10) {
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(e11);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String p02) {
        i.g(p02, "p0");
        ApplicationPersistence.getInstance().setStringValue(ApplicationPersistence.FCM_ID, p02);
        Utils.INSTANCE.updateFirebaseInstanceId();
    }
}
