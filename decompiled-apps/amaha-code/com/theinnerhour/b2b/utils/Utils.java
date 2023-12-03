package com.theinnerhour.b2b.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.Toast;
import androidx.work.r;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assetDownloader.ProfileAssetDownloadJobScheduler;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.telecommunications.model.CommercialsPackageModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.DomainAreaPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalNotificationContent;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.receiver.InnerHourBroadCastReceiver;
import com.theinnerhour.b2b.receiver.V3ActivityNotificationReceiver;
import com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import he.t;
import hh.g;
import ih.p;
import is.u;
import is.w;
import java.io.File;
import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.o0;
import n2.a0;
import org.json.JSONArray;
import org.json.JSONObject;
import qg.g0;
import ta.v;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002J`\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000fJ\u0018\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0011J\u0010\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0013H\u0007J\u000e\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0013J\u001a\u0010/\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,J\u000e\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020,J\u001a\u00102\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,J\u001a\u00103\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,J\u0018\u00105\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010,2\u0006\u00104\u001a\u00020\u0002J\u0018\u00106\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010,2\u0006\u00104\u001a\u00020\u0002J\"\u0010;\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010<\u001a\u00020\fJ\u0006\u0010=\u001a\u00020\fJ\u0006\u0010>\u001a\u00020\fJ\u0006\u0010?\u001a\u00020\fJ\u000e\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u0011J\u0006\u0010B\u001a\u00020\fJ\u0006\u0010C\u001a\u00020\fJ\u0018\u0010E\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u00042\u0006\u0010D\u001a\u00020\u000fJ \u0010E\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u00042\u0006\u0010D\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u0002J\u0010\u0010G\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010\u0004J\u0018\u0010J\u001a\u00020\f2\u0006\u0010I\u001a\u00020H2\b\b\u0002\u0010F\u001a\u00020\u0013J\u0018\u0010K\u001a\u00020\f2\u0006\u0010I\u001a\u00020H2\b\b\u0002\u0010F\u001a\u00020\u0013J\u0016\u0010P\u001a\u00020O2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020LJ\u0016\u0010T\u001a\u00020\f2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020!JN\u0010W\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000fJ\u0010\u0010Y\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J%\u0010[\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010Z\u001a\u00020\u0011H\u0087@ø\u0001\u0000¢\u0006\u0004\b[\u0010\\JP\u0010`\u001a\u00020\f2\u0006\u0010]\u001a\u00020,2\u0006\u0010_\u001a\u00020^2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J`\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020a2\u0006\u0010]\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010e\u001a\u00020\f2\b\u0010d\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010f\u001a\u00020\f2\u0006\u0010d\u001a\u00020\u000fH\u0002J\u001a\u0010g\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u000108H\u0002J\b\u0010h\u001a\u00020\fH\u0002J\b\u0010i\u001a\u00020\fH\u0002J \u0010m\u001a\u00020l2\u0006\u0010j\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\u00022\u0006\u0010I\u001a\u00020HH\u0002R\u0017\u0010n\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010tR\u0014\u0010v\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010tR\u0014\u0010w\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010tR\u0014\u0010x\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010tR\"\u0010y\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R'\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0014\u0010\u0084\u0001\u001a\u00020,8F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0014\u0010\u0087\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0014\u0010\u0089\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008c\u0001"}, d2 = {"Lcom/theinnerhour/b2b/utils/Utils;", "", "", "mdrawable", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "checkBuildBeforesetDrawable", "mColor", "checkBuildBeforesetColor", "Lcom/android/volley/VolleyError;", "volleyError", "Lhs/k;", "checkError", "month", "", "getMonth", "", "setAlarm", "", "goalStartTime", "goalScheduleTime", "goalType", "goalId", "courseName", "goalName", "overrideGoalTitle", "overrideGoalDescription", "updateActivityNotification", "Lcom/theinnerhour/b2b/model/GoalNotificationContent;", "getGoalNotificationContent", "str", "getIntFromString", "Lorg/json/JSONObject;", "response", "skipDataLookup", "parseLoginResponse", "target", "isValidEmail", Constants.NOTIFICATION_URL, "getAudioFilePath", "time_stamp", "getStringTime_stamp", "getStringTimeStamp12HourFormat", "Ljava/util/Calendar;", "cal1", "cal2", "isSameDay", "cal", "isToday", "isBeforeDay", "isAfterDay", "days", "isWithinDays", "isTomorrow", Constants.SCREEN_ACTIVITY, "Landroid/os/Bundle;", "bundle", "logoutFromAllDevices", "logout", "clearPersistence", "clearNotificationChannel", "updateFirebaseInstanceId", "updateUserInfo", "setNotifications", "setActivityNotification", "cancelNotifications", "cancelNotificationsReset", "message", "showCustomToast", "duration", "checkConnectivity", "Landroid/view/View;", "attachLinear", "expand", "collapse", "", "fromDegree", "toDegree", "Landroid/view/animation/RotateAnimation;", "rotateBy180", "Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistPackagesModel;", "therapistPackagesModel", "therapistObj", "parseTherapistObject", "notificationTitle", "notificationBody", "updateV3ActivityNotification", "Lkotlinx/coroutines/c1;", "checkAndDownloadProfileAssets", "forceAssetReDownload", "checkForUpdatedProfileAssets", "(Landroid/content/Context;ZLls/d;)Ljava/lang/Object;", "scheduleCalendar", "Landroid/content/Intent;", "intent", "updateActivityNotificationDynamicRA", "Landroid/app/AlarmManager;", "alarmManager", "unscheduleActivity", "timezone", "validateTimezone", "updateTimezone", "clearData", "removeEncryptionKeys", "cancelIndividualNotification", "start", "end", "Landroid/animation/ValueAnimator;", "slideAnimator", "TAG_UTIL", "Ljava/lang/String;", "getTAG_UTIL", "()Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "displayDateFormat2", "Ljava/text/SimpleDateFormat;", "displayDateFormat4", "displayDateFormat4_12HourFormat", "displayDateFormat5", "displayDateFormat5_12HourFormat", "clearingFragmentBackStack", "Z", "getClearingFragmentBackStack", "()Z", "setClearingFragmentBackStack", "(Z)V", "Ljava/util/HashMap;", "goalNotifications", "Ljava/util/HashMap;", "getTodayCalendar", "()Ljava/util/Calendar;", "todayCalendar", "getTodayTimeInSeconds", "()J", "todayTimeInSeconds", "getTimeInSeconds", "timeInSeconds", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Utils {
    private static boolean clearingFragmentBackStack;
    private static HashMap<String, GoalNotificationContent> goalNotifications;
    public static final Utils INSTANCE = new Utils();
    private static final String TAG_UTIL = LogHelper.INSTANCE.makeLogTag("Utils");
    private static final SimpleDateFormat displayDateFormat2 = new SimpleDateFormat("EEEE");
    private static final SimpleDateFormat displayDateFormat4 = new SimpleDateFormat("HH:mm");
    private static final SimpleDateFormat displayDateFormat4_12HourFormat = new SimpleDateFormat("hh:mm aa");
    private static final SimpleDateFormat displayDateFormat5 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    private static final SimpleDateFormat displayDateFormat5_12HourFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");

    private Utils() {
    }

    private final void cancelIndividualNotification() {
        if (sp.b.K()) {
            r.a aVar = new r.a(BootReceiverNotificationWorkManager.class);
            HashMap hashMap = new HashMap();
            hashMap.put("disableNotification", Boolean.TRUE);
            androidx.work.d dVar = new androidx.work.d(hashMap);
            androidx.work.d.b(dVar);
            aVar.f3355b.f34738e = dVar;
            a0 e10 = a0.e(MyApplication.V.a().getApplicationContext());
            e10.getClass();
            e10.c(Collections.singletonList(aVar.a())).J();
        }
    }

    public static /* synthetic */ Object checkForUpdatedProfileAssets$default(Utils utils, Context context, boolean z10, ls.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        return utils.checkForUpdatedProfileAssets(context, z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearData(Context context, Bundle bundle) {
        cancelNotifications();
        clearPersistence();
        fk.g gVar = new fk.g();
        kotlin.jvm.internal.i.g(context, "context");
        UtilsKt.logError$default(gVar.f15128a, null, new fk.d(context), 2, null);
        Intent addFlags = new Intent(context, LoginSignupReworkActivity.class).addFlags(268468224);
        kotlin.jvm.internal.i.f(addFlags, "intent.addFlags(Intent.F…t.FLAG_ACTIVITY_NEW_TASK)");
        if (bundle != null) {
            addFlags.putExtras(bundle);
        }
        context.startActivity(addFlags);
    }

    public static /* synthetic */ void collapse$default(Utils utils, View view, long j10, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j10 = -1;
        }
        utils.collapse(view, j10);
    }

    public static /* synthetic */ void expand$default(Utils utils, View view, long j10, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j10 = -1;
        }
        utils.expand(view, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logout$lambda$3(Context activity, Bundle bundle, String str) {
        kotlin.jvm.internal.i.g(activity, "$activity");
        INSTANCE.clearData(activity, bundle);
    }

    public static /* synthetic */ void parseLoginResponse$default(Utils utils, JSONObject jSONObject, boolean z10, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        utils.parseLoginResponse(jSONObject, z10);
    }

    private final void removeEncryptionKeys() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            kotlin.jvm.internal.i.f(aliases, "aliases");
            while (aliases.hasMoreElements()) {
                keyStore.deleteEntry(aliases.nextElement());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "error deleting encryption key", e10);
        }
    }

    private final ValueAnimator slideAnimator(int i6, int i10, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i6, i10);
        ofInt.addUpdateListener(new a9.c(5, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void slideAnimator$lambda$6(View attachLinear, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.i.g(attachLinear, "$attachLinear");
        kotlin.jvm.internal.i.g(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.i.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = attachLinear.getLayoutParams();
        layoutParams.height = intValue;
        attachLinear.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:3:0x0012, B:5:0x0033, B:13:0x0045, B:19:0x0051, B:37:0x00d1, B:41:0x0110, B:20:0x0059, B:22:0x005f, B:24:0x0067, B:30:0x0076, B:35:0x008f, B:31:0x007c, B:32:0x0082, B:34:0x008a, B:36:0x0095), top: B:46:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void unscheduleActivity(AlarmManager alarmManager, Calendar calendar, long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z10;
        int i6;
        boolean z11;
        try {
            MyApplication.a aVar = MyApplication.V;
            Intent intent = new Intent(aVar.a(), InnerHourBroadCastReceiver.class);
            intent.addFlags(268435456);
            intent.setAction(String.valueOf(calendar.get(6)));
            boolean z12 = false;
            if (str5 != null && !gv.n.B0(str5)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (str6 != null && !gv.n.B0(str6)) {
                    z11 = false;
                    if (!z11) {
                        intent.putExtra(Constants.GOAL_NAME, str5);
                        intent.putExtra(Constants.GOAL_DESC, str6);
                        intent.putExtra(Constants.GOAL_ID, str2);
                        intent.putExtra(Constants.GOAL_START_TIME, j10);
                        intent.putExtra(Constants.GOAL_SCEHDULE_TIME, j11);
                        intent.putExtra(Constants.GOAL_TYPE, str);
                        intent.putExtra(Constants.COURSE_NAME, str3);
                        MyApplication a102 = aVar.a();
                        int intFromString2 = getIntFromString(str2 + str3);
                        if (Build.VERSION.SDK_INT < 23) {
                            i6 = 201326592;
                        } else {
                            i6 = 134217728;
                        }
                        alarmManager.cancel(PendingIntent.getBroadcast(a102, intFromString2, intent, i6));
                    }
                }
                z11 = true;
                if (!z11) {
                }
            }
            GoalNotificationContent goalNotificationContent = getGoalNotificationContent(str2);
            if (goalNotificationContent == null) {
                if (kotlin.jvm.internal.i.b(str, Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                    int i10 = calendar.get(11);
                    if (6 <= i10 && i10 < 12) {
                        z12 = true;
                    }
                    if (z12) {
                        intent.putExtra(Constants.GOAL_DESC, "Good days begin with a quick recharge. Kickstart your day now with a relaxation activity!");
                    } else {
                        intent.putExtra(Constants.GOAL_DESC, "Take a break. Click here to recharge.");
                    }
                } else if (kotlin.jvm.internal.i.b(str, "physical_activity")) {
                    intent.putExtra(Constants.GOAL_DESC, "Let's get you moving to help you feel happier!");
                }
                intent.putExtra(Constants.GOAL_NAME, str4);
            } else {
                intent.putExtra(Constants.GOAL_NAME, goalNotificationContent.getTitle());
                intent.putExtra(Constants.GOAL_DESC, goalNotificationContent.getBody());
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                applicationPersistence.setStringValueAsync("an-experiment-" + str2, goalNotificationContent.getExperiment());
                ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                applicationPersistence2.setStringValueAsync("an-experiment-key-" + str2, goalNotificationContent.getKey());
            }
            intent.putExtra(Constants.GOAL_ID, str2);
            intent.putExtra(Constants.GOAL_START_TIME, j10);
            intent.putExtra(Constants.GOAL_SCEHDULE_TIME, j11);
            intent.putExtra(Constants.GOAL_TYPE, str);
            intent.putExtra(Constants.COURSE_NAME, str3);
            MyApplication a1022 = aVar.a();
            int intFromString22 = getIntFromString(str2 + str3);
            if (Build.VERSION.SDK_INT < 23) {
            }
            alarmManager.cancel(PendingIntent.getBroadcast(a1022, intFromString22, intent, i6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "exception", e10);
        }
    }

    public static /* synthetic */ void unscheduleActivity$default(Utils utils, AlarmManager alarmManager, Calendar calendar, long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, int i6, Object obj) {
        String str7;
        String str8;
        if ((i6 & 256) != 0) {
            str7 = null;
        } else {
            str7 = str5;
        }
        if ((i6 & 512) != 0) {
            str8 = null;
        } else {
            str8 = str6;
        }
        utils.unscheduleActivity(alarmManager, calendar, j10, j11, str, str2, str3, str4, str7, str8);
    }

    public static /* synthetic */ void updateActivityNotification$default(Utils utils, Context context, boolean z10, long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, int i6, Object obj) {
        String str7;
        String str8;
        if ((i6 & 256) != 0) {
            str7 = null;
        } else {
            str7 = str5;
        }
        if ((i6 & 512) != 0) {
            str8 = null;
        } else {
            str8 = str6;
        }
        utils.updateActivityNotification(context, z10, j10, j11, str, str2, str3, str4, str7, str8);
    }

    private final void updateActivityNotificationDynamicRA(Calendar calendar, Intent intent, boolean z10, long j10, long j11, String str, String str2, String str3, String str4) {
        FireStoreUtilsKt.fetchSingleRecommendedActivity(str2, new Utils$updateActivityNotificationDynamicRA$1(intent, str2, j10, j11, str, str3, z10, str4, calendar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFirebaseInstanceId$lambda$4(ya.h task) {
        kotlin.jvm.internal.i.g(task, "task");
        if (!task.isSuccessful()) {
            return;
        }
        String token = (String) task.getResult();
        MyApplication.a aVar = MyApplication.V;
        if (aVar.a().Q) {
            if (ii.a.f20110b == null) {
                synchronized (ii.a.class) {
                    if (ii.a.f20110b == null) {
                        ii.a.f20110b = new ii.a();
                    }
                    hs.k kVar = hs.k.f19476a;
                }
            }
            ii.a aVar2 = ii.a.f20110b;
            if (aVar2 != null) {
                MyApplication a10 = aVar.a();
                kotlin.jvm.internal.i.f(token, "token");
                p pVar = g0.f29558c;
                if (pVar == null) {
                    hh.a aVar3 = hh.g.f17610d;
                    g.a.b(0, new ii.b(aVar2), 3);
                } else {
                    ji.f.f22046a.getClass();
                    ji.f.a(pVar).a(a10, token, "App");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.moengage.firebase.MoEFireBaseHelper");
            }
        }
        ApplicationPersistence.getInstance().setStringValue(ApplicationPersistence.FCM_ID, token);
        if (FirebasePersistence.getInstance().getUser() != null) {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                user.setInstanceId(token);
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
        }
    }

    private final void updateTimezone(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(SessionManager.KEY_MOBILE, SessionManager.getInstance().getStringValue(SessionManager.KEY_MOBILE));
                jSONObject.put(SessionManager.KEY_COUNTRY_CODE, SessionManager.getInstance().getStringValue(SessionManager.KEY_COUNTRY_CODE));
                jSONObject.put(SessionManager.KEY_EMAIL, SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
                jSONObject.put("firstname", SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME));
                jSONObject.put("lastname", SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME));
                jSONObject.put("timezone", str);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
            VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(2, "https://api.theinnerhour.com/v1/" + SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE) + "/profileinfo", jSONObject, new hn.a(1), new CustomVolleyErrorListener() { // from class: com.theinnerhour.b2b.utils.Utils$updateTimezone$string$2
                @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
                public void onErrorResponse(VolleyError error) {
                    kotlin.jvm.internal.i.g(error, "error");
                    LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), error);
                    super.onErrorResponse(error);
                }
            }));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(TAG_UTIL, "Exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTimezone$lambda$1(JSONObject jSONObject) {
        try {
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = TAG_UTIL;
            logHelper.i(str, " " + jSONObject);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "exception", e10);
        }
    }

    private final void validateTimezone(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !kotlin.jvm.internal.i.b(TimeZone.getDefault().getID(), str)) {
            String id2 = TimeZone.getDefault().getID();
            kotlin.jvm.internal.i.f(id2, "getDefault().id");
            updateTimezone(id2);
        }
    }

    public final void cancelNotifications() {
        try {
            cancelIndividualNotification();
            if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourse() != null) {
                setActivityNotification(false);
            }
            Object systemService = MyApplication.V.a().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancelAll();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void cancelNotificationsReset() {
        try {
            cancelIndividualNotification();
            setActivityNotification(false);
            Object systemService = MyApplication.V.a().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancelAll();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final c1 checkAndDownloadProfileAssets(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        return v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new Utils$checkAndDownloadProfileAssets$1(context, null), 3);
    }

    public final int checkBuildBeforesetColor(int i6, Context context) {
        int color;
        int color2;
        kotlin.jvm.internal.i.g(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            color = context.getColor(i6);
        } else {
            color = context.getResources().getColor(i6);
        }
        if (color == 0) {
            if (i10 >= 23) {
                color2 = context.getColor(R.color.colorPrimary);
                return color2;
            }
            return context.getResources().getColor(R.color.colorPrimary);
        }
        return color;
    }

    public final Drawable checkBuildBeforesetDrawable(int i6, Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        return hc.d.H(context, i6);
    }

    public final boolean checkConnectivity(Context context) {
        boolean isConnected = ConnectionStatusReceiver.isConnected();
        if (!isConnected) {
            kotlin.jvm.internal.i.d(context);
            String string = context.getString(R.string.no_internet_msg);
            kotlin.jvm.internal.i.f(string, "activity!!.getString(R.string.no_internet_msg)");
            showCustomToast(context, string);
        }
        return isConnected;
    }

    public final void checkError(VolleyError volleyError, Context context) {
        kotlin.jvm.internal.i.g(volleyError, "volleyError");
        kotlin.jvm.internal.i.g(context, "context");
        if (volleyError instanceof AuthFailureError) {
            gk.a.b(null, "app_401_logout ");
            logout(context, null, null);
            return;
        }
        LogHelper.INSTANCE.e(TAG_UTIL, "exception in network response", volleyError);
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bf, code lost:
        if (r2 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013d, code lost:
        if (r13 != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b6 A[Catch: Exception -> 0x0201, TryCatch #0 {Exception -> 0x0201, blocks: (B:3:0x000d, B:5:0x0018, B:10:0x0022, B:15:0x002c, B:17:0x0032, B:20:0x003a, B:21:0x0046, B:25:0x005a, B:29:0x006a, B:30:0x006e, B:32:0x0074, B:34:0x0080, B:42:0x0090, B:43:0x009b, B:45:0x00a1, B:49:0x00b9, B:51:0x00bd, B:80:0x0142, B:82:0x0148, B:93:0x0175, B:109:0x01c4, B:110:0x01f7, B:85:0x0156, B:86:0x015a, B:88:0x0160, B:94:0x018f, B:95:0x019a, B:97:0x01a0, B:100:0x01b2, B:102:0x01b6, B:52:0x00c5, B:63:0x00f2, B:64:0x010c, B:65:0x0117, B:67:0x011d, B:71:0x0130, B:73:0x0134, B:55:0x00d3, B:56:0x00d7, B:58:0x00dd), top: B:116:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b2 A[EDGE_INSN: B:126:0x01b2->B:100:0x01b2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148 A[Catch: Exception -> 0x0201, TryCatch #0 {Exception -> 0x0201, blocks: (B:3:0x000d, B:5:0x0018, B:10:0x0022, B:15:0x002c, B:17:0x0032, B:20:0x003a, B:21:0x0046, B:25:0x005a, B:29:0x006a, B:30:0x006e, B:32:0x0074, B:34:0x0080, B:42:0x0090, B:43:0x009b, B:45:0x00a1, B:49:0x00b9, B:51:0x00bd, B:80:0x0142, B:82:0x0148, B:93:0x0175, B:109:0x01c4, B:110:0x01f7, B:85:0x0156, B:86:0x015a, B:88:0x0160, B:94:0x018f, B:95:0x019a, B:97:0x01a0, B:100:0x01b2, B:102:0x01b6, B:52:0x00c5, B:63:0x00f2, B:64:0x010c, B:65:0x0117, B:67:0x011d, B:71:0x0130, B:73:0x0134, B:55:0x00d3, B:56:0x00d7, B:58:0x00dd), top: B:116:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0 A[Catch: Exception -> 0x0201, TryCatch #0 {Exception -> 0x0201, blocks: (B:3:0x000d, B:5:0x0018, B:10:0x0022, B:15:0x002c, B:17:0x0032, B:20:0x003a, B:21:0x0046, B:25:0x005a, B:29:0x006a, B:30:0x006e, B:32:0x0074, B:34:0x0080, B:42:0x0090, B:43:0x009b, B:45:0x00a1, B:49:0x00b9, B:51:0x00bd, B:80:0x0142, B:82:0x0148, B:93:0x0175, B:109:0x01c4, B:110:0x01f7, B:85:0x0156, B:86:0x015a, B:88:0x0160, B:94:0x018f, B:95:0x019a, B:97:0x01a0, B:100:0x01b2, B:102:0x01b6, B:52:0x00c5, B:63:0x00f2, B:64:0x010c, B:65:0x0117, B:67:0x011d, B:71:0x0130, B:73:0x0134, B:55:0x00d3, B:56:0x00d7, B:58:0x00dd), top: B:116:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkForUpdatedProfileAssets(android.content.Context r12, boolean r13, ls.d<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theinnerhour.b2b.utils.Utils.checkForUpdatedProfileAssets(android.content.Context, boolean, ls.d):java.lang.Object");
    }

    public final void clearNotificationChannel() {
        List<NotificationChannel> notificationChannels;
        String id2;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                MyApplication.a aVar = MyApplication.V;
                SharedPreferences sharedPreferences = aVar.a().getSharedPreferences("clear_notification_preferences", 0);
                if (sharedPreferences.getBoolean("delete_channels", true)) {
                    sharedPreferences.edit().putBoolean("delete_channels", false).commit();
                    Object systemService = aVar.a().getSystemService("notification");
                    kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    notificationChannels = notificationManager.getNotificationChannels();
                    for (NotificationChannel notificationChannel : notificationChannels) {
                        id2 = notificationChannel.getId();
                        notificationManager.deleteNotificationChannel(id2);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("utils", "exception in clear notification channel", e10);
        }
    }

    public final void clearPersistence() {
        SessionManager.getInstance().clearData();
        FirebasePersistence.getInstance().logout();
        removeEncryptionKeys();
        wn.b.f36765a.getClass();
        try {
            t tVar = wn.b.f36768d;
            if (tVar != null) {
                tVar.remove();
            }
            wn.b.f36768d = null;
            wn.b.f36767c = null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(wn.b.f36766b, e10);
        }
        NpsPersistence.INSTANCE.onLogout();
    }

    public final void collapse(final View attachLinear, long j10) {
        kotlin.jvm.internal.i.g(attachLinear, "attachLinear");
        ValueAnimator slideAnimator = slideAnimator(attachLinear.getHeight(), 0, attachLinear);
        if (j10 != -1) {
            slideAnimator.setDuration(j10);
        }
        slideAnimator.addListener(new Animator.AnimatorListener() { // from class: com.theinnerhour.b2b.utils.Utils$collapse$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                kotlin.jvm.internal.i.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                kotlin.jvm.internal.i.g(animator, "animator");
                attachLinear.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                kotlin.jvm.internal.i.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                kotlin.jvm.internal.i.g(animator, "animator");
            }
        });
        slideAnimator.start();
    }

    public final void expand(View attachLinear, long j10) {
        kotlin.jvm.internal.i.g(attachLinear, "attachLinear");
        attachLinear.setVisibility(0);
        attachLinear.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator slideAnimator = slideAnimator(0, attachLinear.getMeasuredHeight(), attachLinear);
        if (j10 != -1) {
            slideAnimator.setDuration(j10);
        }
        slideAnimator.start();
    }

    public final String getAudioFilePath(String url, Context context) {
        Collection collection;
        boolean z10;
        kotlin.jvm.internal.i.g(url, "url");
        kotlin.jvm.internal.i.g(context, "context");
        try {
            List c10 = new gv.e("/").c(url);
            boolean z11 = false;
            if (!c10.isEmpty()) {
                ListIterator listIterator = c10.listIterator(c10.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        collection = u.E2(c10, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = w.f20676u;
            String[] strArr = (String[]) collection.toArray(new String[0]);
            if (strArr.length == 0) {
                z11 = true;
            }
            if (!z11) {
                String str = context.getFilesDir().toString() + '/' + strArr[strArr.length - 1];
                if (!new File(str).exists()) {
                    return null;
                }
                return str;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
        return null;
    }

    public final boolean getClearingFragmentBackStack() {
        return clearingFragmentBackStack;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0018, B:13:0x0024, B:14:0x003a, B:15:0x003e, B:250:0x0345, B:254:0x034e, B:256:0x0352, B:259:0x035c, B:17:0x0043, B:20:0x004d, B:23:0x0057, B:26:0x0061, B:29:0x006b, B:32:0x0075, B:35:0x007f, B:38:0x0089, B:41:0x0093, B:44:0x009d, B:47:0x00a7, B:50:0x00b1, B:53:0x00bb, B:56:0x00c5, B:59:0x00cf, B:62:0x00d9, B:65:0x00e3, B:68:0x00ed, B:71:0x00f7, B:74:0x0101, B:77:0x010b, B:80:0x0115, B:83:0x011f, B:86:0x0129, B:89:0x0133, B:92:0x013d, B:95:0x0147, B:98:0x0151, B:101:0x015b, B:104:0x0165, B:107:0x016f, B:110:0x0179, B:113:0x0183, B:116:0x018d, B:119:0x0197, B:122:0x01a1, B:125:0x01ab, B:128:0x01b5, B:131:0x01bf, B:134:0x01c9, B:137:0x01d3, B:140:0x01dd, B:143:0x01e7, B:146:0x01f1, B:149:0x01fb, B:152:0x0205, B:155:0x020f, B:158:0x0219, B:161:0x0223, B:164:0x022d, B:167:0x0237, B:170:0x0241, B:173:0x024b, B:177:0x0259, B:181:0x0267, B:184:0x0271, B:188:0x027f, B:192:0x028d, B:195:0x0297, B:199:0x02a5, B:203:0x02b3, B:206:0x02bd, B:209:0x02c7, B:212:0x02d1, B:216:0x02df, B:220:0x02ec, B:223:0x02f5, B:226:0x02fe, B:230:0x030a, B:233:0x0313, B:237:0x031f, B:241:0x032b, B:245:0x0337), top: B:264:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x034e A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0018, B:13:0x0024, B:14:0x003a, B:15:0x003e, B:250:0x0345, B:254:0x034e, B:256:0x0352, B:259:0x035c, B:17:0x0043, B:20:0x004d, B:23:0x0057, B:26:0x0061, B:29:0x006b, B:32:0x0075, B:35:0x007f, B:38:0x0089, B:41:0x0093, B:44:0x009d, B:47:0x00a7, B:50:0x00b1, B:53:0x00bb, B:56:0x00c5, B:59:0x00cf, B:62:0x00d9, B:65:0x00e3, B:68:0x00ed, B:71:0x00f7, B:74:0x0101, B:77:0x010b, B:80:0x0115, B:83:0x011f, B:86:0x0129, B:89:0x0133, B:92:0x013d, B:95:0x0147, B:98:0x0151, B:101:0x015b, B:104:0x0165, B:107:0x016f, B:110:0x0179, B:113:0x0183, B:116:0x018d, B:119:0x0197, B:122:0x01a1, B:125:0x01ab, B:128:0x01b5, B:131:0x01bf, B:134:0x01c9, B:137:0x01d3, B:140:0x01dd, B:143:0x01e7, B:146:0x01f1, B:149:0x01fb, B:152:0x0205, B:155:0x020f, B:158:0x0219, B:161:0x0223, B:164:0x022d, B:167:0x0237, B:170:0x0241, B:173:0x024b, B:177:0x0259, B:181:0x0267, B:184:0x0271, B:188:0x027f, B:192:0x028d, B:195:0x0297, B:199:0x02a5, B:203:0x02b3, B:206:0x02bd, B:209:0x02c7, B:212:0x02d1, B:216:0x02df, B:220:0x02ec, B:223:0x02f5, B:226:0x02fe, B:230:0x030a, B:233:0x0313, B:237:0x031f, B:241:0x032b, B:245:0x0337), top: B:264:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GoalNotificationContent getGoalNotificationContent(String goalId) {
        boolean z10;
        String str;
        boolean z11;
        kotlin.jvm.internal.i.g(goalId, "goalId");
        GoalNotificationContent goalNotificationContent = null;
        try {
            z10 = false;
            if (goalNotifications == null) {
                String stringValue = ApplicationPersistence.getInstance().getStringValue("an_json");
                if (stringValue != null && !gv.n.B0(stringValue)) {
                    z11 = false;
                    if (!z11) {
                        goalNotifications = (HashMap) new sf.i().c(stringValue, new TypeToken<HashMap<String, GoalNotificationContent>>() { // from class: com.theinnerhour.b2b.utils.Utils$getGoalNotificationContent$type$1
                        }.getType());
                    }
                }
                z11 = true;
                if (!z11) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "exception", e10);
        }
        switch (goalId.hashCode()) {
            case -2116316288:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_THOUGHT_DEFUSION)) {
                    str = "";
                    if (str.length() > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        HashMap<String, GoalNotificationContent> hashMap = goalNotifications;
                        if (hashMap != null) {
                            goalNotificationContent = hashMap.get(str);
                        }
                        if (goalNotificationContent != null) {
                            goalNotificationContent.setKey(str);
                        }
                    }
                    return goalNotificationContent;
                }
                str = "thought_diffusion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -2101990989:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1997954541:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_PROGRESSIVE_MUSCLE_RELAXATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "pmr";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1993377699:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_CYCLING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "cycling";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1949533985:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_THOUGHT_DEFUSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "thought_diffusion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1947842319:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_CLIMBING_STAIRS)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "climbing_stairs";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1877764295:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_PROGRESSIVE_MUSCLE_RELAXATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "pmr";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1839790496:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1834661502:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_GENTLE_MASSAGES)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_message";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1787371166:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_SKIPPING_ROPE)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "skipping_rope";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1777953281:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_THOUGHT_DEFUSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "thought_diffusion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1731177206:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_CYCLING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "cycling";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1714136785:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_THOUGHT_DEFUSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "thought_diffusion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1681111087:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_MINDFUL_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "mindful_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1670022663:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_RUNNING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "running";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1628243925:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_MINDFUL_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "mindful_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1593655858:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_GUIDED_IMAGERY)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = Constants.PRIORITY_GUIDED_IMAGERY;
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1418294735:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_SELF_COMPASSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_compassion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1407822170:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_RUNNING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "running";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1402020373:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_BEACH_VISUALISATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "beach_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1353502313:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_DEEP_BREATHING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "deep_breathing";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1190969651:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_DEEP_BREATHING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "deep_breathing";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1143983438:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_GENTLE_MASSAGES)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_message";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1142644107:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_BEACH_VISUALISATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "beach_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1036506946:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_SELF_COMPASSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_compassion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -1014242680:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_SKIPPING_ROPE)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "skipping_rope";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -949536861:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_CLIMBING_STAIRS)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "climbing_stairs";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -518356301:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_GUIDED_IMAGERY)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = Constants.PRIORITY_GUIDED_IMAGERY;
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -451423219:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -438411205:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_BEACH_VISUALISATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "beach_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -432598909:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -353631194:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_PROGRESSIVE_MUSCLE_RELAXATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "pmr";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -342809929:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_CYCLING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "cycling";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -323985619:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_CYCLING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "cycling";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -243826668:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_CLIMBING_STAIRS)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "climbing_stairs";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -162625295:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_MINDFUL_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "mindful_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -139071259:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_THOUGHT_DEFUSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "thought_diffusion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -38201488:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_SELF_COMPASSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_compassion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case -19454893:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_RUNNING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "running";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 111259419:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_BEACH_VISUALISATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "beach_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 219162494:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_MINDFUL_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "mindful_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 227161594:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_BEACH_VISUALISATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "beach_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 240191969:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_CLIMBING_STAIRS)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "climbing_stairs";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 374502354:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_GENTLE_MASSAGES)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_message";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 463178451:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 531192090:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_DEEP_BREATHING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "deep_breathing";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 571791741:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_CYCLING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "cycling";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 657423687:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_DEEP_BREATHING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "deep_breathing";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 667508705:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_SELF_COMPASSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_compassion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 701942824:
                if (goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_DEEP_BREATHING)) {
                    str = "deep_breathing";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 730890761:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_PROGRESSIVE_MUSCLE_RELAXATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "pmr";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 756290143:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_GENTLE_MASSAGES)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_message";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 900581749:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_SKIPPING_ROPE)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "skipping_rope";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1040369426:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1148982716:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_CYCLING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "cycling";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1217467952:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_MINDFUL_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "mindful_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1295952882:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_THOUGHT_DEFUSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "thought_diffusion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1301176935:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_DEEP_BREATHING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "deep_breathing";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1350393945:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_PROGRESSIVE_MUSCLE_RELAXATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "pmr";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1358186769:
                if (!goalId.equals(Constants.ACTIVITY_ID_ANGER_SELF_COMPASSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_compassion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1366338102:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_GUIDED_IMAGERY)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = Constants.PRIORITY_GUIDED_IMAGERY;
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1411053931:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_SELF_COMPASSION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_compassion";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1472337752:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_RUNNING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "running";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1492569699:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_GUIDED_IMAGERY)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = Constants.PRIORITY_GUIDED_IMAGERY;
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1532521816:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_SKIPPING_ROPE)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "skipping_rope";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1537088836:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = Constants.PRIORITY_GUIDED_IMAGERY;
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1754595601:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_GENTLE_MASSAGES)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_message";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1852043336:
                if (!goalId.equals(Constants.ACTIVITY_ID_STRESS_BEACH_VISUALISATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "beach_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1923178145:
                if (!goalId.equals(Constants.ACTIVITY_ID_SLEEP_MINDFUL_WALKING)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "mindful_walking";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1928182952:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_GUIDED_IMAGERY)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = Constants.PRIORITY_GUIDED_IMAGERY;
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 1965337188:
                if (!goalId.equals(Constants.ACTIVITY_ID_HAPPINESS_CLIMBING_STAIRS)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "climbing_stairs";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 2043012679:
                if (!goalId.equals(Constants.ACTIVITY_ID_WORRY_GENTLE_MASSAGES)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "self_message";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            case 2110018392:
                if (!goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_PROGRESSIVE_MUSCLE_RELAXATION)) {
                    str = "";
                    if (str.length() > 0) {
                    }
                    if (z10) {
                    }
                    return goalNotificationContent;
                }
                str = "pmr";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
            default:
                str = "";
                if (str.length() > 0) {
                }
                if (z10) {
                }
                return goalNotificationContent;
        }
    }

    public final int getIntFromString(String str) {
        kotlin.jvm.internal.i.g(str, "str");
        try {
            char[] charArray = str.toCharArray();
            kotlin.jvm.internal.i.f(charArray, "this as java.lang.String).toCharArray()");
            int i6 = 0;
            for (char c10 : charArray) {
                i6 += c10;
            }
            return i6;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "exception", e10);
            return 0;
        }
    }

    public final String getMonth(int i6) {
        switch (i6) {
            case 1:
                return "JAN";
            case 2:
                return "FEB";
            case 3:
                return "MAR";
            case 4:
                return "APR";
            case 5:
                return "MAY";
            case 6:
                return "JUN";
            case 7:
                return "JUL";
            case 8:
                return "AUG";
            case 9:
                return "SEP";
            case 10:
                return "OCT";
            case 11:
                return "NOV";
            case 12:
                return "DEC";
            default:
                return null;
        }
    }

    public final String getStringTimeStamp12HourFormat(long j10) {
        String format;
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTimeInMillis(j10);
            if (isToday(calendar)) {
                format = "Today " + displayDateFormat4_12HourFormat.format(calendar.getTime());
            } else if (isWithinDays(calendar, 1)) {
                format = "Yesterday " + displayDateFormat4_12HourFormat.format(calendar.getTime());
            } else if (isWithinDays(calendar, 7)) {
                format = "Last " + displayDateFormat2.format(calendar.getTime()) + ' ' + displayDateFormat4_12HourFormat.format(calendar.getTime());
            } else {
                format = displayDateFormat5_12HourFormat.format(calendar.getTime());
                kotlin.jvm.internal.i.f(format, "{\n                    di…l.time)\n                }");
            }
            return format;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            String format2 = displayDateFormat5_12HourFormat.format(calendar.getTime());
            kotlin.jvm.internal.i.f(format2, "displayDateFormat5_12Hou…rmat.format(tempCal.time)");
            return format2;
        }
    }

    @Exclude
    public final String getStringTime_stamp(long j10) {
        String format;
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTimeInMillis(j10);
            if (isToday(calendar)) {
                format = "Today " + displayDateFormat4.format(calendar.getTime());
            } else if (isWithinDays(calendar, 1)) {
                format = "Yesterday " + displayDateFormat4.format(calendar.getTime());
            } else if (isWithinDays(calendar, 7)) {
                format = "Last " + displayDateFormat2.format(calendar.getTime()) + ' ' + displayDateFormat4.format(calendar.getTime());
            } else {
                format = displayDateFormat5.format(calendar.getTime());
                kotlin.jvm.internal.i.f(format, "{\n                    di…l.time)\n                }");
            }
            return format;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            String format2 = displayDateFormat5.format(calendar.getTime());
            kotlin.jvm.internal.i.f(format2, "displayDateFormat5.format(tempCal.time)");
            return format2;
        }
    }

    public final String getTAG_UTIL() {
        return TAG_UTIL;
    }

    public final long getTimeInSeconds() {
        return Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public final Calendar getTodayCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        return calendar;
    }

    public final long getTodayTimeInSeconds() {
        return getTodayCalendar().getTimeInMillis() / 1000;
    }

    public final boolean isAfterDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(1) > calendar2.get(1)) {
                return true;
            }
            if (calendar.get(1) >= calendar2.get(1) && calendar.get(6) > calendar2.get(6)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public final boolean isBeforeDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(1) < calendar2.get(1)) {
                return true;
            }
            if (calendar.get(1) <= calendar2.get(1) && calendar.get(6) < calendar2.get(6)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public final boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) != calendar2.get(0) || calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public final boolean isToday(Calendar cal) {
        kotlin.jvm.internal.i.g(cal, "cal");
        return isSameDay(cal, Calendar.getInstance());
    }

    public final boolean isTomorrow(Calendar calendar, int i6) {
        if (calendar != null) {
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = Calendar.getInstance();
            calendar3.add(6, i6);
            isAfterDay(calendar, calendar2);
            isAfterDay(calendar, calendar3);
            if (isAfterDay(calendar, calendar2) && !isAfterDay(calendar, calendar3)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public final boolean isValidEmail(String str) {
        if (str == null) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public final boolean isWithinDays(Calendar calendar, int i6) {
        if (calendar != null) {
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = Calendar.getInstance();
            calendar3.add(6, -i6);
            if (isBeforeDay(calendar, calendar2) && !isBeforeDay(calendar, calendar3)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public final void logout(final Context activity, final Bundle bundle, String str) {
        boolean z10;
        String str2;
        kotlin.jvm.internal.i.g(activity, "activity");
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            str2 = defpackage.c.r("https://api.theinnerhour.com/v1/authenticate/sign_out?remove_all=", str);
        } else {
            str2 = "https://api.theinnerhour.com/v1/authenticate/sign_out";
        }
        VolleySingleton.getInstance().add(new CustomVolleyStringRequest(3, str2, new qk.a(activity, 6, bundle), new CustomVolleyErrorListener() { // from class: com.theinnerhour.b2b.utils.Utils$logout$stringRequest$2
            @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
            public void onErrorResponse(VolleyError error) {
                kotlin.jvm.internal.i.g(error, "error");
                try {
                    String str3 = "Cannot connect to Internet...Please check your connection!";
                    if (!(error instanceof NetworkError)) {
                        if (error instanceof ServerError) {
                            str3 = "The server could not be found. Please try again after some time!!";
                        } else if (error instanceof AuthFailureError) {
                            str3 = "Session Timeout...Please login again!";
                        } else if (error instanceof ParseError) {
                            str3 = "Parsing error! Please try again after some time!!";
                        } else if (!(error instanceof NoConnectionError)) {
                            str3 = error instanceof TimeoutError ? "Connection TimeOut! Please check your internet connection." : null;
                        }
                    }
                    Utils utils = Utils.INSTANCE;
                    utils.clearData(activity, bundle);
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String tag_util = utils.getTAG_UTIL();
                    if (str3 == null) {
                        str3 = "";
                    }
                    logHelper.e(tag_util, "https://api.theinnerhour.com/v1/authenticate/sign_out", str3, error);
                    super.onErrorResponse(error);
                } catch (Exception e10) {
                    Utils utils2 = Utils.INSTANCE;
                    utils2.clearData(activity, bundle);
                    LogHelper.INSTANCE.e(utils2.getTAG_UTIL(), "https://api.theinnerhour.com/v1/authenticate/sign_out", e10);
                }
            }
        }));
    }

    public final void parseLoginResponse(JSONObject jSONObject, boolean z10) {
        JSONObject response = jSONObject;
        kotlin.jvm.internal.i.g(response, "response");
        if (!z10) {
            response = response.getJSONObject("data");
        }
        long j10 = response.getLong("id");
        String string = response.getString("usertype");
        String string2 = response.getString(SessionManager.KEY_UID);
        String string3 = response.getString(SessionManager.KEY_UUID);
        String string4 = response.getString("image");
        String string5 = response.getString("organisation_id");
        String string6 = response.getString("firstname");
        String string7 = response.getString("lastname");
        String string8 = response.getString(SessionManager.KEY_MOBILE);
        String optString = response.optString(SessionManager.KEY_COUNTRY_CODE);
        String string9 = response.getString("mytherapist");
        String string10 = response.getString(SessionManager.KEY_MYCOUPLESTHERAPIST);
        String string11 = response.getString(SessionManager.KEY_MYPSYCHIATRIST);
        String string12 = response.getString(SessionManager.KEY_FB_TOKEN);
        boolean optBoolean = response.optBoolean(SessionManager.KEY_MOBILE_VERIFIED, false);
        boolean optBoolean2 = response.optBoolean(SessionManager.KEY_B2B_IS_VERIFIED, false);
        String optString2 = response.optString("timezone");
        SessionManager.getInstance().createLoginSession(Long.valueOf(j10), string2, string3, string4, string6, string7, string, "NA", "NA", string8, optString, Boolean.valueOf(optBoolean), Boolean.valueOf(optBoolean2));
        SessionManager.getInstance().setUserLoggedIn(true);
        SessionManager.getInstance().setStringValue(SessionManager.KEY_ORGANISATION_NAME, response.optString(SessionManager.KEY_ORGANISATION_NAME, ""));
        SessionManager.getInstance().setStringValue(SessionManager.KEY_PASS, "");
        SessionManager.getInstance().setStringValue(SessionManager.KEY_EMAIL, "");
        SessionManager.getInstance().setStringValue(SessionManager.KEY_FB_TOKEN, string12);
        SessionManager.getInstance().setStringValue(SessionManager.KEY_ORGANISATION_ID, string5);
        SessionManager.getInstance().setStringValue(SessionManager.KEY_MYTHERAPIST, string9);
        SessionManager.getInstance().setStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST, string10);
        SessionManager.getInstance().setStringValue(SessionManager.KEY_MYPSYCHIATRIST, string11);
        SessionManager.getInstance().setStringValue(SessionManager.ALIAS, response.getString(SessionManager.ALIAS));
        if (!kotlin.jvm.internal.i.b(response.getString(SessionManager.KEY_PARTNER_ID), "null")) {
            SessionManager.getInstance().setLongValue(SessionManager.KEY_PARTNER_ID, Long.valueOf(response.getLong(SessionManager.KEY_PARTNER_ID)));
        }
        validateTimezone(optString2);
        jd.e.a().c(string3);
    }

    public final void parseTherapistObject(TherapistPackagesModel therapistPackagesModel, JSONObject therapistObj) {
        String str;
        String str2;
        kotlin.jvm.internal.i.g(therapistPackagesModel, "therapistPackagesModel");
        kotlin.jvm.internal.i.g(therapistObj, "therapistObj");
        try {
            String str3 = "";
            if (therapistObj.getString("firstname") == null) {
                str = "";
            } else {
                str = therapistObj.getString("firstname");
            }
            therapistPackagesModel.setFirstname(str);
            if (therapistObj.getString("lastname") == null) {
                str2 = "";
            } else {
                str2 = therapistObj.getString("lastname");
            }
            therapistPackagesModel.setLastname(str2);
            therapistPackagesModel.setImage(therapistObj.getString("image"));
            therapistPackagesModel.setFirebaseid(therapistObj.getString("firebaseid"));
            therapistPackagesModel.setId(therapistObj.getInt("id"));
            therapistPackagesModel.setUuid(therapistObj.getString(SessionManager.KEY_UUID));
            if (therapistObj.has("registration_number")) {
                str3 = therapistObj.getString("registration_number");
            }
            therapistPackagesModel.setRegistration_number(str3);
            JSONArray jSONArray = therapistObj.getJSONArray("languages");
            int length = jSONArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                therapistPackagesModel.getLanguages().add(new LanguagePackagesModel(i6, jSONArray.getString(i6)));
            }
            JSONArray jSONArray2 = therapistObj.getJSONArray("domainareas");
            int length2 = jSONArray2.length();
            for (int i10 = 0; i10 < length2; i10++) {
                therapistPackagesModel.getDomainareas().add(new DomainAreaPackagesModel(i10, jSONArray2.getString(i10)));
            }
            sf.i iVar = new sf.i();
            therapistPackagesModel.setExperience((ExperiencePackagesModel) iVar.c(therapistObj.getString("experience"), new TypeToken<ExperiencePackagesModel>() { // from class: com.theinnerhour.b2b.utils.Utils$parseTherapistObject$experiencePackagesModel$1
            }.getType()));
            therapistPackagesModel.setCommercials((CommercialsPackageModel) iVar.c(therapistObj.getString("commercials"), new TypeToken<CommercialsPackageModel>() { // from class: com.theinnerhour.b2b.utils.Utils$parseTherapistObject$commercialsPackageModel$1
            }.getType()));
            therapistPackagesModel.setEducations((ArrayList) iVar.c(therapistObj.getString("educations"), new TypeToken<ArrayList<EducationPackagesModel>>() { // from class: com.theinnerhour.b2b.utils.Utils$parseTherapistObject$education$1
            }.getType()));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "exception in parsing therapist response", e10);
        }
    }

    public final RotateAnimation rotateBy180(float f, float f2) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(200L);
        rotateAnimation.setFillAfter(true);
        return rotateAnimation;
    }

    public final void setActivityNotification(boolean z10) {
        try {
            ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
            kotlin.jvm.internal.i.f(userGoals, "getInstance().user.userGoals");
            ArrayList<Goal> arrayList = new ArrayList();
            Iterator<T> it = userGoals.iterator();
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Goal goal = (Goal) next;
                if (!kotlin.jvm.internal.i.b(goal.getCourseName(), FirebasePersistence.getInstance().getUser().getCurrentCourseName()) || !goal.isVisible() || !goal.getNotificationScheduled()) {
                    if (kotlin.jvm.internal.i.b(goal.getCourseName(), "independent") && goal.getGoalId() != null) {
                        String goalId = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId);
                        if (goalId.length() >= 7) {
                            String goalId2 = goal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId2);
                            String substring = goalId2.substring(0, 7);
                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                            }
                        }
                    }
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                for (Goal goal2 : arrayList) {
                    String goalId3 = goal2.getGoalId();
                    kotlin.jvm.internal.i.d(goalId3);
                    if (goalId3.length() >= 7) {
                        String goalId4 = goal2.getGoalId();
                        kotlin.jvm.internal.i.d(goalId4);
                        String substring2 = goalId4.substring(0, 7);
                        kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                            MyApplication.a aVar = MyApplication.V;
                            MyApplication a10 = aVar.a();
                            long time = goal2.getScheduledDate().getTime() * 1000;
                            String type = goal2.getType();
                            kotlin.jvm.internal.i.d(type);
                            String goalId5 = goal2.getGoalId();
                            kotlin.jvm.internal.i.d(goalId5);
                            String goalName = goal2.getGoalName();
                            kotlin.jvm.internal.i.d(goalName);
                            String courseName = goal2.getCourseName();
                            kotlin.jvm.internal.i.d(courseName);
                            String string = aVar.a().getString(R.string.customGoalNotifiationHeader);
                            kotlin.jvm.internal.i.f(string, "MyApplication.instance.g…tomGoalNotifiationHeader)");
                            MyApplication a11 = aVar.a();
                            String goalName2 = goal2.getGoalName();
                            kotlin.jvm.internal.i.d(goalName2);
                            String string2 = a11.getString(R.string.customGoalNotifiationBody, goalName2);
                            kotlin.jvm.internal.i.f(string2, "MyApplication.instance.g…ionBody, goal.goalName!!)");
                            updateV3ActivityNotification(a10, z10, time, type, goalId5, goalName, courseName, string, string2);
                        }
                    }
                    if (!kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY) && !kotlin.jvm.internal.i.b(goal2.getType(), "physical_activity")) {
                        if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) || kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_DAILY) || kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                            String goalId6 = goal2.getGoalId();
                            kotlin.jvm.internal.i.d(goalId6);
                            FireStoreUtilsKt.fetchCourseContentV3("en", goalId6, new Utils$setActivityNotification$1(z10, goal2));
                        }
                    }
                    MyApplication a12 = MyApplication.V.a();
                    long time2 = goal2.getmStartDate().getTime();
                    long time3 = goal2.getmScheduleDate().getTime();
                    String type2 = goal2.getType();
                    kotlin.jvm.internal.i.d(type2);
                    String goalId7 = goal2.getGoalId();
                    kotlin.jvm.internal.i.d(goalId7);
                    String courseName2 = goal2.getCourseName();
                    kotlin.jvm.internal.i.d(courseName2);
                    String goalName3 = goal2.getGoalName();
                    kotlin.jvm.internal.i.d(goalName3);
                    updateActivityNotification$default(this, a12, z10, time2, time3, type2, goalId7, courseName2, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("conditionSelection", "error in setting activity notification", e10);
        }
    }

    public final void setClearingFragmentBackStack(boolean z10) {
        clearingFragmentBackStack = z10;
    }

    public final void showCustomToast(Context context, String message) {
        kotlin.jvm.internal.i.g(message, "message");
        showCustomToast(context, message, 0);
    }

    public final void updateActivityNotification(Context context, boolean z10, long j10, long j11, String goalType, String goalId, String courseName, String goalName) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(goalType, "goalType");
        kotlin.jvm.internal.i.g(goalId, "goalId");
        kotlin.jvm.internal.i.g(courseName, "courseName");
        kotlin.jvm.internal.i.g(goalName, "goalName");
        updateActivityNotification$default(this, context, z10, j10, j11, goalType, goalId, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
    }

    public final void updateFirebaseInstanceId() {
        FirebaseMessaging firebaseMessaging;
        ya.h<String> hVar;
        try {
            c0 c0Var = FirebaseMessaging.f9641m;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(sc.e.e());
            }
            qe.a aVar = firebaseMessaging.f9645b;
            if (aVar != null) {
                hVar = aVar.c();
            } else {
                ya.i iVar = new ya.i();
                firebaseMessaging.f9650h.execute(new com.google.firebase.messaging.o(firebaseMessaging, iVar, 2));
                hVar = iVar.f38392a;
            }
            hVar.addOnCompleteListener(new ya.d() { // from class: com.theinnerhour.b2b.utils.n
                @Override // ya.d
                public final void a(ya.h hVar2) {
                    Utils.updateFirebaseInstanceId$lambda$4(hVar2);
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "exception in setting instance id on firebase", e10);
        }
    }

    public final void updateUserInfo() {
        try {
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_PROFILEPIC);
            if (!kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getProfile_path(), stringValue)) {
                FirebasePersistence.getInstance().getUser().setProfile_path(stringValue);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_UTIL, "exception in update user info", e10);
        }
    }

    public final boolean updateV3ActivityNotification(Context context, boolean z10, long j10, String goalType, String goalId, String goalName, String courseName, String notificationTitle, String notificationBody) {
        int i6;
        int i10;
        String str;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(goalType, "goalType");
        kotlin.jvm.internal.i.g(goalId, "goalId");
        kotlin.jvm.internal.i.g(goalName, "goalName");
        kotlin.jvm.internal.i.g(courseName, "courseName");
        kotlin.jvm.internal.i.g(notificationTitle, "notificationTitle");
        kotlin.jvm.internal.i.g(notificationBody, "notificationBody");
        try {
            if (!gv.n.B0(goalId) && !gv.n.B0(notificationTitle) && !gv.n.B0(notificationBody)) {
                if (j10 <= 0) {
                    return false;
                }
                Calendar todayCalendar = getTodayCalendar();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j10);
                long convert = TimeUnit.DAYS.convert(todayCalendar.getTimeInMillis() - calendar.getTimeInMillis(), TimeUnit.MILLISECONDS);
                try {
                    if (kotlin.jvm.internal.i.b(goalType, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                        if (convert > 0) {
                            int i11 = (int) ((convert + 1) / 7);
                            if (i11 == 0) {
                                calendar.add(5, 7);
                            } else {
                                calendar.add(5, (i11 * 7) + 7);
                            }
                        } else if (Calendar.getInstance().getTimeInMillis() > calendar.getTimeInMillis()) {
                            calendar.add(5, 7);
                        }
                    } else if (!kotlin.jvm.internal.i.b(goalType, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        if (convert > 0 || convert < -1) {
                            calendar.add(5, ((int) convert) + 1);
                        }
                        if (calendar.getTimeInMillis() < Calendar.getInstance().getTimeInMillis()) {
                            calendar.add(5, 1);
                            if (Calendar.getInstance().getTimeInMillis() > calendar.getTimeInMillis()) {
                                calendar.add(5, 1);
                            }
                        }
                    }
                    MyApplication.a aVar = MyApplication.V;
                    Intent intent = new Intent(aVar.a().getApplicationContext(), V3ActivityNotificationReceiver.class);
                    intent.addFlags(268435456);
                    intent.setAction("android.intent.action.VIEW");
                    intent.putExtra(Constants.GOAL_ID, goalId);
                    intent.putExtra(Constants.GOAL_NAME, goalName);
                    intent.putExtra(Constants.GOAL_SCEHDULE_TIME, calendar.getTimeInMillis());
                    intent.putExtra(Constants.GOAL_TYPE, goalType);
                    intent.putExtra(Constants.COURSE_NAME, courseName);
                    intent.putExtra(Constants.NOTIFICATION_TITLE, notificationTitle);
                    intent.putExtra(Constants.NOTIFICATION_BODY, notificationBody);
                    Context applicationContext = aVar.a().getApplicationContext();
                    try {
                        int intFromString = getIntFromString(goalId.concat(courseName));
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 23) {
                            i6 = 335544320;
                        } else {
                            i6 = 134217728;
                        }
                        PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, intFromString, intent, i6);
                        Object systemService = aVar.a().getApplicationContext().getSystemService("alarm");
                        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                        AlarmManager alarmManager = (AlarmManager) systemService;
                        if (z10) {
                            GoalsNotificationPersistence b10 = aVar.a().b();
                            String stringExtra = intent.getStringExtra(Constants.NOTIFICATION_TITLE);
                            String str2 = "";
                            if (stringExtra == null) {
                                str = "";
                            } else {
                                str = stringExtra;
                            }
                            String stringExtra2 = intent.getStringExtra(Constants.NOTIFICATION_BODY);
                            if (stringExtra2 != null) {
                                str2 = stringExtra2;
                            }
                            b10.addGoal(goalId, goalName, goalType, courseName, str, str2, j10, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY);
                            if (i12 >= 23) {
                                alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                            } else {
                                alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
                            }
                            return true;
                        }
                        broadcast.cancel();
                        alarmManager.cancel(broadcast);
                        Intent intent2 = new Intent(aVar.a().getApplicationContext(), V3ActivityNotificationReceiver.class);
                        intent2.addFlags(268435456);
                        Object clone = calendar.clone();
                        kotlin.jvm.internal.i.e(clone, "null cannot be cast to non-null type java.util.Calendar");
                        Calendar calendar2 = (Calendar) clone;
                        int hashCode = goalType.hashCode();
                        if (hashCode != -2070778647) {
                            if (hashCode != -1408757131) {
                                if (hashCode == 777898929 && goalType.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                    calendar2.add(6, 7);
                                }
                            } else {
                                if (!goalType.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                                }
                                calendar2.add(6, 1);
                            }
                        } else {
                            if (!goalType.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                            }
                            calendar2.add(6, 1);
                        }
                        Context applicationContext2 = aVar.a().getApplicationContext();
                        try {
                            int intFromString2 = getIntFromString(goalId.concat(courseName));
                            if (i12 >= 23) {
                                i10 = 201326592;
                            } else {
                                i10 = 134217728;
                            }
                            PendingIntent broadcast2 = PendingIntent.getBroadcast(applicationContext2, intFromString2, intent2, i10);
                            broadcast2.cancel();
                            alarmManager.cancel(broadcast2);
                            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                            applicationPersistence.setLongValue(goalId + '-' + courseName + "-notification-time", 0L);
                            aVar.a().b().removeGoal(goalId);
                            return true;
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(TAG_UTIL, "exception", e);
                            return false;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            return false;
        } catch (Exception e13) {
            e = e13;
        }
    }

    public final void showCustomToast(Context context, String message, int i6) {
        kotlin.jvm.internal.i.g(message, "message");
        if (context != null) {
            try {
                Toast toast = new Toast(context);
                toast.setDuration(i6);
                Object systemService = context.getSystemService("layout_inflater");
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.toast_textview, (ViewGroup) null);
                View findViewById = inflate.findViewById(R.id.text);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                ((RobertoTextView) findViewById).setText(message);
                toast.setView(inflate);
                toast.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(TAG_UTIL, "exception in show custom toast", e10);
            }
        }
    }

    public final void updateActivityNotification(Context context, boolean z10, long j10, long j11, String goalType, String goalId, String courseName, String goalName, String str) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(goalType, "goalType");
        kotlin.jvm.internal.i.g(goalId, "goalId");
        kotlin.jvm.internal.i.g(courseName, "courseName");
        kotlin.jvm.internal.i.g(goalName, "goalName");
        updateActivityNotification$default(this, context, z10, j10, j11, goalType, goalId, courseName, goalName, str, null, 512, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateActivityNotification(Context context, boolean z10, long j10, long j11, String goalType, String goalId, String courseName, String goalName, String str, String str2) {
        long j12 = j11;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(goalType, "goalType");
        kotlin.jvm.internal.i.g(goalId, "goalId");
        kotlin.jvm.internal.i.g(courseName, "courseName");
        kotlin.jvm.internal.i.g(goalName, "goalName");
        if (j12 <= 0) {
            return;
        }
        Calendar todayCalendar = getTodayCalendar();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j12);
        long convert = TimeUnit.DAYS.convert(todayCalendar.getTimeInMillis() - calendar.getTimeInMillis(), TimeUnit.MILLISECONDS);
        if (convert > 0 || convert < -1) {
            calendar.add(5, ((int) convert) + 1);
            j12 = calendar.getTimeInMillis();
        }
        if (j12 < Calendar.getInstance().getTimeInMillis()) {
            Calendar calendar2 = Calendar.getInstance();
            long j13 = 86400000;
            calendar.setTimeInMillis(calendar.getTimeInMillis() + (((int) Math.floor((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / j13)) * 86400000));
            while (calendar.getTimeInMillis() < calendar2.getTimeInMillis()) {
                calendar.setTimeInMillis(calendar.getTimeInMillis() + j13);
            }
            j12 = calendar.getTimeInMillis();
        }
        long j14 = j12;
        MyApplication.a aVar = MyApplication.V;
        Intent intent = new Intent(aVar.a(), InnerHourBroadCastReceiver.class);
        intent.addFlags(268435456);
        intent.setAction(String.valueOf(calendar.get(6)));
        if (!(str == null || gv.n.B0(str))) {
            if (!(str2 == null || gv.n.B0(str2))) {
                intent.putExtra(Constants.GOAL_NAME, str);
                intent.putExtra(Constants.GOAL_DESC, str2);
                intent.putExtra(Constants.GOAL_ID, goalId);
                intent.putExtra(Constants.GOAL_START_TIME, j10);
                intent.putExtra(Constants.GOAL_SCEHDULE_TIME, j14);
                intent.putExtra(Constants.GOAL_TYPE, goalType);
                intent.putExtra(Constants.COURSE_NAME, courseName);
                MyApplication a10 = aVar.a();
                int intFromString = getIntFromString(goalId.concat(courseName));
                int i6 = Build.VERSION.SDK_INT;
                PendingIntent broadcast = PendingIntent.getBroadcast(a10, intFromString, intent, i6 < 23 ? 201326592 : 134217728);
                Object systemService = aVar.a().getSystemService("alarm");
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                AlarmManager alarmManager = (AlarmManager) systemService;
                if (!z10) {
                    GoalsNotificationPersistence b10 = aVar.a().b();
                    String stringExtra = intent.getStringExtra(Constants.GOAL_NAME);
                    String str3 = stringExtra == null ? "" : stringExtra;
                    String stringExtra2 = intent.getStringExtra(Constants.GOAL_DESC);
                    b10.addGoal(goalId, goalName, goalType, courseName, str3, stringExtra2 == null ? "" : stringExtra2, j14, GoalsNotificationPersistence.GOALS_NOTIF_RA);
                    if (i6 >= 23) {
                        alarmManager.setExactAndAllowWhileIdle(0, j14, broadcast);
                        return;
                    } else {
                        alarmManager.setExact(0, j14, broadcast);
                        return;
                    }
                }
                unscheduleActivity(alarmManager, calendar, j10, j14, goalType, goalId, courseName, goalName, str, str2);
                calendar.add(5, -1);
                unscheduleActivity(alarmManager, calendar, j10, j14, goalType, goalId, courseName, goalName, str, str2);
                calendar.add(5, 2);
                unscheduleActivity(alarmManager, calendar, j10, j14, goalType, goalId, courseName, goalName, str, str2);
                ApplicationPersistence.getInstance().setLongValue(goalId + '-' + courseName, 0L);
                aVar.a().b().removeGoal(goalId);
                return;
            }
        }
        if (is.k.Q1(goalType, new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
            updateActivityNotificationDynamicRA(calendar, intent, z10, j10, j14, goalType, goalId, courseName, goalName);
            return;
        }
        GoalNotificationContent goalNotificationContent = getGoalNotificationContent(goalId);
        if (goalNotificationContent == null) {
            if (kotlin.jvm.internal.i.b(goalType, Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                int i10 = calendar.get(11);
                if (6 <= i10 && i10 < 12) {
                    intent.putExtra(Constants.GOAL_DESC, "Good days begin with a quick recharge. Kickstart your day now with a relaxation activity!");
                } else {
                    intent.putExtra(Constants.GOAL_DESC, "Take a break. Click here to recharge.");
                }
            } else if (kotlin.jvm.internal.i.b(goalType, "physical_activity")) {
                intent.putExtra(Constants.GOAL_DESC, "Let's get you moving to help you feel happier!");
            }
            intent.putExtra(Constants.GOAL_NAME, goalName);
        } else {
            intent.putExtra(Constants.GOAL_NAME, goalNotificationContent.getTitle());
            intent.putExtra(Constants.GOAL_DESC, goalNotificationContent.getBody());
            ApplicationPersistence.getInstance().setStringValueAsync("an-experiment-".concat(goalId), goalNotificationContent.getExperiment());
            ApplicationPersistence.getInstance().setStringValueAsync("an-experiment-key-".concat(goalId), goalNotificationContent.getKey());
        }
        intent.putExtra(Constants.GOAL_ID, goalId);
        intent.putExtra(Constants.GOAL_START_TIME, j10);
        intent.putExtra(Constants.GOAL_SCEHDULE_TIME, j14);
        intent.putExtra(Constants.GOAL_TYPE, goalType);
        intent.putExtra(Constants.COURSE_NAME, courseName);
        MyApplication a102 = aVar.a();
        int intFromString2 = getIntFromString(goalId.concat(courseName));
        int i62 = Build.VERSION.SDK_INT;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(a102, intFromString2, intent, i62 < 23 ? 201326592 : 134217728);
        Object systemService2 = aVar.a().getSystemService("alarm");
        kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager2 = (AlarmManager) systemService2;
        if (!z10) {
        }
    }
}
