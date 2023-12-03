package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ye.a;
/* loaded from: classes.dex */
public class FirebaseMessagingService extends i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (v.f(extras)) {
            v vVar = new v(extras);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ba.a("Firebase-Messaging-Network-Io"));
            try {
                if (new g(this, vVar, newSingleThreadExecutor).a()) {
                    return;
                }
                newSingleThreadExecutor.shutdown();
                if (t.b(intent)) {
                    t.a(intent.getExtras(), "_nf");
                }
            } finally {
                newSingleThreadExecutor.shutdown();
            }
        }
        onMessageReceived(new x(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void passMessageIntentToSdk(Intent intent) {
        char c10;
        boolean z10;
        int parseInt;
        int i6;
        String string;
        a.b bVar;
        String string2;
        String str;
        String string3;
        String str2;
        String string4;
        String str3;
        String string5;
        String str4;
        String string6;
        String str5;
        long parseLong;
        long j10;
        String str6;
        String str7;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                        return;
                    } else {
                        onMessageSent(intent.getStringExtra("google.message_id"));
                        return;
                    }
                }
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                return;
            }
            if (t.b(intent)) {
                t.a(intent.getExtras(), "_nr");
            }
            if (!ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
                try {
                    sc.e.e();
                    sc.e e10 = sc.e.e();
                    e10.b();
                    Context context = e10.f31432a;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                    if (sharedPreferences.contains("export_to_big_query")) {
                        z10 = sharedPreferences.getBoolean("export_to_big_query", false);
                    } else {
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                z10 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                } catch (IllegalStateException unused2) {
                    Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
                }
                if (z10) {
                    a.EnumC0650a enumC0650a = a.EnumC0650a.MESSAGE_DELIVERED;
                    a7.g gVar = FirebaseMessaging.f9642n;
                    if (gVar == null) {
                        Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        Object obj = extras.get("google.ttl");
                        try {
                            if (obj instanceof Integer) {
                                parseInt = ((Integer) obj).intValue();
                            } else {
                                if (obj instanceof String) {
                                    try {
                                        parseInt = Integer.parseInt((String) obj);
                                    } catch (NumberFormatException unused3) {
                                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                                    }
                                }
                                i6 = 0;
                                string = extras.getString("google.to");
                                if (TextUtils.isEmpty(string)) {
                                    try {
                                        sc.e e11 = sc.e.e();
                                        Object obj2 = se.c.f31470m;
                                        string = (String) ya.k.a(((se.c) e11.c(se.d.class)).getId());
                                    } catch (InterruptedException | ExecutionException e12) {
                                        throw new RuntimeException(e12);
                                    }
                                }
                                String str8 = string;
                                sc.e e13 = sc.e.e();
                                e13.b();
                                String packageName = e13.f31432a.getPackageName();
                                a.c cVar = a.c.ANDROID;
                                if (!v.f(extras)) {
                                    bVar = a.b.DISPLAY_NOTIFICATION;
                                } else {
                                    bVar = a.b.DATA_MESSAGE;
                                }
                                a.b bVar2 = bVar;
                                string2 = extras.getString("google.message_id");
                                if (string2 == null) {
                                    string2 = extras.getString("message_id");
                                }
                                if (string2 != null) {
                                    str = "";
                                } else {
                                    str = string2;
                                }
                                string3 = extras.getString("from");
                                if (string3 != null || !string3.startsWith("/topics/")) {
                                    string3 = null;
                                }
                                if (string3 != null) {
                                    str2 = "";
                                } else {
                                    str2 = string3;
                                }
                                string4 = extras.getString("collapse_key");
                                if (string4 != null) {
                                    str3 = "";
                                } else {
                                    str3 = string4;
                                }
                                string5 = extras.getString("google.c.a.m_l");
                                if (string5 != null) {
                                    str4 = "";
                                } else {
                                    str4 = string5;
                                }
                                string6 = extras.getString("google.c.a.c_l");
                                if (string6 != null) {
                                    str5 = "";
                                } else {
                                    str5 = string6;
                                }
                                if (extras.containsKey("google.c.sender.id")) {
                                    try {
                                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                                    } catch (NumberFormatException e14) {
                                        Log.w("FirebaseMessaging", "error parsing project number", e14);
                                    }
                                    if (parseLong <= 0) {
                                        j10 = parseLong;
                                    } else {
                                        j10 = 0;
                                    }
                                    ye.a aVar = new ye.a(j10, str, str8, bVar2, cVar, packageName, str3, i6, str2, enumC0650a, str4, str5);
                                    d7.u a10 = gVar.a("FCM_CLIENT_EVENT_LOGGING", new a7.b("proto"), new j(1));
                                    a7.a aVar2 = new a7.a(null, new ye.b(aVar), a7.d.DEFAULT);
                                    a10.getClass();
                                    a10.a(aVar2, new p7.b(18));
                                }
                                sc.e e15 = sc.e.e();
                                e15.b();
                                sc.f fVar = e15.f31434c;
                                str6 = fVar.f31448e;
                                if (str6 != null) {
                                    try {
                                        parseLong = Long.parseLong(str6);
                                    } catch (NumberFormatException e16) {
                                        Log.w("FirebaseMessaging", "error parsing sender ID", e16);
                                    }
                                    if (parseLong <= 0) {
                                    }
                                    ye.a aVar3 = new ye.a(j10, str, str8, bVar2, cVar, packageName, str3, i6, str2, enumC0650a, str4, str5);
                                    d7.u a102 = gVar.a("FCM_CLIENT_EVENT_LOGGING", new a7.b("proto"), new j(1));
                                    a7.a aVar22 = new a7.a(null, new ye.b(aVar3), a7.d.DEFAULT);
                                    a102.getClass();
                                    a102.a(aVar22, new p7.b(18));
                                }
                                e15.b();
                                str7 = fVar.f31445b;
                                if (str7.startsWith("1:")) {
                                    try {
                                        parseLong = Long.parseLong(str7);
                                    } catch (NumberFormatException e17) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e17);
                                    }
                                } else {
                                    String[] split = str7.split(":");
                                    if (split.length >= 2) {
                                        String str9 = split[1];
                                        if (!str9.isEmpty()) {
                                            try {
                                                parseLong = Long.parseLong(str9);
                                            } catch (NumberFormatException e18) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e18);
                                            }
                                        }
                                    }
                                    parseLong = 0;
                                }
                                if (parseLong <= 0) {
                                }
                                ye.a aVar32 = new ye.a(j10, str, str8, bVar2, cVar, packageName, str3, i6, str2, enumC0650a, str4, str5);
                                d7.u a1022 = gVar.a("FCM_CLIENT_EVENT_LOGGING", new a7.b("proto"), new j(1));
                                a7.a aVar222 = new a7.a(null, new ye.b(aVar32), a7.d.DEFAULT);
                                a1022.getClass();
                                a1022.a(aVar222, new p7.b(18));
                            }
                            d7.u a10222 = gVar.a("FCM_CLIENT_EVENT_LOGGING", new a7.b("proto"), new j(1));
                            a7.a aVar2222 = new a7.a(null, new ye.b(aVar32), a7.d.DEFAULT);
                            a10222.getClass();
                            a10222.a(aVar2222, new p7.b(18));
                        } catch (RuntimeException e19) {
                            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e19);
                        }
                        i6 = parseInt;
                        string = extras.getString("google.to");
                        if (TextUtils.isEmpty(string)) {
                        }
                        String str82 = string;
                        sc.e e132 = sc.e.e();
                        e132.b();
                        String packageName2 = e132.f31432a.getPackageName();
                        a.c cVar2 = a.c.ANDROID;
                        if (!v.f(extras)) {
                        }
                        a.b bVar22 = bVar;
                        string2 = extras.getString("google.message_id");
                        if (string2 == null) {
                        }
                        if (string2 != null) {
                        }
                        string3 = extras.getString("from");
                        if (string3 != null) {
                        }
                        string3 = null;
                        if (string3 != null) {
                        }
                        string4 = extras.getString("collapse_key");
                        if (string4 != null) {
                        }
                        string5 = extras.getString("google.c.a.m_l");
                        if (string5 != null) {
                        }
                        string6 = extras.getString("google.c.a.c_l");
                        if (string6 != null) {
                        }
                        if (extras.containsKey("google.c.sender.id")) {
                        }
                        sc.e e152 = sc.e.e();
                        e152.b();
                        sc.f fVar2 = e152.f31434c;
                        str6 = fVar2.f31448e;
                        if (str6 != null) {
                        }
                        e152.b();
                        str7 = fVar2.f31445b;
                        if (str7.startsWith("1:")) {
                        }
                        if (parseLong <= 0) {
                        }
                        ye.a aVar322 = new ye.a(j10, str, str82, bVar22, cVar2, packageName2, str3, i6, str2, enumC0650a, str4, str5);
                    }
                }
                dispatchMessage(intent);
                return;
            }
            z10 = false;
            if (z10) {
            }
            dispatchMessage(intent);
            return;
        }
        onDeletedMessages();
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.i
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) a0.a().f9677d.poll();
    }

    @Override // com.google.firebase.messaging.i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        handleMessageIntent(intent);
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(x xVar) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
