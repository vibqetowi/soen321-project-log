package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AttributionIdentifiers.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers;", "", "()V", "androidAdvertiserId", "", "getAndroidAdvertiserId", "()Ljava/lang/String;", "androidAdvertiserIdValue", "<set-?>", "androidInstallerPackage", "getAndroidInstallerPackage", "attributionId", "getAttributionId", "fetchTime", "", "", "isTrackingLimited", "()Z", "Companion", "GoogleAdInfo", "GoogleAdServiceConnection", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AttributionIdentifiers {
    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 3600000;
    private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    public static AttributionIdentifiers cachedIdentifiers;
    private String androidAdvertiserIdValue;
    private String androidInstallerPackage;
    private String attributionId;
    private long fetchTime;
    private boolean isTrackingLimited;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = AttributionIdentifiers.class.getCanonicalName();

    @JvmStatic
    public static final AttributionIdentifiers getAttributionIdentifiers(Context context) {
        return Companion.getAttributionIdentifiers(context);
    }

    @JvmStatic
    public static final boolean isTrackingLimited(Context context) {
        return Companion.isTrackingLimited(context);
    }

    public final String getAttributionId() {
        return this.attributionId;
    }

    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    public final boolean isTrackingLimited() {
        return this.isTrackingLimited;
    }

    public final String getAndroidAdvertiserId() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isInitialized()) {
            FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
            if (FacebookSdk.getAdvertiserIDCollectionEnabled()) {
                return this.androidAdvertiserIdValue;
            }
        }
        return null;
    }

    /* compiled from: AttributionIdentifiers.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$Companion;", "", "()V", "ANDROID_ID_COLUMN_NAME", "", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "CONNECTION_RESULT_SUCCESS", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "", "LIMIT_TRACKING_COLUMN_NAME", "TAG", "cachedIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "getCachedIdentifiers$facebook_core_release$annotations", "cacheAndReturnIdentifiers", "identifiers", "getAndroidId", "context", "Landroid/content/Context;", "getAndroidIdViaReflection", "getAndroidIdViaService", "getAttributionIdentifiers", "getInstallerPackageName", "isGooglePlayServicesAvailable", "", "isTrackingLimited", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations() {
        }

        public static /* synthetic */ void getCachedIdentifiers$facebook_core_release$annotations() {
        }

        private Companion() {
        }

        private final AttributionIdentifiers getAndroidId(Context context) {
            AttributionIdentifiers androidIdViaReflection = getAndroidIdViaReflection(context);
            if (androidIdViaReflection == null) {
                AttributionIdentifiers androidIdViaService = getAndroidIdViaService(context);
                return androidIdViaService == null ? new AttributionIdentifiers() : androidIdViaService;
            }
            return androidIdViaReflection;
        }

        private final AttributionIdentifiers getAndroidIdViaReflection(Context context) {
            try {
                if (isGooglePlayServicesAvailable(context)) {
                    Utility utility = Utility.INSTANCE;
                    boolean z = false;
                    Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                    if (methodQuietly == null) {
                        return null;
                    }
                    Utility utility2 = Utility.INSTANCE;
                    Object invokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context);
                    if (invokeMethodQuietly == null) {
                        return null;
                    }
                    Utility utility3 = Utility.INSTANCE;
                    Method methodQuietly2 = Utility.getMethodQuietly(invokeMethodQuietly.getClass(), "getId", new Class[0]);
                    Utility utility4 = Utility.INSTANCE;
                    Method methodQuietly3 = Utility.getMethodQuietly(invokeMethodQuietly.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (methodQuietly2 != null && methodQuietly3 != null) {
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        Utility utility5 = Utility.INSTANCE;
                        attributionIdentifiers.androidAdvertiserIdValue = (String) Utility.invokeMethodQuietly(invokeMethodQuietly, methodQuietly2, new Object[0]);
                        Utility utility6 = Utility.INSTANCE;
                        Boolean bool = (Boolean) Utility.invokeMethodQuietly(invokeMethodQuietly, methodQuietly3, new Object[0]);
                        if (bool != null) {
                            z = bool.booleanValue();
                        }
                        attributionIdentifiers.isTrackingLimited = z;
                        return attributionIdentifiers;
                    }
                    return null;
                }
                return null;
            } catch (Exception e) {
                Utility utility7 = Utility.INSTANCE;
                Utility.logd("android_id", e);
                return null;
            }
        }

        @JvmStatic
        public final boolean isTrackingLimited(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AttributionIdentifiers attributionIdentifiers = getAttributionIdentifiers(context);
            return attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited();
        }

        private final boolean isGooglePlayServicesAvailable(Context context) {
            Utility utility = Utility.INSTANCE;
            Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodQuietly == null) {
                return false;
            }
            Utility utility2 = Utility.INSTANCE;
            Object invokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context);
            return (invokeMethodQuietly instanceof Integer) && Intrinsics.areEqual(invokeMethodQuietly, (Object) 0);
        }

        private final AttributionIdentifiers getAndroidIdViaService(Context context) {
            GoogleAdServiceConnection googleAdServiceConnection = new GoogleAdServiceConnection();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, googleAdServiceConnection, 1)) {
                    try {
                        GoogleAdInfo googleAdInfo = new GoogleAdInfo(googleAdServiceConnection.getBinder());
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        attributionIdentifiers.androidAdvertiserIdValue = googleAdInfo.getAdvertiserId();
                        attributionIdentifiers.isTrackingLimited = googleAdInfo.isTrackingLimited();
                        return attributionIdentifiers;
                    } catch (Exception e) {
                        Utility utility = Utility.INSTANCE;
                        Utility.logd("android_id", e);
                    } finally {
                        context.unbindService(googleAdServiceConnection);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: all -> 0x00fd, Exception -> 0x00ff, TryCatch #4 {Exception -> 0x00ff, all -> 0x00fd, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0064, B:21:0x0086, B:23:0x008c, B:25:0x0091, B:27:0x0096, B:17:0x006e, B:19:0x007e, B:49:0x00f5, B:50:0x00fc), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[Catch: all -> 0x00fd, Exception -> 0x00ff, TryCatch #4 {Exception -> 0x00ff, all -> 0x00fd, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0064, B:21:0x0086, B:23:0x008c, B:25:0x0091, B:27:0x0096, B:17:0x006e, B:19:0x007e, B:49:0x00f5, B:50:0x00fc), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[Catch: all -> 0x00fd, Exception -> 0x00ff, TRY_LEAVE, TryCatch #4 {Exception -> 0x00ff, all -> 0x00fd, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0064, B:21:0x0086, B:23:0x008c, B:25:0x0091, B:27:0x0096, B:17:0x006e, B:19:0x007e, B:49:0x00f5, B:50:0x00fc), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AttributionIdentifiers getAttributionIdentifiers(Context context) {
            Cursor cursor;
            Uri uri;
            Uri parse;
            String installerPackageName;
            Intrinsics.checkNotNullParameter(context, "context");
            AttributionIdentifiers androidId = getAndroidId(context);
            Cursor cursor2 = null;
            try {
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.cachedIdentifiers;
                if (attributionIdentifiers != null && System.currentTimeMillis() - attributionIdentifiers.fetchTime < 3600000) {
                    return attributionIdentifiers;
                }
                String[] strArr = {AttributionIdentifiers.ATTRIBUTION_ID_COLUMN_NAME, AttributionIdentifiers.ANDROID_ID_COLUMN_NAME, AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME};
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, 0);
                ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI, 0);
                if (resolveContentProvider != null) {
                    FacebookSignatureValidator facebookSignatureValidator = FacebookSignatureValidator.INSTANCE;
                    String str = resolveContentProvider.packageName;
                    Intrinsics.checkNotNullExpressionValue(str, "contentProviderInfo.packageName");
                    if (FacebookSignatureValidator.validateSignature(context, str)) {
                        parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        uri = parse;
                        installerPackageName = getInstallerPackageName(context);
                        if (installerPackageName != null) {
                            androidId.androidInstallerPackage = installerPackageName;
                        }
                        if (uri == null) {
                            return cacheAndReturnIdentifiers(androidId);
                        }
                        Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    int columnIndex = query.getColumnIndex(AttributionIdentifiers.ATTRIBUTION_ID_COLUMN_NAME);
                                    int columnIndex2 = query.getColumnIndex(AttributionIdentifiers.ANDROID_ID_COLUMN_NAME);
                                    int columnIndex3 = query.getColumnIndex(AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME);
                                    androidId.attributionId = query.getString(columnIndex);
                                    if (columnIndex2 > 0 && columnIndex3 > 0 && androidId.getAndroidAdvertiserId() == null) {
                                        androidId.androidAdvertiserIdValue = query.getString(columnIndex2);
                                        androidId.isTrackingLimited = Boolean.parseBoolean(query.getString(columnIndex3));
                                    }
                                    query.close();
                                    return cacheAndReturnIdentifiers(androidId);
                                }
                            } catch (Exception e) {
                                cursor = query;
                                e = e;
                                try {
                                    Utility utility = Utility.INSTANCE;
                                    Utility.logd(AttributionIdentifiers.TAG, Intrinsics.stringPlus("Caught unexpected exception in getAttributionId(): ", e));
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                cursor2 = query;
                                th = th2;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        }
                        AttributionIdentifiers cacheAndReturnIdentifiers = cacheAndReturnIdentifiers(androidId);
                        if (query != null) {
                            query.close();
                        }
                        return cacheAndReturnIdentifiers;
                    }
                }
                if (resolveContentProvider2 != null) {
                    FacebookSignatureValidator facebookSignatureValidator2 = FacebookSignatureValidator.INSTANCE;
                    String str2 = resolveContentProvider2.packageName;
                    Intrinsics.checkNotNullExpressionValue(str2, "wakizashiProviderInfo.packageName");
                    if (FacebookSignatureValidator.validateSignature(context, str2)) {
                        parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        uri = parse;
                        installerPackageName = getInstallerPackageName(context);
                        if (installerPackageName != null) {
                        }
                        if (uri == null) {
                        }
                    }
                }
                uri = null;
                installerPackageName = getInstallerPackageName(context);
                if (installerPackageName != null) {
                }
                if (uri == null) {
                }
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers attributionIdentifiers) {
            attributionIdentifiers.fetchTime = System.currentTimeMillis();
            AttributionIdentifiers.cachedIdentifiers = attributionIdentifiers;
            return attributionIdentifiers;
        }

        private final String getInstallerPackageName(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AttributionIdentifiers.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;", "Landroid/content/ServiceConnection;", "()V", "binder", "Landroid/os/IBinder;", "getBinder", "()Landroid/os/IBinder;", "consumed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "queue", "Ljava/util/concurrent/BlockingQueue;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "onServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class GoogleAdServiceConnection implements ServiceConnection {
        private final AtomicBoolean consumed = new AtomicBoolean(false);
        private final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.queue.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final IBinder getBinder() throws InterruptedException {
            if (!(!this.consumed.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder take = this.queue.take();
            Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
            return take;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AttributionIdentifiers.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;", "Landroid/os/IInterface;", "binder", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "advertiserId", "", "getAdvertiserId", "()Ljava/lang/String;", "isTrackingLimited", "", "()Z", "asBinder", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class GoogleAdInfo implements IInterface {
        public static final Companion Companion = new Companion(null);
        private static final int FIRST_TRANSACTION_CODE = 1;
        private static final int SECOND_TRANSACTION_CODE = 2;
        private final IBinder binder;

        public GoogleAdInfo(IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.binder = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public final String getAdvertiserId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean isTrackingLimited() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.binder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* compiled from: AttributionIdentifiers.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo$Companion;", "", "()V", "FIRST_TRANSACTION_CODE", "", "SECOND_TRANSACTION_CODE", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
